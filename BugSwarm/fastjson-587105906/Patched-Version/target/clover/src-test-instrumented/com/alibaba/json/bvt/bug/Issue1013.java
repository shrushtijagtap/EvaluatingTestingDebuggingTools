/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuwen on 2017/2/16.
 */
public class Issue1013 extends TestCase {static class __CLR4_5_217d717d7lusvn7of{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56245,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17d7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17d7() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56203);
        __CLR4_5_217d717d7lusvn7of.R.inc(56204);TestDomain domain = new TestDomain();

        __CLR4_5_217d717d7lusvn7of.R.inc(56205);String json = JSON.toJSONString(domain);

        __CLR4_5_217d717d7lusvn7of.R.inc(56206);TestDomain domain1 = JSON.parseObject(json, TestDomain.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56207);assertEquals(domain.getList(), domain1.getList());
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56208);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn517dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56208,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn517dc() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56208);

        __CLR4_5_217d717d7lusvn7of.R.inc(56209);TestDomain domain1 = JSON.parseObject("{\"list\":[]}", TestDomain.class);
        __CLR4_5_217d717d7lusvn7of.R.inc(56210);TestDomain domain2 = JSON.parseObject("{\"list\":[1, 2]}", TestDomain.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56211);assertEquals(0, domain1.getList().size());
        __CLR4_5_217d717d7lusvn7of.R.inc(56212);assertEquals(Arrays.asList(1, 2), domain2.getList());
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56213);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo17dh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56213,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo17dh() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56213);

        __CLR4_5_217d717d7lusvn7of.R.inc(56214);TestDomain domain1 = JSON.parseObject("{\"list\":null}", TestDomain.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56215);assertEquals(1, domain1.getList().size());
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue3() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v68xlw17dk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56216,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v68xlw17dk() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56216);
        __CLR4_5_217d717d7lusvn7of.R.inc(56217);TestDomain2 domain = new TestDomain2();

        __CLR4_5_217d717d7lusvn7of.R.inc(56218);String json = JSON.toJSONString(domain);

        __CLR4_5_217d717d7lusvn7of.R.inc(56219);TestDomain2 domain1 = JSON.parseObject(json, TestDomain2.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56220);assertEquals(domain.list, domain1.list);
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue_4() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqsx9q17dp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqsx9q17dp() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56221);

        __CLR4_5_217d717d7lusvn7of.R.inc(56222);TestDomain2 domain1 = JSON.parseObject("{\"list\":[1, 2]}", TestDomain2.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56223);assertEquals(Arrays.asList(1, 2), domain1.list);
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue_5() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56224);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hhsyh917ds();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56224,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hhsyh917ds() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56224);

        __CLR4_5_217d717d7lusvn7of.R.inc(56225);TestDomain2 domain1 = JSON.parseObject("{\"list\":null}", TestDomain2.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56226);assertNull(domain1.list);
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    public void test_for_issue_6() throws Exception {__CLR4_5_217d717d7lusvn7of.R.globalSliceStart(getClass().getName(),56227);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e8szos17dv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217d717d7lusvn7of.R.rethrow($CLV_t2$);}finally{__CLR4_5_217d717d7lusvn7of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56227,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e8szos17dv() throws Exception{try{__CLR4_5_217d717d7lusvn7of.R.inc(56227);

        __CLR4_5_217d717d7lusvn7of.R.inc(56228);TestDomain3 domain3 = JSON.parseObject("{\"list\":null}", TestDomain3.class);

        __CLR4_5_217d717d7lusvn7of.R.inc(56229);assertNull(domain3.list);
    }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

    static class TestDomain {
        private List<Integer> list;

        public TestDomain(){try{__CLR4_5_217d717d7lusvn7of.R.inc(56230);
            __CLR4_5_217d717d7lusvn7of.R.inc(56231);list = new ArrayList<Integer>();
            __CLR4_5_217d717d7lusvn7of.R.inc(56232);list.add(1);
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

        public List<Integer> getList(){try{__CLR4_5_217d717d7lusvn7of.R.inc(56233);
            __CLR4_5_217d717d7lusvn7of.R.inc(56234);return list;
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}
    }

    static class TestDomain2 {
        public List<Integer> list;

        public TestDomain2(){try{__CLR4_5_217d717d7lusvn7of.R.inc(56235);
            __CLR4_5_217d717d7lusvn7of.R.inc(56236);list = new ArrayList<Integer>();
            __CLR4_5_217d717d7lusvn7of.R.inc(56237);list.add(1);
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}
    }

    static class TestDomain3 {
        private List<Integer> list;

        public TestDomain3(){try{__CLR4_5_217d717d7lusvn7of.R.inc(56238);
            __CLR4_5_217d717d7lusvn7of.R.inc(56239);list = new ArrayList<Integer>();
            __CLR4_5_217d717d7lusvn7of.R.inc(56240);list.add(1);
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

        public List<Integer> getList(){try{__CLR4_5_217d717d7lusvn7of.R.inc(56241);
            __CLR4_5_217d717d7lusvn7of.R.inc(56242);return list;
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_217d717d7lusvn7of.R.inc(56243);
            __CLR4_5_217d717d7lusvn7of.R.inc(56244);this.list = list;
        }finally{__CLR4_5_217d717d7lusvn7of.R.flushNeeded();}}
    }
}
