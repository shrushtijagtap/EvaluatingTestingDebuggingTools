/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.alibaba.fastjson.util.ThreadLocalCache;
import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.util.IOUtils;

import junit.framework.TestCase;

public class ThreadLocalCacheTest extends TestCase {static class __CLR4_1_101yvr1yvrluszwgck{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,91941,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test() throws Exception {__CLR4_1_101yvr1yvrluszwgck.R.globalSliceStart(getClass().getName(),91863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi4lt31yvr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yvr1yvrluszwgck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yvr1yvrluszwgck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi4lt31yvr() throws Exception{try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91863);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91864);clearChars();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91865);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91866);Assert.assertEquals(allocateChars(1024).length, 1024 * 64);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91867);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91868);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91869);Assert.assertEquals(allocateChars(1024 * 128).length, 1024 * 128);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91870);Assert.assertEquals(allocateChars(0).length, 1024 * 64);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91871);clearChars();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91872);Assert.assertEquals(allocateChars(2048).length, 1024 * 64);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91873);clearChars();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91874);Assert.assertEquals(allocateChars(1024 * 256).length, 1024 * 256);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91875);Assert.assertEquals(allocateChars(0).length, 1024 * 64);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91876);clearChars();

    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}
    
    static char[] allocateChars(int length) throws Exception {try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91877);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91878);Method method = JSON.class.getDeclaredMethod("allocateChars", int.class);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91879);method.setAccessible(true);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91880);return (char[]) method.invoke(null, length);
    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}
    
    public static void clearChars() throws Exception {try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91881);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91882);Field field = JSON.class.getDeclaredField("charsLocal");
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91883);field.setAccessible(true);
        
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91884);ThreadLocal<char[]> charsLocal = (ThreadLocal<char[]>) field.get(null);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91885);charsLocal.set(null);
    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}

    public void testBytes() throws Exception {__CLR4_1_101yvr1yvrluszwgck.R.globalSliceStart(getClass().getName(),91886);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mda7fk1ywe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yvr1yvrluszwgck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yvr1yvrluszwgck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.testBytes",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91886,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mda7fk1ywe() throws Exception{try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91886);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91887);clearBytes();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91888);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91889);Assert.assertEquals(getBytes(1024).length, 8192);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91890);Assert.assertEquals(getBytes(8192 * 2).length, 8192 * 2);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91891);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91892);Assert.assertSame(getBytes(0), getBytes(1204));
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91893);Assert.assertNotSame(getBytes(9000), getBytes(9000));

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91894);clearBytes();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91895);Assert.assertEquals(getBytes(2048).length, 8192);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91896);clearBytes();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91897);Assert.assertEquals(getBytes(1024 * 256).length, 1024 * 256);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91898);Assert.assertEquals(getBytes(0).length, 8192);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91899);clearBytes();

    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}
    
    public static byte[] getBytes(int length) throws Exception {try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91900);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91901);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91902);field.setAccessible(true);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91903);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91904);byte[] bytes = bytesBufLocal.get();

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91905);if ((((bytes == null)&&(__CLR4_1_101yvr1yvrluszwgck.R.iget(91906)!=0|true))||(__CLR4_1_101yvr1yvrluszwgck.R.iget(91907)==0&false))) {{
            __CLR4_1_101yvr1yvrluszwgck.R.inc(91908);bytes = new byte[1024 * 8];
            __CLR4_1_101yvr1yvrluszwgck.R.inc(91909);bytesBufLocal.set(bytes);
        }
        
        }__CLR4_1_101yvr1yvrluszwgck.R.inc(91910);return (((bytes.length < length //
            )&&(__CLR4_1_101yvr1yvrluszwgck.R.iget(91911)!=0|true))||(__CLR4_1_101yvr1yvrluszwgck.R.iget(91912)==0&false))? new byte[length] //
            : bytes;
    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}
    
    public static void clearBytes() throws Exception {try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91913);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91914);Field field = SerializeWriter.class.getDeclaredField("bytesBufLocal");
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91915);field.setAccessible(true);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91916);ThreadLocal<byte[]> bytesBufLocal = (ThreadLocal<byte[]>) field.get(null);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91917);bytesBufLocal.set(null);
    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}

    public void test_chars() throws Exception {__CLR4_1_101yvr1yvrluszwgck.R.globalSliceStart(getClass().getName(),91918);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10w4jewn1yxa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yvr1yvrluszwgck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yvr1yvrluszwgck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_chars",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91918,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10w4jewn1yxa() throws Exception{try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91918);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91919);ThreadLocalCache.getChars(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91920);ThreadLocalCache.getChars(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91921);ThreadLocalCache.getChars(20);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91922);ThreadLocalCache.getChars(30);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91923);clearChars();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91924);ThreadLocalCache.getChars(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91925);ThreadLocalCache.getChars(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91926);ThreadLocalCache.getChars(20);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91927);ThreadLocalCache.getChars(30);

        __CLR4_1_101yvr1yvrluszwgck.R.inc(91928);ThreadLocalCache.clearChars();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91929);ThreadLocalCache.getUTF8Decoder();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91930);ThreadLocalCache.getUTF8Decoder();
    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}

    public void test_bytes() throws Exception {__CLR4_1_101yvr1yvrluszwgck.R.globalSliceStart(getClass().getName(),91931);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yidwcl1yxn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yvr1yvrluszwgck.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yvr1yvrluszwgck.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.ThreadLocalCacheTest.test_bytes",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91931,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yidwcl1yxn() throws Exception{try{__CLR4_1_101yvr1yvrluszwgck.R.inc(91931);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91932);ThreadLocalCache.getBytes(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91933);ThreadLocalCache.getBytes(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91934);ThreadLocalCache.getBytes(20);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91935);ThreadLocalCache.getBytes(30);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91936);clearBytes();
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91937);ThreadLocalCache.getBytes(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91938);ThreadLocalCache.getBytes(10);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91939);ThreadLocalCache.getBytes(20);
        __CLR4_1_101yvr1yvrluszwgck.R.inc(91940);ThreadLocalCache.getBytes(30);

    }finally{__CLR4_1_101yvr1yvrluszwgck.R.flushNeeded();}}

}
