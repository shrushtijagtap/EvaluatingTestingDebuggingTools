/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JSONSerializerFeatureTest extends TestCase {static class __CLR4_1_101rnl1rnllusqkjq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,82646,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21rnl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21rnl() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82497);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82498);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82499);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82500);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_0_g() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v8k5hu1rnp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0_g",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82501,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v8k5hu1rnp() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82501);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82502);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82503);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82504);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1rnt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1rnt() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82505);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82506);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82507);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82508);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82509);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82510);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82511);serializer.write("abc");

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82512);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1ro1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82513,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1ro1() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82513);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82514);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82515);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82516);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82517);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82518);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82519);serializer.write("abc");

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82520);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ro9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82521,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ro9() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82521);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82522);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82523);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82524);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82525);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82526);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1rof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82527,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1rof() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82527);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82528);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82529);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82530);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82531);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82532);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1rol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82533,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1rol() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82533);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82534);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82535);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82536);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82537);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82538);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1ror();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82539,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1ror() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82539);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82540);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82541);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82542);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82543);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82544);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61rox();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82545,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61rox() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82545);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82546);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82547);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82548);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82549);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82550);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1rp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1rp3() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82551);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82552);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82553);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82554);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82555);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82556);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1rp9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1rp9() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82557);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82558);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82559);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82560);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82561);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82562);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82563);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82564);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11rph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82565,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11rph() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82565);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82566);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82567);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82568);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82569);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82570);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82571);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82572);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81rpp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82573,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81rpp() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82573);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82574);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82575);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82576);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82577);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82578);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82579);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82580);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641rpx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641rpx() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82581);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82582);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82583);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82584);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82585);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82586);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82587);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82588);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82589);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1rq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82589,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1rq5() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82589);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82590);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82591);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82592);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82593);serializer.write(new User(33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82594);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fqj5171rqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fqj5171rqb() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82595);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82596);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82597);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82598);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82599);serializer.write(new User(33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82600);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1rqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82601,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1rqh() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82601);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82602);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82603);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82604);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82605);serializer.write(new User(33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82606);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1rqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82607,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1rqn() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82607);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82608);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82609);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82610);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82611);serializer.write(new User(33));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82612);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71rqt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82613,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71rqt() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82613);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82614);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82615);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82616);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82617);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82618);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82619);StringWriter out = new StringWriter();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82620);Map map = new LinkedHashMap();
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82621);map.put("a", null);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82622);map.put("age", 33);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82623);map.put("c", null);

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82624);serializer.write(map);

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82625);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public void test_9_s() throws Exception {__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceStart(getClass().getName(),82626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k08ird1rr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rnl1rnllusqkjq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rnl1rnllusqkjq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82626,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k08ird1rr6() throws Exception{try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82626);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82627);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82628);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82629);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82630);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82631);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82632);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82633);Map map = new LinkedHashMap();
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82634);map.put("a", null);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82635);map.put("age", 33);
        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82636);map.put("c", null);

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82637);serializer.write(map);

        __CLR4_1_101rnl1rnllusqkjq2.R.inc(82638);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    public static class User {

        private int age;

        public User(){try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82639);
        }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

        public User(int age){try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82640);
            __CLR4_1_101rnl1rnllusqkjq2.R.inc(82641);this.age = age;
        }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82642);
            __CLR4_1_101rnl1rnllusqkjq2.R.inc(82643);return age;
        }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_101rnl1rnllusqkjq2.R.inc(82644);
            __CLR4_1_101rnl1rnllusqkjq2.R.inc(82645);this.age = age;
        }finally{__CLR4_1_101rnl1rnllusqkjq2.R.flushNeeded();}}

    }

}
