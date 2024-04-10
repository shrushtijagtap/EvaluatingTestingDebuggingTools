/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONReaderTest_array_object extends TestCase {static class __CLR4_5_21h091h09lusyjton{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,68740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String text = "[{},{},{},{},{} ,{},{},{},{},{}]";

    public void test_read() throws Exception {__CLR4_5_21h091h09lusyjton.R.globalSliceStart(getClass().getName(),68697);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8nabu1h09();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h091h09lusyjton.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h091h09lusyjton.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68697,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8nabu1h09() throws Exception{try{__CLR4_5_21h091h09lusyjton.R.inc(68697);

        __CLR4_5_21h091h09lusyjton.R.inc(68698);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21h091h09lusyjton.R.inc(68699);reader.startArray();

        __CLR4_5_21h091h09lusyjton.R.inc(68700);int count = 0;
        __CLR4_5_21h091h09lusyjton.R.inc(68701);while ((((reader.hasNext())&&(__CLR4_5_21h091h09lusyjton.R.iget(68702)!=0|true))||(__CLR4_5_21h091h09lusyjton.R.iget(68703)==0&false))) {{
            __CLR4_5_21h091h09lusyjton.R.inc(68704);reader.readObject();
            __CLR4_5_21h091h09lusyjton.R.inc(68705);count++;
        }
        }__CLR4_5_21h091h09lusyjton.R.inc(68706);Assert.assertEquals(10, count);

        __CLR4_5_21h091h09lusyjton.R.inc(68707);reader.endArray();
        __CLR4_5_21h091h09lusyjton.R.inc(68708);reader.close();
    }finally{__CLR4_5_21h091h09lusyjton.R.flushNeeded();}}

    public void test_read_1() throws Exception {__CLR4_5_21h091h09lusyjton.R.globalSliceStart(getClass().getName(),68709);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh0ak1h0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h091h09lusyjton.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h091h09lusyjton.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68709,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh0ak1h0l() throws Exception{try{__CLR4_5_21h091h09lusyjton.R.inc(68709);
        __CLR4_5_21h091h09lusyjton.R.inc(68710);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21h091h09lusyjton.R.inc(68711);reader.startArray();

        __CLR4_5_21h091h09lusyjton.R.inc(68712);int count = 0;
        __CLR4_5_21h091h09lusyjton.R.inc(68713);while ((((reader.hasNext())&&(__CLR4_5_21h091h09lusyjton.R.iget(68714)!=0|true))||(__CLR4_5_21h091h09lusyjton.R.iget(68715)==0&false))) {{
            __CLR4_5_21h091h09lusyjton.R.inc(68716);reader.readObject();
            __CLR4_5_21h091h09lusyjton.R.inc(68717);count++;
        }
        }__CLR4_5_21h091h09lusyjton.R.inc(68718);Assert.assertEquals(10, count);

        __CLR4_5_21h091h09lusyjton.R.inc(68719);reader.endArray();
        __CLR4_5_21h091h09lusyjton.R.inc(68720);reader.close();
    }finally{__CLR4_5_21h091h09lusyjton.R.flushNeeded();}}
    
    public void test_read_3() throws Exception {__CLR4_5_21h091h09lusyjton.R.globalSliceStart(getClass().getName(),68721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27dgxvi1h0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h091h09lusyjton.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h091h09lusyjton.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_array_object.test_read_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68721,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27dgxvi1h0x() throws Exception{try{__CLR4_5_21h091h09lusyjton.R.inc(68721);
        __CLR4_5_21h091h09lusyjton.R.inc(68722);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21h091h09lusyjton.R.inc(68723);reader.startArray();

        
        
        __CLR4_5_21h091h09lusyjton.R.inc(68724);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21h091h09lusyjton.R.inc(68725);reader.startObject();
        __CLR4_5_21h091h09lusyjton.R.inc(68726);reader.endObject();
        
        __CLR4_5_21h091h09lusyjton.R.inc(68727);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21h091h09lusyjton.R.inc(68728);reader.startObject();
        __CLR4_5_21h091h09lusyjton.R.inc(68729);reader.endObject();
        
        __CLR4_5_21h091h09lusyjton.R.inc(68730);int count = 2;
        
        __CLR4_5_21h091h09lusyjton.R.inc(68731);while ((((reader.hasNext())&&(__CLR4_5_21h091h09lusyjton.R.iget(68732)!=0|true))||(__CLR4_5_21h091h09lusyjton.R.iget(68733)==0&false))) {{
            __CLR4_5_21h091h09lusyjton.R.inc(68734);reader.startObject();
            __CLR4_5_21h091h09lusyjton.R.inc(68735);reader.endObject();
            __CLR4_5_21h091h09lusyjton.R.inc(68736);count++;
        }
        }__CLR4_5_21h091h09lusyjton.R.inc(68737);Assert.assertEquals(10, count);

        __CLR4_5_21h091h09lusyjton.R.inc(68738);reader.endArray();
        __CLR4_5_21h091h09lusyjton.R.inc(68739);reader.close();
    }finally{__CLR4_5_21h091h09lusyjton.R.flushNeeded();}}
}
