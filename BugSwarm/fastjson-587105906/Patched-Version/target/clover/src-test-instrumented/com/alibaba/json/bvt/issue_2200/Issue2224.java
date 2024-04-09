/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_2200;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.bvt.issue_2200.issue2224.PersonCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_2.PersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_3.ArrayPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_4.MAPersonGroupedCollection;
import com.alibaba.json.bvt.issue_2200.issue2224_5.MA2PersonGroupedCollection;
import junit.framework.TestCase;

public class Issue2224 extends TestCase {static class __CLR4_5_21e1i1e1ilusvnbb9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,64947,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    //support inherit with other parameterized type
    public void test_for_issue() {__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceStart(getClass().getName(),64854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1e1i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e1i1e1ilusvnbb9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64854,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1e1i(){try{__CLR4_5_21e1i1e1ilusvnbb9.R.inc(64854);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64855);String json = "[{\"idNo\":\"123456\",\"name\":\"tom\"},{\"idNo\":\"123457\",\"name\":\"jack\"}]";
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64856);PersonCollection personCollection = JSON.parseObject(json, PersonCollection.class);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64857);assertNotNull(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64858);assertEquals(2, personCollection.size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64859);assertEquals("tom", personCollection.get("123456").getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64860);assertEquals("jack", personCollection.get("123457").getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64861);String json2 = JSON.toJSONString(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64862);assertNotNull(json2);
    }finally{__CLR4_5_21e1i1e1ilusvnbb9.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic
    public void test_for_issue_2() {__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceStart(getClass().getName(),64863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r8suuo1e1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e1i1e1ilusvnbb9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64863,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r8suuo1e1r(){try{__CLR4_5_21e1i1e1ilusvnbb9.R.inc(64863);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64864);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64865);PersonGroupedCollection personCollection = JSON.parseObject(json, PersonGroupedCollection.class);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64866);assertNotNull(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64867);assertEquals(2, personCollection.size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64868);assertEquals(2, personCollection.get("\u5f20\u4e09").size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64869);assertEquals("123", personCollection.get("\u5f20\u4e09").get(0).getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64870);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(0).getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64871);assertEquals("124", personCollection.get("\u5f20\u4e09").get(1).getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64872);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09").get(1).getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64873);assertEquals(2, personCollection.get("\u674e\u56db").size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64874);assertEquals("223", personCollection.get("\u674e\u56db").get(0).getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64875);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(0).getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64876);assertEquals("224", personCollection.get("\u674e\u56db").get(1).getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64877);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db").get(1).getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64878);String json2 = JSON.toJSONString(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64879);assertNotNull(json2);
    }finally{__CLR4_5_21e1i1e1ilusvnbb9.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is bean array
    public void test_for_issue_3() {__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceStart(getClass().getName(),64880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nzsw271e28();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e1i1e1ilusvnbb9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nzsw271e28(){try{__CLR4_5_21e1i1e1ilusvnbb9.R.inc(64880);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64881);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64882);ArrayPersonGroupedCollection personCollection = JSON.parseObject(json, ArrayPersonGroupedCollection.class);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64883);assertNotNull(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64884);assertEquals(2, personCollection.size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64885);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64886);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64887);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64888);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64889);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64890);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64891);assertEquals("223", personCollection.get("\u674e\u56db")[0].getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64892);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64893);assertEquals("224", personCollection.get("\u674e\u56db")[1].getIdNo());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64894);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].getName());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64895);String json2 = JSON.toJSONString(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64896);assertNotNull(json2);
    }finally{__CLR4_5_21e1i1e1ilusvnbb9.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array
    public void test_for_issue_4() {__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceStart(getClass().getName(),64897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2kqsx9q1e2p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e1i1e1ilusvnbb9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64897,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2kqsx9q1e2p(){try{__CLR4_5_21e1i1e1ilusvnbb9.R.inc(64897);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64898);String json = "[[{\"idNo\":\"123\",\"name\":\"\u5f20\u4e09\"},{\"idNo\":\"124\",\"name\":\"\u5f20\u4e09\"}],[{\"idNo\":\"223\",\"name\":\"\u674e\u56db\"},{\"idNo\":\"224\",\"name\":\"\u674e\u56db\"}]]";
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64899);MAPersonGroupedCollection personCollection = JSON.parseObject(json, MAPersonGroupedCollection.class);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64900);assertNotNull(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64901);assertEquals(2, personCollection.size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64902);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64903);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64904);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64905);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64906);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64907);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64908);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64909);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64910);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64911);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name"));
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64912);String json2 = JSON.toJSONString(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64913);assertNotNull(json2);
    }finally{__CLR4_5_21e1i1e1ilusvnbb9.R.flushNeeded();}}

    //support inherit with other parameterized type and item type is generic array contains array
    public void test_for_issue_5() {__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceStart(getClass().getName(),64914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hhsyh91e36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21e1i1e1ilusvnbb9.R.rethrow($CLV_t2$);}finally{__CLR4_5_21e1i1e1ilusvnbb9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2200.Issue2224.test_for_issue_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),64914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hhsyh91e36(){try{__CLR4_5_21e1i1e1ilusvnbb9.R.inc(64914);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64915);String json = "[[{\"idNo\":[\"123\",\"123x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]},{\"idNo\":[\"124\",\"124x\"],\"name\":[\"\u5f20\u4e09\",\"\u5f20\u4e09\u4e00\"]}],[{\"idNo\":[\"223\",\"223y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]},{\"idNo\":[\"224\",\"224y\"],\"name\":[\"\u674e\u56db\",\"\u674e\u5c0f\u56db\"]}]]";
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64916);MA2PersonGroupedCollection personCollection = JSON.parseObject(json, MA2PersonGroupedCollection.class);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64917);assertNotNull(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64918);assertEquals(2, personCollection.size());
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64919);assertEquals(2, personCollection.get("\u5f20\u4e09").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64920);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("idNo").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64921);assertEquals("123", personCollection.get("\u5f20\u4e09")[0].get("idNo")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64922);assertEquals("123x", personCollection.get("\u5f20\u4e09")[0].get("idNo")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64923);assertEquals(2, personCollection.get("\u5f20\u4e09")[0].get("name").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64924);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[0].get("name")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64925);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[0].get("name")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64926);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("idNo").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64927);assertEquals("124", personCollection.get("\u5f20\u4e09")[1].get("idNo")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64928);assertEquals("124x", personCollection.get("\u5f20\u4e09")[1].get("idNo")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64929);assertEquals(2, personCollection.get("\u5f20\u4e09")[1].get("name").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64930);assertEquals("\u5f20\u4e09", personCollection.get("\u5f20\u4e09")[1].get("name")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64931);assertEquals("\u5f20\u4e09\u4e00", personCollection.get("\u5f20\u4e09")[1].get("name")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64932);assertEquals(2, personCollection.get("\u674e\u56db").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64933);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("idNo").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64934);assertEquals("223", personCollection.get("\u674e\u56db")[0].get("idNo")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64935);assertEquals("223y", personCollection.get("\u674e\u56db")[0].get("idNo")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64936);assertEquals(2, personCollection.get("\u674e\u56db")[0].get("name").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64937);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[0].get("name")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64938);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[0].get("name")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64939);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("idNo").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64940);assertEquals("224", personCollection.get("\u674e\u56db")[1].get("idNo")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64941);assertEquals("224y", personCollection.get("\u674e\u56db")[1].get("idNo")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64942);assertEquals(2, personCollection.get("\u674e\u56db")[1].get("name").length);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64943);assertEquals("\u674e\u56db", personCollection.get("\u674e\u56db")[1].get("name")[0]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64944);assertEquals("\u674e\u5c0f\u56db", personCollection.get("\u674e\u56db")[1].get("name")[1]);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64945);String json2 = JSON.toJSONString(personCollection);
        __CLR4_5_21e1i1e1ilusvnbb9.R.inc(64946);assertNotNull(json2);
    }finally{__CLR4_5_21e1i1e1ilusvnbb9.R.flushNeeded();}}
}
