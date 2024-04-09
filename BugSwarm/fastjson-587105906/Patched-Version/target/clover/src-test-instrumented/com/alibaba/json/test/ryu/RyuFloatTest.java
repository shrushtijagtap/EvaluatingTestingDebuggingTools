/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.ryu;

import com.alibaba.fastjson.util.RyuDouble;
import com.alibaba.fastjson.util.RyuFloat;
import junit.framework.TestCase;

import java.util.Random;

public class RyuFloatTest extends TestCase {static class __CLR4_5_228me28melusvnlom{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,104511,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_ryu() throws Exception {__CLR4_5_228me28melusvnlom.R.globalSliceStart(getClass().getName(),104486);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3pbki28me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228me28melusvnlom.R.rethrow($CLV_t2$);}finally{__CLR4_5_228me28melusvnlom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.ryu.RyuFloatTest.test_for_ryu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104486,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3pbki28me() throws Exception{try{__CLR4_5_228me28melusvnlom.R.inc(104486);
        __CLR4_5_228me28melusvnlom.R.inc(104487);Random random = new Random();

        __CLR4_5_228me28melusvnlom.R.inc(104488);for (int i = 0; (((i < 1000 * 1000 * 1000)&&(__CLR4_5_228me28melusvnlom.R.iget(104489)!=0|true))||(__CLR4_5_228me28melusvnlom.R.iget(104490)==0&false)); ++i) {{
            __CLR4_5_228me28melusvnlom.R.inc(104491);float value = random.nextFloat();

            __CLR4_5_228me28melusvnlom.R.inc(104492);String str1 = Float.toString(value);
            __CLR4_5_228me28melusvnlom.R.inc(104493);String str2 = RyuFloat.toString(value);

            __CLR4_5_228me28melusvnlom.R.inc(104494);if ((((!str1.equals(str2))&&(__CLR4_5_228me28melusvnlom.R.iget(104495)!=0|true))||(__CLR4_5_228me28melusvnlom.R.iget(104496)==0&false))) {{
                __CLR4_5_228me28melusvnlom.R.inc(104497);boolean cmp = (Float.parseFloat(str1) == Float.parseFloat(str2));
                __CLR4_5_228me28melusvnlom.R.inc(104498);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_5_228me28melusvnlom.R.inc(104499);assertTrue(cmp);
//                assertTrue(Float.parseFloat(str1) == Float.parseFloat(str2));
            }
        }}
    }}finally{__CLR4_5_228me28melusvnlom.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_228me28melusvnlom.R.globalSliceStart(getClass().getName(),104500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp228ms();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228me28melusvnlom.R.rethrow($CLV_t2$);}finally{__CLR4_5_228me28melusvnlom.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.ryu.RyuFloatTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp228ms() throws Exception{try{__CLR4_5_228me28melusvnlom.R.inc(104500);
        __CLR4_5_228me28melusvnlom.R.inc(104501);float[] values = new float[] {
                Float.NaN,
                Float.NEGATIVE_INFINITY,
                Float.POSITIVE_INFINITY,
                Float.MIN_VALUE,
                Float.MAX_VALUE,
                0,
                0.0f,
                -0.0f,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                Long.MAX_VALUE,
                Long.MIN_VALUE,
                Float.intBitsToFloat(0x80000000),
                1.0f,
                -1f,
                Float.intBitsToFloat(0x00800000),
                1.0E7f,
                9999999.0f,
                0.001f,
                0.0009999999f,
                Float.intBitsToFloat(0x7f7fffff),
                Float.intBitsToFloat(0x00000001),
                3.3554448E7f,
                8.999999E9f,
                3.4366717E10f,
                0.33007812f,
                Float.intBitsToFloat(0x5D1502F9),
                Float.intBitsToFloat(0x5D9502F9),
                Float.intBitsToFloat(0x5E1502F9),
                4.7223665E21f,
                8388608.0f,
                1.6777216E7f,
                3.3554436E7f,
                6.7131496E7f,
                1.9310392E-38f,
                -2.47E-43f,
                1.993244E-38f,
                4103.9003f,
                5.3399997E9f,
                6.0898E-39f,
                0.0010310042f,
                2.8823261E17f,
                7.038531E-26f,
                9.2234038E17f,
                6.7108872E7f,
                1.0E-44f,
                2.816025E14f,
                9.223372E18f,
                1.5846085E29f,
                1.1811161E19f,
                5.368709E18f,
                4.6143165E18f,
                0.007812537f,
                1.4E-45f,
                1.18697724E20f,
                1.00014165E-36f,
                200f,
                3.3554432E7f

        };

        __CLR4_5_228me28melusvnlom.R.inc(104502);for (float value : values) {{
            __CLR4_5_228me28melusvnlom.R.inc(104503);String str1 = Float.toString(value);
            __CLR4_5_228me28melusvnlom.R.inc(104504);String str2 = RyuFloat.toString(value);

            __CLR4_5_228me28melusvnlom.R.inc(104505);if ((((!str1.equals(str2))&&(__CLR4_5_228me28melusvnlom.R.iget(104506)!=0|true))||(__CLR4_5_228me28melusvnlom.R.iget(104507)==0&false))) {{
                __CLR4_5_228me28melusvnlom.R.inc(104508);boolean cmp = (Float.parseFloat(str1) == Float.parseFloat(str2));
                __CLR4_5_228me28melusvnlom.R.inc(104509);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_5_228me28melusvnlom.R.inc(104510);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_5_228me28melusvnlom.R.flushNeeded();}}
}
