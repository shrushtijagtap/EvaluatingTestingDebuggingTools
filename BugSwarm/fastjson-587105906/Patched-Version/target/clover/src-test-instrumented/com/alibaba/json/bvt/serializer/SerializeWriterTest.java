/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class SerializeWriterTest extends TestCase {static class __CLR4_5_21snj1snjlusyjv0r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83938,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21snj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83791,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21snj() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83791);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83792);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83793);out.write('a');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83794);out.write('b');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83795);out.write('c');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83796);Assert.assertEquals("abc", out.toString());

        __CLR4_5_21snj1snjlusyjv0r.R.inc(83797);StringWriter writer = new StringWriter();
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83798);out.writeTo(writer);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83799);Assert.assertEquals("abc", writer.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1sns();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1sns() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83800);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83801);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83802);out.write((int) 'a');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83803);out.write((int) 'b');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83804);out.write((int) 'c');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83805);out.write(new char[0], 0, 0);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83806);Assert.assertEquals("abc", out.toString());

        __CLR4_5_21snj1snjlusyjv0r.R.inc(83807);StringWriter writer = new StringWriter();
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83808);out.writeTo(writer);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83809);Assert.assertEquals("abc", writer.toString());

        __CLR4_5_21snj1snjlusyjv0r.R.inc(83810);out.expandCapacity(128);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1so3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1so3() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83811);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83812);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83813);out.append("abc");
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83814);Assert.assertEquals("abc", out.toString());
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83815);Assert.assertEquals(3, out.toCharArray().length);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83816);Assert.assertEquals(3, out.size());
        
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83817);Field field = SerializeWriter.class.getDeclaredField("count");
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83818);field.setAccessible(true);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83819);field.setInt(out, 0);
        
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83820);Assert.assertEquals("", out.toString());
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83821);Assert.assertEquals(0, out.toCharArray().length);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83822);Assert.assertEquals(0, out.size());
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83823);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83824);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83825);out.flush();
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83826);out.close();
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1soj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83827,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1soj() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83827);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83828);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83829);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83830);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_13_long() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tilbhp1son();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tilbhp1son() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83831);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83832);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83833);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83834);Assert.assertEquals(Long.toString(Long.MIN_VALUE), out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_13_long_browser() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tck1b81sor();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83835,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tck1b81sor() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83835);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83836);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83837);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83838);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\"", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_13_long_browser2() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eng8cc1sov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eng8cc1sov() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83839);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83840);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83841);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83842);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\"", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1soz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1soz() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83843);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83844);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83845);out.writeInt(Integer.MAX_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83846);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE), out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_14_long() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkyo2a1sp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkyo2a1sp3() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83847);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83848);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83849);out.writeLong(Long.MAX_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83850);Assert.assertEquals(Long.toString(Long.MAX_VALUE), out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1sp7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1sp7() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83851);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83852);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83853);out.writeInt(Integer.MAX_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83854);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83855);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_15_long() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28clecv1spc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28clecv1spc() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83856);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83857);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83858);out.writeLong(Long.MAX_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83859);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83860);Assert.assertEquals(Long.toString(Long.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1sph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1sph() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83861);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83862);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83863);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83864);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83865);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_16_long() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xa5gs01spm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83866,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xa5gs01spm() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83866);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83867);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83868);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83869);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83870);Assert.assertEquals(Long.toString(Long.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_16_long_browser() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2qulj1spr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2qulj1spr() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83871);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83872);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83873);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83874);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83875);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_16_long_browser2() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbro491spw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83876,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbro491spw() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83876);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83877);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83878);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83879);out.write(',');
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83880);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\",", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1sq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1sq1() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83881);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83882);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83883);out.append(null);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83884);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1sq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1sq5() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83885);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83886);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83887);out.append(null, 0, 4);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83888);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_19() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h5b5wc1sq9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h5b5wc1sq9() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83889);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83890);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83891);out.append("abcd", 0, 4);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83892);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_20() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83893);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hm6dbm1sqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83893,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hm6dbm1sqd() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83893);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83894);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83895);out.write("abcd".toCharArray(), 0, 4);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83896);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1sqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1sqh() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83897);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83898);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83899);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83900);new SerializeWriter(-1);
        } catch (IllegalArgumentException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83901);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83902);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1sqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1sqn() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83903);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83904);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83905);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83906);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83907);out.write(new char[0], -1, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83908);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83909);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1squ();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1squ() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83910);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83911);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83912);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83913);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83914);out.write(new char[0], 2, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83915);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83916);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1sr1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83917,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1sr1() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83917);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83918);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83919);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83920);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83921);out.write(new char[0], 0, -1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83922);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83923);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81sr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83924,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81sr8() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83924);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83925);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83926);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83927);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83928);out.write(new char[0], 0, 1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83929);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83930);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21snj1snjlusyjv0r.R.globalSliceStart(getClass().getName(),83931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1srf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21snj1snjlusyjv0r.R.rethrow($CLV_t2$);}finally{__CLR4_5_21snj1snjlusyjv0r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83931,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1srf() throws Exception{try{__CLR4_5_21snj1snjlusyjv0r.R.inc(83931);
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83932);Exception error = null;
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83933);try {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83934);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83935);out.write("abcdefg".toCharArray(), 1, 1 + Integer.MAX_VALUE);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21snj1snjlusyjv0r.R.inc(83936);error = ex;
        }
        __CLR4_5_21snj1snjlusyjv0r.R.inc(83937);Assert.assertNotNull(error);
    }finally{__CLR4_5_21snj1snjlusyjv0r.R.flushNeeded();}}

}
