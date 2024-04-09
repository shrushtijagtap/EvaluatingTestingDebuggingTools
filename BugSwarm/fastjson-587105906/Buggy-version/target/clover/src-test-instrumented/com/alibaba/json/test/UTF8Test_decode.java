/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * Created by wenshao on 24/07/2017.
 */
public class UTF8Test_decode extends TestCase {static class __CLR4_1_10220g220glusqkrs0{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95962,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String T0 = "\u592e\u89c6\u7684\u62a5\u9053\u300a\u9646\u519b\u7b2c82\u96c6\u56e2\u519b\uff1a\u805a\u5408\u91cd\u5851 \u5f3a\u519b\u8def\u4e0a\u5f53\u5148\u950b\uff01\u300b\u62ab\u9732\uff0c\u4ece\u5357\u660c\u8d77\u4e49\u5230\u5e73\u6c5f\u8d77\u4e49\uff0c\u4ece\u4e95\u5188\u5c71\u6597\u4e89\u5230\u4e24\u4e07\u4e94\u5343\u91cc\u957f\u5f81\uff0c\u4ece\u9996\u6218\u5e73\u578b\u5173\u5230\u5386\u7ecf\u4e09\u5927\u6218\u5f79\uff0c\u4ece\u7a7f\u63d2\u4e09\u6240\u91cc\u5230\u5168\u6b7c\u7f8e\u519b\u5317\u6781\u718a\u56e2\uff0c22\u52c7\u58eb\u98de\u593a\u6cf8\u5b9a\u6865\u300118\u52c7\u58eb\u5f3a\u6e21\u4e4c\u6c5f\u3001\u93d6\u6218\u5180\u4e2d\u201c\u91ce\u516b\u65c5\u201d\u3001\u5c61\u6218\u5c61\u80dc\u201c\u8001\u864e\u8fde\u201d\u3001\u4e07\u5c81\u519b\uff0c\u4e00\u652f\u652f\u5584\u6218\u7684\u90e8\u961f\uff0c\u4e00\u4e2a\u4e2a\u6eda\u70eb\u7684\u540d\u5b57\uff0c\u7194\u94f8\u6210\u7b2c82\u96c6\u56e2\u519b\u65b0\u7684\u7075\u9b42\u3002";
    String T1 = "Model and actress Emily Ratajkowski would you like you to know she has wonderful abs. We don\u2019t know this because we\u2019re psychic, but rather can surmise this desire from her many photos she posts on Instagram. Whether it\u2019s due to genetics, diet, great Instagram techniques, or some combination of the above, the rising star takes ample opportunity to show you what she\u2019s got, and her fans love it.";


    Charset charset = Charset.forName("UTF-8");


    char[] chars;
    byte[] bytes;


    CharBuffer charBuffer;

    public void setUp() throws Exception {try{__CLR4_1_10220g220glusqkrs0.R.inc(95920);
        __CLR4_1_10220g220glusqkrs0.R.inc(95921);System.out.println(System.getProperty("java.runtime.version"));
    }finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}


    public void test_encode() throws Exception {__CLR4_1_10220g220glusqkrs0.R.globalSliceStart(getClass().getName(),95922);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10697bg6220i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10220g220glusqkrs0.R.rethrow($CLV_t2$);}finally{__CLR4_1_10220g220glusqkrs0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.UTF8Test_decode.test_encode",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95922,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10697bg6220i() throws Exception{try{__CLR4_1_10220g220glusqkrs0.R.inc(95922);
        __CLR4_1_10220g220glusqkrs0.R.inc(95923);String text = new StringBuilder().append(T0).append(System.currentTimeMillis()).toString();
        __CLR4_1_10220g220glusqkrs0.R.inc(95924);bytes = text.getBytes(charset);
        __CLR4_1_10220g220glusqkrs0.R.inc(95925);chars = new char[bytes.length];
        __CLR4_1_10220g220glusqkrs0.R.inc(95926);charBuffer = CharBuffer.allocate(bytes.length);

        __CLR4_1_10220g220glusqkrs0.R.inc(95927);for (int i = 0; (((i < 10)&&(__CLR4_1_10220g220glusqkrs0.R.iget(95928)!=0|true))||(__CLR4_1_10220g220glusqkrs0.R.iget(95929)==0&false)); ++i) {{
            __CLR4_1_10220g220glusqkrs0.R.inc(95930);long start = System.currentTimeMillis();
            __CLR4_1_10220g220glusqkrs0.R.inc(95931);f0(); // 764
//            f1(); // 695
//            f2(); // 975
            __CLR4_1_10220g220glusqkrs0.R.inc(95932);long millis = System.currentTimeMillis() - start;
            __CLR4_1_10220g220glusqkrs0.R.inc(95933);System.out.println("millis : " + millis);
        }
    }}finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}

    public void test_encode_en() throws Exception {__CLR4_1_10220g220glusqkrs0.R.globalSliceStart(getClass().getName(),95934);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ia16ek220u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10220g220glusqkrs0.R.rethrow($CLV_t2$);}finally{__CLR4_1_10220g220glusqkrs0.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.UTF8Test_decode.test_encode_en",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95934,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ia16ek220u() throws Exception{try{__CLR4_1_10220g220glusqkrs0.R.inc(95934);
        __CLR4_1_10220g220glusqkrs0.R.inc(95935);String text = new StringBuilder().append(T1).append(System.currentTimeMillis()).toString();
        __CLR4_1_10220g220glusqkrs0.R.inc(95936);bytes = text.getBytes(charset);
        __CLR4_1_10220g220glusqkrs0.R.inc(95937);chars = new char[bytes.length];
        __CLR4_1_10220g220glusqkrs0.R.inc(95938);charBuffer = CharBuffer.allocate(bytes.length);

        __CLR4_1_10220g220glusqkrs0.R.inc(95939);for (int i = 0; (((i < 10)&&(__CLR4_1_10220g220glusqkrs0.R.iget(95940)!=0|true))||(__CLR4_1_10220g220glusqkrs0.R.iget(95941)==0&false)); ++i) {{
            __CLR4_1_10220g220glusqkrs0.R.inc(95942);long start = System.currentTimeMillis();
            __CLR4_1_10220g220glusqkrs0.R.inc(95943);f0(); // 407 394
//            f1(); // 1296 1058
//            f2(); // 615 635
            __CLR4_1_10220g220glusqkrs0.R.inc(95944);long millis = System.currentTimeMillis() - start;
            __CLR4_1_10220g220glusqkrs0.R.inc(95945);System.out.println("millis : " + millis);
        }
    }}finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}

    private void f0() throws Exception {try{__CLR4_1_10220g220glusqkrs0.R.inc(95946);
        __CLR4_1_10220g220glusqkrs0.R.inc(95947);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_10220g220glusqkrs0.R.iget(95948)!=0|true))||(__CLR4_1_10220g220glusqkrs0.R.iget(95949)==0&false)); ++i) {{
            __CLR4_1_10220g220glusqkrs0.R.inc(95950);new String(bytes, charset);
        }
    }}finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}

    private void f1() throws Exception {try{__CLR4_1_10220g220glusqkrs0.R.inc(95951);
        __CLR4_1_10220g220glusqkrs0.R.inc(95952);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_10220g220glusqkrs0.R.iget(95953)!=0|true))||(__CLR4_1_10220g220glusqkrs0.R.iget(95954)==0&false)); ++i) {{
            __CLR4_1_10220g220glusqkrs0.R.inc(95955);int len = IOUtils.decodeUTF8(bytes, 0, bytes.length, chars);
            __CLR4_1_10220g220glusqkrs0.R.inc(95956);new String(chars, 0, len);
        }
    }}finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}

    private void f2() throws Exception {try{__CLR4_1_10220g220glusqkrs0.R.inc(95957);
        __CLR4_1_10220g220glusqkrs0.R.inc(95958);for (int i = 0; (((i < 1000 * 1000)&&(__CLR4_1_10220g220glusqkrs0.R.iget(95959)!=0|true))||(__CLR4_1_10220g220glusqkrs0.R.iget(95960)==0&false)); ++i) {{
            __CLR4_1_10220g220glusqkrs0.R.inc(95961);charset.newDecoder().decode(ByteBuffer.wrap(bytes));
        }
    }}finally{__CLR4_1_10220g220glusqkrs0.R.flushNeeded();}}
}
