import features.FeatureExtractor;
import features.FormulaParser;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        String formula = "Fe2O3";

        Map<String, Double> composition = FormulaParser.parse(formula);

        double avgAtomicNumber = FeatureExtractor.averageAtomicNumber(composition);

        System.out.println("Formula: " + formula);
        System.out.println("Composition: " + composition);
        System.out.println("Average atomic number: " + avgAtomicNumber);

    }
}