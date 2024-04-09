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
 * A Java type. This class can be used to make it easier to manipulate type and method descriptors.
 * 
 * @author Eric Bruneton
 * @author Chris Nokleberg
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class Type {public static class __CLR4_5_24ws4wslusvmhry{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,6514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * The <tt>void</tt> type.
     */
    public static final Type VOID_TYPE    = new Type(0, null, ('V' << 24) | (5 << 16) | (0 << 8) | 0, 1);

    /**
     * The <tt>boolean</tt> type.
     */
    public static final Type BOOLEAN_TYPE = new Type(1, null, ('Z' << 24) | (0 << 16) | (5 << 8) | 1, 1);

    /**
     * The <tt>char</tt> type.
     */
    public static final Type CHAR_TYPE    = new Type(2, null, ('C' << 24) | (0 << 16) | (6 << 8) | 1, 1);

    /**
     * The <tt>byte</tt> type.
     */
    public static final Type BYTE_TYPE    = new Type(3, null, ('B' << 24) | (0 << 16) | (5 << 8) | 1, 1);

    /**
     * The <tt>short</tt> type.
     */
    public static final Type SHORT_TYPE   = new Type(4, null, ('S' << 24) | (0 << 16) | (7 << 8) | 1, 1);

    /**
     * The <tt>int</tt> type.
     */
    public static final Type INT_TYPE     = new Type(5, null, ('I' << 24) | (0 << 16) | (0 << 8) | 1, 1);

    /**
     * The <tt>float</tt> type.
     */
    public static final Type FLOAT_TYPE   = new Type(6, null, ('F' << 24) | (2 << 16) | (2 << 8) | 1, 1);

    /**
     * The <tt>long</tt> type.
     */
    public static final Type LONG_TYPE    = new Type(7, null, ('J' << 24) | (1 << 16) | (1 << 8) | 2, 1);

    /**
     * The <tt>double</tt> type.
     */
    public static final Type DOUBLE_TYPE  = new Type(8, null, ('D' << 24) | (3 << 16) | (3 << 8) | 2, 1);

    // ------------------------------------------------------------------------
    // Fields
    // ------------------------------------------------------------------------

    /**
     * The sort of this Java type.
     */
    protected final int        sort;

    /**
     * A buffer containing the internal name of this Java type. This field is only used for reference types.
     */
    private final char[]     buf;

    /**
     * The offset of the internal name of this Java type in {@link #buf buf} or, for primitive types, the size,
     * descriptor and getOpcode offsets for this type (byte 0 contains the size, byte 1 the descriptor, byte 2 the
     * offset for IALOAD or IASTORE, byte 3 the offset for all other instructions).
     */
    private final int        off;

    /**
     * The length of the internal name of this Java type.
     */
    private final int        len;

    // ------------------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------------------

    private Type(final int sort, final char[] buf, final int off, final int len){try{__CLR4_5_24ws4wslusvmhry.R.inc(6364);
        __CLR4_5_24ws4wslusvmhry.R.inc(6365);this.sort = sort;
        __CLR4_5_24ws4wslusvmhry.R.inc(6366);this.buf = buf;
        __CLR4_5_24ws4wslusvmhry.R.inc(6367);this.off = off;
        __CLR4_5_24ws4wslusvmhry.R.inc(6368);this.len = len;
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    /**
     * Returns the Java type corresponding to the given type descriptor.
     * 
     * @param typeDescriptor a type descriptor.
     * @return the Java type corresponding to the given type descriptor.
     */
    public static Type getType(final String typeDescriptor) {try{__CLR4_5_24ws4wslusvmhry.R.inc(6369);
        __CLR4_5_24ws4wslusvmhry.R.inc(6370);return getType(typeDescriptor.toCharArray(), 0);
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    public static int getArgumentsAndReturnSizes(final String desc) {try{__CLR4_5_24ws4wslusvmhry.R.inc(6371);
        __CLR4_5_24ws4wslusvmhry.R.inc(6372);int n = 1;
        __CLR4_5_24ws4wslusvmhry.R.inc(6373);int c = 1;
        __CLR4_5_24ws4wslusvmhry.R.inc(6374);while (true) {{
            __CLR4_5_24ws4wslusvmhry.R.inc(6375);char car = desc.charAt(c++);
            __CLR4_5_24ws4wslusvmhry.R.inc(6376);if ((((car == ')')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6377)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6378)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6379);car = desc.charAt(c);
                __CLR4_5_24ws4wslusvmhry.R.inc(6380);return n << 2 | ((((car == 'V' )&&(__CLR4_5_24ws4wslusvmhry.R.iget(6381)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6382)==0&false))? 0 : ((((car == 'D' || car == 'J' )&&(__CLR4_5_24ws4wslusvmhry.R.iget(6383)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6384)==0&false))? 2 : 1));
            } }else {__CLR4_5_24ws4wslusvmhry.R.inc(6385);if ((((car == 'L')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6386)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6387)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6388);while ((((desc.charAt(c++) != ';')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6389)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6390)==0&false))) {{
                }
                }__CLR4_5_24ws4wslusvmhry.R.inc(6391);n += 1;
//            } else if (car == '[') {
//                while ((car = desc.charAt(c)) == '[') {
//                    ++c;
//                }
//                if (car == 'D' || car == 'J') {
//                    n -= 1;
//                }
            } }else {__CLR4_5_24ws4wslusvmhry.R.inc(6392);if ((((car == 'D' || car == 'J')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6393)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6394)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6395);n += 2;
            } }else {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6396);n += 1;
            }
        }}}}
    }}finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    /**
     * Returns the Java type corresponding to the given type descriptor.
     * 
     * @param buf a buffer containing a type descriptor.
     * @param off the offset of this descriptor in the previous buffer.
     * @return the Java type corresponding to the given type descriptor.
     */
    private static Type getType(final char[] buf, final int off) {try{__CLR4_5_24ws4wslusvmhry.R.inc(6397);
        __CLR4_5_24ws4wslusvmhry.R.inc(6398);int len;
        boolean __CLB4_5_2_bool0=false;__CLR4_5_24ws4wslusvmhry.R.inc(6399);switch (buf[off]) {
            case 'V':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6400);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6401);return VOID_TYPE;
            case 'Z':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6402);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6403);return BOOLEAN_TYPE;
            case 'C':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6404);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6405);return CHAR_TYPE;
            case 'B':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6406);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6407);return BYTE_TYPE;
            case 'S':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6408);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6409);return SHORT_TYPE;
            case 'I':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6410);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6411);return INT_TYPE;
            case 'F':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6412);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6413);return FLOAT_TYPE;
            case 'J':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6414);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6415);return LONG_TYPE;
            case 'D':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6416);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6417);return DOUBLE_TYPE;
            case '[':if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6418);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6419);len = 1;
                __CLR4_5_24ws4wslusvmhry.R.inc(6420);while ((((buf[off + len] == '[')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6421)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6422)==0&false))) {{
                    __CLR4_5_24ws4wslusvmhry.R.inc(6423);++len;
                }
                }__CLR4_5_24ws4wslusvmhry.R.inc(6424);if ((((buf[off + len] == 'L')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6425)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6426)==0&false))) {{
                    __CLR4_5_24ws4wslusvmhry.R.inc(6427);++len;
                    __CLR4_5_24ws4wslusvmhry.R.inc(6428);while ((((buf[off + len] != ';')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6429)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6430)==0&false))) {{
                        __CLR4_5_24ws4wslusvmhry.R.inc(6431);++len;
                    }
                }}
                }__CLR4_5_24ws4wslusvmhry.R.inc(6432);return new Type(9 /*ARRAY*/, buf, off, len + 1);
                // case 'L':
            default:if (!__CLB4_5_2_bool0) {__CLR4_5_24ws4wslusvmhry.R.inc(6433);__CLB4_5_2_bool0=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6434);len = 1;
                __CLR4_5_24ws4wslusvmhry.R.inc(6435);while ((((buf[off + len] != ';')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6436)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6437)==0&false))) {{
                    __CLR4_5_24ws4wslusvmhry.R.inc(6438);++len;
                }
                }__CLR4_5_24ws4wslusvmhry.R.inc(6439);return new Type(10/*OBJECT*/, buf, off + 1, len - 1);
        }
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    public String getInternalName() {try{__CLR4_5_24ws4wslusvmhry.R.inc(6440);
        __CLR4_5_24ws4wslusvmhry.R.inc(6441);return new String(buf, off, len);
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Conversion to type descriptors
    // ------------------------------------------------------------------------

    /**
     * Returns the descriptor corresponding to this Java type.
     *
     * @return the descriptor corresponding to this Java type.
     */
    String getDescriptor() {try{__CLR4_5_24ws4wslusvmhry.R.inc(6442);
        __CLR4_5_24ws4wslusvmhry.R.inc(6443);return new String(this.buf, off, len);
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    private int getDimensions() {try{__CLR4_5_24ws4wslusvmhry.R.inc(6444);
        __CLR4_5_24ws4wslusvmhry.R.inc(6445);int i = 1;
        __CLR4_5_24ws4wslusvmhry.R.inc(6446);while ((((buf[off + i] == '[')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6447)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6448)==0&false))) {{
            __CLR4_5_24ws4wslusvmhry.R.inc(6449);++i;
        }
        }__CLR4_5_24ws4wslusvmhry.R.inc(6450);return i;
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    static Type[] getArgumentTypes(final String methodDescriptor) {try{__CLR4_5_24ws4wslusvmhry.R.inc(6451);
        __CLR4_5_24ws4wslusvmhry.R.inc(6452);char[] buf = methodDescriptor.toCharArray();
        __CLR4_5_24ws4wslusvmhry.R.inc(6453);int off = 1;
        __CLR4_5_24ws4wslusvmhry.R.inc(6454);int size = 0;
        __CLR4_5_24ws4wslusvmhry.R.inc(6455);for (;;) {{
            __CLR4_5_24ws4wslusvmhry.R.inc(6456);char car = buf[off++];
            __CLR4_5_24ws4wslusvmhry.R.inc(6457);if ((((car == ')')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6458)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6459)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6460);break;
            } }else {__CLR4_5_24ws4wslusvmhry.R.inc(6461);if ((((car == 'L')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6462)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6463)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6464);while ((((buf[off++] != ';')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6465)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6466)==0&false))) {{
                }
                }__CLR4_5_24ws4wslusvmhry.R.inc(6467);++size;
            } }else {__CLR4_5_24ws4wslusvmhry.R.inc(6468);if ((((car != '[')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6469)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6470)==0&false))) {{
                __CLR4_5_24ws4wslusvmhry.R.inc(6471);++size;
            }
        }}}}

        }__CLR4_5_24ws4wslusvmhry.R.inc(6472);Type[] args = new Type[size];
        __CLR4_5_24ws4wslusvmhry.R.inc(6473);off = 1;
        __CLR4_5_24ws4wslusvmhry.R.inc(6474);size = 0;
        __CLR4_5_24ws4wslusvmhry.R.inc(6475);while ((((buf[off] != ')')&&(__CLR4_5_24ws4wslusvmhry.R.iget(6476)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6477)==0&false))) {{
            __CLR4_5_24ws4wslusvmhry.R.inc(6478);args[size] = getType(buf, off);
            __CLR4_5_24ws4wslusvmhry.R.inc(6479);off += args[size].len + ((((args[size].sort == 10 /*OBJECT*/ )&&(__CLR4_5_24ws4wslusvmhry.R.iget(6480)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6481)==0&false))? 2 : 0);
            __CLR4_5_24ws4wslusvmhry.R.inc(6482);size += 1;
        }
        }__CLR4_5_24ws4wslusvmhry.R.inc(6483);return args;
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}

    protected String getClassName() {try{__CLR4_5_24ws4wslusvmhry.R.inc(6484);
        boolean __CLB4_5_2_bool1=false;__CLR4_5_24ws4wslusvmhry.R.inc(6485);switch (sort) {
            case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6486);__CLB4_5_2_bool1=true;} //VOID:
                __CLR4_5_24ws4wslusvmhry.R.inc(6487);return "void";
            case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6488);__CLB4_5_2_bool1=true;} //BOOLEAN:
                __CLR4_5_24ws4wslusvmhry.R.inc(6489);return "boolean";
            case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6490);__CLB4_5_2_bool1=true;} //CHAR:
                __CLR4_5_24ws4wslusvmhry.R.inc(6491);return "char";
            case 3:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6492);__CLB4_5_2_bool1=true;} //BYTE:
                __CLR4_5_24ws4wslusvmhry.R.inc(6493);return "byte";
            case 4:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6494);__CLB4_5_2_bool1=true;} //SHORT:
                __CLR4_5_24ws4wslusvmhry.R.inc(6495);return "short";
            case 5:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6496);__CLB4_5_2_bool1=true;} //INT:
                __CLR4_5_24ws4wslusvmhry.R.inc(6497);return "int";
            case 6:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6498);__CLB4_5_2_bool1=true;} //FLOAT:
                __CLR4_5_24ws4wslusvmhry.R.inc(6499);return "float";
            case 7:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6500);__CLB4_5_2_bool1=true;} //LONG:
                __CLR4_5_24ws4wslusvmhry.R.inc(6501);return "long";
            case 8:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6502);__CLB4_5_2_bool1=true;} //DOUBLE:
                __CLR4_5_24ws4wslusvmhry.R.inc(6503);return "double";
            case 9:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6504);__CLB4_5_2_bool1=true;} //ARRAY:
                __CLR4_5_24ws4wslusvmhry.R.inc(6505);Type elementType = getType(buf, off + getDimensions());
                __CLR4_5_24ws4wslusvmhry.R.inc(6506);StringBuilder b = new StringBuilder(elementType.getClassName());
                __CLR4_5_24ws4wslusvmhry.R.inc(6507);for (int i = getDimensions(); (((i > 0)&&(__CLR4_5_24ws4wslusvmhry.R.iget(6508)!=0|true))||(__CLR4_5_24ws4wslusvmhry.R.iget(6509)==0&false)); --i) {{
                    __CLR4_5_24ws4wslusvmhry.R.inc(6510);b.append("[]");
                }
                }__CLR4_5_24ws4wslusvmhry.R.inc(6511);return b.toString();
            // case OBJECT:
            default:if (!__CLB4_5_2_bool1) {__CLR4_5_24ws4wslusvmhry.R.inc(6512);__CLB4_5_2_bool1=true;}
                __CLR4_5_24ws4wslusvmhry.R.inc(6513);return new String(buf, off, len).replace('/', '.');
        }
    }finally{__CLR4_5_24ws4wslusvmhry.R.flushNeeded();}}
}
