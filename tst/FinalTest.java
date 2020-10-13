import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FinalTest {
    private static final double eps = 10E-3;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() {
        MapValues.fillAllData();
        LN lnModule = new LN();
        LOG2 log2Module = new LOG2(lnModule);
        LOG10 log10Module = new LOG10(lnModule);
        LogarithmicFunction logarithmicFunctionModule = new LogarithmicFunction(lnModule, log2Module, log10Module);

        SIN sinModule = new SIN();
        COS cosModule = new COS(sinModule);
        CTG ctgModule = new CTG(sinModule, cosModule);
        CSC cscModule = new CSC(sinModule);
        SEC secModule = new SEC(cosModule);
        TrigonometricFunction trigonometricFunctionModule = new TrigonometricFunction(sinModule, cosModule, ctgModule, cscModule, secModule);

        mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);
    }

    /**
     * Simple checking - the first part of left plot points:
     * [a,b,c,d,e,f,g,h,i]
     * [o1, o, o2] - min and two points near min
     * [-0.5PI] - throw an exception
     */
    @Test
    public void testLA() throws IllegalArgumentException {
        assertEquals("left - point a", 65.224359, mainFunction.function(MapValues.leftPoints.get("a")), eps);
    }

    @Test
    public void testLB() throws IllegalArgumentException {
        assertEquals("left - point b", 6.111106, mainFunction.function(MapValues.leftPoints.get("b")), eps);
    }

    @Test
    public void testLC() throws IllegalArgumentException {
        assertEquals("left - point c", 2.297944, mainFunction.function(MapValues.leftPoints.get("c")), eps);
    }

    @Test
    public void testLD() throws IllegalArgumentException {
        assertEquals("left - point d", 1.293337, mainFunction.function(MapValues.leftPoints.get("d")), eps);
    }

    @Test
    public void testLE() throws IllegalArgumentException {
        assertEquals("left - point e", 0.868203, mainFunction.function(MapValues.leftPoints.get("e")), eps);
    }

    @Test
    public void testLF() throws IllegalArgumentException {
        assertEquals("left - point f", 0.620043, mainFunction.function(MapValues.leftPoints.get("f")), eps);
    }

    @Test
    public void testLG() throws IllegalArgumentException {
        assertEquals("left - point g", 1.459861, mainFunction.function(MapValues.leftPoints.get("g")), eps);
    }

    @Test
    public void testLH() throws IllegalArgumentException {
        assertEquals("left - point h", 5.897743, mainFunction.function(MapValues.leftPoints.get("h")), eps);
    }

    @Test
    public void testLI() throws IllegalArgumentException {
        assertEquals("left - point i", 999998000001.333400, mainFunction.function(MapValues.leftPoints.get("i")), eps);
    }

    @Test
    public void testLO1() throws IllegalArgumentException {
        assertEquals("left - point o1", 0.418588, mainFunction.function(MapValues.leftPoints.get("o1")), eps);
    }

    @Test
    public void testLO2() throws IllegalArgumentException {
        assertEquals("left - point o2", 0.418588, mainFunction.function(MapValues.leftPoints.get("o2")), eps);
    }

    @Test
    public void testLO() throws IllegalArgumentException {
        assertEquals("left - point o", 0.418588, mainFunction.function(MapValues.leftPoints.get("o")), eps);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLPI_05() throws IllegalArgumentException {
        mainFunction.function(MapValues.leftPoints.get("_0.5PI"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLPI() throws IllegalArgumentException {
        mainFunction.function(MapValues.leftPoints.get("_PI"));
    }

    /**
     * check first and second parts of plots - the dif between x coordinates = PI (Pi is period)
     */
    @Test
    public void testLA_PI() throws IllegalArgumentException {
        assertEquals("left - point a-pi", mainFunction.function(MapValues.leftPoints.get("a")), mainFunction.function(MapValues.leftPoints.get("a_PI")), eps);
    }

    @Test
    public void testLB_PI() throws IllegalArgumentException {
        assertEquals("left - point b-pi", mainFunction.function(MapValues.leftPoints.get("b")), mainFunction.function(MapValues.leftPoints.get("b_PI")), eps);
    }

    @Test
    public void testLC_PI() throws IllegalArgumentException {
        assertEquals("left - point c-pi", mainFunction.function(MapValues.leftPoints.get("c")), mainFunction.function(MapValues.leftPoints.get("c_PI")), eps);
    }

    @Test
    public void testLD_PI() throws IllegalArgumentException {
        assertEquals("left - point d-pi", mainFunction.function(MapValues.leftPoints.get("d")), mainFunction.function(MapValues.leftPoints.get("d_PI")), eps);
    }

    @Test
    public void testLE_PI() throws IllegalArgumentException {
        assertEquals("left - point e-pi", mainFunction.function(MapValues.leftPoints.get("e")), mainFunction.function(MapValues.leftPoints.get("e_PI")), eps);
    }

    @Test
    public void testLF_PI() throws IllegalArgumentException {
        assertEquals("left - point f-pi", mainFunction.function(MapValues.leftPoints.get("f")), mainFunction.function(MapValues.leftPoints.get("f_PI")), eps);
    }

    @Test
    public void testLG_PI() throws IllegalArgumentException {
        assertEquals("left - point g-pi", mainFunction.function(MapValues.leftPoints.get("g")), mainFunction.function(MapValues.leftPoints.get("g_PI")), eps);
    }

    @Test
    public void testLH_PI() throws IllegalArgumentException {
        assertEquals("left - point h-pi", mainFunction.function(MapValues.leftPoints.get("h")), mainFunction.function(MapValues.leftPoints.get("h_PI")), eps);
    }

    @Test
    public void testLI_PI() throws IllegalArgumentException {// Expected: 9.9999_80000013334E11 VS Actual: 9.9999_79999667067E11
        assertEquals("left - point i-pi", mainFunction.function(MapValues.leftPoints.get("i")), mainFunction.function(MapValues.leftPoints.get("i_PI")), eps);
    }

    @Test
    public void testLO1_PI() throws IllegalArgumentException {
        assertEquals("left - point o1-pi", mainFunction.function(MapValues.leftPoints.get("o1")), mainFunction.function(MapValues.leftPoints.get("o1_PI")), eps);
    }

    @Test
    public void testLO2_PI() throws IllegalArgumentException {
        assertEquals("left - point o2-pi", mainFunction.function(MapValues.leftPoints.get("o2")), mainFunction.function(MapValues.leftPoints.get("o2_PI")), eps);
    }

    @Test
    public void testLO_PI() throws IllegalArgumentException {
        assertEquals("left - point o-pi", mainFunction.function(MapValues.leftPoints.get("o")), mainFunction.function(MapValues.leftPoints.get("o_PI")), eps);
    }

    /**
     * -3PI vs -4PI
     */
    @Test
    public void testLA_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point a-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("a_3PI")), mainFunction.function(MapValues.leftPoints.get("a_4PI")), eps);
    }

    @Test
    public void testLB_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point b-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("b_3PI")), mainFunction.function(MapValues.leftPoints.get("b_4PI")), eps);
    }

    @Test
    public void testLC_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point c-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("c_3PI")), mainFunction.function(MapValues.leftPoints.get("c_4PI")), eps);
    }

    @Test
    public void testLD_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point d-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("d_3PI")), mainFunction.function(MapValues.leftPoints.get("d_4PI")), eps);
    }

    @Test
    public void testLE_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point e-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("e_3PI")), mainFunction.function(MapValues.leftPoints.get("e_4PI")), eps);
    }

    @Test
    public void testLF_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point f-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("f_3PI")), mainFunction.function(MapValues.leftPoints.get("f_4PI")), eps);
    }

    @Test
    public void testLG_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point g-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("g_3PI")), mainFunction.function(MapValues.leftPoints.get("g_4PI")), eps);
    }

    @Test
    public void testLH_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point h-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("h_3PI")), mainFunction.function(MapValues.leftPoints.get("h_4PI")), eps);
    }

    @Test
    public void testLI_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point i-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("i_3PI")), mainFunction.function(MapValues.leftPoints.get("i_4PI")), eps);
    }

    @Test
    public void testLO1_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o1-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o1_3PI")), mainFunction.function(MapValues.leftPoints.get("o1_4PI")), eps);
    }

    @Test
    public void testLO2_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o2-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o2_3PI")), mainFunction.function(MapValues.leftPoints.get("o2_4PI")), eps);
    }

    @Test
    public void testLO_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o_3PI")), mainFunction.function(MapValues.leftPoints.get("o_4PI")), eps);
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
