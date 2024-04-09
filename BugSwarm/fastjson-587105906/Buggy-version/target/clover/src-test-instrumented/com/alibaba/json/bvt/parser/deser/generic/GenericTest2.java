/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.generic;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class GenericTest2 extends TestCase {static class __CLR4_1_101mkh1mkhlusqkgxw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,75941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_for_bingyang() throws Exception {__CLR4_1_101mkh1mkhlusqkgxw.R.globalSliceStart(getClass().getName(),75905);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nernjp1mkh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mkh1mkhlusqkgxw.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.generic.GenericTest2.test_for_bingyang",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75905,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nernjp1mkh() throws Exception{try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75905);
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75906);String text = "{\"count\":123,\"index\":7,\"items\":[{\"id\":234,\"latitude\":2.5,\"longtitude\":3.7}]}";
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75907);PageBean<ActiveBase> pageBean = JSON.parseObject(text, new TypeReference<PageBean<ActiveBase>>() {});
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75908);Assert.assertNotNull(pageBean);
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75909);Assert.assertEquals(123, pageBean.getCount());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75910);Assert.assertEquals(7, pageBean.getIndex());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75911);Assert.assertNotNull(pageBean.getItems());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75912);Assert.assertEquals(1, pageBean.getItems().size());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75913);ActiveBase active = pageBean.getItems().get(0);
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75914);Assert.assertEquals(new Integer(234), active.getId());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75915);Assert.assertTrue(3.7D == active.getLongtitude());
		__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75916);Assert.assertTrue(2.5D == active.getLatitude());
	}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

	public static class ActiveBase extends BaseModel {
		private double latitude;
		private double longtitude;
		public double getLatitude() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75917);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75918);return latitude;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}
		public void setLatitude(double latitude) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75919);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75920);this.latitude = latitude;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}
		public double getLongtitude() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75921);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75922);return longtitude;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}
		public void setLongtitude(double longtitude) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75923);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75924);this.longtitude = longtitude;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}
	}

	public static class BaseModel {
		private Integer id;

		public Integer getId() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75925);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75926);return id;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public void setId(Integer id) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75927);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75928);this.id = id;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}
	}

	public static class PageBean<T> {
		private int count;
		private int index;
		private List<T> items;

		public int getCount() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75929);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75930);return count;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public void setCount(int count) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75931);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75932);this.count = count;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public int getIndex() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75933);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75934);return index;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public void setIndex(int index) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75935);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75936);this.index = index;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public List<T> getItems() {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75937);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75938);return items;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

		public void setItems(List<T> items) {try{__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75939);
			__CLR4_1_101mkh1mkhlusqkgxw.R.inc(75940);this.items = items;
		}finally{__CLR4_1_101mkh1mkhlusqkgxw.R.flushNeeded();}}

	}
}
