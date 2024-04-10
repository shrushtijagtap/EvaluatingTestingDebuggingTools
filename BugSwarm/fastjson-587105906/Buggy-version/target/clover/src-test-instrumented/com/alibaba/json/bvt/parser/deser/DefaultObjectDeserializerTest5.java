/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class DefaultObjectDeserializerTest5 extends TestCase {static class __CLR4_1_101lmh1lmhluszwdc5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74714,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1lmh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74681,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1lmh() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74681);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74682);Exception error = null;
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74683);try {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74684);JSON.parseObject("[]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74685);error = ex;
        }
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74686);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1lmn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1lmn() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74687);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74688);Exception error = null;
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74689);try {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74690);JSON.parseObject(",]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74691);error = ex;
        }
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74692);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1lmt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74693,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1lmt() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74693);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74694);Exception error = null;
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74695);try {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74696);JSON.parseObject("[{},{\"$ref\":0}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74697);error = ex;
        }
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74698);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74699);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1lmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74699,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1lmz() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74699);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74700);Exception error = null;
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74701);try {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74702);JSON.parseObject("[{},{\"$ref\":\"$[0]\",}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_1_101lmh1lmhluszwdc5.R.inc(74703);error = ex;
        }
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74704);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ln5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74705,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ln5() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74705);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74706);List<Map<Object, Object>> list = JSON.parseObject("[{},{\"$ref\":\"$[0]\"}]",
                                                          new TypeReference<List<Map<Object, Object>>>() {
                                                          });
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74707);Assert.assertSame(list.get(0), list.get(1));
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ln8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ln8() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74708);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74709);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"$\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74710);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceStart(getClass().getName(),74711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441lnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lmh1lmhluszwdc5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lmh1lmhluszwdc5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74711,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441lnb() throws Exception{try{__CLR4_1_101lmh1lmhluszwdc5.R.inc(74711);
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74712);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"..\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_1_101lmh1lmhluszwdc5.R.inc(74713);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_1_101lmh1lmhluszwdc5.R.flushNeeded();}}

  
}
