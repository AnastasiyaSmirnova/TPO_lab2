public class CTG {
    public static double ctg(double x) throws IllegalArgumentException {
        if ((Math.abs(x % 2 * Math.PI) - Math.PI / 2) < 10E-3) {
            throw new IllegalArgumentException("ctg");
        }
        return COS.cos(x) / SIN.sin(x);
    }
}
