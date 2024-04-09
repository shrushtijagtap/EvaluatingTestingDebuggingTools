/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

public class JSONFieldDefaultValueTest extends TestCase {static class __CLR4_5_2xosxoslusvn2vg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,43791,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_default_value() throws Exception {__CLR4_5_2xosxoslusvn2vg.R.globalSliceStart(getClass().getName(),43660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24k4oelxos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xosxoslusvn2vg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xosxoslusvn2vg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFieldDefaultValueTest.test_default_value",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24k4oelxos() throws Exception{try{__CLR4_5_2xosxoslusvn2vg.R.inc(43660);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43661);Model m = new Model();
		__CLR4_5_2xosxoslusvn2vg.R.inc(43662);String s = JSON.toJSONString(m);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43663);System.out.println(s);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43664);Model m2 = JSON.parseObject(s, Model.class);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43665);assertEquals("string", m2.getString());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43666);assertEquals(false, m2.getaBoolean());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43667);assertEquals(true, m2.getaBoolean2().booleanValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43668);assertEquals(0, m2.getAnInt());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43669);assertEquals(888, m2.getInteger().intValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43670);assertEquals(0, m2.getaShort());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43671);assertEquals(88, m2.getaShort2().shortValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43672);assertEquals('\u0000', m2.getaChar());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43673);assertEquals('J', m2.getCharacter().charValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43674);assertEquals(0, m2.getaByte());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43675);assertEquals(8, m2.getaByte2().byteValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43676);assertEquals(0, m2.getaLong());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43677);assertEquals(8888, m2.getaLong2().longValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43678);assertEquals("0.0", "" + m2.getaFloat());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43679);assertEquals("8.8", "" + m2.getaFloat2());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43680);assertEquals("0.0", "" + m2.getaDouble());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43681);assertEquals("88.88", "" + m2.getaDouble2());
	}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

	public void test_not_null() throws Exception {__CLR4_5_2xosxoslusvn2vg.R.globalSliceStart(getClass().getName(),43682);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e1jumfxpe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2xosxoslusvn2vg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2xosxoslusvn2vg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.JSONFieldDefaultValueTest.test_not_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),43682,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e1jumfxpe() throws Exception{try{__CLR4_5_2xosxoslusvn2vg.R.inc(43682);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43683);Model m = new Model("test", true, 888, (short)88, 'J', (byte)8, 8888L, 8.8F, 88.88, false, 999, (short)99, 'C', (byte)9, 9999L, 9.9F, 99.99);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43684);String s = JSON.toJSONString(m);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43685);System.out.println(s);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43686);Model m2 = JSON.parseObject(s, Model.class);
		__CLR4_5_2xosxoslusvn2vg.R.inc(43687);assertEquals("test", m2.getString());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43688);assertEquals(true, m2.getaBoolean());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43689);assertEquals(false, m2.getaBoolean2().booleanValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43690);assertEquals(888, m2.getAnInt());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43691);assertEquals(999, m2.getInteger().intValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43692);assertEquals(88, m2.getaShort());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43693);assertEquals(99, m2.getaShort2().shortValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43694);assertEquals('J', m2.getaChar());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43695);assertEquals('C', m2.getCharacter().charValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43696);assertEquals(8, m2.getaByte());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43697);assertEquals(9, m2.getaByte2().byteValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43698);assertEquals(8888, m2.getaLong());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43699);assertEquals(9999, m2.getaLong2().longValue());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43700);assertEquals("8.8", "" + m2.getaFloat());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43701);assertEquals("9.9", "" + m2.getaFloat2());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43702);assertEquals("88.88", "" + m2.getaDouble());
		__CLR4_5_2xosxoslusvn2vg.R.inc(43703);assertEquals("99.99", "" + m2.getaDouble2());
	}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

	public static class Model {
		@JSONField(defaultValue = "string")
		private String string;

		@JSONField(defaultValue = "true") //shouldn't work
		private boolean aBoolean;
		@JSONField(defaultValue = "888") //shouldn't work
		private int anInt;
		@JSONField(defaultValue = "88") //shouldn't work
		private short aShort;
		@JSONField(defaultValue = "J") //shouldn't work
		private char aChar;
		@JSONField(defaultValue = "8") //shouldn't work
		private byte aByte;
		@JSONField(defaultValue = "8888") //shouldn't work
		private long aLong;
		@JSONField(defaultValue = "8.8") //shouldn't work
		private float aFloat;
		@JSONField(defaultValue = "88.88") //shouldn't work
		private double aDouble;

		@JSONField(defaultValue = "true")
		private Boolean aBoolean2;
		@JSONField(defaultValue = "888")
		private Integer integer;
		@JSONField(defaultValue = "88")
		private Short aShort2;
		@JSONField(defaultValue = "J")
		private Character character;
		@JSONField(defaultValue = "8")
		private Byte aByte2;
		@JSONField(defaultValue = "8888")
		private Long aLong2;
		@JSONField(defaultValue = "8.8")
		private Float aFloat2;
		@JSONField(defaultValue = "88.88")
		private Double aDouble2;

		public Model(String string, boolean aBoolean, int anInt, short aShort, char aChar,
					 byte aByte, long aLong, float aFloat, double aDouble,
					 Boolean aBoolean2, Integer integer, Short aShort2, Character character,
					 Byte aByte2, Long aLong2, Float aFloat2, Double aDouble2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43704);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43705);this.string = string;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43706);this.aBoolean = aBoolean;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43707);this.anInt = anInt;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43708);this.aShort = aShort;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43709);this.aChar = aChar;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43710);this.aByte = aByte;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43711);this.aLong = aLong;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43712);this.aFloat = aFloat;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43713);this.aDouble = aDouble;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43714);this.aBoolean2 = aBoolean2;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43715);this.integer = integer;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43716);this.aShort2 = aShort2;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43717);this.character = character;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43718);this.aByte2 = aByte2;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43719);this.aLong2 = aLong2;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43720);this.aFloat2 = aFloat2;
			__CLR4_5_2xosxoslusvn2vg.R.inc(43721);this.aDouble2 = aDouble2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Model() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43722);
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public String getString() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43723);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43724);return string;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setString(String string) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43725);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43726);this.string = string;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public boolean getaBoolean() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43727);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43728);return aBoolean;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaBoolean(boolean aBoolean) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43729);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43730);this.aBoolean = aBoolean;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public int getAnInt() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43731);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43732);return anInt;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setAnInt(int anInt) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43733);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43734);this.anInt = anInt;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public short getaShort() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43735);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43736);return aShort;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaShort(short aShort) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43737);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43738);this.aShort = aShort;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public char getaChar() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43739);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43740);return aChar;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaChar(char aChar) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43741);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43742);this.aChar = aChar;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public byte getaByte() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43743);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43744);return aByte;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaByte(byte aByte) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43745);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43746);this.aByte = aByte;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public long getaLong() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43747);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43748);return aLong;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaLong(long aLong) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43749);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43750);this.aLong = aLong;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public float getaFloat() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43751);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43752);return aFloat;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaFloat(float aFloat) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43753);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43754);this.aFloat = aFloat;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public double getaDouble() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43755);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43756);return aDouble;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaDouble(double aDouble) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43757);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43758);this.aDouble = aDouble;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Boolean getaBoolean2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43759);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43760);return aBoolean2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaBoolean2(Boolean aBoolean2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43761);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43762);this.aBoolean2 = aBoolean2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Integer getInteger() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43763);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43764);return integer;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setInteger(Integer integer) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43765);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43766);this.integer = integer;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Short getaShort2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43767);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43768);return aShort2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaShort2(Short aShort2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43769);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43770);this.aShort2 = aShort2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Character getCharacter() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43771);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43772);return character;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setCharacter(Character character) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43773);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43774);this.character = character;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Byte getaByte2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43775);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43776);return aByte2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaByte2(Byte aByte2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43777);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43778);this.aByte2 = aByte2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Long getaLong2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43779);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43780);return aLong2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaLong2(Long aLong2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43781);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43782);this.aLong2 = aLong2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Float getaFloat2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43783);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43784);return aFloat2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaFloat2(Float aFloat2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43785);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43786);this.aFloat2 = aFloat2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public Double getaDouble2() {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43787);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43788);return aDouble2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

		public void setaDouble2(Double aDouble2) {try{__CLR4_5_2xosxoslusvn2vg.R.inc(43789);
			__CLR4_5_2xosxoslusvn2vg.R.inc(43790);this.aDouble2 = aDouble2;
		}finally{__CLR4_5_2xosxoslusvn2vg.R.flushNeeded();}}

	}
}
