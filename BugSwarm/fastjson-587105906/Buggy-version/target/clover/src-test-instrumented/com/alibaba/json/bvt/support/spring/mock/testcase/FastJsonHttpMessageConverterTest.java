/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//**
 * <p>Title: FastJsonHttpMessageConverterTest.java</p>
 * <p>Description: FastJsonHttpMessageConverterTest</p>
 * <p>Package: com.alibaba.json.bvt.support.spring.mock.testcase</p>
 * <p>Company: www.github.com/DarkPhoenixs</p>
 * <p>Copyright: Dark Phoenixs (Open-Source Organization) 2016</p>
 */
package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.JSONObject;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

/**
 * <p>Title: FastJsonHttpMessageConverterTest</p>
 * <p>Description:</p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2016\u5e744\u670820\u65e5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:/config/applicationContext-mvc1.xml"})
public class FastJsonHttpMessageConverterTest {static class __CLR4_1_101y801y80luszwg0k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91029,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_1_101y801y80luszwg0k.R.inc(91008);
        __CLR4_1_101y801y80luszwg0k.R.inc(91009);this.mockMvc = webAppContextSetup(this.wac).build();
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1y82();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1y82() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91010);

        __CLR4_1_101y801y80luszwg0k.R.inc(91011);JSONObject json = new JSONObject();

        __CLR4_1_101y801y80luszwg0k.R.inc(91012);json.put("id", 123);

        __CLR4_1_101y801y80luszwg0k.R.inc(91013);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101y801y80luszwg0k.R.inc(91014);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(
                        json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON)))
                // .andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1y87();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91015,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1y87() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91015);

        __CLR4_1_101y801y80luszwg0k.R.inc(91016);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101y801y80luszwg0k.R.inc(91017);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                // .andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1y8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1y8a() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91018);
        __CLR4_1_101y801y80luszwg0k.R.inc(91019);List<Object> list = this.mockMvc.perform(post("/fastjson/test3"))
                .andReturn().getResponse().getHeaderValues("Content-Length");
        __CLR4_1_101y801y80luszwg0k.R.inc(91020);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91021);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91y8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91021,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91y8d() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91021);

        __CLR4_1_101y801y80luszwg0k.R.inc(91022);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101y801y80luszwg0k.R.inc(91023);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91024);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1y8g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91024,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1y8g() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91024);

        __CLR4_1_101y801y80luszwg0k.R.inc(91025);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101y801y80luszwg0k.R.inc(91026);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}


    @Test
    public void test6() throws Exception {__CLR4_1_101y801y80luszwg0k.R.globalSliceStart(getClass().getName(),91027);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kn65d71y8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y801y80luszwg0k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y801y80luszwg0k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91027,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kn65d71y8j() throws Exception{try{__CLR4_1_101y801y80luszwg0k.R.inc(91027);

        __CLR4_1_101y801y80luszwg0k.R.inc(91028);mockMvc.perform(
                (post("/fastjson/test6").characterEncoding("UTF-8")
                        .param("userId", "1234")
                        .param("flag", "0")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)))
                .andDo(print());
    }finally{__CLR4_1_101y801y80luszwg0k.R.flushNeeded();}}
}
