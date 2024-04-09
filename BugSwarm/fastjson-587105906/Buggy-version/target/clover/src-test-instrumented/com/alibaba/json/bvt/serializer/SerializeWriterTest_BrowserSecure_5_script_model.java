/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.io.StringWriter;

public class SerializeWriterTest_BrowserSecure_5_script_model extends TestCase {static class __CLR4_1_101t6r1t6rlusqkk7n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84534,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21t6r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84483,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21t6r() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84483);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84484);Model object = new Model();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84485);object.value = "<script>alert(1);</script>";
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84486);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84487);assertEquals("{\"value\":\"\\u003Cscript\\u003Ealert\\u00281\\u0029;\\u003C/script\\u003E\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84488);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84489);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84490);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1t6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84490,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1t6y() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84490);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84491);Model object = new Model();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84492);object.value = "<";
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84493);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84494);assertEquals("{\"value\":\"\\u003C\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84495);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84496);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441t75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441t75() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84497);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84498);Model object = new Model();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84499);object.value = "<script>";
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84500);String text = JSON.toJSONString(object, SerializerFeature.BrowserSecure);
//        assertEquals("{\"value\":\"&lt;script&gt;alert(1);&lt;\\/script&gt;\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84501);assertEquals("{\"value\":\"\\u003Cscript\\u003E\"}", text);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84502);Model object1 = JSON.parseObject(text, Model.class);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84503);assertEquals(object.value, object1.value);
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}
//
    public void test_3() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84504);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1t7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84504,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1t7c() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84504);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84505);StringBuilder buf = new StringBuilder();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84506);for (int i = 0; (((i < 500)&&(__CLR4_1_101t6r1t6rlusqkk7n.R.iget(84507)!=0|true))||(__CLR4_1_101t6r1t6rlusqkk7n.R.iget(84508)==0&false)); i++) {{
            __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84509);buf.append("<script>");
        }

        }__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84510);StringBuilder buf1 = new StringBuilder();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84511);buf1.append("{\"value\":\"");
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84512);for (int i = 0; (((i < 500)&&(__CLR4_1_101t6r1t6rlusqkk7n.R.iget(84513)!=0|true))||(__CLR4_1_101t6r1t6rlusqkk7n.R.iget(84514)==0&false)); i++) {{
            __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84515);buf1.append("\\u003Cscript\\u003E");
        }
        }__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84516);buf1.append("\"}");

        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84517);Model object = new Model();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84518);object.value = buf.toString();

        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84519);StringWriter out = new StringWriter();
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84520);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84521);writer.config(SerializerFeature.BrowserSecure, true);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84522);writer.writeObject(object);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84523);writer.flush();

        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84524);assertEquals(buf1.toString(), out.toString());
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}
//
    public void test_4() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61t7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84525,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61t7x() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84525);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84526);String text = JSON.toJSONString(new Model("("), SerializerFeature.BrowserSecure);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84527);assertEquals("{\"value\":\"\\u0028\"}", text);
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceStart(getClass().getName(),84528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1t80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t6r1t6rlusqkk7n.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t6r1t6rlusqkk7n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure_5_script_model.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1t80() throws Exception{try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84528);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84529);String text = JSON.toJSONString(new Model(")"), SerializerFeature.BrowserSecure);
        __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84530);assertEquals("{\"value\":\"\\u0029\"}", text);
    }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}

    public static class Model {
        public String value;

        public Model() {try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84531);

        }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}

        public Model(String value) {try{__CLR4_1_101t6r1t6rlusqkk7n.R.inc(84532);
            __CLR4_1_101t6r1t6rlusqkk7n.R.inc(84533);this.value = value;
        }finally{__CLR4_1_101t6r1t6rlusqkk7n.R.flushNeeded();}}
    }
}
