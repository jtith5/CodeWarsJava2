import org.junit.Test;

import static org.junit.Assert.*;

public class PowersOfiTest {


    @Test
    public void test1() {
        assertEquals("1",PowersOfi.pofi(0));
        assertEquals("1",PowersOfi.pofi(4));
        assertEquals("1",PowersOfi.pofi(8));
        assertEquals("1",PowersOfi.pofi(56));
    }

    @Test
    public void testi() {
        assertEquals("i",PowersOfi.pofi(1));
        assertEquals("i",PowersOfi.pofi(5));
        assertEquals("i",PowersOfi.pofi(9));
        assertEquals("i",PowersOfi.pofi(57));
    }

    @Test
    public void testnegative1() {
        assertEquals("-1",PowersOfi.pofi(2));
        assertEquals("-1",PowersOfi.pofi(6));
        assertEquals("-1",PowersOfi.pofi(10));
    }

    @Test
    public void testnegativei() {
        assertEquals("-i",PowersOfi.pofi(3));
        assertEquals("-i",PowersOfi.pofi(7));
        assertEquals("-i",PowersOfi.pofi(11));
    }





}