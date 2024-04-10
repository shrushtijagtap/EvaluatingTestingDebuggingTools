/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;

public class JavaBeanDeserializer implements ObjectDeserializer {public static class __CLR4_5_2eyyeyylusyjlw5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,21017,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final FieldDeserializer[]   fieldDeserializers;
    protected final FieldDeserializer[] sortedFieldDeserializers;
    protected final Class<?>            clazz;
    public final JavaBeanInfo           beanInfo;
    private ConcurrentMap<String, Object> extraFieldDeserializers;

    private final Map<String, FieldDeserializer> alterNameFieldDeserializers;
    private Map<String, FieldDeserializer> fieldDeserializerMap;

    private transient long[] smartMatchHashArray;
    private transient short[] smartMatchHashArrayMapping;

    private transient long[] hashArray;
    private transient short[] hashArrayMapping;
    
    public JavaBeanDeserializer(ParserConfig config, Class<?> clazz) {
        this(config, clazz, clazz);__CLR4_5_2eyyeyylusyjlw5.R.inc(19403);try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19402);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public JavaBeanDeserializer(ParserConfig config, Class<?> clazz, Type type){
        this(config //
                , JavaBeanInfo.build(clazz, type, config.propertyNamingStrategy, config.fieldBased, config.compatibleWithJavaBean, config.isJacksonCompatible())
        );__CLR4_5_2eyyeyylusyjlw5.R.inc(19405);try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19404);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public JavaBeanDeserializer(ParserConfig config, JavaBeanInfo beanInfo){try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19406);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19407);this.clazz = beanInfo.clazz;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19408);this.beanInfo = beanInfo;

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19409);Map<String, FieldDeserializer> alterNameFieldDeserializers = null;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19410);sortedFieldDeserializers = new FieldDeserializer[beanInfo.sortedFields.length];
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19411);for (int i = 0, size = beanInfo.sortedFields.length; (((i < size)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19412)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19413)==0&false)); ++i) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19414);FieldInfo fieldInfo = beanInfo.sortedFields[i];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19415);FieldDeserializer fieldDeserializer = config.createFieldDeserializer(config, beanInfo, fieldInfo);

            __CLR4_5_2eyyeyylusyjlw5.R.inc(19416);sortedFieldDeserializers[i] = fieldDeserializer;

            __CLR4_5_2eyyeyylusyjlw5.R.inc(19417);if ((((size > 128)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19418)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19419)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19420);if ((((fieldDeserializerMap == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19421)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19422)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19423);fieldDeserializerMap = new HashMap<String, FieldDeserializer>();
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19424);fieldDeserializerMap.put(fieldInfo.name, fieldDeserializer);
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19425);for (String name : fieldInfo.alternateNames) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19426);if ((((alterNameFieldDeserializers == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19427)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19428)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19429);alterNameFieldDeserializers = new HashMap<String, FieldDeserializer>();
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19430);alterNameFieldDeserializers.put(name, fieldDeserializer);
            }
        }}
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19431);this.alterNameFieldDeserializers = alterNameFieldDeserializers;

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19432);fieldDeserializers = new FieldDeserializer[beanInfo.fields.length];
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19433);for (int i = 0, size = beanInfo.fields.length; (((i < size)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19434)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19435)==0&false)); ++i) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19436);FieldInfo fieldInfo = beanInfo.fields[i];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19437);FieldDeserializer fieldDeserializer = getFieldDeserializer(fieldInfo.name);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19438);fieldDeserializers[i] = fieldDeserializer;
        }
    }}finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public FieldDeserializer getFieldDeserializer(String key) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19439);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19440);return getFieldDeserializer(key, null);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public FieldDeserializer getFieldDeserializer(String key, int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19441);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19442);if ((((key == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19443)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19444)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19445);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19446);if ((((fieldDeserializerMap != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19447)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19448)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19449);FieldDeserializer fieldDeserializer = fieldDeserializerMap.get(key);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19450);if ((((fieldDeserializer != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19451)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19452)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19453);return fieldDeserializer;
            }
        }}
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19454);int low = 0;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19455);int high = sortedFieldDeserializers.length - 1;

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19456);while ((((low <= high)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19457)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19458)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19459);int mid = (low + high) >>> 1;
            
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19460);String fieldName = sortedFieldDeserializers[mid].fieldInfo.name;
            
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19461);int cmp = fieldName.compareTo(key);

            __CLR4_5_2eyyeyylusyjlw5.R.inc(19462);if ((((cmp < 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19463)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19464)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19465);low = mid + 1;
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19466);if ((((cmp > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19467)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19468)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19469);high = mid - 1;
            } }else {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19470);if ((((isSetFlag(mid, setFlags))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19471)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19472)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19473);return null;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19474);return sortedFieldDeserializers[mid]; // key found
            }
        }}}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19475);if((((this.alterNameFieldDeserializers != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19476)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19477)==0&false))){{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19478);return this.alterNameFieldDeserializers.get(key);
        }
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19479);return null;  // key not found.
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public FieldDeserializer getFieldDeserializer(long hash) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19480);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19481);if ((((this.hashArray == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19482)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19483)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19484);long[] hashArray = new long[sortedFieldDeserializers.length];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19485);for (int i = 0; (((i < sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19486)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19487)==0&false)); i++) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19488);hashArray[i] = TypeUtils.fnv1a_64(sortedFieldDeserializers[i].fieldInfo.name);
            }
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19489);Arrays.sort(hashArray);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19490);this.hashArray = hashArray;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19491);int pos = Arrays.binarySearch(hashArray, hash);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19492);if ((((pos < 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19493)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19494)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19495);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19496);if ((((hashArrayMapping == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19497)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19498)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19499);short[] mapping = new short[hashArray.length];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19500);Arrays.fill(mapping, (short) -1);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19501);for (int i = 0; (((i < sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19502)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19503)==0&false)); i++) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19504);int p = Arrays.binarySearch(hashArray
                        , TypeUtils.fnv1a_64(sortedFieldDeserializers[i].fieldInfo.name));
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19505);if ((((p >= 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19506)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19507)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19508);mapping[p] = (short) i;
                }
            }}
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19509);hashArrayMapping = mapping;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19510);int setterIndex = hashArrayMapping[pos];
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19511);if ((((setterIndex != -1)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19512)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19513)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19514);return sortedFieldDeserializers[setterIndex];
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19515);return null; // key not found.
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    static boolean isSetFlag(int i, int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19516);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19517);if ((((setFlags == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19518)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19519)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19520);return false;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19521);int flagIndex = i / 32;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19522);int bitIndex = i % 32;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19523);if ((((flagIndex < setFlags.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19524)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19525)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19526);if (((((setFlags[flagIndex] & (1 << bitIndex)) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19527)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19528)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19529);return true;
            }
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19530);return false;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public Object createInstance(DefaultJSONParser parser, Type type) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19531);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19532);if ((((type instanceof Class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19533)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19534)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19535);if ((((clazz.isInterface())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19536)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19537)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19538);Class<?> clazz = (Class<?>) type;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19539);ClassLoader loader = Thread.currentThread().getContextClassLoader();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19540);final JSONObject obj = new JSONObject();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19541);Object proxy = Proxy.newProxyInstance(loader, new Class<?>[] { clazz }, obj);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19542);return proxy;
            }
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19543);if ((((beanInfo.defaultConstructor == null && beanInfo.factoryMethod == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19544)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19545)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19546);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19547);if ((((beanInfo.factoryMethod != null && beanInfo.defaultConstructorParameterSize > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19548)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19549)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19550);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19551);Object object;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19552);try {
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19553);Constructor<?> constructor = beanInfo.defaultConstructor;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19554);if ((((beanInfo.defaultConstructorParameterSize == 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19555)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19556)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19557);if ((((constructor != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19558)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19559)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19560);object = constructor.newInstance();
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19561);object = beanInfo.factoryMethod.invoke(null);
                }
            }} }else {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19562);ParseContext context = parser.getContext();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19563);if ((((context == null || context.object == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19564)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19565)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19566);throw new JSONException("can't create non-static inner class instance.");
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19567);final String typeName;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19568);if ((((type instanceof Class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19569)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19570)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19571);typeName = ((Class<?>) type).getName();
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19572);throw new JSONException("can't create non-static inner class instance.");
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19573);final int lastIndex = typeName.lastIndexOf('$');
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19574);String parentClassName = typeName.substring(0, lastIndex);

                __CLR4_5_2eyyeyylusyjlw5.R.inc(19575);Object ctxObj = context.object;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19576);String parentName = ctxObj.getClass().getName();

                __CLR4_5_2eyyeyylusyjlw5.R.inc(19577);Object param = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19578);if ((((!parentName.equals(parentClassName))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19579)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19580)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19581);ParseContext parentContext = context.parent;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19582);if ((((parentContext != null
                            && parentContext.object != null
                            && ("java.util.ArrayList".equals(parentName)
                            || "java.util.List".equals(parentName)
                            || "java.util.Collection".equals(parentName)
                            || "java.util.Map".equals(parentName)
                            || "java.util.HashMap".equals(parentName)))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19583)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19584)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19585);parentName = parentContext.object.getClass().getName();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19586);if ((((parentName.equals(parentClassName))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19587)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19588)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19589);param = parentContext.object;
                        }
                    }} }else {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19590);param = ctxObj;
                    }
                }} }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19591);param = ctxObj;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19592);if ((((param == null || param instanceof Collection && ((Collection)param).isEmpty())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19593)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19594)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19595);throw new JSONException("can't create non-static inner class instance.");
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19596);object = constructor.newInstance(param);
            }
        }} catch (JSONException e) {
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19597);throw e;
        } catch (Exception e) {
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19598);throw new JSONException("create instance error, class " + clazz.getName(), e);
        }

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19599);if ((((parser != null // 
                && parser.lexer.isEnabled(Feature.InitStringFieldAsEmpty))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19600)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19601)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19602);for (FieldInfo fieldInfo : beanInfo.fields) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19603);if ((((fieldInfo.fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19604)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19605)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19606);try {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19607);fieldInfo.set(object, "");
                    } catch (Exception e) {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19608);throw new JSONException("create instance error, class " + clazz.getName(), e);
                    }
                }
            }}
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19609);return object;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19610);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19611);return deserialze(parser, type, fieldName, 0);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName, int features) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19612);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19613);return deserialze(parser, type, fieldName, null, features, null);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked" })
    public <T> T deserialzeArrayMapping(DefaultJSONParser parser, Type type, Object fieldName, Object object) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19614);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19615);final JSONLexer lexer = parser.lexer; // xxx
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19616);if ((((lexer.token() != JSONToken.LBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19617)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19618)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19619);throw new JSONException("error");
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19620);object = createInstance(parser, type);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19621);for (int i = 0, size = sortedFieldDeserializers.length; (((i < size)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19622)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19623)==0&false)); ++i) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19624);final char seperator = ((((i == size - 1) )&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19625)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19626)==0&false))? ']' : ',';
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19627);FieldDeserializer fieldDeser = sortedFieldDeserializers[i];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19628);Class<?> fieldClass = fieldDeser.fieldInfo.fieldClass;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19629);if ((((fieldClass == int.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19630)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19631)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19632);int value = lexer.scanInt(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19633);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19634);if ((((fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19635)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19636)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19637);String value = lexer.scanString(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19638);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19639);if ((((fieldClass == long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19640)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19641)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19642);long value = lexer.scanLong(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19643);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19644);if ((((fieldClass.isEnum())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19645)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19646)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19647);char ch = lexer.getCurrent();
                
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19648);Object value;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19649);if ((((ch == '\"' || ch == 'n')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19650)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19651)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19652);value = lexer.scanEnum(fieldClass, parser.getSymbolTable(), seperator);
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19653);if ((((ch >= '0' && ch <= '9')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19654)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19655)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19656);int ordinal = lexer.scanInt(seperator);
                    
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19657);EnumDeserializer enumDeser = (EnumDeserializer) ((DefaultFieldDeserializer) fieldDeser).getFieldValueDeserilizer(parser.getConfig());
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19658);value = enumDeser.valueOf(ordinal);
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19659);value = scanEnum(lexer, seperator);
                }
                
                }}__CLR4_5_2eyyeyylusyjlw5.R.inc(19660);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19661);if ((((fieldClass == boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19662)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19663)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19664);boolean value = lexer.scanBoolean(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19665);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19666);if ((((fieldClass == float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19667)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19668)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19669);float value = lexer.scanFloat(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19670);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19671);if ((((fieldClass == double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19672)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19673)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19674);double value = lexer.scanDouble(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19675);fieldDeser.setValue(object, value);
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19676);if ((((fieldClass == java.util.Date.class && lexer.getCurrent() == '1')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19677)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19678)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19679);long longValue = lexer.scanLong(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19680);fieldDeser.setValue(object, new java.util.Date(longValue));
            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19681);if ((((fieldClass == BigDecimal.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19682)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19683)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19684);BigDecimal value = lexer.scanDecimal(seperator);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19685);fieldDeser.setValue(object, value);
            } }else {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19686);lexer.nextToken(JSONToken.LBRACKET);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19687);Object value = parser.parseObject(fieldDeser.fieldInfo.fieldType, fieldDeser.fieldInfo.name);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19688);fieldDeser.setValue(object, value);

                __CLR4_5_2eyyeyylusyjlw5.R.inc(19689);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19690)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19691)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19692);break;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19693);check(lexer, (((seperator == ']' )&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19694)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19695)==0&false))? JSONToken.RBRACKET : JSONToken.COMMA);
                // parser.accept(seperator == ']' ? JSONToken.RBRACKET : JSONToken.COMMA);
            }
        }}}}}}}}}}
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19696);lexer.nextToken(JSONToken.COMMA);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19697);return (T) object;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    protected void check(final JSONLexer lexer, int token) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19698);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19699);if ((((lexer.token() != token)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19700)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19701)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19702);throw new JSONException("syntax error");
        }
    }}finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    protected Enum<?> scanEnum(JSONLexer lexer, char seperator) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19703);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19704);throw new JSONException("illegal enum. " + lexer.info());
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected <T> T deserialze(DefaultJSONParser parser, // 
                               Type type, // 
                               Object fieldName, // 
                               Object object, //
                               int features, //
                               int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(19705);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19706);if ((((type == JSON.class || type == JSONObject.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19707)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19708)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19709);return (T) parser.parse();
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19710);final JSONLexerBase lexer = (JSONLexerBase) parser.lexer; // xxx
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19711);final ParserConfig config = parser.getConfig();

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19712);int token = lexer.token();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19713);if ((((token == JSONToken.NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19714)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19715)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19716);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19717);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19718);ParseContext context = parser.getContext();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(19719);if ((((object != null && context != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19720)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19721)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19722);context = context.parent;
        }
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19723);ParseContext childContext = null;

        __CLR4_5_2eyyeyylusyjlw5.R.inc(19724);try {
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19725);Map<String, Object> fieldValues = null;

            __CLR4_5_2eyyeyylusyjlw5.R.inc(19726);if ((((token == JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19727)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19728)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19729);lexer.nextToken(JSONToken.COMMA);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19730);if ((((object == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19731)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19732)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19733);object = createInstance(parser, type);
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19734);return (T) object;
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19735);if ((((token == JSONToken.LBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19736)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19737)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19738);final int mask = Feature.SupportArrayToBean.mask;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19739);boolean isSupportArrayToBean = (beanInfo.parserFeatures & mask) != 0 //
                                               || lexer.isEnabled(Feature.SupportArrayToBean) //
                                               || (features & mask) != 0
                                               ;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19740);if ((((isSupportArrayToBean)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19741)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19742)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19743);return deserialzeArrayMapping(parser, type, fieldName, object);
                }
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19744);if ((((token != JSONToken.LBRACE && token != JSONToken.COMMA)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19745)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19746)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19747);if ((((lexer.isBlankInput())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19748)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19749)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19750);return null;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19751);if ((((token == JSONToken.LITERAL_STRING)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19752)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19753)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19754);String strVal = lexer.stringVal();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19755);if ((((strVal.length() == 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19756)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19757)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19758);lexer.nextToken();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19759);return null;
                    }

                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(19760);if ((((beanInfo.jsonType != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19761)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19762)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19763);for (Class<?> seeAlsoClass : beanInfo.jsonType.seeAlso()) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19764);if ((((Enum.class.isAssignableFrom(seeAlsoClass))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19765)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19766)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19767);try {
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19768);Enum<?> e = Enum.valueOf((Class<Enum>) seeAlsoClass, strVal);
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19769);return (T) e;
                                } catch (IllegalArgumentException e) {
                                    // skip
                                }
                            }
                        }}
                    }}
                }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19770);if ((((token == JSONToken.LITERAL_ISO8601_DATE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19771)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19772)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19773);Calendar calendar = lexer.getCalendar();
                }

                }}__CLR4_5_2eyyeyylusyjlw5.R.inc(19774);if ((((token == JSONToken.LBRACKET && lexer.getCurrent() == ']')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19775)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19776)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19777);lexer.next();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19778);lexer.nextToken();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19779);return null;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19780);if ((((beanInfo.factoryMethod != null && beanInfo.fields.length == 1)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19781)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19782)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19783);try {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19784);FieldInfo field = beanInfo.fields[0];
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19785);if ((((field.fieldClass == Integer.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19786)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19787)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19788);if ((((token == JSONToken.LITERAL_INT)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19789)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19790)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19791);int intValue = lexer.intValue();
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19792);lexer.nextToken();
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19793);return (T) createFactoryInstance(config, intValue);
                            }
                        }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19794);if ((((field.fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19795)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19796)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19797);if ((((token == JSONToken.LITERAL_STRING)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19798)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19799)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19800);String stringVal = lexer.stringVal();
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19801);lexer.nextToken();
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(19802);return (T) createFactoryInstance(config, stringVal);
                            }
                        }}
                    }}} catch (Exception ex) {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19803);throw new JSONException(ex.getMessage(), ex);
                    }
                }
                
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19804);StringBuilder buf = (new StringBuilder()) //
                                                        .append("syntax error, expect {, actual ") //
                                                        .append(lexer.tokenName()) //
                                                        .append(", pos ") //
                                                        .append(lexer.pos());

                __CLR4_5_2eyyeyylusyjlw5.R.inc(19805);if ((((fieldName instanceof String)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19806)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19807)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19808);buf //
                        .append(", fieldName ") //
                        .append(fieldName);
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19809);buf.append(", fastjson-version ").append(JSON.VERSION);
                
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19810);throw new JSONException(buf.toString());
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19811);if ((((parser.resolveStatus == DefaultJSONParser.TypeNameRedirect)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19812)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19813)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19814);parser.resolveStatus = DefaultJSONParser.NONE;
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(19815);String typeKey = beanInfo.typeKey;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(19816);for (int fieldIndex = 0, notMatchCount = 0;; fieldIndex++) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19817);String key = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19818);FieldDeserializer fieldDeser = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19819);FieldInfo fieldInfo = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19820);Class<?> fieldClass = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19821);JSONField feildAnnotation = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19822);boolean customDeserilizer = false;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19823);if ((((fieldIndex < sortedFieldDeserializers.length && notMatchCount < 16)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19824)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19825)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19826);fieldDeser = sortedFieldDeserializers[fieldIndex];
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19827);fieldInfo = fieldDeser.fieldInfo;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19828);fieldClass = fieldInfo.fieldClass;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19829);feildAnnotation = fieldInfo.getAnnotation();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19830);if ((((feildAnnotation != null && fieldDeser instanceof DefaultFieldDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19831)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19832)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19833);customDeserilizer = ((DefaultFieldDeserializer) fieldDeser).customDeserilizer;
                    }
                }}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(19834);boolean matchField = false;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19835);boolean valueParsed = false;
                
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19836);Object fieldValue = null;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(19837);if ((((fieldDeser != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19838)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19839)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19840);char[] name_chars = fieldInfo.name_chars;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(19841);if ((((customDeserilizer && lexer.matchField(name_chars))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19842)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19843)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19844);matchField = true;
                    } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19845);if ((((fieldClass == int.class || fieldClass == Integer.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19846)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19847)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19848);int intVal = lexer.scanFieldInt(name_chars);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19849);if ((((intVal == 0 && lexer.matchStat == JSONLexer.VALUE_NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19850)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19851)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19852);fieldValue = null;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19853);fieldValue = intVal;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19854);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19855)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19856)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19857);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19858);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19859);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19860)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19861)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19862);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19863);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19864);if ((((fieldClass == long.class || fieldClass == Long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19865)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19866)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19867);long longVal = lexer.scanFieldLong(name_chars);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19868);if ((((longVal == 0 && lexer.matchStat == JSONLexer.VALUE_NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19869)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19870)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19871);fieldValue = null;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19872);fieldValue = longVal;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19873);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19874)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19875)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19876);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19877);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19878);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19879)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19880)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19881);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19882);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19883);if ((((fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19884)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19885)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19886);fieldValue = lexer.scanFieldString(name_chars);
                        
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19887);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19888)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19889)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19890);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19891);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19892);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19893)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19894)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19895);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19896);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19897);if ((((fieldClass == java.util.Date.class && fieldInfo.format == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19898)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19899)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19900);fieldValue = lexer.scanFieldDate(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19901);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19902)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19903)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19904);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19905);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19906);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19907)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19908)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19909);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19910);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19911);if ((((fieldClass == BigDecimal.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19912)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19913)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19914);fieldValue = lexer.scanFieldDecimal(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19915);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19916)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19917)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19918);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19919);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19920);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19921)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19922)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19923);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19924);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19925);if ((((fieldClass == BigInteger.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19926)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19927)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19928);fieldValue = lexer.scanFieldBigInteger(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19929);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19930)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19931)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19932);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19933);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19934);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19935)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19936)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19937);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19938);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19939);if ((((fieldClass == boolean.class || fieldClass == Boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19940)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19941)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19942);boolean booleanVal = lexer.scanFieldBoolean(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19943);if ((((lexer.matchStat == JSONLexer.VALUE_NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19944)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19945)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19946);fieldValue = null;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19947);fieldValue = booleanVal;
                        }
                        
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19948);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19949)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19950)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19951);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19952);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19953);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19954)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19955)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19956);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19957);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19958);if ((((fieldClass == float.class || fieldClass == Float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19959)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19960)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19961);float floatVal = lexer.scanFieldFloat(name_chars);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19962);if ((((floatVal == 0 && lexer.matchStat == JSONLexer.VALUE_NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19963)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19964)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19965);fieldValue = null;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19966);fieldValue = floatVal;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19967);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19968)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19969)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19970);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19971);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19972);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19973)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19974)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19975);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19976);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19977);if ((((fieldClass == double.class || fieldClass == Double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19978)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19979)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19980);double doubleVal = lexer.scanFieldDouble(name_chars);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19981);if ((((doubleVal == 0 && lexer.matchStat == JSONLexer.VALUE_NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19982)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19983)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19984);fieldValue = null;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19985);fieldValue = doubleVal;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(19986);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19987)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19988)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19989);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19990);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19991);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19992)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19993)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19994);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(19995);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(19996);if ((((fieldClass.isEnum() // 
                            && parser.getConfig().getDeserializer(fieldClass) instanceof EnumDeserializer
                            && (feildAnnotation == null || feildAnnotation.deserializeUsing() == Void.class)
                            )&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(19997)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(19998)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(19999);if ((((fieldDeser instanceof DefaultFieldDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20000)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20001)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20002);ObjectDeserializer fieldValueDeserilizer = ((DefaultFieldDeserializer) fieldDeser).fieldValueDeserilizer;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20003);fieldValue = this.scanEnum(lexer, name_chars, fieldValueDeserilizer);

                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20004);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20005)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20006)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20007);matchField = true;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20008);valueParsed = true;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20009);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20010)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20011)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20012);notMatchCount++;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20013);continue;
                            }
                        }}}
                    }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20014);if ((((fieldClass == int[].class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20015)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20016)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20017);fieldValue = lexer.scanFieldIntArray(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20018);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20019)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20020)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20021);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20022);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20023);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20024)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20025)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20026);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20027);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20028);if ((((fieldClass == float[].class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20029)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20030)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20031);fieldValue = lexer.scanFieldFloatArray(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20032);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20033)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20034)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20035);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20036);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20037);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20038)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20039)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20040);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20041);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20042);if ((((fieldClass == float[][].class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20043)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20044)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20045);fieldValue = lexer.scanFieldFloatArray2(name_chars);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20046);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20047)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20048)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20049);matchField = true;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20050);valueParsed = true;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20051);if ((((lexer.matchStat == JSONLexer.NOT_MATCH_NAME)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20052)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20053)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20054);notMatchCount++;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20055);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20056);if ((((lexer.matchField(name_chars))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20057)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20058)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20059);matchField = true;
                    } }else {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20060);continue;
                    }
                }}}}}}}}}}}}}}}}
                
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20061);if ((((!matchField)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20062)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20063)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20064);key = lexer.scanSymbol(parser.symbolTable);

                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20065);if ((((key == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20066)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20067)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20068);token = lexer.token();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20069);if ((((token == JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20070)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20071)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20072);lexer.nextToken(JSONToken.COMMA);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20073);break;
                        }
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20074);if ((((token == JSONToken.COMMA)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20075)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20076)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20077);if ((((lexer.isEnabled(Feature.AllowArbitraryCommas))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20078)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20079)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20080);continue;
                            }
                        }}
                    }}

                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20081);if (((("$ref" == key && context != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20082)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20083)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20084);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20085);token = lexer.token();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20086);if ((((token == JSONToken.LITERAL_STRING)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20087)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20088)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20089);String ref = lexer.stringVal();
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20090);if (((("@".equals(ref))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20091)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20092)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20093);object = context.object;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20094);if (((("..".equals(ref))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20095)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20096)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20097);ParseContext parentContext = context.parent;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20098);if ((((parentContext.object != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20099)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20100)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20101);object = parentContext.object;
                                } }else {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20102);parser.addResolveTask(new ResolveTask(parentContext, ref));
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20103);parser.resolveStatus = DefaultJSONParser.NeedToResolve;
                                }
                            }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20104);if (((("$".equals(ref))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20105)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20106)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20107);ParseContext rootContext = context;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20108);while ((((rootContext.parent != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20109)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20110)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20111);rootContext = rootContext.parent;
                                }

                                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20112);if ((((rootContext.object != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20113)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20114)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20115);object = rootContext.object;
                                } }else {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20116);parser.addResolveTask(new ResolveTask(rootContext, ref));
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20117);parser.resolveStatus = DefaultJSONParser.NeedToResolve;
                                }
                            }} }else {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20118);if ((((ref.indexOf('\\') > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20119)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20120)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20121);StringBuilder buf = new StringBuilder();
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20122);for (int i = 0; (((i < ref.length())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20123)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20124)==0&false)); ++i) {{
                                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20125);char ch = ref.charAt(i);
                                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20126);if ((((ch == '\\')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20127)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20128)==0&false))) {{
                                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20129);ch = ref.charAt(++i);
                                        }
                                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20130);buf.append(ch);
                                    }
                                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20131);ref = buf.toString();
                                }
                                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20132);Object refObj = parser.resolveReference(ref);
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20133);if ((((refObj != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20134)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20135)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20136);object = refObj;
                                } }else {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20137);parser.addResolveTask(new ResolveTask(context, ref));
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20138);parser.resolveStatus = DefaultJSONParser.NeedToResolve;
                                }
                            }}
                        }}}} }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20139);throw new JSONException("illegal ref, " + JSONToken.name(token));
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20140);lexer.nextToken(JSONToken.RBRACE);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20141);if ((((lexer.token() != JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20142)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20143)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20144);throw new JSONException("illegal ref");
                        }
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20145);lexer.nextToken(JSONToken.COMMA);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20146);parser.setContext(context, object, fieldName);

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20147);return (T) object;
                    }

                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20148);if (((((typeKey != null && typeKey.equals(key))
                            || JSON.DEFAULT_TYPE_KEY == key)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20149)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20150)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20151);lexer.nextTokenWithColon(JSONToken.LITERAL_STRING);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20152);if ((((lexer.token() == JSONToken.LITERAL_STRING)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20153)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20154)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20155);String typeName = lexer.stringVal();
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20156);lexer.nextToken(JSONToken.COMMA);

                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20157);if ((((typeName.equals(beanInfo.typeName)|| parser.isEnabled(Feature.IgnoreAutoType))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20158)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20159)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20160);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20161)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20162)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20163);lexer.nextToken();
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20164);break;
                                }
                                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20165);continue;
                            }
                            

                            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20166);ObjectDeserializer deserializer = getSeeAlso(config, this.beanInfo, typeName);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20167);Class<?> userType = null;

                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20168);if ((((deserializer == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20169)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20170)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20171);Class<?> expectClass = TypeUtils.getClass(type);
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20172);userType = config.checkAutoType(typeName, expectClass, lexer.getFeatures());
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20173);deserializer = parser.getConfig().getDeserializer(userType);
                            }

                            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20174);Object typedObject = deserializer.deserialze(parser, userType, fieldName);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20175);if ((((deserializer instanceof JavaBeanDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20176)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20177)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20178);JavaBeanDeserializer javaBeanDeserializer = (JavaBeanDeserializer) deserializer;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20179);if ((((typeKey != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20180)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20181)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20182);FieldDeserializer typeKeyFieldDeser = javaBeanDeserializer.getFieldDeserializer(typeKey);
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20183);typeKeyFieldDeser.setValue(typedObject, typeName);
                                }
                            }}
                            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20184);return (T) typedObject;
                        } }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20185);throw new JSONException("syntax error");
                        }
                    }}
                }}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20186);if ((((object == null && fieldValues == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20187)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20188)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20189);object = createInstance(parser, type);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20190);if ((((object == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20191)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20192)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20193);fieldValues = new HashMap<String, Object>(this.fieldDeserializers.length);
                    }
                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20194);childContext = parser.setContext(context, object, fieldName);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20195);if ((((setFlags == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20196)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20197)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20198);setFlags = new int[(this.fieldDeserializers.length / 32) + 1];
                    }
                }}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20199);if ((((matchField)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20200)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20201)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20202);if ((((!valueParsed)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20203)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20204)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20205);fieldDeser.parseField(parser, object, type, fieldValues);
                    } }else {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20206);if ((((object == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20207)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20208)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20209);fieldValues.put(fieldInfo.name, fieldValue);
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20210);if ((((fieldValue == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20211)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20212)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20213);if ((((fieldClass != int.class //
                                    && fieldClass != long.class //
                                    && fieldClass != float.class //
                                    && fieldClass != double.class //
                                    && fieldClass != boolean.class //
                                    )&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20214)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20215)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20216);fieldDeser.setValue(object, fieldValue);
                            }
                        }} }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20217);fieldDeser.setValue(object, fieldValue);
                        }

                        }}__CLR4_5_2eyyeyylusyjlw5.R.inc(20218);if ((((setFlags != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20219)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20220)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20221);int flagIndex = fieldIndex / 32;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20222);int bitIndex = fieldIndex % 32;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20223);setFlags[flagIndex] |= (1 << bitIndex);
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20224);if ((((lexer.matchStat == JSONLexer.END)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20225)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20226)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20227);break;
                        }
                    }}
                }} }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20228);boolean match = parseField(parser, key, object, type,
                            (((fieldValues == null )&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20229)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20230)==0&false))? new HashMap<String, Object>(this.fieldDeserializers.length) : fieldValues, setFlags);

                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20231);if ((((!match)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20232)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20233)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20234);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20235)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20236)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20237);lexer.nextToken();
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20238);break;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20239);continue;
                    } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20240);if ((((lexer.token() == JSONToken.COLON)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20241)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20242)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20243);throw new JSONException("syntax error, unexpect token ':'");
                    }
                }}}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20244);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20245)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20246)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20247);continue;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20248);if ((((lexer.token() == JSONToken.RBRACE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20249)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20250)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20251);lexer.nextToken(JSONToken.COMMA);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20252);break;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20253);if ((((lexer.token() == JSONToken.IDENTIFIER || lexer.token() == JSONToken.ERROR)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20254)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20255)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20256);throw new JSONException("syntax error, unexpect token " + JSONToken.name(lexer.token()));
                }
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20257);if ((((object == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20258)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20259)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20260);if ((((fieldValues == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20261)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20262)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20263);object = createInstance(parser, type);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20264);if ((((childContext == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20265)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20266)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20267);childContext = parser.setContext(context, object, fieldName);
                    }
                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20268);return (T) object;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20269);String[] paramNames = beanInfo.creatorConstructorParameters;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20270);final Object[] params;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20271);if ((((paramNames != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20272)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20273)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20274);params = new Object[paramNames.length];
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20275);for (int i = 0; (((i < paramNames.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20276)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20277)==0&false)); i++) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20278);String paramName = paramNames[i];

                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20279);Object param = fieldValues.remove(paramName);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20280);if ((((param == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20281)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20282)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20283);Type fieldType = beanInfo.creatorConstructorParameterTypes[i];
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20284);FieldInfo fieldInfo = beanInfo.fields[i];
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20285);if ((((fieldType == byte.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20286)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20287)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20288);param = (byte) 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20289);if ((((fieldType == short.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20290)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20291)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20292);param = (short) 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20293);if ((((fieldType == int.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20294)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20295)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20296);param = 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20297);if ((((fieldType == long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20298)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20299)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20300);param = 0L;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20301);if ((((fieldType == float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20302)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20303)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20304);param = 0F;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20305);if ((((fieldType == double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20306)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20307)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20308);param = 0D;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20309);if ((((fieldType == boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20310)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20311)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20312);param = Boolean.FALSE;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20313);if ((((fieldType == String.class
                                    && (fieldInfo.parserFeatures & Feature.InitStringFieldAsEmpty.mask) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20314)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20315)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20316);param = "";
                            }
                        }}}}}}}}} }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20317);if ((((beanInfo.creatorConstructorParameterTypes != null && i < beanInfo.creatorConstructorParameterTypes.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20318)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20319)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20320);Type paramType = beanInfo.creatorConstructorParameterTypes[i];
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20321);if ((((paramType instanceof Class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20322)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20323)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20324);Class paramClass = (Class) paramType;
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20325);if ((((!paramClass.isInstance(param))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20326)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20327)==0&false))) {{
                                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20328);if ((((param instanceof List)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20329)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20330)==0&false))) {{
                                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20331);List list = (List) param;
                                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20332);if ((((list.size() == 1)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20333)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20334)==0&false))) {{
                                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20335);Object first = list.get(0);
                                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20336);if ((((paramClass.isInstance(first))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20337)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20338)==0&false))) {{
                                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20339);param = list.get(0);
                                                }
                                            }}
                                        }}
                                    }}
                                }}
                            }}
                        }}
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20340);params[i] = param;
                    }
                }} }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20341);FieldInfo[] fieldInfoList = beanInfo.fields;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20342);int size = fieldInfoList.length;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20343);params = new Object[size];
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20344);for (int i = 0; (((i < size)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20345)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20346)==0&false)); ++i) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20347);FieldInfo fieldInfo = fieldInfoList[i];
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20348);Object param = fieldValues.get(fieldInfo.name);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20349);if ((((param == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20350)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20351)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20352);Type fieldType = fieldInfo.fieldType;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20353);if ((((fieldType == byte.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20354)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20355)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20356);param = (byte) 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20357);if ((((fieldType == short.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20358)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20359)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20360);param = (short) 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20361);if ((((fieldType == int.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20362)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20363)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20364);param = 0;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20365);if ((((fieldType == long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20366)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20367)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20368);param = 0L;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20369);if ((((fieldType == float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20370)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20371)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20372);param = 0F;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20373);if ((((fieldType == double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20374)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20375)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20376);param = 0D;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20377);if ((((fieldType == boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20378)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20379)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20380);param = Boolean.FALSE;
                            } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20381);if ((((fieldType == String.class
                                    && (fieldInfo.parserFeatures & Feature.InitStringFieldAsEmpty.mask) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20382)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20383)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20384);param = "";
                            }
                        }}}}}}}}}
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20385);params[i] = param;
                    }
                }}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20386);if ((((beanInfo.creatorConstructor != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20387)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20388)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20389);boolean hasNull = false;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20390);if ((((beanInfo.kotlin)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20391)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20392)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20393);for (int i = 0; (((i < params.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20394)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20395)==0&false)); i++) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20396);if ((((params[i] == null && beanInfo.fields != null && i < beanInfo.fields.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20397)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20398)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20399);FieldInfo fieldInfo = beanInfo.fields[i];
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20400);if ((((fieldInfo.fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20401)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20402)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20403);hasNull = true;
                                }
                                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20404);break;
                            }
                        }}
                    }}

                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20405);try {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20406);if ((((hasNull && beanInfo.kotlinDefaultConstructor != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20407)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20408)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20409);object = beanInfo.kotlinDefaultConstructor.newInstance(new Object[0]);

                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20410);for (int i = 0; (((i < params.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20411)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20412)==0&false)); i++) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20413);final Object param = params[i];
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20414);if ((((param != null && beanInfo.fields != null && i < beanInfo.fields.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20415)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20416)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20417);FieldInfo fieldInfo = beanInfo.fields[i];
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20418);fieldInfo.set(object, param);
                                }
                            }}
                        }} }else {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20419);object = beanInfo.creatorConstructor.newInstance(params);
                        }
                    }} catch (Exception e) {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20420);throw new JSONException("create instance error, " + paramNames + ", "
                                                + beanInfo.creatorConstructor.toGenericString(), e);
                    }

                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20421);if ((((paramNames != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20422)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20423)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20424);for (Map.Entry<String, Object> entry : fieldValues.entrySet()) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20425);FieldDeserializer fieldDeserializer = getFieldDeserializer(entry.getKey());
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20426);if ((((fieldDeserializer != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20427)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20428)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20429);fieldDeserializer.setValue(object, entry.getValue());
                            }
                        }}
                    }}
                }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20430);if ((((beanInfo.factoryMethod != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20431)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20432)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20433);try {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20434);object = beanInfo.factoryMethod.invoke(null, params);
                    } catch (Exception e) {
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20435);throw new JSONException("create factory method error, " + beanInfo.factoryMethod.toString(), e);
                    }
                }

                }}__CLR4_5_2eyyeyylusyjlw5.R.inc(20436);if ((((childContext != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20437)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20438)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20439);childContext.object = object;
                }
            }}
            
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20440);Method buildMethod = beanInfo.buildMethod;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20441);if ((((buildMethod == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20442)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20443)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20444);return (T) object;
            }
            
            
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20445);Object builtObj;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20446);try {
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20447);builtObj = buildMethod.invoke(object);
            } catch (Exception e) {
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20448);throw new JSONException("build object error", e);
            }
            
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20449);return (T) builtObj;
        } finally {
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20450);if ((((childContext != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20451)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20452)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20453);childContext.object = object;
            }
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20454);parser.setContext(context);
        }
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    protected Enum scanEnum(JSONLexerBase lexer, char[] name_chars, ObjectDeserializer fieldValueDeserilizer) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20455);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20456);EnumDeserializer enumDeserializer = null;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20457);if ((((fieldValueDeserilizer instanceof EnumDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20458)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20459)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20460);enumDeserializer = (EnumDeserializer) fieldValueDeserilizer;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20461);if ((((enumDeserializer == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20462)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20463)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20464);lexer.matchStat = JSONLexer.NOT_MATCH;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20465);return null;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20466);long enumNameHashCode = lexer.scanEnumSymbol(name_chars);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20467);if ((((lexer.matchStat > 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20468)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20469)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20470);Enum e = enumDeserializer.getEnumByHashCode(enumNameHashCode);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20471);if ((((e == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20472)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20473)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20474);if ((((enumNameHashCode == 0xcbf29ce484222325L)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20475)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20476)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20477);return null;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20478);if ((((lexer.isEnabled(Feature.ErrorOnEnumNotMatch))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20479)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20480)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20481);throw new JSONException("not match enum value, " + enumDeserializer.enumClass);
                }
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20482);return e;
        } }else {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20483);return null;
        }
    }}finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public boolean parseField(DefaultJSONParser parser, String key, Object object, Type objectType,
                              Map<String, Object> fieldValues) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20484);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20485);return parseField(parser, key, object, objectType, fieldValues, null);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public boolean parseField(DefaultJSONParser parser, String key, Object object, Type objectType,
                              Map<String, Object> fieldValues, int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20486);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20487);JSONLexer lexer = parser.lexer; // xxx

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20488);final int disableFieldSmartMatchMask = Feature.DisableFieldSmartMatch.mask;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20489);FieldDeserializer fieldDeserializer;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20490);if ((((lexer.isEnabled(disableFieldSmartMatchMask) || (this.beanInfo.parserFeatures & disableFieldSmartMatchMask) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20491)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20492)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20493);fieldDeserializer = getFieldDeserializer(key);
        } }else {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20494);fieldDeserializer = smartMatch(key, setFlags);
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20495);final int mask = Feature.SupportNonPublicField.mask;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20496);if ((((fieldDeserializer == null
                && (lexer.isEnabled(mask)
                    || (this.beanInfo.parserFeatures & mask) != 0))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20497)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20498)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20499);if ((((this.extraFieldDeserializers == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20500)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20501)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20502);ConcurrentHashMap extraFieldDeserializers = new ConcurrentHashMap<String, Object>(1, 0.75f, 1);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20503);for (Class c = this.clazz; (((c != null && c != Object.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20504)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20505)==0&false)); c = c.getSuperclass()) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20506);Field[] fields = c.getDeclaredFields();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20507);for (Field field : fields) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20508);String fieldName = field.getName();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20509);if ((((this.getFieldDeserializer(fieldName) != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20510)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20511)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20512);continue;
                        }
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20513);int fieldModifiers = field.getModifiers();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20514);if (((((fieldModifiers & Modifier.FINAL) != 0 || (fieldModifiers & Modifier.STATIC) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20515)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20516)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20517);continue;
                        }
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20518);extraFieldDeserializers.put(fieldName, field);
                    }
                }}
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20519);this.extraFieldDeserializers = extraFieldDeserializers;
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20520);Object deserOrField = extraFieldDeserializers.get(key);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20521);if ((((deserOrField != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20522)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20523)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20524);if ((((deserOrField instanceof FieldDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20525)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20526)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20527);fieldDeserializer = ((FieldDeserializer) deserOrField);
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20528);Field field = (Field) deserOrField;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20529);field.setAccessible(true);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20530);FieldInfo fieldInfo = new FieldInfo(key, field.getDeclaringClass(), field.getType(), field.getGenericType(), field, 0, 0, 0);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20531);fieldDeserializer = new DefaultFieldDeserializer(parser.getConfig(), clazz, fieldInfo);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20532);extraFieldDeserializers.put(key, fieldDeserializer);
                }
            }}
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20533);if ((((fieldDeserializer == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20534)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20535)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20536);if ((((!lexer.isEnabled(Feature.IgnoreNotMatch))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20537)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20538)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20539);throw new JSONException("setter not found, class " + clazz.getName() + ", property " + key);
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20540);int fieldIndex = -1;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20541);for (int i = 0; (((i < this.sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20542)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20543)==0&false)); i++) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20544);FieldDeserializer fieldDeser = this.sortedFieldDeserializers[i];

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20545);FieldInfo fieldInfo = fieldDeser.fieldInfo;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20546);if ((((fieldInfo.unwrapped //
                        && fieldDeser instanceof DefaultFieldDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20547)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20548)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20549);if ((((fieldInfo.field != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20550)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20551)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20552);DefaultFieldDeserializer defaultFieldDeserializer = (DefaultFieldDeserializer) fieldDeser;
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20553);ObjectDeserializer fieldValueDeser = defaultFieldDeserializer.getFieldValueDeserilizer(parser.getConfig());
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20554);if ((((fieldValueDeser instanceof JavaBeanDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20555)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20556)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20557);JavaBeanDeserializer javaBeanFieldValueDeserializer = (JavaBeanDeserializer) fieldValueDeser;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20558);FieldDeserializer unwrappedFieldDeser = javaBeanFieldValueDeserializer.getFieldDeserializer(key);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20559);if ((((unwrappedFieldDeser != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20560)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20561)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20562);Object fieldObject;
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20563);try {
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20564);fieldObject = fieldInfo.field.get(object);
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20565);if ((((fieldObject == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20566)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20567)==0&false))) {{
                                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20568);fieldObject = ((JavaBeanDeserializer) fieldValueDeser).createInstance(parser, fieldInfo.fieldType);
                                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20569);fieldDeser.setValue(object, fieldObject);
                                    }
                                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20570);lexer.nextTokenWithColon(defaultFieldDeserializer.getFastMatchToken());
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20571);unwrappedFieldDeser.parseField(parser, fieldObject, objectType, fieldValues);
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20572);fieldIndex = i;
                                } catch (Exception e) {
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20573);throw new JSONException("parse unwrapped field error.", e);
                                }
                            }
                        }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20574);if ((((fieldValueDeser instanceof MapDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20575)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20576)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20577);MapDeserializer javaBeanFieldValueDeserializer = (MapDeserializer) fieldValueDeser;

                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20578);Map fieldObject;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20579);try {
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20580);fieldObject = (Map) fieldInfo.field.get(object);
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20581);if ((((fieldObject == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20582)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20583)==0&false))) {{
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20584);fieldObject = javaBeanFieldValueDeserializer.createMap(fieldInfo.fieldType);
                                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20585);fieldDeser.setValue(object, fieldObject);
                                }

                                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20586);lexer.nextTokenWithColon();
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20587);Object fieldValue = parser.parse(key);
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20588);fieldObject.put(key, fieldValue);
                            } catch (Exception e) {
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20589);throw new JSONException("parse unwrapped field error.", e);
                            }
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20590);fieldIndex = i;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20591);if ((((fieldInfo.method.getParameterTypes().length == 2)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20592)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20593)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20594);lexer.nextTokenWithColon();
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20595);Object fieldValue = parser.parse(key);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20596);try {
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20597);fieldInfo.method.invoke(object, key, fieldValue);
                        } catch (Exception e) {
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20598);throw new JSONException("parse unwrapped field error.", e);
                        }
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20599);fieldIndex = i;
                    }
                }}}
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20600);if ((((fieldIndex != -1)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20601)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20602)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20603);if ((((setFlags != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20604)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20605)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20606);int flagIndex = fieldIndex / 32;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20607);int bitIndex = fieldIndex % 32;
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20608);setFlags[flagIndex] |= (1 << bitIndex);
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20609);return true;
            }
            
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20610);parser.parseExtra(object, key);

            __CLR4_5_2eyyeyylusyjlw5.R.inc(20611);return false;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20612);int fieldIndex = -1;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20613);for (int i = 0; (((i < sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20614)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20615)==0&false)); ++i) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20616);if ((((sortedFieldDeserializers[i] == fieldDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20617)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20618)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20619);fieldIndex = i;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20620);break;
            }
        }}
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20621);if ((((fieldIndex != -1 && setFlags != null && key.startsWith("_"))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20622)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20623)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20624);if ((((isSetFlag(fieldIndex, setFlags))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20625)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20626)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20627);parser.parseExtra(object, key);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20628);return false;
            }
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20629);lexer.nextTokenWithColon(fieldDeserializer.getFastMatchToken());

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20630);fieldDeserializer.parseField(parser, object, objectType, fieldValues);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20631);if ((((setFlags != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20632)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20633)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20634);int flagIndex = fieldIndex / 32;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20635);int bitIndex = fieldIndex % 32;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20636);setFlags[flagIndex] |= (1 << bitIndex);
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20637);return true;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public FieldDeserializer smartMatch(String key) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20638);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20639);return smartMatch(key, null);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public FieldDeserializer smartMatch(String key, int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20640);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20641);if ((((key == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20642)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20643)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20644);return null;
        }
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20645);FieldDeserializer fieldDeserializer = getFieldDeserializer(key, setFlags);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20646);if ((((fieldDeserializer == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20647)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20648)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20649);long smartKeyHash = TypeUtils.fnv1a_64_lower(key);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20650);if ((((this.smartMatchHashArray == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20651)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20652)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20653);long[] hashArray = new long[sortedFieldDeserializers.length];
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20654);for (int i = 0; (((i < sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20655)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20656)==0&false)); i++) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20657);hashArray[i] = TypeUtils.fnv1a_64_lower(sortedFieldDeserializers[i].fieldInfo.name);
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20658);Arrays.sort(hashArray);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20659);this.smartMatchHashArray = hashArray;
            }

            // smartMatchHashArrayMapping
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20660);int pos = Arrays.binarySearch(smartMatchHashArray, smartKeyHash);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20661);boolean is = false;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20662);if (pos < 0 && (is = key.startsWith("is"))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20665);smartKeyHash = TypeUtils.fnv1a_64_lower(key.substring(2));
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20666);pos = Arrays.binarySearch(smartMatchHashArray, smartKeyHash);
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20667);if ((((pos >= 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20668)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20669)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20670);if ((((smartMatchHashArrayMapping == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20671)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20672)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20673);short[] mapping = new short[smartMatchHashArray.length];
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20674);Arrays.fill(mapping, (short) -1);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20675);for (int i = 0; (((i < sortedFieldDeserializers.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20676)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20677)==0&false)); i++) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20678);int p = Arrays.binarySearch(smartMatchHashArray
                                , TypeUtils.fnv1a_64_lower(sortedFieldDeserializers[i].fieldInfo.name));
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20679);if ((((p >= 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20680)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20681)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20682);mapping[p] = (short) i;
                        }
                    }}
                    }__CLR4_5_2eyyeyylusyjlw5.R.inc(20683);smartMatchHashArrayMapping = mapping;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20684);int deserIndex = smartMatchHashArrayMapping[pos];
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20685);if ((((deserIndex != -1)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20686)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20687)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20688);if ((((!isSetFlag(deserIndex, setFlags))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20689)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20690)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20691);fieldDeserializer = sortedFieldDeserializers[deserIndex];
                    }
                }}
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20692);if ((((fieldDeserializer != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20693)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20694)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20695);FieldInfo fieldInfo = fieldDeserializer.fieldInfo;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20696);if (((((fieldInfo.parserFeatures & Feature.DisableFieldSmartMatch.mask) != 0)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20697)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20698)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20699);return null;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20700);Class fieldClass = fieldInfo.fieldClass;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20701);if ((((is && (fieldClass != boolean.class && fieldClass != Boolean.class))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20702)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20703)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20704);fieldDeserializer = null;
                }
            }}
        }}


        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20705);return fieldDeserializer;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    public int getFastMatchToken() {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20706);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20707);return JSONToken.LBRACE;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    private Object createFactoryInstance(ParserConfig config, Object value) //
            throws IllegalArgumentException,
            IllegalAccessException,
            InvocationTargetException {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20708);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20709);return beanInfo.factoryMethod.invoke(null, value);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public Object createInstance(Map<String, Object> map, ParserConfig config) //
                                                                               throws IllegalArgumentException,
                                                                               IllegalAccessException,
                                                                               InvocationTargetException {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20710);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20711);Object object = null;
        
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20712);if ((((beanInfo.creatorConstructor == null && beanInfo.factoryMethod == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20713)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20714)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20715);object = createInstance(null, clazz);
            
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20716);for (Map.Entry<String, Object> entry : map.entrySet()) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20717);String key = entry.getKey();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20718);Object value = entry.getValue();

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20719);FieldDeserializer fieldDeser = smartMatch(key);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20720);if ((((fieldDeser == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20721)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20722)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20723);continue;
                }

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20724);final FieldInfo fieldInfo = fieldDeser.fieldInfo;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20725);Field field = fieldDeser.fieldInfo.field;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20726);Type paramType = fieldInfo.fieldType;

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20727);if ((((field != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20728)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20729)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20730);Class fieldType = field.getType();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20731);if ((((fieldType == boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20732)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20733)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20734);if ((((value == Boolean.FALSE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20735)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20736)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20737);field.setBoolean(object, false);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20738);continue;
                        }

                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20739);if ((((value == Boolean.TRUE)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20740)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20741)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20742);field.setBoolean(object, true);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20743);continue;
                        }
                    }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20744);if ((((fieldType == int.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20745)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20746)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20747);if ((((value instanceof Number)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20748)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20749)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20750);field.setInt(object, ((Number) value).intValue());
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20751);continue;
                        }
                    }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20752);if ((((fieldType == long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20753)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20754)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20755);if ((((value instanceof Number)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20756)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20757)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20758);field.setLong(object, ((Number) value).longValue());
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20759);continue;
                        }
                    }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20760);if ((((fieldType == float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20761)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20762)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20763);if ((((value instanceof Number)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20764)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20765)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20766);field.setFloat(object, ((Number) value).floatValue());
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20767);continue;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20768);if ((((value instanceof String)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20769)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20770)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20771);String strVal = (String) value;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20772);float floatValue;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20773);if ((((strVal.length() <= 10)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20774)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20775)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20776);floatValue = TypeUtils.parseFloat(strVal);
                            } }else {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20777);floatValue = Float.parseFloat(strVal);
                            }

                            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20778);field.setFloat(object, floatValue);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20779);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20780);if ((((fieldType == double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20781)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20782)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20783);if ((((value instanceof Number)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20784)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20785)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20786);field.setDouble(object, ((Number) value).doubleValue());
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20787);continue;
                        } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20788);if ((((value instanceof String)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20789)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20790)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20791);String strVal = (String) value;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20792);double doubleValue;
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20793);if ((((strVal.length() <= 10)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20794)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20795)==0&false))) {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20796);doubleValue = TypeUtils.parseDouble(strVal);
                            } }else {{
                                __CLR4_5_2eyyeyylusyjlw5.R.inc(20797);doubleValue = Double.parseDouble(strVal);
                            }

                            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20798);field.setDouble(object, doubleValue);
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20799);continue;
                        }
                    }}} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20800);if ((((value != null && paramType == value.getClass())&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20801)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20802)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20803);field.set(object, value);
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20804);continue;
                    }
                }}}}}}}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20805);String format = fieldInfo.format;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20806);if ((((format != null && paramType == java.util.Date.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20807)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20808)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20809);value = TypeUtils.castToDate(value, format);
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20810);if ((((paramType instanceof ParameterizedType)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20811)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20812)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20813);value = TypeUtils.cast(value, (ParameterizedType) paramType, config);
                    } }else {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20814);value = TypeUtils.cast(value, paramType, config);
                    }
                }}

                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20815);fieldDeser.setValue(object, value);
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20816);if ((((beanInfo.buildMethod != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20817)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20818)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20819);Object builtObj;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20820);try {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20821);builtObj = beanInfo.buildMethod.invoke(object);
                } catch (Exception e) {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20822);throw new JSONException("build object error", e);
                }

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20823);return builtObj;
            }

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20824);return object;
        }

        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20825);FieldInfo[] fieldInfoList = beanInfo.fields;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20826);int size = fieldInfoList.length;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20827);Object[] params = new Object[size];
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20828);Map<String, Integer> missFields = null;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20829);for (int i = 0; (((i < size)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20830)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20831)==0&false)); ++i) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20832);FieldInfo fieldInfo = fieldInfoList[i];
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20833);Object param = map.get(fieldInfo.name);

            __CLR4_5_2eyyeyylusyjlw5.R.inc(20834);if ((((param == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20835)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20836)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20837);Class<?> fieldClass = fieldInfo.fieldClass;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20838);if ((((fieldClass == int.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20839)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20840)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20841);param = 0;
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20842);if ((((fieldClass == long.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20843)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20844)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20845);param = 0L;
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20846);if ((((fieldClass == short.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20847)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20848)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20849);param = Short.valueOf((short) 0);
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20850);if ((((fieldClass == byte.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20851)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20852)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20853);param = Byte.valueOf((byte) 0);
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20854);if ((((fieldClass == float.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20855)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20856)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20857);param = Float.valueOf(0);
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20858);if ((((fieldClass == double.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20859)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20860)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20861);param = Double.valueOf(0);
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20862);if ((((fieldClass == char.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20863)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20864)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20865);param = '0';
                } }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20866);if ((((fieldClass == boolean.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20867)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20868)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20869);param = false;
                }
                }}}}}}}}__CLR4_5_2eyyeyylusyjlw5.R.inc(20870);if ((((missFields == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20871)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20872)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20873);missFields = new HashMap<String, Integer>();
                }
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20874);missFields.put(fieldInfo.name, i);
            }
            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20875);params[i] = param;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20876);if ((((missFields != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20877)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20878)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20879);for (Map.Entry<String, Object> entry : map.entrySet()) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20880);String key = entry.getKey();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20881);Object value = entry.getValue();

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20882);FieldDeserializer fieldDeser = smartMatch(key);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20883);if ((((fieldDeser != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20884)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20885)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20886);Integer index = missFields.get(fieldDeser.fieldInfo.name);
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20887);if ((((index != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20888)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20889)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20890);params[index] = value;
                    }
                }}
            }}
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20891);if ((((beanInfo.creatorConstructor != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20892)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20893)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20894);boolean hasNull = false;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20895);if ((((beanInfo.kotlin)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20896)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20897)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20898);for (int i = 0; (((i < params.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20899)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20900)==0&false)); i++) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20901);if ((((params[i] == null && beanInfo.fields != null && i < beanInfo.fields.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20902)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20903)==0&false))) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20904);FieldInfo fieldInfo = beanInfo.fields[i];
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20905);if ((((fieldInfo.fieldClass == String.class)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20906)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20907)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20908);hasNull = true;
                        }
                        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20909);break;
                    }
                }}
            }}

            }__CLR4_5_2eyyeyylusyjlw5.R.inc(20910);if ((((hasNull && beanInfo.kotlinDefaultConstructor != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20911)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20912)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20913);try {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20914);object = beanInfo.kotlinDefaultConstructor.newInstance();

                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20915);for (int i = 0; (((i < params.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20916)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20917)==0&false)); i++) {{
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20918);final Object param = params[i];
                        __CLR4_5_2eyyeyylusyjlw5.R.inc(20919);if ((((param != null && beanInfo.fields != null && i < beanInfo.fields.length)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20920)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20921)==0&false))) {{
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20922);FieldInfo fieldInfo = beanInfo.fields[i];
                            __CLR4_5_2eyyeyylusyjlw5.R.inc(20923);fieldInfo.set(object, param);
                        }
                    }}
                }} catch (Exception e) {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20924);throw new JSONException("create instance error, "
                            + beanInfo.creatorConstructor.toGenericString(), e);
                }
            } }else {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20925);try {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20926);object = beanInfo.creatorConstructor.newInstance(params);
                } catch (Exception e) {
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20927);throw new JSONException("create instance error, "
                            + beanInfo.creatorConstructor.toGenericString(), e);
                }
            }
        }} }else {__CLR4_5_2eyyeyylusyjlw5.R.inc(20928);if ((((beanInfo.factoryMethod != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20929)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20930)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20931);try {
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20932);object = beanInfo.factoryMethod.invoke(null, params);
            } catch (Exception e) {
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20933);throw new JSONException("create factory method error, " + beanInfo.factoryMethod.toString(), e);
            }
        }
        
        }}__CLR4_5_2eyyeyylusyjlw5.R.inc(20934);return object;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    public Type getFieldType(int ordinal) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20935);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20936);return sortedFieldDeserializers[ordinal].fieldInfo.fieldType;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    protected Object parseRest(DefaultJSONParser parser, Type type, Object fieldName, Object instance, int features) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20937);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20938);return parseRest(parser, type, fieldName, instance, features, new int[0]);
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}

    protected Object parseRest(DefaultJSONParser parser
            , Type type
            , Object fieldName
            , Object instance
            , int features
            , int[] setFlags) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20939);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20940);Object value = deserialze(parser, type, fieldName, instance, features, setFlags);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20941);return value;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    protected JavaBeanDeserializer getSeeAlso(ParserConfig config, JavaBeanInfo beanInfo, String typeName) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20942);
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20943);if ((((beanInfo.jsonType == null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20944)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20945)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20946);return null;
        }
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20947);for (Class<?> seeAlsoClass : beanInfo.jsonType.seeAlso()) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20948);ObjectDeserializer seeAlsoDeser = config.getDeserializer(seeAlsoClass);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20949);if ((((seeAlsoDeser instanceof JavaBeanDeserializer)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20950)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20951)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20952);JavaBeanDeserializer seeAlsoJavaBeanDeser = (JavaBeanDeserializer) seeAlsoDeser;

                __CLR4_5_2eyyeyylusyjlw5.R.inc(20953);JavaBeanInfo subBeanInfo = seeAlsoJavaBeanDeser.beanInfo;
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20954);if ((((subBeanInfo.typeName.equals(typeName))&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20955)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20956)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20957);return seeAlsoJavaBeanDeser;
                }
                
                }__CLR4_5_2eyyeyylusyjlw5.R.inc(20958);JavaBeanDeserializer subSeeAlso = getSeeAlso(config, subBeanInfo, typeName);
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20959);if ((((subSeeAlso != null)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20960)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20961)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(20962);return subSeeAlso;
                }
            }}
        }}

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20963);return null;
    }finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
    @SuppressWarnings({ "unchecked", "rawtypes" })
    protected static void parseArray(Collection collection, //
                              ObjectDeserializer deser, //
                              DefaultJSONParser parser, //
                              Type type, //
                              Object fieldName) {try{__CLR4_5_2eyyeyylusyjlw5.R.inc(20964);

        __CLR4_5_2eyyeyylusyjlw5.R.inc(20965);final JSONLexerBase lexer = (JSONLexerBase) parser.lexer;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20966);int token = lexer.token();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20967);if ((((token == JSONToken.NULL)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20968)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20969)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20970);lexer.nextToken(JSONToken.COMMA);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20971);token = lexer.token();
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20972);return;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20973);if ((((token != JSONToken.LBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20974)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20975)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20976);parser.throwException(token);
        }
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20977);char ch = lexer.getCurrent();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20978);if ((((ch == '[')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20979)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20980)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20981);lexer.next();
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20982);lexer.setToken(JSONToken.LBRACKET);
        } }else {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20983);lexer.nextToken(JSONToken.LBRACKET);
        }
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20984);if ((((lexer.token() == JSONToken.RBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20985)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20986)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20987);lexer.nextToken();
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20988);return;
        }

        }__CLR4_5_2eyyeyylusyjlw5.R.inc(20989);int index = 0;
        __CLR4_5_2eyyeyylusyjlw5.R.inc(20990);for (;;) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20991);Object item = deser.deserialze(parser, type, index);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20992);collection.add(item);
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20993);index++;
            __CLR4_5_2eyyeyylusyjlw5.R.inc(20994);if ((((lexer.token() == JSONToken.COMMA)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20995)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(20996)==0&false))) {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20997);ch = lexer.getCurrent();
                __CLR4_5_2eyyeyylusyjlw5.R.inc(20998);if ((((ch == '[')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(20999)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(21000)==0&false))) {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(21001);lexer.next();
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(21002);lexer.setToken(JSONToken.LBRACKET);
                } }else {{
                    __CLR4_5_2eyyeyylusyjlw5.R.inc(21003);lexer.nextToken(JSONToken.LBRACKET);
                }
            }} }else {{
                __CLR4_5_2eyyeyylusyjlw5.R.inc(21004);break;
            }
        }}
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(21005);token = lexer.token();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(21006);if ((((token != JSONToken.RBRACKET)&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(21007)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(21008)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(21009);parser.throwException(token);
        }
        
        }__CLR4_5_2eyyeyylusyjlw5.R.inc(21010);ch = lexer.getCurrent();
        __CLR4_5_2eyyeyylusyjlw5.R.inc(21011);if ((((ch == ',')&&(__CLR4_5_2eyyeyylusyjlw5.R.iget(21012)!=0|true))||(__CLR4_5_2eyyeyylusyjlw5.R.iget(21013)==0&false))) {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(21014);lexer.next();
            __CLR4_5_2eyyeyylusyjlw5.R.inc(21015);lexer.setToken(JSONToken.COMMA);
        } }else {{
            __CLR4_5_2eyyeyylusyjlw5.R.inc(21016);lexer.nextToken(JSONToken.COMMA);
        }
//        parser.accept(JSONToken.RBRACKET, JSONToken.COMMA);
    }}finally{__CLR4_5_2eyyeyylusyjlw5.R.flushNeeded();}}
    
}
