/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

import junit.framework.TestCase;
import org.junit.Assert;

public class DateFieldFormatTest extends TestCase {static class __CLR4_1_1019ge19geluszwa74{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58945,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_1_1019ge19geluszwa74.R.inc(58910);
        __CLR4_1_1019ge19geluszwa74.R.inc(58911);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_1019ge19geluszwa74.R.inc(58912);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_1019ge19geluszwa74.R.flushNeeded();}}
    
    public void test_format_() throws Exception {__CLR4_1_1019ge19geluszwa74.R.globalSliceStart(getClass().getName(),58913);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lqdmym19gh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019ge19geluszwa74.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019ge19geluszwa74.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.date.DateFieldFormatTest.test_format_",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58913,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lqdmym19gh() throws Exception{try{__CLR4_1_1019ge19geluszwa74.R.inc(58913);
        __CLR4_1_1019ge19geluszwa74.R.inc(58914);Date now = new Date();
        __CLR4_1_1019ge19geluszwa74.R.inc(58915);Model model = new Model();
        __CLR4_1_1019ge19geluszwa74.R.inc(58916);model.serverTime = now;
        __CLR4_1_1019ge19geluszwa74.R.inc(58917);model.publishTime = now;
        __CLR4_1_1019ge19geluszwa74.R.inc(58918);model.setStartDate( now );
        
        __CLR4_1_1019ge19geluszwa74.R.inc(58919);String text = JSON.toJSONString(model);
        __CLR4_1_1019ge19geluszwa74.R.inc(58920);System.out.println(text);

        __CLR4_1_1019ge19geluszwa74.R.inc(58921);SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        __CLR4_1_1019ge19geluszwa74.R.inc(58922);SimpleDateFormat df2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
        __CLR4_1_1019ge19geluszwa74.R.inc(58923);SimpleDateFormat df3 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

        __CLR4_1_1019ge19geluszwa74.R.inc(58924);df1.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1019ge19geluszwa74.R.inc(58925);df2.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1019ge19geluszwa74.R.inc(58926);df3.setTimeZone(JSON.defaultTimeZone);

        __CLR4_1_1019ge19geluszwa74.R.inc(58927);String t1 = df1.format(now);
        __CLR4_1_1019ge19geluszwa74.R.inc(58928);String t2 = df2.format(now);
        __CLR4_1_1019ge19geluszwa74.R.inc(58929);String t3 = df3.format(now);

        __CLR4_1_1019ge19geluszwa74.R.inc(58930);assertEquals("{\"publishTime\":\""+t2+"\",\"serverTime\":\""+t1+"\",\"startDate\":\""+t3+"\"}",text);
        
        __CLR4_1_1019ge19geluszwa74.R.inc(58931);Model model2 = JSON.parseObject(text, Model.class);
        __CLR4_1_1019ge19geluszwa74.R.inc(58932);SimpleDateFormat df4 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.CHINA);
        __CLR4_1_1019ge19geluszwa74.R.inc(58933);SimpleDateFormat df5 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        __CLR4_1_1019ge19geluszwa74.R.inc(58934);SimpleDateFormat df6 = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

        __CLR4_1_1019ge19geluszwa74.R.inc(58935);df4.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1019ge19geluszwa74.R.inc(58936);df5.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_1019ge19geluszwa74.R.inc(58937);df6.setTimeZone(JSON.defaultTimeZone);

        __CLR4_1_1019ge19geluszwa74.R.inc(58938);assertEquals(t2, df4.format(model2.publishTime));
        __CLR4_1_1019ge19geluszwa74.R.inc(58939);assertEquals(t1, df5.format(model2.serverTime));
        __CLR4_1_1019ge19geluszwa74.R.inc(58940);assertEquals(t3, df6.format(model2.getStartDate()));
        
    }finally{__CLR4_1_1019ge19geluszwa74.R.flushNeeded();}}

    public static class Model {

        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        public Date serverTime;

        @JSONField(format = "yyyy/MM/dd HH:mm:ss")
        public Date publishTime;

        @JSONField(format = "yyyy-MM-dd")
        private Date startDate;

        public Date getStartDate() {try{__CLR4_1_1019ge19geluszwa74.R.inc(58941);
            __CLR4_1_1019ge19geluszwa74.R.inc(58942);return startDate;
        }finally{__CLR4_1_1019ge19geluszwa74.R.flushNeeded();}}

        public void setStartDate(Date startDate) {try{__CLR4_1_1019ge19geluszwa74.R.inc(58943);
            __CLR4_1_1019ge19geluszwa74.R.inc(58944);this.startDate = startDate;
        }finally{__CLR4_1_1019ge19geluszwa74.R.flushNeeded();}}
    }
}
