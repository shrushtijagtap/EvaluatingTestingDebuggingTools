/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import junit.framework.TestCase;

public class RefTest10 extends TestCase {static class __CLR4_1_101qzg1qzgluszwepz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bug_for_wanglin() throws Exception {__CLR4_1_101qzg1qzgluszwepz.R.globalSliceStart(getClass().getName(),81628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z2tf951qzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qzg1qzgluszwepz.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qzg1qzgluszwepz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest10.test_bug_for_wanglin",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z2tf951qzg() throws Exception{try{__CLR4_1_101qzg1qzgluszwepz.R.inc(81628);
        __CLR4_1_101qzg1qzgluszwepz.R.inc(81629);String text = "{ \"schedulerCluster\": \"xyQuestionImport\", \"log\": { \"abilityServiceId\": \"-1\", \"abilityServiceVersionId\": \"-1\", \"createTime\": 1456832040060, \"ip\": \"192.168.1.71\", \"jobDataMap\": { \"com.fjhb.context.v1.Context\": { \"domain\": \"dev.medical.com\", \"gUID\": \"25c5e12ec19946e8a6850237cd8182de\", \"ip\": \"127.0.0.1\", \"organizationId\": \"-1\", \"platformId\": \"2c9180e5520a5e70015214fb2849000a\", \"platformVersionId\": \"2c9180e5520a6063015214fc062d0006\", \"projectId\": \"2c9180e5520a60630152150b0b4a000e\", \"recordChain\": true, \"requestUrl\": \"http://dev.medical.com:9009/gateway/web/admin/questionIE/questionImport\", \"subProjectId\": \"2c9180e5520a606301521596e7070018\", \"test\": false, \"unitId\": \"2c9180e54e7580cd014e801793720010\", \"userId\": \"4028823c4e850e60014e853115dc00sa\" }, \"questionImportDto\": { \"filePath\": \"/work/A4Mode2.xls\", \"organizationId\": \"-1\", \"platformId\": \"2c9180e5520a5e70015214fb2849000a\", \"platformVersionId\": \"2c9180e5520a6063015214fc062d0006\", \"projectId\": \"2c9180e5520a60630152150b0b4a000e\", \"subProjectId\": \"2c9180e5520a606301521596e7070018\", \"unitId\": \"-1\" }, \"questionExcelModeType\": 2, \"user.job.current.execute.key\": \"402881c75331cc62015331e732ce0002\" }, \"jobGroup\": \"xyQuestionImport\", \"jobName\": \"questionImport\", \"key\": \"402881c75331cc62015331e732ce0002\", \"organizationId\": \"-1\", \"platformId\": \"-1\", \"platformVersionId\": \"-1\", \"projectId\": \"-1\", \"remark\": \"\\\"xyQuestionImport\\\"\u96c6\u7fa4\u4e2d\u540d\u4e3a:\\\"402881c75331cc62015331ccecbc0000\\\"\u7684\u8c03\u5ea6\u5668\u5f00\u59cb\u8fd0\u884c\u6b64\u4efb\u52a1\", \"status\": \"toExecuted\", \"subProjectId\": \"-1\", \"unitId\": \"-1\", \"userId\": \"4028823c4e850e60014e853115dc00sa\" }, \"context\": { \"$ref\": \"$.log.jobDataMap.com.fjhb.context.v1.Context\" }, \"schedulerName\": \"402881c75331cc62015331ccecbc0000\" }";__CLR4_1_101qzg1qzgluszwepz.R.inc(81630);;
        __CLR4_1_101qzg1qzgluszwepz.R.inc(81631);JSONObject jsonObj = JSON.parseObject(text);
        
        __CLR4_1_101qzg1qzgluszwepz.R.inc(81632);Assert.assertSame(jsonObj.getJSONObject("log").getJSONObject("jobDataMap").get("com.fjhb.context.v1.Context"), jsonObj.get("context"));
    }finally{__CLR4_1_101qzg1qzgluszwepz.R.flushNeeded();}}

    public static class VO {

        private A      a;
        private Set<A> values = new HashSet<A>();

        public A getA() {try{__CLR4_1_101qzg1qzgluszwepz.R.inc(81633);
            __CLR4_1_101qzg1qzgluszwepz.R.inc(81634);return a;
        }finally{__CLR4_1_101qzg1qzgluszwepz.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101qzg1qzgluszwepz.R.inc(81635);
            __CLR4_1_101qzg1qzgluszwepz.R.inc(81636);this.a = a;
        }finally{__CLR4_1_101qzg1qzgluszwepz.R.flushNeeded();}}

        public Set<A> getValues() {try{__CLR4_1_101qzg1qzgluszwepz.R.inc(81637);
            __CLR4_1_101qzg1qzgluszwepz.R.inc(81638);return values;
        }finally{__CLR4_1_101qzg1qzgluszwepz.R.flushNeeded();}}

        public void setValues(Set<A> values) {try{__CLR4_1_101qzg1qzgluszwepz.R.inc(81639);
            __CLR4_1_101qzg1qzgluszwepz.R.inc(81640);this.values = values;
        }finally{__CLR4_1_101qzg1qzgluszwepz.R.flushNeeded();}}

    }

    public static class A {

    }
}
