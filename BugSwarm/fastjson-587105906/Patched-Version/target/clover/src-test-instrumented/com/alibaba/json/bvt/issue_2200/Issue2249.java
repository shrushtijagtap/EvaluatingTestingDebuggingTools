/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

public class Issue2249 extends TestCase {static class __CLR4_5_21d871d87lusyjt5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,63840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1d87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1d87() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63799);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63800);assertSame(Type.Big, JSON.parseObject("\"big\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63801);assertSame(Type.Big, JSON.parseObject("\"Big\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63802);assertSame(Type.Big, JSON.parseObject("\"BIG\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63803);assertSame(Type.Small, JSON.parseObject("\"Small\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63804);assertSame(Type.Small, JSON.parseObject("\"small\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63805);assertSame(Type.Small, JSON.parseObject("\"SMALL\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63806);assertSame(Type.Medium, JSON.parseObject("\"medium\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63807);assertSame(Type.Medium, JSON.parseObject("\"MEDIUM\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63808);assertSame(Type.Medium, JSON.parseObject("\"Medium\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63809);assertSame(Type.Medium, JSON.parseObject("\"MediuM\"", Type.class));
        __CLR4_5_21d871d87lusyjt5u.R.inc(63810);assertNull(JSON.parseObject("\"\"", Type.class));
    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51d8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51d8j() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63811);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63812);assertSame(Type.Big, JSON.parseObject("{\"type\":\"bIG\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63813);assertSame(Type.Big, JSON.parseObject("{\"type\":\"big\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63814);assertSame(Type.Big, JSON.parseObject("{\"type\":\"Big\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63815);assertSame(Type.Big, JSON.parseObject("{\"type\":\"BIG\"}", Model.class).type);

        __CLR4_5_21d871d87lusyjt5u.R.inc(63816);assertSame(Type.Small, JSON.parseObject("{\"type\":\"Small\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63817);assertSame(Type.Small, JSON.parseObject("{\"type\":\"SmAll\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63818);assertSame(Type.Small, JSON.parseObject("{\"type\":\"small\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63819);assertSame(Type.Small, JSON.parseObject("{\"type\":\"SMALL\"}", Model.class).type);

        __CLR4_5_21d871d87lusyjt5u.R.inc(63820);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"Medium\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63821);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"MediuM\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63822);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"medium\"}", Model.class).type);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63823);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"MEDIUM\"}", Model.class).type);

    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}

    public void test_for_issue_null() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63824);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qqzn611d8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63824,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qqzn611d8w() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63824);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63825);assertNull(JSON.parseObject("{\"type\":\"\"}", Model.class).type);
    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}

    public void test_for_issue_null_2() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e52o961d8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63826,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e52o961d8y() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63826);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63827);assertNull(JSON.parseObject("{\"type\":\"\"}", Model.class, Feature.ErrorOnEnumNotMatch).type);
    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}


    public void test_for_issue_error() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nnyo4a1d90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nnyo4a1d90() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63828);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63829);Exception error = null;
        __CLR4_5_21d871d87lusyjt5u.R.inc(63830);try {
            __CLR4_5_21d871d87lusyjt5u.R.inc(63831);JSON.parseObject("\"xxx\"", Type.class, Feature.ErrorOnEnumNotMatch);
        } catch (JSONException e) {
            __CLR4_5_21d871d87lusyjt5u.R.inc(63832);error = e;
        }
        __CLR4_5_21d871d87lusyjt5u.R.inc(63833);assertNotNull(error);
    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}

    public void test_for_issue_error_1() throws Exception {__CLR4_5_21d871d87lusyjt5u.R.globalSliceStart(getClass().getName(),63834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28lnzs81d96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21d871d87lusyjt5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21d871d87lusyjt5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28lnzs81d96() throws Exception{try{__CLR4_5_21d871d87lusyjt5u.R.inc(63834);
        __CLR4_5_21d871d87lusyjt5u.R.inc(63835);Exception error = null;
        __CLR4_5_21d871d87lusyjt5u.R.inc(63836);try {
            __CLR4_5_21d871d87lusyjt5u.R.inc(63837);JSON.parseObject("{\"type\":\"xxx\"}", Model.class, Feature.ErrorOnEnumNotMatch);
        } catch (JSONException e) {
            __CLR4_5_21d871d87lusyjt5u.R.inc(63838);error = e;
        }
        __CLR4_5_21d871d87lusyjt5u.R.inc(63839);assertNotNull(error);
    }finally{__CLR4_5_21d871d87lusyjt5u.R.flushNeeded();}}

    public enum  Type {
        Big,Small,Medium
    }

    public static class Model {
        public Type type;
    }
}
