/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.a;

import com.alibaba.fastjson.util.IOUtils;

public class WhiteSpaceTest {static class __CLR4_1_10235p235pluszwi50{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97427,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public static void main(String[] args) throws Exception {try{__CLR4_1_10235p235pluszwi50.R.inc(97405);
        __CLR4_1_10235p235pluszwi50.R.inc(97406);for (int i = 0; (((i < 3)&&(__CLR4_1_10235p235pluszwi50.R.iget(97407)!=0|true))||(__CLR4_1_10235p235pluszwi50.R.iget(97408)==0&false)); ++i) {{
            __CLR4_1_10235p235pluszwi50.R.inc(97409);perf();
        }
        //ch < IOUtils.whitespaceFlags.length && IOUtils.whitespaceFlags[ch]
    }}finally{__CLR4_1_10235p235pluszwi50.R.flushNeeded();}}

    protected static void perf() {try{__CLR4_1_10235p235pluszwi50.R.inc(97410);
        __CLR4_1_10235p235pluszwi50.R.inc(97411);int count = 0;

        __CLR4_1_10235p235pluszwi50.R.inc(97412);long startMillis = System.currentTimeMillis();
        __CLR4_1_10235p235pluszwi50.R.inc(97413);for (int i = 0; (((i < 1000 * 200)&&(__CLR4_1_10235p235pluszwi50.R.iget(97414)!=0|true))||(__CLR4_1_10235p235pluszwi50.R.iget(97415)==0&false)); ++i) {{
            __CLR4_1_10235p235pluszwi50.R.inc(97416);for (char ch = 0; (((ch < 10000)&&(__CLR4_1_10235p235pluszwi50.R.iget(97417)!=0|true))||(__CLR4_1_10235p235pluszwi50.R.iget(97418)==0&false)); ++ch) {{
                
//                boolean whitespace = c < 33 && (4294981376L & (1L << c)) != 0;
//                boolean whitespace = c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b';
                  __CLR4_1_10235p235pluszwi50.R.inc(97419);boolean whitespace = ch <= ' ' && (ch == ' ' || ch == '\r' || ch == '\n' || ch == '\t' || ch == '\f' || ch == '\b');
                __CLR4_1_10235p235pluszwi50.R.inc(97420);if ((((whitespace)&&(__CLR4_1_10235p235pluszwi50.R.iget(97421)!=0|true))||(__CLR4_1_10235p235pluszwi50.R.iget(97422)==0&false))) {{
                    __CLR4_1_10235p235pluszwi50.R.inc(97423);count++;
                }
//                if (ch < IOUtils.whitespaceFlags.length && IOUtils.whitespaceFlags[ch]) {
//                    count++;
//                }
//                if (c <= ' ' && (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b')) {
//                    count++;
//                }
            }}
        }}
        
        }__CLR4_1_10235p235pluszwi50.R.inc(97424);long endMillis = System.currentTimeMillis();
        __CLR4_1_10235p235pluszwi50.R.inc(97425);long millis = endMillis - startMillis;
        __CLR4_1_10235p235pluszwi50.R.inc(97426);System.out.println("millis : " + millis + ", count " + count);
    }finally{__CLR4_1_10235p235pluszwi50.R.flushNeeded();}}
}
