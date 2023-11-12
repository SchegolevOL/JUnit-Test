package task1.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import task1.classes.Triangle;

public class TriangleTest {
    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testConstructorCreateTriangle() throws Exception {
        Triangle triangle = new Triangle(10,10,10);
        Assert.assertNotNull(triangle);
    }
    @Test(expected = Exception.class)
    public void testConstructorExpectedExceptionWhenSideIsEqualTo0() throws Exception {
        Triangle triangle = new Triangle(10,0,10);
    }
    @Test
    public void testConstructorCalculationOfTriangleAngles() throws Exception {
        Triangle triangle = new Triangle(10,10,10);
        Assert.assertEquals(triangle.getAngleA(), 60, 0.0001);
        Assert.assertEquals(triangle.getAngleB(), 60, 0.0001);
        Assert.assertEquals(triangle.getAngleC(), 60, 0.0001);
    }

    @Test
    public void testAreaTriangleCalculation() throws Exception {
        Triangle triangle = new Triangle(10,10,10);
        Assert.assertEquals(triangle.area(), 43.30127,0.00001);

    }
}