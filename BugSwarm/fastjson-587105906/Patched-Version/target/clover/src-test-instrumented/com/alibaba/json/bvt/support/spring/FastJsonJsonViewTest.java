/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring;

import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FastJsonJsonViewTest extends TestCase {static class __CLR4_5_21wtf1wtflusyjvka{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89276,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("deprecation")
    public void test_0() throws Exception {__CLR4_5_21wtf1wtflusyjvka.R.globalSliceStart(getClass().getName(),89187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21wtf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wtf1wtflusyjvka.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wtf1wtflusyjvka.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89187,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21wtf() throws Exception{try{__CLR4_5_21wtf1wtflusyjvka.R.inc(89187);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89188);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89189);Assert.assertEquals(Charset.forName("UTF-8"), view.getCharset());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89190);view.setCharset(Charset.forName("GBK"));
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89191);Assert.assertEquals(Charset.forName("GBK"), view.getCharset());

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89192);Assert.assertNull(view.getDateFormat());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89193);view.setDateFormat("yyyyMMdd");
		
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89194);Assert.assertNotNull(view.getFeatures());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89195);Assert.assertEquals(1, view.getFeatures().length);

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89196);view.setSerializerFeature(SerializerFeature.BrowserCompatible);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89197);Assert.assertEquals(1, view.getFeatures().length);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89198);Assert.assertEquals(SerializerFeature.BrowserCompatible, view.getFeatures()[0]);

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89199);view.setFeatures(SerializerFeature.DisableCheckSpecialChar, SerializerFeature.SortField);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89200);Assert.assertEquals(2, view.getFeatures().length);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89201);Assert.assertEquals(SerializerFeature.DisableCheckSpecialChar, view.getFeatures()[0]);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89202);Assert.assertEquals(SerializerFeature.SortField, view.getFeatures()[1]);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89203);view.setFilters(serializeFilter);
		__CLR4_5_21wtf1wtflusyjvka.R.inc(89204);Assert.assertEquals(1, view.getFilters().length);
		__CLR4_5_21wtf1wtflusyjvka.R.inc(89205);Assert.assertEquals(serializeFilter, view.getFilters()[0]);
		
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89206);Map<String, Object> model = new HashMap<String, Object>();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89207);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89208);MockHttpServletResponse response = new MockHttpServletResponse();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89209);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89210);view.setRenderedAttributes(null);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89211);view.setCharset(Charset.forName("UTF-8"));
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89212);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89213);view.setUpdateContentLength(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89214);view.setFeatures(SerializerFeature.BrowserCompatible);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89215);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89216);view.setCharset(Charset.forName("GBK"));
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89217);view.render(Collections.singletonMap("abc", "cde"), request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89218);view.setDisableCaching(false);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89219);view.setUpdateContentLength(false);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89220);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89221);view.setRenderedAttributes(new HashSet<String>(Collections.singletonList("abc")));
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89222);view.render(Collections.singletonMap("abc", "cde"), request, response);

    }finally{__CLR4_5_21wtf1wtflusyjvka.R.flushNeeded();}}
 
    public void test_1() throws Exception {__CLR4_5_21wtf1wtflusyjvka.R.globalSliceStart(getClass().getName(),89223);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wtf1wtflusyjvka.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wtf1wtflusyjvka.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89223,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wuf() throws Exception{try{__CLR4_5_21wtf1wtflusyjvka.R.inc(89223);
    	
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89224);FastJsonJsonView view = new FastJsonJsonView();
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89225);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89226);view.setFastJsonConfig(new FastJsonConfig());
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89227);Map<String, Object> model = new HashMap<String, Object>();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89228);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89229);MockHttpServletResponse response = new MockHttpServletResponse();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89230);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89231);view.setRenderedAttributes(null);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89232);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89233);view.setUpdateContentLength(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89234);view.render(model, request, response);
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89235);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89236);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());
        
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89237);view.setDisableCaching(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89238);view.render(Collections.singletonMap("abc", "cde"), request, response);

    }finally{__CLR4_5_21wtf1wtflusyjvka.R.flushNeeded();}}

    @Test
    public  void test_jsonp() throws Exception {__CLR4_5_21wtf1wtflusyjvka.R.globalSliceStart(getClass().getName(),89239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ehbjpa1wuv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wtf1wtflusyjvka.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wtf1wtflusyjvka.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_jsonp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89239,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ehbjpa1wuv() throws Exception{try{__CLR4_5_21wtf1wtflusyjvka.R.inc(89239);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89240);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89241);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89242);view.setFastJsonConfig(new FastJsonConfig());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89243);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89244);view.setDisableCaching(true);

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89245);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89246);request.addParameter("callback", "queryName");
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89247);MockHttpServletResponse response = new MockHttpServletResponse();


        __CLR4_5_21wtf1wtflusyjvka.R.inc(89248);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());


        __CLR4_5_21wtf1wtflusyjvka.R.inc(89249);view.render(Collections.singletonMap("abc", "cde\u4e2d\u6587"), request, response);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89250);String contentAsString = response.getContentAsString();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89251);int contentLength = response.getContentLength();

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89252);Assert.assertEquals(contentLength, contentAsString.getBytes(view.getFastJsonConfig().getCharset().name()).length);
    }finally{__CLR4_5_21wtf1wtflusyjvka.R.flushNeeded();}}

    @Test
    public  void test_jsonp_invalidParam() throws Exception {__CLR4_5_21wtf1wtflusyjvka.R.globalSliceStart(getClass().getName(),89253);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29yx1bz1wv9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wtf1wtflusyjvka.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wtf1wtflusyjvka.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_jsonp_invalidParam",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89253,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29yx1bz1wv9() throws Exception{try{__CLR4_5_21wtf1wtflusyjvka.R.inc(89253);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89254);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89255);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89256);view.setFastJsonConfig(new FastJsonConfig());
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89257);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89258);view.setDisableCaching(true);

        __CLR4_5_21wtf1wtflusyjvka.R.inc(89259);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89260);request.addParameter("callback", "-methodName");
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89261);MockHttpServletResponse response = new MockHttpServletResponse();


        __CLR4_5_21wtf1wtflusyjvka.R.inc(89262);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());


        __CLR4_5_21wtf1wtflusyjvka.R.inc(89263);view.render(Collections.singletonMap("doesn't matter", Collections.singletonMap("abc", "cde\u4e2d\u6587")), request, response);
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89264);String contentAsString = response.getContentAsString();
        __CLR4_5_21wtf1wtflusyjvka.R.inc(89265);Assert.assertTrue(contentAsString.startsWith("{\"abc\":\"cde\u4e2d\u6587\"}"));

    }finally{__CLR4_5_21wtf1wtflusyjvka.R.flushNeeded();}}
    
    private SerializeFilter serializeFilter = new ValueFilter() {

		public Object process(Object object, String name, Object value) {try{__CLR4_5_21wtf1wtflusyjvka.R.inc(89266);
			__CLR4_5_21wtf1wtflusyjvka.R.inc(89267);if ((((value == null)&&(__CLR4_5_21wtf1wtflusyjvka.R.iget(89268)!=0|true))||(__CLR4_5_21wtf1wtflusyjvka.R.iget(89269)==0&false))) {{
				__CLR4_5_21wtf1wtflusyjvka.R.inc(89270);return "";
			}
			}__CLR4_5_21wtf1wtflusyjvka.R.inc(89271);if ((((value instanceof Number)&&(__CLR4_5_21wtf1wtflusyjvka.R.iget(89272)!=0|true))||(__CLR4_5_21wtf1wtflusyjvka.R.iget(89273)==0&false))) {{
				__CLR4_5_21wtf1wtflusyjvka.R.inc(89274);return String.valueOf(value);
			}
			}__CLR4_5_21wtf1wtflusyjvka.R.inc(89275);return value;
		}finally{__CLR4_5_21wtf1wtflusyjvka.R.flushNeeded();}}
	};
}