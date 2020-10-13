import static java.lang.Math.*;

public class SIN {
    private static final double eps = 0.1;

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
        if (abs(diff) > eps) {
            sin_f(x, diff * (-x * x / (2.0 * n * (2.0 * n + 1.0))), res + diff, n + 1);
        }
        return res;
    }

    public double sin(double x) { // D(x)=(-inf; +inf), E(x) = [-1;1]
        x = x % (2 * PI);
        return sin_f(x, x, 0, 1);
    }
}
