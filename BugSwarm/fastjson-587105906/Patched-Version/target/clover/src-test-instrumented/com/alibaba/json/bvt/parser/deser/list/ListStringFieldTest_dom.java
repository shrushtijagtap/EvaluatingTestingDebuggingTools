/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream.Model;

import junit.framework.TestCase;

public class ListStringFieldTest_dom extends TestCase {static class __CLR4_5_21msr1msrlusyjucm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1msr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1msr() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76203);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76204);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76205);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76206);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21msr1msrlusyjucm.R.inc(76207);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21msr1msrlusyjucm.R.inc(76208);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21msr1msrlusyjucm.R.inc(76209);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21msr1msrlusyjucm.R.inc(76210);Assert.assertEquals("ab\\c", model.values.get(3));
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1msz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1msz() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76211);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76212);String text = "{\"values\":null}";
        __CLR4_5_21msr1msrlusyjucm.R.inc(76213);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76214);Assert.assertNull(model.values);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211mt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211mt3() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76215);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76216);String text = "{\"values\":[]}";
        __CLR4_5_21msr1msrlusyjucm.R.inc(76217);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76218);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_null_element() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jp4u0o1mt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null_element",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jp4u0o1mt7() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76219);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76220);String text = "{\"values\":[\"abc\",null]}";
        __CLR4_5_21msr1msrlusyjucm.R.inc(76221);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76222);Assert.assertEquals(2, model.values.size());
        __CLR4_5_21msr1msrlusyjucm.R.inc(76223);Assert.assertEquals("abc", model.values.get(0));
        __CLR4_5_21msr1msrlusyjucm.R.inc(76224);Assert.assertEquals(null, model.values.get(1));
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1mtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1mtd() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76225);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76226);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21msr1msrlusyjucm.R.inc(76227);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21msr1msrlusyjucm.R.inc(76228);Model model = (Model) map.get("model");
        __CLR4_5_21msr1msrlusyjucm.R.inc(76229);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1mti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76230,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1mti() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76230);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76231);String text = "{\"value\":[]}";
        __CLR4_5_21msr1msrlusyjucm.R.inc(76232);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76233);Assert.assertNull(model.values);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1mtm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1mtm() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76234);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76235);String text = "{\"values\":[1";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76236);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76237);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76238);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76239);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76240);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1mtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1mtt() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76241);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76242);String text = "{\"values\":[\"b\"[";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76243);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76244);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76245);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76246);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76247);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1mu0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1mu0() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76248);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76249);String text = "{\"model\":{\"values\":[][";
        

        __CLR4_5_21msr1msrlusyjucm.R.inc(76250);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76251);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76252);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76253);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76254);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1mu7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1mu7() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76255);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76256);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76257);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76258);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76259);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76260);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76261);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1mue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76262,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1mue() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76262);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76263);String text = "{\"model\":{\"values\":[\"aaa]}[";
        

        __CLR4_5_21msr1msrlusyjucm.R.inc(76264);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76265);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76266);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76267);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76268);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1mul();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1mul() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76269);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76270);String text = "{\"values\":[n";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76271);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76272);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76273);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76274);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76275);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76276);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1mus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76276,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1mus() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76276);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76277);String text = "{\"values\":[nu";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76278);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76279);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76280);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76281);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76282);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1muz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1muz() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76283);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76284);String text = "{\"values\":[nul";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76285);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76286);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76287);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76288);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76289);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76290);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21mv6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76290,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21mv6() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76290);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76291);String text = "{\"values\":[null";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76292);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76293);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76294);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76295);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76296);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_5_21msr1msrlusyjucm.R.globalSliceStart(getClass().getName(),76297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4ut911mvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21msr1msrlusyjucm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21msr1msrlusyjucm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_rbacket",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4ut911mvd() throws Exception{try{__CLR4_5_21msr1msrlusyjucm.R.inc(76297);
        __CLR4_5_21msr1msrlusyjucm.R.inc(76298);String text = "{\"values\":[null,]";

        __CLR4_5_21msr1msrlusyjucm.R.inc(76299);Exception error = null;
        __CLR4_5_21msr1msrlusyjucm.R.inc(76300);try {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76301);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21msr1msrlusyjucm.R.inc(76302);error = ex;
        }
        __CLR4_5_21msr1msrlusyjucm.R.inc(76303);Assert.assertNotNull(error);
    }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21msr1msrlusyjucm.R.inc(76304);
            __CLR4_5_21msr1msrlusyjucm.R.inc(76305);return values;
        }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21msr1msrlusyjucm.R.inc(76306);
            __CLR4_5_21msr1msrlusyjucm.R.inc(76307);this.values = values;
        }finally{__CLR4_5_21msr1msrlusyjucm.R.flushNeeded();}}

    }
}
