public class LOG10 {
    private LN lnModule;

    public LOG10(LN lnModule) {
        this.lnModule = lnModule;
    }

    public double log10(double x) throws IllegalArgumentException {
        return lnModule.ln(x) * Math.pow(lnModule.ln(10), -1);
    }
}
