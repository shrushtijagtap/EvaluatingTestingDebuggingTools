/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.testcase;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.spring.FastJsonViewResponseBodyAdvice;
import com.alibaba.fastjson.support.spring.FastJsonpResponseBodyAdvice;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * FastJsonView\u6ce8\u89e3\u6d4b\u8bd5
 * Created by yanquanyu on 17-5-31.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration({ "classpath*:/config/applicationContext-mvc5.xml" })
public class FastJsonViewTest {static class __CLR4_5_21y8k1y8klusvnhoj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,91044,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91028);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91029);this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac) //
                .addFilter(new CharacterEncodingFilter("UTF-8", true)) // \u8bbe\u7f6e\u670d\u52a1\u5668\u7aef\u8fd4\u56de\u7684\u5b57\u7b26\u96c6\u4e3a\uff1aUTF-8
                .build();
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    @Test
    public void isInjectComponent() {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22e3t3r1y8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.isInjectComponent",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91030,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22e3t3r1y8m(){try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91030);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91031);wac.getBean(FastJsonViewResponseBodyAdvice.class);
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u53ea\u5305\u62ec\u7b80\u5355\u5c5e\u6027\u7684\u5bf9\u8c61\uff0c\u5355\u72ec\u4f7f\u7528include\u5c5e\u6027
     */
    @Test
    public void test1() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24e6beu1y8o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24e6beu1y8o() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91032);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91033);mockMvc.perform(
                (post("/fastjsonview/test1").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()
        ).andExpect(content().string("{\"id\":100,\"name\":\"\u6d4b\u8bd5\"}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u53ea\u5305\u62ec\u7b80\u5355\u5c5e\u6027\u7684\u5bf9\u8c61\uff0c\u5355\u72ec\u4f7f\u7528exclude\u5c5e\u6027
     */
    @Test
    public void test2() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91034);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27n6a7b1y8q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91034,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27n6a7b1y8q() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91034);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91035);mockMvc.perform(
                (post("/fastjsonview/test2").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()
        ).andExpect(content().string("{\"description\":\"fastjsonview\u6ce8\u89e3\u6d4b\u8bd5\",\"stock\":\"haha\"}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u590d\u6742\u5bf9\u8c61\uff1a\u5305\u542bDepartment\u5bf9\u8c61\u7684Company\u5bf9\u8c61\uff0c\u4e24\u4e2a\u5bf9\u8c61\u90fd\u4f7f\u7528include\u5c5e\u6027
     */
    @Test
    public void test3() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aw68zs1y8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91036,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aw68zs1y8s() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91036);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91037);mockMvc.perform(
                (post("/fastjsonview/test3").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()).andExpect(content().string("{\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"description\":\"\u90e8\u95e81\u63cf\u8ff0\"}}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u590d\u6742\u5bf9\u8c61\uff1a\u5305\u542bDepartment\u5bf9\u8c61\u7684Company\u5bf9\u8c61\uff0c\u4e24\u4e2a\u5bf9\u8c61\u5206\u522b\u4f7f\u7528include\u548cexclude\u5c5e\u6027
     */
    @Test
    public void test4() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e567s91y8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91038,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e567s91y8u() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91038);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91039);mockMvc.perform(
                (post("/fastjsonview/test4").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()).andExpect(content().string("{\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"children\":[],\"id\":1,\"members\":[],\"name\":\"\u90e8\u95e81\"}}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u590d\u6742\u5bf9\u8c61\uff1a\u5305\u542bDepartment\u5bf9\u8c61\u7684Company\u5bf9\u8c61\uff0cDepartment\u4f7f\u7528exclude\u5c5e\u6027
     */
    @Test
    public void test5() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2he66kq1y8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2he66kq1y8w() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91040);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91041);mockMvc.perform(
                (post("/fastjsonview/test5").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()).andExpect(content().string("{\"description\":\"fastjsonview\u6ce8\u89e3\u6d4b\u8bd5\",\"id\":100,\"name\":\"\u6d4b\u8bd5\",\"rootDepartment\":{\"children\":[],\"id\":1,\"members\":[],\"name\":\"\u90e8\u95e81\"},\"stock\":\"haha\"}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}

    /**
     * \u53ea\u5305\u62ec\u7b80\u5355\u5c5e\u6027\u7684\u5bf9\u8c61\uff0c\u540c\u65f6\u4f7f\u7528include\u548cexclude\u5c5e\u6027
     */
    @Test
    public void test6() throws Exception {__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceStart(getClass().getName(),91042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kn65d71y8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y8k1y8klusvnhoj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21y8k1y8klusvnhoj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.testcase.FastJsonViewTest.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91042,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kn65d71y8y() throws Exception{try{__CLR4_5_21y8k1y8klusvnhoj.R.inc(91042);
        __CLR4_5_21y8k1y8klusvnhoj.R.inc(91043);mockMvc.perform(
                (post("/fastjsonview/test6").characterEncoding("UTF-8")
                        .contentType(MediaType.APPLICATION_JSON))).andExpect(status
                ().isOk()).andDo(print()).andExpect(content().string("{\"id\":100}"));
    }finally{__CLR4_5_21y8k1y8klusvnhoj.R.flushNeeded();}}
}
