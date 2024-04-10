/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.kotlin;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Zoujing extends TestCase {static class __CLR4_5_21ep51ep5lusyjtgt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,65730,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_user() throws Exception {__CLR4_5_21ep51ep5lusyjtgt.R.globalSliceStart(getClass().getName(),65705);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v7yl5r1ep5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ep51ep5lusyjtgt.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ep51ep5lusyjtgt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.kotlin.Zoujing.test_user",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65705,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v7yl5r1ep5() throws Exception{try{__CLR4_5_21ep51ep5lusyjtgt.R.inc(65705);
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65706);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65707);Class clazz = classLoader.loadClass("com.alidme.xrecharge.platform.common.data.NoticeData");

        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65708);String json = "{\"benefitNoticeState\":1}";
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65709);Object obj = JSON.parseObject(json, clazz);
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65710);String result = JSON.toJSONString(obj);
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65711);System.out.println(result);
        __CLR4_5_21ep51ep5lusyjtgt.R.inc(65712);assertEquals("{\"benefitNoticeState\":1,\"outId\":\"\"}", result);
    }finally{__CLR4_5_21ep51ep5lusyjtgt.R.flushNeeded();}}

    private static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException {
            super(Thread.currentThread().getContextClassLoader());__CLR4_5_21ep51ep5lusyjtgt.R.inc(65714);try{__CLR4_5_21ep51ep5lusyjtgt.R.inc(65713);

            {
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65715);byte[] bytes;
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65716);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/zuojing/NoticeData.clazz");
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65717);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65718);is.close();

                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65719);super.defineClass("com.alidme.xrecharge.platform.common.data.NoticeData", bytes, 0, bytes.length);
            }

            {
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65720);byte[] bytes;
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65721);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/zuojing/NoticeDataKt.clazz");
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65722);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65723);is.close();

                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65724);super.defineClass("com.alidme.xrecharge.platform.common.data.NoticeDataKt", bytes, 0, bytes.length);
            }

            {
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65725);byte[] bytes;
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65726);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/zuojing/NoticeData_Companion.clazz");
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65727);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65728);is.close();

                __CLR4_5_21ep51ep5lusyjtgt.R.inc(65729);super.defineClass("com.alidme.xrecharge.platform.common.data.NoticeData$Companion", bytes, 0, bytes.length);
            }
        }finally{__CLR4_5_21ep51ep5lusyjtgt.R.flushNeeded();}}
    }
}
