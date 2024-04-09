/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.creator;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;

public class JSONCreatorTest extends TestCase {static class __CLR4_5_21l2d1l2dlusvne4q{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,73978,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_create() throws Exception {__CLR4_5_21l2d1l2dlusvne4q.R.globalSliceStart(getClass().getName(),73957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nw1awg1l2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l2d1l2dlusvne4q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l2d1l2dlusvne4q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest.test_create",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nw1awg1l2d() throws Exception{try{__CLR4_5_21l2d1l2dlusvne4q.R.inc(73957);
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73958);Entity entity = new Entity(123, "\u83dc\u59d0");
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73959);String text = JSON.toJSONString(entity);
        
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73960);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73961);Assert.assertEquals(entity.getId(), entity2.getId());
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73962);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_5_21l2d1l2dlusvne4q.R.flushNeeded();}}
    
    public void test_create_2() throws Exception {__CLR4_5_21l2d1l2dlusvne4q.R.globalSliceStart(getClass().getName(),73963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mn6j5v1l2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l2d1l2dlusvne4q.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l2d1l2dlusvne4q.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest.test_create_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),73963,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mn6j5v1l2j() throws Exception{try{__CLR4_5_21l2d1l2dlusvne4q.R.inc(73963);
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73964);Entity entity = new Entity(123, "\u83dc\u59d0");
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73965);String text = JSON.toJSONString(entity);
        
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73966);ParserConfig config = new ParserConfig();
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73967);config.setAsmEnable(false);
        
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73968);Entity entity2 = JSON.parseObject(text, Entity.class, config, 0);
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73969);Assert.assertEquals(entity.getId(), entity2.getId());
        __CLR4_5_21l2d1l2dlusvne4q.R.inc(73970);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_5_21l2d1l2dlusvne4q.R.flushNeeded();}}

    public static class Entity {

        private final int    id;
        private final String name;

        @JSONCreator
        public Entity(@JSONField(name = "id") int id, @JSONField(name = "name") String name){try{__CLR4_5_21l2d1l2dlusvne4q.R.inc(73971);
            __CLR4_5_21l2d1l2dlusvne4q.R.inc(73972);this.id = id;
            __CLR4_5_21l2d1l2dlusvne4q.R.inc(73973);this.name = name;
        }finally{__CLR4_5_21l2d1l2dlusvne4q.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21l2d1l2dlusvne4q.R.inc(73974);
            __CLR4_5_21l2d1l2dlusvne4q.R.inc(73975);return id;
        }finally{__CLR4_5_21l2d1l2dlusvne4q.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21l2d1l2dlusvne4q.R.inc(73976);
            __CLR4_5_21l2d1l2dlusvne4q.R.inc(73977);return name;
        }finally{__CLR4_5_21l2d1l2dlusvne4q.R.flushNeeded();}}

    }

}
