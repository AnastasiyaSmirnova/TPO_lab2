import static java.lang.Math.*;

public class Work {
    public final static double eps = 10E-6;
    static int c = 0;

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

    public static void left() {
        System.out.println(eps);
        double min = -0.97202961;
        double[] x = {-3.0, -2.5, -2, -1.7, -1.5, min - eps, min, min + eps, 0.1, 0.3, 0.5, -eps};
        for (double v : x) {
            c++;
            System.out.println("x= " + v + ";y= " + f1(v));
        }
    }

    public static void right() {
        double eX = 0.000528,
                bX = 0.0128226,
                cX = 77.96395,
                dX = 1891.717504;
        double[] x = {eps, eX / 2, eX - eps, eX, eX + eps,
                bX - eps, bX, bX + eps,
                1 - eps, 1 + eps,
                cX - eps, cX, cX + eps,
                dX - eps, dX, dX + eps, 3000
        };
        for (double v : x) {
            c++;
            System.out.println("x= " + v + ";\ty= " + f2(v));
        }
    }

    public static void main(String[] args) throws IllegalArgumentException {
        // negative - trigonom
        left();
        System.out.println();
        // positive - log
        right();
        System.out.println(c);

    }

}
