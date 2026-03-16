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

        atomicNumbers.put("Zn", 30);
        atomicNumbers.put("Ga", 31);
        atomicNumbers.put("Ge", 32);
        atomicNumbers.put("As", 33);
        atomicNumbers.put("Cd", 48);
        atomicNumbers.put("In", 49);
        atomicNumbers.put("Sn", 50);
        atomicNumbers.put("Te", 52);
        atomicNumbers.put("Pb", 82);
        atomicNumbers.put("Si", 14);
        atomicNumbers.put("B", 5);
        atomicNumbers.put("P", 15);
        atomicNumbers.put("S", 16);
        atomicNumbers.put("Mg", 12);
        atomicNumbers.put("Ca", 20);
        atomicNumbers.put("Zn", 30);

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

        atomicMass.put("Zn", 65.38);
        atomicMass.put("Ga", 69.72);
        atomicMass.put("Ge", 72.63);
        atomicMass.put("As", 74.92);
        atomicMass.put("Cd", 112.41);
        atomicMass.put("In", 114.82);
        atomicMass.put("Sn", 118.71);
        atomicMass.put("Te", 127.60);
        atomicMass.put("Pb", 207.2);
        atomicMass.put("Si", 28.085);
        atomicMass.put("B", 10.81);
        atomicMass.put("P", 30.97);
        atomicMass.put("S", 32.06);
        atomicMass.put("Mg", 24.305);
        atomicMass.put("Ca", 40.078);

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

        electronegativity.put("Zn", 1.65);
        electronegativity.put("Ga", 1.81);
        electronegativity.put("Ge", 2.01);
        electronegativity.put("As", 2.18);
        electronegativity.put("Cd", 1.69);
        electronegativity.put("In", 1.78);
        electronegativity.put("Sn", 1.96);
        electronegativity.put("Te", 2.10);
        electronegativity.put("Pb", 2.33);
        electronegativity.put("Si", 1.90);
        electronegativity.put("B", 2.04);
        electronegativity.put("P", 2.19);
        electronegativity.put("S", 2.58);
        electronegativity.put("Mg", 1.31);
        electronegativity.put("Ca", 1.00);

        

    }

}