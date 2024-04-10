/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 2016/10/23.
 */
public class Issue868 extends TestCase {static class __CLR4_1_1018c418c4luszw9yk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,57516,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_int() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j18c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j18c4() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57460);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57461);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57462);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57463);String str = String.valueOf(Long.MAX_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57464);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57465);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57466);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_int_min() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10spc93018cb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57467,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10spc93018cb() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57467);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57468);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57469);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57470);String str = String.valueOf(Long.MIN_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57471);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57472);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57473);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102sodu218ci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102sodu218ci() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57474);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57475);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57476);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57477);String str = String.valueOf(Integer.MAX_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57478);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57479);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57480);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_short_min() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zchoyx18cp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57481,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zchoyx18cp() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57481);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57482);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57483);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57484);String str = String.valueOf(Integer.MIN_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57485);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57486);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57487);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10peu30k18cw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10peu30k18cw() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57488);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57489);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57490);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57491);String str = String.valueOf(Short.MAX_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57492);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57493);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57494);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_byte_min() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059nd3l18d3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57495,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059nd3l18d3() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57495);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57496);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57497);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57498);String str = String.valueOf(Short.MIN_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57499);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57500);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57501);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_float_min() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d8mv0p18da();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57502,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d8mv0p18da() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57502);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57503);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57504);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57505);String str = String.valueOf(Double.MIN_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57506);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57507);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57508);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}

    public void test_float_max() throws Exception {__CLR4_1_1018c418c4luszw9yk.R.globalSliceStart(getClass().getName(),57509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l33gij18dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018c418c4luszw9yk.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018c418c4luszw9yk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57509,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l33gij18dh() throws Exception{try{__CLR4_1_1018c418c4luszw9yk.R.inc(57509);
        __CLR4_1_1018c418c4luszw9yk.R.inc(57510);Exception error = null;
        __CLR4_1_1018c418c4luszw9yk.R.inc(57511);try {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57512);String str = String.valueOf(Double.MAX_VALUE);
            __CLR4_1_1018c418c4luszw9yk.R.inc(57513);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_1_1018c418c4luszw9yk.R.inc(57514);error = ex;
        }
        __CLR4_1_1018c418c4luszw9yk.R.inc(57515);assertNotNull(error);
    }finally{__CLR4_1_1018c418c4luszw9yk.R.flushNeeded();}}
}
