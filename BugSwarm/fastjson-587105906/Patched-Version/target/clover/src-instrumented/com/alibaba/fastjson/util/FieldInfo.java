/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

import com.alibaba.fastjson.annotation.JSONField;

public class FieldInfo implements Comparable<FieldInfo> {public static class __CLR4_5_2pufpuflusyjo2f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,33911,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final String     name;
    public final Method     method;
    public final Field      field;

    private int             ordinal = 0;
    public final Class<?>   fieldClass;
    public final Type       fieldType;
    public final Class<?>   declaringClass;
    public final boolean    getOnly;
    public final int        serialzeFeatures;
    public final int        parserFeatures;
    public final String     label;

    private final JSONField fieldAnnotation;
    private final JSONField methodAnnotation;

    public final boolean    fieldAccess;
    public final boolean    fieldTransient;

    public final char[]     name_chars;
    
    public final boolean    isEnum;
    public final boolean    jsonDirect;
    public final boolean    unwrapped;
    
    public final String     format;

    public final String[]  alternateNames;
    
    public FieldInfo(String name, // 
                     Class<?> declaringClass, // 
                     Class<?> fieldClass, // 
                     Type fieldType, // 
                     Field field, // 
                     int ordinal, // 
                     int serialzeFeatures, // 
                     int parserFeatures){try{__CLR4_5_2pufpuflusyjo2f.R.inc(33495);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33496);if ((((ordinal < 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33497)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33498)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33499);ordinal = 0;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33500);this.name = name;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33501);this.declaringClass = declaringClass;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33502);this.fieldClass = fieldClass;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33503);this.fieldType = fieldType;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33504);this.method = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33505);this.field = field;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33506);this.ordinal = ordinal;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33507);this.serialzeFeatures = serialzeFeatures;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33508);this.parserFeatures = parserFeatures;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33509);isEnum = fieldClass.isEnum();
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33510);if ((((field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33511)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33512)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33513);int modifiers = field.getModifiers();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33514);fieldAccess = (modifiers & Modifier.PUBLIC) != 0 || method == null;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33515);fieldTransient = Modifier.isTransient(modifiers);
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33516);fieldTransient = false;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33517);fieldAccess = false;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33518);name_chars = genFieldNameChars();

        __CLR4_5_2pufpuflusyjo2f.R.inc(33519);if ((((field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33520)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33521)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33522);TypeUtils.setAccessible(field);
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33523);this.label = "";
        __CLR4_5_2pufpuflusyjo2f.R.inc(33524);fieldAnnotation = (((field == null )&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33525)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33526)==0&false))? null : TypeUtils.getAnnotation(field, JSONField.class);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33527);methodAnnotation = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33528);this.getOnly = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33529);this.jsonDirect = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33530);this.unwrapped = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33531);this.format = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33532);this.alternateNames = new String[0];
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public FieldInfo(String name, // 
                     Method method, // 
                     Field field, // 
                     Class<?> clazz, // 
                     Type type, // 
                     int ordinal, // 
                     int serialzeFeatures, // 
                     int parserFeatures, //
                     JSONField fieldAnnotation, // 
                     JSONField methodAnnotation, //
                     String label){try{__CLR4_5_2pufpuflusyjo2f.R.inc(33533);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33534);if ((((field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33535)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33536)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33537);String fieldName = field.getName();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33538);if ((((fieldName.equals(name))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33539)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33540)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33541);name = fieldName;
            }
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33542);if ((((ordinal < 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33543)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33544)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33545);ordinal = 0;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33546);this.name = name;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33547);this.method = method;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33548);this.field = field;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33549);this.ordinal = ordinal;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33550);this.serialzeFeatures = serialzeFeatures;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33551);this.parserFeatures = parserFeatures;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33552);this.fieldAnnotation = fieldAnnotation;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33553);this.methodAnnotation = methodAnnotation;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33554);if ((((field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33555)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33556)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33557);int modifiers = field.getModifiers();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33558);fieldAccess = ((modifiers & Modifier.PUBLIC) != 0 || method == null);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33559);fieldTransient = Modifier.isTransient(modifiers)
                    || TypeUtils.isTransient(method);
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33560);fieldAccess = false;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33561);fieldTransient = TypeUtils.isTransient(method);
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33562);if ((((label != null && label.length() > 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33563)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33564)==0&false))) {{ 
            __CLR4_5_2pufpuflusyjo2f.R.inc(33565);this.label = label;
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33566);this.label = "";
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33567);String format = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33568);JSONField annotation = getAnnotation();

        __CLR4_5_2pufpuflusyjo2f.R.inc(33569);boolean jsonDirect = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33570);if ((((annotation != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33571)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33572)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33573);format = annotation.format();

            __CLR4_5_2pufpuflusyjo2f.R.inc(33574);if ((((format.trim().length() == 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33575)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33576)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33577);format = null;
            }
            }__CLR4_5_2pufpuflusyjo2f.R.inc(33578);jsonDirect = annotation.jsonDirect();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33579);unwrapped = annotation.unwrapped();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33580);alternateNames = annotation.alternateNames();
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33581);jsonDirect = false;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33582);unwrapped = false;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33583);alternateNames = new String[0];
        }
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33584);this.format = format;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33585);name_chars = genFieldNameChars();

        __CLR4_5_2pufpuflusyjo2f.R.inc(33586);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33587)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33588)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33589);TypeUtils.setAccessible(method);
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33590);if ((((field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33591)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33592)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33593);TypeUtils.setAccessible(field);
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33594);boolean getOnly = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33595);Type fieldType;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33596);Class<?> fieldClass;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33597);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33598)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33599)==0&false))) {{
        	__CLR4_5_2pufpuflusyjo2f.R.inc(33600);Class<?>[] types;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33601);if ((types = method.getParameterTypes()).length == 1) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33604);fieldClass = types[0];
                __CLR4_5_2pufpuflusyjo2f.R.inc(33605);fieldType = method.getGenericParameterTypes()[0];
            } }else {__CLR4_5_2pufpuflusyjo2f.R.inc(33606);if ((((types.length == 2 && types[0] == String.class && types[1] == Object.class)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33607)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33608)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33609);fieldType = fieldClass = types[0];
            } }else {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33610);fieldClass = method.getReturnType();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33611);fieldType = method.getGenericReturnType();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33612);getOnly = true;
            }
            }}__CLR4_5_2pufpuflusyjo2f.R.inc(33613);this.declaringClass = method.getDeclaringClass();
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33614);fieldClass = field.getType();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33615);fieldType = field.getGenericType();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33616);this.declaringClass = field.getDeclaringClass();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33617);getOnly = Modifier.isFinal(field.getModifiers());
        }
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33618);this.getOnly = getOnly;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33619);this.jsonDirect = jsonDirect && fieldClass == String.class;

        __CLR4_5_2pufpuflusyjo2f.R.inc(33620);if ((((clazz != null && fieldClass == Object.class && fieldType instanceof TypeVariable)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33621)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33622)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33623);TypeVariable<?> tv = (TypeVariable<?>) fieldType;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33624);Type genericFieldType = getInheritGenericType(clazz, type, tv);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33625);if ((((genericFieldType != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33626)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33627)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33628);this.fieldClass = TypeUtils.getClass(genericFieldType);
                __CLR4_5_2pufpuflusyjo2f.R.inc(33629);this.fieldType = genericFieldType;
                
                __CLR4_5_2pufpuflusyjo2f.R.inc(33630);isEnum = fieldClass.isEnum();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33631);return;
            }
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33632);Type genericFieldType = fieldType;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33633);if ((((!(fieldType instanceof Class))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33634)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33635)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33636);genericFieldType = getFieldType(clazz, (((type != null )&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33637)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33638)==0&false))? type : clazz, fieldType);
    
            __CLR4_5_2pufpuflusyjo2f.R.inc(33639);if ((((genericFieldType != fieldType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33640)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33641)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33642);if ((((genericFieldType instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33643)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33644)==0&false))) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33645);fieldClass = TypeUtils.getClass(genericFieldType);
                } }else {__CLR4_5_2pufpuflusyjo2f.R.inc(33646);if ((((genericFieldType instanceof Class)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33647)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33648)==0&false))) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33649);fieldClass = TypeUtils.getClass(genericFieldType);
                }
            }}}
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33650);this.fieldType = genericFieldType;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33651);this.fieldClass = fieldClass;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33652);isEnum = fieldClass.isEnum();
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}
    
    protected char[] genFieldNameChars() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33653);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33654);int nameLen = this.name.length();
        __CLR4_5_2pufpuflusyjo2f.R.inc(33655);char[] name_chars = new char[nameLen + 3];
        __CLR4_5_2pufpuflusyjo2f.R.inc(33656);this.name.getChars(0, this.name.length(), name_chars, 1);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33657);name_chars[0] = '"';
        __CLR4_5_2pufpuflusyjo2f.R.inc(33658);name_chars[nameLen + 1] = '"';
        __CLR4_5_2pufpuflusyjo2f.R.inc(33659);name_chars[nameLen + 2] = ':';
        __CLR4_5_2pufpuflusyjo2f.R.inc(33660);return name_chars;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}
    
    @SuppressWarnings("unchecked")
    public <T extends Annotation> T getAnnation(Class<T> annotationClass) {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33661);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33662);if ((((annotationClass == JSONField.class)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33663)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33664)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33665);return (T) getAnnotation();
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33666);T annotatition = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33667);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33668)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33669)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33670);annotatition = TypeUtils.getAnnotation(method, annotationClass);
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33671);if ((((annotatition == null && field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33672)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33673)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33674);annotatition = TypeUtils.getAnnotation(field, annotationClass);
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33675);return annotatition;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public static Type getFieldType(final Class<?> clazz, final Type type, Type fieldType) {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33676);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33677);if ((((clazz == null || type == null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33678)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33679)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33680);return fieldType;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33681);if ((((fieldType instanceof GenericArrayType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33682)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33683)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33684);GenericArrayType genericArrayType = (GenericArrayType) fieldType;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33685);Type componentType = genericArrayType.getGenericComponentType();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33686);Type componentTypeX = getFieldType(clazz, type, componentType);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33687);if ((((componentType != componentTypeX)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33688)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33689)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33690);Type fieldTypeX = Array.newInstance(TypeUtils.getClass(componentTypeX), 0).getClass();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33691);return fieldTypeX;
            }

            }__CLR4_5_2pufpuflusyjo2f.R.inc(33692);return fieldType;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33693);if ((((!TypeUtils.isGenericParamType(type))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33694)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33695)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33696);return fieldType;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33697);if ((((fieldType instanceof TypeVariable)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33698)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33699)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33700);ParameterizedType paramType = (ParameterizedType) TypeUtils.getGenericParamType(type);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33701);Class<?> parameterizedClass = TypeUtils.getClass(paramType);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33702);final TypeVariable<?> typeVar = (TypeVariable<?>) fieldType;
            
            __CLR4_5_2pufpuflusyjo2f.R.inc(33703);TypeVariable<?>[] typeVariables = parameterizedClass.getTypeParameters();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33704);for (int i = 0; (((i < typeVariables.length)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33705)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33706)==0&false)); ++i) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33707);if ((((typeVariables[i].getName().equals(typeVar.getName()))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33708)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33709)==0&false))) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33710);fieldType = paramType.getActualTypeArguments()[i];
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33711);return fieldType;
                }
            }}
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33712);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33713)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33714)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33715);ParameterizedType parameterizedFieldType = (ParameterizedType) fieldType;

            __CLR4_5_2pufpuflusyjo2f.R.inc(33716);Type[] arguments = parameterizedFieldType.getActualTypeArguments();
            __CLR4_5_2pufpuflusyjo2f.R.inc(33717);TypeVariable<?>[] typeVariables;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33718);ParameterizedType paramType;
            __CLR4_5_2pufpuflusyjo2f.R.inc(33719);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33720)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33721)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33722);paramType = (ParameterizedType) type;
                __CLR4_5_2pufpuflusyjo2f.R.inc(33723);typeVariables = clazz.getTypeParameters();
            } }else {__CLR4_5_2pufpuflusyjo2f.R.inc(33724);if((((clazz.getGenericSuperclass() instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33725)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33726)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33727);paramType = (ParameterizedType) clazz.getGenericSuperclass();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33728);typeVariables = clazz.getSuperclass().getTypeParameters();
            } }else {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33729);paramType = parameterizedFieldType;
                __CLR4_5_2pufpuflusyjo2f.R.inc(33730);typeVariables = type.getClass().getTypeParameters();
            }

            }}__CLR4_5_2pufpuflusyjo2f.R.inc(33731);boolean changed = getArgument(arguments, typeVariables, paramType.getActualTypeArguments());
            __CLR4_5_2pufpuflusyjo2f.R.inc(33732);if ((((changed)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33733)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33734)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33735);fieldType = new ParameterizedTypeImpl(arguments, parameterizedFieldType.getOwnerType(),
                                                      parameterizedFieldType.getRawType());
                __CLR4_5_2pufpuflusyjo2f.R.inc(33736);return fieldType;
            }
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33737);return fieldType;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    private static boolean getArgument(Type[] typeArgs, TypeVariable[] typeVariables, Type[] arguments) {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33738);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33739);if ((((arguments == null || typeVariables.length == 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33740)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33741)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33742);return false;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33743);boolean changed = false;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33744);for (int i = 0; (((i < typeArgs.length)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33745)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33746)==0&false)); ++i) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33747);Type typeArg = typeArgs[i];
            __CLR4_5_2pufpuflusyjo2f.R.inc(33748);if ((((typeArg instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33749)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33750)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33751);ParameterizedType p_typeArg = (ParameterizedType) typeArg;
                __CLR4_5_2pufpuflusyjo2f.R.inc(33752);Type[] p_typeArg_args = p_typeArg.getActualTypeArguments();
                __CLR4_5_2pufpuflusyjo2f.R.inc(33753);boolean p_changed = getArgument(p_typeArg_args, typeVariables, arguments);
                __CLR4_5_2pufpuflusyjo2f.R.inc(33754);if ((((p_changed)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33755)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33756)==0&false))) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33757);typeArgs[i] = new ParameterizedTypeImpl(p_typeArg_args, p_typeArg.getOwnerType(), p_typeArg.getRawType());
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33758);changed = true;
                }
            }} }else {__CLR4_5_2pufpuflusyjo2f.R.inc(33759);if ((((typeArg instanceof TypeVariable)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33760)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33761)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33762);for (int j = 0; (((j < typeVariables.length)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33763)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33764)==0&false)); ++j) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33765);if ((((typeArg.equals(typeVariables[j]))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33766)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33767)==0&false))) {{
                        __CLR4_5_2pufpuflusyjo2f.R.inc(33768);typeArgs[i] = arguments[j];
                        __CLR4_5_2pufpuflusyjo2f.R.inc(33769);changed = true;
                    }
                }}
            }}
        }}}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33770);return changed;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    private static Type getInheritGenericType(Class<?> clazz, Type type, TypeVariable<?> tv) {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33771);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33772);GenericDeclaration gd = tv.getGenericDeclaration();

        __CLR4_5_2pufpuflusyjo2f.R.inc(33773);Class<?> class_gd = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33774);if ((((gd instanceof Class)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33775)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33776)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33777);class_gd = (Class<?>) tv.getGenericDeclaration();
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33778);Type[] arguments = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33779);if ((((class_gd == clazz)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33780)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33781)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33782);if ((((type instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33783)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33784)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33785);ParameterizedType ptype = (ParameterizedType) type;
                __CLR4_5_2pufpuflusyjo2f.R.inc(33786);arguments = ptype.getActualTypeArguments();
            }
        }} }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33787);for (Class<?> c = clazz; (((c != null && c != Object.class && c != class_gd)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33788)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33789)==0&false)); c = c.getSuperclass()) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33790);Type superType = c.getGenericSuperclass();

                __CLR4_5_2pufpuflusyjo2f.R.inc(33791);if ((((superType instanceof ParameterizedType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33792)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33793)==0&false))) {{
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33794);ParameterizedType p_superType = (ParameterizedType) superType;
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33795);Type[] p_superType_args = p_superType.getActualTypeArguments();
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33796);getArgument(p_superType_args, c.getTypeParameters(), arguments);
                    __CLR4_5_2pufpuflusyjo2f.R.inc(33797);arguments = p_superType_args;
                }
            }}
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33798);if ((((arguments == null || class_gd == null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33799)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33800)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33801);return null;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33802);Type actualType = null;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33803);TypeVariable<?>[] typeVariables = class_gd.getTypeParameters();
        __CLR4_5_2pufpuflusyjo2f.R.inc(33804);for (int j = 0; (((j < typeVariables.length)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33805)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33806)==0&false)); ++j) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33807);if ((((tv.equals(typeVariables[j]))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33808)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33809)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33810);actualType = arguments[j];
                __CLR4_5_2pufpuflusyjo2f.R.inc(33811);break;
            }
        }}

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33812);return actualType;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public String toString() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33813);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33814);return this.name;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public Member getMember() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33815);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33816);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33817)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33818)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33819);return method;
        } }else {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33820);return field;
        }
    }}finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    protected Class<?> getDeclaredClass() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33821);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33822);if ((((this.method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33823)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33824)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33825);return this.method.getDeclaringClass();
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33826);if ((((this.field != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33827)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33828)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33829);return this.field.getDeclaringClass();
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33830);return null;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public int compareTo(FieldInfo o) {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33831);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33832);if ((((this.ordinal < o.ordinal)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33833)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33834)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33835);return -1;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33836);if ((((this.ordinal > o.ordinal)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33837)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33838)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33839);return 1;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33840);int result = this.name.compareTo(o.name);
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33841);if ((((result != 0)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33842)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33843)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33844);return result;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33845);Class<?> thisDeclaringClass = this.getDeclaredClass();
        __CLR4_5_2pufpuflusyjo2f.R.inc(33846);Class<?> otherDeclaringClass = o.getDeclaredClass();
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33847);if ((((thisDeclaringClass != null && otherDeclaringClass != null && thisDeclaringClass != otherDeclaringClass)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33848)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33849)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33850);if ((((thisDeclaringClass.isAssignableFrom(otherDeclaringClass))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33851)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33852)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33853);return -1;
            }
            
            }__CLR4_5_2pufpuflusyjo2f.R.inc(33854);if ((((otherDeclaringClass.isAssignableFrom(thisDeclaringClass))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33855)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33856)==0&false))) {{
                __CLR4_5_2pufpuflusyjo2f.R.inc(33857);return 1;
            }
        }}
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33858);boolean isSampeType = this.field != null && this.field.getType() == this.fieldClass;
        __CLR4_5_2pufpuflusyjo2f.R.inc(33859);boolean oSameType = o.field != null && o.field.getType() == o.fieldClass;
        
        __CLR4_5_2pufpuflusyjo2f.R.inc(33860);if ((((isSampeType && !oSameType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33861)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33862)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33863);return 1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33864);if ((((oSameType && !isSampeType)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33865)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33866)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33867);return -1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33868);if ((((o.fieldClass.isPrimitive() && !this.fieldClass.isPrimitive())&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33869)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33870)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33871);return 1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33872);if ((((this.fieldClass.isPrimitive() && !o.fieldClass.isPrimitive())&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33873)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33874)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33875);return -1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33876);if ((((o.fieldClass.getName().startsWith("java.") && !this.fieldClass.getName().startsWith("java."))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33877)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33878)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33879);return 1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33880);if ((((this.fieldClass.getName().startsWith("java.") && !o.fieldClass.getName().startsWith("java."))&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33881)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33882)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33883);return -1;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33884);return this.fieldClass.getName().compareTo(o.fieldClass.getName());
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}
    
    public JSONField getAnnotation() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33885);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33886);if ((((this.fieldAnnotation != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33887)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33888)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33889);return this.fieldAnnotation;
        }
        
        }__CLR4_5_2pufpuflusyjo2f.R.inc(33890);return this.methodAnnotation;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public String getFormat() {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33891);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33892);return format;
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public Object get(Object javaObject) throws IllegalAccessException, InvocationTargetException {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33893);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33894);return (((method != null
                )&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33895)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33896)==0&false))? method.invoke(javaObject)
                : field.get(javaObject);
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public void set(Object javaObject, Object value) throws IllegalAccessException, InvocationTargetException {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33897);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33898);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33899)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33900)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33901);method.invoke(javaObject, new Object[] { value });
            __CLR4_5_2pufpuflusyjo2f.R.inc(33902);return;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33903);field.set(javaObject, value);
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}

    public void setAccessible() throws SecurityException {try{__CLR4_5_2pufpuflusyjo2f.R.inc(33904);
        __CLR4_5_2pufpuflusyjo2f.R.inc(33905);if ((((method != null)&&(__CLR4_5_2pufpuflusyjo2f.R.iget(33906)!=0|true))||(__CLR4_5_2pufpuflusyjo2f.R.iget(33907)==0&false))) {{
            __CLR4_5_2pufpuflusyjo2f.R.inc(33908);TypeUtils.setAccessible(method);
            __CLR4_5_2pufpuflusyjo2f.R.inc(33909);return;
        }

        }__CLR4_5_2pufpuflusyjo2f.R.inc(33910);TypeUtils.setAccessible(field);
    }finally{__CLR4_5_2pufpuflusyjo2f.R.flushNeeded();}}
}
