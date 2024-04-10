/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.*;


public class Bug_for_Next extends TestCase {static class __CLR4_1_10144g144gluszw7vq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,52193,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_1_10144g144gluszw7vq.R.inc(52000);
        __CLR4_1_10144g144gluszw7vq.R.inc(52001);Result result = JUnitCore.runClasses(Bug_for_Next.class);
        __CLR4_1_10144g144gluszw7vq.R.inc(52002);for (Failure fail : result.getFailures()) {{
            __CLR4_1_10144g144gluszw7vq.R.inc(52003);System.out.println(fail.toString());
        }
        }__CLR4_1_10144g144gluszw7vq.R.inc(52004);if ((((result.wasSuccessful())&&(__CLR4_1_10144g144gluszw7vq.R.iget(52005)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52006)==0&false))) {{
            __CLR4_1_10144g144gluszw7vq.R.inc(52007);System.out.println("All tests finished successfully...");
        }
    }}finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    public void testPrimitiveArray() throws Exception {__CLR4_1_10144g144gluszw7vq.R.globalSliceStart(getClass().getName(),52008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ggs3hn144o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10144g144gluszw7vq.R.rethrow($CLV_t2$);}finally{__CLR4_1_10144g144gluszw7vq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Next.testPrimitiveArray",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),52008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ggs3hn144o() throws Exception{try{__CLR4_1_10144g144gluszw7vq.R.inc(52008);

        __CLR4_1_10144g144gluszw7vq.R.inc(52009);showTitle("1=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52010);String text= JSON.toJSONString("testbytearray".getBytes());
        __CLR4_1_10144g144gluszw7vq.R.inc(52011);showMesg("text : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52012);byte[] byteArray = JSON.parseObject(text, byte[].class);
        __CLR4_1_10144g144gluszw7vq.R.inc(52013);showMesg("byteArray : " + byteArrayToHexString(byteArray));

        __CLR4_1_10144g144gluszw7vq.R.inc(52014);int[][] ii = new int[][]{
                new int[]{ 1, 2, 3},
                new int[]{ 2, 3, 4, 5}
        };

        __CLR4_1_10144g144gluszw7vq.R.inc(52015);text = JSON.toJSONString(ii);
        __CLR4_1_10144g144gluszw7vq.R.inc(52016);showMesg("text : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52017);int[][] pii = JSON.parseObject(text, int[][].class);
        __CLR4_1_10144g144gluszw7vq.R.inc(52018);showMesg("pii : " + Arrays.toString(pii));
        __CLR4_1_10144g144gluszw7vq.R.inc(52019);showMesg("pii0 : " + Arrays.toString(pii[0]));
        __CLR4_1_10144g144gluszw7vq.R.inc(52020);showMesg("pii1 : " + Arrays.toString(pii[1]));

        __CLR4_1_10144g144gluszw7vq.R.inc(52021);showTitle("2=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52022);List<byte[]> blist = new ArrayList<byte[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52023);blist.add("byte[]".getBytes());
        __CLR4_1_10144g144gluszw7vq.R.inc(52024);blist.add("blist".getBytes());
        __CLR4_1_10144g144gluszw7vq.R.inc(52025);text = JSON.toJSONString(blist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52026);showMesg("text : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52027);blist = JSON.parseObject(text, new TypeReference<List<byte[]>>(byte[].class){}.getType());
        __CLR4_1_10144g144gluszw7vq.R.inc(52028);showMesg("blist : " + blist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52029);showMesg("blist1 : " + byteArrayToHexString(blist.get(0)));
        __CLR4_1_10144g144gluszw7vq.R.inc(52030);showMesg("blist2 : " + byteArrayToHexString(blist.get(1)));

        __CLR4_1_10144g144gluszw7vq.R.inc(52031);List<char[]> clist = new ArrayList<char[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52032);clist.add(new char[]{'1',',','2'});
        __CLR4_1_10144g144gluszw7vq.R.inc(52033);clist.add(new char[]{'2',',','1'});
        __CLR4_1_10144g144gluszw7vq.R.inc(52034);text = JSON.toJSONString(clist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52035);showMesg("text " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52036);clist = JSON.parseObject(text, new TypeReference<List<char[]>>(char[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52037);showMesg("clist : " + clist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52038);showMesg("clist1 : " + Arrays.toString(clist.get(0)));
        __CLR4_1_10144g144gluszw7vq.R.inc(52039);showMesg("clist2 : " + Arrays.toString(clist.get(1)));

        __CLR4_1_10144g144gluszw7vq.R.inc(52040);List<int[]> ilist = new ArrayList<int[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52041);ilist.add(new int[]{11,22,33});
        __CLR4_1_10144g144gluszw7vq.R.inc(52042);ilist.add(new int[]{33,22,11});
        __CLR4_1_10144g144gluszw7vq.R.inc(52043);text = JSON.toJSONString(ilist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52044);showMesg("text " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52045);ilist = JSON.parseObject(text, new TypeReference<List<int[]>>(int[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52046);showMesg("ilist : " + ilist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52047);showMesg("ilist1 : " + Arrays.toString(ilist.get(0)));
        __CLR4_1_10144g144gluszw7vq.R.inc(52048);showMesg("ilist2 : " + Arrays.toString(ilist.get(1)));

        __CLR4_1_10144g144gluszw7vq.R.inc(52049);List<float[]> flist = new ArrayList<float[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52050);flist.add(new float[]{11.2f,22.3f,33.4f});
        __CLR4_1_10144g144gluszw7vq.R.inc(52051);flist.add(new float[]{33.1f,22.2f,11.3f});
        __CLR4_1_10144g144gluszw7vq.R.inc(52052);text = JSON.toJSONString(flist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52053);showMesg("text " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52054);flist = JSON.parseObject(text, new TypeReference<List<float[]>>(float[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52055);showMesg("flist : " + flist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52056);showMesg("flist1 : " + Arrays.toString(flist.get(0)));
        __CLR4_1_10144g144gluszw7vq.R.inc(52057);showMesg("flist2 : " + Arrays.toString(flist.get(1)));

        __CLR4_1_10144g144gluszw7vq.R.inc(52058);List<int[][]> iilist = new ArrayList<int[][]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52059);iilist.add(new int[][] {
                new int[]{9,6,3},
                new int[]{8,5,2}
        });
        __CLR4_1_10144g144gluszw7vq.R.inc(52060);iilist.add(new int[][] {
                new int[]{7,4,1},
                new int[]{0}
        });
        __CLR4_1_10144g144gluszw7vq.R.inc(52061);text = JSON.toJSONString(iilist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52062);showMesg("text : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52063);iilist = JSON.parseObject(text, new TypeReference<List<int[][]>>(int[][].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52064);showMesg("iilist : " + iilist);
        __CLR4_1_10144g144gluszw7vq.R.inc(52065);showMesg("iilist1 : " + Arrays.toString(iilist.get(0)[0]));
        __CLR4_1_10144g144gluszw7vq.R.inc(52066);showMesg("iilist2 : " + Arrays.toString(iilist.get(1)[0]));

        __CLR4_1_10144g144gluszw7vq.R.inc(52067);showTitle("3=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52068);Map<String, byte[]> sbmap = new HashMap<String, byte[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52069);sbmap.put("key1", "key1".getBytes());
        __CLR4_1_10144g144gluszw7vq.R.inc(52070);sbmap.put("key2", "key2".getBytes());
        __CLR4_1_10144g144gluszw7vq.R.inc(52071);text = JSON.toJSONString(sbmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52072);showMesg("sbmap : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52073);sbmap = JSON.parseObject(text, new TypeReference<Map<String, byte[]>>(String.class, byte[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52074);showMesg("sbmap : " + sbmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52075);showMesg("sbmap key1 : " + byteArrayToHexString(sbmap.get("key1")));
        __CLR4_1_10144g144gluszw7vq.R.inc(52076);showMesg("sbmap key2 : " + byteArrayToHexString(sbmap.get("key2")));

        __CLR4_1_10144g144gluszw7vq.R.inc(52077);showTitle("4=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52078);Map<String, Byte[]> sbcmap = new HashMap<String, Byte[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52079);sbcmap.put("key1", new Byte[]{ 1, 2, 3 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52080);sbcmap.put("key2", new Byte[]{ 3, 2, 1 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52081);text = JSON.toJSONString(sbcmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52082);showMesg("sbcmap json : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52083);sbcmap = JSON.parseObject(text, new TypeReference<Map<String, Byte[]>>(String.class, Byte[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52084);showMesg("sbcmap : " + sbcmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52085);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key1")));
        __CLR4_1_10144g144gluszw7vq.R.inc(52086);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key2")));

        __CLR4_1_10144g144gluszw7vq.R.inc(52087);showTitle("5=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52088);int[] intArray = new int[]{ 11, 22, 33 };
        __CLR4_1_10144g144gluszw7vq.R.inc(52089);text = JSON.toJSONString(intArray);
        __CLR4_1_10144g144gluszw7vq.R.inc(52090);showMesg("intArray json : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52091);intArray = JSON.parseObject(text, int[].class);
        __CLR4_1_10144g144gluszw7vq.R.inc(52092);showMesg("intArray : " + Arrays.toString(intArray));

        __CLR4_1_10144g144gluszw7vq.R.inc(52093);showTitle("6=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52094);Map<String, int[]> simap = new HashMap<String, int[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52095);simap.put("key1", new int[]{ 11, 22, 33 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52096);simap.put("key2", new int[]{ 33, 22, 11 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52097);text = JSON.toJSONString(simap, SerializerFeature.WriteClassName);
        __CLR4_1_10144g144gluszw7vq.R.inc(52098);showMesg("simap json : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52099);simap = JSON.parseObject(text, new TypeReference<Map<String, int[]>>(String.class, int[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52100);showMesg("simap : " + simap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52101);showMesg("simap key1 : " + Arrays.toString(simap.get("key1")));
        __CLR4_1_10144g144gluszw7vq.R.inc(52102);showMesg("simap key1 : " + Arrays.toString(simap.get("key2")));

        __CLR4_1_10144g144gluszw7vq.R.inc(52103);showTitle("7=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52104);Map<String, Integer[]> sicmap = new HashMap<String, Integer[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52105);sicmap.put("key1", new Integer[]{ 12, 23, 34 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52106);sicmap.put("key2", new Integer[]{ 34, 23, 12 });
        __CLR4_1_10144g144gluszw7vq.R.inc(52107);text = JSON.toJSONString(sicmap, SerializerFeature.WriteClassName);
        __CLR4_1_10144g144gluszw7vq.R.inc(52108);showMesg("sicmap json : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52109);sicmap = JSON.parseObject(text, new TypeReference<Map<String, Integer[]>>(String.class, Integer[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52110);showMesg("sicmap : " + sicmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52111);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key1")));
        __CLR4_1_10144g144gluszw7vq.R.inc(52112);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key2")));

        __CLR4_1_10144g144gluszw7vq.R.inc(52113);showTitle("8=====================================");
        __CLR4_1_10144g144gluszw7vq.R.inc(52114);HashMap<byte[], String> bsmap = new HashMap<byte[], String>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52115);bsmap.put("testbytearray".getBytes(), "testbytearray");
        __CLR4_1_10144g144gluszw7vq.R.inc(52116);bsmap.put(new byte[] { 0, 1, 2}, "012");
        __CLR4_1_10144g144gluszw7vq.R.inc(52117);text = JSON.toJSONString(bsmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52118);showMesg("text : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52119);bsmap = JSON.parseObject(text, new TypeReference<Map<byte[], String>>(byte[].class, String.class){}.getType());
        __CLR4_1_10144g144gluszw7vq.R.inc(52120);showMesg("bsmap : " + bsmap);

        __CLR4_1_10144g144gluszw7vq.R.inc(52121);Iterator<byte[]> it = bsmap.keySet().iterator();
        __CLR4_1_10144g144gluszw7vq.R.inc(52122);int i = 0;
        __CLR4_1_10144g144gluszw7vq.R.inc(52123);while ((((it.hasNext())&&(__CLR4_1_10144g144gluszw7vq.R.iget(52124)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52125)==0&false))) {{
            __CLR4_1_10144g144gluszw7vq.R.inc(52126);byte[] bs = it.next();
            __CLR4_1_10144g144gluszw7vq.R.inc(52127);showMesg("bsmap key" + i++ + " : " + byteArrayToHexString(bs));
        }

        }__CLR4_1_10144g144gluszw7vq.R.inc(52128);Map<String, TestBean[]> stmap = new HashMap<String, TestBean[]>();
        __CLR4_1_10144g144gluszw7vq.R.inc(52129);stmap.put("key1", new TestBean[]{ new TestBean(), new TestBean()});
        __CLR4_1_10144g144gluszw7vq.R.inc(52130);stmap.put("key2", new TestBean[]{ new TestBean(), new TestBean(), new TestBean()});
        __CLR4_1_10144g144gluszw7vq.R.inc(52131);text = JSON.toJSONString(stmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52132);showMesg("stmap json : " + text);
        __CLR4_1_10144g144gluszw7vq.R.inc(52133);stmap = JSON.parseObject(text, new TypeReference<Map<String, TestBean[]>>(String.class, TestBean[].class){});
        __CLR4_1_10144g144gluszw7vq.R.inc(52134);showMesg("stmap : " + stmap);
        __CLR4_1_10144g144gluszw7vq.R.inc(52135);showMesg("key1 : " + Arrays.toString(stmap.get("key1")));
        __CLR4_1_10144g144gluszw7vq.R.inc(52136);showMesg("key2 : " + Arrays.toString(stmap.get("key2")));

    }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    private void showTitle(String title) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52137);
        __CLR4_1_10144g144gluszw7vq.R.inc(52138);System.out.println("test " + title);
    }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    private void showMesg(String mesg) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52139);
        __CLR4_1_10144g144gluszw7vq.R.inc(52140);System.out.println("  " + mesg);
    }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52141);
        __CLR4_1_10144g144gluszw7vq.R.inc(52142);return byteArrayToHexString(data, 0, data.length);
    }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data, int offest, int len) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52143);
        __CLR4_1_10144g144gluszw7vq.R.inc(52144);if ((((data == null)&&(__CLR4_1_10144g144gluszw7vq.R.iget(52145)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52146)==0&false))) {{
            __CLR4_1_10144g144gluszw7vq.R.inc(52147);return "";
        }

        }__CLR4_1_10144g144gluszw7vq.R.inc(52148);StringBuilder sb = new StringBuilder();

        __CLR4_1_10144g144gluszw7vq.R.inc(52149);if((((offest < 0 || offest > data.length)&&(__CLR4_1_10144g144gluszw7vq.R.iget(52150)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52151)==0&false))){{
            __CLR4_1_10144g144gluszw7vq.R.inc(52152);offest = 0;
        }

        }__CLR4_1_10144g144gluszw7vq.R.inc(52153);int total = Math.min(len, data.length);

        __CLR4_1_10144g144gluszw7vq.R.inc(52154);int index = offest;

        __CLR4_1_10144g144gluszw7vq.R.inc(52155);while ((((total > 0)&&(__CLR4_1_10144g144gluszw7vq.R.iget(52156)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52157)==0&false))) {{
            __CLR4_1_10144g144gluszw7vq.R.inc(52158);if ((((total >= 16)&&(__CLR4_1_10144g144gluszw7vq.R.iget(52159)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52160)==0&false))) {{
                __CLR4_1_10144g144gluszw7vq.R.inc(52161);sb.append(String.format("%02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x ",
                        data[index], data[index + 1], data[index + 2],
                        data[index + 3], data[index + 4],
                        data[index + 5], data[index + 6],
                        data[index + 7], data[index + 8],
                        data[index + 9], data[index + 10],
                        data[index + 11], data[index + 12],
                        data[index + 13], data[index + 14],
                        data[index + 15]));
                __CLR4_1_10144g144gluszw7vq.R.inc(52162);index += 16;
                __CLR4_1_10144g144gluszw7vq.R.inc(52163);total -= 16;
            } }else {{
                __CLR4_1_10144g144gluszw7vq.R.inc(52164);for (int i = 0; (((i < total)&&(__CLR4_1_10144g144gluszw7vq.R.iget(52165)!=0|true))||(__CLR4_1_10144g144gluszw7vq.R.iget(52166)==0&false)); i++) {{
                    __CLR4_1_10144g144gluszw7vq.R.inc(52167);sb.append(String.format("%02x ", data[index]));
                    __CLR4_1_10144g144gluszw7vq.R.inc(52168);index++;
                }
                }__CLR4_1_10144g144gluszw7vq.R.inc(52169);total = 0;
            }
        }}

        }__CLR4_1_10144g144gluszw7vq.R.inc(52170);return sb.toString();
    }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

    static class TestBean {
        byte b;
        byte[] bs = "bs".getBytes();
        int i;
        int[] is = new int[]{ 753, 159 };
        String s;

        public byte getB() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52171);
            __CLR4_1_10144g144gluszw7vq.R.inc(52172);return b;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public void setB(byte b) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52173);
            __CLR4_1_10144g144gluszw7vq.R.inc(52174);this.b = b;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public byte[] getBs() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52175);
            __CLR4_1_10144g144gluszw7vq.R.inc(52176);return bs;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public void setBs(byte[] bs) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52177);
            __CLR4_1_10144g144gluszw7vq.R.inc(52178);this.bs = bs;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public int getI() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52179);
            __CLR4_1_10144g144gluszw7vq.R.inc(52180);return i;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public void setI(int i) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52181);
            __CLR4_1_10144g144gluszw7vq.R.inc(52182);this.i = i;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public int[] getIs() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52183);
            __CLR4_1_10144g144gluszw7vq.R.inc(52184);return is;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public void setIs(int[] is) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52185);
            __CLR4_1_10144g144gluszw7vq.R.inc(52186);this.is = is;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public String getS() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52187);
            __CLR4_1_10144g144gluszw7vq.R.inc(52188);return s;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        public void setS(String s) {try{__CLR4_1_10144g144gluszw7vq.R.inc(52189);
            __CLR4_1_10144g144gluszw7vq.R.inc(52190);this.s = s;
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_10144g144gluszw7vq.R.inc(52191);
            __CLR4_1_10144g144gluszw7vq.R.inc(52192);return "TestBean{" +
                    "b=" + b +
                    ", bs=" + Arrays.toString(bs) +
                    ", i=" + i +
                    ", is=" + Arrays.toString(is) +
                    ", s='" + s + '\'' +
                    '}';
        }finally{__CLR4_1_10144g144gluszw7vq.R.flushNeeded();}}
    }
}
