/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONWriter;

@SuppressWarnings("deprecation")
public class JSONWriterTest extends TestCase {static class __CLR4_1_101w7w1w7wlusqklxc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,88477,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceStart(getClass().getName(),88412);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21w7w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7w1w7wlusqklxc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88412,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21w7w() throws Exception{try{__CLR4_1_101w7w1w7wlusqklxc.R.inc(88412);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88413);StringWriter out = new StringWriter();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88414);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88415);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88416);writer.writeEndObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88417);writer.flush();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88418);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_1_101w7w1w7wlusqklxc.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceStart(getClass().getName(),88419);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1w83();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7w1w7wlusqklxc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88419,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1w83() throws Exception{try{__CLR4_1_101w7w1w7wlusqklxc.R.inc(88419);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88420);StringWriter out = new StringWriter();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88421);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88422);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88423);writer.writeKey("id");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88424);writer.writeValue(33);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88425);writer.writeEndObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88426);writer.flush();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88427);Assert.assertEquals("{\"id\":33}", out.toString());
    }finally{__CLR4_1_101w7w1w7wlusqklxc.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceStart(getClass().getName(),88428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441w8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7w1w7wlusqklxc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88428,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441w8c() throws Exception{try{__CLR4_1_101w7w1w7wlusqklxc.R.inc(88428);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88429);StringWriter out = new StringWriter();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88430);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88431);writer.writeStartObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88432);writer.writeKey("id");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88433);writer.writeValue(33);

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88434);writer.writeKey("name");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88435);writer.writeValue("jobs");

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88436);writer.writeEndObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88437);writer.flush();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88438);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\"}", out.toString());
    }finally{__CLR4_1_101w7w1w7wlusqklxc.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceStart(getClass().getName(),88439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1w8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7w1w7wlusqklxc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1w8n() throws Exception{try{__CLR4_1_101w7w1w7wlusqklxc.R.inc(88439);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88440);StringWriter out = new StringWriter();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88441);JSONWriter writer = new JSONWriter(out);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88442);writer.writeStartObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88443);writer.writeKey("id");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88444);writer.writeValue(33);

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88445);writer.writeKey("name");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88446);writer.writeValue("jobs");

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88447);writer.writeKey("children");
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88448);writer.writeStartArray();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88449);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88450);writer.writeEndObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88451);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88452);writer.writeEndObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88453);writer.writeEndArray();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88454);writer.writeEndObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88455);writer.flush();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88456);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\",\"children\":[{},{}]}", out.toString());
    }finally{__CLR4_1_101w7w1w7wlusqklxc.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceStart(getClass().getName(),88457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61w95();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101w7w1w7wlusqklxc.R.rethrow($CLV_t2$);}finally{__CLR4_1_101w7w1w7wlusqklxc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),88457,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61w95() throws Exception{try{__CLR4_1_101w7w1w7wlusqklxc.R.inc(88457);
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88458);StringWriter out = new StringWriter();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88459);JSONWriter writer = new JSONWriter(out);

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88460);writer.writeStartArray();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88461);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88462);writer.writeEndObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88463);writer.writeStartObject();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88464);writer.writeEndObject();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88465);writer.writeStartArray();
        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88466);writer.writeEndArray();
        {
            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88467);writer.writeStartArray();

            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88468);writer.writeStartArray();
            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88469);writer.writeEndArray();

            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88470);writer.writeStartArray();
            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88471);writer.writeEndArray();

            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88472);writer.writeEndArray();
            
            __CLR4_1_101w7w1w7wlusqklxc.R.inc(88473);writer.writeValue(1);
        }

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88474);writer.writeEndArray();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88475);writer.flush();

        __CLR4_1_101w7w1w7wlusqklxc.R.inc(88476);Assert.assertEquals("[{},{},[],[[],[]],1]", out.toString());
    }finally{__CLR4_1_101w7w1w7wlusqklxc.R.flushNeeded();}}
}
