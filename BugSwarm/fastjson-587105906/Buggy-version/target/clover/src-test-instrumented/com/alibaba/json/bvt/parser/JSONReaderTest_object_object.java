/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONReaderTest_object_object extends TestCase {static class __CLR4_1_101i2w1i2wluszwcjy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,70139,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    String text = "{\"f0\":{},\"f1\":{},\"f2\":{},\"f3\":{},\"f4\":{}, " + //
                  "\"f5\":{},\"f6\":{},\"f7\":{},\"f8\":{},\"f9\":{}}";

    public void test_read() throws Exception {__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceStart(getClass().getName(),70088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o8nabu1i2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2w1i2wluszwcjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o8nabu1i2w() throws Exception{try{__CLR4_1_101i2w1i2wluszwcjy.R.inc(70088);

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70089);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70090);reader.startObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70091);int count = 0;
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70092);while ((((reader.hasNext())&&(__CLR4_1_101i2w1i2wluszwcjy.R.iget(70093)!=0|true))||(__CLR4_1_101i2w1i2wluszwcjy.R.iget(70094)==0&false))) {{
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70095);String key = (String) reader.readObject();
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70096);Object value = reader.readObject();
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70097);Assert.assertNotNull(key);
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70098);Assert.assertNotNull(value);
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70099);count++;
        }
        }__CLR4_1_101i2w1i2wluszwcjy.R.inc(70100);Assert.assertEquals(10, count);

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70101);reader.endObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70102);reader.close();
    }finally{__CLR4_1_101i2w1i2wluszwcjy.R.flushNeeded();}}

    public void test_read_1() throws Exception {__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceStart(getClass().getName(),70103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vh0ak1i3b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2w1i2wluszwcjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70103,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vh0ak1i3b() throws Exception{try{__CLR4_1_101i2w1i2wluszwcjy.R.inc(70103);
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70104);JSONReader reader = new JSONReader(new JSONScanner(text));
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70105);reader.startObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70106);int count = 0;
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70107);while ((((reader.hasNext())&&(__CLR4_1_101i2w1i2wluszwcjy.R.iget(70108)!=0|true))||(__CLR4_1_101i2w1i2wluszwcjy.R.iget(70109)==0&false))) {{
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70110);String key = (String) reader.readObject();
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70111);Object value = reader.readObject();
            
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70112);Assert.assertNotNull(key);
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70113);Assert.assertNotNull(value);
            
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70114);count++;
        }
        }__CLR4_1_101i2w1i2wluszwcjy.R.inc(70115);Assert.assertEquals(10, count);

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70116);reader.endObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70117);reader.close();
    }finally{__CLR4_1_101i2w1i2wluszwcjy.R.flushNeeded();}}

    public void test_read_2() throws Exception {__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceStart(getClass().getName(),70118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1044gz311i3q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101i2w1i2wluszwcjy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101i2w1i2wluszwcjy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONReaderTest_object_object.test_read_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),70118,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1044gz311i3q() throws Exception{try{__CLR4_1_101i2w1i2wluszwcjy.R.inc(70118);
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70119);JSONReader reader = new JSONReader(new JSONScanner("{{}:{},{}:{}}"));
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70120);reader.startObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70121);Assert.assertTrue(reader.hasNext());
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70122);reader.startObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70123);reader.endObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70124);reader.startObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70125);reader.endObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70126);Assert.assertTrue(reader.hasNext());
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70127);reader.startObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70128);reader.endObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70129);reader.startObject();
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70130);reader.endObject();
        
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70131);Assert.assertFalse(reader.hasNext());

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70132);reader.endObject();

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70133);Exception error = null;
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70134);try {
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70135);reader.hasNext();
        } catch (Exception ex) {
            __CLR4_1_101i2w1i2wluszwcjy.R.inc(70136);error = ex;
        }
        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70137);Assert.assertNotNull(error);

        __CLR4_1_101i2w1i2wluszwcjy.R.inc(70138);reader.close();
    }finally{__CLR4_1_101i2w1i2wluszwcjy.R.flushNeeded();}}
}
