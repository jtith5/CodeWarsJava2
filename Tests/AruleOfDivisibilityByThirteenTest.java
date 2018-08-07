import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class AruleOfDivisibilityByThirteenTest {

    private ArrayList<Long> values;

    @Before
    public void setup() {
        values = new ArrayList<>();
        values.add(1L);
        values.add(10L);
        values.add(9L);
        values.add(12L);
        values.add(3L);
        values.add(4L);
    }

    @After
    public void tearDown() {
        values = null;
    }

    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }

    @Test
    public void test1() {
//        HashSet<Long> set = new HashSet<>();
//        Long product = 9 * values.get(0) + 2 * values.get(1) + 5 * values.get(2) + 8 * values.get(3);
//        System.out.println("Product is now: " + product); // 170
//        set.add(product);
//        System.out.println("Size of the set is now: " + set.size());
//
//        product = 0 * values.get(0) + 7 * values.get(1) + 1 * values.get(2);
//        System.out.println("Product is now: " + product); // 79
//        set.add(product);
//        System.out.println("Size of the set is now: " + set.size());
//
//        product = 9 * values.get(0) + 7 * values.get(1);
//        System.out.println("Product is now: " + product); // 79
//        set.add(product);
//        System.out.println("Size of the set is now: " + set.size());
//        System.out.println("Final set looks like: " + set);


        testing(AruleOfDivisibilityByThirteen.thirt(8529), 79);
    }

    @Test
    public void isOutOfDigitsToRemoveTest() {
        assertTrue( AruleOfDivisibilityByThirteen.isOutOfDigits(5L));
        assertFalse(AruleOfDivisibilityByThirteen.isOutOfDigits(53L));
    }

    @Test
    public void testGettingLastDigit() {
        Assert.assertEquals(new Long(9), AruleOfDivisibilityByThirteen.getLastDigit(8529L));
        Assert.assertEquals(new Long(2), AruleOfDivisibilityByThirteen.getLastDigit(852L));
        Assert.assertEquals(new Long(5), AruleOfDivisibilityByThirteen.getLastDigit(85L));
        Assert.assertEquals(new Long(8), AruleOfDivisibilityByThirteen.getLastDigit(8L));
    }

    @Test
    public void removeLastDigitTest() {
        Assert.assertEquals(new Long(852L), AruleOfDivisibilityByThirteen.removeLastDigit(8529L));
        Assert.assertEquals(new Long(-5L), AruleOfDivisibilityByThirteen.removeLastDigit(5L));
    }

    @Test
    public void calculateSumTest() {
        ArrayList<Long> values = new ArrayList<>();
        values.add(5L);
        values.add(20L);
        values.add(18L);
        Assert.assertEquals(new Long(43L), AruleOfDivisibilityByThirteen.calculateSum(values));
    }

    @Test
    public void createMultipliersTest() {
        Assert.assertEquals(values, AruleOfDivisibilityByThirteen.createMultipliers());
    }

    @Test
    public void test2() {
        testing(AruleOfDivisibilityByThirteen.thirt(85299258), 31);
    }

    @Test
    public void test3() {
        testing(AruleOfDivisibilityByThirteen.thirt(5634), 57);
    }

    @Test
    public void test4() {
        testing(AruleOfDivisibilityByThirteen.thirt(1111111111), 71);
    }

    @Test
    public void test5() {
        testing(AruleOfDivisibilityByThirteen.thirt(987654321), 30);
    }
}