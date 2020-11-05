package shapes;

import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void testArea(){
        Shape s1 = new Circle(5.5, "RED", false);
        Circle c1 = (Circle)s1;
        Assert.assertEquals(95.03317777109125,c1.getArea(),0);
    }

    @Test
    public void testPerimeter(){
        Shape s1 = new Circle(5.5, "RED", false);
        Circle c1 = (Circle)s1;
        Assert.assertEquals(34.55751918948772,c1.getPerimeter(),0);

    }

    @Test
    public void testColor(){
        Shape s1 = new Circle(5.5, "RED", false);
        Circle c1 = (Circle)s1;
        Assert.assertEquals("ERR",c1.getColor(),"RED");


    }

    @Test
    public void testIsFilled(){
        Shape s1 = new Circle(5.5, "RED", false);
        Circle c1 = (Circle)s1;
        Assert.assertEquals("Err",c1.isFilled(),false);

    }

}

