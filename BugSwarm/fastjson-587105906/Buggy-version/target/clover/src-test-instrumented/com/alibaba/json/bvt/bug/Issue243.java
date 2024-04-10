/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue243 extends TestCase {static class __CLR4_1_1017xb17xbluszw9tl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,56957,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testSerialize() {__CLR4_1_1017xb17xbluszw9tl.R.globalSliceStart(getClass().getName(),56927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wt9p8517xb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017xb17xbluszw9tl.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017xb17xbluszw9tl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue243.testSerialize",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wt9p8517xb(){try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56927);
        __CLR4_1_1017xb17xbluszw9tl.R.inc(56928);RpcResponse response = new RpcResponse(2, new Object());
        // String json = JSON.toJSONString(response, SerializerFeature.WriteClassName); // codeA with WriteClassName,
        // requestId is not ending with 'L'
        __CLR4_1_1017xb17xbluszw9tl.R.inc(56929);String json = response.toCommandJson(); // codeA with WriteClassName, requestId is ending with 'L', and trouble
                                                // other json framework
        __CLR4_1_1017xb17xbluszw9tl.R.inc(56930);System.out.println(json);
        
        __CLR4_1_1017xb17xbluszw9tl.R.inc(56931);String json2 = JSON.toJSONString(response, SerializerFeature.BeanToArray, SerializerFeature.WriteClassName, SerializerFeature.NotWriteRootClassName);
        __CLR4_1_1017xb17xbluszw9tl.R.inc(56932);System.out.println(json2);
    }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

    public static class RpcResponse {

        private int        msgType     = 50;
        private long       requestId   = 0;
        private JSONObject details     = new JSONObject();
        private Object[]   yieldResult = new Object[1];

        public RpcResponse(){try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56933);

        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public RpcResponse(long requestId, Object result){try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56934);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56935);this.requestId = requestId;
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56936);yieldResult[0] = result;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public int getMsgType() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56937);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56938);return msgType;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public void setMsgType(int msgType) {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56939);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56940);this.msgType = msgType;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public long getRequestId() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56941);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56942);return requestId;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public void setRequestId(long requestId) {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56943);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56944);this.requestId = requestId;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public JSONObject getDetails() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56945);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56946);return details;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public void setDetails(JSONObject details) {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56947);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56948);this.details = details;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public Object[] getYieldResult() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56949);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56950);return yieldResult;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public void setYieldResult(String[] yieldResult) {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56951);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56952);this.yieldResult = yieldResult;
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        protected Object[] fieldToArray() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56953);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56954);return new Object[] { msgType, requestId, details, yieldResult };
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}

        public String toCommandJson() {try{__CLR4_1_1017xb17xbluszw9tl.R.inc(56955);
            __CLR4_1_1017xb17xbluszw9tl.R.inc(56956);return JSON.toJSONString(fieldToArray(), SerializerFeature.WriteClassName);
        }finally{__CLR4_1_1017xb17xbluszw9tl.R.flushNeeded();}}
    }
}
