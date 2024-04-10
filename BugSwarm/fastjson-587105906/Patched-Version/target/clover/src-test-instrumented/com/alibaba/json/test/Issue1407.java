/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.util.IdentityHashMap;
import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by wenshao on 14/08/2017.
 */
public class Issue1407 extends TestCase {static class __CLR4_5_221ga21galusyjwg6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,95229,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_221ga21galusyjwg6.R.globalSliceStart(getClass().getName(),95194);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb21ga();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_221ga21galusyjwg6.R.rethrow($CLV_t2$);}finally{__CLR4_5_221ga21galusyjwg6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.Issue1407.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),95194,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb21ga() throws Exception{try{__CLR4_5_221ga21galusyjwg6.R.inc(95194);
        __CLR4_5_221ga21galusyjwg6.R.inc(95195);final String key = "k";
        __CLR4_5_221ga21galusyjwg6.R.inc(95196);final IdentityHashMap map = new IdentityHashMap(2);
        __CLR4_5_221ga21galusyjwg6.R.inc(95197);final Random ran = new Random();

        __CLR4_5_221ga21galusyjwg6.R.inc(95198);new Thread() {
            public void run() {try{__CLR4_5_221ga21galusyjwg6.R.inc(95199);
                __CLR4_5_221ga21galusyjwg6.R.inc(95200);while(true) {{
                    __CLR4_5_221ga21galusyjwg6.R.inc(95201);String kk = (key + ran.nextInt(2));
                    __CLR4_5_221ga21galusyjwg6.R.inc(95202);if ((((map.get(kk) != null)&&(__CLR4_5_221ga21galusyjwg6.R.iget(95203)!=0|true))||(__CLR4_5_221ga21galusyjwg6.R.iget(95204)==0&false))) {{
//                        System.out.println("\tskip_a " + kk);
                        __CLR4_5_221ga21galusyjwg6.R.inc(95205);continue;
                    }
//			synchronized(map) {
                    }__CLR4_5_221ga21galusyjwg6.R.inc(95206);map.put(kk, kk);

                    __CLR4_5_221ga21galusyjwg6.R.inc(95207);System.out.println("\tput_a " + kk);
//			}
                    __CLR4_5_221ga21galusyjwg6.R.inc(95208);Object val = map.get(kk);
                    __CLR4_5_221ga21galusyjwg6.R.inc(95209);if((((val == null)&&(__CLR4_5_221ga21galusyjwg6.R.iget(95210)!=0|true))||(__CLR4_5_221ga21galusyjwg6.R.iget(95211)==0&false))) {{
                        __CLR4_5_221ga21galusyjwg6.R.inc(95212);System.err.println("err_a : " + kk);
                    }
                }}
            }}finally{__CLR4_5_221ga21galusyjwg6.R.flushNeeded();}}
        }.start();

        __CLR4_5_221ga21galusyjwg6.R.inc(95213);new Thread() {
            public void run() {try{__CLR4_5_221ga21galusyjwg6.R.inc(95214);
                __CLR4_5_221ga21galusyjwg6.R.inc(95215);while(true) {{
                    __CLR4_5_221ga21galusyjwg6.R.inc(95216);String kk = (key + ran.nextInt(2));
//			synchronized(map) {
                    __CLR4_5_221ga21galusyjwg6.R.inc(95217);if ((((map.get(kk) != null)&&(__CLR4_5_221ga21galusyjwg6.R.iget(95218)!=0|true))||(__CLR4_5_221ga21galusyjwg6.R.iget(95219)==0&false))) {{
//                        System.out.println("\tskip_b " + kk);
                        __CLR4_5_221ga21galusyjwg6.R.inc(95220);continue;
                    }
                    }__CLR4_5_221ga21galusyjwg6.R.inc(95221);map.put(kk, kk);

                    __CLR4_5_221ga21galusyjwg6.R.inc(95222);System.out.println("\tput_b " + kk);
//			}
                    __CLR4_5_221ga21galusyjwg6.R.inc(95223);Object val = map.get(kk);
                    __CLR4_5_221ga21galusyjwg6.R.inc(95224);if((((val == null)&&(__CLR4_5_221ga21galusyjwg6.R.iget(95225)!=0|true))||(__CLR4_5_221ga21galusyjwg6.R.iget(95226)==0&false))) {{
                        __CLR4_5_221ga21galusyjwg6.R.inc(95227);System.err.println("err_b : " + kk);
                    }
                }}
            }}finally{__CLR4_5_221ga21galusyjwg6.R.flushNeeded();}}
        }.start();

        __CLR4_5_221ga21galusyjwg6.R.inc(95228);Thread.sleep(1000 * 1000);
    }finally{__CLR4_5_221ga21galusyjwg6.R.flushNeeded();}}

}
