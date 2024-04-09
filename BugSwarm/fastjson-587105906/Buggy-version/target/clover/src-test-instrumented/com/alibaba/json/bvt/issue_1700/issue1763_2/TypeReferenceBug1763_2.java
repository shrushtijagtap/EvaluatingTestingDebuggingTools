/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1700.issue1763_2;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.util.ParameterizedTypeImpl;
import com.alibaba.fastjson.util.TypeUtils;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class TypeReferenceBug1763_2<T> {public static class __CLR4_1_101cgx1cgxlusqkamk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62855,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    protected TypeReferenceBug1763_2(){try{__CLR4_1_101cgx1cgxlusqkamk.R.inc(62817);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62818);Type superClass = getClass().getGenericSuperclass();

        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62819);Type type = ((ParameterizedType) superClass).getActualTypeArguments()[0];

        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62820);Type cachedType = classTypeCache.get(type);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62821);if ((((cachedType == null)&&(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62822)!=0|true))||(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62823)==0&false))) {{
            __CLR4_1_101cgx1cgxlusqkamk.R.inc(62824);classTypeCache.putIfAbsent(type, type);
            __CLR4_1_101cgx1cgxlusqkamk.R.inc(62825);cachedType = classTypeCache.get(type);
        }

        }__CLR4_1_101cgx1cgxlusqkamk.R.inc(62826);this.type = cachedType;
    }finally{__CLR4_1_101cgx1cgxlusqkamk.R.flushNeeded();}}

    /**
     * @since 1.2.9
     * @param actualTypeArguments
     */
    protected TypeReferenceBug1763_2(Type... actualTypeArguments){try{__CLR4_1_101cgx1cgxlusqkamk.R.inc(62827);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62828);Class<?> thisClass = this.getClass();
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62829);Type superClass = thisClass.getGenericSuperclass();

        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62830);ParameterizedType argType = (ParameterizedType) ((ParameterizedType) superClass).getActualTypeArguments()[0];
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62831);Type rawType = argType.getRawType();
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62832);Type[] argTypes = argType.getActualTypeArguments();

        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62833);int actualIndex = 0;
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62834);for (int i = 0; (((i < argTypes.length)&&(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62835)!=0|true))||(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62836)==0&false)); ++i) {{
            __CLR4_1_101cgx1cgxlusqkamk.R.inc(62837);if ((((argTypes[i] instanceof TypeVariable &&
                    actualIndex < actualTypeArguments.length)&&(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62838)!=0|true))||(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62839)==0&false))) {{
                __CLR4_1_101cgx1cgxlusqkamk.R.inc(62840);argTypes[i] = actualTypeArguments[actualIndex++];
            }
            // fix for openjdk and android env
            }__CLR4_1_101cgx1cgxlusqkamk.R.inc(62841);if ((((argTypes[i] instanceof GenericArrayType)&&(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62842)!=0|true))||(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62843)==0&false))) {{
                __CLR4_1_101cgx1cgxlusqkamk.R.inc(62844);argTypes[i] = TypeUtils.checkPrimitiveArray(
                        (GenericArrayType) argTypes[i]);
            }

        }}

        }__CLR4_1_101cgx1cgxlusqkamk.R.inc(62845);Type key = new ParameterizedTypeImpl(argTypes, thisClass, rawType);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62846);Type cachedType = classTypeCache.get(key);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62847);if ((((cachedType == null)&&(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62848)!=0|true))||(__CLR4_1_101cgx1cgxlusqkamk.R.iget(62849)==0&false))) {{
            __CLR4_1_101cgx1cgxlusqkamk.R.inc(62850);classTypeCache.putIfAbsent(key, key);
            __CLR4_1_101cgx1cgxlusqkamk.R.inc(62851);cachedType = classTypeCache.get(key);
        }

        }__CLR4_1_101cgx1cgxlusqkamk.R.inc(62852);type = cachedType;

    }finally{__CLR4_1_101cgx1cgxlusqkamk.R.flushNeeded();}}

    /**
     * Gets underlying {@code Type} instance.
     */
    public Type getType() {try{__CLR4_1_101cgx1cgxlusqkamk.R.inc(62853);
        __CLR4_1_101cgx1cgxlusqkamk.R.inc(62854);return type;
    }finally{__CLR4_1_101cgx1cgxlusqkamk.R.flushNeeded();}}

    public final static Type LIST_STRING = new TypeReference<List<String>>() {}.getType();
}
