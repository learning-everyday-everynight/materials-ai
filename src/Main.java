import data.DatasetLoader;
import java.util.List;
import materials.Material;
import ml.*;

public class Main {

    public static void main(String[] args) {

        List<Material> materials = DatasetLoader.load("data/materials.csv");

        double[][] X = FeatureDatasetBuilder.buildFeatures(materials);
        double[] y = FeatureDatasetBuilder.buildTargetDensity(materials);

        int split = TrainTestSplit.splitIndex(materials.size(), 0.8);

        LinearRegressionModel model = new LinearRegressionModel(3);

        // TRAIN
        double[][] Xtrain = new double[split][3];
        double[] ytrain = new double[split];

        for (int i = 0; i < split; i++) {
            Xtrain[i] = X[i];
            ytrain[i] = y[i];
        }

        model.train(Xtrain, ytrain, 0.00001, 1000);

        // TEST
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



        String newMaterial = "TiO2";

        var composition = features.FormulaParser.parse(newMaterial);

        double[] newFeatures = new double[3];

        newFeatures[0] = features.FeatureExtractor.averageAtomicNumber(composition);
        newFeatures[1] = features.FeatureExtractor.averageAtomicMass(composition);
        newFeatures[2] = features.FeatureExtractor.averageElectronegativity(composition);

        double predictedDensity = model.predict(newFeatures);

        System.out.println("Prediction for " + newMaterial + ": " + predictedDensity);
    }
}