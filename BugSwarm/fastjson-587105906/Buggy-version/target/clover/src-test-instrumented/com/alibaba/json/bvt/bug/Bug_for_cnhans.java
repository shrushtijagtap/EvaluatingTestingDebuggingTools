/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_cnhans extends TestCase {static class __CLR4_1_1013me13melusqk2f9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,51405,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1013me13melusqk2f9.R.inc(51350);
        __CLR4_1_1013me13melusqk2f9.R.inc(51351);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1013me13melusqk2f9.R.inc(51352);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_1_1013me13melusqk2f9.R.globalSliceStart(getClass().getName(),51353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp213mh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013me13melusqk2f9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013me13melusqk2f9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51353,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp213mh() throws Exception{try{__CLR4_1_1013me13melusqk2f9.R.inc(51353);
        __CLR4_1_1013me13melusqk2f9.R.inc(51354);VO vo = new VO();
        __CLR4_1_1013me13melusqk2f9.R.inc(51355);vo.setCalendar(Calendar.getInstance());

        __CLR4_1_1013me13melusqk2f9.R.inc(51356);String text = JSON.toJSONString(vo);

        __CLR4_1_1013me13melusqk2f9.R.inc(51357);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51358);Assert.assertEquals(vo.getCalendar().getTime(), vo1.getCalendar().getTime());
    }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}
    
    public void test_format() throws Exception {__CLR4_1_1013me13melusqk2f9.R.globalSliceStart(getClass().getName(),51359);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dtmbrf13mn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013me13melusqk2f9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013me13melusqk2f9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_format",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51359,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dtmbrf13mn() throws Exception{try{__CLR4_1_1013me13melusqk2f9.R.inc(51359);
        __CLR4_1_1013me13melusqk2f9.R.inc(51360);VO vo = new VO();
        __CLR4_1_1013me13melusqk2f9.R.inc(51361);vo.setCalendar(Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale));
        
        __CLR4_1_1013me13melusqk2f9.R.inc(51362);String text = JSON.toJSONString(vo, SerializerFeature.WriteDateUseDateFormat);
        
        __CLR4_1_1013me13melusqk2f9.R.inc(51363);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51364);Assert.assertEquals(vo.getCalendar().get(Calendar.YEAR), vo1.getCalendar().get(Calendar.YEAR));
        __CLR4_1_1013me13melusqk2f9.R.inc(51365);Assert.assertEquals(vo.getCalendar().get(Calendar.MONTH), vo1.getCalendar().get(Calendar.MONTH));
        __CLR4_1_1013me13melusqk2f9.R.inc(51366);Assert.assertEquals(vo.getCalendar().get(Calendar.DAY_OF_MONTH), vo1.getCalendar().get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1013me13melusqk2f9.R.inc(51367);Assert.assertEquals(vo.getCalendar().get(Calendar.HOUR_OF_DAY), vo1.getCalendar().get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1013me13melusqk2f9.R.inc(51368);Assert.assertEquals(vo.getCalendar().get(Calendar.MINUTE), vo1.getCalendar().get(Calendar.MINUTE));
        __CLR4_1_1013me13melusqk2f9.R.inc(51369);Assert.assertEquals(vo.getCalendar().get(Calendar.SECOND), vo1.getCalendar().get(Calendar.SECOND));
    }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}
    
    public void test_iso_format() throws Exception {__CLR4_1_1013me13melusqk2f9.R.globalSliceStart(getClass().getName(),51370);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1030yf2313my();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013me13melusqk2f9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013me13melusqk2f9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_iso_format",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51370,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1030yf2313my() throws Exception{try{__CLR4_1_1013me13melusqk2f9.R.inc(51370);
        __CLR4_1_1013me13melusqk2f9.R.inc(51371);VO vo = new VO();
        __CLR4_1_1013me13melusqk2f9.R.inc(51372);vo.setCalendar(Calendar.getInstance());
        
        __CLR4_1_1013me13melusqk2f9.R.inc(51373);String text = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        
        __CLR4_1_1013me13melusqk2f9.R.inc(51374);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51375);Assert.assertEquals(vo.getCalendar().get(Calendar.YEAR), vo1.getCalendar().get(Calendar.YEAR));
        __CLR4_1_1013me13melusqk2f9.R.inc(51376);Assert.assertEquals(vo.getCalendar().get(Calendar.MONTH), vo1.getCalendar().get(Calendar.MONTH));
        __CLR4_1_1013me13melusqk2f9.R.inc(51377);Assert.assertEquals(vo.getCalendar().get(Calendar.DAY_OF_MONTH), vo1.getCalendar().get(Calendar.DAY_OF_MONTH));
        __CLR4_1_1013me13melusqk2f9.R.inc(51378);Assert.assertEquals(vo.getCalendar().get(Calendar.HOUR_OF_DAY), vo1.getCalendar().get(Calendar.HOUR_OF_DAY));
        __CLR4_1_1013me13melusqk2f9.R.inc(51379);Assert.assertEquals(vo.getCalendar().get(Calendar.MINUTE), vo1.getCalendar().get(Calendar.MINUTE));
        __CLR4_1_1013me13melusqk2f9.R.inc(51380);Assert.assertEquals(vo.getCalendar().get(Calendar.SECOND), vo1.getCalendar().get(Calendar.SECOND));
    }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}
    
    public void test_toJavaObject() throws Exception {__CLR4_1_1013me13melusqk2f9.R.globalSliceStart(getClass().getName(),51381);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9zde813n9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013me13melusqk2f9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013me13melusqk2f9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_toJavaObject",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51381,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9zde813n9() throws Exception{try{__CLR4_1_1013me13melusqk2f9.R.inc(51381);
        __CLR4_1_1013me13melusqk2f9.R.inc(51382);JSONObject obj = new JSONObject();
        __CLR4_1_1013me13melusqk2f9.R.inc(51383);obj.put("d1", new Date());
        __CLR4_1_1013me13melusqk2f9.R.inc(51384);obj.put("d2", System.currentTimeMillis());
        __CLR4_1_1013me13melusqk2f9.R.inc(51385);obj.put("d3", GregorianCalendar.getInstance());
        __CLR4_1_1013me13melusqk2f9.R.inc(51386);obj.put("d4", "2012-12-22");
        __CLR4_1_1013me13melusqk2f9.R.inc(51387);obj.put("d5", "2012-12-22 12:11:11");
        __CLR4_1_1013me13melusqk2f9.R.inc(51388);obj.put("d6", "2012-12-22 12:11:11.234");
        
        __CLR4_1_1013me13melusqk2f9.R.inc(51389);obj.getObject("d1", Calendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51390);obj.getObject("d2", Calendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51391);obj.getObject("d3", Calendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51392);obj.getObject("d4", Calendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51393);obj.getObject("d5", Calendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51394);obj.getObject("d6", Calendar.class);

        __CLR4_1_1013me13melusqk2f9.R.inc(51395);obj.getObject("d1", GregorianCalendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51396);obj.getObject("d2", GregorianCalendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51397);obj.getObject("d3", GregorianCalendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51398);obj.getObject("d4", GregorianCalendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51399);obj.getObject("d5", GregorianCalendar.class);
        __CLR4_1_1013me13melusqk2f9.R.inc(51400);obj.getObject("d6", GregorianCalendar.class);
    }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}

    public static class VO {

        private Calendar calendar;

        public Calendar getCalendar() {try{__CLR4_1_1013me13melusqk2f9.R.inc(51401);
            __CLR4_1_1013me13melusqk2f9.R.inc(51402);return calendar;
        }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}

        public void setCalendar(Calendar calendar) {try{__CLR4_1_1013me13melusqk2f9.R.inc(51403);
            __CLR4_1_1013me13melusqk2f9.R.inc(51404);this.calendar = calendar;
        }finally{__CLR4_1_1013me13melusqk2f9.R.flushNeeded();}}

    }
}
