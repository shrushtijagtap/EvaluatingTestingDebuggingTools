/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class SerializeWriterTest extends TestCase {static class __CLR4_1_101tm21tm2luszwf62{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85181,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tm2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85034,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tm2() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85034);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85035);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85036);out.write('a');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85037);out.write('b');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85038);out.write('c');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85039);Assert.assertEquals("abc", out.toString());

        __CLR4_1_101tm21tm2luszwf62.R.inc(85040);StringWriter writer = new StringWriter();
        __CLR4_1_101tm21tm2luszwf62.R.inc(85041);out.writeTo(writer);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85042);Assert.assertEquals("abc", writer.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1tmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85043,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1tmb() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85043);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85044);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85045);out.write((int) 'a');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85046);out.write((int) 'b');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85047);out.write((int) 'c');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85048);out.write(new char[0], 0, 0);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85049);Assert.assertEquals("abc", out.toString());

        __CLR4_1_101tm21tm2luszwf62.R.inc(85050);StringWriter writer = new StringWriter();
        __CLR4_1_101tm21tm2luszwf62.R.inc(85051);out.writeTo(writer);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85052);Assert.assertEquals("abc", writer.toString());

        __CLR4_1_101tm21tm2luszwf62.R.inc(85053);out.expandCapacity(128);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105lolmz1tmm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_12",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105lolmz1tmm() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85054);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85055);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85056);out.append("abc");
        __CLR4_1_101tm21tm2luszwf62.R.inc(85057);Assert.assertEquals("abc", out.toString());
        __CLR4_1_101tm21tm2luszwf62.R.inc(85058);Assert.assertEquals(3, out.toCharArray().length);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85059);Assert.assertEquals(3, out.size());
        
        __CLR4_1_101tm21tm2luszwf62.R.inc(85060);Field field = SerializeWriter.class.getDeclaredField("count");
        __CLR4_1_101tm21tm2luszwf62.R.inc(85061);field.setAccessible(true);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85062);field.setInt(out, 0);
        
        __CLR4_1_101tm21tm2luszwf62.R.inc(85063);Assert.assertEquals("", out.toString());
        __CLR4_1_101tm21tm2luszwf62.R.inc(85064);Assert.assertEquals(0, out.toCharArray().length);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85065);Assert.assertEquals(0, out.size());
        __CLR4_1_101tm21tm2luszwf62.R.inc(85066);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85067);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
        __CLR4_1_101tm21tm2luszwf62.R.inc(85068);out.flush();
        __CLR4_1_101tm21tm2luszwf62.R.inc(85069);out.close();
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85070);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102comui1tn2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85070,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102comui1tn2() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85070);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85071);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85072);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85073);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_13_long() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85074);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tilbhp1tn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85074,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tilbhp1tn6() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85074);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85075);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85076);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85077);Assert.assertEquals(Long.toString(Long.MIN_VALUE), out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_13_long_browser() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tck1b81tna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tck1b81tna() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85078);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85079);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85080);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85081);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\"", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_13_long_browser2() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eng8cc1tne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eng8cc1tne() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85082);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85083);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85084);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85085);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\"", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wbbxz1tni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85086,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wbbxz1tni() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85086);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85087);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85088);out.writeInt(Integer.MAX_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85089);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE), out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_14_long() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gkyo2a1tnm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85090,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gkyo2a1tnm() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85090);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85091);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85092);out.writeLong(Long.MAX_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85093);Assert.assertEquals(Long.toString(Long.MAX_VALUE), out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1045baqg1tnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85094,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1045baqg1tnq() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85094);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85095);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85096);out.writeInt(Integer.MAX_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85097);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85098);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_15_long() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108clecv1tnv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108clecv1tnv() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85099);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85100);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85101);out.writeLong(Long.MAX_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85102);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85103);Assert.assertEquals(Long.toString(Long.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85104);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107eb9ix1to0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85104,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107eb9ix1to0() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85104);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85105);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85106);out.writeInt(Integer.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85107);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85108);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_16_long() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xa5gs01to5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xa5gs01to5() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85109);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85110);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85111);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85112);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85113);Assert.assertEquals(Long.toString(Long.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_16_long_browser() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k2qulj1toa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k2qulj1toa() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85114);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85115);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85116);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85117);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85118);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_16_long_browser2() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bbro491tof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bbro491tof() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85119);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85120);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85121);out.writeLong(Long.MIN_VALUE);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85122);out.write(',');
        __CLR4_1_101tm21tm2luszwf62.R.inc(85123);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\",", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10anb8be1tok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_17",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85124,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10anb8be1tok() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85124);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85125);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85126);out.append(null);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85127);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dwb73v1too();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_18",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dwb73v1too() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85128);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85129);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85130);out.append(null, 0, 4);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85131);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_19() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85132);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h5b5wc1tos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_19",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85132,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h5b5wc1tos() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85132);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85133);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85134);out.append("abcd", 0, 4);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85135);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_20() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hm6dbm1tow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_20",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85136,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hm6dbm1tow() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85136);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85137);SerializeWriter out = new SerializeWriter(1);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85138);out.write("abcd".toCharArray(), 0, 4);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85139);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1tp0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85140,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1tp0() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85140);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85141);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85142);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85143);new SerializeWriter(-1);
        } catch (IllegalArgumentException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85144);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85145);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1tp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1tp6() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85146);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85147);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85148);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85149);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101tm21tm2luszwf62.R.inc(85150);out.write(new char[0], -1, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85151);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85152);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1tpd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85153,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1tpd() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85153);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85154);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85155);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85156);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101tm21tm2luszwf62.R.inc(85157);out.write(new char[0], 2, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85158);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85159);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1tpk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85160,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1tpk() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85160);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85161);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85162);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85163);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101tm21tm2luszwf62.R.inc(85164);out.write(new char[0], 0, -1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85165);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85166);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81tpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85167,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81tpr() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85167);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85168);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85169);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85170);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101tm21tm2luszwf62.R.inc(85171);out.write(new char[0], 0, 1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85172);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85173);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101tm21tm2luszwf62.R.globalSliceStart(getClass().getName(),85174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1tpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tm21tm2luszwf62.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tm21tm2luszwf62.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85174,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1tpy() throws Exception{try{__CLR4_1_101tm21tm2luszwf62.R.inc(85174);
        __CLR4_1_101tm21tm2luszwf62.R.inc(85175);Exception error = null;
        __CLR4_1_101tm21tm2luszwf62.R.inc(85176);try {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85177);SerializeWriter out = new SerializeWriter(16);
            __CLR4_1_101tm21tm2luszwf62.R.inc(85178);out.write("abcdefg".toCharArray(), 1, 1 + Integer.MAX_VALUE);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_1_101tm21tm2luszwf62.R.inc(85179);error = ex;
        }
        __CLR4_1_101tm21tm2luszwf62.R.inc(85180);Assert.assertNotNull(error);
    }finally{__CLR4_1_101tm21tm2luszwf62.R.flushNeeded();}}

}
