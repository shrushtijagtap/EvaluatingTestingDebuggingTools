/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvt.issue_2200.issue2224.PersonCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_2.PersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_3.ArrayPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_4.MAPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_5.MA2PersonGroupedCollection;
import junit.framework.TestCase;

public class Issue2224 extends TestCase {static class __CLR4_1_101e1t1e1tluszwbnm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,64958,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //support inherit with other parameterized type
    public void test_for_issue() {__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceStart(getClass().getName(),64865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1e1t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e1t1e1tluszwbnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64865,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1e1t(){try{__CLR4_1_101e1t1e1tluszwbnm.R.inc(64865);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64866);String json = "[{\"idNo\":\"123456\",\"name\":\"tom\"},{\"idNo\":\"123457\",\"name\":\"jack\"}]";
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64867);PersonCollection personCollection = JSON.parseObject(json, PersonCollection.class);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64868);assertNotNull(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64869);assertEquals(2, personCollection.size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64870);assertEquals("tom", personCollection.get("123456").getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64871);assertEquals("jack", personCollection.get("123457").getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64872);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64873);assertNotNull(json2);
    }finally{__CLR4_1_101e1t1e1tluszwbnm.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic
    public void test_for_issue_2() {__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceStart(getClass().getName(),64874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r8suuo1e22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e1t1e1tluszwbnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64874,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r8suuo1e22(){try{__CLR4_1_101e1t1e1tluszwbnm.R.inc(64874);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64875);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64876);PersonGroupedCollection personCollection = JSON.parseObject(json, PersonGroupedCollection.class);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64877);assertNotNull(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64878);assertEquals(2, personCollection.size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64879);assertEquals(2, personCollection.get("\u5f20\u4e09").size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64880);assertEquals("123", personCollection.get("\u5f20\u4e09").get(0).getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64881);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(0).getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64882);assertEquals("124", personCollection.get("\u5f20\u4e09").get(1).getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64883);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(1).getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64884);assertEquals(2, personCollection.get("\u674e\u56db").size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64885);assertEquals("223", personCollection.get("\u674e\u56db").get(0).getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64886);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(0).getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64887);assertEquals("224", personCollection.get("\u674e\u56db").get(1).getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64888);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(1).getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64889);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64890);assertNotNull(json2);
    }finally{__CLR4_1_101e1t1e1tluszwbnm.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is bean array
    public void test_for_issue_3() {__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceStart(getClass().getName(),64891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nzsw271e2j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e1t1e1tluszwbnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nzsw271e2j(){try{__CLR4_1_101e1t1e1tluszwbnm.R.inc(64891);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64892);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64893);ArrayPersonGroupedCollection personCollection = JSON.parseObject(json, ArrayPersonGroupedCollection.class);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64894);assertNotNull(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64895);assertEquals(2, personCollection.size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64896);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64897);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64898);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64899);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64900);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64901);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64902);assertEquals("223", personCollection.get("\u674e\u56db")[0].getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64903);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64904);assertEquals("224", personCollection.get("\u674e\u56db")[1].getIdNo());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64905);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].getName());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64906);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64907);assertNotNull(json2);
    }finally{__CLR4_1_101e1t1e1tluszwbnm.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array
    public void test_for_issue_4() {__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceStart(getClass().getName(),64908);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10kqsx9q1e30();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e1t1e1tluszwbnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64908,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10kqsx9q1e30(){try{__CLR4_1_101e1t1e1tluszwbnm.R.inc(64908);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64909);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64910);MAPersonGroupedCollection personCollection = JSON.parseObject(json, MAPersonGroupedCollection.class);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64911);assertNotNull(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64912);assertEquals(2, personCollection.size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64913);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64914);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64915);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64916);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64917);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64918);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64919);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64920);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64921);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64922);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name"));
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64923);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64924);assertNotNull(json2);
    }finally{__CLR4_1_101e1t1e1tluszwbnm.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array contains array
    public void test_for_issue_5() {__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceStart(getClass().getName(),64925);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hhsyh91e3h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101e1t1e1tluszwbnm.R.rethrow($CLV_t2$);}finally{__CLR4_1_101e1t1e1tluszwbnm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),64925,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hhsyh91e3h(){try{__CLR4_1_101e1t1e1tluszwbnm.R.inc(64925);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64926);String json = "[[{\"idNo\":[\"123\",\"123x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]},{\"idNo\":[\"124\",\"124x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]}],[{\"idNo\":[\"223\",\"223y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]},{\"idNo\":[\"224\",\"224y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]}]]";
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64927);MA2PersonGroupedCollection personCollection = JSON.parseObject(json, MA2PersonGroupedCollection.class);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64928);assertNotNull(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64929);assertEquals(2, personCollection.size());
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64930);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64931);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("idNo").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64932);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64933);assertEquals("123x", personCollection.get("\u5f20\u4e09")[0].get("idNo")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64934);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("name").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64935);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64936);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[0].get("name")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64937);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("idNo").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64938);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64939);assertEquals("124x", personCollection.get("\u5f20\u4e09")[1].get("idNo")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64940);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("name").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64941);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64942);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[1].get("name")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64943);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64944);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("idNo").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64945);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64946);assertEquals("223y", personCollection.get("\u674e\u56db")[0].get("idNo")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64947);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("name").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64948);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64949);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[0].get("name")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64950);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("idNo").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64951);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64952);assertEquals("224y", personCollection.get("\u674e\u56db")[1].get("idNo")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64953);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("name").length);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64954);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name")[0]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64955);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[1].get("name")[1]);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64956);String json2 = JSON.toJSONString(personCollection);
        __CLR4_1_101e1t1e1tluszwbnm.R.inc(64957);assertNotNull(json2);
    }finally{__CLR4_1_101e1t1e1tluszwbnm.R.flushNeeded();}}
}
