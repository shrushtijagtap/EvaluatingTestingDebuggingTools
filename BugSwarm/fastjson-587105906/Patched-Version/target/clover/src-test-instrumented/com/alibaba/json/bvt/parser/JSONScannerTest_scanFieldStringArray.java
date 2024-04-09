/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldStringArray extends TestCase {static class __CLR4_5_21ixv1ixvlusvndeo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,71266,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d3tq791ixv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d3tq791ixv() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71203);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71204);String text = "{\"value\":[1]}";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71205);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71206);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}

    public void test_string_1() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71207);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2quf07r1ixz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71207,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2quf07r1ixz() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71207);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71208);String text = "{\"value\":[\"1\"]}";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71209);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71210);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_2() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71211);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u3ez081iy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71211,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u3ez081iy3() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71211);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71212);String text = "{\"value\":['1']}";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71213);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71214);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_3() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcexsp1iy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcexsp1iy7() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71215);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71216);String text = "{\"value\":[\"1\\t2\"]}";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71217);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71218);Assert.assertEquals("[1\t2]", obj.getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_4() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71219);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yfp5dy1iyb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71219,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yfp5dy1iyb() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71219);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71220);String text = "[{\"value\":[\"1\"]}]";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71221);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71222);Assert.assertEquals("[1]", list.get(0).getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_5() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v6p6lh1iyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v6p6lh1iyf() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71223);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71224);String text = "[{\"value\":[\"1\"]},{\"value\":[\"2\"]}]";
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71225);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71226);Assert.assertEquals("[1]", list.get(0).getValue().toString());
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71227);Assert.assertEquals("[2]", list.get(1).getValue().toString());
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_error() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2g8aroy1iyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2g8aroy1iyk() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71228);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71229);JSONException error = null;
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71230);try {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71231);String text = "{\"value\":{}}";
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71232);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71233);error = e;
        }
        //Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}

    public void test_string_error_2() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yc0z6n1iyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71234,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yc0z6n1iyq() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71234);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71235);JSONException error = null;
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71236);try {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71237);String text = "{\"value\":[\"1\"}";
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71238);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71239);error = e;
        }
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71240);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_error_3() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v310e61iyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71241,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v310e61iyx() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71241);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71242);JSONException error = null;
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71243);try {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71244);String text = "{\"value\":[\"1\"]}}";
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71245);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71246);error = e;
        }
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71247);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_error_4() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ru11lp1iz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71248,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ru11lp1iz4() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71248);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71249);JSONException error = null;
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71250);try {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71251);String text = "{\"value\":[\"1\"]]";
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71252);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71253);error = e;
        }
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71254);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}
    
    public void test_string_error_5() throws Exception {__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceStart(getClass().getName(),71255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ol12t81izb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ixv1ixvlusvndeo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ixv1ixvlusvndeo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ol12t81izb() throws Exception{try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71255);
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71256);JSONException error = null;
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71257);try {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71258);String text = "{\"value\":[\"1\"]}{";
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71259);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71260);error = e;
        }
        __CLR4_5_21ixv1ixvlusvndeo.R.inc(71261);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}

    public static class VO {

        private List<String> value;

        public List<String> getValue() {try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71262);
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71263);return value;
        }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}

        public void setValue(List<String> value) {try{__CLR4_5_21ixv1ixvlusvndeo.R.inc(71264);
            __CLR4_5_21ixv1ixvlusvndeo.R.inc(71265);this.value = value;
        }finally{__CLR4_5_21ixv1ixvlusvndeo.R.flushNeeded();}}

    }
}
