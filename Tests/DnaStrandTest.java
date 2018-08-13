import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DnaStrandTest {

    @Test
    public void makeComplement() {
        String dna = "TTTT";
        String expected = "AAAA";
        String actual = DnaStrand.makeComplement("TTTT");
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void makeComplement2(){
        String dna = "CGCAT";
        String expected = "GCGTA";
        String actual = DnaStrand.makeComplement("CGCAT");
        Assert.assertEquals(expected,actual);
    }
}