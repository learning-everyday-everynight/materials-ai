package ml;

import materials.Material;
import features.FeatureExtractor;

import java.util.List;

public class FeatureDatasetBuilder {

    public static double[][] buildFeatures(List<Material> materials) {

        double[][] X = new double[materials.size()][3];

        for (int i = 0; i < materials.size(); i++) {

            Material m = materials.get(i);

            double avgZ = FeatureExtractor.averageAtomicNumber(m.getComposition());
            double avgMass = FeatureExtractor.averageAtomicMass(m.getComposition());
            double avgEN = FeatureExtractor.averageElectronegativity(m.getComposition());

            X[i][0] = avgZ;
            X[i][1] = avgMass;
            X[i][2] = avgEN;
        }

        return X;
    }

    public static double[] buildTargetDensity(List<Material> materials) {

        double[] y = new double[materials.size()];

        for (int i = 0; i < materials.size(); i++) {
            y[i] = materials.get(i).getDensity();
        }

        return y;
    }
}