package features;

import java.util.HashMap;
import java.util.Map;

public class ElementData {

    public static Map<String, Integer> atomicNumbers = new HashMap<>();
    public static Map<String, Double> atomicMass = new HashMap<>();
    public static Map<String, Double> electronegativity = new HashMap<>();

    static {

        atomicNumbers.put("H", 1);
        atomicNumbers.put("C", 6);
        atomicNumbers.put("N", 7);
        atomicNumbers.put("O", 8);
        atomicNumbers.put("Al", 13);
        atomicNumbers.put("Ti", 22);
        atomicNumbers.put("Cr", 24);
        atomicNumbers.put("Mn", 25);
        atomicNumbers.put("Fe", 26);
        atomicNumbers.put("Ni", 28);
        atomicNumbers.put("Cu", 29);

        atomicMass.put("H", 1.008);
        atomicMass.put("C", 12.011);
        atomicMass.put("N", 14.007);
        atomicMass.put("O", 15.999);
        atomicMass.put("Al", 26.982);
        atomicMass.put("Ti", 47.867);
        atomicMass.put("Cr", 51.996);
        atomicMass.put("Mn", 54.938);
        atomicMass.put("Fe", 55.845);
        atomicMass.put("Ni", 58.693);
        atomicMass.put("Cu", 63.546);

        electronegativity.put("H", 2.20);
        electronegativity.put("C", 2.55);
        electronegativity.put("N", 3.04);
        electronegativity.put("O", 3.44);
        electronegativity.put("Al", 1.61);
        electronegativity.put("Ti", 1.54);
        electronegativity.put("Cr", 1.66);
        electronegativity.put("Mn", 1.55);
        electronegativity.put("Fe", 1.83);
        electronegativity.put("Ni", 1.91);
        electronegativity.put("Cu", 1.90);

    }

}