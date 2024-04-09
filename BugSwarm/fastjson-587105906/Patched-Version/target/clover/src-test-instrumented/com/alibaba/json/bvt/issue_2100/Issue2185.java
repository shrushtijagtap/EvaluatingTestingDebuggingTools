/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2100;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.util.Date;
import java.util.HashMap;

public class Issue2185 extends TestCase {static class __CLR4_5_21dze1dzelusvnba4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,64818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_21dze1dzelusvnba4.R.globalSliceStart(getClass().getName(),64778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1dze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dze1dzelusvnba4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dze1dzelusvnba4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1dze() throws Exception{try{__CLR4_5_21dze1dzelusvnba4.R.inc(64778);
        __CLR4_5_21dze1dzelusvnba4.R.inc(64779);Exception error = null;
        __CLR4_5_21dze1dzelusvnba4.R.inc(64780);try {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64781);JSONObject origin = new JSONObject();
            __CLR4_5_21dze1dzelusvnba4.R.inc(64782);JSONArray jsonArray = new JSONArray().fluentAdd(origin.getInnerMap());
            __CLR4_5_21dze1dzelusvnba4.R.inc(64783);jsonArray.getJSONObject(0).put("key", "value");
            // now we expect jsonArray is [{"key":"value"}]
            __CLR4_5_21dze1dzelusvnba4.R.inc(64784);assertEquals(1, jsonArray.getJSONObject(0).size());
            __CLR4_5_21dze1dzelusvnba4.R.inc(64785);assertTrue(origin.getInnerMap() == jsonArray.getJSONObject(0).getInnerMap());
        } catch (JSONException ex) {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64786);error = ex;
        }
        __CLR4_5_21dze1dzelusvnba4.R.inc(64787);assertNull(error);
    }finally{__CLR4_5_21dze1dzelusvnba4.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Object,Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_1() throws Exception {__CLR4_5_21dze1dzelusvnba4.R.globalSliceStart(getClass().getName(),64788);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51dzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dze1dzelusvnba4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dze1dzelusvnba4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64788,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51dzo() throws Exception{try{__CLR4_5_21dze1dzelusvnba4.R.inc(64788);
        __CLR4_5_21dze1dzelusvnba4.R.inc(64789);Exception error = null;
        __CLR4_5_21dze1dzelusvnba4.R.inc(64790);try {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64791);HashMap origin = new HashMap();
            __CLR4_5_21dze1dzelusvnba4.R.inc(64792);origin.put(new Object(), "value");
            __CLR4_5_21dze1dzelusvnba4.R.inc(64793);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_5_21dze1dzelusvnba4.R.inc(64794);jsonArray.getJSONObject(0);
            // now jsonArray is [{{}:"value"}]
            __CLR4_5_21dze1dzelusvnba4.R.inc(64795);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64796);error = ex;
        }
        __CLR4_5_21dze1dzelusvnba4.R.inc(64797);assertNull(error);
    }finally{__CLR4_5_21dze1dzelusvnba4.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;primitive type, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_2() throws Exception {__CLR4_5_21dze1dzelusvnba4.R.globalSliceStart(getClass().getName(),64798);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo1dzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dze1dzelusvnba4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dze1dzelusvnba4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64798,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo1dzy() throws Exception{try{__CLR4_5_21dze1dzelusvnba4.R.inc(64798);
        __CLR4_5_21dze1dzelusvnba4.R.inc(64799);Exception error = null;
        __CLR4_5_21dze1dzelusvnba4.R.inc(64800);try {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64801);HashMap origin = new HashMap();
            __CLR4_5_21dze1dzelusvnba4.R.inc(64802);origin.put(5.3f, "value");
            __CLR4_5_21dze1dzelusvnba4.R.inc(64803);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_5_21dze1dzelusvnba4.R.inc(64804);jsonArray.getJSONObject(0);
            // now jsonArray is [{5.3:"value"}]
            __CLR4_5_21dze1dzelusvnba4.R.inc(64805);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64806);error = ex;
        }
        __CLR4_5_21dze1dzelusvnba4.R.inc(64807);assertNull(error);
    }finally{__CLR4_5_21dze1dzelusvnba4.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Date, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_3() throws Exception {__CLR4_5_21dze1dzelusvnba4.R.globalSliceStart(getClass().getName(),64808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nzsw271e08();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dze1dzelusvnba4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dze1dzelusvnba4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64808,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nzsw271e08() throws Exception{try{__CLR4_5_21dze1dzelusvnba4.R.inc(64808);
        __CLR4_5_21dze1dzelusvnba4.R.inc(64809);Exception error = null;
        __CLR4_5_21dze1dzelusvnba4.R.inc(64810);try {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64811);HashMap origin = new HashMap();
            __CLR4_5_21dze1dzelusvnba4.R.inc(64812);origin.put(new Date(), "value");
            __CLR4_5_21dze1dzelusvnba4.R.inc(64813);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_5_21dze1dzelusvnba4.R.inc(64814);jsonArray.getJSONObject(0);
            // now jsonArray is [{154xxxxxxxxx:"value"}]
            __CLR4_5_21dze1dzelusvnba4.R.inc(64815);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_5_21dze1dzelusvnba4.R.inc(64816);error = ex;
        }
        __CLR4_5_21dze1dzelusvnba4.R.inc(64817);assertNull(error);
    }finally{__CLR4_5_21dze1dzelusvnba4.R.flushNeeded();}}

    public static class Model {
        public int value;
    }
}
