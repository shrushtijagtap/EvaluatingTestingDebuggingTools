/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_KimShen extends TestCase {static class __CLR4_5_212uy12uylusyjr4u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,50381,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_212uy12uylusyjr4u.R.globalSliceStart(getClass().getName(),50362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp212uy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212uy12uylusyjr4u.R.rethrow($CLV_t2$);}finally{__CLR4_5_212uy12uylusyjr4u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_KimShen.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp212uy() throws Exception{try{__CLR4_5_212uy12uylusyjr4u.R.inc(50362);
        __CLR4_5_212uy12uylusyjr4u.R.inc(50363);String text = JSON.toJSONString(new Entity());
        __CLR4_5_212uy12uylusyjr4u.R.inc(50364);JSON.parseObject(text, Entity.class);
    }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

    public static class Entity {

        private Set<Object>        value      = new HashSet<Object>();
        private TreeSet<Object>    treeSet    = new TreeSet<Object>();
        private LinkedList<Object> linkedList = new LinkedList<Object>();
        private MySet<Object>      mySet      = new MySet<Object>();

        public MySet<Object> getMySet() {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50365);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50366);return mySet;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public void setMySet(MySet<Object> mySet) {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50367);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50368);this.mySet = mySet;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public LinkedList<Object> getLinkedList() {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50369);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50370);return linkedList;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public void setLinkedList(LinkedList<Object> linkedList) {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50371);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50372);this.linkedList = linkedList;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public Set<Object> getValue() {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50373);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50374);return value;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public void setValue(Set<Object> value) {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50375);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50376);this.value = value;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public TreeSet<Object> getTreeSet() {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50377);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50378);return treeSet;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

        public void setTreeSet(TreeSet<Object> treeSet) {try{__CLR4_5_212uy12uylusyjr4u.R.inc(50379);
            __CLR4_5_212uy12uylusyjr4u.R.inc(50380);this.treeSet = treeSet;
        }finally{__CLR4_5_212uy12uylusyjr4u.R.flushNeeded();}}

    }

    public static class MySet<T> extends TreeSet<T> {

    }
}
