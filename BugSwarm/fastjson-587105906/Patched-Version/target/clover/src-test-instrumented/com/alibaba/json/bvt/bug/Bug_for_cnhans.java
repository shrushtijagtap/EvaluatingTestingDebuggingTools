/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

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

public class Bug_for_cnhans extends TestCase {static class __CLR4_5_214kb14kblusvn639{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,52626,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_214kb14kblusvn639.R.inc(52571);
        __CLR4_5_214kb14kblusvn639.R.inc(52572);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_214kb14kblusvn639.R.inc(52573);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_5_214kb14kblusvn639.R.globalSliceStart(getClass().getName(),52574);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp214ke();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214kb14kblusvn639.R.rethrow($CLV_t2$);}finally{__CLR4_5_214kb14kblusvn639.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52574,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp214ke() throws Exception{try{__CLR4_5_214kb14kblusvn639.R.inc(52574);
        __CLR4_5_214kb14kblusvn639.R.inc(52575);VO vo = new VO();
        __CLR4_5_214kb14kblusvn639.R.inc(52576);vo.setCalendar(Calendar.getInstance());

        __CLR4_5_214kb14kblusvn639.R.inc(52577);String text = JSON.toJSONString(vo);

        __CLR4_5_214kb14kblusvn639.R.inc(52578);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52579);Assert.assertEquals(vo.getCalendar().getTime(), vo1.getCalendar().getTime());
    }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}
    
    public void test_format() throws Exception {__CLR4_5_214kb14kblusvn639.R.globalSliceStart(getClass().getName(),52580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2dtmbrf14kk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214kb14kblusvn639.R.rethrow($CLV_t2$);}finally{__CLR4_5_214kb14kblusvn639.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_format",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52580,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2dtmbrf14kk() throws Exception{try{__CLR4_5_214kb14kblusvn639.R.inc(52580);
        __CLR4_5_214kb14kblusvn639.R.inc(52581);VO vo = new VO();
        __CLR4_5_214kb14kblusvn639.R.inc(52582);vo.setCalendar(Calendar.getInstance(JSON.defaultTimeZone, JSON.defaultLocale));
        
        __CLR4_5_214kb14kblusvn639.R.inc(52583);String text = JSON.toJSONString(vo, SerializerFeature.WriteDateUseDateFormat);
        
        __CLR4_5_214kb14kblusvn639.R.inc(52584);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52585);Assert.assertEquals(vo.getCalendar().get(Calendar.YEAR), vo1.getCalendar().get(Calendar.YEAR));
        __CLR4_5_214kb14kblusvn639.R.inc(52586);Assert.assertEquals(vo.getCalendar().get(Calendar.MONTH), vo1.getCalendar().get(Calendar.MONTH));
        __CLR4_5_214kb14kblusvn639.R.inc(52587);Assert.assertEquals(vo.getCalendar().get(Calendar.DAY_OF_MONTH), vo1.getCalendar().get(Calendar.DAY_OF_MONTH));
        __CLR4_5_214kb14kblusvn639.R.inc(52588);Assert.assertEquals(vo.getCalendar().get(Calendar.HOUR_OF_DAY), vo1.getCalendar().get(Calendar.HOUR_OF_DAY));
        __CLR4_5_214kb14kblusvn639.R.inc(52589);Assert.assertEquals(vo.getCalendar().get(Calendar.MINUTE), vo1.getCalendar().get(Calendar.MINUTE));
        __CLR4_5_214kb14kblusvn639.R.inc(52590);Assert.assertEquals(vo.getCalendar().get(Calendar.SECOND), vo1.getCalendar().get(Calendar.SECOND));
    }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}
    
    public void test_iso_format() throws Exception {__CLR4_5_214kb14kblusvn639.R.globalSliceStart(getClass().getName(),52591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_230yf2314kv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214kb14kblusvn639.R.rethrow($CLV_t2$);}finally{__CLR4_5_214kb14kblusvn639.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_iso_format",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52591,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_230yf2314kv() throws Exception{try{__CLR4_5_214kb14kblusvn639.R.inc(52591);
        __CLR4_5_214kb14kblusvn639.R.inc(52592);VO vo = new VO();
        __CLR4_5_214kb14kblusvn639.R.inc(52593);vo.setCalendar(Calendar.getInstance());
        
        __CLR4_5_214kb14kblusvn639.R.inc(52594);String text = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        
        __CLR4_5_214kb14kblusvn639.R.inc(52595);VO vo1 = JSON.parseObject(text, VO.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52596);Assert.assertEquals(vo.getCalendar().get(Calendar.YEAR), vo1.getCalendar().get(Calendar.YEAR));
        __CLR4_5_214kb14kblusvn639.R.inc(52597);Assert.assertEquals(vo.getCalendar().get(Calendar.MONTH), vo1.getCalendar().get(Calendar.MONTH));
        __CLR4_5_214kb14kblusvn639.R.inc(52598);Assert.assertEquals(vo.getCalendar().get(Calendar.DAY_OF_MONTH), vo1.getCalendar().get(Calendar.DAY_OF_MONTH));
        __CLR4_5_214kb14kblusvn639.R.inc(52599);Assert.assertEquals(vo.getCalendar().get(Calendar.HOUR_OF_DAY), vo1.getCalendar().get(Calendar.HOUR_OF_DAY));
        __CLR4_5_214kb14kblusvn639.R.inc(52600);Assert.assertEquals(vo.getCalendar().get(Calendar.MINUTE), vo1.getCalendar().get(Calendar.MINUTE));
        __CLR4_5_214kb14kblusvn639.R.inc(52601);Assert.assertEquals(vo.getCalendar().get(Calendar.SECOND), vo1.getCalendar().get(Calendar.SECOND));
    }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}
    
    public void test_toJavaObject() throws Exception {__CLR4_5_214kb14kblusvn639.R.globalSliceStart(getClass().getName(),52602);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x9zde814l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_214kb14kblusvn639.R.rethrow($CLV_t2$);}finally{__CLR4_5_214kb14kblusvn639.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_cnhans.test_toJavaObject",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),52602,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x9zde814l6() throws Exception{try{__CLR4_5_214kb14kblusvn639.R.inc(52602);
        __CLR4_5_214kb14kblusvn639.R.inc(52603);JSONObject obj = new JSONObject();
        __CLR4_5_214kb14kblusvn639.R.inc(52604);obj.put("d1", new Date());
        __CLR4_5_214kb14kblusvn639.R.inc(52605);obj.put("d2", System.currentTimeMillis());
        __CLR4_5_214kb14kblusvn639.R.inc(52606);obj.put("d3", GregorianCalendar.getInstance());
        __CLR4_5_214kb14kblusvn639.R.inc(52607);obj.put("d4", "2012-12-22");
        __CLR4_5_214kb14kblusvn639.R.inc(52608);obj.put("d5", "2012-12-22 12:11:11");
        __CLR4_5_214kb14kblusvn639.R.inc(52609);obj.put("d6", "2012-12-22 12:11:11.234");
        
        __CLR4_5_214kb14kblusvn639.R.inc(52610);obj.getObject("d1", Calendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52611);obj.getObject("d2", Calendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52612);obj.getObject("d3", Calendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52613);obj.getObject("d4", Calendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52614);obj.getObject("d5", Calendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52615);obj.getObject("d6", Calendar.class);

        __CLR4_5_214kb14kblusvn639.R.inc(52616);obj.getObject("d1", GregorianCalendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52617);obj.getObject("d2", GregorianCalendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52618);obj.getObject("d3", GregorianCalendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52619);obj.getObject("d4", GregorianCalendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52620);obj.getObject("d5", GregorianCalendar.class);
        __CLR4_5_214kb14kblusvn639.R.inc(52621);obj.getObject("d6", GregorianCalendar.class);
    }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}

    public static class VO {

        private Calendar calendar;

        public Calendar getCalendar() {try{__CLR4_5_214kb14kblusvn639.R.inc(52622);
            __CLR4_5_214kb14kblusvn639.R.inc(52623);return calendar;
        }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}

        public void setCalendar(Calendar calendar) {try{__CLR4_5_214kb14kblusvn639.R.inc(52624);
            __CLR4_5_214kb14kblusvn639.R.inc(52625);this.calendar = calendar;
        }finally{__CLR4_5_214kb14kblusvn639.R.flushNeeded();}}

    }
}
