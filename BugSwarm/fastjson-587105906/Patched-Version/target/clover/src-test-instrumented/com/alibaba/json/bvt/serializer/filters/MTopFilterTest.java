/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.HashMap;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.ValueFilter;

import junit.framework.TestCase;

public class MTopFilterTest extends TestCase {static class __CLR4_5_21v9r1v9rlusvngtu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,87217,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21v9r1v9rlusvngtu.R.globalSliceStart(getClass().getName(),87183);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21v9r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21v9r1v9rlusvngtu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21v9r1v9rlusvngtu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.MTopFilterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87183,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21v9r() throws Exception{try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87183);
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87184);Model model = new Model();
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87185);model.id = 1001;
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87186);model.name = "yongbo";
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87187);model.user = new Person();
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87188);model.user.personId = 2002;

        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87189);final HashMap<String, Object> values = new HashMap<String, Object>();
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87190);ValueFilter valueFilter = new ValueFilter() {

            @Override
            public Object process(Object object, String name, Object value) {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87191);
                __CLR4_5_21v9r1v9rlusvngtu.R.inc(87192);values.put(name, value);
                __CLR4_5_21v9r1v9rlusvngtu.R.inc(87193);return value;
            }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}
        };
        
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87194);String jsonString = JSON.toJSONString(model, valueFilter);
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87195);Assert.assertEquals("{\"id\":1001,\"name\":\"yongbo\",\"user\":{\"personId\":2002}}", jsonString);
        
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87196);Assert.assertEquals(4, values.size());
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87197);Assert.assertEquals(model.id, values.get("id"));
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87198);Assert.assertSame(model.name, values.get("name"));
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87199);Assert.assertEquals(model.user, values.get("user"));
        __CLR4_5_21v9r1v9rlusvngtu.R.inc(87200);Assert.assertEquals(model.user.personId, values.get("personId"));
    }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

    public static class Model {

        private int    id;
        private String name;
        private Person user;

        public int getId() {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87201);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87202);return id;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87203);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87204);this.id = id;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public Person getUser() {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87205);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87206);return user;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public void setUser(Person user) {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87207);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87208);this.user = user;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87209);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87210);return name;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87211);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87212);this.name = name;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

    }

    public static class Person {

        private int personId;

        public int getPersonId() {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87213);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87214);return personId;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

        public void setPersonId(int personId) {try{__CLR4_5_21v9r1v9rlusvngtu.R.inc(87215);
            __CLR4_5_21v9r1v9rlusvngtu.R.inc(87216);this.personId = personId;
        }finally{__CLR4_5_21v9r1v9rlusvngtu.R.flushNeeded();}}

    }
}
