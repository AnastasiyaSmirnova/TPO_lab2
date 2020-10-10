import static java.lang.Math.PI;
import static java.lang.Math.sqrt;

public class COS {
    public static double cos(double x) {  // D(x)=(-inf; +inf), E(x) = [-1;1]
        x = x % (2 * PI); // (-2Pi; 2Pi) => (-2Pi; -3Pi/2] U [-Pi/2; Pi/2] U [3Pi/2; 2Pi)
        double sign = (x >= -1 * PI / 2 && x <= PI / 2) ||
                (x > -2 * PI && x <= -3 * PI / 2) ||
                (x >= 3 * PI / 2 && x < 2 * PI)
                ? 1 : -1;
        return sqrt(1 - SIN.sin(x) * SIN.sin(x)) * sign;
    }
}
