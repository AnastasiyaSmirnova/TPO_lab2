import static java.lang.Math.*;

public class SIN {
    private static final double eps = 10E-4;

    private static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    /**
     * sin (Tailor)
     * cos -> sin
     * ctg -> sin, cos
     * csc -> sin
     * sec -> cos
     */
    private static double sin_f(double x, double diff, double res, int n) {
        return abs(diff) < eps ? res : sin_f(x, diff * (-x * x / (2.0 * n * (2.0 * n + 1.0))), res + diff, n + 1);
    }

//    private static double sin_f(double x, double res, int n, int flag) {
//        double diff = flag * pow(x, n) * pow(factorial(n), -1);
//        return abs(diff) < eps ? res + diff : sin_f(x, res + diff, n + 1, -flag);
//    }

    public double sin(double x) { // D(x)=(-inf; +inf), E(x) = [-1;1]
        if (abs(x % PI) < eps) return 0;
        if (abs(x % (1.5 * PI)) < eps) return -1;
        if (abs(x % (0.5 * PI)) < eps) return 1;
//        return sin_f(x % (2 * PI), 0, 1, 1);
        double x1 = x % (2 * PI);
        return sin_f(x1, x1, 0.0, 1);
    }
}
