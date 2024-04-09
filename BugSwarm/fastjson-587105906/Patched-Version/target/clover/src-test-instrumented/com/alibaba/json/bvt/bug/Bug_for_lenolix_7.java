/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_lenolix_7 extends TestCase {static class __CLR4_5_215ye15yelusvn717{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,54424,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_215ye15yelusvn717.R.inc(54374);
        __CLR4_5_215ye15yelusvn717.R.inc(54375);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_215ye15yelusvn717.R.inc(54376);JSON.defaultLocale = Locale.CHINA;

        __CLR4_5_215ye15yelusvn717.R.inc(54377);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_lenolix_7");
    }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}
    
    public void test_for_objectKey() throws Exception {__CLR4_5_215ye15yelusvn717.R.globalSliceStart(getClass().getName(),54378);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkbqc15yi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215ye15yelusvn717.R.rethrow($CLV_t2$);}finally{__CLR4_5_215ye15yelusvn717.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_lenolix_7.test_for_objectKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54378,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkbqc15yi() throws Exception{try{__CLR4_5_215ye15yelusvn717.R.inc(54378);
        __CLR4_5_215ye15yelusvn717.R.inc(54379);User user = new User();
        __CLR4_5_215ye15yelusvn717.R.inc(54380);user.setId(1);
        __CLR4_5_215ye15yelusvn717.R.inc(54381);user.setName("leno.lix");
        __CLR4_5_215ye15yelusvn717.R.inc(54382);user.setIsBoy(true);
        __CLR4_5_215ye15yelusvn717.R.inc(54383);user.setBirthDay(new Date());
        __CLR4_5_215ye15yelusvn717.R.inc(54384);user.setGmtCreate(new java.sql.Date(new Date().getTime()));
        __CLR4_5_215ye15yelusvn717.R.inc(54385);user.setGmtModified(new java.sql.Timestamp(new Date().getTime()));
        __CLR4_5_215ye15yelusvn717.R.inc(54386);String userJSON = JSON.toJSONString(user, SerializerFeature.WriteClassName, SerializerFeature.WriteMapNullValue);

        __CLR4_5_215ye15yelusvn717.R.inc(54387);System.out.println(userJSON);

        __CLR4_5_215ye15yelusvn717.R.inc(54388);User returnUser = (User) JSON.parse(userJSON);

    }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

    private static class User implements Serializable {

        /**
             *
             */

        private static final long  serialVersionUID = 6192533820796587011L;

        private Integer            id;
        private String             name;
        private Boolean            isBoy;
        private Address            address;
        private Date               birthDay;
        private java.sql.Date      gmtCreate;
        private java.sql.Timestamp gmtModified;

        public Integer getId() {try{__CLR4_5_215ye15yelusvn717.R.inc(54389);
            __CLR4_5_215ye15yelusvn717.R.inc(54390);return id;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_215ye15yelusvn717.R.inc(54391);
            __CLR4_5_215ye15yelusvn717.R.inc(54392);this.id = id;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_215ye15yelusvn717.R.inc(54393);
            __CLR4_5_215ye15yelusvn717.R.inc(54394);return name;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_215ye15yelusvn717.R.inc(54395);
            __CLR4_5_215ye15yelusvn717.R.inc(54396);this.name = name;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public Boolean getIsBoy() {try{__CLR4_5_215ye15yelusvn717.R.inc(54397);
            __CLR4_5_215ye15yelusvn717.R.inc(54398);return isBoy;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setIsBoy(Boolean isBoy) {try{__CLR4_5_215ye15yelusvn717.R.inc(54399);
            __CLR4_5_215ye15yelusvn717.R.inc(54400);this.isBoy = isBoy;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public Address getAddress() {try{__CLR4_5_215ye15yelusvn717.R.inc(54401);
            __CLR4_5_215ye15yelusvn717.R.inc(54402);return address;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setAddress(Address address) {try{__CLR4_5_215ye15yelusvn717.R.inc(54403);
            __CLR4_5_215ye15yelusvn717.R.inc(54404);this.address = address;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public Date getBirthDay() {try{__CLR4_5_215ye15yelusvn717.R.inc(54405);
            __CLR4_5_215ye15yelusvn717.R.inc(54406);return birthDay;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setBirthDay(Date birthDay) {try{__CLR4_5_215ye15yelusvn717.R.inc(54407);
            __CLR4_5_215ye15yelusvn717.R.inc(54408);this.birthDay = birthDay;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public java.sql.Date getGmtCreate() {try{__CLR4_5_215ye15yelusvn717.R.inc(54409);
            __CLR4_5_215ye15yelusvn717.R.inc(54410);return gmtCreate;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setGmtCreate(java.sql.Date gmtCreate) {try{__CLR4_5_215ye15yelusvn717.R.inc(54411);
            __CLR4_5_215ye15yelusvn717.R.inc(54412);this.gmtCreate = gmtCreate;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public java.sql.Timestamp getGmtModified() {try{__CLR4_5_215ye15yelusvn717.R.inc(54413);
            __CLR4_5_215ye15yelusvn717.R.inc(54414);return gmtModified;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setGmtModified(java.sql.Timestamp gmtModified) {try{__CLR4_5_215ye15yelusvn717.R.inc(54415);
            __CLR4_5_215ye15yelusvn717.R.inc(54416);this.gmtModified = gmtModified;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

    }
    
    public static class Address {

        private String value;

        public Address(){try{__CLR4_5_215ye15yelusvn717.R.inc(54417);
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public Address(String value){try{__CLR4_5_215ye15yelusvn717.R.inc(54418);
            __CLR4_5_215ye15yelusvn717.R.inc(54419);this.value = value;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public String getValue() {try{__CLR4_5_215ye15yelusvn717.R.inc(54420);
            __CLR4_5_215ye15yelusvn717.R.inc(54421);return value;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_5_215ye15yelusvn717.R.inc(54422);
            __CLR4_5_215ye15yelusvn717.R.inc(54423);this.value = value;
        }finally{__CLR4_5_215ye15yelusvn717.R.flushNeeded();}}

    }
}
