/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by wenshao on 06/12/2016.
 */
public class Issue912 extends TestCase {static class __CLR4_1_1017iz17izlusqk74n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,56464,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_1017iz17izlusqk74n.R.globalSliceStart(getClass().getName(),56411);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb17iz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1017iz17izlusqk74n.R.rethrow($CLV_t2$);}finally{__CLR4_1_1017iz17izlusqk74n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue912.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),56411,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb17iz() throws Exception{try{__CLR4_1_1017iz17izlusqk74n.R.inc(56411);
        __CLR4_1_1017iz17izlusqk74n.R.inc(56412);String allMethods = "{\"mList\":[{\"className\":\"com.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayInt\",\"parameterSize\":1,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[I\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"},{\"className\":\"com.qa.scftemplate.contract.ISCFServiceForDyjAction\",\"methodName\":\"getArrayPrimative\",\"parameterSize\":7,\"parameters\":[{\"clazz\":\"[I\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[F\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[S\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[D\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[J\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[B\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"},{\"clazz\":\"[C\",\"clsList\":null,\"isGenericity\":false,\"value\":\"\"}],\"returnType\":\"[Ljava.lang.String;\",\"url\":\"tcp://SCFServiceForDyj/SCFServiceForDyjActionService\"}]}";
        __CLR4_1_1017iz17izlusqk74n.R.inc(56413);JsonBean jsonBean = getJsonData(allMethods, JsonBean.class);

        __CLR4_1_1017iz17izlusqk74n.R.inc(56414);assertEquals(2, jsonBean.getmList().size());
        __CLR4_1_1017iz17izlusqk74n.R.inc(56415);SCFMethod m1 = jsonBean.getmList().get(0);
        __CLR4_1_1017iz17izlusqk74n.R.inc(56416);assertNotNull(m1);
    }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

    public static <T> T getJsonData(String json, Class<T> clazz) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56417);
        __CLR4_1_1017iz17izlusqk74n.R.inc(56418);T jd = (T) JSON.parseObject(json, clazz,
                Feature.IgnoreNotMatch,
                Feature.AutoCloseSource
        );
        __CLR4_1_1017iz17izlusqk74n.R.inc(56419);return jd;
    }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

    public static class JsonBean {
        private List<SCFMethod> mList;

        public List<SCFMethod> getmList() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56420);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56421);return mList;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setmList(List<SCFMethod> mList) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56422);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56423);this.mList = mList;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}
    }

    public static class SCFMethod {
        public String className;
        public String url;
        public String methodName;
        public int parameterSize;
        public List<SCFMethodParameter> parameters = new LinkedList<SCFMethodParameter>();
        public Class<?> returnType;

        public String getUrl() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56424);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56425);return url;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setUrl(String url) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56426);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56427);this.url = url;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public String getClassName() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56428);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56429);return className;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setClassName(String className) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56430);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56431);this.className = className;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public Class<?> getReturnType() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56432);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56433);return returnType;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setReturnType(Class<?> returnType) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56434);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56435);this.returnType = returnType;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public String getMethodName() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56436);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56437);return methodName;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setMethodName(String methodName) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56438);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56439);this.methodName = methodName;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public int getParameterSize() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56440);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56441);return parameterSize;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setParameterSize(int parameterSize) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56442);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56443);this.parameterSize = parameterSize;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public List<SCFMethodParameter> getParameters() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56444);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56445);return parameters;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setParameters(List<SCFMethodParameter> parameters) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56446);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56447);this.parameters = parameters;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}
    }

    public static class SCFMethodParameter implements Cloneable {
        public Class<?> clazz;
        public Object value;
        public boolean isGenericity = false;
        public List<Class<?>> clsList;

        public boolean getIsGenericity() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56448);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56449);return isGenericity;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setIsGenericity(boolean isGenericity) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56450);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56451);this.isGenericity = isGenericity;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public Object getValue() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56452);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56453);return value;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56454);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56455);this.value = value;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public Class<?> getClazz() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56456);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56457);return clazz;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setClazz(Class<?> clazz) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56458);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56459);this.clazz = clazz;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public List<Class<?>> getClsList() {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56460);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56461);return clsList;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}

        public void setClsList(List<Class<?>> clsList) {try{__CLR4_1_1017iz17izlusqk74n.R.inc(56462);
            __CLR4_1_1017iz17izlusqk74n.R.inc(56463);this.clsList = clsList;
        }finally{__CLR4_1_1017iz17izlusqk74n.R.flushNeeded();}}
    }
}
