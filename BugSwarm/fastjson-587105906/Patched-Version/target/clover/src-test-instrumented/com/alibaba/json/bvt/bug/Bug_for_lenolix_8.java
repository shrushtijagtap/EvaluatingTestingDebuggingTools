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

public class Bug_for_lenolix_8 extends TestCase {static class __CLR4_5_215zs15zslusvn71b{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,54466,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_215zs15zslusvn71b.R.inc(54424);
        __CLR4_5_215zs15zslusvn71b.R.inc(54425);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_215zs15zslusvn71b.R.inc(54426);JSON.defaultLocale = Locale.CHINA;

        __CLR4_5_215zs15zslusvn71b.R.inc(54427);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Bug_for_lenolix_8.");
    }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}
    
    public void test_for_objectKey() throws Exception {__CLR4_5_215zs15zslusvn71b.R.globalSliceStart(getClass().getName(),54428);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jkbqc15zw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_215zs15zslusvn71b.R.rethrow($CLV_t2$);}finally{__CLR4_5_215zs15zslusvn71b.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_lenolix_8.test_for_objectKey",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),54428,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jkbqc15zw() throws Exception{try{__CLR4_5_215zs15zslusvn71b.R.inc(54428);
        __CLR4_5_215zs15zslusvn71b.R.inc(54429);DateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", JSON.defaultLocale);
        __CLR4_5_215zs15zslusvn71b.R.inc(54430);simpleDateFormat.setTimeZone(JSON.defaultTimeZone);
        __CLR4_5_215zs15zslusvn71b.R.inc(54431);Map<Integer, User> map = new HashMap<Integer, User>();

        __CLR4_5_215zs15zslusvn71b.R.inc(54432);User user = new User();
        __CLR4_5_215zs15zslusvn71b.R.inc(54433);user.setId(1);
        __CLR4_5_215zs15zslusvn71b.R.inc(54434);user.setIsBoy(true);
        __CLR4_5_215zs15zslusvn71b.R.inc(54435);user.setName("leno.lix");
        __CLR4_5_215zs15zslusvn71b.R.inc(54436);user.setBirthDay(simpleDateFormat.parse("2012-03-07 22:38:21"));
        __CLR4_5_215zs15zslusvn71b.R.inc(54437);user.setGmtCreate(new java.sql.Date(simpleDateFormat.parse("2012-02-03 22:38:21").getTime()));

        __CLR4_5_215zs15zslusvn71b.R.inc(54438);map.put(1, user);

        __CLR4_5_215zs15zslusvn71b.R.inc(54439);String mapJson = JSON.toJSONString(map, SerializerFeature.WriteClassName, SerializerFeature.WriteMapNullValue);

        __CLR4_5_215zs15zslusvn71b.R.inc(54440);System.out.println(mapJson);

        __CLR4_5_215zs15zslusvn71b.R.inc(54441);Object object = JSON.parse(mapJson);

    }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

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

        public Integer getId() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54442);
            __CLR4_5_215zs15zslusvn71b.R.inc(54443);return id;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54444);
            __CLR4_5_215zs15zslusvn71b.R.inc(54445);this.id = id;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54446);
            __CLR4_5_215zs15zslusvn71b.R.inc(54447);return name;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54448);
            __CLR4_5_215zs15zslusvn71b.R.inc(54449);this.name = name;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public Boolean getIsBoy() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54450);
            __CLR4_5_215zs15zslusvn71b.R.inc(54451);return isBoy;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setIsBoy(Boolean isBoy) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54452);
            __CLR4_5_215zs15zslusvn71b.R.inc(54453);this.isBoy = isBoy;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}


        public Date getBirthDay() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54454);
            __CLR4_5_215zs15zslusvn71b.R.inc(54455);return birthDay;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setBirthDay(Date birthDay) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54456);
            __CLR4_5_215zs15zslusvn71b.R.inc(54457);this.birthDay = birthDay;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public java.sql.Date getGmtCreate() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54458);
            __CLR4_5_215zs15zslusvn71b.R.inc(54459);return gmtCreate;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setGmtCreate(java.sql.Date gmtCreate) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54460);
            __CLR4_5_215zs15zslusvn71b.R.inc(54461);this.gmtCreate = gmtCreate;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public java.sql.Timestamp getGmtModified() {try{__CLR4_5_215zs15zslusvn71b.R.inc(54462);
            __CLR4_5_215zs15zslusvn71b.R.inc(54463);return gmtModified;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

        public void setGmtModified(java.sql.Timestamp gmtModified) {try{__CLR4_5_215zs15zslusvn71b.R.inc(54464);
            __CLR4_5_215zs15zslusvn71b.R.inc(54465);this.gmtModified = gmtModified;
        }finally{__CLR4_5_215zs15zslusvn71b.R.flushNeeded();}}

    }
}
