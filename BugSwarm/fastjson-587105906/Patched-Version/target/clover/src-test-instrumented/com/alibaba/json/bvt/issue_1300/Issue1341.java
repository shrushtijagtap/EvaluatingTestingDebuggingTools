/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;


import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.jaxrs.FastJsonProvider;
import org.glassfish.jersey.CommonProperties;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.internal.InternalProperties;
import org.glassfish.jersey.internal.util.PropertiesHelper;
import org.glassfish.jersey.server.JSONP;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.glassfish.jersey.test.TestProperties;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.*;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Configuration;
import javax.ws.rs.core.Feature;
import javax.ws.rs.core.FeatureContext;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.MessageBodyWriter;
import java.util.Date;

public class Issue1341 extends JerseyTest {public static class __CLR4_5_21b1o1b1olusvn9tn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static class Book {

        private int bookId;
        private String bookName;
        private String publisher;
        private String isbn;
        private Date publishTime;
        private Object hello;

        public int getBookId() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60972);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60973);return bookId;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setBookId(int bookId) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60974);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60975);this.bookId = bookId;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public String getBookName() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60976);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60977);return bookName;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setBookName(String bookName) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60978);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60979);this.bookName = bookName;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public String getPublisher() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60980);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60981);return publisher;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setPublisher(String publisher) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60982);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60983);this.publisher = publisher;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public String getIsbn() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60984);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60985);return isbn;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setIsbn(String isbn) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60986);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60987);this.isbn = isbn;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public Date getPublishTime() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60988);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60989);return publishTime;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setPublishTime(Date publishTime) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60990);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60991);this.publishTime = publishTime;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public Object getHello() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60992);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60993);return hello;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

        public void setHello(Object hello) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60994);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60995);this.hello = hello;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}
    }

    static class FastJsonFeature implements Feature {

        private final static String JSON_FEATURE = FastJsonFeature.class.getSimpleName();

        public boolean configure(final FeatureContext context) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(60996);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60997);final Configuration config = context.getConfiguration();
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60998);final String jsonFeature = CommonProperties.getValue(config.getProperties(), config.getRuntimeType(), InternalProperties.JSON_FEATURE, JSON_FEATURE,
                    String.class);
            // Other JSON providers registered.
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(60999);if ((((!JSON_FEATURE.equalsIgnoreCase(jsonFeature))&&(__CLR4_5_21b1o1b1olusvn9tn.R.iget(61000)!=0|true))||(__CLR4_5_21b1o1b1olusvn9tn.R.iget(61001)==0&false))) {{
                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61002);return false;
            }
            // Disable other JSON providers.
            }__CLR4_5_21b1o1b1olusvn9tn.R.inc(61003);context.property(PropertiesHelper.getPropertyNameForRuntime(InternalProperties.JSON_FEATURE, config.getRuntimeType()), JSON_FEATURE);
            // Register FastJson.
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61004);if ((((!config.isRegistered(FastJsonProvider.class))&&(__CLR4_5_21b1o1b1olusvn9tn.R.iget(61005)!=0|true))||(__CLR4_5_21b1o1b1olusvn9tn.R.iget(61006)==0&false))) {{
                //DisableCircularReferenceDetect
                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61007);FastJsonProvider fastJsonProvider = new FastJsonProvider();
                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61008);FastJsonConfig fastJsonConfig = new FastJsonConfig();
                //fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.BrowserSecure);

                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61009);fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);

                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61010);fastJsonProvider.setFastJsonConfig(fastJsonConfig);

                __CLR4_5_21b1o1b1olusvn9tn.R.inc(61011);context.register(fastJsonProvider, MessageBodyReader.class, MessageBodyWriter.class);
            }
            }__CLR4_5_21b1o1b1olusvn9tn.R.inc(61012);return true;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}
    }


    @Path("book1341")
    public static class BookRestFul {

        @GET
        @Path("{id}")
        @Produces({"application/javascript", "application/json"})
        @Consumes({"application/javascript", "application/json"})
        @JSONP(queryParam = "callback")
        public Book getBookById(@PathParam("id") Long id) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(61013);

            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61014);Book book = new Book();
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61015);book.setBookId(2);
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61016);book.setBookName("Python\u6e90\u7801\u5256\u6790");
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61017);book.setPublisher("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e");
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61018);book.setPublishTime(new Date());
            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61019);book.setIsbn("911122");

            __CLR4_5_21b1o1b1olusvn9tn.R.inc(61020);return book;
        }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}
    }

    @Override
    protected void configureClient(ClientConfig config) {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(61021);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61022);config.register(new FastJsonFeature()).register(FastJsonProvider.class);
    }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

    @Override
    protected Application configure() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(61023);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61024);enable(TestProperties.LOG_TRAFFIC);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61025);enable(TestProperties.DUMP_ENTITY);

        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61026);ResourceConfig config = new ResourceConfig();

        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61027);FastJsonProvider fastJsonProvider = new FastJsonProvider();
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61028);FastJsonConfig fastJsonConfig = new FastJsonConfig();
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61029);fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.BrowserSecure);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61030);fastJsonProvider.setFastJsonConfig(fastJsonConfig);

        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61031);config.register(fastJsonProvider);

        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61032);config.packages("com.alibaba.json.bvt.issue_1300");
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61033);return config;
    }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

    @Test
    public void test() {try{__CLR4_5_21b1o1b1olusvn9tn.R.inc(61034);

        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61035);final String reponse = target("book1341").path("123").request().accept("application/javascript").get(String.class);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61036);System.out.println(reponse);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61037);Assert.assertTrue(reponse.indexOf("Python\u6e90\u7801\u5256\u6790") > 0);
        __CLR4_5_21b1o1b1olusvn9tn.R.inc(61038);Assert.assertTrue(reponse.indexOf("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e") > 0);
    }finally{__CLR4_5_21b1o1b1olusvn9tn.R.flushNeeded();}}

}
