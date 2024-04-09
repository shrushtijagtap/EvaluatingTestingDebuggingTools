/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.value;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LongValueTest extends TestCase {static class __CLR4_5_21z041z04lusvni5j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,92078,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_value() {__CLR4_5_21z041z04lusvni5j.R.globalSliceStart(getClass().getName(),92020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2z4o0nf1z04();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z041z04lusvni5j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z041z04lusvni5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2z4o0nf1z04(){try{__CLR4_5_21z041z04lusvni5j.R.inc(92020);
        __CLR4_5_21z041z04lusvni5j.R.inc(92021);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_5_21z041z04lusvni5j.R.inc(92022);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92023)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92024)==0&false)); i += step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92025);VO vo = new VO();
            __CLR4_5_21z041z04lusvni5j.R.inc(92026);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92027);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92028);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92029);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_5_21z041z04lusvni5j.R.inc(92030);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92031)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92032)==0&false)); i -= step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92033);VO vo = new VO();
            __CLR4_5_21z041z04lusvni5j.R.inc(92034);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92035);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92036);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92037);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_5_21z041z04lusvni5j.R.flushNeeded();}}

    public void test_value_1() {__CLR4_5_21z041z04lusvni5j.R.globalSliceStart(getClass().getName(),92038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o3fl4t1z0m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z041z04lusvni5j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z041z04lusvni5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o3fl4t1z0m(){try{__CLR4_5_21z041z04lusvni5j.R.inc(92038);
        __CLR4_5_21z041z04lusvni5j.R.inc(92039);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_5_21z041z04lusvni5j.R.inc(92040);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92041)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92042)==0&false)); i += step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92043);V1 vo = new V1();
            __CLR4_5_21z041z04lusvni5j.R.inc(92044);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92045);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92046);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92047);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_5_21z041z04lusvni5j.R.inc(92048);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92049)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92050)==0&false)); i -= step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92051);V1 vo = new V1();
            __CLR4_5_21z041z04lusvni5j.R.inc(92052);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92053);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92054);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92055);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_5_21z041z04lusvni5j.R.flushNeeded();}}
    
    public void test_value_2() {__CLR4_5_21z041z04lusvni5j.R.globalSliceStart(getClass().getName(),92056);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rcfjxa1z14();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21z041z04lusvni5j.R.rethrow($CLV_t2$);}finally{__CLR4_5_21z041z04lusvni5j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92056,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rcfjxa1z14(){try{__CLR4_5_21z041z04lusvni5j.R.inc(92056);
        __CLR4_5_21z041z04lusvni5j.R.inc(92057);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_5_21z041z04lusvni5j.R.inc(92058);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92059)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92060)==0&false)); i += step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92061);V2 vo = new V2();
            __CLR4_5_21z041z04lusvni5j.R.inc(92062);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92063);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92064);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92065);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_5_21z041z04lusvni5j.R.inc(92066);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_5_21z041z04lusvni5j.R.iget(92067)!=0|true))||(__CLR4_5_21z041z04lusvni5j.R.iget(92068)==0&false)); i -= step) {{
            __CLR4_5_21z041z04lusvni5j.R.inc(92069);V2 vo = new V2();
            __CLR4_5_21z041z04lusvni5j.R.inc(92070);vo.value = i;
            __CLR4_5_21z041z04lusvni5j.R.inc(92071);String text = JSON.toJSONString(vo);
            __CLR4_5_21z041z04lusvni5j.R.inc(92072);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_5_21z041z04lusvni5j.R.inc(92073);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_5_21z041z04lusvni5j.R.flushNeeded();}}

    public static class VO {

        public long value;
    }

    static class V1 {

        public long value;
    }

    public static class V2 {

        private long value;

        public long getValue() {try{__CLR4_5_21z041z04lusvni5j.R.inc(92074);
            __CLR4_5_21z041z04lusvni5j.R.inc(92075);return value;
        }finally{__CLR4_5_21z041z04lusvni5j.R.flushNeeded();}}

        public void setValue(long value) {try{__CLR4_5_21z041z04lusvni5j.R.inc(92076);
            __CLR4_5_21z041z04lusvni5j.R.inc(92077);this.value = value;
        }finally{__CLR4_5_21z041z04lusvni5j.R.flushNeeded();}}

    }
}
