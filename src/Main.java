import data.DatasetLoader;
import java.util.List;
import materials.Material;

public class Main {

    public static void main(String[] args) {

        List<Material> materials = DatasetLoader.load("data/materials.csv");

        System.out.println("Loaded materials: " + materials.size());

        for (Material m : materials) {
            System.out.println(m.getFormula() + " density=" + m.getDensity());
        }

    }
}