/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.deserializer.EnumDeserializer;

public class EnumParserTest extends TestCase {static class __CLR4_1_101h6j1h6jluszwcea{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68969,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68923);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21h6j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68923,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21h6j() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68923);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68924);String text = "\"A\"";
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68925);DefaultJSONParser parser = new DefaultJSONParser(text);

        __CLR4_1_101h6j1h6jluszwcea.R.inc(68926);Type type = parser.parseObject(Type.class);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68927);Assert.assertEquals(Type.A, type);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68928);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1h6o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68928,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1h6o() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68928);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68929);String text = "0";
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68930);DefaultJSONParser parser = new DefaultJSONParser(text);

        __CLR4_1_101h6j1h6jluszwcea.R.inc(68931);Type type = parser.parseObject(Type.class);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68932);Assert.assertEquals(Type.A, type);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68933);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1h6t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68933,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1h6t() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68933);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68934);String text = "\"C\"";
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68935);DefaultJSONParser parser = new DefaultJSONParser(text);

        __CLR4_1_101h6j1h6jluszwcea.R.inc(68936);assertNull(parser.parseObject(Type.class));
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68937);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1h6x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68937,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1h6x() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68937);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68938);Exception error = null;
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68939);try {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68940);String text = "4";
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68941);DefaultJSONParser parser = new DefaultJSONParser(text);

            __CLR4_1_101h6j1h6jluszwcea.R.inc(68942);parser.parseObject(Type.class);
        } catch (Exception ex) {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68943);error = ex;
        }
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68944);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68945);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1h75();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68945,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1h75() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68945);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68946);Exception error = null;
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68947);try {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68948);String text = "4";
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68949);DefaultJSONParser parser = new DefaultJSONParser(text);

            __CLR4_1_101h6j1h6jluszwcea.R.inc(68950);parser.parseObject(TypeA.class);
        } catch (Exception ex) {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68951);error = ex;
        }
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68952);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1h7d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1h7d() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68953);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68954);Exception error = null;
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68955);try {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68956);String text = "4";
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68957);DefaultJSONParser parser = new DefaultJSONParser(text);

            __CLR4_1_101h6j1h6jluszwcea.R.inc(68958);new EnumDeserializer(Object.class).deserialze(parser, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68959);error = ex;
        }
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68960);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101h6j1h6jluszwcea.R.globalSliceStart(getClass().getName(),68961);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1h7l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h6j1h6jluszwcea.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h6j1h6jluszwcea.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.EnumParserTest.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68961,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1h7l() throws Exception{try{__CLR4_1_101h6j1h6jluszwcea.R.inc(68961);
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68962);Exception error = null;
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68963);try {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68964);String text = "true";
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68965);DefaultJSONParser parser = new DefaultJSONParser(text);

            __CLR4_1_101h6j1h6jluszwcea.R.inc(68966);new EnumDeserializer(Object.class).deserialze(parser, Object.class, null);
        } catch (Exception ex) {
            __CLR4_1_101h6j1h6jluszwcea.R.inc(68967);error = ex;
        }
        __CLR4_1_101h6j1h6jluszwcea.R.inc(68968);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h6j1h6jluszwcea.R.flushNeeded();}}

    public static enum Type {
        A, B
    }

    private static enum TypeA {
        A, B
    }
}
