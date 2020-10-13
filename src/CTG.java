import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class CTG {
    private SIN sinModule;
    private COS cosModule;

    public CTG(SIN sin, COS cos) {
        this.sinModule = sin;
        this.cosModule = cos;
    }

    public double ctg(double x) throws IllegalArgumentException {
        if (abs(x % (0.5 * PI)) < 10E-8) { // x !=  PI/2 +/- PI*k
            throw new IllegalArgumentException("ctg",x);
        }
        return cosModule.cos(x) / sinModule.sin(x);
    }
}
