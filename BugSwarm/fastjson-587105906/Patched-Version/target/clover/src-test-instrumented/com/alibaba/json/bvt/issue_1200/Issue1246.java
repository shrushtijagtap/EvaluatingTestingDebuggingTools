/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1200;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;
import org.springframework.util.LinkedMultiValueMap;

/**
 * Created by kimmking on 06/06/2017.
 */
public class Issue1246 extends TestCase {static class __CLR4_5_21am61am6lusvn9of{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,60442,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21am61am6lusvn9of.R.globalSliceStart(getClass().getName(),60414);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1am6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21am61am6lusvn9of.R.rethrow($CLV_t2$);}finally{__CLR4_5_21am61am6lusvn9of.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1246.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),60414,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1am6() throws Exception{try{__CLR4_5_21am61am6lusvn9of.R.inc(60414);
        __CLR4_5_21am61am6lusvn9of.R.inc(60415);B b = new B();
        __CLR4_5_21am61am6lusvn9of.R.inc(60416);b.setX("xx");

        __CLR4_5_21am61am6lusvn9of.R.inc(60417);String test = JSON.toJSONString( b );
        __CLR4_5_21am61am6lusvn9of.R.inc(60418);System.out.println(test);
        __CLR4_5_21am61am6lusvn9of.R.inc(60419);assertEquals("{}", test);

        __CLR4_5_21am61am6lusvn9of.R.inc(60420);C c = new C();
        __CLR4_5_21am61am6lusvn9of.R.inc(60421);c.ab = b ;

        __CLR4_5_21am61am6lusvn9of.R.inc(60422);String testC = JSON.toJSONString( c );
        __CLR4_5_21am61am6lusvn9of.R.inc(60423);System.out.println(testC);
        __CLR4_5_21am61am6lusvn9of.R.inc(60424);assertEquals("{\"ab\":{}}",testC);

        __CLR4_5_21am61am6lusvn9of.R.inc(60425);D d = new D();
        __CLR4_5_21am61am6lusvn9of.R.inc(60426);d.setAb( b );

        __CLR4_5_21am61am6lusvn9of.R.inc(60427);String testD = JSON.toJSONString( d );
        __CLR4_5_21am61am6lusvn9of.R.inc(60428);System.out.println(testD);
        __CLR4_5_21am61am6lusvn9of.R.inc(60429);assertEquals("{\"ab\":{}}",testD);
    }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}

    public static class C{
        public A ab;
    }

    public static class D{
        private A ab;

        public A getAb() {try{__CLR4_5_21am61am6lusvn9of.R.inc(60430);
            __CLR4_5_21am61am6lusvn9of.R.inc(60431);return ab;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}

        public void setAb(A ab) {try{__CLR4_5_21am61am6lusvn9of.R.inc(60432);
            __CLR4_5_21am61am6lusvn9of.R.inc(60433);this.ab = ab;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}
    }

    public static class A{
        private String x;

        public String getX() {try{__CLR4_5_21am61am6lusvn9of.R.inc(60434);
            __CLR4_5_21am61am6lusvn9of.R.inc(60435);return x;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}

        public void setX(String x) {try{__CLR4_5_21am61am6lusvn9of.R.inc(60436);
            __CLR4_5_21am61am6lusvn9of.R.inc(60437);this.x = x;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}
    }

    public static class B extends A{
        private String x;

        @Override
        @JSONField(serialize = false)
        public String getX() {try{__CLR4_5_21am61am6lusvn9of.R.inc(60438);
            __CLR4_5_21am61am6lusvn9of.R.inc(60439);return x;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}

        @Override
        public void setX(String x) {try{__CLR4_5_21am61am6lusvn9of.R.inc(60440);
            __CLR4_5_21am61am6lusvn9of.R.inc(60441);this.x = x;
        }finally{__CLR4_5_21am61am6lusvn9of.R.flushNeeded();}}
    }
}
