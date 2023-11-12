package task4;

import org.junit.Assert;
import org.junit.Test;
import static task4.LengthTranslation.*;

public class LengthTranslationTest {
    public static final double EPS=0.000001;
    @Test
    public void convertingMetersToCentimeters10MetersToCentimeters() {
        Assert.assertEquals(1000.0, convertingMetersToCentimeters(10.0), EPS);
    }

    @Test
    public void convertingMetersToMillimeter10MetersToMillimeter() {
        Assert.assertEquals(10_000.0, convertingMetersToMillimeters(10.0), EPS);
    }

    @Test
    public void convertingMetersToKilometers1000MetersToKilometers() {
        Assert.assertEquals(1, convertingMetersToKilometers(1000), EPS);
    }

    @Test
    public void convertingMetersToDecimeters1MetersToDecimeters() {
        Assert.assertEquals(10, convertingMetersToDecimeters(1),EPS);
    }

    @Test
    public void convertingCentimetersToMeters100CentimetersToMeters() {
        Assert.assertEquals(1, convertingCentimetersToMeters(100),EPS);
    }

    @Test
    public void convertingMillimetersToMeters1200MillimetersToMeters() {
        Assert.assertEquals(1.2, convertingMillimetersToMeters(1200),EPS);
    }

    @Test
    public void convertingKilometersToMeters2KilometersToMeters() {
        Assert.assertEquals(2000.0, convertingKilometersToMeters(2),EPS);
    }

    @Test
    public void convertingDecimetersToMeters12DecimetersToMeters() {
        Assert.assertEquals(1.2, convertingDecimetersToMeters(12),EPS);
    }
}