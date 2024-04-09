/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class Bug_for_wangran2 extends TestCase {static class __CLR4_5_216qh16qhlusvn7ab{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55426,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_wangran() throws Exception {__CLR4_5_216qh16qhlusvn7ab.R.globalSliceStart(getClass().getName(),55385);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2henjcw16qh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216qh16qhlusvn7ab.R.rethrow($CLV_t2$);}finally{__CLR4_5_216qh16qhlusvn7ab.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_wangran2.test_for_wangran",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55385,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2henjcw16qh() throws Exception{try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55385);
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55386);String text = "{" + //
                      "\"first\":{\"id\":1001}," + //
                      "\"second\":{\"id\":1002,\"root\":{\"$ref\":\"$\"}}," + //
                      "\"id\":23," + //
                      "\"name\":\"xxx\"," + //
                      "\"children\":[{\"root\":{\"$ref\":\"$\"}},{\"$ref\":\"$.second\"}]" + //
                      "}";
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55387);Root root = JSON.parseObject(text, Root.class);
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55388);Assert.assertEquals(23, root.getId());
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55389);Assert.assertEquals("xxx", root.getName());
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55390);Assert.assertTrue(root == root.getChildren().get(0).getRoot());
        __CLR4_5_216qh16qhlusvn7ab.R.inc(55391);Assert.assertTrue(root == root.getChildren().get(1).getRoot());
    }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

    public static class Root {

        private int         id;
        private String      name;

        private Child       first;
        private Child       second;

        private List<Child> children = new ArrayList<Child>();

        public Root(){try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55392);

        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public Child getSecond() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55393);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55394);return second;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setSecond(Child second) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55395);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55396);System.out.println("setSecond");
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55397);this.second = second;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public Child getFirst() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55398);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55399);return first;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setFirst(Child first) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55400);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55401);System.out.println("setFirst");
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55402);this.first = first;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public List<Child> getChildren() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55403);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55404);return children;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setChildren(List<Child> children) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55405);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55406);System.out.println("setChildren");
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55407);this.children = children;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55408);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55409);return id;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55410);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55411);this.id = id;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55412);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55413);return name;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55414);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55415);this.name = name;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

    }

    public static class Child {

        private int  id;

        private Root root;

        public Child(){try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55416);

        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public Root getRoot() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55417);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55418);return root;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setRoot(Root root) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55419);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55420);System.out.println("setRoot");
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55421);this.root = root;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55422);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55423);return id;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_216qh16qhlusvn7ab.R.inc(55424);
            __CLR4_5_216qh16qhlusvn7ab.R.inc(55425);this.id = id;
        }finally{__CLR4_5_216qh16qhlusvn7ab.R.flushNeeded();}}

    }
}
// 500m / 300
