/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.benchmark;

import com.alibaba.fastjson.util.RyuDouble;
import com.alibaba.fastjson.util.RyuFloat;

public class RyuFloatBenchmark {public static class __CLR4_1_1023fa23faluszwi6s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,97773,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private final static int COUNT = 1000 * 1000 * 10;
    public static void main(String[] args) throws Exception {try{__CLR4_1_1023fa23faluszwi6s.R.inc(97750);
        __CLR4_1_1023fa23faluszwi6s.R.inc(97751);float v = 0.539005056644f; //new java.util.Random().nextDouble();


        __CLR4_1_1023fa23faluszwi6s.R.inc(97752);System.out.println(v);

//        for (int i = 0; i < 10; ++i) {
//            f0(v); // 741
//        }

//        System.out.println();
//
        __CLR4_1_1023fa23faluszwi6s.R.inc(97753);for (int i = 0; (((i < 10)&&(__CLR4_1_1023fa23faluszwi6s.R.iget(97754)!=0|true))||(__CLR4_1_1023fa23faluszwi6s.R.iget(97755)==0&false)); ++i) {{
            __CLR4_1_1023fa23faluszwi6s.R.inc(97756);f1(v); // 368
        }
    }}finally{__CLR4_1_1023fa23faluszwi6s.R.flushNeeded();}}

    public static void f0(float v) throws Exception {try{__CLR4_1_1023fa23faluszwi6s.R.inc(97757);
        __CLR4_1_1023fa23faluszwi6s.R.inc(97758);long start = System.currentTimeMillis();
        __CLR4_1_1023fa23faluszwi6s.R.inc(97759);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1023fa23faluszwi6s.R.iget(97760)!=0|true))||(__CLR4_1_1023fa23faluszwi6s.R.iget(97761)==0&false)); ++i) {{
            __CLR4_1_1023fa23faluszwi6s.R.inc(97762);Float.toString(v);
        }
        }__CLR4_1_1023fa23faluszwi6s.R.inc(97763);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023fa23faluszwi6s.R.inc(97764);System.out.println("jdk : " + millis);
    }finally{__CLR4_1_1023fa23faluszwi6s.R.flushNeeded();}}

    public static void f1(float v) throws Exception {try{__CLR4_1_1023fa23faluszwi6s.R.inc(97765);
        __CLR4_1_1023fa23faluszwi6s.R.inc(97766);long start = System.currentTimeMillis();
        __CLR4_1_1023fa23faluszwi6s.R.inc(97767);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1023fa23faluszwi6s.R.iget(97768)!=0|true))||(__CLR4_1_1023fa23faluszwi6s.R.iget(97769)==0&false)); ++i) {{
            __CLR4_1_1023fa23faluszwi6s.R.inc(97770);RyuFloat.toString(v);
        }
        }__CLR4_1_1023fa23faluszwi6s.R.inc(97771);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1023fa23faluszwi6s.R.inc(97772);System.out.println("ryu : " + millis);
    }finally{__CLR4_1_1023fa23faluszwi6s.R.flushNeeded();}}
}
