import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class TortoiseTest {

    @Test
    public void race(){
        int speedA =720 ;
        int speedB = 850;
        int HeadStart = 70;
        int[] expected = {0,32,18};
        int[] actual = Tortoise.race(speedA,speedB,HeadStart);
        Assert.assertEquals(Arrays.toString(expected),Arrays.toString(actual));



    }


    @Test
    public void TimeArrayConversion(){
        int seconds = 1938;
        int[] expected = {0,32,18};
        int[] actual = Tortoise.timeArrayConversion(seconds);
        Assert.assertEquals(Arrays.toString(expected),Arrays.toString(actual));



    }

    @Test
    public void TimeArrayConversion2() {
        int seconds = 12109;
        int[] expected = {3, 21, 49};
        int[] actual = Tortoise.timeArrayConversion(seconds);
        Assert.assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }



}

