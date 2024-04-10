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
public class DefaultSavedRequestTest extends TestCase {static class __CLR4_5_21xf91xf9lusyjvpp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90043,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig config;

    protected void setUp() throws Exception {try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89973);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89974);Field field = GenericFastJsonRedisSerializer.class.getDeclaredField("defaultRedisConfig");
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89975);field.setAccessible(true);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89976);config = (ParserConfig) field.get(null);
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}
    public void test_for_issue() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),89977);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1xfd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89977,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1xfd() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89977);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89978);MockHttpServletRequest mockReq = new MockHttpServletRequest();
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89979);DefaultSavedRequest request = new DefaultSavedRequest(mockReq, new PortResolver() {

            public int getServerPort(ServletRequest servletRequest) {try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89980);
                __CLR4_5_21xf91xf9lusyjvpp.R.inc(89981);return 0;
            }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}
        });

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89982);String str = JSON.toJSONString(request, SerializerFeature.WriteClassName);
//        System.out.println(str);


        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89983);JSON.parseObject(str, Object.class, config);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89984);JSON.parseObject(str);
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}


    public void test_cookie() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),89985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gsmiaw1xfl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_cookie",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89985,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gsmiaw1xfl() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89985);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89986);String json = "{\"name\":\"xx\",\"value\":\"xx\",\"comment\":\"xx\",\"domain\":\"xx\"}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89987);SavedCookie cookie = JSON.parseObject(json, SavedCookie.class);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89988);assertEquals("xx", cookie.getName());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89989);assertEquals("{\"comment\":\"xx\",\"cookie\":{\"comment\":\"xx\",\"domain\":\"xx\",\"httpOnly\":false,\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0},\"domain\":\"xx\",\"maxAge\":0,\"name\":\"xx\",\"secure\":false,\"value\":\"xx\",\"version\":0}", JSON.toJSONString(cookie));
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),89990);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xfq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89990,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xfq() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89990);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89991);DefaultCsrfToken token = JSON.parseObject("{\"token\":\"xxx\",\"parameterName\":\"222\",\"headerName\":\"hhh\"}", DefaultCsrfToken.class);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89992);assertEquals("hhh", token.getHeaderName());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89993);assertEquals("222", token.getParameterName());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89994);assertEquals("xxx", token.getToken());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89995);assertEquals("{\"headerName\":\"hhh\",\"parameterName\":\"222\",\"token\":\"xxx\"}", JSON.toJSONString(token));
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_http_cookie() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),89996);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fj7agb1xfw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_http_cookie",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89996,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fj7agb1xfw() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(89996);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89997);Cookie cookie = new Cookie("cna", "h8a2EO57uEgCAXyg1TgBBFK");
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89998);cookie.setMaxAge(10);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(89999);String json = JSON.toJSONString(cookie);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90000);Cookie cookie1 = JSON.parseObject(json, Cookie.class);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90001);assertEquals(cookie.getName(), cookie1.getName());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90002);assertEquals(cookie.getValue(), cookie1.getValue());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90003);assertEquals(cookie.getMaxAge(), cookie1.getMaxAge());
        //System.out.println(json);
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_PreAuthenticatedAuthenticationToken() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_218njpt1xg4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_PreAuthenticatedAuthenticationToken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90004,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_218njpt1xg4() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90004);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90005);PreAuthenticatedAuthenticationToken token = new PreAuthenticatedAuthenticationToken("ppp", "cccc");
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90006);String json = JSON.toJSONString(token);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90007);System.out.println(json);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90008);PreAuthenticatedAuthenticationToken token1 = JSON.parseObject(json, PreAuthenticatedAuthenticationToken.class);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90009);assertEquals("ppp", token1.getPrincipal());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90010);assertEquals("cccc", token1.getCredentials());
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_WebAuthenticationDetails() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90011);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25ehrna1xgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_WebAuthenticationDetails",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90011,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25ehrna1xgb() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90011);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90012);WebAuthenticationDetails details = JSON.parseObject("{\"remoteAddress\":\"rrr\",\"sessionId\":\"ssss\"}", WebAuthenticationDetails.class);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90013);assertEquals("rrr", details.getRemoteAddress());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90014);assertEquals("ssss", details.getSessionId());
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_SecurityContextImpl() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2irm47d1xgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90015,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2irm47d1xgf() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90015);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90016);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\"}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90017);JSON.parseObject(json, Object.class);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90018);JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_UsernamePasswordAuthenticationToken() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90019);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uzj4x61xgj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_UsernamePasswordAuthenticationToken",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90019,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uzj4x61xgj() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90019);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90020);String json = "{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"principal\":\"pp\"}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90021);UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken)JSON.parseObject(json, Object.class);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90022);UsernamePasswordAuthenticationToken token1 = (UsernamePasswordAuthenticationToken) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90023);assertEquals("pp", token.getPrincipal());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90024);assertEquals("pp", token1.getPrincipal());
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}


    public void test_SimpleGrantedAuthority() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90025);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23m7xwu1xgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SimpleGrantedAuthority",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90025,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23m7xwu1xgp() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90025);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90026);String json = "{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"xx\"}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90027);SimpleGrantedAuthority token = (SimpleGrantedAuthority)JSON.parseObject(json, Object.class);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90028);SimpleGrantedAuthority token1 = (SimpleGrantedAuthority) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90029);assertEquals("xx", token.getAuthority());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90030);assertEquals("xx", token1.getAuthority());

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90031);assertEquals("{\"authority\":\"xx\"}", JSON.toJSONString(token));
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_User() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i0a2f31xgw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_User",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90032,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i0a2f31xgw() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90032);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90033);String json = "{\"@type\":\"org.springframework.security.core.userdetails.User\",\"username\":\"xx\",\"authorities\":[]}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90034);User token = (User)JSON.parseObject(json, Object.class);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90035);User token1 = (User) JSON.parseObject(json, Object.class, config);

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90036);assertEquals("xx", token.getUsername());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90037);assertEquals("xx", token1.getUsername());

        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90038);assertEquals("", token.getPassword());
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90039);assertEquals("", token1.getPassword());
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    public void test_SecurityContextImpl_x() throws Exception {__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceStart(getClass().getName(),90040);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f561b61xh4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xf91xf9lusyjvpp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xf91xf9lusyjvpp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.security.DefaultSavedRequestTest.test_SecurityContextImpl_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90040,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f561b61xh4() throws Exception{try{__CLR4_5_21xf91xf9lusyjvpp.R.inc(90040);
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90041);String json = "{\"@type\":\"org.springframework.security.core.context.SecurityContextImpl\",\"authentication\":{\"@type\":\"org.springframework.security.authentication.UsernamePasswordAuthenticationToken\",\"authenticated\":true,\"authorities\":[{\"@type\":\"org.springframework.security.core.authority.SimpleGrantedAuthority\",\"authority\":\"ROLE_ADMIN\"}],\"details\":{\"@type\":\"org.springframework.security.web.authentication.WebAuthenticationDetails\",\"remoteAddress\":\"0:0:0:0:0:0:0:1\",\"sessionId\":\"35dbb2c4-971c-4624-bd89-2e002180a2ca\"},\"name\":\"admin\",\"principal\":{\"@type\":\"org.springframework.security.core.userdetails.User\",\"accountNonExpired\":true,\"accountNonLocked\":true,\"authorities\":[{\"$ref\":\"$.authentication.authorities[0]\"}],\"credentialsNonExpired\":true,\"enabled\":true,\"username\":\"admin\"}}}";
        __CLR4_5_21xf91xf9lusyjvpp.R.inc(90042);SecurityContextImpl context = (SecurityContextImpl) JSON.parseObject(json, Object.class, config);
    }finally{__CLR4_5_21xf91xf9lusyjvpp.R.flushNeeded();}}

    //
}
