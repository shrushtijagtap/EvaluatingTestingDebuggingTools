/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.asm;

/**
 * Created by wenshao on 05/08/2017.
 */
public class MethodCollector {public static class __CLR4_5_24sj4sjlusyjj3a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701984272L,8589935092L,6232,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private final int paramCount;

    private final int ignoreCount;

    private int currentParameter;

    private final StringBuilder result;

    protected boolean debugInfoPresent;

    protected MethodCollector(int ignoreCount, int paramCount) {try{__CLR4_5_24sj4sjlusyjj3a.R.inc(6211);
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6212);this.ignoreCount = ignoreCount;
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6213);this.paramCount = paramCount;
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6214);this.result = new StringBuilder();
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6215);this.currentParameter = 0;
        // if there are 0 parameters, there is no need for debug info
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6216);this.debugInfoPresent = paramCount == 0;
    }finally{__CLR4_5_24sj4sjlusyjj3a.R.flushNeeded();}}

    protected void visitLocalVariable(String name, int index) {try{__CLR4_5_24sj4sjlusyjj3a.R.inc(6217);
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6218);if ((((index >= ignoreCount && index < ignoreCount + paramCount)&&(__CLR4_5_24sj4sjlusyjj3a.R.iget(6219)!=0|true))||(__CLR4_5_24sj4sjlusyjj3a.R.iget(6220)==0&false))) {{
            __CLR4_5_24sj4sjlusyjj3a.R.inc(6221);if ((((!name.equals("arg" + currentParameter))&&(__CLR4_5_24sj4sjlusyjj3a.R.iget(6222)!=0|true))||(__CLR4_5_24sj4sjlusyjj3a.R.iget(6223)==0&false))) {{
                __CLR4_5_24sj4sjlusyjj3a.R.inc(6224);debugInfoPresent = true;
            }
            }__CLR4_5_24sj4sjlusyjj3a.R.inc(6225);result.append(',');
            __CLR4_5_24sj4sjlusyjj3a.R.inc(6226);result.append(name);
            __CLR4_5_24sj4sjlusyjj3a.R.inc(6227);currentParameter++;
        }
    }}finally{__CLR4_5_24sj4sjlusyjj3a.R.flushNeeded();}}

    protected String getResult() {try{__CLR4_5_24sj4sjlusyjj3a.R.inc(6228);
        __CLR4_5_24sj4sjlusyjj3a.R.inc(6229);return (((result.length() != 0 )&&(__CLR4_5_24sj4sjlusyjj3a.R.iget(6230)!=0|true))||(__CLR4_5_24sj4sjlusyjj3a.R.iget(6231)==0&false))? result.substring(1) : "";
    }finally{__CLR4_5_24sj4sjlusyjj3a.R.flushNeeded();}}
}