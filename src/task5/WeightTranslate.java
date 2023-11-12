package task5;

public class WeightTranslate {
    public static double conversionGramsToKilograms(double value) {
        return value / 1000.0;
    }

    public static double conversionGramsToHundredweight(double value) {
        return value / 100_000.0;
    }

    public static double conversionGramsToTons(double value) {
        return value / 1000_000.0;
    }

    public static double conversionKilogramsToGrams(double value) {
        return value * 1000.0;
    }

    public static double conversionHundredweightToGrams(double value) {
        return value * 100_000.0;
    }

    public static double conversionTonsToGrams(double value) {
        return value * 1000_000.0;
    }

}
