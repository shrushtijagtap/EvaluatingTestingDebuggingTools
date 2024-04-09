/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser.stream;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONReaderScannerTest_enum extends TestCase {static class __CLR4_5_21oyi1oyilusvnf3x{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,79026,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_a() throws Exception {__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceStart(getClass().getName(),79002);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25yd8w51oyi();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusvnf3x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79002,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25yd8w51oyi() throws Exception{try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79002);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79003);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"A\"}"));
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79004);VO vo = parser.parseObject(VO.class);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79005);Assert.assertEquals(Type.A, vo.getType());
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79006);parser.close();
    }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}

    public void test_b() throws Exception {__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceStart(getClass().getName(),79007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22pda3o1oyn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusvnf3x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_b",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79007,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22pda3o1oyn() throws Exception{try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79007);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79008);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"B\"}"));
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79009);VO vo = parser.parseObject(VO.class);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79010);Assert.assertEquals(Type.B, vo.getType());
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79011);parser.close();
    }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}

    public void test_c() throws Exception {__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceStart(getClass().getName(),79012);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jmoot1oys();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusvnf3x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_c",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79012,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jmoot1oys() throws Exception{try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79012);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79013);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"C\"}"));
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79014);VO vo = parser.parseObject(VO.class);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79015);Assert.assertEquals(Type.C, vo.getType());
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79016);parser.close();
    }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}
    
    public void test_x() throws Exception {__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceStart(getClass().getName(),79017);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_228i2oe1oyx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21oyi1oyilusvnf3x.R.rethrow($CLV_t2$);}finally{__CLR4_5_21oyi1oyilusvnf3x.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_x",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),79017,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_228i2oe1oyx() throws Exception{try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79017);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79018);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"XXXXXXXXXXXXXXXXXXXXXXXX\"}"));
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79019);VO vo = parser.parseObject(VO.class);
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79020);Assert.assertEquals(Type.XXXXXXXXXXXXXXXXXXXXXXXX, vo.getType());
        __CLR4_5_21oyi1oyilusvnf3x.R.inc(79021);parser.close();
    }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}

    public static class VO {

        private Type type;

        public Type getType() {try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79022);
            __CLR4_5_21oyi1oyilusvnf3x.R.inc(79023);return type;
        }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}

        public void setType(Type type) {try{__CLR4_5_21oyi1oyilusvnf3x.R.inc(79024);
            __CLR4_5_21oyi1oyilusvnf3x.R.inc(79025);this.type = type;
        }finally{__CLR4_5_21oyi1oyilusvnf3x.R.flushNeeded();}}

    }

    public static enum Type {
        A, B, C, D, XXXXXXXXXXXXXXXXXXXXXXXX
    }
}
