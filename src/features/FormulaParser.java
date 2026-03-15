package features;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class FormulaParser {
  private static final Pattern pattern = Pattern.compile("([A-Z][a-z]*)(\\d*)");

    public static Map<String, Double> parse(String formula) {

        Map<String, Double> composition = new HashMap<>();

        Matcher matcher = pattern.matcher(formula);

        while (matcher.find()) {

            String element = matcher.group(1);
            String countStr = matcher.group(2);

            double count = countStr.isEmpty() ? 1 : Double.parseDouble(countStr);

            composition.put(element, count);
        }

        return composition;
    }
}
