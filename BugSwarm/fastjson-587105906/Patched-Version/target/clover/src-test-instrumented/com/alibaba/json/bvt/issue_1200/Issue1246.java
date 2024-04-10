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
public class Issue1246 extends TestCase {static class __CLR4_5_219ny19nylusyjsql{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59210,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_219ny19nylusyjsql.R.globalSliceStart(getClass().getName(),59182);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb19ny();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_219ny19nylusyjsql.R.rethrow($CLV_t2$);}finally{__CLR4_5_219ny19nylusyjsql.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1200.Issue1246.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59182,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb19ny() throws Exception{try{__CLR4_5_219ny19nylusyjsql.R.inc(59182);
        __CLR4_5_219ny19nylusyjsql.R.inc(59183);B b = new B();
        __CLR4_5_219ny19nylusyjsql.R.inc(59184);b.setX("xx");

        __CLR4_5_219ny19nylusyjsql.R.inc(59185);String test = JSON.toJSONString( b );
        __CLR4_5_219ny19nylusyjsql.R.inc(59186);System.out.println(test);
        __CLR4_5_219ny19nylusyjsql.R.inc(59187);assertEquals("{}", test);

        __CLR4_5_219ny19nylusyjsql.R.inc(59188);C c = new C();
        __CLR4_5_219ny19nylusyjsql.R.inc(59189);c.ab = b ;

        __CLR4_5_219ny19nylusyjsql.R.inc(59190);String testC = JSON.toJSONString( c );
        __CLR4_5_219ny19nylusyjsql.R.inc(59191);System.out.println(testC);
        __CLR4_5_219ny19nylusyjsql.R.inc(59192);assertEquals("{\"ab\":{}}",testC);

        __CLR4_5_219ny19nylusyjsql.R.inc(59193);D d = new D();
        __CLR4_5_219ny19nylusyjsql.R.inc(59194);d.setAb( b );

        __CLR4_5_219ny19nylusyjsql.R.inc(59195);String testD = JSON.toJSONString( d );
        __CLR4_5_219ny19nylusyjsql.R.inc(59196);System.out.println(testD);
        __CLR4_5_219ny19nylusyjsql.R.inc(59197);assertEquals("{\"ab\":{}}",testD);
    }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}

    public static class C{
        public A ab;
    }

    public static class D{
        private A ab;

        public A getAb() {try{__CLR4_5_219ny19nylusyjsql.R.inc(59198);
            __CLR4_5_219ny19nylusyjsql.R.inc(59199);return ab;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}

        public void setAb(A ab) {try{__CLR4_5_219ny19nylusyjsql.R.inc(59200);
            __CLR4_5_219ny19nylusyjsql.R.inc(59201);this.ab = ab;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}
    }

    public static class A{
        private String x;

        public String getX() {try{__CLR4_5_219ny19nylusyjsql.R.inc(59202);
            __CLR4_5_219ny19nylusyjsql.R.inc(59203);return x;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}

        public void setX(String x) {try{__CLR4_5_219ny19nylusyjsql.R.inc(59204);
            __CLR4_5_219ny19nylusyjsql.R.inc(59205);this.x = x;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}
    }

    public static class B extends A{
        private String x;

        @Override
        @JSONField(serialize = false)
        public String getX() {try{__CLR4_5_219ny19nylusyjsql.R.inc(59206);
            __CLR4_5_219ny19nylusyjsql.R.inc(59207);return x;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}

        @Override
        public void setX(String x) {try{__CLR4_5_219ny19nylusyjsql.R.inc(59208);
            __CLR4_5_219ny19nylusyjsql.R.inc(59209);this.x = x;
        }finally{__CLR4_5_219ny19nylusyjsql.R.flushNeeded();}}
    }
}
