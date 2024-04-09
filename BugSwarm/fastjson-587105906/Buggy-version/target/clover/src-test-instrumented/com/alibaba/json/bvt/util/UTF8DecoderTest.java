/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.util;

import com.alibaba.fastjson.util.ThreadLocalCache;
import com.alibaba.fastjson.util.UTF8Decoder;
import junit.framework.TestCase;

import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;

public class UTF8DecoderTest extends TestCase {static class __CLR4_1_101y061y06lusqknq3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,90799,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_0() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90726);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21y06();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90726,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21y06() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90726);
        __CLR4_1_101y061y06lusqknq3.R.inc(90727);CharsetDecoder decoder = ThreadLocalCache.getUTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90728);String str = "asdfl\u4e2d\u534e\u4eba\u6c11\u5171\u548c\u56fd\u636e\u300a\u4eca\u65e5\u4fc4\u7f57\u65af\u300b17\u65e5\u6d88\u606f\uff0c\u7a46\u5e0c\u5361\u603b\u7edf\u81ea2015\u5e74\u5378\u4efb\u603b\u7edf\u4e00\u804c\u540e\u4e00\u76f4\u5728\u53c2\u8bae\u9662\u5c31\u804c\u300214\u65e5\uff0c\u7a46\u5e0c\u5361\u5ba3\u5e03\u8f9e\u804c\uff0c\u7406\u7531\u662f\u201c\u957f\u9014\u8dcb\u6d89\u540e\u611f\u5230\u75b2\u60eb\u4e86\u201d\u3002\u6309\u7167\u89c4\u5b9a\uff0c\u4ed6\u4f5c\u4e3a\u53c2\u8bae\u5458\u7684\u4efb\u671f\u5c06\u52302020\u5e74\u3002";

        {
            __CLR4_1_101y061y06lusqknq3.R.inc(90729);byte[] bytes = str.getBytes("UTF-8");
            __CLR4_1_101y061y06lusqknq3.R.inc(90730);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90731);decoder.decode(byteBuffer);
        }

        __CLR4_1_101y061y06lusqknq3.R.inc(90732);try {
            __CLR4_1_101y061y06lusqknq3.R.inc(90733);byte[] bytes = str.getBytes("GB18030");
            __CLR4_1_101y061y06lusqknq3.R.inc(90734);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90735);decoder.decode(byteBuffer);
        } catch (CharacterCodingException ex) {

        }
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90736);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1y0g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90736,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1y0g() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90736);
        __CLR4_1_101y061y06lusqknq3.R.inc(90737);int len = (Character.MAX_VALUE - Character.MIN_VALUE) + 1;
        __CLR4_1_101y061y06lusqknq3.R.inc(90738);char[] chars = new char[len];
        __CLR4_1_101y061y06lusqknq3.R.inc(90739);for (int i = 0; (((i < len)&&(__CLR4_1_101y061y06lusqknq3.R.iget(90740)!=0|true))||(__CLR4_1_101y061y06lusqknq3.R.iget(90741)==0&false)); ++i) {{
            __CLR4_1_101y061y06lusqknq3.R.inc(90742);char ch = (char) ((int) Character.MAX_VALUE + i);
            __CLR4_1_101y061y06lusqknq3.R.inc(90743);if ((((ch >= 55296 && ch <= 57344)&&(__CLR4_1_101y061y06lusqknq3.R.iget(90744)!=0|true))||(__CLR4_1_101y061y06lusqknq3.R.iget(90745)==0&false))) {{
                __CLR4_1_101y061y06lusqknq3.R.inc(90746);continue;
            }
            }__CLR4_1_101y061y06lusqknq3.R.inc(90747);chars[i] = ch;
        }

        }__CLR4_1_101y061y06lusqknq3.R.inc(90748);String str = new String(chars);

        __CLR4_1_101y061y06lusqknq3.R.inc(90749);CharsetDecoder decoder = ThreadLocalCache.getUTF8Decoder();

        {
            __CLR4_1_101y061y06lusqknq3.R.inc(90750);byte[] bytes = str.getBytes("UTF-8");
            __CLR4_1_101y061y06lusqknq3.R.inc(90751);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90752);decoder.decode(byteBuffer);
        }
        __CLR4_1_101y061y06lusqknq3.R.inc(90753);try {
            __CLR4_1_101y061y06lusqknq3.R.inc(90754);byte[] bytes = str.getBytes("GB18030");
            __CLR4_1_101y061y06lusqknq3.R.inc(90755);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90756);decoder.decode(byteBuffer);
        } catch (CharacterCodingException ex) {

        }
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441y11();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441y11() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90757);
        __CLR4_1_101y061y06lusqknq3.R.inc(90758);CharsetDecoder decoder = ThreadLocalCache.getUTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90759);String str = "\u5ac9\u59ac\u5fc3\u3092\u6b62\u3081\u3089\u308c\u306a\u3044\n" +
                "\u670d\u88c5\u306f\u3044\u3064\u3082\u5730\u5473\u306aA\u3067\u3059\u304c\u3001\u3088\u304f\u898b\u308b\u3068\u30a2\u30af\u30bb\u30b5\u30ea\u30fc\u3084\u30d0\u30c3\u30b0\u304c\u30d6\u30e9\u30f3\u30c9\u54c1\u3002\u305d\u3053\u3067\u3001\u305d\u306e\u4eba\u306e\u592b\u306e\u8077\u696d\u3092\u805e\u304f\u3068\u2026\u3002";

        {
            __CLR4_1_101y061y06lusqknq3.R.inc(90760);byte[] bytes = str.getBytes("UTF-8");
            __CLR4_1_101y061y06lusqknq3.R.inc(90761);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90762);decoder.decode(byteBuffer);
        }
        __CLR4_1_101y061y06lusqknq3.R.inc(90763);try {
            __CLR4_1_101y061y06lusqknq3.R.inc(90764);byte[] bytes = str.getBytes("GB18030");
            __CLR4_1_101y061y06lusqknq3.R.inc(90765);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90766);decoder.decode(byteBuffer);
        } catch (CharacterCodingException ex) {

        }
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90767);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1y1b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90767,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1y1b() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90767);
        __CLR4_1_101y061y06lusqknq3.R.inc(90768);CharsetDecoder decoder = ThreadLocalCache.getUTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90769);String str = "\u9762\u7684\u85cf\u6587\u6709\u4e00\u4e2a\u97f3\u8282\u201c\u0f56\u0f66\u0f92\u0fb2\u0f7c\u0f53\u0f51\u201d\uff08\u5a01\u5229\u8f6c\u5199\uff1absgrond\uff09\uff0c\u7531\u524d\u52a0\u5b57ba\u3001\u4e0a\u52a0\u5b57sa\uff0c\u57fa\u5b57ga,\u4e0b\u52a0\u5b57ra\uff0c\u5143\u97f3o\u3001\u7b2c\u4e00\u540e\u52a0\u5b57na\u3001\u7b2c\u4e8c\u540e\u52a0\u5b57da\u6784\u6210\u3002bsgrond\u662f7\u4e16\u7eaa\u7684\u85cf\u8bed\u8bed\u97f3\uff0c\u968f\u7740\u73b0\u5728\u62c9\u8428\u97f3\u91cc\u590d\u8f85\u97f3\u4ee5\u53ca\u90e8\u5206\u97f5\u5c3e\u7684\u6d88\u5931\u548c\u58f0\u8c03\u7684\u51fa\u73b0\uff0c\u8be5\u8bcd\u5df2\u8f6c\u53d8\u8bfb\u6210/\u0288\u0282\u00f8\u0303\u02e9\u02e8/\uff08\u85cf\u8bed\u62fc\u97f3\uff1azh\u00f6n\uff0c\u85cf\u6587\u62c9\u8428\u97f3\u62fc\u97f3\uff1azhoenv\uff09\u3002\n" +
                "\n" +
                "\u524d\u52a0\u5b57\u53ea\u80fd\u662f \u0f42 /g/\u3001 \u0f51 /d/\u3001 \u0f56 /b/\u3001 \u0f58 /m/\u3001 \u0f60 /\u0266/\u3002\n" +
                "\u4e0a\u52a0\u5b57\u53ea\u80fd\u662f \u0f6a /r/\u3001 \u0f63 /l/\u3001 \u0f66 /s/\u3002\n" +
                "\u4e0b\u52a0\u5b57\u53ea\u80fd\u662f \u25cc\u0fb2 /r/\u3001 \u25cc\u0fb1 /j/\u3001 \u25cc\u0fad /w/\u3001 \u25cc\u0fb3 /l/ \u548c\u7528\u4e8e\u97f3\u8bd1\u68b5\u6587\u91cc\u9001\u6c14\u6d4a\u8f85\u97f3\u7684\u9001\u6c14\u7b26\u53f7 \u25cc\u0fb7\uff0c\u6709\u4e00\u4e2a\u590d\u8f85\u97f3 \u0f42\u0fb2\u0fad /grwa/ \u6709\u4e24\u4e2a\u4e0b\u52a0\u5b57 \u25cc\u0fb2 /r/ \u548c \u25cc\u0fad /w/\u3002\n" +
                "\u7b2c\u4e00\u540e\u52a0\u5b57\u53ea\u53ef\u80fd\u662f \u0f6a /r/\u3001 \u0f42 /g/\u3001 \u0f56 /b/\u3001 \u0f58 /m/\u3001 \u0f60 /\u0266/\u3001 \u0f44 /\u014b/\u3001 \u0f66 /s/\u3001 \u0f51 /d/\u3001 \u0f53 /n/\u3001 \u0f63 /l/\u3002\n" +
                "\u7b2c\u4e8c\u540e\u52a0\u5b57\u53ea\u53ef\u80fd\u662f \u0f66 /s/ \u548c \u0f51 /d/\uff0c\u5728\u73b0\u4ee3\u85cf\u8bed\u91cc\u4e0d\u518d\u53d1\u97f3\uff0c\u0f51 /d/ \u5728\u73b0\u4ee3\u85cf\u8bed\u4e2d\u5df2\u7ecf\u4e0d\u7528\u3002\n" +
                "\u53e6\u5916\uff0c\u4ee5\u4e0b\u662f\u85cf\u6587\u5e26\u5934\u5b57\uff08\u0f51\u0f56\u0f74\u0f0b\u0f45\u0f53\u0f0b\uff09\u548c\u65e0\u5934\u5b57\uff08\u0f51\u0f56\u0f74\u0f0b\u0f58\u0f7a\u0f51\u0f0b\uff09\u4e24\u79cd\u5b57\u4f53\u548c\u56fd\u9645\u62c9\u4e01\u6587\u8f6c\u5199\u7684\u5217\u8868\uff1a";

        {
            __CLR4_1_101y061y06lusqknq3.R.inc(90770);byte[] bytes = str.getBytes("UTF-8");
            __CLR4_1_101y061y06lusqknq3.R.inc(90771);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90772);decoder.decode(byteBuffer);
        }
        __CLR4_1_101y061y06lusqknq3.R.inc(90773);try {
            __CLR4_1_101y061y06lusqknq3.R.inc(90774);byte[] bytes = str.getBytes("GB18030");
            __CLR4_1_101y061y06lusqknq3.R.inc(90775);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90776);decoder.decode(byteBuffer);
        } catch (CharacterCodingException ex) {

        }
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90777);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61y1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90777,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61y1l() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90777);
        __CLR4_1_101y061y06lusqknq3.R.inc(90778);CharsetDecoder decoder = ThreadLocalCache.getUTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90779);String str = "\ud83e\udd17 on Instagram\n" +
                "\ud83e\udd17 on Twitter\n" +
                "\ud83e\udd17 on Wikipedia\n" +
                "\ud83e\udd17 on Yelp\n" +
                "\ud83e\udd17 on YouTube\n" +
                "\ud83e\udd17 on Google Trends\n" +
                "See also\n" +
                "\ud83c\udfe5 Hospital\n" +
                "\ud83d\udc50 Open Hands\n" +
                "\ud83e\udd68 Pretzel\n" +
                "\ud83d\ude42 Slightly Smiling Face\n" +
                "\ud83e\udd27 Sneezing Face\n" +
                "\ud83e\udd14 Thinking Face\n" +
                "\ud83d\udc95 Two Hearts\n" +
                "\u263a Smiling Face\n" +
                "\ud83d\udd00 Random emoji";

        {
            __CLR4_1_101y061y06lusqknq3.R.inc(90780);byte[] bytes = str.getBytes("UTF-8");
            __CLR4_1_101y061y06lusqknq3.R.inc(90781);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90782);decoder.decode(byteBuffer);
        }
        __CLR4_1_101y061y06lusqknq3.R.inc(90783);try {
            __CLR4_1_101y061y06lusqknq3.R.inc(90784);byte[] bytes = str.getBytes("GB18030");
            __CLR4_1_101y061y06lusqknq3.R.inc(90785);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            __CLR4_1_101y061y06lusqknq3.R.inc(90786);decoder.decode(byteBuffer);
        } catch (CharacterCodingException ex) {

        }
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public void test_5() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90787);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_106w3nqp1y1v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90787,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_106w3nqp1y1v() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90787);
        __CLR4_1_101y061y06lusqknq3.R.inc(90788);UTF8Decoder decoder = new UTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90789);String str = "\u231b\ufe0e\u20ac\ud83d\udc69\ud83d\udc68\ud83d\udc68\ud83c\udffb\ud83d\udc69\ud83c\udfffU+1F9D2: Child\tText\t\ud83e\uddd2\t\ud83e\uddd2\ud83c\udffb\t\ud83e\uddd2\ud83c\udffc\t\ud83e\uddd2\ud83c\udffd\t\ud83e\uddd2\ud83c\udffe\t\ud83e\uddd2\ud83c\udfff\n\ud83e\uddd1\ud83c\udfff\ud83c\ude1a\ufe0f\ud83c\udc04\ufe0f\u2764\ufe0f";
        __CLR4_1_101y061y06lusqknq3.R.inc(90790);byte[] bytes =str.getBytes("UTF-8");
        __CLR4_1_101y061y06lusqknq3.R.inc(90791);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        __CLR4_1_101y061y06lusqknq3.R.inc(90792);decoder.decode(byteBuffer);
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

    /**
     * @deprecated
     */
    public void test_6() throws Exception {__CLR4_1_101y061y06lusqknq3.R.globalSliceStart(getClass().getName(),90793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103n3oy81y21();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y061y06lusqknq3.R.rethrow($CLV_t2$);}finally{__CLR4_1_101y061y06lusqknq3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.util.UTF8DecoderTest.test_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90793,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103n3oy81y21() throws Exception{try{__CLR4_1_101y061y06lusqknq3.R.inc(90793);
        __CLR4_1_101y061y06lusqknq3.R.inc(90794);UTF8Decoder decoder = new UTF8Decoder();

        __CLR4_1_101y061y06lusqknq3.R.inc(90795);String str = "\u20ac";
        __CLR4_1_101y061y06lusqknq3.R.inc(90796);byte[] bytes =str.getBytes("UTF-8");
        __CLR4_1_101y061y06lusqknq3.R.inc(90797);ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
        __CLR4_1_101y061y06lusqknq3.R.inc(90798);decoder.decode(byteBuffer);
    }finally{__CLR4_1_101y061y06lusqknq3.R.flushNeeded();}}

}
