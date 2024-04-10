/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.creator;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;

public class JSONCreatorTest extends TestCase {static class __CLR4_1_101l2o1l2oluszwd87{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,73989,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_create() throws Exception {__CLR4_1_101l2o1l2oluszwd87.R.globalSliceStart(getClass().getName(),73968);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nw1awg1l2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l2o1l2oluszwd87.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l2o1l2oluszwd87.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest.test_create",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73968,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nw1awg1l2o() throws Exception{try{__CLR4_1_101l2o1l2oluszwd87.R.inc(73968);
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73969);Entity entity = new Entity(123, "\u83dc\u59d0");
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73970);String text = JSON.toJSONString(entity);
        
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73971);Entity entity2 = JSON.parseObject(text, Entity.class);
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73972);Assert.assertEquals(entity.getId(), entity2.getId());
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73973);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_1_101l2o1l2oluszwd87.R.flushNeeded();}}
    
    public void test_create_2() throws Exception {__CLR4_1_101l2o1l2oluszwd87.R.globalSliceStart(getClass().getName(),73974);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mn6j5v1l2u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101l2o1l2oluszwd87.R.rethrow($CLV_t2$);}finally{__CLR4_1_101l2o1l2oluszwd87.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.creator.JSONCreatorTest.test_create_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),73974,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mn6j5v1l2u() throws Exception{try{__CLR4_1_101l2o1l2oluszwd87.R.inc(73974);
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73975);Entity entity = new Entity(123, "\u83dc\u59d0");
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73976);String text = JSON.toJSONString(entity);
        
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73977);ParserConfig config = new ParserConfig();
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73978);config.setAsmEnable(false);
        
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73979);Entity entity2 = JSON.parseObject(text, Entity.class, config, 0);
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73980);Assert.assertEquals(entity.getId(), entity2.getId());
        __CLR4_1_101l2o1l2oluszwd87.R.inc(73981);Assert.assertEquals(entity.getName(), entity2.getName());
    }finally{__CLR4_1_101l2o1l2oluszwd87.R.flushNeeded();}}

    public static class Entity {

        private final int    id;
        private final String name;

        @JSONCreator
        public Entity(@JSONField(name = "id") int id, @JSONField(name = "name") String name){try{__CLR4_1_101l2o1l2oluszwd87.R.inc(73982);
            __CLR4_1_101l2o1l2oluszwd87.R.inc(73983);this.id = id;
            __CLR4_1_101l2o1l2oluszwd87.R.inc(73984);this.name = name;
        }finally{__CLR4_1_101l2o1l2oluszwd87.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101l2o1l2oluszwd87.R.inc(73985);
            __CLR4_1_101l2o1l2oluszwd87.R.inc(73986);return id;
        }finally{__CLR4_1_101l2o1l2oluszwd87.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101l2o1l2oluszwd87.R.inc(73987);
            __CLR4_1_101l2o1l2oluszwd87.R.inc(73988);return name;
        }finally{__CLR4_1_101l2o1l2oluszwd87.R.flushNeeded();}}

    }

}
