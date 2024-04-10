/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class LongFieldTest_2_stream extends TestCase {static class __CLR4_5_2yy7yy7lusyjq48{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,45328,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_min() throws Exception {__CLR4_5_2yy7yy7lusyjq48.R.globalSliceStart(getClass().getName(),45295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27usnv0yy7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yy7yy7lusyjq48.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yy7yy7lusyjq48.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2_stream.test_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27usnv0yy7() throws Exception{try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45295);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45296);V0 v = new V0();
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45297);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45298);String text = JSON.toJSONString(v);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45299);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45300);V0 v1 = reader.readObject(V0.class);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45301);Assert.assertEquals(v1.getValue(), v.getValue());
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45302);reader.close();
    }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}
    
    public void test_max() throws Exception {__CLR4_5_2yy7yy7lusyjq48.R.globalSliceStart(getClass().getName(),45303);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fp99cuyyf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yy7yy7lusyjq48.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yy7yy7lusyjq48.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2_stream.test_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45303,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fp99cuyyf() throws Exception{try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45303);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45304);V0 v = new V0();
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45305);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45306);String text = JSON.toJSONString(v);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45307);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45308);V0 v1 = reader.readObject(V0.class);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45309);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}
    
    public void test_min_array() throws Exception {__CLR4_5_2yy7yy7lusyjq48.R.globalSliceStart(getClass().getName(),45310);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxfi1yyym();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yy7yy7lusyjq48.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yy7yy7lusyjq48.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2_stream.test_min_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45310,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxfi1yyym() throws Exception{try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45310);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45311);V0 v = new V0();
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45312);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45313);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45314);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45315);V0 v1 = reader.readObject(V0.class);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45316);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}
    
    public void test_max_array() throws Exception {__CLR4_5_2yy7yy7lusyjq48.R.globalSliceStart(getClass().getName(),45317);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28adgmwyyt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yy7yy7lusyjq48.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yy7yy7lusyjq48.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2_stream.test_max_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45317,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28adgmwyyt() throws Exception{try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45317);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45318);V0 v = new V0();
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45319);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45320);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45321);JSONReader reader = new JSONReader(new StringReader(text), Feature.SupportArrayToBean);
        __CLR4_5_2yy7yy7lusyjq48.R.inc(45322);V0 v1 = reader.readObject(V0.class);

        __CLR4_5_2yy7yy7lusyjq48.R.inc(45323);Assert.assertEquals(v.getValue(), v1.getValue());
    }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}

    public static class V0 {

        private Long value;

        public Long getValue() {try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45324);
            __CLR4_5_2yy7yy7lusyjq48.R.inc(45325);return value;
        }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}

        public void setValue(Long value) {try{__CLR4_5_2yy7yy7lusyjq48.R.inc(45326);
            __CLR4_5_2yy7yy7lusyjq48.R.inc(45327);this.value = value;
        }finally{__CLR4_5_2yy7yy7lusyjq48.R.flushNeeded();}}

    }
}
