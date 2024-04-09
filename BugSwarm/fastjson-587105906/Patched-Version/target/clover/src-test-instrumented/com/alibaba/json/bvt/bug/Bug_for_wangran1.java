/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import org.junit.Assert;
import junit.framework.TestCase;

public class Bug_for_wangran1 extends TestCase {static class __CLR4_5_216pf16pflusvn7a4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,55385,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_216pf16pflusvn7a4.R.globalSliceStart(getClass().getName(),55347);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp216pf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216pf16pflusvn7a4.R.rethrow($CLV_t2$);}finally{__CLR4_5_216pf16pflusvn7a4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_wangran1.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55347,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp216pf() throws Exception{try{__CLR4_5_216pf16pflusvn7a4.R.inc(55347);
        __CLR4_5_216pf16pflusvn7a4.R.inc(55348);Entity entity = new Entity();
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55349);entity.setId(11);
        __CLR4_5_216pf16pflusvn7a4.R.inc(55350);entity.setName("xx");
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55351);Queue q = new Queue();
        __CLR4_5_216pf16pflusvn7a4.R.inc(55352);q.setId(55);
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55353);entity.getQueue().put(q.getId(), q);
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55354);String text = JSON.toJSONString(entity);
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55355);System.out.println(text);
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55356);Entity entity2 = JSON.parseObject(text, Entity.class);
        
        __CLR4_5_216pf16pflusvn7a4.R.inc(55357);Assert.assertNotNull(entity2.getQueue());
        __CLR4_5_216pf16pflusvn7a4.R.inc(55358);Assert.assertEquals(1, entity2.getQueue().size());
        __CLR4_5_216pf16pflusvn7a4.R.inc(55359);Assert.assertEquals(true, entity2.getQueue().values().iterator().next() instanceof Queue);
    }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

    public static class Entity {

        private int                 id;
        private String              name;

        private Map<Integer, Queue> queue = new HashMap<Integer, Queue>();

        public int getId() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55360);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55361);return id;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55362);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55363);this.id = id;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55364);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55365);return name;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55366);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55367);this.name = name;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public Map<Integer, Queue> getQueue() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55368);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55369);return queue;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setQueue(Map<Integer, Queue> queue) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55370);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55371);this.queue = queue;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public Map<Integer, Queue> getKQueue() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55372);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55373);return queue;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setKQueue(Map<Integer, Queue> queue) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55374);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55375);this.queue = queue;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}
    }

    public static class Queue {
        
        public Queue() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55376);
            
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55377);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55378);return id;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55379);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55380);this.id = id;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55381);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55382);return name;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_216pf16pflusvn7a4.R.inc(55383);
            __CLR4_5_216pf16pflusvn7a4.R.inc(55384);this.name = name;
        }finally{__CLR4_5_216pf16pflusvn7a4.R.flushNeeded();}}

    }
}
