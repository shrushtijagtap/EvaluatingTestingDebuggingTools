/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.jdk8;

import java.util.Optional;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class OptionalTest3 extends TestCase {static class __CLR4_1_101f721f72luszwbxk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,66367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_optional() throws Exception {__CLR4_1_101f721f72luszwbxk.R.globalSliceStart(getClass().getName(),66350);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aapalo1f72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101f721f72luszwbxk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101f721f72luszwbxk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.jdk8.OptionalTest3.test_optional",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),66350,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aapalo1f72() throws Exception{try{__CLR4_1_101f721f72luszwbxk.R.inc(66350);
        __CLR4_1_101f721f72luszwbxk.R.inc(66351);UserExt ext = new UserExt();
        __CLR4_1_101f721f72luszwbxk.R.inc(66352);ext.setValue(Optional.of(123));
        __CLR4_1_101f721f72luszwbxk.R.inc(66353);User user = new User();
        __CLR4_1_101f721f72luszwbxk.R.inc(66354);user.setExt(Optional.of(ext));

        __CLR4_1_101f721f72luszwbxk.R.inc(66355);String text = JSON.toJSONString(user);

        __CLR4_1_101f721f72luszwbxk.R.inc(66356);Assert.assertEquals("{\"ext\":{\"value\":123}}", text);

        __CLR4_1_101f721f72luszwbxk.R.inc(66357);User user2 = JSON.parseObject(text, User.class);

        __CLR4_1_101f721f72luszwbxk.R.inc(66358);Assert.assertEquals(user.getExt().get().getValue().get(), user2.getExt().get().getValue().get());
    }finally{__CLR4_1_101f721f72luszwbxk.R.flushNeeded();}}

    public static class User {

        private Optional<UserExt> ext;

        public Optional<UserExt> getExt() {try{__CLR4_1_101f721f72luszwbxk.R.inc(66359);
            __CLR4_1_101f721f72luszwbxk.R.inc(66360);return ext;
        }finally{__CLR4_1_101f721f72luszwbxk.R.flushNeeded();}}

        public void setExt(Optional<UserExt> ext) {try{__CLR4_1_101f721f72luszwbxk.R.inc(66361);
            __CLR4_1_101f721f72luszwbxk.R.inc(66362);this.ext = ext;
        }finally{__CLR4_1_101f721f72luszwbxk.R.flushNeeded();}}

    }

    public static class UserExt {

        private Optional<Integer> value;

        public Optional<Integer> getValue() {try{__CLR4_1_101f721f72luszwbxk.R.inc(66363);
            __CLR4_1_101f721f72luszwbxk.R.inc(66364);return value;
        }finally{__CLR4_1_101f721f72luszwbxk.R.flushNeeded();}}

        public void setValue(Optional<Integer> value) {try{__CLR4_1_101f721f72luszwbxk.R.inc(66365);
            __CLR4_1_101f721f72luszwbxk.R.inc(66366);this.value = value;
        }finally{__CLR4_1_101f721f72luszwbxk.R.flushNeeded();}}
    }
}
