/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import java.util.List;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "classpath*:/config/applicationContext-mvc4.xml" })
public class FastJsonpHttpMessageConverter4Case1Test {static class __CLR4_5_21xas1xaslusyjvoy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89812);
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89813);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e3t3r1xau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.isInjectComponent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e3t3r1xau(){try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89814);
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89815);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1xaw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1xaw() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89816);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89817);JSONObject json = new JSONObject();

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89818);json.put("id", 123);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89819);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89820);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89821);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0ceg71xb1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test1_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89821,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0ceg71xb1() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89821);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89822);JSONObject json = new JSONObject();

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89823);json.put("id", 123);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89824);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89825);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89826);actions.andDo(print());
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89827);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1xb8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1xb8() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89828);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89829);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89830);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y573ba1xbb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test2_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89831,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y573ba1xbb() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89831);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89832);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89833);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89834);actions.andDo(print());
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89835);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1xbg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1xbg() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89836);
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89837);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89838);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yr29sr1xbj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test3_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yr29sr1xbj() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89839);
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89840);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89841);actions.andDo(print());
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89842);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91xbn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91xbn() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89843);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89844);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89845);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm7kxo1xbq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test4_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm7kxo1xbq() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89846);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89847);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89848);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89849);actions.andDo(print());
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89850);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89851);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1xbv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89851,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1xbv() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89851);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89852);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89853);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_5_21xas1xaslusyjvoy.R.globalSliceStart(getClass().getName(),89854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhcw2l1xby();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xas1xaslusyjvoy.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xas1xaslusyjvoy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test5_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhcw2l1xby() throws Exception{try{__CLR4_5_21xas1xaslusyjvoy.R.inc(89854);

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89855);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21xas1xaslusyjvoy.R.inc(89856);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89857);actions.andDo(print());
        __CLR4_5_21xas1xaslusyjvoy.R.inc(89858);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_5_21xas1xaslusyjvoy.R.flushNeeded();}}
}
