package ml;

public class LinearRegressionModel {

    private double[] weights;
    private double bias;

    public LinearRegressionModel(int featureCount) {
        weights = new double[featureCount];
        bias = 0;
    }

    public void train(double[][] X, double[] y, double learningRate, int epochs) {

        int n = X.length;
        int features = X[0].length;

        for (int epoch = 0; epoch < epochs; epoch++) {

            for (int i = 0; i < n; i++) {

                double prediction = predict(X[i]);
                double error = prediction - y[i];

                for (int j = 0; j < features; j++) {
                    weights[j] -= learningRate * error * X[i][j];
                }

                bias -= learningRate * error;
            }
        }
    }

    public double predict(double[] x) {

        double result = bias;

        for (int i = 0; i < weights.length; i++) {
            result += weights[i] * x[i];
        }

        return result;
    }


    public void printWeights() {
    System.out.println("Weights:");
    for (double w : weights) {
        System.out.println(w);
    }
    System.out.println("Bias: " + bias);
}
}