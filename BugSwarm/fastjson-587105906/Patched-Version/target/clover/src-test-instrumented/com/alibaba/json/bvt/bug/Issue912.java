/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wenshao on 06/12/2016.
 */
public class Issue912 extends TestCase {static class __CLR4_5_218gw18gwlusvn8n8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,57685,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_218gw18gwlusvn8n8.R.globalSliceStart(getClass().getName(),57632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb18gw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218gw18gwlusvn8n8.R.rethrow($CLV_t2$);}finally{__CLR4_5_218gw18gwlusvn8n8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue912.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57632,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb18gw() throws Exception{try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57632);
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57633);String allMethods = "{\"mList\":[{\"className\":\"com.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayInt\",\"parameterSize\":1,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[I\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"},{\"className\":\"com.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayPrimative\",\"parameterSize\":7,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[F\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[S\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[D\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[J\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[B\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[C\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[Ljava.lang.String;\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"}]}";
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57634);JsonBean jsonBean = getJsonData(allMethods, JsonBean.class);

        __CLR4_5_218gw18gwlusvn8n8.R.inc(57635);assertEquals(2, jsonBean.getmList().size());
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57636);SCFMethod m1 = jsonBean.getmList().get(0);
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57637);assertNotNull(m1);
    }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

    public static <T> T getJsonData(String json, Class<T> clazz) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57638);
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57639);T jd = (T) JSON.parseObject(json, clazz,
                Feature.IgnoreNotMatch,
                Feature.AutoCloseSource
        );
        __CLR4_5_218gw18gwlusvn8n8.R.inc(57640);return jd;
    }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

    public static class JsonBean {
        private List<SCFMethod> mList;

        public List<SCFMethod> getmList() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57641);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57642);return mList;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setmList(List<SCFMethod> mList) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57643);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57644);this.mList = mList;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}
    }

    public static class SCFMethod {
        public String className;
        public String url;
        public String methodName;
        public int parameterSize;
        public List<SCFMethodParameter> parameters = new LinkedList<SCFMethodParameter>();
        public Class<?> returnType;

        public String getUrl() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57645);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57646);return url;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57647);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57648);this.url = url;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public String getClassName() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57649);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57650);return className;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setClassName(String className) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57651);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57652);this.className = className;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public Class<?> getReturnType() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57653);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57654);return returnType;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setReturnType(Class<?> returnType) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57655);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57656);this.returnType = returnType;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public String getMethodName() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57657);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57658);return methodName;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setMethodName(String methodName) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57659);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57660);this.methodName = methodName;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public int getParameterSize() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57661);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57662);return parameterSize;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setParameterSize(int parameterSize) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57663);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57664);this.parameterSize = parameterSize;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public List<SCFMethodParameter> getParameters() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57665);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57666);return parameters;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setParameters(List<SCFMethodParameter> parameters) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57667);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57668);this.parameters = parameters;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}
    }

    public static class SCFMethodParameter implements Cloneable {
        public Class<?> clazz;
        public Object value;
        public boolean isGenericity = false;
        public List<Class<?>> clsList;

        public boolean getIsGenericity() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57669);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57670);return isGenericity;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setIsGenericity(boolean isGenericity) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57671);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57672);this.isGenericity = isGenericity;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public Object getValue() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57673);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57674);return value;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57675);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57676);this.value = value;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public Class<?> getClazz() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57677);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57678);return clazz;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setClazz(Class<?> clazz) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57679);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57680);this.clazz = clazz;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public List<Class<?>> getClsList() {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57681);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57682);return clsList;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}

        public void setClsList(List<Class<?>> clsList) {try{__CLR4_5_218gw18gwlusvn8n8.R.inc(57683);
            __CLR4_5_218gw18gwlusvn8n8.R.inc(57684);this.clsList = clsList;
        }finally{__CLR4_5_218gw18gwlusvn8n8.R.flushNeeded();}}
    }
}
