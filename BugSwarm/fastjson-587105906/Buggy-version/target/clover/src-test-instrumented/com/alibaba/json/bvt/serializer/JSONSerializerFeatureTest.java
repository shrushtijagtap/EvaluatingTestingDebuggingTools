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

public class JSONSerializerFeatureTest extends TestCase {static class __CLR4_1_101slt1sltluszwf0l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,83878,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21slt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21slt() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83729);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83730);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83731);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83732);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_0_g() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v8k5hu1slx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_0_g",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v8k5hu1slx() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83733);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83734);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83735);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83736);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1sm1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83737,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1sm1() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83737);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83738);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83739);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83740);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83741);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83742);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83743);serializer.write("abc");

        __CLR4_1_101slt1sltluszwf0l.R.inc(83744);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1sm9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1sm9() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83745);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83746);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83747);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83748);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83749);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83750);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83751);serializer.write("abc");

        __CLR4_1_101slt1sltluszwf0l.R.inc(83752);Assert.assertEquals("'abc'", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441smh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83753,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441smh() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83753);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83754);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83755);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83756);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83757);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83758);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1smn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83759,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1smn() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83759);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83760);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83761);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83762);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83763);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83764);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1smt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83765,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1smt() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83765);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83766);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83767);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83768);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83769);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83770);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1smz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1smz() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83771);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83772);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83773);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83774);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83775);serializer.write(Collections.singletonMap("age", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83776);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61sn5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83777,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61sn5() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83777);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83778);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83779);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83780);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83781);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83782);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1snb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83783,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1snb() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83783);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83784);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83785);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83786);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83787);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83788);Assert.assertEquals("{\"a\\nge\":33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1snh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1snh() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83789);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83790);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83791);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83792);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83793);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83794);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83795);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83796);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11snp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83797,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11snp() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83797);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83798);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83799);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83800);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83801);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83802);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83803);serializer.write(Collections.singletonMap("a\nge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83804);Assert.assertEquals("{'a\\nge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81snx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83805,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81snx() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83805);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83806);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83807);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83808);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83809);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83810);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83811);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83812);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83813);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641so5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83813,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641so5() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83813);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83814);JSONSerializer serializer = new JSONSerializer(new SerializeWriter());

        __CLR4_1_101slt1sltluszwf0l.R.inc(83815);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83816);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83817);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83818);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83819);serializer.write(Collections.singletonMap("a'ge", 33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83820);Assert.assertEquals("{'a\\'ge':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1sod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83821,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1sod() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83821);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83822);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83823);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83824);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83825);serializer.write(new User(33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83826);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_7_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fqj5171soj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_7_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fqj5171soj() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83827);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83828);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83829);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83830);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83831);serializer.write(new User(33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83832);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1sop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1sop() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83833);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83834);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83835);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83836);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83837);serializer.write(new User(33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83838);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_8_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hvdtwa1sov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_8_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83839,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hvdtwa1sov() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83839);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83840);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83841);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83842);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseSingleQuotes));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83843);serializer.write(new User(33));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83844);Assert.assertEquals("{'age':33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71sp1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83845,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71sp1() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83845);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83846);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83847);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83848);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83849);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83850);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83851);StringWriter out = new StringWriter();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83852);Map map = new LinkedHashMap();
        __CLR4_1_101slt1sltluszwf0l.R.inc(83853);map.put("a", null);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83854);map.put("age", 33);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83855);map.put("c", null);

        __CLR4_1_101slt1sltluszwf0l.R.inc(83856);serializer.write(map);

        __CLR4_1_101slt1sltluszwf0l.R.inc(83857);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public void test_9_s() throws Exception {__CLR4_1_101slt1sltluszwf0l.R.globalSliceStart(getClass().getName(),83858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10k08ird1spe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101slt1sltluszwf0l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101slt1sltluszwf0l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerFeatureTest.test_9_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83858,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10k08ird1spe() throws Exception{try{__CLR4_1_101slt1sltluszwf0l.R.inc(83858);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83859);JSONSerializer serializer = new JSONSerializer();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83860);serializer.config(SerializerFeature.QuoteFieldNames, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83861);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.QuoteFieldNames));
        __CLR4_1_101slt1sltluszwf0l.R.inc(83862);serializer.config(SerializerFeature.WriteMapNullValue, false);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83863);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.WriteMapNullValue));

        __CLR4_1_101slt1sltluszwf0l.R.inc(83864);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101slt1sltluszwf0l.R.inc(83865);Map map = new LinkedHashMap();
        __CLR4_1_101slt1sltluszwf0l.R.inc(83866);map.put("a", null);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83867);map.put("age", 33);
        __CLR4_1_101slt1sltluszwf0l.R.inc(83868);map.put("c", null);

        __CLR4_1_101slt1sltluszwf0l.R.inc(83869);serializer.write(map);

        __CLR4_1_101slt1sltluszwf0l.R.inc(83870);Assert.assertEquals("{age:33}", serializer.getWriter().toString());
    }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    public static class User {

        private int age;

        public User(){try{__CLR4_1_101slt1sltluszwf0l.R.inc(83871);
        }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

        public User(int age){try{__CLR4_1_101slt1sltluszwf0l.R.inc(83872);
            __CLR4_1_101slt1sltluszwf0l.R.inc(83873);this.age = age;
        }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_101slt1sltluszwf0l.R.inc(83874);
            __CLR4_1_101slt1sltluszwf0l.R.inc(83875);return age;
        }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_101slt1sltluszwf0l.R.inc(83876);
            __CLR4_1_101slt1sltluszwf0l.R.inc(83877);this.age = age;
        }finally{__CLR4_1_101slt1sltluszwf0l.R.flushNeeded();}}

    }

}
