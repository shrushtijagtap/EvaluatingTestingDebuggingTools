/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.date;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.JSONToken;
import com.alibaba.fastjson.serializer.CalendarCodec;
import com.alibaba.fastjson.serializer.SerializerFeature;


public class DateParseTest9 extends TestCase {static class __CLR4_1_101n9c1n9cluszwdqc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,76840,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static Random random = new Random();
    private TimeZone original = TimeZone.getDefault();
    private String[] zoneIds = TimeZone.getAvailableIDs();

    @Override
    public void setUp() {try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76800);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76801);int index = random.nextInt(zoneIds.length);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76802);TimeZone timeZone = TimeZone.getTimeZone(zoneIds[index]);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76803);TimeZone.setDefault(timeZone);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76804);JSON.defaultTimeZone = timeZone;
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}

    @Override
    public void tearDown () {try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76805);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76806);TimeZone.setDefault(original);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76807);JSON.defaultTimeZone = original;
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}

    public void test_date() throws Exception {__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceStart(getClass().getName(),76808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49um1n9k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n9c1n9cluszwdqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest9.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76808,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49um1n9k() throws Exception{try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76808);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76809);String text = "\"/Date(1242357713797+0800)/\"";
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76810);Date date = JSON.parseObject(text, Date.class);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76811);assertEquals(date.getTime(), 1242357713797L);
        
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76812);assertEquals(JSONToken.LITERAL_INT, CalendarCodec.instance.getFastMatchToken());

        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76813);text = "\"/Date(1242357713797+0545)/\"";
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76814);date = JSON.parseObject(text, Date.class);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76815);assertEquals(date.getTime(), 1242357713797L);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76816);assertEquals(JSONToken.LITERAL_INT, CalendarCodec.instance.getFastMatchToken());
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}
    
    public void test_error() throws Exception {__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceStart(getClass().getName(),76817);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1n9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n9c1n9cluszwdqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest9.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76817,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1n9t() throws Exception{try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76817);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76818);Exception error = null;
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76819);try {
            __CLR4_1_101n9c1n9cluszwdqc.R.inc(76820);JSON.parseObject("{\"date\":\"/Date(1242357713797A0800)/\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n9c1n9cluszwdqc.R.inc(76821);error = ex;
        }
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76822);assertNotNull(error);
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceStart(getClass().getName(),76823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1n9z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n9c1n9cluszwdqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest9.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76823,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1n9z() throws Exception{try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76823);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76824);Exception error = null;
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76825);try {
            __CLR4_1_101n9c1n9cluszwdqc.R.inc(76826);JSON.parseObject("{\"date\":\"/Date(1242357713797#0800)/\"}", VO.class);
        } catch (Exception ex) {
            __CLR4_1_101n9c1n9cluszwdqc.R.inc(76827);error = ex;
        }
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76828);assertNotNull(error);
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}

    public void test_dates_different_timeZones() {__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceStart(getClass().getName(),76829);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tljoms1na5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101n9c1n9cluszwdqc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101n9c1n9cluszwdqc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.date.DateParseTest9.test_dates_different_timeZones",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),76829,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tljoms1na5(){try{__CLR4_1_101n9c1n9cluszwdqc.R.inc(76829);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76830);Calendar cal = Calendar.getInstance();
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76831);Date now = cal.getTime();

        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76832);VO vo = new VO();
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76833);vo.date = now;

        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76834);String json = JSON.toJSONString(vo);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76835);VO result = JSON.parseObject(json, VO.class);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76836);assertEquals(vo.date, result.date);

        // with iso-format
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76837);json = JSON.toJSONString(vo, SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76838);result = JSON.parseObject(json, VO.class);
        __CLR4_1_101n9c1n9cluszwdqc.R.inc(76839);assertEquals(JSON.toJSONString(vo.date), JSON.toJSONString(result.date));
    }finally{__CLR4_1_101n9c1n9cluszwdqc.R.flushNeeded();}}

    public static class VO {
        public Date date;
    }
}
