/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PrimitiveTest extends TestCase {static class __CLR4_5_21tgl1tgllusvngh3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84893,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84837);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tgl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84837,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tgl() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84837);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84838);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84839);JSONSerializer.write(out, (byte) 1);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84840);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1tgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84841,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1tgp() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84841);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84842);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84843);JSONSerializer.write(out, (byte) 1);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84844);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tgt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tgt() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84845);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84846);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84847);JSONSerializer.write(out, (short) 1);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84848);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1tgx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1tgx() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84849);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84850);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84851);JSONSerializer.write(out, (short) 1);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84852);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441th1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84853,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441th1() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84853);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84854);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84855);JSONSerializer.write(out, true);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84856);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1th5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84857,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1th5() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84857);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84858);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84859);JSONSerializer.write(out, true);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84860);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1th9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84861,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1th9() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84861);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84862);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84863);JSONSerializer.write(out, false);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84864);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1thd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1thd() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84865);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84866);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84867);JSONSerializer.write(out, false);

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84868);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61thh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84869,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61thh() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84869);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84870);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84871);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84872);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1thl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1thl() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84873);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84874);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84875);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84876);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1thp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84877,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1thp() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84877);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84878);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84879);JSONSerializer.write(out, new boolean[] {});

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84880);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bgtrb11tht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84881,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bgtrb11tht() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84881);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84882);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84883);JSONSerializer.write(out, new boolean[] {});

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84884);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81thx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81thx() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84885);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84886);StringWriter out = new StringWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84887);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84888);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_5_21tgl1tgllusvngh3.R.globalSliceStart(getClass().getName(),84889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dlog641ti1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tgl1tgllusvngh3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tgl1tgllusvngh3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84889,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dlog641ti1() throws Exception{try{__CLR4_5_21tgl1tgllusvngh3.R.inc(84889);
        __CLR4_5_21tgl1tgllusvngh3.R.inc(84890);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84891);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_5_21tgl1tgllusvngh3.R.inc(84892);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_5_21tgl1tgllusvngh3.R.flushNeeded();}}
}
