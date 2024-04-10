/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.io.IOException;
import java.io.Writer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class JSONSerializerTest2 extends TestCase {static class __CLR4_5_21rwb1rwblusyjuyj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,82859,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceStart(getClass().getName(),82811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21rwb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rwb1rwblusyjuyj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21rwb() throws Exception{try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82811);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82812);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82813);serializer.getMapping().clearSerializers();

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82814);int size = JSONSerializerMapTest.size(serializer.getMapping());
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82815);serializer.config(SerializerFeature.WriteEnumUsingToString, false);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82816);serializer.config(SerializerFeature.WriteEnumUsingName, false);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82817);serializer.write(Type.A);

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82818);Assert.assertTrue(size < JSONSerializerMapTest.size(serializer.getMapping()));

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82819);Assert.assertEquals(Integer.toString(Type.A.ordinal()), serializer.getWriter().toString());
    }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceStart(getClass().getName(),82820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1rwk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rwb1rwblusyjuyj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1rwk() throws Exception{try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82820);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82821);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82822);serializer.config(SerializerFeature.WriteEnumUsingToString, false);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82823);serializer.config(SerializerFeature.WriteEnumUsingName, false);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82824);serializer.write(new A(Type.B));

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82825);Assert.assertEquals("{\"type\":" + Integer.toString(Type.B.ordinal()) + "}", serializer.getWriter().toString());

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82826);A a = JSON.parseObject(serializer.getWriter().toString(), A.class);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82827);Assert.assertEquals(a.getType(), Type.B);
    }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceStart(getClass().getName(),82828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441rws();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rwb1rwblusyjuyj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82828,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441rws() throws Exception{try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82828);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82829);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82830);serializer.write(new C());

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82831);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceStart(getClass().getName(),82832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1rww();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rwb1rwblusyjuyj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1rww() throws Exception{try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82832);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82833);JSONSerializer serializer = new JSONSerializer();
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82834);serializer.config(SerializerFeature.WriteEnumUsingToString, true);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82835);serializer.write(new A(Type.B));

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82836);Assert.assertEquals("{\"type\":\"B\"}", serializer.getWriter().toString());

        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82837);A a = JSON.parseObject(serializer.getWriter().toString(), A.class);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82838);Assert.assertEquals(a.getType(), Type.B);
    }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceStart(getClass().getName(),82839);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1rx3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21rwb1rwblusyjuyj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21rwb1rwblusyjuyj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),82839,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1rx3() throws Exception{try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82839);
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82840);Exception error = null;
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82841);try {
            __CLR4_5_21rwb1rwblusyjuyj.R.inc(82842);JSONSerializer.write(new Writer() {

                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82843);
                    __CLR4_5_21rwb1rwblusyjuyj.R.inc(82844);throw new IOException();
                }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

                @Override
                public void flush() throws IOException {try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82845);
                    __CLR4_5_21rwb1rwblusyjuyj.R.inc(82846);throw new IOException();
                }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

                @Override
                public void close() throws IOException {try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82847);
                    __CLR4_5_21rwb1rwblusyjuyj.R.inc(82848);throw new IOException();
                }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

            }, (Object) "abc");
        } catch (Exception ex) {
            __CLR4_5_21rwb1rwblusyjuyj.R.inc(82849);error = ex;
        }
        __CLR4_5_21rwb1rwblusyjuyj.R.inc(82850);Assert.assertNotNull(error);
    }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    public static enum Type {
        A, B
    }

    public static class A {

        private Type type;

        public A(){try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82851);

        }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

        public A(Type type){
            super();__CLR4_5_21rwb1rwblusyjuyj.R.inc(82853);try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82852);
            __CLR4_5_21rwb1rwblusyjuyj.R.inc(82854);this.type = type;
        }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

        public Type getType() {try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82855);
            __CLR4_5_21rwb1rwblusyjuyj.R.inc(82856);return type;
        }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

        public void setType(Type type) {try{__CLR4_5_21rwb1rwblusyjuyj.R.inc(82857);
            __CLR4_5_21rwb1rwblusyjuyj.R.inc(82858);this.type = type;
        }finally{__CLR4_5_21rwb1rwblusyjuyj.R.flushNeeded();}}

    }

    public static class C {

    }
}
