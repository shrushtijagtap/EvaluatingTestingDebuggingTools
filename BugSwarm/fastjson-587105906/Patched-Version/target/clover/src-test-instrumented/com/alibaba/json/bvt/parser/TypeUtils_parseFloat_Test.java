/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import com.alibaba.fastjson.util.TypeUtils;
import junit.framework.TestCase;

import java.util.Random;

public class TypeUtils_parseFloat_Test extends TestCase {static class __CLR4_5_21j751j75lusyjtvo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71569,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21j751j75lusyjtvo.R.globalSliceStart(getClass().getName(),71537);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21j75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j751j75lusyjtvo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j751j75lusyjtvo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseFloat_Test.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71537,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21j75() throws Exception{try{__CLR4_5_21j751j75lusyjtvo.R.inc(71537);
        __CLR4_5_21j751j75lusyjtvo.R.inc(71538);Random r = new Random();

        __CLR4_5_21j751j75lusyjtvo.R.inc(71539);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21j751j75lusyjtvo.R.iget(71540)!=0|true))||(__CLR4_5_21j751j75lusyjtvo.R.iget(71541)==0&false)); ++i) {{
            __CLR4_5_21j751j75lusyjtvo.R.inc(71542);String str = Float.toString(r.nextFloat());
            __CLR4_5_21j751j75lusyjtvo.R.inc(71543);assertEquals(Float.parseFloat(str), TypeUtils.parseFloat(str));
        }
    }}finally{__CLR4_5_21j751j75lusyjtvo.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21j751j75lusyjtvo.R.globalSliceStart(getClass().getName(),71544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1j7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j751j75lusyjtvo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j751j75lusyjtvo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseFloat_Test.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71544,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1j7c() throws Exception{try{__CLR4_5_21j751j75lusyjtvo.R.inc(71544);
        __CLR4_5_21j751j75lusyjtvo.R.inc(71545);Random r = new Random();

        __CLR4_5_21j751j75lusyjtvo.R.inc(71546);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21j751j75lusyjtvo.R.iget(71547)!=0|true))||(__CLR4_5_21j751j75lusyjtvo.R.iget(71548)==0&false)); ++i) {{
            __CLR4_5_21j751j75lusyjtvo.R.inc(71549);String str = Integer.toString(r.nextInt());
            __CLR4_5_21j751j75lusyjtvo.R.inc(71550);assertEquals(Float.parseFloat(str), TypeUtils.parseFloat(str));
        }
    }}finally{__CLR4_5_21j751j75lusyjtvo.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21j751j75lusyjtvo.R.globalSliceStart(getClass().getName(),71551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441j7j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j751j75lusyjtvo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j751j75lusyjtvo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseFloat_Test.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71551,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441j7j() throws Exception{try{__CLR4_5_21j751j75lusyjtvo.R.inc(71551);
        __CLR4_5_21j751j75lusyjtvo.R.inc(71552);Random r = new Random();

        __CLR4_5_21j751j75lusyjtvo.R.inc(71553);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21j751j75lusyjtvo.R.iget(71554)!=0|true))||(__CLR4_5_21j751j75lusyjtvo.R.iget(71555)==0&false)); ++i) {{
            __CLR4_5_21j751j75lusyjtvo.R.inc(71556);String str = Integer.toString(r.nextInt(1000000000));
            __CLR4_5_21j751j75lusyjtvo.R.inc(71557);assertEquals(Float.parseFloat(str), TypeUtils.parseFloat(str));
        }
    }}finally{__CLR4_5_21j751j75lusyjtvo.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21j751j75lusyjtvo.R.globalSliceStart(getClass().getName(),71558);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1j7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j751j75lusyjtvo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j751j75lusyjtvo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseFloat_Test.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71558,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1j7q() throws Exception{try{__CLR4_5_21j751j75lusyjtvo.R.inc(71558);
        __CLR4_5_21j751j75lusyjtvo.R.inc(71559);Random r = new Random();

        __CLR4_5_21j751j75lusyjtvo.R.inc(71560);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_5_21j751j75lusyjtvo.R.iget(71561)!=0|true))||(__CLR4_5_21j751j75lusyjtvo.R.iget(71562)==0&false)); ++i) {{
            __CLR4_5_21j751j75lusyjtvo.R.inc(71563);String str = Long.toString(r.nextLong());
            __CLR4_5_21j751j75lusyjtvo.R.inc(71564);assertEquals(Float.parseFloat(str), TypeUtils.parseFloat(str));
        }
    }}finally{__CLR4_5_21j751j75lusyjtvo.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21j751j75lusyjtvo.R.globalSliceStart(getClass().getName(),71565);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61j7x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j751j75lusyjtvo.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j751j75lusyjtvo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtils_parseFloat_Test.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71565,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61j7x() throws Exception{try{__CLR4_5_21j751j75lusyjtvo.R.inc(71565);
        __CLR4_5_21j751j75lusyjtvo.R.inc(71566);String[] array = new String[] {
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

        __CLR4_5_21j751j75lusyjtvo.R.inc(71567);for (String str : array) {{
            __CLR4_5_21j751j75lusyjtvo.R.inc(71568);assertEquals(Float.parseFloat(str), TypeUtils.parseFloat(str));
        }
    }}finally{__CLR4_5_21j751j75lusyjtvo.R.flushNeeded();}}
}
