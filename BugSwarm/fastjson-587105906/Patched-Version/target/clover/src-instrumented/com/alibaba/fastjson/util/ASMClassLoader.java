/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import java.security.PrivilegedAction;
import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONAware;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.JSONStreamAware;
import com.alibaba.fastjson.JSONWriter;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONReaderScanner;
import com.alibaba.fastjson.parser.JSONScanner;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer;
import com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessable;
import com.alibaba.fastjson.parser.deserializer.ExtraProcessor;
import com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider;
import com.alibaba.fastjson.parser.deserializer.FieldDeserializer;
import com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.AfterFilter;
import com.alibaba.fastjson.serializer.BeanContext;
import com.alibaba.fastjson.serializer.BeforeFilter;
import com.alibaba.fastjson.serializer.ContextObjectSerializer;
import com.alibaba.fastjson.serializer.ContextValueFilter;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.LabelFilter;
import com.alibaba.fastjson.serializer.Labels;
import com.alibaba.fastjson.serializer.NameFilter;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.PropertyFilter;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerialContext;
import com.alibaba.fastjson.serializer.SerializeBeanInfo;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeFilter;
import com.alibaba.fastjson.serializer.SerializeFilterable;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.ValueFilter;

public class ASMClassLoader extends ClassLoader {public static class __CLR4_5_2p5qp5qlusyjnyy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,32654,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static java.security.ProtectionDomain DOMAIN;
    
    private static Map<String, Class<?>> classMapping = new HashMap<String, Class<?>>();

    static {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32606);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32607);DOMAIN = (java.security.ProtectionDomain) java.security.AccessController.doPrivileged(new PrivilegedAction<Object>() {

            public Object run() {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32608);
                __CLR4_5_2p5qp5qlusyjnyy.R.inc(32609);return ASMClassLoader.class.getProtectionDomain();
            }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}
        });
        
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32610);Class<?>[] jsonClasses = new Class<?>[] {JSON.class,
            JSONObject.class,
            JSONArray.class,
            JSONPath.class,
            JSONAware.class,
            JSONException.class,
            JSONPathException.class,
            JSONReader.class,
            JSONStreamAware.class,
            JSONWriter.class,
            TypeReference.class,
                    
            FieldInfo.class,
            TypeUtils.class,
            IOUtils.class,
            IdentityHashMap.class,
            ParameterizedTypeImpl.class,
            JavaBeanInfo.class,
                    
            ObjectSerializer.class,
            JavaBeanSerializer.class,
            SerializeFilterable.class,
            SerializeBeanInfo.class,
            JSONSerializer.class,
            SerializeWriter.class,
            SerializeFilter.class,
            Labels.class,
            LabelFilter.class,
            ContextValueFilter.class,
            AfterFilter.class,
            BeforeFilter.class,
            NameFilter.class,
            PropertyFilter.class,
            PropertyPreFilter.class,
            ValueFilter.class,
            SerializerFeature.class,
            ContextObjectSerializer.class,
            SerialContext.class,
            SerializeConfig.class,
                    
            JavaBeanDeserializer.class,
            ParserConfig.class,
            DefaultJSONParser.class,
            JSONLexer.class,
            JSONLexerBase.class,
            ParseContext.class,
            JSONToken.class,
            SymbolTable.class,
            Feature.class,
            JSONScanner.class,
            JSONReaderScanner.class,
                    
            AutowiredObjectDeserializer.class,
            ObjectDeserializer.class,
            ExtraProcessor.class,
            ExtraProcessable.class,
            ExtraTypeProvider.class,
            BeanContext.class,
            FieldDeserializer.class,
            DefaultFieldDeserializer.class,
        };
        
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32611);for (Class<?> clazz : jsonClasses) {{
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32612);classMapping.put(clazz.getName(), clazz);
        }
    }}finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}
    
    public ASMClassLoader(){
        super(getParentClassLoader());__CLR4_5_2p5qp5qlusyjnyy.R.inc(32614);try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32613);
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

    public ASMClassLoader(ClassLoader parent){
        super (parent);__CLR4_5_2p5qp5qlusyjnyy.R.inc(32616);try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32615);
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

    static ClassLoader getParentClassLoader() {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32617);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32618);ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32619);if ((((contextClassLoader != null)&&(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32620)!=0|true))||(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32621)==0&false))) {{
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32622);try {
                __CLR4_5_2p5qp5qlusyjnyy.R.inc(32623);contextClassLoader.loadClass(JSON.class.getName());
                __CLR4_5_2p5qp5qlusyjnyy.R.inc(32624);return contextClassLoader;
            } catch (ClassNotFoundException e) {
                // skip
            }
        }
        }__CLR4_5_2p5qp5qlusyjnyy.R.inc(32625);return JSON.class.getClassLoader();
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

    protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32626);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32627);Class<?> mappingClass = classMapping.get(name);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32628);if ((((mappingClass != null)&&(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32629)!=0|true))||(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32630)==0&false))) {{
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32631);return mappingClass;
        }
        
        }__CLR4_5_2p5qp5qlusyjnyy.R.inc(32632);try {
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32633);return super.loadClass(name, resolve);
        } catch (ClassNotFoundException e) {
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32634);throw e;
        }
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

    public Class<?> defineClassPublic(String name, byte[] b, int off, int len) throws ClassFormatError {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32635);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32636);Class<?> clazz = defineClass(name, b, off, len, DOMAIN);

        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32637);return clazz;
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

    public boolean isExternalClass(Class<?> clazz) {try{__CLR4_5_2p5qp5qlusyjnyy.R.inc(32638);
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32639);ClassLoader classLoader = clazz.getClassLoader();

        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32640);if ((((classLoader == null)&&(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32641)!=0|true))||(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32642)==0&false))) {{
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32643);return false;
        }

        }__CLR4_5_2p5qp5qlusyjnyy.R.inc(32644);ClassLoader current = this;
        __CLR4_5_2p5qp5qlusyjnyy.R.inc(32645);while ((((current != null)&&(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32646)!=0|true))||(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32647)==0&false))) {{
            __CLR4_5_2p5qp5qlusyjnyy.R.inc(32648);if ((((current == classLoader)&&(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32649)!=0|true))||(__CLR4_5_2p5qp5qlusyjnyy.R.iget(32650)==0&false))) {{
                __CLR4_5_2p5qp5qlusyjnyy.R.inc(32651);return false;
            }

            }__CLR4_5_2p5qp5qlusyjnyy.R.inc(32652);current = current.getParent();
        }

        }__CLR4_5_2p5qp5qlusyjnyy.R.inc(32653);return true;
    }finally{__CLR4_5_2p5qp5qlusyjnyy.R.flushNeeded();}}

}
