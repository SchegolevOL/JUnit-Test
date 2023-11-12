package task1.test;

import org.junit.Assert;
import org.junit.Test;
import task1.classes.Square;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void testConstructorCreateSquare() throws Exception {
        Square square =new Square(10);
        Assert.assertNotNull(square);
    }
    @Test
    public void testAreaSquareCalculation() throws Exception {
        Square square =new Square(10);
        Assert.assertEquals(square.area(),100, 0.00001);
    }
}