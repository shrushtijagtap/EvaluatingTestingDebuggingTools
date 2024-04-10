/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class Bug_for_lenolix_8 extends TestCase {static class __CLR4_5_2151k151klusyjrs2{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,53234,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_2151k151klusyjrs2.R.inc(53192);
        __CLR4_5_2151k151klusyjrs2.R.inc(53193);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_2151k151klusyjrs2.R.inc(53194);JSON.defaultLocale = Locale.CHINA;

        __CLR4_5_2151k151klusyjrs2.R.inc(53195);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_lenolix_8.");
    }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}
    
    public void test_for_objectKey() throws Exception {__CLR4_5_2151k151klusyjrs2.R.globalSliceStart(getClass().getName(),53196);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkbqc151o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2151k151klusyjrs2.R.rethrow($CLV_t2$);}finally{__CLR4_5_2151k151klusyjrs2.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_lenolix_8.test_for_objectKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),53196,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkbqc151o() throws Exception{try{__CLR4_5_2151k151klusyjrs2.R.inc(53196);
        __CLR4_5_2151k151klusyjrs2.R.inc(53197);DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", JSON.defaultLocale);
        __CLR4_5_2151k151klusyjrs2.R.inc(53198);simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_2151k151klusyjrs2.R.inc(53199);Map<Integer, User> map = new HashMap<Integer, User>();

        __CLR4_5_2151k151klusyjrs2.R.inc(53200);User user = new User();
        __CLR4_5_2151k151klusyjrs2.R.inc(53201);user.setId(1);
        __CLR4_5_2151k151klusyjrs2.R.inc(53202);user.setIsBoy(true);
        __CLR4_5_2151k151klusyjrs2.R.inc(53203);user.setName("leno.lix");
        __CLR4_5_2151k151klusyjrs2.R.inc(53204);user.setBirthDay(simpleDateFormat.parse("2012-03-07 22:38:21"));
        __CLR4_5_2151k151klusyjrs2.R.inc(53205);user.setGmtCreate(new java.sql.Date(simpleDateFormat.parse("2012-02-03 22:38:21").getTime()));

        __CLR4_5_2151k151klusyjrs2.R.inc(53206);map.put(1, user);

        __CLR4_5_2151k151klusyjrs2.R.inc(53207);String mapJson = JSON.toJSONString(map, SerializerFeature.WriteClassName, SerializerFeature.WriteMapNullValue);

        __CLR4_5_2151k151klusyjrs2.R.inc(53208);System.out.println(mapJson);

        __CLR4_5_2151k151klusyjrs2.R.inc(53209);Object object = JSON.parse(mapJson);

    }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

    public static class User implements Serializable {

        /**
             *
             */

        private static final long  serialVersionUID = 6192533820796587011L;

        private Integer            id;
        private String             name;
        private Boolean            isBoy;
        private Date               birthDay;
        private java.sql.Date      gmtCreate;
        private java.sql.Timestamp gmtModified;

        public Integer getId() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53210);
            __CLR4_5_2151k151klusyjrs2.R.inc(53211);return id;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53212);
            __CLR4_5_2151k151klusyjrs2.R.inc(53213);this.id = id;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53214);
            __CLR4_5_2151k151klusyjrs2.R.inc(53215);return name;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53216);
            __CLR4_5_2151k151klusyjrs2.R.inc(53217);this.name = name;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public Boolean getIsBoy() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53218);
            __CLR4_5_2151k151klusyjrs2.R.inc(53219);return isBoy;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setIsBoy(Boolean isBoy) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53220);
            __CLR4_5_2151k151klusyjrs2.R.inc(53221);this.isBoy = isBoy;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}


        public Date getBirthDay() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53222);
            __CLR4_5_2151k151klusyjrs2.R.inc(53223);return birthDay;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setBirthDay(Date birthDay) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53224);
            __CLR4_5_2151k151klusyjrs2.R.inc(53225);this.birthDay = birthDay;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public java.sql.Date getGmtCreate() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53226);
            __CLR4_5_2151k151klusyjrs2.R.inc(53227);return gmtCreate;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setGmtCreate(java.sql.Date gmtCreate) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53228);
            __CLR4_5_2151k151klusyjrs2.R.inc(53229);this.gmtCreate = gmtCreate;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public java.sql.Timestamp getGmtModified() {try{__CLR4_5_2151k151klusyjrs2.R.inc(53230);
            __CLR4_5_2151k151klusyjrs2.R.inc(53231);return gmtModified;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

        public void setGmtModified(java.sql.Timestamp gmtModified) {try{__CLR4_5_2151k151klusyjrs2.R.inc(53232);
            __CLR4_5_2151k151klusyjrs2.R.inc(53233);this.gmtModified = gmtModified;
        }finally{__CLR4_5_2151k151klusyjrs2.R.flushNeeded();}}

    }
}
