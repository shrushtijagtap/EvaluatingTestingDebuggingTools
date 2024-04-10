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

public class JavaBeanSerializerTest extends TestCase {static class __CLR4_5_21ry81ry8lusyjuyr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82969,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2skazm1ry8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_0_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2skazm1ry8() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82880);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82881);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82882);A a = new A();
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82883);a.getL0().add("A");
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82884);a.getL0().add("B");

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82885);JavaBeanSerializer serializer = new JavaBeanSerializer(A.class);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82886);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82887);Assert.assertEquals("{\"l0\":[\"A\",\"B\"]}", out.toString());
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public void test_1_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82888);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22xezup1ryg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82888,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22xezup1ryg() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82888);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82889);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82890);B a = new B();
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82891);a.getL0().add("A");
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82892);a.getL0().add("B");

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82893);JavaBeanSerializer serializer = new JavaBeanSerializer(B.class);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82894);serializer.write(new JSONSerializer(out), a, null, null, 0);

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82895);Assert.assertEquals("{\"l0\":[\"A\",\"B\"],\"l1\":[]}", out.toString());
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public void test_2_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82896);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2529ops1ryo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_2_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82896,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2529ops1ryo() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82896);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82897);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82898);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82899);serializer.write(new JSONSerializer(out), new F(new E(123)), null, null, 0);

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82900);Assert.assertEquals("{\"e\":{\"id\":123}}", out.toString());
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public void test_3_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82901);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2774dkv1ryt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_3_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82901,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2774dkv1ryt() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82901);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82902);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82903);JavaBeanSerializer serializer = new JavaBeanSerializer(F.class);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82904);serializer.write(new JSONSerializer(out), new F(null), null, null, 0);

        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82905);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public void test_error_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82906);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jny3061ryy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82906,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jny3061ryy() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82906);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82907);JSONException error = null;
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82908);try {
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82909);SerializeWriter out = new SerializeWriter();
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82910);JavaBeanSerializer serializer = new JavaBeanSerializer(C.class);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82911);serializer.write(new JSONSerializer(out), new C(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82912);error = e;
        }
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82913);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public void test_error_1_s() throws Exception {__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceStart(getClass().getName(),82914);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_28gazmw1rz6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ry81ry8lusyjuyr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ry81ry8lusyjuyr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JavaBeanSerializerTest.test_error_1_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82914,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_28gazmw1rz6() throws Exception{try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82914);
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82915);JSONException error = null;
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82916);try {
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82917);SerializeWriter out = new SerializeWriter();
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82918);JavaBeanSerializer serializer = new JavaBeanSerializer(D.class);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82919);serializer.write(new JSONSerializer(out), new D(), null, null, 0);
        } catch (JSONException e) {
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82920);error = e;
        }
        __CLR4_5_21ry81ry8lusyjuyr.R.inc(82921);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    public static class A {

        private List<String> l0 = new ArrayList<String>();

        public List<String> getL0() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82922);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82923);return l0;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82924);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82925);this.l0 = l0;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82926);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82927);return null;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public Object getx() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82928);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82929);return null;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82930);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82931);return true;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82932);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82933);return true;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}
    }

    public static class B {

        private Collection<String> l0 = new ArrayList<String>();
        private Collection<String> l1 = new ArrayList<String>();

        public Collection<String> getL1() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82934);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82935);return l1;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setL1(Collection<String> l1) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82936);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82937);this.l1 = l1;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public Collection<String> getL0() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82938);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82939);return l0;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setL0(Collection<String> l0) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82940);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82941);this.l0 = l0;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public Object get() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82942);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82943);return null;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public Object getx() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82944);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82945);return null;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public boolean is() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82946);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82947);return true;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public boolean isx() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82948);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82949);return true;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}
    }

    public static class C {

        public List<String> getL0() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82950);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82951);throw new RuntimeException();
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setL0(List<String> l0) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82952);
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}
    }

    public static class D {

        public Collection<String> getL0() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82953);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82954);throw new RuntimeException();
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}
    }

    public static class E {

        private int id;

        public E(){try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82955);
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public E(int id){try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82956);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82957);this.id = id;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public int getId() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82958);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82959);return id;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82960);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82961);this.id = id;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}
    }

    public static class F {

        private E e;

        public F(){try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82962);
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public F(E e){try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82963);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82964);this.e = e;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public E getE() {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82965);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82966);return e;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

        public void setE(E e) {try{__CLR4_5_21ry81ry8lusyjuyr.R.inc(82967);
            __CLR4_5_21ry81ry8lusyjuyr.R.inc(82968);this.e = e;
        }finally{__CLR4_5_21ry81ry8lusyjuyr.R.flushNeeded();}}

    }
}
