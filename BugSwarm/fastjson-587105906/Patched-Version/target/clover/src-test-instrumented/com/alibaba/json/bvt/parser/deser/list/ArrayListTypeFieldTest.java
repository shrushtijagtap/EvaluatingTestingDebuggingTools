/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.ArrayList;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.Feature;

public class ArrayListTypeFieldTest extends TestCase {static class __CLR4_5_21mqb1mqblusyjubq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,76141,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21mqb1mqblusyjubq.R.globalSliceStart(getClass().getName(),76115);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21mqb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mqb1mqblusyjubq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mqb1mqblusyjubq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeFieldTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76115,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21mqb() throws Exception{try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76115);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76116);Entity entity = JSON.parseObject("{,,,list:[,,,{value:3}]}", Entity.class);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76117);Assert.assertEquals(3, entity.getList().get(0).getValue());
    }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21mqb1mqblusyjubq.R.globalSliceStart(getClass().getName(),76118);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1mqe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mqb1mqblusyjubq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mqb1mqblusyjubq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeFieldTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76118,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1mqe() throws Exception{try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76118);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76119);Entity entity = JSON.parseObject("{list:[{value:3}]}", Entity.class, 0, Feature.AllowUnQuotedFieldNames);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76120);Assert.assertEquals(3, entity.getList().get(0).getValue());
    }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}
    
    public void test_null() throws Exception {__CLR4_5_21mqb1mqblusyjubq.R.globalSliceStart(getClass().getName(),76121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vkuxwl1mqh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mqb1mqblusyjubq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mqb1mqblusyjubq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeFieldTest.test_null",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76121,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vkuxwl1mqh() throws Exception{try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76121);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76122);Entity entity = JSON.parseObject("{list:null}", Entity.class, 0, Feature.AllowUnQuotedFieldNames);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76123);Assert.assertEquals(null, entity.getList());
    }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}
    public void test_null2() throws Exception {__CLR4_5_21mqb1mqblusyjubq.R.globalSliceStart(getClass().getName(),76124);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2crq8rf1mqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mqb1mqblusyjubq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mqb1mqblusyjubq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeFieldTest.test_null2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76124,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2crq8rf1mqk() throws Exception{try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76124);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76125);Entity entity = JSON.parseObject("{list:[null]}", Entity.class, 0, Feature.AllowUnQuotedFieldNames);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76126);Assert.assertEquals(null, entity.getList().get(0));
    }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21mqb1mqblusyjubq.R.globalSliceStart(getClass().getName(),76127);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1mqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21mqb1mqblusyjubq.R.rethrow($CLV_t2$);}finally{__CLR4_5_21mqb1mqblusyjubq.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeFieldTest.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),76127,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1mqn() throws Exception{try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76127);
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76128);Exception error = null;
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76129);try {
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76130);JSON.parseObject("{list:{{value:3}]}", Entity.class, 0, Feature.AllowUnQuotedFieldNames);
        } catch (JSONException ex) {
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76131);error = ex;
        }
        __CLR4_5_21mqb1mqblusyjubq.R.inc(76132);Assert.assertNotNull(error);
    }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

    private static class Entity {

        private ArrayList<VO> list;

        public ArrayList<VO> getList() {try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76133);
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76134);return list;
        }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

        public void setList(ArrayList<VO> list) {try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76135);
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76136);this.list = list;
        }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

    }

    public static class VO {

        private int value;

        public int getValue() {try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76137);
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76138);return value;
        }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

        public void setValue(int value) {try{__CLR4_5_21mqb1mqblusyjubq.R.inc(76139);
            __CLR4_5_21mqb1mqblusyjubq.R.inc(76140);this.value = value;
        }finally{__CLR4_5_21mqb1mqblusyjubq.R.flushNeeded();}}

    }
}
