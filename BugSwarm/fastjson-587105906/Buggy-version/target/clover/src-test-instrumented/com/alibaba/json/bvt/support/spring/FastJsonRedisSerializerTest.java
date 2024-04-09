/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import com.google.common.base.Objects;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class FastJsonRedisSerializerTest {static class __CLR4_1_101ww71ww7lusqkm85{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private FastJsonRedisSerializer<User> serializer;

    @Before
    public void setUp() {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89287);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89288);this.serializer = new FastJsonRedisSerializer<User>(User.class);
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    @Test
    public void test_1() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ww9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89289,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ww9(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89289);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89290);User user = serializer.deserialize(serializer.serialize(new User(1, "\u571f\u8c46", 25)));
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89291);Assert.assertTrue(Objects.equal(user.getId(), 1));
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89292);Assert.assertTrue(Objects.equal(user.getName(), "\u571f\u8c46"));
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89293);Assert.assertTrue(Objects.equal(user.getAge(), 25));
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    @Test
    public void test_2() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441wwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89294,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441wwe(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89294);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89295);Assert.assertThat(serializer.serialize(null), Is.is(new byte[0]));
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    @Test
    public void test_3() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1wwg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1wwg(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89296);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89297);Assert.assertThat(serializer.deserialize(new byte[0]), IsNull.nullValue());
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    @Test
    public void test_4() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89298);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61wwi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89298,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61wwi(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89298);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89299);Assert.assertThat(serializer.deserialize(null), IsNull.nullValue());
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    @Test
    public void test_5() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1wwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1wwk(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89300);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89301);User user = new User(1, "\u571f\u8c46", 25);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89302);byte[] serializedValue = serializer.serialize(user);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89303);Arrays.sort(serializedValue); // corrupt serialization result
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89304);Assert.assertNull(serializer.deserialize(serializedValue));
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    /**
     * for issue #2147
     */
    @Test
    public void test_6() {__CLR4_1_101ww71ww7lusqkm85.R.globalSliceStart(getClass().getName(),89305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81wwp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ww71ww7lusqkm85.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ww71ww7lusqkm85.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81wwp(){try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89305);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89306);FastJsonConfig fastJsonConfig = new FastJsonConfig();

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89307);SerializerFeature[] serializerFeatures = new SerializerFeature[]{
                SerializerFeature.WriteClassName
        };
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89308);fastJsonConfig.setSerializerFeatures(serializerFeatures);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89309);ParserConfig parserConfig = ParserConfig.getGlobalInstance();
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89310);parserConfig.setAutoTypeSupport(true);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89311);fastJsonConfig.setParserConfig(parserConfig);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89312);FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89313);Assert.assertNotNull(fastJsonRedisSerializer.getFastJsonConfig());
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89314);fastJsonRedisSerializer.setFastJsonConfig(fastJsonConfig);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89315);User userSer = new User(1, "\u571f\u8c46", 25);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89316);byte[] serializedValue = fastJsonRedisSerializer.serialize(userSer);
        __CLR4_1_101ww71ww7lusqkm85.R.inc(89317);User userDes = (User) fastJsonRedisSerializer.deserialize(serializedValue);

        __CLR4_1_101ww71ww7lusqkm85.R.inc(89318);Assert.assertEquals(userDes.getName(), "\u571f\u8c46");
    }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

    static class User {
        private Integer id;
        private String name;
        private Integer age;

        public User() {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89319);
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public User(Integer id, String name, Integer age) {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89320);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89321);this.id = id;
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89322);this.name = name;
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89323);this.age = age;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89324);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89325);return id;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89326);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89327);this.id = id;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89328);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89329);return name;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89330);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89331);this.name = name;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public Integer getAge() {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89332);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89333);return age;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}

        public void setAge(Integer age) {try{__CLR4_1_101ww71ww7lusqkm85.R.inc(89334);
            __CLR4_1_101ww71ww7lusqkm85.R.inc(89335);this.age = age;
        }finally{__CLR4_1_101ww71ww7lusqkm85.R.flushNeeded();}}
    }
}
