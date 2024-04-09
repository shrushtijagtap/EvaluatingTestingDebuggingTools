/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class BigDecimalTest extends TestCase {static class __CLR4_5_21lf31lf3lusvne6i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,74437,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_null () throws Exception {__CLR4_5_21lf31lf3lusvne6i.R.globalSliceStart(getClass().getName(),74415);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1lf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf31lf3lusvne6i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf31lf3lusvne6i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigDecimalTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74415,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1lf3() throws Exception{try{__CLR4_5_21lf31lf3lusvne6i.R.inc(74415);
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74416);Assert.assertNull(JSON.parseObject("null", VO.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74417);Assert.assertNull(JSON.parseObject("{value:null}", VO.class).getValue());
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74418);Assert.assertNull(JSON.parseObject("{'value':null}", VO.class).getValue());
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74419);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74420);Assert.assertNull(JSON.parseArray("null", BigDecimal.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74421);Assert.assertNull(JSON.parseObject("null", BigDecimal.class));
    }finally{__CLR4_5_21lf31lf3lusvne6i.R.flushNeeded();}}
    
    public void test_postfix () throws Exception {__CLR4_5_21lf31lf3lusvne6i.R.globalSliceStart(getClass().getName(),74422);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_298i6lt1lfa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf31lf3lusvne6i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf31lf3lusvne6i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigDecimalTest.test_postfix",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74422,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_298i6lt1lfa() throws Exception{try{__CLR4_5_21lf31lf3lusvne6i.R.inc(74422);
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74423);Assert.assertEquals(new BigDecimal ("123"), JSON.parseObject("123L", BigDecimal.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74424);Assert.assertEquals(new BigDecimal ("123"), JSON.parseObject("123D", BigDecimal.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74425);Assert.assertEquals(new BigDecimal ("123"), JSON.parseObject("123F", BigDecimal.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74426);Assert.assertEquals(new BigDecimal ("123"), JSON.parseObject("123S", BigDecimal.class));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74427);Assert.assertEquals(new BigDecimal ("123"), JSON.parseObject("123B", BigDecimal.class));
    }finally{__CLR4_5_21lf31lf3lusvne6i.R.flushNeeded();}}
    
    public void test_className() throws Exception {__CLR4_5_21lf31lf3lusvne6i.R.globalSliceStart(getClass().getName(),74428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2akryyr1lfg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lf31lf3lusvne6i.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lf31lf3lusvne6i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.BigDecimalTest.test_className",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2akryyr1lfg() throws Exception{try{__CLR4_5_21lf31lf3lusvne6i.R.inc(74428);
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74429);Assert.assertEquals("123.", JSON.toJSONString(new BigDecimal("123"), SerializerFeature.WriteClassName));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74430);Assert.assertEquals("123.00", JSON.toJSONString(new BigDecimal("123.00"), SerializerFeature.WriteClassName));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74431);Assert.assertEquals("123.45", JSON.toJSONString(new BigDecimal("123.45"), SerializerFeature.WriteClassName));
        __CLR4_5_21lf31lf3lusvne6i.R.inc(74432);Assert.assertEquals(new BigDecimal("123"), JSON.parse("123."));
    }finally{__CLR4_5_21lf31lf3lusvne6i.R.flushNeeded();}}
    
    public static class VO {

        private BigDecimal value;

        public BigDecimal getValue() {try{__CLR4_5_21lf31lf3lusvne6i.R.inc(74433);
            __CLR4_5_21lf31lf3lusvne6i.R.inc(74434);return value;
        }finally{__CLR4_5_21lf31lf3lusvne6i.R.flushNeeded();}}

        public void setValue(BigDecimal value) {try{__CLR4_5_21lf31lf3lusvne6i.R.inc(74435);
            __CLR4_5_21lf31lf3lusvne6i.R.inc(74436);this.value = value;
        }finally{__CLR4_5_21lf31lf3lusvne6i.R.flushNeeded();}}

    }
}
