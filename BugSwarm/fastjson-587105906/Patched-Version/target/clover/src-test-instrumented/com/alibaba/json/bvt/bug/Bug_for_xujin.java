/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.io.Serializable;

/**
 * Created by wenshao on 09/02/2017.
 */
public class Bug_for_xujin extends TestCase {static class __CLR4_5_215vq15vqlusyjrze{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,54320,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_xujin() throws Exception {__CLR4_5_215vq15vqlusyjrze.R.globalSliceStart(getClass().getName(),54278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ptttyu15vq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215vq15vqlusyjrze.R.rethrow($CLV_t2$);}finally{__CLR4_5_215vq15vqlusyjrze.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_xujin.test_for_xujin",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ptttyu15vq() throws Exception{try{__CLR4_5_215vq15vqlusyjrze.R.inc(54278);
        __CLR4_5_215vq15vqlusyjrze.R.inc(54279);String jsonText="{\"module\":{\"auditStatus\":\"PENDING_VERIFICATION\",\"contactId\":\"asdfasdf\",\n\"errorMsg\":\"\u4e2d\u56fd\"},\"success\":true}\n";
        __CLR4_5_215vq15vqlusyjrze.R.inc(54280);System.out.println(JSON.VERSION);
        __CLR4_5_215vq15vqlusyjrze.R.inc(54281);ResultDTO resultDTO = (ResultDTO) JSON.parseObject(jsonText, ResultDTO.class);
    }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

    public static class ResultDTO<T extends Serializable> implements Serializable {
        private static final long serialVersionUID = 3682481175041925854L;
        private static final String DEFAULT_ERR_CODE = "xin.unknown.error";
        private String errorMsg;
        private String errorCode;
        private boolean success;
        private T module;

        public ResultDTO(String errorCode, String errorMsg, T obj) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54282);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54283);this.errorCode = errorCode;
            __CLR4_5_215vq15vqlusyjrze.R.inc(54284);this.errorMsg = errorMsg;
            __CLR4_5_215vq15vqlusyjrze.R.inc(54285);this.success = false;
            __CLR4_5_215vq15vqlusyjrze.R.inc(54286);this.module = obj;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public ResultDTO() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54287);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54288);buildSuccessResult();
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public ResultDTO(T obj) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54289);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54290);this.success = true;
            __CLR4_5_215vq15vqlusyjrze.R.inc(54291);this.module = obj;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildSuccessResult() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54292);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54293);return new ResultDTO((Serializable)null);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildSuccessResult(T obj) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54294);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54295);return new ResultDTO(obj);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errCode, String errMsg, T obj) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54296);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54297);return new ResultDTO(errCode, errMsg, obj);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errCode, String errMsg) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54298);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54299);return new ResultDTO(errCode, errMsg, (Serializable)null);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildFailedResult(String errMsg) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54300);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54301);return new ResultDTO("xin.unknown.error", errMsg, (Serializable)null);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public String getErrorMsg() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54302);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54303);return this.errorMsg;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public void setErrorMsg(String errorMsg) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54304);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54305);this.errorMsg = errorMsg;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public String getErrorCode() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54306);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54307);return this.errorCode;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public void setErrorCode(String errorCode) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54308);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54309);this.errorCode = errorCode;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public boolean isSuccess() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54310);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54311);return this.success;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public void setSuccess(boolean success) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54312);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54313);this.success = success;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public T getModule() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54314);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54315);return this.module;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public void setModule(T module) {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54316);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54317);this.module = module;
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}

        public String toJsonString() {try{__CLR4_5_215vq15vqlusyjrze.R.inc(54318);
            __CLR4_5_215vq15vqlusyjrze.R.inc(54319);return JSON.toJSONString(this);
        }finally{__CLR4_5_215vq15vqlusyjrze.R.flushNeeded();}}
    }
}
