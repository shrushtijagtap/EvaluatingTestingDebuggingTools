/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//***
 * ASM: a very small and fast Java bytecode manipulation framework
 * Copyright (c) 2000-2007 INRIA, France Telecom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holders nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.alibaba.fastjson.asm;

/**
 * @author Eric Bruneton
 * @author Eugene Kuleshov
 */
public class MethodWriter implements MethodVisitor {public static class __CLR4_5_24t44t4lusyjj5e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,6364,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Next method writer (see {@link ClassWriter#firstMethod firstMethod}).
     */
    MethodWriter       next;

    /**
     * The class writer to which this method must be added.
     */
    final ClassWriter  cw;

    /**
     * Access flags of this method.
     */
    private int        access;

    /**
     * The index of the constant pool item that contains the name of this method.
     */
    private final int  name;

    /**
     * The index of the constant pool item that contains the descriptor of this method.
     */
    private final int  desc;

    /**
     * Number of exceptions that can be thrown by this method.
     */
    int                exceptionCount;

    /**
     * The exceptions that can be thrown by this method. More precisely, this array contains the indexes of the constant
     * pool items that contain the internal names of these exception classes.
     */
    int[]              exceptions;

    /**
     * The bytecode of this method.
     */
    private ByteVector code                                    = new ByteVector();

    /**
     * Maximum stack size of this method.
     */
    private int        maxStack;

    /**
     * Maximum number of local variables for this method.
     */
    private int        maxLocals;

    // ------------------------------------------------------------------------

    /*
     * Fields for the control flow graph analysis algorithm (used to compute the maximum stack size). A control flow
     * graph contains one node per "basic block", and one edge per "jump" from one basic block to another. Each node
     * (i.e., each basic block) is represented by the Label object that corresponds to the first instruction of this
     * basic block. Each node also stores the list of its successors in the graph, as a linked list of Edge objects.
     */

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    public MethodWriter(final ClassWriter cw, final int access, final String name, final String desc, final String signature, final String[] exceptions){try{__CLR4_5_24t44t4lusyjj5e.R.inc(6232);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6233);if ((((cw.firstMethod == null)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6234)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6235)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6236);cw.firstMethod = this;
        } }else {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6237);cw.lastMethod.next = this;
        }
        }__CLR4_5_24t44t4lusyjj5e.R.inc(6238);cw.lastMethod = this;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6239);this.cw = cw;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6240);this.access = access;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6241);this.name = cw.newUTF8(name);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6242);this.desc = cw.newUTF8(desc);

        __CLR4_5_24t44t4lusyjj5e.R.inc(6243);if ((((exceptions != null && exceptions.length > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6244)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6245)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6246);exceptionCount = exceptions.length;
            __CLR4_5_24t44t4lusyjj5e.R.inc(6247);this.exceptions = new int[exceptionCount];
            __CLR4_5_24t44t4lusyjj5e.R.inc(6248);for (int i = 0; (((i < exceptionCount)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6249)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6250)==0&false)); ++i) {{
                __CLR4_5_24t44t4lusyjj5e.R.inc(6251);this.exceptions[i] = cw.newClassItem(exceptions[i]).index;
            }
        }}
    }}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Implementation of the MethodVisitor interface
    // ------------------------------------------------------------------------

    public void visitInsn(final int opcode) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6252);
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6253);code.putByte(opcode);
        // update currentBlock
        // Label currentBlock = this.currentBlock;
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitIntInsn(final int opcode, final int operand) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6254);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        // if (opcode == Opcodes.SIPUSH) {
        // code.put12(opcode, operand);
        // } else { // BIPUSH or NEWARRAY
        __CLR4_5_24t44t4lusyjj5e.R.inc(6255);code.put11(opcode, operand);
        // }
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitVarInsn(final int opcode, final int var) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6256);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6257);if ((((var < 4 && opcode != Opcodes.RET)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6258)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6259)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6260);int opt;
            __CLR4_5_24t44t4lusyjj5e.R.inc(6261);if ((((opcode < Opcodes.ISTORE)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6262)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6263)==0&false))) {{
                /* ILOAD_0 */
                __CLR4_5_24t44t4lusyjj5e.R.inc(6264);opt = 26 + ((opcode - Opcodes.ILOAD) << 2) + var;
            } }else {{
                /* ISTORE_0 */
                __CLR4_5_24t44t4lusyjj5e.R.inc(6265);opt = 59 + ((opcode - Opcodes.ISTORE) << 2) + var;
            }
            }__CLR4_5_24t44t4lusyjj5e.R.inc(6266);code.putByte(opt);
        } }else {__CLR4_5_24t44t4lusyjj5e.R.inc(6267);if ((((var >= 256)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6268)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6269)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6270);code.putByte(196 /* WIDE */).put12(opcode, var);
        } }else {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6271);code.put11(opcode, var);
        }
    }}}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitTypeInsn(final int opcode, final String type) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6272);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6273);Item i = cw.newClassItem(type);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6274);code.put12(opcode, i.index);
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitFieldInsn(final int opcode, final String owner, final String name, final String desc) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6275);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6276);Item i = cw.newFieldItem(owner, name, desc);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6277);code.put12(opcode, i.index);
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitMethodInsn(final int opcode, final String owner, final String name, final String desc) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6278);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6279);boolean itf = opcode == Opcodes.INVOKEINTERFACE;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6280);Item i = cw.newMethodItem(owner, name, desc, itf);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6281);int argSize = i.intVal;
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6282);if ((((itf)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6283)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6284)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6285);if ((((argSize == 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6286)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6287)==0&false))) {{
                __CLR4_5_24t44t4lusyjj5e.R.inc(6288);argSize = Type.getArgumentsAndReturnSizes(desc);
                __CLR4_5_24t44t4lusyjj5e.R.inc(6289);i.intVal = argSize;
            }
            }__CLR4_5_24t44t4lusyjj5e.R.inc(6290);code.put12(Opcodes.INVOKEINTERFACE, i.index).put11(argSize >> 2, 0);
        } }else {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6291);code.put12(opcode, i.index);
        }
    }}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitJumpInsn(final int opcode, final Label label) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6292);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6293);if (((((label.status & 2 /* Label.RESOLVED */ ) != 0 && label.position - code.length < Short.MIN_VALUE)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6294)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6295)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6296);throw new UnsupportedOperationException();
        } }else {{
            /*
             * case of a backward jump with an offset >= -32768, or of a forward jump with, of course, an unknown
             * offset. In these cases we store the offset in 2 bytes (which will be increased in resizeInstructions, if
             * needed).
             */
            __CLR4_5_24t44t4lusyjj5e.R.inc(6297);code.putByte(opcode);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6298);label.put(this, code, code.length - 1);
        }
    }}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitLabel(final Label label) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6299);
        // resolves previous forward references to label, if any
        __CLR4_5_24t44t4lusyjj5e.R.inc(6300);label.resolve(this, code.length, code.data);
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitLdcInsn(final Object cst) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6301);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6302);Item i = cw.newConstItem(cst);
        // Label currentBlock = this.currentBlock;
        // adds the instruction to the bytecode of the method
        __CLR4_5_24t44t4lusyjj5e.R.inc(6303);int index = i.index;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6304);if ((((i.type == 5 /* ClassWriter.LONG */ || i.type == 6 /* ClassWriter.DOUBLE */)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6305)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6306)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6307);code.put12(20 /* LDC2_W */, index);
        } }else {__CLR4_5_24t44t4lusyjj5e.R.inc(6308);if ((((index >= 256)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6309)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6310)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6311);code.put12(19 /* LDC_W */, index);
        } }else {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6312);code.put11(18 /*Opcodes.LDC*/, index);
        }
    }}}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitIincInsn(final int var, final int increment) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6313);
        // adds the instruction to the bytecode of the method
//        if ((var > 255) || (increment > 127) || (increment < -128)) {
//            code.putByte(196 /* WIDE */).put12(Opcodes.IINC, var).putShort(increment);
//        } else {
            __CLR4_5_24t44t4lusyjj5e.R.inc(6314);code.putByte(132 /* Opcodes.IINC*/ ).put11(var, increment);
//        }
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitMaxs(final int maxStack, final int maxLocals) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6315);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6316);this.maxStack = maxStack;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6317);this.maxLocals = maxLocals;
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    public void visitEnd() {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6318);
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Utility methods: control flow analysis algorithm
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // Utility methods: stack map frames
    // ------------------------------------------------------------------------

    // ------------------------------------------------------------------------
    // Utility methods: dump bytecode array
    // ------------------------------------------------------------------------

    /**
     * Returns the size of the bytecode of this method.
     * 
     * @return the size of the bytecode of this method.
     */
    final int getSize() {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6319);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6320);int size = 8;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6321);if ((((code.length > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6322)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6323)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6324);cw.newUTF8("Code");
            __CLR4_5_24t44t4lusyjj5e.R.inc(6325);size += 18 + code.length + 8 * 0;
        }
        }__CLR4_5_24t44t4lusyjj5e.R.inc(6326);if ((((exceptionCount > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6327)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6328)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6329);cw.newUTF8("Exceptions");
            __CLR4_5_24t44t4lusyjj5e.R.inc(6330);size += 8 + 2 * exceptionCount;
        }
        }__CLR4_5_24t44t4lusyjj5e.R.inc(6331);return size;
    }finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

    /**
     * Puts the bytecode of this method in the given byte vector.
     * 
     * @param out the byte vector into which the bytecode of this method must be copied.
     */
    final void put(final ByteVector out) {try{__CLR4_5_24t44t4lusyjj5e.R.inc(6332);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6333);final int mask = 393216; //Opcodes.ACC_DEPRECATED | ClassWriter.ACC_SYNTHETIC_ATTRIBUTE | ((access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) / (ClassWriter.ACC_SYNTHETIC_ATTRIBUTE / Opcodes.ACC_SYNTHETIC));
        __CLR4_5_24t44t4lusyjj5e.R.inc(6334);out.putShort(access & ~mask).putShort(name).putShort(desc);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6335);int attributeCount = 0;
        __CLR4_5_24t44t4lusyjj5e.R.inc(6336);if ((((code.length > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6337)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6338)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6339);++attributeCount;
        }
        }__CLR4_5_24t44t4lusyjj5e.R.inc(6340);if ((((exceptionCount > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6341)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6342)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6343);++attributeCount;
        }

        }__CLR4_5_24t44t4lusyjj5e.R.inc(6344);out.putShort(attributeCount);
        __CLR4_5_24t44t4lusyjj5e.R.inc(6345);if ((((code.length > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6346)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6347)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6348);int size = 12 + code.length + 8 * 0; // handlerCount
            __CLR4_5_24t44t4lusyjj5e.R.inc(6349);out.putShort(cw.newUTF8("Code")).putInt(size);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6350);out.putShort(maxStack).putShort(maxLocals);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6351);out.putInt(code.length).putByteArray(code.data, 0, code.length);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6352);out.putShort(0); // handlerCount
            __CLR4_5_24t44t4lusyjj5e.R.inc(6353);attributeCount = 0;
            __CLR4_5_24t44t4lusyjj5e.R.inc(6354);out.putShort(attributeCount);
        }
        }__CLR4_5_24t44t4lusyjj5e.R.inc(6355);if ((((exceptionCount > 0)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6356)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6357)==0&false))) {{
            __CLR4_5_24t44t4lusyjj5e.R.inc(6358);out.putShort(cw.newUTF8("Exceptions")).putInt(2 * exceptionCount + 2);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6359);out.putShort(exceptionCount);
            __CLR4_5_24t44t4lusyjj5e.R.inc(6360);for (int i = 0; (((i < exceptionCount)&&(__CLR4_5_24t44t4lusyjj5e.R.iget(6361)!=0|true))||(__CLR4_5_24t44t4lusyjj5e.R.iget(6362)==0&false)); ++i) {{
                __CLR4_5_24t44t4lusyjj5e.R.inc(6363);out.putShort(exceptions[i]);
            }
        }}

    }}finally{__CLR4_5_24t44t4lusyjj5e.R.flushNeeded();}}

}
