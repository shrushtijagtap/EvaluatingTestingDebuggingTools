/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class Issue1424 extends TestCase {static class __CLR4_5_21bco1bcolusvna0u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61404,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class IntegerVal {
        private int v;

        public void setV(int v) {try{__CLR4_5_21bco1bcolusvna0u.R.inc(61368);
            __CLR4_5_21bco1bcolusvna0u.R.inc(61369);this.v = v;
        }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21bco1bcolusvna0u.R.inc(61370);
            __CLR4_5_21bco1bcolusvna0u.R.inc(61371);return String.valueOf(v);
        }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}
    }

    public static class FloatVal {
        private float v;

        public void setV(float v) {try{__CLR4_5_21bco1bcolusvna0u.R.inc(61372);
            __CLR4_5_21bco1bcolusvna0u.R.inc(61373);this.v = v;
        }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21bco1bcolusvna0u.R.inc(61374);
            __CLR4_5_21bco1bcolusvna0u.R.inc(61375);return String.valueOf(v);
        }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}
    }

    public void test_for_issue_int() {__CLR4_5_21bco1bcolusvna0u.R.globalSliceStart(getClass().getName(),61376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ai1uel1bcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bco1bcolusvna0u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bco1bcolusvna0u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61376,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ai1uel1bcw(){try{__CLR4_5_21bco1bcolusvna0u.R.inc(61376);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61377);Map<String, Long> intOverflowMap = new HashMap<String, Long>();
        __CLR4_5_21bco1bcolusvna0u.R.inc(61378);long intOverflow = Integer.MAX_VALUE;
        __CLR4_5_21bco1bcolusvna0u.R.inc(61379);intOverflowMap.put("v", intOverflow + 1);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61380);String sIntOverflow = JSON.toJSONString(intOverflowMap);

        __CLR4_5_21bco1bcolusvna0u.R.inc(61381);Exception error = null;
        __CLR4_5_21bco1bcolusvna0u.R.inc(61382);try {
            __CLR4_5_21bco1bcolusvna0u.R.inc(61383);JSON.parseObject(sIntOverflow, IntegerVal.class);
        } catch (Exception e) {
            __CLR4_5_21bco1bcolusvna0u.R.inc(61384);error = e;
        }
        __CLR4_5_21bco1bcolusvna0u.R.inc(61385);assertNotNull(error);
    }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}

    public void test_for_issue_float() {__CLR4_5_21bco1bcolusvna0u.R.globalSliceStart(getClass().getName(),61386);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lduzeu1bd6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bco1bcolusvna0u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bco1bcolusvna0u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61386,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lduzeu1bd6(){try{__CLR4_5_21bco1bcolusvna0u.R.inc(61386);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61387);Map<String, Double> floatOverflowMap = new HashMap<String, Double>();
        __CLR4_5_21bco1bcolusvna0u.R.inc(61388);double floatOverflow = Float.MAX_VALUE;
        __CLR4_5_21bco1bcolusvna0u.R.inc(61389);floatOverflowMap.put("v", floatOverflow + 1);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61390);String sFloatOverflow = JSON.toJSONString(floatOverflowMap);

        __CLR4_5_21bco1bcolusvna0u.R.inc(61391);assertEquals("{\"v\":3.4028234663852886E38}", sFloatOverflow);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61392);FloatVal floatVal = JSON.parseObject(sFloatOverflow, FloatVal.class);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61393);assertEquals(3.4028235E38F, floatVal.v);

        __CLR4_5_21bco1bcolusvna0u.R.inc(61394);assertEquals(floatVal.v, Float.parseFloat("3.4028234663852886E38"));
    }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}

    public void test_for_issue_float_infinity() {__CLR4_5_21bco1bcolusvna0u.R.globalSliceStart(getClass().getName(),61395);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zy2zp1bdf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bco1bcolusvna0u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bco1bcolusvna0u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_float_infinity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61395,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zy2zp1bdf(){try{__CLR4_5_21bco1bcolusvna0u.R.inc(61395);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61396);Map<String, Double> floatOverflowMap = new HashMap<String, Double>();
        __CLR4_5_21bco1bcolusvna0u.R.inc(61397);double floatOverflow = Float.MAX_VALUE;
        __CLR4_5_21bco1bcolusvna0u.R.inc(61398);floatOverflowMap.put("v", floatOverflow + floatOverflow);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61399);String sFloatOverflow = JSON.toJSONString(floatOverflowMap);

        __CLR4_5_21bco1bcolusvna0u.R.inc(61400);System.out.println(sFloatOverflow);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61401);assertEquals("{\"v\":6.805646932770577E38}", sFloatOverflow);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61402);FloatVal floatVal = JSON.parseObject(sFloatOverflow, FloatVal.class);
        __CLR4_5_21bco1bcolusvna0u.R.inc(61403);assertEquals(Float.parseFloat("6.805646932770577E38"), floatVal.v);
    }finally{__CLR4_5_21bco1bcolusvna0u.R.flushNeeded();}}
}
