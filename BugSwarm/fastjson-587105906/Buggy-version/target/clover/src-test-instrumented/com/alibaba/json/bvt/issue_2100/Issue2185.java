/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2100;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.util.Date;
import java.util.HashMap;

public class Issue2185 extends TestCase {static class __CLR4_1_101d1h1d1hlusqkazc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,63597,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceStart(getClass().getName(),63557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1d1h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d1h1d1hlusqkazc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1d1h() throws Exception{try{__CLR4_1_101d1h1d1hlusqkazc.R.inc(63557);
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63558);Exception error = null;
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63559);try {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63560);JSONObject origin = new JSONObject();
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63561);JSONArray jsonArray = new JSONArray().fluentAdd(origin.getInnerMap());
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63562);jsonArray.getJSONObject(0).put("key", "value");
            // now we expect jsonArray is [{"key":"value"}]
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63563);assertEquals(1, jsonArray.getJSONObject(0).size());
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63564);assertTrue(origin.getInnerMap() == jsonArray.getJSONObject(0).getInnerMap());
        } catch (JSONException ex) {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63565);error = ex;
        }
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63566);assertNull(error);
    }finally{__CLR4_1_101d1h1d1hlusqkazc.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Object,Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_1() throws Exception {__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceStart(getClass().getName(),63567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51d1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d1h1d1hlusqkazc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63567,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51d1r() throws Exception{try{__CLR4_1_101d1h1d1hlusqkazc.R.inc(63567);
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63568);Exception error = null;
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63569);try {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63570);HashMap origin = new HashMap();
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63571);origin.put(new Object(), "value");
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63572);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63573);jsonArray.getJSONObject(0);
            // now jsonArray is [{{}:"value"}]
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63574);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63575);error = ex;
        }
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63576);assertNull(error);
    }finally{__CLR4_1_101d1h1d1hlusqkazc.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;primitive type, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_2() throws Exception {__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceStart(getClass().getName(),63577);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1d21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d1h1d1hlusqkazc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63577,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1d21() throws Exception{try{__CLR4_1_101d1h1d1hlusqkazc.R.inc(63577);
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63578);Exception error = null;
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63579);try {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63580);HashMap origin = new HashMap();
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63581);origin.put(5.3f, "value");
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63582);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63583);jsonArray.getJSONObject(0);
            // now jsonArray is [{5.3:"value"}]
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63584);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63585);error = ex;
        }
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63586);assertNull(error);
    }finally{__CLR4_1_101d1h1d1hlusqkazc.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Date, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_3() throws Exception {__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceStart(getClass().getName(),63587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nzsw271d2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d1h1d1hlusqkazc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d1h1d1hlusqkazc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63587,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nzsw271d2b() throws Exception{try{__CLR4_1_101d1h1d1hlusqkazc.R.inc(63587);
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63588);Exception error = null;
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63589);try {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63590);HashMap origin = new HashMap();
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63591);origin.put(new Date(), "value");
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63592);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63593);jsonArray.getJSONObject(0);
            // now jsonArray is [{154xxxxxxxxx:"value"}]
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63594);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101d1h1d1hlusqkazc.R.inc(63595);error = ex;
        }
        __CLR4_1_101d1h1d1hlusqkazc.R.inc(63596);assertNull(error);
    }finally{__CLR4_1_101d1h1d1hlusqkazc.R.flushNeeded();}}

    public static class Model {
        public int value;
    }
}
