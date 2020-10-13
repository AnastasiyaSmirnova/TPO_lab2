public class SEC {
    private COS cosModule;

    public SEC(COS cosModule) {
        this.cosModule = cosModule;
    }

    public double sec(double x) throws IllegalArgumentException {
        if (Math.abs(x % Math.PI) < 10E-8) {
            throw new IllegalArgumentException("sec");
        }
        return 1 / cosModule.cos(x);
    }
}
