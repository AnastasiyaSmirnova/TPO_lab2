import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class SecondLevelTets_RIGHT_LOG2 {
    private static final double eps = 10E-3;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() throws IllegalArgumentException {
        LN lnModule = Mockito.mock(LN.class);
        LOG10 log10Module = Mockito.mock(LOG10.class);

        MapValues.fillAllData();
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("a"))).thenReturn(-13.815511);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("ae"))).thenReturn(-14.508658);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("b"))).thenReturn(-4.356546);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("b1"))).thenReturn(-4.356624);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("b2"))).thenReturn(-4.356468);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("bo1"))).thenReturn(-1.348548);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("bo2"))).thenReturn(-0.680406);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("bo3"))).thenReturn(-0.283417);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("c"))).thenReturn(4.356247);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("c1"))).thenReturn(4.356247);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("c2"))).thenReturn(4.356247);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("cd1"))).thenReturn(6.275519);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("cd2"))).thenReturn(6.892480);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("cd3"))).thenReturn(7.271203);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("d"))).thenReturn(7.545240);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("d1"))).thenReturn(7.545240);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("d2"))).thenReturn(7.545240);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("di"))).thenReturn(8.006368);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("e"))).thenReturn(-7.546414);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("e1"))).thenReturn(-7.548310);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("e2"))).thenReturn(-7.544522);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("eb1"))).thenReturn(-5.626363);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("eb2"))).thenReturn(-5.009341);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("eb3"))).thenReturn(-4.630596);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("o"))).thenThrow(new IllegalArgumentException("ln"));
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("o1"))).thenReturn(-0.000001);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("o2"))).thenReturn(0.000001);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("oc1"))).thenReturn(3.007710);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("oc2"))).thenReturn(3.675844);
        Mockito.when(lnModule.ln(MapValues.rightPoints.get("oc3"))).thenReturn(4.072831);

        Mockito.when(lnModule.ln(10.0)).thenReturn(2.302585);
        Mockito.when(lnModule.ln(2.0)).thenReturn(0.693147);

        Mockito.when(log10Module.log10(MapValues.rightPoints.get("a"))).thenReturn(-6.000000);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("ae"))).thenReturn(-6.301030);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("b"))).thenReturn(-1.892024);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("b1"))).thenReturn(-1.892058);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("b2"))).thenReturn(-1.891990);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("bo1"))).thenReturn(-0.585667);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("bo2"))).thenReturn(-0.295497);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("bo3"))).thenReturn(-0.123086);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("c"))).thenReturn(1.891894);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("c1"))).thenReturn(1.891894);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("c2"))).thenReturn(1.891894);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("cd1"))).thenReturn(2.725423);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("cd2"))).thenReturn(2.993366);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("cd3"))).thenReturn(3.157843);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("d"))).thenReturn(3.276856);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("d1"))).thenReturn(3.276856);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("d2"))).thenReturn(3.276856);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("di"))).thenReturn(3.477121);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("e"))).thenReturn(-3.277366);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("e1"))).thenReturn(-3.278189);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("e2"))).thenReturn(-3.276544);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("eb1"))).thenReturn(-2.443498);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("eb2"))).thenReturn(-2.175529);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("eb3"))).thenReturn(-2.011042);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("o"))).thenThrow(new IllegalArgumentException("log10"));
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("o1"))).thenReturn(-0.000000);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("o2"))).thenReturn(0.000000);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("oc1"))).thenReturn(1.306232);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("oc2"))).thenReturn(1.596399);
        Mockito.when(log10Module.log10(MapValues.rightPoints.get("oc3"))).thenReturn(1.768808);

        LOG2 log2Module = new LOG2(lnModule);
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
