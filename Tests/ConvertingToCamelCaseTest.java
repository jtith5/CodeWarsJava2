import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

public class ConvertingToCamelCaseTest {

    @Test
    public void toCamelCaseTest() {
        String input = "the_Stealth_Warrior";
            System.out.println("input: "+input);
            assertEquals("theStealthWarrior", ConvertingToCamelCase.toCamelCase(input));
        }

    @Test
    public void testSomeDashLowerStartTest2() {
        String input = "the-Stealth-Warrior";
        System.out.println("input: "+input);
        assertEquals("theStealthWarrior", ConvertingToCamelCase.toCamelCase(input));
    }
}