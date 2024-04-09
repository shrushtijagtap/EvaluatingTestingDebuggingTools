/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class Bug_127_for_qiuyan81 extends TestCase {static class __CLR4_5_213q713q7lusvn57p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51540,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parserUndefined() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_29hzbwr13q7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51487,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_29hzbwr13q7(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51487);
        __CLR4_5_213q713q7lusvn57p.R.inc(51488);String jsonString = "{PayStatus:0,RunEmpId:undefined}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51489);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51490);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_space() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51491);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2eumrim13qb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_space",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51491,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2eumrim13qb(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51491);
        __CLR4_5_213q713q7lusvn57p.R.inc(51492);String jsonString = "{PayStatus:0,RunEmpId:undefined }";
        __CLR4_5_213q713q7lusvn57p.R.inc(51493);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51494);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_comma() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2y1zeox13qf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_comma",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2y1zeox13qf(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51495);
        __CLR4_5_213q713q7lusvn57p.R.inc(51496);String jsonString = "{PayStatus:0,RunEmpId:undefined,ext:1001}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51497);JSONObject json = (JSONObject) JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51498);Assert.assertEquals(1001, json.get("ext"));
        __CLR4_5_213q713q7lusvn57p.R.inc(51499);Assert.assertEquals(0, json.get("PayStatus"));
        __CLR4_5_213q713q7lusvn57p.R.inc(51500);Assert.assertEquals(3, json.size());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_array() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qpwpb913ql();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_array",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qpwpb913ql(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51501);
        __CLR4_5_213q713q7lusvn57p.R.inc(51502);String jsonString = "[0,undefined]";
        __CLR4_5_213q713q7lusvn57p.R.inc(51503);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51504);Assert.assertEquals("[0,null]", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_n() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51505);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qe3z1613qp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51505,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qe3z1613qp(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51505);
        __CLR4_5_213q713q7lusvn57p.R.inc(51506);String jsonString = "{PayStatus:0,RunEmpId:undefined\n}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51507);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51508);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_r() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51509);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vn07s213qt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_r",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51509,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vn07s213qt(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51509);
        __CLR4_5_213q713q7lusvn57p.R.inc(51510);String jsonString = "{PayStatus:0,RunEmpId:undefined\r}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51511);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51512);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_t() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51513);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2p50a7413qx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_t",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51513,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2p50a7413qx(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51513);
        __CLR4_5_213q713q7lusvn57p.R.inc(51514);String jsonString = "{PayStatus:0,RunEmpId:undefined\t}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51515);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51516);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_f() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51517);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e48pe13r1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51517,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e48pe13r1(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51517);
        __CLR4_5_213q713q7lusvn57p.R.inc(51518);String jsonString = "{PayStatus:0,RunEmpId:undefined\f}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51519);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51520);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_b() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51521);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2clvmgi13r5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51521,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2clvmgi13r5(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51521);
        __CLR4_5_213q713q7lusvn57p.R.inc(51522);String jsonString = "{PayStatus:0,RunEmpId:undefined\b}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51523);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51524);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_single() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51525);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n8fp8q13r9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_single",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51525,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n8fp8q13r9(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51525);
        __CLR4_5_213q713q7lusvn57p.R.inc(51526);String jsonString = "undefined";
        __CLR4_5_213q713q7lusvn57p.R.inc(51527);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51528);Assert.assertNull(json);
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
    
    public void test_parserUndefined_field() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51529);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r4torq13rd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_field",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51529,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r4torq13rd(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51529);
        __CLR4_5_213q713q7lusvn57p.R.inc(51530);String jsonString = "{undefined:1001}";
        __CLR4_5_213q713q7lusvn57p.R.inc(51531);Object json = JSON.parse(jsonString);
        __CLR4_5_213q713q7lusvn57p.R.inc(51532);Assert.assertEquals(1001, ((JSONObject)json).get("undefined"));
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}

    public void test_parserError() {__CLR4_5_213q713q7lusvn57p.R.globalSliceStart(getClass().getName(),51533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23tscj13rh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213q713q7lusvn57p.R.rethrow($CLV_t2$);}finally{__CLR4_5_213q713q7lusvn57p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserError",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51533,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23tscj13rh(){try{__CLR4_5_213q713q7lusvn57p.R.inc(51533);
        __CLR4_5_213q713q7lusvn57p.R.inc(51534);Exception error = null;
        __CLR4_5_213q713q7lusvn57p.R.inc(51535);try {
            __CLR4_5_213q713q7lusvn57p.R.inc(51536);String jsonString = "{PayStatus:0,RunEmpId:undefinedaa}";
            __CLR4_5_213q713q7lusvn57p.R.inc(51537);JSON.parse(jsonString);
        } catch (Exception ex) {
            __CLR4_5_213q713q7lusvn57p.R.inc(51538);error = ex;
        }
        __CLR4_5_213q713q7lusvn57p.R.inc(51539);Assert.assertNotNull(error);
    }finally{__CLR4_5_213q713q7lusvn57p.R.flushNeeded();}}
}
