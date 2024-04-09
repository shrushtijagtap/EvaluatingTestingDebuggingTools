/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.*;


public class Bug_for_Next extends TestCase {static class __CLR4_5_214451445lusvn5vt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52182,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_5_214451445lusvn5vt.R.inc(51989);
        __CLR4_5_214451445lusvn5vt.R.inc(51990);Result result = JUnitCore.runClasses(Bug_for_Next.class);
        __CLR4_5_214451445lusvn5vt.R.inc(51991);for (Failure fail : result.getFailures()) {{
            __CLR4_5_214451445lusvn5vt.R.inc(51992);System.out.println(fail.toString());
        }
        }__CLR4_5_214451445lusvn5vt.R.inc(51993);if ((((result.wasSuccessful())&&(__CLR4_5_214451445lusvn5vt.R.iget(51994)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(51995)==0&false))) {{
            __CLR4_5_214451445lusvn5vt.R.inc(51996);System.out.println("All tests finished successfully...");
        }
    }}finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    public void testPrimitiveArray() throws Exception {__CLR4_5_214451445lusvn5vt.R.globalSliceStart(getClass().getName(),51997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ggs3hn144d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214451445lusvn5vt.R.rethrow($CLV_t2$);}finally{__CLR4_5_214451445lusvn5vt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Next.testPrimitiveArray",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51997,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ggs3hn144d() throws Exception{try{__CLR4_5_214451445lusvn5vt.R.inc(51997);

        __CLR4_5_214451445lusvn5vt.R.inc(51998);showTitle("1=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(51999);String text= JSON.toJSONString("testbytearray".getBytes());
        __CLR4_5_214451445lusvn5vt.R.inc(52000);showMesg("text : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52001);byte[] byteArray = JSON.parseObject(text, byte[].class);
        __CLR4_5_214451445lusvn5vt.R.inc(52002);showMesg("byteArray : " + byteArrayToHexString(byteArray));

        __CLR4_5_214451445lusvn5vt.R.inc(52003);int[][] ii = new int[][]{
                new int[]{ 1, 2, 3},
                new int[]{ 2, 3, 4, 5}
        };

        __CLR4_5_214451445lusvn5vt.R.inc(52004);text = JSON.toJSONString(ii);
        __CLR4_5_214451445lusvn5vt.R.inc(52005);showMesg("text : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52006);int[][] pii = JSON.parseObject(text, int[][].class);
        __CLR4_5_214451445lusvn5vt.R.inc(52007);showMesg("pii : " + Arrays.toString(pii));
        __CLR4_5_214451445lusvn5vt.R.inc(52008);showMesg("pii0 : " + Arrays.toString(pii[0]));
        __CLR4_5_214451445lusvn5vt.R.inc(52009);showMesg("pii1 : " + Arrays.toString(pii[1]));

        __CLR4_5_214451445lusvn5vt.R.inc(52010);showTitle("2=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52011);List<byte[]> blist = new ArrayList<byte[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52012);blist.add("byte[]".getBytes());
        __CLR4_5_214451445lusvn5vt.R.inc(52013);blist.add("blist".getBytes());
        __CLR4_5_214451445lusvn5vt.R.inc(52014);text = JSON.toJSONString(blist);
        __CLR4_5_214451445lusvn5vt.R.inc(52015);showMesg("text : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52016);blist = JSON.parseObject(text, new TypeReference<List<byte[]>>(byte[].class){}.getType());
        __CLR4_5_214451445lusvn5vt.R.inc(52017);showMesg("blist : " + blist);
        __CLR4_5_214451445lusvn5vt.R.inc(52018);showMesg("blist1 : " + byteArrayToHexString(blist.get(0)));
        __CLR4_5_214451445lusvn5vt.R.inc(52019);showMesg("blist2 : " + byteArrayToHexString(blist.get(1)));

        __CLR4_5_214451445lusvn5vt.R.inc(52020);List<char[]> clist = new ArrayList<char[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52021);clist.add(new char[]{'1',',','2'});
        __CLR4_5_214451445lusvn5vt.R.inc(52022);clist.add(new char[]{'2',',','1'});
        __CLR4_5_214451445lusvn5vt.R.inc(52023);text = JSON.toJSONString(clist);
        __CLR4_5_214451445lusvn5vt.R.inc(52024);showMesg("text " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52025);clist = JSON.parseObject(text, new TypeReference<List<char[]>>(char[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52026);showMesg("clist : " + clist);
        __CLR4_5_214451445lusvn5vt.R.inc(52027);showMesg("clist1 : " + Arrays.toString(clist.get(0)));
        __CLR4_5_214451445lusvn5vt.R.inc(52028);showMesg("clist2 : " + Arrays.toString(clist.get(1)));

        __CLR4_5_214451445lusvn5vt.R.inc(52029);List<int[]> ilist = new ArrayList<int[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52030);ilist.add(new int[]{11,22,33});
        __CLR4_5_214451445lusvn5vt.R.inc(52031);ilist.add(new int[]{33,22,11});
        __CLR4_5_214451445lusvn5vt.R.inc(52032);text = JSON.toJSONString(ilist);
        __CLR4_5_214451445lusvn5vt.R.inc(52033);showMesg("text " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52034);ilist = JSON.parseObject(text, new TypeReference<List<int[]>>(int[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52035);showMesg("ilist : " + ilist);
        __CLR4_5_214451445lusvn5vt.R.inc(52036);showMesg("ilist1 : " + Arrays.toString(ilist.get(0)));
        __CLR4_5_214451445lusvn5vt.R.inc(52037);showMesg("ilist2 : " + Arrays.toString(ilist.get(1)));

        __CLR4_5_214451445lusvn5vt.R.inc(52038);List<float[]> flist = new ArrayList<float[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52039);flist.add(new float[]{11.2f,22.3f,33.4f});
        __CLR4_5_214451445lusvn5vt.R.inc(52040);flist.add(new float[]{33.1f,22.2f,11.3f});
        __CLR4_5_214451445lusvn5vt.R.inc(52041);text = JSON.toJSONString(flist);
        __CLR4_5_214451445lusvn5vt.R.inc(52042);showMesg("text " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52043);flist = JSON.parseObject(text, new TypeReference<List<float[]>>(float[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52044);showMesg("flist : " + flist);
        __CLR4_5_214451445lusvn5vt.R.inc(52045);showMesg("flist1 : " + Arrays.toString(flist.get(0)));
        __CLR4_5_214451445lusvn5vt.R.inc(52046);showMesg("flist2 : " + Arrays.toString(flist.get(1)));

        __CLR4_5_214451445lusvn5vt.R.inc(52047);List<int[][]> iilist = new ArrayList<int[][]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52048);iilist.add(new int[][] {
                new int[]{9,6,3},
                new int[]{8,5,2}
        });
        __CLR4_5_214451445lusvn5vt.R.inc(52049);iilist.add(new int[][] {
                new int[]{7,4,1},
                new int[]{0}
        });
        __CLR4_5_214451445lusvn5vt.R.inc(52050);text = JSON.toJSONString(iilist);
        __CLR4_5_214451445lusvn5vt.R.inc(52051);showMesg("text : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52052);iilist = JSON.parseObject(text, new TypeReference<List<int[][]>>(int[][].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52053);showMesg("iilist : " + iilist);
        __CLR4_5_214451445lusvn5vt.R.inc(52054);showMesg("iilist1 : " + Arrays.toString(iilist.get(0)[0]));
        __CLR4_5_214451445lusvn5vt.R.inc(52055);showMesg("iilist2 : " + Arrays.toString(iilist.get(1)[0]));

        __CLR4_5_214451445lusvn5vt.R.inc(52056);showTitle("3=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52057);Map<String, byte[]> sbmap = new HashMap<String, byte[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52058);sbmap.put("key1", "key1".getBytes());
        __CLR4_5_214451445lusvn5vt.R.inc(52059);sbmap.put("key2", "key2".getBytes());
        __CLR4_5_214451445lusvn5vt.R.inc(52060);text = JSON.toJSONString(sbmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52061);showMesg("sbmap : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52062);sbmap = JSON.parseObject(text, new TypeReference<Map<String, byte[]>>(String.class, byte[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52063);showMesg("sbmap : " + sbmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52064);showMesg("sbmap key1 : " + byteArrayToHexString(sbmap.get("key1")));
        __CLR4_5_214451445lusvn5vt.R.inc(52065);showMesg("sbmap key2 : " + byteArrayToHexString(sbmap.get("key2")));

        __CLR4_5_214451445lusvn5vt.R.inc(52066);showTitle("4=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52067);Map<String, Byte[]> sbcmap = new HashMap<String, Byte[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52068);sbcmap.put("key1", new Byte[]{ 1, 2, 3 });
        __CLR4_5_214451445lusvn5vt.R.inc(52069);sbcmap.put("key2", new Byte[]{ 3, 2, 1 });
        __CLR4_5_214451445lusvn5vt.R.inc(52070);text = JSON.toJSONString(sbcmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52071);showMesg("sbcmap json : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52072);sbcmap = JSON.parseObject(text, new TypeReference<Map<String, Byte[]>>(String.class, Byte[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52073);showMesg("sbcmap : " + sbcmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52074);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key1")));
        __CLR4_5_214451445lusvn5vt.R.inc(52075);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key2")));

        __CLR4_5_214451445lusvn5vt.R.inc(52076);showTitle("5=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52077);int[] intArray = new int[]{ 11, 22, 33 };
        __CLR4_5_214451445lusvn5vt.R.inc(52078);text = JSON.toJSONString(intArray);
        __CLR4_5_214451445lusvn5vt.R.inc(52079);showMesg("intArray json : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52080);intArray = JSON.parseObject(text, int[].class);
        __CLR4_5_214451445lusvn5vt.R.inc(52081);showMesg("intArray : " + Arrays.toString(intArray));

        __CLR4_5_214451445lusvn5vt.R.inc(52082);showTitle("6=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52083);Map<String, int[]> simap = new HashMap<String, int[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52084);simap.put("key1", new int[]{ 11, 22, 33 });
        __CLR4_5_214451445lusvn5vt.R.inc(52085);simap.put("key2", new int[]{ 33, 22, 11 });
        __CLR4_5_214451445lusvn5vt.R.inc(52086);text = JSON.toJSONString(simap, SerializerFeature.WriteClassName);
        __CLR4_5_214451445lusvn5vt.R.inc(52087);showMesg("simap json : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52088);simap = JSON.parseObject(text, new TypeReference<Map<String, int[]>>(String.class, int[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52089);showMesg("simap : " + simap);
        __CLR4_5_214451445lusvn5vt.R.inc(52090);showMesg("simap key1 : " + Arrays.toString(simap.get("key1")));
        __CLR4_5_214451445lusvn5vt.R.inc(52091);showMesg("simap key1 : " + Arrays.toString(simap.get("key2")));

        __CLR4_5_214451445lusvn5vt.R.inc(52092);showTitle("7=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52093);Map<String, Integer[]> sicmap = new HashMap<String, Integer[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52094);sicmap.put("key1", new Integer[]{ 12, 23, 34 });
        __CLR4_5_214451445lusvn5vt.R.inc(52095);sicmap.put("key2", new Integer[]{ 34, 23, 12 });
        __CLR4_5_214451445lusvn5vt.R.inc(52096);text = JSON.toJSONString(sicmap, SerializerFeature.WriteClassName);
        __CLR4_5_214451445lusvn5vt.R.inc(52097);showMesg("sicmap json : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52098);sicmap = JSON.parseObject(text, new TypeReference<Map<String, Integer[]>>(String.class, Integer[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52099);showMesg("sicmap : " + sicmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52100);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key1")));
        __CLR4_5_214451445lusvn5vt.R.inc(52101);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key2")));

        __CLR4_5_214451445lusvn5vt.R.inc(52102);showTitle("8=====================================");
        __CLR4_5_214451445lusvn5vt.R.inc(52103);HashMap<byte[], String> bsmap = new HashMap<byte[], String>();
        __CLR4_5_214451445lusvn5vt.R.inc(52104);bsmap.put("testbytearray".getBytes(), "testbytearray");
        __CLR4_5_214451445lusvn5vt.R.inc(52105);bsmap.put(new byte[] { 0, 1, 2}, "012");
        __CLR4_5_214451445lusvn5vt.R.inc(52106);text = JSON.toJSONString(bsmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52107);showMesg("text : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52108);bsmap = JSON.parseObject(text, new TypeReference<Map<byte[], String>>(byte[].class, String.class){}.getType());
        __CLR4_5_214451445lusvn5vt.R.inc(52109);showMesg("bsmap : " + bsmap);

        __CLR4_5_214451445lusvn5vt.R.inc(52110);Iterator<byte[]> it = bsmap.keySet().iterator();
        __CLR4_5_214451445lusvn5vt.R.inc(52111);int i = 0;
        __CLR4_5_214451445lusvn5vt.R.inc(52112);while ((((it.hasNext())&&(__CLR4_5_214451445lusvn5vt.R.iget(52113)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52114)==0&false))) {{
            __CLR4_5_214451445lusvn5vt.R.inc(52115);byte[] bs = it.next();
            __CLR4_5_214451445lusvn5vt.R.inc(52116);showMesg("bsmap key" + i++ + " : " + byteArrayToHexString(bs));
        }

        }__CLR4_5_214451445lusvn5vt.R.inc(52117);Map<String, TestBean[]> stmap = new HashMap<String, TestBean[]>();
        __CLR4_5_214451445lusvn5vt.R.inc(52118);stmap.put("key1", new TestBean[]{ new TestBean(), new TestBean()});
        __CLR4_5_214451445lusvn5vt.R.inc(52119);stmap.put("key2", new TestBean[]{ new TestBean(), new TestBean(), new TestBean()});
        __CLR4_5_214451445lusvn5vt.R.inc(52120);text = JSON.toJSONString(stmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52121);showMesg("stmap json : " + text);
        __CLR4_5_214451445lusvn5vt.R.inc(52122);stmap = JSON.parseObject(text, new TypeReference<Map<String, TestBean[]>>(String.class, TestBean[].class){});
        __CLR4_5_214451445lusvn5vt.R.inc(52123);showMesg("stmap : " + stmap);
        __CLR4_5_214451445lusvn5vt.R.inc(52124);showMesg("key1 : " + Arrays.toString(stmap.get("key1")));
        __CLR4_5_214451445lusvn5vt.R.inc(52125);showMesg("key2 : " + Arrays.toString(stmap.get("key2")));

    }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    private void showTitle(String title) {try{__CLR4_5_214451445lusvn5vt.R.inc(52126);
        __CLR4_5_214451445lusvn5vt.R.inc(52127);System.out.println("test " + title);
    }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    private void showMesg(String mesg) {try{__CLR4_5_214451445lusvn5vt.R.inc(52128);
        __CLR4_5_214451445lusvn5vt.R.inc(52129);System.out.println("  " + mesg);
    }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data) {try{__CLR4_5_214451445lusvn5vt.R.inc(52130);
        __CLR4_5_214451445lusvn5vt.R.inc(52131);return byteArrayToHexString(data, 0, data.length);
    }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data, int offest, int len) {try{__CLR4_5_214451445lusvn5vt.R.inc(52132);
        __CLR4_5_214451445lusvn5vt.R.inc(52133);if ((((data == null)&&(__CLR4_5_214451445lusvn5vt.R.iget(52134)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52135)==0&false))) {{
            __CLR4_5_214451445lusvn5vt.R.inc(52136);return "";
        }

        }__CLR4_5_214451445lusvn5vt.R.inc(52137);StringBuilder sb = new StringBuilder();

        __CLR4_5_214451445lusvn5vt.R.inc(52138);if((((offest < 0 || offest > data.length)&&(__CLR4_5_214451445lusvn5vt.R.iget(52139)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52140)==0&false))){{
            __CLR4_5_214451445lusvn5vt.R.inc(52141);offest = 0;
        }

        }__CLR4_5_214451445lusvn5vt.R.inc(52142);int total = Math.min(len, data.length);

        __CLR4_5_214451445lusvn5vt.R.inc(52143);int index = offest;

        __CLR4_5_214451445lusvn5vt.R.inc(52144);while ((((total > 0)&&(__CLR4_5_214451445lusvn5vt.R.iget(52145)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52146)==0&false))) {{
            __CLR4_5_214451445lusvn5vt.R.inc(52147);if ((((total >= 16)&&(__CLR4_5_214451445lusvn5vt.R.iget(52148)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52149)==0&false))) {{
                __CLR4_5_214451445lusvn5vt.R.inc(52150);sb.append(String.format("%02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x ",
                        data[index], data[index + 1], data[index + 2],
                        data[index + 3], data[index + 4],
                        data[index + 5], data[index + 6],
                        data[index + 7], data[index + 8],
                        data[index + 9], data[index + 10],
                        data[index + 11], data[index + 12],
                        data[index + 13], data[index + 14],
                        data[index + 15]));
                __CLR4_5_214451445lusvn5vt.R.inc(52151);index += 16;
                __CLR4_5_214451445lusvn5vt.R.inc(52152);total -= 16;
            } }else {{
                __CLR4_5_214451445lusvn5vt.R.inc(52153);for (int i = 0; (((i < total)&&(__CLR4_5_214451445lusvn5vt.R.iget(52154)!=0|true))||(__CLR4_5_214451445lusvn5vt.R.iget(52155)==0&false)); i++) {{
                    __CLR4_5_214451445lusvn5vt.R.inc(52156);sb.append(String.format("%02x ", data[index]));
                    __CLR4_5_214451445lusvn5vt.R.inc(52157);index++;
                }
                }__CLR4_5_214451445lusvn5vt.R.inc(52158);total = 0;
            }
        }}

        }__CLR4_5_214451445lusvn5vt.R.inc(52159);return sb.toString();
    }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

    static class TestBean {
        byte b;
        byte[] bs = "bs".getBytes();
        int i;
        int[] is = new int[]{ 753, 159 };
        String s;

        public byte getB() {try{__CLR4_5_214451445lusvn5vt.R.inc(52160);
            __CLR4_5_214451445lusvn5vt.R.inc(52161);return b;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public void setB(byte b) {try{__CLR4_5_214451445lusvn5vt.R.inc(52162);
            __CLR4_5_214451445lusvn5vt.R.inc(52163);this.b = b;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public byte[] getBs() {try{__CLR4_5_214451445lusvn5vt.R.inc(52164);
            __CLR4_5_214451445lusvn5vt.R.inc(52165);return bs;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public void setBs(byte[] bs) {try{__CLR4_5_214451445lusvn5vt.R.inc(52166);
            __CLR4_5_214451445lusvn5vt.R.inc(52167);this.bs = bs;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public int getI() {try{__CLR4_5_214451445lusvn5vt.R.inc(52168);
            __CLR4_5_214451445lusvn5vt.R.inc(52169);return i;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public void setI(int i) {try{__CLR4_5_214451445lusvn5vt.R.inc(52170);
            __CLR4_5_214451445lusvn5vt.R.inc(52171);this.i = i;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public int[] getIs() {try{__CLR4_5_214451445lusvn5vt.R.inc(52172);
            __CLR4_5_214451445lusvn5vt.R.inc(52173);return is;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public void setIs(int[] is) {try{__CLR4_5_214451445lusvn5vt.R.inc(52174);
            __CLR4_5_214451445lusvn5vt.R.inc(52175);this.is = is;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public String getS() {try{__CLR4_5_214451445lusvn5vt.R.inc(52176);
            __CLR4_5_214451445lusvn5vt.R.inc(52177);return s;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        public void setS(String s) {try{__CLR4_5_214451445lusvn5vt.R.inc(52178);
            __CLR4_5_214451445lusvn5vt.R.inc(52179);this.s = s;
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_214451445lusvn5vt.R.inc(52180);
            __CLR4_5_214451445lusvn5vt.R.inc(52181);return "TestBean{" +
                    "b=" + b +
                    ", bs=" + Arrays.toString(bs) +
                    ", i=" + i +
                    ", is=" + Arrays.toString(is) +
                    ", s='" + s + '\'' +
                    '}';
        }finally{__CLR4_5_214451445lusvn5vt.R.flushNeeded();}}
    }
}
