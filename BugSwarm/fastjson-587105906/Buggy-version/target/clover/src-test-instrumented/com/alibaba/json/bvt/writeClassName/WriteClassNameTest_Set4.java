/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.writeClassName;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteClassNameTest_Set4 extends TestCase {static class __CLR4_1_101yzm1yzmlusqkoko{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,92025,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92002);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92003);ParserConfig.global.addAccept("com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set4");
    }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_1_101yzm1yzmlusqkoko.R.globalSliceStart(getClass().getName(),92004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1yzo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101yzm1yzmlusqkoko.R.rethrow($CLV_t2$);}finally{__CLR4_1_101yzm1yzmlusqkoko.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set4.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1yzo() throws Exception{try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92004);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92005);A a = new A();
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92006);LinkedHashSet<B> set = new LinkedHashSet<B>();
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92007);set.add(new B());
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92008);set.add(new B1());
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92009);a.setList(set);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92010);String text = JSON.toJSONString(a, SerializerFeature.WriteClassName);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92011);System.out.println(text);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92012);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set4$A\",\"list\":[{\"valueB\":100},{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_Set4$B1\",\"valueB\":100,\"valueB1\":200}]}",
                            text);

        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92013);A a1 = (A) JSON.parse(text);

        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92014);Assert.assertEquals(2, a1.getList().size());
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92015);Assert.assertTrue(new ArrayList<B>(a1.getList()).get(0) instanceof B);
        __CLR4_1_101yzm1yzmlusqkoko.R.inc(92016);Assert.assertTrue(new ArrayList<B>(a1.getList()).get(1) instanceof B1);
    }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}

    public static class A {

        private LinkedHashSet<B> list;

        public LinkedHashSet<B> getList() {try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92017);
            __CLR4_1_101yzm1yzmlusqkoko.R.inc(92018);return list;
        }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}

        public void setList(LinkedHashSet<B> list) {try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92019);
            __CLR4_1_101yzm1yzmlusqkoko.R.inc(92020);this.list = list;
        }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}

    }

    public static class B {
        private int valueB = 100;
        public int getValueB() {try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92021);
            __CLR4_1_101yzm1yzmlusqkoko.R.inc(92022);return valueB;
        }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}
    }

    public static class B1 extends B {
        private int valueB1 = 200;
        public int getValueB1() {try{__CLR4_1_101yzm1yzmlusqkoko.R.inc(92023);
            __CLR4_1_101yzm1yzmlusqkoko.R.inc(92024);return valueB1;
        }finally{__CLR4_1_101yzm1yzmlusqkoko.R.flushNeeded();}}
    }
}
