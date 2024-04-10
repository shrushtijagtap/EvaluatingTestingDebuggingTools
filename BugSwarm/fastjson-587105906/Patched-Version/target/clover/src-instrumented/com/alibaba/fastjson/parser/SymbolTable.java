/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.fastjson.parser;

import com.alibaba.fastjson.JSON;

/**
 * @author wenshao[szujobs@hotmail.com]
 */
public class SymbolTable {public static class __CLR4_5_2d7id7ilusyjl8k{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,17189,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final String[] symbols;
    private final int      indexMask;
    
    public SymbolTable(int tableSize){try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17118);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17119);this.indexMask = tableSize - 1;
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17120);this.symbols = new String[tableSize];
        
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17121);this.addSymbol("$ref", 0, 4, "$ref".hashCode());
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17122);this.addSymbol(JSON.DEFAULT_TYPE_KEY, 0, JSON.DEFAULT_TYPE_KEY.length(), JSON.DEFAULT_TYPE_KEY.hashCode());
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}

    public String addSymbol(char[] buffer, int offset, int len) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17123);
        // search for identical symbol
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17124);int hash = hash(buffer, offset, len);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17125);return addSymbol(buffer, offset, len, hash);
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}

    /**
     * Adds the specified symbol to the symbol table and returns a reference to the unique symbol. If the symbol already
     * exists, the previous symbol reference is returned instead, in order guarantee that symbol references remain
     * unique.
     * 
     * @param buffer The buffer containing the new symbol.
     * @param offset The offset into the buffer of the new symbol.
     * @param len The length of the new symbol in the buffer.
     */
    public String addSymbol(char[] buffer, int offset, int len, int hash) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17126);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17127);final int bucket = hash & indexMask;
        
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17128);String symbol = symbols[bucket];
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17129);if ((((symbol != null)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17130)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17131)==0&false))) {{
            __CLR4_5_2d7id7ilusyjl8k.R.inc(17132);boolean eq = true;
            __CLR4_5_2d7id7ilusyjl8k.R.inc(17133);if ((((hash == symbol.hashCode() // 
                    && len == symbol.length())&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17134)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17135)==0&false))) {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17136);for (int i = 0; (((i < len)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17137)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17138)==0&false)); i++) {{
                    __CLR4_5_2d7id7ilusyjl8k.R.inc(17139);if ((((buffer[offset + i] != symbol.charAt(i))&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17140)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17141)==0&false))) {{
                        __CLR4_5_2d7id7ilusyjl8k.R.inc(17142);eq = false;
                        __CLR4_5_2d7id7ilusyjl8k.R.inc(17143);break;
                    }
                }}
            }} }else {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17144);eq = false;
            }
            
            }__CLR4_5_2d7id7ilusyjl8k.R.inc(17145);if ((((eq)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17146)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17147)==0&false))) {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17148);return symbol;
            } }else {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17149);return new String(buffer, offset, len);    
            }
        }}
        
        }__CLR4_5_2d7id7ilusyjl8k.R.inc(17150);symbol = new String(buffer, offset, len).intern();
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17151);symbols[bucket] = symbol;
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17152);return symbol;
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}

    public String addSymbol(String buffer, int offset, int len, int hash) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17153);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17154);return addSymbol(buffer, offset, len, hash, false);
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}

    public String addSymbol(String buffer, int offset, int len, int hash, boolean replace) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17155);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17156);final int bucket = hash & indexMask;

        __CLR4_5_2d7id7ilusyjl8k.R.inc(17157);String symbol = symbols[bucket];
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17158);if ((((symbol != null)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17159)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17160)==0&false))) {{
            __CLR4_5_2d7id7ilusyjl8k.R.inc(17161);if ((((hash == symbol.hashCode() // 
                    && len == symbol.length() //
                    && buffer.startsWith(symbol, offset))&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17162)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17163)==0&false))) {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17164);return symbol;
            }

            }__CLR4_5_2d7id7ilusyjl8k.R.inc(17165);String str = subString(buffer, offset, len);

            __CLR4_5_2d7id7ilusyjl8k.R.inc(17166);if ((((replace)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17167)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17168)==0&false))) {{
                __CLR4_5_2d7id7ilusyjl8k.R.inc(17169);symbols[bucket] = str;
            }

            }__CLR4_5_2d7id7ilusyjl8k.R.inc(17170);return str;
        }
        
        }__CLR4_5_2d7id7ilusyjl8k.R.inc(17171);symbol = (((len == buffer.length() //
            )&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17172)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17173)==0&false))? buffer //
            : subString(buffer, offset, len);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17174);symbol = symbol.intern();
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17175);symbols[bucket] = symbol;
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17176);return symbol;
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}
    
    private static String subString(String src, int offset, int len) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17177);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17178);char[] chars = new char[len];
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17179);src.getChars(offset, offset + len, chars, 0);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17180);return new String(chars);
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}

    public static int hash(char[] buffer, int offset, int len) {try{__CLR4_5_2d7id7ilusyjl8k.R.inc(17181);
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17182);int h = 0;
        __CLR4_5_2d7id7ilusyjl8k.R.inc(17183);int off = offset;

        __CLR4_5_2d7id7ilusyjl8k.R.inc(17184);for (int i = 0; (((i < len)&&(__CLR4_5_2d7id7ilusyjl8k.R.iget(17185)!=0|true))||(__CLR4_5_2d7id7ilusyjl8k.R.iget(17186)==0&false)); i++) {{
            __CLR4_5_2d7id7ilusyjl8k.R.inc(17187);h = 31 * h + buffer[off++];
        }
        }__CLR4_5_2d7id7ilusyjl8k.R.inc(17188);return h;
    }finally{__CLR4_5_2d7id7ilusyjl8k.R.flushNeeded();}}
}