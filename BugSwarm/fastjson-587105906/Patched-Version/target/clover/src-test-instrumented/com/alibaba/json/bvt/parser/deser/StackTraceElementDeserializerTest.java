/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class StackTraceElementDeserializerTest extends TestCase {static class __CLR4_5_21mda1mdalusvnegg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,75723,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_stack() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yjtym61mda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yjtym61mda() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75646);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75647);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_5_21mda1mdalusvnegg.R.inc(75648);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_5_21mda1mdalusvnegg.R.inc(75649);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_5_21mda1mdalusvnegg.R.inc(75650);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        __CLR4_5_21mda1mdalusvnegg.R.inc(75651);Assert.assertNull(JSON.parseObject("{\"className\":\"int\",\"methodName\":\"parseInt\"}",
                                           StackTraceElement.class).getFileName());
        
        __CLR4_5_21mda1mdalusvnegg.R.inc(75652);Assert.assertEquals(StackTraceElement.class, ((StackTraceElement) JSON.parse("{\"@type\":\"java.lang.StackTraceElement\",\"className\":\"int\",\"methodName\":\"parseInt\",\"nativeMethod\":null}")).getClass());
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}

    public void test_stack_error() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2iy3wvf1mdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2iy3wvf1mdh() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75653);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75654);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75655);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75656);JSON.parseObject("{}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75657);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75658);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ssera51mdn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75659,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ssera51mdn() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75659);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75660);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75661);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75662);JSON.parseObject("[]", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75663);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75664);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75665);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w1eq2m1mdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75665,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w1eq2m1mdt() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75665);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75666);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75667);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75668);JSON.parseObject("{\"className\":null,\"methodName\":null,\"fileName\":null,\"lineNumber\":null,\"@type\":\"xxx\"}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75669);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75670);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75671);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zaeov31mdz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75671,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zaeov31mdz() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75671);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75672);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75673);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75674);JSON.parseObject("{\"@type\":int}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75675);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75676);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2whpebk1me5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2whpebk1me5() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75677);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75678);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75679);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75680);JSON.parseObject("{\"xxx\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75681);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75682);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75683);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t8pfj31meb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75683,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t8pfj31meb() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75683);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75684);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75685);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75686);JSON.parseObject("{\"nativeMethod\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75687);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75688);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_6() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pzpgqm1meh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75689,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pzpgqm1meh() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75689);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75690);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75691);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75692);JSON.parseObject("{\"lineNumber\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75693);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75694);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_7() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75695);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mqphy51men();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75695,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mqphy51men() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75695);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75696);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75697);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75698);JSON.parseObject("{\"fileName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75699);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75700);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_8() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jhpj5o1met();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75701,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jhpj5o1met() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75701);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75702);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75703);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75704);JSON.parseObject("{\"methodName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75705);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75706);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_9() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8pkd71mez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8pkd71mez() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75707);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75708);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75709);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75710);JSON.parseObject("{\"className\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75711);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75712);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}
    
    public void test_stack_error_10() throws Exception {__CLR4_5_21mda1mdalusvnegg.R.globalSliceStart(getClass().getName(),75713);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25cp3351mf5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mda1mdalusvnegg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mda1mdalusvnegg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_10",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75713,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25cp3351mf5() throws Exception{try{__CLR4_5_21mda1mdalusvnegg.R.inc(75713);
        __CLR4_5_21mda1mdalusvnegg.R.inc(75714);Exception error = null;
        __CLR4_5_21mda1mdalusvnegg.R.inc(75715);try {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75716);JSON.parseObject("{\"lineNumber\":true}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_5_21mda1mdalusvnegg.R.inc(75717);error = ex;
        }
        __CLR4_5_21mda1mdalusvnegg.R.inc(75718);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}

    public static class VO {

        private StackTraceElement value;

        public StackTraceElement getValue() {try{__CLR4_5_21mda1mdalusvnegg.R.inc(75719);
            __CLR4_5_21mda1mdalusvnegg.R.inc(75720);return value;
        }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}

        public void setValue(StackTraceElement value) {try{__CLR4_5_21mda1mdalusvnegg.R.inc(75721);
            __CLR4_5_21mda1mdalusvnegg.R.inc(75722);this.value = value;
        }finally{__CLR4_5_21mda1mdalusvnegg.R.flushNeeded();}}

    }
}