/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.validate;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONValidator;
import com.alibaba.json.test.benchmark.decode.EishayDecodeBytes;
import junit.framework.TestCase;

import java.io.ByteArrayInputStream;

public class JSONValidateTest_0 extends TestCase {static class __CLR4_1_10w9ww9wluszw4fb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,41865,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_validate() throws Exception {__CLR4_1_10w9ww9wluszw4fb.R.globalSliceStart(getClass().getName(),41828);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1042ifw6w9w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w9ww9wluszw4fb.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w9ww9wluszw4fb.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_0.test_validate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41828,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1042ifw6w9w() throws Exception{try{__CLR4_1_10w9ww9wluszw4fb.R.inc(41828);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41829);String json = JSON.toJSONString(EishayDecodeBytes.instance.getContent());
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41830);JSONValidator validator = JSONValidator.from(json);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41831);assertTrue(validator.validate());
    }finally{__CLR4_1_10w9ww9wluszw4fb.R.flushNeeded();}}

    public void test_validate_benchmark() throws Exception {__CLR4_1_10w9ww9wluszw4fb.R.globalSliceStart(getClass().getName(),41832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bbpud4wa0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w9ww9wluszw4fb.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w9ww9wluszw4fb.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_0.test_validate_benchmark",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41832,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bbpud4wa0() throws Exception{try{__CLR4_1_10w9ww9wluszw4fb.R.inc(41832);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41833);String json = JSON.toJSONString(EishayDecodeBytes.instance.getContent());

        __CLR4_1_10w9ww9wluszw4fb.R.inc(41834);for (int n = 0; (((n < 10)&&(__CLR4_1_10w9ww9wluszw4fb.R.iget(41835)!=0|true))||(__CLR4_1_10w9ww9wluszw4fb.R.iget(41836)==0&false)); ++n) {{
            __CLR4_1_10w9ww9wluszw4fb.R.inc(41837);long start = System.currentTimeMillis();
            __CLR4_1_10w9ww9wluszw4fb.R.inc(41838);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_10w9ww9wluszw4fb.R.iget(41839)!=0|true))||(__CLR4_1_10w9ww9wluszw4fb.R.iget(41840)==0&false)); ++i) {{
                __CLR4_1_10w9ww9wluszw4fb.R.inc(41841);JSONValidator validator = JSONValidator.from(json);
                __CLR4_1_10w9ww9wluszw4fb.R.inc(41842);validator.validate(); // 518
            }
            }__CLR4_1_10w9ww9wluszw4fb.R.inc(41843);System.out.println("millis : " + (System.currentTimeMillis() - start));
        }
    }}finally{__CLR4_1_10w9ww9wluszw4fb.R.flushNeeded();}}

    public void test_validate_utf8() throws Exception {__CLR4_1_10w9ww9wluszw4fb.R.globalSliceStart(getClass().getName(),41844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vinkxgwac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w9ww9wluszw4fb.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w9ww9wluszw4fb.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_0.test_validate_utf8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41844,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vinkxgwac() throws Exception{try{__CLR4_1_10w9ww9wluszw4fb.R.inc(41844);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41845);byte[] json = JSON.toJSONBytes(EishayDecodeBytes.instance.getContent());

        __CLR4_1_10w9ww9wluszw4fb.R.inc(41846);JSONValidator validator = JSONValidator.fromUtf8(json);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41847);assertTrue(validator.validate());
    }finally{__CLR4_1_10w9ww9wluszw4fb.R.flushNeeded();}}

    public void test_validate_utf8_stream() throws Exception {__CLR4_1_10w9ww9wluszw4fb.R.globalSliceStart(getClass().getName(),41848);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107h7hmhwag();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w9ww9wluszw4fb.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w9ww9wluszw4fb.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_0.test_validate_utf8_stream",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41848,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107h7hmhwag() throws Exception{try{__CLR4_1_10w9ww9wluszw4fb.R.inc(41848);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41849);byte[] json = JSON.toJSONBytes(EishayDecodeBytes.instance.getContent());

        __CLR4_1_10w9ww9wluszw4fb.R.inc(41850);JSONValidator validator = JSONValidator.fromUtf8(new ByteArrayInputStream(json));
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41851);assertTrue(validator.validate());
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41852);validator.close();
    }finally{__CLR4_1_10w9ww9wluszw4fb.R.flushNeeded();}}

    public void test_validate_utf8_benchmark() throws Exception {__CLR4_1_10w9ww9wluszw4fb.R.globalSliceStart(getClass().getName(),41853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oh0ysywal();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10w9ww9wluszw4fb.R.rethrow($CLV_t2$);}finally{__CLR4_1_10w9ww9wluszw4fb.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.validate.JSONValidateTest_0.test_validate_utf8_benchmark",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),41853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oh0ysywal() throws Exception{try{__CLR4_1_10w9ww9wluszw4fb.R.inc(41853);
        __CLR4_1_10w9ww9wluszw4fb.R.inc(41854);byte[] json = JSON.toJSONBytes(EishayDecodeBytes.instance.getContent());

        __CLR4_1_10w9ww9wluszw4fb.R.inc(41855);for (int n = 0; (((n < 5)&&(__CLR4_1_10w9ww9wluszw4fb.R.iget(41856)!=0|true))||(__CLR4_1_10w9ww9wluszw4fb.R.iget(41857)==0&false)); ++n) {{
            __CLR4_1_10w9ww9wluszw4fb.R.inc(41858);long start = System.currentTimeMillis();
            __CLR4_1_10w9ww9wluszw4fb.R.inc(41859);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_10w9ww9wluszw4fb.R.iget(41860)!=0|true))||(__CLR4_1_10w9ww9wluszw4fb.R.iget(41861)==0&false)); ++i) {{
                __CLR4_1_10w9ww9wluszw4fb.R.inc(41862);JSONValidator validator = JSONValidator.fromUtf8(json);
                __CLR4_1_10w9ww9wluszw4fb.R.inc(41863);validator.validate();
            }
            }__CLR4_1_10w9ww9wluszw4fb.R.inc(41864);System.out.println("millis : " + (System.currentTimeMillis() - start));
        }
    }}finally{__CLR4_1_10w9ww9wluszw4fb.R.flushNeeded();}}
}
