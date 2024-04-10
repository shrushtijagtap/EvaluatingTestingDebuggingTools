/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

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
public class FastJsonHttpMessageConverterJSONPCaseTest {static class __CLR4_5_21x7m1x7mlusyjvoc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public JSONPResponseBodyAdvice jsonpResponseBodyAdvice() {try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89698);
            __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89699);return new JSONPResponseBodyAdvice();
        }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

        @Bean
        FastJsonViewResponseBodyAdvice fastJsonViewResponseBodyAdvice() {try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89700);
            __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89701);return new FastJsonViewResponseBodyAdvice();
        }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}


        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89702);
            __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89703);converters.add(0, new FastJsonHttpMessageConverter());
            __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89704);super.extendMessageConverters(converters);
        }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89705);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89706);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89707);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e3t3r1x7v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.isInjectComponent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89707,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e3t3r1x7v(){try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89707);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89708);wac.getBean(JSONPResponseBodyAdvice.class);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89709);wac.getBean(FastJsonViewResponseBodyAdvice.class);
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1x7y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1x7y() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89710);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89711);mockMvc.perform(
                (post("/jsonp-fastjsonview/test1").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0ceg71x80();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0ceg71x80() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89712);


        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89713);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89714);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89715);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\"})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89716);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1x84();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89716,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1x84() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89716);


        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89717);mockMvc.perform(
                (post("/jsonp-fastjsonview/test2").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89718);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y573ba1x86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89718,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y573ba1x86() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89718);


        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89719);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test2?callback=fnUpdateSome").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89720);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89721);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"description\":\"fastjsonview\u6ce8\u89e3\u6d4b\u8bd5\",\"stock\":\"haha\"})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1x8a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1x8a() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89722);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89723);List<Object> list = this.mockMvc.perform(post("/jsonp-fastjsonview/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89724);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test3_Jsonp_ContentLength() throws Exception{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89725);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_266tvw11x8d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_Jsonp_ContentLength",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89725,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_266tvw11x8d() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89725);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89726);ResultActions actions1 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=func")).andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89727);Object obj1 = actions1.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89728);Assert.assertNotNull(obj1);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89729);Assert.assertEquals(85,obj1);

        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89730);ResultActions actions2 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome")).andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89731);Object obj2 = actions2.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89732);Assert.assertNotNull(obj2);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89733);Assert.assertEquals(93,obj2);
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yr29sr1x8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yr29sr1x8m() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89734);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89735);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome"));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89736);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89737);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"description\":\"\u90e8\u95e81\u63cf\u8ff0\"}})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91x8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89738,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91x8q() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89738);


        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89739);mockMvc.perform(
                (post("/jsonp-fastjsonview/test4").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89740);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm7kxo1x8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89740,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm7kxo1x8s() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89740);


        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89741);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test4?callback=myUpdate").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89742);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89743);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"id\":1,\"members\":[],\"name\":\"\u90e8\u95e81\"}})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89744);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1x8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89744,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1x8w() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89744);

        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89745);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89746);mockMvc.perform(
                (post("/jsonp-fastjsonview/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89747);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhcw2l1x8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89747,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhcw2l1x8z() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89747);

        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89748);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89749);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89750);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89751);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test7() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89752);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nw645o1x94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89752,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nw645o1x94() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89752);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89753);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=fnUpdateSome"));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89754);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89755);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test8() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89756);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r562y51x98();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89756,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r562y51x98() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89756);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89757);String invalidMethodName = "--methodName";
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89758);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=" + invalidMethodName));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89759);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89760);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/null({})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}

    @Test
    public void test9() throws Exception {__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceStart(getClass().getName(),89761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ue61qm1x9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x7m1x7mlusyjvoc.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x7m1x7mlusyjvoc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89761,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ue61qm1x9d() throws Exception{try{__CLR4_5_21x7m1x7mlusyjvoc.R.inc(89761);
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89762);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test9?callback=fnUpdateSome"));
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89763);actions.andDo(print());
        __CLR4_5_21x7m1x7mlusyjvoc.R.inc(89764);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100})"));
    }finally{__CLR4_5_21x7m1x7mlusyjvoc.R.flushNeeded();}}
}
