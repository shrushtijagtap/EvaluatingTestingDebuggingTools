/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.io.Serializable;

/**
 * Created by wenshao on 09/02/2017.
 */
public class Bug_for_xujin_int extends TestCase {static class __CLR4_1_1016wx16wxluszw93x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,55648,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_xujin() throws Exception {__CLR4_1_1016wx16wxluszw93x.R.globalSliceStart(getClass().getName(),55617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ptttyu16wx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016wx16wxluszw93x.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016wx16wxluszw93x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_xujin_int.test_for_xujin",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55617,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ptttyu16wx() throws Exception{try{__CLR4_1_1016wx16wxluszw93x.R.inc(55617);
        __CLR4_1_1016wx16wxluszw93x.R.inc(55618);String jsonText="{\"module\":{\"auditStatus\":\"PENDING_VERIFICATION\",\"contactId\":\"asdfasdf\",\n\"errorMsg\":\"\u4e2d\u56fd\"},\"success\":1}\n";
        __CLR4_1_1016wx16wxluszw93x.R.inc(55619);System.out.println(JSON.VERSION);
        __CLR4_1_1016wx16wxluszw93x.R.inc(55620);ResultDTO resultDTO = (ResultDTO) JSON.parseObject(jsonText, ResultDTO.class);
    }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

    public static class ResultDTO<T extends Serializable> implements Serializable {
        private static final long serialVersionUID = 3682481175041925854L;
        private static final String DEFAULT_ERR_CODE = "xin.unknown.error";
        private String errorMsg;
        private String errorCode;
        private int success;
        private T module;



        public ResultDTO() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55621);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55622);buildSuccessResult();
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public ResultDTO(T obj) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55623);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55624);this.success = 1;
            __CLR4_1_1016wx16wxluszw93x.R.inc(55625);this.module = obj;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildSuccessResult() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55626);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55627);return new ResultDTO((Serializable)null);
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public static <T extends Serializable> ResultDTO<T> buildSuccessResult(T obj) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55628);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55629);return new ResultDTO(obj);
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}


        public String getErrorMsg() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55630);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55631);return this.errorMsg;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public void setErrorMsg(String errorMsg) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55632);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55633);this.errorMsg = errorMsg;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public String getErrorCode() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55634);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55635);return this.errorCode;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public void setErrorCode(String errorCode) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55636);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55637);this.errorCode = errorCode;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public int isSuccess() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55638);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55639);return this.success;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public void setSuccess(int success) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55640);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55641);this.success = success;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public T getModule() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55642);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55643);return this.module;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public void setModule(T module) {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55644);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55645);this.module = module;
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}

        public String toJsonString() {try{__CLR4_1_1016wx16wxluszw93x.R.inc(55646);
            __CLR4_1_1016wx16wxluszw93x.R.inc(55647);return JSON.toJSONString(this);
        }finally{__CLR4_1_1016wx16wxluszw93x.R.flushNeeded();}}
    }
}
