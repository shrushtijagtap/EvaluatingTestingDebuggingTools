/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BooleanFieldTest_array extends TestCase {static class __CLR4_1_101rip1ripluszwetu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82375,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model_error_t() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82321);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fkr6rj1rip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82321,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fkr6rj1rip() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82321);
        __CLR4_1_101rip1ripluszwetu.R.inc(82322);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82323);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82324);JSON.parseObject("[t", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82325);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82326);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_tr() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82327);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10izokjl1riv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82327,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10izokjl1riv() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82327);
        __CLR4_1_101rip1ripluszwetu.R.inc(82328);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82329);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82330);JSON.parseObject("[tr", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82331);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82332);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_tru() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82333);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qyskmc1rj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tru",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82333,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qyskmc1rj1() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82333);
        __CLR4_1_101rip1ripluszwetu.R.inc(82334);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82335);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82336);JSON.parseObject("[tru", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82337);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82338);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    
    public void test_model_error_true_notclose() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lo309p1rj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_true_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lo309p1rj7() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82339);
        __CLR4_1_101rip1ripluszwetu.R.inc(82340);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82341);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82342);JSON.parseObject("[true", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82343);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82344);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_false_notclose() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t2zb2a1rjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_false_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t2zb2a1rjd() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82345);
        __CLR4_1_101rip1ripluszwetu.R.inc(82346);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82347);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82348);JSON.parseObject("[false", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82349);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82350);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_f() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ydc4z1rjj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ydc4z1rjj() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82351);
        __CLR4_1_101rip1ripluszwetu.R.inc(82352);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82353);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82354);JSON.parseObject("[f", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82355);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82356);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_fa() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106x3q8s1rjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fa",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106x3q8s1rjp() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82357);
        __CLR4_1_101rip1ripluszwetu.R.inc(82358);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82359);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82360);JSON.parseObject("[fa", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82361);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82362);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    public void test_model_error_fal() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82363);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jlxk721rjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82363,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jlxk721rjv() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82363);
        __CLR4_1_101rip1ripluszwetu.R.inc(82364);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82365);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82366);JSON.parseObject("[fal", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82367);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82368);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    
    public void test_model_error_fals() throws Exception {__CLR4_1_101rip1ripluszwetu.R.globalSliceStart(getClass().getName(),82369);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109jxseb1rk1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rip1ripluszwetu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rip1ripluszwetu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fals",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82369,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109jxseb1rk1() throws Exception{try{__CLR4_1_101rip1ripluszwetu.R.inc(82369);
        __CLR4_1_101rip1ripluszwetu.R.inc(82370);Exception error = null;
        __CLR4_1_101rip1ripluszwetu.R.inc(82371);try {
            __CLR4_1_101rip1ripluszwetu.R.inc(82372);JSON.parseObject("[fals", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101rip1ripluszwetu.R.inc(82373);error = ex;
        }
        __CLR4_1_101rip1ripluszwetu.R.inc(82374);Assert.assertNotNull(error);
    }finally{__CLR4_1_101rip1ripluszwetu.R.flushNeeded();}}
    
    @JSONType(serialzeFeatures = SerializerFeature.BeanToArray, parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        public boolean value;
        public boolean value1;
    }
}
