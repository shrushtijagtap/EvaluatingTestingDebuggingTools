/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateParseTest14 extends TestCase {static class __CLR4_1_101m6t1m6tlusqkgq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,75453,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_lt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10onw8cr1m6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75413,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10onw8cr1m6t() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75413);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75414);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75415);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75416);JSON.parseObject("{\"date\":\"19790714130723#56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75417);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75418);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}
    
    public void test_0_gt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4ttlc1m6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75419,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4ttlc1m6z() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75419);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75420);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75421);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75422);JSON.parseObject("{\"date\":\"19790714130723A56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75423);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75424);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}
    
    public void test_1_lt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tikvka1m75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75425,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tikvka1m75() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75425);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75426);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75427);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75428);JSON.parseObject("{\"date\":\"197907141307231#6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75429);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75430);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}
    
    public void test_1_gt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mzigsv1m7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mzigsv1m7b() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75431);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75432);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75433);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75434);JSON.parseObject("{\"date\":\"197907141307231A6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75435);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75436);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}
    
    public void test_2_lt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75437);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yd9irt1m7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75437,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yd9irt1m7h() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75437);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75438);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75439);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75440);JSON.parseObject("{\"date\":\"1979071413072315#\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75441);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75442);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}
    
    public void test_2_gt() throws Exception {__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceStart(getClass().getName(),75443);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ru740e1m7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101m6t1m6tlusqkgq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101m6t1m6tlusqkgq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75443,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ru740e1m7n() throws Exception{try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75443);
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75444);Exception error = null;
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75445);try {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75446);JSON.parseObject("{\"date\":\"1979071413072315A\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75447);error = ex;
        }
        __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75448);Assert.assertNotNull(error);
    }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}

    public static class VO {

        private Date date;

        public Date getDate() {try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75449);
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75450);return date;
        }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_101m6t1m6tlusqkgq3.R.inc(75451);
            __CLR4_1_101m6t1m6tlusqkgq3.R.inc(75452);this.date = date;
        }finally{__CLR4_1_101m6t1m6tlusqkgq3.R.flushNeeded();}}

    }
}
