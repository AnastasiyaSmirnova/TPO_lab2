import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class CSC {
    private SIN sinModule;

    public CSC(SIN sinModule) {
        this.sinModule = sinModule;
    }

    public double csc(double x) throws IllegalArgumentException {
        if ((abs(x % 2 * PI) - PI / 2) < 10E-3) { // x !=  PI/2 +/- PI*k
            throw new IllegalArgumentException("csc");
        }
        return 1 / sinModule.sin(x);
    }
}
