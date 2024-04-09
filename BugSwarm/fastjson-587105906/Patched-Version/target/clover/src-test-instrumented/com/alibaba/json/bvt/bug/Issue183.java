/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class Issue183 extends TestCase {static class __CLR4_5_217qc17qclusvn7sx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56722,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_issue_183() throws Exception {__CLR4_5_217qc17qclusvn7sx.R.globalSliceStart(getClass().getName(),56676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2256f2817qc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217qc17qclusvn7sx.R.rethrow($CLV_t2$);}finally{__CLR4_5_217qc17qclusvn7sx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue183.test_issue_183",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56676,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2256f2817qc() throws Exception{try{__CLR4_5_217qc17qclusvn7sx.R.inc(56676);
        __CLR4_5_217qc17qclusvn7sx.R.inc(56677);A a = new A();
        __CLR4_5_217qc17qclusvn7sx.R.inc(56678);a.setName("xiao").setAge(21);
        __CLR4_5_217qc17qclusvn7sx.R.inc(56679);String result = JSON.toJSONString(a);
        __CLR4_5_217qc17qclusvn7sx.R.inc(56680);A newA = JSON.parseObject(result, A.class);
        __CLR4_5_217qc17qclusvn7sx.R.inc(56681);Assert.assertTrue(a.equals(newA));
    }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}

    static interface IA {

        @JSONField(name = "wener")
        String getName();
        
         @JSONField(name = "wener")
         IA setName(String name);
    }

    static class A implements IA {

        String name;
        int    age;

        public String getName() {try{__CLR4_5_217qc17qclusvn7sx.R.inc(56682);
            __CLR4_5_217qc17qclusvn7sx.R.inc(56683);return name;
        }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_217qc17qclusvn7sx.R.inc(56684);
            __CLR4_5_217qc17qclusvn7sx.R.inc(56685);return age;
        }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}

        public A setAge(int age) {try{__CLR4_5_217qc17qclusvn7sx.R.inc(56686);
            __CLR4_5_217qc17qclusvn7sx.R.inc(56687);this.age = age;
            __CLR4_5_217qc17qclusvn7sx.R.inc(56688);return this;
        }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}

        public A setName(String name) {try{__CLR4_5_217qc17qclusvn7sx.R.inc(56689);
            __CLR4_5_217qc17qclusvn7sx.R.inc(56690);this.name = name;
            __CLR4_5_217qc17qclusvn7sx.R.inc(56691);return this;
        }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}

        @Override
        public boolean equals(Object obj) {try{__CLR4_5_217qc17qclusvn7sx.R.inc(56692);
            __CLR4_5_217qc17qclusvn7sx.R.inc(56693);if ((((this == obj)&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56694)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56695)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56696);return true;
            }__CLR4_5_217qc17qclusvn7sx.R.inc(56697);if ((((obj == null)&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56698)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56699)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56700);return false;
            }__CLR4_5_217qc17qclusvn7sx.R.inc(56701);if ((((getClass() != obj.getClass())&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56702)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56703)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56704);return false;
            }__CLR4_5_217qc17qclusvn7sx.R.inc(56705);A other = (A) obj;
            __CLR4_5_217qc17qclusvn7sx.R.inc(56706);if ((((age != other.age)&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56707)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56708)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56709);return false;
            }__CLR4_5_217qc17qclusvn7sx.R.inc(56710);if ((((name == null)&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56711)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56712)==0&false))) {{
                __CLR4_5_217qc17qclusvn7sx.R.inc(56713);if ((((other.name != null)&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56714)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56715)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56716);return false;
            }} }else {__CLR4_5_217qc17qclusvn7sx.R.inc(56717);if ((((!name.equals(other.name))&&(__CLR4_5_217qc17qclusvn7sx.R.iget(56718)!=0|true))||(__CLR4_5_217qc17qclusvn7sx.R.iget(56719)==0&false))) {__CLR4_5_217qc17qclusvn7sx.R.inc(56720);return false;
            }}__CLR4_5_217qc17qclusvn7sx.R.inc(56721);return true;
        }finally{__CLR4_5_217qc17qclusvn7sx.R.flushNeeded();}}
        
    }
}
