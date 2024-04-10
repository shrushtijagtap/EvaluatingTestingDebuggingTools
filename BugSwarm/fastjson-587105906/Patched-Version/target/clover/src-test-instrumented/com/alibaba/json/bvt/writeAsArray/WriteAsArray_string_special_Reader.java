/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeAsArray;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_string_special_Reader extends TestCase {static class __CLR4_5_21yr61yr6lusyjvwm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,91718,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    
    public void test_0() throws Exception {__CLR4_5_21yr61yr6lusyjvwm.R.globalSliceStart(getClass().getName(),91698);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21yr6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yr61yr6lusyjvwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yr61yr6lusyjvwm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string_special_Reader.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91698,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21yr6() throws Exception{try{__CLR4_5_21yr61yr6lusyjvwm.R.inc(91698);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91699);Model model = new Model();
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91700);model.name = "a\\bc";
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91701);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91702);Assert.assertEquals("[\"a\\\\bc\"]", text);

        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91703);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91704);reader.config(Feature.SupportArrayToBean, true);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91705);Model model2 = reader.readObject(Model.class);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91706);Assert.assertEquals(model.name, model2.name);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91707);reader.close();
    }finally{__CLR4_5_21yr61yr6lusyjvwm.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_21yr61yr6lusyjvwm.R.globalSliceStart(getClass().getName(),91708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1yrg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yr61yr6lusyjvwm.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yr61yr6lusyjvwm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_string_special_Reader.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91708,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1yrg() throws Exception{try{__CLR4_5_21yr61yr6lusyjvwm.R.inc(91708);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91709);Model model = new Model();
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91710);model.name = "a\\bc\"";
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91711);String text = JSON.toJSONString(model, SerializerFeature.BeanToArray);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91712);Assert.assertEquals("[\"a\\\\bc\\\"\"]", text);

        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91713);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91714);reader.config(Feature.SupportArrayToBean, true);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91715);Model model2 = reader.readObject(Model.class);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91716);Assert.assertEquals(model.name, model2.name);
        __CLR4_5_21yr61yr6lusyjvwm.R.inc(91717);reader.close();
    }finally{__CLR4_5_21yr61yr6lusyjvwm.R.flushNeeded();}}

    public static class Model {

        public String name;

    }
}
