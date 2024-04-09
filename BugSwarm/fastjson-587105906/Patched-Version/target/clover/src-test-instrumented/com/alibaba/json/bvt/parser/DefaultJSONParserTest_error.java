/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;

public class DefaultJSONParserTest_error extends TestCase {static class __CLR4_5_21h5h1h5hlusvnclr{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68912,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error_1() {__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceStart(getClass().getName(),68885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1h5h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h5h1h5hlusvnclr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_error.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68885,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1h5h(){try{__CLR4_5_21h5h1h5hlusvnclr.R.inc(68885);
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68886);String text = "{\"obj\":{}]}";
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68887);char[] chars = text.toCharArray();
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68888);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);

        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68889);JSONException error = null;
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68890);try {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68891);parser.parseObject();
        } catch (JSONException ex) {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68892);error = ex;
        }
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68893);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h5h1h5hlusvnclr.R.flushNeeded();}}
    
    public void test_error_2() {__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceStart(getClass().getName(),68894);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1h5q();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h5h1h5hlusvnclr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_error.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68894,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1h5q(){try{__CLR4_5_21h5h1h5hlusvnclr.R.inc(68894);
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68895);String text = "{\"obj\":[]]}";
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68896);char[] chars = text.toCharArray();
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68897);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);

        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68898);JSONException error = null;
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68899);try {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68900);parser.parseObject();
        } catch (JSONException ex) {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68901);error = ex;
        }
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68902);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h5h1h5hlusvnclr.R.flushNeeded();}}
    
    public void test_error_3() {__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceStart(getClass().getName(),68903);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1h5z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h5h1h5hlusvnclr.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h5h1h5hlusvnclr.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultJSONParserTest_error.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68903,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1h5z(){try{__CLR4_5_21h5h1h5hlusvnclr.R.inc(68903);
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68904);String text = "{\"obj\":true]}";
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68905);char[] chars = text.toCharArray();
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68906);DefaultJSONParser parser = new DefaultJSONParser(chars, chars.length, ParserConfig.getGlobalInstance(), 0);

        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68907);JSONException error = null;
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68908);try {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68909);parser.parseObject();
        } catch (JSONException ex) {
            __CLR4_5_21h5h1h5hlusvnclr.R.inc(68910);error = ex;
        }
        __CLR4_5_21h5h1h5hlusvnclr.R.inc(68911);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h5h1h5hlusvnclr.R.flushNeeded();}}
}
