/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import com.alibaba.fastjson.serializer.SerializerFeature;

public class SpecialTest {static class __CLR4_5_21tbu1tbulusyjv3e{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public static void main(String[] args) throws Exception {try{__CLR4_5_21tbu1tbulusyjv3e.R.inc(84666);
        
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84667);int count = 0;
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84668);for (int i = 0; (((i < 1000)&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84669)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84670)==0&false)); ++i) {{
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84671);char ch = (char) i;
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84672);if((((isSpecial(ch))&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84673)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84674)==0&false))) {{
                __CLR4_5_21tbu1tbulusyjv3e.R.inc(84675);count++;
            }
        }}
        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84676);System.out.println(count);
    }finally{__CLR4_5_21tbu1tbulusyjv3e.R.flushNeeded();}}
    
    final static long flags;
    static {try{__CLR4_5_21tbu1tbulusyjv3e.R.inc(84677);
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84678);long val = 0L;
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84679);val |= (1L << ('"' - 31)); // 34 - 31
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84680);val |= (1L << ('\\' - 31)); // 92 - 31
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84681);flags = val;
    }finally{__CLR4_5_21tbu1tbulusyjv3e.R.flushNeeded();}}
    
    static boolean isSpecial(char ch) {try{__CLR4_5_21tbu1tbulusyjv3e.R.inc(84682);
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84683);if ((((ch <= 31)&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84684)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84685)==0&false))) {{
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84686);return true;
        }
        
        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84687);if ((((ch > '\\')&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84688)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84689)==0&false))) {{ // 92
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84690);return false;
        }
        
        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84691);return ((1L << (ch - 31)) & flags) != 0;
    }finally{__CLR4_5_21tbu1tbulusyjv3e.R.flushNeeded();}}
    
    static boolean isSpecial(char ch, int features) {try{__CLR4_5_21tbu1tbulusyjv3e.R.inc(84692);
        // if (ch > ']') {
        // return false;
        // }
        
        __CLR4_5_21tbu1tbulusyjv3e.R.inc(84693);if ((((ch == ' ')&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84694)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84695)==0&false))) {{ // 32
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84696);return false;
        }

        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84697);if ((((ch == '/')&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84698)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84699)==0&false))) {{ // 47
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84700);return SerializerFeature.isEnabled(features, SerializerFeature.WriteSlashAsSpecial);
        }

        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84701);if ((((ch > '#' // 35
            && ch != '\\' // 92
            )&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84702)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84703)==0&false))) {{
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84704);return false;
        }

        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84705);if ((((ch <= 0x1F // 31
                || ch == '\\' // 92
                || ch == '"' // 34
                )&&(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84706)!=0|true))||(__CLR4_5_21tbu1tbulusyjv3e.R.iget(84707)==0&false))) {{
            __CLR4_5_21tbu1tbulusyjv3e.R.inc(84708);return true;
        }

        }__CLR4_5_21tbu1tbulusyjv3e.R.inc(84709);return false;
    }finally{__CLR4_5_21tbu1tbulusyjv3e.R.flushNeeded();}}
}
