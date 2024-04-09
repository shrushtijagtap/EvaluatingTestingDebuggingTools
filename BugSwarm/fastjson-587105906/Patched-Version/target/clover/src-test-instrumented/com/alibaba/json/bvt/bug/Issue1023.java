/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import junit.framework.TestCase;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by wenshao on 11/03/2017.
 */
public class Issue1023 extends TestCase {static class __CLR4_5_217gg17gglusvn7p7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,56339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_217gg17gglusvn7p7.R.globalSliceStart(getClass().getName(),56320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb17gg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_217gg17gglusvn7p7.R.rethrow($CLV_t2$);}finally{__CLR4_5_217gg17gglusvn7p7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue1023.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),56320,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb17gg() throws Exception{try{__CLR4_5_217gg17gglusvn7p7.R.inc(56320);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56321);Date now = new Date();

        __CLR4_5_217gg17gglusvn7p7.R.inc(56322);GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
        __CLR4_5_217gg17gglusvn7p7.R.inc(56323);gregorianCalendar.setTime(now);

        __CLR4_5_217gg17gglusvn7p7.R.inc(56324);XMLGregorianCalendar calendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);

        __CLR4_5_217gg17gglusvn7p7.R.inc(56325);String jsonString = JSON.toJSONString(calendar);
        // success
        __CLR4_5_217gg17gglusvn7p7.R.inc(56326);calendar = JSON.parseObject(jsonString, XMLGregorianCalendar.class);

        __CLR4_5_217gg17gglusvn7p7.R.inc(56327);Object toJSON1 = JSON.toJSON(calendar); // debug\u770b\u5230\u662f Long \u7c7b\u578b
        // \u6240\u4ee5\u8fd9\u91cc\u4f1a\u62a5\u9519\uff1a
        // error: java.lang.ClassCastException: java.lang.Long cannot be cast to com.alibaba.fastjson.JSONObject
        //JSONObject jsonObject = (JSONObject) JSON.toJSON(calendar);
        // \u6240\u4ee5 \u8fd9\u91cc\u80af\u5b9a\u4f1a\u62a5\u9519\uff0c \u56e0\u4e3a jsonObject \u4e0d\u662fJSONObject\u7c7b\u578b
        //calendar = jsonObject.toJavaObject(XMLGregorianCalendar.class);

        __CLR4_5_217gg17gglusvn7p7.R.inc(56328);List<XMLGregorianCalendar> calendarList = new ArrayList<XMLGregorianCalendar>();
        __CLR4_5_217gg17gglusvn7p7.R.inc(56329);calendarList.add(calendar);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56330);calendarList.add(calendar);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56331);calendarList.add(calendar);

        __CLR4_5_217gg17gglusvn7p7.R.inc(56332);Object toJSON2 = JSON.toJSON(calendarList); // debug \u770b\u5230\u662f JSONArray \u7c7b\u578b

        // success\uff1a \u901a\u8fc7 JSONArray.parseArray \u65b9\u6cd5\u53ef\u4ee5\u6b63\u786e\u8f6c\u6362
        __CLR4_5_217gg17gglusvn7p7.R.inc(56333);JSONArray jsonArray = (JSONArray) JSON.toJSON(calendarList);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56334);jsonString = jsonArray.toJSONString();
        __CLR4_5_217gg17gglusvn7p7.R.inc(56335);List<XMLGregorianCalendar> calendarList1 = JSONArray.parseArray(jsonString, XMLGregorianCalendar.class);

        // \u901a\u8fc7 jsonArray.toJavaList \u65e0\u6cd5\u8f6c\u6362
        // error: com.alibaba.fastjson.JSONException: can not cast to : javax.xml.datatype.XMLGregorianCalendar
        __CLR4_5_217gg17gglusvn7p7.R.inc(56336);List<XMLGregorianCalendar> calendarList2 = jsonArray.toJavaList(XMLGregorianCalendar.class);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56337);assertNotNull(calendarList2);
        __CLR4_5_217gg17gglusvn7p7.R.inc(56338);assertEquals(3, calendarList2.size());
    }finally{__CLR4_5_217gg17gglusvn7p7.R.flushNeeded();}}
}
