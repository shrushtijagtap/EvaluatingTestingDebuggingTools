/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.json.bvt.util.ThreadLocalCacheTest;

import junit.framework.TestCase;

public class TestUTF8_2 extends TestCase {static class __CLR4_1_101jjt1jjtluszwcsk{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,72047,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_utf_1() throws Exception {__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceStart(getClass().getName(),71993);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ja2xyr1jjt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jjt1jjtluszwcsk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71993,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ja2xyr1jjt() throws Exception{try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(71993);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71994);String content = new String(decodeHex("F0A4ADA2".toCharArray()), "UTF-8");
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71995);JSONObject json = new JSONObject();
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71996);json.put("content", content);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71997);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71998);Assert.assertEquals(1, obj.size());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(71999);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}

    public void test_utf_2() throws Exception {__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceStart(getClass().getName(),72000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10mj2wr81jk0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jjt1jjtluszwcsk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10mj2wr81jk0() throws Exception{try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(72000);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72001);String content = new String(decodeHex("E282AC".toCharArray()), "UTF-8");
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72002);JSONObject json = new JSONObject();
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72003);json.put("content", content);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72004);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72005);Assert.assertEquals(1, obj.size());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72006);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}

    public void test_utf_3() throws Exception {__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceStart(getClass().getName(),72007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ps2vjp1jk7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jjt1jjtluszwcsk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ps2vjp1jk7() throws Exception{try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(72007);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72008);byte[] bytes = decodeHex("C2A2".toCharArray());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72009);String content = new String(bytes, "UTF-8");
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72010);JSONObject json = new JSONObject();
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72011);json.put("content", content);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72012);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72013);Assert.assertEquals(1, obj.size());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72014);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}
    
    public void test_utf_4() throws Exception {__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceStart(getClass().getName(),72015);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10t12uc61jkf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101jjt1jjtluszwcsk.R.rethrow($CLV_t2$);}finally{__CLR4_1_101jjt1jjtluszwcsk.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TestUTF8_2.test_utf_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),72015,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10t12uc61jkf() throws Exception{try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(72015);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72016);ThreadLocalCacheTest.clearChars();
        
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72017);byte[] bytes = decodeHex("C2FF".toCharArray());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72018);String content = new String(bytes, "UTF-8");
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72019);JSONObject json = new JSONObject();
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72020);json.put("content", content);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72021);JSONObject obj = (JSONObject) JSON.parse(json.toJSONString().getBytes("UTF-8"));
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72022);Assert.assertEquals(1, obj.size());
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72023);Assert.assertEquals(content, obj.get("content"));
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}
    
    public static byte[] decodeHex(char[] data) throws Exception {try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(72024);

        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72025);int len = data.length;

        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72026);if (((((len & 0x01) != 0)&&(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72027)!=0|true))||(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72028)==0&false))) {{
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72029);throw new Exception("Odd number of characters.");
        }

        }__CLR4_1_101jjt1jjtluszwcsk.R.inc(72030);byte[] out = new byte[len >> 1];

        // two characters form the hex value.
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72031);for (int i = 0, j = 0; (((j < len)&&(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72032)!=0|true))||(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72033)==0&false)); i++) {{
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72034);int f = toDigit(data[j], j) << 4;
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72035);j++;
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72036);f = f | toDigit(data[j], j);
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72037);j++;
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72038);out[i] = (byte) (f & 0xFF);
        }

        }__CLR4_1_101jjt1jjtluszwcsk.R.inc(72039);return out;
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}
    
    protected static int toDigit(char ch, int index) throws Exception {try{__CLR4_1_101jjt1jjtluszwcsk.R.inc(72040);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72041);int digit = Character.digit(ch, 16);
        __CLR4_1_101jjt1jjtluszwcsk.R.inc(72042);if ((((digit == -1)&&(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72043)!=0|true))||(__CLR4_1_101jjt1jjtluszwcsk.R.iget(72044)==0&false))) {{
            __CLR4_1_101jjt1jjtluszwcsk.R.inc(72045);throw new Exception("Illegal hexadecimal character " + ch + " at index " + index);
        }
        }__CLR4_1_101jjt1jjtluszwcsk.R.inc(72046);return digit;
    }finally{__CLR4_1_101jjt1jjtluszwcsk.R.flushNeeded();}}
}
