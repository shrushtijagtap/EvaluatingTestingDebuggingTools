/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.time.LocalDate;
import java.util.Locale;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LocalDateTest5 extends TestCase {static class __CLR4_5_21ewx1ewxlusvnbwk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,66043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private Locale origin;

    protected void setUp() throws Exception {try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(65985);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65986);origin = Locale.getDefault();
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(65987);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65988);Locale.setDefault(origin);
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_tw() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),65989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l65f8z1ex1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_tw",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l65f8z1ex1() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(65989);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65990);VO vo = JSON.parseObject("{\"date\":\"2016/05/06\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65991);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65992);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65993);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_jp() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),65994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1u1o01ex6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_jp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65994,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1u1o01ex6() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(65994);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65995);VO vo = JSON.parseObject("{\"date\":\"2016\u5e745\u67086\u65e5\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65996);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65997);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(65998);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_kr() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),65999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2krf66n1exb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_kr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65999,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2krf66n1exb() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(65999);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66000);VO vo = JSON.parseObject("{\"date\":\"2016\ub1445\uc6d46\uc77c\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66001);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66002);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66003);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_us() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24gadvc1exg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_us",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24gadvc1exg() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66004);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66005);VO vo = JSON.parseObject("{\"date\":\"05/26/2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66006);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66007);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66008);Assert.assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_eur() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66009);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26qj5ru1exl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_eur",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66009,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26qj5ru1exl() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66009);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66010);VO vo = JSON.parseObject("{\"date\":\"26/05/2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66011);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66012);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66013);Assert.assertEquals(26, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_us_1() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crooli1exq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_us_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66014,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crooli1exq() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66014);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66015);Locale.setDefault(Locale.US);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66016);VO vo = JSON.parseObject("{\"date\":\"05/06/2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66017);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66018);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66019);Assert.assertEquals(06, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_br() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_243p35y1exw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_br",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_243p35y1exw() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66020);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66021);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66022);VO vo = JSON.parseObject("{\"date\":\"06/05/2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66023);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66024);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66025);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_au() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o2k3c21ey2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_au",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66026,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o2k3c21ey2() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66026);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66027);Locale.setDefault(new Locale("en", "AU"));
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66028);VO vo = JSON.parseObject("{\"date\":\"06/05/2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66029);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66030);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66031);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public void test_for_de() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d315mz1ey8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_de",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d315mz1ey8() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66032);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66033);Locale.setDefault(new Locale("pt", "BR"));
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66034);VO vo = JSON.parseObject("{\"date\":\"06.05.2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66035);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66036);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66037);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}
    
    public void test_for_in() throws Exception {__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceStart(getClass().getName(),66038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m60sgh1eye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ewx1ewxlusvnbwk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ewx1ewxlusvnbwk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.LocalDateTest5.test_for_in",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m60sgh1eye() throws Exception{try{__CLR4_5_21ewx1ewxlusvnbwk.R.inc(66038);
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66039);VO vo = JSON.parseObject("{\"date\":\"06-05-2016\"}", VO.class);

        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66040);Assert.assertEquals(2016, vo.date.getYear());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66041);Assert.assertEquals(5, vo.date.getMonthValue());
        __CLR4_5_21ewx1ewxlusvnbwk.R.inc(66042);Assert.assertEquals(6, vo.date.getDayOfMonth());
    }finally{__CLR4_5_21ewx1ewxlusvnbwk.R.flushNeeded();}}

    public static class VO {

        public LocalDate date;

    }
}
