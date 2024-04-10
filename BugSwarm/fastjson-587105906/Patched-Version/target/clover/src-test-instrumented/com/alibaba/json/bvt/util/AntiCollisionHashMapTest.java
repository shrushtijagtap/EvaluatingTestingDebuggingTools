/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.util.AntiCollisionHashMap;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;

public class AntiCollisionHashMapTest extends TestCase {static class __CLR4_5_21xq21xq2lusyjvqz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_21xq21xq2lusyjvqz.R.globalSliceStart(getClass().getName(),90362);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21xq2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xq21xq2lusyjvqz.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xq21xq2lusyjvqz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.AntiCollisionHashMapTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90362,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21xq2() throws Exception{try{__CLR4_5_21xq21xq2lusyjvqz.R.inc(90362);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90363);AntiCollisionHashMap m = new AntiCollisionHashMap(3, 0.75f);

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90364);for (int i = 0; (((i < 100)&&(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90365)!=0|true))||(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90366)==0&false)); ++i) {{
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90367);m.put(i, i);
        }

        }__CLR4_5_21xq21xq2lusyjvqz.R.inc(90368);AntiCollisionHashMap m2 = new AntiCollisionHashMap(m);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90369);assertEquals(m.size(), m2.size());

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90370);AntiCollisionHashMap m3 = new AntiCollisionHashMap(3, 0.75f);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90371);m3.putAll(m);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90372);assertEquals(m.size(), m2.size());

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90373);AntiCollisionHashMap m4 = (AntiCollisionHashMap) m.clone();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90374);m4.hashCode();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90375);m4.size();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90376);m4.isEmpty();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90377);m4.values().iterator();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90378);m4.keySet().iterator();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90379);m4.values().contains(1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90380);m4.values().contains(null);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90381);m4.values().iterator().next();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90382);m4.values().remove(1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90383);m4.values().size();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90384);m4.values().clear();

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90385);AntiCollisionHashMap m5 = (AntiCollisionHashMap) m.clone();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90386);m5.keySet().contains(1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90387);m5.put(1, 1001);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90388);m5.get(null);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90389);Map.Entry entry = (Map.Entry) m5.entrySet().iterator().next();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90390);entry.setValue(1002);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90391);entry.toString();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90392);m5.keySet().size();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90393);m5.keySet().iterator().next();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90394);m5.keySet().remove(1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90395);m5.keySet().clear();

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90396);AntiCollisionHashMap m6 = new AntiCollisionHashMap(3);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90397);m6.putAll(m);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90398);assertEquals(m.size(), m6.size());
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90399);m6.put("a", "a");
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90400);m6.put("b", "b");

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90401);for (int i = 0; (((i < 100)&&(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90402)!=0|true))||(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90403)==0&false)); ++i) {{
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90404);assertEquals(i, m.get(i));
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90405);assertTrue(m.containsKey(i));
        }

        }__CLR4_5_21xq21xq2lusyjvqz.R.inc(90406);for (int i = 0; (((i < 100)&&(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90407)!=0|true))||(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90408)==0&false)); ++i) {{
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90409);m3.remove(i);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90410);m2.remove(i, i);
        }
        }__CLR4_5_21xq21xq2lusyjvqz.R.inc(90411);m2.put(null, null);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90412);m2.put(1, 1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90413);assertTrue(m2.containsKey(null));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90414);assertTrue(m2.containsKey(1));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90415);assertTrue(m2.containsValue(null));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90416);assertTrue(m2.containsValue(1));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90417);Iterator iterator = m2.entrySet().iterator();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90418);while ((((iterator.hasNext())&&(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90419)!=0|true))||(__CLR4_5_21xq21xq2lusyjvqz.R.iget(90420)==0&false))) {{
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90421);iterator.next();
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90422);iterator.remove();
        }
        }__CLR4_5_21xq21xq2lusyjvqz.R.inc(90423);m2.clear();

        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90424);assertFalse(m.entrySet().contains(1));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90425);assertTrue(m.entrySet().contains(m.entrySet().iterator().next()));
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90426);m.entrySet().size();
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90427);m.entrySet().remove(1);
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90428);m.entrySet().remove(m.entrySet().iterator().next());
        __CLR4_5_21xq21xq2lusyjvqz.R.inc(90429);m.entrySet().clear();

        {
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90430);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90431);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90432);objOut.writeObject(m);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90433);objOut.flush();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90434);byte[] bytes = bytesOut.toByteArray();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90435);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90436);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90437);Object obj = objIn.readObject();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90438);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90439);assertEquals(m, obj);
        }
        {
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90440);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90441);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90442);objOut.writeObject(m6);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90443);objOut.flush();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90444);byte[] bytes = bytesOut.toByteArray();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90445);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90446);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90447);Object obj = objIn.readObject();

            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90448);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_5_21xq21xq2lusyjvqz.R.inc(90449);assertEquals(m6, obj);
        }
    }finally{__CLR4_5_21xq21xq2lusyjvqz.R.flushNeeded();}}
}
