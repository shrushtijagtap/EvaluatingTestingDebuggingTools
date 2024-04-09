/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 2016/10/23.
 */
public class Issue868 extends TestCase {static class __CLR4_5_218bt18btlusvn8ln{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,57505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_int() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sluf5j18bt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sluf5j18bt() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57449);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57450);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57451);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57452);String str = String.valueOf(Long.MAX_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57453);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57454);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57455);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_int_min() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2spc93018c0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2spc93018c0() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57456);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57457);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57458);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57459);String str = String.valueOf(Long.MIN_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57460);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57461);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57462);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22sodu218c7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22sodu218c7() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57463);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57464);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57465);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57466);String str = String.valueOf(Integer.MAX_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57467);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57468);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57469);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_short_min() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57470);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zchoyx18ce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57470,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zchoyx18ce() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57470);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57471);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57472);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57473);String str = String.valueOf(Integer.MIN_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57474);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57475);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57476);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2peu30k18cl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57477,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2peu30k18cl() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57477);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57478);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57479);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57480);String str = String.valueOf(Short.MAX_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57481);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57482);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57483);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_byte_min() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259nd3l18cs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259nd3l18cs() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57484);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57485);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57486);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57487);String str = String.valueOf(Short.MIN_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57488);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57489);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57490);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_float_min() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d8mv0p18cz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d8mv0p18cz() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57491);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57492);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57493);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57494);String str = String.valueOf(Double.MIN_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57495);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57496);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57497);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}

    public void test_float_max() throws Exception {__CLR4_5_218bt18btlusvn8ln.R.globalSliceStart(getClass().getName(),57498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l33gij18d6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218bt18btlusvn8ln.R.rethrow($CLV_t2$);}finally{__CLR4_5_218bt18btlusvn8ln.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l33gij18d6() throws Exception{try{__CLR4_5_218bt18btlusvn8ln.R.inc(57498);
        __CLR4_5_218bt18btlusvn8ln.R.inc(57499);Exception error = null;
        __CLR4_5_218bt18btlusvn8ln.R.inc(57500);try {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57501);String str = String.valueOf(Double.MAX_VALUE);
            __CLR4_5_218bt18btlusvn8ln.R.inc(57502);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_5_218bt18btlusvn8ln.R.inc(57503);error = ex;
        }
        __CLR4_5_218bt18btlusvn8ln.R.inc(57504);assertNotNull(error);
    }finally{__CLR4_5_218bt18btlusvn8ln.R.flushNeeded();}}
}
