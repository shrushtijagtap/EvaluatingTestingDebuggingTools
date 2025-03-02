/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

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

public class ConcurrentHashMapTest6 extends TestCase {static class __CLR4_1_101rxl1rxlluszwewk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82882,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_concurrentHashmap() throws Exception {__CLR4_1_101rxl1rxlluszwewk.R.globalSliceStart(getClass().getName(),82857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mjgu4v1rxl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rxl1rxlluszwewk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rxl1rxlluszwewk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.ConcurrentHashMapTest6.test_concurrentHashmap",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82857,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mjgu4v1rxl() throws Exception{try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82857);
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82858);OffsetSerializeWrapper wrapper = new OffsetSerializeWrapper();
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82859);wrapper.offsetTable.put(new MessageQueue(), new WeakReference<A>(new A(true)));
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82860);String text = JSON.toJSONString(wrapper);
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82861);Assert.assertEquals("{\"offsetTable\":{{\"items\":[]}:{\"value\":true}}}", text);

        __CLR4_1_101rxl1rxlluszwewk.R.inc(82862);OffsetSerializeWrapper wrapper2 = JSON.parseObject(text, OffsetSerializeWrapper.class);
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82863);Assert.assertEquals(1, wrapper2.getOffsetTable().size());

        __CLR4_1_101rxl1rxlluszwewk.R.inc(82864);Iterator<Map.Entry<MessageQueue, WeakReference<A>>> iter = wrapper2.getOffsetTable().entrySet().iterator();
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82865);Map.Entry<MessageQueue, WeakReference<A>> entry = iter.next();
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82866);Assert.assertEquals(0, entry.getKey().getItems().size());
        __CLR4_1_101rxl1rxlluszwewk.R.inc(82867);Assert.assertEquals(true, entry.getValue().get().isValue());
    }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

    public static class OffsetSerializeWrapper {

        private ConcurrentHashMap<MessageQueue, WeakReference<A>> offsetTable = new ConcurrentHashMap<MessageQueue, WeakReference<A>>();

        public ConcurrentHashMap<MessageQueue, WeakReference<A>> getOffsetTable() {try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82868);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82869);return offsetTable;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

        public void setOffsetTable(ConcurrentHashMap<MessageQueue, WeakReference<A>> offsetTable) {try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82870);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82871);this.offsetTable = offsetTable;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

    }

    public static class MessageQueue {

        private List<Serializable> items = new LinkedList<Serializable>();

        public List<Serializable> getItems() {try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82872);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82873);return items;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

    }

    public static class A implements Serializable {

        private boolean value;

        public A(){try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82874);

        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

        public A(boolean value){
            super();__CLR4_1_101rxl1rxlluszwewk.R.inc(82876);try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82875);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82877);this.value = value;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

        public boolean isValue() {try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82878);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82879);return value;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

        public void setValue(boolean value) {try{__CLR4_1_101rxl1rxlluszwewk.R.inc(82880);
            __CLR4_1_101rxl1rxlluszwewk.R.inc(82881);this.value = value;
        }finally{__CLR4_1_101rxl1rxlluszwewk.R.flushNeeded();}}

    }
}
