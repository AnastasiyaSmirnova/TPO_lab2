import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class ThirdLevelTests_LEFT_COS {

    private static final double eps = 10E-5;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() throws IllegalArgumentException {
        SIN sinModule = Mockito.mock(SIN.class);

        MapValues.fillAllData();
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("_0.5PI"))).thenReturn(-1.000000);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a"))).thenReturn(-0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_3PI"))).thenReturn(0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_4PI"))).thenReturn(-0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_PI"))).thenReturn(0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b"))).thenReturn(-0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_3PI"))).thenReturn(0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_4PI"))).thenReturn(-0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_PI"))).thenReturn(0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c"))).thenReturn(-0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_3PI"))).thenReturn(0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_4PI"))).thenReturn(-0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_PI"))).thenReturn(0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d"))).thenReturn(-0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_3PI"))).thenReturn(0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_4PI"))).thenReturn(-0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_PI"))).thenReturn(0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e"))).thenReturn(-0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_3PI"))).thenReturn(0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_4PI"))).thenReturn(-0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_PI"))).thenReturn(0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f"))).thenReturn(-0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_3PI"))).thenReturn(0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_4PI"))).thenReturn(-0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_PI"))).thenReturn(0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g"))).thenReturn(-0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_3PI"))).thenReturn(0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_4PI"))).thenReturn(-0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_PI"))).thenReturn(0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h"))).thenReturn(-0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_3PI"))).thenReturn(0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_4PI"))).thenReturn(-0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_PI"))).thenReturn(0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i"))).thenReturn(-0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_3PI"))).thenReturn(0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_4PI"))).thenReturn(-0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_PI"))).thenReturn(0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o"))).thenReturn(-0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1"))).thenReturn(-0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_3PI"))).thenReturn(0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_4PI"))).thenReturn(-0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_PI"))).thenReturn(0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2"))).thenReturn(-0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_3PI"))).thenReturn(0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_4PI"))).thenReturn(-0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_PI"))).thenReturn(0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_3PI"))).thenReturn(0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_4PI"))).thenReturn(-0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_PI"))).thenReturn(0.826031);

        COS cosModule = new COS(sinModule);
        CTG ctgModule = new CTG(sinModule, cosModule);
        CSC cscModule = new CSC(sinModule);
        SEC secModule = new SEC(cosModule);
        TrigonometricFunction trigonometricFunctionModule = new TrigonometricFunction(sinModule, cosModule, ctgModule, cscModule, secModule);
        LogarithmicFunction logarithmicFunctionModule = Mockito.mock(LogarithmicFunction.class);

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
