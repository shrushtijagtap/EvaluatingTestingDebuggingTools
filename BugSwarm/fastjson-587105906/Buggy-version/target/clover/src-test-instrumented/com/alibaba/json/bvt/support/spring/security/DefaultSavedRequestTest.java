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
public class DefaultSavedRequestTest extends TestCase {static class __CLR4_1_101xfk1xfklusqkn7e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90054,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig config;

    protected void setUp() throws Exception {try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(89984);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89985);Field field = GenericFastJsonRedisSerializer.class.getDeclaredField("defaultRedisConfig");
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89986);field.setAccessible(true);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89987);config = (ParserConfig) field.get(null);
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}
    public void test_for_issue() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),89988);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1xfo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89988,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1xfo() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(89988);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89989);MockHttpServletRequest mockReq = new MockHttpServletRequest();
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89990);DefaultSavedRequest request = new DefaultSavedRequest(mockReq, new PortResolver() {

            public int getServerPort(ServletRequest servletRequest) {try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(89991);
                __CLR4_1_101xfk1xfklusqkn7e.R.inc(89992);return 0;
            }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}
        });

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89993);String str = JSON.toJSONString(request, SerializerFeature.WriteClassName);
//        System.out.println(str);


        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89994);JSON.parseObject(str, Object.class, config);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89995);JSON.parseObject(str);
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}


    public void test_cookie() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),89996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gsmiaw1xfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_cookie",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89996,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gsmiaw1xfw() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(89996);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89997);String json = "{\"name\":\"xx\",\"value\":\"xx\",\"comment\":\"xx\",\"domain\":\"xx\"}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89998);SavedCookie cookie = JSON.parseObject(json, SavedCookie.class);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(89999);assertEquals("xx", cookie.getName());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90000);assertEquals("{\"comment\":\"xx\",\"cookie\":{\"comment\":\"xx\",\"domain\":\"xx\",\"httpOnly\":false,\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0},\"domain\":\"xx\",\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0}", JSON.toJSONString(cookie));
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90001);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21xg1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90001,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21xg1() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90001);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90002);DefaultCsrfToken token = JSON.parseObject("{\"token\":\"xxx\",\"parameterName\":\"222\",\"headerName\":\"hhh\"}", DefaultCsrfToken.class);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90003);assertEquals("hhh", token.getHeaderName());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90004);assertEquals("222", token.getParameterName());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90005);assertEquals("xxx", token.getToken());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90006);assertEquals("{\"headerName\":\"hhh\",\"parameterName\":\"222\",\"token\":\"xxx\"}", JSON.toJSONString(token));
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_http_cookie() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fj7agb1xg7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_http_cookie",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fj7agb1xg7() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90007);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90008);Cookie cookie = new Cookie("cna", "h8a2EO57uEgCAXyg1TgBBFK");
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90009);cookie.setMaxAge(10);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90010);String json = JSON.toJSONString(cookie);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90011);Cookie cookie1 = JSON.parseObject(json, Cookie.class);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90012);assertEquals(cookie.getName(), cookie1.getName());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90013);assertEquals(cookie.getValue(), cookie1.getValue());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90014);assertEquals(cookie.getMaxAge(), cookie1.getMaxAge());
        //System.out.println(json);
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_PreAuthenticatedAuthenticationToken() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1018njpt1xgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_PreAuthenticatedAuthenticationToken",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90015,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1018njpt1xgf() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90015);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90016);PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken("ppp", "cccc");
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90017);String json = JSON.toJSONString(token);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90018);System.out.println(json);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90019);PreAuthenticatedAuthenticationToken token1 = JSON.parseObject(json, PreAuthenticatedAuthenticationToken.class);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90020);assertEquals("ppp", token1.getPrincipal());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90021);assertEquals("cccc", token1.getCredentials());
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_WebAuthenticationDetails() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ehrna1xgm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_WebAuthenticationDetails",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ehrna1xgm() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90022);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90023);WebAuthenticationDetails details = JSON.parseObject("{\"remoteAddress\":\"rrr\",\"sessionId\":\"ssss\"}", WebAuthenticationDetails.class);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90024);assertEquals("rrr", details.getRemoteAddress());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90025);assertEquals("ssss", details.getSessionId());
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_SecurityContextImpl() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90026);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10irm47d1xgq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90026,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10irm47d1xgq() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90026);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90027);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\"}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90028);JSON.parseObject(json, Object.class);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90029);JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_UsernamePasswordAuthenticationToken() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90030);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uzj4x61xgu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_UsernamePasswordAuthenticationToken",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90030,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uzj4x61xgu() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90030);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90031);String json = "{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"principal\":\"pp\"}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90032);UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)JSON.parseObject(json, Object.class);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90033);UsernamePasswordAuthenticationToken token1 = (UsernamePasswordAuthenticationToken) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90034);assertEquals("pp", token.getPrincipal());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90035);assertEquals("pp", token1.getPrincipal());
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}


    public void test_SimpleGrantedAuthority() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90036);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103m7xwu1xh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SimpleGrantedAuthority",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90036,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103m7xwu1xh0() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90036);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90037);String json = "{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"xx\"}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90038);SimpleGrantedAuthority token = (SimpleGrantedAuthority)JSON.parseObject(json, Object.class);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90039);SimpleGrantedAuthority token1 = (SimpleGrantedAuthority) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90040);assertEquals("xx", token.getAuthority());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90041);assertEquals("xx", token1.getAuthority());

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90042);assertEquals("{\"authority\":\"xx\"}", JSON.toJSONString(token));
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_User() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90043);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i0a2f31xh7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_User",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90043,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i0a2f31xh7() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90043);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90044);String json = "{\"@type\":\"org.springframework.security.core.userdetails.User\",\"username\":\"xx\",\"authorities\":[]}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90045);User token = (User)JSON.parseObject(json, Object.class);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90046);User token1 = (User) JSON.parseObject(json, Object.class, config);

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90047);assertEquals("xx", token.getUsername());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90048);assertEquals("xx", token1.getUsername());

        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90049);assertEquals("", token.getPassword());
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90050);assertEquals("", token1.getPassword());
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    public void test_SecurityContextImpl_x() throws Exception {__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceStart(getClass().getName(),90051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f561b61xhf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xfk1xfklusqkn7e.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xfk1xfklusqkn7e.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f561b61xhf() throws Exception{try{__CLR4_1_101xfk1xfklusqkn7e.R.inc(90051);
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90052);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\",\"authentication\":{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"authenticated\":true,\"authorities\":[{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"ROLE_ADMIN\"}],\"details\":{\"@type\":\"org.springframework.security.web.authentication.WebAuthenticationDetails\",\"remoteAddress\":\"0:0:0:0:0:0:0:1\",\"sessionId\":\"35dbb2c4-971c-4624-bd89-2e002180a2ca\"},\"name\":\"admin\",\"principal\":{\"@type\":\"org.springframework.security.core.userdetails.User\",\"accountNonExpired\":true,\"accountNonLocked\":true,\"authorities\":[{\"$ref\":\"$.authentication.authorities[0]\"}],\"credentialsNonExpired\":true,\"enabled\":true,\"username\":\"admin\"}}}";
        __CLR4_1_101xfk1xfklusqkn7e.R.inc(90053);SecurityContextImpl context = (SecurityContextImpl) JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_1_101xfk1xfklusqkn7e.R.flushNeeded();}}

    //
}
