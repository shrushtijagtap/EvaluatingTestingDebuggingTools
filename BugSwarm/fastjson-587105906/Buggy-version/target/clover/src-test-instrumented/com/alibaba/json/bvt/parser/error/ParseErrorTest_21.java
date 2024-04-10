/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.error;

import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

import junit.framework.TestCase;

public class ParseErrorTest_21 extends TestCase {static class __CLR4_1_101oip1oipluszwdyj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_error() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qn60r01oip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78433,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qn60r01oip() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78433);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78434);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78435);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78436);JSON.parseObject("{\"value\":123}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78437);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78438);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public void test_for_error_1() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xj5i0y1oiv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xj5i0y1oiv() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78439);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78440);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78441);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78442);JSON.parseObject("{\"value\":{,,,\"id\",}}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78443);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78444);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public void test_for_error_2() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ua5j8h1oj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78445,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ua5j8h1oj1() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78445);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78446);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78447);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78448);JSON.parseObject("{\"value\":{'child1':{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78449);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78450);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public void test_for_error_3() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r15kg01oj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78451,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r15kg01oj7() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78451);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78452);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78453);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78454);JSON.parseObject("{\"value\":{'child1',{\"id\":123}}}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78455);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78456);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public void test_for_error_4() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ns5lnj1ojd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ns5lnj1ojd() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78457);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78458);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78459);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78460);JSON.parseObject("{\"value\":{child1:{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78461);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78462);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public void test_for_error_5() throws Exception {__CLR4_1_101oip1oipluszwdyj.R.globalSliceStart(getClass().getName(),78463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kj5mv21ojj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101oip1oipluszwdyj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101oip1oipluszwdyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kj5mv21ojj() throws Exception{try{__CLR4_1_101oip1oipluszwdyj.R.inc(78463);
        __CLR4_1_101oip1oipluszwdyj.R.inc(78464);Exception error = null;
        __CLR4_1_101oip1oipluszwdyj.R.inc(78465);try {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78466);JSON.parseObject("{\"value\":{child1,{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0, Feature.AllowUnQuotedFieldNames);   
        } catch (JSONException ex) {
            __CLR4_1_101oip1oipluszwdyj.R.inc(78467);error = ex;
        }
        __CLR4_1_101oip1oipluszwdyj.R.inc(78468);Assert.assertNotNull(error);
    }finally{__CLR4_1_101oip1oipluszwdyj.R.flushNeeded();}}
    
    public static class Model {
        public Map<String, Child> value;
    }
    
    public static class Child {
        public int id;
    }
}
