public class MainFunction {
    public static double function(double x) throws IllegalArgumentException {
        return x <= 0 ? TrigonometricFunction.trigonometricFunction(x) : LogarithmicFunction.logarithmicFunction(x);
    }
}
