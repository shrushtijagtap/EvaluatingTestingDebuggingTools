/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.fastjson.util.IOUtils;

public class TestUtils {static class __CLR4_5_221w821w8lusyjwj7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95870,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // ****************************************************************************************
    // * char[] version
    // ****************************************************************************************

    /**
     * Encodes a raw byte array into a BASE64 <code>char[]</code> representation i accordance with RFC 2045.
     * 
     * @param sArr The bytes to convert. If <code>null</code> or length 0 an empty array will be returned.
     * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
     * No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.
     * @return A BASE64 encoded array. Never <code>null</code>.
     */
    private final static char[] encodeToChar(byte[] sArr, boolean lineSep) {try{__CLR4_5_221w821w8lusyjwj7.R.inc(95768);
        __CLR4_5_221w821w8lusyjwj7.R.inc(95769);char[] CA = IOUtils.CA;

        // Check special case
        __CLR4_5_221w821w8lusyjwj7.R.inc(95770);int sLen = (((sArr != null )&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95771)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95772)==0&false))? sArr.length : 0;
        __CLR4_5_221w821w8lusyjwj7.R.inc(95773);if ((((sLen == 0)&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95774)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95775)==0&false))) {__CLR4_5_221w821w8lusyjwj7.R.inc(95776);return new char[0];

        }__CLR4_5_221w821w8lusyjwj7.R.inc(95777);int eLen = (sLen / 3) * 3; // Length of even 24-bits.
        __CLR4_5_221w821w8lusyjwj7.R.inc(95778);int cCnt = ((sLen - 1) / 3 + 1) << 2; // Returned character count
        __CLR4_5_221w821w8lusyjwj7.R.inc(95779);int dLen = cCnt + ((((lineSep )&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95780)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95781)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
        __CLR4_5_221w821w8lusyjwj7.R.inc(95782);char[] dArr = new char[dLen];

        // Encode even 24-bits
        __CLR4_5_221w821w8lusyjwj7.R.inc(95783);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95784)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95785)==0&false));) {{
            // Copy next three bytes into lower 24 bits of int, paying attension to sign.
            __CLR4_5_221w821w8lusyjwj7.R.inc(95786);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

            // Encode the int into four chars
            __CLR4_5_221w821w8lusyjwj7.R.inc(95787);dArr[d++] = CA[(i >>> 18) & 0x3f];
            __CLR4_5_221w821w8lusyjwj7.R.inc(95788);dArr[d++] = CA[(i >>> 12) & 0x3f];
            __CLR4_5_221w821w8lusyjwj7.R.inc(95789);dArr[d++] = CA[(i >>> 6) & 0x3f];
            __CLR4_5_221w821w8lusyjwj7.R.inc(95790);dArr[d++] = CA[i & 0x3f];

            // Add optional line separator
            __CLR4_5_221w821w8lusyjwj7.R.inc(95791);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95792)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95793)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95794);dArr[d++] = '\r';
                __CLR4_5_221w821w8lusyjwj7.R.inc(95795);dArr[d++] = '\n';
                __CLR4_5_221w821w8lusyjwj7.R.inc(95796);cc = 0;
            }
        }}

        // Pad and encode last bits if source isn't even 24 bits.
        }__CLR4_5_221w821w8lusyjwj7.R.inc(95797);int left = sLen - eLen; // 0 - 2.
        __CLR4_5_221w821w8lusyjwj7.R.inc(95798);if ((((left > 0)&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95799)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95800)==0&false))) {{
            // Prepare the int
            __CLR4_5_221w821w8lusyjwj7.R.inc(95801);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95802)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95803)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

            // Set last four chars
            __CLR4_5_221w821w8lusyjwj7.R.inc(95804);dArr[dLen - 4] = CA[i >> 12];
            __CLR4_5_221w821w8lusyjwj7.R.inc(95805);dArr[dLen - 3] = CA[(i >>> 6) & 0x3f];
            __CLR4_5_221w821w8lusyjwj7.R.inc(95806);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95807)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95808)==0&false))? CA[i & 0x3f] : '=';
            __CLR4_5_221w821w8lusyjwj7.R.inc(95809);dArr[dLen - 1] = '=';
        }
        }__CLR4_5_221w821w8lusyjwj7.R.inc(95810);return dArr;
    }finally{__CLR4_5_221w821w8lusyjwj7.R.flushNeeded();}}

    // ****************************************************************************************
    // * String version
    // ****************************************************************************************

    /**
     * Encodes a raw byte array into a BASE64 <code>String</code> representation i accordance with RFC 2045.
     * 
     * @param sArr The bytes to convert. If <code>null</code> or length 0 an empty array will be returned.
     * @param lineSep Optional "\r\n" after 76 characters, unless end of file.<br>
     * No line separator will be in breach of RFC 2045 which specifies max 76 per line but will be a little faster.
     * @return A BASE64 encoded array. Never <code>null</code>.
     */
    public final static String encodeToBase64String(byte[] sArr, boolean lineSep) {try{__CLR4_5_221w821w8lusyjwj7.R.inc(95811);
        // Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
        __CLR4_5_221w821w8lusyjwj7.R.inc(95812);return new String(encodeToChar(sArr, lineSep));
    }finally{__CLR4_5_221w821w8lusyjwj7.R.flushNeeded();}}
    
    public static long getYoungGC() {try{__CLR4_5_221w821w8lusyjwj7.R.inc(95813);
        __CLR4_5_221w821w8lusyjwj7.R.inc(95814);try {
            // java.lang:type=GarbageCollector,name=G1 Young Generation
            // java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_5_221w821w8lusyjwj7.R.inc(95815);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_221w821w8lusyjwj7.R.inc(95816);ObjectName objectName;
            __CLR4_5_221w821w8lusyjwj7.R.inc(95817);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95818)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95819)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95820);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95821);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95822)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95823)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95824);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95825);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95826)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95827)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95828);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95829);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_221w821w8lusyjwj7.R.inc(95830);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_221w821w8lusyjwj7.R.inc(95831);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_221w821w8lusyjwj7.R.flushNeeded();}}
    
    public static long getYoungGCTime() {try{__CLR4_5_221w821w8lusyjwj7.R.inc(95832);
        __CLR4_5_221w821w8lusyjwj7.R.inc(95833);try {
            __CLR4_5_221w821w8lusyjwj7.R.inc(95834);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_221w821w8lusyjwj7.R.inc(95835);ObjectName objectName;
            __CLR4_5_221w821w8lusyjwj7.R.inc(95836);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95837)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95838)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95839);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95840);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95841)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95842)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95843);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95844);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95845)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95846)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95847);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95848);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_5_221w821w8lusyjwj7.R.inc(95849);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_5_221w821w8lusyjwj7.R.inc(95850);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_5_221w821w8lusyjwj7.R.flushNeeded();}}

    public static long getFullGC() {try{__CLR4_5_221w821w8lusyjwj7.R.inc(95851);
        __CLR4_5_221w821w8lusyjwj7.R.inc(95852);try {
            __CLR4_5_221w821w8lusyjwj7.R.inc(95853);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_5_221w821w8lusyjwj7.R.inc(95854);ObjectName objectName;

            __CLR4_5_221w821w8lusyjwj7.R.inc(95855);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95856)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95857)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95858);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95859);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95860)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95861)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95862);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_5_221w821w8lusyjwj7.R.inc(95863);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_5_221w821w8lusyjwj7.R.iget(95864)!=0|true))||(__CLR4_5_221w821w8lusyjwj7.R.iget(95865)==0&false))) {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95866);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_5_221w821w8lusyjwj7.R.inc(95867);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_5_221w821w8lusyjwj7.R.inc(95868);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_5_221w821w8lusyjwj7.R.inc(95869);throw new RuntimeException("error");
        }
    }finally{__CLR4_5_221w821w8lusyjwj7.R.flushNeeded();}}
}
