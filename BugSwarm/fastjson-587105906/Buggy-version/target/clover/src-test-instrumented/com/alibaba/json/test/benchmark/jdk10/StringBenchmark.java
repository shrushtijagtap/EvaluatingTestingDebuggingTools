/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark.jdk10;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openjdk.jmh.annotations.*;

import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Warmup(iterations = 10)
@Measurement(iterations = 10)
@State(Scope.Benchmark)
public class StringBenchmark {public static class __CLR4_1_1024w424w4luszwibd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,99690,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private ObjectMapper mapper = new ObjectMapper();

    static private String s = "{\"compress\":true,\"queryParams\":\"^^$$Z29e389d72fca43e2591dfa6d5bd182039|null{$_$}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\",\"structures\":\"H4sIAAAAAAAAAI2QwW7DIBBE/4WzD+AYY/IHOUTpvbKsNawbJAMpxpVQ1X+vjZWzObK8nZ2ZX6K8m0ywj6AxDIxcPwloHXBZtkdFfB4r2THW1pxTJceOUqkuHEFswwsDpsUGwhc6lT4g5TVw3iXr10MkIMzvn2UdrYnva31FTEQ7CN52tOnGSU5UN5xh3QJlAkeBraqV3G3t4M1N/hyuyPcKLpqYSthX8NYseIoOlBxu9yinun1xd1u0TOZsBU2XFVYRjbP5wZDuGJ9elyhbtEUOst29hVO2//sHOuYJjmECAAA=\",\"submitParams\":\"^^$$Z262e889742b9875f5107901ea64c33b46|null{$_$}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\",\"validateParams\":\"^^$$5da126afd2e7ebcf402eecea37f8e6df{$_$}H4sIAAAAAAAAAIVRTWsCMRT8LzlLcNePVW9ZG4ogItpaepJn9qmL2WRJIq0VoffSY8/9G4X+HUv/Rt9WSr2U3ibzXmaGeXu2dFDgnXWbMRDyg6LUrLdnpYawtK642pVYvZUG70e0ynpM2YKDzhewAB4cZMiVztEEXtgMNfd26xTy8ZnCLGY1Zk6/bwYTOZTT6bwxrxNrXZYbIM/4UGMlrPAvxwB2AZYTLK2p3LIdKeaKFxjgjK6QxnueXt/GfPwjeNImqRUadORXYxl6RcTn++vx7fH49vTx/EJsAW6DgfjfxJdyJCdieB42obDaKtDV/GE9748YMVuPTnifr8z/lfk1OMx46dBTagi5NbysTsAvIMCMlrPvi5yqQ8z6a1SbPjXMekvQHmsMjXK7MkyDy82KTLrtSLRF0ql32qLRkEIK0WzFUookitMo7cq006wnddGKREd22y12OHwB3aDYjQACAAA=\"}";
    static private DO d_o = JSON.parseObject(s, DO.class);
    static private Object o;
    static private int i;
    static private HashMap<String, String> methodMap = new HashMap<String, String>();

    @Setup
    public void prepare() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99652);
        __CLR4_1_1024w424w4luszwibd.R.inc(99653);methodMap.put("org.openjdk.jmh.annotations.org.openjdk.jmh.annotations.StringBenchmark.prepare(aaa,bbb,com.alibaba.fastjson.JSON)", "");
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:+CompactStrings")
    public void testParseJsonComp() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99654);
        __CLR4_1_1024w424w4luszwibd.R.inc(99655);o = JSON.parseObject(s, DO.class);
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:-CompactStrings")
    public void testParseJson() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99656);
        __CLR4_1_1024w424w4luszwibd.R.inc(99657);o = JSON.parseObject(s, DO.class);
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    //    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:+CompactStrings")
    public void testToJsonComp() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99658);
        __CLR4_1_1024w424w4luszwibd.R.inc(99659);o = JSON.toJSON(d_o);
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    //    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:-CompactStrings")
    public void testToJson() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99660);
        __CLR4_1_1024w424w4luszwibd.R.inc(99661);o = JSON.toJSON(d_o);
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

//    //    @Benchmark
//    @Fork(value = 3, jvmArgs = "-XX:+CompactStrings")
//    public void testJoinComp() {
//        o = IntStream.range(0, 10000).mapToObj(String::valueOf).collect(Collectors.joining());
//    }
//
//    //    @Benchmark
//    @Fork(value = 3, jvmArgs = "-XX:-CompactStrings")
//    public void testJoin() {
//        o = IntStream.range(0, 10000).mapToObj(String::valueOf).collect(Collectors.joining());
//    }

    //    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:+CompactStrings")
    public void testFindMethodComp() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99662);
        __CLR4_1_1024w424w4luszwibd.R.inc(99663);o = testFindMethod0();
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    //    @Benchmark
    @Fork(value = 3, jvmArgs = "-XX:-CompactStrings")
    public void testFindMethod() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99664);
        __CLR4_1_1024w424w4luszwibd.R.inc(99665);o = testFindMethod0();
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}


    private Object testFindMethod0() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99666);
        __CLR4_1_1024w424w4luszwibd.R.inc(99667);StringBuilder sb = new StringBuilder();
        __CLR4_1_1024w424w4luszwibd.R.inc(99668);sb.append("org.openjdk.jmh.annotations.org.openjdk.jmh.annotations.StringBenchmark")
                .append(".").append("prepare").append("(")
                .append("aaa").append(",").append("bbb").append(",")
                .append("com.alibaba.fastjson.JSON").append(")");

        __CLR4_1_1024w424w4luszwibd.R.inc(99669);return methodMap.get(sb.toString());
    }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

    static class DO {
        boolean compress;
        String queryParams, structures, submitParams, validateParams;

        public boolean isCompress() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99670);
            __CLR4_1_1024w424w4luszwibd.R.inc(99671);return compress;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public void setCompress(boolean compress) {try{__CLR4_1_1024w424w4luszwibd.R.inc(99672);
            __CLR4_1_1024w424w4luszwibd.R.inc(99673);this.compress = compress;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public String getQueryParams() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99674);
            __CLR4_1_1024w424w4luszwibd.R.inc(99675);return queryParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public void setQueryParams(String queryParams) {try{__CLR4_1_1024w424w4luszwibd.R.inc(99676);
            __CLR4_1_1024w424w4luszwibd.R.inc(99677);this.queryParams = queryParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public String getStructures() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99678);
            __CLR4_1_1024w424w4luszwibd.R.inc(99679);return structures;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public void setStructures(String structures) {try{__CLR4_1_1024w424w4luszwibd.R.inc(99680);
            __CLR4_1_1024w424w4luszwibd.R.inc(99681);this.structures = structures;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public String getSubmitParams() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99682);
            __CLR4_1_1024w424w4luszwibd.R.inc(99683);return submitParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public void setSubmitParams(String submitParams) {try{__CLR4_1_1024w424w4luszwibd.R.inc(99684);
            __CLR4_1_1024w424w4luszwibd.R.inc(99685);this.submitParams = submitParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public String getValidateParams() {try{__CLR4_1_1024w424w4luszwibd.R.inc(99686);
            __CLR4_1_1024w424w4luszwibd.R.inc(99687);return validateParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}

        public void setValidateParams(String validateParams) {try{__CLR4_1_1024w424w4luszwibd.R.inc(99688);
            __CLR4_1_1024w424w4luszwibd.R.inc(99689);this.validateParams = validateParams;
        }finally{__CLR4_1_1024w424w4luszwibd.R.flushNeeded();}}
    }
}
