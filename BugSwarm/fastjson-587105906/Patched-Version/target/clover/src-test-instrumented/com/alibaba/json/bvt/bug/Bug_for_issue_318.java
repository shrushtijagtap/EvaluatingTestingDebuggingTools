/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_issue_318 extends TestCase {static class __CLR4_5_2148c148clusyjrma{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,52192,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_2148c148clusyjrma.R.globalSliceStart(getClass().getName(),52140);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb148c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2148c148clusyjrma.R.rethrow($CLV_t2$);}finally{__CLR4_5_2148c148clusyjrma.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_318.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52140,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb148c() throws Exception{try{__CLR4_5_2148c148clusyjrma.R.inc(52140);
        __CLR4_5_2148c148clusyjrma.R.inc(52141);Person o1 = new Person("zhangsan", 20);
        __CLR4_5_2148c148clusyjrma.R.inc(52142);Person o2 = new Person("liuXX", 30);
        __CLR4_5_2148c148clusyjrma.R.inc(52143);Person o3 = new Person("Test", 10);

        __CLR4_5_2148c148clusyjrma.R.inc(52144);List<Person> users = new ArrayList<Person>();
        __CLR4_5_2148c148clusyjrma.R.inc(52145);users.add(o1);
        __CLR4_5_2148c148clusyjrma.R.inc(52146);users.add(o2);
        __CLR4_5_2148c148clusyjrma.R.inc(52147);users.add(o3);

        __CLR4_5_2148c148clusyjrma.R.inc(52148);List<Person> managers = new ArrayList<Person>();
        __CLR4_5_2148c148clusyjrma.R.inc(52149);managers.add(o2);
        __CLR4_5_2148c148clusyjrma.R.inc(52150);managers.add(o3);

        __CLR4_5_2148c148clusyjrma.R.inc(52151);PersonAll pa = new PersonAll();
        __CLR4_5_2148c148clusyjrma.R.inc(52152);pa.setCount(30);

        // map
        __CLR4_5_2148c148clusyjrma.R.inc(52153);Map<String, List<Person>> userMap = new LinkedHashMap<String, List<Person>>();
        __CLR4_5_2148c148clusyjrma.R.inc(52154);userMap.put("managers", managers);
        __CLR4_5_2148c148clusyjrma.R.inc(52155);userMap.put("users", users);
        __CLR4_5_2148c148clusyjrma.R.inc(52156);pa.setUserMap(userMap);
        // bean\u7684\u5c5e\u6027
        __CLR4_5_2148c148clusyjrma.R.inc(52157);pa.setUsers(users);
        __CLR4_5_2148c148clusyjrma.R.inc(52158);pa.setManagers(managers);

        // String json = JSON.toJSONString(pa, SerializerFeature.DisableCircularReferenceDetect);
        __CLR4_5_2148c148clusyjrma.R.inc(52159);String json = JSON.toJSONString(pa);
//        System.out.println("\u5e8f\u5217\u5316: ");
//        System.out.println(json);

        __CLR4_5_2148c148clusyjrma.R.inc(52160);PersonAll target = JSON.parseObject(json, PersonAll.class);
//        System.out.println("\u53cd\u5e8f\u5217\u5316\u7ed3\u679c: ");
//        System.out.println("map users: " + target.getUserMap().get("users"));
//        System.out.println("map managers: " + target.getUserMap().get("managers"));
//
//        // \u53ef\u80fd\u662f\u4e2a "BUG" \u7b2c\u4e00\u4e2a\u5143\u7d20\u603b\u662f\u4e3anull
//        System.out.println("bean users: " + target.getUsers());
//        System.out.println("bean managers: " + target.getManagers());
//        
//        System.out.println(JSON.toJSONString(target));
        
        __CLR4_5_2148c148clusyjrma.R.inc(52161);Assert.assertNotNull(target.getUsers().get(0));
        __CLR4_5_2148c148clusyjrma.R.inc(52162);Assert.assertNotNull(target.getManagers().get(0));
    }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

    private static class Person {
        private String name;
        private Integer age;

        public Person(){try{__CLR4_5_2148c148clusyjrma.R.inc(52163);}finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public Person(String name, Integer age) {
            super();__CLR4_5_2148c148clusyjrma.R.inc(52165);try{__CLR4_5_2148c148clusyjrma.R.inc(52164);
            __CLR4_5_2148c148clusyjrma.R.inc(52166);this.name = name;
            __CLR4_5_2148c148clusyjrma.R.inc(52167);this.age = age;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
        public String getName() {try{__CLR4_5_2148c148clusyjrma.R.inc(52168);
            __CLR4_5_2148c148clusyjrma.R.inc(52169);return name;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
        public void setName(String name) {try{__CLR4_5_2148c148clusyjrma.R.inc(52170);
            __CLR4_5_2148c148clusyjrma.R.inc(52171);this.name = name;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
        public Integer getAge() {try{__CLR4_5_2148c148clusyjrma.R.inc(52172);
            __CLR4_5_2148c148clusyjrma.R.inc(52173);return age;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
        public void setAge(Integer age) {try{__CLR4_5_2148c148clusyjrma.R.inc(52174);
            __CLR4_5_2148c148clusyjrma.R.inc(52175);this.age = age;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
    }

    private static class PersonAll {
        private Map<String, List<Person>> userMap = new HashMap<String, List<Person>>();
        private Integer count;
        private List<Person> users;
        private List<Person> managers;

        public Integer getCount() {try{__CLR4_5_2148c148clusyjrma.R.inc(52176);
            __CLR4_5_2148c148clusyjrma.R.inc(52177);return count;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public void setCount(Integer count) {try{__CLR4_5_2148c148clusyjrma.R.inc(52178);
            __CLR4_5_2148c148clusyjrma.R.inc(52179);this.count = count;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public Map<String, List<Person>> getUserMap() {try{__CLR4_5_2148c148clusyjrma.R.inc(52180);
            __CLR4_5_2148c148clusyjrma.R.inc(52181);return userMap;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public void setUserMap(Map<String, List<Person>> userMap) {try{__CLR4_5_2148c148clusyjrma.R.inc(52182);
            __CLR4_5_2148c148clusyjrma.R.inc(52183);this.userMap = userMap;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public List<Person> getUsers() {try{__CLR4_5_2148c148clusyjrma.R.inc(52184);
            __CLR4_5_2148c148clusyjrma.R.inc(52185);return users;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public void setUsers(List<Person> users) {try{__CLR4_5_2148c148clusyjrma.R.inc(52186);
            __CLR4_5_2148c148clusyjrma.R.inc(52187);this.users = users;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public List<Person> getManagers() {try{__CLR4_5_2148c148clusyjrma.R.inc(52188);
            __CLR4_5_2148c148clusyjrma.R.inc(52189);return managers;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}

        public void setManagers(List<Person> managers) {try{__CLR4_5_2148c148clusyjrma.R.inc(52190);
            __CLR4_5_2148c148clusyjrma.R.inc(52191);this.managers = managers;
        }finally{__CLR4_5_2148c148clusyjrma.R.flushNeeded();}}
    }
}
