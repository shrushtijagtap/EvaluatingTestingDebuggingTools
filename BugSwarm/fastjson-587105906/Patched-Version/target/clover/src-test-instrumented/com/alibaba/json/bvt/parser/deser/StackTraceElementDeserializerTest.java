/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class StackTraceElementDeserializerTest extends TestCase {static class __CLR4_5_21lf21lf2lusyju7c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74491,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_stack() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjtym61lf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjtym61lf2() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74414);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74415);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74416);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74417);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74418);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74419);Assert.assertNull(JSON.parseObject("{\"className\":\"int\",\"methodName\":\"parseInt\"}",
                                           StackTraceElement.class).getFileName());
        
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74420);Assert.assertEquals(StackTraceElement.class, ((StackTraceElement) JSON.parse("{\"@type\":\"java.lang.StackTraceElement\",\"className\":\"int\",\"methodName\":\"parseInt\",\"nativeMethod\":null}")).getClass());
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}

    public void test_stack_error() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74421);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iy3wvf1lf9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74421,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iy3wvf1lf9() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74421);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74422);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74423);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74424);JSON.parseObject("{}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74425);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74426);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssera51lff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssera51lff() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74427);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74428);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74429);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74430);JSON.parseObject("[]", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74431);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74432);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1eq2m1lfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1eq2m1lfl() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74433);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74434);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74435);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74436);JSON.parseObject("{\"className\":null,\"methodName\":null,\"fileName\":null,\"lineNumber\":null,\"@type\":\"xxx\"}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74437);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74438);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zaeov31lfr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74439,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zaeov31lfr() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74439);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74440);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74441);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74442);JSON.parseObject("{\"@type\":int}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74443);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74444);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2whpebk1lfx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2whpebk1lfx() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74445);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74446);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74447);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74448);JSON.parseObject("{\"xxx\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74449);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74450);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8pfj31lg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8pfj31lg3() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74451);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74452);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74453);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74454);JSON.parseObject("{\"nativeMethod\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74455);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74456);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_6() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzpgqm1lg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzpgqm1lg9() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74457);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74458);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74459);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74460);JSON.parseObject("{\"lineNumber\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74461);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74462);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_7() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqphy51lgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74463,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqphy51lgf() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74463);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74464);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74465);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74466);JSON.parseObject("{\"fileName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74467);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74468);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_8() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jhpj5o1lgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jhpj5o1lgl() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74469);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74470);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74471);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74472);JSON.parseObject("{\"methodName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74473);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74474);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_9() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74475);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8pkd71lgr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74475,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8pkd71lgr() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74475);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74476);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74477);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74478);JSON.parseObject("{\"className\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74479);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74480);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}
    
    public void test_stack_error_10() throws Exception {__CLR4_5_21lf21lf2lusyju7c.R.globalSliceStart(getClass().getName(),74481);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25cp3351lgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf21lf2lusyju7c.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf21lf2lusyju7c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74481,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25cp3351lgx() throws Exception{try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74481);
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74482);Exception error = null;
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74483);try {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74484);JSON.parseObject("{\"lineNumber\":true}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74485);error = ex;
        }
        __CLR4_5_21lf21lf2lusyju7c.R.inc(74486);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}

    public static class VO {

        private StackTraceElement value;

        public StackTraceElement getValue() {try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74487);
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74488);return value;
        }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}

        public void setValue(StackTraceElement value) {try{__CLR4_5_21lf21lf2lusyju7c.R.inc(74489);
            __CLR4_5_21lf21lf2lusyju7c.R.inc(74490);this.value = value;
        }finally{__CLR4_5_21lf21lf2lusyju7c.R.flushNeeded();}}

    }
}