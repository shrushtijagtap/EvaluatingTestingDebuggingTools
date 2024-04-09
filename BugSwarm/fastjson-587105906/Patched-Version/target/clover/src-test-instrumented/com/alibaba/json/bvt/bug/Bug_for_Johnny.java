/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_Johnny extends TestCase {static class __CLR4_5_2141v141vlusvn5r1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	protected void setUp() throws Exception {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51907);
		__CLR4_5_2141v141vlusvn5r1.R.inc(51908);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_Johnny.");
	}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

	public void test_bug()throws Exception {__CLR4_5_2141v141vlusvn5r1.R.globalSliceStart(getClass().getName(),51909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a1x2ge141x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2141v141vlusvn5r1.R.rethrow($CLV_t2$);}finally{__CLR4_5_2141v141vlusvn5r1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Johnny.test_bug",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51909,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a1x2ge141x()throws Exception{try{__CLR4_5_2141v141vlusvn5r1.R.inc(51909);
		__CLR4_5_2141v141vlusvn5r1.R.inc(51910);MyObject myObject = new MyObject();
        __CLR4_5_2141v141vlusvn5r1.R.inc(51911);List<String> listObj = new LinkedList<String>();
        __CLR4_5_2141v141vlusvn5r1.R.inc(51912);Set<String> setObj = new HashSet<String>();
        __CLR4_5_2141v141vlusvn5r1.R.inc(51913);Map<String, String> mapObj = new HashMap<String, String>();
        __CLR4_5_2141v141vlusvn5r1.R.inc(51914);listObj.add("aaa");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51915);listObj.add("bbb");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51916);setObj.add("aaa");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51917);setObj.add("bbb");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51918);mapObj.put("key", "value");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51919);myObject.setBoolType(true);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51920);myObject.setByteType(Byte.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51921);myObject.setCharType(Character.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51922);myObject.setDoubleType(Double.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51923);myObject.setFloatType(Float.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51924);myObject.setIntType(Integer.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51925);myObject.setLongType(Long.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51926);myObject.setShortType(Short.MIN_VALUE);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51927);myObject.setEnumType(EnumType.MD5);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51928);myObject.setStringType("aadf");
        __CLR4_5_2141v141vlusvn5r1.R.inc(51929);myObject.setMapType(mapObj);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51930);myObject.setSetType(setObj);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51931);myObject.setListType(listObj);
        
        __CLR4_5_2141v141vlusvn5r1.R.inc(51932);String text = JSON.toJSONString(myObject, SerializerFeature.WriteClassName);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51933);System.out.println(text);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51934);MyObject myObject2 = (MyObject) JSON.parse(text);
        __CLR4_5_2141v141vlusvn5r1.R.inc(51935);Assert.assertEquals(myObject2.getMapType(), myObject.getMapType());
	}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}
	
	public static enum EnumType {
		MD5, SHA1
	}

	public static class MyObject {

		private String stringType;
		private byte byteType;
		private short shortType;
		private int intType;
		private long longType;
		private char charType;
		private float floatType;
		private double doubleType;
		private boolean boolType;
		private List<String> ListType;
		private Map<String, String> mapType;
		private Set<String> setType;
		private EnumType enumType;

		public Set<String> getSetType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51936);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51937);return setType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public void setSetType(Set<String> setType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51938);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51939);this.setType = setType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the stringType
		 */
		public String getStringType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51940);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51941);return stringType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public EnumType getEnumType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51942);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51943);return enumType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public void setEnumType(EnumType enumType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51944);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51945);this.enumType = enumType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public List<String> getListType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51946);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51947);return ListType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public void setListType(List<String> listType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51948);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51949);ListType = listType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public Map<String, String> getMapType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51950);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51951);return mapType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		public void setMapType(Map<String, String> mapType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51952);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51953);this.mapType = mapType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param stringType
		 *            the stringType to set
		 */
		public void setStringType(String stringType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51954);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51955);this.stringType = stringType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the byteType
		 */
		public byte getByteType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51956);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51957);return byteType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param byteType
		 *            the byteType to set
		 */
		public void setByteType(byte byteType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51958);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51959);this.byteType = byteType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the shortType
		 */
		public short getShortType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51960);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51961);return shortType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param shortType
		 *            the shortType to set
		 */
		public void setShortType(short shortType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51962);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51963);this.shortType = shortType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the intType
		 */
		public int getIntType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51964);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51965);return intType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param intType
		 *            the intType to set
		 */
		public void setIntType(int intType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51966);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51967);this.intType = intType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the longType
		 */
		public long getLongType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51968);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51969);return longType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param longType
		 *            the longType to set
		 */
		public void setLongType(long longType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51970);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51971);this.longType = longType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the charType
		 */
		public char getCharType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51972);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51973);return charType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param charType
		 *            the charType to set
		 */
		public void setCharType(char charType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51974);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51975);this.charType = charType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the floatType
		 */
		public float getFloatType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51976);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51977);return floatType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param floatType
		 *            the floatType to set
		 */
		public void setFloatType(float floatType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51978);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51979);this.floatType = floatType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the doubleType
		 */
		public double getDoubleType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51980);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51981);return doubleType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param doubleType
		 *            the doubleType to set
		 */
		public void setDoubleType(double doubleType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51982);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51983);this.doubleType = doubleType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @return the boolType
		 */
		public boolean isBoolType() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51984);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51985);return boolType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * @param boolType
		 *            the boolType to set
		 */
		public void setBoolType(boolean boolType) {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51986);
			__CLR4_5_2141v141vlusvn5r1.R.inc(51987);this.boolType = boolType;
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}

		/**
		 * Constructs a <code>GroupEntity</code> <br>
		 */
		public MyObject() {try{__CLR4_5_2141v141vlusvn5r1.R.inc(51988);
		}finally{__CLR4_5_2141v141vlusvn5r1.R.flushNeeded();}}
	}
}
