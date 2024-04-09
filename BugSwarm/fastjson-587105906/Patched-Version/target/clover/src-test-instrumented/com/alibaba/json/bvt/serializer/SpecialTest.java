/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.serializer.SerializerFeature;

public class SpecialTest {static class __CLR4_5_21ua21ua2lusvnglw{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85942,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public static void main(String[] args) throws Exception {try{__CLR4_5_21ua21ua2lusvnglw.R.inc(85898);
        
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85899);int count = 0;
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85900);for (int i = 0; (((i < 1000)&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85901)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85902)==0&false)); ++i) {{
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85903);char ch = (char) i;
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85904);if((((isSpecial(ch))&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85905)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85906)==0&false))) {{
                __CLR4_5_21ua21ua2lusvnglw.R.inc(85907);count++;
            }
        }}
        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85908);System.out.println(count);
    }finally{__CLR4_5_21ua21ua2lusvnglw.R.flushNeeded();}}
    
    final static long flags;
    static {try{__CLR4_5_21ua21ua2lusvnglw.R.inc(85909);
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85910);long val = 0L;
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85911);val |= (1L << ('"' - 31)); // 34 - 31
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85912);val |= (1L << ('\\' - 31)); // 92 - 31
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85913);flags = val;
    }finally{__CLR4_5_21ua21ua2lusvnglw.R.flushNeeded();}}
    
    static boolean isSpecial(char ch) {try{__CLR4_5_21ua21ua2lusvnglw.R.inc(85914);
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85915);if ((((ch <= 31)&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85916)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85917)==0&false))) {{
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85918);return true;
        }
        
        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85919);if ((((ch > '\\')&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85920)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85921)==0&false))) {{ // 92
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85922);return false;
        }
        
        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85923);return ((1L << (ch - 31)) & flags) != 0;
    }finally{__CLR4_5_21ua21ua2lusvnglw.R.flushNeeded();}}
    
    static boolean isSpecial(char ch, int features) {try{__CLR4_5_21ua21ua2lusvnglw.R.inc(85924);
        // if (ch > ']') {
        // return false;
        // }
        
        __CLR4_5_21ua21ua2lusvnglw.R.inc(85925);if ((((ch == ' ')&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85926)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85927)==0&false))) {{ // 32
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85928);return false;
        }

        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85929);if ((((ch == '/')&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85930)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85931)==0&false))) {{ // 47
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85932);return SerializerFeature.isEnabled(features, SerializerFeature.WriteSlashAsSpecial);
        }

        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85933);if ((((ch > '#' // 35
            && ch != '\\' // 92
            )&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85934)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85935)==0&false))) {{
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85936);return false;
        }

        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85937);if ((((ch <= 0x1F // 31
                || ch == '\\' // 92
                || ch == '"' // 34
                )&&(__CLR4_5_21ua21ua2lusvnglw.R.iget(85938)!=0|true))||(__CLR4_5_21ua21ua2lusvnglw.R.iget(85939)==0&false))) {{
            __CLR4_5_21ua21ua2lusvnglw.R.inc(85940);return true;
        }

        }__CLR4_5_21ua21ua2lusvnglw.R.inc(85941);return false;
    }finally{__CLR4_5_21ua21ua2lusvnglw.R.flushNeeded();}}
}
