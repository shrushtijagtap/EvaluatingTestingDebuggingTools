/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.error;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class JSONReaderError extends TestCase {static class __CLR4_1_101nhf1nhflusqkh8y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,77135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_reader_error() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77091);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102cfccg1nhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77091,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102cfccg1nhf() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77091);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77092);Exception error = null;
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77093);try {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77094);JSONReader reader = new JSONReader(new StringReader("{\"id\":"));
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77095);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77096);error = ex;
        }
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77097);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}

    public void test_reader_error_1() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77098);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f38wpa1nhm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77098,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f38wpa1nhm() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77098);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77099);Exception error = null;
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77100);try {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77101);JSONReader reader = new JSONReader(new StringReader("{\"id\":\"aa"));
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77102);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77103);error = ex;
        }
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77104);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}

    public void test_reader_no_error() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rguo3k1nht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77105,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rguo3k1nht() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77105);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77106);JSONReader reader = new JSONReader(new StringReader("{\"id\":\"aa\",\"name\":\"wenshao\"}"));
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77107);Model model = reader.readObject(Model.class);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77108);Assert.assertEquals("aa", model.id);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77109);Assert.assertEquals("wenshao", model.name);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77110);reader.close();
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}
    
    public void test_reader_no_error_1() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10utze7m1nhz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10utze7m1nhz() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77111);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77112);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"}}"));
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77113);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77114);Model model = map.get("model");
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77115);Assert.assertEquals("aa", model.id);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77116);Assert.assertEquals("wenshao", model.name);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77117);reader.close();
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}
    
    public void test_reader_no_error_2() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y2zd031ni6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_no_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y2zd031ni6() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77118);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77119);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"},\"model2\":{\"id\":\"bb\",\"name\":\"ljw\"}}"));
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77120);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        
        {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77121);Model model = map.get("model");
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77122);Assert.assertEquals("aa", model.id);
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77123);Assert.assertEquals("wenshao", model.name);
        }
        {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77124);Model model = map.get("model2");
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77125);Assert.assertEquals("bb", model.id);
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77126);Assert.assertEquals("ljw", model.name);
        }
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77127);reader.close();
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}
    
    public void test_reader_error_3() throws Exception {__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceStart(getClass().getName(),77128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108l8z4c1nig();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nhf1nhflusqkh8y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nhf1nhflusqkh8y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.error.JSONReaderError.test_reader_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108l8z4c1nig() throws Exception{try{__CLR4_1_101nhf1nhflusqkh8y.R.inc(77128);
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77129);Exception error = null;
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77130);try {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77131);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"id\":\"aa\",\"name\":\"wenshao\"}["));
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77132);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {});
        } catch (JSONException ex) {
            __CLR4_1_101nhf1nhflusqkh8y.R.inc(77133);error = ex;
        }
        __CLR4_1_101nhf1nhflusqkh8y.R.inc(77134);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nhf1nhflusqkh8y.R.flushNeeded();}}

    public static class Model {

        public String id;
        public String name;
    }
}
