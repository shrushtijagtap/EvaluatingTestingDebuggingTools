/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import com.alibaba.fastjson.parser.SymbolTable;

public class SymbolTableDupTest extends TestCase {static class __CLR4_1_1021oh21ohlusqkroj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95557,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private HashMap<Integer, Integer>      map          = new HashMap<Integer, Integer>();
    private Set<Integer>                   dupHashCodes = new HashSet<Integer>();
    private HashMap<Integer, List<String>> dupList      = new HashMap<Integer, List<String>>();

    private final int                      VALUE        = 114788;

    public void test_0() throws Exception {__CLR4_1_1021oh21ohlusqkroj.R.globalSliceStart(getClass().getName(),95489);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp221oh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021oh21ohlusqkroj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021oh21ohlusqkroj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.SymbolTableDupTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95489,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp221oh() throws Exception{try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95489);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95490);int len = 3;
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95491);char[] chars = new char[len];
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95492);tryBit(chars, len);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95493);tryBit2(chars, len);
        // tryBit3(chars, len);
        // for (Map.Entry<Integer, List<String>> entry : dupList.entrySet()) {
        // System.out.println(entry.getKey() + " : " + entry.getValue());
        // }

    }finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void tryBit(char[] chars, int i) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95494);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95495);char startChar = 'A';
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95496);char endChar = 'z';

        __CLR4_1_1021oh21ohlusqkroj.R.inc(95497);for (char j = startChar; (((j <= endChar)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95498)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95499)==0&false)); j++) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95500);chars[i - 1] = j;

            __CLR4_1_1021oh21ohlusqkroj.R.inc(95501);if ((((i > 1)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95502)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95503)==0&false))) {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95504);tryBit(chars, i - 1);
            } }else {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95505);test(chars);
            }
        }}
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void tryBit2(char[] chars, int i) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95506);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95507);char startChar = 'A';
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95508);char endChar = 'z';

        __CLR4_1_1021oh21ohlusqkroj.R.inc(95509);for (char j = startChar; (((j <= endChar)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95510)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95511)==0&false)); j++) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95512);chars[i - 1] = j;

            __CLR4_1_1021oh21ohlusqkroj.R.inc(95513);if ((((i > 1)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95514)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95515)==0&false))) {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95516);tryBit2(chars, i - 1);
            } }else {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95517);test2(chars);
            }
        }}
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void tryBit3(char[] chars, int i) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95518);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95519);char startChar = 'A';
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95520);char endChar = 'z';

        __CLR4_1_1021oh21ohlusqkroj.R.inc(95521);for (char j = startChar; (((j <= endChar)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95522)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95523)==0&false)); j++) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95524);chars[i - 1] = j;

            __CLR4_1_1021oh21ohlusqkroj.R.inc(95525);if ((((i > 1)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95526)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95527)==0&false))) {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95528);tryBit3(chars, i - 1);
            } }else {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95529);test3(chars);
            }
        }}
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void test3(char[] chars) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95530);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95531);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95532);if ((((hash == VALUE)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95533)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95534)==0&false))) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95535);System.out.println(new String(chars));
        }
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void test2(char[] chars) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95536);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95537);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95538);if ((((dupHashCodes.contains(hash))&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95539)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95540)==0&false))) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95541);List<String> list = dupList.get(hash);
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95542);if ((((list == null)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95543)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95544)==0&false))) {{
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95545);list = new ArrayList<String>();
                __CLR4_1_1021oh21ohlusqkroj.R.inc(95546);dupList.put(hash, list);
            }
            }__CLR4_1_1021oh21ohlusqkroj.R.inc(95547);list.add(new String(chars));
        }
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

    private void test(char[] chars) {try{__CLR4_1_1021oh21ohlusqkroj.R.inc(95548);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95549);int hash = SymbolTable.hash(chars, 0, chars.length);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95550);Integer count = map.get(hash);
        __CLR4_1_1021oh21ohlusqkroj.R.inc(95551);if ((((count != null)&&(__CLR4_1_1021oh21ohlusqkroj.R.iget(95552)!=0|true))||(__CLR4_1_1021oh21ohlusqkroj.R.iget(95553)==0&false))) {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95554);dupHashCodes.add(hash);
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95555);map.put(hash, count.intValue() + 1);
        } }else {{
            __CLR4_1_1021oh21ohlusqkroj.R.inc(95556);map.put(hash, 1);
        }
    }}finally{__CLR4_1_1021oh21ohlusqkroj.R.flushNeeded();}}

}
