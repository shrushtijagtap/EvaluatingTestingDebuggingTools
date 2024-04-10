/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.deny;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Properties;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

public class DenyTest10 extends TestCase {static class __CLR4_5_21md61md6lusyjuad{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,75660,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig config = new ParserConfig();

    protected void setUp() throws Exception {try{__CLR4_5_21md61md6lusyjuad.R.inc(75642);
        __CLR4_5_21md61md6lusyjuad.R.inc(75643);assertFalse(config.isAutoTypeSupport());

        __CLR4_5_21md61md6lusyjuad.R.inc(75644);Properties properties = new Properties();
        __CLR4_5_21md61md6lusyjuad.R.inc(75645);properties.put(ParserConfig.AUTOTYPE_SUPPORT_PROPERTY, "false");
        // -ea -Dfastjson.parser.autoTypeAccept=com.alibaba.json.bvt.parser.deser.DenyTest9
        __CLR4_5_21md61md6lusyjuad.R.inc(75646);config.configFromPropety(properties);
    }finally{__CLR4_5_21md61md6lusyjuad.R.flushNeeded();}}

    public void test_hashMap() throws Exception {__CLR4_5_21md61md6lusyjuad.R.globalSliceStart(getClass().getName(),75647);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23nv65k1mdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21md61md6lusyjuad.R.rethrow($CLV_t2$);}finally{__CLR4_5_21md61md6lusyjuad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.deny.DenyTest10.test_hashMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75647,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23nv65k1mdb() throws Exception{try{__CLR4_5_21md61md6lusyjuad.R.inc(75647);
        __CLR4_5_21md61md6lusyjuad.R.inc(75648);Object obj = JSON.parseObject("{\"@type\":\"java.util.HashMap\"}", Object.class, config);
        __CLR4_5_21md61md6lusyjuad.R.inc(75649);assertEquals(HashMap.class, obj.getClass());
    }finally{__CLR4_5_21md61md6lusyjuad.R.flushNeeded();}}

    public void test_hashMap_weekHashMap() throws Exception {__CLR4_5_21md61md6lusyjuad.R.globalSliceStart(getClass().getName(),75650);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ov1lb71mde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21md61md6lusyjuad.R.rethrow($CLV_t2$);}finally{__CLR4_5_21md61md6lusyjuad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.deny.DenyTest10.test_hashMap_weekHashMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75650,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ov1lb71mde() throws Exception{try{__CLR4_5_21md61md6lusyjuad.R.inc(75650);
        __CLR4_5_21md61md6lusyjuad.R.inc(75651);Object obj = JSON.parseObject("{\"@type\":\"java.util.WeakHashMap\"}", Object.class, config);
        __CLR4_5_21md61md6lusyjuad.R.inc(75652);assertEquals(WeakHashMap.class, obj.getClass());
    }finally{__CLR4_5_21md61md6lusyjuad.R.flushNeeded();}}

    public void test_hashMap_concurrentHashMap() throws Exception {__CLR4_5_21md61md6lusyjuad.R.globalSliceStart(getClass().getName(),75653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ydcheo1mdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21md61md6lusyjuad.R.rethrow($CLV_t2$);}finally{__CLR4_5_21md61md6lusyjuad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.deny.DenyTest10.test_hashMap_concurrentHashMap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ydcheo1mdh() throws Exception{try{__CLR4_5_21md61md6lusyjuad.R.inc(75653);
        __CLR4_5_21md61md6lusyjuad.R.inc(75654);Object obj = JSON.parseObject("{\"@type\":\"java.util.concurrent.ConcurrentHashMap\"}", Object.class, config);
        __CLR4_5_21md61md6lusyjuad.R.inc(75655);assertEquals(ConcurrentHashMap.class, obj.getClass());
    }finally{__CLR4_5_21md61md6lusyjuad.R.flushNeeded();}}

    public void test_uuid() throws Exception {__CLR4_5_21md61md6lusyjuad.R.globalSliceStart(getClass().getName(),75656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tal8jz1mdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21md61md6lusyjuad.R.rethrow($CLV_t2$);}finally{__CLR4_5_21md61md6lusyjuad.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.deny.DenyTest10.test_uuid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),75656,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tal8jz1mdk() throws Exception{try{__CLR4_5_21md61md6lusyjuad.R.inc(75656);
        __CLR4_5_21md61md6lusyjuad.R.inc(75657);System.out.println(UUID.randomUUID());
        __CLR4_5_21md61md6lusyjuad.R.inc(75658);Object obj = JSON.parseObject("{\"@type\":\"java.util.UUID\",\"val\":\"290c580d-efa3-432b-8475-2655e336232a\"}", Object.class, config);
        __CLR4_5_21md61md6lusyjuad.R.inc(75659);assertEquals(UUID.class, obj.getClass());
    }finally{__CLR4_5_21md61md6lusyjuad.R.flushNeeded();}}
}
