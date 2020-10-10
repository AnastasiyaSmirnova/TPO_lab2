import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.*;
import static org.junit.Assert.*;


public class UnitTests {
    private static final double eps = 10E-4;
    private SIN functions;

    @Before
    public void createObj() {
        functions = new SIN();
    }

    @Test
    public void sinTest() {
        assertEquals(1, functions.sin(PI / 2), eps);
    }

    @Test
    public void cosTest() {
        assertEquals(Math.pow(2, 0.5) / 2, functions.cos(17 * PI / 4), eps);
    }

    @Test
    public void sin1Test() {
        assertEquals(Math.pow(2, 0.5) / -2, functions.sin(-17 * PI / 4), eps);
    }


    @Test
    public void ln() throws IllegalArgumentException {
        LN f = new LN();
        assertEquals(Math.log(456), f.ln(456), eps);
    }
}
