public class TrigonometricFunction {

    /**
     * sec(x) != 0             => 1/cos(x) != 0            - always true
     * cot(x) + sin(x) != 0    => 1/sin(x) + sin(x) != 0   - always true
     */
    public static double trigonometricFunction(double x) throws IllegalArgumentException {
        return ((SEC.sec(x) / SEC.sec(x)) * SEC.sec(x) - SEC.sec(x)) / (CTG.ctg(x) + SIN.sin(x)) +
                (Math.pow(CSC.csc(x) + Math.pow(COS.cos(x), 2), 2));
    }
}
