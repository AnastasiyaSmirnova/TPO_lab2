public class LogarithmicFunction {
    /**
     * x != 1, x > 0
     * log10(x) - log2(x) != 0 - always true
     */
    public static double logarithmicFunction(double x) throws IllegalArgumentException {
        return Math.pow(
                Math.pow(Math.pow(LN.ln(x), 2), 2) / (LOG10.log10(x) - LOG2.log2(x)) +
                        (LOG2.log2(x) - (LOG10.log10(x) - LN.ln(x)))
                , 3);
    }
}
