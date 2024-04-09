/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.util;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.asm.ClassReader;
import com.alibaba.fastjson.asm.TypeCollector;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class ASMUtils {public static class __CLR4_5_2p72p72lusvmww6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,32811,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public static final String JAVA_VM_NAME = System.getProperty("java.vm.name");
    
    public static final boolean IS_ANDROID = isAndroid(JAVA_VM_NAME);
	
    public static boolean isAndroid(String vmName) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32654);
        __CLR4_5_2p72p72lusvmww6.R.inc(32655);if ((((vmName == null)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32656)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32657)==0&false))) {{ // default is false
            __CLR4_5_2p72p72lusvmww6.R.inc(32658);return false;
        }
        
        }__CLR4_5_2p72p72lusvmww6.R.inc(32659);String lowerVMName = vmName.toLowerCase();
        
        __CLR4_5_2p72p72lusvmww6.R.inc(32660);return lowerVMName.contains("dalvik") //
               || lowerVMName.contains("lemur") // aliyun-vm name
        ;
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}

    public static String desc(Method method) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32661);   
    	__CLR4_5_2p72p72lusvmww6.R.inc(32662);Class<?>[] types = method.getParameterTypes();
        __CLR4_5_2p72p72lusvmww6.R.inc(32663);StringBuilder buf = new StringBuilder((types.length + 1) << 4);
        __CLR4_5_2p72p72lusvmww6.R.inc(32664);buf.append('(');
        __CLR4_5_2p72p72lusvmww6.R.inc(32665);for (int i = 0; (((i < types.length)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32666)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32667)==0&false)); ++i) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32668);buf.append(desc(types[i]));
        }
        }__CLR4_5_2p72p72lusvmww6.R.inc(32669);buf.append(')');
        __CLR4_5_2p72p72lusvmww6.R.inc(32670);buf.append(desc(method.getReturnType()));
        __CLR4_5_2p72p72lusvmww6.R.inc(32671);return buf.toString();
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}

    public static String desc(Class<?> returnType) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32672);
        __CLR4_5_2p72p72lusvmww6.R.inc(32673);if ((((returnType.isPrimitive())&&(__CLR4_5_2p72p72lusvmww6.R.iget(32674)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32675)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32676);return getPrimitiveLetter(returnType);
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32677);if ((((returnType.isArray())&&(__CLR4_5_2p72p72lusvmww6.R.iget(32678)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32679)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32680);return "[" + desc(returnType.getComponentType());
        } }else {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32681);return "L" + type(returnType) + ";";
        }
    }}}finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}

    public static String type(Class<?> parameterType) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32682);
        __CLR4_5_2p72p72lusvmww6.R.inc(32683);if ((((parameterType.isArray())&&(__CLR4_5_2p72p72lusvmww6.R.iget(32684)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32685)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32686);return "[" + desc(parameterType.getComponentType());
        } }else {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32687);if ((((!parameterType.isPrimitive())&&(__CLR4_5_2p72p72lusvmww6.R.iget(32688)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32689)==0&false))) {{
                __CLR4_5_2p72p72lusvmww6.R.inc(32690);String clsName = parameterType.getName();
                __CLR4_5_2p72p72lusvmww6.R.inc(32691);return clsName.replace('.', '/'); // \u76f4\u63a5\u57fa\u4e8e\u5b57\u7b26\u4e32\u66ff\u6362\uff0c\u4e0d\u4f7f\u7528\u6b63\u5219\u66ff\u6362
            } }else {{
                __CLR4_5_2p72p72lusvmww6.R.inc(32692);return getPrimitiveLetter(parameterType);
            }
        }}
    }}finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}
    

    public static String getPrimitiveLetter(Class<?> type) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32693);
        __CLR4_5_2p72p72lusvmww6.R.inc(32694);if ((((Integer.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32695)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32696)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32697);return "I";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32698);if ((((Void.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32699)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32700)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32701);return "V";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32702);if ((((Boolean.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32703)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32704)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32705);return "Z";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32706);if ((((Character.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32707)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32708)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32709);return "C";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32710);if ((((Byte.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32711)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32712)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32713);return "B";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32714);if ((((Short.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32715)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32716)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32717);return "S";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32718);if ((((Float.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32719)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32720)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32721);return "F";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32722);if ((((Long.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32723)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32724)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32725);return "J";
        } }else {__CLR4_5_2p72p72lusvmww6.R.inc(32726);if ((((Double.TYPE == type)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32727)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32728)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32729);return "D";
        }

        }}}}}}}}}__CLR4_5_2p72p72lusvmww6.R.inc(32730);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}

    public static Type getMethodType(Class<?> clazz, String methodName) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32731);
        __CLR4_5_2p72p72lusvmww6.R.inc(32732);try {
            __CLR4_5_2p72p72lusvmww6.R.inc(32733);Method method = clazz.getMethod(methodName);

            __CLR4_5_2p72p72lusvmww6.R.inc(32734);return method.getGenericReturnType();
        } catch (Exception ex) {
            __CLR4_5_2p72p72lusvmww6.R.inc(32735);return null;
        }
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}

    public static boolean checkName(String name) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32736);
        __CLR4_5_2p72p72lusvmww6.R.inc(32737);for (int i = 0; (((i < name.length())&&(__CLR4_5_2p72p72lusvmww6.R.iget(32738)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32739)==0&false)); ++i) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32740);char c = name.charAt(i);
            __CLR4_5_2p72p72lusvmww6.R.inc(32741);if ((((c < '\001' || c > '\177' || c == '.')&&(__CLR4_5_2p72p72lusvmww6.R.iget(32742)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32743)==0&false))) {{
                __CLR4_5_2p72p72lusvmww6.R.inc(32744);return false;
            }
        }}
        
        }__CLR4_5_2p72p72lusvmww6.R.inc(32745);return true;
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}


    public static String[] lookupParameterNames(AccessibleObject methodOrCtor) {try{__CLR4_5_2p72p72lusvmww6.R.inc(32746);
        __CLR4_5_2p72p72lusvmww6.R.inc(32747);if ((((IS_ANDROID)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32748)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32749)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32750);return new String[0];
        }

        }__CLR4_5_2p72p72lusvmww6.R.inc(32751);final Class<?>[] types;
        __CLR4_5_2p72p72lusvmww6.R.inc(32752);final Class<?> declaringClass;
        __CLR4_5_2p72p72lusvmww6.R.inc(32753);final String name;

        __CLR4_5_2p72p72lusvmww6.R.inc(32754);Annotation[][] parameterAnnotations;
        __CLR4_5_2p72p72lusvmww6.R.inc(32755);if ((((methodOrCtor instanceof Method)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32756)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32757)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32758);Method method = (Method) methodOrCtor;
            __CLR4_5_2p72p72lusvmww6.R.inc(32759);types = method.getParameterTypes();
            __CLR4_5_2p72p72lusvmww6.R.inc(32760);name = method.getName();
            __CLR4_5_2p72p72lusvmww6.R.inc(32761);declaringClass = method.getDeclaringClass();
            __CLR4_5_2p72p72lusvmww6.R.inc(32762);parameterAnnotations = TypeUtils.getParameterAnnotations(method);
        } }else {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32763);Constructor<?> constructor = (Constructor<?>) methodOrCtor;
            __CLR4_5_2p72p72lusvmww6.R.inc(32764);types = constructor.getParameterTypes();
            __CLR4_5_2p72p72lusvmww6.R.inc(32765);declaringClass = constructor.getDeclaringClass();
            __CLR4_5_2p72p72lusvmww6.R.inc(32766);name = "<init>";
            __CLR4_5_2p72p72lusvmww6.R.inc(32767);parameterAnnotations = TypeUtils.getParameterAnnotations(constructor);
        }

        }__CLR4_5_2p72p72lusvmww6.R.inc(32768);if ((((types.length == 0)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32769)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32770)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32771);return new String[0];
        }

        }__CLR4_5_2p72p72lusvmww6.R.inc(32772);ClassLoader classLoader = declaringClass.getClassLoader();
        __CLR4_5_2p72p72lusvmww6.R.inc(32773);if ((((classLoader == null)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32774)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32775)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32776);classLoader = ClassLoader.getSystemClassLoader();
        }

        }__CLR4_5_2p72p72lusvmww6.R.inc(32777);String className = declaringClass.getName();
        __CLR4_5_2p72p72lusvmww6.R.inc(32778);String resourceName = className.replace('.', '/') + ".class";
        __CLR4_5_2p72p72lusvmww6.R.inc(32779);InputStream is = classLoader.getResourceAsStream(resourceName);

        __CLR4_5_2p72p72lusvmww6.R.inc(32780);if ((((is == null)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32781)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32782)==0&false))) {{
            __CLR4_5_2p72p72lusvmww6.R.inc(32783);return new String[0];
        }

        }__CLR4_5_2p72p72lusvmww6.R.inc(32784);try {
            __CLR4_5_2p72p72lusvmww6.R.inc(32785);ClassReader reader = new ClassReader(is, false);
            __CLR4_5_2p72p72lusvmww6.R.inc(32786);TypeCollector visitor = new TypeCollector(name, types);
            __CLR4_5_2p72p72lusvmww6.R.inc(32787);reader.accept(visitor);
            __CLR4_5_2p72p72lusvmww6.R.inc(32788);String[] parameterNames = visitor.getParameterNamesForMethod();

            __CLR4_5_2p72p72lusvmww6.R.inc(32789);for (int i = 0; (((i < parameterNames.length)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32790)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32791)==0&false)); i++) {{
                __CLR4_5_2p72p72lusvmww6.R.inc(32792);Annotation[] annotations = parameterAnnotations[i];
                __CLR4_5_2p72p72lusvmww6.R.inc(32793);if ((((annotations != null)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32794)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32795)==0&false))) {{
                    __CLR4_5_2p72p72lusvmww6.R.inc(32796);for (int j = 0; (((j < annotations.length)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32797)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32798)==0&false)); j++) {{
                        __CLR4_5_2p72p72lusvmww6.R.inc(32799);if ((((annotations[j] instanceof JSONField)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32800)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32801)==0&false))) {{
                            __CLR4_5_2p72p72lusvmww6.R.inc(32802);JSONField jsonField = (JSONField) annotations[j];
                            __CLR4_5_2p72p72lusvmww6.R.inc(32803);String fieldName = jsonField.name();
                            __CLR4_5_2p72p72lusvmww6.R.inc(32804);if ((((fieldName != null && fieldName.length() > 0)&&(__CLR4_5_2p72p72lusvmww6.R.iget(32805)!=0|true))||(__CLR4_5_2p72p72lusvmww6.R.iget(32806)==0&false))) {{
                                __CLR4_5_2p72p72lusvmww6.R.inc(32807);parameterNames[i] = fieldName;
                            }
                        }}
                    }}
                }}
            }}

            }__CLR4_5_2p72p72lusvmww6.R.inc(32808);return parameterNames;
        } catch (IOException e) {
            __CLR4_5_2p72p72lusvmww6.R.inc(32809);return new String[0];
        } finally {
            __CLR4_5_2p72p72lusvmww6.R.inc(32810);IOUtils.close(is);
        }
    }finally{__CLR4_5_2p72p72lusvmww6.R.flushNeeded();}}
}
