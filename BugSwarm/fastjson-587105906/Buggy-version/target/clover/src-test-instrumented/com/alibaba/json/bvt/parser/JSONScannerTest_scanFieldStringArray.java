/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class JSONScannerTest_scanFieldStringArray extends TestCase {static class __CLR4_1_101hzy1hzylusqkdrk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,70045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_string() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),69982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d3tq791hzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d3tq791hzy() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(69982);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69983);String text = "{\"value\":[1]}";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69984);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69985);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}

    public void test_string_1() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),69986);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10quf07r1i02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69986,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10quf07r1i02() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(69986);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69987);String text = "{\"value\":[\"1\"]}";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69988);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69989);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_2() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),69990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u3ez081i06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u3ez081i06() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(69990);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69991);String text = "{\"value\":['1']}";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69992);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69993);Assert.assertEquals("[1]", obj.getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_3() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),69994);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xcexsp1i0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69994,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xcexsp1i0a() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(69994);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69995);String text = "{\"value\":[\"1\\t2\"]}";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69996);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69997);Assert.assertEquals("[1\t2]", obj.getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_4() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),69998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yfp5dy1i0e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69998,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yfp5dy1i0e() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(69998);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(69999);String text = "[{\"value\":[\"1\"]}]";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70000);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70001);Assert.assertEquals("[1]", list.get(0).getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_5() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v6p6lh1i0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v6p6lh1i0i() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70002);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70003);String text = "[{\"value\":[\"1\"]},{\"value\":[\"2\"]}]";
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70004);List<VO> list = JSON.parseArray(text, VO.class);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70005);Assert.assertEquals("[1]", list.get(0).getValue().toString());
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70006);Assert.assertEquals("[2]", list.get(1).getValue().toString());
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_error() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g8aroy1i0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g8aroy1i0n() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70007);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70008);JSONException error = null;
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70009);try {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70010);String text = "{\"value\":{}}";
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70011);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70012);error = e;
        }
        //Assert.assertNotNull(error);
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}

    public void test_string_error_2() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70013);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yc0z6n1i0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70013,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yc0z6n1i0t() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70013);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70014);JSONException error = null;
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70015);try {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70016);String text = "{\"value\":[\"1\"}";
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70017);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70018);error = e;
        }
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70019);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_error_3() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v310e61i10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v310e61i10() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70020);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70021);JSONException error = null;
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70022);try {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70023);String text = "{\"value\":[\"1\"]}}";
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70024);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70025);error = e;
        }
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70026);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_error_4() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ru11lp1i17();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ru11lp1i17() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70027);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70028);JSONException error = null;
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70029);try {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70030);String text = "{\"value\":[\"1\"]]";
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70031);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70032);error = e;
        }
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70033);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}
    
    public void test_string_error_5() throws Exception {__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceStart(getClass().getName(),70034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ol12t81i1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hzy1hzylusqkdrk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hzy1hzylusqkdrk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldStringArray.test_string_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70034,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ol12t81i1e() throws Exception{try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70034);
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70035);JSONException error = null;
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70036);try {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70037);String text = "{\"value\":[\"1\"]}{";
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70038);JSON.parseObject(text, VO.class);
        } catch (JSONException e) {
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70039);error = e;
        }
        __CLR4_1_101hzy1hzylusqkdrk.R.inc(70040);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}

    public static class VO {

        private List<String> value;

        public List<String> getValue() {try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70041);
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70042);return value;
        }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}

        public void setValue(List<String> value) {try{__CLR4_1_101hzy1hzylusqkdrk.R.inc(70043);
            __CLR4_1_101hzy1hzylusqkdrk.R.inc(70044);this.value = value;
        }finally{__CLR4_1_101hzy1hzylusqkdrk.R.flushNeeded();}}

    }
}
