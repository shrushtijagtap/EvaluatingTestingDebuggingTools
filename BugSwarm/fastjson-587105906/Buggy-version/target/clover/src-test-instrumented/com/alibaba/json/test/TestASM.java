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

public class TestASM extends TestCase implements Opcodes {static class __CLR4_1_1021qd21qdlusqkrpi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public void test_asm() throws Exception {__CLR4_1_1021qd21qdlusqkrpi.R.globalSliceStart(getClass().getName(),95557);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rqy90r21qd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021qd21qdlusqkrpi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021qd21qdlusqkrpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_asm",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95557,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rqy90r21qd() throws Exception{try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95557);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95558);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95559);System.out.println(text);
    }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_1021qd21qdlusqkrpi.R.globalSliceStart(getClass().getName(),95560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl21qg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021qd21qdlusqkrpi.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021qd21qdlusqkrpi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95560,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl21qg() throws Exception{try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95560);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95561);ClassWriter cw = new ClassWriter();
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95562);cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "DateSerializer", "java/lang/Object", new String[] { "com/alibaba/fastjson/serializer/ObjectSerializer" });

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95563);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>", "()V", null, null);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95564);mw.visitVarInsn(ALOAD, 0);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95565);mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95566);mw.visitInsn(RETURN);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95567);mw.visitMaxs(1, 1);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95568);mw.visitEnd();

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95569);mw = new MethodWriter(cw, ACC_PUBLIC, "write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95570);mw.visitVarInsn(ALOAD, 1); // serializer
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95571);mw.visitMethodInsn(INVOKEVIRTUAL, "com/alibaba/fastjson/serializer/JSONSerializer", "getWriter", "()Lcom/alibaba/fastjson/serializer/SerializeWriter;");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95572);mw.visitVarInsn(ASTORE, 3); // out

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95573);mw.visitVarInsn(ALOAD, 2); // obj
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95574);mw.visitTypeInsn(CHECKCAST, getCastType(Entity.class)); // serializer
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95575);mw.visitVarInsn(ASTORE, 4); // obj
        
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95576);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95577);mw.visitLdcInsn("{");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95578);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");
        
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95579);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95580);mw.visitLdcInsn("\"id\":");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95581);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95582);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95583);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95584);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getId", "()I");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95585);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeInt", "(I)V");
        
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95586);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95587);mw.visitLdcInsn("\",name\":");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95588);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95589);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95590);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95591);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getName", "()Ljava/lang/String;");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95592);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95593);mw.visitInsn(RETURN);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95594);mw.visitMaxs(3, 16);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95595);mw.visitEnd();

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95596);byte[] code = cw.toByteArray();
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95597);FileOutputStream fos = new FileOutputStream("Example.class");
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95598);fos.write(code);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95599);fos.close();

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95600);MyClassLoader loader = new MyClassLoader(com.alibaba.fastjson.serializer.ObjectSerializer.class.getClassLoader());

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95601);Class<?> exampleClass = loader.defineClassF("DateSerializer", code, 0, code.length);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95602);Method[] methods = exampleClass.getMethods();
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95603);Object instance = exampleClass.newInstance();

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95604);SerializeWriter out = new SerializeWriter();
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95605);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95606);Entity obj = new Entity();
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95607);methods[0].invoke(instance, serializer, obj);

        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95608);System.out.println(out.toString());
    }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    String getCastType(Class<?> returnType) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95609);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95610);if ((((returnType.isPrimitive())&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95611)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95612)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95613);return getWrapperType(returnType);
        } }else {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95614);return getAsmTypeAsString(returnType, false);
        }
    }}finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    private String getWrapperType(Class<?> type) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95615);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95616);if ((((Integer.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95617)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95618)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95619);return Integer.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95620);if ((((Boolean.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95621)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95622)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95623);return Boolean.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95624);if ((((Character.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95625)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95626)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95627);return Character.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95628);if ((((Byte.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95629)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95630)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95631);return Byte.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95632);if ((((Short.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95633)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95634)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95635);return Short.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95636);if ((((Float.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95637)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95638)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95639);return Float.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95640);if ((((Long.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95641)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95642)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95643);return Long.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95644);if ((((Double.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95645)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95646)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95647);return Double.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95648);if ((((Void.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95649)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95650)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95651);return Void.class.getCanonicalName().replaceAll("\\.", "/");
        }

        }}}}}}}}}__CLR4_1_1021qd21qdlusqkrpi.R.inc(95652);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    public String getAsmTypeAsString(Class<?> parameterType, boolean wrap) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95653);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95654);if ((((parameterType.isArray())&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95655)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95656)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95657);if ((((parameterType.getComponentType().isPrimitive())&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95658)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95659)==0&false))) {{
                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95660);Class<?> componentType = parameterType.getComponentType();
                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95661);return "[" + getPrimitiveLetter(componentType);
            } }else {{
                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95662);return "[" + getAsmTypeAsString(parameterType.getComponentType(), true);
            }
        }} }else {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95663);if ((((!parameterType.isPrimitive())&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95664)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95665)==0&false))) {{
                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95666);String clsName = parameterType.getCanonicalName();

                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95667);if ((((parameterType.isMemberClass())&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95668)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95669)==0&false))) {{
                    __CLR4_1_1021qd21qdlusqkrpi.R.inc(95670);int lastDot = clsName.lastIndexOf(".");
                    __CLR4_1_1021qd21qdlusqkrpi.R.inc(95671);clsName = clsName.substring(0, lastDot) + "$" + clsName.substring(lastDot + 1);
                }
                }__CLR4_1_1021qd21qdlusqkrpi.R.inc(95672);if ((((wrap)&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95673)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95674)==0&false))) {{
                    __CLR4_1_1021qd21qdlusqkrpi.R.inc(95675);return "L" + clsName.replaceAll("\\.", "/") + ";";
                } }else {{
                    __CLR4_1_1021qd21qdlusqkrpi.R.inc(95676);return clsName.replaceAll("\\.", "/");
                }
            }} }else {{
                __CLR4_1_1021qd21qdlusqkrpi.R.inc(95677);return getPrimitiveLetter(parameterType);
            }
        }}
    }}finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    private String getPrimitiveLetter(Class<?> type) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95678);
        __CLR4_1_1021qd21qdlusqkrpi.R.inc(95679);if ((((Integer.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95680)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95681)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95682);return "I";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95683);if ((((Void.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95684)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95685)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95686);return "V";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95687);if ((((Boolean.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95688)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95689)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95690);return "Z";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95691);if ((((Character.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95692)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95693)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95694);return "C";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95695);if ((((Byte.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95696)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95697)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95698);return "B";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95699);if ((((Short.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95700)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95701)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95702);return "S";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95703);if ((((Float.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95704)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95705)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95706);return "F";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95707);if ((((Long.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95708)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95709)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95710);return "J";
        } }else {__CLR4_1_1021qd21qdlusqkrpi.R.inc(95711);if ((((Double.TYPE.equals(type))&&(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95712)!=0|true))||(__CLR4_1_1021qd21qdlusqkrpi.R.iget(95713)==0&false))) {{
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95714);return "D";
        }

        }}}}}}}}}__CLR4_1_1021qd21qdlusqkrpi.R.inc(95715);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    public static class Entity {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95716);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95717);return id;
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95718);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95719);this.id = id;
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95720);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95721);return name;
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95722);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95723);this.name = name;
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

    }

    public static class MyClassLoader extends ClassLoader {

        public MyClassLoader(ClassLoader parent){
            super(parent);__CLR4_1_1021qd21qdlusqkrpi.R.inc(95725);try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95724);
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}

        public Class<?> defineClassF(String name, byte[] b, int off, int len) throws ClassFormatError {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95726);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95727);return defineClass(name, b, off, len, null);
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}
    }

    public static class Foo {

        public void execute() {try{__CLR4_1_1021qd21qdlusqkrpi.R.inc(95728);
            __CLR4_1_1021qd21qdlusqkrpi.R.inc(95729);System.out.println("Hello World");
        }finally{__CLR4_1_1021qd21qdlusqkrpi.R.flushNeeded();}}
    }

}
