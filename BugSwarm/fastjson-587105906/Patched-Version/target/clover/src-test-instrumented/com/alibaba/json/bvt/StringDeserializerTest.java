/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class StringDeserializerTest extends TestCase {static class __CLR4_5_210hs10hslusvn3tt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,47328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_210hs10hslusvn3tt.R.globalSliceStart(getClass().getName(),47296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp210hs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210hs10hslusvn3tt.R.rethrow($CLV_t2$);}finally{__CLR4_5_210hs10hslusvn3tt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47296,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp210hs() throws Exception{try{__CLR4_5_210hs10hslusvn3tt.R.inc(47296);
        __CLR4_5_210hs10hslusvn3tt.R.inc(47297);Assert.assertEquals("123", JSON.parseObject("123", String.class));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47298);Assert.assertEquals("true", JSON.parseObject("true", String.class));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47299);Assert.assertEquals(null, JSON.parseObject("null", String.class));
    }finally{__CLR4_5_210hs10hslusvn3tt.R.flushNeeded();}}

    public void test_StringBuffer() throws Exception {__CLR4_5_210hs10hslusvn3tt.R.globalSliceStart(getClass().getName(),47300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn4ba310hw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210hs10hslusvn3tt.R.rethrow($CLV_t2$);}finally{__CLR4_5_210hs10hslusvn3tt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_StringBuffer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47300,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn4ba310hw() throws Exception{try{__CLR4_5_210hs10hslusvn3tt.R.inc(47300);
        __CLR4_5_210hs10hslusvn3tt.R.inc(47301);Assert.assertTrue(equals(new StringBuffer("123"), JSON.parseObject("123", StringBuffer.class)));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47302);Assert.assertTrue(equals(new StringBuffer("true"), JSON.parseObject("true", StringBuffer.class)));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47303);Assert.assertEquals(null, JSON.parseObject("null", StringBuffer.class));
    }finally{__CLR4_5_210hs10hslusvn3tt.R.flushNeeded();}}

    public void test_StringBuilder() throws Exception {__CLR4_5_210hs10hslusvn3tt.R.globalSliceStart(getClass().getName(),47304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qvmqzg10i0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210hs10hslusvn3tt.R.rethrow($CLV_t2$);}finally{__CLR4_5_210hs10hslusvn3tt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.StringDeserializerTest.test_StringBuilder",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47304,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qvmqzg10i0() throws Exception{try{__CLR4_5_210hs10hslusvn3tt.R.inc(47304);
        __CLR4_5_210hs10hslusvn3tt.R.inc(47305);Assert.assertTrue(equals(new StringBuilder("123"), JSON.parseObject("123", StringBuilder.class)));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47306);Assert.assertTrue(equals(new StringBuilder("true"), JSON.parseObject("true", StringBuilder.class)));
        __CLR4_5_210hs10hslusvn3tt.R.inc(47307);Assert.assertEquals(null, JSON.parseObject("null", StringBuilder.class));
    }finally{__CLR4_5_210hs10hslusvn3tt.R.flushNeeded();}}

    private boolean equals(StringBuffer sb1, StringBuffer sb2) {try{__CLR4_5_210hs10hslusvn3tt.R.inc(47308);
        __CLR4_5_210hs10hslusvn3tt.R.inc(47309);if ((((sb1 == null && sb2 == null)&&(__CLR4_5_210hs10hslusvn3tt.R.iget(47310)!=0|true))||(__CLR4_5_210hs10hslusvn3tt.R.iget(47311)==0&false))) {{
            __CLR4_5_210hs10hslusvn3tt.R.inc(47312);return true;
        }
        }__CLR4_5_210hs10hslusvn3tt.R.inc(47313);if (((((sb1 == null && sb2 != null) || (sb1 != null && sb2 == null))&&(__CLR4_5_210hs10hslusvn3tt.R.iget(47314)!=0|true))||(__CLR4_5_210hs10hslusvn3tt.R.iget(47315)==0&false))) {{
            __CLR4_5_210hs10hslusvn3tt.R.inc(47316);return false;
        }

        }__CLR4_5_210hs10hslusvn3tt.R.inc(47317);return sb1.toString().equals(sb2.toString());
    }finally{__CLR4_5_210hs10hslusvn3tt.R.flushNeeded();}}

    private boolean equals(StringBuilder sb1, StringBuilder sb2) {try{__CLR4_5_210hs10hslusvn3tt.R.inc(47318);
        __CLR4_5_210hs10hslusvn3tt.R.inc(47319);if ((((sb1 == null && sb2 == null)&&(__CLR4_5_210hs10hslusvn3tt.R.iget(47320)!=0|true))||(__CLR4_5_210hs10hslusvn3tt.R.iget(47321)==0&false))) {{
            __CLR4_5_210hs10hslusvn3tt.R.inc(47322);return true;
        }
        }__CLR4_5_210hs10hslusvn3tt.R.inc(47323);if (((((sb1 == null && sb2 != null) || (sb1 != null && sb2 == null))&&(__CLR4_5_210hs10hslusvn3tt.R.iget(47324)!=0|true))||(__CLR4_5_210hs10hslusvn3tt.R.iget(47325)==0&false))) {{
            __CLR4_5_210hs10hslusvn3tt.R.inc(47326);return false;
        }

        }__CLR4_5_210hs10hslusvn3tt.R.inc(47327);return sb1.toString().equals(sb2.toString());
    }finally{__CLR4_5_210hs10hslusvn3tt.R.flushNeeded();}}
}
