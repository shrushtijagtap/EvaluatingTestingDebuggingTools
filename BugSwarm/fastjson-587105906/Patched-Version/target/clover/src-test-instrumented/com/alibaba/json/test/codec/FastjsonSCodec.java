/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codec;

import java.io.OutputStream;
import java.util.Collection;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class FastjsonSCodec implements Codec {public static class __CLR4_5_2245m245mlusyjwwb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,98737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public FastjsonSCodec(){try{__CLR4_5_2245m245mlusyjwwb.R.inc(98698);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98699);System.out.println("fastjson-" + JSON.VERSION);    
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98700);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98701);return "fastjsonS";
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    public <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98702);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98703);ParserConfig    config = new ParserConfig();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98704);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98705);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98706);return parser.parseObject(clazz);
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98707);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98708);ParserConfig    config = new ParserConfig();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98709);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98710);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98711);return parser.parseArray(clazz);
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98712);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98713);ParserConfig    config = new ParserConfig();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98714);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98715);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98716);return parser.parse();
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    public final Object decode(String text) {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98717);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98718);ParserConfig    config = new ParserConfig();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98719);DefaultJSONParser parser = new DefaultJSONParser(text, config);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98720);parser.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98721);return parser.parse();
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    // private JavaBeanSerializer serializer = new JavaBeanSerializer(Long_100_Entity.class);

    public String encode(Object object) throws Exception {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98722);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98723);SerializeConfig config = new SerializeConfig();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98724);SerializeWriter out = new SerializeWriter();
        __CLR4_5_2245m245mlusyjwwb.R.inc(98725);out.config(SerializerFeature.DisableCircularReferenceDetect, true);
//        out.config(SerializerFeature.DisableCheckSpecialChar, true);

        __CLR4_5_2245m245mlusyjwwb.R.inc(98726);JSONSerializer serializer = new JSONSerializer(out, config);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98727);serializer.write(object);

        __CLR4_5_2245m245mlusyjwwb.R.inc(98728);String text = out.toString();

        __CLR4_5_2245m245mlusyjwwb.R.inc(98729);out.close();

        __CLR4_5_2245m245mlusyjwwb.R.inc(98730);return text;
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98731);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98732);return (T) JSON.parseObject(input, clazz, Feature.DisableCircularReferenceDetect);
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98733);
        // TODO Auto-generated method stub
        __CLR4_5_2245m245mlusyjwwb.R.inc(98734);return null;
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_5_2245m245mlusyjwwb.R.inc(98735);
        __CLR4_5_2245m245mlusyjwwb.R.inc(98736);out.write(encodeToBytes(object));        
    }finally{__CLR4_5_2245m245mlusyjwwb.R.flushNeeded();}}

}
