/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.security;

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
public class DefaultSavedRequestTest extends TestCase {static class __CLR4_1_101yds1ydsluszwg20{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91286,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig config;

    protected void setUp() throws Exception {try{__CLR4_1_101yds1ydsluszwg20.R.inc(91216);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91217);Field field = GenericFastJsonRedisSerializer.class.getDeclaredField("defaultRedisConfig");
        __CLR4_1_101yds1ydsluszwg20.R.inc(91218);field.setAccessible(true);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91219);config = (ParserConfig) field.get(null);
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}
    public void test_for_issue() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1ydw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91220,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1ydw() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91220);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91221);MockHttpServletRequest mockReq = new MockHttpServletRequest();
        __CLR4_1_101yds1ydsluszwg20.R.inc(91222);DefaultSavedRequest request = new DefaultSavedRequest(mockReq, new PortResolver() {

            public int getServerPort(ServletRequest servletRequest) {try{__CLR4_1_101yds1ydsluszwg20.R.inc(91223);
                __CLR4_1_101yds1ydsluszwg20.R.inc(91224);return 0;
            }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}
        });

        __CLR4_1_101yds1ydsluszwg20.R.inc(91225);String str = JSON.toJSONString(request, SerializerFeature.WriteClassName);
//        System.out.println(str);


        __CLR4_1_101yds1ydsluszwg20.R.inc(91226);JSON.parseObject(str, Object.class, config);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91227);JSON.parseObject(str);
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}


    public void test_cookie() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91228);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gsmiaw1ye4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_cookie",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91228,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gsmiaw1ye4() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91228);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91229);String json = "{\"name\":\"xx\",\"value\":\"xx\",\"comment\":\"xx\",\"domain\":\"xx\"}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91230);SavedCookie cookie = JSON.parseObject(json, SavedCookie.class);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91231);assertEquals("xx", cookie.getName());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91232);assertEquals("{\"comment\":\"xx\",\"cookie\":{\"comment\":\"xx\",\"domain\":\"xx\",\"httpOnly\":false,\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0},\"domain\":\"xx\",\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0}", JSON.toJSONString(cookie));
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91233);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ye9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91233,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ye9() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91233);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91234);DefaultCsrfToken token = JSON.parseObject("{\"token\":\"xxx\",\"parameterName\":\"222\",\"headerName\":\"hhh\"}", DefaultCsrfToken.class);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91235);assertEquals("hhh", token.getHeaderName());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91236);assertEquals("222", token.getParameterName());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91237);assertEquals("xxx", token.getToken());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91238);assertEquals("{\"headerName\":\"hhh\",\"parameterName\":\"222\",\"token\":\"xxx\"}", JSON.toJSONString(token));
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_http_cookie() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91239);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fj7agb1yef();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_http_cookie",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91239,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fj7agb1yef() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91239);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91240);Cookie cookie = new Cookie("cna", "h8a2EO57uEgCAXyg1TgBBFK");
        __CLR4_1_101yds1ydsluszwg20.R.inc(91241);cookie.setMaxAge(10);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91242);String json = JSON.toJSONString(cookie);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91243);Cookie cookie1 = JSON.parseObject(json, Cookie.class);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91244);assertEquals(cookie.getName(), cookie1.getName());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91245);assertEquals(cookie.getValue(), cookie1.getValue());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91246);assertEquals(cookie.getMaxAge(), cookie1.getMaxAge());
        //System.out.println(json);
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_PreAuthenticatedAuthenticationToken() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91247);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1018njpt1yen();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_PreAuthenticatedAuthenticationToken",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91247,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1018njpt1yen() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91247);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91248);PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken("ppp", "cccc");
        __CLR4_1_101yds1ydsluszwg20.R.inc(91249);String json = JSON.toJSONString(token);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91250);System.out.println(json);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91251);PreAuthenticatedAuthenticationToken token1 = JSON.parseObject(json, PreAuthenticatedAuthenticationToken.class);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91252);assertEquals("ppp", token1.getPrincipal());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91253);assertEquals("cccc", token1.getCredentials());
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_WebAuthenticationDetails() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91254);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ehrna1yeu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_WebAuthenticationDetails",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91254,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ehrna1yeu() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91254);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91255);WebAuthenticationDetails details = JSON.parseObject("{\"remoteAddress\":\"rrr\",\"sessionId\":\"ssss\"}", WebAuthenticationDetails.class);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91256);assertEquals("rrr", details.getRemoteAddress());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91257);assertEquals("ssss", details.getSessionId());
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_SecurityContextImpl() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91258);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10irm47d1yey();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91258,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10irm47d1yey() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91258);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91259);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\"}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91260);JSON.parseObject(json, Object.class);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91261);JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_UsernamePasswordAuthenticationToken() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91262);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uzj4x61yf2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_UsernamePasswordAuthenticationToken",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91262,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uzj4x61yf2() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91262);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91263);String json = "{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"principal\":\"pp\"}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91264);UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)JSON.parseObject(json, Object.class);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91265);UsernamePasswordAuthenticationToken token1 = (UsernamePasswordAuthenticationToken) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91266);assertEquals("pp", token.getPrincipal());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91267);assertEquals("pp", token1.getPrincipal());
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}


    public void test_SimpleGrantedAuthority() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103m7xwu1yf8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SimpleGrantedAuthority",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103m7xwu1yf8() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91268);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91269);String json = "{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"xx\"}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91270);SimpleGrantedAuthority token = (SimpleGrantedAuthority)JSON.parseObject(json, Object.class);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91271);SimpleGrantedAuthority token1 = (SimpleGrantedAuthority) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91272);assertEquals("xx", token.getAuthority());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91273);assertEquals("xx", token1.getAuthority());

        __CLR4_1_101yds1ydsluszwg20.R.inc(91274);assertEquals("{\"authority\":\"xx\"}", JSON.toJSONString(token));
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_User() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91275);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i0a2f31yff();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_User",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91275,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i0a2f31yff() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91275);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91276);String json = "{\"@type\":\"org.springframework.security.core.userdetails.User\",\"username\":\"xx\",\"authorities\":[]}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91277);User token = (User)JSON.parseObject(json, Object.class);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91278);User token1 = (User) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101yds1ydsluszwg20.R.inc(91279);assertEquals("xx", token.getUsername());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91280);assertEquals("xx", token1.getUsername());

        __CLR4_1_101yds1ydsluszwg20.R.inc(91281);assertEquals("", token.getPassword());
        __CLR4_1_101yds1ydsluszwg20.R.inc(91282);assertEquals("", token1.getPassword());
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    public void test_SecurityContextImpl_x() throws Exception {__CLR4_1_101yds1ydsluszwg20.R.globalSliceStart(getClass().getName(),91283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f561b61yfn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yds1ydsluszwg20.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yds1ydsluszwg20.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91283,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f561b61yfn() throws Exception{try{__CLR4_1_101yds1ydsluszwg20.R.inc(91283);
        __CLR4_1_101yds1ydsluszwg20.R.inc(91284);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\",\"authentication\":{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"authenticated\":true,\"authorities\":[{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"ROLE_ADMIN\"}],\"details\":{\"@type\":\"org.springframework.security.web.authentication.WebAuthenticationDetails\",\"remoteAddress\":\"0:0:0:0:0:0:0:1\",\"sessionId\":\"35dbb2c4-971c-4624-bd89-2e002180a2ca\"},\"name\":\"admin\",\"principal\":{\"@type\":\"org.springframework.security.core.userdetails.User\",\"accountNonExpired\":true,\"accountNonLocked\":true,\"authorities\":[{\"$ref\":\"$.authentication.authorities[0]\"}],\"credentialsNonExpired\":true,\"enabled\":true,\"username\":\"admin\"}}}";
        __CLR4_1_101yds1ydsluszwg20.R.inc(91285);SecurityContextImpl context = (SecurityContextImpl) JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_1_101yds1ydsluszwg20.R.flushNeeded();}}

    //
}
