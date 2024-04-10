/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.test.benchmark.encode.EishayEncode;

public class TestASM extends TestCase {static class __CLR4_1_101mom1momluszwdke{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76110,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_asm() throws Exception {__CLR4_1_101mom1momluszwdke.R.globalSliceStart(getClass().getName(),76054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rqy90r1mom();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mom1momluszwdke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mom1momluszwdke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM.test_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rqy90r1mom() throws Exception{try{__CLR4_1_101mom1momluszwdke.R.inc(76054);
        __CLR4_1_101mom1momluszwdke.R.inc(76055);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_1_101mom1momluszwdke.R.inc(76056);System.out.println(text);
    }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_1_101mom1momluszwdke.R.globalSliceStart(getClass().getName(),76057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21mop();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mom1momluszwdke.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mom1momluszwdke.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21mop() throws Exception{try{__CLR4_1_101mom1momluszwdke.R.inc(76057);
        __CLR4_1_101mom1momluszwdke.R.inc(76058);Department department = new Department();

        __CLR4_1_101mom1momluszwdke.R.inc(76059);Person person = new Person();
        __CLR4_1_101mom1momluszwdke.R.inc(76060);person.setId(123);
        __CLR4_1_101mom1momluszwdke.R.inc(76061);person.setName("\u5218\u4f1f\u52a0");
        __CLR4_1_101mom1momluszwdke.R.inc(76062);person.setAge(40);
        __CLR4_1_101mom1momluszwdke.R.inc(76063);person.setSalary(new BigDecimal("123456"));
        __CLR4_1_101mom1momluszwdke.R.inc(76064);person.getValues().add("A");
        __CLR4_1_101mom1momluszwdke.R.inc(76065);person.getValues().add("B");
        __CLR4_1_101mom1momluszwdke.R.inc(76066);person.getValues().add("C");

        __CLR4_1_101mom1momluszwdke.R.inc(76067);department.getPersons().add(person);
        __CLR4_1_101mom1momluszwdke.R.inc(76068);department.getPersons().add(new Person());
        __CLR4_1_101mom1momluszwdke.R.inc(76069);department.getPersons().add(new Person());

        {
            __CLR4_1_101mom1momluszwdke.R.inc(76070);String text = JSON.toJSONString(department);
            __CLR4_1_101mom1momluszwdke.R.inc(76071);System.out.println(text);
        }
        {
            __CLR4_1_101mom1momluszwdke.R.inc(76072);String text = JSON.toJSONString(department, SerializerFeature.WriteMapNullValue);
            __CLR4_1_101mom1momluszwdke.R.inc(76073);System.out.println(text);
        }
    }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

    public static class Person {

        private int          id;
        private String       name;
        private int          age;
        private BigDecimal   salary;

        private List<Person> childrens = new ArrayList<Person>();

        private List<String> values    = new ArrayList<String>();

        public List<String> getValues() {try{__CLR4_1_101mom1momluszwdke.R.inc(76074);
            __CLR4_1_101mom1momluszwdke.R.inc(76075);return values;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setValues(List<String> values) {try{__CLR4_1_101mom1momluszwdke.R.inc(76076);
            __CLR4_1_101mom1momluszwdke.R.inc(76077);this.values = values;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101mom1momluszwdke.R.inc(76078);
            __CLR4_1_101mom1momluszwdke.R.inc(76079);return id;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101mom1momluszwdke.R.inc(76080);
            __CLR4_1_101mom1momluszwdke.R.inc(76081);this.id = id;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101mom1momluszwdke.R.inc(76082);
            __CLR4_1_101mom1momluszwdke.R.inc(76083);return name;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101mom1momluszwdke.R.inc(76084);
            __CLR4_1_101mom1momluszwdke.R.inc(76085);this.name = name;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public int getAge() {try{__CLR4_1_101mom1momluszwdke.R.inc(76086);
            __CLR4_1_101mom1momluszwdke.R.inc(76087);return age;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setAge(int age) {try{__CLR4_1_101mom1momluszwdke.R.inc(76088);
            __CLR4_1_101mom1momluszwdke.R.inc(76089);this.age = age;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public BigDecimal getSalary() {try{__CLR4_1_101mom1momluszwdke.R.inc(76090);
            __CLR4_1_101mom1momluszwdke.R.inc(76091);return salary;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setSalary(BigDecimal salary) {try{__CLR4_1_101mom1momluszwdke.R.inc(76092);
            __CLR4_1_101mom1momluszwdke.R.inc(76093);this.salary = salary;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public List<Person> getChildrens() {try{__CLR4_1_101mom1momluszwdke.R.inc(76094);
            __CLR4_1_101mom1momluszwdke.R.inc(76095);return childrens;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setChildrens(List<Person> childrens) {try{__CLR4_1_101mom1momluszwdke.R.inc(76096);
            __CLR4_1_101mom1momluszwdke.R.inc(76097);this.childrens = childrens;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}
    }

    public static class Department {

        private int          id;
        private String       name;
        private List<Person> persons = new ArrayList<Person>();

        public int getId() {try{__CLR4_1_101mom1momluszwdke.R.inc(76098);
            __CLR4_1_101mom1momluszwdke.R.inc(76099);return id;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101mom1momluszwdke.R.inc(76100);
            __CLR4_1_101mom1momluszwdke.R.inc(76101);this.id = id;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101mom1momluszwdke.R.inc(76102);
            __CLR4_1_101mom1momluszwdke.R.inc(76103);return name;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101mom1momluszwdke.R.inc(76104);
            __CLR4_1_101mom1momluszwdke.R.inc(76105);this.name = name;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public List<Person> getPersons() {try{__CLR4_1_101mom1momluszwdke.R.inc(76106);
            __CLR4_1_101mom1momluszwdke.R.inc(76107);return persons;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

        public void setPersons(List<Person> persons) {try{__CLR4_1_101mom1momluszwdke.R.inc(76108);
            __CLR4_1_101mom1momluszwdke.R.inc(76109);this.persons = persons;
        }finally{__CLR4_1_101mom1momluszwdke.R.flushNeeded();}}

    }
}
