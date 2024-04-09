/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.generic;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class GenericTest2 extends TestCase {static class __CLR4_5_21nie1nielusvnesk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,77162,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_for_bingyang() throws Exception {__CLR4_5_21nie1nielusvnesk.R.globalSliceStart(getClass().getName(),77126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nernjp1nie();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21nie1nielusvnesk.R.rethrow($CLV_t2$);}finally{__CLR4_5_21nie1nielusvnesk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.generic.GenericTest2.test_for_bingyang",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),77126,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nernjp1nie() throws Exception{try{__CLR4_5_21nie1nielusvnesk.R.inc(77126);
		__CLR4_5_21nie1nielusvnesk.R.inc(77127);String text = "{\"count\":123,\"index\":7,\"items\":[{\"id\":234,\"latitude\":2.5,\"longtitude\":3.7}]}";
		__CLR4_5_21nie1nielusvnesk.R.inc(77128);PageBean<ActiveBase> pageBean = JSON.parseObject(text, new TypeReference<PageBean<ActiveBase>>() {});
		__CLR4_5_21nie1nielusvnesk.R.inc(77129);Assert.assertNotNull(pageBean);
		__CLR4_5_21nie1nielusvnesk.R.inc(77130);Assert.assertEquals(123, pageBean.getCount());
		__CLR4_5_21nie1nielusvnesk.R.inc(77131);Assert.assertEquals(7, pageBean.getIndex());
		__CLR4_5_21nie1nielusvnesk.R.inc(77132);Assert.assertNotNull(pageBean.getItems());
		__CLR4_5_21nie1nielusvnesk.R.inc(77133);Assert.assertEquals(1, pageBean.getItems().size());
		__CLR4_5_21nie1nielusvnesk.R.inc(77134);ActiveBase active = pageBean.getItems().get(0);
		__CLR4_5_21nie1nielusvnesk.R.inc(77135);Assert.assertEquals(new Integer(234), active.getId());
		__CLR4_5_21nie1nielusvnesk.R.inc(77136);Assert.assertTrue(3.7D == active.getLongtitude());
		__CLR4_5_21nie1nielusvnesk.R.inc(77137);Assert.assertTrue(2.5D == active.getLatitude());
	}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

	public static class ActiveBase extends BaseModel {
		private double latitude;
		private double longtitude;
		public double getLatitude() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77138);
			__CLR4_5_21nie1nielusvnesk.R.inc(77139);return latitude;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}
		public void setLatitude(double latitude) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77140);
			__CLR4_5_21nie1nielusvnesk.R.inc(77141);this.latitude = latitude;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}
		public double getLongtitude() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77142);
			__CLR4_5_21nie1nielusvnesk.R.inc(77143);return longtitude;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}
		public void setLongtitude(double longtitude) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77144);
			__CLR4_5_21nie1nielusvnesk.R.inc(77145);this.longtitude = longtitude;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}
	}

	public static class BaseModel {
		private Integer id;

		public Integer getId() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77146);
			__CLR4_5_21nie1nielusvnesk.R.inc(77147);return id;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public void setId(Integer id) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77148);
			__CLR4_5_21nie1nielusvnesk.R.inc(77149);this.id = id;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}
	}

	public static class PageBean<T> {
		private int count;
		private int index;
		private List<T> items;

		public int getCount() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77150);
			__CLR4_5_21nie1nielusvnesk.R.inc(77151);return count;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public void setCount(int count) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77152);
			__CLR4_5_21nie1nielusvnesk.R.inc(77153);this.count = count;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public int getIndex() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77154);
			__CLR4_5_21nie1nielusvnesk.R.inc(77155);return index;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public void setIndex(int index) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77156);
			__CLR4_5_21nie1nielusvnesk.R.inc(77157);this.index = index;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public List<T> getItems() {try{__CLR4_5_21nie1nielusvnesk.R.inc(77158);
			__CLR4_5_21nie1nielusvnesk.R.inc(77159);return items;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

		public void setItems(List<T> items) {try{__CLR4_5_21nie1nielusvnesk.R.inc(77160);
			__CLR4_5_21nie1nielusvnesk.R.inc(77161);this.items = items;
		}finally{__CLR4_5_21nie1nielusvnesk.R.flushNeeded();}}

	}
}
