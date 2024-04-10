/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.benchmark;

import com.alibaba.json.test.benchmark.encode.*;
import com.alibaba.json.test.benchmark.decode.*;
import com.alibaba.json.test.codec.*;

public class BenchmarkMain {public static class __CLR4_5_222bt22btlusyjwmq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96336,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_5_222bt22btlusyjwmq.R.inc(96329);
         // \u6ce8\u610f\uff0cbyte[]\u5728jackson\u4e2d\u662f\u4f7f\u7528base64\u7f16\u7801\u7684\uff0c\u4e0d\u6b63\u786e\u7684\u3002

        __CLR4_5_222bt22btlusyjwmq.R.inc(96330);BenchmarkExecutor executor = new BenchmarkExecutor();
        __CLR4_5_222bt22btlusyjwmq.R.inc(96331);executor.setExecuteCount(10);
//        executor.getCodecList().add(new FastjsonManualCodec());
        __CLR4_5_222bt22btlusyjwmq.R.inc(96332);executor.getCodecList().add(new FastjsonCodec());
//        executor.getCodecList().add(new FastjsonBeanToArrayCodec());
//        executor.getCodecList().add(new FastjsonGenCodec());
//        executor.getCodecList().add(new FastjsonBeanToArrayCodec());
//        executor.getCodecList().add(new JacksonCodec());
//        executor.getCodecList().add(new Jackson2Codec());
//        executor.getCodecList().add(new Jackson2AfterBurnCodec());
        //
        // executor.getCodecList().add(new SimpleJsonCodec());
        // executor.getCodecList().add(new JsonLibCodec());
        // executor.getCodecList().add(new JsonSmartCodec());

        __CLR4_5_222bt22btlusyjwmq.R.inc(96333);executor.setLoopCount(1000 * 1000 * 1);

//        executor.getCaseList().add(new TradeObjectParse());
//        executor.getCaseList().add(new EishayDecodeBytes());
//        executor.getCaseList().add(new EishayEncodeOutputStream());
//        executor.getCaseList().add(new EishayEncodeToBytes());
         __CLR4_5_222bt22btlusyjwmq.R.inc(96334);executor.getCaseList().add(new EishayDecode()); // 1069
                                                         //JDK8_162 1094
                                                         //JDK9_01  1214
                                                         //JDK9_04  1252
                                                         //JDK10    1088
//         executor.getCaseList().add(new EishayDecodeByClassName());
//         executor.getCaseList().add(new EishayTreeDecode());
//         executor.getCaseList().add(new EishayEncode());
//         executor.getCaseList().add(new EishayEncodeManual());
        // executor.getCaseList().add(new IntArray1000Decode());
        // executor.getCaseList().add(new StringArray1000Decode());
        // executor.getCaseList().add(new Map1000StringDecode());
        // executor.getCaseList().add(new Entity100StringDecode());

        // executor.getCaseList().add(new ListBoolean1000Encode());
        // executor.getCaseList().add(new ArrayBoolean1000Encode());
        // executor.getCaseList().add(new IntArray1000Decode());
        // executor.getCaseList().add(new StringArray1000Decode());
        // executor.getCaseList().add(new GroupEncode());
        // executor.getCaseList().add(new CategoryEncode());
        // executor.getCaseList().add(new GroupEncode());
        // executor.getCaseList().add(new Map1Decode());
        // executor.getCaseList().add(new Entity100IntDecode());
        // executor.getCaseList().add(new Entity100StringDecode());
        // executor.getCaseList().add(new Entity100IntEncode());
        // executor.getCaseList().add(new ArrayByte1000Encode());
        // executor.getCaseList().add(new ArrayInt1000Encode());
        // executor.getCaseList().add(new ArrayLong1000Encode());
        // executor.getCaseList().add(new ArrayString1000Encode());
        // executor.getCaseList().add(new ArrayEmptyList1000Encode());
        // executor.getCaseList().add(new ArrayEmptyMap1000Encode());
        // executor.getCaseList().add(new ArrayObjectEmptyMap1000Encode());
        // executor.getCaseList().add(new Map1000Encode());

        __CLR4_5_222bt22btlusyjwmq.R.inc(96335);executor.execute();
    }finally{__CLR4_5_222bt22btlusyjwmq.R.flushNeeded();}}
}
