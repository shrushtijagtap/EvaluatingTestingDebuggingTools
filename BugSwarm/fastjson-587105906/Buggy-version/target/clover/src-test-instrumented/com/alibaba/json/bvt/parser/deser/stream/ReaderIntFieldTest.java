/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderIntFieldTest extends TestCase {static class __CLR4_1_101ocd1ocdluszwdwq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,78267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_int_error_0() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78205);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102ijksj1ocd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78205,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102ijksj1ocd() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78205);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78206);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78207);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78208);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78209);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78210);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78211);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_error_1() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105rjjl01ock();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78212,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105rjjl01ock() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78212);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78213);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78214);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78215);JSONReader reader = new JSONReader(new StringReader("{\"value\":2147483648}"));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78216);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78217);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78218);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}
    
    public void test_int_error_1_x() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lob81p1ocr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78219,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lob81p1ocr() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78219);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78220);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78221);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78222);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78223);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78224);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78225);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}
    
    public void test_int_error_1_x1() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1015znj61ocy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1_x1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1015znj61ocy() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78226);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78227);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78228);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78229);JSONReader reader = new JSONReader(new StringReader("{\"value\":-2147483649}"));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78230);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78231);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78232);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_error_2() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1090jidh1od5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78233,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1090jidh1od5() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78233);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78234);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78235);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78236);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78237);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78238);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78239);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_normal() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78240);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103chf4b1odc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_normal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78240,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103chf4b1odc() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78240);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78241);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78242);Model model = reader.readObject(Model.class);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78243);Assert.assertEquals(1001, model.value);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78244);Assert.assertEquals(-2001, model.value2);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78245);reader.close();
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_normal_2() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78246);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10raqe5a1odi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_normal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78246,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10raqe5a1odi() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78246);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78247);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78248);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78249);Model model = map.get("model");
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78250);Assert.assertEquals(3001, model.value);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78251);Assert.assertEquals(-4001, model.value2);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78252);reader.close();
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_error_map() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101y030x1odp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78253,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101y030x1odp() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78253);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78254);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78255);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78256);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78257);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78258);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78259);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    public void test_int_error_end() throws Exception {__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceStart(getClass().getName(),78260);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107bfbke1odw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ocd1ocdluszwdwq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ocd1ocdluszwdwq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_end",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78260,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107bfbke1odw() throws Exception{try{__CLR4_1_101ocd1ocdluszwdwq.R.inc(78260);
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78261);Exception error = null;
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78262);try {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78263);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78264);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101ocd1ocdluszwdwq.R.inc(78265);error = ex;
        }
        __CLR4_1_101ocd1ocdluszwdwq.R.inc(78266);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ocd1ocdluszwdwq.R.flushNeeded();}}

    private static class Model {

        public int value;
        public int value2;
    }
}
