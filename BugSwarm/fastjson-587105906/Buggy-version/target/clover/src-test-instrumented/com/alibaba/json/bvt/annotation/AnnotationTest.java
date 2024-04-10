/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.annotation;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import junit.framework.TestCase;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Helly on 2017/04/10.
 */
public class AnnotationTest extends TestCase {static class __CLR4_1_10114i114iluszw6p1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,48142,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_annoation() throws Exception {__CLR4_1_10114i114iluszw6p1.R.globalSliceStart(getClass().getName(),48114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dktwo1114i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10114i114iluszw6p1.R.rethrow($CLV_t2$);}finally{__CLR4_1_10114i114iluszw6p1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.annotation.AnnotationTest.test_annoation",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),48114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dktwo1114i() throws Exception{try{__CLR4_1_10114i114iluszw6p1.R.inc(48114);
        __CLR4_1_10114i114iluszw6p1.R.inc(48115);Bob bob = new Bob("Bob", 30, true);
//        JSONObject obj = (JSONObject) JSON.toJSON(bob);
//        assertEquals(3, obj.size());
//        assertEquals(Boolean.TRUE, obj.get("sex"));
//        assertEquals("Bob", obj.get("name"));
//        assertEquals(new Integer(30), obj.get("age"));

        __CLR4_1_10114i114iluszw6p1.R.inc(48116);PersonInfo info = Bob.class.getAnnotation(PersonInfo.class);
        __CLR4_1_10114i114iluszw6p1.R.inc(48117);JSONObject obj = (JSONObject) JSON.toJSON(info);

        __CLR4_1_10114i114iluszw6p1.R.inc(48118);assertEquals(3, obj.size());
        __CLR4_1_10114i114iluszw6p1.R.inc(48119);assertEquals(Boolean.TRUE, obj.get("sex"));
        __CLR4_1_10114i114iluszw6p1.R.inc(48120);assertEquals("Bob", obj.get("name"));
        __CLR4_1_10114i114iluszw6p1.R.inc(48121);assertEquals(new Integer(30), obj.get("age"));
    }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

    @PersonInfo(name = "Bob", age = 30, sex = true)
    public static class Bob implements Person {
        private String name;
        private int age;
        private boolean sex;

        public String getName() {try{__CLR4_1_10114i114iluszw6p1.R.inc(48122);
            __CLR4_1_10114i114iluszw6p1.R.inc(48123);return name;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10114i114iluszw6p1.R.inc(48124);
            __CLR4_1_10114i114iluszw6p1.R.inc(48125);this.name = name;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_10114i114iluszw6p1.R.inc(48126);
            __CLR4_1_10114i114iluszw6p1.R.inc(48127);return age;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_10114i114iluszw6p1.R.inc(48128);
            __CLR4_1_10114i114iluszw6p1.R.inc(48129);this.age = age;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public boolean isSex() {try{__CLR4_1_10114i114iluszw6p1.R.inc(48130);
            __CLR4_1_10114i114iluszw6p1.R.inc(48131);return sex;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public void setSex(boolean sex) {try{__CLR4_1_10114i114iluszw6p1.R.inc(48132);
            __CLR4_1_10114i114iluszw6p1.R.inc(48133);this.sex = sex;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public Bob() {try{__CLR4_1_10114i114iluszw6p1.R.inc(48134);
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public Bob(String name, int age, boolean sex) {
            this();__CLR4_1_10114i114iluszw6p1.R.inc(48136);try{__CLR4_1_10114i114iluszw6p1.R.inc(48135);
            __CLR4_1_10114i114iluszw6p1.R.inc(48137);this.name = name;
            __CLR4_1_10114i114iluszw6p1.R.inc(48138);this.age = age;
            __CLR4_1_10114i114iluszw6p1.R.inc(48139);this.sex = sex;
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}

        public void hello() {try{__CLR4_1_10114i114iluszw6p1.R.inc(48140);
            __CLR4_1_10114i114iluszw6p1.R.inc(48141);System.out.println("world");
        }finally{__CLR4_1_10114i114iluszw6p1.R.flushNeeded();}}
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.TYPE)
    public static  @interface PersonInfo {
        String name();
        int age();
        boolean sex();
    }


    public static interface Person {
        void hello();
    }

}
