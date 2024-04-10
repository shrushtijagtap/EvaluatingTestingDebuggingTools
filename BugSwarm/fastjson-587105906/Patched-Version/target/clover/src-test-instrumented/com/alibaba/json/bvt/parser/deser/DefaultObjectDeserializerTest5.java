/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class DefaultObjectDeserializerTest5 extends TestCase {static class __CLR4_5_21kny1knylusyju2w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73471,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1kny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73438,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1kny() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73438);
        __CLR4_5_21kny1knylusyju2w.R.inc(73439);Exception error = null;
        __CLR4_5_21kny1knylusyju2w.R.inc(73440);try {
            __CLR4_5_21kny1knylusyju2w.R.inc(73441);JSON.parseObject("[]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_5_21kny1knylusyju2w.R.inc(73442);error = ex;
        }
        __CLR4_5_21kny1knylusyju2w.R.inc(73443);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ko4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ko4() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73444);
        __CLR4_5_21kny1knylusyju2w.R.inc(73445);Exception error = null;
        __CLR4_5_21kny1knylusyju2w.R.inc(73446);try {
            __CLR4_5_21kny1knylusyju2w.R.inc(73447);JSON.parseObject(",]", new TypeReference<Map<Object, Object>>() {
            });
        } catch (Exception ex) {
            __CLR4_5_21kny1knylusyju2w.R.inc(73448);error = ex;
        }
        __CLR4_5_21kny1knylusyju2w.R.inc(73449);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1koa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73450,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1koa() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73450);
        __CLR4_5_21kny1knylusyju2w.R.inc(73451);Exception error = null;
        __CLR4_5_21kny1knylusyju2w.R.inc(73452);try {
            __CLR4_5_21kny1knylusyju2w.R.inc(73453);JSON.parseObject("[{},{\"$ref\":0}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_5_21kny1knylusyju2w.R.inc(73454);error = ex;
        }
        __CLR4_5_21kny1knylusyju2w.R.inc(73455);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1kog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73456,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1kog() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73456);
        __CLR4_5_21kny1knylusyju2w.R.inc(73457);Exception error = null;
        __CLR4_5_21kny1knylusyju2w.R.inc(73458);try {
            __CLR4_5_21kny1knylusyju2w.R.inc(73459);JSON.parseObject("[{},{\"$ref\":\"$[0]\",}]",
                             new TypeReference<List<Map<Object, Object>>>() {
                             });
        } catch (Exception ex) {
            __CLR4_5_21kny1knylusyju2w.R.inc(73460);error = ex;
        }
        __CLR4_5_21kny1knylusyju2w.R.inc(73461);Assert.assertNotNull(error);
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21kom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21kom() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73462);
        __CLR4_5_21kny1knylusyju2w.R.inc(73463);List<Map<Object, Object>> list = JSON.parseObject("[{},{\"$ref\":\"$[0]\"}]",
                                                          new TypeReference<List<Map<Object, Object>>>() {
                                                          });
        __CLR4_5_21kny1knylusyju2w.R.inc(73464);Assert.assertSame(list.get(0), list.get(1));
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73465);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1kop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73465,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1kop() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73465);
        __CLR4_5_21kny1knylusyju2w.R.inc(73466);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"$\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_5_21kny1knylusyju2w.R.inc(73467);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21kny1knylusyju2w.R.globalSliceStart(getClass().getName(),73468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441kos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kny1knylusyju2w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kny1knylusyju2w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.DefaultObjectDeserializerTest5.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441kos() throws Exception{try{__CLR4_5_21kny1knylusyju2w.R.inc(73468);
        __CLR4_5_21kny1knylusyju2w.R.inc(73469);Map<Object, Map<Object, Object>> map = JSON.parseObject("{\"1\":{},\"2\":{\"$ref\":\"..\"}}",
                                                                new TypeReference<Map<Object, Map<Object, Object>>>() {
                                                                });
        __CLR4_5_21kny1knylusyju2w.R.inc(73470);Assert.assertSame(map, map.get("2"));
    }finally{__CLR4_5_21kny1knylusyju2w.R.flushNeeded();}}

  
}
