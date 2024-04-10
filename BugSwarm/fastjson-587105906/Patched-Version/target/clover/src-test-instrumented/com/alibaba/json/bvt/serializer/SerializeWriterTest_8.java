/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.Collections;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_8 extends TestCase {static class __CLR4_5_21t1q1t1qlusyjv1l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84346,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_BrowserCompatible() throws Exception {__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceStart(getClass().getName(),84302);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sr7com1t1q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t1q1t1qlusyjv1l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_BrowserCompatible",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84302,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sr7com1t1q() throws Exception{try{__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84302);
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84303);StringBuilder buf = new StringBuilder();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84304);for (int i = 0; (((i < 1024)&&(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84305)!=0|true))||(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84306)==0&false)); ++i) {{
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84307);buf.append('a');
        }
        }__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84308);buf.append("\u4e2d\u56fd");
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84309);buf.append("\0");
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84310);JSON.toJSONString(buf.toString(), SerializerFeature.BrowserCompatible);
    }finally{__CLR4_5_21t1q1t1qlusyjv1l.R.flushNeeded();}}

    public void test_writer() throws Exception {__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceStart(getClass().getName(),84311);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nz04qv1t1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t1q1t1qlusyjv1l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_writer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84311,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nz04qv1t1z() throws Exception{try{__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84311);
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84312);StringBuilder buf = new StringBuilder();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84313);for (int i = 0; (((i < 1024)&&(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84314)!=0|true))||(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84315)==0&false)); ++i) {{
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84316);buf.append('a');
        }
        }__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84317);buf.append("\u4e2d\u56fd");
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84318);buf.append("\0");

        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84319);StringWriter out = new StringWriter();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84320);JSON.writeJSONStringTo(buf.toString(), out, SerializerFeature.BrowserCompatible);
    }finally{__CLR4_5_21t1q1t1qlusyjv1l.R.flushNeeded();}}

    public void test_singleQuote() throws Exception {__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceStart(getClass().getName(),84321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m6sx8u1t29();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t1q1t1qlusyjv1l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_singleQuote",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84321,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m6sx8u1t29() throws Exception{try{__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84321);
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84322);StringBuilder buf = new StringBuilder();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84323);for (int i = 0; (((i < 1024)&&(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84324)!=0|true))||(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84325)==0&false)); ++i) {{
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84326);buf.append('a');
        }
        }__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84327);buf.append("\u4e2d\u56fd");
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84328);buf.append("\0");

        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84329);SerializeWriter out = new SerializeWriter(new StringWriter());

        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84330);try {
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84331);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84332);serializer.config(SerializerFeature.QuoteFieldNames, false);
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84333);serializer.config(SerializerFeature.UseSingleQuotes, true);

            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84334);serializer.write(Collections.singletonMap(buf.toString(), ""));
        } finally {
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84335);out.close();
        }
    }finally{__CLR4_5_21t1q1t1qlusyjv1l.R.flushNeeded();}}

    public void test_singleQuote_writer() throws Exception {__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceStart(getClass().getName(),84336);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23hhmj21t2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t1q1t1qlusyjv1l.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t1q1t1qlusyjv1l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_singleQuote_writer",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84336,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23hhmj21t2o() throws Exception{try{__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84336);
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84337);StringBuilder buf = new StringBuilder();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84338);for (int i = 0; (((i < 1024)&&(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84339)!=0|true))||(__CLR4_5_21t1q1t1qlusyjv1l.R.iget(84340)==0&false)); ++i) {{
            __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84341);buf.append('a');
        }
        }__CLR4_5_21t1q1t1qlusyjv1l.R.inc(84342);buf.append("\u4e2d\u56fd");
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84343);buf.append("\0");

        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84344);StringWriter out = new StringWriter();
        __CLR4_5_21t1q1t1qlusyjv1l.R.inc(84345);JSON.writeJSONStringTo(Collections.singletonMap(buf.toString(), ""), out, SerializerFeature.UseSingleQuotes);
    }finally{__CLR4_5_21t1q1t1qlusyjv1l.R.flushNeeded();}}
}
