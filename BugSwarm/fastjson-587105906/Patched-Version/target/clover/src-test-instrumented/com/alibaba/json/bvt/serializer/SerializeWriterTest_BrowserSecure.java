/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class SerializeWriterTest_BrowserSecure extends TestCase {static class __CLR4_5_21u2a1u2alusvngk7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85663,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85618);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21u2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85618,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21u2a() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85618);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85619);StringBuilder buf = new StringBuilder();
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85620);for (int i = 0; (((i < 1024)&&(__CLR4_5_21u2a1u2alusvngk7.R.iget(85621)!=0|true))||(__CLR4_5_21u2a1u2alusvngk7.R.iget(85622)==0&false)); ++i) {{
            __CLR4_5_21u2a1u2alusvngk7.R.inc(85623);buf.append('a');
        }
        }__CLR4_5_21u2a1u2alusvngk7.R.inc(85624);buf.append("\u4e2d\u56fd");
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85625);buf.append("\0");
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85626);JSON.toJSONString(buf.toString(), SerializerFeature.BrowserSecure);
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1u2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1u2j() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85627);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85628);StringBuilder buf = new StringBuilder();
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85629);for (int i = 0; (((i < 1024)&&(__CLR4_5_21u2a1u2alusvngk7.R.iget(85630)!=0|true))||(__CLR4_5_21u2a1u2alusvngk7.R.iget(85631)==0&false)); ++i) {{
            __CLR4_5_21u2a1u2alusvngk7.R.inc(85632);buf.append('a');
        }
        }__CLR4_5_21u2a1u2alusvngk7.R.inc(85633);buf.append("\u4e2d\u56fd");
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85634);buf.append("\0");

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85635);StringWriter out = new StringWriter();
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85636);JSON.writeJSONStringTo(buf.toString(), out, SerializerFeature.BrowserSecure);
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public void test_zh() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24os8im1u2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_zh",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85637,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24os8im1u2t() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85637);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85638);Assert.assertEquals("\"\u4e2d\u56fd\"", JSON.toJSONString("\u4e2d\u56fd", SerializerFeature.BrowserSecure));
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public void test_all() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxmdol1u2v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_all",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxmdol1u2v() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85639);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85640);String value = ".,_~!@<>'\"\\/hello world 0123;\u6c49\u5b57\uff1b\u2028\u2028\r\n<script></scirpt>";
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85641);String expect = "\".,_~!@\\u003C\\u003E'\\\"\\\\/hello world 0123;\u6c49\u5b57\uff1b\\u2028\\u2028\\r\\n\\u003Cscript\\u003E\\u003C/scirpt\\u003E\"";
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85642);Assert.assertEquals(expect, JSON.toJSONString(value, SerializerFeature.BrowserSecure));
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public void test_all_map() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zluq01u2z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_all_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zluq01u2z() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85643);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85644);String value = ".,_~!@<>'\"\\/hello world 0123;\u6c49\u5b57\uff1b\u2028\u2028\r\n<script></scirpt>";

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85645);Map<String, String> map = new HashMap<String, String>();
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85646);map.put("value", value);

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85647);String expect = "{\"value\":\".,_~!@\\u003C\\u003E'\\\"\\\\/hello world 0123;\u6c49\u5b57\uff1b\\u2028\\u2028\\r\\n\\u003Cscript\\u003E\\u003C/scirpt\\u003E\"}";
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85648);String json = JSON.toJSONString(map, SerializerFeature.BrowserSecure);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85649);assertEquals(expect, json);

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85650);assertEquals(value, JSON.parseObject(json).get("value"));
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public void test_all_entity() throws Exception {__CLR4_5_21u2a1u2alusvngk7.R.globalSliceStart(getClass().getName(),85651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qhk4gl1u37();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u2a1u2alusvngk7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u2a1u2alusvngk7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerializeWriterTest_BrowserSecure.test_all_entity",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qhk4gl1u37() throws Exception{try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85651);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85652);String value = ".,_~!@<>'\"\\/hello world 0123;\u6c49\u5b57\uff1b\u2028\u2028\r\n<script></scirpt>";

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85653);VO vo = new VO();
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85654);vo.setValue(value);

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85655);String expect = "{\"value\":\".,_~!@\\u003C\\u003E'\\\"\\\\/hello world 0123;\u6c49\u5b57\uff1b\\u2028\\u2028\\r\\n\\u003Cscript\\u003E\\u003C/scirpt\\u003E\"}";
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85656);String json = JSON.toJSONString(vo, SerializerFeature.BrowserSecure);
        __CLR4_5_21u2a1u2alusvngk7.R.inc(85657);assertEquals(expect, json);

        __CLR4_5_21u2a1u2alusvngk7.R.inc(85658);assertEquals(value, JSON.parseObject(json, VO.class).value);
    }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

    public static class VO {

        String value;

        public String getValue() {try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85659);
            __CLR4_5_21u2a1u2alusvngk7.R.inc(85660);return value;
        }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_21u2a1u2alusvngk7.R.inc(85661);
            __CLR4_5_21u2a1u2alusvngk7.R.inc(85662);this.value = value;
        }finally{__CLR4_5_21u2a1u2alusvngk7.R.flushNeeded();}}
    }

}
