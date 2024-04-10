/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.SymbolTable;

public class SymbolTableTest extends TestCase {static class __CLR4_1_1010p110p1luszw6fv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,47582,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected String[] symbols      = new String[] { "EffectedRowCount", "DataSource", "BatchSizeMax", "BatchSizeTotal", "ConcurrentMax", "ErrorCount",
            "ExecuteCount", "FetchRowCount", "File", "ID", "LastError", "LastTime", "MaxTimespan", "MaxTimespanOccurTime", "Name", "RunningCount", "SQL",
            "TotalTime"            };
    char[][]           symbols_char = new char[symbols.length][];
    final int          COUNT        = 1000 * 1000;

    protected void setUp() throws Exception {try{__CLR4_1_1010p110p1luszw6fv.R.inc(47557);
        __CLR4_1_1010p110p1luszw6fv.R.inc(47558);for (int i = 0; (((i < symbols.length)&&(__CLR4_1_1010p110p1luszw6fv.R.iget(47559)!=0|true))||(__CLR4_1_1010p110p1luszw6fv.R.iget(47560)==0&false)); ++i) {{
            __CLR4_1_1010p110p1luszw6fv.R.inc(47561);symbols_char[i] = symbols[i].toCharArray();
        }
    }}finally{__CLR4_1_1010p110p1luszw6fv.R.flushNeeded();}}

    public void test_symbol() throws Exception {__CLR4_1_1010p110p1luszw6fv.R.globalSliceStart(getClass().getName(),47562);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kj3edo10p6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1010p110p1luszw6fv.R.rethrow($CLV_t2$);}finally{__CLR4_1_1010p110p1luszw6fv.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.SymbolTableTest.test_symbol",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),47562,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kj3edo10p6() throws Exception{try{__CLR4_1_1010p110p1luszw6fv.R.inc(47562);

        __CLR4_1_1010p110p1luszw6fv.R.inc(47563);char[][] symbols_char = new char[symbols.length][];
        __CLR4_1_1010p110p1luszw6fv.R.inc(47564);for (int i = 0; (((i < symbols.length)&&(__CLR4_1_1010p110p1luszw6fv.R.iget(47565)!=0|true))||(__CLR4_1_1010p110p1luszw6fv.R.iget(47566)==0&false)); ++i) {{
            __CLR4_1_1010p110p1luszw6fv.R.inc(47567);symbols_char[i] = symbols[i].toCharArray();
        }



        }__CLR4_1_1010p110p1luszw6fv.R.inc(47568);SymbolTable table = new SymbolTable(512);
        __CLR4_1_1010p110p1luszw6fv.R.inc(47569);for (int i = 0; (((i < symbols.length)&&(__CLR4_1_1010p110p1luszw6fv.R.iget(47570)!=0|true))||(__CLR4_1_1010p110p1luszw6fv.R.iget(47571)==0&false)); ++i) {{
            __CLR4_1_1010p110p1luszw6fv.R.inc(47572);String symbol = symbols[i];
            __CLR4_1_1010p110p1luszw6fv.R.inc(47573);char[] charArray = symbol.toCharArray();
            __CLR4_1_1010p110p1luszw6fv.R.inc(47574);table.addSymbol(charArray, 0, charArray.length);
            //System.out.println((table.hash(symbol) & table.getIndexMask()) + "\t\t:" + symbol + "\t\t" + table.hash(symbol));
        }

        }__CLR4_1_1010p110p1luszw6fv.R.inc(47575);String symbol = "name";
        __CLR4_1_1010p110p1luszw6fv.R.inc(47576);table.addSymbol(symbol.toCharArray(), 0, symbol.length());
        __CLR4_1_1010p110p1luszw6fv.R.inc(47577);table.addSymbol(symbol.toCharArray(), 0, symbol.length());

        __CLR4_1_1010p110p1luszw6fv.R.inc(47578);Assert.assertTrue(symbol == table.addSymbol("name".toCharArray(), 0, 4));
        __CLR4_1_1010p110p1luszw6fv.R.inc(47579);Assert.assertTrue(symbol == table.addSymbol(" name".toCharArray(), 1, 4));
        __CLR4_1_1010p110p1luszw6fv.R.inc(47580);Assert.assertTrue(symbol == table.addSymbol(" name ".toCharArray(), 1, 4));
        __CLR4_1_1010p110p1luszw6fv.R.inc(47581);Assert.assertTrue(symbol != table.addSymbol(" namf ".toCharArray(), 1, 4));
    }finally{__CLR4_1_1010p110p1luszw6fv.R.flushNeeded();}}

}
