/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.util.IdentityHashMap;
import junit.framework.TestCase;

import java.util.Random;

/**
 * Created by wenshao on 14/08/2017.
 */
public class Issue1407 extends TestCase {static class __CLR4_5_222ei22eilusvnjyp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96461,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_222ei22eilusvnjyp.R.globalSliceStart(getClass().getName(),96426);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb22ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222ei22eilusvnjyp.R.rethrow($CLV_t2$);}finally{__CLR4_5_222ei22eilusvnjyp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.Issue1407.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96426,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb22ei() throws Exception{try{__CLR4_5_222ei22eilusvnjyp.R.inc(96426);
        __CLR4_5_222ei22eilusvnjyp.R.inc(96427);final String key = "k";
        __CLR4_5_222ei22eilusvnjyp.R.inc(96428);final IdentityHashMap map = new IdentityHashMap(2);
        __CLR4_5_222ei22eilusvnjyp.R.inc(96429);final Random ran = new Random();

        __CLR4_5_222ei22eilusvnjyp.R.inc(96430);new Thread() {
            public void run() {try{__CLR4_5_222ei22eilusvnjyp.R.inc(96431);
                __CLR4_5_222ei22eilusvnjyp.R.inc(96432);while(true) {{
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96433);String kk = (key + ran.nextInt(2));
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96434);if ((((map.get(kk) != null)&&(__CLR4_5_222ei22eilusvnjyp.R.iget(96435)!=0|true))||(__CLR4_5_222ei22eilusvnjyp.R.iget(96436)==0&false))) {{
//                        System.out.println("\tskip_a " + kk);
                        __CLR4_5_222ei22eilusvnjyp.R.inc(96437);continue;
                    }
//			synchronized(map) {
                    }__CLR4_5_222ei22eilusvnjyp.R.inc(96438);map.put(kk, kk);

                    __CLR4_5_222ei22eilusvnjyp.R.inc(96439);System.out.println("\tput_a " + kk);
//			}
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96440);Object val = map.get(kk);
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96441);if((((val == null)&&(__CLR4_5_222ei22eilusvnjyp.R.iget(96442)!=0|true))||(__CLR4_5_222ei22eilusvnjyp.R.iget(96443)==0&false))) {{
                        __CLR4_5_222ei22eilusvnjyp.R.inc(96444);System.err.println("err_a : " + kk);
                    }
                }}
            }}finally{__CLR4_5_222ei22eilusvnjyp.R.flushNeeded();}}
        }.start();

        __CLR4_5_222ei22eilusvnjyp.R.inc(96445);new Thread() {
            public void run() {try{__CLR4_5_222ei22eilusvnjyp.R.inc(96446);
                __CLR4_5_222ei22eilusvnjyp.R.inc(96447);while(true) {{
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96448);String kk = (key + ran.nextInt(2));
//			synchronized(map) {
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96449);if ((((map.get(kk) != null)&&(__CLR4_5_222ei22eilusvnjyp.R.iget(96450)!=0|true))||(__CLR4_5_222ei22eilusvnjyp.R.iget(96451)==0&false))) {{
//                        System.out.println("\tskip_b " + kk);
                        __CLR4_5_222ei22eilusvnjyp.R.inc(96452);continue;
                    }
                    }__CLR4_5_222ei22eilusvnjyp.R.inc(96453);map.put(kk, kk);

                    __CLR4_5_222ei22eilusvnjyp.R.inc(96454);System.out.println("\tput_b " + kk);
//			}
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96455);Object val = map.get(kk);
                    __CLR4_5_222ei22eilusvnjyp.R.inc(96456);if((((val == null)&&(__CLR4_5_222ei22eilusvnjyp.R.iget(96457)!=0|true))||(__CLR4_5_222ei22eilusvnjyp.R.iget(96458)==0&false))) {{
                        __CLR4_5_222ei22eilusvnjyp.R.inc(96459);System.err.println("err_b : " + kk);
                    }
                }}
            }}finally{__CLR4_5_222ei22eilusvnjyp.R.flushNeeded();}}
        }.start();

        __CLR4_5_222ei22eilusvnjyp.R.inc(96460);Thread.sleep(1000 * 1000);
    }finally{__CLR4_5_222ei22eilusvnjyp.R.flushNeeded();}}

}
