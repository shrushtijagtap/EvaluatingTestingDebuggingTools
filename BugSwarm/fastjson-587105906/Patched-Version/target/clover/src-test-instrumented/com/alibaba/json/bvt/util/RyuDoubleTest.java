/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.util.RyuDouble;
import junit.framework.TestCase;

import java.util.Random;

public class RyuDoubleTest extends TestCase {static class __CLR4_5_21xv01xv0lusyjvrw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90595,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_ryu() throws Exception {__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceStart(getClass().getName(),90540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n3pbki1xv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xv01xv0lusyjvrw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuDoubleTest.test_for_ryu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n3pbki1xv0() throws Exception{try{__CLR4_5_21xv01xv0lusyjvrw.R.inc(90540);
        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90541);Random random = new Random();

        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90542);for (int i = 0; (((i < 1000 * 1000 * 10)&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90543)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90544)==0&false)); ++i) {{
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90545);double value = random.nextDouble();

            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90546);String str1 = Double.toString(value);
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90547);String str2 = RyuDouble.toString(value);

            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90548);if ((((!str1.equals(str2))&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90549)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90550)==0&false))) {{
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90551);System.out.println(str1 + " -> " + str2);
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90552);assertTrue(Double.parseDouble(str1) == Double.parseDouble(str2));
            }
        }}
    }}finally{__CLR4_5_21xv01xv0lusyjvrw.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceStart(getClass().getName(),90553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xv01xv0lusyjvrw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuDoubleTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xvd() throws Exception{try{__CLR4_5_21xv01xv0lusyjvrw.R.inc(90553);
        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90554);double[] values = new double[] {
                Double.NaN,
                Double.NEGATIVE_INFINITY,
                Double.POSITIVE_INFINITY,
                Double.MIN_VALUE,
                Double.MAX_VALUE,

                0,
                0.0d,
                -0.0d,
                Double.longBitsToDouble(0x8000000000000000L),
                Double.NaN,

                Long.MAX_VALUE,
                Long.MIN_VALUE,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                Double.longBitsToDouble(0x0010000000000000L),

                9999999.999999998d,
                0.0009999999999999998d,
                1.0E7d,
                0.001d,
                Double.longBitsToDouble(0x7fefffffffffffffL),

                Double.longBitsToDouble(1),
                -2.109808898695963E16,
                4.940656E-318d,
                1.18575755E-316d,
                2.989102097996E-312d,
                9.0608011534336E15d,
                4.708356024711512E18,
                9.409340012568248E18,
                1.8531501765868567E21,
                -3.347727380279489E33,
                1.9430376160308388E16,
                -6.9741824662760956E19,
                4.3816050601147837E18,

                1.797693134862315E308,
                1.79769313486231E308,
                1.7976931348623E308,
                1.797693134862E308,
                1.79769313486E308,
                1.7976931348E308,
                1.797693134E308,
                1.79769313E308,
                1.7976931E308,
                1.797693E308,
                1.79769E308,
                1.7976E308,
                1.797E308,
                1.79E308,
                1.7E308,
                1E308,

                1.797693134862315,
                1.79769313486231,
                1.7976931348623,
                1.797693134862,
                1.79769313486,
                1.7976931348,
                1.797693134,
                1.79769313,
                1.7976931,
                1.797693,
                1.79769,
                1.7976,
                1.797,
                1.79,
                1.7,
                1,

                -1.797693134862315,
                -1.79769313486231,
                -1.7976931348623,
                -1.797693134862,
                -1.79769313486,
                -1.7976931348,
                -1.797693134,
                -1.79769313,
                -1.7976931,
                -1.797693,
                -1.79769,
                -1.7976,
                -1.797,
                -1.79,
                -1.7,
                -1,

                0.1,
                0.01,
                0.001,
                0.0001,
                0.00001,
                0.000001,
                0.0000001,
                0.00000001,
                0.000000001,
                0.0000000001,
                0.00000000001,
                0.000000000001,
                0.0000000000001,
                0.00000000000001,

                -0.1,
                -0.01,
                -0.001,
                -0.0001,
                -0.00001,
                -0.000001,
                -0.0000001,
                -0.00000001,
                -0.000000001,
                -0.0000000001,
                -0.00000000001,
                -0.000000000001,
                -0.0000000000001,
                -0.00000000000001,

                1.1E1,
                1.1E2,
                1.1E3,
                1.1E4,
                1.1E5,
                1.1E6,
                1.1E7,
                1.1E8,
                1.1E9,
                1.1E10,

                -1.1E1,
                -1.1E2,
                -1.1E3,
                -1.1E4,
                -1.1E5,
                -1.1E6,
                -1.1E7,
                -1.1E8,
                -1.1E9,
                -1.1E10,

                49E10,
                49E100,
                49E200,
                49E300,
                49E301,
                49E302,
                49E303,
                49E304,

                49E-10,
                49E-100,
                49E-200,
                49E-300,
                49E-301,
                49E-302,
                49E-303,
                49E-304,

        };

        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90555);for (int i = 0; (((i < values.length)&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90556)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90557)==0&false)); i++) {{
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90558);double value = values[i];
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90559);String str1 = Double.toString(value);
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90560);String str2 = RyuDouble.toString(value);

            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90561);if ((((!str1.equals(str2))&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90562)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90563)==0&false))) {{
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90564);boolean cmp = (Double.parseDouble(str1) == Double.parseDouble(str2));
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90565);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90566);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_5_21xv01xv0lusyjvrw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceStart(getClass().getName(),90567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1xvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xv01xv0lusyjvrw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuDoubleTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1xvr() throws Exception{try{__CLR4_5_21xv01xv0lusyjvrw.R.inc(90567);
        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90568);double[] values = new double[]{
                0.1,
                0.01,
                0.001,
                0.0001,
                0.00001,
                0.000001,
                0.0000001,
                0.00000001,
                0.000000001,
                0.0000000001,
                0.00000000001,
                0.000000000001,
                0.0000000000001,
                0.00000000000001,
                0.000000000000001,
                0.0000000000000001,
                0.00000000000000001,
                0.000000000000000001,
                0.0000000000000000001,
                0.00000000000000000001,
                0.000000000000000000001,
                0.0000000000000000000001,
                0.00000000000000000000001,
                0.000000000000000000000001,
                0.0000000000000000000000001,
                0.00000000000000000000000001,
                0.000000000000000000000000001,
                0.0000000000000000000000000001,
                0.00000000000000000000000000001,
                0.000000000000000000000000000001,
                0.0000000000000000000000000000001,
                0.00000000000000000000000000000001,
                0.000000000000000000000000000000001,
                0.0000000000000000000000000000000001,
                0.00000000000000000000000000000000001,
                0.000000000000000000000000000000000001,
                0.0000000000000000000000000000000000001,
                0.00000000000000000000000000000000000001,
                0.000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000000000000001,
                0.0000000000000000000000000000000000000000000000000000001,
                0.00000000000000000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000000000000000001,
                0.000000000000000000000000000000000000000000000000000000001,

                -0.1,
                -0.01,
                -0.001,
                -0.0001,
                -0.00001,
                -0.000001,
                -0.0000001,
                -0.00000001,
                -0.000000001,
                -0.0000000001,
                -0.00000000001,
                -0.000000000001,
                -0.0000000000001,
                -0.00000000000001,
                -0.000000000000001,
                -0.0000000000000001,
                -0.00000000000000001,
                -0.000000000000000001,
                -0.0000000000000000001,
                -0.00000000000000000001,
                -0.000000000000000000001,
                -0.0000000000000000000001,
                -0.00000000000000000000001,
                -0.000000000000000000000001,
                -0.0000000000000000000000001,
                -0.00000000000000000000000001,
                -0.000000000000000000000000001,
                -0.0000000000000000000000000001,
                -0.00000000000000000000000000001,
                -0.000000000000000000000000000001,
                -0.0000000000000000000000000000001,
                -0.00000000000000000000000000000001,
                -0.000000000000000000000000000000001,
                -0.0000000000000000000000000000000001,
                -0.00000000000000000000000000000000001,
                -0.000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000000000000001,
                -0.0000000000000000000000000000000000000000000000000000001,
                -0.00000000000000000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000000000000000001,
                -0.000000000000000000000000000000000000000000000000000000001,
        };

        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90569);for (int i = 0; (((i < values.length)&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90570)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90571)==0&false)); i++) {{
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90572);double value = values[i];
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90573);String str1 = Double.toString(value);
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90574);String str2 = RyuDouble.toString(value);

            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90575);if ((((!str1.equals(str2))&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90576)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90577)==0&false))) {{
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90578);boolean cmp = (Double.parseDouble(str1) == Double.parseDouble(str2));
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90579);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90580);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_5_21xv01xv0lusyjvrw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceStart(getClass().getName(),90581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441xw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xv01xv0lusyjvrw.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xv01xv0lusyjvrw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.RyuDoubleTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90581,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441xw5() throws Exception{try{__CLR4_5_21xv01xv0lusyjvrw.R.inc(90581);
        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90582);double[] values = new double[]{
                9.223372036854799E18,
                9.223372036854798E18,
                9.223372036854797E18,
                9.223372036854796E18,
                9.223372036854795E18,
                9.223372036854794E18,
                9.223372036854793E18,
                9.223372036854792E18,
                9.223372036854791E18,
                9.223372036854790E18,

                9.223372036854789E18,
                9.223372036854788E18,
                9.223372036854787E18,
                9.223372036854786E18,
                9.223372036854785E18,
                9.223372036854784E18,
                9.223372036854783E18,
                9.223372036854782E18,
                9.223372036854781E18,
                9.223372036854780E18,

                9.223372036854779E18,
                9.223372036854778E18,
                9.223372036854777E18,
                9.223372036854776E18,
                9.223372036854775E18,
                9.223372036854774E18,
                9.223372036854773E18,
                9.223372036854772E18,
                9.223372036854771E18,
                9.223372036854770E18,

                9.223372036854769E18,
                9.223372036854768E18,
                9.223372036854767E18,
                9.223372036854766E18,
                9.223372036854765E18,
                9.223372036854764E18,
                9.223372036854763E18,
                9.223372036854762E18,
                9.223372036854761E18,
                9.223372036854760E18,

                9.223372036854759E18,
                9.223372036854758E18,
                9.223372036854757E18,
                9.223372036854756E18,
                9.223372036854755E18,
                9.223372036854754E18,
                9.223372036854753E18,
                9.223372036854752E18,
                9.223372036854751E18,
                9.223372036854750E18,

                9.223372036854749E18,
                9.223372036854748E18,
                9.223372036854747E18,
                9.223372036854746E18,
                9.223372036854745E18,
                9.223372036854744E18,
                9.223372036854743E18,
                9.223372036854742E18,
                9.223372036854741E18,
                9.223372036854740E18,

                9.223372036854739E18,
                9.223372036854738E18,
                9.223372036854737E18,
                9.223372036854736E18,
                9.223372036854735E18,
                9.223372036854734E18,
                9.223372036854733E18,
                9.223372036854732E18,
                9.223372036854731E18,
                9.223372036854730E18,

                9.223372036854729E18,
                9.223372036854728E18,
                9.223372036854727E18,
                9.223372036854726E18,
                9.223372036854725E18,
                9.223372036854724E18,
                9.223372036854723E18,
                9.223372036854722E18,
                9.223372036854721E18,
                9.223372036854720E18,

                9.223372036854719E18,
                9.223372036854718E18,
                9.223372036854717E18,
                9.223372036854716E18,
                9.223372036854715E18,
                9.223372036854714E18,
                9.223372036854713E18,
                9.223372036854712E18,
                9.223372036854711E18,
                9.223372036854710E18,

                9.223372036854709E18,
                9.223372036854708E18,
                9.223372036854707E18,
                9.223372036854706E18,
                9.223372036854705E18,
                9.223372036854704E18,
                9.223372036854703E18,
                9.223372036854702E18,
                9.223372036854701E18,
                9.223372036854700E18,
        };

        __CLR4_5_21xv01xv0lusyjvrw.R.inc(90583);for (int i = 0; (((i < values.length)&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90584)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90585)==0&false)); i++) {{
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90586);double value = values[i];
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90587);String str1 = Double.toString(value);
            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90588);String str2 = RyuDouble.toString(value);

            __CLR4_5_21xv01xv0lusyjvrw.R.inc(90589);if ((((!str1.equals(str2))&&(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90590)!=0|true))||(__CLR4_5_21xv01xv0lusyjvrw.R.iget(90591)==0&false))) {{
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90592);boolean cmp = (Double.parseDouble(str1) == Double.parseDouble(str2));
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90593);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_5_21xv01xv0lusyjvrw.R.inc(90594);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_5_21xv01xv0lusyjvrw.R.flushNeeded();}}
}
