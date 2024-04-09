/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.security;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import junit.framework.TestCase;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.PortResolver;
import org.springframework.security.web.authentication.WebAuthenticationDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationToken;
import org.springframework.security.web.csrf.DefaultCsrfToken;
import org.springframework.security.web.savedrequest.DefaultSavedRequest;
import org.springframework.security.web.savedrequest.SavedCookie;

import javax.servlet.ServletRequest;
import javax.servlet.http.Cookie;
import java.lang.reflect.Field;

/**
 * Created by wenshao on 11/08/2017.
 */
public class DefaultSavedRequestTest extends TestCase {static class __CLR4_5_21ydh1ydhlusvnhr4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,91275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig config;

    protected void setUp() throws Exception {try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91205);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91206);Field field = GenericFastJsonRedisSerializer.class.getDeclaredField("defaultRedisConfig");
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91207);field.setAccessible(true);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91208);config = (ParserConfig) field.get(null);
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}
    public void test_for_issue() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91209);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1ydl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91209,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1ydl() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91209);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91210);MockHttpServletRequest mockReq = new MockHttpServletRequest();
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91211);DefaultSavedRequest request = new DefaultSavedRequest(mockReq, new PortResolver() {

            public int getServerPort(ServletRequest servletRequest) {try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91212);
                __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91213);return 0;
            }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}
        });

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91214);String str = JSON.toJSONString(request, SerializerFeature.WriteClassName);
//        System.out.println(str);


        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91215);JSON.parseObject(str, Object.class, config);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91216);JSON.parseObject(str);
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}


    public void test_cookie() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gsmiaw1ydt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_cookie",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gsmiaw1ydt() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91217);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91218);String json = "{\"name\":\"xx\",\"value\":\"xx\",\"comment\":\"xx\",\"domain\":\"xx\"}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91219);SavedCookie cookie = JSON.parseObject(json, SavedCookie.class);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91220);assertEquals("xx", cookie.getName());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91221);assertEquals("{\"comment\":\"xx\",\"cookie\":{\"comment\":\"xx\",\"domain\":\"xx\",\"httpOnly\":false,\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0},\"domain\":\"xx\",\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0}", JSON.toJSONString(cookie));
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21ydy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91222,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21ydy() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91222);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91223);DefaultCsrfToken token = JSON.parseObject("{\"token\":\"xxx\",\"parameterName\":\"222\",\"headerName\":\"hhh\"}", DefaultCsrfToken.class);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91224);assertEquals("hhh", token.getHeaderName());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91225);assertEquals("222", token.getParameterName());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91226);assertEquals("xxx", token.getToken());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91227);assertEquals("{\"headerName\":\"hhh\",\"parameterName\":\"222\",\"token\":\"xxx\"}", JSON.toJSONString(token));
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_http_cookie() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fj7agb1ye4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_http_cookie",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91228,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fj7agb1ye4() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91228);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91229);Cookie cookie = new Cookie("cna", "h8a2EO57uEgCAXyg1TgBBFK");
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91230);cookie.setMaxAge(10);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91231);String json = JSON.toJSONString(cookie);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91232);Cookie cookie1 = JSON.parseObject(json, Cookie.class);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91233);assertEquals(cookie.getName(), cookie1.getName());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91234);assertEquals(cookie.getValue(), cookie1.getValue());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91235);assertEquals(cookie.getMaxAge(), cookie1.getMaxAge());
        //System.out.println(json);
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_PreAuthenticatedAuthenticationToken() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218njpt1yec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_PreAuthenticatedAuthenticationToken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218njpt1yec() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91236);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91237);PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken("ppp", "cccc");
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91238);String json = JSON.toJSONString(token);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91239);System.out.println(json);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91240);PreAuthenticatedAuthenticationToken token1 = JSON.parseObject(json, PreAuthenticatedAuthenticationToken.class);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91241);assertEquals("ppp", token1.getPrincipal());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91242);assertEquals("cccc", token1.getCredentials());
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_WebAuthenticationDetails() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91243);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ehrna1yej();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_WebAuthenticationDetails",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91243,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ehrna1yej() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91243);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91244);WebAuthenticationDetails details = JSON.parseObject("{\"remoteAddress\":\"rrr\",\"sessionId\":\"ssss\"}", WebAuthenticationDetails.class);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91245);assertEquals("rrr", details.getRemoteAddress());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91246);assertEquals("ssss", details.getSessionId());
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_SecurityContextImpl() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2irm47d1yen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91247,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2irm47d1yen() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91247);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91248);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\"}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91249);JSON.parseObject(json, Object.class);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91250);JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_UsernamePasswordAuthenticationToken() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91251);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzj4x61yer();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_UsernamePasswordAuthenticationToken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91251,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzj4x61yer() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91251);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91252);String json = "{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"principal\":\"pp\"}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91253);UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)JSON.parseObject(json, Object.class);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91254);UsernamePasswordAuthenticationToken token1 = (UsernamePasswordAuthenticationToken) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91255);assertEquals("pp", token.getPrincipal());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91256);assertEquals("pp", token1.getPrincipal());
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}


    public void test_SimpleGrantedAuthority() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91257);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23m7xwu1yex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SimpleGrantedAuthority",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91257,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23m7xwu1yex() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91257);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91258);String json = "{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"xx\"}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91259);SimpleGrantedAuthority token = (SimpleGrantedAuthority)JSON.parseObject(json, Object.class);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91260);SimpleGrantedAuthority token1 = (SimpleGrantedAuthority) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91261);assertEquals("xx", token.getAuthority());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91262);assertEquals("xx", token1.getAuthority());

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91263);assertEquals("{\"authority\":\"xx\"}", JSON.toJSONString(token));
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_User() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91264);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0a2f31yf4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_User",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91264,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0a2f31yf4() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91264);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91265);String json = "{\"@type\":\"org.springframework.security.core.userdetails.User\",\"username\":\"xx\",\"authorities\":[]}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91266);User token = (User)JSON.parseObject(json, Object.class);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91267);User token1 = (User) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91268);assertEquals("xx", token.getUsername());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91269);assertEquals("xx", token1.getUsername());

        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91270);assertEquals("", token.getPassword());
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91271);assertEquals("", token1.getPassword());
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    public void test_SecurityContextImpl_x() throws Exception {__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceStart(getClass().getName(),91272);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f561b61yfc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ydh1ydhlusvnhr4.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ydh1ydhlusvnhr4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91272,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f561b61yfc() throws Exception{try{__CLR4_5_21ydh1ydhlusvnhr4.R.inc(91272);
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91273);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\",\"authentication\":{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"authenticated\":true,\"authorities\":[{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"ROLE_ADMIN\"}],\"details\":{\"@type\":\"org.springframework.security.web.authentication.WebAuthenticationDetails\",\"remoteAddress\":\"0:0:0:0:0:0:0:1\",\"sessionId\":\"35dbb2c4-971c-4624-bd89-2e002180a2ca\"},\"name\":\"admin\",\"principal\":{\"@type\":\"org.springframework.security.core.userdetails.User\",\"accountNonExpired\":true,\"accountNonLocked\":true,\"authorities\":[{\"$ref\":\"$.authentication.authorities[0]\"}],\"credentialsNonExpired\":true,\"enabled\":true,\"username\":\"admin\"}}}";
        __CLR4_5_21ydh1ydhlusvnhr4.R.inc(91274);SecurityContextImpl context = (SecurityContextImpl) JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_5_21ydh1ydhlusvnhr4.R.flushNeeded();}}

    //
}
