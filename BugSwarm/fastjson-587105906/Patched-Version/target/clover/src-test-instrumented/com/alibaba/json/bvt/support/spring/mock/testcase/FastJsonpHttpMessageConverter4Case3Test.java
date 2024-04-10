/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4;
import com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class FastJsonpHttpMessageConverter4Case3Test {static class __CLR4_5_21xdj1xdjlusyjvpg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89966,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public FastJsonpResponseBodyAdvice fastJsonpResponseBodyAdvice() {try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89911);
            __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89912);return new FastJsonpResponseBodyAdvice();
        }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89913);
            __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89914);converters.add(0, new FastJsonpHttpMessageConverter4());
            __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89915);super.extendMessageConverters(converters);
        }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89916);
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89917);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void checkDefaultJSONPQueryParamNames() {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2o4ae851xdq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.checkDefaultJSONPQueryParamNames",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89918,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2o4ae851xdq(){try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89918);
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89919);String[] expected = { "callback", "jsonp" };
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89920);Assert.assertArrayEquals(expected, FastJsonpResponseBodyAdvice.DEFAULT_JSONP_QUERY_PARAM_NAMES);
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89921);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e3t3r1xdt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.isInjectComponent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89921,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e3t3r1xdt(){try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89921);
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89922);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1xdv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89923,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1xdv() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89923);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89924);JSONObject json = new JSONObject();

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89925);json.put("id", 123);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89926);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89927);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0ceg71xe0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test1_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89928,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0ceg71xe0() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89928);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89929);JSONObject json = new JSONObject();

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89930);json.put("id", 123);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89931);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89932);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89933);actions.andDo(print());
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89934);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89935);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1xe7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89935,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1xe7() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89935);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89936);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89937);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89938);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y573ba1xea();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test2_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89938,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y573ba1xea() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89938);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89939);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89940);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89941);actions.andDo(print());
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89942);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1xef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89943,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1xef() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89943);
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89944);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89945);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89946);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yr29sr1xei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test3_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89946,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yr29sr1xei() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89946);
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89947);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89948);actions.andDo(print());
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89949);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91xem();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89950,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91xem() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89950);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89951);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89952);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm7kxo1xep();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test4_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89953,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm7kxo1xep() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89953);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89954);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89955);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89956);actions.andDo(print());
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89957);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1xeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89958,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1xeu() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89958);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89959);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89960);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceStart(getClass().getName(),89961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhcw2l1xex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xdj1xdjlusyjvpg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xdj1xdjlusyjvpg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test5_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89961,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhcw2l1xex() throws Exception{try{__CLR4_5_21xdj1xdjlusyjvpg.R.inc(89961);

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89962);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89963);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89964);actions.andDo(print());
        __CLR4_5_21xdj1xdjlusyjvpg.R.inc(89965);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_5_21xdj1xdjlusyjvpg.R.flushNeeded();}}
}
