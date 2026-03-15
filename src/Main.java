import data.DatasetLoader;
import java.util.List;
import materials.Material;
import ml.FeatureDatasetBuilder;

public class Main {

    public static void main(String[] args) {

        List<Material> materials = DatasetLoader.load("data/materials.csv");

        double[][] X = FeatureDatasetBuilder.buildFeatures(materials);
        double[] y = FeatureDatasetBuilder.buildTargetDensity(materials);

        System.out.println("Dataset size: " + materials.size());

        for (int i = 0; i < materials.size(); i++) {

            System.out.println(
                    X[i][0] + " " +
                    X[i][1] + " " +
                    X[i][2] +
                    " -> density=" + y[i]
            );
        }

    }
}