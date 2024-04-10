/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring;

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

public class FastJsonHttpMessageConverterTest extends TestCase {static class __CLR4_1_101xpj1xpjluszwfuq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90430,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	@SuppressWarnings("deprecation")
	public void test_read() throws Exception {__CLR4_1_101xpj1xpjluszwfuq.R.globalSliceStart(getClass().getName(),90343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o8nabu1xpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xpj1xpjluszwfuq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xpj1xpjluszwfuq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonHttpMessageConverterTest.test_read",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o8nabu1xpj() throws Exception{try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90343);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90344);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90345);converter.setCharset(Charset.forName("UTF-8"));
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90346);Assert.assertEquals(Charset.forName("UTF-8"), converter.getCharset());

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90347);converter.setFeatures(SerializerFeature.BrowserCompatible);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90348);Assert.assertEquals(1, converter.getFeatures().length);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90349);Assert.assertEquals(SerializerFeature.BrowserCompatible,
				converter.getFeatures()[0]);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90350);Assert.assertNull(converter.getDateFormat());
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90351);converter.setDateFormat("yyyyMMdd");

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90352);converter.setFilters(serializeFilter);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90353);Assert.assertEquals(1, converter.getFilters().length);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90354);Assert.assertEquals(serializeFilter, converter.getFilters()[0]);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90355);converter.addSerializeFilter(serializeFilter);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90356);Assert.assertEquals(2, converter.getFilters().length);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90357);converter.addSerializeFilter(null);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90358);converter.setSupportedMediaTypes(Arrays
				.asList(new MediaType[] { MediaType.APPLICATION_JSON_UTF8 }));
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90359);Assert.assertEquals(1, converter.getSupportedMediaTypes().size());

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90360);Method method = FastJsonHttpMessageConverter.class.getDeclaredMethod(
				"supports", Class.class);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90361);method.setAccessible(true);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90362);method.invoke(converter, int.class);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90363);HttpInputMessage input = new HttpInputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90364);
				// TODO Auto-generated method stub
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90365);return null;
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

			public InputStream getBody() throws IOException {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90366);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90367);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
						.forName("UTF-8")));
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

		};
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90368);VO vo = (VO) converter.read(VO.class, input);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90369);Assert.assertEquals(123, vo.getId());

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90370);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90371);HttpOutputMessage out = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90372);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90373);return new HttpHeaders();
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90374);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90375);return byteOut;
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}
		};
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90376);converter.write(vo, MediaType.TEXT_PLAIN, out);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90377);byte[] bytes = byteOut.toByteArray();
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90378);Assert.assertEquals("{\"id\":\"123\"}", new String(bytes, "UTF-8"));
	}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

	public void test_1() throws Exception {__CLR4_1_101xpj1xpjluszwfuq.R.globalSliceStart(getClass().getName(),90379);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1xqj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xpj1xpjluszwfuq.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xpj1xpjluszwfuq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonHttpMessageConverterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90379,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1xqj() throws Exception{try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90379);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90380);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90381);Assert.assertNotNull(converter.getFastJsonConfig());
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90382);converter.setFastJsonConfig(new FastJsonConfig());

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90383);converter.canRead(VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90384);converter.canWrite(VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90385);converter.canRead(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90386);converter.canWrite(VO.class, VO.class, MediaType.APPLICATION_JSON_UTF8);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90387);HttpInputMessage input = new HttpInputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90388);
				// TODO Auto-generated method stub
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90389);return null;
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

			public InputStream getBody() throws IOException {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90390);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90391);return new ByteArrayInputStream("{\"id\":123}".getBytes(Charset
						.forName("UTF-8")));
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

		};
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90392);VO vo = (VO) converter.read(VO.class, VO.class, input);
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90393);Assert.assertEquals(123, vo.getId());

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90394);final ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90395);HttpOutputMessage out = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90396);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90397);return new HttpHeaders();
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90398);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90399);return byteOut;
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}
		};
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90400);converter.write(vo, VO.class, MediaType.TEXT_PLAIN, out);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90401);byte[] bytes = byteOut.toByteArray();
		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90402);Assert.assertEquals("{\"id\":123}", new String(bytes, "UTF-8"));

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90403);converter.setSupportedMediaTypes(Collections
				.singletonList(MediaType.APPLICATION_JSON));

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90404);converter.write(vo, VO.class, null, out);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90405);converter.write(vo, VO.class, MediaType.ALL, out);

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90406);HttpOutputMessage out2 = new HttpOutputMessage() {

			public HttpHeaders getHeaders() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90407);

				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90408);return new HttpHeaders() {

					private static final long serialVersionUID = 1L;

					@Override
					public MediaType getContentType() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90409);

						__CLR4_1_101xpj1xpjluszwfuq.R.inc(90410);return MediaType.APPLICATION_JSON;
					}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

					@Override
					public long getContentLength() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90411);

						__CLR4_1_101xpj1xpjluszwfuq.R.inc(90412);return 1;
					}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}
				};
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

			public OutputStream getBody() throws IOException {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90413);
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90414);return byteOut;
			}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}
		};

		__CLR4_1_101xpj1xpjluszwfuq.R.inc(90415);converter.write(vo, VO.class, MediaType.ALL, out2);

	}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

	private SerializeFilter serializeFilter = new ValueFilter() {
		@Override
		public Object process(Object object, String name, Object value) {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90416);
			__CLR4_1_101xpj1xpjluszwfuq.R.inc(90417);if ((((value == null)&&(__CLR4_1_101xpj1xpjluszwfuq.R.iget(90418)!=0|true))||(__CLR4_1_101xpj1xpjluszwfuq.R.iget(90419)==0&false))) {{
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90420);return "";
			}
			}__CLR4_1_101xpj1xpjluszwfuq.R.inc(90421);if ((((value instanceof Number)&&(__CLR4_1_101xpj1xpjluszwfuq.R.iget(90422)!=0|true))||(__CLR4_1_101xpj1xpjluszwfuq.R.iget(90423)==0&false))) {{
				__CLR4_1_101xpj1xpjluszwfuq.R.inc(90424);return String.valueOf(value);
			}
			}__CLR4_1_101xpj1xpjluszwfuq.R.inc(90425);return value;
		}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}
	};

	public static class VO {

		private int id;

		public int getId() {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90426);
			__CLR4_1_101xpj1xpjluszwfuq.R.inc(90427);return id;
		}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_1_101xpj1xpjluszwfuq.R.inc(90428);
			__CLR4_1_101xpj1xpjluszwfuq.R.inc(90429);this.id = id;
		}finally{__CLR4_1_101xpj1xpjluszwfuq.R.flushNeeded();}}

	}
}