public class LogarithmicFunction {
    private LN lnModule;
    private LOG2 log2Module;
    private LOG10 log10Module;

    public LogarithmicFunction(LN lnModule, LOG2 log2Module, LOG10 log10Module) {
        this.lnModule = lnModule;
        this.log2Module = log2Module;
        this.log10Module = log10Module;
    }

    /**
     * x != 1, x > 0
     * log10(x) - log2(x) != 0 - always true
     */
    public double logarithmicFunction(double x) throws IllegalArgumentException {
        return Math.pow(
                (Math.pow(Math.pow(log10Module.log10(x), 2), 2) / (log10Module.log10(x) - log2Module.log2(x))) +
                        (log2Module.log2(x) - (log10Module.log10(x) - lnModule.ln(x)))
                , 3);
    }
}
