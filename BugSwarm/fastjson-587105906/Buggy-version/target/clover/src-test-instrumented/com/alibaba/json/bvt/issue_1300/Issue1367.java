/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.alibaba.fastjson.support.spring.FastJsonpHttpMessageConverter4;
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

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.Serializable;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by songlingdong on 8/5/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class Issue1367 {public static class __CLR4_1_101b5c1b5cluszwaof{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61125,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61104);
        __CLR4_1_101b5c1b5cluszwaof.R.inc(61105);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}





    public static class AbstractController<ID extends Serializable, PO extends GenericEntity<ID>> {

        @PostMapping(path = "/typeVariableBean",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public PO save(@RequestBody PO dto) {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61106);
            //do something
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61107);return dto;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}

    }

    @RestController
    @RequestMapping()
    public static class BeanController extends AbstractController<Long, TypeVariableBean> {



        @PostMapping(path = "/parameterizedTypeBean",consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
        public String parameterizedTypeBean(@RequestBody ParameterizedTypeBean<String> parameterizedTypeBean){try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61108);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61109);return parameterizedTypeBean.t;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}


    }


    @ComponentScan(basePackages = "com.alibaba.json.bvt.issue_1300")
    @Configuration
    @Order(Ordered.LOWEST_PRECEDENCE + 1)
    @EnableWebMvc
    public static class WebMvcConfig extends WebMvcConfigurerAdapter {
        @Override
        public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61110);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61111);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61112);converters.add(converter);
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}


    }


    @Test
    public void testParameterizedTypeBean() throws Exception {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61113);
        __CLR4_1_101b5c1b5cluszwaof.R.inc(61114);mockMvc.perform(
                (post("/parameterizedTypeBean").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content("{\"t\": \"neil dong\"}")
                        )).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}

    @Test
    public void testTypeVariableBean() throws Exception {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61115);
        __CLR4_1_101b5c1b5cluszwaof.R.inc(61116);mockMvc.perform(
                (post("/typeVariableBean").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON_UTF8_VALUE)
                        .content("{\"id\": 1}")
                        )).andExpect(status().isOk()).andDo(print());

    }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}





    static abstract class GenericEntity<ID extends Serializable> {
        public abstract ID getId();
    }

    static class TypeVariableBean extends GenericEntity<Long> {
        private Long id;

        @Override
        public Long getId() {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61117);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61118);return id;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}

        public void setId(Long id) {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61119);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61120);this.id = id;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}
    }

    static class ParameterizedTypeBean<T> {
        private T t;

        public T getT() {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61121);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61122);return t;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}

        public void setT(T t) {try{__CLR4_1_101b5c1b5cluszwaof.R.inc(61123);
            __CLR4_1_101b5c1b5cluszwaof.R.inc(61124);this.t = t;
        }finally{__CLR4_1_101b5c1b5cluszwaof.R.flushNeeded();}}



    }
}
