/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class DefaultObjectDeserializerTest5 extends TestCase {static class __CLR4_5_21lm61lm6lusvne85{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,74703,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1lm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1lm6() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74670);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74671);Exception error = null;
        __CLR4_5_21lm61lm6lusvne85.R.inc(74672);try {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74673);JSON.parseObject("[]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74674);error = ex;
        }
        __CLR4_5_21lm61lm6lusvne85.R.inc(74675);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1lmc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1lmc() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74676);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74677);Exception error = null;
        __CLR4_5_21lm61lm6lusvne85.R.inc(74678);try {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74679);JSON.parseObject(",]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74680);error = ex;
        }
        __CLR4_5_21lm61lm6lusvne85.R.inc(74681);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1lmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1lmi() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74682);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74683);Exception error = null;
        __CLR4_5_21lm61lm6lusvne85.R.inc(74684);try {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74685);JSON.parseObject("[{},{\"$ref\":0}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74686);error = ex;
        }
        __CLR4_5_21lm61lm6lusvne85.R.inc(74687);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1lmo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1lmo() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74688);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74689);Exception error = null;
        __CLR4_5_21lm61lm6lusvne85.R.inc(74690);try {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74691);JSON.parseObject("[{},{\"$ref\":\"$[0]\",}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_5_21lm61lm6lusvne85.R.inc(74692);error = ex;
        }
        __CLR4_5_21lm61lm6lusvne85.R.inc(74693);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21lmu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74694,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21lmu() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74694);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74695);List<Map<Object, Object>> list = JSON.parseObject("[{},{\"$ref\":\"$[0]\"}]",
                                                          new TypeReference<List<Map<Object, Object>>>() {
                                                          });
        __CLR4_5_21lm61lm6lusvne85.R.inc(74696);Assert.assertSame(list.get(0), list.get(1));
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1lmx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1lmx() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74697);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74698);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"$\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_5_21lm61lm6lusvne85.R.inc(74699);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21lm61lm6lusvne85.R.globalSliceStart(getClass().getName(),74700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ln0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lm61lm6lusvne85.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lm61lm6lusvne85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74700,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ln0() throws Exception{try{__CLR4_5_21lm61lm6lusvne85.R.inc(74700);
        __CLR4_5_21lm61lm6lusvne85.R.inc(74701);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"..\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_5_21lm61lm6lusvne85.R.inc(74702);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_5_21lm61lm6lusvne85.R.flushNeeded();}}

  
}
