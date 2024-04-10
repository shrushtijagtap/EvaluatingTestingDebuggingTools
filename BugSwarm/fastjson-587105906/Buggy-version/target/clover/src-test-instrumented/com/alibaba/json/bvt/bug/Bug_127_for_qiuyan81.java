/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class Bug_127_for_qiuyan81 extends TestCase {static class __CLR4_1_1013qi13qiluszw7dn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_parserUndefined() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109hzbwr13qi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51498,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109hzbwr13qi(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51498);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51499);String jsonString = "{PayStatus:0,RunEmpId:undefined}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51500);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51501);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_space() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51502);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eumrim13qm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_space",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51502,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eumrim13qm(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51502);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51503);String jsonString = "{PayStatus:0,RunEmpId:undefined }";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51504);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51505);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_comma() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51506);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y1zeox13qq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_comma",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51506,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y1zeox13qq(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51506);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51507);String jsonString = "{PayStatus:0,RunEmpId:undefined,ext:1001}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51508);JSONObject json = (JSONObject) JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51509);Assert.assertEquals(1001, json.get("ext"));
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51510);Assert.assertEquals(0, json.get("PayStatus"));
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51511);Assert.assertEquals(3, json.size());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_array() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51512);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qpwpb913qw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51512,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qpwpb913qw(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51512);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51513);String jsonString = "[0,undefined]";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51514);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51515);Assert.assertEquals("[0,null]", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_n() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51516);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qe3z1613r0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51516,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qe3z1613r0(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51516);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51517);String jsonString = "{PayStatus:0,RunEmpId:undefined\n}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51518);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51519);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_r() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51520);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vn07s213r4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_r",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51520,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vn07s213r4(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51520);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51521);String jsonString = "{PayStatus:0,RunEmpId:undefined\r}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51522);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51523);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_t() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51524);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10p50a7413r8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_t",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51524,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10p50a7413r8(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51524);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51525);String jsonString = "{PayStatus:0,RunEmpId:undefined\t}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51526);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51527);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_f() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51528);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e48pe13rc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_f",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51528,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e48pe13rc(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51528);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51529);String jsonString = "{PayStatus:0,RunEmpId:undefined\f}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51530);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51531);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_b() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51532);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10clvmgi13rg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_b",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51532,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10clvmgi13rg(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51532);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51533);String jsonString = "{PayStatus:0,RunEmpId:undefined\b}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51534);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51535);Assert.assertEquals("{\"PayStatus\":0}", json.toString());
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_single() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51536);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n8fp8q13rk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_single",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51536,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n8fp8q13rk(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51536);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51537);String jsonString = "undefined";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51538);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51539);Assert.assertNull(json);
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
    
    public void test_parserUndefined_field() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r4torq13ro();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserUndefined_field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51540,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r4torq13ro(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51540);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51541);String jsonString = "{undefined:1001}";
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51542);Object json = JSON.parse(jsonString);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51543);Assert.assertEquals(1001, ((JSONObject)json).get("undefined"));
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}

    public void test_parserError() {__CLR4_1_1013qi13qiluszw7dn.R.globalSliceStart(getClass().getName(),51544);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103tscj13rs();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013qi13qiluszw7dn.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013qi13qiluszw7dn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_127_for_qiuyan81.test_parserError",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51544,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103tscj13rs(){try{__CLR4_1_1013qi13qiluszw7dn.R.inc(51544);
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51545);Exception error = null;
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51546);try {
            __CLR4_1_1013qi13qiluszw7dn.R.inc(51547);String jsonString = "{PayStatus:0,RunEmpId:undefinedaa}";
            __CLR4_1_1013qi13qiluszw7dn.R.inc(51548);JSON.parse(jsonString);
        } catch (Exception ex) {
            __CLR4_1_1013qi13qiluszw7dn.R.inc(51549);error = ex;
        }
        __CLR4_1_1013qi13qiluszw7dn.R.inc(51550);Assert.assertNotNull(error);
    }finally{__CLR4_1_1013qi13qiluszw7dn.R.flushNeeded();}}
}
