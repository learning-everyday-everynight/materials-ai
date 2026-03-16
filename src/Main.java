import data.DatasetLoader;
import features.FeatureExtractor;
import features.FormulaParser;
import java.util.List;
import java.util.Map;
import materials.Material;
import ml.FeatureDatasetBuilder;
import ml.FeatureScaler;
import ml.LinearRegressionModel;
import ml.Metrics;
import ml.TrainTestSplit;

public class Main {

    public static void main(String[] args) {

        // 1. Load dataset
        List<Material> materials = DatasetLoader.load("data/materials.csv");

        // 2. Build feature matrix
        double[][] X = FeatureDatasetBuilder.buildFeatures(materials);

        // 3. Normalize features
        FeatureScaler.normalize(X);

        // 4. Target values
        double[] y = FeatureDatasetBuilder.buildTargetDensity(materials);

        // 5. Train/test split
        int split = TrainTestSplit.splitIndex(materials.size(), 0.8);

        double[][] Xtrain = new double[split][3];
        double[] ytrain = new double[split];

        for (int i = 0; i < split; i++) {
            Xtrain[i] = X[i];
            ytrain[i] = y[i];
        }

        // 6. Train model
        LinearRegressionModel model = new LinearRegressionModel(3);
        model.train(Xtrain, ytrain, 0.0001, 30000);

        model.printWeights();

        // 7. Test model
        double[] predictions = new double[materials.size() - split];
        double[] ytest = new double[materials.size() - split];

        int index = 0;

        for (int i = split; i < materials.size(); i++) {

            predictions[index] = model.predict(X[i]);
            ytest[index] = y[i];

            System.out.println(
                    "Real: " + y[i] +
                    " Predicted: " + predictions[index]
            );

            index++;
        }

        double mae = Metrics.meanAbsoluteError(ytest, predictions);

        System.out.println("MAE error: " + mae);

        // 8. Predict new material

        String newMaterial = "TiO2";

        Map<String, Double> composition = FormulaParser.parse(newMaterial);

        double[] newFeatures = new double[3];

        newFeatures[0] = FeatureExtractor.averageAtomicNumber(composition);
        newFeatures[1] = FeatureExtractor.averageAtomicMass(composition);
        newFeatures[2] = FeatureExtractor.averageElectronegativity(composition);

        // normalize new material
        FeatureScaler.normalizeVector(newFeatures);

        double predictedDensity = model.predict(newFeatures);

        System.out.println(
                "Prediction density for " +
                newMaterial +
                ": " +
                predictedDensity
        );



        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Enter material formula:");
        String inputFormula = scanner.nextLine();

        Map<String, Double> newComposition = FormulaParser.parse(inputFormula);

        double[] inputFeatures = new double[3];

        inputFeatures[0] = FeatureExtractor.averageAtomicNumber(newComposition);
        inputFeatures[1] = FeatureExtractor.averageAtomicMass(newComposition);
        inputFeatures[2] = FeatureExtractor.averageElectronegativity(newComposition);

        FeatureScaler.normalizeVector(inputFeatures);

        double prediction = model.predict(inputFeatures);

        System.out.println("Predicted density: " + prediction);
    }
}