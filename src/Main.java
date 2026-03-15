import java.util.HashMap;
import java.util.Map;
import materials.Material;
public class Main {

    public static void main(String[] args) {

        Map<String, Double> composition = new HashMap<>();
        composition.put("Fe", 0.4);
        composition.put("O", 0.6);

        Material material = new Material("Fe2O3", composition);

        material.setDensity(5.24);
        material.setBandGap(2.1);

        System.out.println("Material: " + material.getFormula());
        System.out.println("Density: " + material.getDensity());
        System.out.println("Band gap: " + material.getBandGap());
    }
}