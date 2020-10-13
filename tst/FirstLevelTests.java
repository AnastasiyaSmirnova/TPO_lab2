import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class FirstLevelTests {
    private static final double eps = 10E-5;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() throws IllegalArgumentException {
        LogarithmicFunction logarithmicFunctionModule = Mockito.mock(LogarithmicFunction.class);
        TrigonometricFunction trigonometricFunctionModule = Mockito.mock(TrigonometricFunction.class);

        Mockito.when(logarithmicFunctionModule.logarithmicFunction(39.481975)).thenReturn(178.491656);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(58.722962)).thenReturn(194.758566);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(20.240988)).thenReturn(131.159764);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000001)).thenReturn(485643.491369);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000529)).thenReturn(-0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000527)).thenReturn(0.000002);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963951)).thenReturn(198.433316);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963949)).thenReturn(198.433316);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.999999)).thenReturn(-0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1.000001)).thenReturn(0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.753206)).thenReturn(-0.183649);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.259617)).thenReturn(-18.024031);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.506411)).thenReturn(-2.490103);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(3000.000000)).thenReturn(-8.310115);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1438.279116)).thenReturn(1.129782);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000001)).thenReturn(278177.259729);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012823)).thenReturn(-198.433312);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(531.402338)).thenReturn(58.638412);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963950)).thenReturn(198.433316);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(984.840727)).thenReturn(12.033626);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.009749)).thenReturn(-194.839207);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717504)).thenReturn(0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717503)).thenReturn(0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000528)).thenReturn(0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.003602)).thenReturn(-126.256376);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012822)).thenReturn(-198.433310);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.006675)).thenReturn(-178.097188);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717505)).thenReturn(-0.000000);
        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012824)).thenReturn(-198.433314);

        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972030)).thenReturn(0.418588);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972029)).thenReturn(0.418588);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972028)).thenReturn(0.418588);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-3.000000)).thenReturn(65.224359);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-2.500000)).thenReturn(6.111106);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-2.000000)).thenReturn(2.297944);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-1.700000)).thenReturn(1.293337);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-1.500000)).thenReturn(0.868203);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-2.500000)).thenReturn(6.111106);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.700000)).thenReturn(0.620043);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.500000)).thenReturn(1.459861);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.300000)).thenReturn(5.897743);
        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.000001)).thenReturn(999998000001.333400);


        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.5 * Math.PI)).thenThrow(new IllegalArgumentException("trigonom"));

        mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);
        MapValues.fillAllData();
    }

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
    public void testLPI() throws IllegalArgumentException {
        mainFunction.function(MapValues.leftPoints.get("_0.5PI"));
    }
}
