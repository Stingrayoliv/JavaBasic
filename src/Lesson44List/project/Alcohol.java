package Lesson44List.project;

/**
 * FirstProject
 * 6/24/20 12: 14
 */
public class Alcohol {
    private String spiritName;
    private double alcoholPercent;
    private double milliLiter;

    public Alcohol() {

    }

    public Alcohol(String spiritName, double milliLiter) {
        this.spiritName = spiritName;
        this.milliLiter = milliLiter;
    }

    public Alcohol(double alcoholPercent, double milliLiter) {
        this.alcoholPercent = alcoholPercent;
        this.milliLiter = milliLiter;
    }

    public Alcohol(String spiritName, double alcoholPercent, double milliLiter) {
        this.spiritName = spiritName;
        this.alcoholPercent = alcoholPercent;
        this.milliLiter = milliLiter;
    }

    public String getSpiritName() {
        return spiritName;
    }

    public double getAlcoholPercent() {
        return alcoholPercent;
    }

    public double getMilliLiter() {
        return milliLiter;
    }

    public void setSpiritName(String spiritName) {
        this.spiritName = spiritName;
    }

    public void setAlcoholPercent(double alcoholPercent) {
        this.alcoholPercent = alcoholPercent;
    }

    public void setMilliLiter(double milliLiter) {
        this.milliLiter = milliLiter;
    }

    public double findAlcoholInGram() {
        return this.milliLiter * this.alcoholPercent * 0.008; // какой-то кофициент
    }
}
