/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest2 extends TestCase {static class __CLR4_1_101jrv1jrvluszwctf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72337,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72283);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21jrv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72283,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21jrv() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72283);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72284);Assert.assertNull(TypeUtils.cast("", Entity.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72285);Assert.assertNull(TypeUtils.cast("", Type.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72286);Assert.assertNull(TypeUtils.cast("", Byte.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72287);Assert.assertNull(TypeUtils.cast("", Short.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72288);Assert.assertNull(TypeUtils.cast("", Integer.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72289);Assert.assertNull(TypeUtils.cast("", Long.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72290);Assert.assertNull(TypeUtils.cast("", Float.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72291);Assert.assertNull(TypeUtils.cast("", Double.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72292);Assert.assertNull(TypeUtils.cast("", Character.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72293);Assert.assertNull(TypeUtils.cast("", java.util.Date.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72294);Assert.assertNull(TypeUtils.cast("", java.sql.Date.class, null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72295);Assert.assertNull(TypeUtils.cast("", java.sql.Timestamp.class, null));

        __CLR4_1_101jrv1jrvluszwctf.R.inc(72296);Assert.assertNull(TypeUtils.castToChar(""));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72297);Assert.assertNull(TypeUtils.castToChar(null));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72298);Assert.assertEquals('A', TypeUtils.castToChar('A').charValue());
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72299);Assert.assertEquals('A', TypeUtils.castToChar("A").charValue());

        __CLR4_1_101jrv1jrvluszwctf.R.inc(72300);Assert.assertNull(TypeUtils.castToBigDecimal(""));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72301);Assert.assertNull(TypeUtils.castToBigInteger(""));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72302);Assert.assertNull(TypeUtils.castToBoolean(""));
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72303);Assert.assertNull(TypeUtils.castToEnum("", Type.class, null));
        
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72304);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<Pair<Object, Object>>() {

        }.getType(), null));
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72305);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1jsh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72305,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1jsh() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72305);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72306);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<List<Object>>() {

        }.getType(), null));

    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72307);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1jsj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72307,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1jsj() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72307);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72308);Exception error = null;
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72309);try {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72310);Assert.assertEquals(null, TypeUtils.cast("a", new TypeReference<List<Object>>() {

            }.getType(), null));
        } catch (JSONException e) {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72311);error = e;
        }
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72312);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72313);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1jsp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72313,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1jsp() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72313);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72314);Exception error = null;
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72315);try {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72316);Assert.assertEquals(null, TypeUtils.cast("a", new TypeReference<Pair<Object, Object>>() {

            }.getType(), null));
        } catch (JSONException e) {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72317);error = e;
        }
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72318);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1jsv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72319,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1jsv() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72319);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72320);Exception error = null;
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72321);try {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72322);Assert.assertEquals(null, TypeUtils.cast("a", ((ParameterizedType) new TypeReference<List<?>>() {

            }.getType()).getActualTypeArguments()[0], null));
        } catch (JSONException e) {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72323);error = e;
        }
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72324);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72325);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1jt1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72325,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1jt1() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72325);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72326);Exception error = null;
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72327);try {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72328);TypeUtils.castToChar("abc");
        } catch (JSONException e) {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72329);error = e;
        }
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72330);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101jrv1jrvluszwctf.R.globalSliceStart(getClass().getName(),72331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1jt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jrv1jrvluszwctf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jrv1jrvluszwctf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72331,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1jt7() throws Exception{try{__CLR4_1_101jrv1jrvluszwctf.R.inc(72331);
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72332);Exception error = null;
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72333);try {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72334);TypeUtils.castToChar(true);
        } catch (JSONException e) {
            __CLR4_1_101jrv1jrvluszwctf.R.inc(72335);error = e;
        }
        __CLR4_1_101jrv1jrvluszwctf.R.inc(72336);Assert.assertNotNull(error);
    }finally{__CLR4_1_101jrv1jrvluszwctf.R.flushNeeded();}}

    public static class Entity {

    }

    public static class Pair<K, V> {

    }

    public static enum Type {
        A, B, C
    }

}
