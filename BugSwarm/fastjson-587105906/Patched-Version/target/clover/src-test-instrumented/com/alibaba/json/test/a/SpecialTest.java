/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.a;

import com.alibaba.fastjson.serializer.SerializerFeature;

public class SpecialTest {static class __CLR4_5_2225y225ylusyjwkx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,96147,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    
    public static void main(String[] args) throws Exception {try{__CLR4_5_2225y225ylusyjwkx.R.inc(96118);
        
        __CLR4_5_2225y225ylusyjwkx.R.inc(96119);int count = 0;
        __CLR4_5_2225y225ylusyjwkx.R.inc(96120);for (int i = 0; (((i < 1000)&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96121)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96122)==0&false)); ++i) {{
            __CLR4_5_2225y225ylusyjwkx.R.inc(96123);char ch = (char) i;
            __CLR4_5_2225y225ylusyjwkx.R.inc(96124);if((((isSpecial(ch, 0))&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96125)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96126)==0&false))) {{
                __CLR4_5_2225y225ylusyjwkx.R.inc(96127);count++;
            }
        }}
        }__CLR4_5_2225y225ylusyjwkx.R.inc(96128);System.out.println(count);
    }finally{__CLR4_5_2225y225ylusyjwkx.R.flushNeeded();}}
    static boolean isSpecial(char ch, int features) {try{__CLR4_5_2225y225ylusyjwkx.R.inc(96129);
        // if (ch > ']') {
        // return false;
        // }
        
        __CLR4_5_2225y225ylusyjwkx.R.inc(96130);if ((((ch == ' ')&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96131)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96132)==0&false))) {{ // 32
            __CLR4_5_2225y225ylusyjwkx.R.inc(96133);return false;
        }

        }__CLR4_5_2225y225ylusyjwkx.R.inc(96134);if ((((ch == '/')&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96135)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96136)==0&false))) {{ // 47
            __CLR4_5_2225y225ylusyjwkx.R.inc(96137);return SerializerFeature.isEnabled(features, SerializerFeature.WriteSlashAsSpecial);
        }

        }__CLR4_5_2225y225ylusyjwkx.R.inc(96138);if ((((ch > '#' // 35
            && ch != '\\' // 92
            )&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96139)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96140)==0&false))) {{
            __CLR4_5_2225y225ylusyjwkx.R.inc(96141);return false;
        }

        }__CLR4_5_2225y225ylusyjwkx.R.inc(96142);if ((((ch <= 0x1F // 31
                || ch == '\\' // 92
                || ch == '"' // 34
                )&&(__CLR4_5_2225y225ylusyjwkx.R.iget(96143)!=0|true))||(__CLR4_5_2225y225ylusyjwkx.R.iget(96144)==0&false))) {{
            __CLR4_5_2225y225ylusyjwkx.R.inc(96145);return true;
        }

        }__CLR4_5_2225y225ylusyjwkx.R.inc(96146);return false;
    }finally{__CLR4_5_2225y225ylusyjwkx.R.flushNeeded();}}
}
