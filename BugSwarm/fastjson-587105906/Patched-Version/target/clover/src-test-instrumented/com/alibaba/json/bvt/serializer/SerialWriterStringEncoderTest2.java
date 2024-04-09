/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CoderResult;

import org.junit.Assert;

import com.alibaba.fastjson.serializer.SerializeWriter;

import junit.framework.TestCase;

public class SerialWriterStringEncoderTest2 extends TestCase {static class __CLR4_5_21tjl1tjllusvnghs{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84979,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error_0() throws Exception {__CLR4_5_21tjl1tjllusvnghs.R.globalSliceStart(getClass().getName(),84945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1tjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tjl1tjllusvnghs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tjl1tjllusvnghs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerialWriterStringEncoderTest2.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84945,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1tjl() throws Exception{try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84945);
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84946);Charset charset = Charset.forName("UTF-8");
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84947);CharsetEncoder charsetEncoder = new MockCharsetEncoder2(charset);
     

        __CLR4_5_21tjl1tjllusvnghs.R.inc(84948);Exception error = null;
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84949);char[] chars = "abc".toCharArray();
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84950);try {
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84951);encode(charsetEncoder, chars, 0, chars.length);
        } catch (Exception ex) {
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84952);error = ex;
        }
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84953);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_21tjl1tjllusvnghs.R.globalSliceStart(getClass().getName(),84954);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1tju();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tjl1tjllusvnghs.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tjl1tjllusvnghs.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SerialWriterStringEncoderTest2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84954,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1tju() throws Exception{try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84954);
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84955);Charset charset = Charset.forName("UTF-8");
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84956);CharsetEncoder realEncoder = charset.newEncoder();
        
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84957);CharsetEncoder charsetEncoder = new MockCharsetEncoder(charset, realEncoder);

        __CLR4_5_21tjl1tjllusvnghs.R.inc(84958);Exception error = null;
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84959);char[] chars = "abc".toCharArray();
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84960);try {
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84961);encode(charsetEncoder, chars, 0, chars.length);
        } catch (Exception ex) {
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84962);error = ex;
        }
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84963);Assert.assertNotNull(error);
    }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}
    
    public static byte[] encode(CharsetEncoder encoder, char[] chars, int off, int len) throws Exception {try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84964);
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84965);Method method = SerializeWriter.class.getDeclaredMethod("encode", CharsetEncoder.class, char[].class, int.class, int.class);
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84966);method.setAccessible(true);
        __CLR4_5_21tjl1tjllusvnghs.R.inc(84967);return (byte[]) method.invoke(null, encoder, chars, off, len);
    }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}

    public static class MockCharsetEncoder extends CharsetEncoder {
        private CharsetEncoder raw;
        protected MockCharsetEncoder(Charset cs, CharsetEncoder raw){
            super(cs, raw.averageBytesPerChar(), raw.maxBytesPerChar());__CLR4_5_21tjl1tjllusvnghs.R.inc(84969);try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84968);
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84970);this.raw = raw;
        }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}

        @Override
        protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84971);
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84972);return raw.encode(in, out, false);
        }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}

        protected CoderResult implFlush(ByteBuffer out) {try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84973);
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84974);return CoderResult.malformedForLength(1);
            }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}
    }
    
    public static class MockCharsetEncoder2 extends CharsetEncoder {

        protected MockCharsetEncoder2(Charset cs){
            super(cs, 2, 2);__CLR4_5_21tjl1tjllusvnghs.R.inc(84976);try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84975);
        }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}

        @Override
        protected CoderResult encodeLoop(CharBuffer in, ByteBuffer out) {try{__CLR4_5_21tjl1tjllusvnghs.R.inc(84977);
            __CLR4_5_21tjl1tjllusvnghs.R.inc(84978);return CoderResult.OVERFLOW;
        }finally{__CLR4_5_21tjl1tjllusvnghs.R.flushNeeded();}}

    }
}
