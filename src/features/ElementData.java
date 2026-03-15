package features;

import java.util.HashMap;
import java.util.Map;

public class ElementData {

    public static Map<String, Integer> atomicNumbers = new HashMap<>();

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

    }

}