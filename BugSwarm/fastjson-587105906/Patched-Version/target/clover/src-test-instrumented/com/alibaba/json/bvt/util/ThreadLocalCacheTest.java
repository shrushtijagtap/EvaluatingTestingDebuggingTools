/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alibaba.fastjson.util.ThreadLocalCache;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;

import junit.framework.TestCase;

public class ThreadLocalCacheTest extends TestCase {static class __CLR4_5_21yvg1yvglusvni1m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,91930,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test() throws Exception {__CLR4_5_21yvg1yvglusvni1m.R.globalSliceStart(getClass().getName(),91852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zi4lt31yvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yvg1yvglusvni1m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yvg1yvglusvni1m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zi4lt31yvg() throws Exception{try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91852);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91853);clearChars();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91854);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91855);Assert.assertEquals(allocateChars(1024).length, 1024 * 64);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91856);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91857);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91858);Assert.assertEquals(allocateChars(1024 * 128).length, 1024 * 128);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91859);Assert.assertEquals(allocateChars(0).length, 1024 * 64);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91860);clearChars();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91861);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91862);clearChars();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91863);Assert.assertEquals(allocateChars(1024 * 256).length, 1024 * 256);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91864);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91865);clearChars();

    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}
    
    static char[] allocateChars(int length) throws Exception {try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91866);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91867);Method method = JSON.class.getDeclaredMethod("allocateChars", int.class);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91868);method.setAccessible(true);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91869);return (char[]) method.invoke(null, length);
    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}
    
    public static void clearChars() throws Exception {try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91870);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91871);Field field = JSON.class.getDeclaredField("charsLocal");
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91872);field.setAccessible(true);
        
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91873);ThreadLocal<char[]> charsLocal = (ThreadLocal<char[]>) field.get(null);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91874);charsLocal.set(null);
    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}

    public void testBytes() throws Exception {__CLR4_5_21yvg1yvglusvni1m.R.globalSliceStart(getClass().getName(),91875);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mda7fk1yw3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yvg1yvglusvni1m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yvg1yvglusvni1m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.testBytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91875,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mda7fk1yw3() throws Exception{try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91875);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91876);clearBytes();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91877);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91878);Assert.assertEquals(getBytes(1024).length, 8192);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91879);Assert.assertEquals(getBytes(8192 * 2).length, 8192 * 2);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91880);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91881);Assert.assertSame(getBytes(0), getBytes(1204));
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91882);Assert.assertNotSame(getBytes(9000), getBytes(9000));

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91883);clearBytes();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91884);Assert.assertEquals(getBytes(2048).length, 8192);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91885);clearBytes();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91886);Assert.assertEquals(getBytes(1024 * 256).length, 1024 * 256);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91887);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91888);clearBytes();

    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}
    
    public static byte[] getBytes(int length) throws Exception {try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91889);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91890);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91891);field.setAccessible(true);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91892);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91893);byte[] bytes = bytesBufLocal.get();

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91894);if ((((bytes == null)&&(__CLR4_5_21yvg1yvglusvni1m.R.iget(91895)!=0|true))||(__CLR4_5_21yvg1yvglusvni1m.R.iget(91896)==0&false))) {{
            __CLR4_5_21yvg1yvglusvni1m.R.inc(91897);bytes = new byte[1024 * 8];
            __CLR4_5_21yvg1yvglusvni1m.R.inc(91898);bytesBufLocal.set(bytes);
        }
        
        }__CLR4_5_21yvg1yvglusvni1m.R.inc(91899);return (((bytes.length < length //
            )&&(__CLR4_5_21yvg1yvglusvni1m.R.iget(91900)!=0|true))||(__CLR4_5_21yvg1yvglusvni1m.R.iget(91901)==0&false))? new byte[length] //
            : bytes;
    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}
    
    public static void clearBytes() throws Exception {try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91902);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91903);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91904);field.setAccessible(true);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91905);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91906);bytesBufLocal.set(null);
    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}

    public void test_chars() throws Exception {__CLR4_5_21yvg1yvglusvni1m.R.globalSliceStart(getClass().getName(),91907);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2w4jewn1ywz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yvg1yvglusvni1m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yvg1yvglusvni1m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_chars",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91907,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2w4jewn1ywz() throws Exception{try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91907);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91908);ThreadLocalCache.getChars(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91909);ThreadLocalCache.getChars(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91910);ThreadLocalCache.getChars(20);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91911);ThreadLocalCache.getChars(30);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91912);clearChars();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91913);ThreadLocalCache.getChars(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91914);ThreadLocalCache.getChars(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91915);ThreadLocalCache.getChars(20);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91916);ThreadLocalCache.getChars(30);

        __CLR4_5_21yvg1yvglusvni1m.R.inc(91917);ThreadLocalCache.clearChars();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91918);ThreadLocalCache.getUTF8Decoder();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91919);ThreadLocalCache.getUTF8Decoder();
    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}

    public void test_bytes() throws Exception {__CLR4_5_21yvg1yvglusvni1m.R.globalSliceStart(getClass().getName(),91920);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yidwcl1yxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21yvg1yvglusvni1m.R.rethrow($CLV_t2$);}finally{__CLR4_5_21yvg1yvglusvni1m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_bytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),91920,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yidwcl1yxc() throws Exception{try{__CLR4_5_21yvg1yvglusvni1m.R.inc(91920);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91921);ThreadLocalCache.getBytes(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91922);ThreadLocalCache.getBytes(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91923);ThreadLocalCache.getBytes(20);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91924);ThreadLocalCache.getBytes(30);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91925);clearBytes();
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91926);ThreadLocalCache.getBytes(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91927);ThreadLocalCache.getBytes(10);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91928);ThreadLocalCache.getBytes(20);
        __CLR4_5_21yvg1yvglusvni1m.R.inc(91929);ThreadLocalCache.getBytes(30);

    }finally{__CLR4_5_21yvg1yvglusvni1m.R.flushNeeded();}}

}
