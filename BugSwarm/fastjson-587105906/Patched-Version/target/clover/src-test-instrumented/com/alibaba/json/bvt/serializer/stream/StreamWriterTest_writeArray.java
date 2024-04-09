/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.serializer.SerializeWriter;

public class StreamWriterTest_writeArray extends TestCase {static class __CLR4_5_21wxz1wxzlusvnh5w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21wxz1wxzlusvnh5w.R.globalSliceStart(getClass().getName(),89351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21wxz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wxz1wxzlusvnh5w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wxz1wxzlusvnh5w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.stream.StreamWriterTest_writeArray.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21wxz() throws Exception{try{__CLR4_5_21wxz1wxzlusvnh5w.R.inc(89351);
        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89352);StringWriter out = new StringWriter();

        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89353);SerializeWriter writer = new SerializeWriter(out, 10);
        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89354);Assert.assertEquals(10, writer.getBufferLength());

        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89355);for (char ch = 'a'; (((ch <= 'z')&&(__CLR4_5_21wxz1wxzlusvnh5w.R.iget(89356)!=0|true))||(__CLR4_5_21wxz1wxzlusvnh5w.R.iget(89357)==0&false)); ++ch) {{
            __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89358);char[] chars = new char[] { ch, ch, ch };
            __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89359);writer.write(chars, 0, chars.length);
        }
        }__CLR4_5_21wxz1wxzlusvnh5w.R.inc(89360);writer.close();

        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89361);String text = out.toString();
        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89362);Assert.assertEquals(26 * 3, text.length());

        __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89363);for (int i = 0; (((i < 26)&&(__CLR4_5_21wxz1wxzlusvnh5w.R.iget(89364)!=0|true))||(__CLR4_5_21wxz1wxzlusvnh5w.R.iget(89365)==0&false)); ++i) {{
            __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89366);Assert.assertEquals(text.charAt(i * 3), (char) ('a' + i));
            __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89367);Assert.assertEquals(text.charAt(i * 3 + 1), (char) ('a' + i));
            __CLR4_5_21wxz1wxzlusvnh5w.R.inc(89368);Assert.assertEquals(text.charAt(i * 3 + 2), (char) ('a' + i));
        }
    }}finally{__CLR4_5_21wxz1wxzlusvnh5w.R.flushNeeded();}}
}
