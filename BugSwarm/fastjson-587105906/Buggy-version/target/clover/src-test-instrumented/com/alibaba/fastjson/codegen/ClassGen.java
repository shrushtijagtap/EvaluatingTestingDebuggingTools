/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.codegen;

import java.io.IOException;
import java.lang.reflect.Type;

public abstract class ClassGen {public static class __CLR4_1_10urouroluszw45s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,39936,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected Class<?>   clazz;
    protected Type       type;
    protected Appendable out;

    private String       indent      = "\t";
    private int          indentCount = 0;

    public ClassGen(Class<?> clazz, Appendable out){
        this(clazz, null, out);__CLR4_1_10urouroluszw45s.R.inc(39877);try{__CLR4_1_10urouroluszw45s.R.inc(39876);
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    public ClassGen(Class<?> clazz, Type type, Appendable out){try{__CLR4_1_10urouroluszw45s.R.inc(39878);
        __CLR4_1_10urouroluszw45s.R.inc(39879);this.clazz = clazz;
        __CLR4_1_10urouroluszw45s.R.inc(39880);this.type = type;
        __CLR4_1_10urouroluszw45s.R.inc(39881);this.out = out;
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    public abstract void gen() throws IOException;

    protected void println() throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39882);
        __CLR4_1_10urouroluszw45s.R.inc(39883);out.append("\n");
        __CLR4_1_10urouroluszw45s.R.inc(39884);printIndent();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void println(String text) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39885);
        __CLR4_1_10urouroluszw45s.R.inc(39886);out.append(text);
        __CLR4_1_10urouroluszw45s.R.inc(39887);out.append("\n");
        __CLR4_1_10urouroluszw45s.R.inc(39888);printIndent();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void print(String text) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39889);
        __CLR4_1_10urouroluszw45s.R.inc(39890);out.append(text);
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void printPackage() throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39891);
        __CLR4_1_10urouroluszw45s.R.inc(39892);print("package ");
        __CLR4_1_10urouroluszw45s.R.inc(39893);print(clazz.getPackage().getName());
        __CLR4_1_10urouroluszw45s.R.inc(39894);println(";");
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void beginClass(String className) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39895);
        __CLR4_1_10urouroluszw45s.R.inc(39896);print("public class ");
        __CLR4_1_10urouroluszw45s.R.inc(39897);print(className);
        __CLR4_1_10urouroluszw45s.R.inc(39898);print(" implements ObjectDeserializer {");
        __CLR4_1_10urouroluszw45s.R.inc(39899);incrementIndent();
        __CLR4_1_10urouroluszw45s.R.inc(39900);println();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void endClass() throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39901);
        __CLR4_1_10urouroluszw45s.R.inc(39902);decrementIndent();
        __CLR4_1_10urouroluszw45s.R.inc(39903);println();
        __CLR4_1_10urouroluszw45s.R.inc(39904);print("}");
        __CLR4_1_10urouroluszw45s.R.inc(39905);println();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void genField(String name, Class<?> feildClass) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39906);
        __CLR4_1_10urouroluszw45s.R.inc(39907);if ((((feildClass == char[].class)&&(__CLR4_1_10urouroluszw45s.R.iget(39908)!=0|true))||(__CLR4_1_10urouroluszw45s.R.iget(39909)==0&false))) {{
            __CLR4_1_10urouroluszw45s.R.inc(39910);print("char[]");
        }

        }__CLR4_1_10urouroluszw45s.R.inc(39911);print(" ");
        __CLR4_1_10urouroluszw45s.R.inc(39912);print(name);
        __CLR4_1_10urouroluszw45s.R.inc(39913);println(";");
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void beginInit(String className) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39914);
        __CLR4_1_10urouroluszw45s.R.inc(39915);print("public ");
        __CLR4_1_10urouroluszw45s.R.inc(39916);print(className);
        __CLR4_1_10urouroluszw45s.R.inc(39917);println(" () {");
        __CLR4_1_10urouroluszw45s.R.inc(39918);incrementIndent();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    protected void endInit() throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39919);
        __CLR4_1_10urouroluszw45s.R.inc(39920);decrementIndent();
        __CLR4_1_10urouroluszw45s.R.inc(39921);print("}");
        __CLR4_1_10urouroluszw45s.R.inc(39922);println();
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}
    
    public void decrementIndent() {try{__CLR4_1_10urouroluszw45s.R.inc(39923);
        __CLR4_1_10urouroluszw45s.R.inc(39924);this.indentCount -= 1;
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    public void incrementIndent() {try{__CLR4_1_10urouroluszw45s.R.inc(39925);
        __CLR4_1_10urouroluszw45s.R.inc(39926);this.indentCount += 1;
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}

    public void printIndent() throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39927);
        __CLR4_1_10urouroluszw45s.R.inc(39928);for (int i = 0; (((i < this.indentCount)&&(__CLR4_1_10urouroluszw45s.R.iget(39929)!=0|true))||(__CLR4_1_10urouroluszw45s.R.iget(39930)==0&false)); ++i) {{
            __CLR4_1_10urouroluszw45s.R.inc(39931);print(this.indent);
        }
    }}finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}
    
    protected void printClassName(Class<?> clazz) throws IOException {try{__CLR4_1_10urouroluszw45s.R.inc(39932);
        __CLR4_1_10urouroluszw45s.R.inc(39933);String name = clazz.getName();
        __CLR4_1_10urouroluszw45s.R.inc(39934);name = name.replace('$', '.');
        __CLR4_1_10urouroluszw45s.R.inc(39935);print(name);
    }finally{__CLR4_1_10urouroluszw45s.R.flushNeeded();}}
}
