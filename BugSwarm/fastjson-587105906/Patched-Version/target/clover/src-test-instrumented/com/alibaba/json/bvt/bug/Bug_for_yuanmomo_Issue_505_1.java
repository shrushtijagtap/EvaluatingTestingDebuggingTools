/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.List;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_yuanmomo_Issue_505_1 extends TestCase {static class __CLR4_5_2171w171wlusvn7gi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55823,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_2171w171wlusvn7gi.R.globalSliceStart(getClass().getName(),55796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb171w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2171w171wlusvn7gi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2171w171wlusvn7gi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_yuanmomo_Issue_505_1.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55796,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb171w() throws Exception{try{__CLR4_5_2171w171wlusvn7gi.R.inc(55796);
        __CLR4_5_2171w171wlusvn7gi.R.inc(55797);String userStr1 = "{\"id\":\"qfHdV0ez0N10\", \"ext\":{\"model\": \"10000\"} }";
        __CLR4_5_2171w171wlusvn7gi.R.inc(55798);User user = JSON.parseObject(userStr1, User.class);
        __CLR4_5_2171w171wlusvn7gi.R.inc(55799);System.out.println(user);
    }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_2171w171wlusvn7gi.R.globalSliceStart(getClass().getName(),55800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn51720();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2171w171wlusvn7gi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2171w171wlusvn7gi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_yuanmomo_Issue_505_1.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn51720() throws Exception{try{__CLR4_5_2171w171wlusvn7gi.R.inc(55800);
        __CLR4_5_2171w171wlusvn7gi.R.inc(55801);String text = "{\"model\":\"10002\" }";
        __CLR4_5_2171w171wlusvn7gi.R.inc(55802);UserExt ext = JSON.parseObject(text, UserExt.class);
    }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_5_2171w171wlusvn7gi.R.globalSliceStart(getClass().getName(),55803);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo1723();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2171w171wlusvn7gi.R.rethrow($CLV_t2$);}finally{__CLR4_5_2171w171wlusvn7gi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_yuanmomo_Issue_505_1.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55803,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo1723() throws Exception{try{__CLR4_5_2171w171wlusvn7gi.R.inc(55803);
        __CLR4_5_2171w171wlusvn7gi.R.inc(55804);String userStr2 = "{\"id\":\"qfHdV0ez0N10\", \"ext\":{\"model\":\"10000\" } }";

        __CLR4_5_2171w171wlusvn7gi.R.inc(55805);User user = JSON.parseObject(userStr2, User.class);
        __CLR4_5_2171w171wlusvn7gi.R.inc(55806);System.out.println(user);
    }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

    public static class User {

        private String  id;
        private UserExt ext;

        public String getId() {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55807);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55808);return id;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        public void setId(String id) {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55809);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55810);this.id = id;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        public UserExt getExt() {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55811);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55812);return ext;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        public void setExt(UserExt ext) {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55813);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55814);this.ext = ext;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55815);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55816);return "User{" + "id='" + id + '\'' + ", ext=" + ext + '}';
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}
    }

    public static class UserExt {

        private String model;

        public String getModel() {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55817);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55818);return model;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        public void setModel(String model) {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55819);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55820);this.model = model;
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}

        public String toString() {try{__CLR4_5_2171w171wlusvn7gi.R.inc(55821);
            __CLR4_5_2171w171wlusvn7gi.R.inc(55822);return "UserExt{model=" + model + "}";
        }finally{__CLR4_5_2171w171wlusvn7gi.R.flushNeeded();}}
    }
}
