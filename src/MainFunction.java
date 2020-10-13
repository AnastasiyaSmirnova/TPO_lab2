public class MainFunction {
    private TrigonometricFunction trigonometricFunctionModule;
    private LogarithmicFunction logarithmicFunctionModule;

    public MainFunction(TrigonometricFunction trigonometricFunctionModule, LogarithmicFunction logarithmicFunctionModule) {
        this.trigonometricFunctionModule = trigonometricFunctionModule;
        this.logarithmicFunctionModule = logarithmicFunctionModule;
    }

    public double function(double x) throws IllegalArgumentException {
        return x <= 0 ? trigonometricFunctionModule.trigonometricFunction(x) : logarithmicFunctionModule.logarithmicFunction(x);
    }
}
