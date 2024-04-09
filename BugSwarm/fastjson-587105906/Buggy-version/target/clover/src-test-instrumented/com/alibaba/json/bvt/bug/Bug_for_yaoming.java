/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvt.bug.Bug_for_yaoming.SimpleHttpReuslt.ErrorMessage;

public class Bug_for_yaoming extends TestCase {static class __CLR4_1_10162b162blusqk5v3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,54546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bug() throws Exception {__CLR4_1_10162b162blusqk5v3.R.globalSliceStart(getClass().getName(),54515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a1x2ge162b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10162b162blusqk5v3.R.rethrow($CLV_t2$);}finally{__CLR4_1_10162b162blusqk5v3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_yaoming.test_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),54515,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a1x2ge162b() throws Exception{try{__CLR4_1_10162b162blusqk5v3.R.inc(54515);
        __CLR4_1_10162b162blusqk5v3.R.inc(54516);SimpleHttpReuslt v = new SimpleHttpReuslt();
        __CLR4_1_10162b162blusqk5v3.R.inc(54517);v.setErrorMessage(new ArrayList<ErrorMessage>());
        __CLR4_1_10162b162blusqk5v3.R.inc(54518);v.getErrorMessage().add(new ErrorMessage());
        __CLR4_1_10162b162blusqk5v3.R.inc(54519);String text = JSON.toJSONString(v);
        __CLR4_1_10162b162blusqk5v3.R.inc(54520);text = "{\"content\":{\"versionModelList\":[{\"version\":\"260\",\"currentVersion\":true,\"versionComment\":\"testVersion\",\"warSize\":\"43130185\",\"appIdentifier\":\"parent\",\"uploadTime\":1375850777000},{\"version\":\"247\",\"currentVersion\":false,\"versionComment\":\"testVersion\",\"warSize\":\"43130186\",\"appIdentifier\":\"parent\",\"uploadTime\":1375634817000},{\"version\":\"246\",\"currentVersion\":false,\"versionComment\":\"testVersion\",\"warSize\":\"43130186\",\"appIdentifier\":\"parent\",\"uploadTime\":1375613193000},{\"version\":\"245\",\"currentVersion\":false,\"versionComment\":\"testVersion\",\"warSize\":\"43130185\",\"appIdentifier\":\"parent\",\"uploadTime\":1375591593000},{\"version\":\"244\",\"currentVersion\":false,\"versionComment\":\"testVersion\",\"warSize\":\"43130186\",\"appIdentifier\":\"parent\",\"uploadTime\":1375569999000},{\"version\":\"243\",\"currentVersion\":false,\"versionComment\":\"testVersion\",\"warSize\":\"43130185\",\"appIdentifier\":\"parent\",\"uploadTime\":1375548418000}],\"exceptionCode\":0},\"hasError\":false}";
        __CLR4_1_10162b162blusqk5v3.R.inc(54521);JSON.parseObject(text, SimpleHttpReuslt.class);
    }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

    public static class SimpleHttpReuslt {

        private String             content;
        private Boolean            hasError;
        private List<ErrorMessage> errorMessage;

        public String getContent() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54522);
            __CLR4_1_10162b162blusqk5v3.R.inc(54523);return content;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public Boolean isHasError() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54524);
            __CLR4_1_10162b162blusqk5v3.R.inc(54525);return hasError;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public void setContent(String content) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54526);
            __CLR4_1_10162b162blusqk5v3.R.inc(54527);this.content = content;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public void setHasError(Boolean hasError) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54528);
            __CLR4_1_10162b162blusqk5v3.R.inc(54529);this.hasError = hasError;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public List<ErrorMessage> getErrorMessage() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54530);
            __CLR4_1_10162b162blusqk5v3.R.inc(54531);return errorMessage;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public void setErrorMessage(List<ErrorMessage> errorMessage) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54532);
            __CLR4_1_10162b162blusqk5v3.R.inc(54533);this.errorMessage = errorMessage;
        }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        public static class ErrorMessage {

            private String field;
            private String code;
            private String msg;

            public String getField() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54534);
                __CLR4_1_10162b162blusqk5v3.R.inc(54535);return field;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

            public String getCode() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54536);
                __CLR4_1_10162b162blusqk5v3.R.inc(54537);return code;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

            public String getMsg() {try{__CLR4_1_10162b162blusqk5v3.R.inc(54538);
                __CLR4_1_10162b162blusqk5v3.R.inc(54539);return msg;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

            public void setField(String field) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54540);
                __CLR4_1_10162b162blusqk5v3.R.inc(54541);this.field = field;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

            public void setCode(String code) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54542);
                __CLR4_1_10162b162blusqk5v3.R.inc(54543);this.code = code;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

            public void setMsg(String msg) {try{__CLR4_1_10162b162blusqk5v3.R.inc(54544);
                __CLR4_1_10162b162blusqk5v3.R.inc(54545);this.msg = msg;
            }finally{__CLR4_1_10162b162blusqk5v3.R.flushNeeded();}}

        }
    }

}
