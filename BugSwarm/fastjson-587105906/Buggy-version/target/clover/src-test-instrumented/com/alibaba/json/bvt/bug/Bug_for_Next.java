/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import java.util.*;


public class Bug_for_Next extends TestCase {static class __CLR4_1_1013681368lusqk215{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,50961,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_1_1013681368lusqk215.R.inc(50768);
        __CLR4_1_1013681368lusqk215.R.inc(50769);Result result = JUnitCore.runClasses(Bug_for_Next.class);
        __CLR4_1_1013681368lusqk215.R.inc(50770);for (Failure fail : result.getFailures()) {{
            __CLR4_1_1013681368lusqk215.R.inc(50771);System.out.println(fail.toString());
        }
        }__CLR4_1_1013681368lusqk215.R.inc(50772);if ((((result.wasSuccessful())&&(__CLR4_1_1013681368lusqk215.R.iget(50773)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50774)==0&false))) {{
            __CLR4_1_1013681368lusqk215.R.inc(50775);System.out.println("All tests finished successfully...");
        }
    }}finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    public void testPrimitiveArray() throws Exception {__CLR4_1_1013681368lusqk215.R.globalSliceStart(getClass().getName(),50776);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ggs3hn136g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013681368lusqk215.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013681368lusqk215.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_Next.testPrimitiveArray",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50776,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ggs3hn136g() throws Exception{try{__CLR4_1_1013681368lusqk215.R.inc(50776);

        __CLR4_1_1013681368lusqk215.R.inc(50777);showTitle("1=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50778);String text= JSON.toJSONString("testbytearray".getBytes());
        __CLR4_1_1013681368lusqk215.R.inc(50779);showMesg("text : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50780);byte[] byteArray = JSON.parseObject(text, byte[].class);
        __CLR4_1_1013681368lusqk215.R.inc(50781);showMesg("byteArray : " + byteArrayToHexString(byteArray));

        __CLR4_1_1013681368lusqk215.R.inc(50782);int[][] ii = new int[][]{
                new int[]{ 1, 2, 3},
                new int[]{ 2, 3, 4, 5}
        };

        __CLR4_1_1013681368lusqk215.R.inc(50783);text = JSON.toJSONString(ii);
        __CLR4_1_1013681368lusqk215.R.inc(50784);showMesg("text : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50785);int[][] pii = JSON.parseObject(text, int[][].class);
        __CLR4_1_1013681368lusqk215.R.inc(50786);showMesg("pii : " + Arrays.toString(pii));
        __CLR4_1_1013681368lusqk215.R.inc(50787);showMesg("pii0 : " + Arrays.toString(pii[0]));
        __CLR4_1_1013681368lusqk215.R.inc(50788);showMesg("pii1 : " + Arrays.toString(pii[1]));

        __CLR4_1_1013681368lusqk215.R.inc(50789);showTitle("2=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50790);List<byte[]> blist = new ArrayList<byte[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50791);blist.add("byte[]".getBytes());
        __CLR4_1_1013681368lusqk215.R.inc(50792);blist.add("blist".getBytes());
        __CLR4_1_1013681368lusqk215.R.inc(50793);text = JSON.toJSONString(blist);
        __CLR4_1_1013681368lusqk215.R.inc(50794);showMesg("text : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50795);blist = JSON.parseObject(text, new TypeReference<List<byte[]>>(byte[].class){}.getType());
        __CLR4_1_1013681368lusqk215.R.inc(50796);showMesg("blist : " + blist);
        __CLR4_1_1013681368lusqk215.R.inc(50797);showMesg("blist1 : " + byteArrayToHexString(blist.get(0)));
        __CLR4_1_1013681368lusqk215.R.inc(50798);showMesg("blist2 : " + byteArrayToHexString(blist.get(1)));

        __CLR4_1_1013681368lusqk215.R.inc(50799);List<char[]> clist = new ArrayList<char[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50800);clist.add(new char[]{'1',',','2'});
        __CLR4_1_1013681368lusqk215.R.inc(50801);clist.add(new char[]{'2',',','1'});
        __CLR4_1_1013681368lusqk215.R.inc(50802);text = JSON.toJSONString(clist);
        __CLR4_1_1013681368lusqk215.R.inc(50803);showMesg("text " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50804);clist = JSON.parseObject(text, new TypeReference<List<char[]>>(char[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50805);showMesg("clist : " + clist);
        __CLR4_1_1013681368lusqk215.R.inc(50806);showMesg("clist1 : " + Arrays.toString(clist.get(0)));
        __CLR4_1_1013681368lusqk215.R.inc(50807);showMesg("clist2 : " + Arrays.toString(clist.get(1)));

        __CLR4_1_1013681368lusqk215.R.inc(50808);List<int[]> ilist = new ArrayList<int[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50809);ilist.add(new int[]{11,22,33});
        __CLR4_1_1013681368lusqk215.R.inc(50810);ilist.add(new int[]{33,22,11});
        __CLR4_1_1013681368lusqk215.R.inc(50811);text = JSON.toJSONString(ilist);
        __CLR4_1_1013681368lusqk215.R.inc(50812);showMesg("text " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50813);ilist = JSON.parseObject(text, new TypeReference<List<int[]>>(int[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50814);showMesg("ilist : " + ilist);
        __CLR4_1_1013681368lusqk215.R.inc(50815);showMesg("ilist1 : " + Arrays.toString(ilist.get(0)));
        __CLR4_1_1013681368lusqk215.R.inc(50816);showMesg("ilist2 : " + Arrays.toString(ilist.get(1)));

        __CLR4_1_1013681368lusqk215.R.inc(50817);List<float[]> flist = new ArrayList<float[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50818);flist.add(new float[]{11.2f,22.3f,33.4f});
        __CLR4_1_1013681368lusqk215.R.inc(50819);flist.add(new float[]{33.1f,22.2f,11.3f});
        __CLR4_1_1013681368lusqk215.R.inc(50820);text = JSON.toJSONString(flist);
        __CLR4_1_1013681368lusqk215.R.inc(50821);showMesg("text " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50822);flist = JSON.parseObject(text, new TypeReference<List<float[]>>(float[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50823);showMesg("flist : " + flist);
        __CLR4_1_1013681368lusqk215.R.inc(50824);showMesg("flist1 : " + Arrays.toString(flist.get(0)));
        __CLR4_1_1013681368lusqk215.R.inc(50825);showMesg("flist2 : " + Arrays.toString(flist.get(1)));

        __CLR4_1_1013681368lusqk215.R.inc(50826);List<int[][]> iilist = new ArrayList<int[][]>();
        __CLR4_1_1013681368lusqk215.R.inc(50827);iilist.add(new int[][] {
                new int[]{9,6,3},
                new int[]{8,5,2}
        });
        __CLR4_1_1013681368lusqk215.R.inc(50828);iilist.add(new int[][] {
                new int[]{7,4,1},
                new int[]{0}
        });
        __CLR4_1_1013681368lusqk215.R.inc(50829);text = JSON.toJSONString(iilist);
        __CLR4_1_1013681368lusqk215.R.inc(50830);showMesg("text : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50831);iilist = JSON.parseObject(text, new TypeReference<List<int[][]>>(int[][].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50832);showMesg("iilist : " + iilist);
        __CLR4_1_1013681368lusqk215.R.inc(50833);showMesg("iilist1 : " + Arrays.toString(iilist.get(0)[0]));
        __CLR4_1_1013681368lusqk215.R.inc(50834);showMesg("iilist2 : " + Arrays.toString(iilist.get(1)[0]));

        __CLR4_1_1013681368lusqk215.R.inc(50835);showTitle("3=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50836);Map<String, byte[]> sbmap = new HashMap<String, byte[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50837);sbmap.put("key1", "key1".getBytes());
        __CLR4_1_1013681368lusqk215.R.inc(50838);sbmap.put("key2", "key2".getBytes());
        __CLR4_1_1013681368lusqk215.R.inc(50839);text = JSON.toJSONString(sbmap);
        __CLR4_1_1013681368lusqk215.R.inc(50840);showMesg("sbmap : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50841);sbmap = JSON.parseObject(text, new TypeReference<Map<String, byte[]>>(String.class, byte[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50842);showMesg("sbmap : " + sbmap);
        __CLR4_1_1013681368lusqk215.R.inc(50843);showMesg("sbmap key1 : " + byteArrayToHexString(sbmap.get("key1")));
        __CLR4_1_1013681368lusqk215.R.inc(50844);showMesg("sbmap key2 : " + byteArrayToHexString(sbmap.get("key2")));

        __CLR4_1_1013681368lusqk215.R.inc(50845);showTitle("4=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50846);Map<String, Byte[]> sbcmap = new HashMap<String, Byte[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50847);sbcmap.put("key1", new Byte[]{ 1, 2, 3 });
        __CLR4_1_1013681368lusqk215.R.inc(50848);sbcmap.put("key2", new Byte[]{ 3, 2, 1 });
        __CLR4_1_1013681368lusqk215.R.inc(50849);text = JSON.toJSONString(sbcmap);
        __CLR4_1_1013681368lusqk215.R.inc(50850);showMesg("sbcmap json : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50851);sbcmap = JSON.parseObject(text, new TypeReference<Map<String, Byte[]>>(String.class, Byte[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50852);showMesg("sbcmap : " + sbcmap);
        __CLR4_1_1013681368lusqk215.R.inc(50853);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key1")));
        __CLR4_1_1013681368lusqk215.R.inc(50854);showMesg("sbcmap key1 : " + Arrays.toString(sbcmap.get("key2")));

        __CLR4_1_1013681368lusqk215.R.inc(50855);showTitle("5=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50856);int[] intArray = new int[]{ 11, 22, 33 };
        __CLR4_1_1013681368lusqk215.R.inc(50857);text = JSON.toJSONString(intArray);
        __CLR4_1_1013681368lusqk215.R.inc(50858);showMesg("intArray json : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50859);intArray = JSON.parseObject(text, int[].class);
        __CLR4_1_1013681368lusqk215.R.inc(50860);showMesg("intArray : " + Arrays.toString(intArray));

        __CLR4_1_1013681368lusqk215.R.inc(50861);showTitle("6=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50862);Map<String, int[]> simap = new HashMap<String, int[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50863);simap.put("key1", new int[]{ 11, 22, 33 });
        __CLR4_1_1013681368lusqk215.R.inc(50864);simap.put("key2", new int[]{ 33, 22, 11 });
        __CLR4_1_1013681368lusqk215.R.inc(50865);text = JSON.toJSONString(simap, SerializerFeature.WriteClassName);
        __CLR4_1_1013681368lusqk215.R.inc(50866);showMesg("simap json : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50867);simap = JSON.parseObject(text, new TypeReference<Map<String, int[]>>(String.class, int[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50868);showMesg("simap : " + simap);
        __CLR4_1_1013681368lusqk215.R.inc(50869);showMesg("simap key1 : " + Arrays.toString(simap.get("key1")));
        __CLR4_1_1013681368lusqk215.R.inc(50870);showMesg("simap key1 : " + Arrays.toString(simap.get("key2")));

        __CLR4_1_1013681368lusqk215.R.inc(50871);showTitle("7=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50872);Map<String, Integer[]> sicmap = new HashMap<String, Integer[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50873);sicmap.put("key1", new Integer[]{ 12, 23, 34 });
        __CLR4_1_1013681368lusqk215.R.inc(50874);sicmap.put("key2", new Integer[]{ 34, 23, 12 });
        __CLR4_1_1013681368lusqk215.R.inc(50875);text = JSON.toJSONString(sicmap, SerializerFeature.WriteClassName);
        __CLR4_1_1013681368lusqk215.R.inc(50876);showMesg("sicmap json : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50877);sicmap = JSON.parseObject(text, new TypeReference<Map<String, Integer[]>>(String.class, Integer[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50878);showMesg("sicmap : " + sicmap);
        __CLR4_1_1013681368lusqk215.R.inc(50879);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key1")));
        __CLR4_1_1013681368lusqk215.R.inc(50880);showMesg("sicmap key1 : " + Arrays.toString(sicmap.get("key2")));

        __CLR4_1_1013681368lusqk215.R.inc(50881);showTitle("8=====================================");
        __CLR4_1_1013681368lusqk215.R.inc(50882);HashMap<byte[], String> bsmap = new HashMap<byte[], String>();
        __CLR4_1_1013681368lusqk215.R.inc(50883);bsmap.put("testbytearray".getBytes(), "testbytearray");
        __CLR4_1_1013681368lusqk215.R.inc(50884);bsmap.put(new byte[] { 0, 1, 2}, "012");
        __CLR4_1_1013681368lusqk215.R.inc(50885);text = JSON.toJSONString(bsmap);
        __CLR4_1_1013681368lusqk215.R.inc(50886);showMesg("text : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50887);bsmap = JSON.parseObject(text, new TypeReference<Map<byte[], String>>(byte[].class, String.class){}.getType());
        __CLR4_1_1013681368lusqk215.R.inc(50888);showMesg("bsmap : " + bsmap);

        __CLR4_1_1013681368lusqk215.R.inc(50889);Iterator<byte[]> it = bsmap.keySet().iterator();
        __CLR4_1_1013681368lusqk215.R.inc(50890);int i = 0;
        __CLR4_1_1013681368lusqk215.R.inc(50891);while ((((it.hasNext())&&(__CLR4_1_1013681368lusqk215.R.iget(50892)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50893)==0&false))) {{
            __CLR4_1_1013681368lusqk215.R.inc(50894);byte[] bs = it.next();
            __CLR4_1_1013681368lusqk215.R.inc(50895);showMesg("bsmap key" + i++ + " : " + byteArrayToHexString(bs));
        }

        }__CLR4_1_1013681368lusqk215.R.inc(50896);Map<String, TestBean[]> stmap = new HashMap<String, TestBean[]>();
        __CLR4_1_1013681368lusqk215.R.inc(50897);stmap.put("key1", new TestBean[]{ new TestBean(), new TestBean()});
        __CLR4_1_1013681368lusqk215.R.inc(50898);stmap.put("key2", new TestBean[]{ new TestBean(), new TestBean(), new TestBean()});
        __CLR4_1_1013681368lusqk215.R.inc(50899);text = JSON.toJSONString(stmap);
        __CLR4_1_1013681368lusqk215.R.inc(50900);showMesg("stmap json : " + text);
        __CLR4_1_1013681368lusqk215.R.inc(50901);stmap = JSON.parseObject(text, new TypeReference<Map<String, TestBean[]>>(String.class, TestBean[].class){});
        __CLR4_1_1013681368lusqk215.R.inc(50902);showMesg("stmap : " + stmap);
        __CLR4_1_1013681368lusqk215.R.inc(50903);showMesg("key1 : " + Arrays.toString(stmap.get("key1")));
        __CLR4_1_1013681368lusqk215.R.inc(50904);showMesg("key2 : " + Arrays.toString(stmap.get("key2")));

    }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    private void showTitle(String title) {try{__CLR4_1_1013681368lusqk215.R.inc(50905);
        __CLR4_1_1013681368lusqk215.R.inc(50906);System.out.println("test " + title);
    }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    private void showMesg(String mesg) {try{__CLR4_1_1013681368lusqk215.R.inc(50907);
        __CLR4_1_1013681368lusqk215.R.inc(50908);System.out.println("  " + mesg);
    }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data) {try{__CLR4_1_1013681368lusqk215.R.inc(50909);
        __CLR4_1_1013681368lusqk215.R.inc(50910);return byteArrayToHexString(data, 0, data.length);
    }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    private static String byteArrayToHexString(byte[] data, int offest, int len) {try{__CLR4_1_1013681368lusqk215.R.inc(50911);
        __CLR4_1_1013681368lusqk215.R.inc(50912);if ((((data == null)&&(__CLR4_1_1013681368lusqk215.R.iget(50913)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50914)==0&false))) {{
            __CLR4_1_1013681368lusqk215.R.inc(50915);return "";
        }

        }__CLR4_1_1013681368lusqk215.R.inc(50916);StringBuilder sb = new StringBuilder();

        __CLR4_1_1013681368lusqk215.R.inc(50917);if((((offest < 0 || offest > data.length)&&(__CLR4_1_1013681368lusqk215.R.iget(50918)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50919)==0&false))){{
            __CLR4_1_1013681368lusqk215.R.inc(50920);offest = 0;
        }

        }__CLR4_1_1013681368lusqk215.R.inc(50921);int total = Math.min(len, data.length);

        __CLR4_1_1013681368lusqk215.R.inc(50922);int index = offest;

        __CLR4_1_1013681368lusqk215.R.inc(50923);while ((((total > 0)&&(__CLR4_1_1013681368lusqk215.R.iget(50924)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50925)==0&false))) {{
            __CLR4_1_1013681368lusqk215.R.inc(50926);if ((((total >= 16)&&(__CLR4_1_1013681368lusqk215.R.iget(50927)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50928)==0&false))) {{
                __CLR4_1_1013681368lusqk215.R.inc(50929);sb.append(String.format("%02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x %02x ",
                        data[index], data[index + 1], data[index + 2],
                        data[index + 3], data[index + 4],
                        data[index + 5], data[index + 6],
                        data[index + 7], data[index + 8],
                        data[index + 9], data[index + 10],
                        data[index + 11], data[index + 12],
                        data[index + 13], data[index + 14],
                        data[index + 15]));
                __CLR4_1_1013681368lusqk215.R.inc(50930);index += 16;
                __CLR4_1_1013681368lusqk215.R.inc(50931);total -= 16;
            } }else {{
                __CLR4_1_1013681368lusqk215.R.inc(50932);for (int i = 0; (((i < total)&&(__CLR4_1_1013681368lusqk215.R.iget(50933)!=0|true))||(__CLR4_1_1013681368lusqk215.R.iget(50934)==0&false)); i++) {{
                    __CLR4_1_1013681368lusqk215.R.inc(50935);sb.append(String.format("%02x ", data[index]));
                    __CLR4_1_1013681368lusqk215.R.inc(50936);index++;
                }
                }__CLR4_1_1013681368lusqk215.R.inc(50937);total = 0;
            }
        }}

        }__CLR4_1_1013681368lusqk215.R.inc(50938);return sb.toString();
    }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

    static class TestBean {
        byte b;
        byte[] bs = "bs".getBytes();
        int i;
        int[] is = new int[]{ 753, 159 };
        String s;

        public byte getB() {try{__CLR4_1_1013681368lusqk215.R.inc(50939);
            __CLR4_1_1013681368lusqk215.R.inc(50940);return b;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public void setB(byte b) {try{__CLR4_1_1013681368lusqk215.R.inc(50941);
            __CLR4_1_1013681368lusqk215.R.inc(50942);this.b = b;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public byte[] getBs() {try{__CLR4_1_1013681368lusqk215.R.inc(50943);
            __CLR4_1_1013681368lusqk215.R.inc(50944);return bs;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public void setBs(byte[] bs) {try{__CLR4_1_1013681368lusqk215.R.inc(50945);
            __CLR4_1_1013681368lusqk215.R.inc(50946);this.bs = bs;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public int getI() {try{__CLR4_1_1013681368lusqk215.R.inc(50947);
            __CLR4_1_1013681368lusqk215.R.inc(50948);return i;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public void setI(int i) {try{__CLR4_1_1013681368lusqk215.R.inc(50949);
            __CLR4_1_1013681368lusqk215.R.inc(50950);this.i = i;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public int[] getIs() {try{__CLR4_1_1013681368lusqk215.R.inc(50951);
            __CLR4_1_1013681368lusqk215.R.inc(50952);return is;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public void setIs(int[] is) {try{__CLR4_1_1013681368lusqk215.R.inc(50953);
            __CLR4_1_1013681368lusqk215.R.inc(50954);this.is = is;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public String getS() {try{__CLR4_1_1013681368lusqk215.R.inc(50955);
            __CLR4_1_1013681368lusqk215.R.inc(50956);return s;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        public void setS(String s) {try{__CLR4_1_1013681368lusqk215.R.inc(50957);
            __CLR4_1_1013681368lusqk215.R.inc(50958);this.s = s;
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_1013681368lusqk215.R.inc(50959);
            __CLR4_1_1013681368lusqk215.R.inc(50960);return "TestBean{" +
                    "b=" + b +
                    ", bs=" + Arrays.toString(bs) +
                    ", i=" + i +
                    ", is=" + Arrays.toString(is) +
                    ", s='" + s + '\'' +
                    '}';
        }finally{__CLR4_1_1013681368lusqk215.R.flushNeeded();}}
    }
}
