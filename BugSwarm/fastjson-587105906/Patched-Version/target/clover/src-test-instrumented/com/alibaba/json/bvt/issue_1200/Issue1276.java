/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

/**
 * Created by wenshao on 18/06/2017.
 */
public class Issue1276 extends TestCase {static class __CLR4_5_219rr19rrlusyjsr2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59353,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_219rr19rrlusyjsr2.R.globalSliceStart(getClass().getName(),59319);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19rr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219rr19rrlusyjsr2.R.rethrow($CLV_t2$);}finally{__CLR4_5_219rr19rrlusyjsr2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1276.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59319,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19rr() throws Exception{try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59319);
        __CLR4_5_219rr19rrlusyjsr2.R.inc(59320);MyException myException = new MyException(100,"error msg");
        __CLR4_5_219rr19rrlusyjsr2.R.inc(59321);String str = JSON.toJSONString(myException);
        __CLR4_5_219rr19rrlusyjsr2.R.inc(59322);System.out.println(str);

        __CLR4_5_219rr19rrlusyjsr2.R.inc(59323);MyException myException1 = JSON.parseObject(str, MyException.class);
        __CLR4_5_219rr19rrlusyjsr2.R.inc(59324);assertEquals(myException.getCode(), myException1.getCode());

        __CLR4_5_219rr19rrlusyjsr2.R.inc(59325);String str1 = JSON.toJSONString(myException1);
        __CLR4_5_219rr19rrlusyjsr2.R.inc(59326);assertEquals(str, str1);

    }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

    public static class MyException extends RuntimeException{
        private static final long serialVersionUID = 7815426752583648734L;
        private long code;

        public MyException() {
            super();__CLR4_5_219rr19rrlusyjsr2.R.inc(59328);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59327);
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(String message, Throwable cause) {
            super(message, cause);__CLR4_5_219rr19rrlusyjsr2.R.inc(59330);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59329);
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(String message) {
            super(message);__CLR4_5_219rr19rrlusyjsr2.R.inc(59332);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59331);
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(Throwable cause) {
            super(cause);__CLR4_5_219rr19rrlusyjsr2.R.inc(59334);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59333);
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(long code) {
            super();__CLR4_5_219rr19rrlusyjsr2.R.inc(59336);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59335);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59337);this.code = code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(long code, String message, Throwable cause) {
            super(message, cause);__CLR4_5_219rr19rrlusyjsr2.R.inc(59339);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59338);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59340);this.code = code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(long code, String message) {
            super(message);__CLR4_5_219rr19rrlusyjsr2.R.inc(59342);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59341);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59343);this.code = code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public MyException(long code, Throwable cause) {
            super(cause);__CLR4_5_219rr19rrlusyjsr2.R.inc(59345);try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59344);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59346);this.code = code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public void setCode(long code) {try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59347);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59348);this.code = code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        public long getCode() {try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59349);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59350);return code;
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_219rr19rrlusyjsr2.R.inc(59351);
            __CLR4_5_219rr19rrlusyjsr2.R.inc(59352);return "MyException{" +
                    "code=" + code +
                    '}';
        }finally{__CLR4_5_219rr19rrlusyjsr2.R.flushNeeded();}}
    }
}
