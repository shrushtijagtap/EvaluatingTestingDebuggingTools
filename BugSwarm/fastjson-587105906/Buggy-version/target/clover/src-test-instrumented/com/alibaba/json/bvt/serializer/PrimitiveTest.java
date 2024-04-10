/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class PrimitiveTest extends TestCase {static class __CLR4_1_101tgw1tgwluszwf53{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84904,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tgw() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84848);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84849);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84850);JSONSerializer.write(out, (byte) 1);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84851);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_0_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1th0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1th0() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84852);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84853);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84854);JSONSerializer.write(out, (byte) 1);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84855);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1th4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84856,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1th4() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84856);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84857);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84858);JSONSerializer.write(out, (short) 1);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84859);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1th8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1th8() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84860);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84861);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84862);JSONSerializer.write(out, (short) 1);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84863);Assert.assertEquals("1", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441thc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84864,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441thc() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84864);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84865);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84866);JSONSerializer.write(out, true);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84867);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84868);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1thg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84868,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1thg() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84868);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84869);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84870);JSONSerializer.write(out, true);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84871);Assert.assertEquals("true", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84872);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1thk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84872,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1thk() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84872);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84873);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84874);JSONSerializer.write(out, false);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84875);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84876);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1tho();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84876,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1tho() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84876);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84877);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84878);JSONSerializer.write(out, false);

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84879);Assert.assertEquals("false", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61ths();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84880,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61ths() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84880);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84881);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84882);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84883);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109bz2fy1thw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_4_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84884,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109bz2fy1thw() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84884);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84885);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84886);JSONSerializer.write(out, new boolean[] { true, false });

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84887);Assert.assertEquals("[true,false]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1ti0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84888,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1ti0() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84888);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84889);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84890);JSONSerializer.write(out, new boolean[] {});

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84891);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_5_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84892);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bgtrb11ti4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_5_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84892,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bgtrb11ti4() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84892);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84893);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84894);JSONSerializer.write(out, new boolean[] {});

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84895);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81ti8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84896,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81ti8() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84896);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84897);StringWriter out = new StringWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84898);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84899);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}

    public void test_6_s() throws Exception {__CLR4_1_101tgw1tgwluszwf53.R.globalSliceStart(getClass().getName(),84900);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dlog641tic();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tgw1tgwluszwf53.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tgw1tgwluszwf53.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.PrimitiveTest.test_6_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84900,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dlog641tic() throws Exception{try{__CLR4_1_101tgw1tgwluszwf53.R.inc(84900);
        __CLR4_1_101tgw1tgwluszwf53.R.inc(84901);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84902);JSONSerializer.write(out, new boolean[] { true, false, true });

        __CLR4_1_101tgw1tgwluszwf53.R.inc(84903);Assert.assertEquals("[true,false,true]", out.toString());
    }finally{__CLR4_1_101tgw1tgwluszwf53.R.flushNeeded();}}
}
