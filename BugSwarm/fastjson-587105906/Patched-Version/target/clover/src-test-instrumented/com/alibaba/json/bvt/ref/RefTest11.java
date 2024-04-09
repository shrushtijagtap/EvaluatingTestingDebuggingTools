/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.ref;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class RefTest11 extends TestCase {static class __CLR4_5_21qzi1qzilusvnfvf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,81677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_ref() throws Exception {__CLR4_5_21qzi1qzilusvnfvf.R.globalSliceStart(getClass().getName(),81630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25mo1031qzi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qzi1qzilusvnfvf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qzi1qzilusvnfvf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest11.test_ref",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25mo1031qzi() throws Exception{try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81630);
        __CLR4_5_21qzi1qzilusvnfvf.R.inc(81631);Department tech = new Department(1, "\u6280\u672f\u90e8");
        __CLR4_5_21qzi1qzilusvnfvf.R.inc(81632);tech.setRoot(tech);
        
        {
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81633);Department pt = new Department(2, "\u5e73\u53f0\u6280\u672f\u90e8");
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81634);pt.setParent(tech);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81635);pt.setRoot(tech);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81636);tech.getChildren().add(pt);
            {
                __CLR4_5_21qzi1qzilusvnfvf.R.inc(81637);Department sysbase = new Department(3, "\u7cfb\u7edf\u57fa\u7840");
                __CLR4_5_21qzi1qzilusvnfvf.R.inc(81638);sysbase.setParent(pt);
                __CLR4_5_21qzi1qzilusvnfvf.R.inc(81639);sysbase.setRoot(tech);
                __CLR4_5_21qzi1qzilusvnfvf.R.inc(81640);pt.getChildren().add(sysbase);
            }
        }
        {
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81641);Department cn = new Department(4, "\u4e2d\u6587\u7ad9\u6280\u672f\u90e8");
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81642);cn.setParent(tech);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81643);cn.setRoot(tech);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81644);tech.getChildren().add(cn);
        }
        
        {
            //JSON.toJSONString(tech);
        }
        
        {
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81645);String prettyText = JSON.toJSONString(tech, SerializerFeature.PrettyFormat);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81646);System.out.println(prettyText);
        
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81647);String text = JSON.toJSONString(tech);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81648);Department dept = JSON.parseObject(text, Department.class);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81649);Assert.assertTrue(dept == dept.getRoot());
            
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81650);System.out.println(JSON.toJSONString(dept, SerializerFeature.PrettyFormat));
        }
    }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

    public static class Department {

        private int                    id;
        private String                 name;

        private Department             parent;
        private Department             root;

        private Collection<Department> children = new ArrayList<Department>();

        public Department(){try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81651);

        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public Department getRoot() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81652);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81653);return root;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public void setRoot(Department root) {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81654);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81655);this.root = root;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public Department(int id, String name){try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81656);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81657);this.id = id;
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81658);this.name = name;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81659);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81660);return id;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81661);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81662);this.id = id;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81663);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81664);return name;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81665);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81666);this.name = name;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public Department getParent() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81667);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81668);return parent;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public void setParent(Department parent) {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81669);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81670);this.parent = parent;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public Collection<Department> getChildren() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81671);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81672);return children;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

        public void setChildren(Collection<Department> children) {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81673);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81674);this.children = children;
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}
        
        public String toString() {try{__CLR4_5_21qzi1qzilusvnfvf.R.inc(81675);
            __CLR4_5_21qzi1qzilusvnfvf.R.inc(81676);return "{id:" + id + ",name:" + name + "}";
        }finally{__CLR4_5_21qzi1qzilusvnfvf.R.flushNeeded();}}

    }
}
