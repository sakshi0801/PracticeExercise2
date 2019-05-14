package Exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class EvenNumTestTest {
    EvenNumTest obj=new EvenNumTest();
    @Test
    public void EvenTest()
    {
        boolean result1=obj.isEven(10);
        assertEquals(true,result1);

        boolean result2=obj.isEven(15);
        assertEquals(false,result2);

        boolean result3=obj.isEven(-2);
        assertEquals(true,result3);
    }
}