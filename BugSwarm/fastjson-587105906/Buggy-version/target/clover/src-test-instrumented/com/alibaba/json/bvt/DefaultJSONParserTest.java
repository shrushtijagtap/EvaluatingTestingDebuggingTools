/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.json.bvt;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

public class DefaultJSONParserTest extends TestCase {static class __CLR4_1_10wv9wv9lusqjx8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,42659,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_double() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42597);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oq25ydwv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_double",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42597,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oq25ydwv9(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42597);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42598);DefaultJSONParser parser = new DefaultJSONParser("3.4");
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42599);parser.config(Feature.UseBigDecimal, false);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42600);Assert.assertEquals("3.4", parser.getInput());
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42601);Assert.assertEquals(false, parser.isEnabled(Feature.UseBigDecimal));
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42602);Object result = parser.parse();
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42603);Assert.assertEquals(3.4D, result);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_double_in_object() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vqhvlwvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_double_in_object",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42604,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vqhvlwvg(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42604);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42605);DefaultJSONParser parser = new DefaultJSONParser("{\"double\":3.4}");
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42606);parser.config(Feature.UseBigDecimal, false);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42607);Assert.assertEquals("{\"double\":3.4}", parser.getInput());
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42608);Object result = parser.parse();
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42609);Assert.assertEquals(3.4D, ((Map) result).get("double"));
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1awvm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42610,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1awvm(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42610);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42611);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42612);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42613);DefaultJSONParser parser = new DefaultJSONParser("{\"name\":3]");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42614);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42615);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42616);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error2() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sywvt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42617,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sywvt(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42617);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42618);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42619);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42620);DefaultJSONParser parser = new DefaultJSONParser("ttr");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42621);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42622);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42623);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error3() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101mg30hww0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42624,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101mg30hww0(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42624);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42625);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42626);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42627);DefaultJSONParser parser = new DefaultJSONParser("33");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42628);parser.parseObject(new HashMap());
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42629);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42630);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error4() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101mjvs0ww7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42631,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101mjvs0ww7(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42631);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42632);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42633);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42634);DefaultJSONParser parser = new DefaultJSONParser("]");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42635);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42636);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42637);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error6() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1084jtcywwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42638,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1084jtcywwe(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42638);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42639);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42640);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42641);DefaultJSONParser parser = new DefaultJSONParser("{\"a\"33");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42642);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42643);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42644);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error7() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bdjs5fwwl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bdjs5fwwl(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42645);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42646);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42647);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42648);DefaultJSONParser parser = new DefaultJSONParser("{\"a\":{}3");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42649);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42650);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42651);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}

	public void test_error11() {__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceStart(getClass().getName(),42652);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10szxb6wws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10wv9wv9lusqjx8n.R.rethrow($CLV_t2$);}finally{__CLR4_1_10wv9wv9lusqjx8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.DefaultJSONParserTest.test_error11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42652,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10szxb6wws(){try{__CLR4_1_10wv9wv9lusqjx8n.R.inc(42652);
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42653);Exception error = null;
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42654);try {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42655);DefaultJSONParser parser = new DefaultJSONParser("{]");
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42656);parser.parse();
		} catch (Exception ex) {
			__CLR4_1_10wv9wv9lusqjx8n.R.inc(42657);error = ex;
		}
		__CLR4_1_10wv9wv9lusqjx8n.R.inc(42658);Assert.assertNotNull(error);
	}finally{__CLR4_1_10wv9wv9lusqjx8n.R.flushNeeded();}}
}
