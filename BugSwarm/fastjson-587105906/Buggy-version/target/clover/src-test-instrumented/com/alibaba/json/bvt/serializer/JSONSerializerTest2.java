/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.IOException;
import java.io.Writer;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class JSONSerializerTest2 extends TestCase {static class __CLR4_1_101suu1suuluszwf1c{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,84102,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101suu1suuluszwf1c.R.globalSliceStart(getClass().getName(),84054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21suu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101suu1suuluszwf1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101suu1suuluszwf1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21suu() throws Exception{try{__CLR4_1_101suu1suuluszwf1c.R.inc(84054);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84055);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101suu1suuluszwf1c.R.inc(84056);serializer.getMapping().clearSerializers();

        __CLR4_1_101suu1suuluszwf1c.R.inc(84057);int size = JSONSerializerMapTest.size(serializer.getMapping());
        __CLR4_1_101suu1suuluszwf1c.R.inc(84058);serializer.config(SerializerFeature.WriteEnumUsingToString, false);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84059);serializer.config(SerializerFeature.WriteEnumUsingName, false);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84060);serializer.write(Type.A);

        __CLR4_1_101suu1suuluszwf1c.R.inc(84061);Assert.assertTrue(size < JSONSerializerMapTest.size(serializer.getMapping()));

        __CLR4_1_101suu1suuluszwf1c.R.inc(84062);Assert.assertEquals(Integer.toString(Type.A.ordinal()), serializer.getWriter().toString());
    }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101suu1suuluszwf1c.R.globalSliceStart(getClass().getName(),84063);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1sv3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101suu1suuluszwf1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101suu1suuluszwf1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84063,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1sv3() throws Exception{try{__CLR4_1_101suu1suuluszwf1c.R.inc(84063);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84064);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101suu1suuluszwf1c.R.inc(84065);serializer.config(SerializerFeature.WriteEnumUsingToString, false);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84066);serializer.config(SerializerFeature.WriteEnumUsingName, false);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84067);serializer.write(new A(Type.B));

        __CLR4_1_101suu1suuluszwf1c.R.inc(84068);Assert.assertEquals("{\"type\":" + Integer.toString(Type.B.ordinal()) + "}", serializer.getWriter().toString());

        __CLR4_1_101suu1suuluszwf1c.R.inc(84069);A a = JSON.parseObject(serializer.getWriter().toString(), A.class);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84070);Assert.assertEquals(a.getType(), Type.B);
    }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101suu1suuluszwf1c.R.globalSliceStart(getClass().getName(),84071);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441svb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101suu1suuluszwf1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101suu1suuluszwf1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84071,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441svb() throws Exception{try{__CLR4_1_101suu1suuluszwf1c.R.inc(84071);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84072);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101suu1suuluszwf1c.R.inc(84073);serializer.write(new C());

        __CLR4_1_101suu1suuluszwf1c.R.inc(84074);Assert.assertEquals("{}", serializer.getWriter().toString());
    }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101suu1suuluszwf1c.R.globalSliceStart(getClass().getName(),84075);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1svf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101suu1suuluszwf1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101suu1suuluszwf1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84075,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1svf() throws Exception{try{__CLR4_1_101suu1suuluszwf1c.R.inc(84075);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84076);JSONSerializer serializer = new JSONSerializer();
        __CLR4_1_101suu1suuluszwf1c.R.inc(84077);serializer.config(SerializerFeature.WriteEnumUsingToString, true);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84078);serializer.write(new A(Type.B));

        __CLR4_1_101suu1suuluszwf1c.R.inc(84079);Assert.assertEquals("{\"type\":\"B\"}", serializer.getWriter().toString());

        __CLR4_1_101suu1suuluszwf1c.R.inc(84080);A a = JSON.parseObject(serializer.getWriter().toString(), A.class);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84081);Assert.assertEquals(a.getType(), Type.B);
    }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101suu1suuluszwf1c.R.globalSliceStart(getClass().getName(),84082);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1svm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101suu1suuluszwf1c.R.rethrow($CLV_t2$);}finally{__CLR4_1_101suu1suuluszwf1c.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.JSONSerializerTest2.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84082,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1svm() throws Exception{try{__CLR4_1_101suu1suuluszwf1c.R.inc(84082);
        __CLR4_1_101suu1suuluszwf1c.R.inc(84083);Exception error = null;
        __CLR4_1_101suu1suuluszwf1c.R.inc(84084);try {
            __CLR4_1_101suu1suuluszwf1c.R.inc(84085);JSONSerializer.write(new Writer() {

                @Override
                public void write(char[] cbuf, int off, int len) throws IOException {try{__CLR4_1_101suu1suuluszwf1c.R.inc(84086);
                    __CLR4_1_101suu1suuluszwf1c.R.inc(84087);throw new IOException();
                }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

                @Override
                public void flush() throws IOException {try{__CLR4_1_101suu1suuluszwf1c.R.inc(84088);
                    __CLR4_1_101suu1suuluszwf1c.R.inc(84089);throw new IOException();
                }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

                @Override
                public void close() throws IOException {try{__CLR4_1_101suu1suuluszwf1c.R.inc(84090);
                    __CLR4_1_101suu1suuluszwf1c.R.inc(84091);throw new IOException();
                }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

            }, (Object) "abc");
        } catch (Exception ex) {
            __CLR4_1_101suu1suuluszwf1c.R.inc(84092);error = ex;
        }
        __CLR4_1_101suu1suuluszwf1c.R.inc(84093);Assert.assertNotNull(error);
    }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    public static enum Type {
        A, B
    }

    public static class A {

        private Type type;

        public A(){try{__CLR4_1_101suu1suuluszwf1c.R.inc(84094);

        }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

        public A(Type type){
            super();__CLR4_1_101suu1suuluszwf1c.R.inc(84096);try{__CLR4_1_101suu1suuluszwf1c.R.inc(84095);
            __CLR4_1_101suu1suuluszwf1c.R.inc(84097);this.type = type;
        }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

        public Type getType() {try{__CLR4_1_101suu1suuluszwf1c.R.inc(84098);
            __CLR4_1_101suu1suuluszwf1c.R.inc(84099);return type;
        }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

        public void setType(Type type) {try{__CLR4_1_101suu1suuluszwf1c.R.inc(84100);
            __CLR4_1_101suu1suuluszwf1c.R.inc(84101);this.type = type;
        }finally{__CLR4_1_101suu1suuluszwf1c.R.flushNeeded();}}

    }

    public static class C {

    }
}
