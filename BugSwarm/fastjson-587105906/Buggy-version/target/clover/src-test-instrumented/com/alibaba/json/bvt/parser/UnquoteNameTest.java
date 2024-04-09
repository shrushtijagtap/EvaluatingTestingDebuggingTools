/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

import junit.framework.TestCase;

public class UnquoteNameTest extends TestCase {static class __CLR4_1_101j8i1j8ilusqkel2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71624,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_unquote() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71586);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107uviot1j8i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71586,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107uviot1j8i() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71586);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71587);String text = "{_id:1001}";
        
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71588);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71589);Assert.assertEquals(1001, model._id);
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}
    
    public void test_unquote_parse() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hl5rtd1j8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71590,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hl5rtd1j8m() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71590);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71591);String text = "{ _id:1001}";
        
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71592);JSONObject model = JSON.parseObject(text);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71593);Assert.assertEquals(1001, model.get("_id"));
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}

    public void test_unquote_parse_1() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71594);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p2qyr1j8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_parse_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71594,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p2qyr1j8q() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71594);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71595);String text = "{ $id:1001}";

        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71596);JSONObject model = JSON.parseObject(text);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71597);Assert.assertEquals(1001, model.get("$id"));
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}
    
    public void test_unquote_reader() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10it99g31j8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71598,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10it99g31j8u() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71598);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71599);String text = "{_id:1001}";
        
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71600);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71601);Model model = reader.readObject(Model.class);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71602);Assert.assertEquals(1001, model._id);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71603);reader.close();
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}
    
    public void test_unquote_reader_parse() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9qegp1j90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_reader_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9qegp1j90() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71604);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71605);String text = "{_id:1001}";
        
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71606);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71607);JSONObject model = (JSONObject) reader.readObject();
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71608);Assert.assertEquals(1001, model.get("_id"));
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71609);reader.close();
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}
    
    public void test_obj() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104ckqwf1j96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104ckqwf1j96() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71610);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71611);JSONReader reader = new JSONReader(new StringReader("{_id:123}"));

        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71612);reader.startObject();
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71613);Assert.assertEquals("_id", reader.readString());
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71614);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71615);reader.endObject();

        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71616);reader.close();
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}

    public void test_obj_1() throws Exception {__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceStart(getClass().getName(),71617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10falfib1j9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j8i1j8ilusqkel2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j8i1j8ilusqkel2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_obj_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71617,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10falfib1j9d() throws Exception{try{__CLR4_1_101j8i1j8ilusqkel2.R.inc(71617);
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71618);JSONReader reader = new JSONReader(new StringReader("{$id:123}"));

        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71619);reader.startObject();
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71620);Assert.assertEquals("$id", reader.readString());
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71621);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71622);reader.endObject();

        __CLR4_1_101j8i1j8ilusqkel2.R.inc(71623);reader.close();
    }finally{__CLR4_1_101j8i1j8ilusqkel2.R.flushNeeded();}}
    
    public static class Model {
        public int _id;
    }
}
