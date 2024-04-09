/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1600;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.PascalNameFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.List;

public class Issue1635 extends TestCase {static class __CLR4_5_21cxs1cxslusvnalp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,63439,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static class Foo {
        public String name;
        public Integer BarCount;
        public Boolean flag;
        public List list;

        public Foo(String name, Integer barCount) {try{__CLR4_5_21cxs1cxslusvnalp.R.inc(63424);
            __CLR4_5_21cxs1cxslusvnalp.R.inc(63425);this.name = name;
            __CLR4_5_21cxs1cxslusvnalp.R.inc(63426);BarCount = barCount;
        }finally{__CLR4_5_21cxs1cxslusvnalp.R.flushNeeded();}}
    }

    public void test_issue() throws Exception {__CLR4_5_21cxs1cxslusvnalp.R.globalSliceStart(getClass().getName(),63427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215xljh1cxv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cxs1cxslusvnalp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cxs1cxslusvnalp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1635.test_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63427,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215xljh1cxv() throws Exception{try{__CLR4_5_21cxs1cxslusvnalp.R.inc(63427);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63428);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63429);config.setAsmEnable(false);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63430);Foo foo = new Foo(null, null);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63431);String json = JSON.toJSONString(foo
                , config, new PascalNameFilter()
                , SerializerFeature.WriteNullBooleanAsFalse
                , SerializerFeature.WriteNullNumberAsZero
                , SerializerFeature.WriteNullStringAsEmpty
                , SerializerFeature.WriteNullListAsEmpty
        );
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63432);assertEquals("{\"BarCount\":0,\"Flag\":false,\"List\":[],\"Name\":\"\"}", json);
    }finally{__CLR4_5_21cxs1cxslusvnalp.R.flushNeeded();}}

    public void test_issue_1() throws Exception {__CLR4_5_21cxs1cxslusvnalp.R.globalSliceStart(getClass().getName(),63433);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lap5451cy1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cxs1cxslusvnalp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cxs1cxslusvnalp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1600.Issue1635.test_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),63433,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lap5451cy1() throws Exception{try{__CLR4_5_21cxs1cxslusvnalp.R.inc(63433);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63434);SerializeConfig config = new SerializeConfig();
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63435);config.setAsmEnable(false);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63436);Foo foo = new Foo(null, null);
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63437);String json = JSON.toJSONString(foo
                , config, new PascalNameFilter()
                , SerializerFeature.WriteNullBooleanAsFalse
                , SerializerFeature.WriteNullNumberAsZero
                , SerializerFeature.WriteNullStringAsEmpty
                , SerializerFeature.WriteNullListAsEmpty
                , SerializerFeature.BeanToArray
        );
        __CLR4_5_21cxs1cxslusvnalp.R.inc(63438);assertEquals("[0,false,[],\"\"]", json);
    }finally{__CLR4_5_21cxs1cxslusvnalp.R.flushNeeded();}}
}
