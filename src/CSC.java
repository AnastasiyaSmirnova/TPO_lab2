import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class CSC {

    public static double csc(double x) throws IllegalArgumentException {
        if ((abs(x % 2 * PI) - PI / 2) < 10E-3) {
            throw new IllegalArgumentException("csc");
        }
        return 1 / SIN.sin(x);
    }
}
