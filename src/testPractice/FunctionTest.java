package testPractice;
import org.junit.Test;
import org.junit.Ignore;

import static org.junit.Assert.assertEquals;

public class FunctionTest {

    @Test
    public void less(){
        int o =5;
        int t =1;
        int expected =6;
        assertEquals(expected, new Function(o,t).getresult());
    }

    @Test
    public void big(){
        int o = 123;
        int t = 256;
        int expected =379;
        assertEquals(expected, new Function(o, t).getresult());
    }
}
