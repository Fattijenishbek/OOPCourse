package shapes;

import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {
    @Test
    public void testArea(){
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true);
        Rectangle r1 = (Rectangle)s3;
        Assert.assertEquals(2.0,r1.getArea(),0);
    }

    @Test
    public void testPerimeter(){
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true);
        Rectangle r1 = (Rectangle)s3;
        Assert.assertEquals(6.0,r1.getPerimeter(),0);
    }

    @Test
    public void testColor(){
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true);
        Rectangle r1 = (Rectangle)s3;
        Assert.assertEquals("ERR",r1.getColor(),"BLUE");
    }

    @Test
    public void testIsFilled(){
        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", true);
        Rectangle r1 = (Rectangle)s3;
        Assert.assertEquals("Err",r1.isFilled(),true);
    }

}

