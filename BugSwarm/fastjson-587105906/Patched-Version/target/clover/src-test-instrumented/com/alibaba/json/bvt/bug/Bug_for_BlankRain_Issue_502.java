/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class Bug_for_BlankRain_Issue_502 extends TestCase {static class __CLR4_5_213x413x4lusvn5jc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,51787,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_issue() throws Exception {__CLR4_5_213x413x4lusvn5jc.R.globalSliceStart(getClass().getName(),51736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb13x4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213x413x4lusvn5jc.R.rethrow($CLV_t2$);}finally{__CLR4_5_213x413x4lusvn5jc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_BlankRain_Issue_502.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51736,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb13x4() throws Exception{try{__CLR4_5_213x413x4lusvn5jc.R.inc(51736);
        __CLR4_5_213x413x4lusvn5jc.R.inc(51737);People a1 = new People();
        __CLR4_5_213x413x4lusvn5jc.R.inc(51738);a1.set\u59d3\u540d("A");
        __CLR4_5_213x413x4lusvn5jc.R.inc(51739);a1.set\u7c7b\u578b("B");
        __CLR4_5_213x413x4lusvn5jc.R.inc(51740);a1.set\u72b6\u6001("C");
        __CLR4_5_213x413x4lusvn5jc.R.inc(51741);a1.set\u6ee1\u610f\u5ea6("D");
        __CLR4_5_213x413x4lusvn5jc.R.inc(51742);a1.set\u7edf\u8ba1("E");
        __CLR4_5_213x413x4lusvn5jc.R.inc(51743);a1.set\u65f6\u95f4("F");

        __CLR4_5_213x413x4lusvn5jc.R.inc(51744);String text = JSON.toJSONString(a1);
        __CLR4_5_213x413x4lusvn5jc.R.inc(51745);Assert.assertEquals("{\"\u59d3\u540d\":\"A\",\"\u65f6\u95f4\":\"F\",\"\u6ee1\u610f\u5ea6\":\"D\",\"\u72b6\u6001\":\"C\",\"\u7c7b\u578b\":\"B\",\"\u7edf\u8ba1\":\"E\"}", text);
        __CLR4_5_213x413x4lusvn5jc.R.inc(51746);System.out.println(text);
        
        __CLR4_5_213x413x4lusvn5jc.R.inc(51747);People a2 = JSON.parseObject(text, People.class);
        __CLR4_5_213x413x4lusvn5jc.R.inc(51748);Assert.assertEquals(a1.get\u59d3\u540d(), a2.get\u59d3\u540d());
        __CLR4_5_213x413x4lusvn5jc.R.inc(51749);Assert.assertEquals(a1.get\u7c7b\u578b(), a2.get\u7c7b\u578b());
        __CLR4_5_213x413x4lusvn5jc.R.inc(51750);Assert.assertEquals(a1.get\u72b6\u6001(), a2.get\u72b6\u6001());
        __CLR4_5_213x413x4lusvn5jc.R.inc(51751);Assert.assertEquals(a1.get\u6ee1\u610f\u5ea6(), a2.get\u6ee1\u610f\u5ea6());
        __CLR4_5_213x413x4lusvn5jc.R.inc(51752);Assert.assertEquals(a1.get\u7edf\u8ba1(), a2.get\u7edf\u8ba1());
        __CLR4_5_213x413x4lusvn5jc.R.inc(51753);Assert.assertEquals(a1.get\u65f6\u95f4(), a2.get\u65f6\u95f4());
    }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

    public static class People {

        private String \u59d3\u540d;
        private String \u7c7b\u578b;
        private String \u72b6\u6001;
        private String \u6ee1\u610f\u5ea6;
        private String \u7edf\u8ba1;
        private String \u65f6\u95f4;

        static List<String> head() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51754);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51755);List<String> h = new ArrayList<String>();

            __CLR4_5_213x413x4lusvn5jc.R.inc(51756);h.add("\u59d3\u540d");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51757);h.add("\u7c7b\u578b");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51758);h.add("\u72b6\u6001");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51759);h.add("\u6ee1\u610f\u5ea6");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51760);h.add("\u7edf\u8ba1");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51761);h.add("\u65f6\u95f4");
            __CLR4_5_213x413x4lusvn5jc.R.inc(51762);return h;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u59d3\u540d() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51763);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51764);return \u59d3\u540d;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u59d3\u540d(String \u59d3\u540d) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51765);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51766);this.\u59d3\u540d = \u59d3\u540d;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u7c7b\u578b() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51767);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51768);return \u7c7b\u578b;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u7c7b\u578b(String \u7c7b\u578b) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51769);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51770);this.\u7c7b\u578b = \u7c7b\u578b;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u72b6\u6001() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51771);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51772);return \u72b6\u6001;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u72b6\u6001(String \u72b6\u6001) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51773);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51774);this.\u72b6\u6001 = \u72b6\u6001;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u6ee1\u610f\u5ea6() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51775);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51776);return \u6ee1\u610f\u5ea6;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u6ee1\u610f\u5ea6(String \u6ee1\u610f\u5ea6) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51777);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51778);this.\u6ee1\u610f\u5ea6 = \u6ee1\u610f\u5ea6;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u7edf\u8ba1() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51779);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51780);return \u7edf\u8ba1;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u7edf\u8ba1(String \u7edf\u8ba1) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51781);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51782);this.\u7edf\u8ba1 = \u7edf\u8ba1;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public String get\u65f6\u95f4() {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51783);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51784);return \u65f6\u95f4;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

        public void set\u65f6\u95f4(String \u65f6\u95f4) {try{__CLR4_5_213x413x4lusvn5jc.R.inc(51785);
            __CLR4_5_213x413x4lusvn5jc.R.inc(51786);this.\u65f6\u95f4 = \u65f6\u95f4;
        }finally{__CLR4_5_213x413x4lusvn5jc.R.flushNeeded();}}

    }

}
