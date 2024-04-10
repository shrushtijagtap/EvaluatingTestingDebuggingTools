/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

public class FieldDeserializerTest1 extends TestCase {static class __CLR4_5_21ku21ku2lusyju3h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,73686,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21ku21ku2lusyju3h.R.globalSliceStart(getClass().getName(),73658);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1ku2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ku21ku2lusyju3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ku21ku2lusyju3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest1.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73658,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1ku2() throws Exception{try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73658);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73659);Exception error = null;
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73660);try {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73661);JSON.parseObject("{\"value\":[-}", Entity.class, 0);
        } catch (JSONException ex) {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73662);error = ex;
        }
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73663);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21ku21ku2lusyju3h.R.globalSliceStart(getClass().getName(),73664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1ku8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ku21ku2lusyju3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ku21ku2lusyju3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest1.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73664,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1ku8() throws Exception{try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73664);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73665);Exception error = null;
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73666);try {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73667);JSON.parseObject("{,,,\"value\":null}", Entity.class, 0);
        } catch (JSONException ex) {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73668);error = ex;
        }
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73669);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21ku21ku2lusyju3h.R.globalSliceStart(getClass().getName(),73670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1kue();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ku21ku2lusyju3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ku21ku2lusyju3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest1.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1kue() throws Exception{try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73670);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73671);Exception error = null;
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73672);try {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73673);JSON.parseObject("{\"value\":null,\"id\":123}", Entity.class, 0);
        } catch (JSONException ex) {
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73674);error = ex;
        }
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73675);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}
    
    public void test_null() throws Exception {__CLR4_5_21ku21ku2lusyju3h.R.globalSliceStart(getClass().getName(),73676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1kuk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ku21ku2lusyju3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ku21ku2lusyju3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest1.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1kuk() throws Exception{try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73676);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73677);Entity object = JSON.parseObject("{\"value\":null}", Entity.class, 0);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73678);Assert.assertNull(object.getValue());
    }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}
    
    public void test_null_2() throws Exception {__CLR4_5_21ku21ku2lusyju3h.R.globalSliceStart(getClass().getName(),73679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a73e8i1kun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ku21ku2lusyju3h.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ku21ku2lusyju3h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest1.test_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73679,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a73e8i1kun() throws Exception{try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73679);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73680);Entity object = JSON.parseObject("{\"value\":null,\"id\":123}", Entity.class, 0, Feature.IgnoreNotMatch);
        __CLR4_5_21ku21ku2lusyju3h.R.inc(73681);Assert.assertNull(object.getValue());
    }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}
    
    private static class Entity {

        private V1 value;

        public V1 getValue() {try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73682);
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73683);return value;
        }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}

        public void setValue(V1 value) {try{__CLR4_5_21ku21ku2lusyju3h.R.inc(73684);
            __CLR4_5_21ku21ku2lusyju3h.R.inc(73685);this.value = value;
        }finally{__CLR4_5_21ku21ku2lusyju3h.R.flushNeeded();}}

    }

    private static class V1 {

    }
}
