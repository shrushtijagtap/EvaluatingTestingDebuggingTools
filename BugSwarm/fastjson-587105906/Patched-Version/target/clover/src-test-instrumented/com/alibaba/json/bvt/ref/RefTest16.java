/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.ref;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class RefTest16 extends TestCase {static class __CLR4_5_21q5t1q5tlusyjur6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,80593,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21q5t1q5tlusyjur6.R.globalSliceStart(getClass().getName(),80561);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21q5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21q5t1q5tlusyjur6.R.rethrow($CLV_t2$);}finally{__CLR4_5_21q5t1q5tlusyjur6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest16.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80561,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21q5t() throws Exception{try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80561);

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80562);Person pA = new Person("a");
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80563);Person pB = new Person("b");

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80564);Family fA = new Family();
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80565);fA.setMembers(new Person[] { pA, pB });
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80566);fA.setMaster(pA);

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80567);Person pC = new Person("c");
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80568);Person pD = new Person("d");
        
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80569);Family fB = new Family();
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80570);fB.setMembers(new Person[] { pC, pD });
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80571);fB.setMaster(pC);

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80572);Family[] familyArray = new Family[] { fA, fB };
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80573);String text = JSON.toJSONString(familyArray);
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80574);System.out.println(text);

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80575);Family[] result = JSON.parseObject(text, Family[].class);

        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80576);Assert.assertSame(result[0].getMaster(), result[0].getMembers()[0]);
        __CLR4_5_21q5t1q5tlusyjur6.R.inc(80577);Assert.assertSame(result[1].getMaster(), result[1].getMembers()[0]);

    }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

    public static class Family {

        private Person   master;
        private Person[] members;

        public Person getMaster() {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80578);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80579);return master;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public void setMaster(Person master) {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80580);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80581);this.master = master;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public Person[] getMembers() {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80582);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80583);return members;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public void setMembers(Person[] members) {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80584);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80585);this.members = members;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

    }

    public static class Person {

        private String name;

        public Person(){try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80586);

        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public Person(String name){try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80587);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80588);this.name = name;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80589);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80590);return name;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21q5t1q5tlusyjur6.R.inc(80591);
            __CLR4_5_21q5t1q5tlusyjur6.R.inc(80592);this.name = name;
        }finally{__CLR4_5_21q5t1q5tlusyjur6.R.flushNeeded();}}

    }
}
