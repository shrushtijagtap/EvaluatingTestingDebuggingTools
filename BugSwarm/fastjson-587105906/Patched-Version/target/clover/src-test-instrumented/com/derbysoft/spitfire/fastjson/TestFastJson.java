/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.derbysoft.spitfire.fastjson;

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

public class TestFastJson {static class __CLR4_5_227x427x4lusyjxa0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,103813,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int TIMES       = 10000;
    private static final int STAYS_COUNT = 10;

    public void f_testF() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103576);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103577);Generic<String> q = new Generic<String>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103578);byte[] text = JSON.toJSONBytes(q, SerializerFeature.WriteClassName);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103579);JSON.parseObject(text, Generic.class);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void f_test() throws Exception {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103580);

        __CLR4_5_227x427x4lusyjxa0.R.inc(103581);String text = JSON.toJSONString(createTest(), SerializerFeature.WriteClassName);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103582);System.out.println(text.length());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103583);System.out.println(text);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103584);System.out.println("serialize finished");
        __CLR4_5_227x427x4lusyjxa0.R.inc(103585);GenericRS<HotelAvailRS> o = (GenericRS<HotelAvailRS>) JSON.parseObject(text, GenericRS.class);

        __CLR4_5_227x427x4lusyjxa0.R.inc(103586);System.out.println(o);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    public void testFP() throws IOException {__CLR4_5_227x427x4lusyjxa0.R.globalSliceStart(getClass().getName(),103587);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mtko6527xf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227x427x4lusyjxa0.R.rethrow($CLV_t2$);}finally{__CLR4_5_227x427x4lusyjxa0.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testFP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103587,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mtko6527xf() throws IOException{try{__CLR4_5_227x427x4lusyjxa0.R.inc(103587);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103588);Generic<String> q = new Generic<String>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103589);for (int x = 0; (((x < STAYS_COUNT)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103590)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103591)==0&false)); ++x) {{
            __CLR4_5_227x427x4lusyjxa0.R.inc(103592);StopWatch stopWatch = new StopWatch();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103593);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103594);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103595)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103596)==0&false)); ++i) {{
                __CLR4_5_227x427x4lusyjxa0.R.inc(103597);jsonSerialize(q);
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103598);stopWatch.stop();

            __CLR4_5_227x427x4lusyjxa0.R.inc(103599);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_5_227x427x4lusyjxa0.R.inc(103600);stopWatch.reset();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103601);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103602);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103603)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103604)==0&false)); ++i) {{
                __CLR4_5_227x427x4lusyjxa0.R.inc(103605);javaSerialize(q);
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103606);stopWatch.stop();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103607);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103608);System.out.println();
        }
    }}finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private <T> void jsonSerialize(T t) throws IOException {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103609);
        // String text = JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat);
        // System.out.println(text);

        __CLR4_5_227x427x4lusyjxa0.R.inc(103610);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103611);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);
        // SerializeWriter out = new SerializeWriter();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103612);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103613);serializer.write(t);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103614);out.writeTo(os, "UTF-8");
        __CLR4_5_227x427x4lusyjxa0.R.inc(103615);os.toByteArray();
        //System.out.println(JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
        //System.out.println("json " + os.toByteArray().length);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private <T> void javaSerialize(T t) throws IOException {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103616);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103617);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103618);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103619);oos.writeObject(t);
        // System.out.println("java " + os.toByteArray().length);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T jsonDeserialize(byte[] bytes, Class<T> clazz) throws IOException {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103620);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103621);return (T) JSON.parseObject(bytes, clazz);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T javaDeserialize(byte[] bytes) throws IOException, ClassNotFoundException {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103622);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103623);ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103624);ObjectInputStream ois = new ObjectInputStream(is);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103625);return (T) ois.readObject();
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    @Test
    public void testSerializePerformance() throws IOException {__CLR4_5_227x427x4lusyjxa0.R.globalSliceStart(getClass().getName(),103626);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m447vt27yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227x427x4lusyjxa0.R.rethrow($CLV_t2$);}finally{__CLR4_5_227x427x4lusyjxa0.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testSerializePerformance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103626,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m447vt27yi() throws IOException{try{__CLR4_5_227x427x4lusyjxa0.R.inc(103626);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103627);Object obj = createTest();

        __CLR4_5_227x427x4lusyjxa0.R.inc(103628);for (int x = 0; (((x < 20)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103629)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103630)==0&false)); ++x) {{
            __CLR4_5_227x427x4lusyjxa0.R.inc(103631);StopWatch stopWatch = new StopWatch();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103632);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103633);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103634)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103635)==0&false)); ++i) {{
                __CLR4_5_227x427x4lusyjxa0.R.inc(103636);jsonSerialize(obj);
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103637);stopWatch.stop();

            __CLR4_5_227x427x4lusyjxa0.R.inc(103638);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_5_227x427x4lusyjxa0.R.inc(103639);stopWatch.reset();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103640);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103641);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103642)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103643)==0&false)); ++i) {{
                __CLR4_5_227x427x4lusyjxa0.R.inc(103644);javaSerialize(obj);
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103645);stopWatch.stop();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103646);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103647);System.out.println();
        }
    }}finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    public void testDeserializePerformance() throws IOException, ClassNotFoundException {__CLR4_5_227x427x4lusyjxa0.R.globalSliceStart(getClass().getName(),103648);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ct3h6e27z4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_227x427x4lusyjxa0.R.rethrow($CLV_t2$);}finally{__CLR4_5_227x427x4lusyjxa0.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testDeserializePerformance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),103648,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ct3h6e27z4() throws IOException, ClassNotFoundException{try{__CLR4_5_227x427x4lusyjxa0.R.inc(103648);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103649);Object obj = createTest();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103650);byte[] bytes = JSON.toJSONBytes(obj, SerializerFeature.WriteClassName);

        __CLR4_5_227x427x4lusyjxa0.R.inc(103651);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103652);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103653);oos.writeObject(obj);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103654);byte[] javaBytes = os.toByteArray();

        __CLR4_5_227x427x4lusyjxa0.R.inc(103655);System.out.println(bytes.length);

        __CLR4_5_227x427x4lusyjxa0.R.inc(103656);for (int x = 0; (((x < 20)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103657)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103658)==0&false)); ++x) {{
            __CLR4_5_227x427x4lusyjxa0.R.inc(103659);StopWatch stopWatch = new StopWatch();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103660);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103661);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103662)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103663)==0&false)); ++i) {{
                // ByteArrayInputStream is = new ByteArrayInputStream(bytes);
                __CLR4_5_227x427x4lusyjxa0.R.inc(103664);Object o = jsonDeserialize(bytes, GenericRS.class);
                __CLR4_5_227x427x4lusyjxa0.R.inc(103665);o.getClass();
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103666);stopWatch.stop();

            __CLR4_5_227x427x4lusyjxa0.R.inc(103667);System.out.println("JSON deserialize:" + stopWatch.getTime());

            __CLR4_5_227x427x4lusyjxa0.R.inc(103668);stopWatch.reset();

            __CLR4_5_227x427x4lusyjxa0.R.inc(103669);stopWatch.start();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103670);for (int i = 0; (((i < TIMES)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103671)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103672)==0&false)); ++i) {{
                __CLR4_5_227x427x4lusyjxa0.R.inc(103673);Object o = javaDeserialize(javaBytes);
                __CLR4_5_227x427x4lusyjxa0.R.inc(103674);o.getClass();
            }
            }__CLR4_5_227x427x4lusyjxa0.R.inc(103675);stopWatch.stop();

            __CLR4_5_227x427x4lusyjxa0.R.inc(103676);System.out.println("JAVA deserialize:" + stopWatch.getTime());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103677);System.out.println();
        }

    }}finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    public GenericRS<HotelAvailRS> createTest() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103678);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103679);GenericRS<HotelAvailRS> rs = new GenericRS<HotelAvailRS>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103680);rs.setHeader(new ResponseHeader("dsfsdfsd"));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103681);HotelAvailRS hotelAvailRS = createExpectedHotelAvailRS();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103682);TPAExtensionsDTO extensions = new TPAExtensionsDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103683);extensions.getElements().put("dfd", "Dfdf");
        __CLR4_5_227x427x4lusyjxa0.R.inc(103684);hotelAvailRS.setTpaExtensions(extensions);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103685);rs.setPayload(hotelAvailRS);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103686);return rs;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

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

    private HotelAvailRS createExpectedHotelAvailRS() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103687);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103688);HotelAvailRS payLoad = new HotelAvailRS();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103689);payLoad.setHotelAvailRoomStay(createExpectedHotelAvailRoomStay());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103690);return payLoad;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private HotelAvailRoomStayDTO createExpectedHotelAvailRoomStay() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103691);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103692);HotelAvailRoomStayDTO hotelAvailRoomStay = new HotelAvailRoomStayDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103693);hotelAvailRoomStay.setHotelRef(createExpectedHotelRef());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103694);hotelAvailRoomStay.setRoomStays(createExpectedRoomStays());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103695);return hotelAvailRoomStay;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private List<AvailRoomStayDTO> createExpectedRoomStays() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103696);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103697);ArrayList<AvailRoomStayDTO> roomStays = new ArrayList<AvailRoomStayDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103698);for (int i = 0; (((i < STAYS_COUNT)&&(__CLR4_5_227x427x4lusyjxa0.R.iget(103699)!=0|true))||(__CLR4_5_227x427x4lusyjxa0.R.iget(103700)==0&false)); ++i) {{
            __CLR4_5_227x427x4lusyjxa0.R.inc(103701);AvailRoomStayDTO roomStay = new AvailRoomStayDTO();
            __CLR4_5_227x427x4lusyjxa0.R.inc(103702);roomStay.setLanguageType(LANGUAGE_TYPE_CN);
            __CLR4_5_227x427x4lusyjxa0.R.inc(103703);roomStay.setRoomType(createExpectedRoomType());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103704);roomStay.setRatePlan(createExpectedRatePlan());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103705);roomStay.setQuantity(ROOM_COUNT);
            __CLR4_5_227x427x4lusyjxa0.R.inc(103706);roomStay.setRoomRate(createExpectedRoomRate());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103707);roomStay.setProviderChain(createExpectedProviderChain());
            __CLR4_5_227x427x4lusyjxa0.R.inc(103708);roomStays.add(roomStay);
        }

        }__CLR4_5_227x427x4lusyjxa0.R.inc(103709);return roomStays;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private ProviderChainDTO createExpectedProviderChain() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103710);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103711);ProviderChainDTO providerChain = new ProviderChainDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103712);List<UniqueIDDTO> providers = new ArrayList<UniqueIDDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103713);UniqueIDDTO provider = new UniqueIDDTO(PROVIDER_CODE, UniqueIDType.HOTEL);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103714);provider.setCompanyName(PROVIDER_CODE);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103715);providers.add(provider);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103716);providerChain.setProviders(providers);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103717);return providerChain;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private List<AvailGuaranteeDTO> createExpectedAvailGuarantee() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103718);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103719);List<AvailGuaranteeDTO> availGuarantees = new ArrayList<AvailGuaranteeDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103720);AvailGuaranteeDTO availGuaranteeDTO = new AvailGuaranteeDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103721);availGuaranteeDTO.setGuaranteeType(GuaranteeType.CreditCard);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103722);availGuaranteeDTO.setCardCode(VISA);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103723);availGuaranteeDTO.setTpaExtensions(createExpectedEpaExtensions());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103724);availGuarantees.add(availGuaranteeDTO);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103725);return availGuarantees;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private TPAExtensionsDTO createExpectedEpaExtensions() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103726);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103727);TPAExtensionsDTO tpaExtensions = new TPAExtensionsDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103728);tpaExtensions.setElement("description", GUARANTEE_DESCRIPTION);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103729);return tpaExtensions;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private CancelPolicyDTO createExpectedCancelPolicy() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103730);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103731);CancelPolicyDTO cancelPolicyDTO = new CancelPolicyDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103732);cancelPolicyDTO.setCancelPenaltyType(CancelPenaltyType.UNKNOWN);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103733);cancelPolicyDTO.setDeadline("16:00");
        __CLR4_5_227x427x4lusyjxa0.R.inc(103734);cancelPolicyDTO.setDescription(CANCEL_POLICY_DESCRIPTION);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103735);return cancelPolicyDTO;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RoomRateDTO createExpectedRoomRate() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103736);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103737);RoomRateDTO roomRate = new RoomRateDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103738);List<RateDTO> rates = new ArrayList<RateDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103739);rates.add(createExpectedFirstDayRate());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103740);rates.add(createExpectedSecondDayRate());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103741);rates.add(createExpectedThirdDayRate());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103742);rates.add(createExpectedForthDayRate());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103743);roomRate.setRates(rates);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103744);return roomRate;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RatePlanDTO createExpectedRatePlan() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103745);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103746);RatePlanDTO ratePlan = new RatePlanDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103747);ratePlan.setCode(RATE_PLAN_CODE);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103748);ratePlan.setName(RATE_PLAN_NAME);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103749);ratePlan.setPaymentType(PAYMENT_TYPE_POA); // TODO paymentType only cash back?
        __CLR4_5_227x427x4lusyjxa0.R.inc(103750);ratePlan.setTaxes(createExpectedTaxs());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103751);ratePlan.setServiceCharges(createExpectedServiceCharges());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103752);ratePlan.setNeedGuarantee(NEED_GUARANTEE);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103753);ratePlan.setCancelPolicy(createExpectedCancelPolicy());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103754);ratePlan.setAvailGuarantees(createExpectedAvailGuarantee()); // TODO translator
        __CLR4_5_227x427x4lusyjxa0.R.inc(103755);ratePlan.setFreeMeal(createExpectedFreeMeal());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103756);return ratePlan;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private FreeMealDTO createExpectedFreeMeal() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103757);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103758);FreeMealDTO freeMeal = new FreeMealDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103759);freeMeal.setType(FreeMealType.NONE);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103760);return freeMeal;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RoomTypeDTO createExpectedRoomType() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103761);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103762);RoomTypeDTO roomType = new RoomTypeDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103763);roomType.setCode(ROOM_TYPE_CODE);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103764);roomType.setName(ROOM_TYPE_NAME);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103765);return roomType;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RateDTO createExpectedForthDayRate() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103766);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103767);return createExpectedRateDTO(NUMBER_THREE);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RateDTO createExpectedThirdDayRate() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103768);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103769);return createExpectedRateDTO(NUMBER_TWO);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RateDTO createExpectedSecondDayRate() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103770);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103771);return createExpectedRateDTO(NUMBER_ONE);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RateDTO createExpectedFirstDayRate() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103772);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103773);return createExpectedRateDTO(NUMBER_ZERO);
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private RateDTO createExpectedRateDTO(int index) {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103774);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103775);RateDTO rate = new RateDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103776);rate.setDateRange(createExpectedDateRangeDTO());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103777);rate.setPureAmount(createExpectedAmountDTO(CURRENCY, AMOUNT_BEFORE_TAXS[index]));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103778);rate.setMealsIncluded(new MealsIncludedDTO(MealsIncludedType.UNKNOWN));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103779);return rate;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedServiceCharges() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103780);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103781);List<ChargeItemDTO> serviceCharges = new ArrayList<ChargeItemDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103782);ChargeItemDTO serviceCharge = new ChargeItemDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103783);serviceCharge.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103784);serviceCharge.setType(ChargeType.FIXED);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103785);serviceCharge.setValue(SERVICE_CHARGE_AMOUNT);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103786);serviceCharge.setDescription(new String(SERVICE_CHARGE_DESC + seed.incrementAndGet()));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103787);serviceCharges.add(serviceCharge);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103788);return serviceCharges;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedTaxs() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103789);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103790);List<ChargeItemDTO> taxs = new ArrayList<ChargeItemDTO>();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103791);ChargeItemDTO tax = new ChargeItemDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103792);tax.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103793);tax.setValue(AMOUNT_TAX);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103794);tax.setType(ChargeType.FIXED);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103795);tax.setDescription(TAX_DESC + seed.incrementAndGet());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103796);taxs.add(tax);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103797);return taxs;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private SimpleAmountDTO createExpectedAmountDTO(Currency currency, BigDecimal amount) {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103798);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103799);SimpleAmountDTO simpleAmountDTO = new SimpleAmountDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103800);simpleAmountDTO.setCurrency(currency);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103801);simpleAmountDTO.setAmount(amount);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103802);return simpleAmountDTO;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private DateRangeDTO createExpectedDateRangeDTO() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103803);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103804);DateRangeDTO dateRangeDTO = new DateRangeDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103805);dateRangeDTO.setStart(new Date());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103806);dateRangeDTO.setEnd(new Date());
        __CLR4_5_227x427x4lusyjxa0.R.inc(103807);return dateRangeDTO;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

    private HotelRefDTO createExpectedHotelRef() {try{__CLR4_5_227x427x4lusyjxa0.R.inc(103808);
        __CLR4_5_227x427x4lusyjxa0.R.inc(103809);HotelRefDTO hotelRef = new HotelRefDTO();
        __CLR4_5_227x427x4lusyjxa0.R.inc(103810);hotelRef.setCode(new String(HOTEL_CODE));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103811);hotelRef.setName(new String(HOTEL_NAME));
        __CLR4_5_227x427x4lusyjxa0.R.inc(103812);return hotelRef;
    }finally{__CLR4_5_227x427x4lusyjxa0.R.flushNeeded();}}

}
