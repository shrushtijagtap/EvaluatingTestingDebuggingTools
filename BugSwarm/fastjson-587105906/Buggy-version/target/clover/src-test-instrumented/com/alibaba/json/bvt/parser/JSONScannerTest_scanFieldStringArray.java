/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldStringArray extends TestCase {static class __CLR4_1_101iy61iy6luszwcmv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71214);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq791iy6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71214,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq791iy6() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71214);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71215);String text = "{\"value\":[1]}";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71216);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71217);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}

    public void test_string_1() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10quf07r1iya();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71218,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10quf07r1iya() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71218);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71219);String text = "{\"value\":[\"1\"]}";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71220);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71221);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_2() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u3ez081iye();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u3ez081iye() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71222);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71223);String text = "{\"value\":['1']}";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71224);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71225);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_3() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xcexsp1iyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xcexsp1iyi() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71226);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71227);String text = "{\"value\":[\"1\\t2\"]}";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71228);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71229);Assert.assertEquals("[1\t2]", obj.getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_4() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yfp5dy1iym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71230,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yfp5dy1iym() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71230);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71231);String text = "[{\"value\":[\"1\"]}]";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71232);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71233);Assert.assertEquals("[1]", list.get(0).getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_5() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v6p6lh1iyq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v6p6lh1iyq() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71234);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71235);String text = "[{\"value\":[\"1\"]},{\"value\":[\"2\"]}]";
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71236);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71237);Assert.assertEquals("[1]", list.get(0).getValue().toString());
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71238);Assert.assertEquals("[2]", list.get(1).getValue().toString());
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_error() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g8aroy1iyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71239,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g8aroy1iyv() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71239);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71240);JSONException error = null;
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71241);try {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71242);String text = "{\"value\":{}}";
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71243);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71244);error = e;
        }
        //Assert.assertNotNull(error);
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}

    public void test_string_error_2() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yc0z6n1iz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71245,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yc0z6n1iz1() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71245);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71246);JSONException error = null;
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71247);try {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71248);String text = "{\"value\":[\"1\"}";
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71249);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71250);error = e;
        }
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71251);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_error_3() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71252);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v310e61iz8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71252,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v310e61iz8() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71252);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71253);JSONException error = null;
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71254);try {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71255);String text = "{\"value\":[\"1\"]}}";
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71256);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71257);error = e;
        }
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71258);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_error_4() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ru11lp1izf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71259,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ru11lp1izf() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71259);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71260);JSONException error = null;
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71261);try {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71262);String text = "{\"value\":[\"1\"]]";
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71263);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71264);error = e;
        }
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71265);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}
    
    public void test_string_error_5() throws Exception {__CLR4_1_101iy61iy6luszwcmv.R.globalSliceStart(getClass().getName(),71266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ol12t81izm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101iy61iy6luszwcmv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101iy61iy6luszwcmv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ol12t81izm() throws Exception{try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71266);
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71267);JSONException error = null;
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71268);try {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71269);String text = "{\"value\":[\"1\"]}{";
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71270);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71271);error = e;
        }
        __CLR4_1_101iy61iy6luszwcmv.R.inc(71272);Assert.assertNotNull(error);
    }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}

    public static class VO {

        private List<String> value;

        public List<String> getValue() {try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71273);
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71274);return value;
        }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}

        public void setValue(List<String> value) {try{__CLR4_1_101iy61iy6luszwcmv.R.inc(71275);
            __CLR4_1_101iy61iy6luszwcmv.R.inc(71276);this.value = value;
        }finally{__CLR4_1_101iy61iy6luszwcmv.R.flushNeeded();}}

    }
}
