/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1400;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import junit.framework.TestCase;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kimmking on 11/08/2017.
 */
public class Issue1400 extends TestCase {static class __CLR4_1_101b9w1b9wluszwaq2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,61280,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101b9w1b9wluszwaq2.R.globalSliceStart(getClass().getName(),61268);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1b9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101b9w1b9wluszwaq2.R.rethrow($CLV_t2$);}finally{__CLR4_1_101b9w1b9wluszwaq2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1400.Issue1400.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),61268,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1b9w() throws Exception{try{__CLR4_1_101b9w1b9wluszwaq2.R.inc(61268);
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61269);TypeReference tr = new TypeReference<Resource<ArrayList<App>>>(){};
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61270);Test test = new Test(tr);
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61271);Resource resource = test.resource;
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61272);Assert.assertEquals(1,resource.ret);
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61273);Assert.assertEquals("ok",resource.message);
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61274);List<App> data =(List<App>) resource.data;
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61275);Assert.assertEquals(2,data.size());
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61276);App app1 = data.get(0);
        __CLR4_1_101b9w1b9wluszwaq2.R.inc(61277);Assert.assertEquals("11c53f541dee4f5bbc4f75f99002278c",app1.appId);
    }finally{__CLR4_1_101b9w1b9wluszwaq2.R.flushNeeded();}}

    public static class Resource<T> {
        public int ret;
        public String message;
        public T data;
    }

    public static class App {
        public String appId;
    }

    public static class Test {
        String str = "{\"ret\":1,\"message\":\"ok\",\"data\":[{\"appId\":\"11c53f541dee4f5bbc4f75f99002278c\"},{\"appId\":\"c6102275ce5540a59424defa1cccb8ed\"}]}";
        public Resource resource;
        Test(TypeReference tr) {try{__CLR4_1_101b9w1b9wluszwaq2.R.inc(61278);
            __CLR4_1_101b9w1b9wluszwaq2.R.inc(61279);resource = (Resource)JSON.parseObject(str, tr);
        }finally{__CLR4_1_101b9w1b9wluszwaq2.R.flushNeeded();}}
    }
}
