/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

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

public class ListStringFieldTest_dom extends TestCase {static class __CLR4_1_101nra1nraluszwduc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1nra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1nra() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77446);
        __CLR4_1_101nra1nraluszwduc.R.inc(77447);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101nra1nraluszwduc.R.inc(77448);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nra1nraluszwduc.R.inc(77449);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101nra1nraluszwduc.R.inc(77450);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101nra1nraluszwduc.R.inc(77451);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101nra1nraluszwduc.R.inc(77452);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101nra1nraluszwduc.R.inc(77453);Assert.assertEquals("ab\\c", model.values.get(3));
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77454);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1nri();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77454,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1nri() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77454);
        __CLR4_1_101nra1nraluszwduc.R.inc(77455);String text = "{\"values\":null}";
        __CLR4_1_101nra1nraluszwduc.R.inc(77456);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nra1nraluszwduc.R.inc(77457);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77458);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211nrm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77458,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211nrm() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77458);
        __CLR4_1_101nra1nraluszwduc.R.inc(77459);String text = "{\"values\":[]}";
        __CLR4_1_101nra1nraluszwduc.R.inc(77460);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nra1nraluszwduc.R.inc(77461);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_null_element() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77462);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jp4u0o1nrq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null_element",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77462,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jp4u0o1nrq() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77462);
        __CLR4_1_101nra1nraluszwduc.R.inc(77463);String text = "{\"values\":[\"abc\",null]}";
        __CLR4_1_101nra1nraluszwduc.R.inc(77464);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nra1nraluszwduc.R.inc(77465);Assert.assertEquals(2, model.values.size());
        __CLR4_1_101nra1nraluszwduc.R.inc(77466);Assert.assertEquals("abc", model.values.get(0));
        __CLR4_1_101nra1nraluszwduc.R.inc(77467);Assert.assertEquals(null, model.values.get(1));
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1nrw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1nrw() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77468);
        __CLR4_1_101nra1nraluszwduc.R.inc(77469);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101nra1nraluszwduc.R.inc(77470);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101nra1nraluszwduc.R.inc(77471);Model model = (Model) map.get("model");
        __CLR4_1_101nra1nraluszwduc.R.inc(77472);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77473);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1ns1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77473,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1ns1() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77473);
        __CLR4_1_101nra1nraluszwduc.R.inc(77474);String text = "{\"value\":[]}";
        __CLR4_1_101nra1nraluszwduc.R.inc(77475);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101nra1nraluszwduc.R.inc(77476);Assert.assertNull(model.values);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77477);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1ns5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77477,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1ns5() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77477);
        __CLR4_1_101nra1nraluszwduc.R.inc(77478);String text = "{\"values\":[1";

        __CLR4_1_101nra1nraluszwduc.R.inc(77479);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77480);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77481);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77482);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77483);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1nsc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1nsc() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77484);
        __CLR4_1_101nra1nraluszwduc.R.inc(77485);String text = "{\"values\":[\"b\"[";

        __CLR4_1_101nra1nraluszwduc.R.inc(77486);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77487);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77488);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77489);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77490);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1nsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77491,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1nsj() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77491);
        __CLR4_1_101nra1nraluszwduc.R.inc(77492);String text = "{\"model\":{\"values\":[][";
        

        __CLR4_1_101nra1nraluszwduc.R.inc(77493);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77494);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77495);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77496);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77497);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1nsq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1nsq() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77498);
        __CLR4_1_101nra1nraluszwduc.R.inc(77499);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_1_101nra1nraluszwduc.R.inc(77500);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77501);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77502);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77503);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77504);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1nsx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77505,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1nsx() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77505);
        __CLR4_1_101nra1nraluszwduc.R.inc(77506);String text = "{\"model\":{\"values\":[\"aaa]}[";
        

        __CLR4_1_101nra1nraluszwduc.R.inc(77507);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77508);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77509);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77510);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77511);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1nt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1nt4() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77512);
        __CLR4_1_101nra1nraluszwduc.R.inc(77513);String text = "{\"values\":[n";

        __CLR4_1_101nra1nraluszwduc.R.inc(77514);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77515);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77516);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77517);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77518);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77519);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1ntb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77519,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1ntb() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77519);
        __CLR4_1_101nra1nraluszwduc.R.inc(77520);String text = "{\"values\":[nu";

        __CLR4_1_101nra1nraluszwduc.R.inc(77521);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77522);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77523);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77524);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77525);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77526);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1nti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77526,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1nti() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77526);
        __CLR4_1_101nra1nraluszwduc.R.inc(77527);String text = "{\"values\":[nul";

        __CLR4_1_101nra1nraluszwduc.R.inc(77528);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77529);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77530);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77531);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77532);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21ntp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77533,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21ntp() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77533);
        __CLR4_1_101nra1nraluszwduc.R.inc(77534);String text = "{\"values\":[null";

        __CLR4_1_101nra1nraluszwduc.R.inc(77535);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77536);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77537);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77538);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77539);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_1_101nra1nraluszwduc.R.globalSliceStart(getClass().getName(),77540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t4ut911ntw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101nra1nraluszwduc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101nra1nraluszwduc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_rbacket",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77540,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t4ut911ntw() throws Exception{try{__CLR4_1_101nra1nraluszwduc.R.inc(77540);
        __CLR4_1_101nra1nraluszwduc.R.inc(77541);String text = "{\"values\":[null,]";

        __CLR4_1_101nra1nraluszwduc.R.inc(77542);Exception error = null;
        __CLR4_1_101nra1nraluszwduc.R.inc(77543);try {
            __CLR4_1_101nra1nraluszwduc.R.inc(77544);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101nra1nraluszwduc.R.inc(77545);error = ex;
        }
        __CLR4_1_101nra1nraluszwduc.R.inc(77546);Assert.assertNotNull(error);
    }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101nra1nraluszwduc.R.inc(77547);
            __CLR4_1_101nra1nraluszwduc.R.inc(77548);return values;
        }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101nra1nraluszwduc.R.inc(77549);
            __CLR4_1_101nra1nraluszwduc.R.inc(77550);this.values = values;
        }finally{__CLR4_1_101nra1nraluszwduc.R.flushNeeded();}}

    }
}
