/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.io.StringWriter;

public class SerializeWriterTest_BrowserSecure_5_script_model extends TestCase {static class __CLR4_1_101u4z1u4zluszwf7q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85766,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85715);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21u4z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85715,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21u4z() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85715);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85716);Model object = new Model();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85717);object.value = "<script>alert(1);</script>";
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85718);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85719);assertEquals("{\"value\":\"\\u003Cscript\\u003Ealert\\u00281\\u0029;\\u003C/script\\u003E\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85720);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85721);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1u56();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85722,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1u56() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85722);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85723);Model object = new Model();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85724);object.value = "<";
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85725);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85726);assertEquals("{\"value\":\"\\u003C\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85727);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85728);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441u5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441u5d() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85729);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85730);Model object = new Model();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85731);object.value = "<script>";
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85732);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85733);assertEquals("{\"value\":\"\\u003Cscript\\u003E\"}", text);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85734);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85735);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}
//
    public void test_3() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1u5k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1u5k() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85736);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85737);StringBuilder buf = new StringBuilder();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85738);for (int i = 0; (((i < 500)&&(__CLR4_1_101u4z1u4zluszwf7q.R.iget(85739)!=0|true))||(__CLR4_1_101u4z1u4zluszwf7q.R.iget(85740)==0&false)); i++) {{
            __CLR4_1_101u4z1u4zluszwf7q.R.inc(85741);buf.append("<script>");
        }

        }__CLR4_1_101u4z1u4zluszwf7q.R.inc(85742);StringBuilder buf1 = new StringBuilder();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85743);buf1.append("{\"value\":\"");
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85744);for (int i = 0; (((i < 500)&&(__CLR4_1_101u4z1u4zluszwf7q.R.iget(85745)!=0|true))||(__CLR4_1_101u4z1u4zluszwf7q.R.iget(85746)==0&false)); i++) {{
            __CLR4_1_101u4z1u4zluszwf7q.R.inc(85747);buf1.append("\\u003Cscript\\u003E");
        }
        }__CLR4_1_101u4z1u4zluszwf7q.R.inc(85748);buf1.append("\"}");

        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85749);Model object = new Model();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85750);object.value = buf.toString();

        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85751);StringWriter out = new StringWriter();
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85752);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85753);writer.config(SerializerFeature.BrowserSecure, true);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85754);writer.writeObject(object);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85755);writer.flush();

        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85756);assertEquals(buf1.toString(), out.toString());
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}
//
    public void test_4() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61u65();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61u65() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85757);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85758);String text = JSON.toJSONString(new Model("("), SerializerFeature.BrowserSecure);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85759);assertEquals("{\"value\":\"\\u0028\"}", text);
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceStart(getClass().getName(),85760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1u68();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u4z1u4zluszwf7q.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u4z1u4zluszwf7q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85760,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1u68() throws Exception{try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85760);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85761);String text = JSON.toJSONString(new Model(")"), SerializerFeature.BrowserSecure);
        __CLR4_1_101u4z1u4zluszwf7q.R.inc(85762);assertEquals("{\"value\":\"\\u0029\"}", text);
    }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}

    public static class Model {
        public String value;

        public Model() {try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85763);

        }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}

        public Model(String value) {try{__CLR4_1_101u4z1u4zluszwf7q.R.inc(85764);
            __CLR4_1_101u4z1u4zluszwf7q.R.inc(85765);this.value = value;
        }finally{__CLR4_1_101u4z1u4zluszwf7q.R.flushNeeded();}}
    }
}
