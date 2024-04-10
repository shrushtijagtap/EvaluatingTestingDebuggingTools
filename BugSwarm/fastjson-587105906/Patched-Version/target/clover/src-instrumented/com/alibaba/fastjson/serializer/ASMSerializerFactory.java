/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.serializer;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.asm.*;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.ASMUtils;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.TypeUtils;

import java.io.Serializable;
import java.lang.reflect.*;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static com.alibaba.fastjson.util.ASMUtils.desc;
import static com.alibaba.fastjson.util.ASMUtils.type;

public class ASMSerializerFactory implements Opcodes {public static class __CLR4_5_2hfehfelusyjmgr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,24283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected final ASMClassLoader classLoader             = new ASMClassLoader();

    private final AtomicLong       seed                    = new AtomicLong();

    static final String            JSONSerializer           = type(JSONSerializer.class);
    static final String            ObjectSerializer         = type(ObjectSerializer.class);
    static final String            ObjectSerializer_desc    = "L" + ObjectSerializer + ";";
    static final String            SerializeWriter          = type(SerializeWriter.class);
    static final String            SerializeWriter_desc     = "L" + SerializeWriter + ";";
    static final String            JavaBeanSerializer       = type(JavaBeanSerializer.class);
    static final String            JavaBeanSerializer_desc  = "L" + type(JavaBeanSerializer.class) + ";";
    static final String            SerialContext_desc       = desc(SerialContext.class);
    static final String            SerializeFilterable_desc = desc(SerializeFilterable.class);

    static class Context {

        static final int              serializer     = 1;
        static final int              obj            = 2;
        static final int              paramFieldName = 3;
        static final int              paramFieldType = 4;
        static final int              features       = 5;
        static int                    fieldName      = 6;
        static int                    original       = 7;
        static int                    processValue   = 8;

        private final FieldInfo[]       getters;
        private final String            className;
        private final SerializeBeanInfo beanInfo;
        private final boolean           writeDirect;

        private Map<String, Integer>    variants       = new HashMap<String, Integer>();
        private int                     variantIndex   = 9;
        private final boolean           nonContext;

        public Context(FieldInfo[] getters, //
                       SerializeBeanInfo beanInfo, //
                       String className, //
                       boolean writeDirect, //
                       boolean nonContext){try{__CLR4_5_2hfehfelusyjmgr.R.inc(22586);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22587);this.getters = getters;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22588);this.className = className;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22589);this.beanInfo = beanInfo;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22590);this.writeDirect = writeDirect;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22591);this.nonContext = nonContext || beanInfo.beanType.isEnum();
        }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

        public int var(String name) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(22592);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22593);Integer i = variants.get(name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22594);if ((((i == null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22595)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22596)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22597);variants.put(name, variantIndex++);
            }
            }__CLR4_5_2hfehfelusyjmgr.R.inc(22598);i = variants.get(name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22599);return i.intValue();
        }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

        public int var(String name, int increment) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(22600);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22601);Integer i = variants.get(name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22602);if ((((i == null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22603)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22604)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22605);variants.put(name, variantIndex);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22606);variantIndex += increment;
            }
            }__CLR4_5_2hfehfelusyjmgr.R.inc(22607);i = variants.get(name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22608);return i.intValue();
        }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
        
        public int getFieldOrinal(String name) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(22609);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22610);int fieldIndex = -1;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22611);for (int i = 0, size = getters.length; (((i < size)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22612)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22613)==0&false)); ++i) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22614);FieldInfo item = getters[i];
                __CLR4_5_2hfehfelusyjmgr.R.inc(22615);if ((((item.name.equals(name))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22616)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22617)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22618);fieldIndex = i;
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22619);break;
                }
            }}
            }__CLR4_5_2hfehfelusyjmgr.R.inc(22620);return fieldIndex;
        }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
    }

    public JavaBeanSerializer createJavaBeanSerializer(SerializeBeanInfo beanInfo) throws Exception {try{__CLR4_5_2hfehfelusyjmgr.R.inc(22621);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22622);Class<?> clazz = beanInfo.beanType;
        __CLR4_5_2hfehfelusyjmgr.R.inc(22623);if ((((clazz.isPrimitive())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22624)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22625)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22626);throw new JSONException("unsupportd class " + clazz.getName());
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22627);JSONType jsonType = TypeUtils.getAnnotation(clazz, JSONType.class);

        __CLR4_5_2hfehfelusyjmgr.R.inc(22628);FieldInfo[] unsortedGetters = beanInfo.fields;

        __CLR4_5_2hfehfelusyjmgr.R.inc(22629);for (FieldInfo fieldInfo : unsortedGetters) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22630);if ((((fieldInfo.field == null //
                && fieldInfo.method != null //
                && fieldInfo.method.getDeclaringClass().isInterface())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22631)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22632)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22633);return new JavaBeanSerializer(beanInfo);
            }
        }}

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22634);FieldInfo[] getters = beanInfo.sortedFields;

        __CLR4_5_2hfehfelusyjmgr.R.inc(22635);boolean nativeSorted = beanInfo.sortedFields == beanInfo.fields;

        __CLR4_5_2hfehfelusyjmgr.R.inc(22636);if ((((getters.length > 256)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22637)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22638)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22639);return new JavaBeanSerializer(beanInfo);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22640);for (FieldInfo getter : getters) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22641);if ((((!ASMUtils.checkName(getter.getMember().getName()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22642)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22643)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22644);return new JavaBeanSerializer(beanInfo);
            }
        }}

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22645);String className = "ASMSerializer_" + seed.incrementAndGet() + "_" + clazz.getSimpleName();
        __CLR4_5_2hfehfelusyjmgr.R.inc(22646);String classNameType;
        __CLR4_5_2hfehfelusyjmgr.R.inc(22647);String classNameFull;
        __CLR4_5_2hfehfelusyjmgr.R.inc(22648);Package pkg = ASMSerializerFactory.class.getPackage();
        __CLR4_5_2hfehfelusyjmgr.R.inc(22649);if ((((pkg != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22650)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22651)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22652);String packageName = pkg.getName();
            __CLR4_5_2hfehfelusyjmgr.R.inc(22653);classNameType = packageName.replace('.', '/') + "/" + className;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22654);classNameFull = packageName + "." + className;
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22655);classNameType = className;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22656);classNameFull = className;
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22657);String packageName = ASMSerializerFactory.class.getPackage().getName();


        __CLR4_5_2hfehfelusyjmgr.R.inc(22658);ClassWriter cw = new ClassWriter();
        __CLR4_5_2hfehfelusyjmgr.R.inc(22659);cw.visit(V1_5 //
                 , ACC_PUBLIC + ACC_SUPER //
                 , classNameType //
                 , JavaBeanSerializer //
                 , new String[] { ObjectSerializer } //
        );

        __CLR4_5_2hfehfelusyjmgr.R.inc(22660);for (FieldInfo fieldInfo : getters) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22661);if ((((fieldInfo.fieldClass.isPrimitive() //
                //|| fieldInfo.fieldClass.isEnum() //
                || fieldInfo.fieldClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22662)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22663)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22664);continue;
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(22665);new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;") //
                                                                                                           .visitEnd();

            __CLR4_5_2hfehfelusyjmgr.R.inc(22666);if ((((List.class.isAssignableFrom(fieldInfo.fieldClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22667)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22668)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22669);new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_list_item_ser_",
                                ObjectSerializer_desc) //
                                                       .visitEnd();
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(22670);new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_ser_", ObjectSerializer_desc) //
                                                                                                        .visitEnd();
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22671);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>", "(" + desc(SerializeBeanInfo.class) + ")V", null, null);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22672);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22673);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22674);mw.visitMethodInsn(INVOKESPECIAL, JavaBeanSerializer, "<init>", "(" + desc(SerializeBeanInfo.class) + ")V");

        // init _asm_fieldType
        __CLR4_5_2hfehfelusyjmgr.R.inc(22675);for (int i = 0; (((i < getters.length)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22676)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22677)==0&false)); ++i) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22678);FieldInfo fieldInfo = getters[i];
            __CLR4_5_2hfehfelusyjmgr.R.inc(22679);if ((((fieldInfo.fieldClass.isPrimitive() //
//                || fieldInfo.fieldClass.isEnum() //
                || fieldInfo.fieldClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22680)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22681)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22682);continue;
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(22683);mw.visitVarInsn(ALOAD, 0);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22684);if ((((fieldInfo.method != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22685)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22686)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22687);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldInfo.declaringClass)));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22688);mw.visitLdcInsn(fieldInfo.method.getName());
                __CLR4_5_2hfehfelusyjmgr.R.inc(22689);mw.visitMethodInsn(INVOKESTATIC, type(ASMUtils.class), "getMethodType",
                                   "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Type;");

            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22690);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22691);mw.visitLdcInsn(i);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22692);mw.visitMethodInsn(INVOKESPECIAL, JavaBeanSerializer, "getFieldType", "(I)Ljava/lang/reflect/Type;");
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(22693);mw.visitFieldInsn(PUTFIELD, classNameType, fieldInfo.name + "_asm_fieldType", "Ljava/lang/reflect/Type;");
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22694);mw.visitInsn(RETURN);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22695);mw.visitMaxs(4, 4);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22696);mw.visitEnd();

        __CLR4_5_2hfehfelusyjmgr.R.inc(22697);boolean DisableCircularReferenceDetect = false;
        __CLR4_5_2hfehfelusyjmgr.R.inc(22698);if ((((jsonType != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22699)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22700)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22701);for (SerializerFeature featrues : jsonType.serialzeFeatures()) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22702);if ((((featrues == SerializerFeature.DisableCircularReferenceDetect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22703)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22704)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22705);DisableCircularReferenceDetect = true;
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22706);break;
                }
            }}
        }}

        // 0 write
        // 1 writeNormal
        // 2 writeNonContext
        }__CLR4_5_2hfehfelusyjmgr.R.inc(22707);for (int i = 0; (((i < 3)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22708)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22709)==0&false)); ++i) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22710);String methodName;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22711);boolean nonContext = DisableCircularReferenceDetect;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22712);boolean writeDirect = false;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22713);if ((((i == 0)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22714)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22715)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22716);methodName = "write";
                __CLR4_5_2hfehfelusyjmgr.R.inc(22717);writeDirect = true;
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22718);if ((((i == 1)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22719)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22720)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22721);methodName = "writeNormal";
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22722);writeDirect = true;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22723);nonContext = true;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22724);methodName = "writeDirectNonContext";
            }

            }}__CLR4_5_2hfehfelusyjmgr.R.inc(22725);Context context = new Context(getters, beanInfo, classNameType, writeDirect,
                                          nonContext);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22726);mw = new MethodWriter(cw, //
                                  ACC_PUBLIC, //
                                  methodName, //
                                  "(L" + JSONSerializer
                                              + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V", //
                                  null, //
                                  new String[] { "java/io/IOException" } //
            );

            {
                __CLR4_5_2hfehfelusyjmgr.R.inc(22727);Label endIf_ = new Label();
                __CLR4_5_2hfehfelusyjmgr.R.inc(22728);mw.visitVarInsn(ALOAD, Context.obj);
                //serializer.writeNull();
                __CLR4_5_2hfehfelusyjmgr.R.inc(22729);mw.visitJumpInsn(IFNONNULL, endIf_);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22730);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22731);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer,
                        "writeNull", "()V");

                __CLR4_5_2hfehfelusyjmgr.R.inc(22732);mw.visitInsn(RETURN);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22733);mw.visitLabel(endIf_);
            }

            __CLR4_5_2hfehfelusyjmgr.R.inc(22734);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22735);mw.visitFieldInsn(GETFIELD, JSONSerializer, "out", SerializeWriter_desc);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22736);mw.visitVarInsn(ASTORE, context.var("out"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(22737);if (((((!nativeSorted) //
                && !context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22738)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22739)==0&false))) {{

                __CLR4_5_2hfehfelusyjmgr.R.inc(22740);if ((((jsonType == null || jsonType.alphabetic())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22741)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22742)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22743);Label _else = new Label();

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22744);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22745);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isSortField", "()Z");

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22746);mw.visitJumpInsn(IFNE, _else);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22747);mw.visitVarInsn(ALOAD, 0);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22748);mw.visitVarInsn(ALOAD, 1);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22749);mw.visitVarInsn(ALOAD, 2);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22750);mw.visitVarInsn(ALOAD, 3);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22751);mw.visitVarInsn(ALOAD, 4);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22752);mw.visitVarInsn(ILOAD, 5);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22753);mw.visitMethodInsn(INVOKEVIRTUAL, classNameType,
                                       "writeUnsorted", "(L" + JSONSerializer
                                                        + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22754);mw.visitInsn(RETURN);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22755);mw.visitLabel(_else);
                }
            }}

            // isWriteDoubleQuoteDirect
            }__CLR4_5_2hfehfelusyjmgr.R.inc(22756);if ((((context.writeDirect && !nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22757)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22758)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22759);Label _direct = new Label();
                __CLR4_5_2hfehfelusyjmgr.R.inc(22760);Label _directElse = new Label();

                __CLR4_5_2hfehfelusyjmgr.R.inc(22761);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22762);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22763);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeDirect", "(L" + JSONSerializer + ";)Z");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22764);mw.visitJumpInsn(IFNE, _directElse);

                __CLR4_5_2hfehfelusyjmgr.R.inc(22765);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22766);mw.visitVarInsn(ALOAD, 1);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22767);mw.visitVarInsn(ALOAD, 2);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22768);mw.visitVarInsn(ALOAD, 3);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22769);mw.visitVarInsn(ALOAD, 4);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22770);mw.visitVarInsn(ILOAD, 5);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22771);mw.visitMethodInsn(INVOKEVIRTUAL, classNameType,
                                   "writeNormal", "(L" + JSONSerializer
                                                  + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22772);mw.visitInsn(RETURN);

                __CLR4_5_2hfehfelusyjmgr.R.inc(22773);mw.visitLabel(_directElse);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22774);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22775);mw.visitLdcInsn(SerializerFeature.DisableCircularReferenceDetect.mask);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22776);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22777);mw.visitJumpInsn(IFEQ, _direct);

                __CLR4_5_2hfehfelusyjmgr.R.inc(22778);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22779);mw.visitVarInsn(ALOAD, 1);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22780);mw.visitVarInsn(ALOAD, 2);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22781);mw.visitVarInsn(ALOAD, 3);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22782);mw.visitVarInsn(ALOAD, 4);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22783);mw.visitVarInsn(ILOAD, 5);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22784);mw.visitMethodInsn(INVOKEVIRTUAL, classNameType, "writeDirectNonContext",
                                   "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22785);mw.visitInsn(RETURN);

                __CLR4_5_2hfehfelusyjmgr.R.inc(22786);mw.visitLabel(_direct);
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(22787);mw.visitVarInsn(ALOAD, Context.obj); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(22788);mw.visitTypeInsn(CHECKCAST, type(clazz)); // serializer
            __CLR4_5_2hfehfelusyjmgr.R.inc(22789);mw.visitVarInsn(ASTORE, context.var("entity")); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(22790);generateWriteMethod(clazz, mw, getters, context);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22791);mw.visitInsn(RETURN);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22792);mw.visitMaxs(7, context.variantIndex + 2);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22793);mw.visitEnd();
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22794);if ((((!nativeSorted)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22795)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22796)==0&false))) {{
            // sortField support
            __CLR4_5_2hfehfelusyjmgr.R.inc(22797);Context context = new Context(getters, beanInfo, classNameType, false,
                                          DisableCircularReferenceDetect);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22798);mw = new MethodWriter(cw, ACC_PUBLIC, "writeUnsorted",
                                  "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V",
                                  null, new String[] { "java/io/IOException" });

            __CLR4_5_2hfehfelusyjmgr.R.inc(22799);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22800);mw.visitFieldInsn(GETFIELD, JSONSerializer, "out", SerializeWriter_desc);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22801);mw.visitVarInsn(ASTORE, context.var("out"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(22802);mw.visitVarInsn(ALOAD, Context.obj); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(22803);mw.visitTypeInsn(CHECKCAST, type(clazz)); // serializer
            __CLR4_5_2hfehfelusyjmgr.R.inc(22804);mw.visitVarInsn(ASTORE, context.var("entity")); // obj

            __CLR4_5_2hfehfelusyjmgr.R.inc(22805);generateWriteMethod(clazz, mw, unsortedGetters, context);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22806);mw.visitInsn(RETURN);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22807);mw.visitMaxs(7, context.variantIndex + 2);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22808);mw.visitEnd();
        }

        // 0 writeAsArray
        // 1 writeAsArrayNormal
        // 2 writeAsArrayNonContext
        }__CLR4_5_2hfehfelusyjmgr.R.inc(22809);for (int i = 0; (((i < 3)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22810)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22811)==0&false)); ++i) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22812);String methodName;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22813);boolean nonContext = DisableCircularReferenceDetect;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22814);boolean writeDirect = false;
            __CLR4_5_2hfehfelusyjmgr.R.inc(22815);if ((((i == 0)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22816)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22817)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22818);methodName = "writeAsArray";
                __CLR4_5_2hfehfelusyjmgr.R.inc(22819);writeDirect = true;
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22820);if ((((i == 1)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22821)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22822)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22823);methodName = "writeAsArrayNormal";
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22824);writeDirect = true;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22825);nonContext = true;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22826);methodName = "writeAsArrayNonContext";
            }

            }}__CLR4_5_2hfehfelusyjmgr.R.inc(22827);Context context = new Context(getters, beanInfo, classNameType, writeDirect,
                                          nonContext);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22828);mw = new MethodWriter(cw, ACC_PUBLIC, methodName,
                                  "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V",
                                  null, new String[] { "java/io/IOException" });

            __CLR4_5_2hfehfelusyjmgr.R.inc(22829);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22830);mw.visitFieldInsn(GETFIELD, JSONSerializer, "out", SerializeWriter_desc);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22831);mw.visitVarInsn(ASTORE, context.var("out"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(22832);mw.visitVarInsn(ALOAD, Context.obj); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(22833);mw.visitTypeInsn(CHECKCAST, type(clazz)); // serializer
            __CLR4_5_2hfehfelusyjmgr.R.inc(22834);mw.visitVarInsn(ASTORE, context.var("entity")); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(22835);generateWriteAsArray(clazz, mw, getters, context);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22836);mw.visitInsn(RETURN);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22837);mw.visitMaxs(7, context.variantIndex + 2);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22838);mw.visitEnd();
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22839);byte[] code = cw.toByteArray();

        __CLR4_5_2hfehfelusyjmgr.R.inc(22840);Class<?> serializerClass = classLoader.defineClassPublic(classNameFull, code, 0, code.length);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22841);Constructor<?> constructor = serializerClass.getConstructor(SerializeBeanInfo.class);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22842);Object instance = constructor.newInstance(beanInfo);

        __CLR4_5_2hfehfelusyjmgr.R.inc(22843);return (JavaBeanSerializer) instance;
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void generateWriteAsArray(Class<?> clazz, MethodVisitor mw, FieldInfo[] getters,
                                      Context context) throws Exception {try{__CLR4_5_2hfehfelusyjmgr.R.inc(22844);

        __CLR4_5_2hfehfelusyjmgr.R.inc(22845);Label nonPropertyFilters_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(22846);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22847);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22848);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "hasPropertyFilters", "(" + SerializeFilterable_desc + ")Z");
        __CLR4_5_2hfehfelusyjmgr.R.inc(22849);mw.visitJumpInsn(IFNE, nonPropertyFilters_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22850);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22851);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22852);mw.visitVarInsn(ALOAD, 2);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22853);mw.visitVarInsn(ALOAD, 3);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22854);mw.visitVarInsn(ALOAD, 4);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22855);mw.visitVarInsn(ILOAD, 5);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22856);mw.visitMethodInsn(INVOKESPECIAL, JavaBeanSerializer,
                "writeNoneASM", "(L" + JSONSerializer
                        + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        __CLR4_5_2hfehfelusyjmgr.R.inc(22857);mw.visitInsn(RETURN);

        __CLR4_5_2hfehfelusyjmgr.R.inc(22858);mw.visitLabel(nonPropertyFilters_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(22859);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(22860);mw.visitVarInsn(BIPUSH, '[');
        __CLR4_5_2hfehfelusyjmgr.R.inc(22861);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(22862);int size = getters.length;

        __CLR4_5_2hfehfelusyjmgr.R.inc(22863);if ((((size == 0)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22864)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22865)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22866);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(22867);mw.visitVarInsn(BIPUSH, ']');
            __CLR4_5_2hfehfelusyjmgr.R.inc(22868);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(22869);return;
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(22870);for (int i = 0; (((i < size)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22871)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22872)==0&false)); ++i) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(22873);final char seperator = ((((i == size - 1) )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22874)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22875)==0&false))? ']' : ',';

            __CLR4_5_2hfehfelusyjmgr.R.inc(22876);FieldInfo fieldInfo = getters[i];
            __CLR4_5_2hfehfelusyjmgr.R.inc(22877);Class<?> fieldClass = fieldInfo.fieldClass;

            __CLR4_5_2hfehfelusyjmgr.R.inc(22878);mw.visitLdcInsn(fieldInfo.name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(22879);mw.visitVarInsn(ASTORE, Context.fieldName);

            __CLR4_5_2hfehfelusyjmgr.R.inc(22880);if ((((fieldClass == byte.class //
                || fieldClass == short.class //
                || fieldClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22881)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22882)==0&false))) {{

                __CLR4_5_2hfehfelusyjmgr.R.inc(22883);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22884);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22885);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22886);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeInt", "(I)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22887);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22888);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22889);if ((((fieldClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22890)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22891)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22892);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22893);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22894);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22895);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeLong", "(J)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22896);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22897);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22898);if ((((fieldClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22899)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22900)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22901);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22902);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22903);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22904);mw.visitInsn(ICONST_1);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22905);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFloat", "(FZ)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22906);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22907);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22908);if ((((fieldClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22909)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22910)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22911);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22912);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22913);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22914);mw.visitInsn(ICONST_1);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22915);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeDouble", "(DZ)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22916);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22917);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22918);if ((((fieldClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22919)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22920)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22921);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22922);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22923);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22924);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(Z)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22925);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22926);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22927);if ((((fieldClass == char.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22928)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22929)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22930);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22931);_get(mw, context, fieldInfo); // Character.toString(value)
                __CLR4_5_2hfehfelusyjmgr.R.inc(22932);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "toString", "(C)Ljava/lang/String;");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22933);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22934);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");

            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22935);if ((((fieldClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22936)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22937)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22938);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22939);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22940);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22941);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeString", "(Ljava/lang/String;C)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22942);if ((((fieldClass.isEnum())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22943)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22944)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22945);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(22946);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22947);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22948);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeEnum", "(Ljava/lang/Enum;)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(22949);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22950);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(22951);if ((((List.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22952)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22953)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(22954);Type fieldType = fieldInfo.fieldType;

                __CLR4_5_2hfehfelusyjmgr.R.inc(22955);Type elementType;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22956);if ((((fieldType instanceof Class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22957)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22958)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22959);elementType = Object.class;
                } }else {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22960);elementType = ((ParameterizedType) fieldType).getActualTypeArguments()[0];
                }

                }__CLR4_5_2hfehfelusyjmgr.R.inc(22961);Class<?> elementClass = null;
                __CLR4_5_2hfehfelusyjmgr.R.inc(22962);if ((((elementType instanceof Class<?>)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22963)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22964)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22965);elementClass = (Class<?>) elementType;

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22966);if ((((elementClass == Object.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22967)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22968)==0&false))) {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(22969);elementClass = null;
                    }
                }}
                
                }__CLR4_5_2hfehfelusyjmgr.R.inc(22970);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(22971);mw.visitTypeInsn(CHECKCAST, "java/util/List"); // cast
                __CLR4_5_2hfehfelusyjmgr.R.inc(22972);mw.visitVarInsn(ASTORE, context.var("list"));

                __CLR4_5_2hfehfelusyjmgr.R.inc(22973);if ((((elementClass == String.class //
                    && context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(22974)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(22975)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22976);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22977);mw.visitVarInsn(ALOAD, context.var("list"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22978);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(Ljava/util/List;)V");
                } }else {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22979);Label nullEnd_ = new Label(), nullElse_ = new Label();

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22980);mw.visitVarInsn(ALOAD, context.var("list"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22981);mw.visitJumpInsn(IFNONNULL, nullElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22982);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22983);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeNull", "()V");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22984);mw.visitJumpInsn(GOTO, nullEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22985);mw.visitLabel(nullElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22986);mw.visitVarInsn(ALOAD, context.var("list"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22987);mw.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22988);mw.visitVarInsn(ISTORE, context.var("size"));

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22989);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22990);mw.visitVarInsn(BIPUSH, '[');
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22991);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22992);Label for_ = new Label(), forFirst_ = new Label(), forEnd_ = new Label();

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22993);mw.visitInsn(ICONST_0);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22994);mw.visitVarInsn(ISTORE, context.var("i"));

                    // for (; i < list.size() -1; ++i) {
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22995);mw.visitLabel(for_);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22996);mw.visitVarInsn(ILOAD, context.var("i"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22997);mw.visitVarInsn(ILOAD, context.var("size"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(22998);mw.visitJumpInsn(IF_ICMPGE, forEnd_); // i < list.size - 1

                    __CLR4_5_2hfehfelusyjmgr.R.inc(22999);mw.visitVarInsn(ILOAD, context.var("i"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23000);mw.visitJumpInsn(IFEQ, forFirst_); // i < list.size - 1

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23001);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23002);mw.visitVarInsn(BIPUSH, ',');
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23003);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23004);mw.visitLabel(forFirst_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23005);mw.visitVarInsn(ALOAD, context.var("list"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23006);mw.visitVarInsn(ILOAD, context.var("i"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23007);mw.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23008);mw.visitVarInsn(ASTORE, context.var("list_item"));

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23009);Label forItemNullEnd_ = new Label(), forItemNullElse_ = new Label();

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23010);mw.visitVarInsn(ALOAD, context.var("list_item"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23011);mw.visitJumpInsn(IFNONNULL, forItemNullElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23012);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23013);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeNull", "()V");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23014);mw.visitJumpInsn(GOTO, forItemNullEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23015);mw.visitLabel(forItemNullElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23016);Label forItemClassIfEnd_ = new Label(), forItemClassIfElse_ = new Label();
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23017);if ((((elementClass != null && Modifier.isPublic(elementClass.getModifiers()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23018)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23019)==0&false))) {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23020);mw.visitVarInsn(ALOAD, context.var("list_item"));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23021);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23022);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass)));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23023);mw.visitJumpInsn(IF_ACMPNE, forItemClassIfElse_);

                        __CLR4_5_2hfehfelusyjmgr.R.inc(23024);_getListFieldItemSer(context, mw, fieldInfo, elementClass);
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23025);mw.visitVarInsn(ASTORE, context.var("list_item_desc"));

                        __CLR4_5_2hfehfelusyjmgr.R.inc(23026);Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();

                        __CLR4_5_2hfehfelusyjmgr.R.inc(23027);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23028)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23029)==0&false))) {{
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23030);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23031);mw.visitTypeInsn(INSTANCEOF, JavaBeanSerializer);
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23032);mw.visitJumpInsn(IFEQ, instanceOfElse_);

                            __CLR4_5_2hfehfelusyjmgr.R.inc(23033);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23034);mw.visitTypeInsn(CHECKCAST, JavaBeanSerializer); // cast
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23035);mw.visitVarInsn(ALOAD, Context.serializer);
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23036);mw.visitVarInsn(ALOAD, context.var("list_item")); // object
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23037);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23038)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23039)==0&false))) {{ // fieldName
                                __CLR4_5_2hfehfelusyjmgr.R.inc(23040);mw.visitInsn(ACONST_NULL);
                            } }else {{
                                __CLR4_5_2hfehfelusyjmgr.R.inc(23041);mw.visitVarInsn(ILOAD, context.var("i"));
                                __CLR4_5_2hfehfelusyjmgr.R.inc(23042);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf",
                                                   "(I)Ljava/lang/Integer;");
                            }
                            }__CLR4_5_2hfehfelusyjmgr.R.inc(23043);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass))); // fieldType
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23044);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23045);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeAsArrayNonContext", //
                                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23046);mw.visitJumpInsn(GOTO, instanceOfEnd_);

                            __CLR4_5_2hfehfelusyjmgr.R.inc(23047);mw.visitLabel(instanceOfElse_);
                        }

                        }__CLR4_5_2hfehfelusyjmgr.R.inc(23048);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23049);mw.visitVarInsn(ALOAD, Context.serializer);
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23050);mw.visitVarInsn(ALOAD, context.var("list_item")); // object
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23051);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23052)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23053)==0&false))) {{ // fieldName
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23054);mw.visitInsn(ACONST_NULL);
                        } }else {{
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23055);mw.visitVarInsn(ILOAD, context.var("i"));
                            __CLR4_5_2hfehfelusyjmgr.R.inc(23056);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                        }
                        }__CLR4_5_2hfehfelusyjmgr.R.inc(23057);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass))); // fieldType
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23058);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23059);mw.visitMethodInsn(INVOKEINTERFACE, ObjectSerializer, "write", //
                                           "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23060);mw.visitLabel(instanceOfEnd_);
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23061);mw.visitJumpInsn(GOTO, forItemClassIfEnd_);
                    }

                    }__CLR4_5_2hfehfelusyjmgr.R.inc(23062);mw.visitLabel(forItemClassIfElse_);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23063);mw.visitVarInsn(ALOAD, Context.serializer);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23064);mw.visitVarInsn(ALOAD, context.var("list_item"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23065);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23066)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23067)==0&false))) {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23068);mw.visitInsn(ACONST_NULL);
                    } }else {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23069);mw.visitVarInsn(ILOAD, context.var("i"));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23070);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    }
                    }__CLR4_5_2hfehfelusyjmgr.R.inc(23071);if ((((elementClass != null && Modifier.isPublic(elementClass.getModifiers()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23072)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23073)==0&false))) {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23074);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc((Class<?>) elementType)));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23075);mw.visitLdcInsn(fieldInfo.serialzeFeatures);
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23076);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                           "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    } }else {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23077);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                           "(Ljava/lang/Object;Ljava/lang/Object;)V");
                    }
                    }__CLR4_5_2hfehfelusyjmgr.R.inc(23078);mw.visitLabel(forItemClassIfEnd_);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23079);mw.visitLabel(forItemNullEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23080);mw.visitIincInsn(context.var("i"), 1);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23081);mw.visitJumpInsn(GOTO, for_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23082);mw.visitLabel(forEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23083);mw.visitVarInsn(ALOAD, context.var("out"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23084);mw.visitVarInsn(BIPUSH, ']');
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23085);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23086);mw.visitLabel(nullEnd_);
                }

                }__CLR4_5_2hfehfelusyjmgr.R.inc(23087);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23088);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23089);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23090);Label notNullEnd_ = new Label(), notNullElse_ = new Label();

                __CLR4_5_2hfehfelusyjmgr.R.inc(23091);_get(mw, context, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23092);mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23093);mw.visitVarInsn(ASTORE, context.var("field_" + fieldInfo.fieldClass.getName()));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23094);mw.visitJumpInsn(IFNONNULL, notNullElse_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23095);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23096);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeNull", "()V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23097);mw.visitJumpInsn(GOTO, notNullEnd_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23098);mw.visitLabel(notNullElse_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23099);Label classIfEnd_ = new Label(), classIfElse_ = new Label();
                __CLR4_5_2hfehfelusyjmgr.R.inc(23100);mw.visitVarInsn(ALOAD, context.var("field_" + fieldInfo.fieldClass.getName()));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23101);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23102);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass)));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23103);mw.visitJumpInsn(IF_ACMPNE, classIfElse_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23104);_getFieldSer(context, mw, fieldInfo);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23105);mw.visitVarInsn(ASTORE, context.var("fied_ser"));

                __CLR4_5_2hfehfelusyjmgr.R.inc(23106);Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();
                __CLR4_5_2hfehfelusyjmgr.R.inc(23107);if ((((context.writeDirect && Modifier.isPublic(fieldClass.getModifiers()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23108)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23109)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23110);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23111);mw.visitTypeInsn(INSTANCEOF, JavaBeanSerializer);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23112);mw.visitJumpInsn(IFEQ, instanceOfElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23113);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23114);mw.visitTypeInsn(CHECKCAST, JavaBeanSerializer); // cast
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23115);mw.visitVarInsn(ALOAD, Context.serializer);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23116);mw.visitVarInsn(ALOAD, context.var("field_" + fieldInfo.fieldClass.getName()));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23117);mw.visitVarInsn(ALOAD, Context.fieldName);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23118);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass))); // fieldType
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23119);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23120);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeAsArrayNonContext", //
                                       "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23121);mw.visitJumpInsn(GOTO, instanceOfEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23122);mw.visitLabel(instanceOfElse_);
                }
                }__CLR4_5_2hfehfelusyjmgr.R.inc(23123);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23124);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23125);mw.visitVarInsn(ALOAD, context.var("field_" + fieldInfo.fieldClass.getName()));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23126);mw.visitVarInsn(ALOAD, Context.fieldName);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23127);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass))); // fieldType
                __CLR4_5_2hfehfelusyjmgr.R.inc(23128);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                __CLR4_5_2hfehfelusyjmgr.R.inc(23129);mw.visitMethodInsn(INVOKEINTERFACE, ObjectSerializer, "write", //
                                   "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23130);mw.visitLabel(instanceOfEnd_);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23131);mw.visitJumpInsn(GOTO, classIfEnd_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23132);mw.visitLabel(classIfElse_);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23133);String format = fieldInfo.getFormat();

                __CLR4_5_2hfehfelusyjmgr.R.inc(23134);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23135);mw.visitVarInsn(ALOAD, context.var("field_" + fieldInfo.fieldClass.getName()));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23136);if ((((format != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23137)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23138)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23139);mw.visitLdcInsn(format);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23140);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFormat",
                                       "(Ljava/lang/Object;Ljava/lang/String;)V");
                } }else {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23141);mw.visitVarInsn(ALOAD, Context.fieldName);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23142);if ((((fieldInfo.fieldType instanceof Class<?> //
                        && ((Class<?>) fieldInfo.fieldType).isPrimitive())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23143)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23144)==0&false))) {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23145);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                           "(Ljava/lang/Object;Ljava/lang/Object;)V");
                    } }else {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23146);mw.visitVarInsn(ALOAD, 0); // this
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23147);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_fieldType",
                                          "Ljava/lang/reflect/Type;");
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23148);mw.visitLdcInsn(fieldInfo.serialzeFeatures);

                        __CLR4_5_2hfehfelusyjmgr.R.inc(23149);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                           "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    }
                }}
                }__CLR4_5_2hfehfelusyjmgr.R.inc(23150);mw.visitLabel(classIfEnd_);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23151);mw.visitLabel(notNullEnd_);
                

                __CLR4_5_2hfehfelusyjmgr.R.inc(23152);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23153);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23154);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            }
        }}}}}}}}}}
    }}finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void generateWriteMethod(Class<?> clazz, MethodVisitor mw, FieldInfo[] getters,
                                     Context context) throws Exception {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23155);

        // if (serializer.containsReference(object)) {
        __CLR4_5_2hfehfelusyjmgr.R.inc(23156);Label end = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23157);int size = getters.length;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23158);if ((((!context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23159)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23160)==0&false))) {{
            // pretty format not byte code optimized
            __CLR4_5_2hfehfelusyjmgr.R.inc(23161);Label endSupper_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23162);Label supper_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23163);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23164);mw.visitLdcInsn(SerializerFeature.PrettyFormat.mask);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23165);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23166);mw.visitJumpInsn(IFNE, supper_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23167);boolean hasMethod = false;
            __CLR4_5_2hfehfelusyjmgr.R.inc(23168);for (FieldInfo getter : getters) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23169);if ((((getter.method != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23170)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23171)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23172);hasMethod = true;
                }
            }}

            }__CLR4_5_2hfehfelusyjmgr.R.inc(23173);if ((((hasMethod)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23174)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23175)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23176);mw.visitVarInsn(ALOAD, context.var("out"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23177);mw.visitLdcInsn(SerializerFeature.IgnoreErrorGetter.mask);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23178);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23179);mw.visitJumpInsn(IFEQ, endSupper_);
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23180);mw.visitJumpInsn(GOTO, endSupper_);
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(23181);mw.visitLabel(supper_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23182);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23183);mw.visitVarInsn(ALOAD, 1);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23184);mw.visitVarInsn(ALOAD, 2);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23185);mw.visitVarInsn(ALOAD, 3);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23186);mw.visitVarInsn(ALOAD, 4);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23187);mw.visitVarInsn(ILOAD, 5);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23188);mw.visitMethodInsn(INVOKESPECIAL, JavaBeanSerializer,
                               "write", "(L" + JSONSerializer
                                        + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23189);mw.visitInsn(RETURN);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23190);mw.visitLabel(endSupper_);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23191);if ((((!context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23192)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23193)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23194);Label endRef_ = new Label();

            // /////
            __CLR4_5_2hfehfelusyjmgr.R.inc(23195);mw.visitVarInsn(ALOAD, 0); // this
            __CLR4_5_2hfehfelusyjmgr.R.inc(23196);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23197);mw.visitVarInsn(ALOAD, Context.obj);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23198);mw.visitVarInsn(ILOAD, Context.features);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23199);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeReference",
                               "(L" + JSONSerializer + ";Ljava/lang/Object;I)Z");

            __CLR4_5_2hfehfelusyjmgr.R.inc(23200);mw.visitJumpInsn(IFEQ, endRef_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23201);mw.visitInsn(RETURN);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23202);mw.visitLabel(endRef_);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23203);final String writeAsArrayMethodName;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23204);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23205)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23206)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23207);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23208)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23209)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23210);writeAsArrayMethodName = "writeAsArrayNonContext";
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23211);writeAsArrayMethodName = "writeAsArray";
            }
        }} }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23212);writeAsArrayMethodName = "writeAsArrayNormal";
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23213);if (((((context.beanInfo.features & SerializerFeature.BeanToArray.mask) == 0)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23214)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23215)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23216);Label endWriteAsArray_ = new Label();

            __CLR4_5_2hfehfelusyjmgr.R.inc(23217);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23218);mw.visitLdcInsn(SerializerFeature.BeanToArray.mask);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23219);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23220);mw.visitJumpInsn(IFEQ, endWriteAsArray_);

            // /////
            __CLR4_5_2hfehfelusyjmgr.R.inc(23221);mw.visitVarInsn(ALOAD, 0); // this
            __CLR4_5_2hfehfelusyjmgr.R.inc(23222);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23223);mw.visitVarInsn(ALOAD, 2); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(23224);mw.visitVarInsn(ALOAD, 3); // fieldObj
            __CLR4_5_2hfehfelusyjmgr.R.inc(23225);mw.visitVarInsn(ALOAD, 4); // fieldType
            __CLR4_5_2hfehfelusyjmgr.R.inc(23226);mw.visitVarInsn(ILOAD, 5); // features
            __CLR4_5_2hfehfelusyjmgr.R.inc(23227);mw.visitMethodInsn(INVOKEVIRTUAL, //
                               context.className, //
                               writeAsArrayMethodName, //
                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");

            __CLR4_5_2hfehfelusyjmgr.R.inc(23228);mw.visitInsn(RETURN);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23229);mw.visitLabel(endWriteAsArray_);
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23230);mw.visitVarInsn(ALOAD, 0); // this
            __CLR4_5_2hfehfelusyjmgr.R.inc(23231);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23232);mw.visitVarInsn(ALOAD, 2); // obj
            __CLR4_5_2hfehfelusyjmgr.R.inc(23233);mw.visitVarInsn(ALOAD, 3); // fieldObj
            __CLR4_5_2hfehfelusyjmgr.R.inc(23234);mw.visitVarInsn(ALOAD, 4); // fieldType
            __CLR4_5_2hfehfelusyjmgr.R.inc(23235);mw.visitVarInsn(ILOAD, 5); // features
            __CLR4_5_2hfehfelusyjmgr.R.inc(23236);mw.visitMethodInsn(INVOKEVIRTUAL, //
                               context.className, //
                               writeAsArrayMethodName, //
                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23237);mw.visitInsn(RETURN);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23238);if ((((!context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23239)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23240)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23241);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23242);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "getContext", "()" + SerialContext_desc);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23243);mw.visitVarInsn(ASTORE, context.var("parent"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(23244);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23245);mw.visitVarInsn(ALOAD, context.var("parent"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23246);mw.visitVarInsn(ALOAD, Context.obj);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23247);mw.visitVarInsn(ALOAD, Context.paramFieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23248);mw.visitLdcInsn(context.beanInfo.features);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23249);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "setContext",
                               "(" + SerialContext_desc + "Ljava/lang/Object;Ljava/lang/Object;I)V");
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23250);boolean writeClasName = (context.beanInfo.features & SerializerFeature.WriteClassName.mask) != 0;

        // SEPERATO
        __CLR4_5_2hfehfelusyjmgr.R.inc(23251);if ((((writeClasName || !context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23252)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23253)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23254);Label end_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23255);Label else_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23256);Label writeClass_ = new Label();

            __CLR4_5_2hfehfelusyjmgr.R.inc(23257);if ((((!writeClasName)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23258)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23259)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23260);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23261);mw.visitVarInsn(ALOAD, Context.paramFieldType);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23262);mw.visitVarInsn(ALOAD, Context.obj);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23263);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "isWriteClassName",
                        "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23264);mw.visitJumpInsn(IFEQ, else_);
            }

            // IFNULL
            }__CLR4_5_2hfehfelusyjmgr.R.inc(23265);mw.visitVarInsn(ALOAD, Context.paramFieldType);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23266);mw.visitVarInsn(ALOAD, Context.obj);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23267);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23268);mw.visitJumpInsn(IF_ACMPEQ, else_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23269);mw.visitLabel(writeClass_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23270);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23271);mw.visitVarInsn(BIPUSH, '{');
            __CLR4_5_2hfehfelusyjmgr.R.inc(23272);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            
            __CLR4_5_2hfehfelusyjmgr.R.inc(23273);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23274);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23275);if ((((context.beanInfo.typeKey != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23276)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23277)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23278);mw.visitLdcInsn(context.beanInfo.typeKey);
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23279);mw.visitInsn(ACONST_NULL);
            }
            }__CLR4_5_2hfehfelusyjmgr.R.inc(23280);mw.visitVarInsn(ALOAD, Context.obj);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23281);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeClassName", "(L" + JSONSerializer + ";Ljava/lang/String;Ljava/lang/Object;)V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23282);mw.visitVarInsn(BIPUSH, ',');
            __CLR4_5_2hfehfelusyjmgr.R.inc(23283);mw.visitJumpInsn(GOTO, end_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23284);mw.visitLabel(else_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23285);mw.visitVarInsn(BIPUSH, '{');

            __CLR4_5_2hfehfelusyjmgr.R.inc(23286);mw.visitLabel(end_);
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23287);mw.visitVarInsn(BIPUSH, '{');
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23288);mw.visitVarInsn(ISTORE, context.var("seperator"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23289);if ((((!context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23290)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23291)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23292);_before(mw, context);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23293);if ((((!context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23294)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23295)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23296);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23297);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isNotWriteDefaultValue", "()Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23298);mw.visitVarInsn(ISTORE, context.var("notWriteDefaultValue"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(23299);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23300);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23301);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "checkValue", "(" + SerializeFilterable_desc + ")Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23302);mw.visitVarInsn(ISTORE, context.var("checkValue"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(23303);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23304);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23305);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "hasNameFilters", "(" + SerializeFilterable_desc + ")Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23306);mw.visitVarInsn(ISTORE, context.var("hasNameFilters"));
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23307);for (int i = 0; (((i < size)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23308)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23309)==0&false)); ++i) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23310);FieldInfo property = getters[i];
            __CLR4_5_2hfehfelusyjmgr.R.inc(23311);Class<?> propertyClass = property.fieldClass;

            __CLR4_5_2hfehfelusyjmgr.R.inc(23312);mw.visitLdcInsn(property.name);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23313);mw.visitVarInsn(ASTORE, Context.fieldName);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23314);if ((((propertyClass == byte.class //
                || propertyClass == short.class //
                || propertyClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23315)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23316)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23317);_int(clazz, mw, property, context, context.var(propertyClass.getName()), 'I');
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23318);if ((((propertyClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23319)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23320)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23321);_long(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23322);if ((((propertyClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23323)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23324)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23325);_float(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23326);if ((((propertyClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23327)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23328)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23329);_double(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23330);if ((((propertyClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23331)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23332)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23333);_int(clazz, mw, property, context, context.var("boolean"), 'Z');
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23334);if ((((propertyClass == char.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23335)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23336)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23337);_int(clazz, mw, property, context, context.var("char"), 'C');
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23338);if ((((propertyClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23339)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23340)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23341);_string(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23342);if ((((propertyClass == BigDecimal.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23343)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23344)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23345);_decimal(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23346);if ((((List.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23347)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23348)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23349);_list(clazz, mw, property, context);
            } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23350);if ((((propertyClass.isEnum())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23351)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23352)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23353);_enum(clazz, mw, property, context);
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23354);_object(clazz, mw, property, context);
            }
        }}}}}}}}}}}

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23355);if ((((!context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23356)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23357)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23358);_after(mw, context);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23359);Label _else = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23360);Label _end_if = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23361);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23362);mw.visitIntInsn(BIPUSH, '{');
        __CLR4_5_2hfehfelusyjmgr.R.inc(23363);mw.visitJumpInsn(IF_ICMPNE, _else);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23364);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23365);mw.visitVarInsn(BIPUSH, '{');
        __CLR4_5_2hfehfelusyjmgr.R.inc(23366);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23367);mw.visitLabel(_else);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23368);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23369);mw.visitVarInsn(BIPUSH, '}');
        __CLR4_5_2hfehfelusyjmgr.R.inc(23370);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23371);mw.visitLabel(_end_if);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23372);mw.visitLabel(end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23373);if ((((!context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23374)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23375)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23376);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23377);mw.visitVarInsn(ALOAD, context.var("parent"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23378);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "setContext", "(" + SerialContext_desc + ")V");
        }

    }}finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _object(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23379);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23380);Label _end = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23381);_nameApply(mw, property, context, _end);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23382);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23383);mw.visitVarInsn(ASTORE, context.var("object"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23384);_filters(mw, property, context, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23385);_writeObject(mw, property, context, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23386);mw.visitLabel(_end);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _enum(Class<?> clazz, MethodVisitor mw, FieldInfo fieldInfo, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23387);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23388);Label _not_null = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23389);Label _end_if = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23390);Label _end = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23391);_nameApply(mw, fieldInfo, context, _end);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23392);_get(mw, context, fieldInfo);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23393);mw.visitTypeInsn(CHECKCAST, "java/lang/Enum"); // cast
        __CLR4_5_2hfehfelusyjmgr.R.inc(23394);mw.visitVarInsn(ASTORE, context.var("enum"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23395);_filters(mw, fieldInfo, context, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23396);mw.visitVarInsn(ALOAD, context.var("enum"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23397);mw.visitJumpInsn(IFNONNULL, _not_null);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23398);_if_write_null(mw, fieldInfo, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23399);mw.visitJumpInsn(GOTO, _end_if);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23400);mw.visitLabel(_not_null);

       __CLR4_5_2hfehfelusyjmgr.R.inc(23401);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23402)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23403)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23404);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23405);mw.visitVarInsn(ILOAD, context.var("seperator"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23406);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23407);mw.visitVarInsn(ALOAD, context.var("enum"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23408);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Enum", "name", "()Ljava/lang/String;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23409);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValueStringWithDoubleQuote",
                               "(CLjava/lang/String;Ljava/lang/String;)V");
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23410);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23411);mw.visitVarInsn(ILOAD, context.var("seperator"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23412);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
            
            __CLR4_5_2hfehfelusyjmgr.R.inc(23413);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23414);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23415);mw.visitInsn(ICONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23416);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
            
            __CLR4_5_2hfehfelusyjmgr.R.inc(23417);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23418);mw.visitVarInsn(ALOAD, context.var("enum"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23419);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23420);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc((Class<?>) fieldInfo.fieldClass)));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23421);mw.visitLdcInsn(fieldInfo.serialzeFeatures);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23422);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                    "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23423);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23424);mw.visitLabel(_end_if);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23425);mw.visitLabel(_end);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
    
    private void _int(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context, int var, char type) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23426);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23427);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23428);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23429);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23430);mw.visitVarInsn(ISTORE, var);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23431);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23432);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23433);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23434);mw.visitVarInsn(ALOAD, Context.fieldName);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23435);mw.visitVarInsn(ILOAD, var);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23436);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;" + type + ")V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23437);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23438);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _long(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23439);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23440);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23441);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23442);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23443);mw.visitVarInsn(LSTORE, context.var("long", 2));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23444);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23445);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23446);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23447);mw.visitVarInsn(ALOAD, Context.fieldName);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23448);mw.visitVarInsn(LLOAD, context.var("long", 2));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23449);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;J)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23450);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23451);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
    
    private void _float(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23452);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23453);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23454);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23455);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23456);mw.visitVarInsn(FSTORE, context.var("float"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23457);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23458);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23459);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23460);mw.visitVarInsn(ALOAD, Context.fieldName);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23461);mw.visitVarInsn(FLOAD, context.var("float"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23462);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;F)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23463);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23464);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _double(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23465);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23466);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23467);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23468);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23469);mw.visitVarInsn(DSTORE, context.var("double", 2));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23470);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23471);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23472);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23473);mw.visitVarInsn(ALOAD, Context.fieldName);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23474);mw.visitVarInsn(DLOAD, context.var("double", 2));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23475);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue", "(CLjava/lang/String;D)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23476);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23477);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
    
    private void _get(MethodVisitor mw, Context context, FieldInfo fieldInfo) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23478);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23479);Method method = fieldInfo.method;
        __CLR4_5_2hfehfelusyjmgr.R.inc(23480);if ((((method != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23481)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23482)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23483);mw.visitVarInsn(ALOAD, context.var("entity"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23484);Class<?> declaringClass = method.getDeclaringClass();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23485);mw.visitMethodInsn((((declaringClass.isInterface() )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23486)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23487)==0&false))? INVOKEINTERFACE : INVOKEVIRTUAL, type(declaringClass), method.getName(), desc(method));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23488);if ((((!method.getReturnType().equals(fieldInfo.fieldClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23489)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23490)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23491);mw.visitTypeInsn(CHECKCAST, type(fieldInfo.fieldClass)); // cast
            }
        }} }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23492);mw.visitVarInsn(ALOAD, context.var("entity"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23493);Field field = fieldInfo.field;
            __CLR4_5_2hfehfelusyjmgr.R.inc(23494);mw.visitFieldInsn(GETFIELD, type(fieldInfo.declaringClass), field.getName(),
                              desc(field.getType()));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23495);if ((((!field.getType().equals(fieldInfo.fieldClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23496)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23497)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23498);mw.visitTypeInsn(CHECKCAST, type(fieldInfo.fieldClass)); // cast
            }
        }}
    }}finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _decimal(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23499);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23500);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23501);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23502);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23503);mw.visitVarInsn(ASTORE, context.var("decimal"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23504);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23505);Label if_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23506);Label else_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23507);Label endIf_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23508);mw.visitLabel(if_);

        // if (decimalValue == null) {
        __CLR4_5_2hfehfelusyjmgr.R.inc(23509);mw.visitVarInsn(ALOAD, context.var("decimal"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23510);mw.visitJumpInsn(IFNONNULL, else_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23511);_if_write_null(mw, property, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23512);mw.visitJumpInsn(GOTO, endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23513);mw.visitLabel(else_); // else { out.writeFieldValue(seperator, fieldName, fieldValue)

        __CLR4_5_2hfehfelusyjmgr.R.inc(23514);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23515);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23516);mw.visitVarInsn(ALOAD, Context.fieldName);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23517);mw.visitVarInsn(ALOAD, context.var("decimal"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23518);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue",
                           "(CLjava/lang/String;Ljava/math/BigDecimal;)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23519);_seperator(mw, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23520);mw.visitJumpInsn(GOTO, endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23521);mw.visitLabel(endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23522);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _string(Class<?> clazz, MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23523);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23524);Label end_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23525);if ((((property.name.equals(context.beanInfo.typeKey))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23526)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23527)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23528);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23529);mw.visitVarInsn(ALOAD, Context.paramFieldType);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23530);mw.visitVarInsn(ALOAD, Context.obj);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23531);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "isWriteClassName",
                    "(Ljava/lang/reflect/Type;Ljava/lang/Object;)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23532);mw.visitJumpInsn(IFNE, end_);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23533);_nameApply(mw, property, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23534);_get(mw, context, property);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23535);mw.visitVarInsn(ASTORE, context.var("string"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23536);_filters(mw, property, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23537);Label else_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23538);Label endIf_ = new Label();

        // if (value == null) {
        __CLR4_5_2hfehfelusyjmgr.R.inc(23539);mw.visitVarInsn(ALOAD, context.var("string"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23540);mw.visitJumpInsn(IFNONNULL, else_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23541);_if_write_null(mw, property, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23542);mw.visitJumpInsn(GOTO, endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23543);mw.visitLabel(else_); // else { out.writeFieldValue(seperator, fieldName, fieldValue)


        __CLR4_5_2hfehfelusyjmgr.R.inc(23544);if (((("trim".equals(property.format))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23545)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23546)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23547);mw.visitVarInsn(ALOAD, context.var("string"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23548);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "trim", "()Ljava/lang/String;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23549);mw.visitVarInsn(ASTORE, context.var("string"));
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23550);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23551)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23552)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23553);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23554);mw.visitVarInsn(ILOAD, context.var("seperator"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23555);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23556);mw.visitVarInsn(ALOAD, context.var("string"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23557);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValueStringWithDoubleQuoteCheck",
                               "(CLjava/lang/String;Ljava/lang/String;)V");
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23558);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23559);mw.visitVarInsn(ILOAD, context.var("seperator"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23560);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23561);mw.visitVarInsn(ALOAD, context.var("string"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23562);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldValue",
                               "(CLjava/lang/String;Ljava/lang/String;)V");
        }
        }__CLR4_5_2hfehfelusyjmgr.R.inc(23563);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23564);mw.visitLabel(endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23565);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _list(Class<?> clazz, MethodVisitor mw, FieldInfo fieldInfo, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23566);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23567);Type propertyType = fieldInfo.fieldType;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23568);Type elementType = TypeUtils.getCollectionItemType(propertyType);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23569);Class<?> elementClass = null;
        __CLR4_5_2hfehfelusyjmgr.R.inc(23570);if ((((elementType instanceof Class<?>)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23571)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23572)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23573);elementClass = (Class<?>) elementType;
        }
        
        }__CLR4_5_2hfehfelusyjmgr.R.inc(23574);if ((((elementClass == Object.class //
            || elementClass == Serializable.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23575)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23576)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23577);elementClass = null;
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23578);Label end_ = new Label(), else_ = new Label(), endIf_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23579);_nameApply(mw, fieldInfo, context, end_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23580);_get(mw, context, fieldInfo);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23581);mw.visitTypeInsn(CHECKCAST, "java/util/List"); // cast
        __CLR4_5_2hfehfelusyjmgr.R.inc(23582);mw.visitVarInsn(ASTORE, context.var("list"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23583);_filters(mw, fieldInfo, context, end_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23584);mw.visitVarInsn(ALOAD, context.var("list"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23585);mw.visitJumpInsn(IFNONNULL, else_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23586);_if_write_null(mw, fieldInfo, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23587);mw.visitJumpInsn(GOTO, endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23588);mw.visitLabel(else_); // else {

        __CLR4_5_2hfehfelusyjmgr.R.inc(23589);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23590);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23591);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23592);_writeFieldName(mw, context);

        //
        __CLR4_5_2hfehfelusyjmgr.R.inc(23593);mw.visitVarInsn(ALOAD, context.var("list"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23594);mw.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "size", "()I");
        __CLR4_5_2hfehfelusyjmgr.R.inc(23595);mw.visitVarInsn(ISTORE, context.var("size"));

        __CLR4_5_2hfehfelusyjmgr.R.inc(23596);Label _else_3 = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23597);Label _end_if_3 = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23598);mw.visitVarInsn(ILOAD, context.var("size"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23599);mw.visitInsn(ICONST_0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23600);mw.visitJumpInsn(IF_ICMPNE, _else_3);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23601);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23602);mw.visitLdcInsn("[]");
        __CLR4_5_2hfehfelusyjmgr.R.inc(23603);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(Ljava/lang/String;)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23604);mw.visitJumpInsn(GOTO, _end_if_3);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23605);mw.visitLabel(_else_3);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23606);if ((((!context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23607)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23608)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23609);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23610);mw.visitVarInsn(ALOAD, context.var("list"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23611);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23612);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "setContext", "(Ljava/lang/Object;Ljava/lang/Object;)V");
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23613);if ((((elementType == String.class //
            && context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23614)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23615)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23616);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23617);mw.visitVarInsn(ALOAD, context.var("list"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23618);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(Ljava/util/List;)V");
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23619);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23620);mw.visitVarInsn(BIPUSH, '[');
            __CLR4_5_2hfehfelusyjmgr.R.inc(23621);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

            __CLR4_5_2hfehfelusyjmgr.R.inc(23622);Label for_ = new Label(), forFirst_ = new Label(), forEnd_ = new Label();

            __CLR4_5_2hfehfelusyjmgr.R.inc(23623);mw.visitInsn(ICONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23624);mw.visitVarInsn(ISTORE, context.var("i"));

            // for (; i < list.size() -1; ++i) {
            __CLR4_5_2hfehfelusyjmgr.R.inc(23625);mw.visitLabel(for_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23626);mw.visitVarInsn(ILOAD, context.var("i"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23627);mw.visitVarInsn(ILOAD, context.var("size"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23628);mw.visitJumpInsn(IF_ICMPGE, forEnd_); // i < list.size - 1

            __CLR4_5_2hfehfelusyjmgr.R.inc(23629);mw.visitVarInsn(ILOAD, context.var("i"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23630);mw.visitJumpInsn(IFEQ, forFirst_); // i < list.size - 1

            __CLR4_5_2hfehfelusyjmgr.R.inc(23631);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23632);mw.visitVarInsn(BIPUSH, ',');
            __CLR4_5_2hfehfelusyjmgr.R.inc(23633);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

            __CLR4_5_2hfehfelusyjmgr.R.inc(23634);mw.visitLabel(forFirst_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23635);mw.visitVarInsn(ALOAD, context.var("list"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23636);mw.visitVarInsn(ILOAD, context.var("i"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23637);mw.visitMethodInsn(INVOKEINTERFACE, "java/util/List", "get", "(I)Ljava/lang/Object;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23638);mw.visitVarInsn(ASTORE, context.var("list_item"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(23639);Label forItemNullEnd_ = new Label(), forItemNullElse_ = new Label();

            __CLR4_5_2hfehfelusyjmgr.R.inc(23640);mw.visitVarInsn(ALOAD, context.var("list_item"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23641);mw.visitJumpInsn(IFNONNULL, forItemNullElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23642);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23643);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeNull", "()V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23644);mw.visitJumpInsn(GOTO, forItemNullEnd_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23645);mw.visitLabel(forItemNullElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23646);Label forItemClassIfEnd_ = new Label(), forItemClassIfElse_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23647);if ((((elementClass != null && Modifier.isPublic(elementClass.getModifiers()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23648)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23649)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23650);mw.visitVarInsn(ALOAD, context.var("list_item"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23651);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
                __CLR4_5_2hfehfelusyjmgr.R.inc(23652);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass)));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23653);mw.visitJumpInsn(IF_ACMPNE, forItemClassIfElse_);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23654);_getListFieldItemSer(context, mw, fieldInfo, elementClass);
                // mw.visitInsn(DUP);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23655);mw.visitVarInsn(ASTORE, context.var("list_item_desc"));

                __CLR4_5_2hfehfelusyjmgr.R.inc(23656);Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();

                __CLR4_5_2hfehfelusyjmgr.R.inc(23657);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23658)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23659)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23660);String writeMethodName = (((context.nonContext && context.writeDirect )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23661)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23662)==0&false))? //
                        "writeDirectNonContext" //
                        : "write";
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23663);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23664);mw.visitTypeInsn(INSTANCEOF, JavaBeanSerializer);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23665);mw.visitJumpInsn(IFEQ, instanceOfElse_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23666);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23667);mw.visitTypeInsn(CHECKCAST, JavaBeanSerializer); // cast
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23668);mw.visitVarInsn(ALOAD, Context.serializer);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23669);mw.visitVarInsn(ALOAD, context.var("list_item")); // object
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23670);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23671)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23672)==0&false))) {{ // fieldName
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23673);mw.visitInsn(ACONST_NULL);
                    } }else {{
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23674);mw.visitVarInsn(ILOAD, context.var("i"));
                        __CLR4_5_2hfehfelusyjmgr.R.inc(23675);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                    }
                    }__CLR4_5_2hfehfelusyjmgr.R.inc(23676);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass))); // fieldType
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23677);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23678);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, writeMethodName, //
                                       "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23679);mw.visitJumpInsn(GOTO, instanceOfEnd_);

                    __CLR4_5_2hfehfelusyjmgr.R.inc(23680);mw.visitLabel(instanceOfElse_);
                }
                }__CLR4_5_2hfehfelusyjmgr.R.inc(23681);mw.visitVarInsn(ALOAD, context.var("list_item_desc"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23682);mw.visitVarInsn(ALOAD, Context.serializer);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23683);mw.visitVarInsn(ALOAD, context.var("list_item")); // object
                __CLR4_5_2hfehfelusyjmgr.R.inc(23684);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23685)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23686)==0&false))) {{ // fieldName
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23687);mw.visitInsn(ACONST_NULL);
                } }else {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23688);mw.visitVarInsn(ILOAD, context.var("i"));
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23689);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                }
                }__CLR4_5_2hfehfelusyjmgr.R.inc(23690);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(elementClass))); // fieldType
                __CLR4_5_2hfehfelusyjmgr.R.inc(23691);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
                __CLR4_5_2hfehfelusyjmgr.R.inc(23692);mw.visitMethodInsn(INVOKEINTERFACE, ObjectSerializer, "write", //
                                   "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");

                __CLR4_5_2hfehfelusyjmgr.R.inc(23693);mw.visitLabel(instanceOfEnd_);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23694);mw.visitJumpInsn(GOTO, forItemClassIfEnd_);
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(23695);mw.visitLabel(forItemClassIfElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23696);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23697);mw.visitVarInsn(ALOAD, context.var("list_item"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23698);if ((((context.nonContext)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23699)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23700)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23701);mw.visitInsn(ACONST_NULL);
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23702);mw.visitVarInsn(ILOAD, context.var("i"));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23703);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(23704);if ((((elementClass != null && Modifier.isPublic(elementClass.getModifiers()))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23705)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23706)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23707);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc((Class<?>) elementType)));
                __CLR4_5_2hfehfelusyjmgr.R.inc(23708);mw.visitLdcInsn(fieldInfo.serialzeFeatures);
                __CLR4_5_2hfehfelusyjmgr.R.inc(23709);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                   "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23710);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                   "(Ljava/lang/Object;Ljava/lang/Object;)V");
            }

            }__CLR4_5_2hfehfelusyjmgr.R.inc(23711);mw.visitLabel(forItemClassIfEnd_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23712);mw.visitLabel(forItemNullEnd_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23713);mw.visitIincInsn(context.var("i"), 1);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23714);mw.visitJumpInsn(GOTO, for_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23715);mw.visitLabel(forEnd_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23716);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23717);mw.visitVarInsn(BIPUSH, ']');
            __CLR4_5_2hfehfelusyjmgr.R.inc(23718);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");
        }

        }{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23719);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23720);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "popContext", "()V");
        }

        __CLR4_5_2hfehfelusyjmgr.R.inc(23721);mw.visitLabel(_end_if_3);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23722);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23723);mw.visitLabel(endIf_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23724);mw.visitLabel(end_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _filters(MethodVisitor mw, FieldInfo property, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23725);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23726);if ((((property.fieldTransient)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23727)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23728)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23729);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23730);mw.visitLdcInsn(SerializerFeature.SkipTransientField.mask);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23731);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23732);mw.visitJumpInsn(IFNE, _end);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23733);_notWriteDefault(mw, property, context, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23734);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23735)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23736)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23737);return;
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23738);_apply(mw, property, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23739);mw.visitJumpInsn(IFEQ, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23740);_processKey(mw, property, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23741);_processValue(mw, property, context, _end);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _nameApply(MethodVisitor mw, FieldInfo property, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23742);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23743);if ((((!context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23744)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23745)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23746);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23747);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23748);mw.visitVarInsn(ALOAD, Context.obj);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23749);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23750);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "applyName",
                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/String;)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23751);mw.visitJumpInsn(IFEQ, _end);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23752);_labelApply(mw, property, context, _end);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23753);if ((((property.field == null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23754)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23755)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23756);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23757);mw.visitLdcInsn(SerializerFeature.IgnoreNonFieldGetter.mask);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23758);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");

            // if true
            __CLR4_5_2hfehfelusyjmgr.R.inc(23759);mw.visitJumpInsn(IFNE, _end);
        }
    }}finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _labelApply(MethodVisitor mw, FieldInfo property, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23760);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23761);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(23762);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23763);mw.visitLdcInsn(property.label);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23764);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "applyLabel",
                           "(L" + JSONSerializer + ";Ljava/lang/String;)Z");
        __CLR4_5_2hfehfelusyjmgr.R.inc(23765);mw.visitJumpInsn(IFEQ, _end);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _writeObject(MethodVisitor mw, FieldInfo fieldInfo, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23766);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23767);String format = fieldInfo.getFormat();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23768);Class<?> fieldClass = fieldInfo.fieldClass;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23769);Label notNull_ = new Label();

        // if (obj == null)
        __CLR4_5_2hfehfelusyjmgr.R.inc(23770);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23771)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23772)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23773);mw.visitVarInsn(ALOAD, context.var("object"));
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23774);mw.visitVarInsn(ALOAD, Context.processValue);
        }
        }__CLR4_5_2hfehfelusyjmgr.R.inc(23775);mw.visitInsn(DUP);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23776);mw.visitVarInsn(ASTORE, context.var("object"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23777);mw.visitJumpInsn(IFNONNULL, notNull_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23778);_if_write_null(mw, fieldInfo, context);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23779);mw.visitJumpInsn(GOTO, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23780);mw.visitLabel(notNull_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23781);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23782);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23783);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(23784);_writeFieldName(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23785);Label classIfEnd_ = new Label(), classIfElse_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(23786);if ((((Modifier.isPublic(fieldClass.getModifiers()) //
            && !ParserConfig.isPrimitive2(fieldClass) //
        )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23787)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23788)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23789);mw.visitVarInsn(ALOAD, context.var("object"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23790);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "getClass", "()Ljava/lang/Class;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23791);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass)));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23792);mw.visitJumpInsn(IF_ACMPNE, classIfElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23793);_getFieldSer(context, mw, fieldInfo);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23794);mw.visitVarInsn(ASTORE, context.var("fied_ser"));

            __CLR4_5_2hfehfelusyjmgr.R.inc(23795);Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23796);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23797);mw.visitTypeInsn(INSTANCEOF, JavaBeanSerializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23798);mw.visitJumpInsn(IFEQ, instanceOfElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23799);boolean disableCircularReferenceDetect = (fieldInfo.serialzeFeatures & SerializerFeature.DisableCircularReferenceDetect.mask) != 0;
            __CLR4_5_2hfehfelusyjmgr.R.inc(23800);boolean fieldBeanToArray = (fieldInfo.serialzeFeatures & SerializerFeature.BeanToArray.mask) != 0;
            __CLR4_5_2hfehfelusyjmgr.R.inc(23801);String writeMethodName;
            __CLR4_5_2hfehfelusyjmgr.R.inc(23802);if ((((disableCircularReferenceDetect || (context.nonContext && context.writeDirect))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23803)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23804)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23805);writeMethodName = (((fieldBeanToArray )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23806)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23807)==0&false))? "writeAsArrayNonContext" : "writeDirectNonContext";
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23808);writeMethodName = (((fieldBeanToArray )&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23809)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23810)==0&false))? "writeAsArray" : "write";
            }
            
            }__CLR4_5_2hfehfelusyjmgr.R.inc(23811);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23812);mw.visitTypeInsn(CHECKCAST, JavaBeanSerializer); // cast
            __CLR4_5_2hfehfelusyjmgr.R.inc(23813);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23814);mw.visitVarInsn(ALOAD, context.var("object"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23815);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23816);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23817);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_fieldType",
                              "Ljava/lang/reflect/Type;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23818);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
            __CLR4_5_2hfehfelusyjmgr.R.inc(23819);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, writeMethodName, //
                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23820);mw.visitJumpInsn(GOTO, instanceOfEnd_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23821);mw.visitLabel(instanceOfElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23822);mw.visitVarInsn(ALOAD, context.var("fied_ser"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23823);mw.visitVarInsn(ALOAD, Context.serializer);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23824);mw.visitVarInsn(ALOAD, context.var("object"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23825);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23826);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23827);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_fieldType",
                              "Ljava/lang/reflect/Type;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(23828);mw.visitLdcInsn(fieldInfo.serialzeFeatures); // features
            __CLR4_5_2hfehfelusyjmgr.R.inc(23829);mw.visitMethodInsn(INVOKEINTERFACE, ObjectSerializer, "write", //
                               "(L" + JSONSerializer + ";Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");

            __CLR4_5_2hfehfelusyjmgr.R.inc(23830);mw.visitLabel(instanceOfEnd_);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23831);mw.visitJumpInsn(GOTO, classIfEnd_);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23832);mw.visitLabel(classIfElse_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23833);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23834);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23835)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23836)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23837);mw.visitVarInsn(ALOAD, context.var("object"));
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23838);mw.visitVarInsn(ALOAD, Context.processValue);
        }
        }__CLR4_5_2hfehfelusyjmgr.R.inc(23839);if ((((format != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23840)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23841)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23842);mw.visitLdcInsn(format);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23843);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFormat",
                               "(Ljava/lang/Object;Ljava/lang/String;)V");
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23844);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23845);if ((((fieldInfo.fieldType instanceof Class<?> //
                && ((Class<?>) fieldInfo.fieldType).isPrimitive())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23846)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23847)==0&false))) {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23848);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                   "(Ljava/lang/Object;Ljava/lang/Object;)V");
            } }else {{
                __CLR4_5_2hfehfelusyjmgr.R.inc(23849);if ((((fieldInfo.fieldClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23850)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23851)==0&false))) {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23852);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(String.class)));
                } }else {{
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23853);mw.visitVarInsn(ALOAD, 0);
                    __CLR4_5_2hfehfelusyjmgr.R.inc(23854);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_fieldType",
                                      "Ljava/lang/reflect/Type;");
                }
                }__CLR4_5_2hfehfelusyjmgr.R.inc(23855);mw.visitLdcInsn(fieldInfo.serialzeFeatures);

                __CLR4_5_2hfehfelusyjmgr.R.inc(23856);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "writeWithFieldName",
                                   "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;I)V");
            }
        }}
        }__CLR4_5_2hfehfelusyjmgr.R.inc(23857);mw.visitLabel(classIfEnd_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23858);_seperator(mw, context);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _before(MethodVisitor mw, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23859);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23860);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(23861);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23862);mw.visitVarInsn(ALOAD, Context.obj);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23863);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23864);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeBefore",
                           "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        __CLR4_5_2hfehfelusyjmgr.R.inc(23865);mw.visitVarInsn(ISTORE, context.var("seperator"));
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _after(MethodVisitor mw, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23866);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23867);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(23868);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23869);mw.visitVarInsn(ALOAD, 2); // obj
        __CLR4_5_2hfehfelusyjmgr.R.inc(23870);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23871);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "writeAfter",
                           "(L" + JSONSerializer + ";Ljava/lang/Object;C)C");
        __CLR4_5_2hfehfelusyjmgr.R.inc(23872);mw.visitVarInsn(ISTORE, context.var("seperator"));
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _notWriteDefault(MethodVisitor mw, FieldInfo property, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23873);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23874);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23875)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23876)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23877);return;
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(23878);Label elseLabel = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23879);mw.visitVarInsn(ILOAD, context.var("notWriteDefaultValue"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(23880);mw.visitJumpInsn(IFEQ, elseLabel);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23881);Class<?> propertyClass = property.fieldClass;
        __CLR4_5_2hfehfelusyjmgr.R.inc(23882);if ((((propertyClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23883)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23884)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23885);mw.visitVarInsn(ILOAD, context.var("boolean"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23886);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23887);if ((((propertyClass == byte.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23888)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23889)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23890);mw.visitVarInsn(ILOAD, context.var("byte"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23891);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23892);if ((((propertyClass == short.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23893)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23894)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23895);mw.visitVarInsn(ILOAD, context.var("short"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23896);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23897);if ((((propertyClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23898)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23899)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23900);mw.visitVarInsn(ILOAD, context.var("int"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23901);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23902);if ((((propertyClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23903)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23904)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23905);mw.visitVarInsn(LLOAD, context.var("long"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23906);mw.visitInsn(LCONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23907);mw.visitInsn(LCMP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23908);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23909);if ((((propertyClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23910)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23911)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23912);mw.visitVarInsn(FLOAD, context.var("float"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23913);mw.visitInsn(FCONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23914);mw.visitInsn(FCMPL);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23915);mw.visitJumpInsn(IFEQ, _end);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23916);if ((((propertyClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23917)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23918)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23919);mw.visitVarInsn(DLOAD, context.var("double"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23920);mw.visitInsn(DCONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23921);mw.visitInsn(DCMPL);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23922);mw.visitJumpInsn(IFEQ, _end);
        }

        }}}}}}}__CLR4_5_2hfehfelusyjmgr.R.inc(23923);mw.visitLabel(elseLabel);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _apply(MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23924);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23925);Class<?> propertyClass = property.fieldClass;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23926);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(23927);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23928);mw.visitVarInsn(ALOAD, Context.obj);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23929);mw.visitVarInsn(ALOAD, Context.fieldName);

        __CLR4_5_2hfehfelusyjmgr.R.inc(23930);if ((((propertyClass == byte.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23931)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23932)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23933);mw.visitVarInsn(ILOAD, context.var("byte"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23934);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23935);if ((((propertyClass == short.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23936)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23937)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23938);mw.visitVarInsn(ILOAD, context.var("short"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23939);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23940);if ((((propertyClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23941)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23942)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23943);mw.visitVarInsn(ILOAD, context.var("int"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23944);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23945);if ((((propertyClass == char.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23946)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23947)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23948);mw.visitVarInsn(ILOAD, context.var("char"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23949);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23950);if ((((propertyClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23951)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23952)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23953);mw.visitVarInsn(LLOAD, context.var("long", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23954);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23955);if ((((propertyClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23956)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23957)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23958);mw.visitVarInsn(FLOAD, context.var("float"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23959);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23960);if ((((propertyClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23961)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23962)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23963);mw.visitVarInsn(DLOAD, context.var("double", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23964);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23965);if ((((propertyClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23966)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23967)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23968);mw.visitVarInsn(ILOAD, context.var("boolean"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23969);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23970);if ((((propertyClass == BigDecimal.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23971)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23972)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23973);mw.visitVarInsn(ALOAD, context.var("decimal"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23974);if ((((propertyClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23975)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23976)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23977);mw.visitVarInsn(ALOAD, context.var("string"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23978);if ((((propertyClass.isEnum())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23979)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23980)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23981);mw.visitVarInsn(ALOAD, context.var("enum"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(23982);if ((((List.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23983)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23984)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23985);mw.visitVarInsn(ALOAD, context.var("list"));
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23986);mw.visitVarInsn(ALOAD, context.var("object"));
        }
        }}}}}}}}}}}}__CLR4_5_2hfehfelusyjmgr.R.inc(23987);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer,
                           "apply", "(L" + JSONSerializer
                                    + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z");
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _processValue(MethodVisitor mw, FieldInfo fieldInfo, Context context, Label _end) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(23988);
        __CLR4_5_2hfehfelusyjmgr.R.inc(23989);Label processKeyElse_ = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(23990);Class<?> fieldClass = fieldInfo.fieldClass;

        __CLR4_5_2hfehfelusyjmgr.R.inc(23991);if ((((fieldClass.isPrimitive())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(23992)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(23993)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(23994);Label checkValueEnd_ = new Label();
            __CLR4_5_2hfehfelusyjmgr.R.inc(23995);mw.visitVarInsn(ILOAD, context.var("checkValue"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(23996);mw.visitJumpInsn(IFNE, checkValueEnd_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(23997);mw.visitInsn(ACONST_NULL);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23998);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(23999);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24000);mw.visitVarInsn(ASTORE, Context.processValue);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24001);mw.visitJumpInsn(GOTO, processKeyElse_);

            __CLR4_5_2hfehfelusyjmgr.R.inc(24002);mw.visitLabel(checkValueEnd_);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(24003);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24004);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24005);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24006);mw.visitLdcInsn(context.getFieldOrinal(fieldInfo.name));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24007);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "getBeanContext", "(I)" + desc(BeanContext.class));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24008);mw.visitVarInsn(ALOAD, Context.obj);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24009);mw.visitVarInsn(ALOAD, Context.fieldName);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24010);String valueDesc = "Ljava/lang/Object;";
        __CLR4_5_2hfehfelusyjmgr.R.inc(24011);if ((((fieldClass == byte.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24012)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24013)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24014);mw.visitVarInsn(ILOAD, context.var("byte"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24015);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24016);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24017);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24018);if ((((fieldClass == short.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24019)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24020)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24021);mw.visitVarInsn(ILOAD, context.var("short"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24022);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24023);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24024);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24025);if ((((fieldClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24026)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24027)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24028);mw.visitVarInsn(ILOAD, context.var("int"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24029);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24030);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24031);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24032);if ((((fieldClass == char.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24033)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24034)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24035);mw.visitVarInsn(ILOAD, context.var("char"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24036);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24037);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24038);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24039);if ((((fieldClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24040)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24041)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24042);mw.visitVarInsn(LLOAD, context.var("long", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24043);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24044);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24045);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24046);if ((((fieldClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24047)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24048)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24049);mw.visitVarInsn(FLOAD, context.var("float"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24050);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24051);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24052);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24053);if ((((fieldClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24054)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24055)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24056);mw.visitVarInsn(DLOAD, context.var("double", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24057);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24058);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24059);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24060);if ((((fieldClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24061)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24062)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24063);mw.visitVarInsn(ILOAD, context.var("boolean"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24064);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24065);mw.visitInsn(DUP);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24066);mw.visitVarInsn(ASTORE, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24067);if ((((fieldClass == BigDecimal.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24068)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24069)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24070);mw.visitVarInsn(ALOAD, context.var("decimal"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24071);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24072);mw.visitVarInsn(ALOAD, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24073);if ((((fieldClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24074)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24075)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24076);mw.visitVarInsn(ALOAD, context.var("string"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24077);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24078);mw.visitVarInsn(ALOAD, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24079);if ((((fieldClass.isEnum())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24080)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24081)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24082);mw.visitVarInsn(ALOAD, context.var("enum"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24083);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24084);mw.visitVarInsn(ALOAD, Context.original);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24085);if ((((List.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24086)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24087)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24088);mw.visitVarInsn(ALOAD, context.var("list"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24089);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24090);mw.visitVarInsn(ALOAD, Context.original);
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24091);mw.visitVarInsn(ALOAD, context.var("object"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24092);mw.visitVarInsn(ASTORE, Context.original);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24093);mw.visitVarInsn(ALOAD, Context.original);
        }

        }}}}}}}}}}}}__CLR4_5_2hfehfelusyjmgr.R.inc(24094);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer, "processValue",
                           "(L" + JSONSerializer  + ";" //
                                                                          + desc(BeanContext.class) //
                                                                          + "Ljava/lang/Object;Ljava/lang/String;" //
                                                                          + valueDesc + ")Ljava/lang/Object;Ljava/lang/Integer;");

        __CLR4_5_2hfehfelusyjmgr.R.inc(24095);mw.visitVarInsn(ASTORE, Context.processValue);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24096);mw.visitVarInsn(ALOAD, Context.original);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24097);mw.visitVarInsn(ALOAD, Context.processValue);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24098);mw.visitJumpInsn(IF_ACMPEQ, processKeyElse_);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24099);_writeObject(mw, fieldInfo, context, _end);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24100);mw.visitJumpInsn(GOTO, _end);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24101);mw.visitLabel(processKeyElse_);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _processKey(MethodVisitor mw, FieldInfo property, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24102);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24103);Label _else_processKey = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(24104);mw.visitVarInsn(ILOAD, context.var("hasNameFilters"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24105);mw.visitJumpInsn(IFEQ, _else_processKey);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24106);Class<?> propertyClass = property.fieldClass;

        __CLR4_5_2hfehfelusyjmgr.R.inc(24107);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24108);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24109);mw.visitVarInsn(ALOAD, Context.obj);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24110);mw.visitVarInsn(ALOAD, Context.fieldName);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24111);if ((((propertyClass == byte.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24112)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24113)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24114);mw.visitVarInsn(ILOAD, context.var("byte"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24115);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24116);if ((((propertyClass == short.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24117)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24118)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24119);mw.visitVarInsn(ILOAD, context.var("short"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24120);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24121);if ((((propertyClass == int.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24122)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24123)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24124);mw.visitVarInsn(ILOAD, context.var("int"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24125);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24126);if ((((propertyClass == char.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24127)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24128)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24129);mw.visitVarInsn(ILOAD, context.var("char"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24130);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24131);if ((((propertyClass == long.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24132)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24133)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24134);mw.visitVarInsn(LLOAD, context.var("long", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24135);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24136);if ((((propertyClass == float.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24137)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24138)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24139);mw.visitVarInsn(FLOAD, context.var("float"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24140);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24141);if ((((propertyClass == double.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24142)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24143)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24144);mw.visitVarInsn(DLOAD, context.var("double", 2));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24145);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24146);if ((((propertyClass == boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24147)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24148)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24149);mw.visitVarInsn(ILOAD, context.var("boolean"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24150);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24151);if ((((propertyClass == BigDecimal.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24152)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24153)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24154);mw.visitVarInsn(ALOAD, context.var("decimal"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24155);if ((((propertyClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24156)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24157)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24158);mw.visitVarInsn(ALOAD, context.var("string"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24159);if ((((propertyClass.isEnum())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24160)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24161)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24162);mw.visitVarInsn(ALOAD, context.var("enum"));
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24163);if ((((List.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24164)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24165)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24166);mw.visitVarInsn(ALOAD, context.var("list"));
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24167);mw.visitVarInsn(ALOAD, context.var("object"));
        }

        }}}}}}}}}}}}__CLR4_5_2hfehfelusyjmgr.R.inc(24168);mw.visitMethodInsn(INVOKEVIRTUAL, JavaBeanSerializer,
                           "processKey", "(L" + JSONSerializer
                                         + ";Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;");

        __CLR4_5_2hfehfelusyjmgr.R.inc(24169);mw.visitVarInsn(ASTORE, Context.fieldName);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24170);mw.visitLabel(_else_processKey);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _if_write_null(MethodVisitor mw, FieldInfo fieldInfo, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24171);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24172);Class<?> propertyClass = fieldInfo.fieldClass;

        __CLR4_5_2hfehfelusyjmgr.R.inc(24173);Label _if = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24174);Label _else = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24175);Label _write_null = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24176);Label _end_if = new Label();

        __CLR4_5_2hfehfelusyjmgr.R.inc(24177);mw.visitLabel(_if);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24178);JSONField annotation = fieldInfo.getAnnotation();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24179);int features = 0;
        __CLR4_5_2hfehfelusyjmgr.R.inc(24180);if ((((annotation != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24181)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24182)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24183);features = SerializerFeature.of(annotation.serialzeFeatures());
        }
        }__CLR4_5_2hfehfelusyjmgr.R.inc(24184);JSONType jsonType = context.beanInfo.jsonType;
        __CLR4_5_2hfehfelusyjmgr.R.inc(24185);if ((((jsonType != null)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24186)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24187)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24188);features |= SerializerFeature.of(jsonType.serialzeFeatures());
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(24189);int writeNullFeatures;
        __CLR4_5_2hfehfelusyjmgr.R.inc(24190);if ((((propertyClass == String.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24191)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24192)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24193);writeNullFeatures = SerializerFeature.WriteMapNullValue.getMask()
                    | SerializerFeature.WriteNullStringAsEmpty.getMask();
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24194);if ((((Number.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24195)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24196)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24197);writeNullFeatures = SerializerFeature.WriteMapNullValue.getMask()
                    | SerializerFeature.WriteNullNumberAsZero.getMask();
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24198);if ((((Collection.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24199)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24200)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24201);writeNullFeatures = SerializerFeature.WriteMapNullValue.getMask()
                    | SerializerFeature.WriteNullListAsEmpty.getMask();
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24202);if ((((Boolean.class == propertyClass)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24203)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24204)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24205);writeNullFeatures = SerializerFeature.WriteMapNullValue.getMask()
                    | SerializerFeature.WriteNullBooleanAsFalse.getMask();
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24206);writeNullFeatures = SerializerFeature.WRITE_MAP_NULL_FEATURES;
        }

        }}}}__CLR4_5_2hfehfelusyjmgr.R.inc(24207);if (((((features & writeNullFeatures) == 0)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24208)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24209)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24210);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24211);mw.visitLdcInsn(writeNullFeatures);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24212);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "isEnabled", "(I)Z");
            __CLR4_5_2hfehfelusyjmgr.R.inc(24213);mw.visitJumpInsn(IFEQ, _else);
        }

        }__CLR4_5_2hfehfelusyjmgr.R.inc(24214);mw.visitLabel(_write_null);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24215);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24216);mw.visitVarInsn(ILOAD, context.var("seperator"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24217);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "write", "(I)V");

        __CLR4_5_2hfehfelusyjmgr.R.inc(24218);_writeFieldName(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24219);mw.visitVarInsn(ALOAD, context.var("out"));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24220);mw.visitLdcInsn(features);
        // features

        __CLR4_5_2hfehfelusyjmgr.R.inc(24221);if ((((propertyClass == String.class || propertyClass == Character.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24222)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24223)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24224);mw.visitLdcInsn(SerializerFeature.WriteNullStringAsEmpty.mask);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24225);if ((((Number.class.isAssignableFrom(propertyClass))&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24226)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24227)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24228);mw.visitLdcInsn(SerializerFeature.WriteNullNumberAsZero.mask);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24229);if ((((propertyClass == Boolean.class)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24230)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24231)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24232);mw.visitLdcInsn(SerializerFeature.WriteNullBooleanAsFalse.mask);
        } }else {__CLR4_5_2hfehfelusyjmgr.R.inc(24233);if ((((Collection.class.isAssignableFrom(propertyClass) || propertyClass.isArray())&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24234)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24235)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24236);mw.visitLdcInsn(SerializerFeature.WriteNullListAsEmpty.mask);
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24237);mw.visitLdcInsn(0);
        }
        }}}}__CLR4_5_2hfehfelusyjmgr.R.inc(24238);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeNull", "(II)V");

        // seperator = ',';
        __CLR4_5_2hfehfelusyjmgr.R.inc(24239);_seperator(mw, context);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24240);mw.visitJumpInsn(GOTO, _end_if);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24241);mw.visitLabel(_else);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24242);mw.visitLabel(_end_if);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _writeFieldName(MethodVisitor mw, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24243);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24244);if ((((context.writeDirect)&&(__CLR4_5_2hfehfelusyjmgr.R.iget(24245)!=0|true))||(__CLR4_5_2hfehfelusyjmgr.R.iget(24246)==0&false))) {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24247);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24248);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24249);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldNameDirect", "(Ljava/lang/String;)V");
        } }else {{
            __CLR4_5_2hfehfelusyjmgr.R.inc(24250);mw.visitVarInsn(ALOAD, context.var("out"));
            __CLR4_5_2hfehfelusyjmgr.R.inc(24251);mw.visitVarInsn(ALOAD, Context.fieldName);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24252);mw.visitInsn(ICONST_0);
            __CLR4_5_2hfehfelusyjmgr.R.inc(24253);mw.visitMethodInsn(INVOKEVIRTUAL, SerializeWriter, "writeFieldName", "(Ljava/lang/String;Z)V");
        }
    }}finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _seperator(MethodVisitor mw, Context context) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24254);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24255);mw.visitVarInsn(BIPUSH, ',');
        __CLR4_5_2hfehfelusyjmgr.R.inc(24256);mw.visitVarInsn(ISTORE, context.var("seperator"));
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _getListFieldItemSer(Context context, MethodVisitor mw, FieldInfo fieldInfo, Class<?> itemType) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24257);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24258);Label notNull_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24259);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24260);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_list_item_ser_",
                          ObjectSerializer_desc);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24261);mw.visitJumpInsn(IFNONNULL, notNull_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24262);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(24263);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24264);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(itemType)));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24265);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "getObjectWriter",
                           "(Ljava/lang/Class;)" + ObjectSerializer_desc);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24266);mw.visitFieldInsn(PUTFIELD, context.className, fieldInfo.name + "_asm_list_item_ser_",
                          ObjectSerializer_desc);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24267);mw.visitLabel(notNull_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24268);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24269);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_list_item_ser_",
                          ObjectSerializer_desc);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}

    private void _getFieldSer(Context context, MethodVisitor mw, FieldInfo fieldInfo) {try{__CLR4_5_2hfehfelusyjmgr.R.inc(24270);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24271);Label notNull_ = new Label();
        __CLR4_5_2hfehfelusyjmgr.R.inc(24272);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24273);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_ser_", ObjectSerializer_desc);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24274);mw.visitJumpInsn(IFNONNULL, notNull_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24275);mw.visitVarInsn(ALOAD, 0); // this
        __CLR4_5_2hfehfelusyjmgr.R.inc(24276);mw.visitVarInsn(ALOAD, Context.serializer);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24277);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldInfo.fieldClass)));
        __CLR4_5_2hfehfelusyjmgr.R.inc(24278);mw.visitMethodInsn(INVOKEVIRTUAL, JSONSerializer, "getObjectWriter",
                           "(Ljava/lang/Class;)" + ObjectSerializer_desc);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24279);mw.visitFieldInsn(PUTFIELD, context.className, fieldInfo.name + "_asm_ser_", ObjectSerializer_desc);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24280);mw.visitLabel(notNull_);

        __CLR4_5_2hfehfelusyjmgr.R.inc(24281);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2hfehfelusyjmgr.R.inc(24282);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_ser_", ObjectSerializer_desc);
    }finally{__CLR4_5_2hfehfelusyjmgr.R.flushNeeded();}}
}
