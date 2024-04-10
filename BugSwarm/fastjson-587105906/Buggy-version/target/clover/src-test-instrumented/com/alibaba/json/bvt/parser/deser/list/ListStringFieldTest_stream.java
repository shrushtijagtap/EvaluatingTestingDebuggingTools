/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream extends TestCase {static class __CLR4_1_101nyc1nycluszwdv7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77814,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1nyc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77700,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1nyc() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77700);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77701);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\\\"\"]}";

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77702);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77703);Model model = reader.readObject(Model.class);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77704);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77705);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77706);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77707);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77708);Assert.assertEquals("ab\\c\"", model.values.get(3));
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1nyl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77709,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1nyl() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77709);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77710);String text = "{\"values\":null}";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77711);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77712);Model model = reader.readObject(Model.class);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77713);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77714);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211nyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77714,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211nyq() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77714);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77715);String text = "{\"values\":[]}";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77716);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77717);Model model = reader.readObject(Model.class);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77718);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1nyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1nyv() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77719);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77720);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77721);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77722);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77723);Model model = (Model) map.get("model");
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77724);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1nz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77725,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1nz1() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77725);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77726);String text = "{\"value\":[]}";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77727);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77728);Model model = reader.readObject(Model.class);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77729);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1nz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77730,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1nz6() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77730);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77731);String text = "{\"values\":[1";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77732);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77733);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77734);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77735);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77736);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77737);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1nze();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77738,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1nze() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77738);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77739);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77740);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77741);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77742);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77743);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77744);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77745);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1nzm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77746,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1nzm() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77746);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77747);String text = "{\"model\":{\"values\":[][";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77748);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77749);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77750);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77751);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77752);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77753);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1nzu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1nzu() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77754);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77755);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77756);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77757);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77758);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77759);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77760);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77761);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1o02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77762,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1o02() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77762);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77763);String text = "{\"model\":{\"values\":[\"aaa]}[";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77764);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77765);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77766);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77767);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77768);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77769);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1o0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77770,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1o0a() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77770);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77771);String text = "{\"values\":[n";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77772);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77773);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77774);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77775);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77776);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77777);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1o0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77778,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1o0i() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77778);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77779);String text = "{\"values\":[nu";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77780);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77781);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77782);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77783);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77784);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77785);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1o0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1o0q() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77786);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77787);String text = "{\"values\":[nul";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77788);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77789);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77790);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77791);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77792);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77793);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21o0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77794,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21o0y() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77794);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77795);String text = "{\"values\":[null";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77796);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77797);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77798);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77799);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77800);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77801);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_1_101nyc1nycluszwdv7.R.globalSliceStart(getClass().getName(),77802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t4ut911o16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nyc1nycluszwdv7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nyc1nycluszwdv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_rbacket",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77802,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t4ut911o16() throws Exception{try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77802);
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77803);String text = "{\"values\":[null,]";
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77804);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101nyc1nycluszwdv7.R.inc(77805);Exception error = null;
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77806);try {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77807);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77808);error = ex;
        }
        __CLR4_1_101nyc1nycluszwdv7.R.inc(77809);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77810);
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77811);return values;
        }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101nyc1nycluszwdv7.R.inc(77812);
            __CLR4_1_101nyc1nycluszwdv7.R.inc(77813);this.values = values;
        }finally{__CLR4_1_101nyc1nycluszwdv7.R.flushNeeded();}}

    }
}
