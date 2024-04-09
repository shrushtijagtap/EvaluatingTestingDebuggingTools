/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.date;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateTest extends TestCase {static class __CLR4_5_21unq1unqlusvngo2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,86465,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21unq1unqlusvngo2.R.inc(86390);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86391);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21unq1unqlusvngo2.R.inc(86392);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86393);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21unt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86393,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21unt() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86393);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86394);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86395);JSONSerializer serializer = new JSONSerializer(out);

        __CLR4_5_21unq1unqlusvngo2.R.inc(86396);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86397);serializer.write(new Date(1294552193254L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86398);Assert.assertEquals("1294552193254", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86399);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1unz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86399,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1unz() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86399);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86400);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86401);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86402);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86403);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86404);serializer.write(new Date(1294552193254L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86405);Assert.assertEquals("\"2011-01-09T13:49:53.254+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441uo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441uo6() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86406);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86407);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86408);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86409);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86410);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86411);serializer.write(new Date(1294552193000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86412);Assert.assertEquals("\"2011-01-09T13:49:53+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86413);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1uod();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86413,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1uod() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86413);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86414);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86415);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86416);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86417);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86418);serializer.write(new Date(1294502400000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86419);Assert.assertEquals("\"2011-01-09+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61uok();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86420,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61uok() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86420);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86421);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86422);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86423);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86424);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86425);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86426);serializer.write(new Date(1294502400000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86427);Assert.assertEquals("'2011-01-09+08:00'", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1uos();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1uos() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86428);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86429);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86430);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86431);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86432);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86433);serializer.write(new Date(1294502401000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86434);Assert.assertEquals("\"2011-01-09T00:00:01+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86435);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81uoz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86435,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81uoz() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86435);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86436);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86437);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86438);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86439);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86440);serializer.write(new Date(1294502460000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86441);Assert.assertEquals("\"2011-01-09T00:01:00+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86442);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1up6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86442,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1up6() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86442);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86443);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21unq1unqlusvngo2.R.inc(86444);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86445);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86446);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21unq1unqlusvngo2.R.inc(86447);serializer.write(new Date(1294506000000L));

        __CLR4_5_21unq1unqlusvngo2.R.inc(86448);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", out.toString());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86449);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1upd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86449,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1upd() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86449);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86450);String text = JSON.toJSONString(new Date(1294506000000L), SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86451);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", text);
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21unq1unqlusvngo2.R.globalSliceStart(getClass().getName(),86452);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71upg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21unq1unqlusvngo2.R.rethrow($CLV_t2$);}finally{__CLR4_5_21unq1unqlusvngo2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),86452,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71upg() throws Exception{try{__CLR4_5_21unq1unqlusvngo2.R.inc(86452);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86453);String text = JSON.toJSONString(new Entity(new Date(1294506000000L)), SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86454);Assert.assertEquals("{\"date\":\"2011-01-09T01:00:00+08:00\"}", text);

        __CLR4_5_21unq1unqlusvngo2.R.inc(86455);Entity entity = JSON.parseObject(text, Entity.class);
        __CLR4_5_21unq1unqlusvngo2.R.inc(86456);Assert.assertEquals(new Date(1294506000000L), entity.getDate());
    }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    public static class Entity {

        private Date date;

        public Entity(){try{__CLR4_5_21unq1unqlusvngo2.R.inc(86457);

        }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

        public Entity(Date date){
            super();__CLR4_5_21unq1unqlusvngo2.R.inc(86459);try{__CLR4_5_21unq1unqlusvngo2.R.inc(86458);
            __CLR4_5_21unq1unqlusvngo2.R.inc(86460);this.date = date;
        }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_5_21unq1unqlusvngo2.R.inc(86461);
            __CLR4_5_21unq1unqlusvngo2.R.inc(86462);return date;
        }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_21unq1unqlusvngo2.R.inc(86463);
            __CLR4_5_21unq1unqlusvngo2.R.inc(86464);this.date = date;
        }finally{__CLR4_5_21unq1unqlusvngo2.R.flushNeeded();}}

    }
}
