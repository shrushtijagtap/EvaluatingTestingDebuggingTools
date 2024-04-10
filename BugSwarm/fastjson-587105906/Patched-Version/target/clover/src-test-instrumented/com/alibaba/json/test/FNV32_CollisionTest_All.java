/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import junit.framework.TestCase;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.text.NumberFormat;
import java.util.BitSet;
import java.util.Random;

/**
 * Created by wenshao on 08/01/2017.
 */
public class FNV32_CollisionTest_All extends TestCase {static class __CLR4_5_2219c219clusyjwfh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    char[] digLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_".toCharArray();
    //char[] digLetters = "0123456789".toCharArray();
    Random r = new Random();
    int[] powers = new int[10];

    {try{__CLR4_5_2219c219clusyjwfh.R.inc(94944);
        __CLR4_5_2219c219clusyjwfh.R.inc(94945);for (int i = 0; (((i < powers.length)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94946)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94947)==0&false)); ++i) {{
            __CLR4_5_2219c219clusyjwfh.R.inc(94948);powers[i] = (int) Math.pow(digLetters.length, i);
        }
    }}finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}

    private BitSet[] bits = new BitSet[16];

    private File file = new File("/Users/wenshao/Downloads/fnv/hash.bin");
    FileOutputStream out;

    protected void setUp() throws Exception {try{__CLR4_5_2219c219clusyjwfh.R.inc(94949);
        __CLR4_5_2219c219clusyjwfh.R.inc(94950);out = new FileOutputStream(file);

        __CLR4_5_2219c219clusyjwfh.R.inc(94951);for (int i = 0; (((i < bits.length)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94952)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94953)==0&false)); ++i) {{
            __CLR4_5_2219c219clusyjwfh.R.inc(94954);bits[i] = new BitSet(Integer.MAX_VALUE);
        }
    }}finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_5_2219c219clusyjwfh.R.inc(94955);
        __CLR4_5_2219c219clusyjwfh.R.inc(94956);out.close();
    }finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}

    public void test_fnv_hash() throws Exception {__CLR4_5_2219c219clusyjwfh.R.globalSliceStart(getClass().getName(),94957);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2brbokt219p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2219c219clusyjwfh.R.rethrow($CLV_t2$);}finally{__CLR4_5_2219c219clusyjwfh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.FNV32_CollisionTest_All.test_fnv_hash",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),94957,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2brbokt219p() throws Exception{try{__CLR4_5_2219c219clusyjwfh.R.inc(94957);
        __CLR4_5_2219c219clusyjwfh.R.inc(94958);int collisionCount = 0;

        __CLR4_5_2219c219clusyjwfh.R.inc(94959);long id_hash_64 = fnv_hash("name".toCharArray());
        __CLR4_5_2219c219clusyjwfh.R.inc(94960);int id_hash_32 = Math.abs((int) id_hash_64);
        //bitset.set(id_hash_32);

        __CLR4_5_2219c219clusyjwfh.R.inc(94961);long v = 0;
        __CLR4_5_2219c219clusyjwfh.R.inc(94962);long time = System.currentTimeMillis();
        __CLR4_5_2219c219clusyjwfh.R.inc(94963);NumberFormat format = NumberFormat.getInstance();

        __CLR4_5_2219c219clusyjwfh.R.inc(94964);byte[] b = new byte[8];
        __CLR4_5_2219c219clusyjwfh.R.inc(94965);for (int len = 1; (((len <= 5)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94966)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94967)==0&false)); ++len){{
            __CLR4_5_2219c219clusyjwfh.R.inc(94968);char[] chars = new char[len];
            __CLR4_5_2219c219clusyjwfh.R.inc(94969);long n = (long) Math.pow(digLetters.length, chars.length);

            __CLR4_5_2219c219clusyjwfh.R.inc(94970);for (; (((v < n)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94971)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94972)==0&false)); ++v) {{
                __CLR4_5_2219c219clusyjwfh.R.inc(94973);long hash = 0xcbf29ce484222325L;
                __CLR4_5_2219c219clusyjwfh.R.inc(94974);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94975)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94976)==0&false)); ++i) {{
                    __CLR4_5_2219c219clusyjwfh.R.inc(94977);int power = powers[chars.length - i - 1];
                    __CLR4_5_2219c219clusyjwfh.R.inc(94978);int d = (int) ((v / power) % digLetters.length);
                    __CLR4_5_2219c219clusyjwfh.R.inc(94979);char c = digLetters[d];

                    __CLR4_5_2219c219clusyjwfh.R.inc(94980);hash ^= c;
                    __CLR4_5_2219c219clusyjwfh.R.inc(94981);hash *= 0x100000001b3L;
                }
                }__CLR4_5_2219c219clusyjwfh.R.inc(94982);b[7] = (byte) (hash       );
                __CLR4_5_2219c219clusyjwfh.R.inc(94983);b[6] = (byte) (hash >>>  8);
                __CLR4_5_2219c219clusyjwfh.R.inc(94984);b[5] = (byte) (hash >>> 16);
                __CLR4_5_2219c219clusyjwfh.R.inc(94985);b[4] = (byte) (hash >>> 24);
                __CLR4_5_2219c219clusyjwfh.R.inc(94986);b[3] = (byte) (hash >>> 32);
                __CLR4_5_2219c219clusyjwfh.R.inc(94987);b[2] = (byte) (hash >>> 40);
                __CLR4_5_2219c219clusyjwfh.R.inc(94988);b[1] = (byte) (hash >>> 48);
                __CLR4_5_2219c219clusyjwfh.R.inc(94989);b[0] = (byte) (hash >>> 56);
                __CLR4_5_2219c219clusyjwfh.R.inc(94990);out.write(b);

                __CLR4_5_2219c219clusyjwfh.R.inc(94991);if ((((v != 0 && v % (1000 * 1000 * 10) == 0)&&(__CLR4_5_2219c219clusyjwfh.R.iget(94992)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(94993)==0&false))) {{
                    __CLR4_5_2219c219clusyjwfh.R.inc(94994);long now = System.currentTimeMillis();
                    __CLR4_5_2219c219clusyjwfh.R.inc(94995);long millis = now - time;
                    __CLR4_5_2219c219clusyjwfh.R.inc(94996);time = now;
                    __CLR4_5_2219c219clusyjwfh.R.inc(94997);System.out.println("millis : " + millis + ", collision " + format.format(collisionCount) + ", " + format.format(v));
                }
            }}

            }__CLR4_5_2219c219clusyjwfh.R.inc(94998);System.out.println("end : " + len);
        }
    }}finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}

    String build(long v, int len) {try{__CLR4_5_2219c219clusyjwfh.R.inc(94999);
        __CLR4_5_2219c219clusyjwfh.R.inc(95000);char[] chars = new char[len];
        __CLR4_5_2219c219clusyjwfh.R.inc(95001);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2219c219clusyjwfh.R.iget(95002)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(95003)==0&false)); ++i) {{
            __CLR4_5_2219c219clusyjwfh.R.inc(95004);int power = powers[chars.length - i - 1];
            __CLR4_5_2219c219clusyjwfh.R.inc(95005);int d = (int) ((v / power) % digLetters.length);
            __CLR4_5_2219c219clusyjwfh.R.inc(95006);chars[i] = digLetters[d];
        }

        }__CLR4_5_2219c219clusyjwfh.R.inc(95007);return new String(chars);
    }finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}

    static long fnv_hash(char[] chars) {try{__CLR4_5_2219c219clusyjwfh.R.inc(95008);
        __CLR4_5_2219c219clusyjwfh.R.inc(95009);long hash = 0xcbf29ce484222325L;
        __CLR4_5_2219c219clusyjwfh.R.inc(95010);for (int i = 0; (((i < chars.length)&&(__CLR4_5_2219c219clusyjwfh.R.iget(95011)!=0|true))||(__CLR4_5_2219c219clusyjwfh.R.iget(95012)==0&false)); ++i) {{
            __CLR4_5_2219c219clusyjwfh.R.inc(95013);char c = chars[i];
            __CLR4_5_2219c219clusyjwfh.R.inc(95014);hash ^= c;
            __CLR4_5_2219c219clusyjwfh.R.inc(95015);hash *= 0x100000001b3L;
        }
        }__CLR4_5_2219c219clusyjwfh.R.inc(95016);return hash;
    }finally{__CLR4_5_2219c219clusyjwfh.R.flushNeeded();}}
}
