/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerialContext;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PropertyPathTest3 extends TestCase {static class __CLR4_1_101wiw1wiwluszwfm2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88885,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	/** \u6d4b\u8bd5\u53ea\u8f93\u51fa\u5b50\u96c6\u5408\u4e2d\u7684\u7279\u5b9a\u5c5e\u6027 */
	public void test_path() throws Exception {__CLR4_1_101wiw1wiwluszwfm2.R.globalSliceStart(getClass().getName(),88808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151wiw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wiw1wiwluszwfm2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wiw1wiwluszwfm2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest3.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151wiw() throws Exception{try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88808);
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88809);Person p1 = new Person();
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88810);p1.setId(100);

		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88811);Person c1 = new Person();
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88812);c1.setId(1000);

		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88813);Person c2 = new Person();
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88814);c2.setId(2000);

		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88815);p1.getChildren().add(c1);
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88816);p1.getChildren().add(c2);
		//\u53ea\u8f93\u51fachildren.id\u4ee5\u53ca\u6839\u4e0a\u7684id
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88817);String s = JSON.toJSONString(p1, new MyPropertyPreFilter(new String[] {"children.id", "id"}));

		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88818);Assert.assertEquals("{\"children\":[{\"id\":1000},{\"id\":2000}],\"id\":100}", s);
	}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

	/** \u6d4b\u8bd5\u53ea\u8f93\u51fa\u5b50\u5b57\u6bb5map\u4e2d\u7684\u7279\u5b9a\u5c5e\u6027 */
	public void test_path2() throws Exception {__CLR4_1_101wiw1wiwluszwfm2.R.globalSliceStart(getClass().getName(),88819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fycd151wj7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wiw1wiwluszwfm2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wiw1wiwluszwfm2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest3.test_path2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88819,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fycd151wj7() throws Exception{try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88819);
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88820);Person2 p1 = new Person2();
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88821);p1.setId(1);
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88822);Map<String, String> infoMap = new HashMap<String, String>();
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88823);infoMap.put("name", "\u674e\u4e09");
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88824);infoMap.put("height", "168");
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88825);p1.setInfoMap(infoMap);
		//\u53ea\u8f93\u51fainfoMap.name
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88826);String s = JSON.toJSONString(p1, new MyPropertyPreFilter(new String[] {"infoMap.name"}));
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88827);Assert.assertEquals("{\"infoMap\":{\"name\":\"\u674e\u4e09\"}}", s);
	}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

	public static class MyPropertyPreFilter implements PropertyPreFilter {
		String[] onlyProperties;

		public MyPropertyPreFilter(String[] onlyProperties) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88828);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88829);this.onlyProperties = onlyProperties;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		private static boolean containInclude(String[] ss, String s) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88830);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88831);if((((ss == null || ss.length == 0 || s == null)&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88832)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88833)==0&false)))
				{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88834);return false;
			}__CLR4_1_101wiw1wiwluszwfm2.R.inc(88835);for(String st : ss)
				{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88836);if((((st.startsWith(s))&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88837)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88838)==0&false)))
					{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88839);return true;
			}}__CLR4_1_101wiw1wiwluszwfm2.R.inc(88840);return false;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88841);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88842);SerialContext nowContext = new SerialContext(serializer.getContext(), source, name, 0, 0);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88843);String nowPath = getLinkedPath(nowContext);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88844);System.out.println("path->" + nowPath);
			//\u53ea\u8f93\u51fachildren.id
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88845);return containInclude(onlyProperties, nowPath);
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

	}

	/** \u8f93\u51fa\u7ed3\u679c \u7c7b\u4f3ca.b.c.d\u7b49\u683c\u5f0f\uff0c\u5ffd\u7565[] */
	private static String getLinkedPath(SerialContext serialContext) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88846);
		//\u8fd9\u91cc\u6709\u70b9bad smell\uff0c\u5373\u8981\u8003\u8651parent\u4e3anull,\u53c8\u8981\u8003\u8651fieldName\u4e3anull\uff0c\u4e14\u5bf9collection\u5224\u65ad\u53ea\u80fd\u4ecefieldName\uff0c\u800c\u4e0d\u80fd\u4eceobject\u5165\u624b
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88847);boolean isCollection = serialContext.fieldName instanceof Integer;
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88848);boolean isFieldNameNull = serialContext.fieldName == null;
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88849);if((((serialContext.parent == null)&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88850)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88851)==0&false)))
			{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88852);return (((isCollection )&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88853)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88854)==0&false))? "" : (((isFieldNameNull )&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88855)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88856)==0&false))? "" : String.valueOf(serialContext.fieldName);
		}__CLR4_1_101wiw1wiwluszwfm2.R.inc(88857);String parentLinkedPath = getLinkedPath(serialContext.parent);
		__CLR4_1_101wiw1wiwluszwfm2.R.inc(88858);if((((isCollection || isFieldNameNull)&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88859)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88860)==0&false)))
			{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88861);return parentLinkedPath;
		}__CLR4_1_101wiw1wiwluszwfm2.R.inc(88862);return
			(((parentLinkedPath.length() == 0 )&&(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88863)!=0|true))||(__CLR4_1_101wiw1wiwluszwfm2.R.iget(88864)==0&false))? String.valueOf(serialContext.fieldName) :
				parentLinkedPath + "." + serialContext.fieldName;
	}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

	public static class Person {

		private int id;
		private int id2;

		private List<Person> children = new ArrayList<Person>();

		public int getId2() {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88865);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88866);return id2;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public void setId2(int id2) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88867);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88868);this.id2 = id2;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public int getId() {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88869);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88870);return id;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88871);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88872);this.id = id;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public List<Person> getChildren() {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88873);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88874);return children;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public void setChildren(List<Person> children) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88875);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88876);this.children = children;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

	}

	public static class Person2 {
		private int id;
		private Map<String, String> infoMap;

		public int getId() {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88877);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88878);return id;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public void setId(int id) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88879);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88880);this.id = id;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public Map<String, String> getInfoMap() {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88881);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88882);return infoMap;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}

		public void setInfoMap(Map<String, String> infoMap) {try{__CLR4_1_101wiw1wiwluszwfm2.R.inc(88883);
			__CLR4_1_101wiw1wiwluszwfm2.R.inc(88884);this.infoMap = infoMap;
		}finally{__CLR4_1_101wiw1wiwluszwfm2.R.flushNeeded();}}
	}
}
