/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

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

public class Bug_for_Johnny extends TestCase {static class __CLR4_1_10133y133ylusqk1vw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,50768,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	protected void setUp() throws Exception {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50686);
		__CLR4_1_10133y133ylusqk1vw.R.inc(50687);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_Johnny.");
	}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

	public void test_bug()throws Exception {__CLR4_1_10133y133ylusqk1vw.R.globalSliceStart(getClass().getName(),50688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a1x2ge1340();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10133y133ylusqk1vw.R.rethrow($CLV_t2$);}finally{__CLR4_1_10133y133ylusqk1vw.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Johnny.test_bug",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50688,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a1x2ge1340()throws Exception{try{__CLR4_1_10133y133ylusqk1vw.R.inc(50688);
		__CLR4_1_10133y133ylusqk1vw.R.inc(50689);MyObject myObject = new MyObject();
        __CLR4_1_10133y133ylusqk1vw.R.inc(50690);List<String> listObj = new LinkedList<String>();
        __CLR4_1_10133y133ylusqk1vw.R.inc(50691);Set<String> setObj = new HashSet<String>();
        __CLR4_1_10133y133ylusqk1vw.R.inc(50692);Map<String, String> mapObj = new HashMap<String, String>();
        __CLR4_1_10133y133ylusqk1vw.R.inc(50693);listObj.add("aaa");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50694);listObj.add("bbb");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50695);setObj.add("aaa");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50696);setObj.add("bbb");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50697);mapObj.put("key", "value");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50698);myObject.setBoolType(true);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50699);myObject.setByteType(Byte.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50700);myObject.setCharType(Character.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50701);myObject.setDoubleType(Double.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50702);myObject.setFloatType(Float.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50703);myObject.setIntType(Integer.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50704);myObject.setLongType(Long.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50705);myObject.setShortType(Short.MIN_VALUE);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50706);myObject.setEnumType(EnumType.MD5);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50707);myObject.setStringType("aadf");
        __CLR4_1_10133y133ylusqk1vw.R.inc(50708);myObject.setMapType(mapObj);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50709);myObject.setSetType(setObj);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50710);myObject.setListType(listObj);
        
        __CLR4_1_10133y133ylusqk1vw.R.inc(50711);String text = JSON.toJSONString(myObject, SerializerFeature.WriteClassName);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50712);System.out.println(text);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50713);MyObject myObject2 = (MyObject) JSON.parse(text);
        __CLR4_1_10133y133ylusqk1vw.R.inc(50714);Assert.assertEquals(myObject2.getMapType(), myObject.getMapType());
	}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}
	
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

		public Set<String> getSetType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50715);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50716);return setType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public void setSetType(Set<String> setType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50717);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50718);this.setType = setType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the stringType
		 */
		public String getStringType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50719);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50720);return stringType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public EnumType getEnumType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50721);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50722);return enumType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public void setEnumType(EnumType enumType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50723);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50724);this.enumType = enumType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public List<String> getListType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50725);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50726);return ListType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public void setListType(List<String> listType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50727);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50728);ListType = listType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public Map<String, String> getMapType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50729);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50730);return mapType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		public void setMapType(Map<String, String> mapType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50731);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50732);this.mapType = mapType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param stringType
		 *            the stringType to set
		 */
		public void setStringType(String stringType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50733);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50734);this.stringType = stringType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the byteType
		 */
		public byte getByteType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50735);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50736);return byteType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param byteType
		 *            the byteType to set
		 */
		public void setByteType(byte byteType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50737);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50738);this.byteType = byteType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the shortType
		 */
		public short getShortType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50739);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50740);return shortType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param shortType
		 *            the shortType to set
		 */
		public void setShortType(short shortType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50741);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50742);this.shortType = shortType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the intType
		 */
		public int getIntType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50743);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50744);return intType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param intType
		 *            the intType to set
		 */
		public void setIntType(int intType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50745);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50746);this.intType = intType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the longType
		 */
		public long getLongType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50747);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50748);return longType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param longType
		 *            the longType to set
		 */
		public void setLongType(long longType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50749);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50750);this.longType = longType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the charType
		 */
		public char getCharType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50751);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50752);return charType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param charType
		 *            the charType to set
		 */
		public void setCharType(char charType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50753);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50754);this.charType = charType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the floatType
		 */
		public float getFloatType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50755);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50756);return floatType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param floatType
		 *            the floatType to set
		 */
		public void setFloatType(float floatType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50757);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50758);this.floatType = floatType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the doubleType
		 */
		public double getDoubleType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50759);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50760);return doubleType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param doubleType
		 *            the doubleType to set
		 */
		public void setDoubleType(double doubleType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50761);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50762);this.doubleType = doubleType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @return the boolType
		 */
		public boolean isBoolType() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50763);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50764);return boolType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * @param boolType
		 *            the boolType to set
		 */
		public void setBoolType(boolean boolType) {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50765);
			__CLR4_1_10133y133ylusqk1vw.R.inc(50766);this.boolType = boolType;
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}

		/**
		 * Constructs a <code>GroupEntity</code> <br>
		 */
		public MyObject() {try{__CLR4_1_10133y133ylusqk1vw.R.inc(50767);
		}finally{__CLR4_1_10133y133ylusqk1vw.R.flushNeeded();}}
	}
}
