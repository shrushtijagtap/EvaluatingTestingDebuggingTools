/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;

public class FieldDeserializerTest2 extends TestCase {static class __CLR4_1_101ltk1ltkluszwdd9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,74965,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceStart(getClass().getName(),74936);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21ltk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltk1ltkluszwdd9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74936,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21ltk() throws Exception{try{__CLR4_1_101ltk1ltkluszwdd9.R.inc(74936);
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74937);String input = "{,,,\"value\":null,,,,}";
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74938);int featureValues = 0;
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74939);featureValues |= Feature.AllowArbitraryCommas.getMask();
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74940);DefaultJSONParser parser = new DefaultJSONParser(input, ParserConfig.getGlobalInstance(), featureValues);
        
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74941);Entity object = new Entity();
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74942);parser.parseObject(object);
    }finally{__CLR4_1_101ltk1ltkluszwdd9.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceStart(getClass().getName(),74943);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ltr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltk1ltkluszwdd9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74943,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ltr() throws Exception{try{__CLR4_1_101ltk1ltkluszwdd9.R.inc(74943);
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74944);String input = "{,,,\"value\":null,\"id\":123,,,,}";
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74945);int featureValues = 0;
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74946);featureValues |= Feature.AllowArbitraryCommas.getMask();
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74947);featureValues |= Feature.IgnoreNotMatch.getMask();
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74948);DefaultJSONParser parser = new DefaultJSONParser(input, ParserConfig.getGlobalInstance(), featureValues);
        
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74949);Entity object = new Entity();
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74950);parser.parseObject(object);
    }finally{__CLR4_1_101ltk1ltkluszwdd9.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceStart(getClass().getName(),74951);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1ltz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltk1ltkluszwdd9.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltk1ltkluszwdd9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.FieldDeserializerTest2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74951,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1ltz() throws Exception{try{__CLR4_1_101ltk1ltkluszwdd9.R.inc(74951);
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74952);Exception error = null;
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74953);try {
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74954);String input = "{\"value\":null,\"id\":123}";
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74955);int featureValues = 0;
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74956);DefaultJSONParser parser = new DefaultJSONParser(input, ParserConfig.getGlobalInstance(), featureValues);
            
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74957);Entity object = new Entity();
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74958);parser.parseObject(object);
        } catch (JSONException ex) {
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74959);error = ex;
        }
        __CLR4_1_101ltk1ltkluszwdd9.R.inc(74960);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ltk1ltkluszwdd9.R.flushNeeded();}}


    private static class Entity {

        private String value;

        public String getValue() {try{__CLR4_1_101ltk1ltkluszwdd9.R.inc(74961);
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74962);return value;
        }finally{__CLR4_1_101ltk1ltkluszwdd9.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_101ltk1ltkluszwdd9.R.inc(74963);
            __CLR4_1_101ltk1ltkluszwdd9.R.inc(74964);this.value = value;
        }finally{__CLR4_1_101ltk1ltkluszwdd9.R.flushNeeded();}}

    }

}
