/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.lang.reflect.Field;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class SerializeWriterTest extends TestCase {static class __CLR4_5_21tlr1tlrlusvngi9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85170,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85023);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tlr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85023,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tlr() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85023);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85024);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85025);out.write('a');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85026);out.write('b');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85027);out.write('c');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85028);Assert.assertEquals("abc", out.toString());

        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85029);StringWriter writer = new StringWriter();
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85030);out.writeTo(writer);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85031);Assert.assertEquals("abc", writer.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tm0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tm0() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85032);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85033);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85034);out.write((int) 'a');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85035);out.write((int) 'b');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85036);out.write((int) 'c');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85037);out.write(new char[0], 0, 0);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85038);Assert.assertEquals("abc", out.toString());

        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85039);StringWriter writer = new StringWriter();
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85040);out.writeTo(writer);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85041);Assert.assertEquals("abc", writer.toString());

        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85042);out.expandCapacity(128);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_12() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25lolmz1tmb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_12",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85043,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25lolmz1tmb() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85043);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85044);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85045);out.append("abc");
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85046);Assert.assertEquals("abc", out.toString());
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85047);Assert.assertEquals(3, out.toCharArray().length);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85048);Assert.assertEquals(3, out.size());
        
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85049);Field field = SerializeWriter.class.getDeclaredField("count");
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85050);field.setAccessible(true);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85051);field.setInt(out, 0);
        
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85052);Assert.assertEquals("", out.toString());
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85053);Assert.assertEquals(0, out.toCharArray().length);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85054);Assert.assertEquals(0, out.size());
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85055);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85056);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85057);out.flush();
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85058);out.close();
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_13() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22comui1tmr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22comui1tmr() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85059);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85060);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85061);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85062);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE), out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_13_long() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tilbhp1tmv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tilbhp1tmv() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85063);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85064);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85065);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85066);Assert.assertEquals(Long.toString(Long.MIN_VALUE), out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_13_long_browser() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tck1b81tmz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85067,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tck1b81tmz() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85067);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85068);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85069);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85070);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\"", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_13_long_browser2() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eng8cc1tn3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_13_long_browser2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eng8cc1tn3() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85071);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85072);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85073);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85074);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\"", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_14() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wbbxz1tn7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wbbxz1tn7() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85075);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85076);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85077);out.writeInt(Integer.MAX_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85078);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE), out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_14_long() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gkyo2a1tnb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_14_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85079,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gkyo2a1tnb() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85079);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85080);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85081);out.writeLong(Long.MAX_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85082);Assert.assertEquals(Long.toString(Long.MAX_VALUE), out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_15() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_245baqg1tnf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_245baqg1tnf() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85083);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85084);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85085);out.writeInt(Integer.MAX_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85086);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85087);Assert.assertEquals(Integer.toString(Integer.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_15_long() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28clecv1tnk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_15_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85088,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28clecv1tnk() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85088);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85089);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85090);out.writeLong(Long.MAX_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85091);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85092);Assert.assertEquals(Long.toString(Long.MAX_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_16() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27eb9ix1tnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85093,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27eb9ix1tnp() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85093);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85094);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85095);out.writeInt(Integer.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85096);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85097);Assert.assertEquals(Integer.toString(Integer.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_16_long() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xa5gs01tnu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85098,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xa5gs01tnu() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85098);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85099);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85100);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85101);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85102);Assert.assertEquals(Long.toString(Long.MIN_VALUE) + ",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_16_long_browser() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k2qulj1tnz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k2qulj1tnz() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85103);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85104);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85105);out.writeLong(Long.MIN_VALUE + 1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85106);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85107);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE + 1) + "\",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_16_long_browser2() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bbro491to4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_16_long_browser2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bbro491to4() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85108);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85109);SerializeWriter out = new SerializeWriter(SerializerFeature.BrowserCompatible);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85110);out.writeLong(Long.MIN_VALUE);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85111);out.write(',');
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85112);Assert.assertEquals("\"" + Long.toString(Long.MIN_VALUE) + "\",", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_17() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2anb8be1to9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_17",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85113,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2anb8be1to9() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85113);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85114);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85115);out.append(null);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85116);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_18() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dwb73v1tod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_18",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dwb73v1tod() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85117);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85118);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85119);out.append(null, 0, 4);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85120);Assert.assertEquals("null", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_19() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2h5b5wc1toh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_19",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2h5b5wc1toh() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85121);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85122);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85123);out.append("abcd", 0, 4);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85124);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_20() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hm6dbm1tol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_20",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85125,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hm6dbm1tol() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85125);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85126);SerializeWriter out = new SerializeWriter(1);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85127);out.write("abcd".toCharArray(), 0, 4);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85128);Assert.assertEquals("abcd", out.toString());
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1top();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1top() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85129);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85130);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85131);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85132);new SerializeWriter(-1);
        } catch (IllegalArgumentException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85133);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85134);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85135);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1tov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85135,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1tov() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85135);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85136);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85137);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85138);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85139);out.write(new char[0], -1, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85140);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85141);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1tp2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1tp2() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85142);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85143);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85144);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85145);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85146);out.write(new char[0], 2, 0);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85147);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85148);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1tp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1tp9() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85149);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85150);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85151);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85152);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85153);out.write(new char[0], 0, -1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85154);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85155);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85156);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81tpg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85156,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81tpg() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85156);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85157);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85158);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85159);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85160);out.write(new char[0], 0, 1);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85161);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85162);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceStart(getClass().getName(),85163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1tpn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tlr1tlrlusvngi9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tlr1tlrlusvngi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1tpn() throws Exception{try{__CLR4_5_21tlr1tlrlusvngi9.R.inc(85163);
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85164);Exception error = null;
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85165);try {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85166);SerializeWriter out = new SerializeWriter(16);
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85167);out.write("abcdefg".toCharArray(), 1, 1 + Integer.MAX_VALUE);
        } catch (IndexOutOfBoundsException ex) {
            __CLR4_5_21tlr1tlrlusvngi9.R.inc(85168);error = ex;
        }
        __CLR4_5_21tlr1tlrlusvngi9.R.inc(85169);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tlr1tlrlusvngi9.R.flushNeeded();}}

}
