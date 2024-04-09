/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class StackTraceElementDeserializerTest extends TestCase {static class __CLR4_1_101lfd1lfdlusqkgas{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,74502,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_stack() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yjtym61lfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74425,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yjtym61lfd() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74425);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74426);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74427);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74428);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74429);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74430);Assert.assertNull(JSON.parseObject("{\"className\":\"int\",\"methodName\":\"parseInt\"}",
                                           StackTraceElement.class).getFileName());
        
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74431);Assert.assertEquals(StackTraceElement.class, ((StackTraceElement) JSON.parse("{\"@type\":\"java.lang.StackTraceElement\",\"className\":\"int\",\"methodName\":\"parseInt\",\"nativeMethod\":null}")).getClass());
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}

    public void test_stack_error() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iy3wvf1lfk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74432,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iy3wvf1lfk() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74432);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74433);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74434);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74435);JSON.parseObject("{}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74436);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74437);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74438);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssera51lfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74438,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssera51lfq() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74438);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74439);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74440);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74441);JSON.parseObject("[]", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74442);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74443);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w1eq2m1lfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74444,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w1eq2m1lfw() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74444);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74445);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74446);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74447);JSON.parseObject("{\"className\":null,\"methodName\":null,\"fileName\":null,\"lineNumber\":null,\"@type\":\"xxx\"}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74448);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74449);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74450);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zaeov31lg2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74450,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zaeov31lg2() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74450);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74451);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74452);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74453);JSON.parseObject("{\"@type\":int}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74454);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74455);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74456);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10whpebk1lg8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74456,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10whpebk1lg8() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74456);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74457);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74458);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74459);JSON.parseObject("{\"xxx\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74460);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74461);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t8pfj31lge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t8pfj31lge() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74462);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74463);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74464);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74465);JSON.parseObject("{\"nativeMethod\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74466);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74467);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_6() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzpgqm1lgk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzpgqm1lgk() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74468);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74469);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74470);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74471);JSON.parseObject("{\"lineNumber\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74472);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74473);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_7() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74474);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mqphy51lgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74474,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mqphy51lgq() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74474);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74475);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74476);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74477);JSON.parseObject("{\"fileName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74478);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74479);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_8() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jhpj5o1lgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74480,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jhpj5o1lgw() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74480);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74481);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74482);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74483);JSON.parseObject("{\"methodName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74484);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74485);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_9() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g8pkd71lh2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74486,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g8pkd71lh2() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74486);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74487);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74488);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74489);JSON.parseObject("{\"className\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74490);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74491);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}
    
    public void test_stack_error_10() throws Exception {__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceStart(getClass().getName(),74492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105cp3351lh8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lfd1lfdlusqkgas.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lfd1lfdlusqkgas.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74492,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105cp3351lh8() throws Exception{try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74492);
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74493);Exception error = null;
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74494);try {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74495);JSON.parseObject("{\"lineNumber\":true}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74496);error = ex;
        }
        __CLR4_1_101lfd1lfdlusqkgas.R.inc(74497);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}

    public static class VO {

        private StackTraceElement value;

        public StackTraceElement getValue() {try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74498);
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74499);return value;
        }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}

        public void setValue(StackTraceElement value) {try{__CLR4_1_101lfd1lfdlusqkgas.R.inc(74500);
            __CLR4_1_101lfd1lfdlusqkgas.R.inc(74501);this.value = value;
        }finally{__CLR4_1_101lfd1lfdlusqkgas.R.flushNeeded();}}

    }
}