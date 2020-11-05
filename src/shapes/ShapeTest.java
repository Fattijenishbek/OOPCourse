package shapes;

import org.junit.Assert;
import org.junit.Test;


public class ShapeTest {

    @Test
    public void testArea(){
        Shape s1 = new Circle(5.5, "RED", false);
        Assert.assertEquals(95.03317777109123,s1.getArea(),0);

        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", false);
        Assert.assertEquals(2.0,s3.getArea(),0);
    }

    @Test
    public void testPerimeter(){
        Shape s1 = new Circle(5.5, "RED", false);
        Assert.assertEquals(34.55751918948772,s1.getPerimeter(),0);

        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", false);
        Assert.assertEquals(6.0,s3.getPerimeter(),0);
    }

    @Test
    public void testColor(){
        Shape s1 = new Circle(5.5, "RED", false);
        Assert.assertEquals("ERR",s1.getColor(),"RED");

        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", false);
        Assert.assertEquals("ERR",s3.getColor(),"BLUE");
    }

    @Test
    public void testIsFilled(){
        Shape s1 = new Circle(5.5, "RED", false);
        Assert.assertEquals("Err",s1.isFilled(),false);

        Shape s3 = new Rectangle(1.0, 2.0, "BLUE", false);
        Assert.assertEquals("Err",s3.isFilled(),false);
    }

}
