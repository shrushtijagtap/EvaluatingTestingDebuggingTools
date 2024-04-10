/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.filters;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.PropertyPreFilter;
import com.alibaba.fastjson.serializer.SerializerFeature;

/**
 * @author wenshao
 */
public class PropertyPathTest extends TestCase {static class __CLR4_1_101wgp1wgpluszwflu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,88783,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_path() throws Exception {__CLR4_1_101wgp1wgpluszwflu.R.globalSliceStart(getClass().getName(),88729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151wgp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101wgp1wgpluszwflu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101wgp1wgpluszwflu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88729,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151wgp() throws Exception{try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88729);
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88730);A a = new A();
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88731);a.setId(123);

        __CLR4_1_101wgp1wgpluszwflu.R.inc(88732);B b = new B();
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88733);b.setId(234);

        __CLR4_1_101wgp1wgpluszwflu.R.inc(88734);C c = new C();
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88735);c.setId(345);

        __CLR4_1_101wgp1wgpluszwflu.R.inc(88736);D d = new D();
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88737);d.setId(456);

        __CLR4_1_101wgp1wgpluszwflu.R.inc(88738);a.setB(b);
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88739);b.setC(c);
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88740);b.setD(d);

        __CLR4_1_101wgp1wgpluszwflu.R.inc(88741);Assert.assertEquals("{\"b\":{\"c\":{\"id\":345},\"d\":{\"id\":456},\"id\":234},\"id\":123}",
                            JSON.toJSONString(a));
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88742);Assert.assertEquals("{\"b\":{\"c\":{\"id\":345},\"id\":234},\"id\":123}",
                            JSON.toJSONString(a, new MyPropertyPreFilter()));
        __CLR4_1_101wgp1wgpluszwflu.R.inc(88743);Assert.assertEquals("{'b':{'c':{'id':345},'id':234},'id':123}",
                            JSON.toJSONString(a, new MyPropertyPreFilter(), SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    public static class MyPropertyPreFilter implements PropertyPreFilter {

        public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88744);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88745);String path = serializer.getContext().toString() + "." + name;

            __CLR4_1_101wgp1wgpluszwflu.R.inc(88746);if ((((path.startsWith("$.b.d"))&&(__CLR4_1_101wgp1wgpluszwflu.R.iget(88747)!=0|true))||(__CLR4_1_101wgp1wgpluszwflu.R.iget(88748)==0&false))) {{
                __CLR4_1_101wgp1wgpluszwflu.R.inc(88749);return false;
            }

            }__CLR4_1_101wgp1wgpluszwflu.R.inc(88750);return true;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    }

    public static class A {

        private int id;
        private B   b;

        public int getId() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88751);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88752);return id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88753);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88754);this.id = id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public B getB() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88755);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88756);return b;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88757);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88758);this.b = b;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    }

    public static class B {

        private int id;
        private C   c;
        private D   d;

        public int getId() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88759);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88760);return id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88761);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88762);this.id = id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public C getC() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88763);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88764);return c;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setC(C c) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88765);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88766);this.c = c;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public D getD() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88767);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88768);return d;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setD(D d) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88769);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88770);this.d = d;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    }

    public static class C {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88771);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88772);return id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88773);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88774);this.id = id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88775);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88776);return name;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88777);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88778);this.name = name;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    }

    public static class D {

        private int id;

        public int getId() {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88779);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88780);return id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101wgp1wgpluszwflu.R.inc(88781);
            __CLR4_1_101wgp1wgpluszwflu.R.inc(88782);this.id = id;
        }finally{__CLR4_1_101wgp1wgpluszwflu.R.flushNeeded();}}

    }
}
