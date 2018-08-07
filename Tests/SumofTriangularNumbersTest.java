import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class SumofTriangularNumbersTest {

    @Test
    public void sumTriangularNumbers() {
    }

    @Test
    public void findAllTriangleNumbers() {
        ArrayList<Integer> actual = SumofTriangularNumbers.FindXTriangleNumbers(4);
        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(6);
        expected.add(10);
        assertEquals(expected, actual);
    }
}