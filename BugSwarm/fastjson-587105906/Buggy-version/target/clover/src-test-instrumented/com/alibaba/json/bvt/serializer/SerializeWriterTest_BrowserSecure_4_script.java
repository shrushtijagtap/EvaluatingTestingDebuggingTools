/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.StringWriter;

public class SerializeWriterTest_BrowserSecure_4_script extends TestCase {static class __CLR4_1_101u3x1u3xluszwf7n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85715,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21u3x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85677,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21u3x() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85677);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85678);JSONObject object = new JSONObject();
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85679);object.put("value", "<script>alert(1);</script>");
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85680);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85681);assertEquals("{\"value\":\"\\u003Cscript\\u003Ealert\\u00281\\u0029;\\u003C/script\\u003E\"}", text);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85682);JSONObject object1 = JSON.parseObject(text);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85683);assertEquals(object.get("value"), object1.get("value"));
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85684);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1u44();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85684,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1u44() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85684);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85685);String text = JSON.toJSONString("<", SerializerFeature.BrowserSecure);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85686);assertEquals("\"\\u003C\"", text);
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441u47();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441u47() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85687);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85688);String text = JSON.toJSONString("<script>", SerializerFeature.BrowserSecure);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85689);assertEquals("\"\\u003Cscript\\u003E\"", text);
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85690);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1u4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85690,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1u4a() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85690);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85691);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85692);for (int i = 0; (((i < 500)&&(__CLR4_1_101u3x1u3xluszwf7n.R.iget(85693)!=0|true))||(__CLR4_1_101u3x1u3xluszwf7n.R.iget(85694)==0&false)); i++) {{
            __CLR4_1_101u3x1u3xluszwf7n.R.inc(85695);buf.append("<script>");
        }

        }__CLR4_1_101u3x1u3xluszwf7n.R.inc(85696);StringBuilder buf1 = new StringBuilder();
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85697);buf1.append('"');
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85698);for (int i = 0; (((i < 500)&&(__CLR4_1_101u3x1u3xluszwf7n.R.iget(85699)!=0|true))||(__CLR4_1_101u3x1u3xluszwf7n.R.iget(85700)==0&false)); i++) {{
            __CLR4_1_101u3x1u3xluszwf7n.R.inc(85701);buf1.append("\\u003Cscript\\u003E");
        }
        }__CLR4_1_101u3x1u3xluszwf7n.R.inc(85702);buf1.append('"');

        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85703);StringWriter out = new StringWriter();
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85704);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85705);writer.config(SerializerFeature.BrowserSecure, true);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85706);writer.writeObject(buf.toString());
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85707);writer.flush();

        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85708);assertEquals(buf1.toString(), out.toString());
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61u4t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61u4t() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85709);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85710);String text = JSON.toJSONString("(", SerializerFeature.BrowserSecure);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85711);assertEquals("\"\\u0028\"", text);
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceStart(getClass().getName(),85712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1u4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u3x1u3xluszwf7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u3x1u3xluszwf7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85712,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1u4w() throws Exception{try{__CLR4_1_101u3x1u3xluszwf7n.R.inc(85712);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85713);String text = JSON.toJSONString(")", SerializerFeature.BrowserSecure);
        __CLR4_1_101u3x1u3xluszwf7n.R.inc(85714);assertEquals("\"\\u0029\"", text);
    }finally{__CLR4_1_101u3x1u3xluszwf7n.R.flushNeeded();}}
}
