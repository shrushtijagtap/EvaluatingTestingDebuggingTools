/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;

public class PropertyPathTest2 extends TestCase {static class __CLR4_1_101vjz1vjzlusqklm1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87576,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_path() throws Exception {__CLR4_1_101vjz1vjzlusqklm1.R.globalSliceStart(getClass().getName(),87551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151vjz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vjz1vjzlusqklm1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vjz1vjzlusqklm1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest2.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151vjz() throws Exception{try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87551);
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87552);Person p1 = new Person();
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87553);p1.setId(100);
        
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87554);Person c1 = new Person();
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87555);c1.setId(1000);
        
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87556);Person c2 = new Person();
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87557);c2.setId(2000);
        
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87558);p1.getChildren().add(c1);
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87559);p1.getChildren().add(c2);
        
        __CLR4_1_101vjz1vjzlusqklm1.R.inc(87560);Assert.assertEquals("{\"children\":[{\"id\":1000},{\"id\":2000}],\"id\":100}", JSON.toJSONString(p1, new MyPropertyPreFilter()));
    }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

    public static class MyPropertyPreFilter implements PropertyPreFilter {

        public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87561);
            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87562);String path = serializer.getContext().toString() + "." + name;

            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87563);if ((((path.endsWith("].children"))&&(__CLR4_1_101vjz1vjzlusqklm1.R.iget(87564)!=0|true))||(__CLR4_1_101vjz1vjzlusqklm1.R.iget(87565)==0&false))) {{
                __CLR4_1_101vjz1vjzlusqklm1.R.inc(87566);return false;
            }

            }__CLR4_1_101vjz1vjzlusqklm1.R.inc(87567);return true;
        }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

    }

    public static class Person {

        private int          id;

        private List<Person> children = new ArrayList<Person>();

        public int getId() {try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87568);
            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87569);return id;
        }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87570);
            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87571);this.id = id;
        }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

        public List<Person> getChildren() {try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87572);
            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87573);return children;
        }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

        public void setChildren(List<Person> children) {try{__CLR4_1_101vjz1vjzlusqklm1.R.inc(87574);
            __CLR4_1_101vjz1vjzlusqklm1.R.inc(87575);this.children = children;
        }finally{__CLR4_1_101vjz1vjzlusqklm1.R.flushNeeded();}}

    }
}
