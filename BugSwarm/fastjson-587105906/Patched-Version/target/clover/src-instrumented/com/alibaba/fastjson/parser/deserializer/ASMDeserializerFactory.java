/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.parser.deserializer;

import static com.alibaba.fastjson.util.ASMUtils.desc;
import static com.alibaba.fastjson.util.ASMUtils.type;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;

import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.FieldWriter;
import com.alibaba.fastjson.asm.Label;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.DefaultJSONParser.ResolveTask;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.JSONLexer;
import com.alibaba.fastjson.parser.JSONLexerBase;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.parser.ParseContext;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.SymbolTable;
import com.alibaba.fastjson.util.ASMClassLoader;
import com.alibaba.fastjson.util.FieldInfo;
import com.alibaba.fastjson.util.JavaBeanInfo;
import com.alibaba.fastjson.util.TypeUtils;

public class ASMDeserializerFactory implements Opcodes {public static class __CLR4_5_2d9hd9hlusvmqfw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,18688,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public final ASMClassLoader classLoader;
    protected final AtomicLong  seed              = new AtomicLong();

    final static String         DefaultJSONParser = type(DefaultJSONParser.class);
    final static String         JSONLexerBase     = type(JSONLexerBase.class);

    public ASMDeserializerFactory(ClassLoader parentClassLoader){try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17189);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17190);classLoader = (((parentClassLoader instanceof ASMClassLoader //
            )&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17191)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17192)==0&false))? (ASMClassLoader) parentClassLoader //
            : new ASMClassLoader(parentClassLoader);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}
    
    public ObjectDeserializer createJavaBeanDeserializer(ParserConfig config, JavaBeanInfo beanInfo) throws Exception {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17193);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17194);Class<?> clazz = beanInfo.clazz;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17195);if ((((clazz.isPrimitive())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17196)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17197)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17198);throw new IllegalArgumentException("not support type :" + clazz.getName());
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17199);String className = "FastjsonASMDeserializer_" + seed.incrementAndGet() + "_" + clazz.getSimpleName();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17200);String classNameType;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17201);String classNameFull;

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17202);Package pkg = ASMDeserializerFactory.class.getPackage();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17203);if ((((pkg != null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17204)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17205)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17206);String packageName = pkg.getName();
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17207);classNameType = packageName.replace('.', '/') + "/" + className;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17208);classNameFull = packageName + "." + className;
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17209);classNameType = className;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17210);classNameFull = className;
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17211);ClassWriter cw = new ClassWriter();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17212);cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, classNameType, type(JavaBeanDeserializer.class), null);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17213);_init(cw, new Context(classNameType, config, beanInfo, 3));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17214);_createInstance(cw, new Context(classNameType, config, beanInfo, 3));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17215);_deserialze(cw, new Context(classNameType, config, beanInfo, 5));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17216);_deserialzeArrayMapping(cw, new Context(classNameType, config, beanInfo, 4));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17217);byte[] code = cw.toByteArray();

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17218);Class<?> deserClass = classLoader.defineClassPublic(classNameFull, code, 0, code.length);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17219);Constructor<?> constructor = deserClass.getConstructor(ParserConfig.class, JavaBeanInfo.class);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17220);Object instance = constructor.newInstance(config, beanInfo);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17221);return (ObjectDeserializer) instance;
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _setFlag(MethodVisitor mw, Context context, int i) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17222);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17223);String varName = "_asm_flag_" + (i / 32);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17224);mw.visitVarInsn(ILOAD, context.var(varName));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17225);mw.visitLdcInsn(1 << i);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17226);mw.visitInsn(IOR);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17227);mw.visitVarInsn(ISTORE, context.var(varName));
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _isFlag(MethodVisitor mw, Context context, int i, Label label) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17228);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17229);mw.visitVarInsn(ILOAD, context.var("_asm_flag_" + (i / 32)));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17230);mw.visitLdcInsn(1 << i);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17231);mw.visitInsn(IAND);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17232);mw.visitJumpInsn(IFEQ, label);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserialzeArrayMapping(ClassWriter cw, Context context) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17233);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17234);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "deserialzeArrayMapping",
                                            "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;",
                                            null, null);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17235);defineVarLexer(context, mw);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17236);_createInstance(context, mw);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17237);FieldInfo[] sortedFieldInfoList = context.beanInfo.sortedFields;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17238);int fieldListSize = sortedFieldInfoList.length;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17239);for (int i = 0; (((i < fieldListSize)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17240)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17241)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17242);final boolean last = (i == fieldListSize - 1);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17243);final char seperator = (((last )&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17244)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17245)==0&false))? ']' : ',';

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17246);FieldInfo fieldInfo = sortedFieldInfoList[i];
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17247);Class<?> fieldClass = fieldInfo.fieldClass;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17248);Type fieldType = fieldInfo.fieldType;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17249);if ((((fieldClass == byte.class //
                || fieldClass == short.class //
                || fieldClass == int.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17250)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17251)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17252);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17253);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17254);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanInt", "(C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17255);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17256);if ((((fieldClass == Byte.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17257)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17258)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17259);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17260);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17261);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanInt", "(C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17262);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17263);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17264);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17265);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17266);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17267);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17268);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17269);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17270);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17271);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17272);if ((((fieldClass == Short.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17273)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17274)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17275);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17276);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17277);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanInt", "(C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17278);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17279);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17280);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17281);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17282);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17283);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17284);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17285);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17286);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17287);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17288);if ((((fieldClass == Integer.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17289)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17290)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17291);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17292);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17293);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanInt", "(C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17294);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17295);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17296);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17297);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17298);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17299);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17300);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17301);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17302);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17303);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17304);if ((((fieldClass == long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17305)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17306)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17307);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17308);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17309);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanLong", "(C)J");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17310);mw.visitVarInsn(LSTORE, context.var(fieldInfo.name + "_asm", 2));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17311);if ((((fieldClass == Long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17312)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17313)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17314);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17315);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17316);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanLong", "(C)J");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17317);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17318);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17319);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17320);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17321);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17322);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17323);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17324);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17325);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17326);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17327);if ((((fieldClass == boolean.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17328)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17329)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17330);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17331);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17332);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanBoolean", "(C)Z");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17333);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17334);if ((((fieldClass == float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17335)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17336)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17337);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17338);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17339);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFloat", "(C)F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17340);mw.visitVarInsn(FSTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17341);if ((((fieldClass == Float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17342)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17343)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17344);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17345);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17346);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFloat", "(C)F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17347);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17348);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17349);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17350);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17351);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17352);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17353);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17354);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17355);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17356);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17357);if ((((fieldClass == double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17358)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17359)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17360);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17361);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17362);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanDouble", "(C)D");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17363);mw.visitVarInsn(DSTORE, context.var(fieldInfo.name + "_asm", 2));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17364);if ((((fieldClass == Double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17365)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17366)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17367);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17368);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17369);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanDouble", "(C)D");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17370);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17371);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17372);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17373);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17374);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17375);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17376);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17377);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17378);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17379);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17380);if ((((fieldClass == char.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17381)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17382)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17383);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17384);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17385);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17386);mw.visitInsn(ICONST_0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17387);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "charAt", "(I)C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17388);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17389);if ((((fieldClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17390)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17391)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17392);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17393);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17394);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanString", "(C)Ljava/lang/String;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17395);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17396);if ((((fieldClass == BigDecimal.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17397)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17398)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17399);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17400);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17401);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanDecimal", "(C)Ljava/math/BigDecimal;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17402);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17403);if ((((fieldClass == java.util.Date.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17404)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17405)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17406);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17407);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17408);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanDate", "(C)Ljava/util/Date;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17409);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17410);if ((((fieldClass == java.util.UUID.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17411)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17412)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17413);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17414);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17415);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanUUID", "(C)Ljava/util/UUID;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17416);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17417);if ((((fieldClass.isEnum())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17418)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17419)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17420);Label enumNumIf_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17421);Label enumNumErr_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17422);Label enumStore_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17423);Label enumQuote_ = new Label();

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17424);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17425);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17426);mw.visitInsn(DUP);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17427);mw.visitVarInsn(ISTORE, context.var("ch"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17428);mw.visitLdcInsn((int) 'n');
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17429);mw.visitJumpInsn(IF_ICMPEQ, enumQuote_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17430);mw.visitVarInsn(ILOAD, context.var("ch"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17431);mw.visitLdcInsn((int) '\"');
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17432);mw.visitJumpInsn(IF_ICMPNE, enumNumIf_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17433);mw.visitLabel(enumQuote_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17434);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17435);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass)));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17436);mw.visitVarInsn(ALOAD, 1);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17437);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getSymbolTable", "()" + desc(SymbolTable.class));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17438);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17439);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanEnum",
                                   "(Ljava/lang/Class;" + desc(SymbolTable.class) + "C)Ljava/lang/Enum;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17440);mw.visitJumpInsn(GOTO, enumStore_);

                // (ch >= '0' && ch <= '9') {
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17441);mw.visitLabel(enumNumIf_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17442);mw.visitVarInsn(ILOAD, context.var("ch"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17443);mw.visitLdcInsn((int) '0');
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17444);mw.visitJumpInsn(IF_ICMPLT, enumNumErr_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17445);mw.visitVarInsn(ILOAD, context.var("ch"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17446);mw.visitLdcInsn((int) '9');
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17447);mw.visitJumpInsn(IF_ICMPGT, enumNumErr_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17448);_getFieldDeser(context, mw, fieldInfo);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17449);mw.visitTypeInsn(CHECKCAST, type(EnumDeserializer.class)); // cast
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17450);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17451);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17452);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanInt", "(C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17453);mw.visitMethodInsn(INVOKEVIRTUAL, type(EnumDeserializer.class), "valueOf", "(I)Ljava/lang/Enum;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17454);mw.visitJumpInsn(GOTO, enumStore_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17455);mw.visitLabel(enumNumErr_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17456);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17457);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17458);mw.visitVarInsn(BIPUSH, seperator);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17459);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "scanEnum",
                                   "(L" + JSONLexerBase + ";C)Ljava/lang/Enum;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17460);mw.visitLabel(enumStore_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17461);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17462);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17463);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17464)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17465)==0&false))) {{
                
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17466);Class<?> itemClass = TypeUtils.getCollectionItemClass(fieldType);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17467);if ((((itemClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17468)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17469)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17470);if ((((fieldClass == List.class
                            || fieldClass == Collections.class
                            || fieldClass == ArrayList.class
                    )&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17471)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17472)==0&false))) {{
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17473);mw.visitTypeInsn(NEW, type(ArrayList.class));
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17474);mw.visitInsn(DUP);
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17475);mw.visitMethodInsn(INVOKESPECIAL, type(ArrayList.class), "<init>", "()V");
                    } }else {{
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17476);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass)));
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17477);mw.visitMethodInsn(INVOKESTATIC, type(TypeUtils.class), "createCollection",
                                           "(Ljava/lang/Class;)Ljava/util/Collection;");
                    }
                    }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17478);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                    
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17479);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17480);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17481);mw.visitVarInsn(BIPUSH, seperator);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17482);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanStringArray", "(Ljava/util/Collection;C)V");
                    
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17483);Label valueNullEnd_ = new Label();
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17484);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17485);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17486);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17487);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17488);mw.visitInsn(ACONST_NULL);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17489);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                    
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17490);mw.visitLabel(valueNullEnd_);
                    
                } }else {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17491);Label notError_ = new Label();
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17492);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17493);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17494);mw.visitVarInsn(ISTORE, context.var("token"));

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17495);mw.visitVarInsn(ILOAD, context.var("token"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17496);int token = (((i == 0 )&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17497)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17498)==0&false))? JSONToken.LBRACKET : JSONToken.COMMA;
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17499);mw.visitLdcInsn(token);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17500);mw.visitJumpInsn(IF_ICMPEQ, notError_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17501);mw.visitVarInsn(ALOAD, 1); // DefaultJSONParser
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17502);mw.visitLdcInsn(token);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17503);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "throwException", "(I)V");

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17504);mw.visitLabel(notError_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17505);Label quickElse_ = new Label(), quickEnd_ = new Label();
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17506);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17507);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17508);mw.visitVarInsn(BIPUSH, '[');
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17509);mw.visitJumpInsn(IF_ICMPNE, quickElse_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17510);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17511);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17512);mw.visitInsn(POP);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17513);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17514);mw.visitLdcInsn(JSONToken.LBRACKET);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17515);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17516);mw.visitJumpInsn(GOTO, quickEnd_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17517);mw.visitLabel(quickElse_);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17518);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17519);mw.visitLdcInsn(JSONToken.LBRACKET);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17520);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17521);mw.visitLabel(quickEnd_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17522);_newCollection(mw, fieldClass, i, false);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17523);mw.visitInsn(DUP);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17524);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17525);_getCollectionFieldItemDeser(context, mw, fieldInfo, itemClass);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17526);mw.visitVarInsn(ALOAD, 1);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17527);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(itemClass)));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17528);mw.visitVarInsn(ALOAD, 3);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17529);mw.visitMethodInsn(INVOKESTATIC, type(JavaBeanDeserializer.class),
                                       "parseArray",
                                       "(Ljava/util/Collection;" //
                                                     + desc(ObjectDeserializer.class) //
                                                     + "L" + DefaultJSONParser + ";" //
                                                     + "Ljava/lang/reflect/Type;Ljava/lang/Object;)V");
                }
            }} }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17530);if ((((fieldClass.isArray())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17531)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17532)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17533);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17534);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONToken.LBRACKET);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17535);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17536);mw.visitVarInsn(ALOAD, Context.parser);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17537);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17538);mw.visitLdcInsn(i);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17539);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "getFieldType",
                                   "(I)Ljava/lang/reflect/Type;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17540);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "parseObject",
                                   "(Ljava/lang/reflect/Type;)Ljava/lang/Object;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17541);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17542);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17543);Label objElseIf_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17544);Label objEndIf_ = new Label();

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17545);if ((((fieldClass == java.util.Date.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17546)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17547)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17548);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17549);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17550);mw.visitLdcInsn((int) '1');
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17551);mw.visitJumpInsn(IF_ICMPNE, objElseIf_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17552);mw.visitTypeInsn(NEW, type(java.util.Date.class));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17553);mw.visitInsn(DUP);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17554);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17555);mw.visitVarInsn(BIPUSH, seperator);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17556);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanLong", "(C)J");

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17557);mw.visitMethodInsn(INVOKESPECIAL, type(java.util.Date.class), "<init>", "(J)V");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17558);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17559);mw.visitJumpInsn(GOTO, objEndIf_);
                }

                }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17560);mw.visitLabel(objElseIf_);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17561);_quickNextToken(context, mw, JSONToken.LBRACKET);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17562);_deserObject(context, mw, fieldInfo, fieldClass, i);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17563);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17564);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17565);mw.visitLdcInsn(JSONToken.RBRACKET);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17566);mw.visitJumpInsn(IF_ICMPEQ, objEndIf_);
//                mw.visitInsn(POP);
//                mw.visitInsn(POP);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17567);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17568);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17569);if ((((!last)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17570)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17571)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17572);mw.visitLdcInsn(JSONToken.COMMA);
                } }else {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17573);mw.visitLdcInsn(JSONToken.RBRACKET);
                }
                }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17574);mw.visitMethodInsn(INVOKESPECIAL, //
                                   type(JavaBeanDeserializer.class), //
                                   "check", "(" + desc(JSONLexer.class) + "I)V");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17575);mw.visitLabel(objEndIf_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17576);continue;
            }
        }}}}}}}}}}}}}}}}}}}}

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17577);_batchSet(context, mw, false);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17578);Label quickElse_ = new Label(), quickElseIf_ = new Label(), quickElseIfEOI_ = new Label(),
                quickEnd_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17579);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17580);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17581);mw.visitInsn(DUP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17582);mw.visitVarInsn(ISTORE, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17583);mw.visitVarInsn(BIPUSH, ',');
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17584);mw.visitJumpInsn(IF_ICMPNE, quickElseIf_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17585);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17586);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17587);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17588);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17589);mw.visitLdcInsn(JSONToken.COMMA);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17590);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17591);mw.visitJumpInsn(GOTO, quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17592);mw.visitLabel(quickElseIf_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17593);mw.visitVarInsn(ILOAD, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17594);mw.visitVarInsn(BIPUSH, ']');
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17595);mw.visitJumpInsn(IF_ICMPNE, quickElseIfEOI_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17596);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17597);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17598);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17599);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17600);mw.visitLdcInsn(JSONToken.RBRACKET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17601);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17602);mw.visitJumpInsn(GOTO, quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17603);mw.visitLabel(quickElseIfEOI_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17604);mw.visitVarInsn(ILOAD, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17605);mw.visitVarInsn(BIPUSH, (char) JSONLexer.EOI);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17606);mw.visitJumpInsn(IF_ICMPNE, quickElse_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17607);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17608);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17609);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17610);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17611);mw.visitLdcInsn(JSONToken.EOF);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17612);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17613);mw.visitJumpInsn(GOTO, quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17614);mw.visitLabel(quickElse_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17615);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17616);mw.visitLdcInsn(JSONToken.COMMA);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17617);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17618);mw.visitLabel(quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17619);mw.visitVarInsn(ALOAD, context.var("instance"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17620);mw.visitInsn(ARETURN);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17621);mw.visitMaxs(5, context.variantIndex);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17622);mw.visitEnd();
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserialze(ClassWriter cw, Context context) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(17623);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17624);if ((((context.fieldInfoList.length == 0)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17625)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17626)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17627);return;
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17628);for (FieldInfo fieldInfo : context.fieldInfoList) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17629);Class<?> fieldClass = fieldInfo.fieldClass;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17630);Type fieldType = fieldInfo.fieldType;

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17631);if ((((fieldClass == char.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17632)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17633)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17634);return;
            }

            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17635);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17636)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17637)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17638);if ((((fieldType instanceof ParameterizedType)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17639)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17640)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17641);Type itemType = ((ParameterizedType) fieldType).getActualTypeArguments()[0];
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17642);if ((((itemType instanceof Class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17643)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17644)==0&false))) {{
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17645);continue;
                    } }else {{
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17646);return;
                    }
                }} }else {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17647);return;
                }
            }}
        }}

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17648);JavaBeanInfo beanInfo = context.beanInfo;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17649);context.fieldInfoList = beanInfo.sortedFields;

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17650);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "deserialze",
                                            "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;",
                                            null, null);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17651);Label reset_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17652);Label super_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17653);Label return_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17654);Label end_ = new Label();

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17655);defineVarLexer(context, mw);

        {
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17656);Label next_ = new Label();

            // isSupportArrayToBean

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17657);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17658);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17659);mw.visitLdcInsn(JSONToken.LBRACKET);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17660);mw.visitJumpInsn(IF_ICMPNE, next_);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17661);if (((((beanInfo.parserFeatures & Feature.SupportArrayToBean.mask) == 0)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17662)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17663)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17664);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17665);mw.visitVarInsn(ILOAD, 4);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17666);mw.visitLdcInsn(Feature.SupportArrayToBean.mask);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17667);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "isEnabled", "(II)Z");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17668);mw.visitJumpInsn(IFEQ, next_);
            }

            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17669);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17670);mw.visitVarInsn(ALOAD, Context.parser);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17671);mw.visitVarInsn(ALOAD, 2);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17672);mw.visitVarInsn(ALOAD, 3);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17673);mw.visitInsn(ACONST_NULL); //mw.visitVarInsn(ALOAD, 5);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17674);mw.visitMethodInsn(INVOKESPECIAL, //
                               context.className, //
                               "deserialzeArrayMapping", //
                               "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17675);mw.visitInsn(ARETURN);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17676);mw.visitLabel(next_);
            // deserialzeArrayMapping
        }

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17677);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17678);mw.visitLdcInsn(Feature.SortFeidFastMatch.mask);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17679);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "isEnabled", "(I)Z");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17680);mw.visitJumpInsn(IFEQ, super_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17681);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17682);mw.visitLdcInsn(context.clazz.getName());
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17683);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanType", "(Ljava/lang/String;)I");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17684);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.NOT_MATCH);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17685);mw.visitJumpInsn(IF_ICMPEQ, super_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17686);mw.visitVarInsn(ALOAD, 1); // parser
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17687);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getContext", "()" + desc(ParseContext.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17688);mw.visitVarInsn(ASTORE, context.var("mark_context"));

        // ParseContext context = parser.getContext();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17689);mw.visitInsn(ICONST_0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17690);mw.visitVarInsn(ISTORE, context.var("matchedCount"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17691);_createInstance(context, mw);

        {
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17692);mw.visitVarInsn(ALOAD, 1); // parser
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17693);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getContext", "()" + desc(ParseContext.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17694);mw.visitVarInsn(ASTORE, context.var("context"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17695);mw.visitVarInsn(ALOAD, 1); // parser
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17696);mw.visitVarInsn(ALOAD, context.var("context"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17697);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17698);mw.visitVarInsn(ALOAD, 3); // fieldName
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17699);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "setContext", //
                               "(" + desc(ParseContext.class) + "Ljava/lang/Object;Ljava/lang/Object;)"
                                                                               + desc(ParseContext.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17700);mw.visitVarInsn(ASTORE, context.var("childContext"));
        }

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17701);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17702);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17703);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.END);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17704);mw.visitJumpInsn(IF_ICMPEQ, return_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17705);mw.visitInsn(ICONST_0); // UNKOWN
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17706);mw.visitIntInsn(ISTORE, context.var("matchStat"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17707);int fieldListSize = context.fieldInfoList.length;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17708);for (int i = 0; (((i < fieldListSize)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17709)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17710)==0&false)); i += 32) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17711);mw.visitInsn(ICONST_0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17712);mw.visitVarInsn(ISTORE, context.var("_asm_flag_" + (i / 32)));
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17713);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17714);mw.visitLdcInsn(Feature.InitStringFieldAsEmpty.mask);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17715);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "isEnabled", "(I)Z");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17716);mw.visitIntInsn(ISTORE, context.var("initStringFieldAsEmpty"));

        // declare and init
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(17717);for (int i = 0; (((i < fieldListSize)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17718)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17719)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17720);FieldInfo fieldInfo = context.fieldInfoList[i];
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17721);Class<?> fieldClass = fieldInfo.fieldClass;

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17722);if ((((fieldClass == boolean.class //
                || fieldClass == byte.class //
                || fieldClass == short.class //
                || fieldClass == int.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17723)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17724)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17725);mw.visitInsn(ICONST_0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17726);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17727);if ((((fieldClass == long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17728)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17729)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17730);mw.visitInsn(LCONST_0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17731);mw.visitVarInsn(LSTORE, context.var(fieldInfo.name + "_asm", 2));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17732);if ((((fieldClass == float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17733)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17734)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17735);mw.visitInsn(FCONST_0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17736);mw.visitVarInsn(FSTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17737);if ((((fieldClass == double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17738)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17739)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17740);mw.visitInsn(DCONST_0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17741);mw.visitVarInsn(DSTORE, context.var(fieldInfo.name + "_asm", 2));
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17742);if ((((fieldClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17743)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17744)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17745);Label flagEnd_ = new Label();
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17746);Label flagElse_ = new Label();
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17747);mw.visitVarInsn(ILOAD, context.var("initStringFieldAsEmpty"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17748);mw.visitJumpInsn(IFEQ, flagElse_);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17749);_setFlag(mw, context, i);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17750);mw.visitVarInsn(ALOAD, context.var("lexer"));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17751);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "stringDefaultValue", "()Ljava/lang/String;");
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17752);mw.visitJumpInsn(GOTO, flagEnd_);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17753);mw.visitLabel(flagElse_);
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17754);mw.visitInsn(ACONST_NULL);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17755);mw.visitLabel(flagEnd_);
                } }else {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(17756);mw.visitInsn(ACONST_NULL);
                }

                }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17757);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17758);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            }
        }}}}}

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(17759);for (int i = 0; (((i < fieldListSize)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17760)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17761)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17762);FieldInfo fieldInfo = context.fieldInfoList[i];
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17763);Class<?> fieldClass = fieldInfo.fieldClass;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17764);Type fieldType = fieldInfo.fieldType;

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17765);Label notMatch_ = new Label();

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(17766);if ((((fieldClass == boolean.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17767)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17768)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17769);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17770);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17771);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17772);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldBoolean", "([C)Z");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17773);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17774);if ((((fieldClass == byte.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17775)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17776)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17777);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17778);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17779);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17780);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17781);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17782);if ((((fieldClass == Byte.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17783)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17784)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17785);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17786);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17787);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17788);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17789);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17790);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17791);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17792);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17793);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17794);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17795);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17796);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17797);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17798);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17799);if ((((fieldClass == short.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17800)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17801)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17802);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17803);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17804);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17805);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17806);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17807);if ((((fieldClass == Short.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17808)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17809)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17810);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17811);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17812);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17813);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17814);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17815);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17816);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17817);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17818);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17819);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17820);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17821);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17822);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17823);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17824);if ((((fieldClass == int.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17825)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17826)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17827);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17828);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17829);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17830);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17831);mw.visitVarInsn(ISTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17832);if ((((fieldClass == Integer.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17833)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17834)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17835);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17836);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17837);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17838);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldInt", "([C)I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17839);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17840);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17841);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17842);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17843);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17844);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17845);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17846);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17847);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17848);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17849);if ((((fieldClass == long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17850)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17851)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17852);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17853);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17854);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17855);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldLong", "([C)J");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17856);mw.visitVarInsn(LSTORE, context.var(fieldInfo.name + "_asm", 2));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17857);if ((((fieldClass == Long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17858)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17859)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17860);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17861);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17862);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17863);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldLong", "([C)J");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17864);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17865);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17866);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17867);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17868);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17869);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17870);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17871);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17872);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17873);mw.visitLabel(valueNullEnd_);

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17874);if ((((fieldClass == float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17875)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17876)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17877);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17878);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17879);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17880);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldFloat", "([C)F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17881);mw.visitVarInsn(FSTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17882);if ((((fieldClass == Float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17883)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17884)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17885);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17886);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17887);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17888);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldFloat", "([C)F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17889);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17890);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17891);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17892);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17893);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17894);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17895);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17896);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17897);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17898);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17899);if ((((fieldClass == double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17900)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17901)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17902);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17903);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17904);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17905);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldDouble", "([C)D");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17906);mw.visitVarInsn(DSTORE, context.var(fieldInfo.name + "_asm", 2));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17907);if ((((fieldClass == Double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17908)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17909)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17910);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17911);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17912);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17913);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldDouble", "([C)D");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17914);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17915);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17916);Label valueNullEnd_ = new Label();
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17917);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17918);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17919);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.VALUE_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17920);mw.visitJumpInsn(IF_ICMPNE, valueNullEnd_);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17921);mw.visitInsn(ACONST_NULL);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17922);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17923);mw.visitLabel(valueNullEnd_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17924);if ((((fieldClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17925)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17926)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17927);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17928);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17929);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17930);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldString", "([C)Ljava/lang/String;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17931);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17932);if ((((fieldClass == java.util.Date.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17933)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17934)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17935);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17936);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17937);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17938);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldDate", "([C)Ljava/util/Date;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17939);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17940);if ((((fieldClass == java.util.UUID.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17941)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17942)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17943);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17944);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17945);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17946);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldUUID", "([C)Ljava/util/UUID;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17947);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17948);if ((((fieldClass == BigDecimal.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17949)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17950)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17951);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17952);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17953);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17954);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldDecimal", "([C)Ljava/math/BigDecimal;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17955);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17956);if ((((fieldClass == BigInteger.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17957)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17958)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17959);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17960);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17961);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17962);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldBigInteger", "([C)Ljava/math/BigInteger;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17963);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17964);if ((((fieldClass == int[].class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17965)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17966)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17967);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17968);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17969);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17970);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldIntArray", "([C)[I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17971);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17972);if ((((fieldClass == float[].class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17973)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17974)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17975);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17976);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17977);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17978);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldFloatArray", "([C)[F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17979);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17980);if ((((fieldClass == float[][].class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17981)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17982)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17983);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17984);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17985);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17986);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldFloatArray2", "([C)[[F");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17987);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17988);if ((((fieldClass.isEnum())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17989)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(17990)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17991);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17992);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17993);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17994);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17995);_getFieldDeser(context, mw, fieldInfo);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17996);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "scanEnum"
                        , "(L" + JSONLexerBase + ";[C" + desc(ObjectDeserializer.class) + ")Ljava/lang/Enum;");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17997);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(17998);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

//            } else if (fieldClass.isEnum()) {
//                mw.visitVarInsn(ALOAD, context.var("lexer"));
//                mw.visitVarInsn(ALOAD, 0);
//                mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
//                Label enumNull_ = new Label();
//                mw.visitInsn(ACONST_NULL);
//                mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
//                mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
//
//                mw.visitVarInsn(ALOAD, 1);
//
//                mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getSymbolTable", "()" + desc(SymbolTable.class));
//
//                mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldSymbol",
//                        "([C" + desc(SymbolTable.class) + ")Ljava/lang/String;");
//                mw.visitInsn(DUP);
//                mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm_enumName"));
//
//                mw.visitJumpInsn(IFNULL, enumNull_);
//
//                mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm_enumName"));
//                mw.visitMethodInsn(INVOKEVIRTUAL, type(String.class), "length", "()I");
//                mw.visitJumpInsn(IFEQ, enumNull_);
//
//                mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm_enumName"));
//                mw.visitMethodInsn(INVOKESTATIC, type(fieldClass), "valueOf",
//                        "(Ljava/lang/String;)" + desc(fieldClass));
//                mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
//                mw.visitLabel(enumNull_);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(17999);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18000)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18001)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18002);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18003);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18004);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18005);Class<?> itemClass = TypeUtils.getCollectionItemClass(fieldType);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18006);if ((((itemClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18007)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18008)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18009);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldClass))); // cast
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18010);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "scanFieldStringArray",
                                       "([CLjava/lang/Class;)" + desc(Collection.class));
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18011);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
                } }else {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18012);_deserialze_list_obj(context, mw, reset_, fieldInfo, fieldClass, itemClass, i);

                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18013);if ((((i == fieldListSize - 1)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18014)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18015)==0&false))) {{
                        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18016);_deserialize_endCheck(context, mw, reset_);
                    }
                    }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18017);continue;
                }
            }} }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18018);_deserialze_obj(context, mw, reset_, fieldInfo, fieldClass, i);

                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18019);if ((((i == fieldListSize - 1)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18020)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18021)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18022);_deserialize_endCheck(context, mw, reset_);
                }

                }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18023);continue;
            }

            }}}}}}}}}}}}}}}}}}}}}}}__CLR4_5_2d9hd9hlusvmqfw.R.inc(18024);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18025);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18026);Label flag_ = new Label();
            // mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18027);mw.visitJumpInsn(IFLE, flag_);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18028);_setFlag(mw, context, i);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18029);mw.visitLabel(flag_);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18030);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18031);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18032);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18033);mw.visitVarInsn(ISTORE, context.var("matchStat"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18034);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.NOT_MATCH);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18035);mw.visitJumpInsn(IF_ICMPEQ, reset_);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18036);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18037);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18038);mw.visitJumpInsn(IFLE, notMatch_);

            // increment matchedCount
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18039);mw.visitVarInsn(ILOAD, context.var("matchedCount"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18040);mw.visitInsn(ICONST_1);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18041);mw.visitInsn(IADD);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18042);mw.visitVarInsn(ISTORE, context.var("matchedCount"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18043);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18044);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18045);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.END);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18046);mw.visitJumpInsn(IF_ICMPEQ, end_);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18047);mw.visitLabel(notMatch_);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18048);if ((((i == fieldListSize - 1)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18049)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18050)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18051);mw.visitVarInsn(ALOAD, context.var("lexer"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18052);mw.visitFieldInsn(GETFIELD, JSONLexerBase, "matchStat", "I");
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18053);mw.visitLdcInsn(com.alibaba.fastjson.parser.JSONLexerBase.END);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18054);mw.visitJumpInsn(IF_ICMPNE, reset_);
            }
        }} // endFor

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18055);mw.visitLabel(end_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18056);if ((((!context.clazz.isInterface() && !Modifier.isAbstract(context.clazz.getModifiers()))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18057)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18058)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18059);_batchSet(context, mw);
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18060);mw.visitLabel(return_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18061);_setContext(context, mw);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18062);mw.visitVarInsn(ALOAD, context.var("instance"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18063);Method buildMethod = context.beanInfo.buildMethod;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18064);if ((((buildMethod != null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18065)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18066)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18067);mw.visitMethodInsn(INVOKEVIRTUAL, type(context.getInstClass()), buildMethod.getName(),
                               "()" + desc(buildMethod.getReturnType()));
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18068);mw.visitInsn(ARETURN);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18069);mw.visitLabel(reset_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18070);_batchSet(context, mw);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18071);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18072);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18073);mw.visitVarInsn(ALOAD, 2);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18074);mw.visitVarInsn(ALOAD, 3);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18075);mw.visitVarInsn(ALOAD, context.var("instance"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18076);mw.visitVarInsn(ILOAD, 4);


        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18077);int flagSize = (fieldListSize / 32);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18078);if ((((fieldListSize != 0 && (fieldListSize % 32) != 0)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18079)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18080)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18081);flagSize += 1;
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18082);if ((((flagSize == 1)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18083)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18084)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18085);mw.visitInsn(ICONST_1);
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18086);mw.visitIntInsn(BIPUSH, flagSize);
        }
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18087);mw.visitIntInsn(NEWARRAY, T_INT);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18088);for (int i = 0; (((i < flagSize)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18089)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18090)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18091);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18092);if ((((i == 0)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18093)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18094)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18095);mw.visitInsn(ICONST_0);
            } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18096);if ((((i == 1)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18097)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18098)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18099);mw.visitInsn(ICONST_1);
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18100);mw.visitIntInsn(BIPUSH, i);
            }
            }}__CLR4_5_2d9hd9hlusvmqfw.R.inc(18101);mw.visitVarInsn(ILOAD, context.var("_asm_flag_" + i));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18102);mw.visitInsn(IASTORE);
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18103);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class),
                           "parseRest", "(L" + DefaultJSONParser
                                        + ";Ljava/lang/reflect/Type;Ljava/lang/Object;Ljava/lang/Object;I[I)Ljava/lang/Object;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18104);mw.visitTypeInsn(CHECKCAST, type(context.clazz)); // cast
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18105);mw.visitInsn(ARETURN);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18106);mw.visitLabel(super_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18107);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18108);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18109);mw.visitVarInsn(ALOAD, 2);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18110);mw.visitVarInsn(ALOAD, 3);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18111);mw.visitVarInsn(ILOAD, 4);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18112);mw.visitMethodInsn(INVOKESPECIAL, type(JavaBeanDeserializer.class), //
                           "deserialze", //
                           "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18113);mw.visitInsn(ARETURN);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18114);mw.visitMaxs(10, context.variantIndex);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18115);mw.visitEnd();

    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void defineVarLexer(Context context, MethodVisitor mw) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18116);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18117);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18118);mw.visitFieldInsn(GETFIELD, DefaultJSONParser, "lexer", desc(JSONLexer.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18119);mw.visitTypeInsn(CHECKCAST, JSONLexerBase); // cast
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18120);mw.visitVarInsn(ASTORE, context.var("lexer"));
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _createInstance(Context context, MethodVisitor mw) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18121);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18122);JavaBeanInfo beanInfo = context.beanInfo;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18123);Constructor<?> defaultConstructor = beanInfo.defaultConstructor;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18124);if ((((Modifier.isPublic(defaultConstructor.getModifiers()))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18125)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18126)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18127);mw.visitTypeInsn(NEW, type(context.getInstClass()));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18128);mw.visitInsn(DUP);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18129);mw.visitMethodInsn(INVOKESPECIAL, type(defaultConstructor.getDeclaringClass()), "<init>", "()V");

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18130);mw.visitVarInsn(ASTORE, context.var("instance"));
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18131);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18132);mw.visitVarInsn(ALOAD, 1);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18133);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18134);mw.visitFieldInsn(GETFIELD, type(JavaBeanDeserializer.class), "clazz", "Ljava/lang/Class;");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18135);mw.visitMethodInsn(INVOKESPECIAL, type(JavaBeanDeserializer.class), "createInstance",
                               "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18136);mw.visitTypeInsn(CHECKCAST, type(context.getInstClass())); // cast
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18137);mw.visitVarInsn(ASTORE, context.var("instance"));
        }
    }}finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _batchSet(Context context, MethodVisitor mw) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18138);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18139);_batchSet(context, mw, true);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _batchSet(Context context, MethodVisitor mw, boolean flag) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18140);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18141);for (int i = 0, size = context.fieldInfoList.length; (((i < size)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18142)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18143)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18144);Label notSet_ = new Label();

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18145);if ((((flag)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18146)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18147)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18148);_isFlag(mw, context, i, notSet_);
            }

            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18149);FieldInfo fieldInfo = context.fieldInfoList[i];
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18150);_loadAndSet(context, mw, fieldInfo);

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18151);if ((((flag)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18152)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18153)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18154);mw.visitLabel(notSet_);
            }
        }}
    }}finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _loadAndSet(Context context, MethodVisitor mw, FieldInfo fieldInfo) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18155);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18156);Class<?> fieldClass = fieldInfo.fieldClass;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18157);Type fieldType = fieldInfo.fieldType;

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18158);if ((((fieldClass == boolean.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18159)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18160)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18161);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18162);mw.visitVarInsn(ILOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18163);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18164);if ((((fieldClass == byte.class //
                   || fieldClass == short.class //
                   || fieldClass == int.class //
                   || fieldClass == char.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18165)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18166)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18167);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18168);mw.visitVarInsn(ILOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18169);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18170);if ((((fieldClass == long.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18171)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18172)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18173);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18174);mw.visitVarInsn(LLOAD, context.var(fieldInfo.name + "_asm", 2));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18175);if ((((fieldInfo.method != null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18176)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18177)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18178);mw.visitMethodInsn(INVOKEVIRTUAL, type(context.getInstClass()), fieldInfo.method.getName(),
                                   desc(fieldInfo.method));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18179);if ((((!fieldInfo.method.getReturnType().equals(Void.TYPE))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18180)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18181)==0&false))) {{
                    __CLR4_5_2d9hd9hlusvmqfw.R.inc(18182);mw.visitInsn(POP);
                }
            }} }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18183);mw.visitFieldInsn(PUTFIELD, type(fieldInfo.declaringClass), fieldInfo.field.getName(),
                                  desc(fieldInfo.fieldClass));
            }
        }} }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18184);if ((((fieldClass == float.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18185)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18186)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18187);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18188);mw.visitVarInsn(FLOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18189);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18190);if ((((fieldClass == double.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18191)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18192)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18193);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18194);mw.visitVarInsn(DLOAD, context.var(fieldInfo.name + "_asm", 2));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18195);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18196);if ((((fieldClass == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18197)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18198)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18199);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18200);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18201);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18202);if ((((fieldClass.isEnum())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18203)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18204)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18205);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18206);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18207);_set(context, mw, fieldInfo);
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18208);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18209)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18210)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18211);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18212);Type itemType = TypeUtils.getCollectionItemClass(fieldType);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18213);if ((((itemType == String.class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18214)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18215)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18216);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18217);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18218);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
            }
            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18219);_set(context, mw, fieldInfo);

        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18220);mw.visitVarInsn(ALOAD, context.var("instance"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18221);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18222);_set(context, mw, fieldInfo);
        }
    }}}}}}}}}finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _set(Context context, MethodVisitor mw, FieldInfo fieldInfo) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18223);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18224);Method method = fieldInfo.method;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18225);if ((((method != null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18226)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18227)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18228);Class<?> declaringClass = method.getDeclaringClass();
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18229);mw.visitMethodInsn((((declaringClass.isInterface() )&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18230)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18231)==0&false))? INVOKEINTERFACE : INVOKEVIRTUAL, type(fieldInfo.declaringClass), method.getName(), desc(method));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18232);if ((((!fieldInfo.method.getReturnType().equals(Void.TYPE))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18233)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18234)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18235);mw.visitInsn(POP);
            }
        }} }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18236);mw.visitFieldInsn(PUTFIELD, type(fieldInfo.declaringClass), fieldInfo.field.getName(),
                              desc(fieldInfo.fieldClass));
        }
    }}finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _setContext(Context context, MethodVisitor mw) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18237);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18238);mw.visitVarInsn(ALOAD, 1); // parser
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18239);mw.visitVarInsn(ALOAD, context.var("context"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18240);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "setContext", "(" + desc(ParseContext.class) + ")V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18241);Label endIf_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18242);mw.visitVarInsn(ALOAD, context.var("childContext"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18243);mw.visitJumpInsn(IFNULL, endIf_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18244);mw.visitVarInsn(ALOAD, context.var("childContext"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18245);mw.visitVarInsn(ALOAD, context.var("instance"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18246);mw.visitFieldInsn(PUTFIELD, type(ParseContext.class), "object", "Ljava/lang/Object;");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18247);mw.visitLabel(endIf_);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserialize_endCheck(Context context, MethodVisitor mw, Label reset_) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18248);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18249);mw.visitIntInsn(ILOAD, context.var("matchedCount"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18250);mw.visitJumpInsn(IFLE, reset_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18251);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18252);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18253);mw.visitLdcInsn(JSONToken.RBRACE);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18254);mw.visitJumpInsn(IF_ICMPNE, reset_);

        // mw.visitLabel(nextToken_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18255);_quickNextTokenComma(context, mw);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserialze_list_obj(Context context, MethodVisitor mw, Label reset_, FieldInfo fieldInfo,
                                      Class<?> fieldClass, Class<?> itemType, int i) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18256);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18257);Label _end_if = new Label();

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18258);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "matchField", "([C)Z");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18259);mw.visitJumpInsn(IFEQ, _end_if);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18260);_setFlag(mw, context, i);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18261);Label valueNotNull_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18262);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18263);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18264);mw.visitLdcInsn(JSONToken.NULL);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18265);mw.visitJumpInsn(IF_ICMPNE, valueNotNull_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18266);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18267);mw.visitLdcInsn(JSONToken.COMMA);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18268);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18269);mw.visitJumpInsn(GOTO, _end_if);
        // loop_end_

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18270);mw.visitLabel(valueNotNull_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18271);Label storeCollection_ = new Label(), endSet_ = new Label(), lbacketNormal_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18272);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18273);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18274);mw.visitLdcInsn(JSONToken.SET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18275);mw.visitJumpInsn(IF_ICMPNE, endSet_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18276);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18277);mw.visitLdcInsn(JSONToken.LBRACKET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18278);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18279);_newCollection(mw, fieldClass, i, true);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18280);mw.visitJumpInsn(GOTO, storeCollection_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18281);mw.visitLabel(endSet_);

        // if (lexer.token() != JSONToken.LBRACKET) reset
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18282);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18283);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18284);mw.visitLdcInsn(JSONToken.LBRACKET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18285);mw.visitJumpInsn(IF_ICMPEQ, lbacketNormal_);

        // if (lexer.token() == JSONToken.LBRACE) reset
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18286);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18287);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18288);mw.visitLdcInsn(JSONToken.LBRACE);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18289);mw.visitJumpInsn(IF_ICMPNE, reset_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18290);_newCollection(mw, fieldClass, i, false);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18291);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18292);_getCollectionFieldItemDeser(context, mw, fieldInfo, itemType);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18293);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18294);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(itemType)));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18295);mw.visitInsn(ICONST_0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18296);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18297);mw.visitMethodInsn(INVOKEINTERFACE, type(ObjectDeserializer.class), "deserialze",
                "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18298);mw.visitVarInsn(ASTORE, context.var("list_item_value"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18299);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18300);mw.visitVarInsn(ALOAD, context.var("list_item_value"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18301);if ((((fieldClass.isInterface())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18302)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18303)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18304);mw.visitMethodInsn(INVOKEINTERFACE, type(fieldClass), "add", "(Ljava/lang/Object;)Z");
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18305);mw.visitMethodInsn(INVOKEVIRTUAL, type(fieldClass), "add", "(Ljava/lang/Object;)Z");
        }
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18306);mw.visitInsn(POP);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18307);mw.visitJumpInsn(GOTO, _end_if);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18308);mw.visitLabel(lbacketNormal_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18309);_newCollection(mw, fieldClass, i, false);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18310);mw.visitLabel(storeCollection_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18311);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18312);boolean isPrimitive = ParserConfig.isPrimitive2(fieldInfo.fieldClass);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18313);_getCollectionFieldItemDeser(context, mw, fieldInfo, itemType);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18314);if ((((isPrimitive)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18315)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18316)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18317);mw.visitMethodInsn(INVOKEINTERFACE, type(ObjectDeserializer.class), "getFastMatchToken", "()I");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18318);mw.visitVarInsn(ISTORE, context.var("fastMatchToken"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18319);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18320);mw.visitVarInsn(ILOAD, context.var("fastMatchToken"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18321);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18322);mw.visitInsn(POP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18323);mw.visitLdcInsn(JSONToken.LBRACE);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18324);mw.visitVarInsn(ISTORE, context.var("fastMatchToken"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18325);_quickNextToken(context, mw, JSONToken.LBRACE);
        }

        }{ // setContext
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18326);mw.visitVarInsn(ALOAD, 1);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18327);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getContext", "()" + desc(ParseContext.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18328);mw.visitVarInsn(ASTORE, context.var("listContext"));

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18329);mw.visitVarInsn(ALOAD, 1); // parser
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18330);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18331);mw.visitLdcInsn(fieldInfo.name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18332);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "setContext",
                               "(Ljava/lang/Object;Ljava/lang/Object;)" + desc(ParseContext.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18333);mw.visitInsn(POP);
        }

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18334);Label loop_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18335);Label loop_end_ = new Label();

        // for (;;) {
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18336);mw.visitInsn(ICONST_0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18337);mw.visitVarInsn(ISTORE, context.var("i"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18338);mw.visitLabel(loop_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18339);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18340);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18341);mw.visitLdcInsn(JSONToken.RBRACKET);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18342);mw.visitJumpInsn(IF_ICMPEQ, loop_end_);

        // Object value = itemDeserializer.deserialze(parser, null);
        // array.add(value);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18343);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18344);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_list_item_deser__",
                          desc(ObjectDeserializer.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18345);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18346);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(itemType)));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18347);mw.visitVarInsn(ILOAD, context.var("i"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18348);mw.visitMethodInsn(INVOKESTATIC, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18349);mw.visitMethodInsn(INVOKEINTERFACE, type(ObjectDeserializer.class), "deserialze",
                           "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18350);mw.visitVarInsn(ASTORE, context.var("list_item_value"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18351);mw.visitIincInsn(context.var("i"), 1);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18352);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18353);mw.visitVarInsn(ALOAD, context.var("list_item_value"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18354);if ((((fieldClass.isInterface())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18355)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18356)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18357);mw.visitMethodInsn(INVOKEINTERFACE, type(fieldClass), "add", "(Ljava/lang/Object;)Z");
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18358);mw.visitMethodInsn(INVOKEVIRTUAL, type(fieldClass), "add", "(Ljava/lang/Object;)Z");
        }
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18359);mw.visitInsn(POP);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18360);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18361);mw.visitVarInsn(ALOAD, context.var(fieldInfo.name + "_asm"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18362);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "checkListResolve", "(Ljava/util/Collection;)V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18363);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18364);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18365);mw.visitLdcInsn(JSONToken.COMMA);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18366);mw.visitJumpInsn(IF_ICMPNE, loop_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18367);if ((((isPrimitive)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18368)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18369)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18370);mw.visitVarInsn(ALOAD, context.var("lexer"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18371);mw.visitVarInsn(ILOAD, context.var("fastMatchToken"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18372);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18373);_quickNextToken(context, mw, JSONToken.LBRACE);
        }
        
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18374);mw.visitJumpInsn(GOTO, loop_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18375);mw.visitLabel(loop_end_);

        // mw.visitVarInsn(ASTORE, context.var("context"));
        // parser.setContext(context);
        { // setContext
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18376);mw.visitVarInsn(ALOAD, 1); // parser
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18377);mw.visitVarInsn(ALOAD, context.var("listContext"));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18378);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "setContext", "(" + desc(ParseContext.class) + ")V");
        }

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18379);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18380);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "token", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18381);mw.visitLdcInsn(JSONToken.RBRACKET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18382);mw.visitJumpInsn(IF_ICMPNE, reset_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18383);_quickNextTokenComma(context, mw);
        // lexer.nextToken(JSONToken.COMMA);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18384);mw.visitLabel(_end_if);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _quickNextToken(Context context, MethodVisitor mw, int token) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18385);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18386);Label quickElse_ = new Label(), quickEnd_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18387);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18388);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18389);if ((((token == JSONToken.LBRACE)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18390)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18391)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18392);mw.visitVarInsn(BIPUSH, '{');
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18393);if ((((token == JSONToken.LBRACKET)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18394)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18395)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18396);mw.visitVarInsn(BIPUSH, '[');
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18397);throw new IllegalStateException();
        }

        }}__CLR4_5_2d9hd9hlusvmqfw.R.inc(18398);mw.visitJumpInsn(IF_ICMPNE, quickElse_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18399);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18400);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18401);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18402);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18403);mw.visitLdcInsn(token);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18404);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18405);mw.visitJumpInsn(GOTO, quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18406);mw.visitLabel(quickElse_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18407);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18408);mw.visitLdcInsn(token);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18409);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "(I)V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18410);mw.visitLabel(quickEnd_);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}
    
    private void _quickNextTokenComma(Context context, MethodVisitor mw) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18411);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18412);Label quickElse_ = new Label(), quickElseIf0_ = new Label(), quickElseIf1_ = new Label(), quickElseIf2_ = new Label(), quickEnd_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18413);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18414);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "getCurrent", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18415);mw.visitInsn(DUP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18416);mw.visitVarInsn(ISTORE, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18417);mw.visitVarInsn(BIPUSH, ',');
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18418);mw.visitJumpInsn(IF_ICMPNE, quickElseIf0_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18419);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18420);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18421);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18422);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18423);mw.visitLdcInsn(JSONToken.COMMA);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18424);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18425);mw.visitJumpInsn(GOTO, quickEnd_);
        
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18426);mw.visitLabel(quickElseIf0_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18427);mw.visitVarInsn(ILOAD, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18428);mw.visitVarInsn(BIPUSH, '}');
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18429);mw.visitJumpInsn(IF_ICMPNE, quickElseIf1_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18430);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18431);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18432);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18433);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18434);mw.visitLdcInsn(JSONToken.RBRACE);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18435);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18436);mw.visitJumpInsn(GOTO, quickEnd_);
        
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18437);mw.visitLabel(quickElseIf1_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18438);mw.visitVarInsn(ILOAD, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18439);mw.visitVarInsn(BIPUSH, ']');
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18440);mw.visitJumpInsn(IF_ICMPNE, quickElseIf2_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18441);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18442);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "next", "()C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18443);mw.visitInsn(POP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18444);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18445);mw.visitLdcInsn(JSONToken.RBRACKET);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18446);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18447);mw.visitJumpInsn(GOTO, quickEnd_);
        
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18448);mw.visitLabel(quickElseIf2_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18449);mw.visitVarInsn(ILOAD, context.var("ch"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18450);mw.visitVarInsn(BIPUSH, JSONLexer.EOI);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18451);mw.visitJumpInsn(IF_ICMPNE, quickElse_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18452);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18453);mw.visitLdcInsn(JSONToken.EOF);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18454);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "setToken", "(I)V");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18455);mw.visitJumpInsn(GOTO, quickEnd_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18456);mw.visitLabel(quickElse_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18457);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18458);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "nextToken", "()V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18459);mw.visitLabel(quickEnd_);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}
    
    private void _getCollectionFieldItemDeser(Context context, MethodVisitor mw, FieldInfo fieldInfo,
                                              Class<?> itemType) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18460);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18461);Label notNull_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18462);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18463);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_list_item_deser__",
                          desc(ObjectDeserializer.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18464);mw.visitJumpInsn(IFNONNULL, notNull_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18465);mw.visitVarInsn(ALOAD, 0);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18466);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18467);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getConfig", "()" + desc(ParserConfig.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18468);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(itemType)));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18469);mw.visitMethodInsn(INVOKEVIRTUAL, type(ParserConfig.class), "getDeserializer",
                           "(Ljava/lang/reflect/Type;)" + desc(ObjectDeserializer.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18470);mw.visitFieldInsn(PUTFIELD, context.className, fieldInfo.name + "_asm_list_item_deser__",
                          desc(ObjectDeserializer.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18471);mw.visitLabel(notNull_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18472);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18473);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_list_item_deser__",
                          desc(ObjectDeserializer.class));
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _newCollection(MethodVisitor mw, Class<?> fieldClass, int i, boolean set) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18474);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18475);if ((((fieldClass.isAssignableFrom(ArrayList.class) && !set)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18476)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18477)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18478);mw.visitTypeInsn(NEW, "java/util/ArrayList");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18479);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18480);mw.visitMethodInsn(INVOKESPECIAL, "java/util/ArrayList", "<init>", "()V");
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18481);if ((((fieldClass.isAssignableFrom(LinkedList.class) && !set)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18482)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18483)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18484);mw.visitTypeInsn(NEW, type(LinkedList.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18485);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18486);mw.visitMethodInsn(INVOKESPECIAL, type(LinkedList.class), "<init>", "()V");
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18487);if ((((fieldClass.isAssignableFrom(HashSet.class))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18488)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18489)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18490);mw.visitTypeInsn(NEW, type(HashSet.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18491);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18492);mw.visitMethodInsn(INVOKESPECIAL, type(HashSet.class), "<init>", "()V");
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18493);if ((((fieldClass.isAssignableFrom(TreeSet.class))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18494)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18495)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18496);mw.visitTypeInsn(NEW, type(TreeSet.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18497);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18498);mw.visitMethodInsn(INVOKESPECIAL, type(TreeSet.class), "<init>", "()V");
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18499);if ((((fieldClass.isAssignableFrom(LinkedHashSet.class))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18500)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18501)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18502);mw.visitTypeInsn(NEW, type(LinkedHashSet.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18503);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18504);mw.visitMethodInsn(INVOKESPECIAL, type(LinkedHashSet.class), "<init>", "()V");
        } }else {__CLR4_5_2d9hd9hlusvmqfw.R.inc(18505);if ((((set)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18506)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18507)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18508);mw.visitTypeInsn(NEW, type(HashSet.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18509);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18510);mw.visitMethodInsn(INVOKESPECIAL, type(HashSet.class), "<init>", "()V");
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18511);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18512);mw.visitLdcInsn(i);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18513);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "getFieldType",
                               "(I)Ljava/lang/reflect/Type;");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18514);mw.visitMethodInsn(INVOKESTATIC, type(TypeUtils.class), "createCollection",
                               "(Ljava/lang/reflect/Type;)Ljava/util/Collection;");
        }
        }}}}}}__CLR4_5_2d9hd9hlusvmqfw.R.inc(18515);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserialze_obj(Context context, MethodVisitor mw, Label reset_, FieldInfo fieldInfo,
                                 Class<?> fieldClass, int i) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18516);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18517);Label matched_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18518);Label _end_if = new Label();

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18519);mw.visitVarInsn(ALOAD, context.var("lexer"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18520);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18521);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18522);mw.visitMethodInsn(INVOKEVIRTUAL, JSONLexerBase, "matchField", "([C)Z");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18523);mw.visitJumpInsn(IFNE, matched_);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18524);mw.visitInsn(ACONST_NULL);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18525);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18526);mw.visitJumpInsn(GOTO, _end_if);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18527);mw.visitLabel(matched_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18528);_setFlag(mw, context, i);

        // increment matchedCount
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18529);mw.visitVarInsn(ILOAD, context.var("matchedCount"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18530);mw.visitInsn(ICONST_1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18531);mw.visitInsn(IADD);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18532);mw.visitVarInsn(ISTORE, context.var("matchedCount"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18533);_deserObject(context, mw, fieldInfo, fieldClass, i);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18534);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18535);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getResolveStatus", "()I");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18536);mw.visitLdcInsn(com.alibaba.fastjson.parser.DefaultJSONParser.NeedToResolve);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18537);mw.visitJumpInsn(IF_ICMPNE, _end_if);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18538);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18539);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getLastResolveTask", "()" + desc(ResolveTask.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18540);mw.visitVarInsn(ASTORE, context.var("resolveTask"));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18541);mw.visitVarInsn(ALOAD, context.var("resolveTask"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18542);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18543);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getContext", "()" + desc(ParseContext.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18544);mw.visitFieldInsn(PUTFIELD, type(ResolveTask.class), "ownerContext", desc(ParseContext.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18545);mw.visitVarInsn(ALOAD, context.var("resolveTask"));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18546);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18547);mw.visitLdcInsn(fieldInfo.name);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18548);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "getFieldDeserializer",
                           "(Ljava/lang/String;)" + desc(FieldDeserializer.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18549);mw.visitFieldInsn(PUTFIELD, type(ResolveTask.class), "fieldDeserializer", desc(FieldDeserializer.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18550);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18551);mw.visitLdcInsn(com.alibaba.fastjson.parser.DefaultJSONParser.NONE);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18552);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "setResolveStatus", "(I)V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18553);mw.visitLabel(_end_if);

    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _deserObject(Context context, MethodVisitor mw, FieldInfo fieldInfo, Class<?> fieldClass, int i) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18554);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18555);_getFieldDeser(context, mw, fieldInfo);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18556);Label instanceOfElse_ = new Label(), instanceOfEnd_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18557);if (((((fieldInfo.parserFeatures & Feature.SupportArrayToBean.mask) != 0)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18558)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18559)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18560);mw.visitInsn(DUP);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18561);mw.visitTypeInsn(INSTANCEOF, type(JavaBeanDeserializer.class));
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18562);mw.visitJumpInsn(IFEQ, instanceOfElse_);
            
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18563);mw.visitTypeInsn(CHECKCAST, type(JavaBeanDeserializer.class)); // cast
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18564);mw.visitVarInsn(ALOAD, 1);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18565);if ((((fieldInfo.fieldType instanceof Class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18566)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18567)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18568);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldInfo.fieldClass)));
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18569);mw.visitVarInsn(ALOAD, 0);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18570);mw.visitLdcInsn(i);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18571);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "getFieldType",
                                   "(I)Ljava/lang/reflect/Type;");
            }
            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18572);mw.visitLdcInsn(fieldInfo.name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18573);mw.visitLdcInsn(fieldInfo.parserFeatures);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18574);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "deserialze",
                               "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;I)Ljava/lang/Object;");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18575);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18576);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
            
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18577);mw.visitJumpInsn(GOTO, instanceOfEnd_);
            
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18578);mw.visitLabel(instanceOfElse_);
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18579);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18580);if ((((fieldInfo.fieldType instanceof Class)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18581)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18582)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18583);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldInfo.fieldClass)));
        } }else {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18584);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18585);mw.visitLdcInsn(i);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18586);mw.visitMethodInsn(INVOKEVIRTUAL, type(JavaBeanDeserializer.class), "getFieldType",
                               "(I)Ljava/lang/reflect/Type;");
        }
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18587);mw.visitLdcInsn(fieldInfo.name);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18588);mw.visitMethodInsn(INVOKEINTERFACE, type(ObjectDeserializer.class), "deserialze",
                           "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;Ljava/lang/Object;)Ljava/lang/Object;");
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18589);mw.visitTypeInsn(CHECKCAST, type(fieldClass)); // cast
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18590);mw.visitVarInsn(ASTORE, context.var(fieldInfo.name + "_asm"));
        
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18591);mw.visitLabel(instanceOfEnd_);
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _getFieldDeser(Context context, MethodVisitor mw, FieldInfo fieldInfo) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18592);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18593);Label notNull_ = new Label();
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18594);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18595);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_deser__", desc(ObjectDeserializer.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18596);mw.visitJumpInsn(IFNONNULL, notNull_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18597);mw.visitVarInsn(ALOAD, 0);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18598);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18599);mw.visitMethodInsn(INVOKEVIRTUAL, DefaultJSONParser, "getConfig", "()" + desc(ParserConfig.class));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18600);mw.visitLdcInsn(com.alibaba.fastjson.asm.Type.getType(desc(fieldInfo.fieldClass)));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18601);mw.visitMethodInsn(INVOKEVIRTUAL, type(ParserConfig.class), "getDeserializer",
                           "(Ljava/lang/reflect/Type;)" + desc(ObjectDeserializer.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18602);mw.visitFieldInsn(PUTFIELD, context.className, fieldInfo.name + "_asm_deser__", desc(ObjectDeserializer.class));

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18603);mw.visitLabel(notNull_);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18604);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18605);mw.visitFieldInsn(GETFIELD, context.className, fieldInfo.name + "_asm_deser__", desc(ObjectDeserializer.class));
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    static class Context {

        static final int                   parser       = 1;
        static final int                   type         = 2;
        static final int                   fieldName    = 3;

        private int                        variantIndex = -1;
        private final Map<String, Integer> variants     = new HashMap<String, Integer>();

        private final Class<?>             clazz;
        private final JavaBeanInfo         beanInfo;
        private final String               className;
        private FieldInfo[]                fieldInfoList;

        public Context(String className, ParserConfig config, JavaBeanInfo beanInfo, int initVariantIndex){try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18606);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18607);this.className = className;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18608);this.clazz = beanInfo.clazz;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18609);this.variantIndex = initVariantIndex;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18610);this.beanInfo = beanInfo;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18611);fieldInfoList = beanInfo.fields;
        }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

        public Class<?> getInstClass() {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18612);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18613);Class<?> instClass = beanInfo.builderClass;
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18614);if ((((instClass == null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18615)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18616)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18617);instClass = clazz;
            }

            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18618);return instClass;
        }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

        public int var(String name, int increment) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18619);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18620);Integer i = variants.get(name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18621);if ((((i == null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18622)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18623)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18624);variants.put(name, variantIndex);
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18625);variantIndex += increment;
            }
            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18626);i = variants.get(name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18627);return i.intValue();
        }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

        public int var(String name) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18628);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18629);Integer i = variants.get(name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18630);if ((((i == null)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18631)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18632)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18633);variants.put(name, variantIndex++);
            }
            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18634);i = variants.get(name);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18635);return i.intValue();
        }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}
    }

    private void _init(ClassWriter cw, Context context) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18636);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18637);for (int i = 0, size = context.fieldInfoList.length; (((i < size)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18638)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18639)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18640);FieldInfo fieldInfo = context.fieldInfoList[i];

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18641);FieldWriter fw = new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_prefix__", "[C");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18642);fw.visitEnd();
        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18643);for (int i = 0, size = context.fieldInfoList.length; (((i < size)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18644)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18645)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18646);FieldInfo fieldInfo = context.fieldInfoList[i];
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18647);Class<?> fieldClass = fieldInfo.fieldClass;

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18648);if ((((fieldClass.isPrimitive())&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18649)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18650)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18651);continue;
            }

            }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18652);if ((((Collection.class.isAssignableFrom(fieldClass))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18653)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18654)==0&false))) {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18655);FieldWriter fw = new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_list_item_deser__",
                                                 desc(ObjectDeserializer.class));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18656);fw.visitEnd();
            } }else {{
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18657);FieldWriter fw = new FieldWriter(cw, ACC_PUBLIC, fieldInfo.name + "_asm_deser__",
                                                 desc(ObjectDeserializer.class));
                __CLR4_5_2d9hd9hlusvmqfw.R.inc(18658);fw.visitEnd();
            }
        }}

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18659);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>",
                                            "(" + desc(ParserConfig.class) + desc(JavaBeanInfo.class) + ")V", null, null);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18660);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18661);mw.visitVarInsn(ALOAD, 1);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18662);mw.visitVarInsn(ALOAD, 2);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18663);mw.visitMethodInsn(INVOKESPECIAL, type(JavaBeanDeserializer.class), "<init>",
                           "(" + desc(ParserConfig.class) + desc(JavaBeanInfo.class) + ")V");

        // init fieldNamePrefix
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18664);for (int i = 0, size = context.fieldInfoList.length; (((i < size)&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18665)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18666)==0&false)); ++i) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18667);FieldInfo fieldInfo = context.fieldInfoList[i];

            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18668);mw.visitVarInsn(ALOAD, 0);
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18669);mw.visitLdcInsn("\"" + fieldInfo.name + "\":"); // public char[] toCharArray()
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18670);mw.visitMethodInsn(INVOKEVIRTUAL, "java/lang/String", "toCharArray", "()[C");
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18671);mw.visitFieldInsn(PUTFIELD, context.className, fieldInfo.name + "_asm_prefix__", "[C");

        }

        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18672);mw.visitInsn(RETURN);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18673);mw.visitMaxs(4, 4);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18674);mw.visitEnd();
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

    private void _createInstance(ClassWriter cw, Context context) {try{__CLR4_5_2d9hd9hlusvmqfw.R.inc(18675);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18676);Constructor<?> defaultConstructor = context.beanInfo.defaultConstructor;
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18677);if ((((!Modifier.isPublic(defaultConstructor.getModifiers()))&&(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18678)!=0|true))||(__CLR4_5_2d9hd9hlusvmqfw.R.iget(18679)==0&false))) {{
            __CLR4_5_2d9hd9hlusvmqfw.R.inc(18680);return;
        }
        
        }__CLR4_5_2d9hd9hlusvmqfw.R.inc(18681);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "createInstance",
                                            "(L" + DefaultJSONParser + ";Ljava/lang/reflect/Type;)Ljava/lang/Object;",
                                            null, null);

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18682);mw.visitTypeInsn(NEW, type(context.getInstClass()));
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18683);mw.visitInsn(DUP);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18684);mw.visitMethodInsn(INVOKESPECIAL, type(context.getInstClass()), "<init>", "()V");

        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18685);mw.visitInsn(ARETURN);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18686);mw.visitMaxs(3, 3);
        __CLR4_5_2d9hd9hlusvmqfw.R.inc(18687);mw.visitEnd();
    }finally{__CLR4_5_2d9hd9hlusvmqfw.R.flushNeeded();}}

}
