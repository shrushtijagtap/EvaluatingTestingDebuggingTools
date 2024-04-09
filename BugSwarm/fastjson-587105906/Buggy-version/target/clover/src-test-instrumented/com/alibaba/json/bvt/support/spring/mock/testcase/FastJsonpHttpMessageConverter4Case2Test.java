/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

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
public class FastJsonpHttpMessageConverter4Case2Test {static class __CLR4_1_101xce1xcelusqkn68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89922,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public FastJsonpResponseBodyAdvice fastJsonpResponseBodyAdvice() {try{__CLR4_1_101xce1xcelusqkn68.R.inc(89870);
            __CLR4_1_101xce1xcelusqkn68.R.inc(89871);return new FastJsonpResponseBodyAdvice("callback", "jsonp");
        }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101xce1xcelusqkn68.R.inc(89872);
            __CLR4_1_101xce1xcelusqkn68.R.inc(89873);converters.add(0, new FastJsonpHttpMessageConverter4());
            __CLR4_1_101xce1xcelusqkn68.R.inc(89874);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101xce1xcelusqkn68.R.inc(89875);
        __CLR4_1_101xce1xcelusqkn68.R.inc(89876);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1xcl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89877,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1xcl(){try{__CLR4_1_101xce1xcelusqkn68.R.inc(89877);
        __CLR4_1_101xce1xcelusqkn68.R.inc(89878);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1xcn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1xcn() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89879);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89880);JSONObject json = new JSONObject();

        __CLR4_1_101xce1xcelusqkn68.R.inc(89881);json.put("id", 123);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89882);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101xce1xcelusqkn68.R.inc(89883);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89884);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w0ceg71xcs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test1_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89884,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w0ceg71xcs() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89884);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89885);JSONObject json = new JSONObject();

        __CLR4_1_101xce1xcelusqkn68.R.inc(89886);json.put("id", 123);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89887);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101xce1xcelusqkn68.R.inc(89888);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101xce1xcelusqkn68.R.inc(89889);actions.andDo(print());
        __CLR4_1_101xce1xcelusqkn68.R.inc(89890);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1xcz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1xcz() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89891);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89892);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89893);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y573ba1xd2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test2_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89894,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y573ba1xd2() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89894);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89895);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89896);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101xce1xcelusqkn68.R.inc(89897);actions.andDo(print());
        __CLR4_1_101xce1xcelusqkn68.R.inc(89898);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89899);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1xd7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89899,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1xd7() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89899);
        __CLR4_1_101xce1xcelusqkn68.R.inc(89900);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_1_101xce1xcelusqkn68.R.inc(89901);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89902);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yr29sr1xda();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test3_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89902,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yr29sr1xda() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89902);
        __CLR4_1_101xce1xcelusqkn68.R.inc(89903);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_1_101xce1xcelusqkn68.R.inc(89904);actions.andDo(print());
        __CLR4_1_101xce1xcelusqkn68.R.inc(89905);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91xde();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89906,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91xde() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89906);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89907);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89908);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89909);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wm7kxo1xdh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test4_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89909,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wm7kxo1xdh() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89909);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89910);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89911);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101xce1xcelusqkn68.R.inc(89912);actions.andDo(print());
        __CLR4_1_101xce1xcelusqkn68.R.inc(89913);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1xdm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89914,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1xdm() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89914);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89915);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89916);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_1_101xce1xcelusqkn68.R.globalSliceStart(getClass().getName(),89917);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhcw2l1xdp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xce1xcelusqkn68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xce1xcelusqkn68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test5_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89917,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhcw2l1xdp() throws Exception{try{__CLR4_1_101xce1xcelusqkn68.R.inc(89917);

        __CLR4_1_101xce1xcelusqkn68.R.inc(89918);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101xce1xcelusqkn68.R.inc(89919);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101xce1xcelusqkn68.R.inc(89920);actions.andDo(print());
        __CLR4_1_101xce1xcelusqkn68.R.inc(89921);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_1_101xce1xcelusqkn68.R.flushNeeded();}}
}
