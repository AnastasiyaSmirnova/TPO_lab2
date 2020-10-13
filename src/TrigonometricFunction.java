public class TrigonometricFunction {
    private SIN sinModule;
    private COS cosModule;
    private CTG ctgModule;
    private CSC cscModule;
    private SEC secModule;

    public TrigonometricFunction(SIN sinModule, COS cosModule, CTG ctgModule, CSC cscModule, SEC secModule) {
        this.sinModule = sinModule;
        this.cosModule = cosModule;
        this.ctgModule = ctgModule;
        this.cscModule = cscModule;
        this.secModule = secModule;
    }

    /**
     * sec(x) != 0             => 1/cos(x) != 0            - always true
     * cot(x) + sin(x) != 0    => 1/sin(x) + sin(x) != 0   - always true
     */
    public double trigonometricFunction(double x) throws IllegalArgumentException {
        return ((secModule.sec(x) / secModule.sec(x)) * secModule.sec(x) - secModule.sec(x)) / (ctgModule.ctg(x) + sinModule.sin(x)) +
                (Math.pow(cscModule.csc(x) + cosModule.cos(x), 2));
    }
}
