/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

/**
 * Created by wenshao on 22/07/2017.
 */
public class Issue1335 extends TestCase {static class __CLR4_5_21a351a35lusyjss3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,59740,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_5_21a351a35lusyjss3.R.globalSliceStart(getClass().getName(),59729);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb1a35();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21a351a35lusyjss3.R.rethrow($CLV_t2$);}finally{__CLR4_5_21a351a35lusyjss3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1335.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),59729,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb1a35() throws Exception{try{__CLR4_5_21a351a35lusyjss3.R.inc(59729);
        __CLR4_5_21a351a35lusyjss3.R.inc(59730);String json = "{\n" +
                "\"id\": \"21496a63f5\",\n" +
                "\"title\": \"\",\n" +
                "\"url\": \"http://hl-img.peco.uodoo.com/hubble-test/app/sm/e9b884c1dcd671f128bac020e070e273.jpg;,,JPG;3,208x\",\n" +
                "\"type\": \"JPG\",\n" +
                "\"optimal_width\": 400,\n" +
                "\"optimal_height\": 267,\n" +
                "\"original_save_url\": \"http://hl-img.peco.uodoo.com/hubble-test/app/sm/e9b884c1dcd671f128bac020e070e273.jpg\",\n" +
                "\"phash\": \"62717D190987A7AE\"\n" +
                "                            }";
        __CLR4_5_21a351a35lusyjss3.R.inc(59731);Image image = JSON.parseObject(json, Image.class);
        __CLR4_5_21a351a35lusyjss3.R.inc(59732);assertEquals("21496a63f5", image.id);
        __CLR4_5_21a351a35lusyjss3.R.inc(59733);assertEquals("http://hl-img.peco.uodoo.com/hubble-test/app/sm/e9b884c1dcd671f128bac020e070e273.jpg;,,JPG;3,208x", image.url);
        __CLR4_5_21a351a35lusyjss3.R.inc(59734);assertEquals("", image.title);
        __CLR4_5_21a351a35lusyjss3.R.inc(59735);assertEquals("JPG", image.type);
        __CLR4_5_21a351a35lusyjss3.R.inc(59736);assertEquals(400, image.optimalWidth);
        __CLR4_5_21a351a35lusyjss3.R.inc(59737);assertEquals(267, image.optimalHeight);
        __CLR4_5_21a351a35lusyjss3.R.inc(59738);assertEquals("http://hl-img.peco.uodoo.com/hubble-test/app/sm/e9b884c1dcd671f128bac020e070e273.jpg", image.original_save_url);
        __CLR4_5_21a351a35lusyjss3.R.inc(59739);assertEquals("62717D190987A7AE", image.phash);
    }finally{__CLR4_5_21a351a35lusyjss3.R.flushNeeded();}}

    public static class Image {
        public String id;
        public String title;
        public String url;
        public String type;
        public int optimalWidth;
        public int optimalHeight;
        public String original_save_url;
        public String phash;
    }
}
