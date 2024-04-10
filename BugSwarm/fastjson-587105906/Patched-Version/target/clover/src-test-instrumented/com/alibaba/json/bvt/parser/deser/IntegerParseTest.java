/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.deser;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class IntegerParseTest extends TestCase {static class __CLR4_5_21l4p1l4plusyju5a{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,74095,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_l () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2tsmdt21l4p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_l",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74041,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2tsmdt21l4p() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74041);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74042);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12L", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74043);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12L", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74044);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12L", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74045);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12L", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74046);Assert.assertEquals(new Float(12), JSON.parseObject("12L", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74047);Assert.assertEquals(new Double(12), JSON.parseObject("12L", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74048);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12L", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74049);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12L", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
    
    public void test_s () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ihhwmr1l4y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_s",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74050,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ihhwmr1l4y() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74050);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74051);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12S", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74052);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12S", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74053);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12S", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74054);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12S", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74055);Assert.assertEquals(new Float(12), JSON.parseObject("12S", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74056);Assert.assertEquals(new Double(12), JSON.parseObject("12S", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74057);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12S", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74058);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12S", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
    
    public void test_b () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74059);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22pda3o1l57();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74059,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22pda3o1l57() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74059);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74060);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12B", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74061);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12B", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74062);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12B", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74063);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12B", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74064);Assert.assertEquals(new Float(12), JSON.parseObject("12B", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74065);Assert.assertEquals(new Double(12), JSON.parseObject("12B", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74066);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12B", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74067);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12B", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
    
    public void test_f () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74068);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaml281l5g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_f",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74068,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaml281l5g() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74068);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74069);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12F", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74070);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12F", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74071);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12F", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74072);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12F", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74073);Assert.assertEquals(new Float(12), JSON.parseObject("12F", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74074);Assert.assertEquals(new Double(12), JSON.parseObject("12F", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74075);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12F", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74076);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12F", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
    
    public void test_d () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74077);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23smnha1l5p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_d",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74077,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23smnha1l5p() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74077);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74078);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12D", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74079);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12D", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74080);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12D", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74081);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12D", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74082);Assert.assertEquals(new Float(12), JSON.parseObject("12D", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74083);Assert.assertEquals(new Double(12), JSON.parseObject("12D", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74084);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12D", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74085);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12D", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
    
    public void test_m () throws Exception {__CLR4_5_21l4p1l4plusyju5a.R.globalSliceStart(getClass().getName(),74086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2x1mclj1l5y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21l4p1l4plusyju5a.R.rethrow($CLV_t2$);}finally{__CLR4_5_21l4p1l4plusyju5a.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.IntegerParseTest.test_m",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),74086,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2x1mclj1l5y() throws Exception{try{__CLR4_5_21l4p1l4plusyju5a.R.inc(74086);
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74087);Assert.assertEquals(Long.valueOf(12), JSON.parseObject("12.", long.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74088);Assert.assertEquals(Integer.valueOf(12), JSON.parseObject("12.", int.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74089);Assert.assertEquals(new Short((short) 12), JSON.parseObject("12.", short.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74090);Assert.assertEquals(new Byte((byte) 12), JSON.parseObject("12.", byte.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74091);Assert.assertEquals(new Float(12), JSON.parseObject("12.", float.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74092);Assert.assertEquals(new Double(12), JSON.parseObject("12.", double.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74093);Assert.assertEquals(new BigDecimal(12), JSON.parseObject("12.", BigDecimal.class));
        __CLR4_5_21l4p1l4plusyju5a.R.inc(74094);Assert.assertEquals(new BigInteger("12"), JSON.parseObject("12.", BigInteger.class));
    }finally{__CLR4_5_21l4p1l4plusyju5a.R.flushNeeded();}}
}
