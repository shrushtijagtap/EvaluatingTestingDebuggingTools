/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.json.bvt.util.ThreadLocalCacheTest;

import junit.framework.TestCase;

public class TestUTF8_2 extends TestCase {static class __CLR4_5_21ila1ilalusyjttu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,70804,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_utf_1() throws Exception {__CLR4_5_21ila1ilalusyjttu.R.globalSliceStart(getClass().getName(),70750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ja2xyr1ila();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ila1ilalusyjttu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ila1ilalusyjttu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70750,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ja2xyr1ila() throws Exception{try{__CLR4_5_21ila1ilalusyjttu.R.inc(70750);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70751);String content = new String(decodeHex("F0A4ADA2".toCharArray()), "UTF-8");
        __CLR4_5_21ila1ilalusyjttu.R.inc(70752);JSONObject json = new JSONObject();
        __CLR4_5_21ila1ilalusyjttu.R.inc(70753);json.put("content", content);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70754);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_5_21ila1ilalusyjttu.R.inc(70755);Assert.assertEquals(1, obj.size());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70756);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}

    public void test_utf_2() throws Exception {__CLR4_5_21ila1ilalusyjttu.R.globalSliceStart(getClass().getName(),70757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2mj2wr81ilh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ila1ilalusyjttu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ila1ilalusyjttu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70757,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2mj2wr81ilh() throws Exception{try{__CLR4_5_21ila1ilalusyjttu.R.inc(70757);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70758);String content = new String(decodeHex("E282AC".toCharArray()), "UTF-8");
        __CLR4_5_21ila1ilalusyjttu.R.inc(70759);JSONObject json = new JSONObject();
        __CLR4_5_21ila1ilalusyjttu.R.inc(70760);json.put("content", content);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70761);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_5_21ila1ilalusyjttu.R.inc(70762);Assert.assertEquals(1, obj.size());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70763);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}

    public void test_utf_3() throws Exception {__CLR4_5_21ila1ilalusyjttu.R.globalSliceStart(getClass().getName(),70764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ps2vjp1ilo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ila1ilalusyjttu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ila1ilalusyjttu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ps2vjp1ilo() throws Exception{try{__CLR4_5_21ila1ilalusyjttu.R.inc(70764);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70765);byte[] bytes = decodeHex("C2A2".toCharArray());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70766);String content = new String(bytes, "UTF-8");
        __CLR4_5_21ila1ilalusyjttu.R.inc(70767);JSONObject json = new JSONObject();
        __CLR4_5_21ila1ilalusyjttu.R.inc(70768);json.put("content", content);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70769);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_5_21ila1ilalusyjttu.R.inc(70770);Assert.assertEquals(1, obj.size());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70771);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}
    
    public void test_utf_4() throws Exception {__CLR4_5_21ila1ilalusyjttu.R.globalSliceStart(getClass().getName(),70772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2t12uc61ilw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ila1ilalusyjttu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ila1ilalusyjttu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),70772,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2t12uc61ilw() throws Exception{try{__CLR4_5_21ila1ilalusyjttu.R.inc(70772);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70773);ThreadLocalCacheTest.clearChars();
        
        __CLR4_5_21ila1ilalusyjttu.R.inc(70774);byte[] bytes = decodeHex("C2FF".toCharArray());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70775);String content = new String(bytes, "UTF-8");
        __CLR4_5_21ila1ilalusyjttu.R.inc(70776);JSONObject json = new JSONObject();
        __CLR4_5_21ila1ilalusyjttu.R.inc(70777);json.put("content", content);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70778);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_5_21ila1ilalusyjttu.R.inc(70779);Assert.assertEquals(1, obj.size());
        __CLR4_5_21ila1ilalusyjttu.R.inc(70780);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}
    
    public static byte[] decodeHex(char[] data) throws Exception {try{__CLR4_5_21ila1ilalusyjttu.R.inc(70781);

        __CLR4_5_21ila1ilalusyjttu.R.inc(70782);int len = data.length;

        __CLR4_5_21ila1ilalusyjttu.R.inc(70783);if (((((len & 0x01) != 0)&&(__CLR4_5_21ila1ilalusyjttu.R.iget(70784)!=0|true))||(__CLR4_5_21ila1ilalusyjttu.R.iget(70785)==0&false))) {{
            __CLR4_5_21ila1ilalusyjttu.R.inc(70786);throw new Exception("Odd number of characters.");
        }

        }__CLR4_5_21ila1ilalusyjttu.R.inc(70787);byte[] out = new byte[len >> 1];

        // two characters form the hex value.
        __CLR4_5_21ila1ilalusyjttu.R.inc(70788);for (int i = 0, j = 0; (((j < len)&&(__CLR4_5_21ila1ilalusyjttu.R.iget(70789)!=0|true))||(__CLR4_5_21ila1ilalusyjttu.R.iget(70790)==0&false)); i++) {{
            __CLR4_5_21ila1ilalusyjttu.R.inc(70791);int f = toDigit(data[j], j) << 4;
            __CLR4_5_21ila1ilalusyjttu.R.inc(70792);j++;
            __CLR4_5_21ila1ilalusyjttu.R.inc(70793);f = f | toDigit(data[j], j);
            __CLR4_5_21ila1ilalusyjttu.R.inc(70794);j++;
            __CLR4_5_21ila1ilalusyjttu.R.inc(70795);out[i] = (byte) (f & 0xFF);
        }

        }__CLR4_5_21ila1ilalusyjttu.R.inc(70796);return out;
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}
    
    protected static int toDigit(char ch, int index) throws Exception {try{__CLR4_5_21ila1ilalusyjttu.R.inc(70797);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70798);int digit = Character.digit(ch, 16);
        __CLR4_5_21ila1ilalusyjttu.R.inc(70799);if ((((digit == -1)&&(__CLR4_5_21ila1ilalusyjttu.R.iget(70800)!=0|true))||(__CLR4_5_21ila1ilalusyjttu.R.iget(70801)==0&false))) {{
            __CLR4_5_21ila1ilalusyjttu.R.inc(70802);throw new Exception("Illegal hexadecimal character " + ch + " at index " + index);
        }
        }__CLR4_5_21ila1ilalusyjttu.R.inc(70803);return digit;
    }finally{__CLR4_5_21ila1ilalusyjttu.R.flushNeeded();}}
}
