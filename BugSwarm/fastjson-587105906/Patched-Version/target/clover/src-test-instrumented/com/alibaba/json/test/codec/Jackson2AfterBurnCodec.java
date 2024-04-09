/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.codec;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;


public class Jackson2AfterBurnCodec implements Codec {public static class __CLR4_5_2255f255flusvnkxa{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,100024,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private ObjectMapper mapper = new ObjectMapper();
    
    public Jackson2AfterBurnCodec() {try{__CLR4_5_2255f255flusvnkxa.R.inc(99987);
        __CLR4_5_2255f255flusvnkxa.R.inc(99988);mapper.registerModule(new AfterburnerModule());
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public String getName() {try{__CLR4_5_2255f255flusvnkxa.R.inc(99989);
        __CLR4_5_2255f255flusvnkxa.R.inc(99990);return "jackson2AfterBurn";
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public final <T> T decodeObject(String text, Class<T> clazz) {try{__CLR4_5_2255f255flusvnkxa.R.inc(99991);
        __CLR4_5_2255f255flusvnkxa.R.inc(99992);try {
            __CLR4_5_2255f255flusvnkxa.R.inc(99993);return mapper.readValue(text, clazz);
        } catch (Exception e) {
            __CLR4_5_2255f255flusvnkxa.R.inc(99994);throw new RuntimeException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}
    

    public <T> T decodeObject(byte[] input, Class<T> clazz) throws Exception {try{__CLR4_5_2255f255flusvnkxa.R.inc(99995);
        __CLR4_5_2255f255flusvnkxa.R.inc(99996);try {
            __CLR4_5_2255f255flusvnkxa.R.inc(99997);return mapper.readValue(input, clazz);
        } catch (Exception e) {
            __CLR4_5_2255f255flusvnkxa.R.inc(99998);throw new RuntimeException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public <T> Collection<T> decodeArray(String text, Class<T> clazz) throws Exception {try{__CLR4_5_2255f255flusvnkxa.R.inc(99999);
        __CLR4_5_2255f255flusvnkxa.R.inc(100000);try {
            __CLR4_5_2255f255flusvnkxa.R.inc(100001);return (Collection<T>) mapper.readValue(text, new TypeReference<T>() {
            });
        } catch (Exception e) {
            __CLR4_5_2255f255flusvnkxa.R.inc(100002);throw new RuntimeException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public final Object decodeObject(String text) {try{__CLR4_5_2255f255flusvnkxa.R.inc(100003);
        __CLR4_5_2255f255flusvnkxa.R.inc(100004);try {
            __CLR4_5_2255f255flusvnkxa.R.inc(100005);return (ObjectNode) mapper.readTree(text);
        } catch (Exception e) {
            __CLR4_5_2255f255flusvnkxa.R.inc(100006);throw new RuntimeException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public Object decode(String text) {try{__CLR4_5_2255f255flusvnkxa.R.inc(100007);
        __CLR4_5_2255f255flusvnkxa.R.inc(100008);try {
            __CLR4_5_2255f255flusvnkxa.R.inc(100009);return mapper.readTree(text);
        } catch (Exception e) {
            __CLR4_5_2255f255flusvnkxa.R.inc(100010);throw new RuntimeException(e.getMessage(), e);
        }
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    public String encode(Object object) throws Exception {try{__CLR4_5_2255f255flusvnkxa.R.inc(100011);
        __CLR4_5_2255f255flusvnkxa.R.inc(100012);return mapper.writeValueAsString(object);
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    @Override
    public byte[] encodeToBytes(Object object) throws Exception {try{__CLR4_5_2255f255flusvnkxa.R.inc(100013);
        __CLR4_5_2255f255flusvnkxa.R.inc(100014);return mapper.writeValueAsBytes(object);
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}

    @Override
    public void encode(OutputStream out, Object object) throws Exception {try{__CLR4_5_2255f255flusvnkxa.R.inc(100015);
        __CLR4_5_2255f255flusvnkxa.R.inc(100016);Class<?> clazz = object.getClass();
        __CLR4_5_2255f255flusvnkxa.R.inc(100017);JsonGenerator generator = constructGenerator(out);
        __CLR4_5_2255f255flusvnkxa.R.inc(100018);JavaType type = mapper.getTypeFactory().constructType(clazz);
        __CLR4_5_2255f255flusvnkxa.R.inc(100019);ObjectWriter writer = mapper.writerFor(type);
        __CLR4_5_2255f255flusvnkxa.R.inc(100020);writer.writeValue(generator, object);
        __CLR4_5_2255f255flusvnkxa.R.inc(100021);generator.close();
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}
    
    protected final JsonGenerator constructGenerator(OutputStream out) throws IOException {try{__CLR4_5_2255f255flusvnkxa.R.inc(100022);
        __CLR4_5_2255f255flusvnkxa.R.inc(100023);return mapper.getFactory().createGenerator(out, JsonEncoding.UTF8);
    }finally{__CLR4_5_2255f255flusvnkxa.R.flushNeeded();}}
}
