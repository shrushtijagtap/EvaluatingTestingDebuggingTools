/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;

import junit.framework.TestCase;

import org.junit.Assert;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;

import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter4;

public class FastJsonHttpMessageConverter4Test extends TestCase {static class __CLR4_5_21wq31wq3lusyjvjl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89100,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public FastJsonHttpMessageConverter4Test() {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89067);
        
    }finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_5_21wq31wq3lusyjvjl.R.globalSliceStart(getClass().getName(),89068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wq4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wq31wq3lusyjvjl.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wq31wq3lusyjvjl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonHttpMessageConverter4Test.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wq4() throws Exception{try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89068);

		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89069);FastJsonHttpMessageConverter4 converter = new FastJsonHttpMessageConverter4();

		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89070);Assert.assertNotNull(converter.getFastJsonConfig());
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89071);converter.setFastJsonConfig(new FastJsonConfig());
		
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89072);converter.canRead(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89073);converter.canWrite(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);
		
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89074);Method method1 = FastJsonHttpMessageConverter4.class.getDeclaredMethod(
				"supports", Class.class);
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89075);method1.setAccessible(true);
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89076);method1.invoke(converter, int.class);
		
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89077);HttpInputMessage input = new HttpInputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89078);
				// TODO Auto-generated method stub
				__CLR4_5_21wq31wq3lusyjvjl.R.inc(89079);return null;
			}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

			public InputStream getBody() throws IOException {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89080);
				__CLR4_5_21wq31wq3lusyjvjl.R.inc(89081);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
						.forName("UTF-8")));
			}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

		};
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89082);VO vo = (VO) converter.read(VO.class, VO.class, input);
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89083);Assert.assertEquals(123, vo.getId());

		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89084);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89085);HttpOutputMessage out = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89086);
				__CLR4_5_21wq31wq3lusyjvjl.R.inc(89087);return new HttpHeaders();
			}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89088);
				__CLR4_5_21wq31wq3lusyjvjl.R.inc(89089);return byteOut;
			}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}
		};
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89090);converter.write(vo, VO.class, MediaType.TEXT_PLAIN, out);

		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89091);byte[] bytes = byteOut.toByteArray();
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89092);Assert.assertEquals("{\"id\":123}", new String(bytes, "UTF-8"));
		
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89093);Method method2 = FastJsonHttpMessageConverter4.class.getDeclaredMethod(
				"readInternal", Class.class, HttpInputMessage.class);
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89094);method2.setAccessible(true);
		__CLR4_5_21wq31wq3lusyjvjl.R.inc(89095);method2.invoke(converter, VO.class, input);
	}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}
	
	public static class VO {

		private int id;

		public int getId() {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89096);
			__CLR4_5_21wq31wq3lusyjvjl.R.inc(89097);return id;
		}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_5_21wq31wq3lusyjvjl.R.inc(89098);
			__CLR4_5_21wq31wq3lusyjvjl.R.inc(89099);this.id = id;
		}finally{__CLR4_5_21wq31wq3lusyjvjl.R.flushNeeded();}}

	}
}
