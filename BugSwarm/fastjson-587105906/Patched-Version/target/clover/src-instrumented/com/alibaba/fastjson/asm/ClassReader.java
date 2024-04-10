/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.asm;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by wenshao on 05/08/2017.
 */
@java.lang.SuppressWarnings({"fallthrough"}) public class ClassReader {public static class __CLR4_5_24c14c1lusyjiyc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,5915,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public  final byte[] b;
    private final int[] items;
    private final String[] strings;
    private final int maxStringLength;
    public  final int header;
    private boolean readAnnotations;

    public ClassReader(InputStream is, boolean readAnnotations) throws IOException {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5617);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5618);this.readAnnotations = readAnnotations;

        {
            __CLR4_5_24c14c1lusyjiyc.R.inc(5619);ByteArrayOutputStream out = new ByteArrayOutputStream();
            __CLR4_5_24c14c1lusyjiyc.R.inc(5620);byte[] buf = new byte[1024];
            __CLR4_5_24c14c1lusyjiyc.R.inc(5621);for (; ; ) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5622);int len = is.read(buf);
                __CLR4_5_24c14c1lusyjiyc.R.inc(5623);if ((((len == -1)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5624)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5625)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5626);break;
                }

                }__CLR4_5_24c14c1lusyjiyc.R.inc(5627);if ((((len > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5628)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5629)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5630);out.write(buf, 0, len);
                }
            }}
            }__CLR4_5_24c14c1lusyjiyc.R.inc(5631);is.close();
            __CLR4_5_24c14c1lusyjiyc.R.inc(5632);this.b = out.toByteArray();
        }

        // parses the constant pool
        __CLR4_5_24c14c1lusyjiyc.R.inc(5633);items = new int[readUnsignedShort(8)];
        __CLR4_5_24c14c1lusyjiyc.R.inc(5634);int n = items.length;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5635);strings = new String[n];
        __CLR4_5_24c14c1lusyjiyc.R.inc(5636);int max = 0;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5637);int index = 10;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5638);for (int i = 1; (((i < n)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5639)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5640)==0&false)); ++i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5641);items[i] = index + 1;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5642);int size;
            boolean __CLB4_5_2_bool0=false;__CLR4_5_24c14c1lusyjiyc.R.inc(5643);switch (b[index]) {
                case 9:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5644);__CLB4_5_2_bool0=true;} // FIELD:
                case 10:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5645);__CLB4_5_2_bool0=true;} // METH:
                case 11:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5646);__CLB4_5_2_bool0=true;} //IMETH:
                case 3:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5647);__CLB4_5_2_bool0=true;} //INT:
                case 4:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5648);__CLB4_5_2_bool0=true;} //FLOAT:
                case 18:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5649);__CLB4_5_2_bool0=true;} //INVOKEDYN:
                case 12:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5650);__CLB4_5_2_bool0=true;} //NAME_TYPE:
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5651);size = 5;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5652);break;
                case 5:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5653);__CLB4_5_2_bool0=true;} //LONG:
                case 6:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5654);__CLB4_5_2_bool0=true;} //DOUBLE:
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5655);size = 9;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5656);++i;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5657);break;
                case 15:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5658);__CLB4_5_2_bool0=true;} //MHANDLE:
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5659);size = 4;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5660);break;
                case 1:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5661);__CLB4_5_2_bool0=true;} //UTF8:
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5662);size = 3 + readUnsignedShort(index + 1);
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5663);if ((((size > max)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5664)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5665)==0&false))) {{
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5666);max = size;
                    }
                    }__CLR4_5_24c14c1lusyjiyc.R.inc(5667);break;
                // case HamConstants.CLASS:
                // case HamConstants.STR:
                default:if (!__CLB4_5_2_bool0) {__CLR4_5_24c14c1lusyjiyc.R.inc(5668);__CLB4_5_2_bool0=true;}
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5669);size = 3;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5670);break;
            }
            __CLR4_5_24c14c1lusyjiyc.R.inc(5671);index += size;
        }
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5672);maxStringLength = max;
        // the class header information starts just after the constant pool
        __CLR4_5_24c14c1lusyjiyc.R.inc(5673);header = index;
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    public void accept(final TypeCollector classVisitor) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5674);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5675);char[] c = new char[maxStringLength]; // buffer used to read strings
        __CLR4_5_24c14c1lusyjiyc.R.inc(5676);int i, j; // loop variables
        __CLR4_5_24c14c1lusyjiyc.R.inc(5677);int u, v; // indexes in b
        __CLR4_5_24c14c1lusyjiyc.R.inc(5678);int anns = 0;

        //read annotations
        __CLR4_5_24c14c1lusyjiyc.R.inc(5679);if ((((readAnnotations)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5680)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5681)==0&false))) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5682);u = getAttributes();
            __CLR4_5_24c14c1lusyjiyc.R.inc(5683);for (i = readUnsignedShort(u); (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5684)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5685)==0&false)); --i) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5686);String attrName = readUTF8(u + 2, c);
                __CLR4_5_24c14c1lusyjiyc.R.inc(5687);if (((("RuntimeVisibleAnnotations".equals(attrName))&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5688)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5689)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5690);anns = u + 8;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5691);break;
                }
                }__CLR4_5_24c14c1lusyjiyc.R.inc(5692);u += 6 + readInt(u + 4);
            }
        }}

        // visits the header
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5693);u = header;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5694);v = items[readUnsignedShort(u + 4)];
        __CLR4_5_24c14c1lusyjiyc.R.inc(5695);int len = readUnsignedShort(u + 6);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5696);u += 8;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5697);for (i = 0; (((i < len)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5698)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5699)==0&false)); ++i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5700);u += 2;
        }
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5701);v = u;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5702);i = readUnsignedShort(v);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5703);v += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5704);for (; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5705)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5706)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5707);j = readUnsignedShort(v + 6);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5708);v += 8;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5709);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5710)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5711)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5712);v += 6 + readInt(v + 2);
            }
        }}
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5713);i = readUnsignedShort(v);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5714);v += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5715);for (; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5716)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5717)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5718);j = readUnsignedShort(v + 6);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5719);v += 8;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5720);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5721)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5722)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5723);v += 6 + readInt(v + 2);
            }
        }}

        }__CLR4_5_24c14c1lusyjiyc.R.inc(5724);i = readUnsignedShort(v);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5725);v += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5726);for (; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5727)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5728)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5729);v += 6 + readInt(v + 2);
        }

        }__CLR4_5_24c14c1lusyjiyc.R.inc(5730);if ((((anns != 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5731)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5732)==0&false))) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5733);for (i = readUnsignedShort(anns), v = anns + 2; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5734)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5735)==0&false)); --i) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5736);String name = readUTF8(v, c);
                __CLR4_5_24c14c1lusyjiyc.R.inc(5737);classVisitor.visitAnnotation(name);
            }
        }}

        // visits the fields
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5738);i = readUnsignedShort(u);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5739);u += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5740);for (; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5741)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5742)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5743);j = readUnsignedShort(u + 6);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5744);u += 8;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5745);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5746)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5747)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5748);u += 6 + readInt(u + 2);
            }
        }}

        // visits the methods
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5749);i = readUnsignedShort(u);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5750);u += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5751);for (; (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5752)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5753)==0&false)); --i) {{
            // inlined in original ASM source, now a method call
            __CLR4_5_24c14c1lusyjiyc.R.inc(5754);u = readMethod(classVisitor, c, u);
        }
    }}finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private int getAttributes() {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5755);
        // skips the header
        __CLR4_5_24c14c1lusyjiyc.R.inc(5756);int u = header + 8 + readUnsignedShort(header + 6) * 2;
        // skips fields and methods
        __CLR4_5_24c14c1lusyjiyc.R.inc(5757);for (int i = readUnsignedShort(u); (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5758)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5759)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5760);for (int j = readUnsignedShort(u + 8); (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5761)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5762)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5763);u += 6 + readInt(u + 12);
            }
            }__CLR4_5_24c14c1lusyjiyc.R.inc(5764);u += 8;
        }
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5765);u += 2;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5766);for (int i = readUnsignedShort(u); (((i > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5767)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5768)==0&false)); --i) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5769);for (int j = readUnsignedShort(u + 8); (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5770)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5771)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5772);u += 6 + readInt(u + 12);
            }
            }__CLR4_5_24c14c1lusyjiyc.R.inc(5773);u += 8;
        }
        // the attribute_info structure starts just after the methods
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5774);return u + 2;
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private int readMethod(TypeCollector classVisitor, char[] c, int u) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5775);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5776);int v;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5777);int w;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5778);int j;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5779);String attrName;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5780);int k;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5781);int access = readUnsignedShort(u);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5782);String name = readUTF8(u + 2, c);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5783);String desc = readUTF8(u + 4, c);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5784);v = 0;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5785);w = 0;

        // looks for Code and Exceptions attributes
        __CLR4_5_24c14c1lusyjiyc.R.inc(5786);j = readUnsignedShort(u + 6);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5787);u += 8;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5788);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5789)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5790)==0&false)); --j) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5791);attrName = readUTF8(u, c);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5792);int attrSize = readInt(u + 2);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5793);u += 6;
            // tests are sorted in decreasing frequency order
            // (based on frequencies observed on typical classes)
            __CLR4_5_24c14c1lusyjiyc.R.inc(5794);if ((((attrName.equals("Code"))&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5795)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5796)==0&false))) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5797);v = u;
            }
            }__CLR4_5_24c14c1lusyjiyc.R.inc(5798);u += attrSize;
        }
        // reads declared exceptions
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5799);if ((((w == 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5800)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5801)==0&false))) {{
        } }else {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5802);w += 2;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5803);for (j = 0; (((j < readUnsignedShort(w))&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5804)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5805)==0&false)); ++j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5806);w += 2;
            }
        }}

        // visits the method's code, if any
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5807);MethodCollector mv = classVisitor.visitMethod(access, name, desc);

        __CLR4_5_24c14c1lusyjiyc.R.inc(5808);if ((((mv != null && v != 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5809)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5810)==0&false))) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5811);int codeLength = readInt(v + 4);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5812);v += 8;

            __CLR4_5_24c14c1lusyjiyc.R.inc(5813);int codeStart = v;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5814);int codeEnd = v + codeLength;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5815);v = codeEnd;

            __CLR4_5_24c14c1lusyjiyc.R.inc(5816);j = readUnsignedShort(v);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5817);v += 2;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5818);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5819)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5820)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5821);v += 8;
            }
            // parses the local variable, line number tables, and code
            // attributes
            }__CLR4_5_24c14c1lusyjiyc.R.inc(5822);int varTable = 0;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5823);int varTypeTable = 0;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5824);j = readUnsignedShort(v);
            __CLR4_5_24c14c1lusyjiyc.R.inc(5825);v += 2;
            __CLR4_5_24c14c1lusyjiyc.R.inc(5826);for (; (((j > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5827)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5828)==0&false)); --j) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5829);attrName = readUTF8(v, c);
                __CLR4_5_24c14c1lusyjiyc.R.inc(5830);if ((((attrName.equals("LocalVariableTable"))&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5831)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5832)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5833);varTable = v + 6;
                } }else {__CLR4_5_24c14c1lusyjiyc.R.inc(5834);if ((((attrName.equals("LocalVariableTypeTable"))&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5835)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5836)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5837);varTypeTable = v + 6;
                }
                }}__CLR4_5_24c14c1lusyjiyc.R.inc(5838);v += 6 + readInt(v + 2);
            }

            }__CLR4_5_24c14c1lusyjiyc.R.inc(5839);v = codeStart;
            // visits the local variable tables
            __CLR4_5_24c14c1lusyjiyc.R.inc(5840);if ((((varTable != 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5841)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5842)==0&false))) {{
                __CLR4_5_24c14c1lusyjiyc.R.inc(5843);if ((((varTypeTable != 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5844)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5845)==0&false))) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5846);k = readUnsignedShort(varTypeTable) * 3;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5847);w = varTypeTable + 2;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5848);int[] typeTable = new int[k];
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5849);while ((((k > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5850)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5851)==0&false))) {{
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5852);typeTable[--k] = w + 6; // signature
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5853);typeTable[--k] = readUnsignedShort(w + 8); // index
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5854);typeTable[--k] = readUnsignedShort(w); // start
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5855);w += 10;
                    }
                }}
                }__CLR4_5_24c14c1lusyjiyc.R.inc(5856);k = readUnsignedShort(varTable);
                __CLR4_5_24c14c1lusyjiyc.R.inc(5857);w = varTable + 2;
                __CLR4_5_24c14c1lusyjiyc.R.inc(5858);for (; (((k > 0)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5859)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5860)==0&false)); --k) {{
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5861);int index = readUnsignedShort(w + 8);
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5862);mv.visitLocalVariable(readUTF8(w + 4, c), index);
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5863);w += 10;
                }
            }}
        }}
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5864);return u;
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private int readUnsignedShort(final int index) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5865);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5866);byte[] b = this.b;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5867);return ((b[index] & 0xFF) << 8) | (b[index + 1] & 0xFF);
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private int readInt(final int index) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5868);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5869);byte[] b = this.b;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5870);return ((b[index] & 0xFF) << 24) | ((b[index + 1] & 0xFF) << 16)
                | ((b[index + 2] & 0xFF) << 8) | (b[index + 3] & 0xFF);
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private String readUTF8(int index, final char[] buf) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5871);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5872);int item = readUnsignedShort(index);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5873);String s = strings[item];
        __CLR4_5_24c14c1lusyjiyc.R.inc(5874);if ((((s != null)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5875)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5876)==0&false))) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5877);return s;
        }
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5878);index = items[item];
        __CLR4_5_24c14c1lusyjiyc.R.inc(5879);return strings[item] = readUTF(index + 2, readUnsignedShort(index), buf);
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}

    private String readUTF(int index, final int utfLen, final char[] buf) {try{__CLR4_5_24c14c1lusyjiyc.R.inc(5880);
        __CLR4_5_24c14c1lusyjiyc.R.inc(5881);int endIndex = index + utfLen;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5882);byte[] b = this.b;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5883);int strLen = 0;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5884);int c;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5885);int st = 0;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5886);char cc = 0;
        __CLR4_5_24c14c1lusyjiyc.R.inc(5887);while ((((index < endIndex)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5888)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5889)==0&false))) {{
            __CLR4_5_24c14c1lusyjiyc.R.inc(5890);c = b[index++];
            boolean __CLB4_5_2_bool1=false;__CLR4_5_24c14c1lusyjiyc.R.inc(5891);switch (st) {
                case 0:if (!__CLB4_5_2_bool1) {__CLR4_5_24c14c1lusyjiyc.R.inc(5892);__CLB4_5_2_bool1=true;}
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5893);c = c & 0xFF;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5894);if ((((c < 0x80)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5895)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5896)==0&false))) {{  // 0xxxxxxx
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5897);buf[strLen++] = (char) c;
                    } }else {__CLR4_5_24c14c1lusyjiyc.R.inc(5898);if ((((c < 0xE0 && c > 0xBF)&&(__CLR4_5_24c14c1lusyjiyc.R.iget(5899)!=0|true))||(__CLR4_5_24c14c1lusyjiyc.R.iget(5900)==0&false))) {{  // 110x xxxx 10xx xxxx
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5901);cc = (char) (c & 0x1F);
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5902);st = 1;
                    } }else {{  // 1110 xxxx 10xx xxxx 10xx xxxx
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5903);cc = (char) (c & 0x0F);
                        __CLR4_5_24c14c1lusyjiyc.R.inc(5904);st = 2;
                    }
                    }}__CLR4_5_24c14c1lusyjiyc.R.inc(5905);break;

                case 1:if (!__CLB4_5_2_bool1) {__CLR4_5_24c14c1lusyjiyc.R.inc(5906);__CLB4_5_2_bool1=true;}  // byte 2 of 2-byte char or byte 3 of 3-byte char
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5907);buf[strLen++] = (char) ((cc << 6) | (c & 0x3F));
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5908);st = 0;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5909);break;

                case 2:if (!__CLB4_5_2_bool1) {__CLR4_5_24c14c1lusyjiyc.R.inc(5910);__CLB4_5_2_bool1=true;}  // byte 2 of 3-byte char
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5911);cc = (char) ((cc << 6) | (c & 0x3F));
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5912);st = 1;
                    __CLR4_5_24c14c1lusyjiyc.R.inc(5913);break;
            }
        }
        }__CLR4_5_24c14c1lusyjiyc.R.inc(5914);return new String(buf, 0, strLen);
    }finally{__CLR4_5_24c14c1lusyjiyc.R.flushNeeded();}}
}
