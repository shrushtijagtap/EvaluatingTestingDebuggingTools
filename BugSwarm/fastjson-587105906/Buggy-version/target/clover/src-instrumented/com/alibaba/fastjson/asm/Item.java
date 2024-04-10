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
 * A constant pool item. Constant pool items can be created with the 'newXXX' methods in the {@link ClassWriter} class.
 * 
 * @author Eric Bruneton
 */
@java.lang.SuppressWarnings({"fallthrough"}) final class Item {public static class __CLR4_1_104q94q9luszvtk4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704234731L,8589935092L,6178,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * Index of this item in the constant pool.
     */
    int    index;

    int    type;

    /**
     * Value of this item, for an integer item.
     */
    int    intVal;

    /**
     * Value of this item, for a long item.
     */
    long   longVal;

    /**
     * First part of the value of this item, for items that do not hold a primitive value.
     */
    String strVal1;

    /**
     * Second part of the value of this item, for items that do not hold a primitive value.
     */
    String strVal2;

    /**
     * Third part of the value of this item, for items that do not hold a primitive value.
     */
    String strVal3;

    /**
     * The hash code value of this constant pool item.
     */
    int    hashCode;

    /**
     * Link to another constant pool item, used for collision lists in the constant pool's hash table.
     */
    Item   next;

    /**
     * Constructs an uninitialized {@link Item}.
     */
    Item(){try{__CLR4_1_104q94q9luszvtk4.R.inc(6129);
    }finally{__CLR4_1_104q94q9luszvtk4.R.flushNeeded();}}

    /**
     * Constructs a copy of the given item.
     * 
     * @param index index of the item to be constructed.
     * @param i the item that must be copied into the item to be constructed.
     */
    Item(final int index, final Item i){try{__CLR4_1_104q94q9luszvtk4.R.inc(6130);
        __CLR4_1_104q94q9luszvtk4.R.inc(6131);this.index = index;
        __CLR4_1_104q94q9luszvtk4.R.inc(6132);type = i.type;
        __CLR4_1_104q94q9luszvtk4.R.inc(6133);intVal = i.intVal;
        __CLR4_1_104q94q9luszvtk4.R.inc(6134);longVal = i.longVal;
        __CLR4_1_104q94q9luszvtk4.R.inc(6135);strVal1 = i.strVal1;
        __CLR4_1_104q94q9luszvtk4.R.inc(6136);strVal2 = i.strVal2;
        __CLR4_1_104q94q9luszvtk4.R.inc(6137);strVal3 = i.strVal3;
        __CLR4_1_104q94q9luszvtk4.R.inc(6138);hashCode = i.hashCode;
    }finally{__CLR4_1_104q94q9luszvtk4.R.flushNeeded();}}

    /**
     * Sets this item to an item that do not hold a primitive value.
     * 
     * @param type the type of this item.
     * @param strVal1 first part of the value of this item.
     * @param strVal2 second part of the value of this item.
     * @param strVal3 third part of the value of this item.
     */
    void set(final int type, final String strVal1, final String strVal2, final String strVal3) {try{__CLR4_1_104q94q9luszvtk4.R.inc(6139);
        __CLR4_1_104q94q9luszvtk4.R.inc(6140);this.type = type;
        __CLR4_1_104q94q9luszvtk4.R.inc(6141);this.strVal1 = strVal1;
        __CLR4_1_104q94q9luszvtk4.R.inc(6142);this.strVal2 = strVal2;
        __CLR4_1_104q94q9luszvtk4.R.inc(6143);this.strVal3 = strVal3;
        boolean __CLB4_1_10_bool0=false;__CLR4_1_104q94q9luszvtk4.R.inc(6144);switch (type) {
            case 1 /* ClassWriter.UTF8 */:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6145);__CLB4_1_10_bool0=true;}
            case 8 /* ClassWriter.STR */:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6146);__CLB4_1_10_bool0=true;}
            case 7 /* ClassWriter.CLASS */:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6147);__CLB4_1_10_bool0=true;}
            case 13 /* ClassWriter.TYPE_NORMAL */:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6148);__CLB4_1_10_bool0=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6149);hashCode = 0x7FFFFFFF & (type + strVal1.hashCode());
                __CLR4_1_104q94q9luszvtk4.R.inc(6150);return;
            case 12 /* ClassWriter.NAME_TYPE */:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6151);__CLB4_1_10_bool0=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6152);hashCode = 0x7FFFFFFF & (type + strVal1.hashCode() * strVal2.hashCode());
                __CLR4_1_104q94q9luszvtk4.R.inc(6153);return;
                // ClassWriter.FIELD:
                // ClassWriter.METH:
                // ClassWriter.IMETH:
            default:if (!__CLB4_1_10_bool0) {__CLR4_1_104q94q9luszvtk4.R.inc(6154);__CLB4_1_10_bool0=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6155);hashCode = 0x7FFFFFFF & (type + strVal1.hashCode() * strVal2.hashCode() * strVal3.hashCode());
        }
    }finally{__CLR4_1_104q94q9luszvtk4.R.flushNeeded();}}
    
    /**
     * Sets this item to an integer item.
     *
     * @param intVal the value of this item.
     */
    void set(final int intVal) {try{__CLR4_1_104q94q9luszvtk4.R.inc(6156);
        __CLR4_1_104q94q9luszvtk4.R.inc(6157);this.type = 3 /* ClassWriter.INT */;
        __CLR4_1_104q94q9luszvtk4.R.inc(6158);this.intVal = intVal;
        __CLR4_1_104q94q9luszvtk4.R.inc(6159);this.hashCode = 0x7FFFFFFF & (type + intVal);
    }finally{__CLR4_1_104q94q9luszvtk4.R.flushNeeded();}}

    /**
     * Indicates if the given item is equal to this one. <i>This method assumes that the two items have the same
     * {@link #type}</i>.
     * 
     * @param i the item to be compared to this one. Both items must have the same {@link #type}.
     * @return <tt>true</tt> if the given item if equal to this one, <tt>false</tt> otherwise.
     */
    boolean isEqualTo(final Item i) {try{__CLR4_1_104q94q9luszvtk4.R.inc(6160);
        boolean __CLB4_1_10_bool1=false;__CLR4_1_104q94q9luszvtk4.R.inc(6161);switch (type) {
            case 1 /* ClassWriter.UTF8 */:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6162);__CLB4_1_10_bool1=true;}
            case 8 /* ClassWriter.STR */:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6163);__CLB4_1_10_bool1=true;}
            case 7 /* ClassWriter.CLASS */ :if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6164);__CLB4_1_10_bool1=true;}
            case 13 /* ClassWriter.TYPE_NORMAL */ :if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6165);__CLB4_1_10_bool1=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6166);return i.strVal1.equals(strVal1);
            case 15 /* ClassWriter.TYPE_MERGED */ :if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6167);__CLB4_1_10_bool1=true;}
            case 5 /* ClassWriter.LONG */ :if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6168);__CLB4_1_10_bool1=true;}
            case 6 /* ClassWriter.DOUBLE */:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6169);__CLB4_1_10_bool1=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6170);return i.longVal == longVal;
            case 3 /* ClassWriter.INT */ :if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6171);__CLB4_1_10_bool1=true;}
            case 4 /* ClassWriter.FLOAT */:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6172);__CLB4_1_10_bool1=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6173);return i.intVal == intVal;
            case 12 /* ClassWriter.NAME_TYPE */:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6174);__CLB4_1_10_bool1=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6175);return i.strVal1.equals(strVal1) && i.strVal2.equals(strVal2);
                // case ClassWriter.FIELD:
                // case ClassWriter.METH:
                // case ClassWriter.IMETH:
            default:if (!__CLB4_1_10_bool1) {__CLR4_1_104q94q9luszvtk4.R.inc(6176);__CLB4_1_10_bool1=true;}
                __CLR4_1_104q94q9luszvtk4.R.inc(6177);return i.strVal1.equals(strVal1) && i.strVal2.equals(strVal2) && i.strVal3.equals(strVal3);
        }
    }finally{__CLR4_1_104q94q9luszvtk4.R.flushNeeded();}}

}
