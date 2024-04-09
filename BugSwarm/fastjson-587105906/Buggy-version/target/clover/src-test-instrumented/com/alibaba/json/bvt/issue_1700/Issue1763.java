/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1700;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

public class Issue1763 extends TestCase {static class __CLR4_1_101cd31cd3lusqkaii{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,62699,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101cd31cd3lusqkaii.R.globalSliceStart(getClass().getName(),62679);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1cd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101cd31cd3lusqkaii.R.rethrow($CLV_t2$);}finally{__CLR4_1_101cd31cd3lusqkaii.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1763.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),62679,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1cd3() throws Exception{try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62679);
        __CLR4_1_101cd31cd3lusqkaii.R.inc(62680);String s = "{\"result\":{\"modelList\":[{\"sourceId\":\"81900002\"},{\"sourceId\":\"81900002\"},{\"sourceId\":\"81892012\"},{\"sourceId\":\"2062014\"},{\"sourceId\":\"2082007\"},{\"sourceId\":\"2082007\"},{\"sourceId\":\"2082007\"}]}}";


        __CLR4_1_101cd31cd3lusqkaii.R.inc(62681);Method method = ProcurementOrderInteractiveServiceForCloud.class.getMethod("queryOrderMateriel", Map.class);
        __CLR4_1_101cd31cd3lusqkaii.R.inc(62682);Type type = method.getGenericReturnType();

        __CLR4_1_101cd31cd3lusqkaii.R.inc(62683);BaseResult<InteractiveOrderMaterielQueryResult> baseResult = JSON.parseObject(s, type);
        __CLR4_1_101cd31cd3lusqkaii.R.inc(62684);InteractiveOrderMaterielQueryResult result = baseResult.getResult();

        __CLR4_1_101cd31cd3lusqkaii.R.inc(62685);assertEquals(7, result.getModelList().size());
        __CLR4_1_101cd31cd3lusqkaii.R.inc(62686);assertEquals(InteractiveOrderMaterielModel.class, result.getModelList().get(0).getClass());
    }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}

    public static class BaseResult<T> {
        private T result;

        public T getResult() {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62687);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62688);return result;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}

        public void setResult(T result) {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62689);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62690);this.result = result;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}
    }

    public static class BasePageQueryResult<T> extends BaseResult<T>{
        private List<T> modelList;

        public List<T> getModelList() {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62691);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62692);return modelList;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}

        public void setModelList(List<T> modelList) {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62693);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62694);this.modelList = modelList;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}
    }

    public static class InteractiveOrderMaterielModel {
        private String sourceId;

        public String getSourceId() {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62695);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62696);return sourceId;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}

        public void setSourceId(String sourceId) {try{__CLR4_1_101cd31cd3lusqkaii.R.inc(62697);
            __CLR4_1_101cd31cd3lusqkaii.R.inc(62698);this.sourceId = sourceId;
        }finally{__CLR4_1_101cd31cd3lusqkaii.R.flushNeeded();}}
    }

    public static class InteractiveOrderMaterielQueryResult<T extends InteractiveOrderMaterielModel> extends BasePageQueryResult<T> {

    }

    public interface ProcurementOrderInteractiveServiceForCloud {

        BaseResult<InteractiveOrderMaterielQueryResult> queryOrderMateriel(Map param);

    }

}
