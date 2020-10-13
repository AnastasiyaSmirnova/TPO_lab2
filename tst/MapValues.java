import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.*;

public class MapValues {
    private static final double eps = 10E-7;

    public static HashMap<String, Double> triganom = new HashMap<String, Double>();
    public static HashMap<String, Double> logarithm = new HashMap<String, Double>();
    public static HashMap<String, Double> sin = new HashMap<String, Double>();
    public static HashMap<String, Double> cos = new HashMap<String, Double>();
    public static HashMap<String, Double> ctg = new HashMap<String, Double>();
    public static HashMap<String, Double> csc = new HashMap<String, Double>();
    public static HashMap<String, Double> sec = new HashMap<String, Double>();
    public static HashMap<String, Double> log = new HashMap<String, Double>();
    public static HashMap<String, Double> log2 = new HashMap<String, Double>();
    public static HashMap<String, Double> log10 = new HashMap<String, Double>();

    public static HashMap<String, Double> rightPoints = new HashMap<>();
    public static HashMap<String, Double> leftPoints = new HashMap<>();

    public static void fillAllData() {
        fillLeftPoints();
        fillRightPoints();

        fillTrigonomMap();
        fillSinMap();
        fillCosMap();
        fillSecMap();
        fillCscMap();
        fillCtgMap();

        fillLogarithmMap();
        fillLogMap();
        fillLog2Map();
        fillLog10Map();
    }

    private static void fillLeftPoints() {
        double min = -0.972029;
        leftPoints.put("a", -3.0);
        leftPoints.put("b", -2.5);
        leftPoints.put("c", -2.0);
        leftPoints.put("d", -1.7);
        leftPoints.put("e", -1.5);
        leftPoints.put("o1", min - eps);
        leftPoints.put("o", min);
        leftPoints.put("o2", min + eps);
        leftPoints.put("f", -0.7);
        leftPoints.put("g", -0.5);
        leftPoints.put("h", -0.3);
        leftPoints.put("i", -eps);

        leftPoints.put("a_PI", -3.0 - PI);
        leftPoints.put("b_PI", -2.5 - PI);
        leftPoints.put("c_PI", -2.0 - PI);
        leftPoints.put("d_PI", -1.7 - PI);
        leftPoints.put("e_PI", -1.5 - PI);
        leftPoints.put("o1_PI", min - eps - PI);
        leftPoints.put("o_PI", min - PI);
        leftPoints.put("o2_PI", min + eps - PI);
        leftPoints.put("f_PI", -0.7 - PI);
        leftPoints.put("g_PI", -0.5 - PI);
        leftPoints.put("h_PI", -0.3 - PI);
        leftPoints.put("i_PI", -eps - PI);

        leftPoints.put("a_3PI", -3.0 - 3 * PI);
        leftPoints.put("b_3PI", -2.5 - 3 * PI);
        leftPoints.put("c_3PI", -2.0 - 3 * PI);
        leftPoints.put("d_3PI", -1.7 - 3 * PI);
        leftPoints.put("e_3PI", -1.5 - 3 * PI);
        leftPoints.put("o1_3PI", min - eps - 3 * PI);
        leftPoints.put("o_3PI", min - 3 * PI);
        leftPoints.put("o2_3PI", min + eps - 3 * PI);
        leftPoints.put("f_3PI", -0.7 - 3 * PI);
        leftPoints.put("g_3PI", -0.5 - 3 * PI);
        leftPoints.put("h_3PI", -0.3 - 3 * PI);
        leftPoints.put("i_3PI", -eps - 3 * PI);

        leftPoints.put("a_4PI", -3.0 - 4 * PI);
        leftPoints.put("b_4PI", -2.5 - 4 * PI);
        leftPoints.put("c_4PI", -2.0 - 4 * PI);
        leftPoints.put("d_4PI", -1.7 - 4 * PI);
        leftPoints.put("e_4PI", -1.5 - 4 * PI);
        leftPoints.put("o1_4PI", min - eps - 4 * PI);
        leftPoints.put("o_4PI", min - 4 * PI);
        leftPoints.put("o2_4PI", min + eps - 4 * PI);
        leftPoints.put("f_4PI", -0.7 - 4 * PI);
        leftPoints.put("g_4PI", -0.5 - 4 * PI);
        leftPoints.put("h_4PI", -0.3 - 4 * PI);
        leftPoints.put("i_4PI", -eps - 4 * PI);

        leftPoints.put("_0.5PI", -0.5 * PI);
        leftPoints.put("_PI", -PI);
    }

    public static double getPointsBetweenTwo(double start, double end, double n) {
        return start + (end - start) / 4 * n;
    }

    private static void fillRightPoints() {
        double eX = 0.000528,
                bX = 0.0128226,
                oX = 1.0,
                cX = 77.96395,
                dX = 1891.717504;

        rightPoints.put("a", eps);
        rightPoints.put("ae", eps / 2);

        rightPoints.put("e", eX);
        rightPoints.put("e1", eX - eps);
        rightPoints.put("e2", eX + eps);

        rightPoints.put("eb1", getPointsBetweenTwo(eX, bX, 1));
        rightPoints.put("eb2", getPointsBetweenTwo(eX, bX, 2));
        rightPoints.put("eb3", getPointsBetweenTwo(eX, bX, 3));

        rightPoints.put("b", bX);
        rightPoints.put("b1", bX - eps);
        rightPoints.put("b2", bX + eps);

        rightPoints.put("bo1", getPointsBetweenTwo(bX, oX, 1));
        rightPoints.put("bo2", getPointsBetweenTwo(bX, oX, 2));
        rightPoints.put("bo3", getPointsBetweenTwo(bX, oX, 3));

        rightPoints.put("o1", oX - eps);
        rightPoints.put("o", oX); // incorrect value -> expected exception
        rightPoints.put("o2", oX + eps);

        rightPoints.put("oc1", getPointsBetweenTwo(oX, cX, 1));
        rightPoints.put("oc2", getPointsBetweenTwo(oX, cX, 2));
        rightPoints.put("oc3", getPointsBetweenTwo(oX, cX, 3));

        rightPoints.put("c", cX);
        rightPoints.put("c1", cX - eps);
        rightPoints.put("c2", cX + eps);

        rightPoints.put("cd1", getPointsBetweenTwo(cX, dX, 1));
        rightPoints.put("cd2", getPointsBetweenTwo(cX, dX, 2));
        rightPoints.put("cd3", getPointsBetweenTwo(cX, dX, 3));

        rightPoints.put("d", dX);
        rightPoints.put("d1", dX - eps);
        rightPoints.put("d2", dX + eps);

        rightPoints.put("di", 3000.0);
    }

    public static double left(double x) {
        return pow((Math.cos(x) + 1 / Math.sin(x)), 2);
    }

    public static double log2(double x) {
        return log(x) / log(2);
    }

    public static double right(double x) {
        return pow(
                pow(log10(x), 4) / (log10(x) - log2(x)) + log2(x) - (log10(x) - log(x)),
                3);
    }

    private static void fillTrigonomMap() {
        for (String key : leftPoints.keySet()) {
            triganom.put(key, left(leftPoints.get(key)));
        }
    }

    private static void fillSinMap() {
        for (String key : leftPoints.keySet()) {
            sin.put(key, Math.sin(leftPoints.get(key)));
        }
    }

    private static void fillCosMap() {
        for (String key : leftPoints.keySet()) {
            cos.put(key, Math.cos(leftPoints.get(key)));
        }
    }

    private static void fillSecMap() {
        for (String key : leftPoints.keySet()) {
            sec.put(key, 1 / Math.cos(leftPoints.get(key)));
        }
    }

    private static void fillCscMap() {
        for (String key : leftPoints.keySet()) {
            csc.put(key, 1 / Math.sin(leftPoints.get(key)));
        }
    }

    private static void fillCtgMap() {
        for (String key : leftPoints.keySet()) {
            ctg.put(key, Math.cos(leftPoints.get(key)) / Math.sin(leftPoints.get(key)));
        }
    }

    private static void fillLogarithmMap() {
        for (String key : rightPoints.keySet()) {
            logarithm.put(key, right(rightPoints.get(key)));
        }
    }

    private static void fillLogMap() {
        for (String key : rightPoints.keySet()) {
            log.put(key, Math.log(rightPoints.get(key)));
        }
    }

    private static void fillLog10Map() {
        for (String key : rightPoints.keySet()) {
            log10.put(key, Math.log10(rightPoints.get(key)));
        }
    }

    private static void fillLog2Map() {
        for (String key : rightPoints.keySet()) {
            log2.put(key, log2(rightPoints.get(key)));
        }
    }


    public static void main(String[] args) {
//        System.out.println(left(Double.NEGATIVE_INFINITY));
//        System.out.println(right(Double.POSITIVE_INFINITY));
        fillAllData();
//        printLogarithm();
//        printTrigomon();
//        printSin();
//        printCos();
//        printCtg();
//        printSEC();
//        printCSC();
        printLn();
        printLog2();
        printLog10();
    }

    public static void printLogarithm() {
        Object[] keys = rightPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(logarithmicFunctionModule.logarithmicFunction(MapValues.rightPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, logarithm.get(key.toString()));
        }
    }

    public static void printLn() {
        Object[] keys = rightPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(lnModule.ln(MapValues.rightPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, log.get(key.toString()));
        }
    }

    public static void printLog2() {
        Object[] keys = rightPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(log2Module.lоg2(MapValues.rightPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, log2.get(key.toString()));
        }
    }

    public static void printLog10() {
        Object[] keys = rightPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(log10Module.log10(MapValues.rightPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, log10.get(key.toString()));
        }
    }

    public static void printTrigomon() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(trigonometricFunctionModule.trigonometricFunction(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, triganom.get(key.toString()));
        }
    }

    public static void printSin() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(sinModule.sin(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, sin.get(key.toString()));
        }
    }

    public static void printCos() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(cosModule.cos(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, cos.get(key.toString()));
        }
    }

    public static void printCtg() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(ctgModule.ctg(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, ctg.get(key.toString()));
        }
    }

    public static void printCSC() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(cscModule.csc(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, csc.get(key.toString()));
        }
    }

    public static void printSEC() {
        Object[] keys = leftPoints.keySet().toArray();
        Arrays.sort(keys);
        for (Object key : keys) {
            System.out.format("Mockito.when(secModule.sec(MapValues.leftPoints.get(\"%s\"))).thenReturn(%.6f);%n", key, sec.get(key.toString()));
        }
    }


//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-3.000000)).thenReturn(65.224359);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-2.500000)).thenReturn(6.111106);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-2.000000)).thenReturn(2.297944);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-1.700000)).thenReturn(1.293337);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-1.500000)).thenReturn(0.868203);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972040)).thenReturn(0.418588);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972030)).thenReturn(0.418588);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.972020)).thenReturn(0.418588);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.700000)).thenReturn(0.620043);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.500000)).thenReturn(1.459861);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.300000)).thenReturn(5.897743);
//        Mockito.when(trigonometricFunctionModule.trigonometricFunction(-0.000010)).thenReturn(9999800001.333338);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000010)).thenReturn(28968.396713);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000264)).thenReturn(32.331299);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000518)).thenReturn(0.000548);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000528)).thenReturn(0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.000538)).thenReturn(-0.000349);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.003602)).thenReturn(-126.256376);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.006675)).thenReturn(-178.097188);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.009749)).thenReturn(-194.839207);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012813)).thenReturn(-198.433262);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012823)).thenReturn(-198.433312);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.012833)).thenReturn(-198.433306);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.259617)).thenReturn(-18.024031);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.506411)).thenReturn(-2.490103);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.753206)).thenReturn(-0.183649);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(0.999990)).thenReturn(-0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1.000010)).thenReturn(0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(20.240988)).thenReturn(131.159764);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(39.481975)).thenReturn(178.491656);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(58.722962)).thenReturn(194.758566);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963940)).thenReturn(198.433316);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963950)).thenReturn(198.433316);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(77.963960)).thenReturn(198.433316);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(531.402338)).thenReturn(58.638412);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(984.840727)).thenReturn(12.033626);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1438.279116)).thenReturn(1.129782);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717494)).thenReturn(0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717504)).thenReturn(0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(1891.717514)).thenReturn(-0.000000);
//        Mockito.when(logarithmicFunctionModule.logarithmicFunction(3000.000000)).thenReturn(-8.310115);
//
//        Mockito.when(sinModule.sin(-3.000000)).thenReturn(-0.141120);
//        Mockito.when(sinModule.sin(-2.500000)).thenReturn(-0.598472);
//        Mockito.when(sinModule.sin(-2.000000)).thenReturn(-0.909297);
//        Mockito.when(sinModule.sin(-1.700000)).thenReturn(-0.991665);
//        Mockito.when(sinModule.sin(-1.500000)).thenReturn(-0.997495);
//        Mockito.when(sinModule.sin(-0.972040)).thenReturn(-0.826037);
//        Mockito.when(sinModule.sin(-0.972030)).thenReturn(-0.826031);
//        Mockito.when(sinModule.sin(-0.972020)).thenReturn(-0.826026);
//        Mockito.when(sinModule.sin(-0.700000)).thenReturn(-0.644218);
//        Mockito.when(sinModule.sin(-0.500000)).thenReturn(-0.479426);
//        Mockito.when(sinModule.sin(-0.300000)).thenReturn(-0.295520);
//        Mockito.when(sinModule.sin(-0.000010)).thenReturn(-0.000010);
//        Mockito.when(cosModule.cos(-3.000000)).thenReturn(-0.989992);
//        Mockito.when(cosModule.cos(-2.500000)).thenReturn(-0.801144);
//        Mockito.when(cosModule.cos(-2.000000)).thenReturn(-0.416147);
//        Mockito.when(cosModule.cos(-1.700000)).thenReturn(-0.128844);
//        Mockito.when(cosModule.cos(-1.500000)).thenReturn(0.070737);
//        Mockito.when(cosModule.cos(-0.972040)).thenReturn(0.563616);
//        Mockito.when(cosModule.cos(-0.972030)).thenReturn(0.563624);
//        Mockito.when(cosModule.cos(-0.972020)).thenReturn(0.563632);
//        Mockito.when(cosModule.cos(-0.700000)).thenReturn(0.764842);
//        Mockito.when(cosModule.cos(-0.500000)).thenReturn(0.877583);
//        Mockito.when(cosModule.cos(-0.300000)).thenReturn(0.955336);
//        Mockito.when(cosModule.cos(-0.000010)).thenReturn(1.000000);
//        Mockito.when(ctgModule.ctg(-3.000000)).thenReturn(7.015253);
//        Mockito.when(ctgModule.ctg(-2.500000)).thenReturn(1.338648);
//        Mockito.when(ctgModule.ctg(-2.000000)).thenReturn(0.457658);
//        Mockito.when(ctgModule.ctg(-1.700000)).thenReturn(0.129927);
//        Mockito.when(ctgModule.ctg(-1.500000)).thenReturn(-0.070915);
//        Mockito.when(ctgModule.ctg(-0.972040)).thenReturn(-0.682313);
//        Mockito.when(ctgModule.ctg(-0.972030)).thenReturn(-0.682328);
//        Mockito.when(ctgModule.ctg(-0.972020)).thenReturn(-0.682342);
//        Mockito.when(ctgModule.ctg(-0.700000)).thenReturn(-1.187242);
//        Mockito.when(ctgModule.ctg(-0.500000)).thenReturn(-1.830488);
//        Mockito.when(ctgModule.ctg(-0.300000)).thenReturn(-3.232728);
//        Mockito.when(ctgModule.ctg(-0.000010)).thenReturn(-99999.999997);
//        Mockito.when(cscModule.csc(-3.000000)).thenReturn(-7.086167);
//        Mockito.when(cscModule.csc(-2.500000)).thenReturn(-1.670922);
//        Mockito.when(cscModule.csc(-2.000000)).thenReturn(-1.099750);
//        Mockito.when(cscModule.csc(-1.700000)).thenReturn(-1.008405);
//        Mockito.when(cscModule.csc(-1.500000)).thenReturn(-1.002511);
//        Mockito.when(cscModule.csc(-0.972040)).thenReturn(-1.210600);
//        Mockito.when(cscModule.csc(-0.972030)).thenReturn(-1.210608);
//        Mockito.when(cscModule.csc(-0.972020)).thenReturn(-1.210616);
//        Mockito.when(cscModule.csc(-0.700000)).thenReturn(-1.552270);
//        Mockito.when(cscModule.csc(-0.500000)).thenReturn(-2.085830);
//        Mockito.when(cscModule.csc(-0.300000)).thenReturn(-3.383863);
//        Mockito.when(cscModule.csc(-0.000010)).thenReturn(-100000.000002);
//        Mockito.when(secModule.sec(-3.000000)).thenReturn(-1.010109);
//        Mockito.when(secModule.sec(-2.500000)).thenReturn(-1.248216);
//        Mockito.when(secModule.sec(-2.000000)).thenReturn(-2.402998);
//        Mockito.when(secModule.sec(-1.700000)).thenReturn(-7.761294);
//        Mockito.when(secModule.sec(-1.500000)).thenReturn(14.136833);
//        Mockito.when(secModule.sec(-0.972040)).thenReturn(1.774258);
//        Mockito.when(secModule.sec(-0.972030)).thenReturn(1.774232);
//        Mockito.when(secModule.sec(-0.972020)).thenReturn(1.774206);
//        Mockito.when(secModule.sec(-0.700000)).thenReturn(1.307459);
//        Mockito.when(secModule.sec(-0.500000)).thenReturn(1.139494);
//        Mockito.when(secModule.sec(-0.300000)).thenReturn(1.046752);
//        Mockito.when(secModule.sec(-0.000010)).thenReturn(1.000000);
//        Mockito.when(lnModule.ln(0.000010)).thenReturn(-11.512925);
//        Mockito.when(lnModule.ln(0.000264)).thenReturn(-8.239561);
//        Mockito.when(lnModule.ln(0.000518)).thenReturn(-7.565535);
//        Mockito.when(lnModule.ln(0.000528)).thenReturn(-7.546414);
//        Mockito.when(lnModule.ln(0.000538)).thenReturn(-7.527652);
//        Mockito.when(lnModule.ln(0.003602)).thenReturn(-5.626363);
//        Mockito.when(lnModule.ln(0.006675)).thenReturn(-5.009341);
//        Mockito.when(lnModule.ln(0.009749)).thenReturn(-4.630596);
//        Mockito.when(lnModule.ln(0.012813)).thenReturn(-4.357326);
//        Mockito.when(lnModule.ln(0.012823)).thenReturn(-4.356546);
//        Mockito.when(lnModule.ln(0.012833)).thenReturn(-4.355766);
//        Mockito.when(lnModule.ln(0.259617)).thenReturn(-1.348548);
//        Mockito.when(lnModule.ln(0.506411)).thenReturn(-0.680406);
//        Mockito.when(lnModule.ln(0.753206)).thenReturn(-0.283417);
//        Mockito.when(lnModule.ln(0.999990)).thenReturn(-0.000010);
//        Mockito.when(lnModule.ln(1.000010)).thenReturn(0.000010);
//        Mockito.when(lnModule.ln(20.240988)).thenReturn(3.007710);
//        Mockito.when(lnModule.ln(39.481975)).thenReturn(3.675844);
//        Mockito.when(lnModule.ln(58.722962)).thenReturn(4.072831);
//        Mockito.when(lnModule.ln(77.963940)).thenReturn(4.356246);
//        Mockito.when(lnModule.ln(77.963950)).thenReturn(4.356247);
//        Mockito.when(lnModule.ln(77.963960)).thenReturn(4.356247);
//        Mockito.when(lnModule.ln(531.402338)).thenReturn(6.275519);
//        Mockito.when(lnModule.ln(984.840727)).thenReturn(6.892480);
//        Mockito.when(lnModule.ln(1438.279116)).thenReturn(7.271203);
//        Mockito.when(lnModule.ln(1891.717494)).thenReturn(7.545240);
//        Mockito.when(lnModule.ln(1891.717504)).thenReturn(7.545240);
//        Mockito.when(lnModule.ln(1891.717514)).thenReturn(7.545240);
//        Mockito.when(lnModule.ln(3000.000000)).thenReturn(8.006368);
//        Mockito.when(log2Module.log2(0.000010)).thenReturn(-16.609640);
//        Mockito.when(log2Module.log2(0.000264)).thenReturn(-11.887174);
//        Mockito.when(log2Module.log2(0.000518)).thenReturn(-10.914760);
//        Mockito.when(log2Module.log2(0.000528)).thenReturn(-10.887174);
//        Mockito.when(log2Module.log2(0.000538)).thenReturn(-10.860106);
//        Mockito.when(log2Module.log2(0.003602)).thenReturn(-8.117126);
//        Mockito.when(log2Module.log2(0.006675)).thenReturn(-7.226952);
//        Mockito.when(log2Module.log2(0.009749)).thenReturn(-6.680537);
//        Mockito.when(log2Module.log2(0.012813)).thenReturn(-6.286293);
//        Mockito.when(log2Module.log2(0.012823)).thenReturn(-6.285167);
//        Mockito.when(log2Module.log2(0.012833)).thenReturn(-6.284043);
//        Mockito.when(log2Module.log2(0.259617)).thenReturn(-1.945544);
//        Mockito.when(log2Module.log2(0.506411)).thenReturn(-0.981618);
//        Mockito.when(log2Module.log2(0.753206)).thenReturn(-0.408884);
//        Mockito.when(log2Module.log2(0.999990)).thenReturn(-0.000014);
//        Mockito.when(log2Module.log2(1.000010)).thenReturn(0.000014);
//        Mockito.when(log2Module.log2(20.240988)).thenReturn(4.339208);
//        Mockito.when(log2Module.log2(39.481975)).thenReturn(5.303122);
//        Mockito.when(log2Module.log2(58.722962)).thenReturn(5.875853);
//        Mockito.when(log2Module.log2(77.963940)).thenReturn(6.284735);
//        Mockito.when(log2Module.log2(77.963950)).thenReturn(6.284735);
//        Mockito.when(log2Module.log2(77.963960)).thenReturn(6.284735);
//        Mockito.when(log2Module.log2(531.402338)).thenReturn(9.053661);
//        Mockito.when(log2Module.log2(984.840727)).thenReturn(9.943747);
//        Mockito.when(log2Module.log2(1438.279116)).thenReturn(10.490128);
//        Mockito.when(log2Module.log2(1891.717494)).thenReturn(10.885481);
//        Mockito.when(log2Module.log2(1891.717504)).thenReturn(10.885481);
//        Mockito.when(log2Module.log2(1891.717514)).thenReturn(10.885481);
//        Mockito.when(log2Module.log2(3000.000000)).thenReturn(11.550747);
//        Mockito.when(log10Module.log10(0.000010)).thenReturn(-5.000000);
//        Mockito.when(log10Module.log10(0.000264)).thenReturn(-3.578396);
//        Mockito.when(log10Module.log10(0.000518)).thenReturn(-3.285670);
//        Mockito.when(log10Module.log10(0.000528)).thenReturn(-3.277366);
//        Mockito.when(log10Module.log10(0.000538)).thenReturn(-3.269218);
//        Mockito.when(log10Module.log10(0.003602)).thenReturn(-2.443498);
//        Mockito.when(log10Module.log10(0.006675)).thenReturn(-2.175529);
//        Mockito.when(log10Module.log10(0.009749)).thenReturn(-2.011042);
//        Mockito.when(log10Module.log10(0.012813)).thenReturn(-1.892363);
//        Mockito.when(log10Module.log10(0.012823)).thenReturn(-1.892024);
//        Mockito.when(log10Module.log10(0.012833)).thenReturn(-1.891685);
//        Mockito.when(log10Module.log10(0.259617)).thenReturn(-0.585667);
//        Mockito.when(log10Module.log10(0.506411)).thenReturn(-0.295497);
//        Mockito.when(log10Module.log10(0.753206)).thenReturn(-0.123086);
//        Mockito.when(log10Module.log10(0.999990)).thenReturn(-0.000004);
//        Mockito.when(log10Module.log10(1.000010)).thenReturn(0.000004);
//        Mockito.when(log10Module.log10(20.240988)).thenReturn(1.306232);
//        Mockito.when(log10Module.log10(39.481975)).thenReturn(1.596399);
//        Mockito.when(log10Module.log10(58.722962)).thenReturn(1.768808);
//        Mockito.when(log10Module.log10(77.963940)).thenReturn(1.891894);
//        Mockito.when(log10Module.log10(77.963950)).thenReturn(1.891894);
//        Mockito.when(log10Module.log10(77.963960)).thenReturn(1.891894);
//        Mockito.when(log10Module.log10(531.402338)).thenReturn(2.725423);
//        Mockito.when(log10Module.log10(984.840727)).thenReturn(2.993366);
//        Mockito.when(log10Module.log10(1438.279116)).thenReturn(3.157843);
//        Mockito.when(log10Module.log10(1891.717494)).thenReturn(3.276856);
//        Mockito.when(log10Module.log10(1891.717504)).thenReturn(3.276856);
//        Mockito.when(log10Module.log10(1891.717514)).thenReturn(3.276856);
//        Mockito.when(log10Module.log10(3000.000000)).thenReturn(3.477121);

}
