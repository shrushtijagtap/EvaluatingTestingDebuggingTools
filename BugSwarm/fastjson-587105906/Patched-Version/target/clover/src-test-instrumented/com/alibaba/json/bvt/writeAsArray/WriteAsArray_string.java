/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_string extends TestCase {static class __CLR4_5_21zne1znelusvni96{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92907,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21zne();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21zne() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92858);
        __CLR4_5_21zne1znelusvni96.R.inc(92859);Model model = new Model();

        __CLR4_5_21zne1znelusvni96.R.inc(92860);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21zne1znelusvni96.R.inc(92861);Assert.assertEquals("[null]", text);

        __CLR4_5_21zne1znelusvni96.R.inc(92862);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21zne1znelusvni96.R.inc(92863);Assert.assertNull(model2.name);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1znk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92864,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1znk() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92864);
        __CLR4_5_21zne1znelusvni96.R.inc(92865);Model model = new Model();
        __CLR4_5_21zne1znelusvni96.R.inc(92866);model.name = "abc";
        __CLR4_5_21zne1znelusvni96.R.inc(92867);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21zne1znelusvni96.R.inc(92868);Assert.assertEquals("[\"abc\"]", text);

        __CLR4_5_21zne1znelusvni96.R.inc(92869);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21zne1znelusvni96.R.inc(92870);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1znr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1znr() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92871);
        __CLR4_5_21zne1znelusvni96.R.inc(92872);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92873);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92874);JSON.parseObject("[n", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92875);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92876);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1znx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1znx() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92877);
        __CLR4_5_21zne1znelusvni96.R.inc(92878);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92879);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92880);JSON.parseObject("[nu", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92881);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92882);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1zo3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92883,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1zo3() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92883);
        __CLR4_5_21zne1znelusvni96.R.inc(92884);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92885);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92886);JSON.parseObject("[nul", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92887);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92888);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1zo9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1zo9() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92889);
        __CLR4_5_21zne1znelusvni96.R.inc(92890);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92891);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92892);JSON.parseObject("[null", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92893);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92894);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92895);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1zof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92895,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1zof() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92895);
        __CLR4_5_21zne1znelusvni96.R.inc(92896);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92897);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92898);JSON.parseObject("[\"ab", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92899);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92900);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21zne1znelusvni96.R.globalSliceStart(getClass().getName(),92901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81zol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zne1znelusvni96.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zne1znelusvni96.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81zol() throws Exception{try{__CLR4_5_21zne1znelusvni96.R.inc(92901);
        __CLR4_5_21zne1znelusvni96.R.inc(92902);Exception error = null;
        __CLR4_5_21zne1znelusvni96.R.inc(92903);try {
            __CLR4_5_21zne1znelusvni96.R.inc(92904);JSON.parseObject("[\"ab\"", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21zne1znelusvni96.R.inc(92905);error = ex;
        }
        __CLR4_5_21zne1znelusvni96.R.inc(92906);Assert.assertNotNull(error);
    }finally{__CLR4_5_21zne1znelusvni96.R.flushNeeded();}}

    public static class Model {

        public String name;

    }
}
