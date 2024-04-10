/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.AntiCollisionHashMap;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;

public class AntiCollisionHashMapTest extends TestCase {static class __CLR4_1_101yol1yolluszwg4m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91693,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101yol1yolluszwg4m.R.globalSliceStart(getClass().getName(),91605);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21yol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yol1yolluszwg4m.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yol1yolluszwg4m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.AntiCollisionHashMapTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91605,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21yol() throws Exception{try{__CLR4_1_101yol1yolluszwg4m.R.inc(91605);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91606);AntiCollisionHashMap m = new AntiCollisionHashMap(3, 0.75f);

        __CLR4_1_101yol1yolluszwg4m.R.inc(91607);for (int i = 0; (((i < 100)&&(__CLR4_1_101yol1yolluszwg4m.R.iget(91608)!=0|true))||(__CLR4_1_101yol1yolluszwg4m.R.iget(91609)==0&false)); ++i) {{
            __CLR4_1_101yol1yolluszwg4m.R.inc(91610);m.put(i, i);
        }

        }__CLR4_1_101yol1yolluszwg4m.R.inc(91611);AntiCollisionHashMap m2 = new AntiCollisionHashMap(m);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91612);assertEquals(m.size(), m2.size());

        __CLR4_1_101yol1yolluszwg4m.R.inc(91613);AntiCollisionHashMap m3 = new AntiCollisionHashMap(3, 0.75f);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91614);m3.putAll(m);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91615);assertEquals(m.size(), m2.size());

        __CLR4_1_101yol1yolluszwg4m.R.inc(91616);AntiCollisionHashMap m4 = (AntiCollisionHashMap) m.clone();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91617);m4.hashCode();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91618);m4.size();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91619);m4.isEmpty();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91620);m4.values().iterator();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91621);m4.keySet().iterator();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91622);m4.values().contains(1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91623);m4.values().contains(null);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91624);m4.values().iterator().next();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91625);m4.values().remove(1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91626);m4.values().size();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91627);m4.values().clear();

        __CLR4_1_101yol1yolluszwg4m.R.inc(91628);AntiCollisionHashMap m5 = (AntiCollisionHashMap) m.clone();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91629);m5.keySet().contains(1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91630);m5.put(1, 1001);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91631);m5.get(null);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91632);Map.Entry entry = (Map.Entry) m5.entrySet().iterator().next();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91633);entry.setValue(1002);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91634);entry.toString();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91635);m5.keySet().size();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91636);m5.keySet().iterator().next();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91637);m5.keySet().remove(1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91638);m5.keySet().clear();

        __CLR4_1_101yol1yolluszwg4m.R.inc(91639);AntiCollisionHashMap m6 = new AntiCollisionHashMap(3);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91640);m6.putAll(m);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91641);assertEquals(m.size(), m6.size());
        __CLR4_1_101yol1yolluszwg4m.R.inc(91642);m6.put("a", "a");
        __CLR4_1_101yol1yolluszwg4m.R.inc(91643);m6.put("b", "b");

        __CLR4_1_101yol1yolluszwg4m.R.inc(91644);for (int i = 0; (((i < 100)&&(__CLR4_1_101yol1yolluszwg4m.R.iget(91645)!=0|true))||(__CLR4_1_101yol1yolluszwg4m.R.iget(91646)==0&false)); ++i) {{
            __CLR4_1_101yol1yolluszwg4m.R.inc(91647);assertEquals(i, m.get(i));
            __CLR4_1_101yol1yolluszwg4m.R.inc(91648);assertTrue(m.containsKey(i));
        }

        }__CLR4_1_101yol1yolluszwg4m.R.inc(91649);for (int i = 0; (((i < 100)&&(__CLR4_1_101yol1yolluszwg4m.R.iget(91650)!=0|true))||(__CLR4_1_101yol1yolluszwg4m.R.iget(91651)==0&false)); ++i) {{
            __CLR4_1_101yol1yolluszwg4m.R.inc(91652);m3.remove(i);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91653);m2.remove(i, i);
        }
        }__CLR4_1_101yol1yolluszwg4m.R.inc(91654);m2.put(null, null);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91655);m2.put(1, 1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91656);assertTrue(m2.containsKey(null));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91657);assertTrue(m2.containsKey(1));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91658);assertTrue(m2.containsValue(null));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91659);assertTrue(m2.containsValue(1));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91660);Iterator iterator = m2.entrySet().iterator();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91661);while ((((iterator.hasNext())&&(__CLR4_1_101yol1yolluszwg4m.R.iget(91662)!=0|true))||(__CLR4_1_101yol1yolluszwg4m.R.iget(91663)==0&false))) {{
            __CLR4_1_101yol1yolluszwg4m.R.inc(91664);iterator.next();
            __CLR4_1_101yol1yolluszwg4m.R.inc(91665);iterator.remove();
        }
        }__CLR4_1_101yol1yolluszwg4m.R.inc(91666);m2.clear();

        __CLR4_1_101yol1yolluszwg4m.R.inc(91667);assertFalse(m.entrySet().contains(1));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91668);assertTrue(m.entrySet().contains(m.entrySet().iterator().next()));
        __CLR4_1_101yol1yolluszwg4m.R.inc(91669);m.entrySet().size();
        __CLR4_1_101yol1yolluszwg4m.R.inc(91670);m.entrySet().remove(1);
        __CLR4_1_101yol1yolluszwg4m.R.inc(91671);m.entrySet().remove(m.entrySet().iterator().next());
        __CLR4_1_101yol1yolluszwg4m.R.inc(91672);m.entrySet().clear();

        {
            __CLR4_1_101yol1yolluszwg4m.R.inc(91673);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_1_101yol1yolluszwg4m.R.inc(91674);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91675);objOut.writeObject(m);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91676);objOut.flush();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91677);byte[] bytes = bytesOut.toByteArray();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91678);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91679);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_1_101yol1yolluszwg4m.R.inc(91680);Object obj = objIn.readObject();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91681);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_1_101yol1yolluszwg4m.R.inc(91682);assertEquals(m, obj);
        }
        {
            __CLR4_1_101yol1yolluszwg4m.R.inc(91683);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_1_101yol1yolluszwg4m.R.inc(91684);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91685);objOut.writeObject(m6);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91686);objOut.flush();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91687);byte[] bytes = bytesOut.toByteArray();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91688);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_1_101yol1yolluszwg4m.R.inc(91689);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_1_101yol1yolluszwg4m.R.inc(91690);Object obj = objIn.readObject();

            __CLR4_1_101yol1yolluszwg4m.R.inc(91691);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_1_101yol1yolluszwg4m.R.inc(91692);assertEquals(m6, obj);
        }
    }finally{__CLR4_1_101yol1yolluszwg4m.R.flushNeeded();}}
}
