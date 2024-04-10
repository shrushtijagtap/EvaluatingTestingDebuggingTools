/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer.enum_;

import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class EnumTest2 extends TestCase {static class __CLR4_5_21tys1tyslusyjv8n{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,85509,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_5_21tys1tyslusyjv8n.R.inc(85492);
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85493);JSON.defaultTimeZone = TimeZone.getTimeZone("Asia/Shanghai");
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85494);JSON.defaultLocale = Locale.CHINA;
    }finally{__CLR4_5_21tys1tyslusyjv8n.R.flushNeeded();}}

    public void test_enum() throws Exception {__CLR4_5_21tys1tyslusyjv8n.R.globalSliceStart(getClass().getName(),85495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22onyzv1tyv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tys1tyslusyjv8n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tys1tyslusyjv8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest2.test_enum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85495,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22onyzv1tyv() throws Exception{try{__CLR4_5_21tys1tyslusyjv8n.R.inc(85495);
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85496);Date date = new Date(1308841916550L);
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85497);Assert.assertEquals("1308841916550", JSON.toJSONString(date)); // 1308841916550
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85498);System.out.println(JSON.toJSONString(date, SerializerFeature.UseISO8601DateFormat)); // "2011-06-23T23:11:56.550"
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85499);SerializerFeature[] features = {SerializerFeature.UseISO8601DateFormat, SerializerFeature.UseSingleQuotes };
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85500);System.out.println(JSON.toJSONString(date, features)); // '2011-06-23T23:11:56.550'
    }finally{__CLR4_5_21tys1tyslusyjv8n.R.flushNeeded();}}

    public void test_enum_noasm() throws Exception {__CLR4_5_21tys1tyslusyjv8n.R.globalSliceStart(getClass().getName(),85501);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yrlq341tz1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21tys1tyslusyjv8n.R.rethrow($CLV_t2$);}finally{__CLR4_5_21tys1tyslusyjv8n.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.enum_.EnumTest2.test_enum_noasm",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85501,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yrlq341tz1() throws Exception{try{__CLR4_5_21tys1tyslusyjv8n.R.inc(85501);
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85502);SerializeConfig mapping = new SerializeConfig();
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85503);mapping.setAsmEnable(false);
        
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85504);Date date = new Date(1308841916550L);
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85505);Assert.assertEquals("1308841916550", JSON.toJSONString(date, mapping)); // 1308841916550
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85506);Assert.assertEquals("\"2011-06-23T23:11:56.550+08:00\"", JSON.toJSONString(date, mapping, SerializerFeature.UseISO8601DateFormat)); // "2011-06-23T23:11:56.550"
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85507);SerializerFeature[] features = {SerializerFeature.UseISO8601DateFormat, SerializerFeature.UseSingleQuotes };
        __CLR4_5_21tys1tyslusyjv8n.R.inc(85508);Assert.assertEquals("'2011-06-23T23:11:56.550+08:00'", JSON.toJSONString(date, mapping, features)); // '2011-06-23T23:11:56.550'
    }finally{__CLR4_5_21tys1tyslusyjv8n.R.flushNeeded();}}
}
