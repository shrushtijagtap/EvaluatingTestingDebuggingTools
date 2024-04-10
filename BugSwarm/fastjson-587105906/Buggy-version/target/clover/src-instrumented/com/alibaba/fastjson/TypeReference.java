/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.util.TypeUtils;

/** 
 * Represents a generic type {@code T}. Java doesn't yet provide a way to
 * represent generic types, so this class does. Forces clients to create a
 * subclass of this class which enables retrieval the type information even at
 * runtime.
 *
 * <p>For example, to create a type literal for {@code List<String>}, you can
 * create an empty anonymous inner class:
 *
 * <pre>
 * TypeReference&lt;List&lt;String&gt;&gt; list = new TypeReference&lt;List&lt;String&gt;&gt;() {};
 * </pre>
 * This syntax cannot be used to create type literals that have wildcard
 * parameters, such as {@code Class<?>} or {@code List<? extends CharSequence>}.
 */
public class TypeReference<T> {public static class __CLR4_1_1047i47iluszvt2g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,5517,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static ConcurrentMap<Type, Type> classTypeCache
            = new ConcurrentHashMap<Type, Type>(16, 0.75f, 1);

    protected final Type type;

    /**
     * Constructs a new type literal. Derives represented class from type
     * parameter.
     *
     * <p>Clients create an empty anonymous subclass. Doing so embeds the type
     * parameter in the anonymous class's type hierarchy so we can reconstitute it
     * at runtime despite erasure.
     */
    protected TypeReference(){try{__CLR4_1_1047i47iluszvt2g.R.inc(5454);
        __CLR4_1_1047i47iluszvt2g.R.inc(5455);Type superClass = getClass().getGenericSuperclass();

        __CLR4_1_1047i47iluszvt2g.R.inc(5456);Type type = ((ParameterizedType) superClass).getActualTypeArguments()[0];

        __CLR4_1_1047i47iluszvt2g.R.inc(5457);Type cachedType = classTypeCache.get(type);
        __CLR4_1_1047i47iluszvt2g.R.inc(5458);if ((((cachedType == null)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5459)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5460)==0&false))) {{
            __CLR4_1_1047i47iluszvt2g.R.inc(5461);classTypeCache.putIfAbsent(type, type);
            __CLR4_1_1047i47iluszvt2g.R.inc(5462);cachedType = classTypeCache.get(type);
        }

        }__CLR4_1_1047i47iluszvt2g.R.inc(5463);this.type = cachedType;
    }finally{__CLR4_1_1047i47iluszvt2g.R.flushNeeded();}}

    /**
     * @since 1.2.9
     * @param actualTypeArguments
     */
    protected TypeReference(Type... actualTypeArguments){try{__CLR4_1_1047i47iluszvt2g.R.inc(5464);
        __CLR4_1_1047i47iluszvt2g.R.inc(5465);Class<?> thisClass = this.getClass();
        __CLR4_1_1047i47iluszvt2g.R.inc(5466);Type superClass = thisClass.getGenericSuperclass();

        __CLR4_1_1047i47iluszvt2g.R.inc(5467);ParameterizedType argType = (ParameterizedType) ((ParameterizedType) superClass).getActualTypeArguments()[0];
        __CLR4_1_1047i47iluszvt2g.R.inc(5468);Type rawType = argType.getRawType();
        __CLR4_1_1047i47iluszvt2g.R.inc(5469);Type[] argTypes = argType.getActualTypeArguments();

        __CLR4_1_1047i47iluszvt2g.R.inc(5470);int actualIndex = 0;
        __CLR4_1_1047i47iluszvt2g.R.inc(5471);for (int i = 0; (((i < argTypes.length)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5472)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5473)==0&false)); ++i) {{
            __CLR4_1_1047i47iluszvt2g.R.inc(5474);if ((((argTypes[i] instanceof TypeVariable &&
                    actualIndex < actualTypeArguments.length)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5475)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5476)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5477);argTypes[i] = actualTypeArguments[actualIndex++];
            }
            // fix for openjdk and android env
            }__CLR4_1_1047i47iluszvt2g.R.inc(5478);if ((((argTypes[i] instanceof GenericArrayType)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5479)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5480)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5481);argTypes[i] = TypeUtils.checkPrimitiveArray(
                        (GenericArrayType) argTypes[i]);
            }

            // \u5982\u679c\u6709\u591a\u5c42\u6cdb\u578b\u4e14\u8be5\u6cdb\u578b\u5df2\u7ecf\u6ce8\u660e\u5b9e\u73b0\u7684\u60c5\u51b5\u4e0b\uff0c\u5224\u65ad\u8be5\u6cdb\u578b\u4e0b\u4e00\u5c42\u662f\u5426\u8fd8\u6709\u6cdb\u578b
            }__CLR4_1_1047i47iluszvt2g.R.inc(5482);if((((argTypes[i] instanceof ParameterizedType)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5483)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5484)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5485);argTypes[i] = handlerParameterizedType((ParameterizedType) argTypes[i], actualTypeArguments, actualIndex);
            }
        }}

        }__CLR4_1_1047i47iluszvt2g.R.inc(5486);Type key = new ParameterizedTypeImpl(argTypes, thisClass, rawType);
        __CLR4_1_1047i47iluszvt2g.R.inc(5487);Type cachedType = classTypeCache.get(key);
        __CLR4_1_1047i47iluszvt2g.R.inc(5488);if ((((cachedType == null)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5489)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5490)==0&false))) {{
            __CLR4_1_1047i47iluszvt2g.R.inc(5491);classTypeCache.putIfAbsent(key, key);
            __CLR4_1_1047i47iluszvt2g.R.inc(5492);cachedType = classTypeCache.get(key);
        }

        }__CLR4_1_1047i47iluszvt2g.R.inc(5493);type = cachedType;

    }finally{__CLR4_1_1047i47iluszvt2g.R.flushNeeded();}}

    private Type handlerParameterizedType(ParameterizedType type, Type[] actualTypeArguments, int actualIndex) {try{__CLR4_1_1047i47iluszvt2g.R.inc(5494);
        __CLR4_1_1047i47iluszvt2g.R.inc(5495);Class<?> thisClass = this.getClass();
        __CLR4_1_1047i47iluszvt2g.R.inc(5496);Type rawType = type.getRawType();
        __CLR4_1_1047i47iluszvt2g.R.inc(5497);Type[] argTypes = type.getActualTypeArguments();

        __CLR4_1_1047i47iluszvt2g.R.inc(5498);for(int i = 0; (((i < argTypes.length)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5499)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5500)==0&false)); ++i) {{
            __CLR4_1_1047i47iluszvt2g.R.inc(5501);if ((((argTypes[i] instanceof TypeVariable && actualIndex < actualTypeArguments.length)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5502)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5503)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5504);argTypes[i] = actualTypeArguments[actualIndex++];
            }

            // fix for openjdk and android env
            }__CLR4_1_1047i47iluszvt2g.R.inc(5505);if ((((argTypes[i] instanceof GenericArrayType)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5506)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5507)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5508);argTypes[i] = TypeUtils.checkPrimitiveArray(
                        (GenericArrayType) argTypes[i]);
            }

            // \u5982\u679c\u6709\u591a\u5c42\u6cdb\u578b\u4e14\u8be5\u6cdb\u578b\u5df2\u7ecf\u6ce8\u660e\u5b9e\u73b0\u7684\u60c5\u51b5\u4e0b\uff0c\u5224\u65ad\u8be5\u6cdb\u578b\u4e0b\u4e00\u5c42\u662f\u5426\u8fd8\u6709\u6cdb\u578b
            }__CLR4_1_1047i47iluszvt2g.R.inc(5509);if((((argTypes[i] instanceof ParameterizedType)&&(__CLR4_1_1047i47iluszvt2g.R.iget(5510)!=0|true))||(__CLR4_1_1047i47iluszvt2g.R.iget(5511)==0&false))) {{
                __CLR4_1_1047i47iluszvt2g.R.inc(5512);return handlerParameterizedType((ParameterizedType) argTypes[i], actualTypeArguments, actualIndex);
            }
        }}

        }__CLR4_1_1047i47iluszvt2g.R.inc(5513);Type key = new ParameterizedTypeImpl(argTypes, thisClass, rawType);
        __CLR4_1_1047i47iluszvt2g.R.inc(5514);return key;
    }finally{__CLR4_1_1047i47iluszvt2g.R.flushNeeded();}}
    
    /**
     * Gets underlying {@code Type} instance.
     */
    public Type getType() {try{__CLR4_1_1047i47iluszvt2g.R.inc(5515);
        __CLR4_1_1047i47iluszvt2g.R.inc(5516);return type;
    }finally{__CLR4_1_1047i47iluszvt2g.R.flushNeeded();}}

    public final static Type LIST_STRING = new TypeReference<List<String>>() {}.getType();
}
