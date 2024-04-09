/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;

import java.util.Random;

public class TypeUtils_parseDouble_Test extends TestCase {static class __CLR4_5_21k4a1k4alusvndsv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,72769,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72730);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21k4a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72730,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21k4a() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72730);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72731);Random r = new Random();

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72732);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21k4a1k4alusvndsv.R.iget(72733)!=0|true))||(__CLR4_5_21k4a1k4alusvndsv.R.iget(72734)==0&false)); ++i) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72735);String str = Float.toString(r.nextFloat());
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72736);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}

    public void test_0_d() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lhk94f1k4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_0_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lhk94f1k4h() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72737);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72738);Random r = new Random();

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72739);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21k4a1k4alusvndsv.R.iget(72740)!=0|true))||(__CLR4_5_21k4a1k4alusvndsv.R.iget(72741)==0&false)); ++i) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72742);String str = Double.toString(r.nextDouble());
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72743);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}


    public void test_1() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1k4o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1k4o() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72744);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72745);Random r = new Random();

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72746);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21k4a1k4alusvndsv.R.iget(72747)!=0|true))||(__CLR4_5_21k4a1k4alusvndsv.R.iget(72748)==0&false)); ++i) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72749);String str = Integer.toString(r.nextInt());
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72750);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441k4v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441k4v() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72751);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72752);Random r = new Random();

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72753);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21k4a1k4alusvndsv.R.iget(72754)!=0|true))||(__CLR4_5_21k4a1k4alusvndsv.R.iget(72755)==0&false)); ++i) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72756);String str = Integer.toString(r.nextInt(1000000000));
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72757);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1k52();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72758,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1k52() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72758);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72759);Random r = new Random();

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72760);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21k4a1k4alusvndsv.R.iget(72761)!=0|true))||(__CLR4_5_21k4a1k4alusvndsv.R.iget(72762)==0&false)); ++i) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72763);String str = Long.toString(r.nextLong());
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72764);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21k4a1k4alusvndsv.R.globalSliceStart(getClass().getName(),72765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61k59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21k4a1k4alusvndsv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21k4a1k4alusvndsv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseDouble_Test.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72765,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61k59() throws Exception{try{__CLR4_5_21k4a1k4alusvndsv.R.inc(72765);
        __CLR4_5_21k4a1k4alusvndsv.R.inc(72766);String[] array = new String[] {
                "0.34856254",
                "1",
                "12",
                "123",
                "1234",
                "12345",
                "123456",
                "1234567",
                "12345678",
                "123456789",
                "1234567890",
                ".1"
                ,"1.1"
                ,"12.1"
                , "123.1"
                , "1234.1"
                , "12345.1"
                , "123456.1"
                , "1234567.1"
                , "12345678.1"
                , "0.1"
                , "0.12"
                , "0.123"
                , "0.1234"
                , "0.12345"
                , "0.123456"
                , "0.1234567"
                , "0.12345678"
                , "0.123456789"
                , "0.1234567891"
                , "0.12345678901"
                , "0.123456789012"
        };

        __CLR4_5_21k4a1k4alusvndsv.R.inc(72767);for (String str : array) {{
            __CLR4_5_21k4a1k4alusvndsv.R.inc(72768);assertEquals(Double.parseDouble(str), TypeUtils.parseDouble(str));
        }
    }}finally{__CLR4_5_21k4a1k4alusvndsv.R.flushNeeded();}}
}
