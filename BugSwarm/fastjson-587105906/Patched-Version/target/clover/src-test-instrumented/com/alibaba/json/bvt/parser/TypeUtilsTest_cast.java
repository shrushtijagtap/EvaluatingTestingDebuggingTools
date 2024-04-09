/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Calendar;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest_cast extends TestCase {static class __CLR4_5_21juz1juzlusvndqr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,72425,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_cast_0() throws Exception {__CLR4_5_21juz1juzlusvndqr.R.globalSliceStart(getClass().getName(),72395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yu587w1juz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21juz1juzlusvndqr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21juz1juzlusvndqr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_cast.test_cast_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yu587w1juz() throws Exception{try{__CLR4_5_21juz1juzlusvndqr.R.inc(72395);
        __CLR4_5_21juz1juzlusvndqr.R.inc(72396);Assert.assertArrayEquals(new byte[0], TypeUtils.cast(new byte[0], byte[].class, null));
    }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}
    
    public void test_cast_1() throws Exception {__CLR4_5_21juz1juzlusvndqr.R.globalSliceStart(getClass().getName(),72397);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vl59ff1jv1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21juz1juzlusvndqr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21juz1juzlusvndqr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_cast.test_cast_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72397,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vl59ff1jv1() throws Exception{try{__CLR4_5_21juz1juzlusvndqr.R.inc(72397);
        __CLR4_5_21juz1juzlusvndqr.R.inc(72398);ParameterizedType parameterizedType = (ParameterizedType) new TypeReference<List<?>>() {}.getType();
        __CLR4_5_21juz1juzlusvndqr.R.inc(72399);Type type = parameterizedType.getActualTypeArguments()[0];
        __CLR4_5_21juz1juzlusvndqr.R.inc(72400);Assert.assertEquals(null, TypeUtils.cast("", type, null));
    }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

    public void test_castToDate_error() throws Exception {__CLR4_5_21juz1juzlusvndqr.R.globalSliceStart(getClass().getName(),72401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ds2zk51jv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21juz1juzlusvndqr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21juz1juzlusvndqr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_cast.test_castToDate_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ds2zk51jv5() throws Exception{try{__CLR4_5_21juz1juzlusvndqr.R.inc(72401);
        __CLR4_5_21juz1juzlusvndqr.R.inc(72402);Exception error = null;
        __CLR4_5_21juz1juzlusvndqr.R.inc(72403);try {
            __CLR4_5_21juz1juzlusvndqr.R.inc(72404);TypeUtils.cast(0, MyCalendar.class, null);
        } catch (Exception ex) {
            __CLR4_5_21juz1juzlusvndqr.R.inc(72405);error = ex;
        }
        __CLR4_5_21juz1juzlusvndqr.R.inc(72406);Assert.assertNotNull(error);
    }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}
    
    public void test_castToDate_error_nullClass() throws Exception {__CLR4_5_21juz1juzlusvndqr.R.globalSliceStart(getClass().getName(),72407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q8u9vb1jvb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21juz1juzlusvndqr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21juz1juzlusvndqr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_cast.test_castToDate_error_nullClass",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72407,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q8u9vb1jvb() throws Exception{try{__CLR4_5_21juz1juzlusvndqr.R.inc(72407);
        __CLR4_5_21juz1juzlusvndqr.R.inc(72408);Exception error = null;
        __CLR4_5_21juz1juzlusvndqr.R.inc(72409);try {
            __CLR4_5_21juz1juzlusvndqr.R.inc(72410);TypeUtils.cast(0, (Class<?>) null, null);
        } catch (Exception ex) {
            __CLR4_5_21juz1juzlusvndqr.R.inc(72411);error = ex;
        }
        __CLR4_5_21juz1juzlusvndqr.R.inc(72412);Assert.assertNotNull(error);
    }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}
    
    @SuppressWarnings("serial")
    private class MyCalendar extends Calendar {

        @Override
        protected void computeTime() {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72413);
            // TODO Auto-generated method stub
            
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        protected void computeFields() {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72414);
            // TODO Auto-generated method stub
            
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public void add(int field, int amount) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72415);
            // TODO Auto-generated method stub
            
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public void roll(int field, boolean up) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72416);
            // TODO Auto-generated method stub
            
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public int getMinimum(int field) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72417);
            // TODO Auto-generated method stub
            __CLR4_5_21juz1juzlusvndqr.R.inc(72418);return 0;
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public int getMaximum(int field) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72419);
            // TODO Auto-generated method stub
            __CLR4_5_21juz1juzlusvndqr.R.inc(72420);return 0;
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public int getGreatestMinimum(int field) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72421);
            // TODO Auto-generated method stub
            __CLR4_5_21juz1juzlusvndqr.R.inc(72422);return 0;
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

        @Override
        public int getLeastMaximum(int field) {try{__CLR4_5_21juz1juzlusvndqr.R.inc(72423);
            // TODO Auto-generated method stub
            __CLR4_5_21juz1juzlusvndqr.R.inc(72424);return 0;
        }finally{__CLR4_5_21juz1juzlusvndqr.R.flushNeeded();}}

    }
}
