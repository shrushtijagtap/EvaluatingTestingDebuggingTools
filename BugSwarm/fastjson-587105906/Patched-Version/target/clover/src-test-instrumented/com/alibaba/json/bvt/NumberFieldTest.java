/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NumberFieldTest extends TestCase {static class __CLR4_5_2z6gz6glusyjq61{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,45692,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45592);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nht31sz6g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45592,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nht31sz6g() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45592);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45593);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45594);v.setValue(1001L);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45595);String text = JSON.toJSONString(v);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45596);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45597);Assert.assertEquals(v1.getValue().intValue(), v.getValue().intValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_no_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yk0hx6z6m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yk0hx6z6m() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45598);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45599);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45600);v.setValue(1001L);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45601);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45602);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45603);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45604);Assert.assertEquals("{\"value\":1001}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45605);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45606);Assert.assertEquals(Integer.valueOf(1001), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45607);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ncl18z6v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45607,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ncl18z6v() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45607);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45608);V0 v = new V0();

        __CLR4_5_2z6gz6glusyjq61.R.inc(45609);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45610);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45611);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45612);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45613);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45614);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_2_no_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2527k1zz73();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_2_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45615,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2527k1zz73() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45615);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45616);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45617);v.setValue(Long.MAX_VALUE);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45618);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45619);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45620);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45621);Assert.assertEquals("{\"value\":" + Long.MAX_VALUE + "}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45622);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45623);Assert.assertEquals(new Long(Long.MAX_VALUE), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_2_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xcgg2pz7c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_2_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xcgg2pz7c() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45624);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45625);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45626);v.setValue(Long.MAX_VALUE);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45627);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45628);mapping.setAsmEnable(true);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45629);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45630);Assert.assertEquals("{\"value\":" + Long.MAX_VALUE + "}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45631);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45632);Assert.assertEquals(new Long(Long.MAX_VALUE), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_3_no_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hbike2z7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_3_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hbike2z7l() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45633);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45634);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45635);v.setValue(new BigDecimal("3.2"));
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45636);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45637);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45638);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45639);Assert.assertEquals("{\"value\":3.2}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45640);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45641);Assert.assertEquals(new BigDecimal("3.2"), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_3_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ozgkjkz7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_3_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ozgkjkz7u() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45642);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45643);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45644);v.setValue(new BigDecimal("3.2"));
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45645);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45646);mapping.setAsmEnable(true);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45647);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45648);Assert.assertEquals("{\"value\":3.2}", text);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45649);V0 v1 = JSON.parseObject(text, V0.class);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45650);Assert.assertEquals(new BigDecimal("3.2"), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_min_no_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45651);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23arag7z83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_min_no_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45651,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23arag7z83() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45651);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45652);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45653);v.setValue(Long.MIN_VALUE);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45654);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45655);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45656);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45657);Assert.assertEquals("{\"value\":" + Long.MIN_VALUE + "}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45658);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45659);Assert.assertEquals(new Long(Long.MIN_VALUE), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_min_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23lgwn3z8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_min_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23lgwn3z8c() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45660);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45661);V0 v = new V0();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45662);v.setValue(Long.MIN_VALUE);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45663);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45664);mapping.setAsmEnable(true);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45665);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45666);Assert.assertEquals("{\"value\":" + Long.MIN_VALUE + "}", text);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45667);V0 v1 = JSON.parseObject(text, V0.class);
        
        __CLR4_5_2z6gz6glusyjq61.R.inc(45668);Assert.assertEquals(new Long(Long.MIN_VALUE), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45669);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2prl16yz8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45669,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2prl16yz8l() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45669);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45670);V0 v = new V0();

        __CLR4_5_2z6gz6glusyjq61.R.inc(45671);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45672);mapping.setAsmEnable(false);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45673);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45674);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45675);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45676);Assert.assertEquals(Integer.valueOf(0), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_null_1_asm() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c69fuaz8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null_1_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c69fuaz8t() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45677);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45678);V0 v = new V0();

        __CLR4_5_2z6gz6glusyjq61.R.inc(45679);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_2z6gz6glusyjq61.R.inc(45680);mapping.setAsmEnable(true);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45681);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_5_2z6gz6glusyjq61.R.inc(45682);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45683);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45684);Assert.assertEquals(Integer.valueOf(0), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}
    
    public void test_codec_cast() throws Exception {__CLR4_5_2z6gz6glusyjq61.R.globalSliceStart(getClass().getName(),45685);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24lu14sz91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z6gz6glusyjq61.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z6gz6glusyjq61.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_cast",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45685,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24lu14sz91() throws Exception{try{__CLR4_5_2z6gz6glusyjq61.R.inc(45685);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45686);V0 v1 = JSON.parseObject("{\"value\":\"12.3\"}", V0.class);

        __CLR4_5_2z6gz6glusyjq61.R.inc(45687);Assert.assertEquals(new BigDecimal("12.3"), v1.getValue());
    }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}

    public static class V0 {

        private Number value;

        public Number getValue() {try{__CLR4_5_2z6gz6glusyjq61.R.inc(45688);
            __CLR4_5_2z6gz6glusyjq61.R.inc(45689);return value;
        }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}

        public void setValue(Number value) {try{__CLR4_5_2z6gz6glusyjq61.R.inc(45690);
            __CLR4_5_2z6gz6glusyjq61.R.inc(45691);this.value = value;
        }finally{__CLR4_5_2z6gz6glusyjq61.R.flushNeeded();}}

    }
}
