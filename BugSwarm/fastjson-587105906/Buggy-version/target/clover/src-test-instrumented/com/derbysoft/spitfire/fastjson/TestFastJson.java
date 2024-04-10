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

public class TestFastJson {static class __CLR4_1_1028vn28vnluszwiyq{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,105056,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int TIMES       = 10000;
    private static final int STAYS_COUNT = 10;

    public void f_testF() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104819);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104820);Generic<String> q = new Generic<String>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104821);byte[] text = JSON.toJSONBytes(q, SerializerFeature.WriteClassName);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104822);JSON.parseObject(text, Generic.class);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void f_test() throws Exception {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104823);

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104824);String text = JSON.toJSONString(createTest(), SerializerFeature.WriteClassName);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104825);System.out.println(text.length());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104826);System.out.println(text);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104827);System.out.println("serialize finished");
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104828);GenericRS<HotelAvailRS> o = (GenericRS<HotelAvailRS>) JSON.parseObject(text, GenericRS.class);

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104829);System.out.println(o);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    public void testFP() throws IOException {__CLR4_1_1028vn28vnluszwiyq.R.globalSliceStart(getClass().getName(),104830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mtko6528vy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028vn28vnluszwiyq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028vn28vnluszwiyq.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testFP",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),104830,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mtko6528vy() throws IOException{try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104830);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104831);Generic<String> q = new Generic<String>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104832);for (int x = 0; (((x < STAYS_COUNT)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104833)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104834)==0&false)); ++x) {{
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104835);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104836);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104837);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104838)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104839)==0&false)); ++i) {{
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104840);jsonSerialize(q);
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104841);stopWatch.stop();

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104842);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104843);stopWatch.reset();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104844);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104845);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104846)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104847)==0&false)); ++i) {{
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104848);javaSerialize(q);
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104849);stopWatch.stop();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104850);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104851);System.out.println();
        }
    }}finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private <T> void jsonSerialize(T t) throws IOException {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104852);
        // String text = JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat);
        // System.out.println(text);

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104853);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104854);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);
        // SerializeWriter out = new SerializeWriter();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104855);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104856);serializer.write(t);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104857);out.writeTo(os, "UTF-8");
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104858);os.toByteArray();
        //System.out.println(JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
        //System.out.println("json " + os.toByteArray().length);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private <T> void javaSerialize(T t) throws IOException {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104859);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104860);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104861);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104862);oos.writeObject(t);
        // System.out.println("java " + os.toByteArray().length);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T jsonDeserialize(byte[] bytes, Class<T> clazz) throws IOException {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104863);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104864);return (T) JSON.parseObject(bytes, clazz);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T javaDeserialize(byte[] bytes) throws IOException, ClassNotFoundException {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104865);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104866);ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104867);ObjectInputStream ois = new ObjectInputStream(is);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104868);return (T) ois.readObject();
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    @Test
    public void testSerializePerformance() throws IOException {__CLR4_1_1028vn28vnluszwiyq.R.globalSliceStart(getClass().getName(),104869);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m447vt28x1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028vn28vnluszwiyq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028vn28vnluszwiyq.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testSerializePerformance",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),104869,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m447vt28x1() throws IOException{try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104869);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104870);Object obj = createTest();

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104871);for (int x = 0; (((x < 20)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104872)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104873)==0&false)); ++x) {{
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104874);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104875);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104876);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104877)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104878)==0&false)); ++i) {{
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104879);jsonSerialize(obj);
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104880);stopWatch.stop();

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104881);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104882);stopWatch.reset();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104883);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104884);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104885)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104886)==0&false)); ++i) {{
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104887);javaSerialize(obj);
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104888);stopWatch.stop();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104889);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104890);System.out.println();
        }
    }}finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    public void testDeserializePerformance() throws IOException, ClassNotFoundException {__CLR4_1_1028vn28vnluszwiyq.R.globalSliceStart(getClass().getName(),104891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ct3h6e28xn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1028vn28vnluszwiyq.R.rethrow($CLV_t2$);}finally{__CLR4_1_1028vn28vnluszwiyq.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testDeserializePerformance",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),104891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ct3h6e28xn() throws IOException, ClassNotFoundException{try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104891);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104892);Object obj = createTest();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104893);byte[] bytes = JSON.toJSONBytes(obj, SerializerFeature.WriteClassName);

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104894);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104895);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104896);oos.writeObject(obj);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104897);byte[] javaBytes = os.toByteArray();

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104898);System.out.println(bytes.length);

        __CLR4_1_1028vn28vnluszwiyq.R.inc(104899);for (int x = 0; (((x < 20)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104900)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104901)==0&false)); ++x) {{
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104902);StopWatch stopWatch = new StopWatch();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104903);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104904);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104905)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104906)==0&false)); ++i) {{
                // ByteArrayInputStream is = new ByteArrayInputStream(bytes);
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104907);Object o = jsonDeserialize(bytes, GenericRS.class);
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104908);o.getClass();
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104909);stopWatch.stop();

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104910);System.out.println("JSON deserialize:" + stopWatch.getTime());

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104911);stopWatch.reset();

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104912);stopWatch.start();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104913);for (int i = 0; (((i < TIMES)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104914)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104915)==0&false)); ++i) {{
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104916);Object o = javaDeserialize(javaBytes);
                __CLR4_1_1028vn28vnluszwiyq.R.inc(104917);o.getClass();
            }
            }__CLR4_1_1028vn28vnluszwiyq.R.inc(104918);stopWatch.stop();

            __CLR4_1_1028vn28vnluszwiyq.R.inc(104919);System.out.println("JAVA deserialize:" + stopWatch.getTime());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104920);System.out.println();
        }

    }}finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    public GenericRS<HotelAvailRS> createTest() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104921);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104922);GenericRS<HotelAvailRS> rs = new GenericRS<HotelAvailRS>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104923);rs.setHeader(new ResponseHeader("dsfsdfsd"));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104924);HotelAvailRS hotelAvailRS = createExpectedHotelAvailRS();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104925);TPAExtensionsDTO extensions = new TPAExtensionsDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104926);extensions.getElements().put("dfd", "Dfdf");
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104927);hotelAvailRS.setTpaExtensions(extensions);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104928);rs.setPayload(hotelAvailRS);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104929);return rs;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

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

    private HotelAvailRS createExpectedHotelAvailRS() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104930);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104931);HotelAvailRS payLoad = new HotelAvailRS();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104932);payLoad.setHotelAvailRoomStay(createExpectedHotelAvailRoomStay());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104933);return payLoad;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private HotelAvailRoomStayDTO createExpectedHotelAvailRoomStay() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104934);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104935);HotelAvailRoomStayDTO hotelAvailRoomStay = new HotelAvailRoomStayDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104936);hotelAvailRoomStay.setHotelRef(createExpectedHotelRef());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104937);hotelAvailRoomStay.setRoomStays(createExpectedRoomStays());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104938);return hotelAvailRoomStay;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private List<AvailRoomStayDTO> createExpectedRoomStays() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104939);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104940);ArrayList<AvailRoomStayDTO> roomStays = new ArrayList<AvailRoomStayDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104941);for (int i = 0; (((i < STAYS_COUNT)&&(__CLR4_1_1028vn28vnluszwiyq.R.iget(104942)!=0|true))||(__CLR4_1_1028vn28vnluszwiyq.R.iget(104943)==0&false)); ++i) {{
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104944);AvailRoomStayDTO roomStay = new AvailRoomStayDTO();
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104945);roomStay.setLanguageType(LANGUAGE_TYPE_CN);
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104946);roomStay.setRoomType(createExpectedRoomType());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104947);roomStay.setRatePlan(createExpectedRatePlan());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104948);roomStay.setQuantity(ROOM_COUNT);
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104949);roomStay.setRoomRate(createExpectedRoomRate());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104950);roomStay.setProviderChain(createExpectedProviderChain());
            __CLR4_1_1028vn28vnluszwiyq.R.inc(104951);roomStays.add(roomStay);
        }

        }__CLR4_1_1028vn28vnluszwiyq.R.inc(104952);return roomStays;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private ProviderChainDTO createExpectedProviderChain() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104953);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104954);ProviderChainDTO providerChain = new ProviderChainDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104955);List<UniqueIDDTO> providers = new ArrayList<UniqueIDDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104956);UniqueIDDTO provider = new UniqueIDDTO(PROVIDER_CODE, UniqueIDType.HOTEL);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104957);provider.setCompanyName(PROVIDER_CODE);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104958);providers.add(provider);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104959);providerChain.setProviders(providers);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104960);return providerChain;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private List<AvailGuaranteeDTO> createExpectedAvailGuarantee() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104961);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104962);List<AvailGuaranteeDTO> availGuarantees = new ArrayList<AvailGuaranteeDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104963);AvailGuaranteeDTO availGuaranteeDTO = new AvailGuaranteeDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104964);availGuaranteeDTO.setGuaranteeType(GuaranteeType.CreditCard);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104965);availGuaranteeDTO.setCardCode(VISA);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104966);availGuaranteeDTO.setTpaExtensions(createExpectedEpaExtensions());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104967);availGuarantees.add(availGuaranteeDTO);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104968);return availGuarantees;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private TPAExtensionsDTO createExpectedEpaExtensions() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104969);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104970);TPAExtensionsDTO tpaExtensions = new TPAExtensionsDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104971);tpaExtensions.setElement("description", GUARANTEE_DESCRIPTION);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104972);return tpaExtensions;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private CancelPolicyDTO createExpectedCancelPolicy() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104973);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104974);CancelPolicyDTO cancelPolicyDTO = new CancelPolicyDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104975);cancelPolicyDTO.setCancelPenaltyType(CancelPenaltyType.UNKNOWN);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104976);cancelPolicyDTO.setDeadline("16:00");
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104977);cancelPolicyDTO.setDescription(CANCEL_POLICY_DESCRIPTION);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104978);return cancelPolicyDTO;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RoomRateDTO createExpectedRoomRate() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104979);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104980);RoomRateDTO roomRate = new RoomRateDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104981);List<RateDTO> rates = new ArrayList<RateDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104982);rates.add(createExpectedFirstDayRate());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104983);rates.add(createExpectedSecondDayRate());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104984);rates.add(createExpectedThirdDayRate());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104985);rates.add(createExpectedForthDayRate());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104986);roomRate.setRates(rates);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104987);return roomRate;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RatePlanDTO createExpectedRatePlan() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(104988);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104989);RatePlanDTO ratePlan = new RatePlanDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104990);ratePlan.setCode(RATE_PLAN_CODE);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104991);ratePlan.setName(RATE_PLAN_NAME);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104992);ratePlan.setPaymentType(PAYMENT_TYPE_POA); // TODO paymentType only cash back?
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104993);ratePlan.setTaxes(createExpectedTaxs());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104994);ratePlan.setServiceCharges(createExpectedServiceCharges());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104995);ratePlan.setNeedGuarantee(NEED_GUARANTEE);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104996);ratePlan.setCancelPolicy(createExpectedCancelPolicy());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104997);ratePlan.setAvailGuarantees(createExpectedAvailGuarantee()); // TODO translator
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104998);ratePlan.setFreeMeal(createExpectedFreeMeal());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(104999);return ratePlan;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private FreeMealDTO createExpectedFreeMeal() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105000);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105001);FreeMealDTO freeMeal = new FreeMealDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105002);freeMeal.setType(FreeMealType.NONE);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105003);return freeMeal;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RoomTypeDTO createExpectedRoomType() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105004);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105005);RoomTypeDTO roomType = new RoomTypeDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105006);roomType.setCode(ROOM_TYPE_CODE);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105007);roomType.setName(ROOM_TYPE_NAME);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105008);return roomType;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RateDTO createExpectedForthDayRate() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105009);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105010);return createExpectedRateDTO(NUMBER_THREE);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RateDTO createExpectedThirdDayRate() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105011);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105012);return createExpectedRateDTO(NUMBER_TWO);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RateDTO createExpectedSecondDayRate() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105013);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105014);return createExpectedRateDTO(NUMBER_ONE);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RateDTO createExpectedFirstDayRate() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105015);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105016);return createExpectedRateDTO(NUMBER_ZERO);
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private RateDTO createExpectedRateDTO(int index) {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105017);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105018);RateDTO rate = new RateDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105019);rate.setDateRange(createExpectedDateRangeDTO());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105020);rate.setPureAmount(createExpectedAmountDTO(CURRENCY, AMOUNT_BEFORE_TAXS[index]));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105021);rate.setMealsIncluded(new MealsIncludedDTO(MealsIncludedType.UNKNOWN));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105022);return rate;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedServiceCharges() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105023);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105024);List<ChargeItemDTO> serviceCharges = new ArrayList<ChargeItemDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105025);ChargeItemDTO serviceCharge = new ChargeItemDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105026);serviceCharge.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105027);serviceCharge.setType(ChargeType.FIXED);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105028);serviceCharge.setValue(SERVICE_CHARGE_AMOUNT);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105029);serviceCharge.setDescription(new String(SERVICE_CHARGE_DESC + seed.incrementAndGet()));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105030);serviceCharges.add(serviceCharge);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105031);return serviceCharges;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedTaxs() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105032);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105033);List<ChargeItemDTO> taxs = new ArrayList<ChargeItemDTO>();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105034);ChargeItemDTO tax = new ChargeItemDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105035);tax.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105036);tax.setValue(AMOUNT_TAX);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105037);tax.setType(ChargeType.FIXED);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105038);tax.setDescription(TAX_DESC + seed.incrementAndGet());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105039);taxs.add(tax);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105040);return taxs;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private SimpleAmountDTO createExpectedAmountDTO(Currency currency, BigDecimal amount) {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105041);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105042);SimpleAmountDTO simpleAmountDTO = new SimpleAmountDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105043);simpleAmountDTO.setCurrency(currency);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105044);simpleAmountDTO.setAmount(amount);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105045);return simpleAmountDTO;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private DateRangeDTO createExpectedDateRangeDTO() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105046);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105047);DateRangeDTO dateRangeDTO = new DateRangeDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105048);dateRangeDTO.setStart(new Date());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105049);dateRangeDTO.setEnd(new Date());
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105050);return dateRangeDTO;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

    private HotelRefDTO createExpectedHotelRef() {try{__CLR4_1_1028vn28vnluszwiyq.R.inc(105051);
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105052);HotelRefDTO hotelRef = new HotelRefDTO();
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105053);hotelRef.setCode(new String(HOTEL_CODE));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105054);hotelRef.setName(new String(HOTEL_NAME));
        __CLR4_1_1028vn28vnluszwiyq.R.inc(105055);return hotelRef;
    }finally{__CLR4_1_1028vn28vnluszwiyq.R.flushNeeded();}}

}
