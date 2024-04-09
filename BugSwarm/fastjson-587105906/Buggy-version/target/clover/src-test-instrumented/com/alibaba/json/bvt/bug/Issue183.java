/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class Issue183 extends TestCase {static class __CLR4_1_1016sf16sflusqk6ox{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,55501,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_issue_183() throws Exception {__CLR4_1_1016sf16sflusqk6ox.R.globalSliceStart(getClass().getName(),55455);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10256f2816sf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1016sf16sflusqk6ox.R.rethrow($CLV_t2$);}finally{__CLR4_1_1016sf16sflusqk6ox.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue183.test_issue_183",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),55455,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10256f2816sf() throws Exception{try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55455);
        __CLR4_1_1016sf16sflusqk6ox.R.inc(55456);A a = new A();
        __CLR4_1_1016sf16sflusqk6ox.R.inc(55457);a.setName("xiao").setAge(21);
        __CLR4_1_1016sf16sflusqk6ox.R.inc(55458);String result = JSON.toJSONString(a);
        __CLR4_1_1016sf16sflusqk6ox.R.inc(55459);A newA = JSON.parseObject(result, A.class);
        __CLR4_1_1016sf16sflusqk6ox.R.inc(55460);Assert.assertTrue(a.equals(newA));
    }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}

    static interface IA {

        @JSONField(name = "wener")
        String getName();
        
         @JSONField(name = "wener")
         IA setName(String name);
    }

    static class A implements IA {

        String name;
        int    age;

        public String getName() {try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55461);
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55462);return name;
        }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55463);
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55464);return age;
        }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}

        public A setAge(int age) {try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55465);
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55466);this.age = age;
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55467);return this;
        }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}

        public A setName(String name) {try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55468);
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55469);this.name = name;
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55470);return this;
        }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_1_1016sf16sflusqk6ox.R.inc(55471);
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55472);if ((((this == obj)&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55473)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55474)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55475);return true;
            }__CLR4_1_1016sf16sflusqk6ox.R.inc(55476);if ((((obj == null)&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55477)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55478)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55479);return false;
            }__CLR4_1_1016sf16sflusqk6ox.R.inc(55480);if ((((getClass() != obj.getClass())&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55481)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55482)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55483);return false;
            }__CLR4_1_1016sf16sflusqk6ox.R.inc(55484);A other = (A) obj;
            __CLR4_1_1016sf16sflusqk6ox.R.inc(55485);if ((((age != other.age)&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55486)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55487)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55488);return false;
            }__CLR4_1_1016sf16sflusqk6ox.R.inc(55489);if ((((name == null)&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55490)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55491)==0&false))) {{
                __CLR4_1_1016sf16sflusqk6ox.R.inc(55492);if ((((other.name != null)&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55493)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55494)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55495);return false;
            }} }else {__CLR4_1_1016sf16sflusqk6ox.R.inc(55496);if ((((!name.equals(other.name))&&(__CLR4_1_1016sf16sflusqk6ox.R.iget(55497)!=0|true))||(__CLR4_1_1016sf16sflusqk6ox.R.iget(55498)==0&false))) {__CLR4_1_1016sf16sflusqk6ox.R.inc(55499);return false;
            }}__CLR4_1_1016sf16sflusqk6ox.R.inc(55500);return true;
        }finally{__CLR4_1_1016sf16sflusqk6ox.R.flushNeeded();}}
        
    }
}
