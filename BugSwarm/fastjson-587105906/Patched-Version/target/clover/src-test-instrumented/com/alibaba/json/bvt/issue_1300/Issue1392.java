/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.jaxrs.FastJsonFeature;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.server.JSONP;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import java.util.Date;

public class Issue1392 extends JerseyTest {public static class __CLR4_5_21a991a99lusyjsti{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,60000,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static class Book {

        private int bookId;
        private String bookName;
        private String publisher;
        private String isbn;
        private Date publishTime;
        private Object hello;

        public int getBookId() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59949);
            __CLR4_5_21a991a99lusyjsti.R.inc(59950);return bookId;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setBookId(int bookId) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59951);
            __CLR4_5_21a991a99lusyjsti.R.inc(59952);this.bookId = bookId;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public String getBookName() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59953);
            __CLR4_5_21a991a99lusyjsti.R.inc(59954);return bookName;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setBookName(String bookName) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59955);
            __CLR4_5_21a991a99lusyjsti.R.inc(59956);this.bookName = bookName;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public String getPublisher() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59957);
            __CLR4_5_21a991a99lusyjsti.R.inc(59958);return publisher;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setPublisher(String publisher) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59959);
            __CLR4_5_21a991a99lusyjsti.R.inc(59960);this.publisher = publisher;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public String getIsbn() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59961);
            __CLR4_5_21a991a99lusyjsti.R.inc(59962);return isbn;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setIsbn(String isbn) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59963);
            __CLR4_5_21a991a99lusyjsti.R.inc(59964);this.isbn = isbn;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public Date getPublishTime() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59965);
            __CLR4_5_21a991a99lusyjsti.R.inc(59966);return publishTime;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setPublishTime(Date publishTime) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59967);
            __CLR4_5_21a991a99lusyjsti.R.inc(59968);this.publishTime = publishTime;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public Object getHello() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59969);
            __CLR4_5_21a991a99lusyjsti.R.inc(59970);return hello;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

        public void setHello(Object hello) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59971);
            __CLR4_5_21a991a99lusyjsti.R.inc(59972);this.hello = hello;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}
    }

    @Provider
    static class FastJsonResolver implements ContextResolver<FastJsonConfig> {

        public FastJsonConfig getContext(Class<?> type) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59973);

            __CLR4_5_21a991a99lusyjsti.R.inc(59974);FastJsonConfig fastJsonConfig = new FastJsonConfig();

            __CLR4_5_21a991a99lusyjsti.R.inc(59975);fastJsonConfig.setSerializerFeatures(
                    SerializerFeature.WriteMapNullValue,
                    SerializerFeature.BrowserSecure);

            __CLR4_5_21a991a99lusyjsti.R.inc(59976);return fastJsonConfig;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}
    }


    @Path("book1392")
    public static class BookRestFul {

        @GET
        @Path("{id}")
        @Produces({"application/javascript", "application/json"})
        @Consumes({"application/javascript", "application/json"})
        @JSONP(queryParam = "callback")
        public Book getBookById(@PathParam("id") Long id) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59977);

            __CLR4_5_21a991a99lusyjsti.R.inc(59978);Book book = new Book();
            __CLR4_5_21a991a99lusyjsti.R.inc(59979);book.setBookId(2);
            __CLR4_5_21a991a99lusyjsti.R.inc(59980);book.setBookName("Python\u6e90\u7801\u5256\u6790");
            __CLR4_5_21a991a99lusyjsti.R.inc(59981);book.setPublisher("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e");
            __CLR4_5_21a991a99lusyjsti.R.inc(59982);book.setPublishTime(new Date());
            __CLR4_5_21a991a99lusyjsti.R.inc(59983);book.setIsbn("911122");

            __CLR4_5_21a991a99lusyjsti.R.inc(59984);return book;
        }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}
    }

    @Override
    protected void configureClient(ClientConfig config) {try{__CLR4_5_21a991a99lusyjsti.R.inc(59985);
        __CLR4_5_21a991a99lusyjsti.R.inc(59986);config.register(FastJsonFeature.class);
    }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

    @Override
    protected Application configure() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59987);
        __CLR4_5_21a991a99lusyjsti.R.inc(59988);enable(TestProperties.LOG_TRAFFIC);
        __CLR4_5_21a991a99lusyjsti.R.inc(59989);enable(TestProperties.DUMP_ENTITY);

        __CLR4_5_21a991a99lusyjsti.R.inc(59990);ResourceConfig config = new ResourceConfig();

        __CLR4_5_21a991a99lusyjsti.R.inc(59991);config.register(FastJsonResolver.class);

        __CLR4_5_21a991a99lusyjsti.R.inc(59992);config.register(FastJsonFeature.class);

        __CLR4_5_21a991a99lusyjsti.R.inc(59993);config.packages("com.alibaba.json.bvt.issue_1300");
        __CLR4_5_21a991a99lusyjsti.R.inc(59994);return config;
    }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

    @Test
    public void test() {try{__CLR4_5_21a991a99lusyjsti.R.inc(59995);

        __CLR4_5_21a991a99lusyjsti.R.inc(59996);final String reponse = target("book1392").path("123").request().accept("application/javascript").get(String.class);
        __CLR4_5_21a991a99lusyjsti.R.inc(59997);System.out.println(reponse);
        __CLR4_5_21a991a99lusyjsti.R.inc(59998);Assert.assertTrue(reponse.indexOf("Python\u6e90\u7801\u5256\u6790") > 0);
        __CLR4_5_21a991a99lusyjsti.R.inc(59999);Assert.assertTrue(reponse.indexOf("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e") > 0);
    }finally{__CLR4_5_21a991a99lusyjsti.R.flushNeeded();}}

}
