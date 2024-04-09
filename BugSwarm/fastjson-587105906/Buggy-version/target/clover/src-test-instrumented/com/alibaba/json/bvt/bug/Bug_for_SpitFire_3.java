/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_SpitFire_3 extends TestCase {static class __CLR4_1_1013d813d8lusqk232{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,51039,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_SpitFire() {__CLR4_1_1013d813d8lusqk232.R.globalSliceStart(getClass().getName(),51020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qeli5k13d8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013d813d8lusqk232.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013d813d8lusqk232.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_SpitFire_3.test_for_SpitFire",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51020,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qeli5k13d8(){try{__CLR4_1_1013d813d8lusqk232.R.inc(51020);
        __CLR4_1_1013d813d8lusqk232.R.inc(51021);Generic<Payload> q = new Generic<Payload>();
        __CLR4_1_1013d813d8lusqk232.R.inc(51022);q.setHeader("Sdfdf");
        __CLR4_1_1013d813d8lusqk232.R.inc(51023);q.setPayload(new Payload());
        __CLR4_1_1013d813d8lusqk232.R.inc(51024);String text = JSON.toJSONString(q, SerializerFeature.WriteClassName);
        __CLR4_1_1013d813d8lusqk232.R.inc(51025);System.out.println(text);
        __CLR4_1_1013d813d8lusqk232.R.inc(51026);JSON.parseObject(text, Generic.class);
    }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}

    public static abstract class AbstractDTO {

        private String test;

        public String getTest() {try{__CLR4_1_1013d813d8lusqk232.R.inc(51027);
            __CLR4_1_1013d813d8lusqk232.R.inc(51028);return test;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}

        public void setTest(String test) {try{__CLR4_1_1013d813d8lusqk232.R.inc(51029);
            __CLR4_1_1013d813d8lusqk232.R.inc(51030);this.test = test;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}
    }

    public static class Payload extends AbstractDTO {

    }

    public static class Generic<T extends AbstractDTO> extends AbstractDTO {

        String header;
        T      payload;

        public String getHeader() {try{__CLR4_1_1013d813d8lusqk232.R.inc(51031);
            __CLR4_1_1013d813d8lusqk232.R.inc(51032);return header;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}

        public void setHeader(String header) {try{__CLR4_1_1013d813d8lusqk232.R.inc(51033);
            __CLR4_1_1013d813d8lusqk232.R.inc(51034);this.header = header;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}

        public T getPayload() {try{__CLR4_1_1013d813d8lusqk232.R.inc(51035);
            __CLR4_1_1013d813d8lusqk232.R.inc(51036);return payload;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}

        public void setPayload(T payload) {try{__CLR4_1_1013d813d8lusqk232.R.inc(51037);
            __CLR4_1_1013d813d8lusqk232.R.inc(51038);this.payload = payload;
        }finally{__CLR4_1_1013d813d8lusqk232.R.flushNeeded();}}
    }

}
