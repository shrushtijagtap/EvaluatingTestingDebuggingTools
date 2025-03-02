/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonJsonView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by songlingdong on 8/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class Issue1405 {public static class __CLR4_5_21abp1abplusyjstw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60037);
        __CLR4_5_21abp1abplusyjstw.R.inc(60038);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

    @Controller
    @RequestMapping("fastjson")
    public static class BeanController {

        @RequestMapping(value = "/test1405", method = RequestMethod.GET)
        public
        @ResponseBody
        ModelAndView test7() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60039);

            __CLR4_5_21abp1abplusyjstw.R.inc(60040);AuthIdentityRequest authRequest = new AuthIdentityRequest();
            __CLR4_5_21abp1abplusyjstw.R.inc(60041);authRequest.setAppId("cert01");
            __CLR4_5_21abp1abplusyjstw.R.inc(60042);authRequest.setUserId(2307643);
            __CLR4_5_21abp1abplusyjstw.R.inc(60043);authRequest.setIdNumber("34324324234234");
            __CLR4_5_21abp1abplusyjstw.R.inc(60044);authRequest.setRealName("\u6768\u529b");
            __CLR4_5_21abp1abplusyjstw.R.inc(60045);authRequest.setBusinessLine("");
            __CLR4_5_21abp1abplusyjstw.R.inc(60046);authRequest.setIgnoreIdNumberRepeat(false);
            __CLR4_5_21abp1abplusyjstw.R.inc(60047);authRequest.setOffline(false);

            __CLR4_5_21abp1abplusyjstw.R.inc(60048);ModelAndView modelAndView = new ModelAndView();
            __CLR4_5_21abp1abplusyjstw.R.inc(60049);modelAndView.addObject("message", authRequest);
            __CLR4_5_21abp1abplusyjstw.R.inc(60050);modelAndView.addObject("title", "testPage");
            __CLR4_5_21abp1abplusyjstw.R.inc(60051);modelAndView.setViewName("test");

            __CLR4_5_21abp1abplusyjstw.R.inc(60052);return modelAndView;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

    }


    @ComponentScan(basePackages = "com.alibaba.json.bvt.issue_1400")
    @Configuration
    @Order(Ordered.LOWEST_PRECEDENCE + 1)
    @EnableWebMvc
    public static class WebMvcConfig extends WebMvcConfigurerAdapter {
        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60053);
            __CLR4_5_21abp1abplusyjstw.R.inc(60054);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
            __CLR4_5_21abp1abplusyjstw.R.inc(60055);converters.add(converter);
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        @Override
        public void configureViewResolvers(ViewResolverRegistry registry) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60056);
            __CLR4_5_21abp1abplusyjstw.R.inc(60057);FastJsonJsonView fastJsonJsonView = new FastJsonJsonView();
            __CLR4_5_21abp1abplusyjstw.R.inc(60058);registry.enableContentNegotiation(fastJsonJsonView);
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}
    }

    @Test
    public void test7() throws Exception {try{__CLR4_5_21abp1abplusyjstw.R.inc(60059);

        __CLR4_5_21abp1abplusyjstw.R.inc(60060);mockMvc.perform(
                (get("/fastjson/test1405").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                )).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

    static class AuthIdentityRequest {

        private String appId;
        private int userId;
        private String idNumber;
        private String realName;
        private String businessLine;
        private boolean ignoreIdNumberRepeat;
        private boolean offline;

        public String getAppId() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60061);
            __CLR4_5_21abp1abplusyjstw.R.inc(60062);return appId;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setAppId(String appId) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60063);
            __CLR4_5_21abp1abplusyjstw.R.inc(60064);this.appId = appId;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public int getUserId() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60065);
            __CLR4_5_21abp1abplusyjstw.R.inc(60066);return userId;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60067);
            __CLR4_5_21abp1abplusyjstw.R.inc(60068);this.userId = userId;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public String getIdNumber() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60069);
            __CLR4_5_21abp1abplusyjstw.R.inc(60070);return idNumber;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setIdNumber(String idNumber) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60071);
            __CLR4_5_21abp1abplusyjstw.R.inc(60072);this.idNumber = idNumber;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public String getRealName() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60073);
            __CLR4_5_21abp1abplusyjstw.R.inc(60074);return realName;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setRealName(String realName) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60075);
            __CLR4_5_21abp1abplusyjstw.R.inc(60076);this.realName = realName;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public String getBusinessLine() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60077);
            __CLR4_5_21abp1abplusyjstw.R.inc(60078);return businessLine;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setBusinessLine(String businessLine) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60079);
            __CLR4_5_21abp1abplusyjstw.R.inc(60080);this.businessLine = businessLine;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public boolean isIgnoreIdNumberRepeat() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60081);
            __CLR4_5_21abp1abplusyjstw.R.inc(60082);return ignoreIdNumberRepeat;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setIgnoreIdNumberRepeat(boolean ignoreIdNumberRepeat) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60083);
            __CLR4_5_21abp1abplusyjstw.R.inc(60084);this.ignoreIdNumberRepeat = ignoreIdNumberRepeat;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public boolean isOffline() {try{__CLR4_5_21abp1abplusyjstw.R.inc(60085);
            __CLR4_5_21abp1abplusyjstw.R.inc(60086);return offline;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}

        public void setOffline(boolean offline) {try{__CLR4_5_21abp1abplusyjstw.R.inc(60087);
            __CLR4_5_21abp1abplusyjstw.R.inc(60088);this.offline = offline;
        }finally{__CLR4_5_21abp1abplusyjstw.R.flushNeeded();}}
    }


}
