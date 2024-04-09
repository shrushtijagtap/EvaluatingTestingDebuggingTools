/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class SerializeWriterTest extends TestCase {static class __CLR4_1_101snu1snulusqkk29{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83949,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21snu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83802,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21snu() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83802);
        __CLR4_1_101snu1snulusqkk29.R.inc(83803);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83804);out.write('a');
        __CLR4_1_101snu1snulusqkk29.R.inc(83805);out.write('b');
        __CLR4_1_101snu1snulusqkk29.R.inc(83806);out.write('c');
        __CLR4_1_101snu1snulusqkk29.R.inc(83807);Assert.assertEquals("abc", out.toString());

        __CLR4_1_101snu1snulusqkk29.R.inc(83808);StringWriter writer = new StringWriter();
        __CLR4_1_101snu1snulusqkk29.R.inc(83809);out.writeTo(writer);
        __CLR4_1_101snu1snulusqkk29.R.inc(83810);Assert.assertEquals("abc", writer.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1so3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83811,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1so3() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83811);
        __CLR4_1_101snu1snulusqkk29.R.inc(83812);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83813);out.write((int) 'a');
        __CLR4_1_101snu1snulusqkk29.R.inc(83814);out.write((int) 'b');
        __CLR4_1_101snu1snulusqkk29.R.inc(83815);out.write((int) 'c');
        __CLR4_1_101snu1snulusqkk29.R.inc(83816);out.write(new char[0], 0, 0);
        __CLR4_1_101snu1snulusqkk29.R.inc(83817);Assert.assertEquals("abc", out.toString());

        __CLR4_1_101snu1snulusqkk29.R.inc(83818);StringWriter writer = new StringWriter();
        __CLR4_1_101snu1snulusqkk29.R.inc(83819);out.writeTo(writer);
        __CLR4_1_101snu1snulusqkk29.R.inc(83820);Assert.assertEquals("abc", writer.toString());

        __CLR4_1_101snu1snulusqkk29.R.inc(83821);out.expandCapacity(128);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1soe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1soe() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83822);
        __CLR4_1_101snu1snulusqkk29.R.inc(83823);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83824);out.append("abc");
        __CLR4_1_101snu1snulusqkk29.R.inc(83825);Assert.assertEquals("abc", out.toString());
        __CLR4_1_101snu1snulusqkk29.R.inc(83826);Assert.assertEquals(3, out.toCharArray().length);
        __CLR4_1_101snu1snulusqkk29.R.inc(83827);Assert.assertEquals(3, out.size());
        
        __CLR4_1_101snu1snulusqkk29.R.inc(83828);Field field = SerializeWriter.class.getDeclaredField("count");
        __CLR4_1_101snu1snulusqkk29.R.inc(83829);field.setAccessible(true);
        __CLR4_1_101snu1snulusqkk29.R.inc(83830);field.setInt(out, 0);
        
        __CLR4_1_101snu1snulusqkk29.R.inc(83831);Assert.assertEquals("", out.toString());
        __CLR4_1_101snu1snulusqkk29.R.inc(83832);Assert.assertEquals(0, out.toCharArray().length);
        __CLR4_1_101snu1snulusqkk29.R.inc(83833);Assert.assertEquals(0, out.size());
        __CLR4_1_101snu1snulusqkk29.R.inc(83834);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83835);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
        __CLR4_1_101snu1snulusqkk29.R.inc(83836);out.flush();
        __CLR4_1_101snu1snulusqkk29.R.inc(83837);out.close();
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1sou();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83838,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1sou() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83838);
        __CLR4_1_101snu1snulusqkk29.R.inc(83839);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83840);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83841);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_13_long() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tilbhp1soy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tilbhp1soy() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83842);
        __CLR4_1_101snu1snulusqkk29.R.inc(83843);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83844);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83845);Assert.assertEquals(Long.toString(Long.MIN_VALUE), out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_13_long_browser() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tck1b81sp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tck1b81sp2() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83846);
        __CLR4_1_101snu1snulusqkk29.R.inc(83847);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101snu1snulusqkk29.R.inc(83848);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83849);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\"", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_13_long_browser2() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eng8cc1sp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eng8cc1sp6() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83850);
        __CLR4_1_101snu1snulusqkk29.R.inc(83851);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101snu1snulusqkk29.R.inc(83852);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83853);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\"", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1spa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83854,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1spa() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83854);
        __CLR4_1_101snu1snulusqkk29.R.inc(83855);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83856);out.writeInt(Integer.MAX_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83857);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE), out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_14_long() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gkyo2a1spe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gkyo2a1spe() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83858);
        __CLR4_1_101snu1snulusqkk29.R.inc(83859);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83860);out.writeLong(Long.MAX_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83861);Assert.assertEquals(Long.toString(Long.MAX_VALUE), out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1spi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83862,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1spi() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83862);
        __CLR4_1_101snu1snulusqkk29.R.inc(83863);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83864);out.writeInt(Integer.MAX_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83865);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83866);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_15_long() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108clecv1spn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108clecv1spn() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83867);
        __CLR4_1_101snu1snulusqkk29.R.inc(83868);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83869);out.writeLong(Long.MAX_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83870);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83871);Assert.assertEquals(Long.toString(Long.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1sps();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1sps() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83872);
        __CLR4_1_101snu1snulusqkk29.R.inc(83873);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83874);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83875);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83876);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_16_long() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xa5gs01spx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83877,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xa5gs01spx() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83877);
        __CLR4_1_101snu1snulusqkk29.R.inc(83878);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83879);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83880);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83881);Assert.assertEquals(Long.toString(Long.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_16_long_browser() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k2qulj1sq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k2qulj1sq2() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83882);
        __CLR4_1_101snu1snulusqkk29.R.inc(83883);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101snu1snulusqkk29.R.inc(83884);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83885);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83886);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_16_long_browser2() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83887);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bbro491sq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83887,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bbro491sq7() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83887);
        __CLR4_1_101snu1snulusqkk29.R.inc(83888);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101snu1snulusqkk29.R.inc(83889);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101snu1snulusqkk29.R.inc(83890);out.write(',');
        __CLR4_1_101snu1snulusqkk29.R.inc(83891);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\",", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1sqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1sqc() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83892);
        __CLR4_1_101snu1snulusqkk29.R.inc(83893);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83894);out.append(null);
        __CLR4_1_101snu1snulusqkk29.R.inc(83895);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1sqg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83896,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1sqg() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83896);
        __CLR4_1_101snu1snulusqkk29.R.inc(83897);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83898);out.append(null, 0, 4);
        __CLR4_1_101snu1snulusqkk29.R.inc(83899);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_19() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h5b5wc1sqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_19",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h5b5wc1sqk() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83900);
        __CLR4_1_101snu1snulusqkk29.R.inc(83901);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83902);out.append("abcd", 0, 4);
        __CLR4_1_101snu1snulusqkk29.R.inc(83903);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_20() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hm6dbm1sqo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_20",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83904,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hm6dbm1sqo() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83904);
        __CLR4_1_101snu1snulusqkk29.R.inc(83905);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101snu1snulusqkk29.R.inc(83906);out.write("abcd".toCharArray(), 0, 4);
        __CLR4_1_101snu1snulusqkk29.R.inc(83907);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1sqs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1sqs() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83908);
        __CLR4_1_101snu1snulusqkk29.R.inc(83909);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83910);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83911);new SerializeWriter(-1);
        } catch (IllegalArgumentException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83912);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83913);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1sqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1sqy() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83914);
        __CLR4_1_101snu1snulusqkk29.R.inc(83915);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83916);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83917);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101snu1snulusqkk29.R.inc(83918);out.write(new char[0], -1, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83919);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83920);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1sr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83921,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1sr5() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83921);
        __CLR4_1_101snu1snulusqkk29.R.inc(83922);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83923);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83924);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101snu1snulusqkk29.R.inc(83925);out.write(new char[0], 2, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83926);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83927);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1src();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1src() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83928);
        __CLR4_1_101snu1snulusqkk29.R.inc(83929);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83930);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83931);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101snu1snulusqkk29.R.inc(83932);out.write(new char[0], 0, -1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83933);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83934);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81srj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83935,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81srj() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83935);
        __CLR4_1_101snu1snulusqkk29.R.inc(83936);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83937);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83938);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101snu1snulusqkk29.R.inc(83939);out.write(new char[0], 0, 1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83940);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83941);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101snu1snulusqkk29.R.globalSliceStart(getClass().getName(),83942);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1srq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101snu1snulusqkk29.R.rethrow($CLV_t2$);}finally{__CLR4_1_101snu1snulusqkk29.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83942,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1srq() throws Exception{try{__CLR4_1_101snu1snulusqkk29.R.inc(83942);
        __CLR4_1_101snu1snulusqkk29.R.inc(83943);Exception error = null;
        __CLR4_1_101snu1snulusqkk29.R.inc(83944);try {
            __CLR4_1_101snu1snulusqkk29.R.inc(83945);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101snu1snulusqkk29.R.inc(83946);out.write("abcdefg".toCharArray(), 1, 1 + Integer.MAX_VALUE);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101snu1snulusqkk29.R.inc(83947);error = ex;
        }
        __CLR4_1_101snu1snulusqkk29.R.inc(83948);Assert.assertNotNull(error);
    }finally{__CLR4_1_101snu1snulusqkk29.R.flushNeeded();}}

}
