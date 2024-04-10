/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvt.bug.Bug_for_lenolix_9.Address.Country;

public class Bug_for_lenolix_9 extends TestCase {static class __CLR4_5_2152q152qlusyjrs6{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,53275,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53234);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53235);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_lenolix_9.");
    }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

    public void test_for_objectKey() throws Exception {__CLR4_5_2152q152qlusyjrs6.R.globalSliceStart(getClass().getName(),53236);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkbqc152s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2152q152qlusyjrs6.R.rethrow($CLV_t2$);}finally{__CLR4_5_2152q152qlusyjrs6.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_lenolix_9.test_for_objectKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53236,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkbqc152s() throws Exception{try{__CLR4_5_2152q152qlusyjrs6.R.inc(53236);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53237);Map<String, Object> submap4 = new HashMap<String, Object>();
        __CLR4_5_2152q152qlusyjrs6.R.inc(53238);Address address = new Address();
        __CLR4_5_2152q152qlusyjrs6.R.inc(53239);address.setCity("hangzhou");
        __CLR4_5_2152q152qlusyjrs6.R.inc(53240);address.setStreet("wangshang.RD");
        __CLR4_5_2152q152qlusyjrs6.R.inc(53241);address.setPostCode(310002);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53242);submap4.put("address1", address);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53243);submap4.put("address2", address);

        __CLR4_5_2152q152qlusyjrs6.R.inc(53244);Country country = address.new Country();
        __CLR4_5_2152q152qlusyjrs6.R.inc(53245);country.setProvince("ZheJiang");
        
        __CLR4_5_2152q152qlusyjrs6.R.inc(53246);address.setCountry(country);

        __CLR4_5_2152q152qlusyjrs6.R.inc(53247);String mapString4 = JSON.toJSONString(submap4, SerializerFeature.WriteClassName,
                                              SerializerFeature.WriteMapNullValue);

        __CLR4_5_2152q152qlusyjrs6.R.inc(53248);System.out.println(mapString4);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53249);Object object4 = JSON.parse(mapString4);
        __CLR4_5_2152q152qlusyjrs6.R.inc(53250);Assert.assertNotNull(object4);

        __CLR4_5_2152q152qlusyjrs6.R.inc(53251);Map<String, Object> map = (Map<String, Object>) object4;

        __CLR4_5_2152q152qlusyjrs6.R.inc(53252);Assert.assertNotNull(map.get("address1"));
        __CLR4_5_2152q152qlusyjrs6.R.inc(53253);Assert.assertNotNull(map.get("address2"));

        __CLR4_5_2152q152qlusyjrs6.R.inc(53254);Assert.assertTrue(map.get("address1") == map.get("address2"));

    }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

    public static class Address {

        private String  city;
        private String  street;
        private int     postCode;
        private Country country;

        public Country getCountry() {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53255);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53256);return country;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public void setCountry(Country country) {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53257);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53258);this.country = country;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public String getCity() {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53259);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53260);return city;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public void setCity(String city) {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53261);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53262);this.city = city;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public String getStreet() {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53263);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53264);return street;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public void setStreet(String street) {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53265);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53266);this.street = street;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public int getPostCode() {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53267);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53268);return postCode;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public void setPostCode(int postCode) {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53269);
            __CLR4_5_2152q152qlusyjrs6.R.inc(53270);this.postCode = postCode;
        }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        public class Country {

            private String province;

            public String getProvince() {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53271);
                __CLR4_5_2152q152qlusyjrs6.R.inc(53272);return province;
            }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

            public void setProvince(String province) {try{__CLR4_5_2152q152qlusyjrs6.R.inc(53273);
                __CLR4_5_2152q152qlusyjrs6.R.inc(53274);this.province = province;
            }finally{__CLR4_5_2152q152qlusyjrs6.R.flushNeeded();}}

        }
    }

   
}
