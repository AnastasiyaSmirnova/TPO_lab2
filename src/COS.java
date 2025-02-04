import static java.lang.Math.*;

public class COS {
    private SIN sinModule;

    public COS(SIN sinModule) {
        this.sinModule = sinModule;
    }

    public double cos(double x) {  // D(x)=(-inf; +inf), E(x) = [-1;1]
        x = x % (2 * PI); // (-2Pi; 2Pi) => (-2Pi; -3Pi/2] U [-Pi/2; Pi/2] U [3Pi/2; 2Pi)
        double sign = (x >= -1 * PI / 2 && x <= PI / 2) ||
                (x > -2 * PI && x <= -3 * PI / 2) ||
                (x >= 3 * PI / 2 && x < 2 * PI)
                ? 1 : -1;
        double sin = sinModule.sin(x);
        double sin2 = sin * sin;
        sin2 = 1 - sin2;
        double sqrt = sqrt(sin2);
        return sqrt(abs(1 - sin * sin)) * sign;
    }
}
