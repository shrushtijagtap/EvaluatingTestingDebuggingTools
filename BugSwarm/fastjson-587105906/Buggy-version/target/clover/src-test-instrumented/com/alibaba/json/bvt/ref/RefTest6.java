/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class RefTest6 extends TestCase {static class __CLR4_1_101r8t1r8tluszwerf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81994,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    /**
     * A -> B -> C -> B -> A
     * 
     * @throws Exception
     */
    public void test_0() throws Exception {__CLR4_1_101r8t1r8tluszwerf.R.globalSliceStart(getClass().getName(),81965);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21r8t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r8t1r8tluszwerf.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r8t1r8tluszwerf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest6.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81965,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21r8t() throws Exception{try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81965);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81966);A a = new A();
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81967);B b = new B();
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81968);C c = new C();
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81969);a.setB(b);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81970);b.setC(c);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81971);c.setB(b);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81972);b.setA(a);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81973);JSONObject jsonObject = new JSONObject();
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81974);jsonObject.put("a", a);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81975);jsonObject.put("c", c);

        __CLR4_1_101r8t1r8tluszwerf.R.inc(81976);String text = JSON.toJSONString(jsonObject, SerializerFeature.PrettyFormat);
        __CLR4_1_101r8t1r8tluszwerf.R.inc(81977);System.out.println(text);
    }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

    private class A {

        private B b;

        public B getB() {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81978);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81979);return b;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81980);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81981);this.b = b;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}
    }

    private class B {

        private C c;
        private A a;

        public C getC() {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81982);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81983);return c;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

        public void setC(C c) {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81984);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81985);this.c = c;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

        public A getA() {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81986);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81987);return a;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81988);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81989);this.a = a;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}
    }

    private class C {

        private B b;

        public B getB() {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81990);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81991);return b;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_1_101r8t1r8tluszwerf.R.inc(81992);
            __CLR4_1_101r8t1r8tluszwerf.R.inc(81993);this.b = b;
        }finally{__CLR4_1_101r8t1r8tluszwerf.R.flushNeeded();}}
    }

}
