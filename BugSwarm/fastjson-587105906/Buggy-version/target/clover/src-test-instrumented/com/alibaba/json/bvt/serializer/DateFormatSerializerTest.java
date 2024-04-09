/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class DateFormatSerializerTest extends TestCase {static class __CLR4_1_101r0r1r0rlusqkjc6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,81710,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81675);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81676);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81677);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}
    
    public void test_date() throws Exception {__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceStart(getClass().getName(),81678);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zi49um1r0u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r0r1r0rlusqkjc6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.DateFormatSerializerTest.test_date",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81678,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zi49um1r0u() throws Exception{try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81678);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81679);Assert.assertEquals("{\"format\":null}", JSON.toJSONString(new VO(), SerializerFeature.WriteMapNullValue));
    }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

    public void test_date_2() throws Exception {__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceStart(getClass().getName(),81680);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ge8cwb1r0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r0r1r0rlusqkjc6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.DateFormatSerializerTest.test_date_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81680,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ge8cwb1r0w() throws Exception{try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81680);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81681);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81682);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81683);JSONSerializer serializer = new JSONSerializer(out, config);

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81684);serializer.config(SerializerFeature.WriteMapNullValue, true);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81685);serializer.write(new VO());

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81686);Assert.assertEquals("{\"format\":null}", out.toString());
    }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

    public void test_date_3() throws Exception {__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceStart(getClass().getName(),81687);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d58e3u1r13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r0r1r0rlusqkjc6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.DateFormatSerializerTest.test_date_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81687,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d58e3u1r13() throws Exception{try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81687);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81688);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81689);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81690);JSONSerializer serializer = new JSONSerializer(out, config);

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81691);serializer.config(SerializerFeature.WriteClassName, true);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81692);serializer.write(new VO());

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81693);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.serializer.DateFormatSerializerTest$VO\"}",
                            out.toString());
    }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

    public void test_date_4() throws Exception {__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceStart(getClass().getName(),81694);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109w8fbd1r1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101r0r1r0rlusqkjc6.R.rethrow($CLV_t2$);}finally{__CLR4_1_101r0r1r0rlusqkjc6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.DateFormatSerializerTest.test_date_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81694,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109w8fbd1r1a() throws Exception{try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81694);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81695);SerializeWriter out = new SerializeWriter();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81696);SerializeConfig config = new SerializeConfig();
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81697);JSONSerializer serializer = new JSONSerializer(out, config);

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81698);SimpleDateFormat format = new SimpleDateFormat("yyyy");
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81699);format.setTimeZone(JSON.defaultTimeZone);
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81700);serializer.write(new VO(format));

        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81701);Assert.assertEquals("{\"format\":\"yyyy\"}", out.toString());
        
        __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81702);JSON.parseObject(out.toString(), VO.class);
    }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

    private static class VO {

        private SimpleDateFormat format;

        public VO(){try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81703);

        }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

        public VO(SimpleDateFormat format){try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81704);
            __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81705);this.format = format;
        }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

        public SimpleDateFormat getFormat() {try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81706);
            __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81707);return format;
        }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

        public void setFormat(SimpleDateFormat format) {try{__CLR4_1_101r0r1r0rlusqkjc6.R.inc(81708);
            __CLR4_1_101r0r1r0rlusqkjc6.R.inc(81709);this.format = format;
        }finally{__CLR4_1_101r0r1r0rlusqkjc6.R.flushNeeded();}}

    }
}
