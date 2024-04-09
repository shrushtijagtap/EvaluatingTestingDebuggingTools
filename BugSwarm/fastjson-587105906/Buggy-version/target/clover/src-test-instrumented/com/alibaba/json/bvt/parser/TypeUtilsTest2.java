/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest2 extends TestCase {static class __CLR4_1_101itn1itnlusqke4l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71105,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71051);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21itn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71051,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21itn() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71051);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71052);Assert.assertNull(TypeUtils.cast("", Entity.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71053);Assert.assertNull(TypeUtils.cast("", Type.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71054);Assert.assertNull(TypeUtils.cast("", Byte.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71055);Assert.assertNull(TypeUtils.cast("", Short.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71056);Assert.assertNull(TypeUtils.cast("", Integer.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71057);Assert.assertNull(TypeUtils.cast("", Long.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71058);Assert.assertNull(TypeUtils.cast("", Float.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71059);Assert.assertNull(TypeUtils.cast("", Double.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71060);Assert.assertNull(TypeUtils.cast("", Character.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71061);Assert.assertNull(TypeUtils.cast("", java.util.Date.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71062);Assert.assertNull(TypeUtils.cast("", java.sql.Date.class, null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71063);Assert.assertNull(TypeUtils.cast("", java.sql.Timestamp.class, null));

        __CLR4_1_101itn1itnlusqke4l.R.inc(71064);Assert.assertNull(TypeUtils.castToChar(""));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71065);Assert.assertNull(TypeUtils.castToChar(null));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71066);Assert.assertEquals('A', TypeUtils.castToChar('A').charValue());
        __CLR4_1_101itn1itnlusqke4l.R.inc(71067);Assert.assertEquals('A', TypeUtils.castToChar("A").charValue());

        __CLR4_1_101itn1itnlusqke4l.R.inc(71068);Assert.assertNull(TypeUtils.castToBigDecimal(""));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71069);Assert.assertNull(TypeUtils.castToBigInteger(""));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71070);Assert.assertNull(TypeUtils.castToBoolean(""));
        __CLR4_1_101itn1itnlusqke4l.R.inc(71071);Assert.assertNull(TypeUtils.castToEnum("", Type.class, null));
        
        __CLR4_1_101itn1itnlusqke4l.R.inc(71072);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<Pair<Object, Object>>() {

        }.getType(), null));
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71073);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1iu9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71073,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1iu9() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71073);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71074);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<List<Object>>() {

        }.getType(), null));

    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1iub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71075,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1iub() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71075);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71076);Exception error = null;
        __CLR4_1_101itn1itnlusqke4l.R.inc(71077);try {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71078);Assert.assertEquals(null, TypeUtils.cast("a", new TypeReference<List<Object>>() {

            }.getType(), null));
        } catch (JSONException e) {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71079);error = e;
        }
        __CLR4_1_101itn1itnlusqke4l.R.inc(71080);Assert.assertNotNull(error);
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71081);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1iuh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71081,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1iuh() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71081);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71082);Exception error = null;
        __CLR4_1_101itn1itnlusqke4l.R.inc(71083);try {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71084);Assert.assertEquals(null, TypeUtils.cast("a", new TypeReference<Pair<Object, Object>>() {

            }.getType(), null));
        } catch (JSONException e) {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71085);error = e;
        }
        __CLR4_1_101itn1itnlusqke4l.R.inc(71086);Assert.assertNotNull(error);
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71087);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1iun();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71087,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1iun() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71087);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71088);Exception error = null;
        __CLR4_1_101itn1itnlusqke4l.R.inc(71089);try {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71090);Assert.assertEquals(null, TypeUtils.cast("a", ((ParameterizedType) new TypeReference<List<?>>() {

            }.getType()).getActualTypeArguments()[0], null));
        } catch (JSONException e) {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71091);error = e;
        }
        __CLR4_1_101itn1itnlusqke4l.R.inc(71092);Assert.assertNotNull(error);
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1iut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71093,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1iut() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71093);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71094);Exception error = null;
        __CLR4_1_101itn1itnlusqke4l.R.inc(71095);try {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71096);TypeUtils.castToChar("abc");
        } catch (JSONException e) {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71097);error = e;
        }
        __CLR4_1_101itn1itnlusqke4l.R.inc(71098);Assert.assertNotNull(error);
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101itn1itnlusqke4l.R.globalSliceStart(getClass().getName(),71099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1iuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101itn1itnlusqke4l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101itn1itnlusqke4l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71099,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1iuz() throws Exception{try{__CLR4_1_101itn1itnlusqke4l.R.inc(71099);
        __CLR4_1_101itn1itnlusqke4l.R.inc(71100);Exception error = null;
        __CLR4_1_101itn1itnlusqke4l.R.inc(71101);try {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71102);TypeUtils.castToChar(true);
        } catch (JSONException e) {
            __CLR4_1_101itn1itnlusqke4l.R.inc(71103);error = e;
        }
        __CLR4_1_101itn1itnlusqke4l.R.inc(71104);Assert.assertNotNull(error);
    }finally{__CLR4_1_101itn1itnlusqke4l.R.flushNeeded();}}

    public static class Entity {

    }

    public static class Pair<K, V> {

    }

    public static enum Type {
        A, B, C
    }

}
