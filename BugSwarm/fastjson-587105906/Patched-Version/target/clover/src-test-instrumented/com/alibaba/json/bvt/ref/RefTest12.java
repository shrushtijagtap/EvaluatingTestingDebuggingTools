/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.ref;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;

public class RefTest12 extends TestCase {static class __CLR4_5_21r0t1r0tlusvnfvr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,81699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21r0t1r0tlusvnfvr.R.globalSliceStart(getClass().getName(),81677);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21r0t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21r0t1r0tlusvnfvr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21r0t1r0tlusvnfvr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest12.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81677,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21r0t() throws Exception{try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81677);
        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81678);Entity entity = new Entity(123, new Child());
        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81679);entity.getChild().setParent(entity);

        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81680);String text = JSON.toJSONString(entity);
        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81681);System.out.println(text);

        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81682);ParserConfig config = new ParserConfig();
        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81683);config.setAsmEnable(false);
        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81684);Entity entity2 = JSON.parseObject(text, Entity.class, config, 0);

        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81685);Assert.assertEquals(entity2, entity2.getChild().getParent());

        __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81686);System.out.println(JSON.toJSONString(entity2));
    }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

    public static class Entity {

        private final int   id;
        private final Child child;

        @JSONCreator
        public Entity(@JSONField(name = "id") int id, @JSONField(name = "child") Child child){
            super();__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81688);try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81687);
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81689);this.id = id;
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81690);this.child = child;
        }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81691);
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81692);return id;
        }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

        public Child getChild() {try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81693);
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81694);return child;
        }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

    }

    public static class Child {

        private Entity parent;

        public Entity getParent() {try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81695);
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81696);return parent;
        }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

        public void setParent(Entity parent) {try{__CLR4_5_21r0t1r0tlusvnfvr.R.inc(81697);
            __CLR4_5_21r0t1r0tlusvnfvr.R.inc(81698);this.parent = parent;
        }finally{__CLR4_5_21r0t1r0tlusvnfvr.R.flushNeeded();}}

    }
}
