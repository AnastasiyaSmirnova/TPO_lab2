import javax.swing.text.TabableView;

import static java.lang.Math.*;

public class SIN {
    private static final double eps = 10E-6;

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
     * cot -> sin, cos
     * csc -> sin
     * sec -> cos
     */
    public static double sin(double x) { // D(x)=(-inf; +inf), E(x) = [-1;1]
        x = x % (2 * PI);
        double res = 0,
                prevRes;
        int n = 0;
        do {
            prevRes = res;
            res += pow(-1, n) * pow(x, 2 * n + 1) * pow(factorial(2 * n + 1), -1);
            n++;
        } while (Double.isFinite(res) && abs(res - prevRes) > eps);
        return Double.isFinite(res) ? res : prevRes;
    }
}
