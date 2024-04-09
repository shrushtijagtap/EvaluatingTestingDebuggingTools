/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2600;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue2678 extends TestCase {static class __CLR4_1_101dv81dv8lusqkc1y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,64656,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_field() throws Exception {__CLR4_1_101dv81dv8lusqkc1y.R.globalSliceStart(getClass().getName(),64628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vh3vws1dv8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dv81dv8lusqkc1y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dv81dv8lusqkc1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2600.Issue2678.test_field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vh3vws1dv8() throws Exception{try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64628);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64629);Person person = new Person();
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64630);person.setName("Ariston");
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64631);person.setAge(23);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64632);String json = JSON.toJSONString(person);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64633);assertEquals("{\"age\":23,'name':'Ariston'}", json);
    }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

    public void test_getter() throws Exception {__CLR4_1_101dv81dv8lusqkc1y.R.globalSliceStart(getClass().getName(),64634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cexmzj1dve();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dv81dv8lusqkc1y.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dv81dv8lusqkc1y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2600.Issue2678.test_getter",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64634,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cexmzj1dve() throws Exception{try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64634);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64635);Person2 person = new Person2();
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64636);person.setName("Ariston");
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64637);person.setAge(23);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64638);String json = JSON.toJSONString(person);
        __CLR4_1_101dv81dv8lusqkc1y.R.inc(64639);assertEquals("{\"age\":23,'name':'Ariston'}", json);
    }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

    static class Person {

        @JSONField(serialzeFeatures = SerializerFeature.UseSingleQuotes)
        private String name;

        private int age;

        public String getName()
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64640);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64641);return name;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public void setName( String name )
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64642);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64643);this.name = name;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public int getAge()
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64644);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64645);return age;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public void setAge( int age )
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64646);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64647);this.age = age;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}
    }

    static class Person2 {

        private String name;

        private int age;

        @JSONField(serialzeFeatures = SerializerFeature.UseSingleQuotes)
        public String getName()
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64648);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64649);return name;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public void setName( String name )
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64650);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64651);this.name = name;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public int getAge()
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64652);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64653);return age;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}

        public void setAge( int age )
        {try{__CLR4_1_101dv81dv8lusqkc1y.R.inc(64654);
            __CLR4_1_101dv81dv8lusqkc1y.R.inc(64655);this.age = age;
        }finally{__CLR4_1_101dv81dv8lusqkc1y.R.flushNeeded();}}
    }
}
