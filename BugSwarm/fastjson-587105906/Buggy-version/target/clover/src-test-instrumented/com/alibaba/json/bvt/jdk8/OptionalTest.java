/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.jdk8;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class OptionalTest extends TestCase {static class __CLR4_1_101e7m1e7mlusqkc7f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,65107,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_optional() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aapalo1e7m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optional",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aapalo1e7m() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65074);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65075);Optional<Integer> val = Optional.of(3);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65076);String text = JSON.toJSONString(val);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65077);Assert.assertEquals("3", text);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65078);Optional<Integer> val2 = JSON.parseObject(text, new TypeReference<Optional<Integer>>() {});
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65079);Assert.assertEquals(val.get(), val2.get());
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalInt_present() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65080);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nrqu6d1e7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalInt_present",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65080,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nrqu6d1e7s() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65080);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65081);String text = JSON.toJSONString(OptionalInt.empty());
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65082);Assert.assertEquals("null", text);
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalInt() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ab5v3r1e7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalInt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65083,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ab5v3r1e7v() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65083);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65084);OptionalInt val = OptionalInt.of(3);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65085);String text = JSON.toJSONString(val);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65086);Assert.assertEquals("3", text);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65087);OptionalInt val2 = JSON.parseObject(text, OptionalInt.class);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65088);Assert.assertEquals(val.getAsInt(), val2.getAsInt());
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalLong_present() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hgrnho1e81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalLong_present",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hgrnho1e81() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65089);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65090);String text = JSON.toJSONString(OptionalLong.empty());
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65091);Assert.assertEquals("null", text);
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalLong() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65092);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dnupps1e84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalLong",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65092,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dnupps1e84() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65092);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65093);OptionalLong val = OptionalLong.of(3);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65094);String text = JSON.toJSONString(val);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65095);Assert.assertEquals("3", text);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65096);OptionalLong val2 = JSON.parseObject(text, OptionalLong.class);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65097);Assert.assertEquals(val.getAsLong(), val2.getAsLong());
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalDouble_present() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pnulen1e8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalDouble_present",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65098,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pnulen1e8a() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65098);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65099);String text = JSON.toJSONString(OptionalDouble.empty());
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65100);Assert.assertEquals("null", text);
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
    
    public void test_optionalDouble() throws Exception {__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceStart(getClass().getName(),65101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bb8ilh1e8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e7m1e7mlusqkc7f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e7m1e7mlusqkc7f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalDouble",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65101,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bb8ilh1e8d() throws Exception{try{__CLR4_1_101e7m1e7mlusqkc7f.R.inc(65101);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65102);OptionalDouble val = OptionalDouble.of(3.1D);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65103);String text = JSON.toJSONString(val);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65104);Assert.assertEquals("3.1", text);
        
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65105);OptionalDouble val2 = JSON.parseObject(text, OptionalDouble.class);
        __CLR4_1_101e7m1e7mlusqkc7f.R.inc(65106);Assert.assertEquals(Double.toString(val.getAsDouble()), Double.toString(val2.getAsDouble()));
    }finally{__CLR4_1_101e7m1e7mlusqkc7f.R.flushNeeded();}}
}
