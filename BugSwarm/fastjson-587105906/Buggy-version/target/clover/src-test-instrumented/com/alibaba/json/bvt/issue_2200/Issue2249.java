/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

public class Issue2249 extends TestCase {static class __CLR4_1_101e6q1e6qluszwbof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,65083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1e6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1e6q() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65042);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65043);assertSame(Type.Big, JSON.parseObject("\"big\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65044);assertSame(Type.Big, JSON.parseObject("\"Big\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65045);assertSame(Type.Big, JSON.parseObject("\"BIG\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65046);assertSame(Type.Small, JSON.parseObject("\"Small\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65047);assertSame(Type.Small, JSON.parseObject("\"small\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65048);assertSame(Type.Small, JSON.parseObject("\"SMALL\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65049);assertSame(Type.Medium, JSON.parseObject("\"medium\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65050);assertSame(Type.Medium, JSON.parseObject("\"MEDIUM\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65051);assertSame(Type.Medium, JSON.parseObject("\"Medium\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65052);assertSame(Type.Medium, JSON.parseObject("\"MediuM\"", Type.class));
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65053);assertNull(JSON.parseObject("\"\"", Type.class));
    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51e72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51e72() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65054);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65055);assertSame(Type.Big, JSON.parseObject("{\"type\":\"bIG\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65056);assertSame(Type.Big, JSON.parseObject("{\"type\":\"big\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65057);assertSame(Type.Big, JSON.parseObject("{\"type\":\"Big\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65058);assertSame(Type.Big, JSON.parseObject("{\"type\":\"BIG\"}", Model.class).type);

        __CLR4_1_101e6q1e6qluszwbof.R.inc(65059);assertSame(Type.Small, JSON.parseObject("{\"type\":\"Small\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65060);assertSame(Type.Small, JSON.parseObject("{\"type\":\"SmAll\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65061);assertSame(Type.Small, JSON.parseObject("{\"type\":\"small\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65062);assertSame(Type.Small, JSON.parseObject("{\"type\":\"SMALL\"}", Model.class).type);

        __CLR4_1_101e6q1e6qluszwbof.R.inc(65063);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"Medium\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65064);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"MediuM\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65065);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"medium\"}", Model.class).type);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65066);assertSame(Type.Medium, JSON.parseObject("{\"type\":\"MEDIUM\"}", Model.class).type);

    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}

    public void test_for_issue_null() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qqzn611e7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qqzn611e7f() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65067);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65068);assertNull(JSON.parseObject("{\"type\":\"\"}", Model.class).type);
    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}

    public void test_for_issue_null_2() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e52o961e7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_null_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65069,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e52o961e7h() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65069);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65070);assertNull(JSON.parseObject("{\"type\":\"\"}", Model.class, Feature.ErrorOnEnumNotMatch).type);
    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}


    public void test_for_issue_error() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nnyo4a1e7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65071,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nnyo4a1e7j() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65071);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65072);Exception error = null;
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65073);try {
            __CLR4_1_101e6q1e6qluszwbof.R.inc(65074);JSON.parseObject("\"xxx\"", Type.class, Feature.ErrorOnEnumNotMatch);
        } catch (JSONException e) {
            __CLR4_1_101e6q1e6qluszwbof.R.inc(65075);error = e;
        }
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65076);assertNotNull(error);
    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}

    public void test_for_issue_error_1() throws Exception {__CLR4_1_101e6q1e6qluszwbof.R.globalSliceStart(getClass().getName(),65077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108lnzs81e7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e6q1e6qluszwbof.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e6q1e6qluszwbof.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2249.test_for_issue_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65077,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108lnzs81e7p() throws Exception{try{__CLR4_1_101e6q1e6qluszwbof.R.inc(65077);
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65078);Exception error = null;
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65079);try {
            __CLR4_1_101e6q1e6qluszwbof.R.inc(65080);JSON.parseObject("{\"type\":\"xxx\"}", Model.class, Feature.ErrorOnEnumNotMatch);
        } catch (JSONException e) {
            __CLR4_1_101e6q1e6qluszwbof.R.inc(65081);error = e;
        }
        __CLR4_1_101e6q1e6qluszwbof.R.inc(65082);assertNotNull(error);
    }finally{__CLR4_1_101e6q1e6qluszwbof.R.flushNeeded();}}

    public enum  Type {
        Big,Small,Medium
    }

    public static class Model {
        public Type type;
    }
}
