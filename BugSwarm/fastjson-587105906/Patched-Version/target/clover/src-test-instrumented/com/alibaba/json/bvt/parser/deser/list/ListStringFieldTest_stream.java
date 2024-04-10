/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream extends TestCase {static class __CLR4_5_21mzt1mztlusyjud0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76571,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1mzt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1mzt() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76457);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76458);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\\\"\"]}";

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76459);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76460);Model model = reader.readObject(Model.class);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76461);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76462);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76463);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76464);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76465);Assert.assertEquals("ab\\c\"", model.values.get(3));
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1n02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1n02() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76466);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76467);String text = "{\"values\":null}";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76468);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76469);Model model = reader.readObject(Model.class);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76470);Assert.assertNull(model.values);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211n07();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211n07() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76471);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76472);String text = "{\"values\":[]}";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76473);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76474);Model model = reader.readObject(Model.class);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76475);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1n0c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1n0c() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76476);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76477);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76478);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76479);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76480);Model model = (Model) map.get("model");
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76481);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1n0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76482,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1n0i() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76482);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76483);String text = "{\"value\":[]}";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76484);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76485);Model model = reader.readObject(Model.class);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76486);Assert.assertNull(model.values);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1n0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1n0n() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76487);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76488);String text = "{\"values\":[1";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76489);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76490);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76491);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76492);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76493);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76494);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1n0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1n0v() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76495);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76496);String text = "{\"values\":[\"b\"[";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76497);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76498);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76499);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76500);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76501);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76502);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1n13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76503,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1n13() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76503);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76504);String text = "{\"model\":{\"values\":[][";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76505);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76506);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76507);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76508);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76509);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76510);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1n1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1n1b() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76511);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76512);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76513);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76514);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76515);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76516);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76517);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76518);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1n1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76519,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1n1j() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76519);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76520);String text = "{\"model\":{\"values\":[\"aaa]}[";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76521);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76522);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76523);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76524);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76525);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76526);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76527);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1n1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76527,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1n1r() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76527);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76528);String text = "{\"values\":[n";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76529);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76530);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76531);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76532);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76533);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76534);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76535);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1n1z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76535,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1n1z() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76535);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76536);String text = "{\"values\":[nu";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76537);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76538);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76539);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76540);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76541);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76542);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76543);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1n27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76543,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1n27() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76543);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76544);String text = "{\"values\":[nul";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76545);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76546);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76547);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76548);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76549);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76550);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21n2f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21n2f() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76551);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76552);String text = "{\"values\":[null";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76553);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76554);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76555);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76556);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76557);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76558);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_5_21mzt1mztlusyjud0.R.globalSliceStart(getClass().getName(),76559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4ut911n2n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mzt1mztlusyjud0.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mzt1mztlusyjud0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_rbacket",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76559,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4ut911n2n() throws Exception{try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76559);
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76560);String text = "{\"values\":[null,]";
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76561);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_5_21mzt1mztlusyjud0.R.inc(76562);Exception error = null;
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76563);try {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76564);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76565);error = ex;
        }
        __CLR4_5_21mzt1mztlusyjud0.R.inc(76566);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76567);
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76568);return values;
        }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21mzt1mztlusyjud0.R.inc(76569);
            __CLR4_5_21mzt1mztlusyjud0.R.inc(76570);this.values = values;
        }finally{__CLR4_5_21mzt1mztlusyjud0.R.flushNeeded();}}

    }
}
