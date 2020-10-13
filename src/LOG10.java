public class LOG10 {
    private LN lnModule;

    public LOG10(LN lnModule) {
        this.lnModule = lnModule;
    }

    public double log10(double x) throws IllegalArgumentException {
        return lnModule.ln(x) / lnModule.ln(10);
    }
}
