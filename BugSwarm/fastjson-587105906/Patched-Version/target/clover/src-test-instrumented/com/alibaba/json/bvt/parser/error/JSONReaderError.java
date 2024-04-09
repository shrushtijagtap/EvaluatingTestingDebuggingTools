/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.error;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class JSONReaderError extends TestCase {static class __CLR4_5_21ofc1ofclusvneya{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78356,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_reader_error() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22cfccg1ofc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78312,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22cfccg1ofc() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78312);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78313);Exception error = null;
        __CLR4_5_21ofc1ofclusvneya.R.inc(78314);try {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78315);JSONReader reader = new JSONReader(new StringReader("{\"id\":"));
            __CLR4_5_21ofc1ofclusvneya.R.inc(78316);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78317);error = ex;
        }
        __CLR4_5_21ofc1ofclusvneya.R.inc(78318);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}

    public void test_reader_error_1() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f38wpa1ofj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f38wpa1ofj() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78319);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78320);Exception error = null;
        __CLR4_5_21ofc1ofclusvneya.R.inc(78321);try {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78322);JSONReader reader = new JSONReader(new StringReader("{\"id\":\"aa"));
            __CLR4_5_21ofc1ofclusvneya.R.inc(78323);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78324);error = ex;
        }
        __CLR4_5_21ofc1ofclusvneya.R.inc(78325);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}

    public void test_reader_no_error() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rguo3k1ofq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rguo3k1ofq() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78326);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78327);JSONReader reader = new JSONReader(new StringReader("{\"id\":\"aa\",\"name\":\"wenshao\"}"));
        __CLR4_5_21ofc1ofclusvneya.R.inc(78328);Model model = reader.readObject(Model.class);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78329);Assert.assertEquals("aa", model.id);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78330);Assert.assertEquals("wenshao", model.name);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78331);reader.close();
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}
    
    public void test_reader_no_error_1() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78332);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2utze7m1ofw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78332,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2utze7m1ofw() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78332);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78333);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"}}"));
        __CLR4_5_21ofc1ofclusvneya.R.inc(78334);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_5_21ofc1ofclusvneya.R.inc(78335);Model model = map.get("model");
        __CLR4_5_21ofc1ofclusvneya.R.inc(78336);Assert.assertEquals("aa", model.id);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78337);Assert.assertEquals("wenshao", model.name);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78338);reader.close();
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}
    
    public void test_reader_no_error_2() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y2zd031og3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78339,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y2zd031og3() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78339);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78340);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"},\"model2\":{\"id\":\"bb\",\"name\":\"ljw\"}}"));
        __CLR4_5_21ofc1ofclusvneya.R.inc(78341);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        
        {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78342);Model model = map.get("model");
            __CLR4_5_21ofc1ofclusvneya.R.inc(78343);Assert.assertEquals("aa", model.id);
            __CLR4_5_21ofc1ofclusvneya.R.inc(78344);Assert.assertEquals("wenshao", model.name);
        }
        {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78345);Model model = map.get("model2");
            __CLR4_5_21ofc1ofclusvneya.R.inc(78346);Assert.assertEquals("bb", model.id);
            __CLR4_5_21ofc1ofclusvneya.R.inc(78347);Assert.assertEquals("ljw", model.name);
        }
        __CLR4_5_21ofc1ofclusvneya.R.inc(78348);reader.close();
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}
    
    public void test_reader_error_3() throws Exception {__CLR4_5_21ofc1ofclusvneya.R.globalSliceStart(getClass().getName(),78349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28l8z4c1ogd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ofc1ofclusvneya.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ofc1ofclusvneya.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28l8z4c1ogd() throws Exception{try{__CLR4_5_21ofc1ofclusvneya.R.inc(78349);
        __CLR4_5_21ofc1ofclusvneya.R.inc(78350);Exception error = null;
        __CLR4_5_21ofc1ofclusvneya.R.inc(78351);try {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78352);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"}["));
            __CLR4_5_21ofc1ofclusvneya.R.inc(78353);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_5_21ofc1ofclusvneya.R.inc(78354);error = ex;
        }
        __CLR4_5_21ofc1ofclusvneya.R.inc(78355);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ofc1ofclusvneya.R.flushNeeded();}}

    public static class Model {

        public String id;
        public String name;
    }
}
