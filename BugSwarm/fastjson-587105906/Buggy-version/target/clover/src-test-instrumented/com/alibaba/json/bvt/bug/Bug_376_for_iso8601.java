/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 2015 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.json.bvt.bug;

import java.text.DateFormat;
import java.util.Date;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class Bug_376_for_iso8601 extends TestCase {static class __CLR4_1_1013rz13rzluszw7dx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51562,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_fix() {__CLR4_1_1013rz13rzluszw7dx.R.globalSliceStart(getClass().getName(),51551);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10fqcw5t13rz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013rz13rzluszw7dx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013rz13rzluszw7dx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_376_for_iso8601.test_fix",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51551,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10fqcw5t13rz(){try{__CLR4_1_1013rz13rzluszw7dx.R.inc(51551);

        __CLR4_1_1013rz13rzluszw7dx.R.inc(51552);String s = "{date: \"2015-07-22T19:13:42Z\"}";
        __CLR4_1_1013rz13rzluszw7dx.R.inc(51553);String s2 = "{date: \"2015-07-22T19:13:42.000Z\"}";

        __CLR4_1_1013rz13rzluszw7dx.R.inc(51554);MyObj o = JSON.parseObject(s, MyObj.class, Feature.AllowISO8601DateFormat);
        __CLR4_1_1013rz13rzluszw7dx.R.inc(51555);MyObj o2 = JSON.parseObject(s2, MyObj.class, Feature.AllowISO8601DateFormat);

        __CLR4_1_1013rz13rzluszw7dx.R.inc(51556);System.out.println(DateFormat.getDateTimeInstance().format(o.getDate()));
        __CLR4_1_1013rz13rzluszw7dx.R.inc(51557);System.out.println(DateFormat.getDateTimeInstance().format(o2.getDate()));

        // \u4fee\u590d\u4e4b\u524d\u8f93\u51fa
        // 2015-7-22 19:13:42
        // 2015-7-23 3:13:42

        // \u4fee\u590d\u4e4b\u540e\u8f93\u51fa
        // 2015-7-23 3:13:42
        // 2015-7-23 3:13:42

    }finally{__CLR4_1_1013rz13rzluszw7dx.R.flushNeeded();}}

    static class MyObj {

        private Date date;

        public Date getDate() {try{__CLR4_1_1013rz13rzluszw7dx.R.inc(51558);
            __CLR4_1_1013rz13rzluszw7dx.R.inc(51559);return date;
        }finally{__CLR4_1_1013rz13rzluszw7dx.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_1013rz13rzluszw7dx.R.inc(51560);
            __CLR4_1_1013rz13rzluszw7dx.R.inc(51561);this.date = date;
        }finally{__CLR4_1_1013rz13rzluszw7dx.R.flushNeeded();}}
    }

}
