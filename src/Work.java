import java.text.DecimalFormat;

import static java.lang.Math.*;

public class Work {
    public final static double eps = 10E-6;
    static int c = 0;
    static StringBuilder sb;


    static double min = -0.97202961;
    static double[] trig_x = {-3.0, -2.5, -2, -1.7, -1.5, min - eps, min, min + eps, -0.7, -0.5, -0.3, -eps};

    static double eX = 0.000528,
            bX = 0.0128226,
            cX = 77.96395,
            dX = 1891.717504;
    static double[] log_x = {
            eps,
            eX / 2, // one point between A and E
            eX - eps, eX, eX + eps,
            getPoints(eX, bX, 1), getPoints(eX, bX, 2), getPoints(eX, bX, 3),
            bX - eps, bX, bX + eps,
            getPoints(bX, 1, 1), getPoints(bX, 1, 2), getPoints(bX, 1, 3),
            1 - eps, 1 + eps,
            getPoints(1, cX, 1), getPoints(1, cX, 2), getPoints(1, cX, 3),
            cX - eps, cX, cX + eps,
            getPoints(cX, dX, 1), getPoints(cX, dX, 2), getPoints(cX, dX, 3),
            dX - eps, dX,
            dX + eps, 3000
    };


    public static double f1(double x) {
        return pow((Math.cos(x) + 1 / Math.sin(x)), 2);
    }

    public static double log2(double x) {
        return log(x) / log(2);
    }

    public static double f2(double x) {
        return pow(
                pow(log10(x), 4) / (log10(x) - log2(x)) + log2(x) - (log10(x) - log(x)),
                3);
    }

    private static void print(String name, double x, double f) {
        DecimalFormat df = new DecimalFormat("");
        String fx = String.format("%.6f", x);
        String ff = String.format("%.6f", f);
        System.out.println("Mockito.when(" + name + "(" + fx + ")).thenReturn(" + ff + ");");
    }

    public static void left() {

//        System.out.println("HashMap<Double, Double> trignom = new HashMap<Double, Double>();");
//        sb.append("{\"trig_f\":{\n");
        for (double v : trig_x) {
            c++;
            print("trigonometricFunctionModule.trigonometricFunction", v, f1(v));
//            System.out.println("trignom.put(" + v + "," + f1(v) + ");");
//            sb.append("\"").append(v).append("\":").append(f1(v)).append(",\n");
        }
//        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "},\n");
    }

    public static double getPoints(double start, double end, double n) {
        return start + (end - start) / 4 * n;
    }

    public static void right() {
//        System.out.println("HashMap<Double, Double> logarithm = new HashMap<Double, Double>();");
//        sb.append("\"log_f\":{\n");
        for (double v : log_x) {
            c++;
            print("logarithmicFunctionModule.logarithmicFunction", v, f2(v));
//            sb.append("\"").append(v).append("\":").append(f2(v)).append(",\n");
        }
//        sb.replace(sb.lastIndexOf(","), sb.lastIndexOf(",") + 1, "}}");
    }

    public static void sin() {
//        System.out.println("HashMap<Double, Double> sin = new HashMap<Double, Double>();");
        for (double v : trig_x) {
            print("sinModule.sin", v, Math.sin(v));
        }
    }

    public static void cos() {
//        System.out.println("HashMap<Double, Double> cos = new HashMap<Double, Double>();");
        for (double v : trig_x) {
            print("cosModule.cos", v, Math.cos(v));
        }
    }

    public static void ctg() {
//        System.out.println("HashMap<Double, Double> ctg = new HashMap<Double, Double>();");
        for (double v : trig_x) {
            print("ctgModule.ctg", v, Math.cos(v) / Math.sin(v));
        }
    }

    public static void csc() {
//        System.out.println("HashMap<Double, Double> csc = new HashMap<Double, Double>();");
        for (double v : trig_x) {
            print("cscModule.csc", v, 1 / Math.sin(v));
        }
    }

    public static void sec() {
//        System.out.println("HashMap<Double, Double> sec = new HashMap<Double, Double>();");
        for (double v : trig_x) {
            print("secModule.sec", v, 1 / Math.cos(v));
//            System.out.println("sec.put(" + v + "," + 1 / Math.cos(v) + ");");
        }
    }

    public static void ln() {
//        System.out.println("HashMap<Double, Double> ln = new HashMap<Double, Double>();");
        for (double v : log_x) {
//            todo: fix 1/log(v)
            print("lnModule.ln", v, Math.log(v));
//            System.out.println("log.put(" + v + "," + 1 / log(v) + ");");
        }
    }

    public static void log_10() {
//        System.out.println("HashMap<Double, Double> log10 = new HashMap<Double, Double>();");
        for (double v : log_x) {
            print("log10Module.log10", v, Math.log10(v));
//            System.out.println("log10.put(" + v + "," + 1 / log10(v) + ");");
        }
    }

    public static void log_2() {
//        System.out.println("HashMap<Double, Double> log2 = new HashMap<Double, Double>();");
        for (double v : log_x) {
            print("log2Module.log2", v, log2(v));
//            System.out.println("log2.put(" + v + "," + log2(v) + ");");
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        System.out.println(eps);
//        sb = new StringBuilder();

        left();
        right();
        sin();
        cos();
        ctg();
        csc();
        sec();

        ln();
        log_2();
        log_10();

//        System.out.println(sb.toString());
    }

}
