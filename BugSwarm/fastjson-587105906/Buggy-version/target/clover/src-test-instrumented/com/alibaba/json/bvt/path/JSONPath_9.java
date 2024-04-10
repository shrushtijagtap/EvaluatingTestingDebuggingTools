/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class JSONPath_9 extends TestCase {static class __CLR4_1_101pgk1pgkluszwe8e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,79677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_paths() throws Exception {__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceStart(getClass().getName(),79652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hsqpjs1pgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pgk1pgkluszwe8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_9.test_paths",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hsqpjs1pgk() throws Exception{try{__CLR4_1_101pgk1pgkluszwe8e.R.inc(79652);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79653);Model m = new Model();
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79654);m.f0 = 101;
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79655);m.f1 = 102;

        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79656);Map<String, Object> paths = JSONPath.paths(m);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79657);assertEquals(3, paths.size());
    }finally{__CLR4_1_101pgk1pgkluszwe8e.R.flushNeeded();}}

    public void test_paths_1() throws Exception {__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceStart(getClass().getName(),79658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10idxhei1pgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pgk1pgkluszwe8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_9.test_paths_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79658,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10idxhei1pgq() throws Exception{try{__CLR4_1_101pgk1pgkluszwe8e.R.inc(79658);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79659);Map map = new HashMap();
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79660);map.put("f0", 1001);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79661);map.put("f1", 1002);

        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79662);Map<String, Object> paths = JSONPath.paths(map);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79663);assertEquals(3, paths.size());
    }finally{__CLR4_1_101pgk1pgkluszwe8e.R.flushNeeded();}}

    public void test_paths_2() throws Exception {__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceStart(getClass().getName(),79664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmxg6z1pgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pgk1pgkluszwe8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_9.test_paths_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmxg6z1pgw() throws Exception{try{__CLR4_1_101pgk1pgkluszwe8e.R.inc(79664);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79665);Map map = new HashMap();
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79666);map.put("f0", 1001);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79667);map.put("f1", 1002);

        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79668);JSONPath path = new JSONPath("$.f0");
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79669);assertEquals("$.f0", path.getPath());
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79670);assertEquals(1001, path.eval(map));

        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79671);path.remove(null);
    }finally{__CLR4_1_101pgk1pgkluszwe8e.R.flushNeeded();}}

    public void test_paths_3() throws Exception {__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceStart(getClass().getName(),79672);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ovxezg1ph4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pgk1pgkluszwe8e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pgk1pgkluszwe8e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_9.test_paths_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79672,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ovxezg1ph4() throws Exception{try{__CLR4_1_101pgk1pgkluszwe8e.R.inc(79672);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79673);JSONPath.paths(null);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79674);JSONPath.paths(1);
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79675);JSONPath.paths("1");
        __CLR4_1_101pgk1pgkluszwe8e.R.inc(79676);JSONPath.paths(TimeUnit.DAYS);
    }finally{__CLR4_1_101pgk1pgkluszwe8e.R.flushNeeded();}}

    public static class Model {
        public Integer f0;
        public Integer f1;

    }

//    public void test_path_2() throws Exception {
////        File file = new File("/Users/wenshao/Downloads/test");
////        String json = FileUtils.readFileToString(file);
//        String json = "{\"returnObj\":[{\"$ref\":\"$.subInvokes.com\\\\.alipay\\\\.cif\\\\.user\\\\.UserInfoQueryService\\\\@findUserInfosByCardNo\\\\(String[])[0].response[0]\"}]}";
//        JSON.parseObject(json);
//    }

}
