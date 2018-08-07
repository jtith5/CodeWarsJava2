import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsTest {


    @Test
    public void testname() {
        String str = "cake";
        int expected = 2;
        int actual = Vowels.getCount(str);
        Assert.assertEquals(expected,actual);
    }


}