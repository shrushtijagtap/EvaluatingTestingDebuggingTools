/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONReaderTest_array_object extends TestCase {static class __CLR4_5_21hyh1hyhlusvnczp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,69972,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String text = "[{},{},{},{},{} ,{},{},{},{},{}]";

    public void test_read() throws Exception {__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceStart(getClass().getName(),69929);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8nabu1hyh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hyh1hyhlusvnczp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69929,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8nabu1hyh() throws Exception{try{__CLR4_5_21hyh1hyhlusvnczp.R.inc(69929);

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69930);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69931);reader.startArray();

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69932);int count = 0;
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69933);while ((((reader.hasNext())&&(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69934)!=0|true))||(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69935)==0&false))) {{
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69936);reader.readObject();
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69937);count++;
        }
        }__CLR4_5_21hyh1hyhlusvnczp.R.inc(69938);Assert.assertEquals(10, count);

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69939);reader.endArray();
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69940);reader.close();
    }finally{__CLR4_5_21hyh1hyhlusvnczp.R.flushNeeded();}}

    public void test_read_1() throws Exception {__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceStart(getClass().getName(),69941);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh0ak1hyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hyh1hyhlusvnczp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69941,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh0ak1hyt() throws Exception{try{__CLR4_5_21hyh1hyhlusvnczp.R.inc(69941);
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69942);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69943);reader.startArray();

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69944);int count = 0;
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69945);while ((((reader.hasNext())&&(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69946)!=0|true))||(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69947)==0&false))) {{
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69948);reader.readObject();
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69949);count++;
        }
        }__CLR4_5_21hyh1hyhlusvnczp.R.inc(69950);Assert.assertEquals(10, count);

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69951);reader.endArray();
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69952);reader.close();
    }finally{__CLR4_5_21hyh1hyhlusvnczp.R.flushNeeded();}}
    
    public void test_read_3() throws Exception {__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceStart(getClass().getName(),69953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27dgxvi1hz5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21hyh1hyhlusvnczp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21hyh1hyhlusvnczp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27dgxvi1hz5() throws Exception{try{__CLR4_5_21hyh1hyhlusvnczp.R.inc(69953);
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69954);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69955);reader.startArray();

        
        
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69956);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69957);reader.startObject();
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69958);reader.endObject();
        
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69959);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69960);reader.startObject();
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69961);reader.endObject();
        
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69962);int count = 2;
        
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69963);while ((((reader.hasNext())&&(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69964)!=0|true))||(__CLR4_5_21hyh1hyhlusvnczp.R.iget(69965)==0&false))) {{
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69966);reader.startObject();
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69967);reader.endObject();
            __CLR4_5_21hyh1hyhlusvnczp.R.inc(69968);count++;
        }
        }__CLR4_5_21hyh1hyhlusvnczp.R.inc(69969);Assert.assertEquals(10, count);

        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69970);reader.endArray();
        __CLR4_5_21hyh1hyhlusvnczp.R.inc(69971);reader.close();
    }finally{__CLR4_5_21hyh1hyhlusvnczp.R.flushNeeded();}}
}
