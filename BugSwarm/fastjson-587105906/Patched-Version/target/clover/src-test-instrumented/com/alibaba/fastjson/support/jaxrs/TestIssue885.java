/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.support.jaxrs;


import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Application;
import java.util.Date;

import static org.junit.Assert.*;

public class TestIssue885 extends JerseyTest {static class __CLR4_5_2w8pw8plusyjpn2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,41816,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @Path("user")
    public static class UserResource {
        @GET
        public User getUser() {try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41785);
            __CLR4_5_2w8pw8plusyjpn2.R.inc(41786);User user = new User();
            __CLR4_5_2w8pw8plusyjpn2.R.inc(41787);user.setId(12345L);
            __CLR4_5_2w8pw8plusyjpn2.R.inc(41788);user.setName("smallnest");
            __CLR4_5_2w8pw8plusyjpn2.R.inc(41789);user.setCreatedOn(new Date());
            __CLR4_5_2w8pw8plusyjpn2.R.inc(41790);return user;
        }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}
    }

    @Override
    protected void configureClient(ClientConfig config) {try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41791);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41792);config.register(new FastJsonFeature()).register(FastJsonProvider.class);
    }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}

    @Override
    protected Application configure() {try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41793);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41794);enable(TestProperties.LOG_TRAFFIC);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41795);enable(TestProperties.DUMP_ENTITY);

        __CLR4_5_2w8pw8plusyjpn2.R.inc(41796);ResourceConfig config = new ResourceConfig();
        //config.register(new FastJsonFeature()).register(FastJsonProvider.class);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41797);config.register(new FastJsonFeature()).register(new FastJsonProvider().setPretty(true));
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41798);config.packages("com.alibaba.fastjson");
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41799);return config;
    }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}

    @Test
    public void testWriteTo() {__CLR4_5_2w8pw8plusyjpn2.R.globalSliceStart(getClass().getName(),41800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22gjy1bw94();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w8pw8plusyjpn2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w8pw8plusyjpn2.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.support.jaxrs.TestIssue885.testWriteTo",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22gjy1bw94(){try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41800);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41801);final String user = target("user").request().accept("application/json").get(String.class);
        // {"createdOn":1412036891919,"id":12345,"name":"smallnest"}]
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41802);assertTrue(user.indexOf("createdOn") > 0);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41803);assertTrue(user.indexOf("\"id\":12345") > 0);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41804);assertTrue(user.indexOf("\"name\":\"smallnest\"") > 0);
    }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}

    @Test
    public void testWriteToWithPretty() {__CLR4_5_2w8pw8plusyjpn2.R.globalSliceStart(getClass().getName(),41805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2upnbezw99();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w8pw8plusyjpn2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w8pw8plusyjpn2.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.support.jaxrs.TestIssue885.testWriteToWithPretty",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41805,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2upnbezw99(){try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41805);
        //System.out.println("@@@@@Test Pretty");
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41806);final String user = target("user").queryParam("pretty", "true").request().accept("application/json").get(String.class);
        // {"createdOn":1412036891919,"id":12345,"name":"smallnest"}]
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41807);assertTrue(user.indexOf("createdOn") > 0);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41808);assertTrue(user.indexOf("\"id\":12345") > 0);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41809);assertTrue(user.indexOf("\"name\":\"smallnest\"") > 0);
        //response does not contain a return character
        //assertTrue(user.indexOf("\n\t") > 0);

    }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}

    @Test
    public void testReadFrom() {__CLR4_5_2w8pw8plusyjpn2.R.globalSliceStart(getClass().getName(),41810);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m3855lw9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2w8pw8plusyjpn2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2w8pw8plusyjpn2.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.support.jaxrs.TestIssue885.testReadFrom",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),41810,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m3855lw9e(){try{__CLR4_5_2w8pw8plusyjpn2.R.inc(41810);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41811);final User user = target("user").request().accept("application/json").get(User.class);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41812);assertNotNull(user);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41813);assertNotNull(user.getCreatedOn());
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41814);assertEquals(user.getId().longValue(), 12345L);
        __CLR4_5_2w8pw8plusyjpn2.R.inc(41815);assertEquals(user.getName(), "smallnest");
    }finally{__CLR4_5_2w8pw8plusyjpn2.R.flushNeeded();}}

}
