/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class KeyBug_for_zhongl extends TestCase {static class __CLR4_5_217va17valusyjsgl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,56868,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void testCustomedKey() throws Exception {__CLR4_5_217va17valusyjsgl.R.globalSliceStart(getClass().getName(),56854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m4yzvo17va();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217va17valusyjsgl.R.rethrow($CLV_t2$);}finally{__CLR4_5_217va17valusyjsgl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.KeyBug_for_zhongl.testCustomedKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m4yzvo17va() throws Exception{try{__CLR4_5_217va17valusyjsgl.R.inc(56854);
        __CLR4_5_217va17valusyjsgl.R.inc(56855);Assert.assertEquals("{\"uid\":1}", JSON.toJSONString(new V2(1)));
    }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}

    public void testDeserialize() throws Exception {__CLR4_5_217va17valusyjsgl.R.globalSliceStart(getClass().getName(),56856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2epc82417vc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217va17valusyjsgl.R.rethrow($CLV_t2$);}finally{__CLR4_5_217va17valusyjsgl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.KeyBug_for_zhongl.testDeserialize",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2epc82417vc() throws Exception{try{__CLR4_5_217va17valusyjsgl.R.inc(56856);
        __CLR4_5_217va17valusyjsgl.R.inc(56857);Assert.assertEquals(123, JSON.parseObject("{\"uid\":123}", V2.class).id);
    }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}
    
    public void testCustomedKey_static() throws Exception {__CLR4_5_217va17valusyjsgl.R.globalSliceStart(getClass().getName(),56858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2l2mb0p17ve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217va17valusyjsgl.R.rethrow($CLV_t2$);}finally{__CLR4_5_217va17valusyjsgl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.KeyBug_for_zhongl.testCustomedKey_static",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2l2mb0p17ve() throws Exception{try{__CLR4_5_217va17valusyjsgl.R.inc(56858);
        __CLR4_5_217va17valusyjsgl.R.inc(56859);Assert.assertEquals("{\"uid\":1}", JSON.toJSONString(new VO(1)));
    }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}

    public void testDeserialize_static() throws Exception {__CLR4_5_217va17valusyjsgl.R.globalSliceStart(getClass().getName(),56860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qh1ly117vg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217va17valusyjsgl.R.rethrow($CLV_t2$);}finally{__CLR4_5_217va17valusyjsgl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.KeyBug_for_zhongl.testDeserialize_static",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qh1ly117vg() throws Exception{try{__CLR4_5_217va17valusyjsgl.R.inc(56860);
        __CLR4_5_217va17valusyjsgl.R.inc(56861);Assert.assertEquals(123, JSON.parseObject("{\"uid\":123}", VO.class).id);
    }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}

    public static class VO {

        @JSONField(name = "uid")
        public int    id;

        @JSONField(serialize = false)
        public String name = "defaultName";

        public VO(){try{__CLR4_5_217va17valusyjsgl.R.inc(56862);

        }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}

        VO(int id){try{__CLR4_5_217va17valusyjsgl.R.inc(56863);
            __CLR4_5_217va17valusyjsgl.R.inc(56864);this.id = id;
        }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}
    }

    private static class V2 {

        @JSONField(name = "uid")
        public int    id;

        @JSONField(serialize = false)
        public String name = "defaultName";

        private V2() {try{__CLR4_5_217va17valusyjsgl.R.inc(56865);

        }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}

        private V2(int id) {try{__CLR4_5_217va17valusyjsgl.R.inc(56866);
            __CLR4_5_217va17valusyjsgl.R.inc(56867);this.id = id;
        }finally{__CLR4_5_217va17valusyjsgl.R.flushNeeded();}}
    }

}
