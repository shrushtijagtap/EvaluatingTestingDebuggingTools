/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.io.StringReader;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class ListStringFieldTest_stream_array_2 extends TestCase {static class __CLR4_5_21o7g1o7glusvnewu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,78048,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_list() throws Exception {__CLR4_5_21o7g1o7glusvnewu.R.globalSliceStart(getClass().getName(),78028);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1o7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o7g1o7glusvnewu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o7g1o7glusvnewu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array_2.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78028,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1o7g() throws Exception{try{__CLR4_5_21o7g1o7glusvnewu.R.inc(78028);
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78029);String text = "[[\"a\",null,\"b\",\"ab\\\\c\"],[]]";

        __CLR4_5_21o7g1o7glusvnewu.R.inc(78030);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78031);Model model = reader.readObject(Model.class);
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78032);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78033);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78034);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78035);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78036);Assert.assertEquals("ab\\c", model.values.get(3));
        
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78037);Assert.assertEquals(0, model.values2.size());
    }finally{__CLR4_5_21o7g1o7glusvnewu.R.flushNeeded();}}
    
    public void test_list2() throws Exception {__CLR4_5_21o7g1o7glusvnewu.R.globalSliceStart(getClass().getName(),78038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26z9fzm1o7q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21o7g1o7glusvnewu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21o7g1o7glusvnewu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ListStringFieldTest_stream_array_2.test_list2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26z9fzm1o7q() throws Exception{try{__CLR4_5_21o7g1o7glusvnewu.R.inc(78038);
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78039);String text = "{\"values\":[\"a\",null,\"b\",\"ab\\\\c\"],\"values2\":[]}";

        __CLR4_5_21o7g1o7glusvnewu.R.inc(78040);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78041);Model model = reader.readObject(Model.class);
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78042);Assert.assertEquals(4, model.values.size());
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78043);Assert.assertEquals("a", model.values.get(0));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78044);Assert.assertEquals(null, model.values.get(1));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78045);Assert.assertEquals("b", model.values.get(2));
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78046);Assert.assertEquals("ab\\c", model.values.get(3));
        
        __CLR4_5_21o7g1o7glusvnewu.R.inc(78047);Assert.assertEquals(0, model.values2.size());
    }finally{__CLR4_5_21o7g1o7glusvnewu.R.flushNeeded();}}

    
    @JSONType(parseFeatures = Feature.SupportArrayToBean)
    public static class Model {

        public List<String> values;
        public List<String> values2;

    }
}
