package data;

import materials.Material;
import features.FormulaParser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DatasetLoader {

    public static List<Material> load(String filePath) {

        List<Material> materials = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line = reader.readLine(); // skip header

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                String formula = parts[0];
                double density = Double.parseDouble(parts[1]);
                double bandGap = Double.parseDouble(parts[2]);

                Map<String, Double> composition = FormulaParser.parse(formula);

                Material material = new Material(formula, composition);

                material.setDensity(density);
                material.setBandGap(bandGap);

                materials.add(material);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return materials;
    }
}
