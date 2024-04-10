/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.io.FileOutputStream;
import java.lang.reflect.Method;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.asm.ClassWriter;
import com.alibaba.fastjson.asm.MethodVisitor;
import com.alibaba.fastjson.asm.MethodWriter;
import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.json.test.benchmark.encode.EishayEncode;

public class TestASM extends TestCase implements Opcodes {static class __CLR4_1_1022ol22olluszwi0f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    // public void test_0() throws Exception {
    //
    // ClassWriter cw = new ClassWriter(0);
    // cw.visit(V1_1, ACC_PUBLIC, "Example", null, "java/lang/Object", null);
    //
    // MethodVisitor mw = cw.visitMethod(ACC_PUBLIC, "<init>", "()V", null, null);
    // mw.visitVarInsn(ALOAD, 0);
    // mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
    // mw.visitInsn(RETURN);
    // mw.visitMaxs(1, 1);
    // mw.visitEnd();
    // mw = cw.visitMethod(ACC_PUBLIC + ACC_STATIC, "main", "([Ljava/lang/String;)V", null, null);
    // mw.visitFieldInsn(GETSTATIC, "java/lang/System", "out", "Ljava/io/PrintStream;");
    // mw.visitLdcInsn("Hello world!");
    // mw.visitMethodInsn(INVOKEVIRTUAL, "java/io/PrintStream", "println", "(Ljava/lang/String;)V");
    // mw.visitInsn(RETURN);
    // mw.visitMaxs(2, 2);
    // mw.visitEnd();
    // byte[] code = cw.toByteArray();
    // FileOutputStream fos = new FileOutputStream("Example.class");
    // fos.write(code);
    // fos.close();
    //
    // MyClassLoader loader = new MyClassLoader();
    //
    // Class exampleClass = loader.defineClassF("Example", code, 0, code.length);
    // exampleClass.getMethods()[0].invoke(null, new Object[] { null });
    // }

    public void test_asm() throws Exception {__CLR4_1_1022ol22olluszwi0f.R.globalSliceStart(getClass().getName(),96789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rqy90r22ol();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022ol22olluszwi0f.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022ol22olluszwi0f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rqy90r22ol() throws Exception{try{__CLR4_1_1022ol22olluszwi0f.R.inc(96789);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96790);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96791);System.out.println(text);
    }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_1022ol22olluszwi0f.R.globalSliceStart(getClass().getName(),96792);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl22oo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022ol22olluszwi0f.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022ol22olluszwi0f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96792,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl22oo() throws Exception{try{__CLR4_1_1022ol22olluszwi0f.R.inc(96792);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96793);ClassWriter cw = new ClassWriter();
        __CLR4_1_1022ol22olluszwi0f.R.inc(96794);cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "DateSerializer", "java/lang/Object", new String[] { "com/alibaba/fastjson/serializer/ObjectSerializer" });

        __CLR4_1_1022ol22olluszwi0f.R.inc(96795);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>", "()V", null, null);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96796);mw.visitVarInsn(ALOAD, 0);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96797);mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96798);mw.visitInsn(RETURN);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96799);mw.visitMaxs(1, 1);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96800);mw.visitEnd();

        __CLR4_1_1022ol22olluszwi0f.R.inc(96801);mw = new MethodWriter(cw, ACC_PUBLIC, "write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });

        __CLR4_1_1022ol22olluszwi0f.R.inc(96802);mw.visitVarInsn(ALOAD, 1); // serializer
        __CLR4_1_1022ol22olluszwi0f.R.inc(96803);mw.visitMethodInsn(INVOKEVIRTUAL, "com/alibaba/fastjson/serializer/JSONSerializer", "getWriter", "()Lcom/alibaba/fastjson/serializer/SerializeWriter;");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96804);mw.visitVarInsn(ASTORE, 3); // out

        __CLR4_1_1022ol22olluszwi0f.R.inc(96805);mw.visitVarInsn(ALOAD, 2); // obj
        __CLR4_1_1022ol22olluszwi0f.R.inc(96806);mw.visitTypeInsn(CHECKCAST, getCastType(Entity.class)); // serializer
        __CLR4_1_1022ol22olluszwi0f.R.inc(96807);mw.visitVarInsn(ASTORE, 4); // obj
        
        __CLR4_1_1022ol22olluszwi0f.R.inc(96808);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1022ol22olluszwi0f.R.inc(96809);mw.visitLdcInsn("{");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96810);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");
        
        __CLR4_1_1022ol22olluszwi0f.R.inc(96811);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1022ol22olluszwi0f.R.inc(96812);mw.visitLdcInsn("\"id\":");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96813);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_1_1022ol22olluszwi0f.R.inc(96814);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1022ol22olluszwi0f.R.inc(96815);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_1_1022ol22olluszwi0f.R.inc(96816);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getId", "()I");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96817);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeInt", "(I)V");
        
        __CLR4_1_1022ol22olluszwi0f.R.inc(96818);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1022ol22olluszwi0f.R.inc(96819);mw.visitLdcInsn("\",name\":");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96820);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_1_1022ol22olluszwi0f.R.inc(96821);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1022ol22olluszwi0f.R.inc(96822);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_1_1022ol22olluszwi0f.R.inc(96823);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getName", "()Ljava/lang/String;");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96824);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");

        __CLR4_1_1022ol22olluszwi0f.R.inc(96825);mw.visitInsn(RETURN);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96826);mw.visitMaxs(3, 16);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96827);mw.visitEnd();

        __CLR4_1_1022ol22olluszwi0f.R.inc(96828);byte[] code = cw.toByteArray();
        __CLR4_1_1022ol22olluszwi0f.R.inc(96829);FileOutputStream fos = new FileOutputStream("Example.class");
        __CLR4_1_1022ol22olluszwi0f.R.inc(96830);fos.write(code);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96831);fos.close();

        __CLR4_1_1022ol22olluszwi0f.R.inc(96832);MyClassLoader loader = new MyClassLoader(com.alibaba.fastjson.serializer.ObjectSerializer.class.getClassLoader());

        __CLR4_1_1022ol22olluszwi0f.R.inc(96833);Class<?> exampleClass = loader.defineClassF("DateSerializer", code, 0, code.length);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96834);Method[] methods = exampleClass.getMethods();
        __CLR4_1_1022ol22olluszwi0f.R.inc(96835);Object instance = exampleClass.newInstance();

        __CLR4_1_1022ol22olluszwi0f.R.inc(96836);SerializeWriter out = new SerializeWriter();
        __CLR4_1_1022ol22olluszwi0f.R.inc(96837);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96838);Entity obj = new Entity();
        __CLR4_1_1022ol22olluszwi0f.R.inc(96839);methods[0].invoke(instance, serializer, obj);

        __CLR4_1_1022ol22olluszwi0f.R.inc(96840);System.out.println(out.toString());
    }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    String getCastType(Class<?> returnType) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96841);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96842);if ((((returnType.isPrimitive())&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96843)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96844)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96845);return getWrapperType(returnType);
        } }else {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96846);return getAsmTypeAsString(returnType, false);
        }
    }}finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    private String getWrapperType(Class<?> type) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96847);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96848);if ((((Integer.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96849)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96850)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96851);return Integer.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96852);if ((((Boolean.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96853)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96854)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96855);return Boolean.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96856);if ((((Character.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96857)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96858)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96859);return Character.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96860);if ((((Byte.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96861)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96862)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96863);return Byte.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96864);if ((((Short.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96865)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96866)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96867);return Short.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96868);if ((((Float.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96869)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96870)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96871);return Float.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96872);if ((((Long.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96873)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96874)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96875);return Long.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96876);if ((((Double.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96877)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96878)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96879);return Double.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96880);if ((((Void.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96881)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96882)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96883);return Void.class.getCanonicalName().replaceAll("\\.", "/");
        }

        }}}}}}}}}__CLR4_1_1022ol22olluszwi0f.R.inc(96884);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    public String getAsmTypeAsString(Class<?> parameterType, boolean wrap) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96885);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96886);if ((((parameterType.isArray())&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96887)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96888)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96889);if ((((parameterType.getComponentType().isPrimitive())&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96890)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96891)==0&false))) {{
                __CLR4_1_1022ol22olluszwi0f.R.inc(96892);Class<?> componentType = parameterType.getComponentType();
                __CLR4_1_1022ol22olluszwi0f.R.inc(96893);return "[" + getPrimitiveLetter(componentType);
            } }else {{
                __CLR4_1_1022ol22olluszwi0f.R.inc(96894);return "[" + getAsmTypeAsString(parameterType.getComponentType(), true);
            }
        }} }else {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96895);if ((((!parameterType.isPrimitive())&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96896)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96897)==0&false))) {{
                __CLR4_1_1022ol22olluszwi0f.R.inc(96898);String clsName = parameterType.getCanonicalName();

                __CLR4_1_1022ol22olluszwi0f.R.inc(96899);if ((((parameterType.isMemberClass())&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96900)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96901)==0&false))) {{
                    __CLR4_1_1022ol22olluszwi0f.R.inc(96902);int lastDot = clsName.lastIndexOf(".");
                    __CLR4_1_1022ol22olluszwi0f.R.inc(96903);clsName = clsName.substring(0, lastDot) + "$" + clsName.substring(lastDot + 1);
                }
                }__CLR4_1_1022ol22olluszwi0f.R.inc(96904);if ((((wrap)&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96905)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96906)==0&false))) {{
                    __CLR4_1_1022ol22olluszwi0f.R.inc(96907);return "L" + clsName.replaceAll("\\.", "/") + ";";
                } }else {{
                    __CLR4_1_1022ol22olluszwi0f.R.inc(96908);return clsName.replaceAll("\\.", "/");
                }
            }} }else {{
                __CLR4_1_1022ol22olluszwi0f.R.inc(96909);return getPrimitiveLetter(parameterType);
            }
        }}
    }}finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    private String getPrimitiveLetter(Class<?> type) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96910);
        __CLR4_1_1022ol22olluszwi0f.R.inc(96911);if ((((Integer.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96912)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96913)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96914);return "I";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96915);if ((((Void.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96916)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96917)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96918);return "V";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96919);if ((((Boolean.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96920)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96921)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96922);return "Z";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96923);if ((((Character.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96924)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96925)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96926);return "C";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96927);if ((((Byte.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96928)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96929)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96930);return "B";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96931);if ((((Short.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96932)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96933)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96934);return "S";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96935);if ((((Float.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96936)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96937)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96938);return "F";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96939);if ((((Long.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96940)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96941)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96942);return "J";
        } }else {__CLR4_1_1022ol22olluszwi0f.R.inc(96943);if ((((Double.TYPE.equals(type))&&(__CLR4_1_1022ol22olluszwi0f.R.iget(96944)!=0|true))||(__CLR4_1_1022ol22olluszwi0f.R.iget(96945)==0&false))) {{
            __CLR4_1_1022ol22olluszwi0f.R.inc(96946);return "D";
        }

        }}}}}}}}}__CLR4_1_1022ol22olluszwi0f.R.inc(96947);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    public static class Entity {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96948);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96949);return id;
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96950);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96951);this.id = id;
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96952);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96953);return name;
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96954);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96955);this.name = name;
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

    }

    public static class MyClassLoader extends ClassLoader {

        public MyClassLoader(ClassLoader parent){
            super(parent);__CLR4_1_1022ol22olluszwi0f.R.inc(96957);try{__CLR4_1_1022ol22olluszwi0f.R.inc(96956);
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}

        public Class<?> defineClassF(String name, byte[] b, int off, int len) throws ClassFormatError {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96958);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96959);return defineClass(name, b, off, len, null);
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}
    }

    public static class Foo {

        public void execute() {try{__CLR4_1_1022ol22olluszwi0f.R.inc(96960);
            __CLR4_1_1022ol22olluszwi0f.R.inc(96961);System.out.println("Hello World");
        }finally{__CLR4_1_1022ol22olluszwi0f.R.flushNeeded();}}
    }

}
