/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import junit.framework.TestCase;
import org.junit.Assert;

public class DateFieldFormatTest extends TestCase {static class __CLR4_5_218hv18hvlusyjsis{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,57702,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_218hv18hvlusyjsis.R.inc(57667);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57668);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_218hv18hvlusyjsis.R.inc(57669);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_218hv18hvlusyjsis.R.flushNeeded();}}
    
    public void test_format_() throws Exception {__CLR4_5_218hv18hvlusyjsis.R.globalSliceStart(getClass().getName(),57670);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lqdmym18hy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_218hv18hvlusyjsis.R.rethrow($CLV_t2$);}finally{__CLR4_5_218hv18hvlusyjsis.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldFormatTest.test_format_",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),57670,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lqdmym18hy() throws Exception{try{__CLR4_5_218hv18hvlusyjsis.R.inc(57670);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57671);Date now = new Date();
        __CLR4_5_218hv18hvlusyjsis.R.inc(57672);Model model = new Model();
        __CLR4_5_218hv18hvlusyjsis.R.inc(57673);model.serverTime = now;
        __CLR4_5_218hv18hvlusyjsis.R.inc(57674);model.publishTime = now;
        __CLR4_5_218hv18hvlusyjsis.R.inc(57675);model.setStartDate( now );
        
        __CLR4_5_218hv18hvlusyjsis.R.inc(57676);String text = JSON.toJSONString(model);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57677);System.out.println(text);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57678);SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57679);SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57680);SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57681);df1.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57682);df2.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57683);df3.setTimeZone(JSON.defaultTimeZone);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57684);String t1 = df1.format(now);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57685);String t2 = df2.format(now);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57686);String t3 = df3.format(now);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57687);assertEquals("{\"publishTime\":\""+t2+"\",\"serverTime\":\""+t1+"\",\"startDate\":\""+t3+"\"}",text);
        
        __CLR4_5_218hv18hvlusyjsis.R.inc(57688);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57689);SimpleDateFormat df4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57690);SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57691);SimpleDateFormat df6 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57692);df4.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57693);df5.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_218hv18hvlusyjsis.R.inc(57694);df6.setTimeZone(JSON.defaultTimeZone);

        __CLR4_5_218hv18hvlusyjsis.R.inc(57695);assertEquals(t2, df4.format(model2.publishTime));
        __CLR4_5_218hv18hvlusyjsis.R.inc(57696);assertEquals(t1, df5.format(model2.serverTime));
        __CLR4_5_218hv18hvlusyjsis.R.inc(57697);assertEquals(t3, df6.format(model2.getStartDate()));
        
    }finally{__CLR4_5_218hv18hvlusyjsis.R.flushNeeded();}}

    public static class Model {

        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date serverTime;

        @JSONField(format = "yyyy/MM/dd HH:mm:ss")
        public Date publishTime;

        @JSONField(format = "yyyy-MM-dd")
        private Date startDate;

        public Date getStartDate() {try{__CLR4_5_218hv18hvlusyjsis.R.inc(57698);
            __CLR4_5_218hv18hvlusyjsis.R.inc(57699);return startDate;
        }finally{__CLR4_5_218hv18hvlusyjsis.R.flushNeeded();}}

        public void setStartDate(Date startDate) {try{__CLR4_5_218hv18hvlusyjsis.R.inc(57700);
            __CLR4_5_218hv18hvlusyjsis.R.inc(57701);this.startDate = startDate;
        }finally{__CLR4_5_218hv18hvlusyjsis.R.flushNeeded();}}
    }
}
