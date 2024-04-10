/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class StackTraceElementDeserializerTest extends TestCase {static class __CLR4_1_101mdl1mdlluszwdie{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,75734,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_stack() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yjtym61mdl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75657,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yjtym61mdl() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75657);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75658);Assert.assertNull(JSON.parseObject("null", StackTraceElement.class));
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75659);Assert.assertNull(JSON.parseArray("null", StackTraceElement.class));
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75660);Assert.assertNull(JSON.parseArray("[null]", StackTraceElement.class).get(0));
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75661);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75662);Assert.assertNull(JSON.parseObject("{\"className\":\"int\",\"methodName\":\"parseInt\"}",
                                           StackTraceElement.class).getFileName());
        
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75663);Assert.assertEquals(StackTraceElement.class, ((StackTraceElement) JSON.parse("{\"@type\":\"java.lang.StackTraceElement\",\"className\":\"int\",\"methodName\":\"parseInt\",\"nativeMethod\":null}")).getClass());
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}

    public void test_stack_error() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10iy3wvf1mds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10iy3wvf1mds() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75664);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75665);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75666);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75667);JSON.parseObject("{}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75668);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75669);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_1() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ssera51mdy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75670,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ssera51mdy() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75670);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75671);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75672);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75673);JSON.parseObject("[]", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75674);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75675);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_2() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w1eq2m1me4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w1eq2m1me4() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75676);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75677);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75678);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75679);JSON.parseObject("{\"className\":null,\"methodName\":null,\"fileName\":null,\"lineNumber\":null,\"@type\":\"xxx\"}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75680);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75681);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_3() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zaeov31mea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75682,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zaeov31mea() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75682);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75683);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75684);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75685);JSON.parseObject("{\"@type\":int}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75686);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75687);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_4() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10whpebk1meg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10whpebk1meg() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75688);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75689);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75690);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75691);JSON.parseObject("{\"xxx\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75692);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75693);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_5() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t8pfj31mem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75694,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t8pfj31mem() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75694);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75695);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75696);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75697);JSON.parseObject("{\"nativeMethod\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75698);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75699);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_6() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pzpgqm1mes();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75700,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pzpgqm1mes() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75700);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75701);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75702);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75703);JSON.parseObject("{\"lineNumber\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75704);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75705);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_7() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mqphy51mey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mqphy51mey() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75706);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75707);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75708);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75709);JSON.parseObject("{\"fileName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75710);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75711);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_8() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jhpj5o1mf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jhpj5o1mf4() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75712);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75713);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75714);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75715);JSON.parseObject("{\"methodName\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75716);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75717);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_9() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g8pkd71mfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75718,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g8pkd71mfa() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75718);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75719);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75720);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75721);JSON.parseObject("{\"className\":33}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75722);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75723);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}
    
    public void test_stack_error_10() throws Exception {__CLR4_1_101mdl1mdlluszwdie.R.globalSliceStart(getClass().getName(),75724);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105cp3351mfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mdl1mdlluszwdie.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mdl1mdlluszwdie.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.StackTraceElementDeserializerTest.test_stack_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75724,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105cp3351mfg() throws Exception{try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75724);
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75725);Exception error = null;
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75726);try {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75727);JSON.parseObject("{\"lineNumber\":true}", StackTraceElement.class);
        } catch (JSONException ex) {
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75728);error = ex;
        }
        __CLR4_1_101mdl1mdlluszwdie.R.inc(75729);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}

    public static class VO {

        private StackTraceElement value;

        public StackTraceElement getValue() {try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75730);
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75731);return value;
        }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}

        public void setValue(StackTraceElement value) {try{__CLR4_1_101mdl1mdlluszwdie.R.inc(75732);
            __CLR4_1_101mdl1mdlluszwdie.R.inc(75733);this.value = value;
        }finally{__CLR4_1_101mdl1mdlluszwdie.R.flushNeeded();}}

    }
}