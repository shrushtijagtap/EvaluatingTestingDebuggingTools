/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonViewResponseBodyAdvice;
import com.alibaba.fastjson.support.spring.JSONPResponseBodyAdvice;
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
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.asyncDispatch;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class FastJsonHttpMessageConverterCase2Test {static class __CLR4_1_101x7g1x7glusqkn44{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89709,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @ComponentScan(basePackages = "com.alibaba.json.bvt.support.spring.mock.controller")
    @EnableWebMvc
    @Configuration
    protected static class Config extends WebMvcConfigurerAdapter {
        @Bean
        public JSONPResponseBodyAdvice jsonpResponseBodyAdvice() {try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89692);
            __CLR4_1_101x7g1x7glusqkn44.R.inc(89693);return new JSONPResponseBodyAdvice();
        }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}

        @Bean
        FastJsonViewResponseBodyAdvice fastJsonViewResponseBodyAdvice() {try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89694);
            __CLR4_1_101x7g1x7glusqkn44.R.inc(89695);return new FastJsonViewResponseBodyAdvice();
        }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}


        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89696);
            __CLR4_1_101x7g1x7glusqkn44.R.inc(89697);converters.add(0, new FastJsonHttpMessageConverter());
            __CLR4_1_101x7g1x7glusqkn44.R.inc(89698);super.extendMessageConverters(converters);
        }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}
    }

    @Before
    public void setup() {try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89699);
        __CLR4_1_101x7g1x7glusqkn44.R.inc(89700);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_1_101x7g1x7glusqkn44.R.globalSliceStart(getClass().getName(),89701);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102e3t3r1x7p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7g1x7glusqkn44.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7g1x7glusqkn44.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterCase2Test.isInjectComponent",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89701,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102e3t3r1x7p(){try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89701);
        __CLR4_1_101x7g1x7glusqkn44.R.inc(89702);wac.getBean(JSONPResponseBodyAdvice.class);
        __CLR4_1_101x7g1x7glusqkn44.R.inc(89703);wac.getBean(FastJsonViewResponseBodyAdvice.class);
    }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}

    @Test
    public void test8() throws Exception {__CLR4_1_101x7g1x7glusqkn44.R.globalSliceStart(getClass().getName(),89704);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r562y51x7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7g1x7glusqkn44.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7g1x7glusqkn44.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterCase2Test.test8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89704,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r562y51x7s() throws Exception{try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89704);
        __CLR4_1_101x7g1x7glusqkn44.R.inc(89705);mockMvc.perform(
                (post("/jsonp-fastjsonview/test8").characterEncoding("UTF-8")
                        .contentType(FastJsonHttpMessageConverter.APPLICATION_JAVASCRIPT))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}

    @Test
    public void test8_2() throws Exception {__CLR4_1_101x7g1x7glusqkn44.R.globalSliceStart(getClass().getName(),89706);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o2sthc1x7u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x7g1x7glusqkn44.R.rethrow($CLV_t2$);}finally{__CLR4_1_101x7g1x7glusqkn44.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonHttpMessageConverterCase2Test.test8_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89706,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o2sthc1x7u() throws Exception{try{__CLR4_1_101x7g1x7glusqkn44.R.inc(89706);
//        ResultActions actions = mockMvc.perform((post("/jsonp-fastjsonview/test8?callback=fnUpdateSome").characterEncoding(
//                "UTF-8")));
//        actions.andDo(print());
//        actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
//                .andExpect(content().string("fnUpdateSome({\"id\":100,\"name\":\"\u6d4b\u8bd5\"})"));

        __CLR4_1_101x7g1x7glusqkn44.R.inc(89707);MvcResult mvcResult = mockMvc.perform(post("/jsonp-fastjsonview/test8?callback=fnUpdateSome").characterEncoding("UTF-8"))
                .andExpect(request().asyncStarted())
                .andReturn();


        __CLR4_1_101x7g1x7glusqkn44.R.inc(89708);mockMvc.perform(asyncDispatch(mvcResult))
                .andExpect(status().isOk())
                .andExpect(content().contentType(FastJsonHttpMessageConverter.APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_1_101x7g1x7glusqkn44.R.flushNeeded();}}


}
