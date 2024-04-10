/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.json.test.entity.TestEntity;

public class DefaultExtJSONParserTest_1 extends TestCase {static class __CLR4_1_101gn61gn6luszwcax{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68277,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101gn61gn6luszwcax.R.globalSliceStart(getClass().getName(),68226);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21gn6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gn61gn6luszwcax.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gn61gn6luszwcax.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_1.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68226,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21gn6() throws Exception{try{__CLR4_1_101gn61gn6luszwcax.R.inc(68226);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68227);DefaultJSONParser parser = new DefaultJSONParser("{\"f1\":true}");
        __CLR4_1_101gn61gn6luszwcax.R.inc(68228);TestEntity entity = parser.parseObject(TestEntity.class);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68229);Assert.assertEquals(true, entity.isF1());
    }finally{__CLR4_1_101gn61gn6luszwcax.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101gn61gn6luszwcax.R.globalSliceStart(getClass().getName(),68230);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1gna();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gn61gn6luszwcax.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gn61gn6luszwcax.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParserTest_1.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68230,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1gna() throws Exception{try{__CLR4_1_101gn61gn6luszwcax.R.inc(68230);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68231);DefaultJSONParser parser = new DefaultJSONParser("{\"f2\":true}");
        __CLR4_1_101gn61gn6luszwcax.R.inc(68232);TestEntity entity = parser.parseObject(TestEntity.class);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68233);Assert.assertEquals(Boolean.TRUE, entity.getF2());
    }finally{__CLR4_1_101gn61gn6luszwcax.R.flushNeeded();}}

    public void f_test_2() throws Exception {try{__CLR4_1_101gn61gn6luszwcax.R.inc(68234);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68235);TestEntity a = new TestEntity();
        __CLR4_1_101gn61gn6luszwcax.R.inc(68236);a.setF1(true);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68237);a.setF2(Boolean.TRUE);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68238);a.setF3((byte) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68239);a.setF4((byte) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68240);a.setF5((short) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68241);a.setF6((short) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68242);a.setF7((int) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68243);a.setF8((int) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68244);a.setF9((long) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68245);a.setF10((long) 123);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68246);a.setF11(new BigInteger("123"));
        __CLR4_1_101gn61gn6luszwcax.R.inc(68247);a.setF12(new BigDecimal("123"));
        __CLR4_1_101gn61gn6luszwcax.R.inc(68248);a.setF13("abc");
        __CLR4_1_101gn61gn6luszwcax.R.inc(68249);a.setF14(null);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68250);a.setF15(12.34F);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68251);a.setF16(12.35F);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68252);a.setF17(12.345D);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68253);a.setF18(12.345D);

        __CLR4_1_101gn61gn6luszwcax.R.inc(68254);String text = JSON.toJSONString(a);
        __CLR4_1_101gn61gn6luszwcax.R.inc(68255);System.out.println(text);

        __CLR4_1_101gn61gn6luszwcax.R.inc(68256);TestEntity b = new TestEntity();
        {
            __CLR4_1_101gn61gn6luszwcax.R.inc(68257);DefaultJSONParser parser = new DefaultJSONParser(text);
            __CLR4_1_101gn61gn6luszwcax.R.inc(68258);parser.parseObject(b);
        }

        __CLR4_1_101gn61gn6luszwcax.R.inc(68259);Assert.assertEquals("f1", a.isF1(), b.isF1());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68260);Assert.assertEquals("f2", a.getF2(), b.getF2());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68261);Assert.assertEquals("f3", a.getF3(), b.getF3());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68262);Assert.assertEquals("f4", a.getF4(), b.getF4());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68263);Assert.assertEquals("f5", a.getF5(), b.getF5());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68264);Assert.assertEquals("f6", a.getF6(), b.getF6());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68265);Assert.assertEquals("f7", a.getF7(), b.getF7());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68266);Assert.assertEquals("f8", a.getF8(), b.getF8());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68267);Assert.assertEquals("f9", a.getF9(), b.getF9());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68268);Assert.assertEquals(a.getF10(), b.getF10());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68269);Assert.assertEquals(a.getF11(), b.getF11());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68270);Assert.assertEquals(a.getF12(), b.getF12());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68271);Assert.assertEquals(a.getF13(), b.getF13());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68272);Assert.assertEquals(a.getF14(), b.getF14());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68273);Assert.assertEquals(a.getF15(), b.getF15());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68274);Assert.assertEquals(a.getF16(), b.getF16());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68275);Assert.assertEquals(a.getF17(), b.getF17());
        __CLR4_1_101gn61gn6luszwcax.R.inc(68276);Assert.assertEquals(a.getF18(), b.getF18());

    }finally{__CLR4_1_101gn61gn6luszwcax.R.flushNeeded();}}
}
