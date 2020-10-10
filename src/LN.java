import static java.lang.Math.*;

public class LN {
    private static final double eps = 10E-6;

    /**
     * ln (Tailor)
     * log2 -> ln
     * log10 -> ln
     */
    public static double ln(double x) throws IllegalArgumentException {
        if (x <= 0 || x == 1) {
            throw new IllegalArgumentException("ln");
        }
        double res = 0,
                prevRes;
        int n = 1;
        do {
            prevRes = res;
            res += 2 * pow((x - 1) / (x + 1), n) / n;
            n += 2;
        } while (abs(res - prevRes) > eps);
        return res;
    }


}
