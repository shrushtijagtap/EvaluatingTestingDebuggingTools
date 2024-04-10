/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PrimitiveTest extends TestCase {static class __CLR4_5_21sid1sidlusyjv06{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,83661,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21sid();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83605,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21sid() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83605);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83606);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83607);JSONSerializer.write(out, (byte) 1);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83608);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1sih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83609,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1sih() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83609);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83610);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83611);JSONSerializer.write(out, (byte) 1);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83612);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83613);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1sil();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83613,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1sil() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83613);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83614);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83615);JSONSerializer.write(out, (short) 1);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83616);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1sip();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1sip() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83617);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83618);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83619);JSONSerializer.write(out, (short) 1);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83620);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83621);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441sit();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83621,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441sit() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83621);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83622);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83623);JSONSerializer.write(out, true);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83624);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1six();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83625,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1six() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83625);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83626);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83627);JSONSerializer.write(out, true);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83628);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83629);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1sj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83629,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1sj1() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83629);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83630);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83631);JSONSerializer.write(out, false);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83632);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1sj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1sj5() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83633);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83634);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83635);JSONSerializer.write(out, false);

        __CLR4_5_21sid1sidlusyjv06.R.inc(83636);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61sj9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61sj9() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83637);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83638);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83639);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_5_21sid1sidlusyjv06.R.inc(83640);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1sjd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83641,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1sjd() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83641);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83642);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83643);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_5_21sid1sidlusyjv06.R.inc(83644);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1sjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83645,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1sjh() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83645);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83646);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83647);JSONSerializer.write(out, new boolean[] {});

        __CLR4_5_21sid1sidlusyjv06.R.inc(83648);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11sjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11sjl() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83649);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83650);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83651);JSONSerializer.write(out, new boolean[] {});

        __CLR4_5_21sid1sidlusyjv06.R.inc(83652);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81sjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83653,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81sjp() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83653);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83654);StringWriter out = new StringWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83655);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_5_21sid1sidlusyjv06.R.inc(83656);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21sid1sidlusyjv06.R.globalSliceStart(getClass().getName(),83657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641sjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21sid1sidlusyjv06.R.rethrow($CLV_t2$);}finally{__CLR4_5_21sid1sidlusyjv06.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),83657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641sjt() throws Exception{try{__CLR4_5_21sid1sidlusyjv06.R.inc(83657);
        __CLR4_5_21sid1sidlusyjv06.R.inc(83658);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21sid1sidlusyjv06.R.inc(83659);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_5_21sid1sidlusyjv06.R.inc(83660);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_5_21sid1sidlusyjv06.R.flushNeeded();}}
}
