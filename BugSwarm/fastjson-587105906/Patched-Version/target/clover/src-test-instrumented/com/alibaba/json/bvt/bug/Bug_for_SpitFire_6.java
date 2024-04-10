/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.parser.ParserConfig;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_SpitFire_6 extends TestCase {static class __CLR4_5_213eg13eglusyjrfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,51090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51064);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51065);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_SpitFire_6.");
    }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

    public void test_ref() throws Exception {__CLR4_5_213eg13eglusyjrfi.R.globalSliceStart(getClass().getName(),51066);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25mo10313ei();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_213eg13eglusyjrfi.R.rethrow($CLV_t2$);}finally{__CLR4_5_213eg13eglusyjrfi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_SpitFire_6.test_ref",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),51066,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25mo10313ei() throws Exception{try{__CLR4_5_213eg13eglusyjrfi.R.inc(51066);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51067);GenericRS<HotelAvailRS> rs = new GenericRS<HotelAvailRS>();
        __CLR4_5_213eg13eglusyjrfi.R.inc(51068);HotelAvailRS availRs = new HotelAvailRS();
        __CLR4_5_213eg13eglusyjrfi.R.inc(51069);AvailRoomStayDTO stay = new AvailRoomStayDTO();
        __CLR4_5_213eg13eglusyjrfi.R.inc(51070);availRs.getHotelAvailRoomStay().getRoomStays().add(stay);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51071);availRs.getHotelAvailRoomStay().getRoomStays().add(stay);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51072);availRs.getHotelAvailRoomStay().getRoomStays().add(stay);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51073);availRs.getHotelAvailRoomStay().getRoomStays().add(stay);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51074);rs.setPayload(availRs);

        __CLR4_5_213eg13eglusyjrfi.R.inc(51075);String text = JSON.toJSONString(rs, SerializerFeature.WriteClassName, SerializerFeature.PrettyFormat);
        __CLR4_5_213eg13eglusyjrfi.R.inc(51076);System.out.println(text);
        
        __CLR4_5_213eg13eglusyjrfi.R.inc(51077);JSON.parseObject(text, GenericRS.class);
    }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

    public static class GenericRS<T> {

        private T payload;

        public T getPayload() {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51078);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51079);return payload;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

        public void setPayload(T payload) {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51080);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51081);this.payload = payload;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

    }

    public static class HotelAvailRS {

        private HotelAvailRoomStayDTO hotelAvailRoomStay = new HotelAvailRoomStayDTO();

        public HotelAvailRoomStayDTO getHotelAvailRoomStay() {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51082);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51083);return hotelAvailRoomStay;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

        public void setHotelAvailRoomStay(HotelAvailRoomStayDTO hotelAvailRoomStay) {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51084);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51085);this.hotelAvailRoomStay = hotelAvailRoomStay;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

    }

    public static class HotelAvailRoomStayDTO {

        private List<AvailRoomStayDTO> roomStays = new ArrayList<AvailRoomStayDTO>();

        public List<AvailRoomStayDTO> getRoomStays() {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51086);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51087);return roomStays;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

        public void setRoomStays(List<AvailRoomStayDTO> roomStays) {try{__CLR4_5_213eg13eglusyjrfi.R.inc(51088);
            __CLR4_5_213eg13eglusyjrfi.R.inc(51089);this.roomStays = roomStays;
        }finally{__CLR4_5_213eg13eglusyjrfi.R.flushNeeded();}}

    }

    public static class AvailRoomStayDTO {

    }
}
