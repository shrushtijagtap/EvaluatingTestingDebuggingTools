/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.jdk8;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class OptionalTest extends TestCase {static class __CLR4_5_21e7b1e7blusyjta2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,65096,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_optional() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aapalo1e7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optional",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aapalo1e7b() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65063);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65064);Optional<Integer> val = Optional.of(3);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65065);String text = JSON.toJSONString(val);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65066);Assert.assertEquals("3", text);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65067);Optional<Integer> val2 = JSON.parseObject(text, new TypeReference<Optional<Integer>>() {});
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65068);Assert.assertEquals(val.get(), val2.get());
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalInt_present() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65069);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nrqu6d1e7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalInt_present",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65069,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nrqu6d1e7h() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65069);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65070);String text = JSON.toJSONString(OptionalInt.empty());
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65071);Assert.assertEquals("null", text);
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalInt() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ab5v3r1e7k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalInt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65072,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ab5v3r1e7k() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65072);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65073);OptionalInt val = OptionalInt.of(3);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65074);String text = JSON.toJSONString(val);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65075);Assert.assertEquals("3", text);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65076);OptionalInt val2 = JSON.parseObject(text, OptionalInt.class);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65077);Assert.assertEquals(val.getAsInt(), val2.getAsInt());
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalLong_present() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgrnho1e7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalLong_present",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgrnho1e7q() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65078);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65079);String text = JSON.toJSONString(OptionalLong.empty());
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65080);Assert.assertEquals("null", text);
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalLong() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dnupps1e7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalLong",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65081,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dnupps1e7t() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65081);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65082);OptionalLong val = OptionalLong.of(3);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65083);String text = JSON.toJSONString(val);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65084);Assert.assertEquals("3", text);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65085);OptionalLong val2 = JSON.parseObject(text, OptionalLong.class);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65086);Assert.assertEquals(val.getAsLong(), val2.getAsLong());
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalDouble_present() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pnulen1e7z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalDouble_present",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pnulen1e7z() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65087);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65088);String text = JSON.toJSONString(OptionalDouble.empty());
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65089);Assert.assertEquals("null", text);
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
    
    public void test_optionalDouble() throws Exception {__CLR4_5_21e7b1e7blusyjta2.R.globalSliceStart(getClass().getName(),65090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bb8ilh1e82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e7b1e7blusyjta2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e7b1e7blusyjta2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest.test_optionalDouble",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bb8ilh1e82() throws Exception{try{__CLR4_5_21e7b1e7blusyjta2.R.inc(65090);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65091);OptionalDouble val = OptionalDouble.of(3.1D);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65092);String text = JSON.toJSONString(val);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65093);Assert.assertEquals("3.1", text);
        
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65094);OptionalDouble val2 = JSON.parseObject(text, OptionalDouble.class);
        __CLR4_5_21e7b1e7blusyjta2.R.inc(65095);Assert.assertEquals(Double.toString(val.getAsDouble()), Double.toString(val2.getAsDouble()));
    }finally{__CLR4_5_21e7b1e7blusyjta2.R.flushNeeded();}}
}
