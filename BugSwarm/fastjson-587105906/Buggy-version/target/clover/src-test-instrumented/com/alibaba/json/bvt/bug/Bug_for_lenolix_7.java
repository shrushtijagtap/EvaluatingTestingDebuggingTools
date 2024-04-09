/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

import junit.framework.TestCase;

public class Bug_for_lenolix_7 extends TestCase {static class __CLR4_1_10150h150hlusqk47x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,53203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_10150h150hlusqk47x.R.inc(53153);
        __CLR4_1_10150h150hlusqk47x.R.inc(53154);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_1_10150h150hlusqk47x.R.inc(53155);JSON.defaultLocale = Locale.CHINA;

        __CLR4_1_10150h150hlusqk47x.R.inc(53156);ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_lenolix_7");
    }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}
    
    public void test_for_objectKey() throws Exception {__CLR4_1_10150h150hlusqk47x.R.globalSliceStart(getClass().getName(),53157);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jkbqc150l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10150h150hlusqk47x.R.rethrow($CLV_t2$);}finally{__CLR4_1_10150h150hlusqk47x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_lenolix_7.test_for_objectKey",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),53157,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jkbqc150l() throws Exception{try{__CLR4_1_10150h150hlusqk47x.R.inc(53157);
        __CLR4_1_10150h150hlusqk47x.R.inc(53158);User user = new User();
        __CLR4_1_10150h150hlusqk47x.R.inc(53159);user.setId(1);
        __CLR4_1_10150h150hlusqk47x.R.inc(53160);user.setName("leno.lix");
        __CLR4_1_10150h150hlusqk47x.R.inc(53161);user.setIsBoy(true);
        __CLR4_1_10150h150hlusqk47x.R.inc(53162);user.setBirthDay(new Date());
        __CLR4_1_10150h150hlusqk47x.R.inc(53163);user.setGmtCreate(new java.sql.Date(new Date().getTime()));
        __CLR4_1_10150h150hlusqk47x.R.inc(53164);user.setGmtModified(new java.sql.Timestamp(new Date().getTime()));
        __CLR4_1_10150h150hlusqk47x.R.inc(53165);String userJSON = JSON.toJSONString(user, SerializerFeature.WriteClassName, SerializerFeature.WriteMapNullValue);

        __CLR4_1_10150h150hlusqk47x.R.inc(53166);System.out.println(userJSON);

        __CLR4_1_10150h150hlusqk47x.R.inc(53167);User returnUser = (User) JSON.parse(userJSON);

    }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

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

        public Integer getId() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53168);
            __CLR4_1_10150h150hlusqk47x.R.inc(53169);return id;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53170);
            __CLR4_1_10150h150hlusqk47x.R.inc(53171);this.id = id;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53172);
            __CLR4_1_10150h150hlusqk47x.R.inc(53173);return name;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53174);
            __CLR4_1_10150h150hlusqk47x.R.inc(53175);this.name = name;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public Boolean getIsBoy() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53176);
            __CLR4_1_10150h150hlusqk47x.R.inc(53177);return isBoy;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setIsBoy(Boolean isBoy) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53178);
            __CLR4_1_10150h150hlusqk47x.R.inc(53179);this.isBoy = isBoy;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public Address getAddress() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53180);
            __CLR4_1_10150h150hlusqk47x.R.inc(53181);return address;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setAddress(Address address) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53182);
            __CLR4_1_10150h150hlusqk47x.R.inc(53183);this.address = address;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public Date getBirthDay() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53184);
            __CLR4_1_10150h150hlusqk47x.R.inc(53185);return birthDay;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setBirthDay(Date birthDay) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53186);
            __CLR4_1_10150h150hlusqk47x.R.inc(53187);this.birthDay = birthDay;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public java.sql.Date getGmtCreate() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53188);
            __CLR4_1_10150h150hlusqk47x.R.inc(53189);return gmtCreate;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setGmtCreate(java.sql.Date gmtCreate) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53190);
            __CLR4_1_10150h150hlusqk47x.R.inc(53191);this.gmtCreate = gmtCreate;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public java.sql.Timestamp getGmtModified() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53192);
            __CLR4_1_10150h150hlusqk47x.R.inc(53193);return gmtModified;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setGmtModified(java.sql.Timestamp gmtModified) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53194);
            __CLR4_1_10150h150hlusqk47x.R.inc(53195);this.gmtModified = gmtModified;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

    }
    
    public static class Address {

        private String value;

        public Address(){try{__CLR4_1_10150h150hlusqk47x.R.inc(53196);
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public Address(String value){try{__CLR4_1_10150h150hlusqk47x.R.inc(53197);
            __CLR4_1_10150h150hlusqk47x.R.inc(53198);this.value = value;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public String getValue() {try{__CLR4_1_10150h150hlusqk47x.R.inc(53199);
            __CLR4_1_10150h150hlusqk47x.R.inc(53200);return value;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_10150h150hlusqk47x.R.inc(53201);
            __CLR4_1_10150h150hlusqk47x.R.inc(53202);this.value = value;
        }finally{__CLR4_1_10150h150hlusqk47x.R.flushNeeded();}}

    }
}
