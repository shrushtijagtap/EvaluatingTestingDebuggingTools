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
public class FastJsonHttpMessageConverterJSONPCaseTest {static class __CLR4_1_101y651y65luszwg0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91008,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public JSONPResponseBodyAdvice jsonpResponseBodyAdvice() {try{__CLR4_1_101y651y65luszwg0g.R.inc(90941);
            __CLR4_1_101y651y65luszwg0g.R.inc(90942);return new JSONPResponseBodyAdvice();
        }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

        @Bean
        FastJsonViewResponseBodyAdvice fastJsonViewResponseBodyAdvice() {try{__CLR4_1_101y651y65luszwg0g.R.inc(90943);
            __CLR4_1_101y651y65luszwg0g.R.inc(90944);return new FastJsonViewResponseBodyAdvice();
        }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}


        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101y651y65luszwg0g.R.inc(90945);
            __CLR4_1_101y651y65luszwg0g.R.inc(90946);converters.add(0, new FastJsonHttpMessageConverter());
            __CLR4_1_101y651y65luszwg0g.R.inc(90947);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101y651y65luszwg0g.R.inc(90948);
        __CLR4_1_101y651y65luszwg0g.R.inc(90949);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90950);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1y6e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90950,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1y6e(){try{__CLR4_1_101y651y65luszwg0g.R.inc(90950);
        __CLR4_1_101y651y65luszwg0g.R.inc(90951);wac.getBean(JSONPResponseBodyAdvice.class);
        __CLR4_1_101y651y65luszwg0g.R.inc(90952);wac.getBean(FastJsonViewResponseBodyAdvice.class);
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104e6beu1y6h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104e6beu1y6h() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90953);
        __CLR4_1_101y651y65luszwg0g.R.inc(90954);mockMvc.perform(
                (post("/jsonp-fastjsonview/test1").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90955);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w0ceg71y6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test1_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90955,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w0ceg71y6j() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90955);


        __CLR4_1_101y651y65luszwg0g.R.inc(90956);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101y651y65luszwg0g.R.inc(90957);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90958);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\"})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90959);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107n6a7b1y6n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90959,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107n6a7b1y6n() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90959);


        __CLR4_1_101y651y65luszwg0g.R.inc(90960);mockMvc.perform(
                (post("/jsonp-fastjsonview/test2").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y573ba1y6p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test2_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90961,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y573ba1y6p() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90961);


        __CLR4_1_101y651y65luszwg0g.R.inc(90962);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test2?callback=fnUpdateSome").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101y651y65luszwg0g.R.inc(90963);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90964);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"description\":\"fastjsonview\u6ce8\u89e3\u6d4b\u8bd5\",\"stock\":\"haha\"})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aw68zs1y6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90965,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aw68zs1y6t() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90965);
        __CLR4_1_101y651y65luszwg0g.R.inc(90966);List<Object> list = this.mockMvc.perform(post("/jsonp-fastjsonview/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_1_101y651y65luszwg0g.R.inc(90967);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test3_Jsonp_ContentLength() throws Exception{__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1066tvw11y6w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_Jsonp_ContentLength",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1066tvw11y6w() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90968);
        __CLR4_1_101y651y65luszwg0g.R.inc(90969);ResultActions actions1 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=func")).andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90970);Object obj1 = actions1.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_1_101y651y65luszwg0g.R.inc(90971);Assert.assertNotNull(obj1);
        __CLR4_1_101y651y65luszwg0g.R.inc(90972);Assert.assertEquals(85,obj1);

        __CLR4_1_101y651y65luszwg0g.R.inc(90973);ResultActions actions2 = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome")).andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90974);Object obj2 = actions2.andReturn().getResponse().getHeaderValue("Content-Length");
        __CLR4_1_101y651y65luszwg0g.R.inc(90975);Assert.assertNotNull(obj2);
        __CLR4_1_101y651y65luszwg0g.R.inc(90976);Assert.assertEquals(93,obj2);
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yr29sr1y75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test3_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90977,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yr29sr1y75() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90977);
        __CLR4_1_101y651y65luszwg0g.R.inc(90978);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test3?callback=fnUpdateSome"));
        __CLR4_1_101y651y65luszwg0g.R.inc(90979);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90980);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"description\":\"\u90e8\u95e81\u63cf\u8ff0\"}})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e567s91y79();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90981,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e567s91y79() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90981);


        __CLR4_1_101y651y65luszwg0g.R.inc(90982);mockMvc.perform(
                (post("/jsonp-fastjsonview/test4").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90983);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wm7kxo1y7b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test4_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90983,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wm7kxo1y7b() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90983);


        __CLR4_1_101y651y65luszwg0g.R.inc(90984);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test4?callback=myUpdate").characterEncoding("UTF-8")
                .contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101y651y65luszwg0g.R.inc(90985);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90986);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate({\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"id\":1,\"members\":[],\"name\":\"\u90e8\u95e81\"}})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90987);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10he66kq1y7f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90987,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10he66kq1y7f() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90987);

        __CLR4_1_101y651y65luszwg0g.R.inc(90988);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101y651y65luszwg0g.R.inc(90989);mockMvc.perform(
                (post("/jsonp-fastjsonview/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhcw2l1y7i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test5_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90990,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhcw2l1y7i() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90990);

        __CLR4_1_101y651y65luszwg0g.R.inc(90991);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_1_101y651y65luszwg0g.R.inc(90992);ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_1_101y651y65luszwg0g.R.inc(90993);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90994);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test7() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nw645o1y7n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90995,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nw645o1y7n() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90995);
        __CLR4_1_101y651y65luszwg0g.R.inc(90996);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=fnUpdateSome"));
        __CLR4_1_101y651y65luszwg0g.R.inc(90997);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(90998);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))

                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test8() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),90999);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r562y51y7r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90999,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r562y51y7r() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(90999);
        __CLR4_1_101y651y65luszwg0g.R.inc(91000);String invalidMethodName = "--methodName";
        __CLR4_1_101y651y65luszwg0g.R.inc(91001);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test7?customizedCallbackParamName=" + invalidMethodName));
        __CLR4_1_101y651y65luszwg0g.R.inc(91002);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(91003);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/null({})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}

    @Test
    public void test9() throws Exception {__CLR4_1_101y651y65luszwg0g.R.globalSliceStart(getClass().getName(),91004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ue61qm1y7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y651y65luszwg0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y651y65luszwg0g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterJSONPCaseTest.test9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ue61qm1y7w() throws Exception{try{__CLR4_1_101y651y65luszwg0g.R.inc(91004);
        __CLR4_1_101y651y65luszwg0g.R.inc(91005);ResultActions actions = this.mockMvc.perform(post("/jsonp-fastjsonview/test9?callback=fnUpdateSome"));
        __CLR4_1_101y651y65luszwg0g.R.inc(91006);actions.andDo(print());
        __CLR4_1_101y651y65luszwg0g.R.inc(91007);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"id\":100})"));
    }finally{__CLR4_1_101y651y65luszwg0g.R.flushNeeded();}}
}
