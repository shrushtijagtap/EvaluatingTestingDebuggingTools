/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.Hashtable;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class HashtableFieldTest extends TestCase {static class __CLR4_5_21lz71lz7lusvnebs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,75159,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_null() throws Exception {__CLR4_5_21lz71lz7lusvnebs.R.globalSliceStart(getClass().getName(),75139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1lz7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lz71lz7lusvnebs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lz71lz7lusvnebs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75139,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1lz7() throws Exception{try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75139);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75140);Entity value = JSON.parseObject("{value:null}", Entity.class);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75141);Assert.assertNull(value.getValue());
    }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21lz71lz7lusvnebs.R.globalSliceStart(getClass().getName(),75142);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211lza();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lz71lz7lusvnebs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lz71lz7lusvnebs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75142,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211lza() throws Exception{try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75142);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75143);Entity value = JSON.parseObject("{value:{}}", Entity.class);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75144);Assert.assertEquals(0, value.getValue().size());
    }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}
    
    public void test_null_2() throws Exception {__CLR4_5_21lz71lz7lusvnebs.R.globalSliceStart(getClass().getName(),75145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a73e8i1lzd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lz71lz7lusvnebs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lz71lz7lusvnebs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a73e8i1lzd() throws Exception{try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75145);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75146);Entity value = JSON.parseObject("{\"value\":null}", Entity.class);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75147);Assert.assertNull(value.getValue());
    }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}
    
    public void test_empty_a() throws Exception {__CLR4_5_21lz71lz7lusvnebs.R.globalSliceStart(getClass().getName(),75148);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27e3lu11lzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lz71lz7lusvnebs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lz71lz7lusvnebs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_empty_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75148,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27e3lu11lzg() throws Exception{try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75148);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75149);A value = JSON.parseObject("{value:{\"@type\":\"java.util.Hashtable\"}}", A.class);
        __CLR4_5_21lz71lz7lusvnebs.R.inc(75150);Assert.assertEquals(0, ((Hashtable)value.getValue()).size());
    }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}

    private static class Entity {

        private Hashtable value;

        public Hashtable getValue() {try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75151);
            __CLR4_5_21lz71lz7lusvnebs.R.inc(75152);return value;
        }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}

        public void setValue(Hashtable value) {try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75153);
            __CLR4_5_21lz71lz7lusvnebs.R.inc(75154);this.value = value;
        }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}
    }
    
    private static class A {

        private Object value;

        public Object getValue() {try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75155);
            __CLR4_5_21lz71lz7lusvnebs.R.inc(75156);return value;
        }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_5_21lz71lz7lusvnebs.R.inc(75157);
            __CLR4_5_21lz71lz7lusvnebs.R.inc(75158);this.value = value;
        }finally{__CLR4_5_21lz71lz7lusvnebs.R.flushNeeded();}}
    }
}
