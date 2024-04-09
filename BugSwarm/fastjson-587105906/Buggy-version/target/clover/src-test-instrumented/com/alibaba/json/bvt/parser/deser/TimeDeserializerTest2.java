/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.sql.Time;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class TimeDeserializerTest2 extends TestCase {static class __CLR4_1_101lk31lk3lusqkgfs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,74628,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceStart(getClass().getName(),74595);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21lk3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lk31lk3lusqkgfs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74595,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21lk3() throws Exception{try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74595);
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74596);long millis = System.currentTimeMillis();
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74597);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":" + millis + "}");
    }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceStart(getClass().getName(),74598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1lk6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lk31lk3lusqkgfs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74598,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1lk6() throws Exception{try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74598);
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74599);long millis = System.currentTimeMillis();

        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74600);Exception error = null;
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74601);try {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74602);JSON.parse("{\"@type\":\"java.sql.Time\",33:" + millis + "}");
        } catch (JSONException ex) {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74603);error = ex;
        }
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74604);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceStart(getClass().getName(),74605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1lkd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lk31lk3lusqkgfs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1lkd() throws Exception{try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74605);
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74606);Exception error = null;
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74607);try {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74608);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":true}");
        } catch (JSONException ex) {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74609);error = ex;
        }
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74610);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceStart(getClass().getName(),74611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1lkj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lk31lk3lusqkgfs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74611,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1lkj() throws Exception{try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74611);
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74612);long millis = System.currentTimeMillis();

        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74613);Exception error = null;
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74614);try {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74615);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":" + millis + ",}");
        } catch (JSONException ex) {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74616);error = ex;
        }
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74617);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceStart(getClass().getName(),74618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1lkq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101lk31lk3lusqkgfs.R.rethrow($CLV_t2$);}finally{__CLR4_1_101lk31lk3lusqkgfs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74618,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1lkq() throws Exception{try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74618);
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74619);Exception error = null;
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74620);try {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74621);JSON.parseObject("{\"time\":{}}", VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74622);error = ex;
        }
        __CLR4_1_101lk31lk3lusqkgfs.R.inc(74623);Assert.assertNotNull(error);
    }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    public static class VO {

        private Time time;

        public Time getTime() {try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74624);
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74625);return time;
        }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

        public void setTime(Time time) {try{__CLR4_1_101lk31lk3lusqkgfs.R.inc(74626);
            __CLR4_1_101lk31lk3lusqkgfs.R.inc(74627);this.time = time;
        }finally{__CLR4_1_101lk31lk3lusqkgfs.R.flushNeeded();}}

    }
}
