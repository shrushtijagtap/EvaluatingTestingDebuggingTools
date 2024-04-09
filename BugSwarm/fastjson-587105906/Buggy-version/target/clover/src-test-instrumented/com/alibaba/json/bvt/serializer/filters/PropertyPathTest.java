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
public class PropertyPathTest extends TestCase {static class __CLR4_1_101vih1vihlusqkllu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,87551,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_path() throws Exception {__CLR4_1_101vih1vihlusqkllu.R.globalSliceStart(getClass().getName(),87497);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151vih();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101vih1vihlusqkllu.R.rethrow($CLV_t2$);}finally{__CLR4_1_101vih1vihlusqkllu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.filters.PropertyPathTest.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),87497,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151vih() throws Exception{try{__CLR4_1_101vih1vihlusqkllu.R.inc(87497);
        __CLR4_1_101vih1vihlusqkllu.R.inc(87498);A a = new A();
        __CLR4_1_101vih1vihlusqkllu.R.inc(87499);a.setId(123);

        __CLR4_1_101vih1vihlusqkllu.R.inc(87500);B b = new B();
        __CLR4_1_101vih1vihlusqkllu.R.inc(87501);b.setId(234);

        __CLR4_1_101vih1vihlusqkllu.R.inc(87502);C c = new C();
        __CLR4_1_101vih1vihlusqkllu.R.inc(87503);c.setId(345);

        __CLR4_1_101vih1vihlusqkllu.R.inc(87504);D d = new D();
        __CLR4_1_101vih1vihlusqkllu.R.inc(87505);d.setId(456);

        __CLR4_1_101vih1vihlusqkllu.R.inc(87506);a.setB(b);
        __CLR4_1_101vih1vihlusqkllu.R.inc(87507);b.setC(c);
        __CLR4_1_101vih1vihlusqkllu.R.inc(87508);b.setD(d);

        __CLR4_1_101vih1vihlusqkllu.R.inc(87509);Assert.assertEquals("{\"b\":{\"c\":{\"id\":345},\"d\":{\"id\":456},\"id\":234},\"id\":123}",
                            JSON.toJSONString(a));
        __CLR4_1_101vih1vihlusqkllu.R.inc(87510);Assert.assertEquals("{\"b\":{\"c\":{\"id\":345},\"id\":234},\"id\":123}",
                            JSON.toJSONString(a, new MyPropertyPreFilter()));
        __CLR4_1_101vih1vihlusqkllu.R.inc(87511);Assert.assertEquals("{'b':{'c':{'id':345},'id':234},'id':123}",
                            JSON.toJSONString(a, new MyPropertyPreFilter(), SerializerFeature.UseSingleQuotes));
    }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    public static class MyPropertyPreFilter implements PropertyPreFilter {

        public boolean apply(JSONSerializer serializer, Object source, String name) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87512);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87513);String path = serializer.getContext().toString() + "." + name;

            __CLR4_1_101vih1vihlusqkllu.R.inc(87514);if ((((path.startsWith("$.b.d"))&&(__CLR4_1_101vih1vihlusqkllu.R.iget(87515)!=0|true))||(__CLR4_1_101vih1vihlusqkllu.R.iget(87516)==0&false))) {{
                __CLR4_1_101vih1vihlusqkllu.R.inc(87517);return false;
            }

            }__CLR4_1_101vih1vihlusqkllu.R.inc(87518);return true;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    }

    public static class A {

        private int id;
        private B   b;

        public int getId() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87519);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87520);return id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87521);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87522);this.id = id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public B getB() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87523);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87524);return b;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87525);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87526);this.b = b;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    }

    public static class B {

        private int id;
        private C   c;
        private D   d;

        public int getId() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87527);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87528);return id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87529);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87530);this.id = id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public C getC() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87531);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87532);return c;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setC(C c) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87533);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87534);this.c = c;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public D getD() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87535);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87536);return d;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setD(D d) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87537);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87538);this.d = d;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    }

    public static class C {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87539);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87540);return id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87541);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87542);this.id = id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87543);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87544);return name;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87545);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87546);this.name = name;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    }

    public static class D {

        private int id;

        public int getId() {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87547);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87548);return id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101vih1vihlusqkllu.R.inc(87549);
            __CLR4_1_101vih1vihlusqkllu.R.inc(87550);this.id = id;
        }finally{__CLR4_1_101vih1vihlusqkllu.R.flushNeeded();}}

    }
}
