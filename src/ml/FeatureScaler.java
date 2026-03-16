package ml;

public class FeatureScaler {

    public static double[] maxValues;

    public static void normalize(double[][] X) {

        int rows = X.length;
        int cols = X[0].length;

        maxValues = new double[cols];

        for (int j = 0; j < cols; j++) {

            double max = Double.MIN_VALUE;

            for (int i = 0; i < rows; i++) {
                if (X[i][j] > max) {
                    max = X[i][j];
                }
            }

            maxValues[j] = max;

            for (int i = 0; i < rows; i++) {
                X[i][j] = X[i][j] / max;
            }
        }
    }

    public static void normalizeVector(double[] x) {

        for (int i = 0; i < x.length; i++) {
            x[i] = x[i] / maxValues[i];
        }
    }
}