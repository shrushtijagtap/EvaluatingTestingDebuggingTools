/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.asm;

import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.junit.Assert;

import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.util.ASMUtils;

public class ASMUtilsTest extends TestCase {static class __CLR4_5_210bv10bvlusyjqoz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,47094,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_isAnroid() throws Exception {__CLR4_5_210bv10bvlusyjqoz.R.globalSliceStart(getClass().getName(),47083);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hwordp10bv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210bv10bvlusyjqoz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210bv10bvlusyjqoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.ASMUtilsTest.test_isAnroid",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47083,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hwordp10bv() throws Exception{try{__CLR4_5_210bv10bvlusyjqoz.R.inc(47083);
        __CLR4_5_210bv10bvlusyjqoz.R.inc(47084);Assert.assertTrue(ASMUtils.isAndroid("Dalvik"));
    }finally{__CLR4_5_210bv10bvlusyjqoz.R.flushNeeded();}}

    public void test_getDescs() throws Exception {__CLR4_5_210bv10bvlusyjqoz.R.globalSliceStart(getClass().getName(),47085);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22lmetc10bx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210bv10bvlusyjqoz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210bv10bvlusyjqoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.ASMUtilsTest.test_getDescs",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47085,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22lmetc10bx() throws Exception{try{__CLR4_5_210bv10bvlusyjqoz.R.inc(47085);
        __CLR4_5_210bv10bvlusyjqoz.R.inc(47086);Assert.assertEquals("Lcom/alibaba/fastjson/parser/ParseContext;", ASMUtils.desc(ParseContext.class));
    }finally{__CLR4_5_210bv10bvlusyjqoz.R.flushNeeded();}}

    public void test_getType_null() throws Exception {__CLR4_5_210bv10bvlusyjqoz.R.globalSliceStart(getClass().getName(),47087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2owv76y10bz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210bv10bvlusyjqoz.R.rethrow($CLV_t2$);}finally{__CLR4_5_210bv10bvlusyjqoz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.asm.ASMUtilsTest.test_getType_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47087,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2owv76y10bz() throws Exception{try{__CLR4_5_210bv10bvlusyjqoz.R.inc(47087);
        __CLR4_5_210bv10bvlusyjqoz.R.inc(47088);Assert.assertNull(ASMUtils.getMethodType(ParseContext.class, "XX"));
    }finally{__CLR4_5_210bv10bvlusyjqoz.R.flushNeeded();}}
    
    public static Type getMethodType(Class<?> clazz, String methodName) {try{__CLR4_5_210bv10bvlusyjqoz.R.inc(47089);
        __CLR4_5_210bv10bvlusyjqoz.R.inc(47090);try {
            __CLR4_5_210bv10bvlusyjqoz.R.inc(47091);Method method = clazz.getMethod(methodName);

            __CLR4_5_210bv10bvlusyjqoz.R.inc(47092);return method.getGenericReturnType();
        } catch (Exception ex) {
            __CLR4_5_210bv10bvlusyjqoz.R.inc(47093);return null;
        }
    }finally{__CLR4_5_210bv10bvlusyjqoz.R.flushNeeded();}}
}
