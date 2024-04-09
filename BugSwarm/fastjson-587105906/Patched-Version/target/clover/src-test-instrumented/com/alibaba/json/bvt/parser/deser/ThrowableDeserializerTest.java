/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;


public class ThrowableDeserializerTest extends TestCase {static class __CLR4_5_21mg01mg0lusvnegp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,75777,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_5_21mg01mg0lusvnegp.R.globalSliceStart(getClass().getName(),75744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21mg0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mg01mg0lusvnegp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mg01mg0lusvnegp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21mg0() throws Exception{try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75744);
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75745);Assert.assertEquals(Throwable.class, JSON.parseObject("{}", Throwable.class).getClass());
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75746);Assert.assertEquals(Throwable.class, JSON.parseObject("{,,,}", Throwable.class).getClass());
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75747);Assert.assertEquals(java.lang.RuntimeException.class, JSON.parseObject("{\"@type\":\"java.lang.RuntimeException\"}", Throwable.class).getClass());
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75748);Assert.assertEquals(null, JSON.parseObject("{\"message\":null}", Throwable.class).getMessage());
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75749);Assert.assertEquals(Exception.class, JSON.parseObject("{\"cause\":{}}", Throwable.class).getCause().getClass());
    }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_5_21mg01mg0lusvnegp.R.globalSliceStart(getClass().getName(),75750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1mg6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mg01mg0lusvnegp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mg01mg0lusvnegp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1mg6() throws Exception{try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75750);
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75751);JSONException error = null;
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75752);try {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75753);JSON.parseObject("{\"@type\":33}", Throwable.class);
        } catch (JSONException ex) {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75754);error = ex;
        }
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75755);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_5_21mg01mg0lusvnegp.R.globalSliceStart(getClass().getName(),75756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_284g0lf1mgc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mg01mg0lusvnegp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mg01mg0lusvnegp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_284g0lf1mgc() throws Exception{try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75756);
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75757);JSONException error = null;
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75758);try {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75759);Assert.assertEquals(null, JSON.parseObject("{\"message\":33}", Throwable.class).getMessage());
        } catch (JSONException ex) {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75760);error = ex;
        }
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75761);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_5_21mg01mg0lusvnegp.R.globalSliceStart(getClass().getName(),75762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vg1sy1mgi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mg01mg0lusvnegp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mg01mg0lusvnegp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75762,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vg1sy1mgi() throws Exception{try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75762);
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75763);Exception error = null;
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75764);try {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75765);Assert.assertEquals(null, JSON.parseObject("{}", MyException.class).getMessage());
        } catch (Exception ex) {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75766);error = ex;
        }
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75767);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    
    public void test_error3() throws Exception {__CLR4_5_21mg01mg0lusvnegp.R.globalSliceStart(getClass().getName(),75768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21mg30h1mgo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mg01mg0lusvnegp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mg01mg0lusvnegp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.ThrowableDeserializerTest.test_error3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75768,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21mg30h1mgo() throws Exception{try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75768);
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75769);Exception error = null;
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75770);try {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75771);Assert.assertEquals(null, JSON.parseObject("{}", MyException2.class).getMessage());
        } catch (Exception ex) {
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75772);error = ex;
        }
        __CLR4_5_21mg01mg0lusvnegp.R.inc(75773);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    
    public static class MyException extends Exception {
        private MyException() {try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75774);
            
        }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    }
    
    public static class MyException2 extends Exception {
        public MyException2() {try{__CLR4_5_21mg01mg0lusvnegp.R.inc(75775);
            __CLR4_5_21mg01mg0lusvnegp.R.inc(75776);throw new RuntimeException();
        }finally{__CLR4_5_21mg01mg0lusvnegp.R.flushNeeded();}}
    }
}
