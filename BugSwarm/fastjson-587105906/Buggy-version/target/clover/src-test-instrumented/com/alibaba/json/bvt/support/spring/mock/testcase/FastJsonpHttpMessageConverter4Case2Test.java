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
public class FastJsonpHttpMessageConverter4Case2Test {static class __CLR4_1_101yam1yamluszwg14{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91154,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public FastJsonpResponseBodyAdvice fastJsonpResponseBodyAdvice() {try{__CLR4_1_101yam1yamluszwg14.R.inc(91102);
            __CLR4_1_101yam1yamluszwg14.R.inc(91103);return new FastJsonpResponseBodyAdvice("callback", "jsonp");
        }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101yam1yamluszwg14.R.inc(91104);
            __CLR4_1_101yam1yamluszwg14.R.inc(91105);converters.add(0, new FastJsonpHttpMessageConverter4());
            __CLR4_1_101yam1yamluszwg14.R.inc(91106);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101yam1yamluszwg14.R.inc(91107);
        __CLR4_1_101yam1yamluszwg14.R.inc(91108);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91109);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1yat();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91109,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1yat(){try{__CLR4_1_101yam1yamluszwg14.R.inc(91109);
        __CLR4_1_101yam1yamluszwg14.R.inc(91110);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1yav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91111,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1yav() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91111);

        __CLR4_1_101yam1yamluszwg14.R.inc(91112);JSONObject json = new JSONObject();

        __CLR4_1_101yam1yamluszwg14.R.inc(91113);json.put("id", 123);

        __CLR4_1_101yam1yamluszwg14.R.inc(91114);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101yam1yamluszwg14.R.inc(91115);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91116);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w0ceg71yb0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test1_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91116,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w0ceg71yb0() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91116);

        __CLR4_1_101yam1yamluszwg14.R.inc(91117);JSONObject json = new JSONObject();

        __CLR4_1_101yam1yamluszwg14.R.inc(91118);json.put("id", 123);

        __CLR4_1_101yam1yamluszwg14.R.inc(91119);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101yam1yamluszwg14.R.inc(91120);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yam1yamluszwg14.R.inc(91121);actions.andDo(print());
        __CLR4_1_101yam1yamluszwg14.R.inc(91122);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1yb7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91123,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1yb7() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91123);

        __CLR4_1_101yam1yamluszwg14.R.inc(91124);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101yam1yamluszwg14.R.inc(91125);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91126);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y573ba1yba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test2_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91126,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y573ba1yba() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91126);

        __CLR4_1_101yam1yamluszwg14.R.inc(91127);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101yam1yamluszwg14.R.inc(91128);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yam1yamluszwg14.R.inc(91129);actions.andDo(print());
        __CLR4_1_101yam1yamluszwg14.R.inc(91130);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1ybf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1ybf() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91131);
        __CLR4_1_101yam1yamluszwg14.R.inc(91132);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_1_101yam1yamluszwg14.R.inc(91133);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91134);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yr29sr1ybi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test3_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91134,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yr29sr1ybi() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91134);
        __CLR4_1_101yam1yamluszwg14.R.inc(91135);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_1_101yam1yamluszwg14.R.inc(91136);actions.andDo(print());
        __CLR4_1_101yam1yamluszwg14.R.inc(91137);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91ybm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91138,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91ybm() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91138);

        __CLR4_1_101yam1yamluszwg14.R.inc(91139);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101yam1yamluszwg14.R.inc(91140);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91141);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wm7kxo1ybp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test4_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91141,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wm7kxo1ybp() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91141);

        __CLR4_1_101yam1yamluszwg14.R.inc(91142);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101yam1yamluszwg14.R.inc(91143);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yam1yamluszwg14.R.inc(91144);actions.andDo(print());
        __CLR4_1_101yam1yamluszwg14.R.inc(91145);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1ybu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91146,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1ybu() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91146);

        __CLR4_1_101yam1yamluszwg14.R.inc(91147);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101yam1yamluszwg14.R.inc(91148);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_1_101yam1yamluszwg14.R.globalSliceStart(getClass().getName(),91149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhcw2l1ybx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yam1yamluszwg14.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yam1yamluszwg14.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case2Test.test5_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91149,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhcw2l1ybx() throws Exception{try{__CLR4_1_101yam1yamluszwg14.R.inc(91149);

        __CLR4_1_101yam1yamluszwg14.R.inc(91150);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101yam1yamluszwg14.R.inc(91151);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yam1yamluszwg14.R.inc(91152);actions.andDo(print());
        __CLR4_1_101yam1yamluszwg14.R.inc(91153);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_1_101yam1yamluszwg14.R.flushNeeded();}}
}
