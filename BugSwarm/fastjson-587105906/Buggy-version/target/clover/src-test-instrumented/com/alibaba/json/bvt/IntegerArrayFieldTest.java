/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class IntegerArrayFieldTest extends TestCase {static class __CLR4_1_10xfuxfuluszw5b6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,43367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_codec() throws Exception {__CLR4_1_10xfuxfuluszw5b6.R.globalSliceStart(getClass().getName(),43338);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31sxfu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xfuxfuluszw5b6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xfuxfuluszw5b6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.IntegerArrayFieldTest.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43338,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31sxfu() throws Exception{try{__CLR4_1_10xfuxfuluszw5b6.R.inc(43338);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43339);User user = new User();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43340);user.setValue(new Integer[] { Integer.valueOf(1), Integer.valueOf(2) });

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43341);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43342);mapping.setAsmEnable(false);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43343);String text = JSON.toJSONString(user, mapping, SerializerFeature.WriteMapNullValue);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43344);User user1 = JSON.parseObject(text, User.class);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43345);Assert.assertEquals(user1.getValue()[0], user.getValue()[0]);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43346);Assert.assertEquals(user1.getValue()[1], user.getValue()[1]);
    }finally{__CLR4_1_10xfuxfuluszw5b6.R.flushNeeded();}}

    public void test_codec_null() throws Exception {__CLR4_1_10xfuxfuluszw5b6.R.globalSliceStart(getClass().getName(),43347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105ncl18xg3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xfuxfuluszw5b6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xfuxfuluszw5b6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.IntegerArrayFieldTest.test_codec_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43347,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105ncl18xg3() throws Exception{try{__CLR4_1_10xfuxfuluszw5b6.R.inc(43347);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43348);User user = new User();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43349);user.setValue(null);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43350);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43351);mapping.setAsmEnable(false);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43352);String text = JSON.toJSONString(user, mapping, SerializerFeature.WriteMapNullValue);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43353);User user1 = JSON.parseObject(text, User.class);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43354);Assert.assertEquals(user1.getValue(), user.getValue());
    }finally{__CLR4_1_10xfuxfuluszw5b6.R.flushNeeded();}}

    public void test_codec_null_1() throws Exception {__CLR4_1_10xfuxfuluszw5b6.R.globalSliceStart(getClass().getName(),43355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prl16yxgb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10xfuxfuluszw5b6.R.rethrow($CLV_t2$);}finally{__CLR4_1_10xfuxfuluszw5b6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.IntegerArrayFieldTest.test_codec_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),43355,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prl16yxgb() throws Exception{try{__CLR4_1_10xfuxfuluszw5b6.R.inc(43355);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43356);User user = new User();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43357);user.setValue(null);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43358);SerializeConfig mapping = new SerializeConfig();
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43359);mapping.setAsmEnable(false);
        __CLR4_1_10xfuxfuluszw5b6.R.inc(43360);String text = JSON.toJSONString(user, mapping, SerializerFeature.WriteMapNullValue, SerializerFeature.WriteNullListAsEmpty);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43361);User user1 = JSON.parseObject(text, User.class);

        __CLR4_1_10xfuxfuluszw5b6.R.inc(43362);Assert.assertEquals(0, user1.getValue().length);
    }finally{__CLR4_1_10xfuxfuluszw5b6.R.flushNeeded();}}

    public static class User {

        private Integer[] value;

        public Integer[] getValue() {try{__CLR4_1_10xfuxfuluszw5b6.R.inc(43363);
            __CLR4_1_10xfuxfuluszw5b6.R.inc(43364);return value;
        }finally{__CLR4_1_10xfuxfuluszw5b6.R.flushNeeded();}}

        public void setValue(Integer[] value) {try{__CLR4_1_10xfuxfuluszw5b6.R.inc(43365);
            __CLR4_1_10xfuxfuluszw5b6.R.inc(43366);this.value = value;
        }finally{__CLR4_1_10xfuxfuluszw5b6.R.flushNeeded();}}

    }
}
