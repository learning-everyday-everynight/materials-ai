package features;

import java.util.Map;

public class FeatureExtractor {

    public static double averageAtomicNumber(Map<String, Double> composition) {

        double total = 0;
        double atoms = 0;

        for (String element : composition.keySet()) {

            double count = composition.get(element);

            int atomicNumber = ElementData.atomicNumbers.getOrDefault(element, 0);

            total += atomicNumber * count;
            atoms += count;
        }

        return total / atoms;
    }
}