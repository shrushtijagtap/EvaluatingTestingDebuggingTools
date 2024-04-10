/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.util.UUID;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;

public class LongFieldDeserializerTest extends TestCase {static class __CLR4_5_21l7h1l7hlusyju67{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74169,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21l7h1l7hlusyju67.R.globalSliceStart(getClass().getName(),74141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21l7h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l7h1l7hlusyju67.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l7h1l7hlusyju67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.LongFieldDeserializerTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74141,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21l7h() throws Exception{try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74141);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74142);Entity a = JSON.parseObject("{f1:null, f2:null}", Entity.class);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74143);Assert.assertEquals(124, a.getF1());
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74144);Assert.assertEquals(null, a.getF2());
    }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21l7h1l7hlusyju67.R.globalSliceStart(getClass().getName(),74145);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1l7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l7h1l7hlusyju67.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l7h1l7hlusyju67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.LongFieldDeserializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74145,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1l7l() throws Exception{try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74145);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74146);Entity a = JSON.parseObject("{f1:22, f2:'33'}", Entity.class);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74147);Assert.assertEquals(22, a.getF1());
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74148);Assert.assertEquals(33, a.getF2().intValue());
    }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21l7h1l7hlusyju67.R.globalSliceStart(getClass().getName(),74149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441l7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l7h1l7hlusyju67.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l7h1l7hlusyju67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.LongFieldDeserializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74149,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441l7p() throws Exception{try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74149);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74150);Entity a = JSON.parseObject("{f1:'22', f2:33}", Entity.class);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74151);Assert.assertEquals(22, a.getF1());
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74152);Assert.assertEquals(33, a.getF2().longValue());
    }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21l7h1l7hlusyju67.R.globalSliceStart(getClass().getName(),74153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1l7t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l7h1l7hlusyju67.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l7h1l7hlusyju67.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.LongFieldDeserializerTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1l7t() throws Exception{try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74153);
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74154);JSONException ex = null;
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74155);try {
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74156);JSON.parseObject("{f3:44}", UUID.class);
        } catch (JSONException e) {
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74157);ex = e;
        }
        __CLR4_5_21l7h1l7hlusyju67.R.inc(74158);Assert.assertNotNull(ex);
    }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

    public static class Entity {

        private long f1 = 124;
        private Long f2 = 123L;

        public long getF1() {try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74159);
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74160);return f1;
        }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

        public void setF1(long f1) {try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74161);
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74162);this.f1 = f1;
        }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

        public Long getF2() {try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74163);
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74164);return f2;
        }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

        public void setF2(Long f2) {try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74165);
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74166);this.f2 = f2;
        }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}

        public void setF3(Long v) {try{__CLR4_5_21l7h1l7hlusyju67.R.inc(74167);
            __CLR4_5_21l7h1l7hlusyju67.R.inc(74168);throw new RuntimeException();
        }finally{__CLR4_5_21l7h1l7hlusyju67.R.flushNeeded();}}
    }
}
