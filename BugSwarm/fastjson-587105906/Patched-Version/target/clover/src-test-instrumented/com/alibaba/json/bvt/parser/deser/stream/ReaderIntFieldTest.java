/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.stream;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ReaderIntFieldTest extends TestCase {static class __CLR4_5_21ndu1ndulusyjudq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,77024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_int_error_0() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76962);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22ijksj1ndu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76962,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22ijksj1ndu() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76962);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76963);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76964);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76965);JSONReader reader = new JSONReader(new StringReader("{\"value\":1.A}"));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76966);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76967);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76968);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_error_1() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76969);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25rjjl01ne1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76969,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25rjjl01ne1() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76969);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76970);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76971);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76972);JSONReader reader = new JSONReader(new StringReader("{\"value\":2147483648}"));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76973);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76974);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76975);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}
    
    public void test_int_error_1_x() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lob81p1ne8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lob81p1ne8() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76976);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76977);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76978);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76979);JSONReader reader = new JSONReader(new StringReader("{\"value\":9223372036854775808}"));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76980);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76981);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76982);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}
    
    public void test_int_error_1_x1() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215znj61nef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_1_x1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76983,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215znj61nef() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76983);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76984);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76985);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76986);JSONReader reader = new JSONReader(new StringReader("{\"value\":-2147483649}"));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76987);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76988);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76989);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_error_2() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_290jidh1nem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_290jidh1nem() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76990);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76991);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76992);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76993);JSONReader reader = new JSONReader(new StringReader("{\"value\":AA}"));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76994);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(76995);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76996);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_normal() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),76997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23chf4b1net();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_normal",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23chf4b1net() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(76997);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76998);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001}"));
        __CLR4_5_21ndu1ndulusyjudq.R.inc(76999);Model model = reader.readObject(Model.class);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77000);Assert.assertEquals(1001, model.value);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77001);Assert.assertEquals(-2001, model.value2);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77002);reader.close();
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_normal_2() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),77003);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2raqe5a1nez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_normal_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77003,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2raqe5a1nez() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(77003);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77004);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}}"));
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77005);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77006);Model model = map.get("model");
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77007);Assert.assertEquals(3001, model.value);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77008);Assert.assertEquals(-4001, model.value2);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77009);reader.close();
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_error_map() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),77010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21y030x1nf6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77010,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21y030x1nf6() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(77010);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77011);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77012);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77013);JSONReader reader = new JSONReader(new StringReader("{\"model\":{\"value\":3001,\"value2\":-4001}["));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77014);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77015);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77016);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    public void test_int_error_end() throws Exception {__CLR4_5_21ndu1ndulusyjudq.R.globalSliceStart(getClass().getName(),77017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27bfbke1nfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ndu1ndulusyjudq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ndu1ndulusyjudq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.stream.ReaderIntFieldTest.test_int_error_end",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27bfbke1nfd() throws Exception{try{__CLR4_5_21ndu1ndulusyjudq.R.inc(77017);
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77018);Exception error = null;
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77019);try {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77020);JSONReader reader = new JSONReader(new StringReader("{\"value\":1001,\"value2\":-2001["));
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77021);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21ndu1ndulusyjudq.R.inc(77022);error = ex;
        }
        __CLR4_5_21ndu1ndulusyjudq.R.inc(77023);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ndu1ndulusyjudq.R.flushNeeded();}}

    private static class Model {

        public int value;
        public int value2;
    }
}
