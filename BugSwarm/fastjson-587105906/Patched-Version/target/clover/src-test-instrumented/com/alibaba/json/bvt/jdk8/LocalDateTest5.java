/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.LocalDate;
import java.util.Locale;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTest5 extends TestCase {static class __CLR4_5_21dyp1dyplusyjt99{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,64811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Locale origin;

    protected void setUp() throws Exception {try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64753);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64754);origin = Locale.getDefault();
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64755);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64756);Locale.setDefault(origin);
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_tw() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l65f8z1dyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_tw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l65f8z1dyt() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64757);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64758);VO vo = JSON.parseObject("{\"date\":\"2016/05/06\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64759);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64760);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64761);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_jp() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1u1o01dyy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_jp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1u1o01dyy() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64762);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64763);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64764);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64765);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64766);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_kr() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krf66n1dz3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_kr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krf66n1dz3() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64767);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64768);VO vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64769);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64770);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64771);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_us() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gadvc1dz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_us",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gadvc1dz8() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64772);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64773);VO vo = JSON.parseObject("{\"date\":\"05/26/2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64774);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64775);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64776);Assert.assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_eur() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qj5ru1dzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_eur",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64777,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qj5ru1dzd() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64777);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64778);VO vo = JSON.parseObject("{\"date\":\"26/05/2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64779);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64780);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64781);Assert.assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_us_1() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crooli1dzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_us_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crooli1dzi() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64782);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64783);Locale.setDefault(Locale.US);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64784);VO vo = JSON.parseObject("{\"date\":\"05/06/2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64785);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64786);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64787);Assert.assertEquals(06, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_br() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243p35y1dzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_br",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64788,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243p35y1dzo() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64788);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64789);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64790);VO vo = JSON.parseObject("{\"date\":\"06/05/2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64791);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64792);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64793);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_au() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2k3c21dzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_au",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2k3c21dzu() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64794);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64795);Locale.setDefault(new Locale("en", "AU"));
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64796);VO vo = JSON.parseObject("{\"date\":\"06/05/2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64797);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64798);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64799);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public void test_for_de() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d315mz1e00();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_de",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d315mz1e00() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64800);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64801);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64802);VO vo = JSON.parseObject("{\"date\":\"06.05.2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64803);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64804);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64805);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}
    
    public void test_for_in() throws Exception {__CLR4_5_21dyp1dyplusyjt99.R.globalSliceStart(getClass().getName(),64806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m60sgh1e06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dyp1dyplusyjt99.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dyp1dyplusyjt99.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m60sgh1e06() throws Exception{try{__CLR4_5_21dyp1dyplusyjt99.R.inc(64806);
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64807);VO vo = JSON.parseObject("{\"date\":\"06-05-2016\"}", VO.class);

        __CLR4_5_21dyp1dyplusyjt99.R.inc(64808);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64809);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21dyp1dyplusyjt99.R.inc(64810);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21dyp1dyplusyjt99.R.flushNeeded();}}

    public static class VO {

        public LocalDate date;

    }
}
