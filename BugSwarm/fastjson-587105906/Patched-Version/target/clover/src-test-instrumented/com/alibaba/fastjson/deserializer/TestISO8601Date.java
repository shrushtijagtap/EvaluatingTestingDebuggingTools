/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.fastjson.deserializer;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import org.junit.*;

import java.util.*;

/**
 * Issue #1884 Test Case
 *
 * @author cnzgray@qq.com
 * @since 2018-05-31 17:15
 */
public class TestISO8601Date {static class __CLR4_5_2v8wv8wlusyjpjp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,40526,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    @Before
    public void init() {try{__CLR4_5_2v8wv8wlusyjpjp.R.inc(40496);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40497);JSON.DEFAULT_PARSER_FEATURE |= Feature.AllowISO8601DateFormat.mask;
    }finally{__CLR4_5_2v8wv8wlusyjpjp.R.flushNeeded();}}

    @Test
    public void testBug1884() {__CLR4_5_2v8wv8wlusyjpjp.R.globalSliceStart(getClass().getName(),40498);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rmd7ckv8y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v8wv8wlusyjpjp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v8wv8wlusyjpjp.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.deserializer.TestISO8601Date.testBug1884",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40498,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rmd7ckv8y(){try{__CLR4_5_2v8wv8wlusyjpjp.R.inc(40498);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40499);Calendar cale = Calendar.getInstance();
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40500);cale.clear();
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40501);cale.setTimeZone( TimeZone.getTimeZone( "GMT+7" ) );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40502);cale.set( 2018, Calendar.MAY, 31, 19, 13, 42 );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40503);Date date = cale.getTime();

        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40504);String s1 = "{date: \"2018-05-31T19:13:42+07:00\"}"; // \u9519\u8bef\u7684
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40505);String s2 = "{date: \"2018-05-31T19:13:42.000+07:00\"}"; // \u6b63\u786e\u7684
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40506);Date date1 = JSON.parseObject( s1, JSONObject.class ).getDate( "date" );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40507);Date date2 = JSON.parseObject( s2, JSONObject.class ).getDate( "date" );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40508);assertEquals(date1, date2);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40509);assertEquals(date, date1);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40510);assertEquals(date, date2);
    }finally{__CLR4_5_2v8wv8wlusyjpjp.R.flushNeeded();}}

    @Test
    public void testBug376() {__CLR4_5_2v8wv8wlusyjpjp.R.globalSliceStart(getClass().getName(),40511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t7ybe1v9b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2v8wv8wlusyjpjp.R.rethrow($CLV_t2$);}finally{__CLR4_5_2v8wv8wlusyjpjp.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.deserializer.TestISO8601Date.testBug376",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),40511,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t7ybe1v9b(){try{__CLR4_5_2v8wv8wlusyjpjp.R.inc(40511);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40512);Calendar cale = Calendar.getInstance();
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40513);cale.clear();
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40514);cale.setTimeZone( TimeZone.getTimeZone( "GMT" ) );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40515);cale.set( 2018, Calendar.MAY, 31, 19, 13, 42 );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40516);Date date = cale.getTime();

        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40517);String s1 = "{date: \"2018-05-31T19:13:42Z\"}";
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40518);String s2 = "{date: \"2018-05-31T19:13:42.000Z\"}";

        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40519);Date date1 = JSON.parseObject( s1, JSONObject.class ).getDate( "date" );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40520);Date date2 = JSON.parseObject( s2, JSONObject.class ).getDate( "date" );

        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40521);assertEquals( date1, date2 );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40522);assertEquals( date, date1 );
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40523);assertEquals( date, date2 );
    }finally{__CLR4_5_2v8wv8wlusyjpjp.R.flushNeeded();}}

    private void assertEquals( Date expected, Date actual ) {try{__CLR4_5_2v8wv8wlusyjpjp.R.inc(40524);
        __CLR4_5_2v8wv8wlusyjpjp.R.inc(40525);Assert.assertEquals( 0, expected.compareTo( actual ) );
    }finally{__CLR4_5_2v8wv8wlusyjpjp.R.flushNeeded();}}
}
