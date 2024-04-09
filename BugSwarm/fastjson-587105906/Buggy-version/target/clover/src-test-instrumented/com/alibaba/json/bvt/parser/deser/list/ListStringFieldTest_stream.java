/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class ListStringFieldTest_stream extends TestCase {static class __CLR4_1_101n041n04lusqkh3p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76582,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1n04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1n04() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76468);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76469);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\\\"\"]}";

        __CLR4_1_101n041n04lusqkh3p.R.inc(76470);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76471);Model model = reader.readObject(Model.class);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76472);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101n041n04lusqkh3p.R.inc(76473);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76474);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76475);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76476);Assert.assertEquals("ab\\c\"", model.values.get(3));
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1n0d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1n0d() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76477);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76478);String text = "{\"values\":null}";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76479);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76480);Model model = reader.readObject(Model.class);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76481);Assert.assertNull(model.values);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211n0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76482,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211n0i() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76482);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76483);String text = "{\"values\":[]}";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76484);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76485);Model model = reader.readObject(Model.class);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76486);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1n0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76487,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1n0n() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76487);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76488);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76489);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76490);Map<String, Model> map = reader.readObject(new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101n041n04lusqkh3p.R.inc(76491);Model model = (Model) map.get("model");
        __CLR4_1_101n041n04lusqkh3p.R.inc(76492);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76493);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1n0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76493,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1n0t() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76493);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76494);String text = "{\"value\":[]}";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76495);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101n041n04lusqkh3p.R.inc(76496);Model model = reader.readObject(Model.class);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76497);Assert.assertNull(model.values);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1n0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1n0y() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76498);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76499);String text = "{\"values\":[1";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76500);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76501);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76502);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76503);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76504);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76505);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1n16();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76506,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1n16() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76506);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76507);String text = "{\"values\":[\"b\"[";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76508);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76509);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76510);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76511);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76512);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76513);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76514);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1n1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76514,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1n1e() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76514);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76515);String text = "{\"model\":{\"values\":[][";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76516);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n041n04lusqkh3p.R.inc(76517);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76518);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76519);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76520);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76521);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1n1m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76522,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1n1m() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76522);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76523);String text = "{\"model\":{\"values\":[]}[";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76524);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n041n04lusqkh3p.R.inc(76525);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76526);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76527);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76528);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76529);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76530);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1n1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76530,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1n1u() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76530);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76531);String text = "{\"model\":{\"values\":[\"aaa]}[";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76532);JSONReader reader = new JSONReader(new StringReader(text));
        

        __CLR4_1_101n041n04lusqkh3p.R.inc(76533);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76534);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76535);reader.readObject(new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76536);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76537);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76538);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1n22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76538,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1n22() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76538);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76539);String text = "{\"values\":[n";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76540);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76541);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76542);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76543);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76544);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76545);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1n2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76546,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1n2a() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76546);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76547);String text = "{\"values\":[nu";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76548);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76549);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76550);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76551);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76552);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76553);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76554);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1n2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76554,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1n2i() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76554);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76555);String text = "{\"values\":[nul";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76556);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76557);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76558);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76559);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76560);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76561);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21n2q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21n2q() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76562);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76563);String text = "{\"values\":[null";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76564);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76565);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76566);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76567);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76568);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76569);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_1_101n041n04lusqkh3p.R.globalSliceStart(getClass().getName(),76570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t4ut911n2y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n041n04lusqkh3p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n041n04lusqkh3p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.test_error_rbacket",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76570,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t4ut911n2y() throws Exception{try{__CLR4_1_101n041n04lusqkh3p.R.inc(76570);
        __CLR4_1_101n041n04lusqkh3p.R.inc(76571);String text = "{\"values\":[null,]";
        __CLR4_1_101n041n04lusqkh3p.R.inc(76572);JSONReader reader = new JSONReader(new StringReader(text));

        __CLR4_1_101n041n04lusqkh3p.R.inc(76573);Exception error = null;
        __CLR4_1_101n041n04lusqkh3p.R.inc(76574);try {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76575);reader.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101n041n04lusqkh3p.R.inc(76576);error = ex;
        }
        __CLR4_1_101n041n04lusqkh3p.R.inc(76577);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101n041n04lusqkh3p.R.inc(76578);
            __CLR4_1_101n041n04lusqkh3p.R.inc(76579);return values;
        }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101n041n04lusqkh3p.R.inc(76580);
            __CLR4_1_101n041n04lusqkh3p.R.inc(76581);this.values = values;
        }finally{__CLR4_1_101n041n04lusqkh3p.R.flushNeeded();}}

    }
}
