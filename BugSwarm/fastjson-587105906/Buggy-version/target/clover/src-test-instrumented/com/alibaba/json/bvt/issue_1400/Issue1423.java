/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.io.StringReader;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Issue1423 extends TestCase {static class __CLR4_1_101bc41bc4luszwaqe{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61379,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101bc41bc4luszwaqe.R.globalSliceStart(getClass().getName(),61348);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1bc4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bc41bc4luszwaqe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bc41bc4luszwaqe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1423.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61348,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1bc4() throws Exception{try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61348);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61349);Exception error = null;
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61350);try {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61351);JSON.parseObject("{\"v\":9223372036854775808}", LongVal.class);
        } catch (JSONException e) {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61352);e.printStackTrace();
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61353);error = e;
        }
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61354);assertNotNull(error);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61355);error.printStackTrace();
    }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}

    public void test_for_issue_reader() throws Exception {__CLR4_1_101bc41bc4luszwaqe.R.globalSliceStart(getClass().getName(),61356);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bey0el1bcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bc41bc4luszwaqe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bc41bc4luszwaqe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1423.test_for_issue_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61356,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bey0el1bcc() throws Exception{try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61356);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61357);Exception error = null;
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61358);try {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61359);new JSONReader(new StringReader("{\"v\":9223372036854775808}")).readObject(LongVal.class);
        } catch (JSONException e) {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61360);error = e;
        }
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61361);assertNotNull(error);
    }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}

    public void test_for_issue_arrayMapping() throws Exception {__CLR4_1_101bc41bc4luszwaqe.R.globalSliceStart(getClass().getName(),61362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10amvokb1bci();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bc41bc4luszwaqe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bc41bc4luszwaqe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1423.test_for_issue_arrayMapping",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61362,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10amvokb1bci() throws Exception{try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61362);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61363);Exception error = null;
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61364);try {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61365);JSON.parseObject("[9223372036854775808]", LongVal.class, Feature.SupportArrayToBean);
        } catch (JSONException e) {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61366);error = e;
        }
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61367);assertNotNull(error);
    }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}

    public void test_for_issue_arrayMapping_reader() throws Exception {__CLR4_1_101bc41bc4luszwaqe.R.globalSliceStart(getClass().getName(),61368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1035gakr1bco();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101bc41bc4luszwaqe.R.rethrow($CLV_t2$);}finally{__CLR4_1_101bc41bc4luszwaqe.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1423.test_for_issue_arrayMapping_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61368,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1035gakr1bco() throws Exception{try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61368);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61369);Exception error = null;
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61370);try {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61371);new JSONReader(new StringReader("[9223372036854775808]"), Feature.SupportArrayToBean).readObject(LongVal.class);
        } catch (JSONException e) {
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61372);error = e;
        }
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61373);assertNotNull(error);
        __CLR4_1_101bc41bc4luszwaqe.R.inc(61374);error.printStackTrace();
    }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}

    public static class LongVal {
        private long v;
        public void setV(long v) {try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61375);
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61376);this.v = v;
        }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_101bc41bc4luszwaqe.R.inc(61377);
            __CLR4_1_101bc41bc4luszwaqe.R.inc(61378);return String.valueOf(v);
        }finally{__CLR4_1_101bc41bc4luszwaqe.R.flushNeeded();}}
    }
}
