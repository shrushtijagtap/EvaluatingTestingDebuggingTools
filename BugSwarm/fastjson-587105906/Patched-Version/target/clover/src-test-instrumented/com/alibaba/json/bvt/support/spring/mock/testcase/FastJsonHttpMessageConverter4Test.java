/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//**
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
 * <p>Description: </p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2016\u5e744\u670820\u65e5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:/config/applicationContext-mvc3.xml"})
public class FastJsonHttpMessageConverter4Test {static class __CLR4_5_21y4u1y4ulusvnhjx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90913,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90894);
        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90895);this.mockMvc = webAppContextSetup(this.wac).build();
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceStart(getClass().getName(),90896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1y4w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y4u1y4ulusvnhjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverter4Test.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1y4w() throws Exception{try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90896);

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90897);JSONObject json = new JSONObject();

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90898);json.put("id", 123);

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90899);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90900);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)
                ))
//		.andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceStart(getClass().getName(),90901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1y51();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y4u1y4ulusvnhjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverter4Test.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1y51() throws Exception{try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90901);

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90902);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90903);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr).contentType(MediaType.APPLICATION_JSON)
                ))
//		.andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceStart(getClass().getName(),90904);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1y54();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y4u1y4ulusvnhjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverter4Test.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90904,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1y54() throws Exception{try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90904);
        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90905);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse().getHeaderValues("Content-Length");
        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90906);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceStart(getClass().getName(),90907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91y57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y4u1y4ulusvnhjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverter4Test.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91y57() throws Exception{try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90907);

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90908);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90909);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceStart(getClass().getName(),90910);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1y5a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y4u1y4ulusvnhjx.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y4u1y4ulusvnhjx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverter4Test.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90910,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1y5a() throws Exception{try{__CLR4_5_21y4u1y4ulusvnhjx.R.inc(90910);

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90911);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21y4u1y4ulusvnhjx.R.inc(90912);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_5_21y4u1y4ulusvnhjx.R.flushNeeded();}}
}
