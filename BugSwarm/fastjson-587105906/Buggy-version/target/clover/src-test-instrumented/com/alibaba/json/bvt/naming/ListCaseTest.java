/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.naming;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.List;

/**
 * Created by wenshao on 09/02/2017.
 */
public class ListCaseTest extends TestCase {static class __CLR4_1_101fuf1fufluszwc37{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101fuf1fufluszwc37.R.globalSliceStart(getClass().getName(),67191);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21fuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fuf1fufluszwc37.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fuf1fufluszwc37.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.naming.ListCaseTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67191,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21fuf() throws Exception{try{__CLR4_1_101fuf1fufluszwc37.R.inc(67191);
        __CLR4_1_101fuf1fufluszwc37.R.inc(67192);String result = "{\"code\":\"SUCCESS\",\"msg\":\"success\",\"SUCCESS\":true,\"obj\":[\"10.55.251.213\"]}";
        __CLR4_1_101fuf1fufluszwc37.R.inc(67193);T4QueryResult t4TaskApiResult = JSON.parseObject(result, T4QueryResult.class);
        __CLR4_1_101fuf1fufluszwc37.R.inc(67194);System.out.println(JSON.toJSONString(t4TaskApiResult));

    }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

    public static class Model {
        public List<String> values;
    }

    public static class T4QueryResult {

        @JSONField(name = "OBJ")
        private List<String> obj;

        @JSONField(name = "MSG")
        private String       msg;

        @JSONField(name = "CODE")
        private String       code;

        @JSONField(name = "SUCCESS")
        private Boolean      success;

        public List<String> getObj() {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67195);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67196);return obj;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public void setObj(List<String> obj) {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67197);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67198);this.obj = obj;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public String getMsg() {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67199);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67200);return msg;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public void setMsg(String msg) {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67201);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67202);this.msg = msg;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public String getCode() {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67203);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67204);return code;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67205);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67206);this.code = code;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public Boolean getSuccess() {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67207);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67208);return success;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

        public void setSuccess(Boolean success) {try{__CLR4_1_101fuf1fufluszwc37.R.inc(67209);
            __CLR4_1_101fuf1fufluszwc37.R.inc(67210);this.success = success;
        }finally{__CLR4_1_101fuf1fufluszwc37.R.flushNeeded();}}

    }

}
