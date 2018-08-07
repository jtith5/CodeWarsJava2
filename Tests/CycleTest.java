import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CycleTest {
    private static void dotest(int n, int expected) {
        int actual = Cycle.cycle(n);
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        dotest(33, 2);
        dotest(18118, -1);
        dotest(69, 22);
        dotest(197, 98);
        dotest(65, -1);
    }
    @Test
    public void findDecimaltest() {
        assertEquals(1, Cycle.findDecimal(1.05));
        assertEquals(3, Cycle.findDecimal(111.0));
        assertEquals(1, Cycle.findDecimal(0.0005));
        assertEquals(5, Cycle.findDecimal(25765.05));
        assertEquals(1, Cycle.findDecimal(0.0000005));
        assertEquals(1, Cycle.findDecimal(5.0));
    }
    @Test
    public void ifWholeNumbertest() {
        assertTrue(Cycle.isWholeNumber(2.0));
        assertFalse(Cycle.isWholeNumber(2.4));
        assertFalse(Cycle.isWholeNumber(3.1415451));
        assertFalse(Cycle.isWholeNumber(33.1415451));
        assertTrue(Cycle.isWholeNumber(89.00000));
        assertFalse(Cycle.isWholeNumber(89.50));
    }

    @Test
    public void isRepeatingDecimalTest() {
        assertFalse(Cycle.isRepeatingDecimal(0.00000000005));
        assertTrue(Cycle.isRepeatingDecimal(0.70692307692307695));
        assertTrue(Cycle.isRepeatingDecimal(0.0370370370370370));
        assertFalse(Cycle.isRepeatingDecimal(0.135531));

    }

//    @Test
//    public void getCycleLengthTest() {
//        assertFalse(Cycle.getCycleLength());
//        assertTrue(Cycle.getCycleLength());
//        assertTrue(Cycle.getCycleLength());
//        assertFalse(Cycle.getCycleLength());
//
//    }
}