/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;
import javax.management.ObjectName;

import com.alibaba.fastjson.util.IOUtils;

public class TestUtils {static class __CLR4_1_1022ur22urluszwi1m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97113,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    private final static char[] encodeToChar(byte[] sArr, boolean lineSep) {try{__CLR4_1_1022ur22urluszwi1m.R.inc(97011);
        __CLR4_1_1022ur22urluszwi1m.R.inc(97012);char[] CA = IOUtils.CA;

        // Check special case
        __CLR4_1_1022ur22urluszwi1m.R.inc(97013);int sLen = (((sArr != null )&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97014)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97015)==0&false))? sArr.length : 0;
        __CLR4_1_1022ur22urluszwi1m.R.inc(97016);if ((((sLen == 0)&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97017)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97018)==0&false))) {__CLR4_1_1022ur22urluszwi1m.R.inc(97019);return new char[0];

        }__CLR4_1_1022ur22urluszwi1m.R.inc(97020);int eLen = (sLen / 3) * 3; // Length of even 24-bits.
        __CLR4_1_1022ur22urluszwi1m.R.inc(97021);int cCnt = ((sLen - 1) / 3 + 1) << 2; // Returned character count
        __CLR4_1_1022ur22urluszwi1m.R.inc(97022);int dLen = cCnt + ((((lineSep )&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97023)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97024)==0&false))? (cCnt - 1) / 76 << 1 : 0); // Length of returned array
        __CLR4_1_1022ur22urluszwi1m.R.inc(97025);char[] dArr = new char[dLen];

        // Encode even 24-bits
        __CLR4_1_1022ur22urluszwi1m.R.inc(97026);for (int s = 0, d = 0, cc = 0; (((s < eLen)&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97027)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97028)==0&false));) {{
            // Copy next three bytes into lower 24 bits of int, paying attension to sign.
            __CLR4_1_1022ur22urluszwi1m.R.inc(97029);int i = (sArr[s++] & 0xff) << 16 | (sArr[s++] & 0xff) << 8 | (sArr[s++] & 0xff);

            // Encode the int into four chars
            __CLR4_1_1022ur22urluszwi1m.R.inc(97030);dArr[d++] = CA[(i >>> 18) & 0x3f];
            __CLR4_1_1022ur22urluszwi1m.R.inc(97031);dArr[d++] = CA[(i >>> 12) & 0x3f];
            __CLR4_1_1022ur22urluszwi1m.R.inc(97032);dArr[d++] = CA[(i >>> 6) & 0x3f];
            __CLR4_1_1022ur22urluszwi1m.R.inc(97033);dArr[d++] = CA[i & 0x3f];

            // Add optional line separator
            __CLR4_1_1022ur22urluszwi1m.R.inc(97034);if ((((lineSep && ++cc == 19 && d < dLen - 2)&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97035)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97036)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97037);dArr[d++] = '\r';
                __CLR4_1_1022ur22urluszwi1m.R.inc(97038);dArr[d++] = '\n';
                __CLR4_1_1022ur22urluszwi1m.R.inc(97039);cc = 0;
            }
        }}

        // Pad and encode last bits if source isn't even 24 bits.
        }__CLR4_1_1022ur22urluszwi1m.R.inc(97040);int left = sLen - eLen; // 0 - 2.
        __CLR4_1_1022ur22urluszwi1m.R.inc(97041);if ((((left > 0)&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97042)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97043)==0&false))) {{
            // Prepare the int
            __CLR4_1_1022ur22urluszwi1m.R.inc(97044);int i = ((sArr[eLen] & 0xff) << 10) | ((((left == 2 )&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97045)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97046)==0&false))? ((sArr[sLen - 1] & 0xff) << 2) : 0);

            // Set last four chars
            __CLR4_1_1022ur22urluszwi1m.R.inc(97047);dArr[dLen - 4] = CA[i >> 12];
            __CLR4_1_1022ur22urluszwi1m.R.inc(97048);dArr[dLen - 3] = CA[(i >>> 6) & 0x3f];
            __CLR4_1_1022ur22urluszwi1m.R.inc(97049);dArr[dLen - 2] = (((left == 2 )&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97050)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97051)==0&false))? CA[i & 0x3f] : '=';
            __CLR4_1_1022ur22urluszwi1m.R.inc(97052);dArr[dLen - 1] = '=';
        }
        }__CLR4_1_1022ur22urluszwi1m.R.inc(97053);return dArr;
    }finally{__CLR4_1_1022ur22urluszwi1m.R.flushNeeded();}}

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
    public final static String encodeToBase64String(byte[] sArr, boolean lineSep) {try{__CLR4_1_1022ur22urluszwi1m.R.inc(97054);
        // Reuse char[] since we can't create a String incrementally anyway and StringBuffer/Builder would be slower.
        __CLR4_1_1022ur22urluszwi1m.R.inc(97055);return new String(encodeToChar(sArr, lineSep));
    }finally{__CLR4_1_1022ur22urluszwi1m.R.flushNeeded();}}
    
    public static long getYoungGC() {try{__CLR4_1_1022ur22urluszwi1m.R.inc(97056);
        __CLR4_1_1022ur22urluszwi1m.R.inc(97057);try {
            // java.lang:type=GarbageCollector,name=G1 Young Generation
            // java.lang:type=GarbageCollector,name=G1 Old Generation
            __CLR4_1_1022ur22urluszwi1m.R.inc(97058);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022ur22urluszwi1m.R.inc(97059);ObjectName objectName;
            __CLR4_1_1022ur22urluszwi1m.R.inc(97060);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97061)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97062)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97063);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97064);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97065)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97066)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97067);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97068);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97069)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97070)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97071);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97072);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_1022ur22urluszwi1m.R.inc(97073);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_1022ur22urluszwi1m.R.inc(97074);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_1022ur22urluszwi1m.R.flushNeeded();}}
    
    public static long getYoungGCTime() {try{__CLR4_1_1022ur22urluszwi1m.R.inc(97075);
        __CLR4_1_1022ur22urluszwi1m.R.inc(97076);try {
            __CLR4_1_1022ur22urluszwi1m.R.inc(97077);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022ur22urluszwi1m.R.inc(97078);ObjectName objectName;
            __CLR4_1_1022ur22urluszwi1m.R.inc(97079);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ParNew")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97080)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97081)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97082);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ParNew");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97083);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=Copy")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97084)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97085)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97086);objectName = new ObjectName("java.lang:type=GarbageCollector,name=Copy");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97087);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97088)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97089)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97090);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Young Generation");
            } }else {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97091);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS Scavenge");
            }

            }}}__CLR4_1_1022ur22urluszwi1m.R.inc(97092);return (Long) mbeanServer.getAttribute(objectName, "CollectionTime");
        } catch (Exception e) {
            __CLR4_1_1022ur22urluszwi1m.R.inc(97093);throw new RuntimeException("error", e);
        }
    }finally{__CLR4_1_1022ur22urluszwi1m.R.flushNeeded();}}

    public static long getFullGC() {try{__CLR4_1_1022ur22urluszwi1m.R.inc(97094);
        __CLR4_1_1022ur22urluszwi1m.R.inc(97095);try {
            __CLR4_1_1022ur22urluszwi1m.R.inc(97096);MBeanServer mbeanServer = ManagementFactory.getPlatformMBeanServer();
            __CLR4_1_1022ur22urluszwi1m.R.inc(97097);ObjectName objectName;

            __CLR4_1_1022ur22urluszwi1m.R.inc(97098);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97099)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97100)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97101);objectName = new ObjectName("java.lang:type=GarbageCollector,name=ConcurrentMarkSweep");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97102);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97103)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97104)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97105);objectName = new ObjectName("java.lang:type=GarbageCollector,name=MarkSweepCompact");
            } }else {__CLR4_1_1022ur22urluszwi1m.R.inc(97106);if ((((mbeanServer.isRegistered(new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation")))&&(__CLR4_1_1022ur22urluszwi1m.R.iget(97107)!=0|true))||(__CLR4_1_1022ur22urluszwi1m.R.iget(97108)==0&false))) {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97109);objectName = new ObjectName("java.lang:type=GarbageCollector,name=G1 Old Generation");
            } }else {{
                __CLR4_1_1022ur22urluszwi1m.R.inc(97110);objectName = new ObjectName("java.lang:type=GarbageCollector,name=PS MarkSweep");
            }

            }}}__CLR4_1_1022ur22urluszwi1m.R.inc(97111);return (Long) mbeanServer.getAttribute(objectName, "CollectionCount");
        } catch (Exception e) {
            __CLR4_1_1022ur22urluszwi1m.R.inc(97112);throw new RuntimeException("error");
        }
    }finally{__CLR4_1_1022ur22urluszwi1m.R.flushNeeded();}}
}
