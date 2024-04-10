/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_string extends TestCase {static class __CLR4_1_101znp1znpluszwgig{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92918,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21znp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21znp() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92869);
        __CLR4_1_101znp1znpluszwgig.R.inc(92870);Model model = new Model();

        __CLR4_1_101znp1znpluszwgig.R.inc(92871);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_1_101znp1znpluszwgig.R.inc(92872);Assert.assertEquals("[null]", text);

        __CLR4_1_101znp1znpluszwgig.R.inc(92873);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101znp1znpluszwgig.R.inc(92874);Assert.assertNull(model2.name);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1znv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92875,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1znv() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92875);
        __CLR4_1_101znp1znpluszwgig.R.inc(92876);Model model = new Model();
        __CLR4_1_101znp1znpluszwgig.R.inc(92877);model.name = "abc";
        __CLR4_1_101znp1znpluszwgig.R.inc(92878);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_1_101znp1znpluszwgig.R.inc(92879);Assert.assertEquals("[\"abc\"]", text);

        __CLR4_1_101znp1znpluszwgig.R.inc(92880);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_1_101znp1znpluszwgig.R.inc(92881);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1zo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1zo2() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92882);
        __CLR4_1_101znp1znpluszwgig.R.inc(92883);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92884);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92885);JSON.parseObject("[n", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92886);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92887);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1zo8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1zo8() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92888);
        __CLR4_1_101znp1znpluszwgig.R.inc(92889);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92890);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92891);JSON.parseObject("[nu", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92892);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92893);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1zoe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92894,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1zoe() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92894);
        __CLR4_1_101znp1znpluszwgig.R.inc(92895);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92896);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92897);JSON.parseObject("[nul", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92898);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92899);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1zok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1zok() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92900);
        __CLR4_1_101znp1znpluszwgig.R.inc(92901);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92902);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92903);JSON.parseObject("[null", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92904);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92905);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1zoq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92906,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1zoq() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92906);
        __CLR4_1_101znp1znpluszwgig.R.inc(92907);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92908);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92909);JSON.parseObject("[\"ab", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92910);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92911);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101znp1znpluszwgig.R.globalSliceStart(getClass().getName(),92912);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81zow();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101znp1znpluszwgig.R.rethrow($CLV_t2$);}finally{__CLR4_1_101znp1znpluszwgig.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92912,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81zow() throws Exception{try{__CLR4_1_101znp1znpluszwgig.R.inc(92912);
        __CLR4_1_101znp1znpluszwgig.R.inc(92913);Exception error = null;
        __CLR4_1_101znp1znpluszwgig.R.inc(92914);try {
            __CLR4_1_101znp1znpluszwgig.R.inc(92915);JSON.parseObject("[\"ab\"", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101znp1znpluszwgig.R.inc(92916);error = ex;
        }
        __CLR4_1_101znp1znpluszwgig.R.inc(92917);Assert.assertNotNull(error);
    }finally{__CLR4_1_101znp1znpluszwgig.R.flushNeeded();}}

    public static class Model {

        public String name;

    }
}
