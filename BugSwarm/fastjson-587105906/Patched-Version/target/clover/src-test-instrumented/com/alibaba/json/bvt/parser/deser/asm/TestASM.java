/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.test.benchmark.encode.EishayEncode;

public class TestASM extends TestCase {static class __CLR4_5_21lq31lq3lusyju8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74867,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_asm() throws Exception {__CLR4_5_21lq31lq3lusyju8n.R.globalSliceStart(getClass().getName(),74811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqy90r1lq3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lq31lq3lusyju8n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lq31lq3lusyju8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM.test_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqy90r1lq3() throws Exception{try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74811);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74812);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74813);System.out.println(text);
    }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_21lq31lq3lusyju8n.R.globalSliceStart(getClass().getName(),74814);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21lq6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21lq31lq3lusyju8n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21lq31lq3lusyju8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74814,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21lq6() throws Exception{try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74814);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74815);Department department = new Department();

        __CLR4_5_21lq31lq3lusyju8n.R.inc(74816);Person person = new Person();
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74817);person.setId(123);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74818);person.setName("\u5218\u4f1f\u52a0");
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74819);person.setAge(40);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74820);person.setSalary(new BigDecimal("123456"));
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74821);person.getValues().add("A");
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74822);person.getValues().add("B");
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74823);person.getValues().add("C");

        __CLR4_5_21lq31lq3lusyju8n.R.inc(74824);department.getPersons().add(person);
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74825);department.getPersons().add(new Person());
        __CLR4_5_21lq31lq3lusyju8n.R.inc(74826);department.getPersons().add(new Person());

        {
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74827);String text = JSON.toJSONString(department);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74828);System.out.println(text);
        }
        {
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74829);String text = JSON.toJSONString(department, SerializerFeature.WriteMapNullValue);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74830);System.out.println(text);
        }
    }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

    public static class Person {

        private int          id;
        private String       name;
        private int          age;
        private BigDecimal   salary;

        private List<Person> childrens = new ArrayList<Person>();

        private List<String> values    = new ArrayList<String>();

        public List<String> getValues() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74831);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74832);return values;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74833);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74834);this.values = values;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74835);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74836);return id;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74837);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74838);this.id = id;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74839);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74840);return name;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74841);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74842);this.name = name;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public int getAge() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74843);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74844);return age;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74845);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74846);this.age = age;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74847);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74848);return salary;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74849);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74850);this.salary = salary;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public List<Person> getChildrens() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74851);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74852);return childrens;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setChildrens(List<Person> childrens) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74853);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74854);this.childrens = childrens;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}
    }

    public static class Department {

        private int          id;
        private String       name;
        private List<Person> persons = new ArrayList<Person>();

        public int getId() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74855);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74856);return id;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74857);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74858);this.id = id;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74859);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74860);return name;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74861);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74862);this.name = name;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public List<Person> getPersons() {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74863);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74864);return persons;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

        public void setPersons(List<Person> persons) {try{__CLR4_5_21lq31lq3lusyju8n.R.inc(74865);
            __CLR4_5_21lq31lq3lusyju8n.R.inc(74866);this.persons = persons;
        }finally{__CLR4_5_21lq31lq3lusyju8n.R.flushNeeded();}}

    }
}
