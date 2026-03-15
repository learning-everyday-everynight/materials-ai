import features.FormulaParser;
import java.util.Map;
import materials.Material;

public class Main {

    public static void main(String[] args) {

        String formula = "Fe2O3";

        Map<String, Double> composition = FormulaParser.parse(formula);

        Material material = new Material(formula, composition);

        System.out.println("Formula: " + formula);
        System.out.println("Composition: " + composition);

    }
}