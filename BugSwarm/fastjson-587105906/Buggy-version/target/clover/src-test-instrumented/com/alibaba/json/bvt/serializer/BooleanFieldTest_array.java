/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class BooleanFieldTest_array extends TestCase {static class __CLR4_1_101qkh1qkhlusqkj6u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,81143,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_model_error_t() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81089);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fkr6rj1qkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81089,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fkr6rj1qkh() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81089);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81090);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81091);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81092);JSON.parseObject("[t", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81093);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81094);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_tr() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81095);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10izokjl1qkn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tr",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81095,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10izokjl1qkn() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81095);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81096);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81097);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81098);JSON.parseObject("[tr", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81099);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81100);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_tru() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81101);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qyskmc1qkt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_tru",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81101,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qyskmc1qkt() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81101);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81102);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81103);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81104);JSON.parseObject("[tru", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81105);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81106);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    
    public void test_model_error_true_notclose() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lo309p1qkz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_true_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lo309p1qkz() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81107);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81108);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81109);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81110);JSON.parseObject("[true", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81111);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81112);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_false_notclose() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81113);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t2zb2a1ql5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_false_notclose",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81113,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t2zb2a1ql5() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81113);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81114);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81115);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81116);JSON.parseObject("[false", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81117);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81118);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_f() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109ydc4z1qlb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81119,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109ydc4z1qlb() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81119);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81120);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81121);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81122);JSON.parseObject("[f", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81123);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81124);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_fa() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81125);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106x3q8s1qlh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fa",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81125,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106x3q8s1qlh() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81125);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81126);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81127);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81128);JSON.parseObject("[fa", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81129);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81130);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    public void test_model_error_fal() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jlxk721qln();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jlxk721qln() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81131);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81132);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81133);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81134);JSON.parseObject("[fal", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81135);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81136);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    
    public void test_model_error_fals() throws Exception {__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceStart(getClass().getName(),81137);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109jxseb1qlt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qkh1qkhlusqkj6u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qkh1qkhlusqkj6u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest_array.test_model_error_fals",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81137,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109jxseb1qlt() throws Exception{try{__CLR4_1_101qkh1qkhlusqkj6u.R.inc(81137);
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81138);Exception error = null;
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81139);try {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81140);JSON.parseObject("[fals", Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81141);error = ex;
        }
        __CLR4_1_101qkh1qkhlusqkj6u.R.inc(81142);Assert.assertNotNull(error);
    }finally{__CLR4_1_101qkh1qkhlusqkj6u.R.flushNeeded();}}
    
    @JSONType(serialzeFeatures = SerializerFeature.BeanToArray, parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        public boolean value;
        public boolean value1;
    }
}
