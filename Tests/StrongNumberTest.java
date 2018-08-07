import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class StrongNumberTest {

    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    public void testSomething() {
        assertEquals(STRONG, StrongNumber.isStrongNumber(1));
        assertEquals(STRONG, StrongNumber.isStrongNumber(2));
        assertEquals(STRONG, StrongNumber.isStrongNumber(145));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(7));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(93));
        assertEquals(NOT_STRONG, StrongNumber.isStrongNumber(185));
    }

    @Test
    public void factorialTest(){
        assertEquals(120, StrongNumber.factorial(5));
        assertEquals(40320, StrongNumber.factorial(8));
        assertEquals(3628800, StrongNumber.factorial(10));
        assertEquals(6, StrongNumber.factorial(3));
        assertEquals(120, StrongNumber.factorialRecursively(5));
        assertEquals(40320, StrongNumber.factorialRecursively(8));
        assertEquals(3628800, StrongNumber.factorialRecursively(10));
        assertEquals(6, StrongNumber.factorialRecursively(3));
    }
}
