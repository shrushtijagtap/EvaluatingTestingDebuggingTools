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
 * <p>Description:</p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2016\u5e744\u670820\u65e5
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({"classpath*:/config/applicationContext-mvc1.xml"})
public class FastJsonHttpMessageConverterTest {static class __CLR4_5_21x9h1x9hlusyjvog{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89765);
        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89766);this.mockMvc = webAppContextSetup(this.wac).build();
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1x9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89767,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1x9j() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89767);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89768);JSONObject json = new JSONObject();

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89769);json.put("id", 123);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89770);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89771);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(
                        json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON)))
                // .andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1x9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1x9o() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89772);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89773);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89774);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                // .andExpect(status().isOk())
                .andDo(print());
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1x9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89775,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1x9r() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89775);
        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89776);List<Object> list = this.mockMvc.perform(post("/fastjson/test3"))
                .andReturn().getResponse().getHeaderValues("Content-Length");
        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89777);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91x9u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91x9u() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89778);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89779);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89780);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1x9x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1x9x() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89781);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89782);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89783);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(
                        jsonStr).contentType(MediaType.APPLICATION_JSON)))
                .andDo(print());
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}


    @Test
    public void test6() throws Exception {__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceStart(getClass().getName(),89784);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d71xa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x9h1x9hlusyjvog.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x9h1x9hlusyjvog.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterTest.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89784,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d71xa0() throws Exception{try{__CLR4_5_21x9h1x9hlusyjvog.R.inc(89784);

        __CLR4_5_21x9h1x9hlusyjvog.R.inc(89785);mockMvc.perform(
                (post("/fastjson/test6").characterEncoding("UTF-8")
                        .param("userId", "1234")
                        .param("flag", "0")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)))
                .andDo(print());
    }finally{__CLR4_5_21x9h1x9hlusyjvog.R.flushNeeded();}}
}
