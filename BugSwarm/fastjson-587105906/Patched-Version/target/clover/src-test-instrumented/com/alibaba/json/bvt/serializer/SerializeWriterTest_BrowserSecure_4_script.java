/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.Assert;

import java.io.StringWriter;

public class SerializeWriterTest_BrowserSecure_4_script extends TestCase {static class __CLR4_5_21t5e1t5elusyjv1s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84472,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84434);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21t5e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84434,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21t5e() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84434);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84435);JSONObject object = new JSONObject();
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84436);object.put("value", "<script>alert(1);</script>");
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84437);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84438);assertEquals("{\"value\":\"\\u003Cscript\\u003Ealert\\u00281\\u0029;\\u003C/script\\u003E\"}", text);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84439);JSONObject object1 = JSON.parseObject(text);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84440);assertEquals(object.get("value"), object1.get("value"));
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84441);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1t5l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84441,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1t5l() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84441);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84442);String text = JSON.toJSONString("<", SerializerFeature.BrowserSecure);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84443);assertEquals("\"\\u003C\"", text);
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84444);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441t5o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84444,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441t5o() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84444);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84445);String text = JSON.toJSONString("<script>", SerializerFeature.BrowserSecure);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84446);assertEquals("\"\\u003Cscript\\u003E\"", text);
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1t5r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1t5r() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84447);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84448);StringBuilder buf = new StringBuilder();
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84449);for (int i = 0; (((i < 500)&&(__CLR4_5_21t5e1t5elusyjv1s.R.iget(84450)!=0|true))||(__CLR4_5_21t5e1t5elusyjv1s.R.iget(84451)==0&false)); i++) {{
            __CLR4_5_21t5e1t5elusyjv1s.R.inc(84452);buf.append("<script>");
        }

        }__CLR4_5_21t5e1t5elusyjv1s.R.inc(84453);StringBuilder buf1 = new StringBuilder();
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84454);buf1.append('"');
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84455);for (int i = 0; (((i < 500)&&(__CLR4_5_21t5e1t5elusyjv1s.R.iget(84456)!=0|true))||(__CLR4_5_21t5e1t5elusyjv1s.R.iget(84457)==0&false)); i++) {{
            __CLR4_5_21t5e1t5elusyjv1s.R.inc(84458);buf1.append("\\u003Cscript\\u003E");
        }
        }__CLR4_5_21t5e1t5elusyjv1s.R.inc(84459);buf1.append('"');

        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84460);StringWriter out = new StringWriter();
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84461);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84462);writer.config(SerializerFeature.BrowserSecure, true);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84463);writer.writeObject(buf.toString());
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84464);writer.flush();

        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84465);assertEquals(buf1.toString(), out.toString());
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61t6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61t6a() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84466);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84467);String text = JSON.toJSONString("(", SerializerFeature.BrowserSecure);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84468);assertEquals("\"\\u0028\"", text);
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceStart(getClass().getName(),84469);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1t6d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t5e1t5elusyjv1s.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t5e1t5elusyjv1s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_4_script.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84469,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1t6d() throws Exception{try{__CLR4_5_21t5e1t5elusyjv1s.R.inc(84469);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84470);String text = JSON.toJSONString(")", SerializerFeature.BrowserSecure);
        __CLR4_5_21t5e1t5elusyjv1s.R.inc(84471);assertEquals("\"\\u0029\"", text);
    }finally{__CLR4_5_21t5e1t5elusyjv1s.R.flushNeeded();}}
}
