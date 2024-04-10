/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//**
 * <p>Title: TestIssue885.java</p>
 * <p>Description: TestIssue885</p>
 * <p>Package: com.alibaba.json.bvt.support.jaxrs.mock.testcase</p>
 * <p>Company: www.github.com/DarkPhoenixs</p>
 * <p>Copyright: Dark Phoenixs (Open-Source Organization) 2016</p>
 */
package com.alibaba.json.bvt.support.jaxrs.mock.testcase;

import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;

import org.apache.cxf.jaxrs.client.WebClient;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.ContextLoaderListener;

import com.alibaba.fastjson.JSONObject;

/**
 * <p>Title: TestIssue885</p>
 * <p>Description: </p>
 *
 * @since 2016\u5e744\u670820\u65e5
 * @author Victor.Zxy
 * @version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = Application.class)
public class FastJsonProviderTest {static class __CLR4_1_101xm61xm6luszwfri{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public final String REST_SERVICE_URL = "http://localhost:8088/rest";

	static {try{__CLR4_1_101xm61xm6luszwfri.R.inc(90222);

		__CLR4_1_101xm61xm6luszwfri.R.inc(90223);Server server = new Server(8088);

		// Register and map the dispatcher servlet
		__CLR4_1_101xm61xm6luszwfri.R.inc(90224);final ServletHolder servletHolder = new ServletHolder(new CXFServlet());
		__CLR4_1_101xm61xm6luszwfri.R.inc(90225);final ServletContextHandler context = new ServletContextHandler();
		__CLR4_1_101xm61xm6luszwfri.R.inc(90226);context.setContextPath("/");
		__CLR4_1_101xm61xm6luszwfri.R.inc(90227);context.addServlet(servletHolder, "/rest/*");
		__CLR4_1_101xm61xm6luszwfri.R.inc(90228);context.addEventListener(new ContextLoaderListener());
		__CLR4_1_101xm61xm6luszwfri.R.inc(90229);context.setInitParameter(
				"contextConfigLocation",
				"classpath*:/config/applicationContext-rest.xml");
		__CLR4_1_101xm61xm6luszwfri.R.inc(90230);server.setHandler(context);
		__CLR4_1_101xm61xm6luszwfri.R.inc(90231);try {
			__CLR4_1_101xm61xm6luszwfri.R.inc(90232);server.start();
//			server.join();
		} catch (Exception e) {
			__CLR4_1_101xm61xm6luszwfri.R.inc(90233);e.printStackTrace();
		}
	}finally{__CLR4_1_101xm61xm6luszwfri.R.flushNeeded();}}
	
	@Test
	public void test0() throws Exception {__CLR4_1_101xm61xm6luszwfri.R.globalSliceStart(getClass().getName(),90234);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10156cmd1xmi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xm61xm6luszwfri.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xm61xm6luszwfri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.jaxrs.mock.testcase.FastJsonProviderTest.test0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90234,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10156cmd1xmi() throws Exception{try{__CLR4_1_101xm61xm6luszwfri.R.inc(90234);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90235);JSONObject json = new JSONObject();
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90236);json.put("id", 123);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90237);json.put("name", "\u54c8\u54c8\u54c8");
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90238);WebClient client = WebClient.create(REST_SERVICE_URL);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90239);Response response = client.path("/fastjson/test1").accept("application/json").type("application/json; charset=UTF-8").post(json.toJSONString());
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90240);System.out.println(response.readEntity(String.class));
	}finally{__CLR4_1_101xm61xm6luszwfri.R.flushNeeded();}}
	
	@Test
	public void test1() throws Exception {__CLR4_1_101xm61xm6luszwfri.R.globalSliceStart(getClass().getName(),90241);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1xmp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xm61xm6luszwfri.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xm61xm6luszwfri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.jaxrs.mock.testcase.FastJsonProviderTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90241,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1xmp() throws Exception{try{__CLR4_1_101xm61xm6luszwfri.R.inc(90241);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90242);JSONObject json = new JSONObject();
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90243);json.put("id", 123);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90244);json.put("name", "\u54c8\u54c8\u54c8");
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90245);WebClient client = WebClient.create(REST_SERVICE_URL);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90246);Response response = client.path("/fastjson/test1").replaceQuery("pretty").accept("application/json").type("application/json; charset=UTF-8").post(json.toJSONString());
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90247);System.out.println(response.readEntity(String.class));
	}finally{__CLR4_1_101xm61xm6luszwfri.R.flushNeeded();}}
	
	@Test
	public void test2() throws Exception {__CLR4_1_101xm61xm6luszwfri.R.globalSliceStart(getClass().getName(),90248);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1xmw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xm61xm6luszwfri.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xm61xm6luszwfri.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.jaxrs.mock.testcase.FastJsonProviderTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90248,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1xmw() throws Exception{try{__CLR4_1_101xm61xm6luszwfri.R.inc(90248);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90249);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90250);WebClient client = WebClient.create(REST_SERVICE_URL);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90251);Response response = client.path("/fastjson/test2").accept("application/json").type("application/json; charset=UTF-8").post(jsonStr);
		
		__CLR4_1_101xm61xm6luszwfri.R.inc(90252);System.out.println(response.readEntity(String.class));
	}finally{__CLR4_1_101xm61xm6luszwfri.R.flushNeeded();}}
}
