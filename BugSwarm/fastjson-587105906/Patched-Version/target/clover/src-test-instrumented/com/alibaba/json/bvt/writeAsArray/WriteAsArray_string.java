/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_string extends TestCase {static class __CLR4_5_21yp61yp6lusyjvwh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91675,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21yp6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21yp6() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91626);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91627);Model model = new Model();

        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91628);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91629);Assert.assertEquals("[null]", text);

        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91630);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91631);Assert.assertNull(model2.name);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ypc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ypc() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91632);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91633);Model model = new Model();
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91634);model.name = "abc";
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91635);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91636);Assert.assertEquals("[\"abc\"]", text);

        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91637);Model model2 = JSON.parseObject(text, Model.class, Feature.SupportArrayToBean);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91638);Assert.assertEquals(model.name, model2.name);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}
    
    public void test_error_0() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1ypj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1ypj() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91639);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91640);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91641);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91642);JSON.parseObject("[n", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91643);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91644);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ypp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ypp() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91645);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91646);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91647);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91648);JSON.parseObject("[nu", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91649);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91650);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ypv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ypv() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91651);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91652);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91653);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91654);JSON.parseObject("[nul", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91655);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91656);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1yq1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1yq1() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91657);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91658);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91659);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91660);JSON.parseObject("[null", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91661);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91662);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1yq7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91663,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1yq7() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91663);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91664);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91665);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91666);JSON.parseObject("[\"ab", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91667);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91668);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceStart(getClass().getName(),91669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81yqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yp61yp6lusyjvwh.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yp61yp6lusyjvwh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81yqd() throws Exception{try{__CLR4_5_21yp61yp6lusyjvwh.R.inc(91669);
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91670);Exception error = null;
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91671);try {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91672);JSON.parseObject("[\"ab\"", Model.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_5_21yp61yp6lusyjvwh.R.inc(91673);error = ex;
        }
        __CLR4_5_21yp61yp6lusyjvwh.R.inc(91674);Assert.assertNotNull(error);
    }finally{__CLR4_5_21yp61yp6lusyjvwh.R.flushNeeded();}}

    public static class Model {

        public String name;

    }
}
