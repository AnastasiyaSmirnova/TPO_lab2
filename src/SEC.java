public class SEC {
    public static double sec(double x) throws IllegalArgumentException {
        if ((Math.abs(x % Math.PI) - 0) < 10E-3) {
            throw new IllegalArgumentException("sec");
        }
        return 1 / COS.cos(x);
    }
}
