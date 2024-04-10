/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package cn.com.tx.domain.notifyDetail;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NotifyDetail implements Serializable {public static class __CLR4_1_10ug0ug0luszw3zv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,39505,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8760630447394929224L;

	private int detailId;

	private int hotId;

	private int templateId;

	private int srcId;

	private int destId;

	private boolean display;

	private Date foundTime;
	
	private List<String> args = new ArrayList<String>(); 
	

	public int getDetailId() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39456);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39457);return detailId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setDetailId(int detailId) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39458);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39459);this.detailId = detailId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public int getHotId() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39460);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39461);return hotId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setHotId(int hotId) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39462);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39463);this.hotId = hotId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public int getTemplateId() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39464);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39465);return templateId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public List<String> getArgs() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39466);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39467);return args;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setArgs(List<String> args) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39468);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39469);this.args = args;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setTemplateId(int templateId) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39470);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39471);this.templateId = templateId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public int getSrcId() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39472);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39473);return srcId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setSrcId(int srcId) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39474);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39475);this.srcId = srcId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public int getDestId() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39476);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39477);return destId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setDestId(int destId) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39478);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39479);this.destId = destId;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public boolean isDisplay() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39480);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39481);return display;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setDisplay(boolean display) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39482);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39483);this.display = display;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public Date getFoundTime() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39484);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39485);return foundTime;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	public void setFoundTime(Date foundTime) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39486);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39487);this.foundTime = foundTime;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39488);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39489);int hasCode = 0;
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39490);if ((((this.detailId != 0)&&(__CLR4_1_10ug0ug0luszw3zv.R.iget(39491)!=0|true))||(__CLR4_1_10ug0ug0luszw3zv.R.iget(39492)==0&false))) {{
			__CLR4_1_10ug0ug0luszw3zv.R.inc(39493);hasCode += this.detailId;
		}
		}__CLR4_1_10ug0ug0luszw3zv.R.inc(39494);return hasCode;
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {try{__CLR4_1_10ug0ug0luszw3zv.R.inc(39495);
		__CLR4_1_10ug0ug0luszw3zv.R.inc(39496);if ((((obj == null)&&(__CLR4_1_10ug0ug0luszw3zv.R.iget(39497)!=0|true))||(__CLR4_1_10ug0ug0luszw3zv.R.iget(39498)==0&false))) {{
			__CLR4_1_10ug0ug0luszw3zv.R.inc(39499);return false;
		}
		}__CLR4_1_10ug0ug0luszw3zv.R.inc(39500);if ((((!(obj instanceof NotifyDetail))&&(__CLR4_1_10ug0ug0luszw3zv.R.iget(39501)!=0|true))||(__CLR4_1_10ug0ug0luszw3zv.R.iget(39502)==0&false))) {{
			__CLR4_1_10ug0ug0luszw3zv.R.inc(39503);return false;
		}
		}__CLR4_1_10ug0ug0luszw3zv.R.inc(39504);return this.hashCode() == obj.hashCode();
	}finally{__CLR4_1_10ug0ug0luszw3zv.R.flushNeeded();}}
	
	
}
