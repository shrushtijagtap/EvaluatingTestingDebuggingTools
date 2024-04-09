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

public class JSONSerializerFeatureTest extends TestCase {static class __CLR4_5_21sli1slilusvngb3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,83867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21sli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21sli() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83718);
        __CLR4_5_21sli1slilusvngb3.R.inc(83719);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83720);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83721);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_0_g() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v8k5hu1slm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0_g",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v8k5hu1slm() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83722);
        __CLR4_5_21sli1slilusvngb3.R.inc(83723);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83724);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83725);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1slq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83726,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1slq() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83726);
        __CLR4_5_21sli1slilusvngb3.R.inc(83727);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83728);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83729);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83730);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83731);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83732);serializer.write("abc");

        __CLR4_5_21sli1slilusvngb3.R.inc(83733);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1sly();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1sly() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83734);
        __CLR4_5_21sli1slilusvngb3.R.inc(83735);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83736);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83737);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83738);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83739);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83740);serializer.write("abc");

        __CLR4_5_21sli1slilusvngb3.R.inc(83741);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83742);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441sm6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83742,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441sm6() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83742);
        __CLR4_5_21sli1slilusvngb3.R.inc(83743);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83744);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83745);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83746);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83747);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1smc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1smc() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83748);
        __CLR4_5_21sli1slilusvngb3.R.inc(83749);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83750);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83751);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83752);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83753);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1smi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83754,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1smi() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83754);
        __CLR4_5_21sli1slilusvngb3.R.inc(83755);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83756);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83757);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83758);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83759);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1smo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1smo() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83760);
        __CLR4_5_21sli1slilusvngb3.R.inc(83761);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83762);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83763);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83764);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83765);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61smu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61smu() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83766);
        __CLR4_5_21sli1slilusvngb3.R.inc(83767);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83768);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83769);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83770);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83771);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1sn0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1sn0() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83772);
        __CLR4_5_21sli1slilusvngb3.R.inc(83773);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83774);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83775);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83776);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83777);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1sn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1sn6() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83778);
        __CLR4_5_21sli1slilusvngb3.R.inc(83779);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83780);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83781);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83782);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83783);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83784);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83785);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11sne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11sne() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83786);
        __CLR4_5_21sli1slilusvngb3.R.inc(83787);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83788);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83789);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83790);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83791);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83792);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83793);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81snm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83794,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81snm() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83794);
        __CLR4_5_21sli1slilusvngb3.R.inc(83795);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83796);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83797);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83798);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83799);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83800);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83801);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641snu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641snu() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83802);
        __CLR4_5_21sli1slilusvngb3.R.inc(83803);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_5_21sli1slilusvngb3.R.inc(83804);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83805);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83806);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83807);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83808);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83809);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1so2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1so2() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83810);
        __CLR4_5_21sli1slilusvngb3.R.inc(83811);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83812);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83813);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83814);serializer.write(new User(33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83815);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fqj5171so8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fqj5171so8() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83816);
        __CLR4_5_21sli1slilusvngb3.R.inc(83817);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83818);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83819);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_5_21sli1slilusvngb3.R.inc(83820);serializer.write(new User(33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83821);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1soe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83822,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1soe() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83822);
        __CLR4_5_21sli1slilusvngb3.R.inc(83823);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83824);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83825);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83826);serializer.write(new User(33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83827);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hvdtwa1sok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hvdtwa1sok() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83828);
        __CLR4_5_21sli1slilusvngb3.R.inc(83829);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83830);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21sli1slilusvngb3.R.inc(83831);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_5_21sli1slilusvngb3.R.inc(83832);serializer.write(new User(33));

        __CLR4_5_21sli1slilusvngb3.R.inc(83833);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71soq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71soq() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83834);
        __CLR4_5_21sli1slilusvngb3.R.inc(83835);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83836);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83837);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83838);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83839);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_5_21sli1slilusvngb3.R.inc(83840);StringWriter out = new StringWriter();

        __CLR4_5_21sli1slilusvngb3.R.inc(83841);Map map = new LinkedHashMap();
        __CLR4_5_21sli1slilusvngb3.R.inc(83842);map.put("a", null);
        __CLR4_5_21sli1slilusvngb3.R.inc(83843);map.put("age", 33);
        __CLR4_5_21sli1slilusvngb3.R.inc(83844);map.put("c", null);

        __CLR4_5_21sli1slilusvngb3.R.inc(83845);serializer.write(map);

        __CLR4_5_21sli1slilusvngb3.R.inc(83846);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public void test_9_s() throws Exception {__CLR4_5_21sli1slilusvngb3.R.globalSliceStart(getClass().getName(),83847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2k08ird1sp3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sli1slilusvngb3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sli1slilusvngb3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83847,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2k08ird1sp3() throws Exception{try{__CLR4_5_21sli1slilusvngb3.R.inc(83847);
        __CLR4_5_21sli1slilusvngb3.R.inc(83848);JSONSerializer serializer = new JSONSerializer();

        __CLR4_5_21sli1slilusvngb3.R.inc(83849);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83850);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_5_21sli1slilusvngb3.R.inc(83851);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_5_21sli1slilusvngb3.R.inc(83852);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_5_21sli1slilusvngb3.R.inc(83853);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sli1slilusvngb3.R.inc(83854);Map map = new LinkedHashMap();
        __CLR4_5_21sli1slilusvngb3.R.inc(83855);map.put("a", null);
        __CLR4_5_21sli1slilusvngb3.R.inc(83856);map.put("age", 33);
        __CLR4_5_21sli1slilusvngb3.R.inc(83857);map.put("c", null);

        __CLR4_5_21sli1slilusvngb3.R.inc(83858);serializer.write(map);

        __CLR4_5_21sli1slilusvngb3.R.inc(83859);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    public static class User {

        private int age;

        public User(){try{__CLR4_5_21sli1slilusvngb3.R.inc(83860);
        }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

        public User(int age){try{__CLR4_5_21sli1slilusvngb3.R.inc(83861);
            __CLR4_5_21sli1slilusvngb3.R.inc(83862);this.age = age;
        }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_21sli1slilusvngb3.R.inc(83863);
            __CLR4_5_21sli1slilusvngb3.R.inc(83864);return age;
        }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_21sli1slilusvngb3.R.inc(83865);
            __CLR4_5_21sli1slilusvngb3.R.inc(83866);this.age = age;
        }finally{__CLR4_5_21sli1slilusvngb3.R.flushNeeded();}}

    }

}
