/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.deserializer.issues569.parser;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.*;
import com.alibaba.fastjson.serializer.AwtCodec;
import com.alibaba.fastjson.serializer.CollectionCodec;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.ObjectArrayCodec;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.ServiceLoader;
import com.alibaba.fastjson.util.TypeUtils;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.*;

/**
 * Author : BlackShadowWalker
 * Date   : 2016-10-10
 */
public class ParserConfigBug569 extends ParserConfig {public static class __CLR4_1_10vetvetluszw4b7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,40856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static boolean                                  awtError    = false;
    private static boolean                                  jdk8Error   = false;
    private String[]                                        denyList    = new String[] { "java.lang.Thread" };

    public FieldDeserializer createFieldDeserializer(ParserConfig mapping, //
                                                     JavaBeanInfo beanInfo, //
                                                     FieldInfo fieldInfo) {try{__CLR4_1_10vetvetluszw4b7.R.inc(40709);
        __CLR4_1_10vetvetluszw4b7.R.inc(40710);Class<?> clazz = beanInfo.clazz;
        __CLR4_1_10vetvetluszw4b7.R.inc(40711);Class<?> fieldClass = fieldInfo.fieldClass;

        __CLR4_1_10vetvetluszw4b7.R.inc(40712);Class<?> deserializeUsing = null;
        __CLR4_1_10vetvetluszw4b7.R.inc(40713);JSONField annotation = fieldInfo.getAnnotation();
        __CLR4_1_10vetvetluszw4b7.R.inc(40714);if ((((annotation != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40715)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40716)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40717);deserializeUsing = annotation.deserializeUsing();
            __CLR4_1_10vetvetluszw4b7.R.inc(40718);if ((((deserializeUsing == Void.class)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40719)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40720)==0&false))) {{
                __CLR4_1_10vetvetluszw4b7.R.inc(40721);deserializeUsing = null;
            }
        }}

        }__CLR4_1_10vetvetluszw4b7.R.inc(40722);if ((((deserializeUsing == null && (fieldClass == List.class || fieldClass == ArrayList.class))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40723)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40724)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40725);return new ArrayListTypeFieldDeserializer(mapping, clazz, fieldInfo);
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40726);return new DefaultFieldDeserializerBug569(mapping, clazz, fieldInfo);
    }finally{__CLR4_1_10vetvetluszw4b7.R.flushNeeded();}}

    public ObjectDeserializer getDeserializer(Class<?> clazz, Type type) {try{__CLR4_1_10vetvetluszw4b7.R.inc(40727);
        __CLR4_1_10vetvetluszw4b7.R.inc(40728);com.alibaba.fastjson.util.IdentityHashMap<Type, ObjectDeserializer> deserializers = super.getDeserializers();
        __CLR4_1_10vetvetluszw4b7.R.inc(40729);ObjectDeserializer deserializer = deserializers.get(type);
        __CLR4_1_10vetvetluszw4b7.R.inc(40730);if ((((deserializer != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40731)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40732)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40733);return deserializer;
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40734);if ((((type == null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40735)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40736)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40737);type = clazz;
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40738);deserializer = deserializers.get(type);
        __CLR4_1_10vetvetluszw4b7.R.inc(40739);if ((((deserializer != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40740)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40741)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40742);return deserializer;
        }

        }{
            __CLR4_1_10vetvetluszw4b7.R.inc(40743);JSONType annotation = TypeUtils.getAnnotation(clazz,JSONType.class);
            __CLR4_1_10vetvetluszw4b7.R.inc(40744);if ((((annotation != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40745)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40746)==0&false))) {{
                __CLR4_1_10vetvetluszw4b7.R.inc(40747);Class<?> mappingTo = annotation.mappingTo();
                __CLR4_1_10vetvetluszw4b7.R.inc(40748);if ((((mappingTo != Void.class)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40749)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40750)==0&false))) {{
                    __CLR4_1_10vetvetluszw4b7.R.inc(40751);return getDeserializer(mappingTo, mappingTo);
                }
            }}
        }}

        __CLR4_1_10vetvetluszw4b7.R.inc(40752);if ((((type instanceof WildcardType || type instanceof TypeVariable || type instanceof ParameterizedType)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40753)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40754)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40755);deserializer = deserializers.get(clazz);
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40756);if ((((deserializer != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40757)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40758)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40759);return deserializer;
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40760);String className = clazz.getName();
        __CLR4_1_10vetvetluszw4b7.R.inc(40761);className = className.replace('$', '.');
        __CLR4_1_10vetvetluszw4b7.R.inc(40762);for (int i = 0; (((i < denyList.length)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40763)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40764)==0&false)); ++i) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40765);String deny = denyList[i];
            __CLR4_1_10vetvetluszw4b7.R.inc(40766);if ((((className.startsWith(deny))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40767)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40768)==0&false))) {{
                __CLR4_1_10vetvetluszw4b7.R.inc(40769);throw new JSONException("parser deny : " + className);
            }
        }}

        }__CLR4_1_10vetvetluszw4b7.R.inc(40770);if ((((className.startsWith("java.awt.") //
                && AwtCodec.support(clazz))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40771)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40772)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40773);if ((((!awtError)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40774)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40775)==0&false))) {{
                __CLR4_1_10vetvetluszw4b7.R.inc(40776);try {
                    __CLR4_1_10vetvetluszw4b7.R.inc(40777);deserializers.put(Class.forName("java.awt.Point"), AwtCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40778);deserializers.put(Class.forName("java.awt.Font"), AwtCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40779);deserializers.put(Class.forName("java.awt.Rectangle"), AwtCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40780);deserializers.put(Class.forName("java.awt.Color"), AwtCodec.instance);
                } catch (Throwable e) {
                    // skip
                    __CLR4_1_10vetvetluszw4b7.R.inc(40781);awtError = true;
                }

                __CLR4_1_10vetvetluszw4b7.R.inc(40782);deserializer = AwtCodec.instance;
            }
        }}

        }__CLR4_1_10vetvetluszw4b7.R.inc(40783);if ((((!jdk8Error)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40784)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40785)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40786);try {
                __CLR4_1_10vetvetluszw4b7.R.inc(40787);if ((((className.startsWith("java.time."))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40788)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40789)==0&false))) {{

                    __CLR4_1_10vetvetluszw4b7.R.inc(40790);deserializers.put(Class.forName("java.time.LocalDateTime"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40791);deserializers.put(Class.forName("java.time.LocalDate"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40792);deserializers.put(Class.forName("java.time.LocalTime"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40793);deserializers.put(Class.forName("java.time.ZonedDateTime"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40794);deserializers.put(Class.forName("java.time.OffsetDateTime"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40795);deserializers.put(Class.forName("java.time.OffsetTime"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40796);deserializers.put(Class.forName("java.time.ZoneOffset"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40797);deserializers.put(Class.forName("java.time.ZoneRegion"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40798);deserializers.put(Class.forName("java.time.ZoneId"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40799);deserializers.put(Class.forName("java.time.Period"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40800);deserializers.put(Class.forName("java.time.Duration"), Jdk8DateCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40801);deserializers.put(Class.forName("java.time.Instant"), Jdk8DateCodec.instance);

                    __CLR4_1_10vetvetluszw4b7.R.inc(40802);deserializer = deserializers.get(clazz);
                } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40803);if ((((className.startsWith("java.util.Optional"))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40804)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40805)==0&false))) {{

                    __CLR4_1_10vetvetluszw4b7.R.inc(40806);deserializers.put(Class.forName("java.util.Optional"), OptionalCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40807);deserializers.put(Class.forName("java.util.OptionalDouble"), OptionalCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40808);deserializers.put(Class.forName("java.util.OptionalInt"), OptionalCodec.instance);
                    __CLR4_1_10vetvetluszw4b7.R.inc(40809);deserializers.put(Class.forName("java.util.OptionalLong"), OptionalCodec.instance);

                    __CLR4_1_10vetvetluszw4b7.R.inc(40810);deserializer = deserializers.get(clazz);
                }
            }}} catch (Throwable e) {
                // skip
                __CLR4_1_10vetvetluszw4b7.R.inc(40811);jdk8Error = true;
            }
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40812);if ((((className.equals("java.nio.file.Path"))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40813)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40814)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40815);deserializers.put(clazz, MiscCodec.instance);
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40816);final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        __CLR4_1_10vetvetluszw4b7.R.inc(40817);try {
            __CLR4_1_10vetvetluszw4b7.R.inc(40818);for (AutowiredObjectDeserializer autowired : ServiceLoader.load(AutowiredObjectDeserializer.class,
                    classLoader)) {{
                __CLR4_1_10vetvetluszw4b7.R.inc(40819);for (Type forType : autowired.getAutowiredFor()) {{
                    __CLR4_1_10vetvetluszw4b7.R.inc(40820);deserializers.put(forType, autowired);
                }
            }}
        }} catch (Exception ex) {
            // skip
        }

        __CLR4_1_10vetvetluszw4b7.R.inc(40821);if ((((deserializer == null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40822)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40823)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40824);deserializer = deserializers.get(type);
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40825);if ((((deserializer != null)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40826)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40827)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40828);return deserializer;
        }

        }__CLR4_1_10vetvetluszw4b7.R.inc(40829);if ((((clazz.isEnum())&&(__CLR4_1_10vetvetluszw4b7.R.iget(40830)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40831)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40832);deserializer = new EnumDeserializer(clazz);
        } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40833);if ((((clazz.isArray())&&(__CLR4_1_10vetvetluszw4b7.R.iget(40834)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40835)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40836);deserializer = ObjectArrayCodec.instance;
        } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40837);if ((((clazz == Set.class || clazz == HashSet.class || clazz == Collection.class || clazz == List.class
                || clazz == ArrayList.class)&&(__CLR4_1_10vetvetluszw4b7.R.iget(40838)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40839)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40840);deserializer = CollectionCodec.instance;
        } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40841);if ((((Collection.class.isAssignableFrom(clazz))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40842)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40843)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40844);deserializer = CollectionCodec.instance;
        } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40845);if ((((Map.class.isAssignableFrom(clazz))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40846)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40847)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40848);deserializer = MapDeserializer.instance;
        } }else {__CLR4_1_10vetvetluszw4b7.R.inc(40849);if ((((Throwable.class.isAssignableFrom(clazz))&&(__CLR4_1_10vetvetluszw4b7.R.iget(40850)!=0|true))||(__CLR4_1_10vetvetluszw4b7.R.iget(40851)==0&false))) {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40852);deserializer = new ThrowableDeserializer(this, clazz);
        } }else {{
            __CLR4_1_10vetvetluszw4b7.R.inc(40853);deserializer = createJavaBeanDeserializer(clazz, type);
        }

        }}}}}}__CLR4_1_10vetvetluszw4b7.R.inc(40854);putDeserializer(type, deserializer);

        __CLR4_1_10vetvetluszw4b7.R.inc(40855);return deserializer;
    }finally{__CLR4_1_10vetvetluszw4b7.R.flushNeeded();}}

}
