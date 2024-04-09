/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.List;

public class Issue1570_private extends TestCase {static class __CLR4_1_101brn1brnlusqka4n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,61927,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101brn1brnlusqka4n.R.globalSliceStart(getClass().getName(),61907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1brn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101brn1brnlusqka4n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101brn1brnlusqka4n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1570_private.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61907,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1brn() throws Exception{try{__CLR4_1_101brn1brnlusqka4n.R.inc(61907);
        __CLR4_1_101brn1brnlusqka4n.R.inc(61908);Model model = new Model();
        __CLR4_1_101brn1brnlusqka4n.R.inc(61909);assertEquals("{}", JSON.toJSONString(model, SerializerFeature.WriteNullBooleanAsFalse));
        __CLR4_1_101brn1brnlusqka4n.R.inc(61910);assertEquals("{\"value\":\"\"}", JSON.toJSONString(model, SerializerFeature.WriteNullStringAsEmpty));
    }finally{__CLR4_1_101brn1brnlusqka4n.R.flushNeeded();}}

    public void test_for_issue_int() throws Exception {__CLR4_1_101brn1brnlusqka4n.R.globalSliceStart(getClass().getName(),61911);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ai1uel1brr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101brn1brnlusqka4n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101brn1brnlusqka4n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1570_private.test_for_issue_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61911,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ai1uel1brr() throws Exception{try{__CLR4_1_101brn1brnlusqka4n.R.inc(61911);
        __CLR4_1_101brn1brnlusqka4n.R.inc(61912);ModelInt model = new ModelInt();
        __CLR4_1_101brn1brnlusqka4n.R.inc(61913);assertEquals("{}", JSON.toJSONString(model, SerializerFeature.WriteNullBooleanAsFalse));
        __CLR4_1_101brn1brnlusqka4n.R.inc(61914);assertEquals("{\"value\":0}", JSON.toJSONString(model, SerializerFeature.WriteNullNumberAsZero));
    }finally{__CLR4_1_101brn1brnlusqka4n.R.flushNeeded();}}

    public void test_for_issue_long() throws Exception {__CLR4_1_101brn1brnlusqka4n.R.globalSliceStart(getClass().getName(),61915);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jjh6q41brv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101brn1brnlusqka4n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101brn1brnlusqka4n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1570_private.test_for_issue_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61915,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jjh6q41brv() throws Exception{try{__CLR4_1_101brn1brnlusqka4n.R.inc(61915);
        __CLR4_1_101brn1brnlusqka4n.R.inc(61916);ModelLong model = new ModelLong();
        __CLR4_1_101brn1brnlusqka4n.R.inc(61917);assertEquals("{}", JSON.toJSONString(model, SerializerFeature.WriteNullBooleanAsFalse));
        __CLR4_1_101brn1brnlusqka4n.R.inc(61918);assertEquals("{\"value\":0}", JSON.toJSONString(model, SerializerFeature.WriteNullNumberAsZero));
    }finally{__CLR4_1_101brn1brnlusqka4n.R.flushNeeded();}}

    public void test_for_issue_bool() throws Exception {__CLR4_1_101brn1brnlusqka4n.R.globalSliceStart(getClass().getName(),61919);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gzhh4q1brz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101brn1brnlusqka4n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101brn1brnlusqka4n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1570_private.test_for_issue_bool",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61919,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gzhh4q1brz() throws Exception{try{__CLR4_1_101brn1brnlusqka4n.R.inc(61919);
        __CLR4_1_101brn1brnlusqka4n.R.inc(61920);ModelBool model = new ModelBool();
        __CLR4_1_101brn1brnlusqka4n.R.inc(61921);assertEquals("{}", JSON.toJSONString(model, SerializerFeature.WriteNullNumberAsZero));
        __CLR4_1_101brn1brnlusqka4n.R.inc(61922);assertEquals("{\"value\":false}", JSON.toJSONString(model, SerializerFeature.WriteNullBooleanAsFalse));
    }finally{__CLR4_1_101brn1brnlusqka4n.R.flushNeeded();}}

    public void test_for_issue_list() throws Exception {__CLR4_1_101brn1brnlusqka4n.R.globalSliceStart(getClass().getName(),61923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a3j8z21bs3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101brn1brnlusqka4n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101brn1brnlusqka4n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1570_private.test_for_issue_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a3j8z21bs3() throws Exception{try{__CLR4_1_101brn1brnlusqka4n.R.inc(61923);
        __CLR4_1_101brn1brnlusqka4n.R.inc(61924);ModelList model = new ModelList();
        __CLR4_1_101brn1brnlusqka4n.R.inc(61925);assertEquals("{}", JSON.toJSONString(model, SerializerFeature.WriteNullNumberAsZero));
        __CLR4_1_101brn1brnlusqka4n.R.inc(61926);assertEquals("{\"value\":[]}", JSON.toJSONString(model, SerializerFeature.WriteNullListAsEmpty));
    }finally{__CLR4_1_101brn1brnlusqka4n.R.flushNeeded();}}

    private static class Model {
        public String value;
    }

    private static class ModelInt {
        public Integer value;
    }

    private static class ModelLong {
        public Long value;
    }

    private static class ModelBool {
        public Boolean value;
    }

    private static class ModelList {
        public List value;
    }
}
