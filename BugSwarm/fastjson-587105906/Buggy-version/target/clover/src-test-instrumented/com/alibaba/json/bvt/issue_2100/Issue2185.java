/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2100;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.util.Date;
import java.util.HashMap;

public class Issue2185 extends TestCase {static class __CLR4_1_101dzp1dzpluszwbn3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64829,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceStart(getClass().getName(),64789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dzp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dzp1dzpluszwbn3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dzp() throws Exception{try{__CLR4_1_101dzp1dzpluszwbn3.R.inc(64789);
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64790);Exception error = null;
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64791);try {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64792);JSONObject origin = new JSONObject();
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64793);JSONArray jsonArray = new JSONArray().fluentAdd(origin.getInnerMap());
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64794);jsonArray.getJSONObject(0).put("key", "value");
            // now we expect jsonArray is [{"key":"value"}]
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64795);assertEquals(1, jsonArray.getJSONObject(0).size());
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64796);assertTrue(origin.getInnerMap() == jsonArray.getJSONObject(0).getInnerMap());
        } catch (JSONException ex) {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64797);error = ex;
        }
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64798);assertNull(error);
    }finally{__CLR4_1_101dzp1dzpluszwbn3.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Object,Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_1() throws Exception {__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceStart(getClass().getName(),64799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51dzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dzp1dzpluszwbn3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64799,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51dzz() throws Exception{try{__CLR4_1_101dzp1dzpluszwbn3.R.inc(64799);
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64800);Exception error = null;
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64801);try {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64802);HashMap origin = new HashMap();
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64803);origin.put(new Object(), "value");
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64804);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64805);jsonArray.getJSONObject(0);
            // now jsonArray is [{{}:"value"}]
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64806);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64807);error = ex;
        }
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64808);assertNull(error);
    }finally{__CLR4_1_101dzp1dzpluszwbn3.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;primitive type, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_2() throws Exception {__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceStart(getClass().getName(),64809);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1e09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dzp1dzpluszwbn3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64809,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1e09() throws Exception{try{__CLR4_1_101dzp1dzpluszwbn3.R.inc(64809);
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64810);Exception error = null;
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64811);try {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64812);HashMap origin = new HashMap();
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64813);origin.put(5.3f, "value");
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64814);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64815);jsonArray.getJSONObject(0);
            // now jsonArray is [{5.3:"value"}]
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64816);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64817);error = ex;
        }
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64818);assertNull(error);
    }finally{__CLR4_1_101dzp1dzpluszwbn3.R.flushNeeded();}}

    /**
     * To prove casting from Map&lt;Date, Object&gt; won't cause exception
     *
     * @throws Exception
     */
    public void test_for_issue_3() throws Exception {__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceStart(getClass().getName(),64819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nzsw271e0j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dzp1dzpluszwbn3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dzp1dzpluszwbn3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2100.Issue2185.test_for_issue_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nzsw271e0j() throws Exception{try{__CLR4_1_101dzp1dzpluszwbn3.R.inc(64819);
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64820);Exception error = null;
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64821);try {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64822);HashMap origin = new HashMap();
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64823);origin.put(new Date(), "value");
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64824);JSONArray jsonArray = new JSONArray().fluentAdd(origin);
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64825);jsonArray.getJSONObject(0);
            // now jsonArray is [{154xxxxxxxxx:"value"}]
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64826);assertEquals(1, jsonArray.getJSONObject(0).size());
        } catch (JSONException ex) {
            __CLR4_1_101dzp1dzpluszwbn3.R.inc(64827);error = ex;
        }
        __CLR4_1_101dzp1dzpluszwbn3.R.inc(64828);assertNull(error);
    }finally{__CLR4_1_101dzp1dzpluszwbn3.R.flushNeeded();}}

    public static class Model {
        public int value;
    }
}
