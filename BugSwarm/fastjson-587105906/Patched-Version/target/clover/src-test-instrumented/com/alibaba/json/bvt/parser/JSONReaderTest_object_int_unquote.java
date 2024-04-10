/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONReaderTest_object_int_unquote extends TestCase {static class __CLR4_5_21h2x1h2xlusyjtor{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,68819,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String text = "{f0:0,f1:1,f2:2,f3:3,f4:4, " + //
                  "f5:5,f6:6,f7:7,f8:8,f9:9}";

    public void test_read() throws Exception {__CLR4_5_21h2x1h2xlusyjtor.R.globalSliceStart(getClass().getName(),68793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8nabu1h2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2x1h2xlusyjtor.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2x1h2xlusyjtor.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_int_unquote.test_read",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8nabu1h2x() throws Exception{try{__CLR4_5_21h2x1h2xlusyjtor.R.inc(68793);

        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68794);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68795);reader.startObject();

        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68796);int count = 0;
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68797);while ((((reader.hasNext())&&(__CLR4_5_21h2x1h2xlusyjtor.R.iget(68798)!=0|true))||(__CLR4_5_21h2x1h2xlusyjtor.R.iget(68799)==0&false))) {{
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68800);String key = (String) reader.readObject();
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68801);Integer value = reader.readInteger();
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68802);count++;
        }
        }__CLR4_5_21h2x1h2xlusyjtor.R.inc(68803);Assert.assertEquals(10, count);

        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68804);reader.endObject();
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68805);reader.close();
    }finally{__CLR4_5_21h2x1h2xlusyjtor.R.flushNeeded();}}

    public void test_read_1() throws Exception {__CLR4_5_21h2x1h2xlusyjtor.R.globalSliceStart(getClass().getName(),68806);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh0ak1h3a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h2x1h2xlusyjtor.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h2x1h2xlusyjtor.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_int_unquote.test_read_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68806,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh0ak1h3a() throws Exception{try{__CLR4_5_21h2x1h2xlusyjtor.R.inc(68806);
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68807);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68808);reader.startObject();

        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68809);int count = 0;
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68810);while ((((reader.hasNext())&&(__CLR4_5_21h2x1h2xlusyjtor.R.iget(68811)!=0|true))||(__CLR4_5_21h2x1h2xlusyjtor.R.iget(68812)==0&false))) {{
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68813);String key = (String) reader.readObject();
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68814);Integer value = reader.readInteger();
            __CLR4_5_21h2x1h2xlusyjtor.R.inc(68815);count++;
        }
        }__CLR4_5_21h2x1h2xlusyjtor.R.inc(68816);Assert.assertEquals(10, count);

        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68817);reader.endObject();
        __CLR4_5_21h2x1h2xlusyjtor.R.inc(68818);reader.close();
    }finally{__CLR4_5_21h2x1h2xlusyjtor.R.flushNeeded();}}
}
