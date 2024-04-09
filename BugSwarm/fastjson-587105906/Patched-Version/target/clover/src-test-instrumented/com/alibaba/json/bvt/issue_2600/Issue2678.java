/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2600;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Issue2678 extends TestCase {static class __CLR4_5_21et51et5lusvnbuf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,65877,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_field() throws Exception {__CLR4_5_21et51et5lusvnbuf.R.globalSliceStart(getClass().getName(),65849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vh3vws1et5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et51et5lusvnbuf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et51et5lusvnbuf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2600.Issue2678.test_field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vh3vws1et5() throws Exception{try{__CLR4_5_21et51et5lusvnbuf.R.inc(65849);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65850);Person person = new Person();
        __CLR4_5_21et51et5lusvnbuf.R.inc(65851);person.setName("Ariston");
        __CLR4_5_21et51et5lusvnbuf.R.inc(65852);person.setAge(23);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65853);String json = JSON.toJSONString(person);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65854);assertEquals("{\"age\":23,'name':'Ariston'}", json);
    }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

    public void test_getter() throws Exception {__CLR4_5_21et51et5lusvnbuf.R.globalSliceStart(getClass().getName(),65855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cexmzj1etb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21et51et5lusvnbuf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21et51et5lusvnbuf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2600.Issue2678.test_getter",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65855,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cexmzj1etb() throws Exception{try{__CLR4_5_21et51et5lusvnbuf.R.inc(65855);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65856);Person2 person = new Person2();
        __CLR4_5_21et51et5lusvnbuf.R.inc(65857);person.setName("Ariston");
        __CLR4_5_21et51et5lusvnbuf.R.inc(65858);person.setAge(23);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65859);String json = JSON.toJSONString(person);
        __CLR4_5_21et51et5lusvnbuf.R.inc(65860);assertEquals("{\"age\":23,'name':'Ariston'}", json);
    }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

    static class Person {

        @JSONField(serialzeFeatures = SerializerFeature.UseSingleQuotes)
        private String name;

        private int age;

        public String getName()
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65861);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65862);return name;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public void setName( String name )
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65863);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65864);this.name = name;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public int getAge()
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65865);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65866);return age;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public void setAge( int age )
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65867);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65868);this.age = age;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}
    }

    static class Person2 {

        private String name;

        private int age;

        @JSONField(serialzeFeatures = SerializerFeature.UseSingleQuotes)
        public String getName()
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65869);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65870);return name;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public void setName( String name )
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65871);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65872);this.name = name;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public int getAge()
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65873);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65874);return age;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}

        public void setAge( int age )
        {try{__CLR4_5_21et51et5lusvnbuf.R.inc(65875);
            __CLR4_5_21et51et5lusvnbuf.R.inc(65876);this.age = age;
        }finally{__CLR4_5_21et51et5lusvnbuf.R.flushNeeded();}}
    }
}
