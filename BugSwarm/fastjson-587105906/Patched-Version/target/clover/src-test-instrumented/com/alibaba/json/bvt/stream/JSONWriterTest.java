/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONWriter;

@SuppressWarnings("deprecation")
public class JSONWriterTest extends TestCase {static class __CLR4_5_21w7l1w7llusyjvhg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,88466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceStart(getClass().getName(),88401);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21w7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7l1w7llusyjvhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88401,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21w7l() throws Exception{try{__CLR4_5_21w7l1w7llusyjvhg.R.inc(88401);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88402);StringWriter out = new StringWriter();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88403);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88404);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88405);writer.writeEndObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88406);writer.flush();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88407);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21w7l1w7llusyjvhg.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceStart(getClass().getName(),88408);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1w7s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7l1w7llusyjvhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88408,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1w7s() throws Exception{try{__CLR4_5_21w7l1w7llusyjvhg.R.inc(88408);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88409);StringWriter out = new StringWriter();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88410);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88411);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88412);writer.writeKey("id");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88413);writer.writeValue(33);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88414);writer.writeEndObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88415);writer.flush();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88416);Assert.assertEquals("{\"id\":33}", out.toString());
    }finally{__CLR4_5_21w7l1w7llusyjvhg.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceStart(getClass().getName(),88417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441w81();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7l1w7llusyjvhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88417,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441w81() throws Exception{try{__CLR4_5_21w7l1w7llusyjvhg.R.inc(88417);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88418);StringWriter out = new StringWriter();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88419);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88420);writer.writeStartObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88421);writer.writeKey("id");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88422);writer.writeValue(33);

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88423);writer.writeKey("name");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88424);writer.writeValue("jobs");

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88425);writer.writeEndObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88426);writer.flush();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88427);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\"}", out.toString());
    }finally{__CLR4_5_21w7l1w7llusyjvhg.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceStart(getClass().getName(),88428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1w8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7l1w7llusyjvhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1w8c() throws Exception{try{__CLR4_5_21w7l1w7llusyjvhg.R.inc(88428);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88429);StringWriter out = new StringWriter();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88430);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88431);writer.writeStartObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88432);writer.writeKey("id");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88433);writer.writeValue(33);

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88434);writer.writeKey("name");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88435);writer.writeValue("jobs");

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88436);writer.writeKey("children");
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88437);writer.writeStartArray();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88438);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88439);writer.writeEndObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88440);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88441);writer.writeEndObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88442);writer.writeEndArray();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88443);writer.writeEndObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88444);writer.flush();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88445);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\",\"children\":[{},{}]}", out.toString());
    }finally{__CLR4_5_21w7l1w7llusyjvhg.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceStart(getClass().getName(),88446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61w8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21w7l1w7llusyjvhg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21w7l1w7llusyjvhg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),88446,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61w8u() throws Exception{try{__CLR4_5_21w7l1w7llusyjvhg.R.inc(88446);
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88447);StringWriter out = new StringWriter();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88448);JSONWriter writer = new JSONWriter(out);

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88449);writer.writeStartArray();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88450);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88451);writer.writeEndObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88452);writer.writeStartObject();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88453);writer.writeEndObject();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88454);writer.writeStartArray();
        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88455);writer.writeEndArray();
        {
            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88456);writer.writeStartArray();

            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88457);writer.writeStartArray();
            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88458);writer.writeEndArray();

            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88459);writer.writeStartArray();
            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88460);writer.writeEndArray();

            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88461);writer.writeEndArray();
            
            __CLR4_5_21w7l1w7llusyjvhg.R.inc(88462);writer.writeValue(1);
        }

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88463);writer.writeEndArray();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88464);writer.flush();

        __CLR4_5_21w7l1w7llusyjvhg.R.inc(88465);Assert.assertEquals("[{},{},[],[[],[]],1]", out.toString());
    }finally{__CLR4_5_21w7l1w7llusyjvhg.R.flushNeeded();}}
}
