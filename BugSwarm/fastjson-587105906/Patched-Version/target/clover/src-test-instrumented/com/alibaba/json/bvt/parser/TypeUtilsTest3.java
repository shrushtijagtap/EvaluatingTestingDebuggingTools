/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest3 extends TestCase {static class __CLR4_5_21iuu1iuulusyjtui{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71135,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_enum() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71094);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22onyzv1iuu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71094,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22onyzv1iuu() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71094);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71095);Assert.assertEquals(Type.A, JSON.parseObject("\"A\"", Type.class));
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71096);Assert.assertEquals(Type.A, JSON.parseObject("" + Type.A.ordinal(), Type.class));
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71097);Assert.assertEquals(Type.B, JSON.parseObject("" + Type.B.ordinal(), Type.class));
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71098);Assert.assertEquals(Type.C, JSON.parseObject("" + Type.C.ordinal(), Type.class));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    public void test_enum_2() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71099);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2fw2z2w1iuz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_enum_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71099,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2fw2z2w1iuz() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71099);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71100);Assert.assertEquals(Type.A, TypeUtils.cast("A", Type.class, null));
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71101);Assert.assertEquals(Type.A, TypeUtils.cast(Type.A.ordinal(), Type.class, null));
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71102);Assert.assertEquals(Type.B, TypeUtils.cast(Type.B.ordinal(), Type.class, null));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71103);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1iv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71103,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1iv3() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71103);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71104);assertNull(TypeUtils.castToEnum("\"A1\"", Type.class, null));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71105);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1iv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71105,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1iv5() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71105);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71106);Exception error = null;
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71107);try {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71108);TypeUtils.castToEnum(Boolean.TRUE, Type.class, null);
        } catch (Exception ex) {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71109);error = ex;
        }
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71110);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71111);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1ivb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71111,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1ivb() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71111);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71112);Exception error = null;
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71113);try {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71114);TypeUtils.castToEnum(1000, Type.class, null);
        } catch (Exception ex) {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71115);error = ex;
        }
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71116);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71117);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1ivh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71117,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1ivh() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71117);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71118);Assert.assertEquals(null, TypeUtils.cast(null, new TypeReference<Object>() {
        }.getType(), null));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}
    
    public void test_null_1() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71119);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dg3d0z1ivj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71119,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dg3d0z1ivj() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71119);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71120);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<List<Object>>() {
        }.getType(), null));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}
    
    public void test_null_2() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a73e8i1ivl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_null_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a73e8i1ivl() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71121);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71122);Assert.assertEquals(null, TypeUtils.cast("", new TypeReference<Object[]>() {
        }.getType(), null));
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1ivn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71123,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1ivn() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71123);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71124);Exception error = null;
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71125);try {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71126);TypeUtils.cast("xxx", new TypeReference<Object[]>() {
            }.getType(), null);
        } catch (Exception ex) {
            __CLR4_5_21iuu1iuulusyjtui.R.inc(71127);error = ex;
        }
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71128);Assert.assertNotNull(error);
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    
    public void test_ex() throws Exception {__CLR4_5_21iuu1iuulusyjtui.R.globalSliceStart(getClass().getName(),71129);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28ixbg91ivt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21iuu1iuulusyjtui.R.rethrow($CLV_t2$);}finally{__CLR4_5_21iuu1iuulusyjtui.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest3.test_ex",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71129,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28ixbg91ivt() throws Exception{try{__CLR4_5_21iuu1iuulusyjtui.R.inc(71129);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71130);RuntimeException ex = new RuntimeException();
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71131);JSONObject object = (JSONObject) JSON.toJSON(ex);
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71132);JSONArray array = object.getJSONArray("stackTrace");
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71133);array.getJSONObject(0).put("lineNumber", null);
        
        __CLR4_5_21iuu1iuulusyjtui.R.inc(71134);JSON.parseObject(object.toJSONString(), Exception.class);
    }finally{__CLR4_5_21iuu1iuulusyjtui.R.flushNeeded();}}

    public static enum Type {
        A, B, C
    }
}
