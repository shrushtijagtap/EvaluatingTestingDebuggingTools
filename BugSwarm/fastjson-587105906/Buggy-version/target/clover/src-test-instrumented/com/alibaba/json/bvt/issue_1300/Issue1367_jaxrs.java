/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Test;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Response;
import java.io.Serializable;

/**
 * <p>Title: Issue1367_jaxrs</p>
 * <p>Description: </p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2017/8/7
 */
public class Issue1367_jaxrs extends JerseyTest {public static class __CLR4_1_101a7p1a7plusqk9ep{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,59914,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static class AbstractController<ID extends Serializable, PO extends Issue1367.GenericEntity<ID>> {

        @POST
        @Path("/typeVariableBean")
        @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
        @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
        public PO save(PO dto) {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59893);
            //do something
            __CLR4_1_101a7p1a7plusqk9ep.R.inc(59894);return dto;
        }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}
    }

    @Path("beanController")
    public static class BeanController extends AbstractController<Long, Issue1367.TypeVariableBean> {

        @POST
        @Path("/parameterizedTypeBean")
        @Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
        @Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
        public String parameterizedTypeBean(Issue1367.ParameterizedTypeBean<String> parameterizedTypeBean) {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59895);
            __CLR4_1_101a7p1a7plusqk9ep.R.inc(59896);return parameterizedTypeBean.getT();
        }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}

    }

    @Override
    protected void configureClient(ClientConfig config) {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59897);
        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59898);config.register(FastJsonProvider.class);
    }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}

    @Override
    protected Application configure() {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59899);
        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59900);enable(TestProperties.LOG_TRAFFIC);
        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59901);enable(TestProperties.DUMP_ENTITY);

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59902);ResourceConfig config = new ResourceConfig();

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59903);config.register(FastJsonProvider.class);
        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59904);config.packages("com.alibaba.json.bvt.issue_1300");
        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59905);return config;
    }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}

    @Test
    public void testParameterizedTypeBean() throws Exception {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59906);

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59907);String request = "{\"t\": \"victor zeng\"}";

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59908);Response response = target("beanController").path("parameterizedTypeBean").request().
                accept("application/json;charset=UTF-8").post(Entity.json(request));

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59909);System.out.println(response.readEntity(String.class));

    }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}

    @Test
    public void testTypeVariableBean() throws Exception {try{__CLR4_1_101a7p1a7plusqk9ep.R.inc(59910);

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59911);String request = "{\"id\": 1}";

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59912);Response response = target("beanController").path("typeVariableBean").request().
                accept("application/json;charset=UTF-8").post(Entity.json(request));

        __CLR4_1_101a7p1a7plusqk9ep.R.inc(59913);System.out.println(response.readEntity(String.class));

    }finally{__CLR4_1_101a7p1a7plusqk9ep.R.flushNeeded();}}
}
