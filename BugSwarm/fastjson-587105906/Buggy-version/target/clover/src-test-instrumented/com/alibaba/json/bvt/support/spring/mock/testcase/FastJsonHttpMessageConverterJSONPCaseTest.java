/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonViewResponseBodyAdvice;
import com.alibaba.fastjson.support.spring.JSONPResponseBodyAdvice;
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
public class FastJsonHttpMessageConverterJSONPCaseTest {static class __CLR4_1_101x7x1x7xlusqkn4h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89776,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public JSONPResponseBodyAdvice jsonpResponseBodyAdvice() {try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89709);
            __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89710);return new JSONPResponseBodyAdvice();
        }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

        @Bean
        FastJsonViewResponseBodyAdvice fastJsonViewResponseBodyAdvice() {try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89711);
            __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89712);return new FastJsonViewResponseBodyAdvice();
        }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}


        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89713);
            __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89714);converters.add(0, new FastJsonHttpMessageConverter());
            __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89715);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89716);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89717);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1x86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89718,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1x86(){try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89718);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89719);wac.getBean(JSONPResponseBodyAdvice.class);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89720);wac.getBean(FastJsonViewResponseBodyAdvice.class);
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89721);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1x89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89721,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1x89() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89721);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89722);mockMvc.perform(
                (post("/jsonp-fastjsonview/test1").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89723);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w0ceg71x8b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89723,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w0ceg71x8b() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89723);


        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89724);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89725);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89726);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\"})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1x8f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1x8f() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89727);


        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89728);mockMvc.perform(
                (post("/jsonp-fastjsonview/test2").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y573ba1x8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y573ba1x8h() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89729);


        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89730);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test2?callback=fnUpdateSome").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89731);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89732);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"description\":\"fastjsonview\u6ce8\u89e3\u6d4b\u8bd5\",\"stock\":\"haha\"})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1x8l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1x8l() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89733);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89734);List<Object> list = this.mockMvc.perform(post("/jsonp-fastjsonview/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89735);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test3_Jsonp_ContentLength() throws Exception{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1066tvw11x8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_Jsonp_ContentLength",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1066tvw11x8o() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89736);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89737);ResultActions actions1 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=func")).andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89738);Object obj1 = actions1.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89739);Assert.assertNotNull(obj1);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89740);Assert.assertEquals(85,obj1);

        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89741);ResultActions actions2 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome")).andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89742);Object obj2 = actions2.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89743);Assert.assertNotNull(obj2);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89744);Assert.assertEquals(93,obj2);
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yr29sr1x8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yr29sr1x8x() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89745);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89746);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome"));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89747);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89748);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"description\":\"\u90e8\u95e81\u63cf\u8ff0\"}})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89749);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91x91();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89749,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91x91() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89749);


        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89750);mockMvc.perform(
                (post("/jsonp-fastjsonview/test4").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wm7kxo1x93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89751,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wm7kxo1x93() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89751);


        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89752);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test4?callback=myUpdate").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89753);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89754);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"id\":1,\"members\":[],\"name\":\"\u90e8\u95e81\"}})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1x97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89755,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1x97() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89755);

        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89756);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89757);mockMvc.perform(
                (post("/jsonp-fastjsonview/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89758);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhcw2l1x9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89758,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhcw2l1x9a() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89758);

        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89759);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89760);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89761);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89762);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test7() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89763);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nw645o1x9f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89763,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nw645o1x9f() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89763);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89764);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=fnUpdateSome"));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89765);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89766);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test8() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r562y51x9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89767,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r562y51x9j() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89767);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89768);String invalidMethodName = "--methodName";
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89769);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=" + invalidMethodName));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89770);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89771);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/null({})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}

    @Test
    public void test9() throws Exception {__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceStart(getClass().getName(),89772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ue61qm1x9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7x1x7xlusqkn4h.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7x1x7xlusqkn4h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89772,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ue61qm1x9o() throws Exception{try{__CLR4_1_101x7x1x7xlusqkn4h.R.inc(89772);
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89773);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test9?callback=fnUpdateSome"));
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89774);actions.andDo(print());
        __CLR4_1_101x7x1x7xlusqkn4h.R.inc(89775);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100})"));
    }finally{__CLR4_1_101x7x1x7xlusqkn4h.R.flushNeeded();}}
}
