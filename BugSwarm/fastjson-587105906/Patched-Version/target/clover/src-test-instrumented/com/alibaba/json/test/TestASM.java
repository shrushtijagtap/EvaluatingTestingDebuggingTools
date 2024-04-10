/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

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

public class TestASM extends TestCase implements Opcodes {static class __CLR4_5_221q221q2lusyjwif{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95719,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public void test_asm() throws Exception {__CLR4_5_221q221q2lusyjwif.R.globalSliceStart(getClass().getName(),95546);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqy90r21q2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221q221q2lusyjwif.R.rethrow($CLV_t2$);}finally{__CLR4_5_221q221q2lusyjwif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95546,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqy90r21q2() throws Exception{try{__CLR4_5_221q221q2lusyjwif.R.inc(95546);
        __CLR4_5_221q221q2lusyjwif.R.inc(95547);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_5_221q221q2lusyjwif.R.inc(95548);System.out.println(text);
    }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_221q221q2lusyjwif.R.globalSliceStart(getClass().getName(),95549);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl21q5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221q221q2lusyjwif.R.rethrow($CLV_t2$);}finally{__CLR4_5_221q221q2lusyjwif.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95549,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl21q5() throws Exception{try{__CLR4_5_221q221q2lusyjwif.R.inc(95549);
        __CLR4_5_221q221q2lusyjwif.R.inc(95550);ClassWriter cw = new ClassWriter();
        __CLR4_5_221q221q2lusyjwif.R.inc(95551);cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "DateSerializer", "java/lang/Object", new String[] { "com/alibaba/fastjson/serializer/ObjectSerializer" });

        __CLR4_5_221q221q2lusyjwif.R.inc(95552);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>", "()V", null, null);
        __CLR4_5_221q221q2lusyjwif.R.inc(95553);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_221q221q2lusyjwif.R.inc(95554);mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        __CLR4_5_221q221q2lusyjwif.R.inc(95555);mw.visitInsn(RETURN);
        __CLR4_5_221q221q2lusyjwif.R.inc(95556);mw.visitMaxs(1, 1);
        __CLR4_5_221q221q2lusyjwif.R.inc(95557);mw.visitEnd();

        __CLR4_5_221q221q2lusyjwif.R.inc(95558);mw = new MethodWriter(cw, ACC_PUBLIC, "write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });

        __CLR4_5_221q221q2lusyjwif.R.inc(95559);mw.visitVarInsn(ALOAD, 1); // serializer
        __CLR4_5_221q221q2lusyjwif.R.inc(95560);mw.visitMethodInsn(INVOKEVIRTUAL, "com/alibaba/fastjson/serializer/JSONSerializer", "getWriter", "()Lcom/alibaba/fastjson/serializer/SerializeWriter;");
        __CLR4_5_221q221q2lusyjwif.R.inc(95561);mw.visitVarInsn(ASTORE, 3); // out

        __CLR4_5_221q221q2lusyjwif.R.inc(95562);mw.visitVarInsn(ALOAD, 2); // obj
        __CLR4_5_221q221q2lusyjwif.R.inc(95563);mw.visitTypeInsn(CHECKCAST, getCastType(Entity.class)); // serializer
        __CLR4_5_221q221q2lusyjwif.R.inc(95564);mw.visitVarInsn(ASTORE, 4); // obj
        
        __CLR4_5_221q221q2lusyjwif.R.inc(95565);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_221q221q2lusyjwif.R.inc(95566);mw.visitLdcInsn("{");
        __CLR4_5_221q221q2lusyjwif.R.inc(95567);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");
        
        __CLR4_5_221q221q2lusyjwif.R.inc(95568);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_221q221q2lusyjwif.R.inc(95569);mw.visitLdcInsn("\"id\":");
        __CLR4_5_221q221q2lusyjwif.R.inc(95570);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_5_221q221q2lusyjwif.R.inc(95571);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_221q221q2lusyjwif.R.inc(95572);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_5_221q221q2lusyjwif.R.inc(95573);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getId", "()I");
        __CLR4_5_221q221q2lusyjwif.R.inc(95574);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeInt", "(I)V");
        
        __CLR4_5_221q221q2lusyjwif.R.inc(95575);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_221q221q2lusyjwif.R.inc(95576);mw.visitLdcInsn("\",name\":");
        __CLR4_5_221q221q2lusyjwif.R.inc(95577);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_5_221q221q2lusyjwif.R.inc(95578);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_221q221q2lusyjwif.R.inc(95579);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_5_221q221q2lusyjwif.R.inc(95580);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getName", "()Ljava/lang/String;");
        __CLR4_5_221q221q2lusyjwif.R.inc(95581);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");

        __CLR4_5_221q221q2lusyjwif.R.inc(95582);mw.visitInsn(RETURN);
        __CLR4_5_221q221q2lusyjwif.R.inc(95583);mw.visitMaxs(3, 16);
        __CLR4_5_221q221q2lusyjwif.R.inc(95584);mw.visitEnd();

        __CLR4_5_221q221q2lusyjwif.R.inc(95585);byte[] code = cw.toByteArray();
        __CLR4_5_221q221q2lusyjwif.R.inc(95586);FileOutputStream fos = new FileOutputStream("Example.class");
        __CLR4_5_221q221q2lusyjwif.R.inc(95587);fos.write(code);
        __CLR4_5_221q221q2lusyjwif.R.inc(95588);fos.close();

        __CLR4_5_221q221q2lusyjwif.R.inc(95589);MyClassLoader loader = new MyClassLoader(com.alibaba.fastjson.serializer.ObjectSerializer.class.getClassLoader());

        __CLR4_5_221q221q2lusyjwif.R.inc(95590);Class<?> exampleClass = loader.defineClassF("DateSerializer", code, 0, code.length);
        __CLR4_5_221q221q2lusyjwif.R.inc(95591);Method[] methods = exampleClass.getMethods();
        __CLR4_5_221q221q2lusyjwif.R.inc(95592);Object instance = exampleClass.newInstance();

        __CLR4_5_221q221q2lusyjwif.R.inc(95593);SerializeWriter out = new SerializeWriter();
        __CLR4_5_221q221q2lusyjwif.R.inc(95594);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_221q221q2lusyjwif.R.inc(95595);Entity obj = new Entity();
        __CLR4_5_221q221q2lusyjwif.R.inc(95596);methods[0].invoke(instance, serializer, obj);

        __CLR4_5_221q221q2lusyjwif.R.inc(95597);System.out.println(out.toString());
    }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    String getCastType(Class<?> returnType) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95598);
        __CLR4_5_221q221q2lusyjwif.R.inc(95599);if ((((returnType.isPrimitive())&&(__CLR4_5_221q221q2lusyjwif.R.iget(95600)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95601)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95602);return getWrapperType(returnType);
        } }else {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95603);return getAsmTypeAsString(returnType, false);
        }
    }}finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    private String getWrapperType(Class<?> type) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95604);
        __CLR4_5_221q221q2lusyjwif.R.inc(95605);if ((((Integer.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95606)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95607)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95608);return Integer.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95609);if ((((Boolean.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95610)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95611)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95612);return Boolean.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95613);if ((((Character.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95614)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95615)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95616);return Character.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95617);if ((((Byte.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95618)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95619)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95620);return Byte.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95621);if ((((Short.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95622)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95623)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95624);return Short.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95625);if ((((Float.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95626)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95627)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95628);return Float.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95629);if ((((Long.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95630)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95631)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95632);return Long.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95633);if ((((Double.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95634)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95635)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95636);return Double.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95637);if ((((Void.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95638)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95639)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95640);return Void.class.getCanonicalName().replaceAll("\\.", "/");
        }

        }}}}}}}}}__CLR4_5_221q221q2lusyjwif.R.inc(95641);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    public String getAsmTypeAsString(Class<?> parameterType, boolean wrap) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95642);
        __CLR4_5_221q221q2lusyjwif.R.inc(95643);if ((((parameterType.isArray())&&(__CLR4_5_221q221q2lusyjwif.R.iget(95644)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95645)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95646);if ((((parameterType.getComponentType().isPrimitive())&&(__CLR4_5_221q221q2lusyjwif.R.iget(95647)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95648)==0&false))) {{
                __CLR4_5_221q221q2lusyjwif.R.inc(95649);Class<?> componentType = parameterType.getComponentType();
                __CLR4_5_221q221q2lusyjwif.R.inc(95650);return "[" + getPrimitiveLetter(componentType);
            } }else {{
                __CLR4_5_221q221q2lusyjwif.R.inc(95651);return "[" + getAsmTypeAsString(parameterType.getComponentType(), true);
            }
        }} }else {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95652);if ((((!parameterType.isPrimitive())&&(__CLR4_5_221q221q2lusyjwif.R.iget(95653)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95654)==0&false))) {{
                __CLR4_5_221q221q2lusyjwif.R.inc(95655);String clsName = parameterType.getCanonicalName();

                __CLR4_5_221q221q2lusyjwif.R.inc(95656);if ((((parameterType.isMemberClass())&&(__CLR4_5_221q221q2lusyjwif.R.iget(95657)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95658)==0&false))) {{
                    __CLR4_5_221q221q2lusyjwif.R.inc(95659);int lastDot = clsName.lastIndexOf(".");
                    __CLR4_5_221q221q2lusyjwif.R.inc(95660);clsName = clsName.substring(0, lastDot) + "$" + clsName.substring(lastDot + 1);
                }
                }__CLR4_5_221q221q2lusyjwif.R.inc(95661);if ((((wrap)&&(__CLR4_5_221q221q2lusyjwif.R.iget(95662)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95663)==0&false))) {{
                    __CLR4_5_221q221q2lusyjwif.R.inc(95664);return "L" + clsName.replaceAll("\\.", "/") + ";";
                } }else {{
                    __CLR4_5_221q221q2lusyjwif.R.inc(95665);return clsName.replaceAll("\\.", "/");
                }
            }} }else {{
                __CLR4_5_221q221q2lusyjwif.R.inc(95666);return getPrimitiveLetter(parameterType);
            }
        }}
    }}finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    private String getPrimitiveLetter(Class<?> type) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95667);
        __CLR4_5_221q221q2lusyjwif.R.inc(95668);if ((((Integer.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95669)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95670)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95671);return "I";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95672);if ((((Void.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95673)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95674)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95675);return "V";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95676);if ((((Boolean.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95677)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95678)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95679);return "Z";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95680);if ((((Character.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95681)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95682)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95683);return "C";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95684);if ((((Byte.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95685)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95686)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95687);return "B";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95688);if ((((Short.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95689)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95690)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95691);return "S";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95692);if ((((Float.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95693)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95694)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95695);return "F";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95696);if ((((Long.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95697)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95698)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95699);return "J";
        } }else {__CLR4_5_221q221q2lusyjwif.R.inc(95700);if ((((Double.TYPE.equals(type))&&(__CLR4_5_221q221q2lusyjwif.R.iget(95701)!=0|true))||(__CLR4_5_221q221q2lusyjwif.R.iget(95702)==0&false))) {{
            __CLR4_5_221q221q2lusyjwif.R.inc(95703);return "D";
        }

        }}}}}}}}}__CLR4_5_221q221q2lusyjwif.R.inc(95704);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    public static class Entity {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_221q221q2lusyjwif.R.inc(95705);
            __CLR4_5_221q221q2lusyjwif.R.inc(95706);return id;
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95707);
            __CLR4_5_221q221q2lusyjwif.R.inc(95708);this.id = id;
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_221q221q2lusyjwif.R.inc(95709);
            __CLR4_5_221q221q2lusyjwif.R.inc(95710);return name;
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_221q221q2lusyjwif.R.inc(95711);
            __CLR4_5_221q221q2lusyjwif.R.inc(95712);this.name = name;
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

    }

    public static class MyClassLoader extends ClassLoader {

        public MyClassLoader(ClassLoader parent){
            super(parent);__CLR4_5_221q221q2lusyjwif.R.inc(95714);try{__CLR4_5_221q221q2lusyjwif.R.inc(95713);
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}

        public Class<?> defineClassF(String name, byte[] b, int off, int len) throws ClassFormatError {try{__CLR4_5_221q221q2lusyjwif.R.inc(95715);
            __CLR4_5_221q221q2lusyjwif.R.inc(95716);return defineClass(name, b, off, len, null);
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}
    }

    public static class Foo {

        public void execute() {try{__CLR4_5_221q221q2lusyjwif.R.inc(95717);
            __CLR4_5_221q221q2lusyjwif.R.inc(95718);System.out.println("Hello World");
        }finally{__CLR4_5_221q221q2lusyjwif.R.flushNeeded();}}
    }

}
