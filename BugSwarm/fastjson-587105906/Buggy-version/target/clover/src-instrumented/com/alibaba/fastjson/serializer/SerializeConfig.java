/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 1999-2018 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.*;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.parser.deserializer.Jdk8DateCodec;
import com.alibaba.fastjson.parser.deserializer.OptionalCodec;
import com.alibaba.fastjson.spi.Module;
import com.alibaba.fastjson.support.moneta.MonetaCodec;
import com.alibaba.fastjson.support.springfox.SwaggerJsonSerializer;
import com.alibaba.fastjson.util.*;
import com.alibaba.fastjson.util.IdentityHashMap;
import com.alibaba.fastjson.util.ServiceLoader;

import javax.xml.datatype.XMLGregorianCalendar;
import java.io.File;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.lang.reflect.*;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.*;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.atomic.*;
import java.util.regex.Pattern;

/**
 * circular references detect
 * 
 * @author wenshao[szujobs@hotmail.com]
 */
public class SerializeConfig {public static class __CLR4_1_10m2cm2cluszvzt0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,29210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final static SerializeConfig                   globalInstance  = new SerializeConfig();

    private static boolean                                awtError        = false;
    private static boolean                                jdk8Error       = false;
    private static boolean                                oracleJdbcError = false;
    private static boolean                                springfoxError  = false;
    private static boolean                                guavaError      = false;
    private static boolean                                jsonnullError   = false;
    private static boolean                                jsonobjectError = false;
    
    private static boolean                                jodaError       = false;

    private boolean                                       asm             = !ASMUtils.IS_ANDROID;
    private ASMSerializerFactory                          asmFactory;
    protected String                                      typeKey         = JSON.DEFAULT_TYPE_KEY;
    public PropertyNamingStrategy                         propertyNamingStrategy;

    private final IdentityHashMap<Type, ObjectSerializer> serializers;
    private final IdentityHashMap<Type, IdentityHashMap<Type, ObjectSerializer>> mixInSerializers;

    private final boolean                                 fieldBased;

    private long[]                                        denyClasses =
            {
                    4165360493669296979L,
                    4446674157046724083L
            };

    private List<Module>                                    modules                = new ArrayList<Module>();
    
	public String getTypeKey() {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28596);
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28597);return typeKey;
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public void setTypeKey(String typeKey) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28598);
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28599);this.typeKey = typeKey;
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
	
    private final JavaBeanSerializer createASMSerializer(SerializeBeanInfo beanInfo) throws Exception {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28600);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28601);JavaBeanSerializer serializer = asmFactory.createJavaBeanSerializer(beanInfo);
        
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28602);for (int i = 0; (((i < serializer.sortedGetters.length)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28603)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28604)==0&false)); ++i) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28605);FieldSerializer fieldDeser = serializer.sortedGetters[i];
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28606);Class<?> fieldClass = fieldDeser.fieldInfo.fieldClass;
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28607);if ((((fieldClass.isEnum())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28608)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28609)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28610);ObjectSerializer fieldSer = this.getObjectWriter(fieldClass);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28611);if ((((!(fieldSer instanceof EnumSerializer))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28612)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28613)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28614);serializer.writeDirect = false;
                }
            }}
        }}
     
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28615);return serializer;
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public final ObjectSerializer createJavaBeanSerializer(Class<?> clazz) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28616);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28617);String className = clazz.getName();
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28618);long hashCode64 = TypeUtils.fnv1a_64(className);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28619);if ((((Arrays.binarySearch(denyClasses, hashCode64) >= 0)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28620)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28621)==0&false))) {{
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28622);throw new JSONException("not support class : " + className);
        }

	    }__CLR4_1_10m2cm2cluszvzt0.R.inc(28623);SerializeBeanInfo beanInfo = TypeUtils.buildBeanInfo(clazz, null, propertyNamingStrategy, fieldBased);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28624);if ((((beanInfo.fields.length == 0 && Iterable.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28625)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28626)==0&false))) {{
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28627);return MiscCodec.instance;
	    }

	    }__CLR4_1_10m2cm2cluszvzt0.R.inc(28628);return createJavaBeanSerializer(beanInfo);
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
	
	public ObjectSerializer createJavaBeanSerializer(SerializeBeanInfo beanInfo) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28629);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28630);JSONType jsonType = beanInfo.jsonType;

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28631);boolean asm = this.asm && !fieldBased;
	    
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28632);if ((((jsonType != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28633)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28634)==0&false))) {{
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28635);Class<?> serializerClass = jsonType.serializer();
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28636);if ((((serializerClass != Void.class)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28637)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28638)==0&false))) {{
	            __CLR4_1_10m2cm2cluszvzt0.R.inc(28639);try {
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28640);Object seralizer = serializerClass.newInstance();
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28641);if ((((seralizer instanceof ObjectSerializer)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28642)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28643)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28644);return (ObjectSerializer) seralizer;
                    }
                }} catch (Throwable e) {
                    // skip
                }
	        }
	        
	        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28645);if ((((jsonType.asm() == false)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28646)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28647)==0&false))) {{
	            __CLR4_1_10m2cm2cluszvzt0.R.inc(28648);asm = false;
	        }

	        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28649);if ((((asm)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28650)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28651)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28652);for (SerializerFeature feature : jsonType.serialzeFeatures()) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28653);if ((((SerializerFeature.WriteNonStringValueAsString == feature //
                            || SerializerFeature.WriteEnumUsingToString == feature //
                            || SerializerFeature.NotWriteDefaultValue == feature
                            || SerializerFeature.BrowserCompatible == feature)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28654)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28655)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28656);asm = false;
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28657);break;
                    }
                }}
            }}

            }__CLR4_1_10m2cm2cluszvzt0.R.inc(28658);if ((((asm)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28659)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28660)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28661);final Class<? extends SerializeFilter>[] filterClasses = jsonType.serialzeFilters();
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28662);if ((((filterClasses.length != 0)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28663)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28664)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28665);asm = false;
                }
            }}
        }}

	    }__CLR4_1_10m2cm2cluszvzt0.R.inc(28666);Class<?> clazz = beanInfo.beanType;
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28667);if ((((!Modifier.isPublic(beanInfo.beanType.getModifiers()))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28668)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28669)==0&false))) {{
			__CLR4_1_10m2cm2cluszvzt0.R.inc(28670);return new JavaBeanSerializer(beanInfo);
		}



		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28671);if ((((asm && asmFactory.classLoader.isExternalClass(clazz)
				|| clazz == Serializable.class || clazz == Object.class)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28672)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28673)==0&false))) {{
			__CLR4_1_10m2cm2cluszvzt0.R.inc(28674);asm = false;
		}

		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28675);if ((((asm && !ASMUtils.checkName(clazz.getSimpleName()))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28676)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28677)==0&false))) {{
		    __CLR4_1_10m2cm2cluszvzt0.R.inc(28678);asm = false;
		}

		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28679);if ((((asm && beanInfo.beanType.isInterface())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28680)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28681)==0&false))) {{
		    __CLR4_1_10m2cm2cluszvzt0.R.inc(28682);asm = false;
        }
		
		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28683);if ((((asm)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28684)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28685)==0&false))) {{
    		__CLR4_1_10m2cm2cluszvzt0.R.inc(28686);for(FieldInfo fieldInfo : beanInfo.fields){{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28687);Field field = fieldInfo.field;
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28688);if ((((field != null && !field.getType().equals(fieldInfo.fieldClass))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28689)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28690)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28691);asm = false;
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28692);break;
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(28693);Method method = fieldInfo.method;
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28694);if ((((method != null && !method.getReturnType().equals(fieldInfo.fieldClass))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28695)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28696)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28697);asm = false;
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28698);break;
                }

    			}__CLR4_1_10m2cm2cluszvzt0.R.inc(28699);JSONField annotation = fieldInfo.getAnnotation();
    			
    			__CLR4_1_10m2cm2cluszvzt0.R.inc(28700);if ((((annotation == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28701)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28702)==0&false))) {{
    			    __CLR4_1_10m2cm2cluszvzt0.R.inc(28703);continue;
    			}

    			}__CLR4_1_10m2cm2cluszvzt0.R.inc(28704);String format = annotation.format();
    			__CLR4_1_10m2cm2cluszvzt0.R.inc(28705);if ((((format.length() != 0)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28706)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28707)==0&false))) {{
    			    __CLR4_1_10m2cm2cluszvzt0.R.inc(28708);if ((((fieldInfo.fieldClass == String.class && "trim".equals(format))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28709)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28710)==0&false))) {{

                    } }else {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28711);asm = false;
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28712);break;
                    }
                }}

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(28713);if (((((!ASMUtils.checkName(annotation.name())) //
                        || annotation.jsonDirect()
                        || annotation.serializeUsing() != Void.class
                        || annotation.unwrapped()
                        )&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28714)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28715)==0&false))) {{
    				__CLR4_1_10m2cm2cluszvzt0.R.inc(28716);asm = false;
    				__CLR4_1_10m2cm2cluszvzt0.R.inc(28717);break;
    			}

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(28718);for (SerializerFeature feature : annotation.serialzeFeatures()) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28719);if ((((SerializerFeature.WriteNonStringValueAsString == feature //
                            || SerializerFeature.WriteEnumUsingToString == feature //
                            || SerializerFeature.NotWriteDefaultValue == feature
                            || SerializerFeature.BrowserCompatible == feature
                            || SerializerFeature.WriteClassName == feature)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28720)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28721)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28722);asm = false;
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28723);break;
                    }
                }}

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(28724);if ((((TypeUtils.isAnnotationPresentOneToMany(method) || TypeUtils.isAnnotationPresentManyToMany(method))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28725)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28726)==0&false))) {{
    			    __CLR4_1_10m2cm2cluszvzt0.R.inc(28727);asm = false;
    			    __CLR4_1_10m2cm2cluszvzt0.R.inc(28728);break;
                }
                }__CLR4_1_10m2cm2cluszvzt0.R.inc(28729);if ((((annotation.defaultValue() != null && !"".equals(annotation.defaultValue()))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28730)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28731)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28732);asm = false;
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28733);break;
                }
    		}}
		}}
		
		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28734);if ((((asm)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28735)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28736)==0&false))) {{
			__CLR4_1_10m2cm2cluszvzt0.R.inc(28737);try {
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28738);ObjectSerializer asmSerializer = createASMSerializer(beanInfo);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28739);if ((((asmSerializer != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28740)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28741)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28742);return asmSerializer;
                }
            }} catch (ClassNotFoundException ex) {
			    // skip
			} catch (ClassFormatError e) {
			    // skip
			} catch (ClassCastException e) {
			    // skip
            } catch (OutOfMemoryError e) {
			    __CLR4_1_10m2cm2cluszvzt0.R.inc(28743);if ((((e.getMessage().indexOf("Metaspace") != -1)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28744)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28745)==0&false))) {{
			        __CLR4_1_10m2cm2cluszvzt0.R.inc(28746);throw e;
                }
                // skip
			}} catch (Throwable e) {
				__CLR4_1_10m2cm2cluszvzt0.R.inc(28747);throw new JSONException("create asm serializer error, verson " + JSON.VERSION + ", class " + clazz, e);
			}
		}

		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28748);return new JavaBeanSerializer(beanInfo);
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public boolean isAsmEnable() {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28749);
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28750);return asm;
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public void setAsmEnable(boolean asmEnable) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28751);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28752);if ((((ASMUtils.IS_ANDROID)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28753)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28754)==0&false))) {{
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28755);return;
	    }
		}__CLR4_1_10m2cm2cluszvzt0.R.inc(28756);this.asm = asmEnable;
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public static SerializeConfig getGlobalInstance() {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28757);
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28758);return globalInstance;
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public SerializeConfig() {
		this(IdentityHashMap.DEFAULT_SIZE);__CLR4_1_10m2cm2cluszvzt0.R.inc(28760);try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28759);
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public SerializeConfig(boolean fieldBase) {
	    this(IdentityHashMap.DEFAULT_SIZE, fieldBase);__CLR4_1_10m2cm2cluszvzt0.R.inc(28762);try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28761);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public SerializeConfig(int tableSize) {
        this(tableSize, false);__CLR4_1_10m2cm2cluszvzt0.R.inc(28764);try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28763);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

	public SerializeConfig(int tableSize, boolean fieldBase) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28765);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28766);this.fieldBased = fieldBase;
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28767);serializers = new IdentityHashMap<Type, ObjectSerializer>(tableSize);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28768);this.mixInSerializers = new IdentityHashMap<Type, IdentityHashMap<Type, ObjectSerializer>>(16);
		__CLR4_1_10m2cm2cluszvzt0.R.inc(28769);try {
		    __CLR4_1_10m2cm2cluszvzt0.R.inc(28770);if ((((asm)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28771)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28772)==0&false))) {{
		        __CLR4_1_10m2cm2cluszvzt0.R.inc(28773);asmFactory = new ASMSerializerFactory();
		    }
		}} catch (Throwable eror) {
		    __CLR4_1_10m2cm2cluszvzt0.R.inc(28774);asm = false;
		}

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28775);initSerializers();
	}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    private void initSerializers() {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28776);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28777);put(Boolean.class, BooleanCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28778);put(Character.class, CharacterCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28779);put(Byte.class, IntegerCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28780);put(Short.class, IntegerCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28781);put(Integer.class, IntegerCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28782);put(Long.class, LongCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28783);put(Float.class, FloatCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28784);put(Double.class, DoubleSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28785);put(BigDecimal.class, BigDecimalCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28786);put(BigInteger.class, BigIntegerCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28787);put(String.class, StringCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28788);put(byte[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28789);put(short[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28790);put(int[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28791);put(long[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28792);put(float[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28793);put(double[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28794);put(boolean[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28795);put(char[].class, PrimitiveArraySerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28796);put(Object[].class, ObjectArrayCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28797);put(Class.class, MiscCodec.instance);

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28798);put(SimpleDateFormat.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28799);put(Currency.class, new MiscCodec());
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28800);put(TimeZone.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28801);put(InetAddress.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28802);put(Inet4Address.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28803);put(Inet6Address.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28804);put(InetSocketAddress.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28805);put(File.class, MiscCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28806);put(Appendable.class, AppendableSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28807);put(StringBuffer.class, AppendableSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28808);put(StringBuilder.class, AppendableSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28809);put(Charset.class, ToStringSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28810);put(Pattern.class, ToStringSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28811);put(Locale.class, ToStringSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28812);put(URI.class, ToStringSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28813);put(URL.class, ToStringSerializer.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28814);put(UUID.class, ToStringSerializer.instance);

        // atomic
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28815);put(AtomicBoolean.class, AtomicCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28816);put(AtomicInteger.class, AtomicCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28817);put(AtomicLong.class, AtomicCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28818);put(AtomicReference.class, ReferenceCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28819);put(AtomicIntegerArray.class, AtomicCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28820);put(AtomicLongArray.class, AtomicCodec.instance);

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28821);put(WeakReference.class, ReferenceCodec.instance);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28822);put(SoftReference.class, ReferenceCodec.instance);

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28823);put(LinkedList.class, CollectionCodec.instance);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    /**
	 * add class level serialize filter
	 * @since 1.2.10
	 */
	public void addFilter(Class<?> clazz, SerializeFilter filter) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28824);
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28825);ObjectSerializer serializer = getObjectWriter(clazz);
	    
	    __CLR4_1_10m2cm2cluszvzt0.R.inc(28826);if ((((serializer instanceof SerializeFilterable)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28827)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28828)==0&false))) {{
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28829);SerializeFilterable filterable = (SerializeFilterable) serializer;
	        
	        __CLR4_1_10m2cm2cluszvzt0.R.inc(28830);if ((((this != SerializeConfig.globalInstance)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28831)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28832)==0&false))) {{
	            __CLR4_1_10m2cm2cluszvzt0.R.inc(28833);if ((((filterable == MapSerializer.instance)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28834)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28835)==0&false))) {{
	                __CLR4_1_10m2cm2cluszvzt0.R.inc(28836);MapSerializer newMapSer = new MapSerializer();
	                __CLR4_1_10m2cm2cluszvzt0.R.inc(28837);this.put(clazz, newMapSer);
	                __CLR4_1_10m2cm2cluszvzt0.R.inc(28838);newMapSer.addFilter(filter);
	                __CLR4_1_10m2cm2cluszvzt0.R.inc(28839);return;
	            }
	        }}
	        
	        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28840);filterable.addFilter(filter);
	    }
	}}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
	
    /** class level serializer feature config
     * @since 1.2.12
     */
    public void config(Class<?> clazz, SerializerFeature feature, boolean value) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28841);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28842);ObjectSerializer serializer = getObjectWriter(clazz, false);
        
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28843);if ((((serializer == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28844)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28845)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28846);SerializeBeanInfo beanInfo = TypeUtils.buildBeanInfo(clazz, null, propertyNamingStrategy);
            
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28847);if ((((value)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28848)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28849)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28850);beanInfo.features |= feature.mask;
            } }else {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28851);beanInfo.features &= ~feature.mask;
            }
            
            }__CLR4_1_10m2cm2cluszvzt0.R.inc(28852);serializer = this.createJavaBeanSerializer(beanInfo);
            
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28853);put(clazz, serializer);
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28854);return;
        }

        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28855);if ((((serializer instanceof JavaBeanSerializer)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28856)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28857)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28858);JavaBeanSerializer javaBeanSerializer = (JavaBeanSerializer) serializer;
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28859);SerializeBeanInfo beanInfo = javaBeanSerializer.beanInfo;
            
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28860);int originalFeaturs = beanInfo.features;
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28861);if ((((value)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28862)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28863)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28864);beanInfo.features |= feature.mask;
            } }else {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28865);beanInfo.features &= ~feature.mask;
            }
            
            }__CLR4_1_10m2cm2cluszvzt0.R.inc(28866);if ((((originalFeaturs == beanInfo.features)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28867)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28868)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28869);return;
            }
            
            }__CLR4_1_10m2cm2cluszvzt0.R.inc(28870);Class<?> serializerClass = serializer.getClass();
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28871);if ((((serializerClass != JavaBeanSerializer.class)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28872)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28873)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28874);ObjectSerializer newSerializer = this.createJavaBeanSerializer(beanInfo);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28875);this.put(clazz, newSerializer);
            }
        }}
    }}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
    
    public ObjectSerializer getObjectWriter(Class<?> clazz) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28876);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28877);return getObjectWriter(clazz, true);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
	
	private ObjectSerializer getObjectWriter(Class<?> clazz, boolean create) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(28878);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(28879);ObjectSerializer writer = get(clazz);

        __CLR4_1_10m2cm2cluszvzt0.R.inc(28880);if ((((writer == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28881)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28882)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28883);try {
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28884);final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28885);for (Object o : ServiceLoader.load(AutowiredObjectSerializer.class, classLoader)) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28886);if ((((!(o instanceof AutowiredObjectSerializer))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28887)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28888)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28889);continue;
                    }

                    }__CLR4_1_10m2cm2cluszvzt0.R.inc(28890);AutowiredObjectSerializer autowired = (AutowiredObjectSerializer) o;
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28891);for (Type forType : autowired.getAutowiredFor()) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28892);put(forType, autowired);
                    }
                }}
            }} catch (ClassCastException ex) {
                // skip
            }

            __CLR4_1_10m2cm2cluszvzt0.R.inc(28893);writer = get(clazz);
        }

        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28894);if ((((writer == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28895)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28896)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28897);final ClassLoader classLoader = JSON.class.getClassLoader();
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28898);if ((((classLoader != Thread.currentThread().getContextClassLoader())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28899)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28900)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28901);try {
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28902);for (Object o : ServiceLoader.load(AutowiredObjectSerializer.class, classLoader)) {{

                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28903);if ((((!(o instanceof AutowiredObjectSerializer))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28904)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28905)==0&false))) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(28906);continue;
                        }

                        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28907);AutowiredObjectSerializer autowired = (AutowiredObjectSerializer) o;
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(28908);for (Type forType : autowired.getAutowiredFor()) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(28909);put(forType, autowired);
                        }
                    }}
                }} catch (ClassCastException ex) {
                    // skip
                }

                __CLR4_1_10m2cm2cluszvzt0.R.inc(28910);writer = get(clazz);
            }
        }}

        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28911);for (Module module : modules) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28912);writer = module.createSerializer(this, clazz);
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28913);if ((((writer != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28914)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28915)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28916);put(clazz, writer);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28917);return writer;
            }
        }}
        
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(28918);if ((((writer == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28919)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28920)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28921);String className = clazz.getName();
            __CLR4_1_10m2cm2cluszvzt0.R.inc(28922);Class<?> superClass;

            __CLR4_1_10m2cm2cluszvzt0.R.inc(28923);if ((((Map.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28924)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28925)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28926);put(clazz, writer = MapSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28927);if ((((List.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28928)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28929)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28930);put(clazz, writer = ListSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28931);if ((((Collection.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28932)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28933)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28934);put(clazz, writer = CollectionCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28935);if ((((Date.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28936)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28937)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28938);put(clazz, writer = DateCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28939);if ((((JSONAware.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28940)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28941)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28942);put(clazz, writer = JSONAwareSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28943);if ((((JSONSerializable.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28944)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28945)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28946);put(clazz, writer = JSONSerializableSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28947);if ((((JSONStreamAware.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28948)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28949)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28950);put(clazz, writer = MiscCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28951);if ((((clazz.isEnum())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28952)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28953)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28954);JSONType jsonType = TypeUtils.getAnnotation(clazz, JSONType.class);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28955);if ((((jsonType != null && jsonType.serializeEnumAsJavaBean())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28956)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28957)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28958);put(clazz, writer = createJavaBeanSerializer(clazz));
                } }else {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28959);put(clazz, writer = EnumSerializer.instance);
                }
            }} }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28960);if ((superClass = clazz.getSuperclass()) != null && superClass.isEnum()) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28963);JSONType jsonType = TypeUtils.getAnnotation(superClass, JSONType.class);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28964);if ((((jsonType != null && jsonType.serializeEnumAsJavaBean())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28965)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28966)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28967);put(clazz, writer = createJavaBeanSerializer(clazz));
                } }else {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(28968);put(clazz, writer = EnumSerializer.instance);
                }
            }} }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28969);if ((((clazz.isArray())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28970)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28971)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28972);Class<?> componentType = clazz.getComponentType();
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28973);ObjectSerializer compObjectSerializer = getObjectWriter(componentType);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28974);put(clazz, writer = new ArraySerializer(componentType, compObjectSerializer));
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28975);if ((((Throwable.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28976)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28977)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28978);SerializeBeanInfo beanInfo = TypeUtils.buildBeanInfo(clazz, null, propertyNamingStrategy);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28979);beanInfo.features |= SerializerFeature.WriteClassName.mask;
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28980);put(clazz, writer = new JavaBeanSerializer(beanInfo));
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28981);if ((((TimeZone.class.isAssignableFrom(clazz) || Map.Entry.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28982)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28983)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28984);put(clazz, writer = MiscCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28985);if ((((Appendable.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28986)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28987)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28988);put(clazz, writer = AppendableSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28989);if ((((Charset.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28990)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28991)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28992);put(clazz, writer = ToStringSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28993);if ((((Enumeration.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28994)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28995)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(28996);put(clazz, writer = EnumerationSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(28997);if ((((Calendar.class.isAssignableFrom(clazz) //
                    || XMLGregorianCalendar.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(28998)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(28999)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29000);put(clazz, writer = CalendarCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(29001);if ((((TypeUtils.isClob(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29002)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29003)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29004);put(clazz, writer = ClobSeriliazer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(29005);if ((((TypeUtils.isPath(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29006)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29007)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29008);put(clazz, writer = ToStringSerializer.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(29009);if ((((Iterator.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29010)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29011)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29012);put(clazz, writer = MiscCodec.instance);
            } }else {__CLR4_1_10m2cm2cluszvzt0.R.inc(29013);if ((((org.w3c.dom.Node.class.isAssignableFrom(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29014)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29015)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29016);put(clazz, writer = MiscCodec.instance);
            } }else {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29017);if ((((className.startsWith("java.awt.") //
                    && AwtCodec.support(clazz) //
                )&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29018)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29019)==0&false))) {{
                    // awt
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29020);if ((((!awtError)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29021)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29022)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29023);try {
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29024);String[] names = new String[]{
                                    "java.awt.Color",
                                    "java.awt.Font",
                                    "java.awt.Point",
                                    "java.awt.Rectangle"
                            };
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29025);for (String name : names) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29026);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29027)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29028)==0&false))) {{
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29029);put(Class.forName(name), writer = AwtCodec.instance);
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29030);return writer;
                                }
                            }}
                        }} catch (Throwable e) {
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29031);awtError = true;
                            // skip
                        }
                    }
                }}
                
                // jdk8
                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29032);if (((((!jdk8Error) //
                    && (className.startsWith("java.time.") //
                        || className.startsWith("java.util.Optional") //
                        || className.equals("java.util.concurrent.atomic.LongAdder")
                        || className.equals("java.util.concurrent.atomic.DoubleAdder")
                    ))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29033)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29034)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29035);try {
                        {
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29036);String[] names = new String[]{
                                    "java.time.LocalDateTime",
                                    "java.time.LocalDate",
                                    "java.time.LocalTime",
                                    "java.time.ZonedDateTime",
                                    "java.time.OffsetDateTime",
                                    "java.time.OffsetTime",
                                    "java.time.ZoneOffset",
                                    "java.time.ZoneRegion",
                                    "java.time.Period",
                                    "java.time.Duration",
                                    "java.time.Instant"
                            };
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29037);for (String name : names) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29038);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29039)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29040)==0&false))) {{
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29041);put(Class.forName(name), writer = Jdk8DateCodec.instance);
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29042);return writer;
                                }
                            }}
                        }}
                        {
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29043);String[] names = new String[]{
                                    "java.util.Optional",
                                    "java.util.OptionalDouble",
                                    "java.util.OptionalInt",
                                    "java.util.OptionalLong"
                            };
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29044);for (String name : names) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29045);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29046)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29047)==0&false))) {{
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29048);put(Class.forName(name), writer = OptionalCodec.instance);
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29049);return writer;
                                }
                            }}
                        }}
                        {
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29050);String[] names = new String[]{
                                    "java.util.concurrent.atomic.LongAdder",
                                    "java.util.concurrent.atomic.DoubleAdder"
                            };
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29051);for (String name : names) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29052);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29053)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29054)==0&false))) {{
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29055);put(Class.forName(name), writer = AdderSerializer.instance);
                                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29056);return writer;
                                }
                            }}
                        }}
                    } catch (Throwable e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29057);jdk8Error = true;
                    }
                }
                
                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29058);if (((((!oracleJdbcError) //
                    && className.startsWith("oracle.sql."))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29059)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29060)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29061);try {
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29062);String[] names = new String[] {
                                "oracle.sql.DATE",
                                "oracle.sql.TIMESTAMP"
                        };

                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29063);for (String name : names) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29064);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29065)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29066)==0&false))) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29067);put(Class.forName(name), writer = DateCodec.instance);
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29068);return writer;
                            }
                        }}
                    }} catch (Throwable e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29069);oracleJdbcError = true;
                    }
                }
                
                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29070);if (((((!springfoxError) //
                    && className.equals("springfox.documentation.spring.web.json.Json"))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29071)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29072)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29073);try {
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29074);put(Class.forName("springfox.documentation.spring.web.json.Json"), //
                                writer = SwaggerJsonSerializer.instance);
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29075);return writer;
                    } catch (ClassNotFoundException e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29076);springfoxError = true;
                    }
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29077);if (((((!guavaError) //
                        && className.startsWith("com.google.common.collect."))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29078)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29079)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29080);try {
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29081);String[] names = new String[] {
                                "com.google.common.collect.HashMultimap",
                                "com.google.common.collect.LinkedListMultimap",
                                "com.google.common.collect.LinkedHashMultimap",
                                "com.google.common.collect.ArrayListMultimap",
                                "com.google.common.collect.TreeMultimap"
                        };

                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29082);for (String name : names) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29083);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29084)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29085)==0&false))) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29086);put(Class.forName(name), writer = GuavaCodec.instance);
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29087);return writer;
                            }
                        }}
                    }} catch (ClassNotFoundException e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29088);guavaError = true;
                    }
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29089);if (((((!jsonnullError) && className.equals("net.sf.json.JSONNull"))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29090)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29091)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29092);try {
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29093);put(Class.forName("net.sf.json.JSONNull"), writer = MiscCodec.instance);
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29094);return writer;
                    } catch (ClassNotFoundException e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29095);jsonnullError = true;
                    }
                }
                
				}__CLR4_1_10m2cm2cluszvzt0.R.inc(29096);if ((((!jsonobjectError && className.equals("org.json.JSONObject"))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29097)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29098)==0&false))) {{
					__CLR4_1_10m2cm2cluszvzt0.R.inc(29099);try {
						__CLR4_1_10m2cm2cluszvzt0.R.inc(29100);put(Class.forName("org.json.JSONObject"), writer = JSONObjectCodec.instance);
						__CLR4_1_10m2cm2cluszvzt0.R.inc(29101);return writer;
					} catch (ClassNotFoundException e) {
						// skip
						__CLR4_1_10m2cm2cluszvzt0.R.inc(29102);jsonobjectError = true;
					}
				}

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29103);if (((((!jodaError) && className.startsWith("org.joda."))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29104)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29105)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29106);try {
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29107);String[] names = new String[] {
                                "org.joda.time.LocalDate",
                                "org.joda.time.LocalDateTime",
                                "org.joda.time.LocalTime",
                                "org.joda.time.Instant",
                                "org.joda.time.DateTime",
                                "org.joda.time.Period",
                                "org.joda.time.Duration",
                                "org.joda.time.DateTimeZone",
                                "org.joda.time.UTCDateTimeZone",
                                "org.joda.time.tz.CachedDateTimeZone",
                                "org.joda.time.tz.FixedDateTimeZone",
                        };

                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29108);for (String name : names) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29109);if ((((name.equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29110)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29111)==0&false))) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29112);put(Class.forName(name), writer = JodaCodec.instance);
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29113);return writer;
                            }
                        }}
                    }} catch (ClassNotFoundException e) {
                        // skip
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29114);jodaError = true;
                    }
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29115);if (((("java.nio.HeapByteBuffer".equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29116)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29117)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29118);put(clazz, writer = ByteBufferCodec.instance);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29119);return writer;
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29120);if (((("org.javamoney.moneta.Money".equals(className))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29121)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29122)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29123);put(clazz, writer = MonetaCodec.instance);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29124);return writer;
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29125);Class[] interfaces = clazz.getInterfaces();
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29126);if ((((interfaces.length == 1 && interfaces[0].isAnnotation())&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29127)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29128)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29129);put(clazz, AnnotationSerializer.instance);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29130);return AnnotationSerializer.instance;
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29131);if ((((TypeUtils.isProxy(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29132)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29133)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29134);Class<?> superClazz = clazz.getSuperclass();

                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29135);ObjectSerializer superWriter = getObjectWriter(superClazz);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29136);put(clazz, superWriter);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29137);return superWriter;
                }

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29138);if ((((Proxy.isProxyClass(clazz))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29139)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29140)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29141);Class handlerClass = null;

                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29142);if ((((interfaces.length == 2)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29143)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29144)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29145);handlerClass = interfaces[1];
                    } }else {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29146);for (Class proxiedInterface : interfaces) {{
                            __CLR4_1_10m2cm2cluszvzt0.R.inc(29147);if ((((proxiedInterface.getName().startsWith("org.springframework.aop."))&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29148)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29149)==0&false))) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29150);continue;
                            }
                            }__CLR4_1_10m2cm2cluszvzt0.R.inc(29151);if ((((handlerClass != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29152)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29153)==0&false))) {{
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29154);handlerClass = null; // multi-matched
                                __CLR4_1_10m2cm2cluszvzt0.R.inc(29155);break;
                            }
                            }__CLR4_1_10m2cm2cluszvzt0.R.inc(29156);handlerClass = proxiedInterface;
                        }
                    }}

                    }__CLR4_1_10m2cm2cluszvzt0.R.inc(29157);if ((((handlerClass != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29158)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29159)==0&false))) {{
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29160);ObjectSerializer superWriter = getObjectWriter(handlerClass);
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29161);put(clazz, superWriter);
                        __CLR4_1_10m2cm2cluszvzt0.R.inc(29162);return superWriter;
                    }
                }}

                }__CLR4_1_10m2cm2cluszvzt0.R.inc(29163);if ((((create)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29164)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29165)==0&false))) {{
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29166);writer = createJavaBeanSerializer(clazz);
                    __CLR4_1_10m2cm2cluszvzt0.R.inc(29167);put(clazz, writer);
                }
            }}

            }}}}}}}}}}}}}}}}}}}}__CLR4_1_10m2cm2cluszvzt0.R.inc(29168);if ((((writer == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29169)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29170)==0&false))) {{
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29171);writer = get(clazz);
            }
        }}
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(29172);return writer;
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
	
    public final ObjectSerializer get(Type type) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29173);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29174);Type mixin = JSON.getMixInAnnotations(type);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29175);if ((((null == mixin)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29176)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29177)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(29178);return this.serializers.get(type);
        }
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(29179);IdentityHashMap<Type, ObjectSerializer> mixInClasses = this.mixInSerializers.get(type);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29180);if ((((mixInClasses == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29181)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29182)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(29183);return null;
        }
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(29184);return mixInClasses.get(mixin);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public boolean put(Object type, Object value) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29185);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29186);return put((Type)type, (ObjectSerializer)value);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public boolean put(Type type, ObjectSerializer value) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29187);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29188);Type mixin = JSON.getMixInAnnotations(type);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29189);if ((((mixin != null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29190)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29191)==0&false))) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(29192);IdentityHashMap<Type, ObjectSerializer> mixInClasses = this.mixInSerializers.get(type);
            __CLR4_1_10m2cm2cluszvzt0.R.inc(29193);if ((((mixInClasses == null)&&(__CLR4_1_10m2cm2cluszvzt0.R.iget(29194)!=0|true))||(__CLR4_1_10m2cm2cluszvzt0.R.iget(29195)==0&false))) {{
                //\u591a\u7ebf\u7a0b\u4e0b\u53ef\u80fd\u4f1a\u91cd\u590d\u521b\u5efa\uff0c\u4f46\u4e0d\u5f71\u54cd\u6b63\u786e\u6027
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29196);mixInClasses = new IdentityHashMap<Type, ObjectSerializer>(4);
                __CLR4_1_10m2cm2cluszvzt0.R.inc(29197);mixInSerializers.put(type, mixInClasses);
            }
            }__CLR4_1_10m2cm2cluszvzt0.R.inc(29198);return mixInClasses.put(mixin, value);
        }
        }__CLR4_1_10m2cm2cluszvzt0.R.inc(29199);return this.serializers.put(type, value);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    /**
     * 1.2.24
     * @param enumClasses
     */
	public void configEnumAsJavaBean(Class<? extends Enum>... enumClasses) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29200);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29201);for (Class<? extends Enum> enumClass : enumClasses) {{
            __CLR4_1_10m2cm2cluszvzt0.R.inc(29202);put(enumClass, createJavaBeanSerializer(enumClass));
        }
    }}finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    /**
     * for spring config support
     * @param propertyNamingStrategy
     */
    public void setPropertyNamingStrategy(PropertyNamingStrategy propertyNamingStrategy) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29203);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29204);this.propertyNamingStrategy = propertyNamingStrategy;
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public void clearSerializers() {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29205);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29206);this.serializers.clear();
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29207);this.initSerializers();
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}

    public void register(Module module) {try{__CLR4_1_10m2cm2cluszvzt0.R.inc(29208);
        __CLR4_1_10m2cm2cluszvzt0.R.inc(29209);this.modules.add(module);
    }finally{__CLR4_1_10m2cm2cluszvzt0.R.flushNeeded();}}
}
