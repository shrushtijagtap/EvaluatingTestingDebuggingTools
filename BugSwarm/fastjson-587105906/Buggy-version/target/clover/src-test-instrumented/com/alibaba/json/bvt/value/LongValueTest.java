/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.value;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LongValueTest extends TestCase {static class __CLR4_1_101y271y27lusqknr0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_value() {__CLR4_1_101y271y27lusqknr0.R.globalSliceStart(getClass().getName(),90799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z4o0nf1y27();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y271y27lusqknr0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y271y27lusqknr0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90799,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z4o0nf1y27(){try{__CLR4_1_101y271y27lusqknr0.R.inc(90799);
        __CLR4_1_101y271y27lusqknr0.R.inc(90800);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101y271y27lusqknr0.R.inc(90801);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90802)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90803)==0&false)); i += step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90804);VO vo = new VO();
            __CLR4_1_101y271y27lusqknr0.R.inc(90805);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90806);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90807);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90808);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101y271y27lusqknr0.R.inc(90809);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90810)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90811)==0&false)); i -= step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90812);VO vo = new VO();
            __CLR4_1_101y271y27lusqknr0.R.inc(90813);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90814);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90815);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90816);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101y271y27lusqknr0.R.flushNeeded();}}

    public void test_value_1() {__CLR4_1_101y271y27lusqknr0.R.globalSliceStart(getClass().getName(),90817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o3fl4t1y2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y271y27lusqknr0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y271y27lusqknr0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o3fl4t1y2p(){try{__CLR4_1_101y271y27lusqknr0.R.inc(90817);
        __CLR4_1_101y271y27lusqknr0.R.inc(90818);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101y271y27lusqknr0.R.inc(90819);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90820)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90821)==0&false)); i += step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90822);V1 vo = new V1();
            __CLR4_1_101y271y27lusqknr0.R.inc(90823);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90824);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90825);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90826);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101y271y27lusqknr0.R.inc(90827);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90828)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90829)==0&false)); i -= step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90830);V1 vo = new V1();
            __CLR4_1_101y271y27lusqknr0.R.inc(90831);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90832);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90833);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90834);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101y271y27lusqknr0.R.flushNeeded();}}
    
    public void test_value_2() {__CLR4_1_101y271y27lusqknr0.R.globalSliceStart(getClass().getName(),90835);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rcfjxa1y37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y271y27lusqknr0.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y271y27lusqknr0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90835,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rcfjxa1y37(){try{__CLR4_1_101y271y27lusqknr0.R.inc(90835);
        __CLR4_1_101y271y27lusqknr0.R.inc(90836);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101y271y27lusqknr0.R.inc(90837);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90838)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90839)==0&false)); i += step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90840);V2 vo = new V2();
            __CLR4_1_101y271y27lusqknr0.R.inc(90841);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90842);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90843);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90844);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101y271y27lusqknr0.R.inc(90845);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101y271y27lusqknr0.R.iget(90846)!=0|true))||(__CLR4_1_101y271y27lusqknr0.R.iget(90847)==0&false)); i -= step) {{
            __CLR4_1_101y271y27lusqknr0.R.inc(90848);V2 vo = new V2();
            __CLR4_1_101y271y27lusqknr0.R.inc(90849);vo.value = i;
            __CLR4_1_101y271y27lusqknr0.R.inc(90850);String text = JSON.toJSONString(vo);
            __CLR4_1_101y271y27lusqknr0.R.inc(90851);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_1_101y271y27lusqknr0.R.inc(90852);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101y271y27lusqknr0.R.flushNeeded();}}

    public static class VO {

        public long value;
    }

    static class V1 {

        public long value;
    }

    public static class V2 {

        private long value;

        public long getValue() {try{__CLR4_1_101y271y27lusqknr0.R.inc(90853);
            __CLR4_1_101y271y27lusqknr0.R.inc(90854);return value;
        }finally{__CLR4_1_101y271y27lusqknr0.R.flushNeeded();}}

        public void setValue(long value) {try{__CLR4_1_101y271y27lusqknr0.R.inc(90855);
            __CLR4_1_101y271y27lusqknr0.R.inc(90856);this.value = value;
        }finally{__CLR4_1_101y271y27lusqknr0.R.flushNeeded();}}

    }
}
