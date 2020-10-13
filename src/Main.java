import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        try (PrintWriter writer = new PrintWriter(new File("test.csv"))) {

            String sb = "id," +
                    ',' +
                    "Name" +
                    '\n' +
                    "1" +
                    ',' +
                    "Prashant Ghimire" +
                    '\n';
            writer.write(sb);

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
//    public static void main(String[] args) {
//        LN lnModule = new LN();
//        LOG2 log2Module = new LOG2(lnModule);
//        LOG10 log10Module = new LOG10(lnModule);
//        LogarithmicFunction logarithmicFunctionModule = new LogarithmicFunction(lnModule, log2Module, log10Module);
//
//        SIN sinModule = new SIN();
//        COS cosModule = new COS(sinModule);
//        CTG ctgModule = new CTG(sinModule, cosModule);
//        CSC cscModule = new CSC(sinModule);
//        SEC secModule = new SEC(cosModule);
//        TrigonometricFunction trigonometricFunctionModule = new TrigonometricFunction(sinModule, cosModule, ctgModule, cscModule, secModule);
//
//        MainFunction mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);
//
//        double startX = -1000,
//                endX = 1000,
//                step = 100;
//        PrintWriter writer = null;
//        StringBuilder sb = null;
//        try {
//            writer = new PrintWriter(new File("./out/test.csv"));
//            writer.write("hello");
////            sb = new StringBuilder("sin;cos;ctg;csc;sec;trigonom;;ln;log2;log10;logarithm;;main\n");
////            for (double i = startX; i <= endX; i += step) {
////                sb.append(sinModule.sin(i)).append(";");
//////                sb.append(cosModule.cos(i)).append(";");
//////                sb.append(ctgModule.ctg(i)).append(";");
//////                sb.append(secModule.sec(i)).append(";");
//////                sb.append(cscModule.csc(i)).append(";");
//////                sb.append(trigonometricFunctionModule.trigonometricFunction(i)).append(";");
//////                sb.append(";");
//////                if (i > 0 && i != 1) {
//////                    sb.append(lnModule.ln(i)).append(";");
//////                    sb.append(log2Module.log2(i)).append(";");
//////                    sb.append(log10Module.log10(i)).append(";");
//////                    sb.append(logarithmicFunctionModule.logarithmicFunction(i));
//////                    sb.append(";");
//////                }
//////                sb.append(mainFunction.function(i)).append("\n");
////            }
////            writer.write(sb.toString());
////            System.out.println("file is ready");
//        } catch (FileNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//    }
}
