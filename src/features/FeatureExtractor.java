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

    public static double averageAtomicMass(Map<String, Double> composition) {

        double total = 0;
        double atoms = 0;

        for (String element : composition.keySet()) {

            double count = composition.get(element);

            double mass = ElementData.atomicMass.getOrDefault(element, 0.0);

            total += mass * count;
            atoms += count;
        }

        return total / atoms;
    }

    public static double averageElectronegativity(Map<String, Double> composition) {

        double total = 0;
        double atoms = 0;

        for (String element : composition.keySet()) {

            double count = composition.get(element);

            double en = ElementData.electronegativity.getOrDefault(element, 0.0);

            total += en * count;
            atoms += count;
        }

        return total / atoms;
    }
}