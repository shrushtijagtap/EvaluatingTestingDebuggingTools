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
 * 
 * @author Eric Bruneton
 */
public class ClassWriter {public static class __CLR4_5_24kb4kblusvmh9o{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697079773L,8589935092L,6111,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    /**
     * Minor and major version numbers of the class to be generated.
     */
    int                     version;

    /**
     * Index of the next item to be added in the constant pool.
     */
    int                     index;

    /**
     * The constant pool of this class.
     */
    final ByteVector        pool;

    /**
     * The constant pool's hash table data.
     */
    Item[]                  items;

    /**
     * The threshold of the constant pool's hash table.
     */
    int                     threshold;

    /**
     * A reusable key used to look for items in the {@link #items} hash table.
     */
    final Item              key;

    /**
     * A reusable key used to look for items in the {@link #items} hash table.
     */
    final Item              key2;

    /**
     * A reusable key used to look for items in the {@link #items} hash table.
     */
    final Item              key3;

    /**
     * A type table used to temporarily store internal names that will not necessarily be stored in the constant pool.
     * This type table is used by the control flow and data flow analysis algorithm used to compute stack map frames
     * from scratch. This array associates to each index <tt>i</tt> the Item whose index is <tt>i</tt>. All Item objects
     * stored in this array are also stored in the {@link #items} hash table. These two arrays allow to retrieve an Item
     * from its index or, conversely, to get the index of an Item from its value. Each Item stores an internal name in
     * its {@link Item#strVal1} field.
     */
    Item[]                  typeTable;

    /**
     * The access flags of this class.
     */
    private int             access;

    /**
     * The constant pool item that contains the internal name of this class.
     */
    private int             name;

    /**
     * The internal name of this class.
     */
    String                  thisName;

    /**
     * The constant pool item that contains the internal name of the super class of this class.
     */
    private int             superName;

    /**
     * Number of interfaces implemented or extended by this class or interface.
     */
    private int             interfaceCount;

    /**
     * The interfaces implemented or extended by this class or interface. More precisely, this array contains the
     * indexes of the constant pool items that contain the internal names of these interfaces.
     */
    private int[]           interfaces;

    /**
     * The fields of this class. These fields are stored in a linked list of {@link FieldWriter} objects, linked to each
     * other by their {@link FieldWriter#next} field. This field stores the first element of this list.
     */
    FieldWriter             firstField;

    /**
     * The fields of this class. These fields are stored in a linked list of {@link FieldWriter} objects, linked to each
     * other by their {@link FieldWriter#next} field. This field stores the last element of this list.
     */
    FieldWriter             lastField;

    /**
     * The methods of this class. These methods are stored in a linked list of {@link MethodWriter} objects, linked to
     * each other by their {@link MethodWriter#next} field. This field stores the first element of this list.
     */
    MethodWriter            firstMethod;

    /**
     * The methods of this class. These methods are stored in a linked list of {@link MethodWriter} objects, linked to
     * each other by their {@link MethodWriter#next} field. This field stores the last element of this list.
     */
    MethodWriter            lastMethod;

    // ------------------------------------------------------------------------
    // Constructor
    // ------------------------------------------------------------------------

    public ClassWriter(){
        this(0);__CLR4_5_24kb4kblusvmh9o.R.inc(5916);try{__CLR4_5_24kb4kblusvmh9o.R.inc(5915);
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    private ClassWriter(final int flags){try{__CLR4_5_24kb4kblusvmh9o.R.inc(5917);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5918);index = 1;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5919);pool = new ByteVector();
        __CLR4_5_24kb4kblusvmh9o.R.inc(5920);items = new Item[256];
        __CLR4_5_24kb4kblusvmh9o.R.inc(5921);threshold = (int) (0.75d * items.length);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5922);key = new Item();
        __CLR4_5_24kb4kblusvmh9o.R.inc(5923);key2 = new Item();
        __CLR4_5_24kb4kblusvmh9o.R.inc(5924);key3 = new Item();
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Implementation of the ClassVisitor interface
    // ------------------------------------------------------------------------

    public void visit(final int version, final int access, final String name, final String superName, final String[] interfaces) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(5925);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5926);this.version = version;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5927);this.access = access;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5928);this.name = newClassItem(name).index;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5929);thisName = name;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5930);this.superName = (((superName == null )&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5931)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5932)==0&false))? 0 : newClassItem(superName).index;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5933);if ((((interfaces != null && interfaces.length > 0)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5934)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5935)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5936);interfaceCount = interfaces.length;
            __CLR4_5_24kb4kblusvmh9o.R.inc(5937);this.interfaces = new int[interfaceCount];
            __CLR4_5_24kb4kblusvmh9o.R.inc(5938);for (int i = 0; (((i < interfaceCount)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5939)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5940)==0&false)); ++i) {{
                __CLR4_5_24kb4kblusvmh9o.R.inc(5941);this.interfaces[i] = newClassItem(interfaces[i]).index;
            }
        }}
    }}finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Other public methods
    // ------------------------------------------------------------------------

    /**
     * Returns the bytecode of the class that was build with this class writer.
     * 
     * @return the bytecode of the class that was build with this class writer.
     */
    public byte[] toByteArray() {try{__CLR4_5_24kb4kblusvmh9o.R.inc(5942);
        // computes the real size of the bytecode of this class
        __CLR4_5_24kb4kblusvmh9o.R.inc(5943);int size = 24 + 2 * interfaceCount;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5944);int nbFields = 0;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5945);FieldWriter fb = firstField;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5946);while ((((fb != null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5947)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5948)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5949);++nbFields;
            __CLR4_5_24kb4kblusvmh9o.R.inc(5950);size += fb.getSize();
            __CLR4_5_24kb4kblusvmh9o.R.inc(5951);fb = fb.next;
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(5952);int nbMethods = 0;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5953);MethodWriter mb = firstMethod;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5954);while ((((mb != null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5955)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5956)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5957);++nbMethods;
            __CLR4_5_24kb4kblusvmh9o.R.inc(5958);size += mb.getSize();
            __CLR4_5_24kb4kblusvmh9o.R.inc(5959);mb = mb.next;
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(5960);int attributeCount = 0;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5961);size += pool.length;
        // allocates a byte vector of this size, in order to avoid unnecessary
        // arraycopy operations in the ByteVector.enlarge() method
        __CLR4_5_24kb4kblusvmh9o.R.inc(5962);ByteVector out = new ByteVector(size);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5963);out.putInt(0xCAFEBABE).putInt(version);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5964);out.putShort(index).putByteArray(pool.data, 0, pool.length);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5965);int mask = 393216; // Opcodes.ACC_DEPRECATED | ClassWriter.ACC_SYNTHETIC_ATTRIBUTE | ((access & ClassWriter.ACC_SYNTHETIC_ATTRIBUTE) / (ClassWriter.ACC_SYNTHETIC_ATTRIBUTE / Opcodes.ACC_SYNTHETIC));
        __CLR4_5_24kb4kblusvmh9o.R.inc(5966);out.putShort(access & ~mask).putShort(name).putShort(superName);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5967);out.putShort(interfaceCount);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5968);for (int i = 0; (((i < interfaceCount)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5969)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5970)==0&false)); ++i) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5971);out.putShort(interfaces[i]);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(5972);out.putShort(nbFields);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5973);fb = firstField;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5974);while ((((fb != null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5975)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5976)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5977);fb.put(out);
            __CLR4_5_24kb4kblusvmh9o.R.inc(5978);fb = fb.next;
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(5979);out.putShort(nbMethods);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5980);mb = firstMethod;
        __CLR4_5_24kb4kblusvmh9o.R.inc(5981);while ((((mb != null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5982)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5983)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5984);mb.put(out);
            __CLR4_5_24kb4kblusvmh9o.R.inc(5985);mb = mb.next;
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(5986);out.putShort(attributeCount);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5987);return out.data;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    // ------------------------------------------------------------------------
    // Utility methods: constant pool management
    // ------------------------------------------------------------------------

    /**
     * Adds a number or string constant to the constant pool of the class being build. Does nothing if the constant pool
     * already contains a similar item.
     * 
     * @param cst the value of the constant to be added to the constant pool. This parameter must be an {@link Integer},
     * a {@link Float}, a {@link Long}, a {@link Double}, a {@link String} or a {@link Type}.
     * @return a new or already existing constant item with the given value.
     */
    Item newConstItem(final Object cst) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(5988);
        __CLR4_5_24kb4kblusvmh9o.R.inc(5989);if ((((cst instanceof Integer)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5990)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5991)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(5992);int val = ((Integer) cst).intValue();
            // return newInteger(val);
            __CLR4_5_24kb4kblusvmh9o.R.inc(5993);key.set(val);
            __CLR4_5_24kb4kblusvmh9o.R.inc(5994);Item result = get(key);
            __CLR4_5_24kb4kblusvmh9o.R.inc(5995);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(5996)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(5997)==0&false))) {{
                __CLR4_5_24kb4kblusvmh9o.R.inc(5998);pool.putByte(3 /* INT */ ).putInt(val);
                __CLR4_5_24kb4kblusvmh9o.R.inc(5999);result = new Item(index++, key);
                __CLR4_5_24kb4kblusvmh9o.R.inc(6000);put(result);
            }
            }__CLR4_5_24kb4kblusvmh9o.R.inc(6001);return result;
        } }else {__CLR4_5_24kb4kblusvmh9o.R.inc(6002);if ((((cst instanceof String)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6003)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6004)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6005);return newString((String) cst);
        } }else {__CLR4_5_24kb4kblusvmh9o.R.inc(6006);if ((((cst instanceof Type)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6007)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6008)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6009);Type t = (Type) cst;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6010);return newClassItem((((t.sort == 10 /*Type.OBJECT*/ )&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6011)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6012)==0&false))? t.getInternalName() : t.getDescriptor());
        } }else {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6013);throw new IllegalArgumentException("value " + cst);
        }
    }}}}finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    public int newUTF8(final String value) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6014);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6015);key.set(1 /* UTF8 */, value, null, null);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6016);Item result = get(key);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6017);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6018)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6019)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6020);pool.putByte(1 /* UTF8 */).putUTF8(value);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6021);result = new Item(index++, key);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6022);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6023);return result.index;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    public Item newClassItem(final String value) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6024);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6025);key2.set(7 /* CLASS */, value, null, null);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6026);Item result = get(key2);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6027);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6028)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6029)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6030);pool.put12(7 /* CLASS */, newUTF8(value));
            __CLR4_5_24kb4kblusvmh9o.R.inc(6031);result = new Item(index++, key2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6032);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6033);return result;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    /**
     * Adds a field reference to the constant pool of the class being build. Does nothing if the constant pool already
     * contains a similar item.
     * 
     * @param owner the internal name of the field's owner class.
     * @param name the field's name.
     * @param desc the field's descriptor.
     * @return a new or already existing field reference item.
     */
    Item newFieldItem(final String owner, final String name, final String desc) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6034);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6035);key3.set(9 /* FIELD */, owner, name, desc);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6036);Item result = get(key3);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6037);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6038)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6039)==0&false))) {{
            // put122(9 /* FIELD */, newClassItem(owner).index, newNameTypeItem(name, desc).index);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6040);int s1 = newClassItem(owner).index, s2 = newNameTypeItem(name, desc).index;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6041);pool.put12(9 /* FIELD */, s1).putShort(s2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6042);result = new Item(index++, key3);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6043);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6044);return result;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    /**
     * Adds a method reference to the constant pool of the class being build. Does nothing if the constant pool already
     * contains a similar item.
     * 
     * @param owner the internal name of the method's owner class.
     * @param name the method's name.
     * @param desc the method's descriptor.
     * @param itf <tt>true</tt> if <tt>owner</tt> is an interface.
     * @return a new or already existing method reference item.
     */
    Item newMethodItem(final String owner, final String name, final String desc, final boolean itf) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6045);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6046);int type = (((itf )&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6047)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6048)==0&false))? 11 /* IMETH */ : 10 /* METH */;
        __CLR4_5_24kb4kblusvmh9o.R.inc(6049);key3.set(type, owner, name, desc);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6050);Item result = get(key3);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6051);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6052)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6053)==0&false))) {{
            // put122(type, newClassItem(owner).index, newNameTypeItem(name, desc).index);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6054);int s1 = newClassItem(owner).index, s2 = newNameTypeItem(name, desc).index;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6055);pool.put12(type, s1).putShort(s2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6056);result = new Item(index++, key3);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6057);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6058);return result;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    private Item newString(final String value) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6059);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6060);key2.set(8 /* STR */, value, null, null);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6061);Item result = get(key2);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6062);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6063)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6064)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6065);pool.put12(8 /*STR*/, newUTF8(value));
            __CLR4_5_24kb4kblusvmh9o.R.inc(6066);result = new Item(index++, key2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6067);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6068);return result;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    public Item newNameTypeItem(final String name, final String desc) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6069);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6070);key2.set(12 /* NAME_TYPE */, name, desc, null);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6071);Item result = get(key2);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6072);if ((((result == null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6073)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6074)==0&false))) {{
            //put122(12 /* NAME_TYPE */, newUTF8(name), newUTF8(desc));
            __CLR4_5_24kb4kblusvmh9o.R.inc(6075);int s1 = newUTF8(name), s2 = newUTF8(desc);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6076);pool.put12(12 /* NAME_TYPE */, s1).putShort(s2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6077);result = new Item(index++, key2);
            __CLR4_5_24kb4kblusvmh9o.R.inc(6078);put(result);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6079);return result;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}


    private Item get(final Item key) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6080);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6081);Item i = items[key.hashCode % items.length];
        __CLR4_5_24kb4kblusvmh9o.R.inc(6082);while ((((i != null && (i.type != key.type || !key.isEqualTo(i)))&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6083)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6084)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6085);i = i.next;
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6086);return i;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}

    private void put(final Item i) {try{__CLR4_5_24kb4kblusvmh9o.R.inc(6087);
        __CLR4_5_24kb4kblusvmh9o.R.inc(6088);if ((((index > threshold)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6089)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6090)==0&false))) {{
            __CLR4_5_24kb4kblusvmh9o.R.inc(6091);int ll = items.length;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6092);int nl = ll * 2 + 1;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6093);Item[] newItems = new Item[nl];
            __CLR4_5_24kb4kblusvmh9o.R.inc(6094);for (int l = ll - 1; (((l >= 0)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6095)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6096)==0&false)); --l) {{
                __CLR4_5_24kb4kblusvmh9o.R.inc(6097);Item j = items[l];
                __CLR4_5_24kb4kblusvmh9o.R.inc(6098);while ((((j != null)&&(__CLR4_5_24kb4kblusvmh9o.R.iget(6099)!=0|true))||(__CLR4_5_24kb4kblusvmh9o.R.iget(6100)==0&false))) {{
                    __CLR4_5_24kb4kblusvmh9o.R.inc(6101);int index = j.hashCode % newItems.length;
                    __CLR4_5_24kb4kblusvmh9o.R.inc(6102);Item k = j.next;
                    __CLR4_5_24kb4kblusvmh9o.R.inc(6103);j.next = newItems[index];
                    __CLR4_5_24kb4kblusvmh9o.R.inc(6104);newItems[index] = j;
                    __CLR4_5_24kb4kblusvmh9o.R.inc(6105);j = k;
                }
            }}
            }__CLR4_5_24kb4kblusvmh9o.R.inc(6106);items = newItems;
            __CLR4_5_24kb4kblusvmh9o.R.inc(6107);threshold = (int) (nl * 0.75);
        }
        }__CLR4_5_24kb4kblusvmh9o.R.inc(6108);int index = i.hashCode % items.length;
        __CLR4_5_24kb4kblusvmh9o.R.inc(6109);i.next = items[index];
        __CLR4_5_24kb4kblusvmh9o.R.inc(6110);items[index] = i;
    }finally{__CLR4_5_24kb4kblusvmh9o.R.flushNeeded();}}
}
