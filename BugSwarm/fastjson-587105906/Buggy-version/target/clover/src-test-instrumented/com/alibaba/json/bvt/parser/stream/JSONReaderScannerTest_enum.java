/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.stream;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.JSONReaderScanner;

public class JSONReaderScannerTest_enum extends TestCase {static class __CLR4_1_101o0l1o0llusqkhkn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,77805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_a() throws Exception {__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceStart(getClass().getName(),77781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105yd8w51o0l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o0l1o0llusqkhkn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105yd8w51o0l() throws Exception{try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77781);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77782);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"A\"}"));
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77783);VO vo = parser.parseObject(VO.class);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77784);Assert.assertEquals(Type.A, vo.getType());
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77785);parser.close();
    }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}

    public void test_b() throws Exception {__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceStart(getClass().getName(),77786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102pda3o1o0q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o0l1o0llusqkhkn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_b",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77786,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102pda3o1o0q() throws Exception{try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77786);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77787);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"B\"}"));
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77788);VO vo = parser.parseObject(VO.class);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77789);Assert.assertEquals(Type.B, vo.getType());
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77790);parser.close();
    }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}

    public void test_c() throws Exception {__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceStart(getClass().getName(),77791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jmoot1o0v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o0l1o0llusqkhkn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_c",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77791,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jmoot1o0v() throws Exception{try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77791);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77792);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"C\"}"));
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77793);VO vo = parser.parseObject(VO.class);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77794);Assert.assertEquals(Type.C, vo.getType());
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77795);parser.close();
    }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}
    
    public void test_x() throws Exception {__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceStart(getClass().getName(),77796);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1028i2oe1o10();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101o0l1o0llusqkhkn.R.rethrow($CLV_t2$);}finally{__CLR4_1_101o0l1o0llusqkhkn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.stream.JSONReaderScannerTest_enum.test_x",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),77796,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1028i2oe1o10() throws Exception{try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77796);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77797);DefaultJSONParser parser = new DefaultJSONParser(new JSONReaderScanner("{\"type\":\"XXXXXXXXXXXXXXXXXXXXXXXX\"}"));
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77798);VO vo = parser.parseObject(VO.class);
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77799);Assert.assertEquals(Type.XXXXXXXXXXXXXXXXXXXXXXXX, vo.getType());
        __CLR4_1_101o0l1o0llusqkhkn.R.inc(77800);parser.close();
    }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}

    public static class VO {

        private Type type;

        public Type getType() {try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77801);
            __CLR4_1_101o0l1o0llusqkhkn.R.inc(77802);return type;
        }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}

        public void setType(Type type) {try{__CLR4_1_101o0l1o0llusqkhkn.R.inc(77803);
            __CLR4_1_101o0l1o0llusqkhkn.R.inc(77804);this.type = type;
        }finally{__CLR4_1_101o0l1o0llusqkhkn.R.flushNeeded();}}

    }

    public static enum Type {
        A, B, C, D, XXXXXXXXXXXXXXXXXXXXXXXX
    }
}
