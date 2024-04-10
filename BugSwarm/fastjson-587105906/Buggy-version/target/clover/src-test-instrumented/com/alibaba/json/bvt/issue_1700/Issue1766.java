/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1700;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;

import java.util.Date;

public class Issue1766 extends TestCase {static class __CLR4_1_101dd31dd3luszwb90{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,63992,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101dd31dd3luszwb90.R.globalSliceStart(getClass().getName(),63975);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1dd3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101dd31dd3luszwb90.R.rethrow($CLV_t2$);}finally{__CLR4_1_101dd31dd3luszwb90.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.Issue1766.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),63975,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1dd3() throws Exception{try{__CLR4_1_101dd31dd3luszwb90.R.inc(63975);
// succ
        __CLR4_1_101dd31dd3luszwb90.R.inc(63976);String json = "{\"name\":\"\u5f20\u4e09\"\n, \"birthday\":\"2017-01-01 01:01:01\"}";
        __CLR4_1_101dd31dd3luszwb90.R.inc(63977);User user = JSON.parseObject(json, User.class);
        __CLR4_1_101dd31dd3luszwb90.R.inc(63978);assertEquals("\u5f20\u4e09", user.getName());
        __CLR4_1_101dd31dd3luszwb90.R.inc(63979);assertNotNull(user.getBirthday());

        // failed
        __CLR4_1_101dd31dd3luszwb90.R.inc(63980);json = "{\"name\":\"\u5f20\u4e09\", \"birthday\":\"2017-01-01 01:01:02\"\n}";
        __CLR4_1_101dd31dd3luszwb90.R.inc(63981);user = JSON.parseObject(json, User.class);// will exception
        __CLR4_1_101dd31dd3luszwb90.R.inc(63982);assertEquals("\u5f20\u4e09", user.getName());
        __CLR4_1_101dd31dd3luszwb90.R.inc(63983);assertNotNull(user.getBirthday());
    }finally{__CLR4_1_101dd31dd3luszwb90.R.flushNeeded();}}

    public static class User
    {
        private String name;

        @JSONField(format = "yyyy-MM-dd HH:mm:ss")
        private Date birthday;

        public String getName()
        {try{__CLR4_1_101dd31dd3luszwb90.R.inc(63984);
            __CLR4_1_101dd31dd3luszwb90.R.inc(63985);return name;
        }finally{__CLR4_1_101dd31dd3luszwb90.R.flushNeeded();}}

        public void setName(String name)
        {try{__CLR4_1_101dd31dd3luszwb90.R.inc(63986);
            __CLR4_1_101dd31dd3luszwb90.R.inc(63987);this.name = name;
        }finally{__CLR4_1_101dd31dd3luszwb90.R.flushNeeded();}}

        public Date getBirthday()
        {try{__CLR4_1_101dd31dd3luszwb90.R.inc(63988);
            __CLR4_1_101dd31dd3luszwb90.R.inc(63989);return birthday;
        }finally{__CLR4_1_101dd31dd3luszwb90.R.flushNeeded();}}

        public void setBirthday(Date birthday)
        {try{__CLR4_1_101dd31dd3luszwb90.R.inc(63990);
            __CLR4_1_101dd31dd3luszwb90.R.inc(63991);this.birthday = birthday;
        }finally{__CLR4_1_101dd31dd3luszwb90.R.flushNeeded();}}
    }
}
