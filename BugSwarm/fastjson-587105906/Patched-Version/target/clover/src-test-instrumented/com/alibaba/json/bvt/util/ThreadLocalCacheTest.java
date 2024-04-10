/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alibaba.fastjson.util.ThreadLocalCache;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;

import junit.framework.TestCase;

public class ThreadLocalCacheTest extends TestCase {static class __CLR4_5_21xx81xx8lusyjvsr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,90698,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test() throws Exception {__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceStart(getClass().getName(),90620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt31xx8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xx81xx8lusyjvsr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt31xx8() throws Exception{try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90620);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90621);clearChars();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90622);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90623);Assert.assertEquals(allocateChars(1024).length, 1024 * 64);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90624);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90625);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90626);Assert.assertEquals(allocateChars(1024 * 128).length, 1024 * 128);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90627);Assert.assertEquals(allocateChars(0).length, 1024 * 64);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90628);clearChars();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90629);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90630);clearChars();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90631);Assert.assertEquals(allocateChars(1024 * 256).length, 1024 * 256);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90632);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90633);clearChars();

    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}
    
    static char[] allocateChars(int length) throws Exception {try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90634);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90635);Method method = JSON.class.getDeclaredMethod("allocateChars", int.class);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90636);method.setAccessible(true);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90637);return (char[]) method.invoke(null, length);
    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}
    
    public static void clearChars() throws Exception {try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90638);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90639);Field field = JSON.class.getDeclaredField("charsLocal");
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90640);field.setAccessible(true);
        
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90641);ThreadLocal<char[]> charsLocal = (ThreadLocal<char[]>) field.get(null);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90642);charsLocal.set(null);
    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}

    public void testBytes() throws Exception {__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceStart(getClass().getName(),90643);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mda7fk1xxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xx81xx8lusyjvsr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.testBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90643,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mda7fk1xxv() throws Exception{try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90643);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90644);clearBytes();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90645);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90646);Assert.assertEquals(getBytes(1024).length, 8192);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90647);Assert.assertEquals(getBytes(8192 * 2).length, 8192 * 2);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90648);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90649);Assert.assertSame(getBytes(0), getBytes(1204));
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90650);Assert.assertNotSame(getBytes(9000), getBytes(9000));

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90651);clearBytes();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90652);Assert.assertEquals(getBytes(2048).length, 8192);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90653);clearBytes();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90654);Assert.assertEquals(getBytes(1024 * 256).length, 1024 * 256);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90655);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90656);clearBytes();

    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}
    
    public static byte[] getBytes(int length) throws Exception {try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90657);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90658);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90659);field.setAccessible(true);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90660);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90661);byte[] bytes = bytesBufLocal.get();

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90662);if ((((bytes == null)&&(__CLR4_5_21xx81xx8lusyjvsr.R.iget(90663)!=0|true))||(__CLR4_5_21xx81xx8lusyjvsr.R.iget(90664)==0&false))) {{
            __CLR4_5_21xx81xx8lusyjvsr.R.inc(90665);bytes = new byte[1024 * 8];
            __CLR4_5_21xx81xx8lusyjvsr.R.inc(90666);bytesBufLocal.set(bytes);
        }
        
        }__CLR4_5_21xx81xx8lusyjvsr.R.inc(90667);return (((bytes.length < length //
            )&&(__CLR4_5_21xx81xx8lusyjvsr.R.iget(90668)!=0|true))||(__CLR4_5_21xx81xx8lusyjvsr.R.iget(90669)==0&false))? new byte[length] //
            : bytes;
    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}
    
    public static void clearBytes() throws Exception {try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90670);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90671);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90672);field.setAccessible(true);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90673);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90674);bytesBufLocal.set(null);
    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}

    public void test_chars() throws Exception {__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceStart(getClass().getName(),90675);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4jewn1xyr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xx81xx8lusyjvsr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_chars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90675,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4jewn1xyr() throws Exception{try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90675);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90676);ThreadLocalCache.getChars(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90677);ThreadLocalCache.getChars(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90678);ThreadLocalCache.getChars(20);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90679);ThreadLocalCache.getChars(30);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90680);clearChars();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90681);ThreadLocalCache.getChars(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90682);ThreadLocalCache.getChars(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90683);ThreadLocalCache.getChars(20);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90684);ThreadLocalCache.getChars(30);

        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90685);ThreadLocalCache.clearChars();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90686);ThreadLocalCache.getUTF8Decoder();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90687);ThreadLocalCache.getUTF8Decoder();
    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}

    public void test_bytes() throws Exception {__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceStart(getClass().getName(),90688);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yidwcl1xz4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21xx81xx8lusyjvsr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21xx81xx8lusyjvsr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_bytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90688,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yidwcl1xz4() throws Exception{try{__CLR4_5_21xx81xx8lusyjvsr.R.inc(90688);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90689);ThreadLocalCache.getBytes(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90690);ThreadLocalCache.getBytes(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90691);ThreadLocalCache.getBytes(20);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90692);ThreadLocalCache.getBytes(30);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90693);clearBytes();
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90694);ThreadLocalCache.getBytes(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90695);ThreadLocalCache.getBytes(10);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90696);ThreadLocalCache.getBytes(20);
        __CLR4_5_21xx81xx8lusyjvsr.R.inc(90697);ThreadLocalCache.getBytes(30);

    }finally{__CLR4_5_21xx81xx8lusyjvsr.R.flushNeeded();}}

}
