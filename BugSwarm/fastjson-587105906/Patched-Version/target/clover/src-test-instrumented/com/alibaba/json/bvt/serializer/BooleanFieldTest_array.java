/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BooleanFieldTest_array extends TestCase {static class __CLR4_5_21rie1rielusvng03{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model_error_t() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkr6rj1rie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_t",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkr6rj1rie() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82310);
        __CLR4_5_21rie1rielusvng03.R.inc(82311);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82312);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82313);JSON.parseObject("[t", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82314);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82315);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_tr() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82316);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2izokjl1rik();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82316,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2izokjl1rik() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82316);
        __CLR4_5_21rie1rielusvng03.R.inc(82317);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82318);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82319);JSON.parseObject("[tr", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82320);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82321);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_tru() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82322);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qyskmc1riq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tru",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82322,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qyskmc1riq() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82322);
        __CLR4_5_21rie1rielusvng03.R.inc(82323);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82324);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82325);JSON.parseObject("[tru", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82326);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82327);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    
    public void test_model_error_true_notclose() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82328);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lo309p1riw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_true_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82328,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lo309p1riw() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82328);
        __CLR4_5_21rie1rielusvng03.R.inc(82329);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82330);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82331);JSON.parseObject("[true", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82332);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82333);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_false_notclose() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82334);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2zb2a1rj2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_false_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82334,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2zb2a1rj2() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82334);
        __CLR4_5_21rie1rielusvng03.R.inc(82335);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82336);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82337);JSON.parseObject("[false", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82338);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82339);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_f() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82340);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ydc4z1rj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82340,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ydc4z1rj8() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82340);
        __CLR4_5_21rie1rielusvng03.R.inc(82341);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82342);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82343);JSON.parseObject("[f", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82344);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82345);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_fa() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82346);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26x3q8s1rje();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fa",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82346,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26x3q8s1rje() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82346);
        __CLR4_5_21rie1rielusvng03.R.inc(82347);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82348);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82349);JSON.parseObject("[fa", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82350);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82351);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    public void test_model_error_fal() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82352);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlxk721rjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82352,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlxk721rjk() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82352);
        __CLR4_5_21rie1rielusvng03.R.inc(82353);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82354);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82355);JSON.parseObject("[fal", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82356);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82357);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    
    public void test_model_error_fals() throws Exception {__CLR4_5_21rie1rielusvng03.R.globalSliceStart(getClass().getName(),82358);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29jxseb1rjq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rie1rielusvng03.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rie1rielusvng03.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82358,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29jxseb1rjq() throws Exception{try{__CLR4_5_21rie1rielusvng03.R.inc(82358);
        __CLR4_5_21rie1rielusvng03.R.inc(82359);Exception error = null;
        __CLR4_5_21rie1rielusvng03.R.inc(82360);try {
            __CLR4_5_21rie1rielusvng03.R.inc(82361);JSON.parseObject("[fals", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21rie1rielusvng03.R.inc(82362);error = ex;
        }
        __CLR4_5_21rie1rielusvng03.R.inc(82363);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rie1rielusvng03.R.flushNeeded();}}
    
    @JSONType(serialzeFeatures = SerializerFeature.BeanToArray, parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        public boolean value;
        public boolean value1;
    }
}
