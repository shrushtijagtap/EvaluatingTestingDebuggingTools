/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class SqlDateDeserializerTest2 extends TestCase {static class __CLR4_1_101mct1mctluszwdi9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,75657,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101mct1mctluszwdi9.R.inc(75629);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75630);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101mct1mctluszwdi9.R.inc(75631);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101mct1mctluszwdi9.R.flushNeeded();}}
    
    
    public void test_sqlDate() throws Exception {__CLR4_1_101mct1mctluszwdi9.R.globalSliceStart(getClass().getName(),75632);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ln993q1mcw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101mct1mctluszwdi9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101mct1mctluszwdi9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.SqlDateDeserializerTest2.test_sqlDate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),75632,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ln993q1mcw() throws Exception{try{__CLR4_1_101mct1mctluszwdi9.R.inc(75632);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75633);java.util.Date date = new java.util.Date();
        __CLR4_1_101mct1mctluszwdi9.R.inc(75634);long millis = date.getTime();
        __CLR4_1_101mct1mctluszwdi9.R.inc(75635);long millis2 = (millis / 1000)  * 1000;
        
        __CLR4_1_101mct1mctluszwdi9.R.inc(75636);SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", JSON.defaultLocale);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75637);dateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75638);String text = dateFormat.format(millis);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75639);text = text.replace(' ', 'T');
        
        __CLR4_1_101mct1mctluszwdi9.R.inc(75640);SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", JSON.defaultLocale);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75641);dateFormat2.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101mct1mctluszwdi9.R.inc(75642);String text2 = dateFormat2.format(millis2);
        
        __CLR4_1_101mct1mctluszwdi9.R.inc(75643);Assert.assertNull(JSON.parseObject("null", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75644);Assert.assertNull(JSON.parseObject("\"\"", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75645);Assert.assertNull(JSON.parseArray("null", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75646);Assert.assertNull(JSON.parseArray("[null]", Date.class).get(0));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75647);Assert.assertNull(JSON.parseObject("{\"value\":null}", VO.class).getValue());
        
        __CLR4_1_101mct1mctluszwdi9.R.inc(75648);Assert.assertEquals(new Date(millis), JSON.parseObject("" + millis, Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75649);Assert.assertEquals(new Date(millis), JSON.parseObject("{\"@type\":\"java.sql.Date\",\"val\":" + millis + "}", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75650);Assert.assertEquals(new Date(millis), JSON.parseObject("\"" + millis + "\"", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75651);Assert.assertEquals(new Date(millis2), JSON.parseObject("\"" + text2 + "\"", Date.class));
        __CLR4_1_101mct1mctluszwdi9.R.inc(75652);Assert.assertEquals(new Date(millis), JSON.parseObject("\"" + text + "\"", Date.class));
        
        //System.out.println(JSON.toJSONString(new Time(millis), SerializerFeature.WriteClassName));
        
    }finally{__CLR4_1_101mct1mctluszwdi9.R.flushNeeded();}}

    public static class VO {

        private Date value;

        public Date getValue() {try{__CLR4_1_101mct1mctluszwdi9.R.inc(75653);
            __CLR4_1_101mct1mctluszwdi9.R.inc(75654);return value;
        }finally{__CLR4_1_101mct1mctluszwdi9.R.flushNeeded();}}

        public void setValue(Date value) {try{__CLR4_1_101mct1mctluszwdi9.R.inc(75655);
            __CLR4_1_101mct1mctluszwdi9.R.inc(75656);this.value = value;
        }finally{__CLR4_1_101mct1mctluszwdi9.R.flushNeeded();}}

    }
}
