/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1700;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration
public class Issue1701 {public static class __CLR4_5_21d801d80lusvnavg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,63818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21d801d80lusvnavg.R.inc(63792);
        __CLR4_5_21d801d80lusvnavg.R.inc(63793);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}


    @RestController
    @RequestMapping()
    public static class BeanController {

        @PostMapping(path = "/download", produces = "application/octet-stream;charset=UTF-8")
        public @ResponseBody
        ResponseEntity<byte[]> download(@RequestBody TestBean testBean) {try{__CLR4_5_21d801d80lusvnavg.R.inc(63794);

            __CLR4_5_21d801d80lusvnavg.R.inc(63795);byte[] body = new byte[0];
            __CLR4_5_21d801d80lusvnavg.R.inc(63796);InputStream in;
            __CLR4_5_21d801d80lusvnavg.R.inc(63797);try {
                __CLR4_5_21d801d80lusvnavg.R.inc(63798);in = Issue1701.class.getClassLoader().getResourceAsStream(testBean.getName());
                __CLR4_5_21d801d80lusvnavg.R.inc(63799);body = new byte[in.available()];
                __CLR4_5_21d801d80lusvnavg.R.inc(63800);in.read(body);

            } catch (FileNotFoundException e) {
                __CLR4_5_21d801d80lusvnavg.R.inc(63801);e.printStackTrace();
            } catch (IOException e) {
                __CLR4_5_21d801d80lusvnavg.R.inc(63802);e.printStackTrace();
            }

            __CLR4_5_21d801d80lusvnavg.R.inc(63803);HttpHeaders headers = new HttpHeaders();
            __CLR4_5_21d801d80lusvnavg.R.inc(63804);headers.add("Content-Disposition", "attachment;filename=1.txt");
            __CLR4_5_21d801d80lusvnavg.R.inc(63805);HttpStatus statusCode = HttpStatus.OK;
            __CLR4_5_21d801d80lusvnavg.R.inc(63806);ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(body, headers, statusCode);

            __CLR4_5_21d801d80lusvnavg.R.inc(63807);return response;
        }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}
    }


    @ComponentScan(basePackages = "com.alibaba.json.bvt.issue_1700")
    @Configuration
    @EnableWebMvc
    public static class WebMvcConfig extends WebMvcConfigurerAdapter {

        @Override
        public void extendMessageConverters(List<HttpMessageConverter<?>> converters) {try{__CLR4_5_21d801d80lusvnavg.R.inc(63808);
            __CLR4_5_21d801d80lusvnavg.R.inc(63809);FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
            __CLR4_5_21d801d80lusvnavg.R.inc(63810);converter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON_UTF8));
            __CLR4_5_21d801d80lusvnavg.R.inc(63811);converters.add(0, converter);
        }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}
    }

    @Test
    public void testBean() throws Exception {try{__CLR4_5_21d801d80lusvnavg.R.inc(63812);
        __CLR4_5_21d801d80lusvnavg.R.inc(63813);mockMvc.perform(
                (post("/download").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
                        .content("{\"name\": \"1.txt\"}")
                )).andExpect(status().isOk()).andDo(print());

    }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}

    static class TestBean {

        private String name;

        public String getName() {try{__CLR4_5_21d801d80lusvnavg.R.inc(63814);
            __CLR4_5_21d801d80lusvnavg.R.inc(63815);return name;
        }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21d801d80lusvnavg.R.inc(63816);
            __CLR4_5_21d801d80lusvnavg.R.inc(63817);this.name = name;
        }finally{__CLR4_5_21d801d80lusvnavg.R.flushNeeded();}}
    }
}
