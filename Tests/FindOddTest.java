import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindOddTest {
    @Test
    public void FindOdd1(){
        int[] input = {1,1,1,1,1,1,10,1,1,1,1};
        int expected = 10;
        int actual = FindOdd.findIt(input);
        Assert.assertEquals(expected,actual);
    }

}