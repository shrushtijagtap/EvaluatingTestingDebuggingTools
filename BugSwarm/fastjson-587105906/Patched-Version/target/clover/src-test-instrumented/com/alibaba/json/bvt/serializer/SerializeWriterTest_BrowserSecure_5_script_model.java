/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.io.StringWriter;

public class SerializeWriterTest_BrowserSecure_5_script_model extends TestCase {static class __CLR4_5_21u4o1u4olusvngkj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85755,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21u4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85704,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21u4o() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85704);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85705);Model object = new Model();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85706);object.value = "<script>alert(1);</script>";
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85707);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85708);assertEquals("{\"value\":\"\\u003Cscript\\u003Ealert\\u00281\\u0029;\\u003C/script\\u003E\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85709);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85710);assertEquals(object.value, object1.value);
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1u4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85711,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1u4v() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85711);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85712);Model object = new Model();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85713);object.value = "<";
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85714);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85715);assertEquals("{\"value\":\"\\u003C\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85716);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85717);assertEquals(object.value, object1.value);
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441u52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441u52() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85718);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85719);Model object = new Model();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85720);object.value = "<script>";
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85721);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85722);assertEquals("{\"value\":\"\\u003Cscript\\u003E\"}", text);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85723);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85724);assertEquals(object.value, object1.value);
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}
//
    public void test_3() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1u59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1u59() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85725);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85726);StringBuilder buf = new StringBuilder();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85727);for (int i = 0; (((i < 500)&&(__CLR4_5_21u4o1u4olusvngkj.R.iget(85728)!=0|true))||(__CLR4_5_21u4o1u4olusvngkj.R.iget(85729)==0&false)); i++) {{
            __CLR4_5_21u4o1u4olusvngkj.R.inc(85730);buf.append("<script>");
        }

        }__CLR4_5_21u4o1u4olusvngkj.R.inc(85731);StringBuilder buf1 = new StringBuilder();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85732);buf1.append("{\"value\":\"");
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85733);for (int i = 0; (((i < 500)&&(__CLR4_5_21u4o1u4olusvngkj.R.iget(85734)!=0|true))||(__CLR4_5_21u4o1u4olusvngkj.R.iget(85735)==0&false)); i++) {{
            __CLR4_5_21u4o1u4olusvngkj.R.inc(85736);buf1.append("\\u003Cscript\\u003E");
        }
        }__CLR4_5_21u4o1u4olusvngkj.R.inc(85737);buf1.append("\"}");

        __CLR4_5_21u4o1u4olusvngkj.R.inc(85738);Model object = new Model();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85739);object.value = buf.toString();

        __CLR4_5_21u4o1u4olusvngkj.R.inc(85740);StringWriter out = new StringWriter();
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85741);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85742);writer.config(SerializerFeature.BrowserSecure, true);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85743);writer.writeObject(object);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85744);writer.flush();

        __CLR4_5_21u4o1u4olusvngkj.R.inc(85745);assertEquals(buf1.toString(), out.toString());
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}
//
    public void test_4() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61u5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61u5u() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85746);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85747);String text = JSON.toJSONString(new Model("("), SerializerFeature.BrowserSecure);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85748);assertEquals("{\"value\":\"\\u0028\"}", text);
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21u4o1u4olusvngkj.R.globalSliceStart(getClass().getName(),85749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1u5x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u4o1u4olusvngkj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u4o1u4olusvngkj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85749,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1u5x() throws Exception{try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85749);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85750);String text = JSON.toJSONString(new Model(")"), SerializerFeature.BrowserSecure);
        __CLR4_5_21u4o1u4olusvngkj.R.inc(85751);assertEquals("{\"value\":\"\\u0029\"}", text);
    }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}

    public static class Model {
        public String value;

        public Model() {try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85752);

        }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}

        public Model(String value) {try{__CLR4_5_21u4o1u4olusvngkj.R.inc(85753);
            __CLR4_5_21u4o1u4olusvngkj.R.inc(85754);this.value = value;
        }finally{__CLR4_5_21u4o1u4olusvngkj.R.flushNeeded();}}
    }
}
