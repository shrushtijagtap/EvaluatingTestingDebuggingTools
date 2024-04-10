/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.sql.Time;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class TimeDeserializerTest2 extends TestCase {static class __CLR4_1_101mib1mibluszwdiv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,75860,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101mib1mibluszwdiv.R.globalSliceStart(getClass().getName(),75827);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21mib();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mib1mibluszwdiv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mib1mibluszwdiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75827,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21mib() throws Exception{try{__CLR4_1_101mib1mibluszwdiv.R.inc(75827);
        __CLR4_1_101mib1mibluszwdiv.R.inc(75828);long millis = System.currentTimeMillis();
        __CLR4_1_101mib1mibluszwdiv.R.inc(75829);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":" + millis + "}");
    }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101mib1mibluszwdiv.R.globalSliceStart(getClass().getName(),75830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1mie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mib1mibluszwdiv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mib1mibluszwdiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1mie() throws Exception{try{__CLR4_1_101mib1mibluszwdiv.R.inc(75830);
        __CLR4_1_101mib1mibluszwdiv.R.inc(75831);long millis = System.currentTimeMillis();

        __CLR4_1_101mib1mibluszwdiv.R.inc(75832);Exception error = null;
        __CLR4_1_101mib1mibluszwdiv.R.inc(75833);try {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75834);JSON.parse("{\"@type\":\"java.sql.Time\",33:" + millis + "}");
        } catch (JSONException ex) {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75835);error = ex;
        }
        __CLR4_1_101mib1mibluszwdiv.R.inc(75836);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101mib1mibluszwdiv.R.globalSliceStart(getClass().getName(),75837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1mil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mib1mibluszwdiv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mib1mibluszwdiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75837,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1mil() throws Exception{try{__CLR4_1_101mib1mibluszwdiv.R.inc(75837);
        __CLR4_1_101mib1mibluszwdiv.R.inc(75838);Exception error = null;
        __CLR4_1_101mib1mibluszwdiv.R.inc(75839);try {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75840);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":true}");
        } catch (JSONException ex) {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75841);error = ex;
        }
        __CLR4_1_101mib1mibluszwdiv.R.inc(75842);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101mib1mibluszwdiv.R.globalSliceStart(getClass().getName(),75843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1mir();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mib1mibluszwdiv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mib1mibluszwdiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1mir() throws Exception{try{__CLR4_1_101mib1mibluszwdiv.R.inc(75843);
        __CLR4_1_101mib1mibluszwdiv.R.inc(75844);long millis = System.currentTimeMillis();

        __CLR4_1_101mib1mibluszwdiv.R.inc(75845);Exception error = null;
        __CLR4_1_101mib1mibluszwdiv.R.inc(75846);try {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75847);JSON.parse("{\"@type\":\"java.sql.Time\",\"value\":" + millis + ",}");
        } catch (JSONException ex) {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75848);error = ex;
        }
        __CLR4_1_101mib1mibluszwdiv.R.inc(75849);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101mib1mibluszwdiv.R.globalSliceStart(getClass().getName(),75850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1miy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mib1mibluszwdiv.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mib1mibluszwdiv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.TimeDeserializerTest2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1miy() throws Exception{try{__CLR4_1_101mib1mibluszwdiv.R.inc(75850);
        __CLR4_1_101mib1mibluszwdiv.R.inc(75851);Exception error = null;
        __CLR4_1_101mib1mibluszwdiv.R.inc(75852);try {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75853);JSON.parseObject("{\"time\":{}}", VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101mib1mibluszwdiv.R.inc(75854);error = ex;
        }
        __CLR4_1_101mib1mibluszwdiv.R.inc(75855);Assert.assertNotNull(error);
    }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    public static class VO {

        private Time time;

        public Time getTime() {try{__CLR4_1_101mib1mibluszwdiv.R.inc(75856);
            __CLR4_1_101mib1mibluszwdiv.R.inc(75857);return time;
        }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

        public void setTime(Time time) {try{__CLR4_1_101mib1mibluszwdiv.R.inc(75858);
            __CLR4_1_101mib1mibluszwdiv.R.inc(75859);this.time = time;
        }finally{__CLR4_1_101mib1mibluszwdiv.R.flushNeeded();}}

    }
}
