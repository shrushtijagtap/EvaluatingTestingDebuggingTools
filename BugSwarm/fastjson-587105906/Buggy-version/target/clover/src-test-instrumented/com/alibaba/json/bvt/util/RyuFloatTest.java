/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.util.RyuFloat;
import junit.framework.TestCase;

import java.util.Random;

public class RyuFloatTest extends TestCase {static class __CLR4_1_101xwu1xwulusqknkt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90631,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_ryu() throws Exception {__CLR4_1_101xwu1xwulusqknkt.R.globalSliceStart(getClass().getName(),90606);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n3pbki1xwu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xwu1xwulusqknkt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xwu1xwulusqknkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuFloatTest.test_for_ryu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90606,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n3pbki1xwu() throws Exception{try{__CLR4_1_101xwu1xwulusqknkt.R.inc(90606);
        __CLR4_1_101xwu1xwulusqknkt.R.inc(90607);Random random = new Random();

        __CLR4_1_101xwu1xwulusqknkt.R.inc(90608);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_1_101xwu1xwulusqknkt.R.iget(90609)!=0|true))||(__CLR4_1_101xwu1xwulusqknkt.R.iget(90610)==0&false)); ++i) {{
            __CLR4_1_101xwu1xwulusqknkt.R.inc(90611);float value = random.nextFloat();

            __CLR4_1_101xwu1xwulusqknkt.R.inc(90612);String str1 = Float.toString(value);
            __CLR4_1_101xwu1xwulusqknkt.R.inc(90613);String str2 = RyuFloat.toString(value);

            __CLR4_1_101xwu1xwulusqknkt.R.inc(90614);if ((((!str1.equals(str2))&&(__CLR4_1_101xwu1xwulusqknkt.R.iget(90615)!=0|true))||(__CLR4_1_101xwu1xwulusqknkt.R.iget(90616)==0&false))) {{
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90617);boolean cmp = (Float.parseFloat(str1) == Float.parseFloat(str2));
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90618);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90619);assertTrue(cmp);
//                assertTrue(Float.parseFloat(str1) == Float.parseFloat(str2));
            }
        }}
    }}finally{__CLR4_1_101xwu1xwulusqknkt.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_101xwu1xwulusqknkt.R.globalSliceStart(getClass().getName(),90620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21xx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xwu1xwulusqknkt.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xwu1xwulusqknkt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuFloatTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90620,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21xx8() throws Exception{try{__CLR4_1_101xwu1xwulusqknkt.R.inc(90620);
        __CLR4_1_101xwu1xwulusqknkt.R.inc(90621);float[] values = new float[] {
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
                3.3554432E7f,

                0.1f,
                0.01f,
                0.001f,
                0.0001f,
                0.00001f,
                0.000001f,
                0.0000001f,

                1.1f,
                1.01f,
                1.001f,
                1.0001f,
                1.00001f,
                1.000001f,
                1.0000001f,
        };

        __CLR4_1_101xwu1xwulusqknkt.R.inc(90622);for (float value : values) {{
            __CLR4_1_101xwu1xwulusqknkt.R.inc(90623);String str1 = Float.toString(value);
            __CLR4_1_101xwu1xwulusqknkt.R.inc(90624);String str2 = RyuFloat.toString(value);

            __CLR4_1_101xwu1xwulusqknkt.R.inc(90625);if ((((!str1.equals(str2))&&(__CLR4_1_101xwu1xwulusqknkt.R.iget(90626)!=0|true))||(__CLR4_1_101xwu1xwulusqknkt.R.iget(90627)==0&false))) {{
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90628);boolean cmp = (Float.parseFloat(str1) == Float.parseFloat(str2));
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90629);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_1_101xwu1xwulusqknkt.R.inc(90630);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_1_101xwu1xwulusqknkt.R.flushNeeded();}}
}
