/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

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

public class JavaBeanSerializerTest extends TestCase {static class __CLR4_5_21swg1swglusvngd3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,84201,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84112);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1swg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84112,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1swg() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84112);
        __CLR4_5_21swg1swglusvngd3.R.inc(84113);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21swg1swglusvngd3.R.inc(84114);A a = new A();
        __CLR4_5_21swg1swglusvngd3.R.inc(84115);a.getL0().add("A");
        __CLR4_5_21swg1swglusvngd3.R.inc(84116);a.getL0().add("B");

        __CLR4_5_21swg1swglusvngd3.R.inc(84117);JavaBeanSerializer serializer = new JavaBeanSerializer(A.class);
        __CLR4_5_21swg1swglusvngd3.R.inc(84118);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_5_21swg1swglusvngd3.R.inc(84119);Assert.assertEquals("{\"l0\":[\"A\",\"B\"]}", out.toString());
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84120);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1swo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84120,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1swo() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84120);
        __CLR4_5_21swg1swglusvngd3.R.inc(84121);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21swg1swglusvngd3.R.inc(84122);B a = new B();
        __CLR4_5_21swg1swglusvngd3.R.inc(84123);a.getL0().add("A");
        __CLR4_5_21swg1swglusvngd3.R.inc(84124);a.getL0().add("B");

        __CLR4_5_21swg1swglusvngd3.R.inc(84125);JavaBeanSerializer serializer = new JavaBeanSerializer(B.class);
        __CLR4_5_21swg1swglusvngd3.R.inc(84126);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_5_21swg1swglusvngd3.R.inc(84127);Assert.assertEquals("{\"l0\":[\"A\",\"B\"],\"l1\":[]}", out.toString());
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1sww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84128,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1sww() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84128);
        __CLR4_5_21swg1swglusvngd3.R.inc(84129);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21swg1swglusvngd3.R.inc(84130);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_5_21swg1swglusvngd3.R.inc(84131);serializer.write(new JSONSerializer(out), new F(new E(123)), null, null, 0);

        __CLR4_5_21swg1swglusvngd3.R.inc(84132);Assert.assertEquals("{\"e\":{\"id\":123}}", out.toString());
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84133);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1sx1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84133,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1sx1() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84133);
        __CLR4_5_21swg1swglusvngd3.R.inc(84134);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21swg1swglusvngd3.R.inc(84135);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_5_21swg1swglusvngd3.R.inc(84136);serializer.write(new JSONSerializer(out), new F(null), null, null, 0);

        __CLR4_5_21swg1swglusvngd3.R.inc(84137);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public void test_error_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84138);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jny3061sx6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84138,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jny3061sx6() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84138);
        __CLR4_5_21swg1swglusvngd3.R.inc(84139);JSONException error = null;
        __CLR4_5_21swg1swglusvngd3.R.inc(84140);try {
            __CLR4_5_21swg1swglusvngd3.R.inc(84141);SerializeWriter out = new SerializeWriter();
            __CLR4_5_21swg1swglusvngd3.R.inc(84142);JavaBeanSerializer serializer = new JavaBeanSerializer(C.class);
            __CLR4_5_21swg1swglusvngd3.R.inc(84143);serializer.write(new JSONSerializer(out), new C(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_5_21swg1swglusvngd3.R.inc(84144);error = e;
        }
        __CLR4_5_21swg1swglusvngd3.R.inc(84145);Assert.assertNotNull(error);
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public void test_error_1_s() throws Exception {__CLR4_5_21swg1swglusvngd3.R.globalSliceStart(getClass().getName(),84146);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28gazmw1sxe();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21swg1swglusvngd3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21swg1swglusvngd3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84146,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28gazmw1sxe() throws Exception{try{__CLR4_5_21swg1swglusvngd3.R.inc(84146);
        __CLR4_5_21swg1swglusvngd3.R.inc(84147);JSONException error = null;
        __CLR4_5_21swg1swglusvngd3.R.inc(84148);try {
            __CLR4_5_21swg1swglusvngd3.R.inc(84149);SerializeWriter out = new SerializeWriter();
            __CLR4_5_21swg1swglusvngd3.R.inc(84150);JavaBeanSerializer serializer = new JavaBeanSerializer(D.class);
            __CLR4_5_21swg1swglusvngd3.R.inc(84151);serializer.write(new JSONSerializer(out), new D(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_5_21swg1swglusvngd3.R.inc(84152);error = e;
        }
        __CLR4_5_21swg1swglusvngd3.R.inc(84153);Assert.assertNotNull(error);
    }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    public static class A {

        private List<String> l0 = new ArrayList<String>();

        public List<String> getL0() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84154);
            __CLR4_5_21swg1swglusvngd3.R.inc(84155);return l0;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84156);
            __CLR4_5_21swg1swglusvngd3.R.inc(84157);this.l0 = l0;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84158);
            __CLR4_5_21swg1swglusvngd3.R.inc(84159);return null;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public Object getx() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84160);
            __CLR4_5_21swg1swglusvngd3.R.inc(84161);return null;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84162);
            __CLR4_5_21swg1swglusvngd3.R.inc(84163);return true;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84164);
            __CLR4_5_21swg1swglusvngd3.R.inc(84165);return true;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}
    }

    public static class B {

        private Collection<String> l0 = new ArrayList<String>();
        private Collection<String> l1 = new ArrayList<String>();

        public Collection<String> getL1() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84166);
            __CLR4_5_21swg1swglusvngd3.R.inc(84167);return l1;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setL1(Collection<String> l1) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84168);
            __CLR4_5_21swg1swglusvngd3.R.inc(84169);this.l1 = l1;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public Collection<String> getL0() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84170);
            __CLR4_5_21swg1swglusvngd3.R.inc(84171);return l0;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setL0(Collection<String> l0) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84172);
            __CLR4_5_21swg1swglusvngd3.R.inc(84173);this.l0 = l0;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84174);
            __CLR4_5_21swg1swglusvngd3.R.inc(84175);return null;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public Object getx() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84176);
            __CLR4_5_21swg1swglusvngd3.R.inc(84177);return null;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84178);
            __CLR4_5_21swg1swglusvngd3.R.inc(84179);return true;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84180);
            __CLR4_5_21swg1swglusvngd3.R.inc(84181);return true;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}
    }

    public static class C {

        public List<String> getL0() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84182);
            __CLR4_5_21swg1swglusvngd3.R.inc(84183);throw new RuntimeException();
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84184);
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}
    }

    public static class D {

        public Collection<String> getL0() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84185);
            __CLR4_5_21swg1swglusvngd3.R.inc(84186);throw new RuntimeException();
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}
    }

    public static class E {

        private int id;

        public E(){try{__CLR4_5_21swg1swglusvngd3.R.inc(84187);
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public E(int id){try{__CLR4_5_21swg1swglusvngd3.R.inc(84188);
            __CLR4_5_21swg1swglusvngd3.R.inc(84189);this.id = id;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84190);
            __CLR4_5_21swg1swglusvngd3.R.inc(84191);return id;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84192);
            __CLR4_5_21swg1swglusvngd3.R.inc(84193);this.id = id;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}
    }

    public static class F {

        private E e;

        public F(){try{__CLR4_5_21swg1swglusvngd3.R.inc(84194);
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public F(E e){try{__CLR4_5_21swg1swglusvngd3.R.inc(84195);
            __CLR4_5_21swg1swglusvngd3.R.inc(84196);this.e = e;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public E getE() {try{__CLR4_5_21swg1swglusvngd3.R.inc(84197);
            __CLR4_5_21swg1swglusvngd3.R.inc(84198);return e;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

        public void setE(E e) {try{__CLR4_5_21swg1swglusvngd3.R.inc(84199);
            __CLR4_5_21swg1swglusvngd3.R.inc(84200);this.e = e;
        }finally{__CLR4_5_21swg1swglusvngd3.R.flushNeeded();}}

    }
}
