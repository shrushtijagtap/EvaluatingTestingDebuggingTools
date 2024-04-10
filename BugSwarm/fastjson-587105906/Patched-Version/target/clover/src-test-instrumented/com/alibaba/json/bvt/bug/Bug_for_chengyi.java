/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONCreator;
import junit.framework.TestCase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Bug_for_chengyi extends TestCase {static class __CLR4_5_213l613l6lusyjri5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51339,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_5_213l613l6lusyjri5.R.globalSliceStart(getClass().getName(),51306);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp213l6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213l613l6lusyjri5.R.rethrow($CLV_t2$);}finally{__CLR4_5_213l613l6lusyjri5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_chengyi.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51306,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp213l6() throws Exception{try{__CLR4_5_213l613l6lusyjri5.R.inc(51306);
        __CLR4_5_213l613l6lusyjri5.R.inc(51307);List<Pair<String, Integer>> pairList = new ArrayList();
        __CLR4_5_213l613l6lusyjri5.R.inc(51308);Pair<String, Integer> pair = Pair.of("cy", 1);
        __CLR4_5_213l613l6lusyjri5.R.inc(51309);pairList.add(pair);

        __CLR4_5_213l613l6lusyjri5.R.inc(51310);final String s = JSON.toJSONString(pairList);
        __CLR4_5_213l613l6lusyjri5.R.inc(51311);final List<Pair> pairs = JSONArray.parseArray(s, Pair.class);
        __CLR4_5_213l613l6lusyjri5.R.inc(51312);System.out.println();
    }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

    public static class Pair<A, B> implements Serializable {

        private static final long serialVersionUID = -2140946024027818984L;

        public final A fst;
        public final B snd;

        public Pair() {try{__CLR4_5_213l613l6lusyjri5.R.inc(51313);
            __CLR4_5_213l613l6lusyjri5.R.inc(51314);fst = null;
            __CLR4_5_213l613l6lusyjri5.R.inc(51315);snd = null;
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        @JSONCreator
        public Pair(A fst, B snd) {try{__CLR4_5_213l613l6lusyjri5.R.inc(51316);
            __CLR4_5_213l613l6lusyjri5.R.inc(51317);this.fst = fst;
            __CLR4_5_213l613l6lusyjri5.R.inc(51318);this.snd = snd;
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_5_213l613l6lusyjri5.R.inc(51319);
            __CLR4_5_213l613l6lusyjri5.R.inc(51320);return "[" + fst + "," + snd + "]";
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        private boolean equals(Object x, Object y) {try{__CLR4_5_213l613l6lusyjri5.R.inc(51321);
            __CLR4_5_213l613l6lusyjri5.R.inc(51322);return (x == null && y == null) || (x != null && x.equals(y));
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        @SuppressWarnings("rawtypes")
        @Override
        public boolean equals(Object other) {try{__CLR4_5_213l613l6lusyjri5.R.inc(51323);
            __CLR4_5_213l613l6lusyjri5.R.inc(51324);return other instanceof Pair && equals(fst, ((Pair) other).fst)
                    && equals(snd, ((Pair) other).snd);
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        /**
         * \u8986\u76d6hashCode\u65b9\u6cd5
         *
         * @return hashCode
         */
        @Override
        public int hashCode() {try{__CLR4_5_213l613l6lusyjri5.R.inc(51325);
            __CLR4_5_213l613l6lusyjri5.R.inc(51326);if ((((fst == null)&&(__CLR4_5_213l613l6lusyjri5.R.iget(51327)!=0|true))||(__CLR4_5_213l613l6lusyjri5.R.iget(51328)==0&false))) {{
                __CLR4_5_213l613l6lusyjri5.R.inc(51329);return ((((snd == null) )&&(__CLR4_5_213l613l6lusyjri5.R.iget(51330)!=0|true))||(__CLR4_5_213l613l6lusyjri5.R.iget(51331)==0&false))? 0 : snd.hashCode() + 1;
            } }else {__CLR4_5_213l613l6lusyjri5.R.inc(51332);if ((((snd == null)&&(__CLR4_5_213l613l6lusyjri5.R.iget(51333)!=0|true))||(__CLR4_5_213l613l6lusyjri5.R.iget(51334)==0&false))) {{
                __CLR4_5_213l613l6lusyjri5.R.inc(51335);return fst.hashCode() + 2;
            } }else {{
                __CLR4_5_213l613l6lusyjri5.R.inc(51336);return fst.hashCode() * 17 + snd.hashCode();
            }
        }}}finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

        public static <A, B> Pair<A, B> of(A a, B b) {try{__CLR4_5_213l613l6lusyjri5.R.inc(51337);
            __CLR4_5_213l613l6lusyjri5.R.inc(51338);return new Pair<A, B>(a, b);
        }finally{__CLR4_5_213l613l6lusyjri5.R.flushNeeded();}}

    }
}
