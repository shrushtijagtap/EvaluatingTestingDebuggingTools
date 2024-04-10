/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class EnumTest extends TestCase {static class __CLR4_5_21kre1krelusyju3b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73586,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_enum() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22onyzv1kre();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22onyzv1kre() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73562);
        __CLR4_5_21kre1krelusyju3b.R.inc(73563);Assert.assertNull(JSON.parseObject("''", TimeUnit.class));
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    public void test_enum_1() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2j52xvd1krg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73564,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2j52xvd1krg() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73564);
        __CLR4_5_21kre1krelusyju3b.R.inc(73565);Assert.assertEquals(E.A, JSON.parseObject("0", E.class));
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}
    
    public void test_enum_3() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73566);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cn30af1kri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73566,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cn30af1kri() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73566);
        __CLR4_5_21kre1krelusyju3b.R.inc(73567);Assert.assertEquals(E.A, JSON.parseObject("{value:0}", Entity.class).getValue());
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    public void test_enum_2() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73568);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fw2z2w1krk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73568,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fw2z2w1krk() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73568);
        __CLR4_5_21kre1krelusyju3b.R.inc(73569);Assert.assertEquals(E.A, JSON.parseObject("'A'", E.class));
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    public void test_enum_error() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ms0n0i1krm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ms0n0i1krm() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73570);
        __CLR4_5_21kre1krelusyju3b.R.inc(73571);assertNull(JSON.parseObject("'123'", TimeUnit.class));
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    public void test_enum_error_2() throws Exception {__CLR4_5_21kre1krelusyju3b.R.globalSliceStart(getClass().getName(),73572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24yl6un1kro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kre1krelusyju3b.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kre1krelusyju3b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.EnumTest.test_enum_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73572,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24yl6un1kro() throws Exception{try{__CLR4_5_21kre1krelusyju3b.R.inc(73572);
        __CLR4_5_21kre1krelusyju3b.R.inc(73573);Exception error = null;
        __CLR4_5_21kre1krelusyju3b.R.inc(73574);try {
            __CLR4_5_21kre1krelusyju3b.R.inc(73575);JSON.parseObject("12.3", TimeUnit.class);
        } catch (JSONException ex) {
            __CLR4_5_21kre1krelusyju3b.R.inc(73576);error = ex;
        }
        __CLR4_5_21kre1krelusyju3b.R.inc(73577);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    public static enum E {
        A, B, C
    }

    public static class Entity {

        private E value;

        public Entity(){try{__CLR4_5_21kre1krelusyju3b.R.inc(73578);

        }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

        public Entity(E value){
            super();__CLR4_5_21kre1krelusyju3b.R.inc(73580);try{__CLR4_5_21kre1krelusyju3b.R.inc(73579);
            __CLR4_5_21kre1krelusyju3b.R.inc(73581);this.value = value;
        }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

        public E getValue() {try{__CLR4_5_21kre1krelusyju3b.R.inc(73582);
            __CLR4_5_21kre1krelusyju3b.R.inc(73583);return value;
        }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

        public void setValue(E value) {try{__CLR4_5_21kre1krelusyju3b.R.inc(73584);
            __CLR4_5_21kre1krelusyju3b.R.inc(73585);this.value = value;
        }finally{__CLR4_5_21kre1krelusyju3b.R.flushNeeded();}}

    }
}
