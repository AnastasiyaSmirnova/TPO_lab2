import javax.jnlp.DownloadService;

import static java.lang.Math.*;

public class BasicFunctions {
    private static final double eps = 10E-6;

    public BasicFunctions() {
    }

    public int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        return f;
    }

    public double sin(double x) {
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
