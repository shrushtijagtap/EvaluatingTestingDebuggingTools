/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;


public class ThrowableDeserializerTest extends TestCase {static class __CLR4_5_21lhs1lhslusyju7i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74545,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21lhs1lhslusyju7i.R.globalSliceStart(getClass().getName(),74512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21lhs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lhs1lhslusyju7i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lhs1lhslusyju7i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74512,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21lhs() throws Exception{try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74512);
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74513);Assert.assertEquals(Throwable.class, JSON.parseObject("{}", Throwable.class).getClass());
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74514);Assert.assertEquals(Throwable.class, JSON.parseObject("{,,,}", Throwable.class).getClass());
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74515);Assert.assertEquals(java.lang.RuntimeException.class, JSON.parseObject("{\"@type\":\"java.lang.RuntimeException\"}", Throwable.class).getClass());
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74516);Assert.assertEquals(null, JSON.parseObject("{\"message\":null}", Throwable.class).getMessage());
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74517);Assert.assertEquals(Exception.class, JSON.parseObject("{\"cause\":{}}", Throwable.class).getCause().getClass());
    }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_5_21lhs1lhslusyju7i.R.globalSliceStart(getClass().getName(),74518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1lhy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lhs1lhslusyju7i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lhs1lhslusyju7i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74518,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1lhy() throws Exception{try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74518);
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74519);JSONException error = null;
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74520);try {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74521);JSON.parseObject("{\"@type\":33}", Throwable.class);
        } catch (JSONException ex) {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74522);error = ex;
        }
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74523);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_5_21lhs1lhslusyju7i.R.globalSliceStart(getClass().getName(),74524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284g0lf1li4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lhs1lhslusyju7i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lhs1lhslusyju7i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74524,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284g0lf1li4() throws Exception{try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74524);
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74525);JSONException error = null;
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74526);try {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74527);Assert.assertEquals(null, JSON.parseObject("{\"message\":33}", Throwable.class).getMessage());
        } catch (JSONException ex) {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74528);error = ex;
        }
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74529);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_5_21lhs1lhslusyju7i.R.globalSliceStart(getClass().getName(),74530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1lia();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lhs1lhslusyju7i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lhs1lhslusyju7i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74530,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1lia() throws Exception{try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74530);
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74531);Exception error = null;
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74532);try {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74533);Assert.assertEquals(null, JSON.parseObject("{}", MyException.class).getMessage());
        } catch (Exception ex) {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74534);error = ex;
        }
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74535);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    
    public void test_error3() throws Exception {__CLR4_5_21lhs1lhslusyju7i.R.globalSliceStart(getClass().getName(),74536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mg30h1lig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lhs1lhslusyju7i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lhs1lhslusyju7i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74536,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mg30h1lig() throws Exception{try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74536);
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74537);Exception error = null;
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74538);try {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74539);Assert.assertEquals(null, JSON.parseObject("{}", MyException2.class).getMessage());
        } catch (Exception ex) {
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74540);error = ex;
        }
        __CLR4_5_21lhs1lhslusyju7i.R.inc(74541);Assert.assertNotNull(error);
    }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    
    public static class MyException extends Exception {
        private MyException() {try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74542);
            
        }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    }
    
    public static class MyException2 extends Exception {
        public MyException2() {try{__CLR4_5_21lhs1lhslusyju7i.R.inc(74543);
            __CLR4_5_21lhs1lhslusyju7i.R.inc(74544);throw new RuntimeException();
        }finally{__CLR4_5_21lhs1lhslusyju7i.R.flushNeeded();}}
    }
}
