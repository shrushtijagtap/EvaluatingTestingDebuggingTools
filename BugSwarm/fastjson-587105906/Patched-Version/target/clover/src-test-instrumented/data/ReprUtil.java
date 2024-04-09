/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package data;

public class ReprUtil
{public static class __CLR4_5_229cq29cqlusvnlub{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105450,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	public static String repr(String s)
	{try{__CLR4_5_229cq29cqlusvnlub.R.inc(105434);
		__CLR4_5_229cq29cqlusvnlub.R.inc(105435);if ((((s == null)&&(__CLR4_5_229cq29cqlusvnlub.R.iget(105436)!=0|true))||(__CLR4_5_229cq29cqlusvnlub.R.iget(105437)==0&false))) {__CLR4_5_229cq29cqlusvnlub.R.inc(105438);return "null";
		}__CLR4_5_229cq29cqlusvnlub.R.inc(105439);return '"' + s + '"';
	}finally{__CLR4_5_229cq29cqlusvnlub.R.flushNeeded();}}

	public static String repr(Iterable<String> it)
	{try{__CLR4_5_229cq29cqlusvnlub.R.inc(105440);
		__CLR4_5_229cq29cqlusvnlub.R.inc(105441);StringBuilder buf = new StringBuilder();
		__CLR4_5_229cq29cqlusvnlub.R.inc(105442);buf.append('[');
		__CLR4_5_229cq29cqlusvnlub.R.inc(105443);String sep = "";
		__CLR4_5_229cq29cqlusvnlub.R.inc(105444);for (String s : it) {{
			__CLR4_5_229cq29cqlusvnlub.R.inc(105445);buf.append(sep); __CLR4_5_229cq29cqlusvnlub.R.inc(105446);sep = ", ";
			__CLR4_5_229cq29cqlusvnlub.R.inc(105447);buf.append(repr(s));
		}
		}__CLR4_5_229cq29cqlusvnlub.R.inc(105448);buf.append(']');
		__CLR4_5_229cq29cqlusvnlub.R.inc(105449);return buf.toString();
	}finally{__CLR4_5_229cq29cqlusvnlub.R.flushNeeded();}}
}
