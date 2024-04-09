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

public class FastJsonJsonViewTest extends TestCase {static class __CLR4_5_21xrn1xrnlusvnhbc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90508,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @SuppressWarnings("deprecation")
    public void test_0() throws Exception {__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceStart(getClass().getName(),90419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xrn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xrn1xrnlusvnhbc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90419,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xrn() throws Exception{try{__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90419);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90420);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90421);Assert.assertEquals(Charset.forName("UTF-8"), view.getCharset());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90422);view.setCharset(Charset.forName("GBK"));
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90423);Assert.assertEquals(Charset.forName("GBK"), view.getCharset());

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90424);Assert.assertNull(view.getDateFormat());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90425);view.setDateFormat("yyyyMMdd");
		
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90426);Assert.assertNotNull(view.getFeatures());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90427);Assert.assertEquals(1, view.getFeatures().length);

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90428);view.setSerializerFeature(SerializerFeature.BrowserCompatible);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90429);Assert.assertEquals(1, view.getFeatures().length);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90430);Assert.assertEquals(SerializerFeature.BrowserCompatible, view.getFeatures()[0]);

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90431);view.setFeatures(SerializerFeature.DisableCheckSpecialChar, SerializerFeature.SortField);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90432);Assert.assertEquals(2, view.getFeatures().length);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90433);Assert.assertEquals(SerializerFeature.DisableCheckSpecialChar, view.getFeatures()[0]);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90434);Assert.assertEquals(SerializerFeature.SortField, view.getFeatures()[1]);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90435);view.setFilters(serializeFilter);
		__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90436);Assert.assertEquals(1, view.getFilters().length);
		__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90437);Assert.assertEquals(serializeFilter, view.getFilters()[0]);
		
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90438);Map<String, Object> model = new HashMap<String, Object>();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90439);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90440);MockHttpServletResponse response = new MockHttpServletResponse();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90441);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90442);view.setRenderedAttributes(null);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90443);view.setCharset(Charset.forName("UTF-8"));
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90444);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90445);view.setUpdateContentLength(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90446);view.setFeatures(SerializerFeature.BrowserCompatible);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90447);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90448);view.setCharset(Charset.forName("GBK"));
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90449);view.render(Collections.singletonMap("abc", "cde"), request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90450);view.setDisableCaching(false);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90451);view.setUpdateContentLength(false);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90452);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90453);view.setRenderedAttributes(new HashSet<String>(Collections.singletonList("abc")));
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90454);view.render(Collections.singletonMap("abc", "cde"), request, response);

    }finally{__CLR4_5_21xrn1xrnlusvnhbc.R.flushNeeded();}}
 
    public void test_1() throws Exception {__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceStart(getClass().getName(),90455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1xsn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xrn1xrnlusvnhbc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90455,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1xsn() throws Exception{try{__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90455);
    	
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90456);FastJsonJsonView view = new FastJsonJsonView();
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90457);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90458);view.setFastJsonConfig(new FastJsonConfig());
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90459);Map<String, Object> model = new HashMap<String, Object>();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90460);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90461);MockHttpServletResponse response = new MockHttpServletResponse();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90462);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90463);view.setRenderedAttributes(null);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90464);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90465);view.setUpdateContentLength(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90466);view.render(model, request, response);
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90467);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90468);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());
        
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90469);view.setDisableCaching(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90470);view.render(Collections.singletonMap("abc", "cde"), request, response);

    }finally{__CLR4_5_21xrn1xrnlusvnhbc.R.flushNeeded();}}

    @Test
    public  void test_jsonp() throws Exception {__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceStart(getClass().getName(),90471);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ehbjpa1xt3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xrn1xrnlusvnhbc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_jsonp",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90471,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ehbjpa1xt3() throws Exception{try{__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90471);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90472);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90473);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90474);view.setFastJsonConfig(new FastJsonConfig());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90475);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90476);view.setDisableCaching(true);

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90477);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90478);request.addParameter("callback", "queryName");
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90479);MockHttpServletResponse response = new MockHttpServletResponse();


        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90480);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());


        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90481);view.render(Collections.singletonMap("abc", "cde\u4e2d\u6587"), request, response);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90482);String contentAsString = response.getContentAsString();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90483);int contentLength = response.getContentLength();

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90484);Assert.assertEquals(contentLength, contentAsString.getBytes(view.getFastJsonConfig().getCharset().name()).length);
    }finally{__CLR4_5_21xrn1xrnlusvnhbc.R.flushNeeded();}}

    @Test
    public  void test_jsonp_invalidParam() throws Exception {__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceStart(getClass().getName(),90485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29yx1bz1xth();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xrn1xrnlusvnhbc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xrn1xrnlusvnhbc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonJsonViewTest.test_jsonp_invalidParam",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29yx1bz1xth() throws Exception{try{__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90485);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90486);FastJsonJsonView view = new FastJsonJsonView();

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90487);Assert.assertNotNull(view.getFastJsonConfig());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90488);view.setFastJsonConfig(new FastJsonConfig());
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90489);view.setExtractValueFromSingleKeyModel(true);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90490);view.setDisableCaching(true);

        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90491);MockHttpServletRequest request = new MockHttpServletRequest();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90492);request.addParameter("callback", "-methodName");
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90493);MockHttpServletResponse response = new MockHttpServletResponse();


        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90494);Assert.assertEquals(true, view.isExtractValueFromSingleKeyModel());


        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90495);view.render(Collections.singletonMap("doesn't matter", Collections.singletonMap("abc", "cde\u4e2d\u6587")), request, response);
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90496);String contentAsString = response.getContentAsString();
        __CLR4_5_21xrn1xrnlusvnhbc.R.inc(90497);Assert.assertTrue(contentAsString.startsWith("{\"abc\":\"cde\u4e2d\u6587\"}"));

    }finally{__CLR4_5_21xrn1xrnlusvnhbc.R.flushNeeded();}}
    
    private SerializeFilter serializeFilter = new ValueFilter() {

		public Object process(Object object, String name, Object value) {try{__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90498);
			__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90499);if ((((value == null)&&(__CLR4_5_21xrn1xrnlusvnhbc.R.iget(90500)!=0|true))||(__CLR4_5_21xrn1xrnlusvnhbc.R.iget(90501)==0&false))) {{
				__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90502);return "";
			}
			}__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90503);if ((((value instanceof Number)&&(__CLR4_5_21xrn1xrnlusvnhbc.R.iget(90504)!=0|true))||(__CLR4_5_21xrn1xrnlusvnhbc.R.iget(90505)==0&false))) {{
				__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90506);return String.valueOf(value);
			}
			}__CLR4_5_21xrn1xrnlusvnhbc.R.inc(90507);return value;
		}finally{__CLR4_5_21xrn1xrnlusvnhbc.R.flushNeeded();}}
	};
}