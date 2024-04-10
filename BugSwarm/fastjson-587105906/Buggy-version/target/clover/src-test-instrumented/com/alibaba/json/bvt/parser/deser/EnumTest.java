/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class EnumTest extends TestCase {static class __CLR4_1_101lpx1lpxluszwdco{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_enum() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102onyzv1lpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102onyzv1lpx() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74805);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74806);Assert.assertNull(JSON.parseObject("''", TimeUnit.class));
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    public void test_enum_1() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10j52xvd1lpz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74807,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10j52xvd1lpz() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74807);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74808);Assert.assertEquals(E.A, JSON.parseObject("0", E.class));
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}
    
    public void test_enum_3() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cn30af1lq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74809,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cn30af1lq1() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74809);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74810);Assert.assertEquals(E.A, JSON.parseObject("{value:0}", Entity.class).getValue());
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    public void test_enum_2() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fw2z2w1lq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74811,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fw2z2w1lq3() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74811);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74812);Assert.assertEquals(E.A, JSON.parseObject("'A'", E.class));
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    public void test_enum_error() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ms0n0i1lq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ms0n0i1lq5() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74813);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74814);assertNull(JSON.parseObject("'123'", TimeUnit.class));
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    public void test_enum_error_2() throws Exception {__CLR4_1_101lpx1lpxluszwdco.R.globalSliceStart(getClass().getName(),74815);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104yl6un1lq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lpx1lpxluszwdco.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lpx1lpxluszwdco.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74815,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104yl6un1lq7() throws Exception{try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74815);
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74816);Exception error = null;
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74817);try {
            __CLR4_1_101lpx1lpxluszwdco.R.inc(74818);JSON.parseObject("12.3", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_1_101lpx1lpxluszwdco.R.inc(74819);error = ex;
        }
        __CLR4_1_101lpx1lpxluszwdco.R.inc(74820);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    public static enum E {
        A, B, C
    }

    public static class Entity {

        private E value;

        public Entity(){try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74821);

        }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

        public Entity(E value){
            super();__CLR4_1_101lpx1lpxluszwdco.R.inc(74823);try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74822);
            __CLR4_1_101lpx1lpxluszwdco.R.inc(74824);this.value = value;
        }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

        public E getValue() {try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74825);
            __CLR4_1_101lpx1lpxluszwdco.R.inc(74826);return value;
        }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

        public void setValue(E value) {try{__CLR4_1_101lpx1lpxluszwdco.R.inc(74827);
            __CLR4_1_101lpx1lpxluszwdco.R.inc(74828);this.value = value;
        }finally{__CLR4_1_101lpx1lpxluszwdco.R.flushNeeded();}}

    }
}
