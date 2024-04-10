/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;

public class BooleanFieldDeserializerTest2 extends TestCase {static class __CLR4_5_21kit1kitlusyju20{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21kit1kitlusyju20.R.globalSliceStart(getClass().getName(),73253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21kit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kit1kitlusyju20.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kit1kitlusyju20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BooleanFieldDeserializerTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21kit() throws Exception{try{__CLR4_5_21kit1kitlusyju20.R.inc(73253);
        __CLR4_5_21kit1kitlusyju20.R.inc(73254);Entity a = JSON.parseObject("{\"f1\":true,\"f2\":null}", Entity.class);
        __CLR4_5_21kit1kitlusyju20.R.inc(73255);Assert.assertEquals(true, a.getF1());
        __CLR4_5_21kit1kitlusyju20.R.inc(73256);Assert.assertEquals(null, a.getF2());
    }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21kit1kitlusyju20.R.globalSliceStart(getClass().getName(),73257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1kix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kit1kitlusyju20.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kit1kitlusyju20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BooleanFieldDeserializerTest2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1kix() throws Exception{try{__CLR4_5_21kit1kitlusyju20.R.inc(73257);
        __CLR4_5_21kit1kitlusyju20.R.inc(73258);Entity a = JSON.parseObject("{\"f1\":1,\"f2\":null}", Entity.class);
        __CLR4_5_21kit1kitlusyju20.R.inc(73259);Assert.assertEquals(true, a.getF1());
        __CLR4_5_21kit1kitlusyju20.R.inc(73260);Assert.assertEquals(null, a.getF2());
    }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_21kit1kitlusyju20.R.globalSliceStart(getClass().getName(),73261);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441kj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kit1kitlusyju20.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kit1kitlusyju20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BooleanFieldDeserializerTest2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73261,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441kj1() throws Exception{try{__CLR4_5_21kit1kitlusyju20.R.inc(73261);
        __CLR4_5_21kit1kitlusyju20.R.inc(73262);Entity a = JSON.parseObject("{\"f1\":\"true\",\"f2\":null}", Entity.class);
        __CLR4_5_21kit1kitlusyju20.R.inc(73263);Assert.assertEquals(true, a.getF1());
        __CLR4_5_21kit1kitlusyju20.R.inc(73264);Assert.assertEquals(null, a.getF2());
    }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21kit1kitlusyju20.R.globalSliceStart(getClass().getName(),73265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1kj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21kit1kitlusyju20.R.rethrow($CLV_t2$);}finally{__CLR4_5_21kit1kitlusyju20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BooleanFieldDeserializerTest2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73265,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1kj5() throws Exception{try{__CLR4_5_21kit1kitlusyju20.R.inc(73265);
        __CLR4_5_21kit1kitlusyju20.R.inc(73266);Entity a = JSON.parseObject("{\"f1\":false,\"f2\":null}", Entity.class);
        __CLR4_5_21kit1kitlusyju20.R.inc(73267);Assert.assertEquals(false, a.getF1());
        __CLR4_5_21kit1kitlusyju20.R.inc(73268);Assert.assertEquals(null, a.getF2());
    }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}
    
    public static class Entity {

        private final Boolean f1;
        private final Boolean f2;

        @JSONCreator
        public Entity(@JSONField(name = "f1") Boolean f1, @JSONField(name = "f2") Boolean f2){try{__CLR4_5_21kit1kitlusyju20.R.inc(73269);
            __CLR4_5_21kit1kitlusyju20.R.inc(73270);this.f1 = f1;
            __CLR4_5_21kit1kitlusyju20.R.inc(73271);this.f2 = f2;
        }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}

        public Boolean getF1() {try{__CLR4_5_21kit1kitlusyju20.R.inc(73272);
            __CLR4_5_21kit1kitlusyju20.R.inc(73273);return f1;
        }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}

        public Boolean getF2() {try{__CLR4_5_21kit1kitlusyju20.R.inc(73274);
            __CLR4_5_21kit1kitlusyju20.R.inc(73275);return f2;
        }finally{__CLR4_5_21kit1kitlusyju20.R.flushNeeded();}}

    }
}
