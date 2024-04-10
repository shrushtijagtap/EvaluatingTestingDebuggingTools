/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.error;

import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

import junit.framework.TestCase;

public class ParseErrorTest_21 extends TestCase {static class __CLR4_5_21nk61nk6lusyjueg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77226,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_error() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77190);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qn60r01nk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77190,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qn60r01nk6() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77190);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77191);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77192);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77193);JSON.parseObject("{\"value\":123}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77194);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77195);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public void test_for_error_1() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xj5i0y1nkc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xj5i0y1nkc() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77196);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77197);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77198);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77199);JSON.parseObject("{\"value\":{,,,\"id\",}}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77200);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77201);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public void test_for_error_2() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77202);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ua5j8h1nki();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77202,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ua5j8h1nki() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77202);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77203);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77204);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77205);JSON.parseObject("{\"value\":{'child1':{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77206);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77207);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public void test_for_error_3() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r15kg01nko();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r15kg01nko() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77208);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77209);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77210);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77211);JSON.parseObject("{\"value\":{'child1',{\"id\":123}}}", Model.class);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77212);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77213);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public void test_for_error_4() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ns5lnj1nku();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77214,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ns5lnj1nku() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77214);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77215);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77216);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77217);JSON.parseObject("{\"value\":{child1:{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77218);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77219);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public void test_for_error_5() throws Exception {__CLR4_5_21nk61nk6lusyjueg.R.globalSliceStart(getClass().getName(),77220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kj5mv21nl0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nk61nk6lusyjueg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nk61nk6lusyjueg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.ParseErrorTest_21.test_for_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kj5mv21nl0() throws Exception{try{__CLR4_5_21nk61nk6lusyjueg.R.inc(77220);
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77221);Exception error = null;
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77222);try {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77223);JSON.parseObject("{\"value\":{child1,{\"id\":123}}}", Model.class, ParserConfig.getGlobalInstance(), 0, Feature.AllowUnQuotedFieldNames);   
        } catch (JSONException ex) {
            __CLR4_5_21nk61nk6lusyjueg.R.inc(77224);error = ex;
        }
        __CLR4_5_21nk61nk6lusyjueg.R.inc(77225);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nk61nk6lusyjueg.R.flushNeeded();}}
    
    public static class Model {
        public Map<String, Child> value;
    }
    
    public static class Child {
        public int id;
    }
}
