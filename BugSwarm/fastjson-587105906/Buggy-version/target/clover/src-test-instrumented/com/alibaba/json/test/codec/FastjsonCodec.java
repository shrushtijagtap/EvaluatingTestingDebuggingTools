/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.codec;

import java.io.OutputStream;
import java.util.Collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastjsonCodec implements Codec {public static class __CLR4_1_1024zy24zyluszwibu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,99818,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ParserConfig    config = ParserConfig.getGlobalInstance();

    public FastjsonCodec(){try{__CLR4_1_1024zy24zyluszwibu.R.inc(99790);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99791);System.out.println("fastjson-" + JSON.VERSION);    
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    public String getName() {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99792);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99793);return "fastjson";
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    public <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99794);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99795);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99796);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99797);return parser.parseObject(clazz);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99798);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99799);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99800);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99801);return parser.parseArray(clazz);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99802);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99803);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99804);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99805);return parser.parse();
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    public final Object decode(String text) {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99806);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99807);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99808);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99809);return parser.parse();
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    // private JavaBeanSerializer serializer = new JavaBeanSerializer(Long_100_Entity.class);

    public String encode(Object object) throws Exception {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99810);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99811);return JSON.toJSONString(object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99812);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99813);return (T) JSON.parseObject(input, clazz, Feature.DisableCircularReferenceDetect);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99814);
        __CLR4_1_1024zy24zyluszwibu.R.inc(99815);return JSON.toJSONBytes(object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_1_1024zy24zyluszwibu.R.inc(99816);
       __CLR4_1_1024zy24zyluszwibu.R.inc(99817);JSON.writeJSONString(out, object, SerializerFeature.DisableCircularReferenceDetect);
    }finally{__CLR4_1_1024zy24zyluszwibu.R.flushNeeded();}}

}
