/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;
import org.junit.Assert;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Issue408 extends TestCase {static class __CLR4_1_1018081808luszw9vb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,57164,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private InputStream inputStream;

    @Override
    public void setUp() throws Exception {try{__CLR4_1_1018081808luszw9vb.R.inc(57032);
        __CLR4_1_1018081808luszw9vb.R.inc(57033);String resource = "json/Issue408.json";
        __CLR4_1_1018081808luszw9vb.R.inc(57034);inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);

        __CLR4_1_1018081808luszw9vb.R.inc(57035);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Issue408.");
    }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}


    @Override
    public void tearDown() throws Exception {try{__CLR4_1_1018081808luszw9vb.R.inc(57036);
        __CLR4_1_1018081808luszw9vb.R.inc(57037);inputStream.close();
    }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_1_1018081808luszw9vb.R.globalSliceStart(getClass().getName(),57038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb180e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018081808luszw9vb.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018081808luszw9vb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue408.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),57038,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb180e() throws Exception{try{__CLR4_1_1018081808luszw9vb.R.inc(57038);

        __CLR4_1_1018081808luszw9vb.R.inc(57039);JSONReader jsonReader = new JSONReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        __CLR4_1_1018081808luszw9vb.R.inc(57040);jsonReader.config(Feature.AllowArbitraryCommas, true);
        __CLR4_1_1018081808luszw9vb.R.inc(57041);jsonReader.config(Feature.IgnoreNotMatch, true);
        __CLR4_1_1018081808luszw9vb.R.inc(57042);jsonReader.config(Feature.SortFeidFastMatch, false);
        __CLR4_1_1018081808luszw9vb.R.inc(57043);jsonReader.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_1_1018081808luszw9vb.R.inc(57044);jsonReader.config(Feature.AutoCloseSource, true);

        __CLR4_1_1018081808luszw9vb.R.inc(57045);VOList deserialized = null;
        __CLR4_1_1018081808luszw9vb.R.inc(57046);try {
            __CLR4_1_1018081808luszw9vb.R.inc(57047);deserialized = (VOList)jsonReader.readObject();
        }finally {
            __CLR4_1_1018081808luszw9vb.R.inc(57048);jsonReader.close();
        }

        __CLR4_1_1018081808luszw9vb.R.inc(57049);for (int i = 0; (((i < 17)&&(__CLR4_1_1018081808luszw9vb.R.iget(57050)!=0|true))||(__CLR4_1_1018081808luszw9vb.R.iget(57051)==0&false)); i++) {{
            __CLR4_1_1018081808luszw9vb.R.inc(57052);Assert.assertEquals(deserialized.getVolist()[i].getLongid0(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57053);Assert.assertEquals(deserialized.getVolist()[i].getLongid1(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57054);Assert.assertEquals(deserialized.getVolist()[i].getLongid2(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57055);Assert.assertEquals(deserialized.getVolist()[i].getLongid3(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57056);Assert.assertEquals(deserialized.getVolist()[i].getLongid4(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57057);Assert.assertEquals(deserialized.getVolist()[i].getLongid5(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57058);Assert.assertEquals(deserialized.getVolist()[i].getLongid6(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57059);Assert.assertEquals(deserialized.getVolist()[i].getLongid7(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57060);Assert.assertEquals(deserialized.getVolist()[i].getLongid8(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57061);Assert.assertEquals(deserialized.getVolist()[i].getLongid9(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57062);Assert.assertEquals(deserialized.getVolist()[i].getLongid10(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57063);Assert.assertEquals(deserialized.getVolist()[i].getLongid11(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57064);Assert.assertEquals(deserialized.getVolist()[i].getLongid12(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57065);Assert.assertEquals(deserialized.getVolist()[i].getLongid13(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57066);Assert.assertEquals(deserialized.getVolist()[i].getLongid14(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57067);Assert.assertEquals(deserialized.getVolist()[i].getLongid15(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57068);Assert.assertEquals(deserialized.getVolist()[i].getLongid16(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57069);Assert.assertEquals(deserialized.getVolist()[i].getLongid17(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57070);Assert.assertEquals(deserialized.getVolist()[i].getLongid18(), Long.valueOf(1234567890123L));
            __CLR4_1_1018081808luszw9vb.R.inc(57071);Assert.assertEquals(deserialized.getVolist()[i].getLongid19(), Long.valueOf(1234567890123L));
        }
    }}finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

    public static class VOList {
        private VO[] volist;
        private Long longid0;
        private Long longid1;

        public VO[] getVolist() {try{__CLR4_1_1018081808luszw9vb.R.inc(57072);
            __CLR4_1_1018081808luszw9vb.R.inc(57073);return volist;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setVolist(VO[] volist) {try{__CLR4_1_1018081808luszw9vb.R.inc(57074);
            __CLR4_1_1018081808luszw9vb.R.inc(57075);this.volist = volist;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid1() {try{__CLR4_1_1018081808luszw9vb.R.inc(57076);
            __CLR4_1_1018081808luszw9vb.R.inc(57077);return longid1;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid1(Long longid1) {try{__CLR4_1_1018081808luszw9vb.R.inc(57078);
            __CLR4_1_1018081808luszw9vb.R.inc(57079);this.longid1 = longid1;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid0() {try{__CLR4_1_1018081808luszw9vb.R.inc(57080);
            __CLR4_1_1018081808luszw9vb.R.inc(57081);return longid0;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid0(Long longid0) {try{__CLR4_1_1018081808luszw9vb.R.inc(57082);
            __CLR4_1_1018081808luszw9vb.R.inc(57083);this.longid0 = longid0;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}
    }

    public static class VO {
        private Long longid0;
        private Long longid1;
        private Long longid2;
        private Long longid3;
        private Long longid4;
        private Long longid5;
        private Long longid6;
        private Long longid7;
        private Long longid8;
        private Long longid9;
        private Long longid10;
        private Long longid11;
        private Long longid12;
        private Long longid13;
        private Long longid14;
        private Long longid15;
        private Long longid16;
        private Long longid17;
        private Long longid18;
        private Long longid19;

        public Long getLongid0() {try{__CLR4_1_1018081808luszw9vb.R.inc(57084);
            __CLR4_1_1018081808luszw9vb.R.inc(57085);return longid0;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid0(Long longid0) {try{__CLR4_1_1018081808luszw9vb.R.inc(57086);
            __CLR4_1_1018081808luszw9vb.R.inc(57087);this.longid0 = longid0;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid1() {try{__CLR4_1_1018081808luszw9vb.R.inc(57088);
            __CLR4_1_1018081808luszw9vb.R.inc(57089);return longid1;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid1(Long longid1) {try{__CLR4_1_1018081808luszw9vb.R.inc(57090);
            __CLR4_1_1018081808luszw9vb.R.inc(57091);this.longid1 = longid1;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid2() {try{__CLR4_1_1018081808luszw9vb.R.inc(57092);
            __CLR4_1_1018081808luszw9vb.R.inc(57093);return longid2;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid2(Long longid2) {try{__CLR4_1_1018081808luszw9vb.R.inc(57094);
            __CLR4_1_1018081808luszw9vb.R.inc(57095);this.longid2 = longid2;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid3() {try{__CLR4_1_1018081808luszw9vb.R.inc(57096);
            __CLR4_1_1018081808luszw9vb.R.inc(57097);return longid3;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid3(Long longid3) {try{__CLR4_1_1018081808luszw9vb.R.inc(57098);
            __CLR4_1_1018081808luszw9vb.R.inc(57099);this.longid3 = longid3;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid4() {try{__CLR4_1_1018081808luszw9vb.R.inc(57100);
            __CLR4_1_1018081808luszw9vb.R.inc(57101);return longid4;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid4(Long longid4) {try{__CLR4_1_1018081808luszw9vb.R.inc(57102);
            __CLR4_1_1018081808luszw9vb.R.inc(57103);this.longid4 = longid4;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid5() {try{__CLR4_1_1018081808luszw9vb.R.inc(57104);
            __CLR4_1_1018081808luszw9vb.R.inc(57105);return longid5;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid5(Long longid5) {try{__CLR4_1_1018081808luszw9vb.R.inc(57106);
            __CLR4_1_1018081808luszw9vb.R.inc(57107);this.longid5 = longid5;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid6() {try{__CLR4_1_1018081808luszw9vb.R.inc(57108);
            __CLR4_1_1018081808luszw9vb.R.inc(57109);return longid6;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid6(Long longid6) {try{__CLR4_1_1018081808luszw9vb.R.inc(57110);
            __CLR4_1_1018081808luszw9vb.R.inc(57111);this.longid6 = longid6;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid7() {try{__CLR4_1_1018081808luszw9vb.R.inc(57112);
            __CLR4_1_1018081808luszw9vb.R.inc(57113);return longid7;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid7(Long longid7) {try{__CLR4_1_1018081808luszw9vb.R.inc(57114);
            __CLR4_1_1018081808luszw9vb.R.inc(57115);this.longid7 = longid7;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid8() {try{__CLR4_1_1018081808luszw9vb.R.inc(57116);
            __CLR4_1_1018081808luszw9vb.R.inc(57117);return longid8;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid8(Long longid8) {try{__CLR4_1_1018081808luszw9vb.R.inc(57118);
            __CLR4_1_1018081808luszw9vb.R.inc(57119);this.longid8 = longid8;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid9() {try{__CLR4_1_1018081808luszw9vb.R.inc(57120);
            __CLR4_1_1018081808luszw9vb.R.inc(57121);return longid9;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid9(Long longid9) {try{__CLR4_1_1018081808luszw9vb.R.inc(57122);
            __CLR4_1_1018081808luszw9vb.R.inc(57123);this.longid9 = longid9;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid10() {try{__CLR4_1_1018081808luszw9vb.R.inc(57124);
            __CLR4_1_1018081808luszw9vb.R.inc(57125);return longid10;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid10(Long longid10) {try{__CLR4_1_1018081808luszw9vb.R.inc(57126);
            __CLR4_1_1018081808luszw9vb.R.inc(57127);this.longid10 = longid10;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid11() {try{__CLR4_1_1018081808luszw9vb.R.inc(57128);
            __CLR4_1_1018081808luszw9vb.R.inc(57129);return longid11;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid11(Long longid11) {try{__CLR4_1_1018081808luszw9vb.R.inc(57130);
            __CLR4_1_1018081808luszw9vb.R.inc(57131);this.longid11 = longid11;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid12() {try{__CLR4_1_1018081808luszw9vb.R.inc(57132);
            __CLR4_1_1018081808luszw9vb.R.inc(57133);return longid12;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid12(Long longid12) {try{__CLR4_1_1018081808luszw9vb.R.inc(57134);
            __CLR4_1_1018081808luszw9vb.R.inc(57135);this.longid12 = longid12;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid13() {try{__CLR4_1_1018081808luszw9vb.R.inc(57136);
            __CLR4_1_1018081808luszw9vb.R.inc(57137);return longid13;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid13(Long longid13) {try{__CLR4_1_1018081808luszw9vb.R.inc(57138);
            __CLR4_1_1018081808luszw9vb.R.inc(57139);this.longid13 = longid13;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid14() {try{__CLR4_1_1018081808luszw9vb.R.inc(57140);
            __CLR4_1_1018081808luszw9vb.R.inc(57141);return longid14;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid14(Long longid14) {try{__CLR4_1_1018081808luszw9vb.R.inc(57142);
            __CLR4_1_1018081808luszw9vb.R.inc(57143);this.longid14 = longid14;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid15() {try{__CLR4_1_1018081808luszw9vb.R.inc(57144);
            __CLR4_1_1018081808luszw9vb.R.inc(57145);return longid15;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid15(Long longid15) {try{__CLR4_1_1018081808luszw9vb.R.inc(57146);
            __CLR4_1_1018081808luszw9vb.R.inc(57147);this.longid15 = longid15;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid16() {try{__CLR4_1_1018081808luszw9vb.R.inc(57148);
            __CLR4_1_1018081808luszw9vb.R.inc(57149);return longid16;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid16(Long longid16) {try{__CLR4_1_1018081808luszw9vb.R.inc(57150);
            __CLR4_1_1018081808luszw9vb.R.inc(57151);this.longid16 = longid16;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid17() {try{__CLR4_1_1018081808luszw9vb.R.inc(57152);
            __CLR4_1_1018081808luszw9vb.R.inc(57153);return longid17;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid17(Long longid17) {try{__CLR4_1_1018081808luszw9vb.R.inc(57154);
            __CLR4_1_1018081808luszw9vb.R.inc(57155);this.longid17 = longid17;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid18() {try{__CLR4_1_1018081808luszw9vb.R.inc(57156);
            __CLR4_1_1018081808luszw9vb.R.inc(57157);return longid18;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid18(Long longid18) {try{__CLR4_1_1018081808luszw9vb.R.inc(57158);
            __CLR4_1_1018081808luszw9vb.R.inc(57159);this.longid18 = longid18;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public Long getLongid19() {try{__CLR4_1_1018081808luszw9vb.R.inc(57160);
            __CLR4_1_1018081808luszw9vb.R.inc(57161);return longid19;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}

        public void setLongid19(Long longid19) {try{__CLR4_1_1018081808luszw9vb.R.inc(57162);
            __CLR4_1_1018081808luszw9vb.R.inc(57163);this.longid19 = longid19;
        }finally{__CLR4_1_1018081808luszw9vb.R.flushNeeded();}}
    }
}
