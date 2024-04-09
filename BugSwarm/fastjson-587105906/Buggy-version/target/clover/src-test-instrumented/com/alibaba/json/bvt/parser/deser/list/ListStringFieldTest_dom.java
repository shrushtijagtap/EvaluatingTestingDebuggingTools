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

public class ListStringFieldTest_dom extends TestCase {static class __CLR4_1_101mt21mt2lusqkh24{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,76319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1mt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76214,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1mt2() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76214);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76215);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"]}";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76216);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76217);Assert.assertEquals(4, model.values.size());
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76218);Assert.assertEquals("a", model.values.get(0));
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76219);Assert.assertEquals(null, model.values.get(1));
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76220);Assert.assertEquals("b", model.values.get(2));
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76221);Assert.assertEquals("ab\\c", model.values.get(3));
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1mta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1mta() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76222);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76223);String text = "{\"values\":null}";
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76224);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76225);Assert.assertNull(model.values);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211mte();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211mte() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76226);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76227);String text = "{\"values\":[]}";
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76228);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76229);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_null_element() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jp4u0o1mti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_null_element",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76230,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jp4u0o1mti() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76230);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76231);String text = "{\"values\":[\"abc\",null]}";
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76232);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76233);Assert.assertEquals(2, model.values.size());
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76234);Assert.assertEquals("abc", model.values.get(0));
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76235);Assert.assertEquals(null, model.values.get(1));
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public void test_map_empty() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lmhrdw1mto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_map_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76236,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lmhrdw1mto() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76236);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76237);String text = "{\"model\":{\"values\":[]}}";
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76238);Map<String, Model> map = JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
        });
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76239);Model model = (Model) map.get("model");
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76240);Assert.assertEquals(0, model.values.size());
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public void test_notMatch() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jcmrza1mtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_notMatch",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jcmrza1mtt() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76241);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76242);String text = "{\"value\":[]}";
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76243);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76244);Assert.assertNull(model.values);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1mtx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76245,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1mtx() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76245);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76246);String text = "{\"values\":[1";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76247);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76248);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76249);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76250);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76251);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1mu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1mu4() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76252);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76253);String text = "{\"values\":[\"b\"[";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76254);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76255);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76256);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76257);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76258);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1mub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76259,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1mub() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76259);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76260);String text = "{\"model\":{\"values\":[][";
        

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76261);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76262);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76263);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76264);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76265);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1mui();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1mui() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76266);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76267);String text = "{\"model\":{\"values\":[]}[";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76268);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76269);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76270);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76271);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76272);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_4() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1mup();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1mup() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76273);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76274);String text = "{\"model\":{\"values\":[\"aaa]}[";
        

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76275);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76276);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76277);JSON.parseObject(text, new TypeReference<Map<String, Model>>() {
            });
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76278);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76279);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91t1muw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76280,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91t1muw() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76280);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76281);String text = "{\"values\":[n";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76282);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76283);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76284);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76285);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76286);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaa1mv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76287,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaa1mv3() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76287);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76288);String text = "{\"values\":[nu";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76289);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76290);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76291);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76292);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76293);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljc1mva();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljc1mva() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76294);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76295);String text = "{\"values\":[nul";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76296);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76297);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76298);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76299);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76300);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_null() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xx1nn21mvh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76301,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xx1nn21mvh() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76301);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76302);String text = "{\"values\":[null";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76303);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76304);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76305);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76306);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76307);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}
    
    public void test_error_rbacket() throws Exception {__CLR4_1_101mt21mt2lusqkh24.R.globalSliceStart(getClass().getName(),76308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t4ut911mvo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mt21mt2lusqkh24.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mt21mt2lusqkh24.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_dom.test_error_rbacket",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t4ut911mvo() throws Exception{try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76308);
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76309);String text = "{\"values\":[null,]";

        __CLR4_1_101mt21mt2lusqkh24.R.inc(76310);Exception error = null;
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76311);try {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76312);JSON.parseObject(text, Model.class);
        } catch (JSONException ex) {
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76313);error = ex;
        }
        __CLR4_1_101mt21mt2lusqkh24.R.inc(76314);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    public static class Model {

        private List<String> values;

        public List<String> getValues() {try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76315);
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76316);return values;
        }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101mt21mt2lusqkh24.R.inc(76317);
            __CLR4_1_101mt21mt2lusqkh24.R.inc(76318);this.values = values;
        }finally{__CLR4_1_101mt21mt2lusqkh24.R.flushNeeded();}}

    }
}
