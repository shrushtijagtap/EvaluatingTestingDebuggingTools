/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeAsArray;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class WriteAsArray_float2_public extends TestCase {static class __CLR4_1_101yce1ycelusqko6j{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,91201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0 () throws Exception {__CLR4_1_101yce1ycelusqko6j.R.globalSliceStart(getClass().getName(),91166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21yce();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yce1ycelusqko6j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yce1ycelusqko6j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91166,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21yce() throws Exception{try{__CLR4_1_101yce1ycelusqko6j.R.inc(91166);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91167);VO vo = new VO();
        __CLR4_1_101yce1ycelusqko6j.R.inc(91168);vo.setId(123F);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91169);vo.setName("wenshao");
        
        __CLR4_1_101yce1ycelusqko6j.R.inc(91170);String text = JSON.toJSONString(vo, SerializerFeature.BeanToArray);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91171);Assert.assertEquals("[123.0,\"wenshao\"]", text);
        
        __CLR4_1_101yce1ycelusqko6j.R.inc(91172);VO vo2 = JSON.parseObject(text, VO.class, Feature.SupportArrayToBean);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91173);Assert.assertTrue(vo.id == vo2.id);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91174);Assert.assertEquals(vo.name, vo2.name);
    }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_1_101yce1ycelusqko6j.R.globalSliceStart(getClass().getName(),91175);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1ycn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yce1ycelusqko6j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yce1ycelusqko6j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91175,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1ycn() throws Exception{try{__CLR4_1_101yce1ycelusqko6j.R.inc(91175);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91176);Exception error = null;
        __CLR4_1_101yce1ycelusqko6j.R.inc(91177);try {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91178);JSON.parseObject("[123.A,\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91179);error = ex;
        }
        __CLR4_1_101yce1ycelusqko6j.R.inc(91180);Assert.assertNotNull(error);
    }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}
    
    public void test_error1() throws Exception {__CLR4_1_101yce1ycelusqko6j.R.globalSliceStart(getClass().getName(),91181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1084g0lf1yct();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yce1ycelusqko6j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yce1ycelusqko6j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91181,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1084g0lf1yct() throws Exception{try{__CLR4_1_101yce1ycelusqko6j.R.inc(91181);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91182);Exception error = null;
        __CLR4_1_101yce1ycelusqko6j.R.inc(91183);try {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91184);JSON.parseObject("[\"A\",\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91185);error = ex;
        }
        __CLR4_1_101yce1ycelusqko6j.R.inc(91186);Assert.assertNotNull(error);
    }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}
    
    public void test_error2() throws Exception {__CLR4_1_101yce1ycelusqko6j.R.globalSliceStart(getClass().getName(),91187);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vg1sy1ycz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yce1ycelusqko6j.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yce1ycelusqko6j.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeAsArray.WriteAsArray_float2_public.test_error2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),91187,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vg1sy1ycz() throws Exception{try{__CLR4_1_101yce1ycelusqko6j.R.inc(91187);
        __CLR4_1_101yce1ycelusqko6j.R.inc(91188);Exception error = null;
        __CLR4_1_101yce1ycelusqko6j.R.inc(91189);try {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91190);JSON.parseObject("[123:\"wenshao\"]", VO.class, Feature.SupportArrayToBean);
        } catch (JSONException ex) {
            __CLR4_1_101yce1ycelusqko6j.R.inc(91191);error = ex;
        }
        __CLR4_1_101yce1ycelusqko6j.R.inc(91192);Assert.assertNotNull(error);
    }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}
    
    public static class VO {
        private float id;
        private String name;

        public float getId() {try{__CLR4_1_101yce1ycelusqko6j.R.inc(91193);
            __CLR4_1_101yce1ycelusqko6j.R.inc(91194);return id;
        }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}

        public void setId(float id) {try{__CLR4_1_101yce1ycelusqko6j.R.inc(91195);
            __CLR4_1_101yce1ycelusqko6j.R.inc(91196);this.id = id;
        }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101yce1ycelusqko6j.R.inc(91197);
            __CLR4_1_101yce1ycelusqko6j.R.inc(91198);return name;
        }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101yce1ycelusqko6j.R.inc(91199);
            __CLR4_1_101yce1ycelusqko6j.R.inc(91200);this.name = name;
        }finally{__CLR4_1_101yce1ycelusqko6j.R.flushNeeded();}}
    }
}
