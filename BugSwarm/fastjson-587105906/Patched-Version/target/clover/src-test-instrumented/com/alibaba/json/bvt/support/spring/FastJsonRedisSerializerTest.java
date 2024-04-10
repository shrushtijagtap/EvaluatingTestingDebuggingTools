/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring;

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


public class FastJsonRedisSerializerTest {static class __CLR4_5_21wvw1wvwlusyjvke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,89325,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private FastJsonRedisSerializer<User> serializer;

    @Before
    public void setUp() {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89276);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89277);this.serializer = new FastJsonRedisSerializer<User>(User.class);
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    @Test
    public void test_1() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1wvy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1wvy(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89278);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89279);User user = serializer.deserialize(serializer.serialize(new User(1, "\u571f\u8c46", 25)));
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89280);Assert.assertTrue(Objects.equal(user.getId(), 1));
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89281);Assert.assertTrue(Objects.equal(user.getName(), "\u571f\u8c46"));
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89282);Assert.assertTrue(Objects.equal(user.getAge(), 25));
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    @Test
    public void test_2() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441ww3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89283,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441ww3(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89283);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89284);Assert.assertThat(serializer.serialize(null), Is.is(new byte[0]));
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    @Test
    public void test_3() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1ww5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1ww5(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89285);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89286);Assert.assertThat(serializer.deserialize(new byte[0]), IsNull.nullValue());
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    @Test
    public void test_4() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89287);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61ww7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89287,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61ww7(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89287);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89288);Assert.assertThat(serializer.deserialize(null), IsNull.nullValue());
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    @Test
    public void test_5() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1ww9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1ww9(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89289);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89290);User user = new User(1, "\u571f\u8c46", 25);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89291);byte[] serializedValue = serializer.serialize(user);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89292);Arrays.sort(serializedValue); // corrupt serialization result
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89293);Assert.assertNull(serializer.deserialize(serializedValue));
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    /**
     * for issue #2147
     */
    @Test
    public void test_6() {__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceStart(getClass().getName(),89294);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81wwe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21wvw1wvwlusyjvke.R.rethrow($CLV_t2$);}finally{__CLR4_5_21wvw1wvwlusyjvke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.FastJsonRedisSerializerTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89294,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81wwe(){try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89294);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89295);FastJsonConfig fastJsonConfig = new FastJsonConfig();

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89296);SerializerFeature[] serializerFeatures = new SerializerFeature[]{
                SerializerFeature.WriteClassName
        };
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89297);fastJsonConfig.setSerializerFeatures(serializerFeatures);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89298);ParserConfig parserConfig = ParserConfig.getGlobalInstance();
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89299);parserConfig.setAutoTypeSupport(true);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89300);fastJsonConfig.setParserConfig(parserConfig);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89301);FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89302);Assert.assertNotNull(fastJsonRedisSerializer.getFastJsonConfig());
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89303);fastJsonRedisSerializer.setFastJsonConfig(fastJsonConfig);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89304);User userSer = new User(1, "\u571f\u8c46", 25);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89305);byte[] serializedValue = fastJsonRedisSerializer.serialize(userSer);
        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89306);User userDes = (User) fastJsonRedisSerializer.deserialize(serializedValue);

        __CLR4_5_21wvw1wvwlusyjvke.R.inc(89307);Assert.assertEquals(userDes.getName(), "\u571f\u8c46");
    }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

    static class User {
        private Integer id;
        private String name;
        private Integer age;

        public User() {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89308);
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public User(Integer id, String name, Integer age) {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89309);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89310);this.id = id;
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89311);this.name = name;
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89312);this.age = age;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89313);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89314);return id;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89315);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89316);this.id = id;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89317);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89318);return name;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89319);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89320);this.name = name;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public Integer getAge() {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89321);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89322);return age;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}

        public void setAge(Integer age) {try{__CLR4_5_21wvw1wvwlusyjvke.R.inc(89323);
            __CLR4_5_21wvw1wvwlusyjvke.R.inc(89324);this.age = age;
        }finally{__CLR4_5_21wvw1wvwlusyjvke.R.flushNeeded();}}
    }
}
