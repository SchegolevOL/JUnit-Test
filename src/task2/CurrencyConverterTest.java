package task2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrencyConverterTest {
    CurrencyConverter converter;

    @Before
    public void setUp() throws Exception {
        converter= new CurrencyConverter();
        converter.dollar.put(Currency.euro,0.95);
        converter.dollar.put(Currency.ian,120.0);
        converter.dollar.put(Currency.poundSterling,0.5);
        converter.euro.put(Currency.dollar, 1.05);
        converter.euro.put(Currency.ian, 0.03);
        converter.euro.put(Currency.poundSterling, 2.0);
        converter.poundSterling.put(Currency.dollar, 20.0);
        converter.ian.put(Currency.dollar, 0.01);
    }

    @Test
    public void convertDollar() {
        System.out.println(converter.convertDollar(Currency.euro, 100));
        Assert.assertEquals(converter.convertDollar(Currency.euro, 100), 95,0.00001);
    }

    @Test
    public void convertEuro() {
        System.out.println(converter.convertEuro(Currency.dollar, 100));
        Assert.assertEquals(converter.convertEuro(Currency.dollar, 100), 105,0.00001);
    }

    @Test
    public void convertPoundSterling() {
        System.out.println(converter.convertPoundSterling(Currency.dollar, 100));
        Assert.assertEquals(converter.convertPoundSterling(Currency.dollar, 100), 2000,0.00001);
    }

    @Test
    public void convertIan() {
        System.out.println(converter.convertIan(Currency.dollar, 100));
        Assert.assertEquals(converter.convertIan(Currency.dollar, 100), 1,0.00001);
    }
}