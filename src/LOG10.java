public class LOG10 {

    public static double log10(double x) throws IllegalArgumentException {
        return LN.ln(x) / LN.ln(10);
    }
}
