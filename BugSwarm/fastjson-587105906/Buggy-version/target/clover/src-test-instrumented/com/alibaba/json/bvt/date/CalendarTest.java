/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.util.Calendar;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class CalendarTest extends TestCase {static class __CLR4_1_1019fj19fjluszwa70{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58910,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_null() throws Exception {__CLR4_1_1019fj19fjluszwa70.R.globalSliceStart(getClass().getName(),58879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl19fj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019fj19fjluszwa70.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019fj19fjluszwa70.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.CalendarTest.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58879,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl19fj() throws Exception{try{__CLR4_1_1019fj19fjluszwa70.R.inc(58879);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58880);String text = "{\"calendar\":null}";
        
        __CLR4_1_1019fj19fjluszwa70.R.inc(58881);VO vo = JSON.parseObject(text, VO.class);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58882);Assert.assertNull(vo.getCalendar());
    }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}
    
    public void test_codec() throws Exception {__CLR4_1_1019fj19fjluszwa70.R.globalSliceStart(getClass().getName(),58883);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10nht31s19fn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019fj19fjluszwa70.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019fj19fjluszwa70.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.CalendarTest.test_codec",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58883,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10nht31s19fn() throws Exception{try{__CLR4_1_1019fj19fjluszwa70.R.inc(58883);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58884);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58885);VO vo = new VO();
        __CLR4_1_1019fj19fjluszwa70.R.inc(58886);vo.setCalendar(calendar);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58887);String text = JSON.toJSONString(vo);
        
        __CLR4_1_1019fj19fjluszwa70.R.inc(58888);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58889);Assert.assertEquals(vo.getCalendar().getTimeInMillis(), vo2.getCalendar().getTimeInMillis());
    }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}
    
    public void test_codec_iso88591() throws Exception {__CLR4_1_1019fj19fjluszwa70.R.globalSliceStart(getClass().getName(),58890);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10496ikb19fu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019fj19fjluszwa70.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019fj19fjluszwa70.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.CalendarTest.test_codec_iso88591",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58890,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10496ikb19fu() throws Exception{try{__CLR4_1_1019fj19fjluszwa70.R.inc(58890);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58891);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58892);VO vo = new VO();
        __CLR4_1_1019fj19fjluszwa70.R.inc(58893);vo.setCalendar(calendar);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58894);String text = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        
        __CLR4_1_1019fj19fjluszwa70.R.inc(58895);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58896);Assert.assertEquals(vo.getCalendar().getTimeInMillis(), vo2.getCalendar().getTimeInMillis());
    }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}
    
    public void test_codec_iso88591_2() throws Exception {__CLR4_1_1019fj19fjluszwa70.R.globalSliceStart(getClass().getName(),58897);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wvq6co19g1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019fj19fjluszwa70.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019fj19fjluszwa70.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.CalendarTest.test_codec_iso88591_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58897,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wvq6co19g1() throws Exception{try{__CLR4_1_1019fj19fjluszwa70.R.inc(58897);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58898);Calendar calendar = Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58899);calendar.set(Calendar.SECOND, 0);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58900);calendar.set(Calendar.MILLISECOND, 0);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58901);VO vo = new VO();
        __CLR4_1_1019fj19fjluszwa70.R.inc(58902);vo.setCalendar(calendar);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58903);String text = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        
        __CLR4_1_1019fj19fjluszwa70.R.inc(58904);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1019fj19fjluszwa70.R.inc(58905);Assert.assertEquals(vo.getCalendar().getTimeInMillis(), vo2.getCalendar().getTimeInMillis());
    }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}

    public static class VO {

        private Calendar calendar;

        public Calendar getCalendar() {try{__CLR4_1_1019fj19fjluszwa70.R.inc(58906);
            __CLR4_1_1019fj19fjluszwa70.R.inc(58907);return calendar;
        }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}

        public void setCalendar(Calendar calendar) {try{__CLR4_1_1019fj19fjluszwa70.R.inc(58908);
            __CLR4_1_1019fj19fjluszwa70.R.inc(58909);this.calendar = calendar;
        }finally{__CLR4_1_1019fj19fjluszwa70.R.flushNeeded();}}

    }
}
