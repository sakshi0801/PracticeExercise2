package Exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeRevTest {
    PalindromeRev obj=new PalindromeRev();
    @Test
    public void testPalindrome()
    {
        boolean result1=obj.checkPalindrome("12321");
        assertEquals(true,result1);

        boolean result2=obj.checkPalindrome("sakshi");
        assertEquals(false,result2);

        boolean result3=obj.checkPalindrome("0");
        assertEquals(true,result3);
    }
}