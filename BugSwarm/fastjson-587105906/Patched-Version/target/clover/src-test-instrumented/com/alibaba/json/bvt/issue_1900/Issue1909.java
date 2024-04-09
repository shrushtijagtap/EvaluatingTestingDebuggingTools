/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1900;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.List;

public class Issue1909 extends TestCase {static class __CLR4_5_21dmb1dmblusvnb4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,64324,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21dmb1dmblusvnb4t.R.globalSliceStart(getClass().getName(),64307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1dmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21dmb1dmblusvnb4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_21dmb1dmblusvnb4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1900.Issue1909.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64307,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1dmb() throws Exception{try{__CLR4_5_21dmb1dmblusvnb4t.R.inc(64307);
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64308);JSONArray params = new JSONArray();
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64309);params.add("val1");
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64310);params.add(2);
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64311);ParamRequest pr = new ParamRequest("methodName", "stringID", params);
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64312);System.out.println(JSON.toJSONString(pr));
        __CLR4_5_21dmb1dmblusvnb4t.R.inc(64313);Request paramRequest = JSON.parseObject(JSON.toJSONString(pr), ParamRequest.class);
    }finally{__CLR4_5_21dmb1dmblusvnb4t.R.flushNeeded();}}

    public static class ParamRequest extends Request {
        private String methodName;

        @JSONField(name = "id", ordinal = 3, serialize = true, deserialize = true)
        private Object id;

        private List<Object> params;

        public ParamRequest(String methodName, Object id, List<Object> params) {try{__CLR4_5_21dmb1dmblusvnb4t.R.inc(64314);
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64315);this.methodName = methodName;
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64316);this.id = id;
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64317);this.params = params;
        }finally{__CLR4_5_21dmb1dmblusvnb4t.R.flushNeeded();}}

        public String getMethodName() {try{__CLR4_5_21dmb1dmblusvnb4t.R.inc(64318);
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64319);return methodName;
        }finally{__CLR4_5_21dmb1dmblusvnb4t.R.flushNeeded();}}

        public Object getId() {try{__CLR4_5_21dmb1dmblusvnb4t.R.inc(64320);
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64321);return id;
        }finally{__CLR4_5_21dmb1dmblusvnb4t.R.flushNeeded();}}

        public List<Object> getParams() {try{__CLR4_5_21dmb1dmblusvnb4t.R.inc(64322);
            __CLR4_5_21dmb1dmblusvnb4t.R.inc(64323);return params;
        }finally{__CLR4_5_21dmb1dmblusvnb4t.R.flushNeeded();}}
    }

    public static class Request {

    }
}
