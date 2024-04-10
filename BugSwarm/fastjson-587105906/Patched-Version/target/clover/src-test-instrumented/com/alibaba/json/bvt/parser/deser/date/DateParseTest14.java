/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateParseTest14 extends TestCase {static class __CLR4_5_21m6i1m6ilusyju9u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,75442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_lt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onw8cr1m6i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onw8cr1m6i() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75402);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75403);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75404);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75405);JSON.parseObject("{\"date\":\"19790714130723#56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75406);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75407);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}
    
    public void test_0_gt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i4ttlc1m6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i4ttlc1m6o() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75408);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75409);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75410);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75411);JSON.parseObject("{\"date\":\"19790714130723A56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75412);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75413);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}
    
    public void test_1_lt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tikvka1m6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tikvka1m6u() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75414);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75415);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75416);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75417);JSON.parseObject("{\"date\":\"197907141307231#6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75418);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75419);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}
    
    public void test_1_gt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mzigsv1m70();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mzigsv1m70() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75420);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75421);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75422);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75423);JSON.parseObject("{\"date\":\"197907141307231A6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75424);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75425);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}
    
    public void test_2_lt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yd9irt1m76();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_lt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yd9irt1m76() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75426);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75427);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75428);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75429);JSON.parseObject("{\"date\":\"1979071413072315#\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75430);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75431);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}
    
    public void test_2_gt() throws Exception {__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceStart(getClass().getName(),75432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ru740e1m7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21m6i1m6ilusyju9u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21m6i1m6ilusyju9u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_gt",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75432,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ru740e1m7c() throws Exception{try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75432);
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75433);Exception error = null;
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75434);try {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75435);JSON.parseObject("{\"date\":\"1979071413072315A\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75436);error = ex;
        }
        __CLR4_5_21m6i1m6ilusyju9u.R.inc(75437);Assert.assertNotNull(error);
    }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}

    public static class VO {

        private Date date;

        public Date getDate() {try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75438);
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75439);return date;
        }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_21m6i1m6ilusyju9u.R.inc(75440);
            __CLR4_5_21m6i1m6ilusyju9u.R.inc(75441);this.date = date;
        }finally{__CLR4_5_21m6i1m6ilusyju9u.R.flushNeeded();}}

    }
}
