/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

public class Issue1424 extends TestCase {static class __CLR4_5_21aeg1aeglusyjsu3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60172,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class IntegerVal {
        private int v;

        public void setV(int v) {try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60136);
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60137);this.v = v;
        }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60138);
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60139);return String.valueOf(v);
        }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}
    }

    public static class FloatVal {
        private float v;

        public void setV(float v) {try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60140);
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60141);this.v = v;
        }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60142);
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60143);return String.valueOf(v);
        }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}
    }

    public void test_for_issue_int() {__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceStart(getClass().getName(),60144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ai1uel1aeo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21aeg1aeglusyjsu3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60144,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ai1uel1aeo(){try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60144);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60145);Map<String, Long> intOverflowMap = new HashMap<String, Long>();
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60146);long intOverflow = Integer.MAX_VALUE;
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60147);intOverflowMap.put("v", intOverflow + 1);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60148);String sIntOverflow = JSON.toJSONString(intOverflowMap);

        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60149);Exception error = null;
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60150);try {
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60151);JSON.parseObject(sIntOverflow, IntegerVal.class);
        } catch (Exception e) {
            __CLR4_5_21aeg1aeglusyjsu3.R.inc(60152);error = e;
        }
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60153);assertNotNull(error);
    }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}

    public void test_for_issue_float() {__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceStart(getClass().getName(),60154);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lduzeu1aey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21aeg1aeglusyjsu3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_float",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60154,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lduzeu1aey(){try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60154);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60155);Map<String, Double> floatOverflowMap = new HashMap<String, Double>();
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60156);double floatOverflow = Float.MAX_VALUE;
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60157);floatOverflowMap.put("v", floatOverflow + 1);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60158);String sFloatOverflow = JSON.toJSONString(floatOverflowMap);

        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60159);assertEquals("{\"v\":3.4028234663852886E38}", sFloatOverflow);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60160);FloatVal floatVal = JSON.parseObject(sFloatOverflow, FloatVal.class);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60161);assertEquals(3.4028235E38F, floatVal.v);

        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60162);assertEquals(floatVal.v, Float.parseFloat("3.4028234663852886E38"));
    }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}

    public void test_for_issue_float_infinity() {__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceStart(getClass().getName(),60163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zy2zp1af7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21aeg1aeglusyjsu3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21aeg1aeglusyjsu3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1424.test_for_issue_float_infinity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zy2zp1af7(){try{__CLR4_5_21aeg1aeglusyjsu3.R.inc(60163);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60164);Map<String, Double> floatOverflowMap = new HashMap<String, Double>();
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60165);double floatOverflow = Float.MAX_VALUE;
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60166);floatOverflowMap.put("v", floatOverflow + floatOverflow);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60167);String sFloatOverflow = JSON.toJSONString(floatOverflowMap);

        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60168);System.out.println(sFloatOverflow);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60169);assertEquals("{\"v\":6.805646932770577E38}", sFloatOverflow);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60170);FloatVal floatVal = JSON.parseObject(sFloatOverflow, FloatVal.class);
        __CLR4_5_21aeg1aeglusyjsu3.R.inc(60171);assertEquals(Float.parseFloat("6.805646932770577E38"), floatVal.v);
    }finally{__CLR4_5_21aeg1aeglusyjsu3.R.flushNeeded();}}
}
