/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BooleanFieldTest_array extends TestCase {static class __CLR4_5_21qk61qk6lusyjusm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81132,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model_error_t() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fkr6rj1qk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_t",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fkr6rj1qk6() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81078);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81079);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81080);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81081);JSON.parseObject("[t", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81082);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81083);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_tr() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2izokjl1qkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tr",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81084,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2izokjl1qkc() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81084);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81085);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81086);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81087);JSON.parseObject("[tr", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81088);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81089);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_tru() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81090);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qyskmc1qki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tru",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81090,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qyskmc1qki() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81090);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81091);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81092);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81093);JSON.parseObject("[tru", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81094);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81095);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    
    public void test_model_error_true_notclose() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81096);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lo309p1qko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_true_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81096,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lo309p1qko() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81096);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81097);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81098);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81099);JSON.parseObject("[true", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81100);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81101);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_false_notclose() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81102);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t2zb2a1qku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_false_notclose",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81102,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t2zb2a1qku() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81102);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81103);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81104);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81105);JSON.parseObject("[false", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81106);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81107);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_f() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81108);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29ydc4z1ql0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81108,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29ydc4z1ql0() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81108);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81109);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81110);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81111);JSON.parseObject("[f", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81112);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81113);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_fa() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26x3q8s1ql6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fa",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81114,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26x3q8s1ql6() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81114);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81115);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81116);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81117);JSON.parseObject("[fa", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81118);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81119);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    public void test_model_error_fal() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jlxk721qlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jlxk721qlc() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81120);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81121);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81122);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81123);JSON.parseObject("[fal", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81124);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81125);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    
    public void test_model_error_fals() throws Exception {__CLR4_5_21qk61qk6lusyjusm.R.globalSliceStart(getClass().getName(),81126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29jxseb1qli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qk61qk6lusyjusm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qk61qk6lusyjusm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fals",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29jxseb1qli() throws Exception{try{__CLR4_5_21qk61qk6lusyjusm.R.inc(81126);
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81127);Exception error = null;
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81128);try {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81129);JSON.parseObject("[fals", Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21qk61qk6lusyjusm.R.inc(81130);error = ex;
        }
        __CLR4_5_21qk61qk6lusyjusm.R.inc(81131);Assert.assertNotNull(error);
    }finally{__CLR4_5_21qk61qk6lusyjusm.R.flushNeeded();}}
    
    @JSONType(serialzeFeatures = SerializerFeature.BeanToArray, parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        public boolean value;
        public boolean value1;
    }
}
