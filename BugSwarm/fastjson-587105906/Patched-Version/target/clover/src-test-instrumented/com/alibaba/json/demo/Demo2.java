/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

public class Demo2 extends TestCase {static class __CLR4_5_2203p203plusyjw8r{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93469,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2203p203plusyjw8r.R.globalSliceStart(getClass().getName(),93445);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2203p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2203p203plusyjw8r.R.rethrow($CLV_t2$);}finally{__CLR4_5_2203p203plusyjw8r.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.Demo2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),93445,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2203p() throws Exception{try{__CLR4_5_2203p203plusyjw8r.R.inc(93445);
        __CLR4_5_2203p203plusyjw8r.R.inc(93446);Department dep = new Department();
        __CLR4_5_2203p203plusyjw8r.R.inc(93447);dep.setId(123);
        __CLR4_5_2203p203plusyjw8r.R.inc(93448);dep.setName("\u4e00\u7ea7\u90e8\u95e8");
        __CLR4_5_2203p203plusyjw8r.R.inc(93449);dep.setParent(dep);        

        __CLR4_5_2203p203plusyjw8r.R.inc(93450);String text = JSON.toJSONString(dep);
        __CLR4_5_2203p203plusyjw8r.R.inc(93451);System.out.println(text);
        
        __CLR4_5_2203p203plusyjw8r.R.inc(93452);JSON.parseObject(text, Department.class);
    }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}

    public static class Department {
    
        private int                  id;
        private String               name;
        private Department parent;
        private transient List<Department> children = new ArrayList<Department>();
    
        public int getId() {try{__CLR4_5_2203p203plusyjw8r.R.inc(93453); __CLR4_5_2203p203plusyjw8r.R.inc(93454);return id; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public void setId(int id) {try{__CLR4_5_2203p203plusyjw8r.R.inc(93455); __CLR4_5_2203p203plusyjw8r.R.inc(93456);this.id = id; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public String getName() {try{__CLR4_5_2203p203plusyjw8r.R.inc(93457); __CLR4_5_2203p203plusyjw8r.R.inc(93458);return name; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public void setName(String name) {try{__CLR4_5_2203p203plusyjw8r.R.inc(93459); __CLR4_5_2203p203plusyjw8r.R.inc(93460);this.name = name; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        @JSONField(serialize=false)
        public Department getParent() {try{__CLR4_5_2203p203plusyjw8r.R.inc(93461); __CLR4_5_2203p203plusyjw8r.R.inc(93462);return parent; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public void setParent(Department parent) {try{__CLR4_5_2203p203plusyjw8r.R.inc(93463); __CLR4_5_2203p203plusyjw8r.R.inc(93464);this.parent = parent; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public List<Department> getChildren() {try{__CLR4_5_2203p203plusyjw8r.R.inc(93465); __CLR4_5_2203p203plusyjw8r.R.inc(93466);return children; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
        public void setChildren(List<Department> children) {try{__CLR4_5_2203p203plusyjw8r.R.inc(93467); __CLR4_5_2203p203plusyjw8r.R.inc(93468);this.children = children; }finally{__CLR4_5_2203p203plusyjw8r.R.flushNeeded();}}
    }
}
