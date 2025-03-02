/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wuwen on 2017/2/16.
 */
public class Issue1013 extends TestCase {static class __CLR4_5_216ez16ezlusyjs4t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,55013,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54971);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb16ez();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54971,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb16ez() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54971);
        __CLR4_5_216ez16ezlusyjs4t.R.inc(54972);TestDomain domain = new TestDomain();

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54973);String json = JSON.toJSONString(domain);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54974);TestDomain domain1 = JSON.parseObject(json, TestDomain.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54975);assertEquals(domain.getList(), domain1.getList());
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2uhstn516f4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54976,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2uhstn516f4() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54976);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54977);TestDomain domain1 = JSON.parseObject("{\"list\":[]}", TestDomain.class);
        __CLR4_5_216ez16ezlusyjs4t.R.inc(54978);TestDomain domain2 = JSON.parseObject("{\"list\":[1, 2]}", TestDomain.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54979);assertEquals(0, domain1.getList().size());
        __CLR4_5_216ez16ezlusyjs4t.R.inc(54980);assertEquals(Arrays.asList(1, 2), domain2.getList());
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue_2() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54981);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo16f9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54981,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo16f9() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54981);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54982);TestDomain domain1 = JSON.parseObject("{\"list\":null}", TestDomain.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54983);assertEquals(1, domain1.getList().size());
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue3() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54984);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v68xlw16fc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54984,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v68xlw16fc() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54984);
        __CLR4_5_216ez16ezlusyjs4t.R.inc(54985);TestDomain2 domain = new TestDomain2();

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54986);String json = JSON.toJSONString(domain);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54987);TestDomain2 domain1 = JSON.parseObject(json, TestDomain2.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54988);assertEquals(domain.list, domain1.list);
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue_4() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqsx9q16fh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54989,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqsx9q16fh() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54989);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54990);TestDomain2 domain1 = JSON.parseObject("{\"list\":[1, 2]}", TestDomain2.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54991);assertEquals(Arrays.asList(1, 2), domain1.list);
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue_5() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hhsyh916fk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hhsyh916fk() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54992);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54993);TestDomain2 domain1 = JSON.parseObject("{\"list\":null}", TestDomain2.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54994);assertNull(domain1.list);
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    public void test_for_issue_6() throws Exception {__CLR4_5_216ez16ezlusyjs4t.R.globalSliceStart(getClass().getName(),54995);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e8szos16fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_216ez16ezlusyjs4t.R.rethrow($CLV_t2$);}finally{__CLR4_5_216ez16ezlusyjs4t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1013.test_for_issue_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54995,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e8szos16fn() throws Exception{try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54995);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54996);TestDomain3 domain3 = JSON.parseObject("{\"list\":null}", TestDomain3.class);

        __CLR4_5_216ez16ezlusyjs4t.R.inc(54997);assertNull(domain3.list);
    }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

    static class TestDomain {
        private List<Integer> list;

        public TestDomain(){try{__CLR4_5_216ez16ezlusyjs4t.R.inc(54998);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(54999);list = new ArrayList<Integer>();
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55000);list.add(1);
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

        public List<Integer> getList(){try{__CLR4_5_216ez16ezlusyjs4t.R.inc(55001);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55002);return list;
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}
    }

    static class TestDomain2 {
        public List<Integer> list;

        public TestDomain2(){try{__CLR4_5_216ez16ezlusyjs4t.R.inc(55003);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55004);list = new ArrayList<Integer>();
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55005);list.add(1);
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}
    }

    static class TestDomain3 {
        private List<Integer> list;

        public TestDomain3(){try{__CLR4_5_216ez16ezlusyjs4t.R.inc(55006);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55007);list = new ArrayList<Integer>();
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55008);list.add(1);
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

        public List<Integer> getList(){try{__CLR4_5_216ez16ezlusyjs4t.R.inc(55009);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55010);return list;
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}

        public void setList(List<Integer> list) {try{__CLR4_5_216ez16ezlusyjs4t.R.inc(55011);
            __CLR4_5_216ez16ezlusyjs4t.R.inc(55012);this.list = list;
        }finally{__CLR4_5_216ez16ezlusyjs4t.R.flushNeeded();}}
    }
}
