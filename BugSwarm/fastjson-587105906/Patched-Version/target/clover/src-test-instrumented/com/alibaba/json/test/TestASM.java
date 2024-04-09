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

public class TestASM extends TestCase implements Opcodes {static class __CLR4_5_222oa22oalusvnk33{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96951,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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

    public void test_asm() throws Exception {__CLR4_5_222oa22oalusvnk33.R.globalSliceStart(getClass().getName(),96778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rqy90r22oa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222oa22oalusvnk33.R.rethrow($CLV_t2$);}finally{__CLR4_5_222oa22oalusvnk33.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_asm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rqy90r22oa() throws Exception{try{__CLR4_5_222oa22oalusvnk33.R.inc(96778);
        __CLR4_5_222oa22oalusvnk33.R.inc(96779);String text = JSON.toJSONString(EishayEncode.mediaContent);
        __CLR4_5_222oa22oalusvnk33.R.inc(96780);System.out.println(text);
    }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_222oa22oalusvnk33.R.globalSliceStart(getClass().getName(),96781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl22od();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222oa22oalusvnk33.R.rethrow($CLV_t2$);}finally{__CLR4_5_222oa22oalusvnk33.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.TestASM.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96781,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl22od() throws Exception{try{__CLR4_5_222oa22oalusvnk33.R.inc(96781);
        __CLR4_5_222oa22oalusvnk33.R.inc(96782);ClassWriter cw = new ClassWriter();
        __CLR4_5_222oa22oalusvnk33.R.inc(96783);cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, "DateSerializer", "java/lang/Object", new String[] { "com/alibaba/fastjson/serializer/ObjectSerializer" });

        __CLR4_5_222oa22oalusvnk33.R.inc(96784);MethodVisitor mw = new MethodWriter(cw, ACC_PUBLIC, "<init>", "()V", null, null);
        __CLR4_5_222oa22oalusvnk33.R.inc(96785);mw.visitVarInsn(ALOAD, 0);
        __CLR4_5_222oa22oalusvnk33.R.inc(96786);mw.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
        __CLR4_5_222oa22oalusvnk33.R.inc(96787);mw.visitInsn(RETURN);
        __CLR4_5_222oa22oalusvnk33.R.inc(96788);mw.visitMaxs(1, 1);
        __CLR4_5_222oa22oalusvnk33.R.inc(96789);mw.visitEnd();

        __CLR4_5_222oa22oalusvnk33.R.inc(96790);mw = new MethodWriter(cw, ACC_PUBLIC, "write", "(Lcom/alibaba/fastjson/serializer/JSONSerializer;Ljava/lang/Object;)V", null, new String[] { "java/io/IOException" });

        __CLR4_5_222oa22oalusvnk33.R.inc(96791);mw.visitVarInsn(ALOAD, 1); // serializer
        __CLR4_5_222oa22oalusvnk33.R.inc(96792);mw.visitMethodInsn(INVOKEVIRTUAL, "com/alibaba/fastjson/serializer/JSONSerializer", "getWriter", "()Lcom/alibaba/fastjson/serializer/SerializeWriter;");
        __CLR4_5_222oa22oalusvnk33.R.inc(96793);mw.visitVarInsn(ASTORE, 3); // out

        __CLR4_5_222oa22oalusvnk33.R.inc(96794);mw.visitVarInsn(ALOAD, 2); // obj
        __CLR4_5_222oa22oalusvnk33.R.inc(96795);mw.visitTypeInsn(CHECKCAST, getCastType(Entity.class)); // serializer
        __CLR4_5_222oa22oalusvnk33.R.inc(96796);mw.visitVarInsn(ASTORE, 4); // obj
        
        __CLR4_5_222oa22oalusvnk33.R.inc(96797);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_222oa22oalusvnk33.R.inc(96798);mw.visitLdcInsn("{");
        __CLR4_5_222oa22oalusvnk33.R.inc(96799);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");
        
        __CLR4_5_222oa22oalusvnk33.R.inc(96800);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_222oa22oalusvnk33.R.inc(96801);mw.visitLdcInsn("\"id\":");
        __CLR4_5_222oa22oalusvnk33.R.inc(96802);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_5_222oa22oalusvnk33.R.inc(96803);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_222oa22oalusvnk33.R.inc(96804);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_5_222oa22oalusvnk33.R.inc(96805);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getId", "()I");
        __CLR4_5_222oa22oalusvnk33.R.inc(96806);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeInt", "(I)V");
        
        __CLR4_5_222oa22oalusvnk33.R.inc(96807);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_222oa22oalusvnk33.R.inc(96808);mw.visitLdcInsn("\",name\":");
        __CLR4_5_222oa22oalusvnk33.R.inc(96809);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "write", "(Ljava/lang/String;)V");
        
        __CLR4_5_222oa22oalusvnk33.R.inc(96810);mw.visitVarInsn(ALOAD, 3); // out
        __CLR4_5_222oa22oalusvnk33.R.inc(96811);mw.visitVarInsn(ALOAD, 4); // entity
        __CLR4_5_222oa22oalusvnk33.R.inc(96812);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(Entity.class), "getName", "()Ljava/lang/String;");
        __CLR4_5_222oa22oalusvnk33.R.inc(96813);mw.visitMethodInsn(INVOKEVIRTUAL, getCastType(SerializeWriter.class), "writeString", "(Ljava/lang/String;)V");

        __CLR4_5_222oa22oalusvnk33.R.inc(96814);mw.visitInsn(RETURN);
        __CLR4_5_222oa22oalusvnk33.R.inc(96815);mw.visitMaxs(3, 16);
        __CLR4_5_222oa22oalusvnk33.R.inc(96816);mw.visitEnd();

        __CLR4_5_222oa22oalusvnk33.R.inc(96817);byte[] code = cw.toByteArray();
        __CLR4_5_222oa22oalusvnk33.R.inc(96818);FileOutputStream fos = new FileOutputStream("Example.class");
        __CLR4_5_222oa22oalusvnk33.R.inc(96819);fos.write(code);
        __CLR4_5_222oa22oalusvnk33.R.inc(96820);fos.close();

        __CLR4_5_222oa22oalusvnk33.R.inc(96821);MyClassLoader loader = new MyClassLoader(com.alibaba.fastjson.serializer.ObjectSerializer.class.getClassLoader());

        __CLR4_5_222oa22oalusvnk33.R.inc(96822);Class<?> exampleClass = loader.defineClassF("DateSerializer", code, 0, code.length);
        __CLR4_5_222oa22oalusvnk33.R.inc(96823);Method[] methods = exampleClass.getMethods();
        __CLR4_5_222oa22oalusvnk33.R.inc(96824);Object instance = exampleClass.newInstance();

        __CLR4_5_222oa22oalusvnk33.R.inc(96825);SerializeWriter out = new SerializeWriter();
        __CLR4_5_222oa22oalusvnk33.R.inc(96826);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_222oa22oalusvnk33.R.inc(96827);Entity obj = new Entity();
        __CLR4_5_222oa22oalusvnk33.R.inc(96828);methods[0].invoke(instance, serializer, obj);

        __CLR4_5_222oa22oalusvnk33.R.inc(96829);System.out.println(out.toString());
    }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    String getCastType(Class<?> returnType) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96830);
        __CLR4_5_222oa22oalusvnk33.R.inc(96831);if ((((returnType.isPrimitive())&&(__CLR4_5_222oa22oalusvnk33.R.iget(96832)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96833)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96834);return getWrapperType(returnType);
        } }else {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96835);return getAsmTypeAsString(returnType, false);
        }
    }}finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    private String getWrapperType(Class<?> type) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96836);
        __CLR4_5_222oa22oalusvnk33.R.inc(96837);if ((((Integer.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96838)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96839)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96840);return Integer.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96841);if ((((Boolean.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96842)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96843)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96844);return Boolean.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96845);if ((((Character.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96846)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96847)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96848);return Character.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96849);if ((((Byte.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96850)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96851)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96852);return Byte.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96853);if ((((Short.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96854)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96855)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96856);return Short.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96857);if ((((Float.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96858)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96859)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96860);return Float.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96861);if ((((Long.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96862)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96863)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96864);return Long.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96865);if ((((Double.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96866)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96867)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96868);return Double.class.getCanonicalName().replaceAll("\\.", "/");
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96869);if ((((Void.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96870)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96871)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96872);return Void.class.getCanonicalName().replaceAll("\\.", "/");
        }

        }}}}}}}}}__CLR4_5_222oa22oalusvnk33.R.inc(96873);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    public String getAsmTypeAsString(Class<?> parameterType, boolean wrap) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96874);
        __CLR4_5_222oa22oalusvnk33.R.inc(96875);if ((((parameterType.isArray())&&(__CLR4_5_222oa22oalusvnk33.R.iget(96876)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96877)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96878);if ((((parameterType.getComponentType().isPrimitive())&&(__CLR4_5_222oa22oalusvnk33.R.iget(96879)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96880)==0&false))) {{
                __CLR4_5_222oa22oalusvnk33.R.inc(96881);Class<?> componentType = parameterType.getComponentType();
                __CLR4_5_222oa22oalusvnk33.R.inc(96882);return "[" + getPrimitiveLetter(componentType);
            } }else {{
                __CLR4_5_222oa22oalusvnk33.R.inc(96883);return "[" + getAsmTypeAsString(parameterType.getComponentType(), true);
            }
        }} }else {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96884);if ((((!parameterType.isPrimitive())&&(__CLR4_5_222oa22oalusvnk33.R.iget(96885)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96886)==0&false))) {{
                __CLR4_5_222oa22oalusvnk33.R.inc(96887);String clsName = parameterType.getCanonicalName();

                __CLR4_5_222oa22oalusvnk33.R.inc(96888);if ((((parameterType.isMemberClass())&&(__CLR4_5_222oa22oalusvnk33.R.iget(96889)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96890)==0&false))) {{
                    __CLR4_5_222oa22oalusvnk33.R.inc(96891);int lastDot = clsName.lastIndexOf(".");
                    __CLR4_5_222oa22oalusvnk33.R.inc(96892);clsName = clsName.substring(0, lastDot) + "$" + clsName.substring(lastDot + 1);
                }
                }__CLR4_5_222oa22oalusvnk33.R.inc(96893);if ((((wrap)&&(__CLR4_5_222oa22oalusvnk33.R.iget(96894)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96895)==0&false))) {{
                    __CLR4_5_222oa22oalusvnk33.R.inc(96896);return "L" + clsName.replaceAll("\\.", "/") + ";";
                } }else {{
                    __CLR4_5_222oa22oalusvnk33.R.inc(96897);return clsName.replaceAll("\\.", "/");
                }
            }} }else {{
                __CLR4_5_222oa22oalusvnk33.R.inc(96898);return getPrimitiveLetter(parameterType);
            }
        }}
    }}finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    private String getPrimitiveLetter(Class<?> type) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96899);
        __CLR4_5_222oa22oalusvnk33.R.inc(96900);if ((((Integer.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96901)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96902)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96903);return "I";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96904);if ((((Void.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96905)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96906)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96907);return "V";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96908);if ((((Boolean.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96909)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96910)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96911);return "Z";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96912);if ((((Character.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96913)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96914)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96915);return "C";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96916);if ((((Byte.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96917)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96918)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96919);return "B";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96920);if ((((Short.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96921)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96922)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96923);return "S";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96924);if ((((Float.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96925)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96926)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96927);return "F";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96928);if ((((Long.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96929)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96930)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96931);return "J";
        } }else {__CLR4_5_222oa22oalusvnk33.R.inc(96932);if ((((Double.TYPE.equals(type))&&(__CLR4_5_222oa22oalusvnk33.R.iget(96933)!=0|true))||(__CLR4_5_222oa22oalusvnk33.R.iget(96934)==0&false))) {{
            __CLR4_5_222oa22oalusvnk33.R.inc(96935);return "D";
        }

        }}}}}}}}}__CLR4_5_222oa22oalusvnk33.R.inc(96936);throw new IllegalStateException("Type: " + type.getCanonicalName() + " is not a primitive type");
    }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    public static class Entity {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_222oa22oalusvnk33.R.inc(96937);
            __CLR4_5_222oa22oalusvnk33.R.inc(96938);return id;
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96939);
            __CLR4_5_222oa22oalusvnk33.R.inc(96940);this.id = id;
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_222oa22oalusvnk33.R.inc(96941);
            __CLR4_5_222oa22oalusvnk33.R.inc(96942);return name;
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_222oa22oalusvnk33.R.inc(96943);
            __CLR4_5_222oa22oalusvnk33.R.inc(96944);this.name = name;
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

    }

    public static class MyClassLoader extends ClassLoader {

        public MyClassLoader(ClassLoader parent){
            super(parent);__CLR4_5_222oa22oalusvnk33.R.inc(96946);try{__CLR4_5_222oa22oalusvnk33.R.inc(96945);
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}

        public Class<?> defineClassF(String name, byte[] b, int off, int len) throws ClassFormatError {try{__CLR4_5_222oa22oalusvnk33.R.inc(96947);
            __CLR4_5_222oa22oalusvnk33.R.inc(96948);return defineClass(name, b, off, len, null);
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}
    }

    public static class Foo {

        public void execute() {try{__CLR4_5_222oa22oalusvnk33.R.inc(96949);
            __CLR4_5_222oa22oalusvnk33.R.inc(96950);System.out.println("Hello World");
        }finally{__CLR4_5_222oa22oalusvnk33.R.flushNeeded();}}
    }

}
