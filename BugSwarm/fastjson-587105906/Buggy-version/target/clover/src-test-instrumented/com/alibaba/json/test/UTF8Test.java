/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import com.alibaba.fastjson.util.IOUtils;
import junit.framework.TestCase;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

/**
 * Created by wenshao on 24/07/2017.
 */
public class UTF8Test extends TestCase {static class __CLR4_1_1021zk21zklusqkrrl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95920,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    String T0 = "\u592e\u89c6\u7684\u62a5\u9053\u300a\u9646\u519b\u7b2c82\u96c6\u56e2\u519b\uff1a\u805a\u5408\u91cd\u5851 \u5f3a\u519b\u8def\u4e0a\u5f53\u5148\u950b\uff01\u300b\u62ab\u9732\uff0c\u4ece\u5357\u660c\u8d77\u4e49\u5230\u5e73\u6c5f\u8d77\u4e49\uff0c\u4ece\u4e95\u5188\u5c71\u6597\u4e89\u5230\u4e24\u4e07\u4e94\u5343\u91cc\u957f\u5f81\uff0c\u4ece\u9996\u6218\u5e73\u578b\u5173\u5230\u5386\u7ecf\u4e09\u5927\u6218\u5f79\uff0c\u4ece\u7a7f\u63d2\u4e09\u6240\u91cc\u5230\u5168\u6b7c\u7f8e\u519b\u5317\u6781\u718a\u56e2\uff0c22\u52c7\u58eb\u98de\u593a\u6cf8\u5b9a\u6865\u300118\u52c7\u58eb\u5f3a\u6e21\u4e4c\u6c5f\u3001\u93d6\u6218\u5180\u4e2d\u201c\u91ce\u516b\u65c5\u201d\u3001\u5c61\u6218\u5c61\u80dc\u201c\u8001\u864e\u8fde\u201d\u3001\u4e07\u5c81\u519b\uff0c\u4e00\u652f\u652f\u5584\u6218\u7684\u90e8\u961f\uff0c\u4e00\u4e2a\u4e2a\u6eda\u70eb\u7684\u540d\u5b57\uff0c\u7194\u94f8\u6210\u7b2c82\u96c6\u56e2\u519b\u65b0\u7684\u7075\u9b42\u3002";
    String T1 = "Model and actress Emily Ratajkowski would you like you to know she has wonderful abs. We don\u2019t know this because we\u2019re psychic, but rather can surmise this desire from her many photos she posts on Instagram. Whether it\u2019s due to genetics, diet, great Instagram techniques, or some combination of the above, the rising star takes ample opportunity to show you what she\u2019s got, and her fans love it.";

    Charset charset = Charset.forName("UTF-8");
    String text = new StringBuilder().append(T0).append(System.currentTimeMillis()).toString();
    //String text = "Model and actress Emily Ratajkowski would you like you to know she has wonderful abs. We don\u2019t know this because we\u2019re psychic, but rather can surmise this desire from her many photos she posts on Instagram. Whether it\u2019s due to genetics, diet, great Instagram techniques, or some combination of the above, the rising star takes ample opportunity to show you what she\u2019s got, and her fans love it.";
    char[] chars = text.toCharArray();
    byte[] bytes = new byte[chars.length * 3];



    ByteBuffer byteBuffer;

    protected void setUp() throws Exception {try{__CLR4_1_1021zk21zklusqkrrl.R.inc(95888);
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95889);System.out.println(System.getProperty("java.runtime.version"));
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95890);byteBuffer = ByteBuffer.allocate(text.length() * 3);
    }finally{__CLR4_1_1021zk21zklusqkrrl.R.flushNeeded();}}

    public void test_encode() throws Exception {__CLR4_1_1021zk21zklusqkrrl.R.globalSliceStart(getClass().getName(),95891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10697bg621zn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021zk21zklusqkrrl.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021zk21zklusqkrrl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.UTF8Test.test_encode",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10697bg621zn() throws Exception{try{__CLR4_1_1021zk21zklusqkrrl.R.inc(95891);


//        for (int i = 0; i < 5; ++i) {
//            f0();
//        }
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95892);for (int i = 0; (((i < 5)&&(__CLR4_1_1021zk21zklusqkrrl.R.iget(95893)!=0|true))||(__CLR4_1_1021zk21zklusqkrrl.R.iget(95894)==0&false)); ++i) {{
            __CLR4_1_1021zk21zklusqkrrl.R.inc(95895);f1();
        }
//        for (int i = 0; i < 5; ++i) {
//            f2();
//        }
    }}finally{__CLR4_1_1021zk21zklusqkrrl.R.flushNeeded();}}

    final static int COUNT = 1000 * 1000 * 5;

    private void f0() throws Exception {try{__CLR4_1_1021zk21zklusqkrrl.R.inc(95896);
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95897);long start = System.currentTimeMillis();
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95898);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021zk21zklusqkrrl.R.iget(95899)!=0|true))||(__CLR4_1_1021zk21zklusqkrrl.R.iget(95900)==0&false)); ++i) {{
            __CLR4_1_1021zk21zklusqkrrl.R.inc(95901);text.getBytes(charset);
        }
        }__CLR4_1_1021zk21zklusqkrrl.R.inc(95902);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95903);System.out.println("f0 millis : " + millis);
    }finally{__CLR4_1_1021zk21zklusqkrrl.R.flushNeeded();}}

    private void f1() throws Exception {try{__CLR4_1_1021zk21zklusqkrrl.R.inc(95904);
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95905);long start = System.currentTimeMillis();
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95906);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021zk21zklusqkrrl.R.iget(95907)!=0|true))||(__CLR4_1_1021zk21zklusqkrrl.R.iget(95908)==0&false)); ++i) {{
            __CLR4_1_1021zk21zklusqkrrl.R.inc(95909);IOUtils.encodeUTF8(chars, 0, chars.length, bytes);
        }
        }__CLR4_1_1021zk21zklusqkrrl.R.inc(95910);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95911);System.out.println("f1 millis : " + millis);
    }finally{__CLR4_1_1021zk21zklusqkrrl.R.flushNeeded();}}

    private void f2() throws Exception {try{__CLR4_1_1021zk21zklusqkrrl.R.inc(95912);
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95913);long start = System.currentTimeMillis();
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95914);for (int i = 0; (((i < COUNT)&&(__CLR4_1_1021zk21zklusqkrrl.R.iget(95915)!=0|true))||(__CLR4_1_1021zk21zklusqkrrl.R.iget(95916)==0&false)); ++i) {{
            __CLR4_1_1021zk21zklusqkrrl.R.inc(95917);charset.newEncoder().encode(CharBuffer.wrap(chars));
        }
        }__CLR4_1_1021zk21zklusqkrrl.R.inc(95918);long millis = System.currentTimeMillis() - start;
        __CLR4_1_1021zk21zklusqkrrl.R.inc(95919);System.out.println("f2 millis : " + millis);
    }finally{__CLR4_1_1021zk21zklusqkrrl.R.flushNeeded();}}
}
