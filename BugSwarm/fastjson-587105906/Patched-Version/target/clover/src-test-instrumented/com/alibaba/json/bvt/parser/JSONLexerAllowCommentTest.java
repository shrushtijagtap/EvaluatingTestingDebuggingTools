/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.io.IOException;
import java.io.InputStream;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONLexerAllowCommentTest extends TestCase {static class __CLR4_5_21h9w1h9wlusvncns{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,69061,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21h9w1h9wlusvncns.R.globalSliceStart(getClass().getName(),69044);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21h9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h9w1h9wlusvncns.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h9w1h9wlusvncns.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerAllowCommentTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69044,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21h9w() throws Exception{try{__CLR4_5_21h9w1h9wlusvncns.R.inc(69044);
        
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69045);String jsonWithComment = "{ /*tes****\n\r\n*t*/\"a\":1 /*****test88888*****/ /*test*/ , /*test*/ //test\n //est\n \"b\":2}";
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69046);JSONObject object = JSON.parseObject(jsonWithComment, Feature.AllowComment, Feature.OrderedField);
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69047);System.out.println(object.toJSONString());
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69048);Assert.assertEquals("{\"a\":1,\"b\":2}",object.toJSONString());

        __CLR4_5_21h9w1h9wlusvncns.R.inc(69049);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner(jsonWithComment,
            Feature.AllowComment.getMask() | Feature.OrderedField.getMask()));
        
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69050);JSONObject object1 = parser.parseObject();
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69051);Assert.assertEquals("{\"a\":1,\"b\":2}",object1.toJSONString());
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69052);System.out.println(object1.toJSONString());

    }finally{__CLR4_5_21h9w1h9wlusvncns.R.flushNeeded();}}

    public void test_1() throws IOException {__CLR4_5_21h9w1h9wlusvncns.R.globalSliceStart(getClass().getName(),69053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ha5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h9w1h9wlusvncns.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h9w1h9wlusvncns.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerAllowCommentTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ha5() throws IOException{try{__CLR4_5_21h9w1h9wlusvncns.R.inc(69053);
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69054);String resource = "json/json_with_comment.json";
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69055);InputStream is = Thread.currentThread().getContextClassLoader()
            .getResourceAsStream(resource);
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69056);String text = IOUtils.toString(is);
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69057);is.close();

        __CLR4_5_21h9w1h9wlusvncns.R.inc(69058);JSONObject object = JSON.parseObject(text, Feature.AllowComment, Feature.OrderedField);
        __CLR4_5_21h9w1h9wlusvncns.R.inc(69059);System.out.println(object.toJSONString());

        __CLR4_5_21h9w1h9wlusvncns.R.inc(69060);Assert
            .assertEquals(
                "{\"hello\":\"asafsadf\",\"test\":1,\"array\":[\"10000sfsaf\",100,{\"nihao\":{\"test\":\"sdfasdf\"}}],\"object\":{\"teset\":1000}}",
                object.toJSONString());
    }finally{__CLR4_5_21h9w1h9wlusvncns.R.flushNeeded();}}
}
