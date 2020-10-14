import java.util.Arrays;
import java.util.HashMap;

import static java.lang.Math.*;

public class MapValues {
    //todo: remote unused
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

}
