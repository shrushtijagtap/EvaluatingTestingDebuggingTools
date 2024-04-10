/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;

import junit.framework.TestCase;

import org.junit.Assert;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;

import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;

public class FastJsonHttpMessageConverterTest extends TestCase {static class __CLR4_5_21wr01wr0lusyjvk3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89187,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@SuppressWarnings("deprecation")
	public void test_read() throws Exception {__CLR4_5_21wr01wr0lusyjvk3.R.globalSliceStart(getClass().getName(),89100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o8nabu1wr0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wr01wr0lusyjvk3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wr01wr0lusyjvk3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonHttpMessageConverterTest.test_read",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89100,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o8nabu1wr0() throws Exception{try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89100);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89101);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89102);converter.setCharset(Charset.forName("UTF-8"));
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89103);Assert.assertEquals(Charset.forName("UTF-8"), converter.getCharset());

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89104);converter.setFeatures(SerializerFeature.BrowserCompatible);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89105);Assert.assertEquals(1, converter.getFeatures().length);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89106);Assert.assertEquals(SerializerFeature.BrowserCompatible,
				converter.getFeatures()[0]);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89107);Assert.assertNull(converter.getDateFormat());
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89108);converter.setDateFormat("yyyyMMdd");

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89109);converter.setFilters(serializeFilter);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89110);Assert.assertEquals(1, converter.getFilters().length);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89111);Assert.assertEquals(serializeFilter, converter.getFilters()[0]);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89112);converter.addSerializeFilter(serializeFilter);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89113);Assert.assertEquals(2, converter.getFilters().length);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89114);converter.addSerializeFilter(null);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89115);converter.setSupportedMediaTypes(Arrays
				.asList(new MediaType[] { MediaType.APPLICATION_JSON_UTF8 }));
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89116);Assert.assertEquals(1, converter.getSupportedMediaTypes().size());

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89117);Method method = FastJsonHttpMessageConverter.class.getDeclaredMethod(
				"supports", Class.class);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89118);method.setAccessible(true);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89119);method.invoke(converter, int.class);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89120);HttpInputMessage input = new HttpInputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89121);
				// TODO Auto-generated method stub
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89122);return null;
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

			public InputStream getBody() throws IOException {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89123);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89124);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
						.forName("UTF-8")));
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

		};
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89125);VO vo = (VO) converter.read(VO.class, input);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89126);Assert.assertEquals(123, vo.getId());

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89127);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89128);HttpOutputMessage out = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89129);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89130);return new HttpHeaders();
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89131);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89132);return byteOut;
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}
		};
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89133);converter.write(vo, MediaType.TEXT_PLAIN, out);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89134);byte[] bytes = byteOut.toByteArray();
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89135);Assert.assertEquals("{\"id\":\"123\"}", new String(bytes, "UTF-8"));
	}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_5_21wr01wr0lusyjvk3.R.globalSliceStart(getClass().getName(),89136);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1ws0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wr01wr0lusyjvk3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wr01wr0lusyjvk3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonHttpMessageConverterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89136,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1ws0() throws Exception{try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89136);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89137);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89138);Assert.assertNotNull(converter.getFastJsonConfig());
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89139);converter.setFastJsonConfig(new FastJsonConfig());

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89140);converter.canRead(VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89141);converter.canWrite(VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89142);converter.canRead(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89143);converter.canWrite(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89144);HttpInputMessage input = new HttpInputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89145);
				// TODO Auto-generated method stub
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89146);return null;
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

			public InputStream getBody() throws IOException {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89147);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89148);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
						.forName("UTF-8")));
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

		};
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89149);VO vo = (VO) converter.read(VO.class, VO.class, input);
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89150);Assert.assertEquals(123, vo.getId());

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89151);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89152);HttpOutputMessage out = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89153);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89154);return new HttpHeaders();
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89155);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89156);return byteOut;
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}
		};
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89157);converter.write(vo, VO.class, MediaType.TEXT_PLAIN, out);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89158);byte[] bytes = byteOut.toByteArray();
		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89159);Assert.assertEquals("{\"id\":123}", new String(bytes, "UTF-8"));

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89160);converter.setSupportedMediaTypes(Collections
				.singletonList(MediaType.APPLICATION_JSON));

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89161);converter.write(vo, VO.class, null, out);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89162);converter.write(vo, VO.class, MediaType.ALL, out);

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89163);HttpOutputMessage out2 = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89164);

				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89165);return new HttpHeaders() {

					private static final long serialVersionUID = 1L;

					@Override
					public MediaType getContentType() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89166);

						__CLR4_5_21wr01wr0lusyjvk3.R.inc(89167);return MediaType.APPLICATION_JSON;
					}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

					@Override
					public long getContentLength() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89168);

						__CLR4_5_21wr01wr0lusyjvk3.R.inc(89169);return 1;
					}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}
				};
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89170);
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89171);return byteOut;
			}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}
		};

		__CLR4_5_21wr01wr0lusyjvk3.R.inc(89172);converter.write(vo, VO.class, MediaType.ALL, out2);

	}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

	private SerializeFilter serializeFilter = new ValueFilter() {
		@Override
		public Object process(Object object, String name, Object value) {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89173);
			__CLR4_5_21wr01wr0lusyjvk3.R.inc(89174);if ((((value == null)&&(__CLR4_5_21wr01wr0lusyjvk3.R.iget(89175)!=0|true))||(__CLR4_5_21wr01wr0lusyjvk3.R.iget(89176)==0&false))) {{
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89177);return "";
			}
			}__CLR4_5_21wr01wr0lusyjvk3.R.inc(89178);if ((((value instanceof Number)&&(__CLR4_5_21wr01wr0lusyjvk3.R.iget(89179)!=0|true))||(__CLR4_5_21wr01wr0lusyjvk3.R.iget(89180)==0&false))) {{
				__CLR4_5_21wr01wr0lusyjvk3.R.inc(89181);return String.valueOf(value);
			}
			}__CLR4_5_21wr01wr0lusyjvk3.R.inc(89182);return value;
		}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}
	};

	public static class VO {

		private int id;

		public int getId() {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89183);
			__CLR4_5_21wr01wr0lusyjvk3.R.inc(89184);return id;
		}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_5_21wr01wr0lusyjvk3.R.inc(89185);
			__CLR4_5_21wr01wr0lusyjvk3.R.inc(89186);this.id = id;
		}finally{__CLR4_5_21wr01wr0lusyjvk3.R.flushNeeded();}}

	}
}