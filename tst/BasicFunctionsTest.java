import org.junit.Before;
import org.junit.Test;

import static java.lang.Math.*;
import static org.junit.Assert.*;


public class BasicFunctionsTest {
    private static final double eps = 10E-4;
    private BasicFunctions functions;

    @Before
    public void createObj() {
        functions = new BasicFunctions();
    }

    @Test
    public void sinTest() {
        assertEquals(1, functions.sin(PI / 2), eps);
    }
}
