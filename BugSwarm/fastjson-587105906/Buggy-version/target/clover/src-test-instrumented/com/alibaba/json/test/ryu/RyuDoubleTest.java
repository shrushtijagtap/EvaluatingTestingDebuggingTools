/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.ryu;

import com.alibaba.fastjson.util.RyuDouble;
import junit.framework.TestCase;

import java.util.Random;

public class RyuDoubleTest extends TestCase {static class __CLR4_1_1028lv28lvluszwiw9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,104497,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_ryu() throws Exception {__CLR4_1_1028lv28lvluszwiw9.R.globalSliceStart(getClass().getName(),104467);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n3pbki28lv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028lv28lvluszwiw9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028lv28lvluszwiw9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.ryu.RyuDoubleTest.test_for_ryu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),104467,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n3pbki28lv() throws Exception{try{__CLR4_1_1028lv28lvluszwiw9.R.inc(104467);
        __CLR4_1_1028lv28lvluszwiw9.R.inc(104468);Random random = new Random();

        __CLR4_1_1028lv28lvluszwiw9.R.inc(104469);long start = System.currentTimeMillis();
        __CLR4_1_1028lv28lvluszwiw9.R.inc(104470);for (int i = 0; (((i < 1000 * 1000 * 100)&&(__CLR4_1_1028lv28lvluszwiw9.R.iget(104471)!=0|true))||(__CLR4_1_1028lv28lvluszwiw9.R.iget(104472)==0&false)); ++i) {{
            __CLR4_1_1028lv28lvluszwiw9.R.inc(104473);double value = random.nextDouble();

            __CLR4_1_1028lv28lvluszwiw9.R.inc(104474);String str1 = Double.toString(value);
            __CLR4_1_1028lv28lvluszwiw9.R.inc(104475);String str2 = RyuDouble.toString(value);

            __CLR4_1_1028lv28lvluszwiw9.R.inc(104476);if ((((!str1.equals(str2))&&(__CLR4_1_1028lv28lvluszwiw9.R.iget(104477)!=0|true))||(__CLR4_1_1028lv28lvluszwiw9.R.iget(104478)==0&false))) {{
                __CLR4_1_1028lv28lvluszwiw9.R.inc(104479);System.out.println(str1 + " -> " + str2);
                __CLR4_1_1028lv28lvluszwiw9.R.inc(104480);assertTrue(Double.parseDouble(str1) == Double.parseDouble(str2));
            }
        }}
        }__CLR4_1_1028lv28lvluszwiw9.R.inc(104481);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1028lv28lvluszwiw9.R.inc(104482);System.out.println("millis : " + millis);
    }finally{__CLR4_1_1028lv28lvluszwiw9.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_1028lv28lvluszwiw9.R.globalSliceStart(getClass().getName(),104483);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp228mb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028lv28lvluszwiw9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028lv28lvluszwiw9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.ryu.RyuDoubleTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),104483,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp228mb() throws Exception{try{__CLR4_1_1028lv28lvluszwiw9.R.inc(104483);
        __CLR4_1_1028lv28lvluszwiw9.R.inc(104484);double[] values = new double[] {
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
        };

        __CLR4_1_1028lv28lvluszwiw9.R.inc(104485);for (int i = 0; (((i < values.length)&&(__CLR4_1_1028lv28lvluszwiw9.R.iget(104486)!=0|true))||(__CLR4_1_1028lv28lvluszwiw9.R.iget(104487)==0&false)); i++) {{
            __CLR4_1_1028lv28lvluszwiw9.R.inc(104488);double value = values[i];
            __CLR4_1_1028lv28lvluszwiw9.R.inc(104489);String str1 = Double.toString(value);
            __CLR4_1_1028lv28lvluszwiw9.R.inc(104490);String str2 = RyuDouble.toString(value);

            __CLR4_1_1028lv28lvluszwiw9.R.inc(104491);if ((((!str1.equals(str2))&&(__CLR4_1_1028lv28lvluszwiw9.R.iget(104492)!=0|true))||(__CLR4_1_1028lv28lvluszwiw9.R.iget(104493)==0&false))) {{
                __CLR4_1_1028lv28lvluszwiw9.R.inc(104494);boolean cmp = (Double.parseDouble(str1) == Double.parseDouble(str2));
                __CLR4_1_1028lv28lvluszwiw9.R.inc(104495);System.out.println(str1 + " -> " + str2 + " : " + cmp);
                __CLR4_1_1028lv28lvluszwiw9.R.inc(104496);assertTrue(cmp);
            }
        }}
    }}finally{__CLR4_1_1028lv28lvluszwiw9.R.flushNeeded();}}
}
