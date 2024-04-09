/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class Bug_127_for_qiuyan81 extends TestCase {static class __CLR4_1_1012sa12salusqk1eq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,50319,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parserUndefined() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50266);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109hzbwr12sa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50266,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109hzbwr12sa(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50266);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50267);String jsonString = "{PayStatus:0,RunEmpId:undefined}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50268);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50269);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_space() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50270);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eumrim12se();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_space",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50270,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eumrim12se(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50270);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50271);String jsonString = "{PayStatus:0,RunEmpId:undefined }";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50272);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50273);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_comma() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50274);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y1zeox12si();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_comma",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50274,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y1zeox12si(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50274);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50275);String jsonString = "{PayStatus:0,RunEmpId:undefined,ext:1001}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50276);JSONObject json = (JSONObject) JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50277);Assert.assertEquals(1001, json.get("ext"));
        __CLR4_1_1012sa12salusqk1eq.R.inc(50278);Assert.assertEquals(0, json.get("PayStatus"));
        __CLR4_1_1012sa12salusqk1eq.R.inc(50279);Assert.assertEquals(3, json.size());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_array() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50280);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qpwpb912so();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50280,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qpwpb912so(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50280);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50281);String jsonString = "[0,undefined]";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50282);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50283);Assert.assertEquals("[0,null]", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_n() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50284);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qe3z1612ss();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50284,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qe3z1612ss(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50284);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50285);String jsonString = "{PayStatus:0,RunEmpId:undefined\n}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50286);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50287);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_r() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50288);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vn07s212sw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_r",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50288,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vn07s212sw(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50288);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50289);String jsonString = "{PayStatus:0,RunEmpId:undefined\r}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50290);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50291);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_t() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50292);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p50a7412t0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50292,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p50a7412t0(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50292);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50293);String jsonString = "{PayStatus:0,RunEmpId:undefined\t}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50294);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50295);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_f() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50296);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e48pe12t4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50296,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e48pe12t4(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50296);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50297);String jsonString = "{PayStatus:0,RunEmpId:undefined\f}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50298);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50299);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_b() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50300);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clvmgi12t8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_b",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50300,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clvmgi12t8(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50300);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50301);String jsonString = "{PayStatus:0,RunEmpId:undefined\b}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50302);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50303);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_single() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50304);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n8fp8q12tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_single",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50304,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n8fp8q12tc(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50304);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50305);String jsonString = "undefined";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50306);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50307);Assert.assertNull(json);
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
    
    public void test_parserUndefined_field() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50308);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r4torq12tg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50308,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r4torq12tg(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50308);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50309);String jsonString = "{undefined:1001}";
        __CLR4_1_1012sa12salusqk1eq.R.inc(50310);Object json = JSON.parse(jsonString);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50311);Assert.assertEquals(1001, ((JSONObject)json).get("undefined"));
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}

    public void test_parserError() {__CLR4_1_1012sa12salusqk1eq.R.globalSliceStart(getClass().getName(),50312);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103tscj12tk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012sa12salusqk1eq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012sa12salusqk1eq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserError",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50312,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103tscj12tk(){try{__CLR4_1_1012sa12salusqk1eq.R.inc(50312);
        __CLR4_1_1012sa12salusqk1eq.R.inc(50313);Exception error = null;
        __CLR4_1_1012sa12salusqk1eq.R.inc(50314);try {
            __CLR4_1_1012sa12salusqk1eq.R.inc(50315);String jsonString = "{PayStatus:0,RunEmpId:undefinedaa}";
            __CLR4_1_1012sa12salusqk1eq.R.inc(50316);JSON.parse(jsonString);
        } catch (Exception ex) {
            __CLR4_1_1012sa12salusqk1eq.R.inc(50317);error = ex;
        }
        __CLR4_1_1012sa12salusqk1eq.R.inc(50318);Assert.assertNotNull(error);
    }finally{__CLR4_1_1012sa12salusqk1eq.R.flushNeeded();}}
}
