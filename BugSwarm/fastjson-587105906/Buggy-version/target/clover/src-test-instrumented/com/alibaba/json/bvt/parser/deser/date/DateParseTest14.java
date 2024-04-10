/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.util.Date;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class DateParseTest14 extends TestCase {static class __CLR4_1_101n511n51luszwdpj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_lt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10onw8cr1n51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10onw8cr1n51() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76645);
        __CLR4_1_101n511n51luszwdpj.R.inc(76646);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76647);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76648);JSON.parseObject("{\"date\":\"19790714130723#56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76649);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76650);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}
    
    public void test_0_gt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4ttlc1n57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_0_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76651,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4ttlc1n57() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76651);
        __CLR4_1_101n511n51luszwdpj.R.inc(76652);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76653);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76654);JSON.parseObject("{\"date\":\"19790714130723A56\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76655);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76656);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}
    
    public void test_1_lt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tikvka1n5d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76657,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tikvka1n5d() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76657);
        __CLR4_1_101n511n51luszwdpj.R.inc(76658);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76659);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76660);JSON.parseObject("{\"date\":\"197907141307231#6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76661);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76662);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}
    
    public void test_1_gt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76663);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mzigsv1n5j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_1_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76663,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mzigsv1n5j() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76663);
        __CLR4_1_101n511n51luszwdpj.R.inc(76664);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76665);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76666);JSON.parseObject("{\"date\":\"197907141307231A6\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76667);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76668);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}
    
    public void test_2_lt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yd9irt1n5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_lt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76669,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yd9irt1n5p() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76669);
        __CLR4_1_101n511n51luszwdpj.R.inc(76670);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76671);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76672);JSON.parseObject("{\"date\":\"1979071413072315#\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76673);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76674);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}
    
    public void test_2_gt() throws Exception {__CLR4_1_101n511n51luszwdpj.R.globalSliceStart(getClass().getName(),76675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ru740e1n5v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n511n51luszwdpj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n511n51luszwdpj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest14.test_2_gt",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76675,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ru740e1n5v() throws Exception{try{__CLR4_1_101n511n51luszwdpj.R.inc(76675);
        __CLR4_1_101n511n51luszwdpj.R.inc(76676);Exception error = null;
        __CLR4_1_101n511n51luszwdpj.R.inc(76677);try {
            __CLR4_1_101n511n51luszwdpj.R.inc(76678);JSON.parseObject("{\"date\":\"1979071413072315A\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n511n51luszwdpj.R.inc(76679);error = ex;
        }
        __CLR4_1_101n511n51luszwdpj.R.inc(76680);Assert.assertNotNull(error);
    }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}

    public static class VO {

        private Date date;

        public Date getDate() {try{__CLR4_1_101n511n51luszwdpj.R.inc(76681);
            __CLR4_1_101n511n51luszwdpj.R.inc(76682);return date;
        }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_101n511n51luszwdpj.R.inc(76683);
            __CLR4_1_101n511n51luszwdpj.R.inc(76684);this.date = date;
        }finally{__CLR4_1_101n511n51luszwdpj.R.flushNeeded();}}

    }
}
