package Exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerFourTest {
    PowerFour obj=new PowerFour();
    @Test
    public void powerTest() {
        boolean result1 = obj.findPower(64);
        assertEquals(true, result1);

        boolean result2 = obj.findPower(20);
        assertEquals(false, result2);

        boolean result3 = obj.findPower(0);
        assertEquals(false, result3);

        boolean result4 = obj.findPower(-2);
        assertEquals(false, result4);
    }
}