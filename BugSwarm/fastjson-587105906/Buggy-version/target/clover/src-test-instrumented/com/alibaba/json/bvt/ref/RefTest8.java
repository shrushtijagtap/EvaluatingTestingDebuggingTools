/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class RefTest8 extends TestCase {static class __CLR4_1_101rao1raoluszwerj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82072,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bug_for_juqkai() throws Exception {__CLR4_1_101rao1raoluszwerj.R.globalSliceStart(getClass().getName(),82032);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103bllcu1rao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rao1raoluszwerj.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rao1raoluszwerj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest8.test_bug_for_juqkai",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82032,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103bllcu1rao() throws Exception{try{__CLR4_1_101rao1raoluszwerj.R.inc(82032);

        __CLR4_1_101rao1raoluszwerj.R.inc(82033);C c = new C();
 
        __CLR4_1_101rao1raoluszwerj.R.inc(82034);Map<String, Object> a = Collections.<String,Object>singletonMap("c", c);
        __CLR4_1_101rao1raoluszwerj.R.inc(82035);Map<String, Object> b = Collections.<String,Object>singletonMap("c", c);
        __CLR4_1_101rao1raoluszwerj.R.inc(82036);Map<String, Object> vo = new HashMap<String, Object>();
        __CLR4_1_101rao1raoluszwerj.R.inc(82037);vo.put("a", a);
        __CLR4_1_101rao1raoluszwerj.R.inc(82038);vo.put("b", b);

        __CLR4_1_101rao1raoluszwerj.R.inc(82039);Object[] root = new Object[] { vo };

        __CLR4_1_101rao1raoluszwerj.R.inc(82040);String text = JSON.toJSONString(root);
        __CLR4_1_101rao1raoluszwerj.R.inc(82041);System.out.println(text);

        __CLR4_1_101rao1raoluszwerj.R.inc(82042);VO[] array2 = JSON.parseObject(text, VO[].class);
        __CLR4_1_101rao1raoluszwerj.R.inc(82043);Assert.assertEquals(1, array2.length);
        __CLR4_1_101rao1raoluszwerj.R.inc(82044);Assert.assertNotNull(array2[0].getA());
        __CLR4_1_101rao1raoluszwerj.R.inc(82045);Assert.assertNotNull(array2[0].getB());
        __CLR4_1_101rao1raoluszwerj.R.inc(82046);Assert.assertNotNull(array2[0].getA().getC());
        __CLR4_1_101rao1raoluszwerj.R.inc(82047);Assert.assertNotNull(array2[0].getB().getC());
        __CLR4_1_101rao1raoluszwerj.R.inc(82048);Assert.assertSame(array2[0].getA().getC(), array2[0].getB().getC());
    }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

    private static class VO {

        private A a;
        private B b;

        public A getA() {try{__CLR4_1_101rao1raoluszwerj.R.inc(82049);
            __CLR4_1_101rao1raoluszwerj.R.inc(82050);return a;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101rao1raoluszwerj.R.inc(82051);
            __CLR4_1_101rao1raoluszwerj.R.inc(82052);this.a = a;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public B getB() {try{__CLR4_1_101rao1raoluszwerj.R.inc(82053);
            __CLR4_1_101rao1raoluszwerj.R.inc(82054);return b;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_1_101rao1raoluszwerj.R.inc(82055);
            __CLR4_1_101rao1raoluszwerj.R.inc(82056);this.b = b;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

    }

    private static class A {

        private C c;

        public A(){try{__CLR4_1_101rao1raoluszwerj.R.inc(82057);

        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public A(C c){try{__CLR4_1_101rao1raoluszwerj.R.inc(82058);
            __CLR4_1_101rao1raoluszwerj.R.inc(82059);this.c = c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public C getC() {try{__CLR4_1_101rao1raoluszwerj.R.inc(82060);
            __CLR4_1_101rao1raoluszwerj.R.inc(82061);return c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public void setC(C c) {try{__CLR4_1_101rao1raoluszwerj.R.inc(82062);
            __CLR4_1_101rao1raoluszwerj.R.inc(82063);this.c = c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

    }

    private static class B {

        private C c;

        public B(){try{__CLR4_1_101rao1raoluszwerj.R.inc(82064);

        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public B(C c){try{__CLR4_1_101rao1raoluszwerj.R.inc(82065);
            __CLR4_1_101rao1raoluszwerj.R.inc(82066);this.c = c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public C getC() {try{__CLR4_1_101rao1raoluszwerj.R.inc(82067);
            __CLR4_1_101rao1raoluszwerj.R.inc(82068);return c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

        public void setC(C c) {try{__CLR4_1_101rao1raoluszwerj.R.inc(82069);
            __CLR4_1_101rao1raoluszwerj.R.inc(82070);this.c = c;
        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}
    }

    private static class C {

        public C(){try{__CLR4_1_101rao1raoluszwerj.R.inc(82071);

        }finally{__CLR4_1_101rao1raoluszwerj.R.flushNeeded();}}

    }
}
