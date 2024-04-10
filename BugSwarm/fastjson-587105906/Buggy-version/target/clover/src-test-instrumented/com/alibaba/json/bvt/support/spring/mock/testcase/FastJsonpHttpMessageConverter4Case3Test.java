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
public class FastJsonpHttpMessageConverter4Case3Test {static class __CLR4_1_101yc21yc2luszwg1k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91209,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public FastJsonpResponseBodyAdvice fastJsonpResponseBodyAdvice() {try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91154);
            __CLR4_1_101yc21yc2luszwg1k.R.inc(91155);return new FastJsonpResponseBodyAdvice();
        }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91156);
            __CLR4_1_101yc21yc2luszwg1k.R.inc(91157);converters.add(0, new FastJsonpHttpMessageConverter4());
            __CLR4_1_101yc21yc2luszwg1k.R.inc(91158);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91159);
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91160);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void checkDefaultJSONPQueryParamNames() {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o4ae851yc9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.checkDefaultJSONPQueryParamNames",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91161,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o4ae851yc9(){try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91161);
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91162);String[] expected = { "callback", "jsonp" };
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91163);Assert.assertArrayEquals(expected, FastJsonpResponseBodyAdvice.DEFAULT_JSONP_QUERY_PARAM_NAMES);
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91164);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1ycc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91164,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1ycc(){try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91164);
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91165);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1yce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1yce() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91166);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91167);JSONObject json = new JSONObject();

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91168);json.put("id", 123);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91169);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91170);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w0ceg71ycj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test1_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91171,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w0ceg71ycj() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91171);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91172);JSONObject json = new JSONObject();

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91173);json.put("id", 123);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91174);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91175);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91176);actions.andDo(print());
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91177);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91178);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1ycq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91178,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1ycq() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91178);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91179);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91180);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y573ba1yct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test2_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y573ba1yct() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91181);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91182);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91183);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91184);actions.andDo(print());
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91185);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91186);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1ycy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91186,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1ycy() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91186);
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91187);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91188);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91189);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yr29sr1yd1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test3_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91189,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yr29sr1yd1() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91189);
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91190);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91191);actions.andDo(print());
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91192);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91yd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91193,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91yd5() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91193);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91194);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91195);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wm7kxo1yd8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test4_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91196,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wm7kxo1yd8() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91196);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91197);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91198);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91199);actions.andDo(print());
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91200);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91201);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1ydd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91201,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1ydd() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91201);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91202);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91203);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_1_101yc21yc2luszwg1k.R.globalSliceStart(getClass().getName(),91204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhcw2l1ydg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yc21yc2luszwg1k.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yc21yc2luszwg1k.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case3Test.test5_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91204,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhcw2l1ydg() throws Exception{try{__CLR4_1_101yc21yc2luszwg1k.R.inc(91204);

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91205);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101yc21yc2luszwg1k.R.inc(91206);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91207);actions.andDo(print());
        __CLR4_1_101yc21yc2luszwg1k.R.inc(91208);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_1_101yc21yc2luszwg1k.R.flushNeeded();}}
}
