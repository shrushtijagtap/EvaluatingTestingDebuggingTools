/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class JSONScannerTest_scanFieldString extends TestCase {static class __CLR4_1_101hz71hz7lusqkdr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,69982,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceStart(getClass().getName(),69955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21hz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hz71hz7lusqkdr9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldString.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69955,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21hz7() throws Exception{try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69955);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69956);String text = "{\"value\":1}";
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69957);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69958);Assert.assertEquals("1", obj.getValue());
    }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceStart(getClass().getName(),69959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1hzb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hz71hz7lusqkdr9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldString.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69959,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1hzb() throws Exception{try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69959);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69960);String text = "{\"value\":\"1\"}";
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69961);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69962);Assert.assertEquals("1", obj.getValue());
    }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceStart(getClass().getName(),69963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441hzf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hz71hz7lusqkdr9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldString.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441hzf() throws Exception{try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69963);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69964);String text = "{\"value\":\"1\\t\"}";
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69965);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69966);Assert.assertEquals("1\t", obj.getValue());
    }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceStart(getClass().getName(),69967);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1hzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hz71hz7lusqkdr9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldString.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69967,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1hzj() throws Exception{try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69967);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69968);String text = "{\"value\":\"1\\n\"}";
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69969);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69970);Assert.assertEquals("1\n", obj.getValue());
    }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    public void test_error_0() {__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceStart(getClass().getName(),69971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1hzn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101hz71hz7lusqkdr9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101hz71hz7lusqkdr9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldString.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),69971,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1hzn(){try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69971);
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69972);Exception error = null;
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69973);try {
            __CLR4_1_101hz71hz7lusqkdr9.R.inc(69974);String text = "{\"value\":\"1\\n\"";
            __CLR4_1_101hz71hz7lusqkdr9.R.inc(69975);JSON.parseObject(text, VO.class);
        } catch (Exception ex) {
            __CLR4_1_101hz71hz7lusqkdr9.R.inc(69976);error = ex;
        }
        __CLR4_1_101hz71hz7lusqkdr9.R.inc(69977);Assert.assertNotNull(error);
    }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    public static class VO {

        private String value;

        public String getValue() {try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69978);
            __CLR4_1_101hz71hz7lusqkdr9.R.inc(69979);return value;
        }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_101hz71hz7lusqkdr9.R.inc(69980);
            __CLR4_1_101hz71hz7lusqkdr9.R.inc(69981);this.value = value;
        }finally{__CLR4_1_101hz71hz7lusqkdr9.R.flushNeeded();}}

    }
}
