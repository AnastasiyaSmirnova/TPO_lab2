import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ThirdLevelTests_RIGHT_LN {
    private static final double eps = 10E-3;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() {
        MapValues.fillAllData();
        LN lnModule = new LN();
        LOG2 log2Module = new LOG2(lnModule);
        LOG10 log10Module = new LOG10(lnModule);

        TrigonometricFunction trigonometricFunctionModule = Mockito.mock(TrigonometricFunction.class);
        LogarithmicFunction logarithmicFunctionModule = new LogarithmicFunction(lnModule, log2Module, log10Module);

        mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);
    }

    /**
     * RIGHT PART - positive x
     * 28 points (no periodic)
     */
    @Test
    public void testRA() throws IllegalArgumentException {
        assertEquals("right - point a", 278177.259729, mainFunction.function(MapValues.rightPoints.get("a")), eps);
    }

    @Test
    public void testRAE() throws IllegalArgumentException {
        assertEquals("right - point between a and e", 485643.491369, mainFunction.function(MapValues.rightPoints.get("ae")), eps);
    }

    @Test
    public void testRE1() throws IllegalArgumentException {
        assertEquals("right - point e1", 0.000002, mainFunction.function(MapValues.rightPoints.get("e1")), eps);
    }

    @Test
    public void testRE() throws IllegalArgumentException {
        assertEquals("right - point e", 0.000000, mainFunction.function(MapValues.rightPoints.get("e")), eps);
    }

    @Test
    public void testRE2() throws IllegalArgumentException {
        assertEquals("right - point e2", 0.000000, mainFunction.function(MapValues.rightPoints.get("e2")), eps);
    }

    @Test
    public void testREB1() throws IllegalArgumentException {
        assertEquals("right - point between e and b 1", -126.256376, mainFunction.function(MapValues.rightPoints.get("eb1")), eps);
    }

    @Test
    public void testREB2() throws IllegalArgumentException {
        assertEquals("right - point between e and b 2", -178.097188, mainFunction.function(MapValues.rightPoints.get("eb2")), eps);
    }

    @Test
    public void testREB3() throws IllegalArgumentException {
        assertEquals("right - point between e and b 3", -194.839207, mainFunction.function(MapValues.rightPoints.get("eb3")), eps);
    }

    @Test
    public void testRB() throws IllegalArgumentException {
        assertEquals("right - point b", -198.433312, mainFunction.function(MapValues.rightPoints.get("b")), eps);
    }

    @Test
    public void testRB1() throws IllegalArgumentException {
        assertEquals("right - point b1", -198.433310, mainFunction.function(MapValues.rightPoints.get("b1")), eps);
    }

    @Test
    public void testRB2() throws IllegalArgumentException {
        assertEquals("right - point b2", -198.433314, mainFunction.function(MapValues.rightPoints.get("b2")), eps);
    }

    @Test
    public void testRBO1() throws IllegalArgumentException {
        assertEquals("right - point between b and o 1", -18.024031, mainFunction.function(MapValues.rightPoints.get("bo1")), eps);
    }

    @Test
    public void testRBO2() throws IllegalArgumentException {
        assertEquals("right - point between b and o 2", -2.490103, mainFunction.function(MapValues.rightPoints.get("bo2")), eps);
    }

    @Test
    public void testRBO3() throws IllegalArgumentException {
        assertEquals("right - point between b and o 3", -0.183649, mainFunction.function(MapValues.rightPoints.get("bo3")), eps);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRO() throws IllegalArgumentException {
        mainFunction.function(MapValues.rightPoints.get("o"));
    }

    @Test
    public void testRO1() throws IllegalArgumentException {
        assertEquals("right - point o1", -0.000000, mainFunction.function(MapValues.rightPoints.get("o1")), eps);
    }

    @Test
    public void testRO2() throws IllegalArgumentException {
        assertEquals("right - point o2", 0.000000, mainFunction.function(MapValues.rightPoints.get("o2")), eps);
    }

    @Test
    public void testROC1() throws IllegalArgumentException {
        assertEquals("right - point between o and c 1", 131.159764, mainFunction.function(MapValues.rightPoints.get("oc1")), eps);
    }

    @Test
    public void testROC2() throws IllegalArgumentException {
        assertEquals("right - point between o and c 2", 178.491656, mainFunction.function(MapValues.rightPoints.get("oc2")), eps);
    }

    @Test
    public void testROC3() throws IllegalArgumentException {
        assertEquals("right - point between o and c 3", 194.758566, mainFunction.function(MapValues.rightPoints.get("oc3")), eps);
    }

    @Test
    public void testRC() throws IllegalArgumentException {
        assertEquals("right - point c", 198.433316, mainFunction.function(MapValues.rightPoints.get("c")), eps);
    }

    @Test
    public void testRC1() throws IllegalArgumentException {
        assertEquals("right - point c1", 198.433316, mainFunction.function(MapValues.rightPoints.get("c1")), eps);
    }

    @Test
    public void testRC2() throws IllegalArgumentException {
        assertEquals("right - point c2", 198.433316, mainFunction.function(MapValues.rightPoints.get("c2")), eps);
    }

    @Test
    public void testRCD1() throws IllegalArgumentException {
        assertEquals("right - point between c and d 1", 58.638412, mainFunction.function(MapValues.rightPoints.get("cd1")), eps);
    }

    @Test
    public void testRCD2() throws IllegalArgumentException {
        assertEquals("right - point between c and d 2", 12.033626, mainFunction.function(MapValues.rightPoints.get("cd2")), eps);
    }

    @Test
    public void testRCD3() throws IllegalArgumentException {
        assertEquals("right - point between c and d 3", 1.129782, mainFunction.function(MapValues.rightPoints.get("cd3")), eps);
    }

    @Test
    public void testRD() throws IllegalArgumentException {
        assertEquals("right - point d", 0.000000, mainFunction.function(MapValues.rightPoints.get("d")), eps);
    }

    @Test
    public void testRD1() throws IllegalArgumentException {
        assertEquals("right - point d1", 0.000000, mainFunction.function(MapValues.rightPoints.get("d1")), eps);
    }

    @Test
    public void testRD2() throws IllegalArgumentException {
        assertEquals("right - point d2", -0.000000, mainFunction.function(MapValues.rightPoints.get("d2")), eps);
    }

    @Test
    public void testRDI() throws IllegalArgumentException {
        assertEquals("right - point between d and inf", -8.310115, mainFunction.function(MapValues.rightPoints.get("di")), eps);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPInf() throws IllegalArgumentException {
        mainFunction.function(Double.POSITIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNInf() throws IllegalArgumentException {
        mainFunction.function(Double.NEGATIVE_INFINITY);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNaN() throws IllegalArgumentException {
        mainFunction.function(Double.NaN);
    }
}
