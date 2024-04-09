/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import junit.framework.TestCase;

/**
 * Created by wenshao on 2016/10/23.
 */
public class Issue868 extends TestCase {static class __CLR4_1_1017dw17dwlusqk71g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56284,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_int() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sluf5j17dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sluf5j17dw() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56228);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56229);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56230);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56231);String str = String.valueOf(Long.MAX_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56232);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56233);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56234);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_int_min() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56235);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10spc93017e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_int_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56235,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10spc93017e3() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56235);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56236);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56237);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56238);String str = String.valueOf(Long.MIN_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56239);JSON.parseObject(str, int.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56240);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56241);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_short() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56242);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102sodu217ea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56242,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102sodu217ea() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56242);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56243);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56244);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56245);String str = String.valueOf(Integer.MAX_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56246);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56247);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56248);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_short_min() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56249);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zchoyx17eh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_short_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56249,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zchoyx17eh() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56249);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56250);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56251);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56252);String str = String.valueOf(Integer.MIN_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56253);JSON.parseObject(str, short.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56254);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56255);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_byte() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56256);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10peu30k17eo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56256,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10peu30k17eo() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56256);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56257);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56258);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56259);String str = String.valueOf(Short.MAX_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56260);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56261);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56262);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_byte_min() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059nd3l17ev();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_byte_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56263,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059nd3l17ev() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56263);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56264);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56265);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56266);String str = String.valueOf(Short.MIN_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56267);JSON.parseObject(str, byte.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56268);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56269);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_float_min() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d8mv0p17f2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_min",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56270,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d8mv0p17f2() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56270);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56271);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56272);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56273);String str = String.valueOf(Double.MIN_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56274);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56275);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56276);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}

    public void test_float_max() throws Exception {__CLR4_1_1017dw17dwlusqk71g.R.globalSliceStart(getClass().getName(),56277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10l33gij17f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017dw17dwlusqk71g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017dw17dwlusqk71g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue868.test_float_max",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56277,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10l33gij17f9() throws Exception{try{__CLR4_1_1017dw17dwlusqk71g.R.inc(56277);
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56278);Exception error = null;
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56279);try {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56280);String str = String.valueOf(Double.MAX_VALUE);
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56281);JSON.parseObject(str, float.class);
        } catch (JSONException ex) {
            __CLR4_1_1017dw17dwlusqk71g.R.inc(56282);error = ex;
        }
        __CLR4_1_1017dw17dwlusqk71g.R.inc(56283);assertNotNull(error);
    }finally{__CLR4_1_1017dw17dwlusqk71g.R.flushNeeded();}}
}
