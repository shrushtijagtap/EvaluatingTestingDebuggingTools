/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//***
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
 * A label represents a position in the bytecode of a method. Labels are used for jump, goto, and switch instructions,
 * and for try catch blocks. A label designates the <i>instruction</i> that is just after. Note however that there can
 * be other elements between a label and the instruction it designates (such as other labels, stack map frames, line
 * numbers, etc.).
 * 
 * @author Eric Bruneton
 */
public class Label {public static class __CLR4_1_104rm4rmlusqj8ph{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688524911L,8589935092L,6211,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    int              status;

    /**
     * The position of this label in the code, if known.
     */
    int              position;

    /**
     * Number of forward references to this label, times two.
     */
    private int      referenceCount;

    /**
     * Informations about forward references. Each forward reference is described by two consecutive integers in this
     * array: the first one is the position of the first byte of the bytecode instruction that contains the forward
     * reference, while the second is the position of the first byte of the forward reference itself. In fact the sign
     * of the first integer indicates if this reference uses 2 or 4 bytes, and its absolute value gives the position of
     * the bytecode instruction. This array is also used as a bitset to store the subroutines to which a basic block
     * belongs. This information is needed in MethodWriter#visitMaxs, after all forward references have been
     * resolved. Hence the same array can be used for both purposes without problems.
     */
    private int[]    srcAndRefPositions;

    // ------------------------------------------------------------------------

    /*
     * Fields for the control flow and data flow graph analysis algorithms (used to compute the maximum stack size or
     * the stack map frames). A control flow graph contains one node per "basic block", and one edge per "jump" from one
     * basic block to another. Each node (i.e., each basic block) is represented by the Label object that corresponds to
     * the first instruction of this basic block. Each node also stores the list of its successors in the graph, as a
     * linked list of Edge objects. The control flow analysis algorithms used to compute the maximum stack size or the
     * stack map frames are similar and use two steps. The first step, during the visit of each instruction, builds
     * information about the state of the local variables and the operand stack at the end of each basic block, called
     * the "output frame", <i>relatively</i> to the frame state at the beginning of the basic block, which is called the
     * "input frame", and which is <i>unknown</i> during this step. The second step, in link MethodWriter#visitMaxs,
     * is a fix point algorithm that computes information about the input frame of each basic block, from the input
     * state of the first basic block (known from the method signature), and by the using the previously computed
     * relative output frames. The algorithm used to compute the maximum stack size only computes the relative output
     * and absolute input stack heights, while the algorithm used to compute stack map frames computes relative output
     * frames and absolute input frames.
     */

    /**
     * Start of the output stack relatively to the input stack. The exact semantics of this field depends on the
     * algorithm that is used. When only the maximum stack size is computed, this field is the number of elements in the
     * input stack. When the stack map frames are completely computed, this field is the offset of the first output
     * stack element relatively to the top of the input stack. This offset is always negative or null. A null offset
     * means that the output stack must be appended to the input stack. A -n offset means that the first n output stack
     * elements must replace the top n input stack elements, and that the other elements must be appended to the input
     * stack.
     */
    int              inputStackTop;

    /**
     * Maximum height reached by the output stack, relatively to the top of the input stack. This maximum is always
     * positive or null.
     */
    int              outputStackMax;

    /**
     * The successor of this label, in the order they are visited. This linked list does not include labels used for
     * debug info only. If ClassWriter#COMPUTE_FRAMES option is used then, in addition, it does not contain
     * successive labels that denote the same bytecode position (in this case only the first label appears in this
     * list).
     */
    Label            successor;

    /**
     * The next basic block in the basic block stack. This stack is used in the main loop of the fix point algorithm
     * used in the second step of the control flow analysis algorithms. It is also used in {@link #visitSubroutine} to
     * avoid using a recursive method.
     * 
     * @see MethodWriter#visitMaxs
     */
    Label            next;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    /**
     * Constructs a new label.
     */
    public Label(){try{__CLR4_1_104rm4rmlusqj8ph.R.inc(6178);
    }finally{__CLR4_1_104rm4rmlusqj8ph.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Methods to compute offsets and to manage forward references
    // ------------------------------------------------------------------------

    /**
     * Puts a reference to this label in the bytecode of a method. If the position of the label is known, the offset is
     * computed and written directly. Otherwise, a null offset is written and a new forward reference is declared for
     * this label.
     * 
     * @param owner the code writer that calls this method.
     * @param out the bytecode of the method.
     * @param source the position of first byte of the bytecode instruction that contains this label.
     * @param wideOffset <tt>true</tt> if the reference must be stored in 4 bytes, or <tt>false</tt> if it must be
     * stored with 2 bytes.
     * @throws IllegalArgumentException if this label has not been created by the given code writer.
     */
    void put(final MethodWriter owner, final ByteVector out, final int source) {try{__CLR4_1_104rm4rmlusqj8ph.R.inc(6179);
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6180);if (((((status & 2 /* RESOLVED */ ) == 0)&&(__CLR4_1_104rm4rmlusqj8ph.R.iget(6181)!=0|true))||(__CLR4_1_104rm4rmlusqj8ph.R.iget(6182)==0&false))) {{
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6183);addReference(source, out.length);
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6184);out.putShort(-1);
        } }else {{
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6185);out.putShort(position - source);
        }
    }}finally{__CLR4_1_104rm4rmlusqj8ph.R.flushNeeded();}}

    /**
     * Adds a forward reference to this label. This method must be called only for a true forward reference, i.e. only
     * if this label is not resolved yet. For backward references, the offset of the reference can be, and must be,
     * computed and stored directly.
     * 
     * @param sourcePosition the position of the referencing instruction. This position will be used to compute the
     * offset of this forward reference.
     * @param referencePosition the position where the offset for this forward reference must be stored.
     */
    private void addReference(final int sourcePosition, final int referencePosition) {try{__CLR4_1_104rm4rmlusqj8ph.R.inc(6186);
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6187);if ((((srcAndRefPositions == null)&&(__CLR4_1_104rm4rmlusqj8ph.R.iget(6188)!=0|true))||(__CLR4_1_104rm4rmlusqj8ph.R.iget(6189)==0&false))) {{
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6190);srcAndRefPositions = new int[6];
        }
        }__CLR4_1_104rm4rmlusqj8ph.R.inc(6191);if ((((referenceCount >= srcAndRefPositions.length)&&(__CLR4_1_104rm4rmlusqj8ph.R.iget(6192)!=0|true))||(__CLR4_1_104rm4rmlusqj8ph.R.iget(6193)==0&false))) {{
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6194);int[] a = new int[srcAndRefPositions.length + 6];
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6195);System.arraycopy(srcAndRefPositions, 0, a, 0, srcAndRefPositions.length);
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6196);srcAndRefPositions = a;
        }
        }__CLR4_1_104rm4rmlusqj8ph.R.inc(6197);srcAndRefPositions[referenceCount++] = sourcePosition;
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6198);srcAndRefPositions[referenceCount++] = referencePosition;
    }finally{__CLR4_1_104rm4rmlusqj8ph.R.flushNeeded();}}

    /**
     * Resolves all forward references to this label. This method must be called when this label is added to the
     * bytecode of the method, i.e. when its position becomes known. This method fills in the blanks that where left in
     * the bytecode by each forward reference previously added to this label.
     * 
     * @param owner the code writer that calls this method.
     * @param position the position of this label in the bytecode.
     * @param data the bytecode of the method.
     * @return <tt>true</tt> if a blank that was left for this label was to small to store the offset. In such a case
     * the corresponding jump instruction is replaced with a pseudo instruction (using unused opcodes) using an unsigned
     * two bytes offset. These pseudo instructions will need to be replaced with true instructions with wider offsets (4
     * bytes instead of 2). This is done in {@link MethodWriter#resizeInstructions}.
     * @throws IllegalArgumentException if this label has already been resolved, or if it has not been created by the
     * given code writer.
     */
    void resolve(final MethodWriter owner, final int position, final byte[] data) {try{__CLR4_1_104rm4rmlusqj8ph.R.inc(6199);
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6200);this.status |= 2 /* RESOLVED */ ;
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6201);this.position = position;
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6202);int i = 0;
        __CLR4_1_104rm4rmlusqj8ph.R.inc(6203);while ((((i < referenceCount)&&(__CLR4_1_104rm4rmlusqj8ph.R.iget(6204)!=0|true))||(__CLR4_1_104rm4rmlusqj8ph.R.iget(6205)==0&false))) {{
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6206);int source = srcAndRefPositions[i++];
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6207);int reference = srcAndRefPositions[i++];
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6208);int offset = position - source;
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6209);data[reference++] = (byte) (offset >>> 8);
            __CLR4_1_104rm4rmlusqj8ph.R.inc(6210);data[reference] = (byte) offset;

        }
    }}finally{__CLR4_1_104rm4rmlusqj8ph.R.flushNeeded();}}

}
