/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class NoneStringKeyTest extends TestCase {static class __CLR4_5_21sa61sa6lusyjuzn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21sa6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21sa6() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83310);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83311);Map map = new HashMap();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83312);map.put(1, 101);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83313);Assert.assertEquals("{1:101}", JSON.toJSONString(map));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83314);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1saa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83314,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1saa() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83314);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83315);Map map = new HashMap();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83316);map.put(1, 101);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83317);Assert.assertEquals("{\"1\":101}", JSON.toJSONString(map, SerializerFeature.BrowserCompatible));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83318);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441sae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83318,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441sae() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83318);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83319);Map map = new HashMap();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83320);map.put(1, 101);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83321);Assert.assertEquals("{\"1\":101}", JSON.toJSONString(map, SerializerFeature.WriteNonStringKeyAsString));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public void test_null_0() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gp3btg1sai();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_null_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gp3btg1sai() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83322);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83323);Map map = new HashMap();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83324);map.put(null, 101);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83325);Assert.assertEquals("{null:101}", JSON.toJSONString(map));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1sam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1sam() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83326);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83327);Map map = new HashMap();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83328);map.put(null, 101);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83329);Assert.assertEquals("{\"null\":101}", JSON.toJSONString(map, SerializerFeature.WriteNonStringKeyAsString));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceStart(getClass().getName(),83330);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61saq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sa61sa6lusyjuzn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sa61sa6lusyjuzn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.NoneStringKeyTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83330,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61saq() throws Exception{try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83330);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83331);SubjectDTO dto = new SubjectDTO();
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83332);dto.getResults().put(3, new Result());

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83333);String json = JSON.toJSONString(dto);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83334);assertEquals("{\"results\":{3:{}}}", json);

        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83335);SubjectDTO dto2 = JSON.parseObject(json, SubjectDTO.class, Feature.NonStringKeyAsString);
        __CLR4_5_21sa61sa6lusyjuzn.R.inc(83336);System.out.println(JSON.toJSONString(dto2.getResults()));
    }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}

    public static class Result {

    }

    public static class SubjectDTO {
        private Map<Integer, Result> results = new HashMap<Integer, Result>();

        public Map<Integer, Result> getResults() {try{__CLR4_5_21sa61sa6lusyjuzn.R.inc(83337);
            __CLR4_5_21sa61sa6lusyjuzn.R.inc(83338);return results;
        }finally{__CLR4_5_21sa61sa6lusyjuzn.R.flushNeeded();}}
    }
}
