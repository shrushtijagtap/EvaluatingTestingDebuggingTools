/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer.date;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class DateTest extends TestCase {static class __CLR4_1_101uo11uo1luszwfay{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,86476,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101uo11uo1luszwfay.R.inc(86401);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86402);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101uo11uo1luszwfay.R.inc(86403);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86404);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21uo4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86404,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21uo4() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86404);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86405);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86406);JSONSerializer serializer = new JSONSerializer(out);

        __CLR4_1_101uo11uo1luszwfay.R.inc(86407);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86408);serializer.write(new Date(1294552193254L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86409);Assert.assertEquals("1294552193254", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86410);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1uoa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86410,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1uoa() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86410);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86411);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86412);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86413);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86414);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86415);serializer.write(new Date(1294552193254L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86416);Assert.assertEquals("\"2011-01-09T13:49:53.254+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441uoh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441uoh() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86417);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86418);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86419);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86420);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86421);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86422);serializer.write(new Date(1294552193000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86423);Assert.assertEquals("\"2011-01-09T13:49:53+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86424);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1uoo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86424,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1uoo() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86424);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86425);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86426);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86427);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86428);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86429);serializer.write(new Date(1294502400000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86430);Assert.assertEquals("\"2011-01-09+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86431);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61uov();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86431,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61uov() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86431);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86432);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86433);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86434);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86435);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86436);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86437);serializer.write(new Date(1294502400000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86438);Assert.assertEquals("'2011-01-09+08:00'", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86439);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1up3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86439,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1up3() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86439);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86440);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86441);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86442);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86443);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86444);serializer.write(new Date(1294502401000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86445);Assert.assertEquals("\"2011-01-09T00:00:01+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86446);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81upa();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86446,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81upa() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86446);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86447);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86448);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86449);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86450);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86451);serializer.write(new Date(1294502460000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86452);Assert.assertEquals("\"2011-01-09T00:01:00+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86453);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e3q5r1uph();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86453,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e3q5r1uph() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86453);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86454);SerializeWriter out = new SerializeWriter();

        __CLR4_1_101uo11uo1luszwfay.R.inc(86455);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86456);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86457);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_1_101uo11uo1luszwfay.R.inc(86458);serializer.write(new Date(1294506000000L));

        __CLR4_1_101uo11uo1luszwfay.R.inc(86459);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", out.toString());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86460);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102uw8mq1upo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86460,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102uw8mq1upo() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86460);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86461);String text = JSON.toJSONString(new Date(1294506000000L), SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86462);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", text);
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_1_101uo11uo1luszwfay.R.globalSliceStart(getClass().getName(),86463);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1063w7f71upr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101uo11uo1luszwfay.R.rethrow($CLV_t2$);}finally{__CLR4_1_101uo11uo1luszwfay.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),86463,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1063w7f71upr() throws Exception{try{__CLR4_1_101uo11uo1luszwfay.R.inc(86463);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86464);String text = JSON.toJSONString(new Entity(new Date(1294506000000L)), SerializerFeature.UseISO8601DateFormat);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86465);Assert.assertEquals("{\"date\":\"2011-01-09T01:00:00+08:00\"}", text);

        __CLR4_1_101uo11uo1luszwfay.R.inc(86466);Entity entity = JSON.parseObject(text, Entity.class);
        __CLR4_1_101uo11uo1luszwfay.R.inc(86467);Assert.assertEquals(new Date(1294506000000L), entity.getDate());
    }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    public static class Entity {

        private Date date;

        public Entity(){try{__CLR4_1_101uo11uo1luszwfay.R.inc(86468);

        }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

        public Entity(Date date){
            super();__CLR4_1_101uo11uo1luszwfay.R.inc(86470);try{__CLR4_1_101uo11uo1luszwfay.R.inc(86469);
            __CLR4_1_101uo11uo1luszwfay.R.inc(86471);this.date = date;
        }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_1_101uo11uo1luszwfay.R.inc(86472);
            __CLR4_1_101uo11uo1luszwfay.R.inc(86473);return date;
        }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_1_101uo11uo1luszwfay.R.inc(86474);
            __CLR4_1_101uo11uo1luszwfay.R.inc(86475);this.date = date;
        }finally{__CLR4_1_101uo11uo1luszwfay.R.flushNeeded();}}

    }
}
