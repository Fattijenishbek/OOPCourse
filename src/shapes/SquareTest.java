package shapes;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testArea(){
        Shape s4 = new Square(6.6);
        Assert.assertEquals(43.559999999999995,s4.getArea(),0);

        Rectangle r2 = (Rectangle)s4;
        Square sq1 = (Square)r2;
        Assert.assertEquals(43.559999999999995,sq1.getArea(),0);
    }

    @Test
    public void testPerimeter(){
        Shape s4 = new Square(6.6);
        Assert.assertEquals(26.4,s4.getPerimeter(),0);

        Rectangle r2 = (Rectangle)s4;
        Square sq1 = (Square)r2;
        Assert.assertEquals(26.4,sq1.getPerimeter(),0);
    }

    @Test
    public void testColor(){
        Shape s4 = new Square(6.6);
        Assert.assertEquals("ERR",s4.getColor(),null);

        Rectangle r2 = (Rectangle)s4;
        Square sq1 = (Square)r2;
        Assert.assertEquals("ERR",sq1.getColor(),null);
    }

    @Test
    public void testIsFilled(){
        Shape s4 = new Square(6.6);
        Assert.assertEquals("Err",s4.isFilled(),false);


        Rectangle r2 = (Rectangle)s4;
        Square sq1 = (Square)r2;
        Assert.assertEquals("Err",sq1.isFilled(),false);
    }
}