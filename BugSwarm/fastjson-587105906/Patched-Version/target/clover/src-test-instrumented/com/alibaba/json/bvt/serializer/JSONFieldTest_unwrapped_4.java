/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.LinkedHashMap;
import java.util.Map;

public class JSONFieldTest_unwrapped_4 extends TestCase {static class __CLR4_5_21sj61sj6lusvnga4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,83659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_jsonField() throws Exception {__CLR4_5_21sj61sj6lusvnga4.R.globalSliceStart(getClass().getName(),83634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2onqrpw1sj6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sj61sj6lusvnga4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sj61sj6lusvnga4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest_unwrapped_4.test_jsonField",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2onqrpw1sj6() throws Exception{try{__CLR4_5_21sj61sj6lusvnga4.R.inc(83634);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83635);Health vo = new Health();
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83636);vo.id = 123;
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83637);vo.border = 234;
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83638);vo.details.put("latitude", 37);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83639);vo.details.put("longitude", 127);

        __CLR4_5_21sj61sj6lusvnga4.R.inc(83640);String text = JSON.toJSONString(vo);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83641);Assert.assertEquals("{\"border\":234,\"latitude\":37,\"longitude\":127,\"id\":123}", text);

        __CLR4_5_21sj61sj6lusvnga4.R.inc(83642);Health vo2 = JSON.parseObject(text, Health.class);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83643);assertNotNull(vo2.details);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83644);assertEquals(37, vo2.details.get("latitude"));
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83645);assertEquals(127, vo2.details.get("longitude"));

    }finally{__CLR4_5_21sj61sj6lusvnga4.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21sj61sj6lusvnga4.R.globalSliceStart(getClass().getName(),83646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1sji();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sj61sj6lusvnga4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sj61sj6lusvnga4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest_unwrapped_4.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1sji() throws Exception{try{__CLR4_5_21sj61sj6lusvnga4.R.inc(83646);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83647);Health vo = new Health();
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83648);vo.id = 123;
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83649);vo.border = 234;
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83650);vo.details = null;

        __CLR4_5_21sj61sj6lusvnga4.R.inc(83651);String text = JSON.toJSONString(vo);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83652);Assert.assertEquals("{\"border\":234,\"id\":123}", text);
    }finally{__CLR4_5_21sj61sj6lusvnga4.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_5_21sj61sj6lusvnga4.R.globalSliceStart(getClass().getName(),83653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m1ch211sjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sj61sj6lusvnga4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sj61sj6lusvnga4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONFieldTest_unwrapped_4.test_empty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m1ch211sjp() throws Exception{try{__CLR4_5_21sj61sj6lusvnga4.R.inc(83653);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83654);Health vo = new Health();
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83655);vo.id = 123;
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83656);vo.border = 234;

        __CLR4_5_21sj61sj6lusvnga4.R.inc(83657);String text = JSON.toJSONString(vo);
        __CLR4_5_21sj61sj6lusvnga4.R.inc(83658);Assert.assertEquals("{\"border\":234,\"id\":123}", text);
    }finally{__CLR4_5_21sj61sj6lusvnga4.R.flushNeeded();}}

    public static class Health {
        public int id;
        public int border;

        @JSONField(unwrapped = true)
        public Map<String, Object> details = new LinkedHashMap<String, Object>();
    }
}
