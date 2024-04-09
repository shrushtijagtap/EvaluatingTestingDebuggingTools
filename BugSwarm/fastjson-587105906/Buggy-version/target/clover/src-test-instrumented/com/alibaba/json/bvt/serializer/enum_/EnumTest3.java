/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * \u4fee\u8ba2\u8bb0\u5f55:
 * qzhanbo@yiji.com 2015-03-01 00:55 \u521b\u5efa
 *
 */
package com.alibaba.json.bvt.serializer.enum_;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.junit.Assert;
import org.junit.Test;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bohr.qiu@gmail.com
 */
public class EnumTest3 {static class __CLR4_1_101tzk1tzklusqkkon{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,85580,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	@Test
	public void testDefault() throws Exception {__CLR4_1_101tzk1tzklusqkkon.R.globalSliceStart(getClass().getName(),85520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xwf06u1tzk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzk1tzklusqkkon.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzk1tzklusqkkon.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85520,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xwf06u1tzk() throws Exception{try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85520);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85521);String json = JSON.toJSONString(Sex.M);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85522);Assert.assertEquals(json, "\"M\"");
		
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85523);Pojo pojo = new Pojo();
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85524);pojo.setSex(Sex.M);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85525);json = JSON.toJSONString(pojo);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85526);Assert.assertEquals(json, "{\"sex\":\"M\"}");

        __CLR4_1_101tzk1tzklusqkkon.R.inc(85527);try {
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85528);JSON.parseObject(json, Pojo.class);
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85529);Assert.assertTrue(true);
        } catch (Exception e) {
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85530);Assert.fail("\u679a\u4e3e\u9ed8\u8ba4\u5e8f\u5217\u5316name\u503c\uff0c\u53ef\u4ee5\u53cd\u5e8f\u5217\u5316\u6210\u529f");
        }

		__CLR4_1_101tzk1tzklusqkkon.R.inc(85531);Map<String, Pojo> map = new HashMap<String, Pojo>();
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85532);map.put("a", pojo);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85533);json = JSON.toJSONString(map);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85534);Assert.assertEquals(json, "{\"a\":{\"sex\":\"M\"}}");
		
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85535);Map<Sex, Pojo> enumMap = new EnumMap<Sex, Pojo>(Sex.class);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85536);enumMap.put(Sex.M, pojo);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85537);json = JSON.toJSONString(enumMap);
		__CLR4_1_101tzk1tzklusqkkon.R.inc(85538);Assert.assertEquals(json, "{\"M\":{\"sex\":\"M\"}}");
	}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}
	
	@Test
    public void testDefault1() throws Exception {__CLR4_1_101tzk1tzklusqkkon.R.globalSliceStart(getClass().getName(),85539);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ozom2x1u03();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzk1tzklusqkkon.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzk1tzklusqkkon.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85539,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ozom2x1u03() throws Exception{try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85539);
//        JSON.DUMP_CLASS = "/Users/bohr/Downloads/tmp";
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85540);String json = JSON.toJSONString(Sex.M, SerializerFeature.WriteEnumUsingToString);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85541);Assert.assertEquals(json, "\"\u7537\"");
	}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}

    @Test
    public void testDefault2() throws Exception {__CLR4_1_101tzk1tzklusqkkon.R.globalSliceStart(getClass().getName(),85542);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s8okve1u06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzk1tzklusqkkon.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzk1tzklusqkkon.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85542,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s8okve1u06() throws Exception{try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85542);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85543);Pojo pojo = new Pojo();
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85544);pojo.setSex(Sex.M);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85545);String json = JSON.toJSONString(pojo, SerializerFeature.WriteEnumUsingToString);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85546);Assert.assertEquals(json, "{\"sex\":\"\u7537\"}");
        
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85547);try {
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85548);Pojo pojo1 = JSON.parseObject(json, Pojo.class);
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85549);Assert.assertNull(pojo1.getSex());
        } catch (Exception e) {
            __CLR4_1_101tzk1tzklusqkkon.R.inc(85550);Assert.assertTrue(true);
        }

        __CLR4_1_101tzk1tzklusqkkon.R.inc(85551);Map<String, Pojo> map = new HashMap<String, Pojo>();
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85552);map.put("a", pojo);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85553);json = JSON.toJSONString(map, SerializerFeature.WriteEnumUsingToString);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85554);Assert.assertEquals(json, "{\"a\":{\"sex\":\"\u7537\"}}");

        __CLR4_1_101tzk1tzklusqkkon.R.inc(85555);Map<Sex, Pojo> enumMap = new EnumMap<Sex, Pojo>(Sex.class);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85556);enumMap.put(Sex.M, pojo);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85557);json = JSON.toJSONString(enumMap, SerializerFeature.WriteEnumUsingToString);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85558);Assert.assertEquals(json, "{\"\u7537\":{\"sex\":\"\u7537\"}}");
    }finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}

    @Test
    public void testName() throws Exception {__CLR4_1_101tzk1tzklusqkkon.R.globalSliceStart(getClass().getName(),85559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ufa5981u0n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzk1tzklusqkkon.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzk1tzklusqkkon.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testName",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85559,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ufa5981u0n() throws Exception{try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85559);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85560);Assert.assertEquals("\"\u7537\"", JSON.toJSONString(Sex.M, SerializerFeature.WriteEnumUsingToString));
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85561);Assert.assertEquals("\"\u5973\"", JSON.toJSONString(Sex.W, SerializerFeature.WriteEnumUsingToString));
    }finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}

    @Test
    public void testWriterSerializerFeature() throws Exception {__CLR4_1_101tzk1tzklusqkkon.R.globalSliceStart(getClass().getName(),85562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bqcz7q1u0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tzk1tzklusqkkon.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tzk1tzklusqkkon.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testWriterSerializerFeature",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bqcz7q1u0q() throws Exception{try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85562);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85563);SerializeWriter writer=new SerializeWriter();
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85564);writer.config(SerializerFeature.WriteEnumUsingToString,true);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85565);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85566);writer.config(SerializerFeature.WriteEnumUsingName,true);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85567);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingName));
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85568);Assert.assertFalse(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85569);writer.config(SerializerFeature.WriteEnumUsingToString,true);
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85570);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_1_101tzk1tzklusqkkon.R.inc(85571);Assert.assertFalse(writer.isEnabled(SerializerFeature.WriteEnumUsingName));
    }finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}

    public static enum Sex {
		M("\u7537"),
		W("\u5973");
		private String msg;
		
		Sex(String msg) {try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85572);
			__CLR4_1_101tzk1tzklusqkkon.R.inc(85573);this.msg = msg;
		}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}
		
		@Override
		public String toString() {try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85574);
			__CLR4_1_101tzk1tzklusqkkon.R.inc(85575);return msg;
		}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}
	}
	
	public static class Pojo {
		private Sex sex;
		
		public Sex getSex() {try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85576);
			__CLR4_1_101tzk1tzklusqkkon.R.inc(85577);return sex;
		}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}
		
		public void setSex(Sex sex) {try{__CLR4_1_101tzk1tzklusqkkon.R.inc(85578);
			__CLR4_1_101tzk1tzklusqkkon.R.inc(85579);this.sex = sex;
		}finally{__CLR4_1_101tzk1tzklusqkkon.R.flushNeeded();}}
	}
}
