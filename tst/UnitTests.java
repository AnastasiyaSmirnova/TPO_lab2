import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static org.junit.Assert.assertEquals;

public class UnitTests {
    private static SIN sinModule;
    private static LN lnModule;
    private static double eps = 10E-7;

    @BeforeClass
    public static void init() {
        sinModule = new SIN();
        lnModule = new LN();
    }

    @Test
    public void sin0() {
        assertEquals("sin 0", 0, sinModule.sin(0), eps);
    }

    @Test
    public void sin30() {
        assertEquals("sin pi/6", 0.5, sinModule.sin(PI / 6.0), eps);
    }

    @Test
    public void sin45() {
        assertEquals("sin Pi/4", pow(2, 0.5) * 0.5, sinModule.sin(PI / 4.0), eps);
    }

    @Test
    public void sin60() {
        assertEquals("sin Pi/3", pow(3, 0.5) * 0.5, sinModule.sin(PI / 3.0), eps);
    }

    @Test
    public void sin90() {
        assertEquals("sin pi/2", 1, sinModule.sin(PI / 2.0), eps);
    }

    @Test
    public void sin180() {
        assertEquals("sin pi", 0, sinModule.sin(PI), eps);
    }

    @Test
    public void sin270() {
        assertEquals("sin 3pi/2", -1, sinModule.sin(1.5 * PI), eps);
    }

    @Test
    public void sin360() {
        assertEquals("sin 2pi", 0, sinModule.sin(2 * PI), eps);
    }

    @Test
    public void ln() throws IllegalArgumentException {
        assertEquals("ln", Math.log(456), lnModule.ln(456), eps);
    }
}
