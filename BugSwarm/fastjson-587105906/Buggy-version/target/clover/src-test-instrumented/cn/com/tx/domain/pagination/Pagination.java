/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package cn.com.tx.domain.pagination;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pagination<T> implements Serializable {public static class __CLR4_1_10uhduhdluszw40s{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,39600,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/**
	 * 
	 */
	private static final long serialVersionUID = 5038839734218582220L;

	private int totalResult = 0;

	private int totalPage = 1;

	private int pageIndex = 1;

	private int maxLength = 5;

	private int fromIndex = 0;

	private int toIndex = 0;

	private List<T> list = new ArrayList<T>();
	
	public Pagination(){try{__CLR4_1_10uhduhdluszw40s.R.inc(39505);
		
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}
	
	

	public void setTotalResult(int totalResult) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39506);
		__CLR4_1_10uhduhdluszw40s.R.inc(39507);this.totalResult = totalResult;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public void setTotalPage(int totalPage) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39508);
		__CLR4_1_10uhduhdluszw40s.R.inc(39509);this.totalPage = totalPage;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public void setPageIndex(int pageIndex) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39510);
		__CLR4_1_10uhduhdluszw40s.R.inc(39511);this.pageIndex = pageIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public void setMaxLength(int maxLength) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39512);
		__CLR4_1_10uhduhdluszw40s.R.inc(39513);this.maxLength = maxLength;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public void setFromIndex(int fromIndex) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39514);
		__CLR4_1_10uhduhdluszw40s.R.inc(39515);this.fromIndex = fromIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public void setToIndex(int toIndex) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39516);
		__CLR4_1_10uhduhdluszw40s.R.inc(39517);this.toIndex = toIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}



	public int getFromIndex() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39518);
		__CLR4_1_10uhduhdluszw40s.R.inc(39519);return this.fromIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	public int getToIndex() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39520);
		__CLR4_1_10uhduhdluszw40s.R.inc(39521);return this.toIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	public int getNextPage() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39522);
		__CLR4_1_10uhduhdluszw40s.R.inc(39523);if ((((this.pageIndex < this.totalPage)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39524)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39525)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39526);return this.pageIndex + 1;
		} }else {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39527);return this.pageIndex;
		}
	}}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	public int getPrevPage() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39528);
		__CLR4_1_10uhduhdluszw40s.R.inc(39529);if ((((this.pageIndex > 1)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39530)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39531)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39532);return this.pageIndex - 1;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39533);return this.pageIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * @return the currentPage
	 */
	public int getPageIndex() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39534);
		__CLR4_1_10uhduhdluszw40s.R.inc(39535);return pageIndex;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * @return the list
	 */
	public List<T> getList() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39536);
		__CLR4_1_10uhduhdluszw40s.R.inc(39537);if ((((list == null)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39538)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39539)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39540);return new ArrayList<T>();
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39541);return new ArrayList<T>(list);
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * @return the totalPage
	 */
	public int getTotalPage() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39542);
		__CLR4_1_10uhduhdluszw40s.R.inc(39543);return totalPage;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * @return the totalRecord
	 */
	public int getTotalResult() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39544);
		__CLR4_1_10uhduhdluszw40s.R.inc(39545);return totalResult;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	public int getMaxLength() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39546);
		__CLR4_1_10uhduhdluszw40s.R.inc(39547);return maxLength;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * 
	 * @param totalResult
	 * @param pageIndex
	 * @param maxLength
	 */
	public Pagination(int totalResult, int pageIndex, int maxLength) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39548);
		__CLR4_1_10uhduhdluszw40s.R.inc(39549);if ((((maxLength > 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39550)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39551)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39552);this.maxLength = maxLength;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39553);if ((((totalResult > 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39554)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39555)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39556);this.totalResult = totalResult;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39557);if ((((pageIndex > 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39558)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39559)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39560);this.pageIndex = pageIndex;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39561);this.totalPage = this.totalResult / this.maxLength;
		__CLR4_1_10uhduhdluszw40s.R.inc(39562);if ((((this.totalResult % this.maxLength != 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39563)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39564)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39565);this.totalPage = this.totalPage + 1;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39566);if ((((this.totalPage == 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39567)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39568)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39569);this.totalPage = 1;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39570);if ((((this.pageIndex > this.totalPage)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39571)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39572)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39573);this.pageIndex = this.totalPage;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39574);if ((((this.pageIndex <= 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39575)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39576)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39577);this.pageIndex = 1;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39578);this.fromIndex = (this.pageIndex - 1) * maxLength;
		__CLR4_1_10uhduhdluszw40s.R.inc(39579);this.toIndex = this.fromIndex + maxLength;
		__CLR4_1_10uhduhdluszw40s.R.inc(39580);if ((((this.toIndex < 0)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39581)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39582)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39583);this.toIndex = fromIndex;
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39584);if ((((this.toIndex > this.totalResult)&&(__CLR4_1_10uhduhdluszw40s.R.iget(39585)!=0|true))||(__CLR4_1_10uhduhdluszw40s.R.iget(39586)==0&false))) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39587);this.toIndex = this.totalResult;
		}

	}}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/**
	 * @param datas
	 *            the datas to set
	 */
	public void setList(List<T> list) {try{__CLR4_1_10uhduhdluszw40s.R.inc(39588);
		__CLR4_1_10uhduhdluszw40s.R.inc(39589);this.list = list;
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {try{__CLR4_1_10uhduhdluszw40s.R.inc(39590);
		__CLR4_1_10uhduhdluszw40s.R.inc(39591);StringBuffer sb = new StringBuffer();
		__CLR4_1_10uhduhdluszw40s.R.inc(39592);sb.append("Pagination:\r\n");
		__CLR4_1_10uhduhdluszw40s.R.inc(39593);sb.append("\tpageIndex\t" + this.pageIndex + "\r\n");
		__CLR4_1_10uhduhdluszw40s.R.inc(39594);sb.append("\ttotalPage\t" + this.totalPage + "\r\n");
		__CLR4_1_10uhduhdluszw40s.R.inc(39595);sb.append("\tmaxLength\t" + this.maxLength + "\r\n");
		__CLR4_1_10uhduhdluszw40s.R.inc(39596);sb.append("\ttotalResult\t" + this.totalResult + "\r\n");
		__CLR4_1_10uhduhdluszw40s.R.inc(39597);for (T t : list) {{
			__CLR4_1_10uhduhdluszw40s.R.inc(39598);sb.append(t + "\r\n");
		}
		}__CLR4_1_10uhduhdluszw40s.R.inc(39599);return sb.toString();
	}finally{__CLR4_1_10uhduhdluszw40s.R.flushNeeded();}}
	
}
