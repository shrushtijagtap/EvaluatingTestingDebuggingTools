/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.MiscCodec;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.spi.Module;
import junit.framework.TestCase;

public class ModuleTest extends TestCase {static class __CLR4_5_2z5uz5ulusyjq5i{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,45588,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_module() throws Exception {__CLR4_5_2z5uz5ulusyjq5i.R.globalSliceStart(getClass().getName(),45570);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hcm0x6z5u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z5uz5ulusyjq5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z5uz5ulusyjq5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ModuleTest.test_for_module",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45570,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hcm0x6z5u() throws Exception{try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45570);
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45571);ParserConfig config = new ParserConfig();
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45572);config.register(new MyModuel2());
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45573);config.register(new MyModuel());

        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45574);assertSame(MiscCodec.instance, config.getDeserializer(A.class));
    }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}

    public void test_for_module_1() throws Exception {__CLR4_5_2z5uz5ulusyjq5i.R.globalSliceStart(getClass().getName(),45575);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2msal54z5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2z5uz5ulusyjq5i.R.rethrow($CLV_t2$);}finally{__CLR4_5_2z5uz5ulusyjq5i.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ModuleTest.test_for_module_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),45575,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2msal54z5z() throws Exception{try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45575);
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45576);SerializeConfig config = new SerializeConfig();
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45577);config.register(new MyModuel2());
        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45578);config.register(new MyModuel());

        __CLR4_5_2z5uz5ulusyjq5i.R.inc(45579);assertSame(MiscCodec.instance, config.getObjectWriter(A.class));
    }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}

    public static class A {

    }

    public static class MyModuel implements Module {

        @Override
        public ObjectDeserializer createDeserializer(ParserConfig config, Class type) {try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45580);
            __CLR4_5_2z5uz5ulusyjq5i.R.inc(45581);return MiscCodec.instance;
        }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}

        @Override
        public ObjectSerializer createSerializer(SerializeConfig config, Class type) {try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45582);
            __CLR4_5_2z5uz5ulusyjq5i.R.inc(45583);return MiscCodec.instance;
        }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}
    }

    public static class MyModuel2 implements Module {

        @Override
        public ObjectDeserializer createDeserializer(ParserConfig config, Class type) {try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45584);
            __CLR4_5_2z5uz5ulusyjq5i.R.inc(45585);return null;
        }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}

        @Override
        public ObjectSerializer createSerializer(SerializeConfig config, Class type) {try{__CLR4_5_2z5uz5ulusyjq5i.R.inc(45586);
            __CLR4_5_2z5uz5ulusyjq5i.R.inc(45587);return null;
        }finally{__CLR4_5_2z5uz5ulusyjq5i.R.flushNeeded();}}
    }
}
