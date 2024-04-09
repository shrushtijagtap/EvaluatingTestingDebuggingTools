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

public class TestFastJson {static class __CLR4_5_228vc28vclusvnlr9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,105045,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private static final int TIMES       = 10000;
    private static final int STAYS_COUNT = 10;

    public void f_testF() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104808);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104809);Generic<String> q = new Generic<String>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104810);byte[] text = JSON.toJSONBytes(q, SerializerFeature.WriteClassName);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104811);JSON.parseObject(text, Generic.class);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    public void f_test() throws Exception {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104812);

        __CLR4_5_228vc28vclusvnlr9.R.inc(104813);String text = JSON.toJSONString(createTest(), SerializerFeature.WriteClassName);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104814);System.out.println(text.length());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104815);System.out.println(text);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104816);System.out.println("serialize finished");
        __CLR4_5_228vc28vclusvnlr9.R.inc(104817);GenericRS<HotelAvailRS> o = (GenericRS<HotelAvailRS>) JSON.parseObject(text, GenericRS.class);

        __CLR4_5_228vc28vclusvnlr9.R.inc(104818);System.out.println(o);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    public void testFP() throws IOException {__CLR4_5_228vc28vclusvnlr9.R.globalSliceStart(getClass().getName(),104819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mtko6528vn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228vc28vclusvnlr9.R.rethrow($CLV_t2$);}finally{__CLR4_5_228vc28vclusvnlr9.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testFP",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104819,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mtko6528vn() throws IOException{try{__CLR4_5_228vc28vclusvnlr9.R.inc(104819);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104820);Generic<String> q = new Generic<String>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104821);for (int x = 0; (((x < STAYS_COUNT)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104822)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104823)==0&false)); ++x) {{
            __CLR4_5_228vc28vclusvnlr9.R.inc(104824);StopWatch stopWatch = new StopWatch();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104825);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104826);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104827)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104828)==0&false)); ++i) {{
                __CLR4_5_228vc28vclusvnlr9.R.inc(104829);jsonSerialize(q);
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104830);stopWatch.stop();

            __CLR4_5_228vc28vclusvnlr9.R.inc(104831);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_5_228vc28vclusvnlr9.R.inc(104832);stopWatch.reset();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104833);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104834);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104835)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104836)==0&false)); ++i) {{
                __CLR4_5_228vc28vclusvnlr9.R.inc(104837);javaSerialize(q);
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104838);stopWatch.stop();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104839);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104840);System.out.println();
        }
    }}finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private <T> void jsonSerialize(T t) throws IOException {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104841);
        // String text = JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat);
        // System.out.println(text);

        __CLR4_5_228vc28vclusvnlr9.R.inc(104842);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104843);SerializeWriter out = new SerializeWriter(SerializerFeature.WriteClassName);
        // SerializeWriter out = new SerializeWriter();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104844);JSONSerializer serializer = new JSONSerializer(out);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104845);serializer.write(t);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104846);out.writeTo(os, "UTF-8");
        __CLR4_5_228vc28vclusvnlr9.R.inc(104847);os.toByteArray();
        //System.out.println(JSON.toJSONString(t, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat));
        //System.out.println("json " + os.toByteArray().length);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private <T> void javaSerialize(T t) throws IOException {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104848);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104849);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104850);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104851);oos.writeObject(t);
        // System.out.println("java " + os.toByteArray().length);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T jsonDeserialize(byte[] bytes, Class<T> clazz) throws IOException {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104852);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104853);return (T) JSON.parseObject(bytes, clazz);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    @SuppressWarnings("unchecked")
    private <T> T javaDeserialize(byte[] bytes) throws IOException, ClassNotFoundException {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104854);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104855);ByteArrayInputStream is = new ByteArrayInputStream(bytes);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104856);ObjectInputStream ois = new ObjectInputStream(is);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104857);return (T) ois.readObject();
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    @Test
    public void testSerializePerformance() throws IOException {__CLR4_5_228vc28vclusvnlr9.R.globalSliceStart(getClass().getName(),104858);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m447vt28wq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228vc28vclusvnlr9.R.rethrow($CLV_t2$);}finally{__CLR4_5_228vc28vclusvnlr9.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testSerializePerformance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104858,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m447vt28wq() throws IOException{try{__CLR4_5_228vc28vclusvnlr9.R.inc(104858);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104859);Object obj = createTest();

        __CLR4_5_228vc28vclusvnlr9.R.inc(104860);for (int x = 0; (((x < 20)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104861)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104862)==0&false)); ++x) {{
            __CLR4_5_228vc28vclusvnlr9.R.inc(104863);StopWatch stopWatch = new StopWatch();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104864);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104865);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104866)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104867)==0&false)); ++i) {{
                __CLR4_5_228vc28vclusvnlr9.R.inc(104868);jsonSerialize(obj);
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104869);stopWatch.stop();

            __CLR4_5_228vc28vclusvnlr9.R.inc(104870);System.out.println("JSON serialize:" + stopWatch.getTime());

            __CLR4_5_228vc28vclusvnlr9.R.inc(104871);stopWatch.reset();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104872);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104873);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104874)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104875)==0&false)); ++i) {{
                __CLR4_5_228vc28vclusvnlr9.R.inc(104876);javaSerialize(obj);
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104877);stopWatch.stop();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104878);System.out.println("JAVA serialize:" + stopWatch.getTime());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104879);System.out.println();
        }
    }}finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    public void testDeserializePerformance() throws IOException, ClassNotFoundException {__CLR4_5_228vc28vclusvnlr9.R.globalSliceStart(getClass().getName(),104880);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ct3h6e28xc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_228vc28vclusvnlr9.R.rethrow($CLV_t2$);}finally{__CLR4_5_228vc28vclusvnlr9.R.globalSliceEnd(getClass().getName(),"com.derbysoft.spitfire.fastjson.TestFastJson.testDeserializePerformance",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),104880,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ct3h6e28xc() throws IOException, ClassNotFoundException{try{__CLR4_5_228vc28vclusvnlr9.R.inc(104880);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104881);Object obj = createTest();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104882);byte[] bytes = JSON.toJSONBytes(obj, SerializerFeature.WriteClassName);

        __CLR4_5_228vc28vclusvnlr9.R.inc(104883);ByteArrayOutputStream os = new ByteArrayOutputStream();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104884);ObjectOutputStream oos = new ObjectOutputStream(os);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104885);oos.writeObject(obj);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104886);byte[] javaBytes = os.toByteArray();

        __CLR4_5_228vc28vclusvnlr9.R.inc(104887);System.out.println(bytes.length);

        __CLR4_5_228vc28vclusvnlr9.R.inc(104888);for (int x = 0; (((x < 20)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104889)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104890)==0&false)); ++x) {{
            __CLR4_5_228vc28vclusvnlr9.R.inc(104891);StopWatch stopWatch = new StopWatch();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104892);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104893);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104894)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104895)==0&false)); ++i) {{
                // ByteArrayInputStream is = new ByteArrayInputStream(bytes);
                __CLR4_5_228vc28vclusvnlr9.R.inc(104896);Object o = jsonDeserialize(bytes, GenericRS.class);
                __CLR4_5_228vc28vclusvnlr9.R.inc(104897);o.getClass();
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104898);stopWatch.stop();

            __CLR4_5_228vc28vclusvnlr9.R.inc(104899);System.out.println("JSON deserialize:" + stopWatch.getTime());

            __CLR4_5_228vc28vclusvnlr9.R.inc(104900);stopWatch.reset();

            __CLR4_5_228vc28vclusvnlr9.R.inc(104901);stopWatch.start();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104902);for (int i = 0; (((i < TIMES)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104903)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104904)==0&false)); ++i) {{
                __CLR4_5_228vc28vclusvnlr9.R.inc(104905);Object o = javaDeserialize(javaBytes);
                __CLR4_5_228vc28vclusvnlr9.R.inc(104906);o.getClass();
            }
            }__CLR4_5_228vc28vclusvnlr9.R.inc(104907);stopWatch.stop();

            __CLR4_5_228vc28vclusvnlr9.R.inc(104908);System.out.println("JAVA deserialize:" + stopWatch.getTime());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104909);System.out.println();
        }

    }}finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    public GenericRS<HotelAvailRS> createTest() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104910);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104911);GenericRS<HotelAvailRS> rs = new GenericRS<HotelAvailRS>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104912);rs.setHeader(new ResponseHeader("dsfsdfsd"));
        __CLR4_5_228vc28vclusvnlr9.R.inc(104913);HotelAvailRS hotelAvailRS = createExpectedHotelAvailRS();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104914);TPAExtensionsDTO extensions = new TPAExtensionsDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104915);extensions.getElements().put("dfd", "Dfdf");
        __CLR4_5_228vc28vclusvnlr9.R.inc(104916);hotelAvailRS.setTpaExtensions(extensions);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104917);rs.setPayload(hotelAvailRS);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104918);return rs;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

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

    private HotelAvailRS createExpectedHotelAvailRS() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104919);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104920);HotelAvailRS payLoad = new HotelAvailRS();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104921);payLoad.setHotelAvailRoomStay(createExpectedHotelAvailRoomStay());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104922);return payLoad;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private HotelAvailRoomStayDTO createExpectedHotelAvailRoomStay() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104923);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104924);HotelAvailRoomStayDTO hotelAvailRoomStay = new HotelAvailRoomStayDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104925);hotelAvailRoomStay.setHotelRef(createExpectedHotelRef());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104926);hotelAvailRoomStay.setRoomStays(createExpectedRoomStays());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104927);return hotelAvailRoomStay;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private List<AvailRoomStayDTO> createExpectedRoomStays() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104928);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104929);ArrayList<AvailRoomStayDTO> roomStays = new ArrayList<AvailRoomStayDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104930);for (int i = 0; (((i < STAYS_COUNT)&&(__CLR4_5_228vc28vclusvnlr9.R.iget(104931)!=0|true))||(__CLR4_5_228vc28vclusvnlr9.R.iget(104932)==0&false)); ++i) {{
            __CLR4_5_228vc28vclusvnlr9.R.inc(104933);AvailRoomStayDTO roomStay = new AvailRoomStayDTO();
            __CLR4_5_228vc28vclusvnlr9.R.inc(104934);roomStay.setLanguageType(LANGUAGE_TYPE_CN);
            __CLR4_5_228vc28vclusvnlr9.R.inc(104935);roomStay.setRoomType(createExpectedRoomType());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104936);roomStay.setRatePlan(createExpectedRatePlan());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104937);roomStay.setQuantity(ROOM_COUNT);
            __CLR4_5_228vc28vclusvnlr9.R.inc(104938);roomStay.setRoomRate(createExpectedRoomRate());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104939);roomStay.setProviderChain(createExpectedProviderChain());
            __CLR4_5_228vc28vclusvnlr9.R.inc(104940);roomStays.add(roomStay);
        }

        }__CLR4_5_228vc28vclusvnlr9.R.inc(104941);return roomStays;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private ProviderChainDTO createExpectedProviderChain() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104942);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104943);ProviderChainDTO providerChain = new ProviderChainDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104944);List<UniqueIDDTO> providers = new ArrayList<UniqueIDDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104945);UniqueIDDTO provider = new UniqueIDDTO(PROVIDER_CODE, UniqueIDType.HOTEL);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104946);provider.setCompanyName(PROVIDER_CODE);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104947);providers.add(provider);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104948);providerChain.setProviders(providers);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104949);return providerChain;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private List<AvailGuaranteeDTO> createExpectedAvailGuarantee() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104950);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104951);List<AvailGuaranteeDTO> availGuarantees = new ArrayList<AvailGuaranteeDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104952);AvailGuaranteeDTO availGuaranteeDTO = new AvailGuaranteeDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104953);availGuaranteeDTO.setGuaranteeType(GuaranteeType.CreditCard);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104954);availGuaranteeDTO.setCardCode(VISA);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104955);availGuaranteeDTO.setTpaExtensions(createExpectedEpaExtensions());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104956);availGuarantees.add(availGuaranteeDTO);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104957);return availGuarantees;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private TPAExtensionsDTO createExpectedEpaExtensions() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104958);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104959);TPAExtensionsDTO tpaExtensions = new TPAExtensionsDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104960);tpaExtensions.setElement("description", GUARANTEE_DESCRIPTION);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104961);return tpaExtensions;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private CancelPolicyDTO createExpectedCancelPolicy() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104962);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104963);CancelPolicyDTO cancelPolicyDTO = new CancelPolicyDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104964);cancelPolicyDTO.setCancelPenaltyType(CancelPenaltyType.UNKNOWN);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104965);cancelPolicyDTO.setDeadline("16:00");
        __CLR4_5_228vc28vclusvnlr9.R.inc(104966);cancelPolicyDTO.setDescription(CANCEL_POLICY_DESCRIPTION);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104967);return cancelPolicyDTO;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RoomRateDTO createExpectedRoomRate() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104968);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104969);RoomRateDTO roomRate = new RoomRateDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104970);List<RateDTO> rates = new ArrayList<RateDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104971);rates.add(createExpectedFirstDayRate());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104972);rates.add(createExpectedSecondDayRate());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104973);rates.add(createExpectedThirdDayRate());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104974);rates.add(createExpectedForthDayRate());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104975);roomRate.setRates(rates);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104976);return roomRate;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RatePlanDTO createExpectedRatePlan() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104977);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104978);RatePlanDTO ratePlan = new RatePlanDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104979);ratePlan.setCode(RATE_PLAN_CODE);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104980);ratePlan.setName(RATE_PLAN_NAME);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104981);ratePlan.setPaymentType(PAYMENT_TYPE_POA); // TODO paymentType only cash back?
        __CLR4_5_228vc28vclusvnlr9.R.inc(104982);ratePlan.setTaxes(createExpectedTaxs());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104983);ratePlan.setServiceCharges(createExpectedServiceCharges());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104984);ratePlan.setNeedGuarantee(NEED_GUARANTEE);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104985);ratePlan.setCancelPolicy(createExpectedCancelPolicy());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104986);ratePlan.setAvailGuarantees(createExpectedAvailGuarantee()); // TODO translator
        __CLR4_5_228vc28vclusvnlr9.R.inc(104987);ratePlan.setFreeMeal(createExpectedFreeMeal());
        __CLR4_5_228vc28vclusvnlr9.R.inc(104988);return ratePlan;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private FreeMealDTO createExpectedFreeMeal() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104989);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104990);FreeMealDTO freeMeal = new FreeMealDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104991);freeMeal.setType(FreeMealType.NONE);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104992);return freeMeal;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RoomTypeDTO createExpectedRoomType() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104993);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104994);RoomTypeDTO roomType = new RoomTypeDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(104995);roomType.setCode(ROOM_TYPE_CODE);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104996);roomType.setName(ROOM_TYPE_NAME);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104997);return roomType;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RateDTO createExpectedForthDayRate() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(104998);
        __CLR4_5_228vc28vclusvnlr9.R.inc(104999);return createExpectedRateDTO(NUMBER_THREE);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RateDTO createExpectedThirdDayRate() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105000);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105001);return createExpectedRateDTO(NUMBER_TWO);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RateDTO createExpectedSecondDayRate() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105002);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105003);return createExpectedRateDTO(NUMBER_ONE);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RateDTO createExpectedFirstDayRate() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105004);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105005);return createExpectedRateDTO(NUMBER_ZERO);
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private RateDTO createExpectedRateDTO(int index) {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105006);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105007);RateDTO rate = new RateDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105008);rate.setDateRange(createExpectedDateRangeDTO());
        __CLR4_5_228vc28vclusvnlr9.R.inc(105009);rate.setPureAmount(createExpectedAmountDTO(CURRENCY, AMOUNT_BEFORE_TAXS[index]));
        __CLR4_5_228vc28vclusvnlr9.R.inc(105010);rate.setMealsIncluded(new MealsIncludedDTO(MealsIncludedType.UNKNOWN));
        __CLR4_5_228vc28vclusvnlr9.R.inc(105011);return rate;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedServiceCharges() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105012);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105013);List<ChargeItemDTO> serviceCharges = new ArrayList<ChargeItemDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105014);ChargeItemDTO serviceCharge = new ChargeItemDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105015);serviceCharge.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105016);serviceCharge.setType(ChargeType.FIXED);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105017);serviceCharge.setValue(SERVICE_CHARGE_AMOUNT);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105018);serviceCharge.setDescription(new String(SERVICE_CHARGE_DESC + seed.incrementAndGet()));
        __CLR4_5_228vc28vclusvnlr9.R.inc(105019);serviceCharges.add(serviceCharge);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105020);return serviceCharges;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private List<ChargeItemDTO> createExpectedTaxs() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105021);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105022);List<ChargeItemDTO> taxs = new ArrayList<ChargeItemDTO>();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105023);ChargeItemDTO tax = new ChargeItemDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105024);tax.setUnit(ChargeUnit.PER_NIGHT);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105025);tax.setValue(AMOUNT_TAX);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105026);tax.setType(ChargeType.FIXED);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105027);tax.setDescription(TAX_DESC + seed.incrementAndGet());
        __CLR4_5_228vc28vclusvnlr9.R.inc(105028);taxs.add(tax);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105029);return taxs;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private SimpleAmountDTO createExpectedAmountDTO(Currency currency, BigDecimal amount) {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105030);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105031);SimpleAmountDTO simpleAmountDTO = new SimpleAmountDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105032);simpleAmountDTO.setCurrency(currency);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105033);simpleAmountDTO.setAmount(amount);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105034);return simpleAmountDTO;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private DateRangeDTO createExpectedDateRangeDTO() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105035);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105036);DateRangeDTO dateRangeDTO = new DateRangeDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105037);dateRangeDTO.setStart(new Date());
        __CLR4_5_228vc28vclusvnlr9.R.inc(105038);dateRangeDTO.setEnd(new Date());
        __CLR4_5_228vc28vclusvnlr9.R.inc(105039);return dateRangeDTO;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

    private HotelRefDTO createExpectedHotelRef() {try{__CLR4_5_228vc28vclusvnlr9.R.inc(105040);
        __CLR4_5_228vc28vclusvnlr9.R.inc(105041);HotelRefDTO hotelRef = new HotelRefDTO();
        __CLR4_5_228vc28vclusvnlr9.R.inc(105042);hotelRef.setCode(new String(HOTEL_CODE));
        __CLR4_5_228vc28vclusvnlr9.R.inc(105043);hotelRef.setName(new String(HOTEL_NAME));
        __CLR4_5_228vc28vclusvnlr9.R.inc(105044);return hotelRef;
    }finally{__CLR4_5_228vc28vclusvnlr9.R.flushNeeded();}}

}
