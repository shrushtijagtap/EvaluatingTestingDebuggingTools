/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;


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

public class Issue1341 extends JerseyTest {public static class __CLR4_1_101a3r1a3rlusqk98j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,59818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static class Book {

        private int bookId;
        private String bookName;
        private String publisher;
        private String isbn;
        private Date publishTime;
        private Object hello;

        public int getBookId() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59751);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59752);return bookId;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setBookId(int bookId) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59753);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59754);this.bookId = bookId;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public String getBookName() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59755);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59756);return bookName;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setBookName(String bookName) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59757);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59758);this.bookName = bookName;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public String getPublisher() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59759);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59760);return publisher;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setPublisher(String publisher) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59761);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59762);this.publisher = publisher;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public String getIsbn() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59763);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59764);return isbn;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setIsbn(String isbn) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59765);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59766);this.isbn = isbn;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public Date getPublishTime() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59767);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59768);return publishTime;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setPublishTime(Date publishTime) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59769);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59770);this.publishTime = publishTime;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public Object getHello() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59771);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59772);return hello;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

        public void setHello(Object hello) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59773);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59774);this.hello = hello;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}
    }

    static class FastJsonFeature implements Feature {

        private final static String JSON_FEATURE = FastJsonFeature.class.getSimpleName();

        public boolean configure(final FeatureContext context) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59775);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59776);final Configuration config = context.getConfiguration();
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59777);final String jsonFeature = CommonProperties.getValue(config.getProperties(), config.getRuntimeType(), InternalProperties.JSON_FEATURE, JSON_FEATURE,
                    String.class);
            // Other JSON providers registered.
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59778);if ((((!JSON_FEATURE.equalsIgnoreCase(jsonFeature))&&(__CLR4_1_101a3r1a3rlusqk98j.R.iget(59779)!=0|true))||(__CLR4_1_101a3r1a3rlusqk98j.R.iget(59780)==0&false))) {{
                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59781);return false;
            }
            // Disable other JSON providers.
            }__CLR4_1_101a3r1a3rlusqk98j.R.inc(59782);context.property(PropertiesHelper.getPropertyNameForRuntime(InternalProperties.JSON_FEATURE, config.getRuntimeType()), JSON_FEATURE);
            // Register FastJson.
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59783);if ((((!config.isRegistered(FastJsonProvider.class))&&(__CLR4_1_101a3r1a3rlusqk98j.R.iget(59784)!=0|true))||(__CLR4_1_101a3r1a3rlusqk98j.R.iget(59785)==0&false))) {{
                //DisableCircularReferenceDetect
                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59786);FastJsonProvider fastJsonProvider = new FastJsonProvider();
                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59787);FastJsonConfig fastJsonConfig = new FastJsonConfig();
                //fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect,SerializerFeature.BrowserSecure);

                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59788);fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect);

                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59789);fastJsonProvider.setFastJsonConfig(fastJsonConfig);

                __CLR4_1_101a3r1a3rlusqk98j.R.inc(59790);context.register(fastJsonProvider, MessageBodyReader.class, MessageBodyWriter.class);
            }
            }__CLR4_1_101a3r1a3rlusqk98j.R.inc(59791);return true;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}
    }


    @Path("book1341")
    public static class BookRestFul {

        @GET
        @Path("{id}")
        @Produces({"application/javascript", "application/json"})
        @Consumes({"application/javascript", "application/json"})
        @JSONP(queryParam = "callback")
        public Book getBookById(@PathParam("id") Long id) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59792);

            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59793);Book book = new Book();
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59794);book.setBookId(2);
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59795);book.setBookName("Python\u6e90\u7801\u5256\u6790");
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59796);book.setPublisher("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e");
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59797);book.setPublishTime(new Date());
            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59798);book.setIsbn("911122");

            __CLR4_1_101a3r1a3rlusqk98j.R.inc(59799);return book;
        }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}
    }

    @Override
    protected void configureClient(ClientConfig config) {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59800);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59801);config.register(new FastJsonFeature()).register(FastJsonProvider.class);
    }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

    @Override
    protected Application configure() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59802);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59803);enable(TestProperties.LOG_TRAFFIC);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59804);enable(TestProperties.DUMP_ENTITY);

        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59805);ResourceConfig config = new ResourceConfig();

        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59806);FastJsonProvider fastJsonProvider = new FastJsonProvider();
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59807);FastJsonConfig fastJsonConfig = new FastJsonConfig();
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59808);fastJsonConfig.setSerializerFeatures(SerializerFeature.DisableCircularReferenceDetect, SerializerFeature.BrowserSecure);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59809);fastJsonProvider.setFastJsonConfig(fastJsonConfig);

        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59810);config.register(fastJsonProvider);

        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59811);config.packages("com.alibaba.json.bvt.issue_1300");
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59812);return config;
    }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

    @Test
    public void test() {try{__CLR4_1_101a3r1a3rlusqk98j.R.inc(59813);

        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59814);final String reponse = target("book1341").path("123").request().accept("application/javascript").get(String.class);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59815);System.out.println(reponse);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59816);Assert.assertTrue(reponse.indexOf("Python\u6e90\u7801\u5256\u6790") > 0);
        __CLR4_1_101a3r1a3rlusqk98j.R.inc(59817);Assert.assertTrue(reponse.indexOf("\u7535\u5b50\u5de5\u4e1a\u51fa\u7248\u793e") > 0);
    }finally{__CLR4_1_101a3r1a3rlusqk98j.R.flushNeeded();}}

}
