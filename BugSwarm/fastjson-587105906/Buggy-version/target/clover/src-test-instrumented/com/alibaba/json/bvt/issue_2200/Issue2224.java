/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvt.issue_2200.issue2224.PersonCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_2.PersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_3.ArrayPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_4.MAPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_5.MA2PersonGroupedCollection;
import junit.framework.TestCase;

public class Issue2224 extends TestCase {static class __CLR4_1_101d3l1d3llusqkbl5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,63726,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //support inherit with other parameterized type
    public void test_for_issue() {__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceStart(getClass().getName(),63633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1d3l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d3l1d3llusqkbl5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63633,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1d3l(){try{__CLR4_1_101d3l1d3llusqkbl5.R.inc(63633);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63634);String json = "[{\"idNo\":\"123456\",\"name\":\"tom\"},{\"idNo\":\"123457\",\"name\":\"jack\"}]";
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63635);PersonCollection personCollection = JSON.parseObject(json, PersonCollection.class);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63636);assertNotNull(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63637);assertEquals(2, personCollection.size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63638);assertEquals("tom", personCollection.get("123456").getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63639);assertEquals("jack", personCollection.get("123457").getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63640);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63641);assertNotNull(json2);
    }finally{__CLR4_1_101d3l1d3llusqkbl5.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic
    public void test_for_issue_2() {__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceStart(getClass().getName(),63642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1d3u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d3l1d3llusqkbl5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63642,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1d3u(){try{__CLR4_1_101d3l1d3llusqkbl5.R.inc(63642);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63643);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63644);PersonGroupedCollection personCollection = JSON.parseObject(json, PersonGroupedCollection.class);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63645);assertNotNull(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63646);assertEquals(2, personCollection.size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63647);assertEquals(2, personCollection.get("\u5f20\u4e09").size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63648);assertEquals("123", personCollection.get("\u5f20\u4e09").get(0).getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63649);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(0).getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63650);assertEquals("124", personCollection.get("\u5f20\u4e09").get(1).getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63651);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(1).getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63652);assertEquals(2, personCollection.get("\u674e\u56db").size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63653);assertEquals("223", personCollection.get("\u674e\u56db").get(0).getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63654);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(0).getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63655);assertEquals("224", personCollection.get("\u674e\u56db").get(1).getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63656);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(1).getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63657);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63658);assertNotNull(json2);
    }finally{__CLR4_1_101d3l1d3llusqkbl5.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is bean array
    public void test_for_issue_3() {__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceStart(getClass().getName(),63659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nzsw271d4b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d3l1d3llusqkbl5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63659,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nzsw271d4b(){try{__CLR4_1_101d3l1d3llusqkbl5.R.inc(63659);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63660);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63661);ArrayPersonGroupedCollection personCollection = JSON.parseObject(json, ArrayPersonGroupedCollection.class);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63662);assertNotNull(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63663);assertEquals(2, personCollection.size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63664);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63665);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63666);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63667);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63668);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63669);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63670);assertEquals("223", personCollection.get("\u674e\u56db")[0].getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63671);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63672);assertEquals("224", personCollection.get("\u674e\u56db")[1].getIdNo());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63673);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].getName());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63674);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63675);assertNotNull(json2);
    }finally{__CLR4_1_101d3l1d3llusqkbl5.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array
    public void test_for_issue_4() {__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceStart(getClass().getName(),63676);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kqsx9q1d4s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d3l1d3llusqkbl5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63676,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kqsx9q1d4s(){try{__CLR4_1_101d3l1d3llusqkbl5.R.inc(63676);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63677);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63678);MAPersonGroupedCollection personCollection = JSON.parseObject(json, MAPersonGroupedCollection.class);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63679);assertNotNull(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63680);assertEquals(2, personCollection.size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63681);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63682);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63683);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63684);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63685);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63686);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63687);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63688);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63689);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63690);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name"));
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63691);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63692);assertNotNull(json2);
    }finally{__CLR4_1_101d3l1d3llusqkbl5.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array contains array
    public void test_for_issue_5() {__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceStart(getClass().getName(),63693);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hhsyh91d59();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101d3l1d3llusqkbl5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101d3l1d3llusqkbl5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63693,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hhsyh91d59(){try{__CLR4_1_101d3l1d3llusqkbl5.R.inc(63693);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63694);String json = "[[{\"idNo\":[\"123\",\"123x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]},{\"idNo\":[\"124\",\"124x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]}],[{\"idNo\":[\"223\",\"223y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]},{\"idNo\":[\"224\",\"224y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]}]]";
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63695);MA2PersonGroupedCollection personCollection = JSON.parseObject(json, MA2PersonGroupedCollection.class);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63696);assertNotNull(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63697);assertEquals(2, personCollection.size());
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63698);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63699);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("idNo").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63700);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63701);assertEquals("123x", personCollection.get("\u5f20\u4e09")[0].get("idNo")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63702);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("name").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63703);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63704);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[0].get("name")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63705);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("idNo").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63706);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63707);assertEquals("124x", personCollection.get("\u5f20\u4e09")[1].get("idNo")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63708);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("name").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63709);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63710);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[1].get("name")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63711);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63712);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("idNo").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63713);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63714);assertEquals("223y", personCollection.get("\u674e\u56db")[0].get("idNo")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63715);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("name").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63716);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63717);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[0].get("name")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63718);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("idNo").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63719);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63720);assertEquals("224y", personCollection.get("\u674e\u56db")[1].get("idNo")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63721);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("name").length);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63722);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name")[0]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63723);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[1].get("name")[1]);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63724);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101d3l1d3llusqkbl5.R.inc(63725);assertNotNull(json2);
    }finally{__CLR4_1_101d3l1d3llusqkbl5.R.flushNeeded();}}
}
