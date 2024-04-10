/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONReader;

import junit.framework.TestCase;

public class UnquoteNameTest extends TestCase {static class __CLR4_1_101k6q1k6qluszwd0s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_unquote() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72818);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107uviot1k6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72818,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107uviot1k6q() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72818);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72819);String text = "{_id:1001}";
        
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72820);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72821);Assert.assertEquals(1001, model._id);
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}
    
    public void test_unquote_parse() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72822);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hl5rtd1k6u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72822,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hl5rtd1k6u() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72822);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72823);String text = "{ _id:1001}";
        
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72824);JSONObject model = JSON.parseObject(text);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72825);Assert.assertEquals(1001, model.get("_id"));
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}

    public void test_unquote_parse_1() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72826);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p2qyr1k6y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_parse_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72826,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p2qyr1k6y() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72826);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72827);String text = "{ $id:1001}";

        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72828);JSONObject model = JSON.parseObject(text);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72829);Assert.assertEquals(1001, model.get("$id"));
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}
    
    public void test_unquote_reader() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10it99g31k72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10it99g31k72() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72830);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72831);String text = "{_id:1001}";
        
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72832);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72833);Model model = reader.readObject(Model.class);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72834);Assert.assertEquals(1001, model._id);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72835);reader.close();
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}
    
    public void test_unquote_reader_parse() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9qegp1k78();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_unquote_reader_parse",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72836,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9qegp1k78() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72836);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72837);String text = "{_id:1001}";
        
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72838);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72839);JSONObject model = (JSONObject) reader.readObject();
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72840);Assert.assertEquals(1001, model.get("_id"));
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72841);reader.close();
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}
    
    public void test_obj() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104ckqwf1k7e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_obj",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104ckqwf1k7e() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72842);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72843);JSONReader reader = new JSONReader(new StringReader("{_id:123}"));

        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72844);reader.startObject();
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72845);Assert.assertEquals("_id", reader.readString());
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72846);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72847);reader.endObject();

        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72848);reader.close();
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}

    public void test_obj_1() throws Exception {__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceStart(getClass().getName(),72849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10falfib1k7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101k6q1k6qluszwd0s.R.rethrow($CLV_t2$);}finally{__CLR4_1_101k6q1k6qluszwd0s.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.UnquoteNameTest.test_obj_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72849,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10falfib1k7l() throws Exception{try{__CLR4_1_101k6q1k6qluszwd0s.R.inc(72849);
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72850);JSONReader reader = new JSONReader(new StringReader("{$id:123}"));

        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72851);reader.startObject();
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72852);Assert.assertEquals("$id", reader.readString());
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72853);Assert.assertEquals(Integer.valueOf(123), reader.readInteger());
        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72854);reader.endObject();

        __CLR4_1_101k6q1k6qluszwd0s.R.inc(72855);reader.close();
    }finally{__CLR4_1_101k6q1k6qluszwd0s.R.flushNeeded();}}
    
    public static class Model {
        public int _id;
    }
}
