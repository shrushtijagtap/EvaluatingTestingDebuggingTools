/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class StreamWriterTest_writeString1 extends TestCase {static class __CLR4_1_101x4h1x4hluszwfp9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,89609,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101x4h1x4hluszwfp9.R.globalSliceStart(getClass().getName(),89585);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21x4h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4h1x4hluszwfp9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x4h1x4hluszwfp9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.stream.StreamWriterTest_writeString1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89585,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21x4h() throws Exception{try{__CLR4_1_101x4h1x4hluszwfp9.R.inc(89585);
        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89586);StringWriter out = new StringWriter();

        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89587);SerializeWriter writer = new SerializeWriter(out, 10);
        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89588);Assert.assertEquals(10, writer.getBufferLength());

        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89589);int blockSize = 21;
        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89590);for (char ch = 'a'; (((ch <= 'z')&&(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89591)!=0|true))||(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89592)==0&false)); ++ch) {{
            __CLR4_1_101x4h1x4hluszwfp9.R.inc(89593);char[] chars = new char[blockSize];
            __CLR4_1_101x4h1x4hluszwfp9.R.inc(89594);for (int i = 0; (((i < blockSize)&&(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89595)!=0|true))||(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89596)==0&false)); ++i) {{
                __CLR4_1_101x4h1x4hluszwfp9.R.inc(89597);chars[i] = ch;
            }
            }__CLR4_1_101x4h1x4hluszwfp9.R.inc(89598);writer.write(new String(chars));
        }
        }__CLR4_1_101x4h1x4hluszwfp9.R.inc(89599);writer.close();

        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89600);String text = out.toString();
        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89601);Assert.assertEquals(26 * blockSize, text.length());

        __CLR4_1_101x4h1x4hluszwfp9.R.inc(89602);for (int i = 0; (((i < 26)&&(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89603)!=0|true))||(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89604)==0&false)); ++i) {{
            __CLR4_1_101x4h1x4hluszwfp9.R.inc(89605);for (int j = 0; (((j < blockSize)&&(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89606)!=0|true))||(__CLR4_1_101x4h1x4hluszwfp9.R.iget(89607)==0&false)); ++j) {{
                __CLR4_1_101x4h1x4hluszwfp9.R.inc(89608);Assert.assertEquals(text.charAt(i * blockSize + j), (char) ('a' + i));
            }
        }}
    }}finally{__CLR4_1_101x4h1x4hluszwfp9.R.flushNeeded();}}
}
