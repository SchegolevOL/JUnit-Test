package task1.test;

import org.junit.Assert;
import org.junit.Test;
import task1.classes.Rhomb;

import static org.junit.Assert.*;

public class RhombTest {

    @Test
    public void area() {
        Rhomb rhomb = new Rhomb(10,10);
        Assert.assertEquals(100, rhomb.area(), 0.00001);
    }
}