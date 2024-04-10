/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class Bug_127_for_qiuyan81 extends TestCase {static class __CLR4_5_212rz12rzlusyjr3m{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,50308,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parserUndefined() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50255);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29hzbwr12rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50255,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29hzbwr12rz(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50255);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50256);String jsonString = "{PayStatus:0,RunEmpId:undefined}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50257);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50258);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_space() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50259);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eumrim12s3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_space",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50259,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eumrim12s3(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50259);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50260);String jsonString = "{PayStatus:0,RunEmpId:undefined }";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50261);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50262);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_comma() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50263);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1zeox12s7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_comma",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50263,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1zeox12s7(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50263);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50264);String jsonString = "{PayStatus:0,RunEmpId:undefined,ext:1001}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50265);JSONObject json = (JSONObject) JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50266);Assert.assertEquals(1001, json.get("ext"));
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50267);Assert.assertEquals(0, json.get("PayStatus"));
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50268);Assert.assertEquals(3, json.size());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_array() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpwpb912sd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50269,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpwpb912sd(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50269);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50270);String jsonString = "[0,undefined]";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50271);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50272);Assert.assertEquals("[0,null]", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_n() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qe3z1612sh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50273,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qe3z1612sh(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50273);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50274);String jsonString = "{PayStatus:0,RunEmpId:undefined\n}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50275);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50276);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_r() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50277);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vn07s212sl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_r",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50277,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vn07s212sl(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50277);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50278);String jsonString = "{PayStatus:0,RunEmpId:undefined\r}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50279);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50280);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_t() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50281);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p50a7412sp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_t",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50281,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p50a7412sp(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50281);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50282);String jsonString = "{PayStatus:0,RunEmpId:undefined\t}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50283);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50284);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_f() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e48pe12st();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50285,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e48pe12st(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50285);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50286);String jsonString = "{PayStatus:0,RunEmpId:undefined\f}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50287);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50288);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_b() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clvmgi12sx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50289,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clvmgi12sx(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50289);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50290);String jsonString = "{PayStatus:0,RunEmpId:undefined\b}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50291);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50292);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_single() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n8fp8q12t1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_single",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50293,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n8fp8q12t1(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50293);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50294);String jsonString = "undefined";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50295);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50296);Assert.assertNull(json);
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
    
    public void test_parserUndefined_field() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50297);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r4torq12t5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50297,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r4torq12t5(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50297);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50298);String jsonString = "{undefined:1001}";
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50299);Object json = JSON.parse(jsonString);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50300);Assert.assertEquals(1001, ((JSONObject)json).get("undefined"));
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}

    public void test_parserError() {__CLR4_5_212rz12rzlusyjr3m.R.globalSliceStart(getClass().getName(),50301);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tscj12t9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212rz12rzlusyjr3m.R.rethrow($CLV_t2$);}finally{__CLR4_5_212rz12rzlusyjr3m.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50301,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tscj12t9(){try{__CLR4_5_212rz12rzlusyjr3m.R.inc(50301);
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50302);Exception error = null;
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50303);try {
            __CLR4_5_212rz12rzlusyjr3m.R.inc(50304);String jsonString = "{PayStatus:0,RunEmpId:undefinedaa}";
            __CLR4_5_212rz12rzlusyjr3m.R.inc(50305);JSON.parse(jsonString);
        } catch (Exception ex) {
            __CLR4_5_212rz12rzlusyjr3m.R.inc(50306);error = ex;
        }
        __CLR4_5_212rz12rzlusyjr3m.R.inc(50307);Assert.assertNotNull(error);
    }finally{__CLR4_5_212rz12rzlusyjr3m.R.flushNeeded();}}
}
