/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.stream;

import java.io.StringWriter;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONWriter;

@SuppressWarnings("deprecation")
public class JSONWriterTest extends TestCase {static class __CLR4_5_21x5t1x5tlusvnh7g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,89698,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceStart(getClass().getName(),89633);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21x5t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x5t1x5tlusvnh7g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89633,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21x5t() throws Exception{try{__CLR4_5_21x5t1x5tlusvnh7g.R.inc(89633);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89634);StringWriter out = new StringWriter();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89635);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89636);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89637);writer.writeEndObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89638);writer.flush();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89639);Assert.assertEquals("{}", out.toString());
    }finally{__CLR4_5_21x5t1x5tlusvnh7g.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceStart(getClass().getName(),89640);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1x60();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x5t1x5tlusvnh7g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89640,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1x60() throws Exception{try{__CLR4_5_21x5t1x5tlusvnh7g.R.inc(89640);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89641);StringWriter out = new StringWriter();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89642);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89643);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89644);writer.writeKey("id");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89645);writer.writeValue(33);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89646);writer.writeEndObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89647);writer.flush();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89648);Assert.assertEquals("{\"id\":33}", out.toString());
    }finally{__CLR4_5_21x5t1x5tlusvnh7g.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceStart(getClass().getName(),89649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441x69();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x5t1x5tlusvnh7g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89649,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441x69() throws Exception{try{__CLR4_5_21x5t1x5tlusvnh7g.R.inc(89649);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89650);StringWriter out = new StringWriter();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89651);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89652);writer.writeStartObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89653);writer.writeKey("id");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89654);writer.writeValue(33);

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89655);writer.writeKey("name");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89656);writer.writeValue("jobs");

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89657);writer.writeEndObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89658);writer.flush();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89659);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\"}", out.toString());
    }finally{__CLR4_5_21x5t1x5tlusvnh7g.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceStart(getClass().getName(),89660);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1x6k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x5t1x5tlusvnh7g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89660,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1x6k() throws Exception{try{__CLR4_5_21x5t1x5tlusvnh7g.R.inc(89660);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89661);StringWriter out = new StringWriter();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89662);JSONWriter writer = new JSONWriter(out);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89663);writer.writeStartObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89664);writer.writeKey("id");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89665);writer.writeValue(33);

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89666);writer.writeKey("name");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89667);writer.writeValue("jobs");

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89668);writer.writeKey("children");
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89669);writer.writeStartArray();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89670);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89671);writer.writeEndObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89672);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89673);writer.writeEndObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89674);writer.writeEndArray();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89675);writer.writeEndObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89676);writer.flush();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89677);Assert.assertEquals("{\"id\":33,\"name\":\"jobs\",\"children\":[{},{}]}", out.toString());
    }finally{__CLR4_5_21x5t1x5tlusvnh7g.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceStart(getClass().getName(),89678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61x72();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21x5t1x5tlusvnh7g.R.rethrow($CLV_t2$);}finally{__CLR4_5_21x5t1x5tlusvnh7g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.stream.JSONWriterTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),89678,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61x72() throws Exception{try{__CLR4_5_21x5t1x5tlusvnh7g.R.inc(89678);
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89679);StringWriter out = new StringWriter();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89680);JSONWriter writer = new JSONWriter(out);

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89681);writer.writeStartArray();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89682);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89683);writer.writeEndObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89684);writer.writeStartObject();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89685);writer.writeEndObject();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89686);writer.writeStartArray();
        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89687);writer.writeEndArray();
        {
            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89688);writer.writeStartArray();

            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89689);writer.writeStartArray();
            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89690);writer.writeEndArray();

            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89691);writer.writeStartArray();
            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89692);writer.writeEndArray();

            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89693);writer.writeEndArray();
            
            __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89694);writer.writeValue(1);
        }

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89695);writer.writeEndArray();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89696);writer.flush();

        __CLR4_5_21x5t1x5tlusvnh7g.R.inc(89697);Assert.assertEquals("[{},{},[],[[],[]],1]", out.toString());
    }finally{__CLR4_5_21x5t1x5tlusvnh7g.R.flushNeeded();}}
}
