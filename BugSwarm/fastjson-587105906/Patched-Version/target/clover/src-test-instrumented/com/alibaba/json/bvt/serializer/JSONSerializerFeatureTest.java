/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class JSONSerializerFeatureTest extends TestCase {static class __CLR4_5_21rna1rnalusyjuxy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82635,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rna() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82486);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82487);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82488);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82489);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_0_g() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8k5hu1rne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0_g",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82490,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8k5hu1rne() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82490);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82491);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82492);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82493);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rni();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rni() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82494);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82495);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82496);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82497);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82498);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82499);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82500);serializer.write("abc");

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82501);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1rnq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82502,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1rnq() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82502);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82503);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82504);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82505);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82506);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82507);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82508);serializer.write("abc");

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82509);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82510);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82510,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rny() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82510);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82511);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82512);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82513);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82514);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82515);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1ro4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82516,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1ro4() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82516);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82517);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82518);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82519);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82520);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82521);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1roa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1roa() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82522);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82523);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82524);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82525);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82526);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82527);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1rog();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82528,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1rog() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82528);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82529);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82530);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82531);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82532);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82533);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82534);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61rom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82534,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61rom() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82534);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82535);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82536);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82537);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82538);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82539);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1ros();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1ros() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82540);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82541);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82542);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82543);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82544);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82545);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1roy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1roy() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82546);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82547);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82548);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82549);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82550);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82551);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82552);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82553);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11rp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82554,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11rp6() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82554);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82555);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82556);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82557);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82558);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82559);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82560);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82561);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81rpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82562,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81rpe() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82562);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82563);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82564);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82565);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82566);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82567);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82568);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82569);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641rpm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641rpm() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82570);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82571);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82572);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82573);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82574);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82575);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82576);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82577);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82578);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1rpu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82578,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1rpu() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82578);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82579);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82580);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82581);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82582);serializer.write(new User(33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82583);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqj5171rq0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82584,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqj5171rq0() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82584);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82585);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82586);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82587);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82588);serializer.write(new User(33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82589);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1rq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82590,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1rq6() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82590);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82591);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82592);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82593);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82594);serializer.write(new User(33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82595);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1rqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82596,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1rqc() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82596);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82597);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82598);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82599);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82600);serializer.write(new User(33));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82601);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71rqi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71rqi() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82602);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82603);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82604);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82605);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82606);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82607);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82608);StringWriter out = new StringWriter();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82609);Map map = new LinkedHashMap();
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82610);map.put("a", null);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82611);map.put("age", 33);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82612);map.put("c", null);

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82613);serializer.write(map);

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82614);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public void test_9_s() throws Exception {__CLR4_5_21rna1rnalusyjuxy.R.globalSliceStart(getClass().getName(),82615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k08ird1rqv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rna1rnalusyjuxy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rna1rnalusyjuxy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k08ird1rqv() throws Exception{try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82615);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82616);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82617);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82618);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82619);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82620);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82621);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82622);Map map = new LinkedHashMap();
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82623);map.put("a", null);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82624);map.put("age", 33);
        __CLR4_5_21rna1rnalusyjuxy.R.inc(82625);map.put("c", null);

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82626);serializer.write(map);

        __CLR4_5_21rna1rnalusyjuxy.R.inc(82627);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    public static class User {

        private int age;

        public User(){try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82628);
        }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

        public User(int age){try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82629);
            __CLR4_5_21rna1rnalusyjuxy.R.inc(82630);this.age = age;
        }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82631);
            __CLR4_5_21rna1rnalusyjuxy.R.inc(82632);return age;
        }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_21rna1rnalusyjuxy.R.inc(82633);
            __CLR4_5_21rna1rnalusyjuxy.R.inc(82634);this.age = age;
        }finally{__CLR4_5_21rna1rnalusyjuxy.R.flushNeeded();}}

    }

}
