/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.Collections;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_8 extends TestCase {static class __CLR4_1_101u091u09luszwf76{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85589,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_BrowserCompatible() throws Exception {__CLR4_1_101u091u09luszwf76.R.globalSliceStart(getClass().getName(),85545);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10sr7com1u09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u091u09luszwf76.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u091u09luszwf76.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_BrowserCompatible",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85545,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10sr7com1u09() throws Exception{try{__CLR4_1_101u091u09luszwf76.R.inc(85545);
        __CLR4_1_101u091u09luszwf76.R.inc(85546);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u091u09luszwf76.R.inc(85547);for (int i = 0; (((i < 1024)&&(__CLR4_1_101u091u09luszwf76.R.iget(85548)!=0|true))||(__CLR4_1_101u091u09luszwf76.R.iget(85549)==0&false)); ++i) {{
            __CLR4_1_101u091u09luszwf76.R.inc(85550);buf.append('a');
        }
        }__CLR4_1_101u091u09luszwf76.R.inc(85551);buf.append("\u4e2d\u56fd");
        __CLR4_1_101u091u09luszwf76.R.inc(85552);buf.append("\0");
        __CLR4_1_101u091u09luszwf76.R.inc(85553);JSON.toJSONString(buf.toString(), SerializerFeature.BrowserCompatible);
    }finally{__CLR4_1_101u091u09luszwf76.R.flushNeeded();}}

    public void test_writer() throws Exception {__CLR4_1_101u091u09luszwf76.R.globalSliceStart(getClass().getName(),85554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nz04qv1u0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u091u09luszwf76.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u091u09luszwf76.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_writer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85554,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nz04qv1u0i() throws Exception{try{__CLR4_1_101u091u09luszwf76.R.inc(85554);
        __CLR4_1_101u091u09luszwf76.R.inc(85555);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u091u09luszwf76.R.inc(85556);for (int i = 0; (((i < 1024)&&(__CLR4_1_101u091u09luszwf76.R.iget(85557)!=0|true))||(__CLR4_1_101u091u09luszwf76.R.iget(85558)==0&false)); ++i) {{
            __CLR4_1_101u091u09luszwf76.R.inc(85559);buf.append('a');
        }
        }__CLR4_1_101u091u09luszwf76.R.inc(85560);buf.append("\u4e2d\u56fd");
        __CLR4_1_101u091u09luszwf76.R.inc(85561);buf.append("\0");

        __CLR4_1_101u091u09luszwf76.R.inc(85562);StringWriter out = new StringWriter();
        __CLR4_1_101u091u09luszwf76.R.inc(85563);JSON.writeJSONStringTo(buf.toString(), out, SerializerFeature.BrowserCompatible);
    }finally{__CLR4_1_101u091u09luszwf76.R.flushNeeded();}}

    public void test_singleQuote() throws Exception {__CLR4_1_101u091u09luszwf76.R.globalSliceStart(getClass().getName(),85564);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m6sx8u1u0s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u091u09luszwf76.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u091u09luszwf76.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_singleQuote",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85564,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m6sx8u1u0s() throws Exception{try{__CLR4_1_101u091u09luszwf76.R.inc(85564);
        __CLR4_1_101u091u09luszwf76.R.inc(85565);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u091u09luszwf76.R.inc(85566);for (int i = 0; (((i < 1024)&&(__CLR4_1_101u091u09luszwf76.R.iget(85567)!=0|true))||(__CLR4_1_101u091u09luszwf76.R.iget(85568)==0&false)); ++i) {{
            __CLR4_1_101u091u09luszwf76.R.inc(85569);buf.append('a');
        }
        }__CLR4_1_101u091u09luszwf76.R.inc(85570);buf.append("\u4e2d\u56fd");
        __CLR4_1_101u091u09luszwf76.R.inc(85571);buf.append("\0");

        __CLR4_1_101u091u09luszwf76.R.inc(85572);SerializeWriter out = new SerializeWriter(new StringWriter());

        __CLR4_1_101u091u09luszwf76.R.inc(85573);try {
            __CLR4_1_101u091u09luszwf76.R.inc(85574);JSONSerializer serializer = new JSONSerializer(out);
            __CLR4_1_101u091u09luszwf76.R.inc(85575);serializer.config(SerializerFeature.QuoteFieldNames, false);
            __CLR4_1_101u091u09luszwf76.R.inc(85576);serializer.config(SerializerFeature.UseSingleQuotes, true);

            __CLR4_1_101u091u09luszwf76.R.inc(85577);serializer.write(Collections.singletonMap(buf.toString(), ""));
        } finally {
            __CLR4_1_101u091u09luszwf76.R.inc(85578);out.close();
        }
    }finally{__CLR4_1_101u091u09luszwf76.R.flushNeeded();}}

    public void test_singleQuote_writer() throws Exception {__CLR4_1_101u091u09luszwf76.R.globalSliceStart(getClass().getName(),85579);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103hhmj21u17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u091u09luszwf76.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u091u09luszwf76.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_8.test_singleQuote_writer",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85579,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103hhmj21u17() throws Exception{try{__CLR4_1_101u091u09luszwf76.R.inc(85579);
        __CLR4_1_101u091u09luszwf76.R.inc(85580);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u091u09luszwf76.R.inc(85581);for (int i = 0; (((i < 1024)&&(__CLR4_1_101u091u09luszwf76.R.iget(85582)!=0|true))||(__CLR4_1_101u091u09luszwf76.R.iget(85583)==0&false)); ++i) {{
            __CLR4_1_101u091u09luszwf76.R.inc(85584);buf.append('a');
        }
        }__CLR4_1_101u091u09luszwf76.R.inc(85585);buf.append("\u4e2d\u56fd");
        __CLR4_1_101u091u09luszwf76.R.inc(85586);buf.append("\0");

        __CLR4_1_101u091u09luszwf76.R.inc(85587);StringWriter out = new StringWriter();
        __CLR4_1_101u091u09luszwf76.R.inc(85588);JSON.writeJSONStringTo(Collections.singletonMap(buf.toString(), ""), out, SerializerFeature.UseSingleQuotes);
    }finally{__CLR4_1_101u091u09luszwf76.R.flushNeeded();}}
}
