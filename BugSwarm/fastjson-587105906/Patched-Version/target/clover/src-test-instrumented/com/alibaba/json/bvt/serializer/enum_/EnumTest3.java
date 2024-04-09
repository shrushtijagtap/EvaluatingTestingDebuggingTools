/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
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
public class EnumTest3 {static class __CLR4_5_21uxh1uxhlusvngqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,86801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	@Test
	public void testDefault() throws Exception {__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceStart(getClass().getName(),86741);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xwf06u1uxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxh1uxhlusvngqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86741,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xwf06u1uxh() throws Exception{try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86741);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86742);String json = JSON.toJSONString(Sex.M);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86743);Assert.assertEquals(json, "\"M\"");
		
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86744);Pojo pojo = new Pojo();
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86745);pojo.setSex(Sex.M);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86746);json = JSON.toJSONString(pojo);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86747);Assert.assertEquals(json, "{\"sex\":\"M\"}");

        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86748);try {
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86749);JSON.parseObject(json, Pojo.class);
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86750);Assert.assertTrue(true);
        } catch (Exception e) {
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86751);Assert.fail("\u679a\u4e3e\u9ed8\u8ba4\u5e8f\u5217\u5316name\u503c\uff0c\u53ef\u4ee5\u53cd\u5e8f\u5217\u5316\u6210\u529f");
        }

		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86752);Map<String, Pojo> map = new HashMap<String, Pojo>();
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86753);map.put("a", pojo);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86754);json = JSON.toJSONString(map);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86755);Assert.assertEquals(json, "{\"a\":{\"sex\":\"M\"}}");
		
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86756);Map<Sex, Pojo> enumMap = new EnumMap<Sex, Pojo>(Sex.class);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86757);enumMap.put(Sex.M, pojo);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86758);json = JSON.toJSONString(enumMap);
		__CLR4_5_21uxh1uxhlusvngqf.R.inc(86759);Assert.assertEquals(json, "{\"M\":{\"sex\":\"M\"}}");
	}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}
	
	@Test
    public void testDefault1() throws Exception {__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceStart(getClass().getName(),86760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ozom2x1uy0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxh1uxhlusvngqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ozom2x1uy0() throws Exception{try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86760);
//        JSON.DUMP_CLASS = "/Users/bohr/Downloads/tmp";
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86761);String json = JSON.toJSONString(Sex.M, SerializerFeature.WriteEnumUsingToString);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86762);Assert.assertEquals(json, "\"\u7537\"");
	}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}

    @Test
    public void testDefault2() throws Exception {__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceStart(getClass().getName(),86763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s8okve1uy3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxh1uxhlusvngqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testDefault2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86763,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s8okve1uy3() throws Exception{try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86763);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86764);Pojo pojo = new Pojo();
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86765);pojo.setSex(Sex.M);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86766);String json = JSON.toJSONString(pojo, SerializerFeature.WriteEnumUsingToString);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86767);Assert.assertEquals(json, "{\"sex\":\"\u7537\"}");
        
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86768);try {
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86769);Pojo pojo1 = JSON.parseObject(json, Pojo.class);
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86770);Assert.assertNull(pojo1.getSex());
        } catch (Exception e) {
            __CLR4_5_21uxh1uxhlusvngqf.R.inc(86771);Assert.assertTrue(true);
        }

        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86772);Map<String, Pojo> map = new HashMap<String, Pojo>();
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86773);map.put("a", pojo);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86774);json = JSON.toJSONString(map, SerializerFeature.WriteEnumUsingToString);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86775);Assert.assertEquals(json, "{\"a\":{\"sex\":\"\u7537\"}}");

        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86776);Map<Sex, Pojo> enumMap = new EnumMap<Sex, Pojo>(Sex.class);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86777);enumMap.put(Sex.M, pojo);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86778);json = JSON.toJSONString(enumMap, SerializerFeature.WriteEnumUsingToString);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86779);Assert.assertEquals(json, "{\"\u7537\":{\"sex\":\"\u7537\"}}");
    }finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}

    @Test
    public void testName() throws Exception {__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceStart(getClass().getName(),86780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ufa5981uyk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxh1uxhlusvngqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testName",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86780,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ufa5981uyk() throws Exception{try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86780);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86781);Assert.assertEquals("\"\u7537\"", JSON.toJSONString(Sex.M, SerializerFeature.WriteEnumUsingToString));
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86782);Assert.assertEquals("\"\u5973\"", JSON.toJSONString(Sex.W, SerializerFeature.WriteEnumUsingToString));
    }finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}

    @Test
    public void testWriterSerializerFeature() throws Exception {__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceStart(getClass().getName(),86783);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2bqcz7q1uyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21uxh1uxhlusvngqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21uxh1uxhlusvngqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest3.testWriterSerializerFeature",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86783,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2bqcz7q1uyn() throws Exception{try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86783);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86784);SerializeWriter writer=new SerializeWriter();
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86785);writer.config(SerializerFeature.WriteEnumUsingToString,true);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86786);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86787);writer.config(SerializerFeature.WriteEnumUsingName,true);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86788);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingName));
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86789);Assert.assertFalse(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86790);writer.config(SerializerFeature.WriteEnumUsingToString,true);
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86791);Assert.assertTrue(writer.isEnabled(SerializerFeature.WriteEnumUsingToString));
        __CLR4_5_21uxh1uxhlusvngqf.R.inc(86792);Assert.assertFalse(writer.isEnabled(SerializerFeature.WriteEnumUsingName));
    }finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}

    public static enum Sex {
		M("\u7537"),
		W("\u5973");
		private String msg;
		
		Sex(String msg) {try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86793);
			__CLR4_5_21uxh1uxhlusvngqf.R.inc(86794);this.msg = msg;
		}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}
		
		@Override
		public String toString() {try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86795);
			__CLR4_5_21uxh1uxhlusvngqf.R.inc(86796);return msg;
		}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}
	}
	
	public static class Pojo {
		private Sex sex;
		
		public Sex getSex() {try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86797);
			__CLR4_5_21uxh1uxhlusvngqf.R.inc(86798);return sex;
		}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}
		
		public void setSex(Sex sex) {try{__CLR4_5_21uxh1uxhlusvngqf.R.inc(86799);
			__CLR4_5_21uxh1uxhlusvngqf.R.inc(86800);this.sex = sex;
		}finally{__CLR4_5_21uxh1uxhlusvngqf.R.flushNeeded();}}
	}
}
