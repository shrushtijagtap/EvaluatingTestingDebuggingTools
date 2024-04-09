/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSONReader;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

import java.io.StringReader;

public class LongFieldTest_2 extends TestCase {static class __CLR4_5_2yvzyvzlusvn33e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,45267,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_min() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45215);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27usnv0yvz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_min",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45215,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27usnv0yvz() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45215);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45216);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45217);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45218);String text = JSON.toJSONString(v);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45219);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45220);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    public void test_min_reader() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22t21twyw5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_min_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22t21twyw5() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45221);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45222);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45223);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45224);String text = JSON.toJSONString(v);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45225);V0 v1 = new JSONReader(new StringReader(text)).readObject(V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45226);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}
    
    public void test_max() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fp99cuywb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_max",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fp99cuywb() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45227);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45228);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45229);v.setValue(Long.MAX_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45230);String text = JSON.toJSONString(v);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45231);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45232);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    public void test_max_reader() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228bbn6ywh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_max_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45233,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228bbn6ywh() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45233);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45234);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45235);v.setValue(Long.MAX_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45236);String text = JSON.toJSONString(v);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45237);V0 v1 = new JSONReader(new StringReader(text)).readObject(V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45238);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}
    
    public void test_min_array() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sxfi1yywn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_min_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sxfi1yywn() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45239);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45240);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45241);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45242);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45243);V0 v1 = JSON.parseObject(text, V0.class, Feature.SupportArrayToBean);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45244);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    public void test_min_array_reader() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45245);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vs8vfuywt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_min_array_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45245,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vs8vfuywt() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45245);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45246);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45247);v.setValue(Long.MIN_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45248);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45249);V0 v1 = new JSONReader(new StringReader(text), Feature.SupportArrayToBean).readObject(V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45250);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}
    
    public void test_max_array() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28adgmwywz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_max_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28adgmwywz() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45251);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45252);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45253);v.setValue(Long.MAX_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45254);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45255);V0 v1 = JSON.parseObject(text, V0.class, Feature.SupportArrayToBean);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45256);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    public void test_max_array_reader() throws Exception {__CLR4_5_2yvzyvzlusvn33e.R.globalSliceStart(getClass().getName(),45257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u5fb88yx5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2yvzyvzlusvn33e.R.rethrow($CLV_t2$);}finally{__CLR4_5_2yvzyvzlusvn33e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.LongFieldTest_2.test_max_array_reader",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u5fb88yx5() throws Exception{try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45257);
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45258);V0 v = new V0();
        __CLR4_5_2yvzyvzlusvn33e.R.inc(45259);v.setValue(Long.MAX_VALUE);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45260);String text = JSON.toJSONString(v, SerializerFeature.BeanToArray);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45261);V0 v1 = new JSONReader(new StringReader(text), Feature.SupportArrayToBean).readObject(V0.class);

        __CLR4_5_2yvzyvzlusvn33e.R.inc(45262);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    public static class V0 {

        private Long value;

        public Long getValue() {try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45263);
            __CLR4_5_2yvzyvzlusvn33e.R.inc(45264);return value;
        }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

        public void setValue(Long value) {try{__CLR4_5_2yvzyvzlusvn33e.R.inc(45265);
            __CLR4_5_2yvzyvzlusvn33e.R.inc(45266);this.value = value;
        }finally{__CLR4_5_2yvzyvzlusvn33e.R.flushNeeded();}}

    }
}
