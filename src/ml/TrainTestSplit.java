package ml;

public class TrainTestSplit {

    public static int splitIndex(int totalSize, double trainRatio) {
        return (int)(totalSize * trainRatio);
    }

}