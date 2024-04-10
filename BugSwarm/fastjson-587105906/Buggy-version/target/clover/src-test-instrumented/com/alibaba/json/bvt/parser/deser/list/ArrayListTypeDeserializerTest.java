/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class ArrayListTypeDeserializerTest extends TestCase {static class __CLR4_1_101no91no9luszwdtj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,77358,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_null_0() throws Exception {__CLR4_1_101no91no9luszwdtj.R.globalSliceStart(getClass().getName(),77337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gp3btg1no9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101no91no9luszwdtj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101no91no9luszwdtj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeDeserializerTest.test_null_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gp3btg1no9() throws Exception{try{__CLR4_1_101no91no9luszwdtj.R.inc(77337);
        __CLR4_1_101no91no9luszwdtj.R.inc(77338);Assert.assertNull(JSON.parseObject("null", new TypeReference<ArrayList<Integer>>() {
        }));
    }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    public void test_null_1() throws Exception {__CLR4_1_101no91no9luszwdtj.R.globalSliceStart(getClass().getName(),77339);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dg3d0z1nob();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101no91no9luszwdtj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101no91no9luszwdtj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeDeserializerTest.test_null_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77339,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dg3d0z1nob() throws Exception{try{__CLR4_1_101no91no9luszwdtj.R.inc(77339);
        __CLR4_1_101no91no9luszwdtj.R.inc(77340);Assert.assertNull(JSON.parseObject("null", new TypeReference<Collection<Integer>>() {
        }));
    }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    public void test_null_2() throws Exception {__CLR4_1_101no91no9luszwdtj.R.globalSliceStart(getClass().getName(),77341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a73e8i1nod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101no91no9luszwdtj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101no91no9luszwdtj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeDeserializerTest.test_null_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a73e8i1nod() throws Exception{try{__CLR4_1_101no91no9luszwdtj.R.inc(77341);
        __CLR4_1_101no91no9luszwdtj.R.inc(77342);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
    }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    public void test_null_3() throws Exception {__CLR4_1_101no91no9luszwdtj.R.globalSliceStart(getClass().getName(),77343);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106y3fg11nof();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101no91no9luszwdtj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101no91no9luszwdtj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeDeserializerTest.test_null_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77343,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106y3fg11nof() throws Exception{try{__CLR4_1_101no91no9luszwdtj.R.inc(77343);
        __CLR4_1_101no91no9luszwdtj.R.inc(77344);Assert.assertNull(JSON.parseObject("{\"value\":null}", V1.class).getValue());
    }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    public void test_empty() throws Exception {__CLR4_1_101no91no9luszwdtj.R.globalSliceStart(getClass().getName(),77345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m1ch211noh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101no91no9luszwdtj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101no91no9luszwdtj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.list.ArrayListTypeDeserializerTest.test_empty",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m1ch211noh() throws Exception{try{__CLR4_1_101no91no9luszwdtj.R.inc(77345);
        __CLR4_1_101no91no9luszwdtj.R.inc(77346);Assert.assertEquals(0, JSON.parseObject("[]", new TypeReference<ArrayList<Integer>>() {
        }).size());
        __CLR4_1_101no91no9luszwdtj.R.inc(77347);Assert.assertEquals(0, JSON.parseObject("[]", new TypeReference<Set<Integer>>() {
        }).size());

        __CLR4_1_101no91no9luszwdtj.R.inc(77348);Assert.assertEquals(0, JSON.parseObject("[]", new TypeReference<HashSet<Integer>>() {
        }).size());

        __CLR4_1_101no91no9luszwdtj.R.inc(77349);Assert.assertEquals(0, JSON.parseObject("{\"value\":[]}", VO.class).getValue().size());
    }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    public static class VO {

        private ArrayList<Integer> value;

        public ArrayList<Integer> getValue() {try{__CLR4_1_101no91no9luszwdtj.R.inc(77350);
            __CLR4_1_101no91no9luszwdtj.R.inc(77351);return value;
        }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

        public void setValue(ArrayList<Integer> value) {try{__CLR4_1_101no91no9luszwdtj.R.inc(77352);
            __CLR4_1_101no91no9luszwdtj.R.inc(77353);this.value = value;
        }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    }

    private static class V1 {

        private ArrayList<Integer> value;

        public ArrayList<Integer> getValue() {try{__CLR4_1_101no91no9luszwdtj.R.inc(77354);
            __CLR4_1_101no91no9luszwdtj.R.inc(77355);return value;
        }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

        @SuppressWarnings("unused")
        public void setValue(ArrayList<Integer> value) {try{__CLR4_1_101no91no9luszwdtj.R.inc(77356);
            __CLR4_1_101no91no9luszwdtj.R.inc(77357);this.value = value;
        }finally{__CLR4_1_101no91no9luszwdtj.R.flushNeeded();}}

    }
}
