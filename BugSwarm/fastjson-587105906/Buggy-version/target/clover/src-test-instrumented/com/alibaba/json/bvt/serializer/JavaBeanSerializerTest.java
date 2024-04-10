/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.serializer.FieldSerializer;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.JavaBeanSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;

public class JavaBeanSerializerTest extends TestCase {static class __CLR4_1_101swr1swrluszwf1u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84212,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84123);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10skazm1swr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_0_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84123,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10skazm1swr() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84123);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84124);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101swr1swrluszwf1u.R.inc(84125);A a = new A();
        __CLR4_1_101swr1swrluszwf1u.R.inc(84126);a.getL0().add("A");
        __CLR4_1_101swr1swrluszwf1u.R.inc(84127);a.getL0().add("B");

        __CLR4_1_101swr1swrluszwf1u.R.inc(84128);JavaBeanSerializer serializer = new JavaBeanSerializer(A.class);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84129);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_1_101swr1swrluszwf1u.R.inc(84130);Assert.assertEquals("{\"l0\":[\"A\",\"B\"]}", out.toString());
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84131);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102xezup1swz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84131,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102xezup1swz() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84131);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84132);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101swr1swrluszwf1u.R.inc(84133);B a = new B();
        __CLR4_1_101swr1swrluszwf1u.R.inc(84134);a.getL0().add("A");
        __CLR4_1_101swr1swrluszwf1u.R.inc(84135);a.getL0().add("B");

        __CLR4_1_101swr1swrluszwf1u.R.inc(84136);JavaBeanSerializer serializer = new JavaBeanSerializer(B.class);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84137);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_1_101swr1swrluszwf1u.R.inc(84138);Assert.assertEquals("{\"l0\":[\"A\",\"B\"],\"l1\":[]}", out.toString());
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84139);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10529ops1sx7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_2_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84139,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10529ops1sx7() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84139);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84140);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101swr1swrluszwf1u.R.inc(84141);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84142);serializer.write(new JSONSerializer(out), new F(new E(123)), null, null, 0);

        __CLR4_1_101swr1swrluszwf1u.R.inc(84143);Assert.assertEquals("{\"e\":{\"id\":123}}", out.toString());
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84144);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10774dkv1sxc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_3_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84144,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10774dkv1sxc() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84144);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84145);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101swr1swrluszwf1u.R.inc(84146);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84147);serializer.write(new JSONSerializer(out), new F(null), null, null, 0);

        __CLR4_1_101swr1swrluszwf1u.R.inc(84148);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public void test_error_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84149);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jny3061sxh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84149,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jny3061sxh() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84149);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84150);JSONException error = null;
        __CLR4_1_101swr1swrluszwf1u.R.inc(84151);try {
            __CLR4_1_101swr1swrluszwf1u.R.inc(84152);SerializeWriter out = new SerializeWriter();
            __CLR4_1_101swr1swrluszwf1u.R.inc(84153);JavaBeanSerializer serializer = new JavaBeanSerializer(C.class);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84154);serializer.write(new JSONSerializer(out), new C(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_1_101swr1swrluszwf1u.R.inc(84155);error = e;
        }
        __CLR4_1_101swr1swrluszwf1u.R.inc(84156);Assert.assertNotNull(error);
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public void test_error_1_s() throws Exception {__CLR4_1_101swr1swrluszwf1u.R.globalSliceStart(getClass().getName(),84157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_108gazmw1sxp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101swr1swrluszwf1u.R.rethrow($CLV_t2$);}finally{__CLR4_1_101swr1swrluszwf1u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_1_s",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_108gazmw1sxp() throws Exception{try{__CLR4_1_101swr1swrluszwf1u.R.inc(84157);
        __CLR4_1_101swr1swrluszwf1u.R.inc(84158);JSONException error = null;
        __CLR4_1_101swr1swrluszwf1u.R.inc(84159);try {
            __CLR4_1_101swr1swrluszwf1u.R.inc(84160);SerializeWriter out = new SerializeWriter();
            __CLR4_1_101swr1swrluszwf1u.R.inc(84161);JavaBeanSerializer serializer = new JavaBeanSerializer(D.class);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84162);serializer.write(new JSONSerializer(out), new D(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_1_101swr1swrluszwf1u.R.inc(84163);error = e;
        }
        __CLR4_1_101swr1swrluszwf1u.R.inc(84164);Assert.assertNotNull(error);
    }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    public static class A {

        private List<String> l0 = new ArrayList<String>();

        public List<String> getL0() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84165);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84166);return l0;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84167);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84168);this.l0 = l0;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public Object get() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84169);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84170);return null;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public Object getx() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84171);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84172);return null;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public boolean is() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84173);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84174);return true;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84175);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84176);return true;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}
    }

    public static class B {

        private Collection<String> l0 = new ArrayList<String>();
        private Collection<String> l1 = new ArrayList<String>();

        public Collection<String> getL1() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84177);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84178);return l1;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setL1(Collection<String> l1) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84179);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84180);this.l1 = l1;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public Collection<String> getL0() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84181);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84182);return l0;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setL0(Collection<String> l0) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84183);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84184);this.l0 = l0;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public Object get() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84185);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84186);return null;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public Object getx() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84187);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84188);return null;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public boolean is() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84189);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84190);return true;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84191);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84192);return true;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}
    }

    public static class C {

        public List<String> getL0() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84193);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84194);throw new RuntimeException();
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84195);
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}
    }

    public static class D {

        public Collection<String> getL0() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84196);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84197);throw new RuntimeException();
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}
    }

    public static class E {

        private int id;

        public E(){try{__CLR4_1_101swr1swrluszwf1u.R.inc(84198);
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public E(int id){try{__CLR4_1_101swr1swrluszwf1u.R.inc(84199);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84200);this.id = id;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public int getId() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84201);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84202);return id;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84203);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84204);this.id = id;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}
    }

    public static class F {

        private E e;

        public F(){try{__CLR4_1_101swr1swrluszwf1u.R.inc(84205);
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public F(E e){try{__CLR4_1_101swr1swrluszwf1u.R.inc(84206);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84207);this.e = e;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public E getE() {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84208);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84209);return e;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

        public void setE(E e) {try{__CLR4_1_101swr1swrluszwf1u.R.inc(84210);
            __CLR4_1_101swr1swrluszwf1u.R.inc(84211);this.e = e;
        }finally{__CLR4_1_101swr1swrluszwf1u.R.flushNeeded();}}

    }
}
