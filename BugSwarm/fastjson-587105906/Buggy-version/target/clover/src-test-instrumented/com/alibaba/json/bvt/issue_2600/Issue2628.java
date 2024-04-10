/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_2600;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.math.BigInteger;

public class Issue2628 extends TestCase {static class __CLR4_1_101esu1esuluszwbt5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,65857,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101esu1esuluszwbt5.R.globalSliceStart(getClass().getName(),65838);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1esu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101esu1esuluszwbt5.R.rethrow($CLV_t2$);}finally{__CLR4_1_101esu1esuluszwbt5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_2600.Issue2628.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65838,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1esu() throws Exception{try{__CLR4_1_101esu1esuluszwbt5.R.inc(65838);
        __CLR4_1_101esu1esuluszwbt5.R.inc(65839);long MAX_LONG = Long.MAX_VALUE; //9223372036854775807
        __CLR4_1_101esu1esuluszwbt5.R.inc(65840);long MIN_LONG = Long.MIN_VALUE; //-9223372036854775808

        __CLR4_1_101esu1esuluszwbt5.R.inc(65841);String s1 = "9423372036854775807"; //-9423372036854775808
        __CLR4_1_101esu1esuluszwbt5.R.inc(65842);BigInteger bi1 = JSON.parseObject(s1, BigInteger.class); //\u6ca1\u95ee\u9898
        __CLR4_1_101esu1esuluszwbt5.R.inc(65843);assertEquals("9423372036854775807", bi1.toString());

        __CLR4_1_101esu1esuluszwbt5.R.inc(65844);BigInteger bi2 = new BigInteger(s1); //\u6ca1\u95ee\u9898
        __CLR4_1_101esu1esuluszwbt5.R.inc(65845);assertEquals("9423372036854775807", bi2.toString());

        __CLR4_1_101esu1esuluszwbt5.R.inc(65846);Tobject tobj1 = new Tobject();
        __CLR4_1_101esu1esuluszwbt5.R.inc(65847);tobj1.setBi(bi2); //\u6ca1\u95ee\u9898
        __CLR4_1_101esu1esuluszwbt5.R.inc(65848);assertEquals("9423372036854775807", tobj1.getBi().toString());__CLR4_1_101esu1esuluszwbt5.R.inc(65849);;

        __CLR4_1_101esu1esuluszwbt5.R.inc(65850);String s2 = JSON.toJSONString(tobj1);
        __CLR4_1_101esu1esuluszwbt5.R.inc(65851);Tobject tobj2 = JSON.parseObject(s2, Tobject.class);  //\u6709\u95ee\u9898
        __CLR4_1_101esu1esuluszwbt5.R.inc(65852);assertEquals("9423372036854775807", tobj2.getBi().toString());
    }finally{__CLR4_1_101esu1esuluszwbt5.R.flushNeeded();}}

    static class Tobject {
        private BigInteger bi;

        public BigInteger getBi() {try{__CLR4_1_101esu1esuluszwbt5.R.inc(65853);
            __CLR4_1_101esu1esuluszwbt5.R.inc(65854);return bi;
        }finally{__CLR4_1_101esu1esuluszwbt5.R.flushNeeded();}}
        public void setBi(BigInteger bi) {try{__CLR4_1_101esu1esuluszwbt5.R.inc(65855);
            __CLR4_1_101esu1esuluszwbt5.R.inc(65856);this.bi = bi;
        }finally{__CLR4_1_101esu1esuluszwbt5.R.flushNeeded();}}
    }
}
