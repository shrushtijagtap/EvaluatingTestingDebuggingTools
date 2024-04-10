/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.parser.SymbolTable;

public class SymbolTableDupTest extends TestCase {static class __CLR4_5_221o621o6lusyjwi1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95546,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private HashMap<Integer, Integer>      map          = new HashMap<Integer, Integer>();
    private Set<Integer>                   dupHashCodes = new HashSet<Integer>();
    private HashMap<Integer, List<String>> dupList      = new HashMap<Integer, List<String>>();

    private final int                      VALUE        = 114788;

    public void test_0() throws Exception {__CLR4_5_221o621o6lusyjwi1.R.globalSliceStart(getClass().getName(),95478);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp221o6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221o621o6lusyjwi1.R.rethrow($CLV_t2$);}finally{__CLR4_5_221o621o6lusyjwi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.SymbolTableDupTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95478,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp221o6() throws Exception{try{__CLR4_5_221o621o6lusyjwi1.R.inc(95478);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95479);int len = 3;
        __CLR4_5_221o621o6lusyjwi1.R.inc(95480);char[] chars = new char[len];
        __CLR4_5_221o621o6lusyjwi1.R.inc(95481);tryBit(chars, len);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95482);tryBit2(chars, len);
        // tryBit3(chars, len);
        // for (Map.Entry<Integer, List<String>> entry : dupList.entrySet()) {
        // System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

    }finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void tryBit(char[] chars, int i) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95483);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95484);char startChar = 'A';
        __CLR4_5_221o621o6lusyjwi1.R.inc(95485);char endChar = 'z';

        __CLR4_5_221o621o6lusyjwi1.R.inc(95486);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95487)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95488)==0&false)); j++) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95489);chars[i - 1] = j;

            __CLR4_5_221o621o6lusyjwi1.R.inc(95490);if ((((i > 1)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95491)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95492)==0&false))) {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95493);tryBit(chars, i - 1);
            } }else {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95494);test(chars);
            }
        }}
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void tryBit2(char[] chars, int i) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95495);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95496);char startChar = 'A';
        __CLR4_5_221o621o6lusyjwi1.R.inc(95497);char endChar = 'z';

        __CLR4_5_221o621o6lusyjwi1.R.inc(95498);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95499)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95500)==0&false)); j++) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95501);chars[i - 1] = j;

            __CLR4_5_221o621o6lusyjwi1.R.inc(95502);if ((((i > 1)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95503)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95504)==0&false))) {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95505);tryBit2(chars, i - 1);
            } }else {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95506);test2(chars);
            }
        }}
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void tryBit3(char[] chars, int i) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95507);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95508);char startChar = 'A';
        __CLR4_5_221o621o6lusyjwi1.R.inc(95509);char endChar = 'z';

        __CLR4_5_221o621o6lusyjwi1.R.inc(95510);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95511)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95512)==0&false)); j++) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95513);chars[i - 1] = j;

            __CLR4_5_221o621o6lusyjwi1.R.inc(95514);if ((((i > 1)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95515)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95516)==0&false))) {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95517);tryBit3(chars, i - 1);
            } }else {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95518);test3(chars);
            }
        }}
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void test3(char[] chars) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95519);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95520);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95521);if ((((hash == VALUE)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95522)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95523)==0&false))) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95524);System.out.println(new String(chars));
        }
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void test2(char[] chars) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95525);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95526);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95527);if ((((dupHashCodes.contains(hash))&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95528)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95529)==0&false))) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95530);List<String> list = dupList.get(hash);
            __CLR4_5_221o621o6lusyjwi1.R.inc(95531);if ((((list == null)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95532)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95533)==0&false))) {{
                __CLR4_5_221o621o6lusyjwi1.R.inc(95534);list = new ArrayList<String>();
                __CLR4_5_221o621o6lusyjwi1.R.inc(95535);dupList.put(hash, list);
            }
            }__CLR4_5_221o621o6lusyjwi1.R.inc(95536);list.add(new String(chars));
        }
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

    private void test(char[] chars) {try{__CLR4_5_221o621o6lusyjwi1.R.inc(95537);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95538);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95539);Integer count = map.get(hash);
        __CLR4_5_221o621o6lusyjwi1.R.inc(95540);if ((((count != null)&&(__CLR4_5_221o621o6lusyjwi1.R.iget(95541)!=0|true))||(__CLR4_5_221o621o6lusyjwi1.R.iget(95542)==0&false))) {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95543);dupHashCodes.add(hash);
            __CLR4_5_221o621o6lusyjwi1.R.inc(95544);map.put(hash, count.intValue() + 1);
        } }else {{
            __CLR4_5_221o621o6lusyjwi1.R.inc(95545);map.put(hash, 1);
        }
    }}finally{__CLR4_5_221o621o6lusyjwi1.R.flushNeeded();}}

}
