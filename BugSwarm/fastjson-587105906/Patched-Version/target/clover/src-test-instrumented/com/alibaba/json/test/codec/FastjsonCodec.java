/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codec;

import java.io.OutputStream;
import java.util.Collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastjsonCodec implements Codec {public static class __CLR4_5_2241f241flusyjwvu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,98575,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ParserConfig    config = ParserConfig.getGlobalInstance();

    public FastjsonCodec(){try{__CLR4_5_2241f241flusyjwvu.R.inc(98547);
        __CLR4_5_2241f241flusyjwvu.R.inc(98548);System.out.println("fastjson-" + JSON.VERSION);    
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2241f241flusyjwvu.R.inc(98549);
        __CLR4_5_2241f241flusyjwvu.R.inc(98550);return "fastjson";
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    public <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_5_2241f241flusyjwvu.R.inc(98551);
        __CLR4_5_2241f241flusyjwvu.R.inc(98552);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2241f241flusyjwvu.R.inc(98553);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2241f241flusyjwvu.R.inc(98554);return parser.parseObject(clazz);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_5_2241f241flusyjwvu.R.inc(98555);
        __CLR4_5_2241f241flusyjwvu.R.inc(98556);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2241f241flusyjwvu.R.inc(98557);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2241f241flusyjwvu.R.inc(98558);return parser.parseArray(clazz);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_5_2241f241flusyjwvu.R.inc(98559);
        __CLR4_5_2241f241flusyjwvu.R.inc(98560);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2241f241flusyjwvu.R.inc(98561);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2241f241flusyjwvu.R.inc(98562);return parser.parse();
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    public final Object decode(String text) {try{__CLR4_5_2241f241flusyjwvu.R.inc(98563);
        __CLR4_5_2241f241flusyjwvu.R.inc(98564);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2241f241flusyjwvu.R.inc(98565);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2241f241flusyjwvu.R.inc(98566);return parser.parse();
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    // private JavaBeanSerializer serializer = new JavaBeanSerializer(Long_100_Entity.class);

    public String encode(Object object) throws Exception {try{__CLR4_5_2241f241flusyjwvu.R.inc(98567);
        __CLR4_5_2241f241flusyjwvu.R.inc(98568);return JSON.toJSONString(object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_5_2241f241flusyjwvu.R.inc(98569);
        __CLR4_5_2241f241flusyjwvu.R.inc(98570);return (T) JSON.parseObject(input, clazz, Feature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_5_2241f241flusyjwvu.R.inc(98571);
        __CLR4_5_2241f241flusyjwvu.R.inc(98572);return JSON.toJSONBytes(object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_5_2241f241flusyjwvu.R.inc(98573);
       __CLR4_5_2241f241flusyjwvu.R.inc(98574);JSON.writeJSONString(out, object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2241f241flusyjwvu.R.flushNeeded();}}

}
