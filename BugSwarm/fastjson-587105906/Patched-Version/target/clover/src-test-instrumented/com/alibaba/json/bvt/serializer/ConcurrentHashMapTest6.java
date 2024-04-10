/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class ConcurrentHashMapTest6 extends TestCase {static class __CLR4_5_21qz21qz2lusyjutq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,81639,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_concurrentHashmap() throws Exception {__CLR4_5_21qz21qz2lusyjutq.R.globalSliceStart(getClass().getName(),81614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mjgu4v1qz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qz21qz2lusyjutq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qz21qz2lusyjutq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ConcurrentHashMapTest6.test_concurrentHashmap",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mjgu4v1qz2() throws Exception{try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81614);
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81615);OffsetSerializeWrapper wrapper = new OffsetSerializeWrapper();
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81616);wrapper.offsetTable.put(new MessageQueue(), new WeakReference<A>(new A(true)));
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81617);String text = JSON.toJSONString(wrapper);
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81618);Assert.assertEquals("{\"offsetTable\":{{\"items\":[]}:{\"value\":true}}}", text);

        __CLR4_5_21qz21qz2lusyjutq.R.inc(81619);OffsetSerializeWrapper wrapper2 = JSON.parseObject(text, OffsetSerializeWrapper.class);
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81620);Assert.assertEquals(1, wrapper2.getOffsetTable().size());

        __CLR4_5_21qz21qz2lusyjutq.R.inc(81621);Iterator<Map.Entry<MessageQueue, WeakReference<A>>> iter = wrapper2.getOffsetTable().entrySet().iterator();
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81622);Map.Entry<MessageQueue, WeakReference<A>> entry = iter.next();
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81623);Assert.assertEquals(0, entry.getKey().getItems().size());
        __CLR4_5_21qz21qz2lusyjutq.R.inc(81624);Assert.assertEquals(true, entry.getValue().get().isValue());
    }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

    public static class OffsetSerializeWrapper {

        private ConcurrentHashMap<MessageQueue, WeakReference<A>> offsetTable = new ConcurrentHashMap<MessageQueue, WeakReference<A>>();

        public ConcurrentHashMap<MessageQueue, WeakReference<A>> getOffsetTable() {try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81625);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81626);return offsetTable;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

        public void setOffsetTable(ConcurrentHashMap<MessageQueue, WeakReference<A>> offsetTable) {try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81627);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81628);this.offsetTable = offsetTable;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

    }

    public static class MessageQueue {

        private List<Serializable> items = new LinkedList<Serializable>();

        public List<Serializable> getItems() {try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81629);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81630);return items;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

    }

    public static class A implements Serializable {

        private boolean value;

        public A(){try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81631);

        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

        public A(boolean value){
            super();__CLR4_5_21qz21qz2lusyjutq.R.inc(81633);try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81632);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81634);this.value = value;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

        public boolean isValue() {try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81635);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81636);return value;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_5_21qz21qz2lusyjutq.R.inc(81637);
            __CLR4_5_21qz21qz2lusyjutq.R.inc(81638);this.value = value;
        }finally{__CLR4_5_21qz21qz2lusyjutq.R.flushNeeded();}}

    }
}
