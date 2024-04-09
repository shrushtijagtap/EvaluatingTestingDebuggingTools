/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class CircularReferencesTest extends TestCase {static class __CLR4_5_21rp51rp5lusvng0z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,82588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rp51rp5lusvng0z.R.globalSliceStart(getClass().getName(),82553);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rp5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rp51rp5lusvng0z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rp51rp5lusvng0z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CircularReferencesTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82553,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rp5() throws Exception{try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82553);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82554);A a = new A();
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82555);B b = new B(a);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82556);a.setB(b);

        __CLR4_5_21rp51rp5lusvng0z.R.inc(82557);String text = JSON.toJSONString(a);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82558);A a1 = JSON.parseObject(text, A.class);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82559);Assert.assertTrue(a1 == a1.getB().getA());
    }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rp51rp5lusvng0z.R.globalSliceStart(getClass().getName(),82560);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rpc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rp51rp5lusvng0z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rp51rp5lusvng0z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CircularReferencesTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82560,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rpc() throws Exception{try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82560);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82561);A a = new A();
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82562);B b = new B(a);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82563);a.setB(b);

        __CLR4_5_21rp51rp5lusvng0z.R.inc(82564);String text = JSON.toJSONString(a, SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82565);A a1 = JSON.parseObject(text, A.class);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82566);Assert.assertTrue(a1 == a1.getB().getA());
    }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rp51rp5lusvng0z.R.globalSliceStart(getClass().getName(),82567);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rpj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rp51rp5lusvng0z.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rp51rp5lusvng0z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.CircularReferencesTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82567,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rpj() throws Exception{try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82567);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82568);A a = new A();
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82569);B b = new B(a);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82570);a.setB(b);

        __CLR4_5_21rp51rp5lusvng0z.R.inc(82571);String text = JSON.toJSONString(a, true);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82572);A a1 = JSON.parseObject(text, A.class);
        __CLR4_5_21rp51rp5lusvng0z.R.inc(82573);Assert.assertTrue(a1 == a1.getB().getA());
    }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

    public static class A {

        private B b;

        public A(){try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82574);
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

        public A(B b){try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82575);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82576);this.b = b;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

        public B getB() {try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82577);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82578);return b;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82579);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82580);this.b = b;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

    }

    public static class B {

        private A a;

        public B(){try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82581);

        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

        public B(A a){try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82582);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82583);this.a = a;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}

        public A getA() {try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82584);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82585);return a;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}
        
        public void setA(A a) {try{__CLR4_5_21rp51rp5lusvng0z.R.inc(82586);
            __CLR4_5_21rp51rp5lusvng0z.R.inc(82587);this.a = a;
        }finally{__CLR4_5_21rp51rp5lusvng0z.R.flushNeeded();}}
    }
}
