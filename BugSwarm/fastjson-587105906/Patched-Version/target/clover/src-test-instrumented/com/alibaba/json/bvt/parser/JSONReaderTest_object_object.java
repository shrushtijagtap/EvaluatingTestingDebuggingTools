/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONReaderTest_object_object extends TestCase {static class __CLR4_5_21h4d1h4dlusyjtou{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,68896,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String text = "{\"f0\":{},\"f1\":{},\"f2\":{},\"f3\":{},\"f4\":{}, " + //
                  "\"f5\":{},\"f6\":{},\"f7\":{},\"f8\":{},\"f9\":{}}";

    public void test_read() throws Exception {__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceStart(getClass().getName(),68845);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8nabu1h4d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h4d1h4dlusyjtou.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68845,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8nabu1h4d() throws Exception{try{__CLR4_5_21h4d1h4dlusyjtou.R.inc(68845);

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68846);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68847);reader.startObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68848);int count = 0;
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68849);while ((((reader.hasNext())&&(__CLR4_5_21h4d1h4dlusyjtou.R.iget(68850)!=0|true))||(__CLR4_5_21h4d1h4dlusyjtou.R.iget(68851)==0&false))) {{
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68852);String key = (String) reader.readObject();
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68853);Object value = reader.readObject();
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68854);Assert.assertNotNull(key);
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68855);Assert.assertNotNull(value);
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68856);count++;
        }
        }__CLR4_5_21h4d1h4dlusyjtou.R.inc(68857);Assert.assertEquals(10, count);

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68858);reader.endObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68859);reader.close();
    }finally{__CLR4_5_21h4d1h4dlusyjtou.R.flushNeeded();}}

    public void test_read_1() throws Exception {__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceStart(getClass().getName(),68860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh0ak1h4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h4d1h4dlusyjtou.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68860,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh0ak1h4s() throws Exception{try{__CLR4_5_21h4d1h4dlusyjtou.R.inc(68860);
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68861);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68862);reader.startObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68863);int count = 0;
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68864);while ((((reader.hasNext())&&(__CLR4_5_21h4d1h4dlusyjtou.R.iget(68865)!=0|true))||(__CLR4_5_21h4d1h4dlusyjtou.R.iget(68866)==0&false))) {{
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68867);String key = (String) reader.readObject();
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68868);Object value = reader.readObject();
            
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68869);Assert.assertNotNull(key);
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68870);Assert.assertNotNull(value);
            
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68871);count++;
        }
        }__CLR4_5_21h4d1h4dlusyjtou.R.inc(68872);Assert.assertEquals(10, count);

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68873);reader.endObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68874);reader.close();
    }finally{__CLR4_5_21h4d1h4dlusyjtou.R.flushNeeded();}}

    public void test_read_2() throws Exception {__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceStart(getClass().getName(),68875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_244gz311h57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h4d1h4dlusyjtou.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h4d1h4dlusyjtou.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_244gz311h57() throws Exception{try{__CLR4_5_21h4d1h4dlusyjtou.R.inc(68875);
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68876);JSONReader reader = new JSONReader(new JSONScanner("{{}:{},{}:{}}"));
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68877);reader.startObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68878);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68879);reader.startObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68880);reader.endObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68881);reader.startObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68882);reader.endObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68883);Assert.assertTrue(reader.hasNext());
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68884);reader.startObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68885);reader.endObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68886);reader.startObject();
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68887);reader.endObject();
        
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68888);Assert.assertFalse(reader.hasNext());

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68889);reader.endObject();

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68890);Exception error = null;
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68891);try {
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68892);reader.hasNext();
        } catch (Exception ex) {
            __CLR4_5_21h4d1h4dlusyjtou.R.inc(68893);error = ex;
        }
        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68894);Assert.assertNotNull(error);

        __CLR4_5_21h4d1h4dlusyjtou.R.inc(68895);reader.close();
    }finally{__CLR4_5_21h4d1h4dlusyjtou.R.flushNeeded();}}
}
