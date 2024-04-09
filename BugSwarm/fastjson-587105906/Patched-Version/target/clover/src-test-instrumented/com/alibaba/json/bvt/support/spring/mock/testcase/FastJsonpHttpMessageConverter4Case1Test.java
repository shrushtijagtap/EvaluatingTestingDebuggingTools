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
public class FastJsonpHttpMessageConverter4Case1Test {static class __CLR4_5_21y901y90lusvnhot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,91091,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final MediaType APPLICATION_JAVASCRIPT = new MediaType("application", "javascript");

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21y901y90lusvnhot.R.inc(91044);
        __CLR4_5_21y901y90lusvnhot.R.inc(91045);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e3t3r1y92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.isInjectComponent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91046,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e3t3r1y92(){try{__CLR4_5_21y901y90lusvnhot.R.inc(91046);
        __CLR4_5_21y901y90lusvnhot.R.inc(91047);wac.getBean(FastJsonpResponseBodyAdvice.class);
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test1() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91048);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1y94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91048,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1y94() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91048);

        __CLR4_5_21y901y90lusvnhot.R.inc(91049);JSONObject json = new JSONObject();

        __CLR4_5_21y901y90lusvnhot.R.inc(91050);json.put("id", 123);

        __CLR4_5_21y901y90lusvnhot.R.inc(91051);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21y901y90lusvnhot.R.inc(91052);mockMvc.perform(
                (post("/fastjson/test1").characterEncoding("UTF-8").content(json.toJSONString())
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test1_2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w0ceg71y99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test1_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91053,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w0ceg71y99() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91053);

        __CLR4_5_21y901y90lusvnhot.R.inc(91054);JSONObject json = new JSONObject();

        __CLR4_5_21y901y90lusvnhot.R.inc(91055);json.put("id", 123);

        __CLR4_5_21y901y90lusvnhot.R.inc(91056);json.put("name", "\u54c8\u54c8\u54c8");

        __CLR4_5_21y901y90lusvnhot.R.inc(91057);ResultActions actions = mockMvc.perform((post("/fastjson/test1?callback=fnUpdateSome").characterEncoding(
                "UTF-8").content(json.toJSONString()).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21y901y90lusvnhot.R.inc(91058);actions.andDo(print());
        __CLR4_5_21y901y90lusvnhot.R.inc(91059);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"name\":\"\u54c8\u54c8\u54c8\",\"id\":123})"));
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91060);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1y9g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91060,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1y9g() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91060);

        __CLR4_5_21y901y90lusvnhot.R.inc(91061);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21y901y90lusvnhot.R.inc(91062);mockMvc.perform(
                (post("/fastjson/test2").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status().isOk()).andDo(print());
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test2_2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y573ba1y9j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test2_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91063,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y573ba1y9j() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91063);

        __CLR4_5_21y901y90lusvnhot.R.inc(91064);String jsonStr = "[{\"name\":\"p1\",\"sonList\":[{\"name\":\"s1\"}]},{\"name\":\"p2\",\"sonList\":[{\"name\":\"s2\"},{\"name\":\"s3\"}]}]";

        __CLR4_5_21y901y90lusvnhot.R.inc(91065);ResultActions actions = mockMvc.perform((post("/fastjson/test2?jsonp=fnUpdateSome").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21y901y90lusvnhot.R.inc(91066);actions.andDo(print());
        __CLR4_5_21y901y90lusvnhot.R.inc(91067);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({\"p1\":1,\"p2\":2})"));
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test3() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1y9o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1y9o() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91068);
        __CLR4_5_21y901y90lusvnhot.R.inc(91069);List<Object> list = this.mockMvc.perform(post("/fastjson/test3")).andReturn().getResponse()
                .getHeaderValues("Content-Length");
        __CLR4_5_21y901y90lusvnhot.R.inc(91070);Assert.assertNotEquals(list.size(), 0);
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test3_2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yr29sr1y9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test3_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91071,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yr29sr1y9r() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91071);
        __CLR4_5_21y901y90lusvnhot.R.inc(91072);ResultActions actions = this.mockMvc.perform(post("/fastjson/test3?jsonp=fnUpdateSome"));
        __CLR4_5_21y901y90lusvnhot.R.inc(91073);actions.andDo(print());
        __CLR4_5_21y901y90lusvnhot.R.inc(91074);actions.andExpect(status().isOk()).andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/fnUpdateSome({})"));
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test4() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91y9v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91075,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91y9v() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91075);

        __CLR4_5_21y901y90lusvnhot.R.inc(91076);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21y901y90lusvnhot.R.inc(91077);mockMvc.perform(
                (post("/fastjson/test4").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test4_2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wm7kxo1y9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test4_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91078,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wm7kxo1y9y() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91078);

        __CLR4_5_21y901y90lusvnhot.R.inc(91079);String jsonStr = "{\"t\":{\"id\":123,\"name\":\"\u54c8\u54c8\u54c8\"}}";

        __CLR4_5_21y901y90lusvnhot.R.inc(91080);ResultActions actions = mockMvc.perform((post("/fastjson/test4?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21y901y90lusvnhot.R.inc(91081);actions.andDo(print());
        __CLR4_5_21y901y90lusvnhot.R.inc(91082);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"t\\\":{\\\"id\\\":123,\\\"name\\\":\\\"\u54c8\u54c8\u54c8\\\"}}\")"));
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test5() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1ya3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1ya3() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91083);

        __CLR4_5_21y901y90lusvnhot.R.inc(91084);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21y901y90lusvnhot.R.inc(91085);mockMvc.perform(
                (post("/fastjson/test5").characterEncoding("UTF-8").content(jsonStr)
                        .contentType(MediaType.APPLICATION_JSON))).andDo(print());
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}

    @Test
    public void test5_2() throws Exception {__CLR4_5_21y901y90lusvnhot.R.globalSliceStart(getClass().getName(),91086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhcw2l1ya6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y901y90lusvnhot.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y901y90lusvnhot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonpHttpMessageConverter4Case1Test.test5_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhcw2l1ya6() throws Exception{try{__CLR4_5_21y901y90lusvnhot.R.inc(91086);

        __CLR4_5_21y901y90lusvnhot.R.inc(91087);String jsonStr = "{\"packet\":{\"smsType\":\"USER_LOGIN\"}}";

        __CLR4_5_21y901y90lusvnhot.R.inc(91088);ResultActions actions = mockMvc.perform((post("/fastjson/test5?callback=myUpdate").characterEncoding("UTF-8")
                .content(jsonStr).contentType(MediaType.APPLICATION_JSON)));
        __CLR4_5_21y901y90lusvnhot.R.inc(91089);actions.andDo(print());
        __CLR4_5_21y901y90lusvnhot.R.inc(91090);actions.andExpect(status().isOk())
                .andExpect(content().contentType(APPLICATION_JAVASCRIPT))
                .andExpect(content().string("/**/myUpdate(\"{\\\"packet\\\":{\\\"smsType\\\":\\\"USER_LOGIN\\\"}}\")"));
    }finally{__CLR4_5_21y901y90lusvnhot.R.flushNeeded();}}
}
