package ml;

public class Metrics {

    public static double meanAbsoluteError(double[] real, double[] predicted) {

        double sum = 0;

        for (int i = 0; i < real.length; i++) {
            sum += Math.abs(real[i] - predicted[i]);
        }

        return sum / real.length;
    }

}