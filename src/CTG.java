public class CTG {
    private SIN sinModule;
    private COS cosModule;

    public CTG(SIN sin, COS cos) {
        this.sinModule = sin;
        this.cosModule = cos;
    }

    public double ctg(double x) throws IllegalArgumentException {
        if ((Math.abs(x % 2 * Math.PI) - Math.PI / 2) < 10E-3) {
            throw new IllegalArgumentException("ctg");
        }
        return cosModule.cos(x) / sinModule.sin(x);
    }
}
