/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class IntArrayEncodeTest extends TestCase {static class __CLR4_5_21rbo1rbolusyjuvm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceStart(getClass().getName(),82068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1rbo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rbo1rbolusyjuvm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntArrayEncodeTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1rbo() throws Exception{try{__CLR4_5_21rbo1rbolusyjuvm.R.inc(82068);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82069);SerializeWriter out = new SerializeWriter(1);

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82070);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82071);serializer.write(new int[] { 0, 1 });

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82072);Assert.assertEquals("[0,1]", out.toString());
    }finally{__CLR4_5_21rbo1rbolusyjuvm.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceStart(getClass().getName(),82073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1rbt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rbo1rbolusyjuvm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntArrayEncodeTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82073,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1rbt() throws Exception{try{__CLR4_5_21rbo1rbolusyjuvm.R.inc(82073);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82074);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82075);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82076);serializer.write(new int[] {});

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82077);Assert.assertEquals("[]", out.toString());
    }finally{__CLR4_5_21rbo1rbolusyjuvm.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceStart(getClass().getName(),82078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1rby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rbo1rbolusyjuvm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntArrayEncodeTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1rby() throws Exception{try{__CLR4_5_21rbo1rbolusyjuvm.R.inc(82078);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82079);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82080);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82081);serializer.write(new int[] { -2147483648 });

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82082);Assert.assertEquals("[-2147483648]", out.toString());
    }finally{__CLR4_5_21rbo1rbolusyjuvm.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceStart(getClass().getName(),82083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1rc3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rbo1rbolusyjuvm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rbo1rbolusyjuvm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.IntArrayEncodeTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1rc3() throws Exception{try{__CLR4_5_21rbo1rbolusyjuvm.R.inc(82083);
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82084);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82085);JSONSerializer serializer = new JSONSerializer(out);

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82086);StringBuilder sb = new StringBuilder();
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82087);sb.append('[');
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82088);int len = 1000;
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82089);int[] array = new int[len];
        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82090);for (int i = 0; (((i < array.length)&&(__CLR4_5_21rbo1rbolusyjuvm.R.iget(82091)!=0|true))||(__CLR4_5_21rbo1rbolusyjuvm.R.iget(82092)==0&false)); ++i) {{
            __CLR4_5_21rbo1rbolusyjuvm.R.inc(82093);array[i] = i;
            __CLR4_5_21rbo1rbolusyjuvm.R.inc(82094);if ((((i != 0)&&(__CLR4_5_21rbo1rbolusyjuvm.R.iget(82095)!=0|true))||(__CLR4_5_21rbo1rbolusyjuvm.R.iget(82096)==0&false))) {{
                __CLR4_5_21rbo1rbolusyjuvm.R.inc(82097);sb.append(',');
            }
            }__CLR4_5_21rbo1rbolusyjuvm.R.inc(82098);sb.append(i);
        }
        }__CLR4_5_21rbo1rbolusyjuvm.R.inc(82099);sb.append(']');

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82100);serializer.write(array);

        __CLR4_5_21rbo1rbolusyjuvm.R.inc(82101);Assert.assertEquals(sb.toString(), out.toString());
    }finally{__CLR4_5_21rbo1rbolusyjuvm.R.flushNeeded();}}
}
