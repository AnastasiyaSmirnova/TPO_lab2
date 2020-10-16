import java.util.HashMap;

import static java.lang.Math.*;

public class MapValues {
    private static final double eps = 10E-7;

    public static HashMap<String, Double> rightPoints = new HashMap<>();
    public static HashMap<String, Double> leftPoints = new HashMap<>();

    public static void fillAllData() {
        fillLeftPoints();
        fillRightPoints();
    }

    private static void fillLeftPoints() {
        double min = -0.972029;
        leftPoints.put("a", -3.0);
        leftPoints.put("b", -2.5);
        leftPoints.put("c", -2.0);
        leftPoints.put("d", -1.7);
        leftPoints.put("e", -1.5);
        leftPoints.put("o1", min - eps);
        leftPoints.put("o", min);
        leftPoints.put("o2", min + eps);
        leftPoints.put("f", -0.7);
        leftPoints.put("g", -0.5);
        leftPoints.put("h", -0.3);
        leftPoints.put("i", -eps);

        leftPoints.put("a_PI", -3.0 - PI);
        leftPoints.put("b_PI", -2.5 - PI);
        leftPoints.put("c_PI", -2.0 - PI);
        leftPoints.put("d_PI", -1.7 - PI);
        leftPoints.put("e_PI", -1.5 - PI);
        leftPoints.put("o1_PI", min - eps - PI);
        leftPoints.put("o_PI", min - PI);
        leftPoints.put("o2_PI", min + eps - PI);
        leftPoints.put("f_PI", -0.7 - PI);
        leftPoints.put("g_PI", -0.5 - PI);
        leftPoints.put("h_PI", -0.3 - PI);
        leftPoints.put("i_PI", -eps - PI);

        leftPoints.put("a_3PI", -3.0 - 3 * PI);
        leftPoints.put("b_3PI", -2.5 - 3 * PI);
        leftPoints.put("c_3PI", -2.0 - 3 * PI);
        leftPoints.put("d_3PI", -1.7 - 3 * PI);
        leftPoints.put("e_3PI", -1.5 - 3 * PI);
        leftPoints.put("o1_3PI", min - eps - 3 * PI);
        leftPoints.put("o_3PI", min - 3 * PI);
        leftPoints.put("o2_3PI", min + eps - 3 * PI);
        leftPoints.put("f_3PI", -0.7 - 3 * PI);
        leftPoints.put("g_3PI", -0.5 - 3 * PI);
        leftPoints.put("h_3PI", -0.3 - 3 * PI);
        leftPoints.put("i_3PI", -eps - 3 * PI);

        leftPoints.put("a_4PI", -3.0 - 4 * PI);
        leftPoints.put("b_4PI", -2.5 - 4 * PI);
        leftPoints.put("c_4PI", -2.0 - 4 * PI);
        leftPoints.put("d_4PI", -1.7 - 4 * PI);
        leftPoints.put("e_4PI", -1.5 - 4 * PI);
        leftPoints.put("o1_4PI", min - eps - 4 * PI);
        leftPoints.put("o_4PI", min - 4 * PI);
        leftPoints.put("o2_4PI", min + eps - 4 * PI);
        leftPoints.put("f_4PI", -0.7 - 4 * PI);
        leftPoints.put("g_4PI", -0.5 - 4 * PI);
        leftPoints.put("h_4PI", -0.3 - 4 * PI);
        leftPoints.put("i_4PI", -eps - 4 * PI);

        leftPoints.put("_0.5PI", -0.5 * PI);
        leftPoints.put("_PI", -PI);
    }

    public static double getPointsBetweenTwo(double start, double end, double n) {
        return start + (end - start) / 4 * n;
    }

    private static void fillRightPoints() {
        double eX = 0.000528,
                bX = 0.0128226,
                oX = 1.0,
                cX = 77.96395,
                dX = 1891.717504;

        rightPoints.put("a", eps);
        rightPoints.put("ae", eps / 2);

        rightPoints.put("e", eX);
        rightPoints.put("e1", eX - eps);
        rightPoints.put("e2", eX + eps);

        rightPoints.put("eb1", getPointsBetweenTwo(eX, bX, 1));
        rightPoints.put("eb2", getPointsBetweenTwo(eX, bX, 2));
        rightPoints.put("eb3", getPointsBetweenTwo(eX, bX, 3));

        rightPoints.put("b", bX);
        rightPoints.put("b1", bX - eps);
        rightPoints.put("b2", bX + eps);

        rightPoints.put("bo1", getPointsBetweenTwo(bX, oX, 1));
        rightPoints.put("bo2", getPointsBetweenTwo(bX, oX, 2));
        rightPoints.put("bo3", getPointsBetweenTwo(bX, oX, 3));

        rightPoints.put("o1", oX - eps);
        rightPoints.put("o", oX); // incorrect value -> expected exception
        rightPoints.put("o2", oX + eps);

        rightPoints.put("oc1", getPointsBetweenTwo(oX, cX, 1));
        rightPoints.put("oc2", getPointsBetweenTwo(oX, cX, 2));
        rightPoints.put("oc3", getPointsBetweenTwo(oX, cX, 3));

        rightPoints.put("c", cX);
        rightPoints.put("c1", cX - eps);
        rightPoints.put("c2", cX + eps);

        rightPoints.put("cd1", getPointsBetweenTwo(cX, dX, 1));
        rightPoints.put("cd2", getPointsBetweenTwo(cX, dX, 2));
        rightPoints.put("cd3", getPointsBetweenTwo(cX, dX, 3));

        rightPoints.put("d", dX);
        rightPoints.put("d1", dX - eps);
        rightPoints.put("d2", dX + eps);

        rightPoints.put("di", 3000.0);
    }
}
