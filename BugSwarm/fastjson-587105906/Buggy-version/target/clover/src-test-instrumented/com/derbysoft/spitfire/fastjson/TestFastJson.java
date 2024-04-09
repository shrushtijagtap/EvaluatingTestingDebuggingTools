/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.derbysoft.spitfire.fastjson;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.apache.commons.lang.time.StopWatch;
import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.SerializeWriter;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.derbysoft.spitfire.fastjson.dto.AvailGuaranteeDTO;
import com.derbysoft.spitfire.fastjson.dto.AvailRoomStayDTO;
import com.derbysoft.spitfire.fastjson.dto.CancelPenaltyType;
import com.derbysoft.spitfire.fastjson.dto.CancelPolicyDTO;
import com.derbysoft.spitfire.fastjson.dto.CardCode;
import com.derbysoft.spitfire.fastjson.dto.ChargeItemDTO;
import com.derbysoft.spitfire.fastjson.dto.ChargeType;
import com.derbysoft.spitfire.fastjson.dto.ChargeUnit;
import com.derbysoft.spitfire.fastjson.dto.Currency;
import com.derbysoft.spitfire.fastjson.dto.DateRangeDTO;
import com.derbysoft.spitfire.fastjson.dto.FreeMealDTO;
import com.derbysoft.spitfire.fastjson.dto.FreeMealType;
import com.derbysoft.spitfire.fastjson.dto.GenericRS;
import com.derbysoft.spitfire.fastjson.dto.GuaranteeType;
import com.derbysoft.spitfire.fastjson.dto.HotelAvailRS;
import com.derbysoft.spitfire.fastjson.dto.HotelAvailRoomStayDTO;
import com.derbysoft.spitfire.fastjson.dto.HotelRefDTO;
import com.derbysoft.spitfire.fastjson.dto.LanguageType;
import com.derbysoft.spitfire.fastjson.dto.MealsIncludedDTO;
import com.derbysoft.spitfire.fastjson.dto.MealsIncludedType;
import com.derbysoft.spitfire.fastjson.dto.PaymentType;
import com.derbysoft.spitfire.fastjson.dto.ProviderChainDTO;
import com.derbysoft.spitfire.fastjson.dto.RateDTO;
import com.derbysoft.spitfire.fastjson.dto.RatePlanDTO;
import com.derbysoft.spitfire.fastjson.dto.ResponseHeader;
import com.derbysoft.spitfire.fastjson.dto.RoomRateDTO;
import com.derbysoft.spitfire.fastjson.dto.RoomTypeDTO;
import com.derbysoft.spitfire.fastjson.dto.SimpleAmountDTO;
import com.derbysoft.spitfire.fastjson.dto.TPAExtensionsDTO;
import com.derbysoft.spitfire.fastjson.dto.UniqueIDDTO;
import com.derbysoft.spitfire.fastjson.dto.UniqueIDType;

//import com.derbysoft.spitfire.fastjson.dto.*;

public class TestFastJson {static class __CLR4_1_1027xf27xflusqkx0g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,103824,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int TIMES       = 10000;
    private static final int STAYS_COUNT = 10;

    public void f_testF() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103587);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103588);Generic<String> q = new Generic<String>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103589);byte[] text = JSON.toJSONBytes(q, SerializerFeature.WriteClassName);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103590);JSON.parseObject(text, Generic.class);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void f_test() throws Exception {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103591);

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103592);String text = JSON.toJSONString(createTest(), SerializerFeature.WriteClassName);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103593);System.out.println(text.length());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103594);System.out.println(text);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103595);System.out.println("serialize finished");
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103596);GenericRS<HotelAvailRS> o = (GenericRS<HotelAvailRS>) JSON.parseObject(text, GenericRS.class);

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103597);System.out.println(o);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    public void testFP() throws IOException {__CLR4_1_1027xf27xflusqkx0g.R.globalSliceStart(getClass().getName(),103598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mtko6527xq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1027xf27xflusqkx0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1027xf27xflusqkx0g.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testFP",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),103598,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mtko6527xq() throws IOException{try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103598);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103599);Generic<String> q = new Generic<String>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103600);for (int x = 0; (((x < STAYS_COUNT)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103601)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103602)==0&false)); ++x) {{
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103603);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103604);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103605);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103606)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103607)==0&false)); ++i) {{
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103608);jsonSerialize(q);
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103609);stopWatch.stop();

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103610);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103611);stopWatch.reset();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103612);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103613);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103614)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103615)==0&false)); ++i) {{
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103616);javaSerialize(q);
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103617);stopWatch.stop();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103618);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103619);System.out.println();
        }
    }}finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private <T> void jsonSerialize(T t) throws IOException {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103620);
        // String text = JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat);
        // System.out.println(text);

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103621);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103622);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);
        // SerializeWriter out = new SerializeWriter();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103623);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103624);serializer.write(t);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103625);out.writeTo(os, "UTF-8");
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103626);os.toByteArray();
        //System.out.println(JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
        //System.out.println("json " + os.toByteArray().length);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private <T> void javaSerialize(T t) throws IOException {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103627);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103628);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103629);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103630);oos.writeObject(t);
        // System.out.println("java " + os.toByteArray().length);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T jsonDeserialize(byte[] bytes, Class<T> clazz) throws IOException {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103631);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103632);return (T) JSON.parseObject(bytes, clazz);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T javaDeserialize(byte[] bytes) throws IOException, ClassNotFoundException {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103633);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103634);ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103635);ObjectInputStream ois = new ObjectInputStream(is);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103636);return (T) ois.readObject();
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    @Test
    public void testSerializePerformance() throws IOException {__CLR4_1_1027xf27xflusqkx0g.R.globalSliceStart(getClass().getName(),103637);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m447vt27yt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1027xf27xflusqkx0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1027xf27xflusqkx0g.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testSerializePerformance",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),103637,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m447vt27yt() throws IOException{try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103637);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103638);Object obj = createTest();

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103639);for (int x = 0; (((x < 20)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103640)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103641)==0&false)); ++x) {{
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103642);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103643);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103644);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103645)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103646)==0&false)); ++i) {{
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103647);jsonSerialize(obj);
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103648);stopWatch.stop();

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103649);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103650);stopWatch.reset();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103651);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103652);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103653)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103654)==0&false)); ++i) {{
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103655);javaSerialize(obj);
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103656);stopWatch.stop();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103657);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103658);System.out.println();
        }
    }}finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    public void testDeserializePerformance() throws IOException, ClassNotFoundException {__CLR4_1_1027xf27xflusqkx0g.R.globalSliceStart(getClass().getName(),103659);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ct3h6e27zf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1027xf27xflusqkx0g.R.rethrow($CLV_t2$);}finally{__CLR4_1_1027xf27xflusqkx0g.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testDeserializePerformance",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),103659,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ct3h6e27zf() throws IOException, ClassNotFoundException{try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103659);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103660);Object obj = createTest();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103661);byte[] bytes = JSON.toJSONBytes(obj, SerializerFeature.WriteClassName);

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103662);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103663);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103664);oos.writeObject(obj);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103665);byte[] javaBytes = os.toByteArray();

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103666);System.out.println(bytes.length);

        __CLR4_1_1027xf27xflusqkx0g.R.inc(103667);for (int x = 0; (((x < 20)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103668)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103669)==0&false)); ++x) {{
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103670);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103671);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103672);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103673)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103674)==0&false)); ++i) {{
                // ByteArrayInputStream is = new ByteArrayInputStream(bytes);
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103675);Object o = jsonDeserialize(bytes, GenericRS.class);
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103676);o.getClass();
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103677);stopWatch.stop();

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103678);System.out.println("JSON deserialize:" + stopWatch.getTime());

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103679);stopWatch.reset();

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103680);stopWatch.start();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103681);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103682)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103683)==0&false)); ++i) {{
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103684);Object o = javaDeserialize(javaBytes);
                __CLR4_1_1027xf27xflusqkx0g.R.inc(103685);o.getClass();
            }
            }__CLR4_1_1027xf27xflusqkx0g.R.inc(103686);stopWatch.stop();

            __CLR4_1_1027xf27xflusqkx0g.R.inc(103687);System.out.println("JAVA deserialize:" + stopWatch.getTime());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103688);System.out.println();
        }

    }}finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    public GenericRS<HotelAvailRS> createTest() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103689);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103690);GenericRS<HotelAvailRS> rs = new GenericRS<HotelAvailRS>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103691);rs.setHeader(new ResponseHeader("dsfsdfsd"));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103692);HotelAvailRS hotelAvailRS = createExpectedHotelAvailRS();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103693);TPAExtensionsDTO extensions = new TPAExtensionsDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103694);extensions.getElements().put("dfd", "Dfdf");
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103695);hotelAvailRS.setTpaExtensions(extensions);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103696);rs.setPayload(hotelAvailRS);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103697);return rs;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    // private static final String HOTEL_DESC = "foo hotel desc";
    private static final String       ROOM_TYPE_CODE            = "foo room type code";
    private static final String       ROOM_TYPE_NAME            = "foo room type name";
    private static final String       RATE_PLAN_CODE            = "foo rate plan code";
    private static final String       RATE_PLAN_NAME            = "rate plan name";
    private static final Integer      ROOM_COUNT                = 2;

    // private static final Date CANCEL_POLICY_DEAD_LINE = DateUtils.parseUseDefaultFormat("2008-09-01");
    private static final String       CANCEL_POLICY_DESCRIPTION = "foo cancel policy description";

    private static final String       GUARANTEE_DESCRIPTION     = "foo guarantee description";
    // private static final String CARD_NUMBER = "foo card number";
    // private static final String CARD_HOLDER_NAME = "foo card holder name";
    // private static final String CARD_SERIES_CODE = "foo card series code";
    // private static final Date CARD_EXPIRE_DATE = DateUtils.parseUseDefaultFormat("2010-12-31");
    private static final Currency     CURRENCY                  = Currency.CNY;

    private static final PaymentType  PAYMENT_TYPE_POA          = PaymentType.POA;
    // private static final int DAY_COUNT = 4;
    // private static final String[] CHECKIN_DATES = {"2008-08-25", "2008-08-26", "2008-08-27", "2008-08-28"};
    // private static final String[] CHECKOUT_DATES = {"2008-08-26", "2008-08-27", "2008-08-28", "2008-08-29"};
    // private static final BigDecimal[] AMOUNT_AFTER_TAXS
    // = {new BigDecimal(800), new BigDecimal(800), new BigDecimal(800), new BigDecimal(900)};
    private static final BigDecimal[] AMOUNT_BEFORE_TAXS        = { new BigDecimal(750), new BigDecimal(750),
            new BigDecimal(760), new BigDecimal(880)           };
    private static final BigDecimal   AMOUNT_TAX                = new BigDecimal(50);
    private static final BigDecimal   SERVICE_CHARGE_AMOUNT     = new BigDecimal(10);
    private static final String       TAX_DESC                  = "foo tax desc";
    private static final String       SERVICE_CHARGE_DESC       = "foo repository charge desc";

    private static final String       PROVIDER_CODE             = "hilton";
    private static final String       HOTEL_NAME                = "foo hotel name";
    private static final String       HOTEL_CODE                = "foo hotel code";
    private static final LanguageType LANGUAGE_TYPE_CN          = LanguageType.ZH_CN;
    // private static final String TASK_ID = "task id";
    private static final boolean      NEED_GUARANTEE            = true;
    private static final CardCode     VISA                      = CardCode.VISA;
    // private static final String CARD_CODE = VISA.getCode();

    private static final int          NUMBER_ZERO               = 0;
    private static final int          NUMBER_ONE                = 1;
    private static final int          NUMBER_TWO                = 2;
    private static final int          NUMBER_THREE              = 3;
    
    private static AtomicLong seed = new AtomicLong();

    private HotelAvailRS createExpectedHotelAvailRS() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103698);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103699);HotelAvailRS payLoad = new HotelAvailRS();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103700);payLoad.setHotelAvailRoomStay(createExpectedHotelAvailRoomStay());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103701);return payLoad;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private HotelAvailRoomStayDTO createExpectedHotelAvailRoomStay() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103702);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103703);HotelAvailRoomStayDTO hotelAvailRoomStay = new HotelAvailRoomStayDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103704);hotelAvailRoomStay.setHotelRef(createExpectedHotelRef());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103705);hotelAvailRoomStay.setRoomStays(createExpectedRoomStays());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103706);return hotelAvailRoomStay;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private List<AvailRoomStayDTO> createExpectedRoomStays() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103707);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103708);ArrayList<AvailRoomStayDTO> roomStays = new ArrayList<AvailRoomStayDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103709);for (int i = 0; (((i < STAYS_COUNT)&&(__CLR4_1_1027xf27xflusqkx0g.R.iget(103710)!=0|true))||(__CLR4_1_1027xf27xflusqkx0g.R.iget(103711)==0&false)); ++i) {{
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103712);AvailRoomStayDTO roomStay = new AvailRoomStayDTO();
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103713);roomStay.setLanguageType(LANGUAGE_TYPE_CN);
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103714);roomStay.setRoomType(createExpectedRoomType());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103715);roomStay.setRatePlan(createExpectedRatePlan());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103716);roomStay.setQuantity(ROOM_COUNT);
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103717);roomStay.setRoomRate(createExpectedRoomRate());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103718);roomStay.setProviderChain(createExpectedProviderChain());
            __CLR4_1_1027xf27xflusqkx0g.R.inc(103719);roomStays.add(roomStay);
        }

        }__CLR4_1_1027xf27xflusqkx0g.R.inc(103720);return roomStays;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private ProviderChainDTO createExpectedProviderChain() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103721);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103722);ProviderChainDTO providerChain = new ProviderChainDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103723);List<UniqueIDDTO> providers = new ArrayList<UniqueIDDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103724);UniqueIDDTO provider = new UniqueIDDTO(PROVIDER_CODE, UniqueIDType.HOTEL);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103725);provider.setCompanyName(PROVIDER_CODE);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103726);providers.add(provider);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103727);providerChain.setProviders(providers);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103728);return providerChain;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private List<AvailGuaranteeDTO> createExpectedAvailGuarantee() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103729);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103730);List<AvailGuaranteeDTO> availGuarantees = new ArrayList<AvailGuaranteeDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103731);AvailGuaranteeDTO availGuaranteeDTO = new AvailGuaranteeDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103732);availGuaranteeDTO.setGuaranteeType(GuaranteeType.CreditCard);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103733);availGuaranteeDTO.setCardCode(VISA);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103734);availGuaranteeDTO.setTpaExtensions(createExpectedEpaExtensions());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103735);availGuarantees.add(availGuaranteeDTO);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103736);return availGuarantees;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private TPAExtensionsDTO createExpectedEpaExtensions() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103737);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103738);TPAExtensionsDTO tpaExtensions = new TPAExtensionsDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103739);tpaExtensions.setElement("description", GUARANTEE_DESCRIPTION);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103740);return tpaExtensions;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private CancelPolicyDTO createExpectedCancelPolicy() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103741);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103742);CancelPolicyDTO cancelPolicyDTO = new CancelPolicyDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103743);cancelPolicyDTO.setCancelPenaltyType(CancelPenaltyType.UNKNOWN);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103744);cancelPolicyDTO.setDeadline("16:00");
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103745);cancelPolicyDTO.setDescription(CANCEL_POLICY_DESCRIPTION);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103746);return cancelPolicyDTO;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RoomRateDTO createExpectedRoomRate() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103747);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103748);RoomRateDTO roomRate = new RoomRateDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103749);List<RateDTO> rates = new ArrayList<RateDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103750);rates.add(createExpectedFirstDayRate());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103751);rates.add(createExpectedSecondDayRate());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103752);rates.add(createExpectedThirdDayRate());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103753);rates.add(createExpectedForthDayRate());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103754);roomRate.setRates(rates);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103755);return roomRate;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RatePlanDTO createExpectedRatePlan() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103756);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103757);RatePlanDTO ratePlan = new RatePlanDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103758);ratePlan.setCode(RATE_PLAN_CODE);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103759);ratePlan.setName(RATE_PLAN_NAME);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103760);ratePlan.setPaymentType(PAYMENT_TYPE_POA); // TODO paymentType only cash back?
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103761);ratePlan.setTaxes(createExpectedTaxs());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103762);ratePlan.setServiceCharges(createExpectedServiceCharges());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103763);ratePlan.setNeedGuarantee(NEED_GUARANTEE);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103764);ratePlan.setCancelPolicy(createExpectedCancelPolicy());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103765);ratePlan.setAvailGuarantees(createExpectedAvailGuarantee()); // TODO translator
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103766);ratePlan.setFreeMeal(createExpectedFreeMeal());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103767);return ratePlan;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private FreeMealDTO createExpectedFreeMeal() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103768);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103769);FreeMealDTO freeMeal = new FreeMealDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103770);freeMeal.setType(FreeMealType.NONE);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103771);return freeMeal;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RoomTypeDTO createExpectedRoomType() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103772);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103773);RoomTypeDTO roomType = new RoomTypeDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103774);roomType.setCode(ROOM_TYPE_CODE);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103775);roomType.setName(ROOM_TYPE_NAME);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103776);return roomType;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RateDTO createExpectedForthDayRate() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103777);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103778);return createExpectedRateDTO(NUMBER_THREE);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RateDTO createExpectedThirdDayRate() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103779);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103780);return createExpectedRateDTO(NUMBER_TWO);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RateDTO createExpectedSecondDayRate() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103781);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103782);return createExpectedRateDTO(NUMBER_ONE);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RateDTO createExpectedFirstDayRate() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103783);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103784);return createExpectedRateDTO(NUMBER_ZERO);
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private RateDTO createExpectedRateDTO(int index) {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103785);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103786);RateDTO rate = new RateDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103787);rate.setDateRange(createExpectedDateRangeDTO());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103788);rate.setPureAmount(createExpectedAmountDTO(CURRENCY, AMOUNT_BEFORE_TAXS[index]));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103789);rate.setMealsIncluded(new MealsIncludedDTO(MealsIncludedType.UNKNOWN));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103790);return rate;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedServiceCharges() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103791);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103792);List<ChargeItemDTO> serviceCharges = new ArrayList<ChargeItemDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103793);ChargeItemDTO serviceCharge = new ChargeItemDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103794);serviceCharge.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103795);serviceCharge.setType(ChargeType.FIXED);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103796);serviceCharge.setValue(SERVICE_CHARGE_AMOUNT);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103797);serviceCharge.setDescription(new String(SERVICE_CHARGE_DESC + seed.incrementAndGet()));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103798);serviceCharges.add(serviceCharge);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103799);return serviceCharges;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedTaxs() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103800);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103801);List<ChargeItemDTO> taxs = new ArrayList<ChargeItemDTO>();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103802);ChargeItemDTO tax = new ChargeItemDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103803);tax.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103804);tax.setValue(AMOUNT_TAX);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103805);tax.setType(ChargeType.FIXED);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103806);tax.setDescription(TAX_DESC + seed.incrementAndGet());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103807);taxs.add(tax);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103808);return taxs;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private SimpleAmountDTO createExpectedAmountDTO(Currency currency, BigDecimal amount) {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103809);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103810);SimpleAmountDTO simpleAmountDTO = new SimpleAmountDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103811);simpleAmountDTO.setCurrency(currency);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103812);simpleAmountDTO.setAmount(amount);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103813);return simpleAmountDTO;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private DateRangeDTO createExpectedDateRangeDTO() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103814);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103815);DateRangeDTO dateRangeDTO = new DateRangeDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103816);dateRangeDTO.setStart(new Date());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103817);dateRangeDTO.setEnd(new Date());
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103818);return dateRangeDTO;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

    private HotelRefDTO createExpectedHotelRef() {try{__CLR4_1_1027xf27xflusqkx0g.R.inc(103819);
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103820);HotelRefDTO hotelRef = new HotelRefDTO();
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103821);hotelRef.setCode(new String(HOTEL_CODE));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103822);hotelRef.setName(new String(HOTEL_NAME));
        __CLR4_1_1027xf27xflusqkx0g.R.inc(103823);return hotelRef;
    }finally{__CLR4_1_1027xf27xflusqkx0g.R.flushNeeded();}}

}
