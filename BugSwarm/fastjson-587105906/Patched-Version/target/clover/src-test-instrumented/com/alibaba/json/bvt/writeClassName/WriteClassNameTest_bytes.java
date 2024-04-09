/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenshao on 15/05/2017.
 */
public class WriteClassNameTest_bytes extends TestCase {static class __CLR4_5_21zz21zz2lusvnir5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,93352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_bytes() throws Exception {__CLR4_5_21zz21zz2lusvnir5.R.globalSliceStart(getClass().getName(),93278);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2lg4o5r1zz2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zz21zz2lusvnir5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zz21zz2lusvnir5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_bytes.test_for_bytes",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),93278,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2lg4o5r1zz2() throws Exception{try{__CLR4_5_21zz21zz2lusvnir5.R.inc(93278);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93279);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93280);list.add("a");

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93281);byte[] bytes = hex("84C1F969587F5FD1942148EE9D36A0FB");
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93282);String hex = hex(bytes);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93283);byte[] bytes_2 = hex(hex);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93284);String hex_2 = hex(bytes_2);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93285);assertEquals(hex, hex_2);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93286);System.out.println(hex);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93287);assertEquals("84C1F969587F5FD1942148EE9D36A0FB", hex);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93288);list.add(bytes);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93289);String str = JSON.toJSONString(list, SerializerFeature.WriteClassName);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93290);System.out.println(str);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93291);assertEquals("[\"a\",x'84C1F969587F5FD1942148EE9D36A0FB']", str);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93292);JSONArray array = (JSONArray) JSON.parse(str);

        __CLR4_5_21zz21zz2lusvnir5.R.inc(93293);assertEquals("a", array.get(0));
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93294);assertTrue(array.get(1) instanceof byte[]);

        // list.add(new )
    }finally{__CLR4_5_21zz21zz2lusvnir5.R.flushNeeded();}}

    public void test_bytes2() throws Exception {__CLR4_5_21zz21zz2lusvnir5.R.globalSliceStart(getClass().getName(),93295);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2nvds5h1zzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zz21zz2lusvnir5.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zz21zz2lusvnir5.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest_bytes.test_bytes2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),93295,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2nvds5h1zzj() throws Exception{try{__CLR4_5_21zz21zz2lusvnir5.R.inc(93295);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93296);JSON.parseArray("[x'84C1F969587F5FD1942148EE9D36A0FB']");
    }finally{__CLR4_5_21zz21zz2lusvnir5.R.flushNeeded();}}

    private static final byte[] hexBytes = new byte[71];
    private static final char[] hexChars = "0123456789ABCDEF".toCharArray();

    static {try{__CLR4_5_21zz21zz2lusvnir5.R.inc(93297);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93298);Arrays.fill(hexBytes, (byte) -1);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93299);for (int i = '9'; (((i >= '0')&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93300)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93301)==0&false)); i--) {{
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93302);hexBytes[i] = (byte) (i - '0');
        }
        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93303);for (int i = 'F'; (((i >= 'A')&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93304)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93305)==0&false)); i--) {{
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93306);hexBytes[i] = (byte) (i - 'A' + 10);
        }
    }}finally{__CLR4_5_21zz21zz2lusvnir5.R.flushNeeded();}}

    /**
     * Encode a byte array to hex string
     *
     * @param bytes array of byte to encode
     * @return return encoded string
     */
    public static String hex(byte[] bytes) {try{__CLR4_5_21zz21zz2lusvnir5.R.inc(93307);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93308);if ((((bytes == null)&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93309)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93310)==0&false))) {{
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93311);return null;
        }

        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93312);int bytesLen = bytes.length;
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93313);char[] chars = new char[bytesLen * 2];
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93314);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93315)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93316)==0&false)); i++) {{
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93317);int a = bytes[i] & 0xFF;
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93318);int b0 = a >> 4;
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93319);int b1 = a & 0xf;

            __CLR4_5_21zz21zz2lusvnir5.R.inc(93320);chars[i * 2] = (char) (b0 + ((((b0 < 10 )&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93321)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93322)==0&false))? 48 : 55)); //hexChars[b0];
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93323);chars[i * 2 + 1] = (char) (b1 + ((((b1 < 10 )&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93324)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93325)==0&false))? 48 : 55));
        }
        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93326);return new String(chars);
    }finally{__CLR4_5_21zz21zz2lusvnir5.R.flushNeeded();}}

    /**
     * Decode hex string to a byte array
     *
     * @param hex encoded string
     * @return return array of byte to encode
     */
    public static byte[] hex(String hex) {try{__CLR4_5_21zz21zz2lusvnir5.R.inc(93327);
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93328);if ((((hex == null)&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93329)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93330)==0&false)))
            {__CLR4_5_21zz21zz2lusvnir5.R.inc(93331);return null;

        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93332);int len = hex.length();
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93333);if ((((len % 2 != 0)&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93334)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93335)==0&false)))
            {__CLR4_5_21zz21zz2lusvnir5.R.inc(93336);return null;

        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93337);char[] chars = hex.toCharArray();
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93338);byte[] bytes = new byte[len / 2];
        __CLR4_5_21zz21zz2lusvnir5.R.inc(93339);for (int i = 0; (((i < bytes.length)&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93340)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93341)==0&false)); i++) {{
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93342);char c0 = chars[i * 2];
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93343);char c1 = chars[i * 2 + 1];
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93344);int b0 = c0 - ((((c0 <= 57 )&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93345)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93346)==0&false))? 48 : 55);
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93347);int b1 = c1 - ((((c1 <= 57 )&&(__CLR4_5_21zz21zz2lusvnir5.R.iget(93348)!=0|true))||(__CLR4_5_21zz21zz2lusvnir5.R.iget(93349)==0&false))? 48 : 55);
            __CLR4_5_21zz21zz2lusvnir5.R.inc(93350);bytes[i] = (byte) ((b0 << 4) | b1);
        }
        }__CLR4_5_21zz21zz2lusvnir5.R.inc(93351);return bytes;
    }finally{__CLR4_5_21zz21zz2lusvnir5.R.flushNeeded();}}
}
