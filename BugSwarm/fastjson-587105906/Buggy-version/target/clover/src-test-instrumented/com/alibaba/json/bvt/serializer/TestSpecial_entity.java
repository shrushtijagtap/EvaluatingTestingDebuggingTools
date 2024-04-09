/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class TestSpecial_entity extends TestCase {static class __CLR4_1_101tl61tl6lusqkke8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,85031,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21tl6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85002,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21tl6() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85002);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85003);Assert.assertEquals("{\"name\":\"\\u0000A\"}", JSON.toJSONString(new VO("\0A")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1tl8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1tl8() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85004);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85005);Assert.assertEquals("{\"name\":\"\\u0001\"}", JSON.toJSONString(new VO("\1")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85006);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441tla();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85006,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441tla() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85006);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85007);Assert.assertEquals("{\"name\":\"\\u0002\"}", JSON.toJSONString(new VO("\2")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85008);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1tlc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85008,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1tlc() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85008);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85009);Assert.assertEquals("{\"name\":\"\\u0003\"}", JSON.toJSONString(new VO("\3")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61tle();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61tle() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85010);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85011);Assert.assertEquals("{\"name\":\"\\u0004\"}", JSON.toJSONString(new VO("\4")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1tlg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85012,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1tlg() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85012);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85013);Assert.assertEquals("{\"name\":\"\\u0005\"}", JSON.toJSONString(new VO("\5")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85014);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81tli();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85014,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81tli() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85014);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85015);Assert.assertEquals("{\"name\":\"\\u0006\"}", JSON.toJSONString(new VO("\6")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85016);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1tlk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85016,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1tlk() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85016);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85017);Assert.assertEquals("{\"name\":\"\\u0007\"}", JSON.toJSONString(new VO("\7")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85018);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1tlm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85018,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1tlm() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85018);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85019);Assert.assertEquals("{\"name\":\"\\b\"}", JSON.toJSONString(new VO("\b")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71tlo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71tlo() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85020);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85021);Assert.assertEquals("{\"name\":\"\\t\"}", JSON.toJSONString(new VO("\t")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}
    
    public void test_10() throws Exception {__CLR4_1_101tl61tl6lusqkke8.R.globalSliceStart(getClass().getName(),85022);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c3oj7x1tlq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101tl61tl6lusqkke8.R.rethrow($CLV_t2$);}finally{__CLR4_1_101tl61tl6lusqkke8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.TestSpecial_entity.test_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85022,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c3oj7x1tlq() throws Exception{try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85022);
        __CLR4_1_101tl61tl6lusqkke8.R.inc(85023);Assert.assertEquals("{\"name\":\"\\n\"}", JSON.toJSONString(new VO("\n")));
    }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    public static class VO {

        private String name;

        public VO(){try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85024);

        }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

        public VO(String name){try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85025);
            __CLR4_1_101tl61tl6lusqkke8.R.inc(85026);this.name = name;
        }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85027);
            __CLR4_1_101tl61tl6lusqkke8.R.inc(85028);return name;
        }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101tl61tl6lusqkke8.R.inc(85029);
            __CLR4_1_101tl61tl6lusqkke8.R.inc(85030);this.name = name;
        }finally{__CLR4_1_101tl61tl6lusqkke8.R.flushNeeded();}}

    }
}
