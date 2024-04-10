/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.messaging;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.messaging.MappingFastJsonMessageConverter;
import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;


public class MappingFastJsonMessageConverterTest extends TestCase {static class __CLR4_1_101xzo1xzoluszwfx8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_1() throws Exception {__CLR4_1_101xzo1xzoluszwfx8.R.globalSliceStart(getClass().getName(),90708);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1xzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xzo1xzoluszwfx8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xzo1xzoluszwfx8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.messaging.MappingFastJsonMessageConverterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90708,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1xzo() throws Exception{try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90708);

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90709);MappingFastJsonMessageConverter converter = new MappingFastJsonMessageConverter();

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90710);Assert.assertNotNull(converter.getFastJsonConfig());
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90711);converter.setFastJsonConfig(new FastJsonConfig());

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90712);VO p = new VO();
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90713);p.setId(1);

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90714);String pstr = JSON.toJSONString(p);

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90715);System.out.println(pstr);

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90716);TestMessage message = new TestMessage(pstr);

        // test fromMessage/convertFromInternal
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90717);VO vo = (VO) converter.fromMessage(message, VO.class);
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90718);Assert.assertEquals(1, vo.getId());

        // test toMessage/convertToInternal
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90719);Message message1 = converter.toMessage(vo, null);
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90720);System.out.println(message1.getPayload());
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90721);Assert.assertEquals("{\"id\":1}", new String((byte[]) message1.getPayload()));

//		// test toMessage/convertToInternal
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90722);Message message2 = converter.toMessage("{\"id\":1}", null);
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90723);System.out.println(message2.getPayload());
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90724);Assert.assertEquals("{\"id\":1}", new String((byte[]) message2.getPayload()));

        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90725);converter.setSerializedPayloadClass(String.class);

        // test toMessage/convertToInternal
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90726);Message message3 = converter.toMessage(vo, null);
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90727);System.out.println(message3.getPayload());
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90728);Assert.assertEquals("{\"id\":1}", message3.getPayload());

//		// test toMessage/convertToInternal
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90729);Message message4 = converter.toMessage("{\"id\":1}", null);
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90730);System.out.println(message4.getPayload());
        __CLR4_1_101xzo1xzoluszwfx8.R.inc(90731);Assert.assertEquals("{\"id\":1}", message4.getPayload());
    }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}

    public static class TestMessage<T> implements Message<T> {

        private T payload;

        public TestMessage(T payload) {try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90732);
            __CLR4_1_101xzo1xzoluszwfx8.R.inc(90733);this.payload = payload;
        }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}

        @Override
        public T getPayload() {try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90734);
            __CLR4_1_101xzo1xzoluszwfx8.R.inc(90735);return (T) payload;
        }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}

        @Override
        public MessageHeaders getHeaders() {try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90736);
            __CLR4_1_101xzo1xzoluszwfx8.R.inc(90737);return null;
        }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}
    }

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90738);
            __CLR4_1_101xzo1xzoluszwfx8.R.inc(90739);return id;
        }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101xzo1xzoluszwfx8.R.inc(90740);
            __CLR4_1_101xzo1xzoluszwfx8.R.inc(90741);this.id = id;
        }finally{__CLR4_1_101xzo1xzoluszwfx8.R.flushNeeded();}}

    }
}