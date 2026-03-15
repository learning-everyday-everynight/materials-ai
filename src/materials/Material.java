package materials;

import java.util.Map;

public class Material {

    private String formula;
    private Map<String, Double> composition;

    private double density;
    private double bandGap;

    public Material(String formula, Map<String, Double> composition) {
        this.formula = formula;
        this.composition = composition;
    }

    public String getFormula() {
        return formula;
    }

    public Map<String, Double> getComposition() {
        return composition;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getBandGap() {
        return bandGap;
    }

    public void setBandGap(double bandGap) {
        this.bandGap = bandGap;
    }
}