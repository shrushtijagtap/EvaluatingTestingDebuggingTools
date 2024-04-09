/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class NumberFieldTest extends TestCase {static class __CLR4_1_10z6kz6klusqjyrd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,45696,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45596);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31sz6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45596,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31sz6k() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45596);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45597);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45598);v.setValue(1001L);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45599);String text = JSON.toJSONString(v);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45600);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45601);Assert.assertEquals(v1.getValue().intValue(), v.getValue().intValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_no_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yk0hx6z6q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45602,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yk0hx6z6q() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45602);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45603);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45604);v.setValue(1001L);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45605);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45606);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45607);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45608);Assert.assertEquals("{\"value\":1001}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45609);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45610);Assert.assertEquals(Integer.valueOf(1001), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18z6z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45611,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18z6z() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45611);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45612);V0 v = new V0();

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45613);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45614);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45615);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45616);Assert.assertEquals("{\"value\":null}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45617);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45618);Assert.assertEquals(v1.getValue(), v.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_2_no_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45619);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10527k1zz77();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_2_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45619,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10527k1zz77() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45619);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45620);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45621);v.setValue(Long.MAX_VALUE);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45622);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45623);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45624);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45625);Assert.assertEquals("{\"value\":" + Long.MAX_VALUE + "}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45626);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45627);Assert.assertEquals(new Long(Long.MAX_VALUE), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_2_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xcgg2pz7g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_2_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xcgg2pz7g() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45628);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45629);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45630);v.setValue(Long.MAX_VALUE);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45631);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45632);mapping.setAsmEnable(true);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45633);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45634);Assert.assertEquals("{\"value\":" + Long.MAX_VALUE + "}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45635);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45636);Assert.assertEquals(new Long(Long.MAX_VALUE), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_3_no_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hbike2z7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_3_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hbike2z7p() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45637);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45638);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45639);v.setValue(new BigDecimal("3.2"));
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45640);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45641);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45642);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45643);Assert.assertEquals("{\"value\":3.2}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45644);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45645);Assert.assertEquals(new BigDecimal("3.2"), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_3_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ozgkjkz7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_3_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45646,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ozgkjkz7y() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45646);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45647);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45648);v.setValue(new BigDecimal("3.2"));
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45649);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45650);mapping.setAsmEnable(true);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45651);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45652);Assert.assertEquals("{\"value\":3.2}", text);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45653);V0 v1 = JSON.parseObject(text, V0.class);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45654);Assert.assertEquals(new BigDecimal("3.2"), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_min_no_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45655);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103arag7z87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_min_no_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45655,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103arag7z87() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45655);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45656);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45657);v.setValue(Long.MIN_VALUE);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45658);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45659);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45660);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45661);Assert.assertEquals("{\"value\":" + Long.MIN_VALUE + "}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45662);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45663);Assert.assertEquals(new Long(Long.MIN_VALUE), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_min_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45664);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103lgwn3z8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_min_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45664,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103lgwn3z8g() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45664);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45665);V0 v = new V0();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45666);v.setValue(Long.MIN_VALUE);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45667);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45668);mapping.setAsmEnable(true);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45669);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45670);Assert.assertEquals("{\"value\":" + Long.MIN_VALUE + "}", text);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45671);V0 v1 = JSON.parseObject(text, V0.class);
        
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45672);Assert.assertEquals(new Long(Long.MIN_VALUE), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45673);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16yz8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45673,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16yz8p() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45673);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45674);V0 v = new V0();

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45675);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45676);mapping.setAsmEnable(false);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45677);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45678);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45679);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45680);Assert.assertEquals(Integer.valueOf(0), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_null_1_asm() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45681);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c69fuaz8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_null_1_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45681,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c69fuaz8x() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45681);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45682);V0 v = new V0();

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45683);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45684);mapping.setAsmEnable(true);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45685);String text = JSON.toJSONString(v, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullNumberAsZero);
        __CLR4_1_10z6kz6klusqjyrd.R.inc(45686);Assert.assertEquals("{\"value\":0}", text);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45687);V0 v1 = JSON.parseObject(text, V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45688);Assert.assertEquals(Integer.valueOf(0), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}
    
    public void test_codec_cast() throws Exception {__CLR4_1_10z6kz6klusqjyrd.R.globalSliceStart(getClass().getName(),45689);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104lu14sz95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10z6kz6klusqjyrd.R.rethrow($CLV_t2$);}finally{__CLR4_1_10z6kz6klusqjyrd.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.NumberFieldTest.test_codec_cast",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),45689,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104lu14sz95() throws Exception{try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45689);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45690);V0 v1 = JSON.parseObject("{\"value\":\"12.3\"}", V0.class);

        __CLR4_1_10z6kz6klusqjyrd.R.inc(45691);Assert.assertEquals(new BigDecimal("12.3"), v1.getValue());
    }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}

    public static class V0 {

        private Number value;

        public Number getValue() {try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45692);
            __CLR4_1_10z6kz6klusqjyrd.R.inc(45693);return value;
        }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}

        public void setValue(Number value) {try{__CLR4_1_10z6kz6klusqjyrd.R.inc(45694);
            __CLR4_1_10z6kz6klusqjyrd.R.inc(45695);this.value = value;
        }finally{__CLR4_1_10z6kz6klusqjyrd.R.flushNeeded();}}

    }
}
