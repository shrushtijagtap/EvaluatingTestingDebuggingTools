/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class ClobSeriliazerTest extends TestCase {static class __CLR4_5_21qt21qt2lusyjutc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81449,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public void test_clob() throws Exception {__CLR4_5_21qt21qt2lusyjutc.R.globalSliceStart(getClass().getName(),81398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2934rps1qt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qt21qt2lusyjutc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qt21qt2lusyjutc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ClobSeriliazerTest.test_clob",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2934rps1qt2() throws Exception{try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81398);
		__CLR4_5_21qt21qt2lusyjutc.R.inc(81399);Assert.assertEquals("\"abcdefg\u4e2d\u56fd\"",
				JSON.toJSONString(new MockClob("abcdefg\u4e2d\u56fd")));
	}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

	public void test_clob_null() throws Exception {__CLR4_5_21qt21qt2lusyjutc.R.globalSliceStart(getClass().getName(),81400);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rcls641qt4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qt21qt2lusyjutc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qt21qt2lusyjutc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ClobSeriliazerTest.test_clob_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81400,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rcls641qt4() throws Exception{try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81400);
		__CLR4_5_21qt21qt2lusyjutc.R.inc(81401);Assert.assertEquals("{\"value\":null}", JSON.toJSONString(new VO(),
				SerializerFeature.WriteMapNullValue));
	}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

	public void test_clob_error() throws Exception {__CLR4_5_21qt21qt2lusyjutc.R.globalSliceStart(getClass().getName(),81402);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2sr32s91qt6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qt21qt2lusyjutc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qt21qt2lusyjutc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ClobSeriliazerTest.test_clob_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81402,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2sr32s91qt6() throws Exception{try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81402);
		__CLR4_5_21qt21qt2lusyjutc.R.inc(81403);Exception error = null;
		__CLR4_5_21qt21qt2lusyjutc.R.inc(81404);try {
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81405);JSON.toJSONString(new MockClob(new SQLException()));
		} catch (Exception ex) {
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81406);error = ex;
		}
		__CLR4_5_21qt21qt2lusyjutc.R.inc(81407);Assert.assertNotNull(error);
	}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

	@SuppressWarnings("unused")
	private static class VO {
		private Clob value;

		public Clob getValue() {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81408);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81409);return value;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public void setValue(Clob value) {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81410);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81411);this.value = value;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}
	}

	public static class MockClob implements Clob {
		private final String text;

		private SQLException error;

		public MockClob(String text) {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81412);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81413);this.text = text;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public MockClob(SQLException error) {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81414);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81415);this.text = null;
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81416);this.error = error;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public SQLException getError() {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81417);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81418);return error;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public void setError(SQLException error) {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81419);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81420);this.error = error;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public long length() throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81421);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81422);return 0;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public String getSubString(long pos, int length) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81423);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81424);return null;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public Reader getCharacterStream() throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81425);
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81426);if ((((error != null)&&(__CLR4_5_21qt21qt2lusyjutc.R.iget(81427)!=0|true))||(__CLR4_5_21qt21qt2lusyjutc.R.iget(81428)==0&false))) {{
				__CLR4_5_21qt21qt2lusyjutc.R.inc(81429);throw error;
			}
			}__CLR4_5_21qt21qt2lusyjutc.R.inc(81430);return new StringReader(text);
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public InputStream getAsciiStream() throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81431);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81432);return null;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public long position(String searchstr, long start) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81433);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81434);return 0;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public long position(Clob searchstr, long start) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81435);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81436);return 0;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public int setString(long pos, String str) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81437);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81438);return 0;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public int setString(long pos, String str, int offset, int len)
				throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81439);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81440);return 0;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public OutputStream setAsciiStream(long pos) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81441);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81442);return null;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public Writer setCharacterStream(long pos) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81443);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81444);return null;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public void truncate(long len) throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81445);
			// TODO Auto-generated method stub

		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public void free() throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81446);
			// TODO Auto-generated method stub

		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

		public Reader getCharacterStream(long pos, long length)
				throws SQLException {try{__CLR4_5_21qt21qt2lusyjutc.R.inc(81447);
			// TODO Auto-generated method stub
			__CLR4_5_21qt21qt2lusyjutc.R.inc(81448);return null;
		}finally{__CLR4_5_21qt21qt2lusyjutc.R.flushNeeded();}}

	}
}
