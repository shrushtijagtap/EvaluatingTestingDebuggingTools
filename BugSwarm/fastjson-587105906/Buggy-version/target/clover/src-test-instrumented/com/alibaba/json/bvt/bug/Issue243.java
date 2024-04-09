/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue243 extends TestCase {static class __CLR4_1_1016z316z3lusqk6te{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,55725,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testSerialize() {__CLR4_1_1016z316z3lusqk6te.R.globalSliceStart(getClass().getName(),55695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wt9p8516z3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016z316z3lusqk6te.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016z316z3lusqk6te.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue243.testSerialize",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55695,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wt9p8516z3(){try{__CLR4_1_1016z316z3lusqk6te.R.inc(55695);
        __CLR4_1_1016z316z3lusqk6te.R.inc(55696);RpcResponse response = new RpcResponse(2, new Object());
        // String json = JSON.toJSONString(response, SerializerFeature.WriteClassName); // codeA with WriteClassName,
        // requestId is not ending with 'L'
        __CLR4_1_1016z316z3lusqk6te.R.inc(55697);String json = response.toCommandJson(); // codeA with WriteClassName, requestId is ending with 'L', and trouble
                                                // other json framework
        __CLR4_1_1016z316z3lusqk6te.R.inc(55698);System.out.println(json);
        
        __CLR4_1_1016z316z3lusqk6te.R.inc(55699);String json2 = JSON.toJSONString(response, SerializerFeature.BeanToArray, SerializerFeature.WriteClassName, SerializerFeature.NotWriteRootClassName);
        __CLR4_1_1016z316z3lusqk6te.R.inc(55700);System.out.println(json2);
    }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

    public static class RpcResponse {

        private int        msgType     = 50;
        private long       requestId   = 0;
        private JSONObject details     = new JSONObject();
        private Object[]   yieldResult = new Object[1];

        public RpcResponse(){try{__CLR4_1_1016z316z3lusqk6te.R.inc(55701);

        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public RpcResponse(long requestId, Object result){try{__CLR4_1_1016z316z3lusqk6te.R.inc(55702);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55703);this.requestId = requestId;
            __CLR4_1_1016z316z3lusqk6te.R.inc(55704);yieldResult[0] = result;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public int getMsgType() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55705);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55706);return msgType;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public void setMsgType(int msgType) {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55707);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55708);this.msgType = msgType;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public long getRequestId() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55709);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55710);return requestId;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public void setRequestId(long requestId) {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55711);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55712);this.requestId = requestId;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public JSONObject getDetails() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55713);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55714);return details;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public void setDetails(JSONObject details) {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55715);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55716);this.details = details;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public Object[] getYieldResult() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55717);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55718);return yieldResult;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public void setYieldResult(String[] yieldResult) {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55719);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55720);this.yieldResult = yieldResult;
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        protected Object[] fieldToArray() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55721);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55722);return new Object[] { msgType, requestId, details, yieldResult };
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}

        public String toCommandJson() {try{__CLR4_1_1016z316z3lusqk6te.R.inc(55723);
            __CLR4_1_1016z316z3lusqk6te.R.inc(55724);return JSON.toJSONString(fieldToArray(), SerializerFeature.WriteClassName);
        }finally{__CLR4_1_1016z316z3lusqk6te.R.flushNeeded();}}
    }
}
