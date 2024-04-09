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

public class ListStringFieldTest_dom extends TestCase {static class __CLR4_5_21nqz1nqzlusvnevb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,77540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1nqz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1nqz() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77435);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77436);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77437);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77438);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77439);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77440);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77441);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77442);Assert.assertEquals("ab\\c", model.values.get(3));
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1nr7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77443,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1nr7() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77443);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77444);String text = "{\"values\":null}";
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77445);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77446);Assert.assertNull(model.values);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77447);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211nrb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77447,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211nrb() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77447);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77448);String text = "{\"values\":[]}";
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77449);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77450);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_null_element() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77451);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jp4u0o1nrf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null_element",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77451,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jp4u0o1nrf() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77451);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77452);String text = "{\"values\":[\"abc\",null]}";
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77453);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77454);Assert.assertEquals(2, model.values.size());
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77455);Assert.assertEquals("abc", model.values.get(0));
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77456);Assert.assertEquals(null, model.values.get(1));
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lmhrdw1nrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_map_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lmhrdw1nrl() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77457);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77458);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77459);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77460);Model model = (Model) map.get("model");
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77461);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jcmrza1nrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_notMatch",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77462,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jcmrza1nrq() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77462);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77463);String text = "{\"value\":[]}";
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77464);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77465);Assert.assertNull(model.values);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77466);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1nru();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77466,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1nru() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77466);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77467);String text = "{\"values\":[1";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77468);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77469);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77470);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77471);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77472);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ns1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77473,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ns1() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77473);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77474);String text = "{\"values\":[\"b\"[";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77475);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77476);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77477);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77478);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77479);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77480);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ns8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77480,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ns8() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77480);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77481);String text = "{\"model\":{\"values\":[][";
        

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77482);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77483);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77484);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77485);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77486);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1nsf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1nsf() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77487);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77488);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77489);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77490);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77491);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77492);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77493);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77494);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1nsm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77494,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1nsm() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77494);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77495);String text = "{\"model\":{\"values\":[\"aaa]}[";
        

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77496);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77497);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77498);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77499);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77500);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91t1nst();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91t1nst() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77501);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77502);String text = "{\"values\":[n";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77503);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77504);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77505);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77506);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77507);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77508);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaa1nt0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77508,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaa1nt0() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77508);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77509);String text = "{\"values\":[nu";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77510);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77511);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77512);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77513);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77514);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77515);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljc1nt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77515,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljc1nt7() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77515);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77516);String text = "{\"values\":[nul";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77517);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77518);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77519);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77520);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77521);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77522);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xx1nn21nte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77522,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xx1nn21nte() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77522);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77523);String text = "{\"values\":[null";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77524);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77525);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77526);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77527);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77528);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceStart(getClass().getName(),77529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t4ut911ntl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nqz1nqzlusvnevb.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nqz1nqzlusvnevb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_rbacket",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t4ut911ntl() throws Exception{try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77529);
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77530);String text = "{\"values\":[null,]";

        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77531);Exception error = null;
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77532);try {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77533);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77534);error = ex;
        }
        __CLR4_5_21nqz1nqzlusvnevb.R.inc(77535);Assert.assertNotNull(error);
    }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77536);
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77537);return values;
        }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21nqz1nqzlusvnevb.R.inc(77538);
            __CLR4_5_21nqz1nqzlusvnevb.R.inc(77539);this.values = values;
        }finally{__CLR4_5_21nqz1nqzlusvnevb.R.flushNeeded();}}

    }
}
