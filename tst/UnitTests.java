import static java.lang.Math.PI;

public class UnitTests {
    public static void main(String[] args) {
        SIN sinModule = new SIN();
//        for (double x = -2 * Math.PI; x <= 2 * Math.PI; x += 0.2 * Math.PI) {

        double x = -3.0 - 3 * PI;
        double f = sinModule.sin(x);
        System.out.println(x + " => " + (Math.abs(f - Math.sin(x)) < 10E-2) + " " + f + " VS " + Math.sin(x));
//        }
    }
}
