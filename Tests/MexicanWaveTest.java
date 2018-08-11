import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MexicanWaveTest {

    @Test
    public void MexicanWaveTest(){
        String word = "wave";
        String[] expected = {
                "Wave","wAve","waVe","wavE"
        };
        String[] actual = MexicanWave.wave(word);
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void MexicanWaveTest2(){
        String word = " gap ";
        String[] expected = {
                " Gap "," gAp "," gaP "
        };
        String[] actual = MexicanWave.wave(word);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeWaveTestCharacterInMiddle() {
        String jevit = "jevit";
        String expected = "jeVit";
        String actual = MexicanWave.makeWave(jevit, 2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeWaveTestFirstLetter() {
        String jevit = "jevit";
        String expected = "Jevit";
        String actual = MexicanWave.makeWave(jevit, 0);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeWaveTestLastLetter() {
        String jevit = "jevit";
        String expected = "jeviT";
        String actual = MexicanWave.makeWave(jevit, jevit.length() - 1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeWaveTestWithSpace() {
        String jevit = " jevit";
        String actual = MexicanWave.makeWave(jevit, 0);
        Assert.assertNull(actual);
    }

    @Test
    public void countSpacesTest() {
        String input = "Two Words";
        int expected = 1;
        int actual = MexicanWave.countSpaces(input);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void countSpacesTest2() {
        String input = " Gap ";
        int expected = 0;
        int actual = MexicanWave.countSpaces(input);
        Assert.assertEquals(expected, actual);
    }
}