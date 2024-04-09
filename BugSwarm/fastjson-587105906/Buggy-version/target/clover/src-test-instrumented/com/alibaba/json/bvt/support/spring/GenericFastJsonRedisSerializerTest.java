/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring;

import com.alibaba.fastjson.support.spring.GenericFastJsonRedisSerializer;
import com.alibaba.fastjson.util.IOUtils;
import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.data.redis.serializer.SerializationException;

import java.util.Arrays;
import java.util.List;


public class GenericFastJsonRedisSerializerTest {static class __CLR4_1_101wzh1wzhlusqkmac{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private GenericFastJsonRedisSerializer serializer;

    @Before
    public void setUp() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89405);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89406);this.serializer = new GenericFastJsonRedisSerializer();
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    @Test
    public void test_1() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89407);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1wzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89407,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1wzj(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89407);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89408);User user = (User) serializer.deserialize(serializer.serialize(new User(1, "\u571f\u8c46", 25)));
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89409);Assert.assertTrue(Objects.equal(user.getId(), 1));
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89410);Assert.assertTrue(Objects.equal(user.getName(), "\u571f\u8c46"));
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89411);Assert.assertTrue(Objects.equal(user.getAge(), 25));
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    @Test
    public void test_2() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441wzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89412,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441wzo(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89412);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89413);Assert.assertThat(serializer.serialize(null), Is.is(new byte[0]));
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    @Test
    public void test_3() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1wzq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89414,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1wzq(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89414);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89415);Assert.assertThat(serializer.deserialize(new byte[0]), IsNull.nullValue());
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    @Test
    public void test_4() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61wzs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89416,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61wzs(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89416);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89417);Assert.assertThat(serializer.deserialize(null), IsNull.nullValue());
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    @Test(expected = SerializationException.class)
    public void test_5() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89418);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1wzu();$CLV_p$=0;$CLV_t$=new java.lang.RuntimeException(new String(new char[] {69,120,112,101,99,116,101,100,32,111,110,101,32,111,102,32,116,104,101,32,102,111,108,108,111,119,105,110,103,32,101,120,99,101,112,116,105,111,110,115,32,116,111,32,98,101,32,116,104,114,111,119,110,32,102,114,111,109,32,116,101,115,116,32,109,101,116,104,111,100,32,116,101,115,116,95,53,58,32,91,83,101,114,105,97,108,105,122,97,116,105,111,110,69,120,99,101,112,116,105,111,110,93,}));}catch(java.lang.Throwable $CLV_t2$){if($CLV_t2$ instanceof SerializationException){$CLV_p$=1;$CLV_t$=null;}else{$CLV_p$=0;$CLV_t$=$CLV_t2$;}if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89418,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1wzu(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89418);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89419);User user = new User(1, "\u571f\u8c46", 25);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89420);byte[] serializedValue = serializer.serialize(user);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89421);Arrays.sort(serializedValue); // corrupt serialization result
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89422);serializer.deserialize(serializedValue);
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    /**
     * for issue #2155
     */
    @Test
    public void test_6() {__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceStart(getClass().getName(),89423);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81wzz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wzh1wzhlusqkmac.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wzh1wzhlusqkmac.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89423,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81wzz(){try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89423);

        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89424);BaseResult<List<String>> baseResult = new BaseResult<List<String>>();
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89425);baseResult.setCode("1000");
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89426);baseResult.setMsg("success");
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89427);baseResult.setData(Lists.newArrayList("\u6d4b\u8bd51", "\u6d4b\u8bd52", "\u6d4b\u8bd53"));

        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89428);GenericFastJsonRedisSerializer genericFastJsonRedisSerializer = new GenericFastJsonRedisSerializer();
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89429);byte[] bytes = genericFastJsonRedisSerializer.serialize(baseResult);
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89430);BaseResult<List<String>> baseResult2 = (BaseResult<List<String>>) genericFastJsonRedisSerializer.deserialize(bytes);

        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89431);Assert.assertEquals(baseResult2.getCode(), "1000");
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89432);Assert.assertEquals(baseResult2.getData().size(), 3);

        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89433);String json = "{\n" +
                "\"@type\": \"com.alibaba.json.bvt.support.spring.GenericFastJsonRedisSerializerTest$BaseResult\",\n" +
                "\"code\": \"1000\",\n" +
                "\"data\": [\n" +
                "\"\u6309\u624b\u52a8\u63a7\u5236\u6309\u94ae\",\n" +
                "\"\u4e0d\u505c\u673a\",\n" +
                "\"\u4e0d\u8f6c\u52a8\",\n" +
                "\"\u4f20\u52a8\u8f74\u632f\u52a8\u5927\",\n" +
                "\"\u7b2c\u4e00\u63a8\u8fdb\u5668\",\n" +
                "\"\u7535\u673a\u4e0d\u8fd0\u884c\",\n" +
                "],\n" +
                "\"msg\": \"success\"\n" +
                "}";

        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89434);BaseResult<List<String>> baseResult3 = (BaseResult<List<String>>) genericFastJsonRedisSerializer.deserialize(json.getBytes(IOUtils.UTF8));
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89435);Assert.assertEquals(baseResult3.getCode(), "1000");
        __CLR4_1_101wzh1wzhlusqkmac.R.inc(89436);Assert.assertEquals(baseResult3.getData().size(), 6);
    }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

    static class User {
        private Integer id;
        private String name;
        private Integer age;

        public User() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89437);
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public User(Integer id, String name, Integer age) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89438);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89439);this.id = id;
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89440);this.name = name;
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89441);this.age = age;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public Integer getId() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89442);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89443);return id;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89444);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89445);this.id = id;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89446);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89447);return name;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89448);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89449);this.name = name;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public Integer getAge() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89450);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89451);return age;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setAge(Integer age) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89452);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89453);this.age = age;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}
    }

    static class BaseResult<T> {
        public String getMsg() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89454);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89455);return msg;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setMsg(String msg) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89456);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89457);this.msg = msg;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public String getCode() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89458);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89459);return code;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setCode(String code) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89460);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89461);this.code = code;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public T getData() {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89462);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89463);return data;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        public void setData(T data) {try{__CLR4_1_101wzh1wzhlusqkmac.R.inc(89464);
            __CLR4_1_101wzh1wzhlusqkmac.R.inc(89465);this.data = data;
        }finally{__CLR4_1_101wzh1wzhlusqkmac.R.flushNeeded();}}

        private String msg;
        private String code;
        private T data;
    }
}
