import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;

public class SecondLevelTests_LEFT {
    private static final double eps = 10E-5;
    private static MainFunction mainFunction;

    @BeforeClass
    public static void initStubs() throws IllegalArgumentException {
        SIN sinModule = Mockito.mock(SIN.class);
        COS cosModule = Mockito.mock(COS.class);
        CTG ctgModule = Mockito.mock(CTG.class);
        CSC cscModule = Mockito.mock(CSC.class);
        SEC secModule = Mockito.mock(SEC.class);

        MapValues.fillAllData();
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("_0.5PI"))).thenReturn(-1.000000);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a"))).thenReturn(-0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_3PI"))).thenReturn(0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_4PI"))).thenReturn(-0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("a_PI"))).thenReturn(0.141120);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b"))).thenReturn(-0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_3PI"))).thenReturn(0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_4PI"))).thenReturn(-0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("b_PI"))).thenReturn(0.598472);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c"))).thenReturn(-0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_3PI"))).thenReturn(0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_4PI"))).thenReturn(-0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("c_PI"))).thenReturn(0.909297);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d"))).thenReturn(-0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_3PI"))).thenReturn(0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_4PI"))).thenReturn(-0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("d_PI"))).thenReturn(0.991665);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e"))).thenReturn(-0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_3PI"))).thenReturn(0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_4PI"))).thenReturn(-0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("e_PI"))).thenReturn(0.997495);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f"))).thenReturn(-0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_3PI"))).thenReturn(0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_4PI"))).thenReturn(-0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("f_PI"))).thenReturn(0.644218);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g"))).thenReturn(-0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_3PI"))).thenReturn(0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_4PI"))).thenReturn(-0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("g_PI"))).thenReturn(0.479426);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h"))).thenReturn(-0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_3PI"))).thenReturn(0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_4PI"))).thenReturn(-0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("h_PI"))).thenReturn(0.295520);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i"))).thenReturn(-0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_3PI"))).thenReturn(0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_4PI"))).thenReturn(-0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("i_PI"))).thenReturn(0.000001);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o"))).thenReturn(-0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1"))).thenReturn(-0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_3PI"))).thenReturn(0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_4PI"))).thenReturn(-0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o1_PI"))).thenReturn(0.826032);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2"))).thenReturn(-0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_3PI"))).thenReturn(0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_4PI"))).thenReturn(-0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o2_PI"))).thenReturn(0.826030);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_3PI"))).thenReturn(0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_4PI"))).thenReturn(-0.826031);
        Mockito.when(sinModule.sin(MapValues.leftPoints.get("o_PI"))).thenReturn(0.826031);

        Mockito.when(cosModule.cos(MapValues.leftPoints.get("_0.5PI"))).thenReturn(0.000000);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("a"))).thenReturn(-0.989992);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("a_3PI"))).thenReturn(0.989992);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("a_4PI"))).thenReturn(-0.989992);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("a_PI"))).thenReturn(0.989992);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("b"))).thenReturn(-0.801144);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("b_3PI"))).thenReturn(0.801144);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("b_4PI"))).thenReturn(-0.801144);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("b_PI"))).thenReturn(0.801144);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("c"))).thenReturn(-0.416147);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("c_3PI"))).thenReturn(0.416147);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("c_4PI"))).thenReturn(-0.416147);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("c_PI"))).thenReturn(0.416147);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("d"))).thenReturn(-0.128844);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("d_3PI"))).thenReturn(0.128844);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("d_4PI"))).thenReturn(-0.128844);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("d_PI"))).thenReturn(0.128844);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("e"))).thenReturn(0.070737);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("e_3PI"))).thenReturn(-0.070737);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("e_4PI"))).thenReturn(0.070737);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("e_PI"))).thenReturn(-0.070737);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("f"))).thenReturn(0.764842);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("f_3PI"))).thenReturn(-0.764842);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("f_4PI"))).thenReturn(0.764842);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("f_PI"))).thenReturn(-0.764842);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("g"))).thenReturn(0.877583);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("g_3PI"))).thenReturn(-0.877583);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("g_4PI"))).thenReturn(0.877583);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("g_PI"))).thenReturn(-0.877583);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("h"))).thenReturn(0.955336);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("h_3PI"))).thenReturn(-0.955336);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("h_4PI"))).thenReturn(0.955336);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("h_PI"))).thenReturn(-0.955336);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("i"))).thenReturn(1.000000);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("i_3PI"))).thenReturn(-1.000000);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("i_4PI"))).thenReturn(1.000000);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("i_PI"))).thenReturn(-1.000000);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o"))).thenReturn(0.563625);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o1"))).thenReturn(0.563624);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o1_3PI"))).thenReturn(-0.563624);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o1_4PI"))).thenReturn(0.563624);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o1_PI"))).thenReturn(-0.563624);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o2"))).thenReturn(0.563626);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o2_3PI"))).thenReturn(-0.563626);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o2_4PI"))).thenReturn(0.563626);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o2_PI"))).thenReturn(-0.563626);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o_3PI"))).thenReturn(-0.563625);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o_4PI"))).thenReturn(0.563625);
        Mockito.when(cosModule.cos(MapValues.leftPoints.get("o_PI"))).thenReturn(-0.563625);

        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("a"))).thenReturn(7.015253);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("a_3PI"))).thenReturn(7.015253);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("a_4PI"))).thenReturn(7.015253);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("a_PI"))).thenReturn(7.015253);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("b"))).thenReturn(1.338648);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("b_3PI"))).thenReturn(1.338648);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("b_4PI"))).thenReturn(1.338648);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("b_PI"))).thenReturn(1.338648);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("c"))).thenReturn(0.457658);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("c_3PI"))).thenReturn(0.457658);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("c_4PI"))).thenReturn(0.457658);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("c_PI"))).thenReturn(0.457658);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("d"))).thenReturn(0.129927);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("d_3PI"))).thenReturn(0.129927);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("d_4PI"))).thenReturn(0.129927);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("d_PI"))).thenReturn(0.129927);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("e"))).thenReturn(-0.070915);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("e_3PI"))).thenReturn(-0.070915);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("e_4PI"))).thenReturn(-0.070915);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("e_PI"))).thenReturn(-0.070915);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("f"))).thenReturn(-1.187242);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("f_3PI"))).thenReturn(-1.187242);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("f_4PI"))).thenReturn(-1.187242);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("f_PI"))).thenReturn(-1.187242);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("g"))).thenReturn(-1.830488);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("g_3PI"))).thenReturn(-1.830488);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("g_4PI"))).thenReturn(-1.830488);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("g_PI"))).thenReturn(-1.830488);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("h"))).thenReturn(-3.232728);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("h_3PI"))).thenReturn(-3.232728);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("h_4PI"))).thenReturn(-3.232728);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("h_PI"))).thenReturn(-3.232728);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("i"))).thenReturn(-1000000.000000);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("i_3PI"))).thenReturn(-1000000.001115);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("i_4PI"))).thenReturn(-1000000.001238);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("i_PI"))).thenReturn(-999999.999982);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o"))).thenReturn(-0.682329);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o1"))).thenReturn(-0.682327);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o1_3PI"))).thenReturn(-0.682327);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o1_4PI"))).thenReturn(-0.682327);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o1_PI"))).thenReturn(-0.682327);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o2"))).thenReturn(-0.682330);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o2_3PI"))).thenReturn(-0.682330);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o2_4PI"))).thenReturn(-0.682330);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o2_PI"))).thenReturn(-0.682330);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o_3PI"))).thenReturn(-0.682329);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o_4PI"))).thenReturn(-0.682329);
        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("o_PI"))).thenReturn(-0.682329);

        Mockito.when(secModule.sec(MapValues.leftPoints.get("_0.5PI"))).thenReturn(16331239353195370.000000);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("a"))).thenReturn(-1.010109);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("a_3PI"))).thenReturn(1.010109);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("a_4PI"))).thenReturn(-1.010109);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("a_PI"))).thenReturn(1.010109);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("b"))).thenReturn(-1.248216);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("b_3PI"))).thenReturn(1.248216);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("b_4PI"))).thenReturn(-1.248216);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("b_PI"))).thenReturn(1.248216);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("c"))).thenReturn(-2.402998);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("c_3PI"))).thenReturn(2.402998);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("c_4PI"))).thenReturn(-2.402998);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("c_PI"))).thenReturn(2.402998);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("d"))).thenReturn(-7.761294);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("d_3PI"))).thenReturn(7.761294);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("d_4PI"))).thenReturn(-7.761294);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("d_PI"))).thenReturn(7.761294);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("e"))).thenReturn(14.136833);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("e_3PI"))).thenReturn(-14.136833);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("e_4PI"))).thenReturn(14.136833);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("e_PI"))).thenReturn(-14.136833);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("f"))).thenReturn(1.307459);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("f_3PI"))).thenReturn(-1.307459);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("f_4PI"))).thenReturn(1.307459);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("f_PI"))).thenReturn(-1.307459);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("g"))).thenReturn(1.139494);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("g_3PI"))).thenReturn(-1.139494);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("g_4PI"))).thenReturn(1.139494);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("g_PI"))).thenReturn(-1.139494);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("h"))).thenReturn(1.046752);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("h_3PI"))).thenReturn(-1.046752);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("h_4PI"))).thenReturn(1.046752);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("h_PI"))).thenReturn(-1.046752);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("i"))).thenReturn(1.000000);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("i_3PI"))).thenReturn(-1.000000);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("i_4PI"))).thenReturn(1.000000);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("i_PI"))).thenReturn(-1.000000);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o"))).thenReturn(1.774230);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o1"))).thenReturn(1.774233);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o1_3PI"))).thenReturn(-1.774233);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o1_4PI"))).thenReturn(1.774233);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o1_PI"))).thenReturn(-1.774233);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o2"))).thenReturn(1.774228);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o2_3PI"))).thenReturn(-1.774228);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o2_4PI"))).thenReturn(1.774228);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o2_PI"))).thenReturn(-1.774228);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o_3PI"))).thenReturn(-1.774230);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o_4PI"))).thenReturn(1.774230);
        Mockito.when(secModule.sec(MapValues.leftPoints.get("o_PI"))).thenReturn(-1.774230);

        Mockito.when(cscModule.csc(MapValues.leftPoints.get("a"))).thenReturn(-7.086167);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("a_3PI"))).thenReturn(7.086167);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("a_4PI"))).thenReturn(-7.086167);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("a_PI"))).thenReturn(7.086167);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("b"))).thenReturn(-1.670922);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("b_3PI"))).thenReturn(1.670922);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("b_4PI"))).thenReturn(-1.670922);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("b_PI"))).thenReturn(1.670922);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("c"))).thenReturn(-1.099750);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("c_3PI"))).thenReturn(1.099750);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("c_4PI"))).thenReturn(-1.099750);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("c_PI"))).thenReturn(1.099750);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("d"))).thenReturn(-1.008405);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("d_3PI"))).thenReturn(1.008405);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("d_4PI"))).thenReturn(-1.008405);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("d_PI"))).thenReturn(1.008405);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("e"))).thenReturn(-1.002511);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("e_3PI"))).thenReturn(1.002511);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("e_4PI"))).thenReturn(-1.002511);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("e_PI"))).thenReturn(1.002511);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("f"))).thenReturn(-1.552270);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("f_3PI"))).thenReturn(1.552270);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("f_4PI"))).thenReturn(-1.552270);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("f_PI"))).thenReturn(1.552270);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("g"))).thenReturn(-2.085830);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("g_3PI"))).thenReturn(2.085830);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("g_4PI"))).thenReturn(-2.085830);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("g_PI"))).thenReturn(2.085830);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("h"))).thenReturn(-3.383863);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("h_3PI"))).thenReturn(3.383863);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("h_4PI"))).thenReturn(-3.383863);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("h_PI"))).thenReturn(3.383863);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("i"))).thenReturn(-1000000.000000);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("i_3PI"))).thenReturn(1000000.001116);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("i_4PI"))).thenReturn(-1000000.001238);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("i_PI"))).thenReturn(999999.999983);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o"))).thenReturn(-1.210608);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o1"))).thenReturn(-1.210607);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o1_3PI"))).thenReturn(1.210607);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o1_4PI"))).thenReturn(-1.210607);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o1_PI"))).thenReturn(1.210607);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o2"))).thenReturn(-1.210609);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o2_3PI"))).thenReturn(1.210609);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o2_4PI"))).thenReturn(-1.210609);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o2_PI"))).thenReturn(1.210609);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o_3PI"))).thenReturn(1.210608);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o_4PI"))).thenReturn(-1.210608);
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("o_PI"))).thenReturn(1.210608);

        Mockito.when(ctgModule.ctg(MapValues.leftPoints.get("_0.5PI"))).thenThrow(new IllegalArgumentException("ctg"));
        Mockito.when(cscModule.csc(MapValues.leftPoints.get("_0.5PI"))).thenThrow(new IllegalArgumentException("csc"));
        Mockito.when(secModule.sec(MapValues.leftPoints.get("_PI"))).thenThrow(new IllegalArgumentException("sec"));

        TrigonometricFunction trigonometricFunctionModule = new TrigonometricFunction(sinModule, cosModule, ctgModule, cscModule, secModule);
        LogarithmicFunction logarithmicFunctionModule = Mockito.mock(LogarithmicFunction.class);

        mainFunction = new MainFunction(trigonometricFunctionModule, logarithmicFunctionModule);
    }

    /**
     * Simple checking - the first part of left plot points:
     * [a,b,c,d,e,f,g,h,i]
     * [o1, o, o2] - min and two points near min
     * [-0.5PI] - throw an exception
     */
    @Test
    public void testLA() throws IllegalArgumentException {
        assertEquals("left - point a", 65.224359, mainFunction.function(MapValues.leftPoints.get("a")), eps);
    }

    @Test
    public void testLB() throws IllegalArgumentException {
        assertEquals("left - point b", 6.111106, mainFunction.function(MapValues.leftPoints.get("b")), eps);
    }

    @Test
    public void testLC() throws IllegalArgumentException {
        assertEquals("left - point c", 2.297944, mainFunction.function(MapValues.leftPoints.get("c")), eps);
    }

    @Test
    public void testLD() throws IllegalArgumentException {
        assertEquals("left - point d", 1.293337, mainFunction.function(MapValues.leftPoints.get("d")), eps);
    }

    @Test
    public void testLE() throws IllegalArgumentException {
        assertEquals("left - point e", 0.868203, mainFunction.function(MapValues.leftPoints.get("e")), eps);
    }

    @Test
    public void testLF() throws IllegalArgumentException {
        assertEquals("left - point f", 0.620043, mainFunction.function(MapValues.leftPoints.get("f")), eps);
    }

    @Test
    public void testLG() throws IllegalArgumentException {
        assertEquals("left - point g", 1.459861, mainFunction.function(MapValues.leftPoints.get("g")), eps);
    }

    @Test
    public void testLH() throws IllegalArgumentException {
        assertEquals("left - point h", 5.897743, mainFunction.function(MapValues.leftPoints.get("h")), eps);
    }

    @Test
    public void testLI() throws IllegalArgumentException {
        assertEquals("left - point i", 999998000001.333400, mainFunction.function(MapValues.leftPoints.get("i")), eps);
    }

    @Test
    public void testLO1() throws IllegalArgumentException {
        assertEquals("left - point o1", 0.418588, mainFunction.function(MapValues.leftPoints.get("o1")), eps);
    }

    @Test
    public void testLO2() throws IllegalArgumentException {
        assertEquals("left - point o2", 0.418588, mainFunction.function(MapValues.leftPoints.get("o2")), eps);
    }

    @Test
    public void testLO() throws IllegalArgumentException {
        assertEquals("left - point o", 0.418588, mainFunction.function(MapValues.leftPoints.get("o")), eps);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLPI_05() throws IllegalArgumentException {
        mainFunction.function(MapValues.leftPoints.get("_0.5PI"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testLPI() throws IllegalArgumentException {
        mainFunction.function(MapValues.leftPoints.get("_PI"));
    }

    /**
     * check first and second parts of plots - the dif between x coordinates = PI (Pi is period)
     */
    @Test
    public void testLA_PI() throws IllegalArgumentException {
        assertEquals("left - point a-pi", mainFunction.function(MapValues.leftPoints.get("a")), mainFunction.function(MapValues.leftPoints.get("a_PI")), eps);
    }

    @Test
    public void testLB_PI() throws IllegalArgumentException {
        assertEquals("left - point b-pi", mainFunction.function(MapValues.leftPoints.get("b")), mainFunction.function(MapValues.leftPoints.get("b_PI")), eps);
    }

    @Test
    public void testLC_PI() throws IllegalArgumentException {
        assertEquals("left - point c-pi", mainFunction.function(MapValues.leftPoints.get("c")), mainFunction.function(MapValues.leftPoints.get("c_PI")), eps);
    }

    @Test
    public void testLD_PI() throws IllegalArgumentException {
        assertEquals("left - point d-pi", mainFunction.function(MapValues.leftPoints.get("d")), mainFunction.function(MapValues.leftPoints.get("d_PI")), eps);
    }

    @Test
    public void testLE_PI() throws IllegalArgumentException {
        assertEquals("left - point e-pi", mainFunction.function(MapValues.leftPoints.get("e")), mainFunction.function(MapValues.leftPoints.get("e_PI")), eps);
    }

    @Test
    public void testLF_PI() throws IllegalArgumentException {
        assertEquals("left - point f-pi", mainFunction.function(MapValues.leftPoints.get("f")), mainFunction.function(MapValues.leftPoints.get("f_PI")), eps);
    }

    @Test
    public void testLG_PI() throws IllegalArgumentException {
        assertEquals("left - point g-pi", mainFunction.function(MapValues.leftPoints.get("g")), mainFunction.function(MapValues.leftPoints.get("g_PI")), eps);
    }

    @Test
    public void testLH_PI() throws IllegalArgumentException {
        assertEquals("left - point h-pi", mainFunction.function(MapValues.leftPoints.get("h")), mainFunction.function(MapValues.leftPoints.get("h_PI")), eps);
    }

    @Test
    public void testLI_PI() throws IllegalArgumentException {// Expected: 9.9999_80000013334E11 VS Actual: 9.9999_79999667067E11
        assertEquals("left - point i-pi", mainFunction.function(MapValues.leftPoints.get("i")), mainFunction.function(MapValues.leftPoints.get("i_PI")), eps);
    }

    @Test
    public void testLO1_PI() throws IllegalArgumentException {
        assertEquals("left - point o1-pi", mainFunction.function(MapValues.leftPoints.get("o1")), mainFunction.function(MapValues.leftPoints.get("o1_PI")), eps);
    }

    @Test
    public void testLO2_PI() throws IllegalArgumentException {
        assertEquals("left - point o2-pi", mainFunction.function(MapValues.leftPoints.get("o2")), mainFunction.function(MapValues.leftPoints.get("o2_PI")), eps);
    }

    @Test
    public void testLO_PI() throws IllegalArgumentException {
        assertEquals("left - point o-pi", mainFunction.function(MapValues.leftPoints.get("o")), mainFunction.function(MapValues.leftPoints.get("o_PI")), eps);
    }

    /**
     * -3PI vs -4PI
     */
    @Test
    public void testLA_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point a-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("a_3PI")), mainFunction.function(MapValues.leftPoints.get("a_4PI")), eps);
    }

    @Test
    public void testLB_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point b-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("b_3PI")), mainFunction.function(MapValues.leftPoints.get("b_4PI")), eps);
    }

    @Test
    public void testLC_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point c-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("c_3PI")), mainFunction.function(MapValues.leftPoints.get("c_4PI")), eps);
    }

    @Test
    public void testLD_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point d-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("d_3PI")), mainFunction.function(MapValues.leftPoints.get("d_4PI")), eps);
    }

    @Test
    public void testLE_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point e-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("e_3PI")), mainFunction.function(MapValues.leftPoints.get("e_4PI")), eps);
    }

    @Test
    public void testLF_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point f-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("f_3PI")), mainFunction.function(MapValues.leftPoints.get("f_4PI")), eps);
    }

    @Test
    public void testLG_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point g-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("g_3PI")), mainFunction.function(MapValues.leftPoints.get("g_4PI")), eps);
    }

    @Test
    public void testLH_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point h-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("h_3PI")), mainFunction.function(MapValues.leftPoints.get("h_4PI")), eps);
    }

    @Test
    public void testLI_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point i-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("i_3PI")), mainFunction.function(MapValues.leftPoints.get("i_4PI")), eps);
    }

    @Test
    public void testLO1_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o1-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o1_3PI")), mainFunction.function(MapValues.leftPoints.get("o1_4PI")), eps);
    }

    @Test
    public void testLO2_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o2-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o2_3PI")), mainFunction.function(MapValues.leftPoints.get("o2_4PI")), eps);
    }

    @Test
    public void testLO_3PI_4PI() throws IllegalArgumentException {
        assertEquals("left - point o-(3,4)pi", mainFunction.function(MapValues.leftPoints.get("o_3PI")), mainFunction.function(MapValues.leftPoints.get("o_4PI")), eps);
    }

}
