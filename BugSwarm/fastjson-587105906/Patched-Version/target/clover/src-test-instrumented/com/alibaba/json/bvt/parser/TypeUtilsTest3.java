/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest3 extends TestCase {static class __CLR4_5_21jt21jt2lusvndpt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,72367,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_enum() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72326);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22onyzv1jt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72326,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22onyzv1jt2() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72326);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72327);Assert.assertEquals(Type.A, JSON.parseObject("\"A\"", Type.class));
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72328);Assert.assertEquals(Type.A, JSON.parseObject("" + Type.A.ordinal(), Type.class));
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72329);Assert.assertEquals(Type.B, JSON.parseObject("" + Type.B.ordinal(), Type.class));
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72330);Assert.assertEquals(Type.C, JSON.parseObject("" + Type.C.ordinal(), Type.class));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    public void test_enum_2() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72331);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fw2z2w1jt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_enum_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72331,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fw2z2w1jt7() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72331);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72332);Assert.assertEquals(Type.A, TypeUtils.cast("A", Type.class, null));
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72333);Assert.assertEquals(Type.A, TypeUtils.cast(Type.A.ordinal(), Type.class, null));
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72334);Assert.assertEquals(Type.B, TypeUtils.cast(Type.B.ordinal(), Type.class, null));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72335);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1jtb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72335,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1jtb() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72335);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72336);assertNull(TypeUtils.castToEnum("\"A1\"", Type.class, null));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1jtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72337,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1jtd() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72337);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72338);Exception error = null;
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72339);try {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72340);TypeUtils.castToEnum(Boolean.TRUE, Type.class, null);
        } catch (Exception ex) {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72341);error = ex;
        }
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72342);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1jtj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72343,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1jtj() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72343);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72344);Exception error = null;
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72345);try {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72346);TypeUtils.castToEnum(1000, Type.class, null);
        } catch (Exception ex) {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72347);error = ex;
        }
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72348);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72349);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1jtp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72349,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1jtp() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72349);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72350);Assert.assertEquals(null, TypeUtils.cast(null, new TypeReference<Object>() {
        }.getType(), null));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}
    
    public void test_null_1() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dg3d0z1jtr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72351,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dg3d0z1jtr() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72351);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72352);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<List<Object>>() {
        }.getType(), null));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}
    
    public void test_null_2() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a73e8i1jtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72353,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a73e8i1jtt() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72353);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72354);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<Object[]>() {
        }.getType(), null));
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72355);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1jtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72355,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1jtv() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72355);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72356);Exception error = null;
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72357);try {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72358);TypeUtils.cast("xxx", new TypeReference<Object[]>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_5_21jt21jt2lusvndpt.R.inc(72359);error = ex;
        }
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72360);Assert.assertNotNull(error);
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    
    public void test_ex() throws Exception {__CLR4_5_21jt21jt2lusvndpt.R.globalSliceStart(getClass().getName(),72361);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ixbg91ju1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21jt21jt2lusvndpt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21jt21jt2lusvndpt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_ex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),72361,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ixbg91ju1() throws Exception{try{__CLR4_5_21jt21jt2lusvndpt.R.inc(72361);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72362);RuntimeException ex = new RuntimeException();
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72363);JSONObject object = (JSONObject) JSON.toJSON(ex);
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72364);JSONArray array = object.getJSONArray("stackTrace");
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72365);array.getJSONObject(0).put("lineNumber", null);
        
        __CLR4_5_21jt21jt2lusvndpt.R.inc(72366);JSON.parseObject(object.toJSONString(), Exception.class);
    }finally{__CLR4_5_21jt21jt2lusvndpt.R.flushNeeded();}}

    public static enum Type {
        A, B, C
    }
}
