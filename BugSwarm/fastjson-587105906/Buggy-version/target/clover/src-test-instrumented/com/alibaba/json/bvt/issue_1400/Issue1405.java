/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

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
public class Issue1405 {public static class __CLR4_1_101ba81ba8luszwaq7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61332,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61280);
        __CLR4_1_101ba81ba8luszwaq7.R.inc(61281);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

    @Controller
    @RequestMapping("fastjson")
    public static class BeanController {

        @RequestMapping(value = "/test1405", method = RequestMethod.GET)
        public
        @ResponseBody
        ModelAndView test7() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61282);

            __CLR4_1_101ba81ba8luszwaq7.R.inc(61283);AuthIdentityRequest authRequest = new AuthIdentityRequest();
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61284);authRequest.setAppId("cert01");
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61285);authRequest.setUserId(2307643);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61286);authRequest.setIdNumber("34324324234234");
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61287);authRequest.setRealName("\u6768\u529b");
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61288);authRequest.setBusinessLine("");
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61289);authRequest.setIgnoreIdNumberRepeat(false);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61290);authRequest.setOffline(false);

            __CLR4_1_101ba81ba8luszwaq7.R.inc(61291);ModelAndView modelAndView = new ModelAndView();
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61292);modelAndView.addObject("message", authRequest);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61293);modelAndView.addObject("title", "testPage");
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61294);modelAndView.setViewName("test");

            __CLR4_1_101ba81ba8luszwaq7.R.inc(61295);return modelAndView;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

    }


    @ComponentScan(basePackages = "com.alibaba.json.bvt.issue_1400")
    @Configuration
    @Order(Ordered.LOWEST_PRECEDENCE + 1)
    @EnableWebMvc
    public static class WebMvcConfig extends WebMvcConfigurerAdapter {
        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61296);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61297);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61298);converters.add(converter);
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        @Override
        public void configureViewResolvers(ViewResolverRegistry registry) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61299);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61300);FastJsonJsonView fastJsonJsonView = new FastJsonJsonView();
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61301);registry.enableContentNegotiation(fastJsonJsonView);
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}
    }

    @Test
    public void test7() throws Exception {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61302);

        __CLR4_1_101ba81ba8luszwaq7.R.inc(61303);mockMvc.perform(
                (get("/fastjson/test1405").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                )).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

    static class AuthIdentityRequest {

        private String appId;
        private int userId;
        private String idNumber;
        private String realName;
        private String businessLine;
        private boolean ignoreIdNumberRepeat;
        private boolean offline;

        public String getAppId() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61304);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61305);return appId;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setAppId(String appId) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61306);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61307);this.appId = appId;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public int getUserId() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61308);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61309);return userId;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setUserId(int userId) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61310);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61311);this.userId = userId;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public String getIdNumber() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61312);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61313);return idNumber;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setIdNumber(String idNumber) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61314);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61315);this.idNumber = idNumber;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public String getRealName() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61316);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61317);return realName;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setRealName(String realName) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61318);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61319);this.realName = realName;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public String getBusinessLine() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61320);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61321);return businessLine;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setBusinessLine(String businessLine) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61322);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61323);this.businessLine = businessLine;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public boolean isIgnoreIdNumberRepeat() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61324);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61325);return ignoreIdNumberRepeat;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setIgnoreIdNumberRepeat(boolean ignoreIdNumberRepeat) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61326);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61327);this.ignoreIdNumberRepeat = ignoreIdNumberRepeat;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public boolean isOffline() {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61328);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61329);return offline;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}

        public void setOffline(boolean offline) {try{__CLR4_1_101ba81ba8luszwaq7.R.inc(61330);
            __CLR4_1_101ba81ba8luszwaq7.R.inc(61331);this.offline = offline;
        }finally{__CLR4_1_101ba81ba8luszwaq7.R.flushNeeded();}}
    }


}
