import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.Math.PI;
import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        LN lnModule = new LN();
        LOG2 log2Module = new LOG2(lnModule);
        LOG10 log10Module = new LOG10(lnModule);
        LogarithmicFunction logarithmicFunctionModule = new LogarithmicFunction(lnModule, log2Module, log10Module);

        SIN sinModule = new SIN();
        COS cosModule = new COS(sinModule);
        CTG ctgModule = new CTG(sinModule, cosModule);
        CSC cscModule = new CSC(sinModule);
        SEC secModule = new SEC(cosModule);
        TrigonometricFunction trigonometricFunctionModule = new TrigonometricFunction(sinModule, cosModule, ctgModule, cscModule, secModule);

        MainFunction mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);

        try (PrintWriter writer = new PrintWriter(new File("./out/table.csv"))) {
            StringBuilder sb = new StringBuilder("x,sin,cos,ctg,csc,sec,trig_f,ln,log2,log10,logarithm,main\n");
            double x0 = -10,
                    xN = 10,
                    step = 1;
            boolean flag;
            for (double x = x0; x <= xN; x += step) {
                sb.append(x).append(",");
                flag = true;
                sb.append(sinModule.sin(x)).append(",");
                sb.append(cosModule.cos(x)).append(",");

                if (abs(x % (0.5 * PI)) < 10E-8) { // no ctg, csc where */sin(x) => x!= Pi/2+k*Pi
                    sb.append(",,");
                    flag = false;
                } else {
                    sb.append(ctgModule.ctg(x)).append(",");
                    sb.append(cscModule.csc(x)).append(",");
                }
                if (abs(x % PI) < 10E-8) {
                    sb.append(",");
                    flag = false;
                } else {
                    sb.append(secModule.sec(x)).append(",");
                }
                if (flag) {
                    sb.append(trigonometricFunctionModule.trigonometricFunction(x)).append(",");
                } else {
                    sb.append(",");
                }

                if (x > 0 && x != 1) {
                    sb.append(lnModule.ln(x)).append(",");
                    sb.append(log2Module.log2(x)).append(",");
                    sb.append(log10Module.log10(x)).append(",");
                    sb.append(logarithmicFunctionModule.logarithmicFunction(x)).append(",");
                } else {
                    sb.append(",,,,");
                }
                if (x > 0 && x != 1 || x <= 0 && flag) {
                    sb.append(mainFunction.function(x));
                }
                sb.append("\n");
            }
            writer.write(sb.toString());
            System.out.println("file 'table.csv is ready'");
        } catch (FileNotFoundException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
