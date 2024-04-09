/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.Hashtable;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class HashtableFieldTest extends TestCase {static class __CLR4_1_101l1a1l1alusqkg14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,73938,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_null() throws Exception {__CLR4_1_101l1a1l1alusqkg14.R.globalSliceStart(getClass().getName(),73918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1l1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l1a1l1alusqkg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l1a1l1alusqkg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1l1a() throws Exception{try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73918);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73919);Entity value = JSON.parseObject("{value:null}", Entity.class);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73920);Assert.assertNull(value.getValue());
    }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101l1a1l1alusqkg14.R.globalSliceStart(getClass().getName(),73921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211l1d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l1a1l1alusqkg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l1a1l1alusqkg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73921,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211l1d() throws Exception{try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73921);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73922);Entity value = JSON.parseObject("{value:{}}", Entity.class);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73923);Assert.assertEquals(0, value.getValue().size());
    }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}
    
    public void test_null_2() throws Exception {__CLR4_1_101l1a1l1alusqkg14.R.globalSliceStart(getClass().getName(),73924);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a73e8i1l1g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l1a1l1alusqkg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l1a1l1alusqkg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_null_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73924,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a73e8i1l1g() throws Exception{try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73924);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73925);Entity value = JSON.parseObject("{\"value\":null}", Entity.class);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73926);Assert.assertNull(value.getValue());
    }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}
    
    public void test_empty_a() throws Exception {__CLR4_1_101l1a1l1alusqkg14.R.globalSliceStart(getClass().getName(),73927);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107e3lu11l1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l1a1l1alusqkg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l1a1l1alusqkg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.HashtableFieldTest.test_empty_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73927,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107e3lu11l1j() throws Exception{try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73927);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73928);A value = JSON.parseObject("{value:{\"@type\":\"java.util.Hashtable\"}}", A.class);
        __CLR4_1_101l1a1l1alusqkg14.R.inc(73929);Assert.assertEquals(0, ((Hashtable)value.getValue()).size());
    }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}

    private static class Entity {

        private Hashtable value;

        public Hashtable getValue() {try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73930);
            __CLR4_1_101l1a1l1alusqkg14.R.inc(73931);return value;
        }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}

        public void setValue(Hashtable value) {try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73932);
            __CLR4_1_101l1a1l1alusqkg14.R.inc(73933);this.value = value;
        }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}
    }
    
    private static class A {

        private Object value;

        public Object getValue() {try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73934);
            __CLR4_1_101l1a1l1alusqkg14.R.inc(73935);return value;
        }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_101l1a1l1alusqkg14.R.inc(73936);
            __CLR4_1_101l1a1l1alusqkg14.R.inc(73937);this.value = value;
        }finally{__CLR4_1_101l1a1l1alusqkg14.R.flushNeeded();}}
    }
}
