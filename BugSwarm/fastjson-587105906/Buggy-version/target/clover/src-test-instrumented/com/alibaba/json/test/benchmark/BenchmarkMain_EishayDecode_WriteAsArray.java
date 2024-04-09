/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark;

import java.lang.management.ManagementFactory;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.test.TestUtils;
import com.alibaba.json.test.benchmark.decode.EishayDecodeBytes;

import data.media.Image;
import data.media.Media;
import data.media.MediaContent;
import data.media.writeAsArray.ImageSerializer;
import data.media.writeAsArray.MediaContentDeserializer;
import data.media.writeAsArray.MediaContentSerializer;
import data.media.writeAsArray.MediaSerializer;

public class BenchmarkMain_EishayDecode_WriteAsArray {public static class __CLR4_1_1022d222d2lusqkry9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,96401,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static void main(String[] args) throws Exception {try{__CLR4_1_1022d222d2lusqkry9.R.inc(96374);
//        SerializeConfig config = SerializeConfig.getGlobalInstance();
//        config.put(MediaContent.class, new MediaContentSerializer());
//        config.put(Media.class, new MediaSerializer());
//        config.put(Image.class, new ImageSerializer());

//        ParserConfig.getGlobalInstance().putDeserializer(MediaContent.class, new MediaContentDeserializer());
        
        __CLR4_1_1022d222d2lusqkry9.R.inc(96375);System.out.println(System.getProperty("java.vm.name") + " " + System.getProperty("java.runtime.version"));
        __CLR4_1_1022d222d2lusqkry9.R.inc(96376);List<String> arguments = ManagementFactory.getRuntimeMXBean().getInputArguments();
        __CLR4_1_1022d222d2lusqkry9.R.inc(96377);System.out.println(arguments);

        __CLR4_1_1022d222d2lusqkry9.R.inc(96378);String text = JSON.toJSONString(EishayDecodeBytes.instance.getContent(), SerializerFeature.BeanToArray);
        __CLR4_1_1022d222d2lusqkry9.R.inc(96379);System.out.println(text);
        
        __CLR4_1_1022d222d2lusqkry9.R.inc(96380);for (int i = 0; (((i < 10)&&(__CLR4_1_1022d222d2lusqkry9.R.iget(96381)!=0|true))||(__CLR4_1_1022d222d2lusqkry9.R.iget(96382)==0&false)); ++i) {{
            __CLR4_1_1022d222d2lusqkry9.R.inc(96383);perf(text);
        }
    }}finally{__CLR4_1_1022d222d2lusqkry9.R.flushNeeded();}}

    static long perf(String text) {try{__CLR4_1_1022d222d2lusqkry9.R.inc(96384);
        __CLR4_1_1022d222d2lusqkry9.R.inc(96385);long startYGC = TestUtils.getYoungGC();
        __CLR4_1_1022d222d2lusqkry9.R.inc(96386);long startYGCTime = TestUtils.getYoungGCTime();
        __CLR4_1_1022d222d2lusqkry9.R.inc(96387);long startFGC = TestUtils.getFullGC();

        __CLR4_1_1022d222d2lusqkry9.R.inc(96388);long startMillis = System.currentTimeMillis();
        __CLR4_1_1022d222d2lusqkry9.R.inc(96389);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_1022d222d2lusqkry9.R.iget(96390)!=0|true))||(__CLR4_1_1022d222d2lusqkry9.R.iget(96391)==0&false)); ++i) {{
            __CLR4_1_1022d222d2lusqkry9.R.inc(96392);decode(text);
        }
        }__CLR4_1_1022d222d2lusqkry9.R.inc(96393);long millis = System.currentTimeMillis() - startMillis;

        __CLR4_1_1022d222d2lusqkry9.R.inc(96394);long ygc = TestUtils.getYoungGC() - startYGC;
        __CLR4_1_1022d222d2lusqkry9.R.inc(96395);long ygct = TestUtils.getYoungGCTime() - startYGCTime;
        __CLR4_1_1022d222d2lusqkry9.R.inc(96396);long fgc = TestUtils.getFullGC() - startFGC;

        __CLR4_1_1022d222d2lusqkry9.R.inc(96397);System.out.println("decode\t" + millis + ", ygc " + ygc + ", ygct " + ygct + ", fgc " + fgc);
        __CLR4_1_1022d222d2lusqkry9.R.inc(96398);return millis;
    }finally{__CLR4_1_1022d222d2lusqkry9.R.flushNeeded();}}

    static void decode(String text) {try{__CLR4_1_1022d222d2lusqkry9.R.inc(96399);
        __CLR4_1_1022d222d2lusqkry9.R.inc(96400);MediaContent content = JSON.parseObject(text, MediaContent.class, Feature.SupportArrayToBean);
        
//        JSON.parseObject(text);
    }finally{__CLR4_1_1022d222d2lusqkry9.R.flushNeeded();}}
}
