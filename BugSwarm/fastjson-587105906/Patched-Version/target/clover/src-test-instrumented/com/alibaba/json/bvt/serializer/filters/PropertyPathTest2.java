/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.filters;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;

public class PropertyPathTest2 extends TestCase {static class __CLR4_5_21vjo1vjolusyjvf1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,87565,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_path() throws Exception {__CLR4_5_21vjo1vjolusyjvf1.R.globalSliceStart(getClass().getName(),87540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wh3d151vjo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21vjo1vjolusyjvf1.R.rethrow($CLV_t2$);}finally{__CLR4_5_21vjo1vjolusyjvf1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest2.test_path",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),87540,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wh3d151vjo() throws Exception{try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87540);
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87541);Person p1 = new Person();
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87542);p1.setId(100);
        
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87543);Person c1 = new Person();
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87544);c1.setId(1000);
        
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87545);Person c2 = new Person();
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87546);c2.setId(2000);
        
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87547);p1.getChildren().add(c1);
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87548);p1.getChildren().add(c2);
        
        __CLR4_5_21vjo1vjolusyjvf1.R.inc(87549);Assert.assertEquals("{\"children\":[{\"id\":1000},{\"id\":2000}],\"id\":100}", JSON.toJSONString(p1, new MyPropertyPreFilter()));
    }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

    public static class MyPropertyPreFilter implements PropertyPreFilter {

        public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87550);
            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87551);String path = serializer.getContext().toString() + "." + name;

            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87552);if ((((path.endsWith("].children"))&&(__CLR4_5_21vjo1vjolusyjvf1.R.iget(87553)!=0|true))||(__CLR4_5_21vjo1vjolusyjvf1.R.iget(87554)==0&false))) {{
                __CLR4_5_21vjo1vjolusyjvf1.R.inc(87555);return false;
            }

            }__CLR4_5_21vjo1vjolusyjvf1.R.inc(87556);return true;
        }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

    }

    public static class Person {

        private int          id;

        private List<Person> children = new ArrayList<Person>();

        public int getId() {try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87557);
            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87558);return id;
        }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87559);
            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87560);this.id = id;
        }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

        public List<Person> getChildren() {try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87561);
            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87562);return children;
        }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

        public void setChildren(List<Person> children) {try{__CLR4_5_21vjo1vjolusyjvf1.R.inc(87563);
            __CLR4_5_21vjo1vjolusyjvf1.R.inc(87564);this.children = children;
        }finally{__CLR4_5_21vjo1vjolusyjvf1.R.flushNeeded();}}

    }
}
