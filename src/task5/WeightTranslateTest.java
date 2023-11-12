package task5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static task5.WeightTranslate.*;

public class WeightTranslateTest {
    public static final double EPS=0.000001;
    @Test
    public void conversionGramsToKilograms1200GramsToKilograms() {
        Assert.assertEquals(1.2, conversionGramsToKilograms(1200), EPS);
    }

    @Test
    public void conversionGramsToHundredweight10200GramsToHundredweight() {
        Assert.assertEquals(0.102, conversionGramsToHundredweight(10200.0),EPS);
    }

    @Test
    public void conversionGramsToTons1000_000GramsToTons() {
        Assert.assertEquals(1.0, conversionGramsToTons(1000_000.0),EPS);
    }

    @Test
    public void conversionKilogramsToGrams2KilogramsToGrams() {
        Assert.assertEquals(2000.0, conversionKilogramsToGrams(2),EPS);
    }

    @Test
    public void conversionHundredweightToGrams1HundredweightToGrams() {
        Assert.assertEquals(100_000.0, conversionHundredweightToGrams(1.0),EPS);
    }

    @Test
    public void conversionTonsToGrams1TonsToGrams() {
        Assert.assertEquals(1000_000.0, conversionTonsToGrams(1),EPS);
    }
}