/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PrimitiveTest extends TestCase {static class __CLR4_1_101sio1siolusqkjzw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,83672,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83616);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21sio();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83616,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21sio() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83616);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83617);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83618);JSONSerializer.write(out, (byte) 1);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83619);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1sis();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83620,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1sis() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83620);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83621);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83622);JSONSerializer.write(out, (byte) 1);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83623);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1siw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1siw() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83624);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83625);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83626);JSONSerializer.write(out, (short) 1);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83627);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1sj0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1sj0() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83628);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83629);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83630);JSONSerializer.write(out, (short) 1);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83631);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441sj4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441sj4() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83632);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83633);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83634);JSONSerializer.write(out, true);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83635);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83636);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1sj8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83636,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1sj8() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83636);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83637);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83638);JSONSerializer.write(out, true);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83639);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1sjc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83640,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1sjc() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83640);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83641);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83642);JSONSerializer.write(out, false);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83643);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83644);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1sjg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83644,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1sjg() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83644);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83645);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83646);JSONSerializer.write(out, false);

        __CLR4_1_101sio1siolusqkjzw.R.inc(83647);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61sjk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83648,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61sjk() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83648);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83649);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83650);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_1_101sio1siolusqkjzw.R.inc(83651);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1sjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1sjo() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83652);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83653);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83654);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_1_101sio1siolusqkjzw.R.inc(83655);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83656);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1sjs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83656,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1sjs() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83656);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83657);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83658);JSONSerializer.write(out, new boolean[] {});

        __CLR4_1_101sio1siolusqkjzw.R.inc(83659);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11sjw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83660,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11sjw() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83660);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83661);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83662);JSONSerializer.write(out, new boolean[] {});

        __CLR4_1_101sio1siolusqkjzw.R.inc(83663);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81sk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81sk0() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83664);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83665);StringWriter out = new StringWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83666);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_1_101sio1siolusqkjzw.R.inc(83667);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101sio1siolusqkjzw.R.globalSliceStart(getClass().getName(),83668);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641sk4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101sio1siolusqkjzw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101sio1siolusqkjzw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),83668,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641sk4() throws Exception{try{__CLR4_1_101sio1siolusqkjzw.R.inc(83668);
        __CLR4_1_101sio1siolusqkjzw.R.inc(83669);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101sio1siolusqkjzw.R.inc(83670);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_1_101sio1siolusqkjzw.R.inc(83671);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_1_101sio1siolusqkjzw.R.flushNeeded();}}
}
