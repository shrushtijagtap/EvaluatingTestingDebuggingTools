/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * Created by wenshao on 16/05/2017.
 */
public class Issue1202 extends TestCase {static class __CLR4_5_219jd19jdlusyjson{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59028,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_219jd19jdlusyjson.R.inc(59017);
        __CLR4_5_219jd19jdlusyjson.R.inc(59018);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_219jd19jdlusyjson.R.inc(59019);JSON.defaultLocale = Locale.US;
    }finally{__CLR4_5_219jd19jdlusyjson.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_219jd19jdlusyjson.R.globalSliceStart(getClass().getName(),59020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19jg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219jd19jdlusyjson.R.rethrow($CLV_t2$);}finally{__CLR4_5_219jd19jdlusyjson.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1202.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19jg() throws Exception{try{__CLR4_5_219jd19jdlusyjson.R.inc(59020);
        __CLR4_5_219jd19jdlusyjson.R.inc(59021);String text = "{\"date\":\"Apr 27, 2017 5:02:17 PM\"}";
        __CLR4_5_219jd19jdlusyjson.R.inc(59022);Model model = JSON.parseObject(text, Model.class);
        __CLR4_5_219jd19jdlusyjson.R.inc(59023);assertNotNull(model.date);
//        assertEquals("{\"date\":\"Apr 27, 2017 5:02:17 PM\"}", JSON.toJSONString(model));
    }finally{__CLR4_5_219jd19jdlusyjson.R.flushNeeded();}}

    public static class Model {
        @JSONField(format = "MMM dd, yyyy h:mm:ss aa")
        private java.util.Date date;

        public Date getDate() {try{__CLR4_5_219jd19jdlusyjson.R.inc(59024);
            __CLR4_5_219jd19jdlusyjson.R.inc(59025);return date;
        }finally{__CLR4_5_219jd19jdlusyjson.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_219jd19jdlusyjson.R.inc(59026);
            __CLR4_5_219jd19jdlusyjson.R.inc(59027);this.date = date;
        }finally{__CLR4_5_219jd19jdlusyjson.R.flushNeeded();}}
    }
}
