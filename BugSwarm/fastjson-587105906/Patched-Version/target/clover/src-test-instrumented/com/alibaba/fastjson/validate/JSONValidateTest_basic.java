/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.validate;

import com.alibaba.fastjson.JSONValidator;
import junit.framework.TestCase;

public class JSONValidateTest_basic extends TestCase
{static class __CLR4_5_2waxwaxlusvn25v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,41902,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bastic_true() throws Exception {__CLR4_5_2waxwaxlusvn25v.R.globalSliceStart(getClass().getName(),41865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2drkdzrwax();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2waxwaxlusvn25v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2waxwaxlusvn25v.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_basic.test_for_bastic_true",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2drkdzrwax() throws Exception{try{__CLR4_5_2waxwaxlusvn25v.R.inc(41865);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41866);assertTrue(JSONValidator.from("{\"id\":true}").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41867);assertTrue(JSONValidator.from("[true]").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41868);assertTrue(JSONValidator.from("true").validate());
    }finally{__CLR4_5_2waxwaxlusvn25v.R.flushNeeded();}}

    public void test_for_bastic_false() throws Exception {__CLR4_5_2waxwaxlusvn25v.R.globalSliceStart(getClass().getName(),41869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2impkegwb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2waxwaxlusvn25v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2waxwaxlusvn25v.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_basic.test_for_bastic_false",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2impkegwb1() throws Exception{try{__CLR4_5_2waxwaxlusvn25v.R.inc(41869);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41870);assertTrue(JSONValidator.from("{\"id\":false}").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41871);assertTrue(JSONValidator.from("[false]").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41872);assertTrue(JSONValidator.from("false").validate());
    }finally{__CLR4_5_2waxwaxlusvn25v.R.flushNeeded();}}

    public void test_for_bastic_null() throws Exception {__CLR4_5_2waxwaxlusvn25v.R.globalSliceStart(getClass().getName(),41873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hnmapcwb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2waxwaxlusvn25v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2waxwaxlusvn25v.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_basic.test_for_bastic_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hnmapcwb5() throws Exception{try{__CLR4_5_2waxwaxlusvn25v.R.inc(41873);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41874);assertTrue(JSONValidator.from("{\"id\":null}").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41875);assertTrue(JSONValidator.from("[null]").validate());
        __CLR4_5_2waxwaxlusvn25v.R.inc(41876);assertTrue(JSONValidator.from("null").validate());


    }finally{__CLR4_5_2waxwaxlusvn25v.R.flushNeeded();}}

    public void test_long2ip() {__CLR4_5_2waxwaxlusvn25v.R.globalSliceStart(getClass().getName(),41877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28587snwb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2waxwaxlusvn25v.R.rethrow($CLV_t2$);}finally{__CLR4_5_2waxwaxlusvn25v.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_basic.test_long2ip",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28587snwb9(){try{__CLR4_5_2waxwaxlusvn25v.R.inc(41877);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41878);long a = 1677734491111L;
        __CLR4_5_2waxwaxlusvn25v.R.inc(41879);long b = 2697245671L;
        __CLR4_5_2waxwaxlusvn25v.R.inc(41880);long longVal = a;

        __CLR4_5_2waxwaxlusvn25v.R.inc(41881);int intVal = -1597721625;
        __CLR4_5_2waxwaxlusvn25v.R.inc(41882);long unsignedIntVal = intVal & 0xFFFFFFFFL;
        __CLR4_5_2waxwaxlusvn25v.R.inc(41883);boolean negative = (longVal & 0xFFFFFFFF00000000L) != 0;



        __CLR4_5_2waxwaxlusvn25v.R.inc(41884);System.out.println(intVal & 0xFFFFFFFFL);

        __CLR4_5_2waxwaxlusvn25v.R.inc(41885);System.out.println((int) b);

        __CLR4_5_2waxwaxlusvn25v.R.inc(41886);byte[] bytes0 = new byte[8];
        __CLR4_5_2waxwaxlusvn25v.R.inc(41887);byte[] bytes1 = new byte[8];
        __CLR4_5_2waxwaxlusvn25v.R.inc(41888);byte[] bytes2 = new byte[8];

        __CLR4_5_2waxwaxlusvn25v.R.inc(41889);putLong(bytes0, 0, a);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41890);putLong(bytes1, 0, b);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41891);putLong(bytes2, 0, 0xFFFFFFFF00000000L);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41892);System.out.println("");

    }finally{__CLR4_5_2waxwaxlusvn25v.R.flushNeeded();}}

    static void putLong(byte[] b, int off, long val) {try{__CLR4_5_2waxwaxlusvn25v.R.inc(41893);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41894);b[off + 7] = (byte) (val       );
        __CLR4_5_2waxwaxlusvn25v.R.inc(41895);b[off + 6] = (byte) (val >>>  8);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41896);b[off + 5] = (byte) (val >>> 16);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41897);b[off + 4] = (byte) (val >>> 24);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41898);b[off + 3] = (byte) (val >>> 32);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41899);b[off + 2] = (byte) (val >>> 40);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41900);b[off + 1] = (byte) (val >>> 48);
        __CLR4_5_2waxwaxlusvn25v.R.inc(41901);b[off    ] = (byte) (val >>> 56);
    }finally{__CLR4_5_2waxwaxlusvn25v.R.flushNeeded();}}
}
