/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.parser.SymbolTable;

public class SymbolTableDupTest extends TestCase {static class __CLR4_5_222me22melusvnk27{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private HashMap<Integer, Integer>      map          = new HashMap<Integer, Integer>();
    private Set<Integer>                   dupHashCodes = new HashSet<Integer>();
    private HashMap<Integer, List<String>> dupList      = new HashMap<Integer, List<String>>();

    private final int                      VALUE        = 114788;

    public void test_0() throws Exception {__CLR4_5_222me22melusvnk27.R.globalSliceStart(getClass().getName(),96710);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp222me();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222me22melusvnk27.R.rethrow($CLV_t2$);}finally{__CLR4_5_222me22melusvnk27.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.SymbolTableDupTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96710,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp222me() throws Exception{try{__CLR4_5_222me22melusvnk27.R.inc(96710);
        __CLR4_5_222me22melusvnk27.R.inc(96711);int len = 3;
        __CLR4_5_222me22melusvnk27.R.inc(96712);char[] chars = new char[len];
        __CLR4_5_222me22melusvnk27.R.inc(96713);tryBit(chars, len);
        __CLR4_5_222me22melusvnk27.R.inc(96714);tryBit2(chars, len);
        // tryBit3(chars, len);
        // for (Map.Entry<Integer, List<String>> entry : dupList.entrySet()) {
        // System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

    }finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void tryBit(char[] chars, int i) {try{__CLR4_5_222me22melusvnk27.R.inc(96715);
        __CLR4_5_222me22melusvnk27.R.inc(96716);char startChar = 'A';
        __CLR4_5_222me22melusvnk27.R.inc(96717);char endChar = 'z';

        __CLR4_5_222me22melusvnk27.R.inc(96718);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_222me22melusvnk27.R.iget(96719)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96720)==0&false)); j++) {{
            __CLR4_5_222me22melusvnk27.R.inc(96721);chars[i - 1] = j;

            __CLR4_5_222me22melusvnk27.R.inc(96722);if ((((i > 1)&&(__CLR4_5_222me22melusvnk27.R.iget(96723)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96724)==0&false))) {{
                __CLR4_5_222me22melusvnk27.R.inc(96725);tryBit(chars, i - 1);
            } }else {{
                __CLR4_5_222me22melusvnk27.R.inc(96726);test(chars);
            }
        }}
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void tryBit2(char[] chars, int i) {try{__CLR4_5_222me22melusvnk27.R.inc(96727);
        __CLR4_5_222me22melusvnk27.R.inc(96728);char startChar = 'A';
        __CLR4_5_222me22melusvnk27.R.inc(96729);char endChar = 'z';

        __CLR4_5_222me22melusvnk27.R.inc(96730);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_222me22melusvnk27.R.iget(96731)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96732)==0&false)); j++) {{
            __CLR4_5_222me22melusvnk27.R.inc(96733);chars[i - 1] = j;

            __CLR4_5_222me22melusvnk27.R.inc(96734);if ((((i > 1)&&(__CLR4_5_222me22melusvnk27.R.iget(96735)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96736)==0&false))) {{
                __CLR4_5_222me22melusvnk27.R.inc(96737);tryBit2(chars, i - 1);
            } }else {{
                __CLR4_5_222me22melusvnk27.R.inc(96738);test2(chars);
            }
        }}
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void tryBit3(char[] chars, int i) {try{__CLR4_5_222me22melusvnk27.R.inc(96739);
        __CLR4_5_222me22melusvnk27.R.inc(96740);char startChar = 'A';
        __CLR4_5_222me22melusvnk27.R.inc(96741);char endChar = 'z';

        __CLR4_5_222me22melusvnk27.R.inc(96742);for (char j = startChar; (((j <= endChar)&&(__CLR4_5_222me22melusvnk27.R.iget(96743)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96744)==0&false)); j++) {{
            __CLR4_5_222me22melusvnk27.R.inc(96745);chars[i - 1] = j;

            __CLR4_5_222me22melusvnk27.R.inc(96746);if ((((i > 1)&&(__CLR4_5_222me22melusvnk27.R.iget(96747)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96748)==0&false))) {{
                __CLR4_5_222me22melusvnk27.R.inc(96749);tryBit3(chars, i - 1);
            } }else {{
                __CLR4_5_222me22melusvnk27.R.inc(96750);test3(chars);
            }
        }}
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void test3(char[] chars) {try{__CLR4_5_222me22melusvnk27.R.inc(96751);
        __CLR4_5_222me22melusvnk27.R.inc(96752);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_222me22melusvnk27.R.inc(96753);if ((((hash == VALUE)&&(__CLR4_5_222me22melusvnk27.R.iget(96754)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96755)==0&false))) {{
            __CLR4_5_222me22melusvnk27.R.inc(96756);System.out.println(new String(chars));
        }
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void test2(char[] chars) {try{__CLR4_5_222me22melusvnk27.R.inc(96757);
        __CLR4_5_222me22melusvnk27.R.inc(96758);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_222me22melusvnk27.R.inc(96759);if ((((dupHashCodes.contains(hash))&&(__CLR4_5_222me22melusvnk27.R.iget(96760)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96761)==0&false))) {{
            __CLR4_5_222me22melusvnk27.R.inc(96762);List<String> list = dupList.get(hash);
            __CLR4_5_222me22melusvnk27.R.inc(96763);if ((((list == null)&&(__CLR4_5_222me22melusvnk27.R.iget(96764)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96765)==0&false))) {{
                __CLR4_5_222me22melusvnk27.R.inc(96766);list = new ArrayList<String>();
                __CLR4_5_222me22melusvnk27.R.inc(96767);dupList.put(hash, list);
            }
            }__CLR4_5_222me22melusvnk27.R.inc(96768);list.add(new String(chars));
        }
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

    private void test(char[] chars) {try{__CLR4_5_222me22melusvnk27.R.inc(96769);
        __CLR4_5_222me22melusvnk27.R.inc(96770);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_5_222me22melusvnk27.R.inc(96771);Integer count = map.get(hash);
        __CLR4_5_222me22melusvnk27.R.inc(96772);if ((((count != null)&&(__CLR4_5_222me22melusvnk27.R.iget(96773)!=0|true))||(__CLR4_5_222me22melusvnk27.R.iget(96774)==0&false))) {{
            __CLR4_5_222me22melusvnk27.R.inc(96775);dupHashCodes.add(hash);
            __CLR4_5_222me22melusvnk27.R.inc(96776);map.put(hash, count.intValue() + 1);
        } }else {{
            __CLR4_5_222me22melusvnk27.R.inc(96777);map.put(hash, 1);
        }
    }}finally{__CLR4_5_222me22melusvnk27.R.flushNeeded();}}

}
