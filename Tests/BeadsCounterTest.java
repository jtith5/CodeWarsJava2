import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BeadsCounterTest {

    @Test
    public void countRedBeads1(){
        int nblue = 3;
        int expected = 4;
        int actual = BeadsCounter.countRedBeads(3);
        Assert.assertEquals(expected,actual);
    }

}