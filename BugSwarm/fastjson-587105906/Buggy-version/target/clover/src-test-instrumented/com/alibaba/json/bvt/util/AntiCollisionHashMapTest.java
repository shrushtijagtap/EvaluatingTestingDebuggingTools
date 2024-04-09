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

public class AntiCollisionHashMapTest extends TestCase {static class __CLR4_1_101xqd1xqdlusqknda{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101xqd1xqdlusqknda.R.globalSliceStart(getClass().getName(),90373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21xqd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101xqd1xqdlusqknda.R.rethrow($CLV_t2$);}finally{__CLR4_1_101xqd1xqdlusqknda.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.AntiCollisionHashMapTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90373,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21xqd() throws Exception{try{__CLR4_1_101xqd1xqdlusqknda.R.inc(90373);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90374);AntiCollisionHashMap m = new AntiCollisionHashMap(3, 0.75f);

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90375);for (int i = 0; (((i < 100)&&(__CLR4_1_101xqd1xqdlusqknda.R.iget(90376)!=0|true))||(__CLR4_1_101xqd1xqdlusqknda.R.iget(90377)==0&false)); ++i) {{
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90378);m.put(i, i);
        }

        }__CLR4_1_101xqd1xqdlusqknda.R.inc(90379);AntiCollisionHashMap m2 = new AntiCollisionHashMap(m);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90380);assertEquals(m.size(), m2.size());

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90381);AntiCollisionHashMap m3 = new AntiCollisionHashMap(3, 0.75f);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90382);m3.putAll(m);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90383);assertEquals(m.size(), m2.size());

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90384);AntiCollisionHashMap m4 = (AntiCollisionHashMap) m.clone();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90385);m4.hashCode();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90386);m4.size();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90387);m4.isEmpty();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90388);m4.values().iterator();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90389);m4.keySet().iterator();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90390);m4.values().contains(1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90391);m4.values().contains(null);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90392);m4.values().iterator().next();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90393);m4.values().remove(1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90394);m4.values().size();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90395);m4.values().clear();

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90396);AntiCollisionHashMap m5 = (AntiCollisionHashMap) m.clone();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90397);m5.keySet().contains(1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90398);m5.put(1, 1001);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90399);m5.get(null);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90400);Map.Entry entry = (Map.Entry) m5.entrySet().iterator().next();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90401);entry.setValue(1002);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90402);entry.toString();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90403);m5.keySet().size();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90404);m5.keySet().iterator().next();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90405);m5.keySet().remove(1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90406);m5.keySet().clear();

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90407);AntiCollisionHashMap m6 = new AntiCollisionHashMap(3);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90408);m6.putAll(m);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90409);assertEquals(m.size(), m6.size());
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90410);m6.put("a", "a");
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90411);m6.put("b", "b");

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90412);for (int i = 0; (((i < 100)&&(__CLR4_1_101xqd1xqdlusqknda.R.iget(90413)!=0|true))||(__CLR4_1_101xqd1xqdlusqknda.R.iget(90414)==0&false)); ++i) {{
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90415);assertEquals(i, m.get(i));
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90416);assertTrue(m.containsKey(i));
        }

        }__CLR4_1_101xqd1xqdlusqknda.R.inc(90417);for (int i = 0; (((i < 100)&&(__CLR4_1_101xqd1xqdlusqknda.R.iget(90418)!=0|true))||(__CLR4_1_101xqd1xqdlusqknda.R.iget(90419)==0&false)); ++i) {{
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90420);m3.remove(i);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90421);m2.remove(i, i);
        }
        }__CLR4_1_101xqd1xqdlusqknda.R.inc(90422);m2.put(null, null);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90423);m2.put(1, 1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90424);assertTrue(m2.containsKey(null));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90425);assertTrue(m2.containsKey(1));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90426);assertTrue(m2.containsValue(null));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90427);assertTrue(m2.containsValue(1));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90428);Iterator iterator = m2.entrySet().iterator();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90429);while ((((iterator.hasNext())&&(__CLR4_1_101xqd1xqdlusqknda.R.iget(90430)!=0|true))||(__CLR4_1_101xqd1xqdlusqknda.R.iget(90431)==0&false))) {{
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90432);iterator.next();
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90433);iterator.remove();
        }
        }__CLR4_1_101xqd1xqdlusqknda.R.inc(90434);m2.clear();

        __CLR4_1_101xqd1xqdlusqknda.R.inc(90435);assertFalse(m.entrySet().contains(1));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90436);assertTrue(m.entrySet().contains(m.entrySet().iterator().next()));
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90437);m.entrySet().size();
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90438);m.entrySet().remove(1);
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90439);m.entrySet().remove(m.entrySet().iterator().next());
        __CLR4_1_101xqd1xqdlusqknda.R.inc(90440);m.entrySet().clear();

        {
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90441);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90442);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90443);objOut.writeObject(m);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90444);objOut.flush();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90445);byte[] bytes = bytesOut.toByteArray();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90446);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90447);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90448);Object obj = objIn.readObject();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90449);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90450);assertEquals(m, obj);
        }
        {
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90451);ByteArrayOutputStream bytesOut = new ByteArrayOutputStream();
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90452);ObjectOutputStream objOut = new ObjectOutputStream(bytesOut);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90453);objOut.writeObject(m6);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90454);objOut.flush();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90455);byte[] bytes = bytesOut.toByteArray();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90456);ByteArrayInputStream bytesIn = new ByteArrayInputStream(bytes);
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90457);ObjectInputStream objIn = new ObjectInputStream(bytesIn);

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90458);Object obj = objIn.readObject();

            __CLR4_1_101xqd1xqdlusqknda.R.inc(90459);assertEquals(AntiCollisionHashMap.class, obj.getClass());
            __CLR4_1_101xqd1xqdlusqknda.R.inc(90460);assertEquals(m6, obj);
        }
    }finally{__CLR4_1_101xqd1xqdlusqknda.R.flushNeeded();}}
}
