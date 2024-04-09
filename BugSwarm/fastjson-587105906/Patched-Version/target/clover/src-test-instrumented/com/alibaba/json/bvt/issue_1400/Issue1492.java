/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.io.Serializable;

public class Issue1492 extends TestCase {static class __CLR4_5_21bk41bk4lusvna6t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61670,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21bk41bk4lusvna6t.R.globalSliceStart(getClass().getName(),61636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1bk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bk41bk4lusvna6t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bk41bk4lusvna6t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1492.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61636,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1bk4() throws Exception{try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61636);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61637);DubboResponse resp = new DubboResponse();

        // test for JSONObject
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61638);JSONObject obj = new JSONObject();
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61639);obj.put("key1","value1");
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61640);obj.put("key2","value2");
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61641);resp.setData(obj);

        __CLR4_5_21bk41bk4lusvna6t.R.inc(61642);String str = JSON.toJSONString(resp);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61643);System.out.println(str);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61644);DubboResponse resp1 = JSON.parseObject(str, DubboResponse.class);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61645);assertEquals(str, JSON.toJSONString(resp1));

        // test for JSONArray
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61646);JSONArray arr = new JSONArray();
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61647);arr.add("key1");
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61648);arr.add("key2");
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61649);resp.setData(arr);

        __CLR4_5_21bk41bk4lusvna6t.R.inc(61650);String str2 = JSON.toJSONString(resp);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61651);System.out.println(str2);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61652);DubboResponse resp2 = JSON.parseObject(str2, DubboResponse.class);
        __CLR4_5_21bk41bk4lusvna6t.R.inc(61653);assertEquals(str2, JSON.toJSONString(resp2));

    }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

    public static final class DubboResponse implements Serializable {

        private String message;

        private String error;

        private JSON data;

        private boolean success;

        public String getMessage() {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61654);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61655);return message;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public void setMessage(String message) {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61656);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61657);this.message = message;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public String getError() {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61658);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61659);return error;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public void setError(String error) {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61660);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61661);this.error = error;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public JSON getData() {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61662);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61663);return data;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public void setData(JSON data) {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61664);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61665);this.data = data;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public boolean isSuccess() {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61666);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61667);return success;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}

        public void setSuccess(boolean success) {try{__CLR4_5_21bk41bk4lusvna6t.R.inc(61668);
            __CLR4_5_21bk41bk4lusvna6t.R.inc(61669);this.success = success;
        }finally{__CLR4_5_21bk41bk4lusvna6t.R.flushNeeded();}}
    }
}
