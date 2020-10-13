public class LOG2 {
    private LN lnModule;

    public LOG2(LN lnModule) {
        this.lnModule = lnModule;
    }

    public double log2(double x) throws IllegalArgumentException {
        return lnModule.ln(x) / lnModule.ln(2);
    }
}
