/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2500;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class Issue2579 extends TestCase {static class __CLR4_5_21epi1epilusvnbsq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,65818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	// \u573a\u666f\uff1a\u8d70ASM
	public void test_for_issue1() throws Exception {__CLR4_5_21epi1epilusvnbsq.R.globalSliceStart(getClass().getName(),65718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oo900y1epi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21epi1epilusvnbsq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21epi1epilusvnbsq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2500.Issue2579.test_for_issue1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oo900y1epi() throws Exception{try{__CLR4_5_21epi1epilusvnbsq.R.inc(65718);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65719);run_test("MyPoint1");
	}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u4e0d\u8d70ASM,\u901a\u8fc7JSONType\uff08asm=false\uff09\uff0c\u5173\u95ed\u4e86ASM
	public void test_for_issue2() throws Exception {__CLR4_5_21epi1epilusvnbsq.R.globalSliceStart(getClass().getName(),65720);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rx8ytf1epk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21epi1epilusvnbsq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21epi1epilusvnbsq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2500.Issue2579.test_for_issue2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65720,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rx8ytf1epk() throws Exception{try{__CLR4_5_21epi1epilusvnbsq.R.inc(65720);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65721);run_test("MyPoint2");
	}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	// \u573a\u666f\uff1a\u968f\u673a\u987a\u5e8f\u7ec4\u5408JSON\u5b57\u7b26\u4e32\u6d4b\u8bd52000\u6b21
	private void run_test(String className) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65722);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65723);String begin = "{";
		__CLR4_5_21epi1epilusvnbsq.R.inc(65724);String end = "}";
		__CLR4_5_21epi1epilusvnbsq.R.inc(65725);String jsonString;
		__CLR4_5_21epi1epilusvnbsq.R.inc(65726);for (int i = 1; (((i < 2000)&&(__CLR4_5_21epi1epilusvnbsq.R.iget(65727)!=0|true))||(__CLR4_5_21epi1epilusvnbsq.R.iget(65728)==0&false)); i++) {{
			__CLR4_5_21epi1epilusvnbsq.R.inc(65729);jsonString = getString(i, className);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65730);jsonString = begin + jsonString + end;
			__CLR4_5_21epi1epilusvnbsq.R.inc(65731);try {
				__CLR4_5_21epi1epilusvnbsq.R.inc(65732);Object obj = JSON.parse(jsonString, Feature.SupportAutoType);
				__CLR4_5_21epi1epilusvnbsq.R.inc(65733);if (((("MyPoint1".equals(className))&&(__CLR4_5_21epi1epilusvnbsq.R.iget(65734)!=0|true))||(__CLR4_5_21epi1epilusvnbsq.R.iget(65735)==0&false))) {{
					__CLR4_5_21epi1epilusvnbsq.R.inc(65736);Assert.assertEquals(i, ((MyPoint1) obj).getBatchNumber());
				} }else {{
					__CLR4_5_21epi1epilusvnbsq.R.inc(65737);Assert.assertEquals(i, ((MyPoint2) obj).getBatchNumber());
				}
			}} catch (JSONException e) {
				__CLR4_5_21epi1epilusvnbsq.R.inc(65738);System.out.println(jsonString);
				__CLR4_5_21epi1epilusvnbsq.R.inc(65739);e.printStackTrace();
				__CLR4_5_21epi1epilusvnbsq.R.inc(65740);Assert.assertTrue(false);
			}
		}
	}}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	private static String getString(int batchNumber, String className) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65741);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65742);List<String> list = new ArrayList<String>();
		__CLR4_5_21epi1epilusvnbsq.R.inc(65743);list.add("\"@type\":\"com.alibaba.json.bvt.issue_2500.Issue2579$" + className + "\"");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65744);list.add("\"date\":1563867975335");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65745);list.add("\"id\":\"0f075036-9e52-4821-800a-9c51761a7227b\"");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65746);list.add("\"location\":{\"@type\":\"java.awt.Point\",\"x\":11,\"y\":1}");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65747);list.add("\"point\":{\"@type\":\"java.awt.Point\",\"x\":9,\"y\":1}");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65748);list.add(
				"\"pointArr\":[{\"@type\":\"java.awt.Point\",\"x\":4,\"y\":6},{\"@type\":\"java.awt.Point\",\"x\":7,\"y\":8}]");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65749);list.add("\"strArr\":[\"te-st\",\"tes-t2\"]");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65750);list.add("\"x\":2.0D");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65751);list.add("\"y\":3.0D");
		__CLR4_5_21epi1epilusvnbsq.R.inc(65752);list.add("\"batchNumber\":" + batchNumber);

		__CLR4_5_21epi1epilusvnbsq.R.inc(65753);Iterator<String> it = list.iterator();
		__CLR4_5_21epi1epilusvnbsq.R.inc(65754);StringBuffer buffer = new StringBuffer();
		__CLR4_5_21epi1epilusvnbsq.R.inc(65755);int len;
		__CLR4_5_21epi1epilusvnbsq.R.inc(65756);int index;
		__CLR4_5_21epi1epilusvnbsq.R.inc(65757);while ((((it.hasNext())&&(__CLR4_5_21epi1epilusvnbsq.R.iget(65758)!=0|true))||(__CLR4_5_21epi1epilusvnbsq.R.iget(65759)==0&false))) {{
			__CLR4_5_21epi1epilusvnbsq.R.inc(65760);len = list.size();
			__CLR4_5_21epi1epilusvnbsq.R.inc(65761);index = getRandomIndex(len);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65762);buffer.append(list.get(index));
			__CLR4_5_21epi1epilusvnbsq.R.inc(65763);buffer.append(",");
			__CLR4_5_21epi1epilusvnbsq.R.inc(65764);list.remove(index);
		}
		}__CLR4_5_21epi1epilusvnbsq.R.inc(65765);buffer.deleteCharAt(buffer.length() - 1);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65766);return buffer.toString();
	}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	private static int getRandomIndex(int length) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65767);
		__CLR4_5_21epi1epilusvnbsq.R.inc(65768);Random random = new Random();
		__CLR4_5_21epi1epilusvnbsq.R.inc(65769);return random.nextInt(length);
	}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	@SuppressWarnings("serial")
	public static class MyPoint1 extends Point {
		private UUID id;
		private int batchNumber;
		private Point point = new Point();
		private String[] strArr = { "te-st", "tes-t2" };
		private Date date = new Date();
		private Point[] pointArr = { new Point(), new Point() };

		public UUID getId() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65770);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65771);return id;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setId(UUID id) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65772);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65773);this.id = id;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public int getBatchNumber() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65774);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65775);return batchNumber;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setBatchNumber(int batchNumber) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65776);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65777);this.batchNumber = batchNumber;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Point getPoint() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65778);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65779);return point;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setPoint(Point point) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65780);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65781);this.point = point;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public String[] getStrArr() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65782);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65783);return strArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setStrArr(String[] strArr) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65784);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65785);this.strArr = strArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Date getDate() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65786);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65787);return date;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setDate(Date date) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65788);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65789);this.date = date;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Point[] getPointArr() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65790);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65791);return pointArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setPointArr(Point[] pointArr) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65792);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65793);this.pointArr = pointArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	}

	@SuppressWarnings("serial")
	@JSONType(asm = false)
	public static class MyPoint2 extends Point {
		private UUID id;
		private int batchNumber;
		private Point point = new Point();
		private String[] strArr = { "te-st", "tes-t2" };
		private Date date = new Date();
		private Point[] pointArr = { new Point(), new Point() };

		public UUID getId() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65794);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65795);return id;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setId(UUID id) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65796);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65797);this.id = id;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public int getBatchNumber() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65798);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65799);return batchNumber;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setBatchNumber(int batchNumber) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65800);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65801);this.batchNumber = batchNumber;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Point getPoint() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65802);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65803);return point;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setPoint(Point point) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65804);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65805);this.point = point;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public String[] getStrArr() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65806);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65807);return strArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setStrArr(String[] strArr) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65808);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65809);this.strArr = strArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Date getDate() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65810);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65811);return date;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setDate(Date date) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65812);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65813);this.date = date;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public Point[] getPointArr() {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65814);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65815);return pointArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

		public void setPointArr(Point[] pointArr) {try{__CLR4_5_21epi1epilusvnbsq.R.inc(65816);
			__CLR4_5_21epi1epilusvnbsq.R.inc(65817);this.pointArr = pointArr;
		}finally{__CLR4_5_21epi1epilusvnbsq.R.flushNeeded();}}

	}
}
