/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class IntegerArrayEncodeTest extends TestCase {static class __CLR4_5_21re11re1lusyjuvv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21re11re1lusyjuvv.R.globalSliceStart(getClass().getName(),82153);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1re1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21re11re1lusyjuvv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21re11re1lusyjuvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntegerArrayEncodeTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82153,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1re1() throws Exception{try{__CLR4_5_21re11re1lusyjuvv.R.inc(82153);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82154);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21re11re1lusyjuvv.R.inc(82155);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82156);serializer.write(new Integer[] { 0, 1 });

        __CLR4_5_21re11re1lusyjuvv.R.inc(82157);Assert.assertEquals("[0,1]", out.toString());
    }finally{__CLR4_5_21re11re1lusyjuvv.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21re11re1lusyjuvv.R.globalSliceStart(getClass().getName(),82158);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1re6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21re11re1lusyjuvv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21re11re1lusyjuvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntegerArrayEncodeTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82158,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1re6() throws Exception{try{__CLR4_5_21re11re1lusyjuvv.R.inc(82158);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82159);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21re11re1lusyjuvv.R.inc(82160);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82161);serializer.write(new Integer[] {});

        __CLR4_5_21re11re1lusyjuvv.R.inc(82162);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21re11re1lusyjuvv.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21re11re1lusyjuvv.R.globalSliceStart(getClass().getName(),82163);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1reb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21re11re1lusyjuvv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21re11re1lusyjuvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntegerArrayEncodeTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82163,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1reb() throws Exception{try{__CLR4_5_21re11re1lusyjuvv.R.inc(82163);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82164);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21re11re1lusyjuvv.R.inc(82165);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82166);serializer.write(new Integer[] { -2147483648 });

        __CLR4_5_21re11re1lusyjuvv.R.inc(82167);Assert.assertEquals("[-2147483648]", out.toString());
    }finally{__CLR4_5_21re11re1lusyjuvv.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21re11re1lusyjuvv.R.globalSliceStart(getClass().getName(),82168);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1reg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21re11re1lusyjuvv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21re11re1lusyjuvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntegerArrayEncodeTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82168,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1reg() throws Exception{try{__CLR4_5_21re11re1lusyjuvv.R.inc(82168);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82169);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21re11re1lusyjuvv.R.inc(82170);JSONSerializer serializer = new JSONSerializer(out);

        __CLR4_5_21re11re1lusyjuvv.R.inc(82171);StringBuilder sb = new StringBuilder();
        __CLR4_5_21re11re1lusyjuvv.R.inc(82172);sb.append('[');
        __CLR4_5_21re11re1lusyjuvv.R.inc(82173);int len = 1000;
        __CLR4_5_21re11re1lusyjuvv.R.inc(82174);Integer[] array = new Integer[len];
        __CLR4_5_21re11re1lusyjuvv.R.inc(82175);for (int i = 0; (((i < array.length)&&(__CLR4_5_21re11re1lusyjuvv.R.iget(82176)!=0|true))||(__CLR4_5_21re11re1lusyjuvv.R.iget(82177)==0&false)); ++i) {{
            __CLR4_5_21re11re1lusyjuvv.R.inc(82178);array[i] = i;
            __CLR4_5_21re11re1lusyjuvv.R.inc(82179);if ((((i != 0)&&(__CLR4_5_21re11re1lusyjuvv.R.iget(82180)!=0|true))||(__CLR4_5_21re11re1lusyjuvv.R.iget(82181)==0&false))) {{
                __CLR4_5_21re11re1lusyjuvv.R.inc(82182);sb.append(',');
            }
            }__CLR4_5_21re11re1lusyjuvv.R.inc(82183);sb.append(i);
        }
        }__CLR4_5_21re11re1lusyjuvv.R.inc(82184);sb.append(']');

        __CLR4_5_21re11re1lusyjuvv.R.inc(82185);serializer.write(array);

        __CLR4_5_21re11re1lusyjuvv.R.inc(82186);Assert.assertEquals(sb.toString(), out.toString());
    }finally{__CLR4_5_21re11re1lusyjuvv.R.flushNeeded();}}

    public void test_4_s() throws Exception {__CLR4_5_21re11re1lusyjuvv.R.globalSliceStart(getClass().getName(),82187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29bz2fy1rez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21re11re1lusyjuvv.R.rethrow($CLV_t2$);}finally{__CLR4_5_21re11re1lusyjuvv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntegerArrayEncodeTest.test_4_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29bz2fy1rez() throws Exception{try{__CLR4_5_21re11re1lusyjuvv.R.inc(82187);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82188);SerializeWriter out = new SerializeWriter(1);

        __CLR4_5_21re11re1lusyjuvv.R.inc(82189);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21re11re1lusyjuvv.R.inc(82190);serializer.write(new Integer[] { 1, null, null });

        __CLR4_5_21re11re1lusyjuvv.R.inc(82191);Assert.assertEquals("[1,null,null]", out.toString());
    }finally{__CLR4_5_21re11re1lusyjuvv.R.flushNeeded();}}
}
