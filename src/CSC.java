import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class CSC {
    private SIN sinModule;

    public CSC(SIN sinModule) {
        this.sinModule = sinModule;
    }

    public double csc(double x) throws IllegalArgumentException {
        if (abs(x % (0.5 * PI)) < 10E-8) { // x !=  PI/2 +/- PI*k
            throw new IllegalArgumentException("csc");
        }
        return 1 / sinModule.sin(x);
    }
}
