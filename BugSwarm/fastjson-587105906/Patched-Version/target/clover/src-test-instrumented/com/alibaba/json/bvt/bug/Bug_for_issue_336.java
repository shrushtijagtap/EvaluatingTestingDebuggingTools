/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.Date;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_issue_336 extends TestCase {static class __CLR4_5_2159p159plusvn6ds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,53509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_2159p159plusvn6ds.R.globalSliceStart(getClass().getName(),53485);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb159p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2159p159plusvn6ds.R.rethrow($CLV_t2$);}finally{__CLR4_5_2159p159plusvn6ds.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_issue_336.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53485,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb159p() throws Exception{try{__CLR4_5_2159p159plusvn6ds.R.inc(53485);
        __CLR4_5_2159p159plusvn6ds.R.inc(53486);RemoteInvocation remoteInvocation = new RemoteInvocation();
        __CLR4_5_2159p159plusvn6ds.R.inc(53487);remoteInvocation.setMethodName("test");
        __CLR4_5_2159p159plusvn6ds.R.inc(53488);remoteInvocation.setParameterTypes(new Class[] { int.class, Date.class, String.class });
        __CLR4_5_2159p159plusvn6ds.R.inc(53489);remoteInvocation.setArguments(new Object[] { 1, new Date(1460538273131L), "this is a test" });
        __CLR4_5_2159p159plusvn6ds.R.inc(53490);String json = JSON.toJSONString(remoteInvocation);
        
        __CLR4_5_2159p159plusvn6ds.R.inc(53491);Assert.assertEquals("{\"arguments\":[1,1460538273131,\"this is a test\"],\"methodName\":\"test\",\"parameterTypes\":[\"int\",\"java.util.Date\",\"java.lang.String\"]}", json);
        
        __CLR4_5_2159p159plusvn6ds.R.inc(53492);remoteInvocation = JSON.parseObject(json, RemoteInvocation.class);
        
        __CLR4_5_2159p159plusvn6ds.R.inc(53493);Assert.assertEquals(3, remoteInvocation.parameterTypes.length);
        __CLR4_5_2159p159plusvn6ds.R.inc(53494);Assert.assertEquals(int.class, remoteInvocation.parameterTypes[0]);
        __CLR4_5_2159p159plusvn6ds.R.inc(53495);Assert.assertEquals(Date.class, remoteInvocation.parameterTypes[1]);
        __CLR4_5_2159p159plusvn6ds.R.inc(53496);Assert.assertEquals(String.class, remoteInvocation.parameterTypes[2]);
        

    }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

    public static class RemoteInvocation {

        private String     methodName;
        private Class<?>[] parameterTypes;
        private Object[]   arguments;

        public String getMethodName() {try{__CLR4_5_2159p159plusvn6ds.R.inc(53497);
            __CLR4_5_2159p159plusvn6ds.R.inc(53498);return methodName;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

        public void setMethodName(String methodName) {try{__CLR4_5_2159p159plusvn6ds.R.inc(53499);
            __CLR4_5_2159p159plusvn6ds.R.inc(53500);this.methodName = methodName;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

        public Class<?>[] getParameterTypes() {try{__CLR4_5_2159p159plusvn6ds.R.inc(53501);
            __CLR4_5_2159p159plusvn6ds.R.inc(53502);return parameterTypes;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

        public void setParameterTypes(Class<?>[] parameterTypes) {try{__CLR4_5_2159p159plusvn6ds.R.inc(53503);
            __CLR4_5_2159p159plusvn6ds.R.inc(53504);this.parameterTypes = parameterTypes;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

        public Object[] getArguments() {try{__CLR4_5_2159p159plusvn6ds.R.inc(53505);
            __CLR4_5_2159p159plusvn6ds.R.inc(53506);return arguments;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

        public void setArguments(Object[] arguments) {try{__CLR4_5_2159p159plusvn6ds.R.inc(53507);
            __CLR4_5_2159p159plusvn6ds.R.inc(53508);this.arguments = arguments;
        }finally{__CLR4_5_2159p159plusvn6ds.R.flushNeeded();}}

    }
}
