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

public class DateTest extends TestCase {static class __CLR4_5_21tpi1tpilusyjv7p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,85233,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85158);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85159);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85160);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85161);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21tpl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85161,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21tpl() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85161);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85162);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85163);JSONSerializer serializer = new JSONSerializer(out);

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85164);Assert.assertEquals(false, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85165);serializer.write(new Date(1294552193254L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85166);Assert.assertEquals("1294552193254", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85167);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1tpr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85167,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1tpr() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85167);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85168);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85169);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85170);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85171);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85172);serializer.write(new Date(1294552193254L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85173);Assert.assertEquals("\"2011-01-09T13:49:53.254+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441tpy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441tpy() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85174);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85175);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85176);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85177);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85178);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85179);serializer.write(new Date(1294552193000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85180);Assert.assertEquals("\"2011-01-09T13:49:53+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85181);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2de3lbn1tq5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85181,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2de3lbn1tq5() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85181);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85182);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85183);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85184);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85185);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85186);serializer.write(new Date(1294502400000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85187);Assert.assertEquals("\"2011-01-09+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2a53mj61tqc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85188,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2a53mj61tqc() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85188);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85189);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85190);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85191);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85192);serializer.config(SerializerFeature.UseSingleQuotes, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85193);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85194);serializer.write(new Date(1294502400000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85195);Assert.assertEquals("'2011-01-09+08:00'", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_5() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_26w3nqp1tqk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_26w3nqp1tqk() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85196);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85197);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85198);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85199);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85200);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85201);serializer.write(new Date(1294502401000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85202);Assert.assertEquals("\"2011-01-09T00:00:01+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_6() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23n3oy81tqr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23n3oy81tqr() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85203);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85204);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85205);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85206);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85207);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85208);serializer.write(new Date(1294502460000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85209);Assert.assertEquals("\"2011-01-09T00:01:00+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_7() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85210);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e3q5r1tqy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85210,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e3q5r1tqy() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85210);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85211);SerializeWriter out = new SerializeWriter();

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85212);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85213);serializer.config(SerializerFeature.UseISO8601DateFormat, true);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85214);Assert.assertEquals(true, serializer.isEnabled(SerializerFeature.UseISO8601DateFormat));
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85215);serializer.write(new Date(1294506000000L));

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85216);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", out.toString());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_8() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85217);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22uw8mq1tr5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85217,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22uw8mq1tr5() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85217);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85218);String text = JSON.toJSONString(new Date(1294506000000L), SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85219);Assert.assertEquals("\"2011-01-09T01:00:00+08:00\"", text);
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public void test_9() throws Exception {__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceStart(getClass().getName(),85220);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_263w7f71tr8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tpi1tpilusyjv7p.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tpi1tpilusyjv7p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.date.DateTest.test_9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85220,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_263w7f71tr8() throws Exception{try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85220);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85221);String text = JSON.toJSONString(new Entity(new Date(1294506000000L)), SerializerFeature.UseISO8601DateFormat);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85222);Assert.assertEquals("{\"date\":\"2011-01-09T01:00:00+08:00\"}", text);

        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85223);Entity entity = JSON.parseObject(text, Entity.class);
        __CLR4_5_21tpi1tpilusyjv7p.R.inc(85224);Assert.assertEquals(new Date(1294506000000L), entity.getDate());
    }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    public static class Entity {

        private Date date;

        public Entity(){try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85225);

        }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

        public Entity(Date date){
            super();__CLR4_5_21tpi1tpilusyjv7p.R.inc(85227);try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85226);
            __CLR4_5_21tpi1tpilusyjv7p.R.inc(85228);this.date = date;
        }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

        public Date getDate() {try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85229);
            __CLR4_5_21tpi1tpilusyjv7p.R.inc(85230);return date;
        }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

        public void setDate(Date date) {try{__CLR4_5_21tpi1tpilusyjv7p.R.inc(85231);
            __CLR4_5_21tpi1tpilusyjv7p.R.inc(85232);this.date = date;
        }finally{__CLR4_5_21tpi1tpilusyjv7p.R.flushNeeded();}}

    }
}
