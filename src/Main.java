import data.DatasetLoader;
import java.util.List;
import materials.Material;
import ml.FeatureDatasetBuilder;
import ml.LinearRegressionModel;

public class Main {

    public static void main(String[] args) {

        List<Material> materials = DatasetLoader.load("data/materials.csv");

        double[][] X = FeatureDatasetBuilder.buildFeatures(materials);
        double[] y = FeatureDatasetBuilder.buildTargetDensity(materials);

        LinearRegressionModel model = new LinearRegressionModel(3);

        model.train(X, y, 0.00001, 1000);

        System.out.println("Predictions:");

        for (int i = 0; i < X.length; i++) {

            double predicted = model.predict(X[i]);

            System.out.println(
                    "Real: " + y[i] +
                    " Predicted: " + predicted
            );
        }

    }
}