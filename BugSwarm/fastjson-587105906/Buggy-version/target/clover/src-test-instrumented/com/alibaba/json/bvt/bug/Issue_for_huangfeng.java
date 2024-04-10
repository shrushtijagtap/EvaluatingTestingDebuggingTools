/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

/**
 * Created by wenshao on 16/02/2017.
 */
public class Issue_for_huangfeng extends TestCase {static class __CLR4_1_1018rp18rpluszwa24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_huangfeng() throws Exception {__CLR4_1_1018rp18rpluszwa24.R.globalSliceStart(getClass().getName(),58021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b86j9318rp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018rp18rpluszwa24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018rp18rpluszwa24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_for_huangfeng.test_for_huangfeng",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b86j9318rp() throws Exception{try{__CLR4_1_1018rp18rpluszwa24.R.inc(58021);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58022);String json = "{\"success\":\"Y\"}";

        __CLR4_1_1018rp18rpluszwa24.R.inc(58023);Model model = JSON.parseObject(json, Model.class);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58024);assertTrue(model.isSuccess());
    }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

    public void test_for_huangfeng_t() throws Exception {__CLR4_1_1018rp18rpluszwa24.R.globalSliceStart(getClass().getName(),58025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g52a5a18rt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018rp18rpluszwa24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018rp18rpluszwa24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_for_huangfeng.test_for_huangfeng_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58025,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g52a5a18rt() throws Exception{try{__CLR4_1_1018rp18rpluszwa24.R.inc(58025);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58026);String json = "{\"success\":\"T\"}";

        __CLR4_1_1018rp18rpluszwa24.R.inc(58027);Model model = JSON.parseObject(json, Model.class);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58028);assertTrue(model.isSuccess());
    }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

    public void test_for_huangfeng_is_t() throws Exception {__CLR4_1_1018rp18rpluszwa24.R.globalSliceStart(getClass().getName(),58029);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108r6jy518rx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018rp18rpluszwa24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018rp18rpluszwa24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_for_huangfeng.test_for_huangfeng_is_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58029,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108r6jy518rx() throws Exception{try{__CLR4_1_1018rp18rpluszwa24.R.inc(58029);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58030);String json = "{\"isSuccess\":\"T\"}";

        __CLR4_1_1018rp18rpluszwa24.R.inc(58031);Model model = JSON.parseObject(json, Model.class);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58032);assertTrue(model.isSuccess());
    }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

    public void test_for_huangfeng_false() throws Exception {__CLR4_1_1018rp18rpluszwa24.R.globalSliceStart(getClass().getName(),58033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jo5ln718s1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018rp18rpluszwa24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018rp18rpluszwa24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_for_huangfeng.test_for_huangfeng_false",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58033,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jo5ln718s1() throws Exception{try{__CLR4_1_1018rp18rpluszwa24.R.inc(58033);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58034);String json = "{\"success\":\"N\"}";

        __CLR4_1_1018rp18rpluszwa24.R.inc(58035);Model model = JSON.parseObject(json, Model.class);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58036);assertFalse(model.isSuccess());
    }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

    public void test_for_huangfeng_false_f() throws Exception {__CLR4_1_1018rp18rpluszwa24.R.globalSliceStart(getClass().getName(),58037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ory7jo18s5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018rp18rpluszwa24.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018rp18rpluszwa24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue_for_huangfeng.test_for_huangfeng_false_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ory7jo18s5() throws Exception{try{__CLR4_1_1018rp18rpluszwa24.R.inc(58037);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58038);String json = "{\"success\":\"F\"}";

        __CLR4_1_1018rp18rpluszwa24.R.inc(58039);Model model = JSON.parseObject(json, Model.class);
        __CLR4_1_1018rp18rpluszwa24.R.inc(58040);assertFalse(model.isSuccess());
    }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

    public static class Model {
        private boolean success;

        public boolean isSuccess() {try{__CLR4_1_1018rp18rpluszwa24.R.inc(58041);
            __CLR4_1_1018rp18rpluszwa24.R.inc(58042);return success;
        }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}

        public void setSuccess(boolean success) {try{__CLR4_1_1018rp18rpluszwa24.R.inc(58043);
            __CLR4_1_1018rp18rpluszwa24.R.inc(58044);this.success = success;
        }finally{__CLR4_1_1018rp18rpluszwa24.R.flushNeeded();}}
    }
}
