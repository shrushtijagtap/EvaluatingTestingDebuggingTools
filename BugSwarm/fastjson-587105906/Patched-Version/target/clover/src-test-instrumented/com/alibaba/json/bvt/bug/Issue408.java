/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.bug;

import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;
import org.junit.Assert;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class Issue408 extends TestCase {static class __CLR4_5_2171p171plusyjscg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,55921,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private InputStream inputStream;

    @Override
    public void setUp() throws Exception {try{__CLR4_5_2171p171plusyjscg.R.inc(55789);
        __CLR4_5_2171p171plusyjscg.R.inc(55790);String resource = "json/Issue408.json";
        __CLR4_5_2171p171plusyjscg.R.inc(55791);inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(resource);

        __CLR4_5_2171p171plusyjscg.R.inc(55792);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvt.bug.Issue408.");
    }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}


    @Override
    public void tearDown() throws Exception {try{__CLR4_5_2171p171plusyjscg.R.inc(55793);
        __CLR4_5_2171p171plusyjscg.R.inc(55794);inputStream.close();
    }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

    public void test_for_issue() throws Exception {__CLR4_5_2171p171plusyjscg.R.globalSliceStart(getClass().getName(),55795);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2e86tqb171v();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2171p171plusyjscg.R.rethrow($CLV_t2$);}finally{__CLR4_5_2171p171plusyjscg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Issue408.test_for_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),55795,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2e86tqb171v() throws Exception{try{__CLR4_5_2171p171plusyjscg.R.inc(55795);

        __CLR4_5_2171p171plusyjscg.R.inc(55796);JSONReader jsonReader = new JSONReader(new InputStreamReader(inputStream, Charset.forName("UTF-8")));
        __CLR4_5_2171p171plusyjscg.R.inc(55797);jsonReader.config(Feature.AllowArbitraryCommas, true);
        __CLR4_5_2171p171plusyjscg.R.inc(55798);jsonReader.config(Feature.IgnoreNotMatch, true);
        __CLR4_5_2171p171plusyjscg.R.inc(55799);jsonReader.config(Feature.SortFeidFastMatch, false);
        __CLR4_5_2171p171plusyjscg.R.inc(55800);jsonReader.config(Feature.DisableCircularReferenceDetect, true);
        __CLR4_5_2171p171plusyjscg.R.inc(55801);jsonReader.config(Feature.AutoCloseSource, true);

        __CLR4_5_2171p171plusyjscg.R.inc(55802);VOList deserialized = null;
        __CLR4_5_2171p171plusyjscg.R.inc(55803);try {
            __CLR4_5_2171p171plusyjscg.R.inc(55804);deserialized = (VOList)jsonReader.readObject();
        }finally {
            __CLR4_5_2171p171plusyjscg.R.inc(55805);jsonReader.close();
        }

        __CLR4_5_2171p171plusyjscg.R.inc(55806);for (int i = 0; (((i < 17)&&(__CLR4_5_2171p171plusyjscg.R.iget(55807)!=0|true))||(__CLR4_5_2171p171plusyjscg.R.iget(55808)==0&false)); i++) {{
            __CLR4_5_2171p171plusyjscg.R.inc(55809);Assert.assertEquals(deserialized.getVolist()[i].getLongid0(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55810);Assert.assertEquals(deserialized.getVolist()[i].getLongid1(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55811);Assert.assertEquals(deserialized.getVolist()[i].getLongid2(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55812);Assert.assertEquals(deserialized.getVolist()[i].getLongid3(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55813);Assert.assertEquals(deserialized.getVolist()[i].getLongid4(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55814);Assert.assertEquals(deserialized.getVolist()[i].getLongid5(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55815);Assert.assertEquals(deserialized.getVolist()[i].getLongid6(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55816);Assert.assertEquals(deserialized.getVolist()[i].getLongid7(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55817);Assert.assertEquals(deserialized.getVolist()[i].getLongid8(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55818);Assert.assertEquals(deserialized.getVolist()[i].getLongid9(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55819);Assert.assertEquals(deserialized.getVolist()[i].getLongid10(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55820);Assert.assertEquals(deserialized.getVolist()[i].getLongid11(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55821);Assert.assertEquals(deserialized.getVolist()[i].getLongid12(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55822);Assert.assertEquals(deserialized.getVolist()[i].getLongid13(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55823);Assert.assertEquals(deserialized.getVolist()[i].getLongid14(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55824);Assert.assertEquals(deserialized.getVolist()[i].getLongid15(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55825);Assert.assertEquals(deserialized.getVolist()[i].getLongid16(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55826);Assert.assertEquals(deserialized.getVolist()[i].getLongid17(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55827);Assert.assertEquals(deserialized.getVolist()[i].getLongid18(), Long.valueOf(1234567890123L));
            __CLR4_5_2171p171plusyjscg.R.inc(55828);Assert.assertEquals(deserialized.getVolist()[i].getLongid19(), Long.valueOf(1234567890123L));
        }
    }}finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

    public static class VOList {
        private VO[] volist;
        private Long longid0;
        private Long longid1;

        public VO[] getVolist() {try{__CLR4_5_2171p171plusyjscg.R.inc(55829);
            __CLR4_5_2171p171plusyjscg.R.inc(55830);return volist;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setVolist(VO[] volist) {try{__CLR4_5_2171p171plusyjscg.R.inc(55831);
            __CLR4_5_2171p171plusyjscg.R.inc(55832);this.volist = volist;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid1() {try{__CLR4_5_2171p171plusyjscg.R.inc(55833);
            __CLR4_5_2171p171plusyjscg.R.inc(55834);return longid1;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid1(Long longid1) {try{__CLR4_5_2171p171plusyjscg.R.inc(55835);
            __CLR4_5_2171p171plusyjscg.R.inc(55836);this.longid1 = longid1;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid0() {try{__CLR4_5_2171p171plusyjscg.R.inc(55837);
            __CLR4_5_2171p171plusyjscg.R.inc(55838);return longid0;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid0(Long longid0) {try{__CLR4_5_2171p171plusyjscg.R.inc(55839);
            __CLR4_5_2171p171plusyjscg.R.inc(55840);this.longid0 = longid0;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}
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

        public Long getLongid0() {try{__CLR4_5_2171p171plusyjscg.R.inc(55841);
            __CLR4_5_2171p171plusyjscg.R.inc(55842);return longid0;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid0(Long longid0) {try{__CLR4_5_2171p171plusyjscg.R.inc(55843);
            __CLR4_5_2171p171plusyjscg.R.inc(55844);this.longid0 = longid0;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid1() {try{__CLR4_5_2171p171plusyjscg.R.inc(55845);
            __CLR4_5_2171p171plusyjscg.R.inc(55846);return longid1;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid1(Long longid1) {try{__CLR4_5_2171p171plusyjscg.R.inc(55847);
            __CLR4_5_2171p171plusyjscg.R.inc(55848);this.longid1 = longid1;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid2() {try{__CLR4_5_2171p171plusyjscg.R.inc(55849);
            __CLR4_5_2171p171plusyjscg.R.inc(55850);return longid2;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid2(Long longid2) {try{__CLR4_5_2171p171plusyjscg.R.inc(55851);
            __CLR4_5_2171p171plusyjscg.R.inc(55852);this.longid2 = longid2;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid3() {try{__CLR4_5_2171p171plusyjscg.R.inc(55853);
            __CLR4_5_2171p171plusyjscg.R.inc(55854);return longid3;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid3(Long longid3) {try{__CLR4_5_2171p171plusyjscg.R.inc(55855);
            __CLR4_5_2171p171plusyjscg.R.inc(55856);this.longid3 = longid3;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid4() {try{__CLR4_5_2171p171plusyjscg.R.inc(55857);
            __CLR4_5_2171p171plusyjscg.R.inc(55858);return longid4;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid4(Long longid4) {try{__CLR4_5_2171p171plusyjscg.R.inc(55859);
            __CLR4_5_2171p171plusyjscg.R.inc(55860);this.longid4 = longid4;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid5() {try{__CLR4_5_2171p171plusyjscg.R.inc(55861);
            __CLR4_5_2171p171plusyjscg.R.inc(55862);return longid5;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid5(Long longid5) {try{__CLR4_5_2171p171plusyjscg.R.inc(55863);
            __CLR4_5_2171p171plusyjscg.R.inc(55864);this.longid5 = longid5;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid6() {try{__CLR4_5_2171p171plusyjscg.R.inc(55865);
            __CLR4_5_2171p171plusyjscg.R.inc(55866);return longid6;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid6(Long longid6) {try{__CLR4_5_2171p171plusyjscg.R.inc(55867);
            __CLR4_5_2171p171plusyjscg.R.inc(55868);this.longid6 = longid6;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid7() {try{__CLR4_5_2171p171plusyjscg.R.inc(55869);
            __CLR4_5_2171p171plusyjscg.R.inc(55870);return longid7;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid7(Long longid7) {try{__CLR4_5_2171p171plusyjscg.R.inc(55871);
            __CLR4_5_2171p171plusyjscg.R.inc(55872);this.longid7 = longid7;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid8() {try{__CLR4_5_2171p171plusyjscg.R.inc(55873);
            __CLR4_5_2171p171plusyjscg.R.inc(55874);return longid8;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid8(Long longid8) {try{__CLR4_5_2171p171plusyjscg.R.inc(55875);
            __CLR4_5_2171p171plusyjscg.R.inc(55876);this.longid8 = longid8;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid9() {try{__CLR4_5_2171p171plusyjscg.R.inc(55877);
            __CLR4_5_2171p171plusyjscg.R.inc(55878);return longid9;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid9(Long longid9) {try{__CLR4_5_2171p171plusyjscg.R.inc(55879);
            __CLR4_5_2171p171plusyjscg.R.inc(55880);this.longid9 = longid9;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid10() {try{__CLR4_5_2171p171plusyjscg.R.inc(55881);
            __CLR4_5_2171p171plusyjscg.R.inc(55882);return longid10;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid10(Long longid10) {try{__CLR4_5_2171p171plusyjscg.R.inc(55883);
            __CLR4_5_2171p171plusyjscg.R.inc(55884);this.longid10 = longid10;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid11() {try{__CLR4_5_2171p171plusyjscg.R.inc(55885);
            __CLR4_5_2171p171plusyjscg.R.inc(55886);return longid11;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid11(Long longid11) {try{__CLR4_5_2171p171plusyjscg.R.inc(55887);
            __CLR4_5_2171p171plusyjscg.R.inc(55888);this.longid11 = longid11;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid12() {try{__CLR4_5_2171p171plusyjscg.R.inc(55889);
            __CLR4_5_2171p171plusyjscg.R.inc(55890);return longid12;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid12(Long longid12) {try{__CLR4_5_2171p171plusyjscg.R.inc(55891);
            __CLR4_5_2171p171plusyjscg.R.inc(55892);this.longid12 = longid12;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid13() {try{__CLR4_5_2171p171plusyjscg.R.inc(55893);
            __CLR4_5_2171p171plusyjscg.R.inc(55894);return longid13;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid13(Long longid13) {try{__CLR4_5_2171p171plusyjscg.R.inc(55895);
            __CLR4_5_2171p171plusyjscg.R.inc(55896);this.longid13 = longid13;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid14() {try{__CLR4_5_2171p171plusyjscg.R.inc(55897);
            __CLR4_5_2171p171plusyjscg.R.inc(55898);return longid14;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid14(Long longid14) {try{__CLR4_5_2171p171plusyjscg.R.inc(55899);
            __CLR4_5_2171p171plusyjscg.R.inc(55900);this.longid14 = longid14;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid15() {try{__CLR4_5_2171p171plusyjscg.R.inc(55901);
            __CLR4_5_2171p171plusyjscg.R.inc(55902);return longid15;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid15(Long longid15) {try{__CLR4_5_2171p171plusyjscg.R.inc(55903);
            __CLR4_5_2171p171plusyjscg.R.inc(55904);this.longid15 = longid15;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid16() {try{__CLR4_5_2171p171plusyjscg.R.inc(55905);
            __CLR4_5_2171p171plusyjscg.R.inc(55906);return longid16;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid16(Long longid16) {try{__CLR4_5_2171p171plusyjscg.R.inc(55907);
            __CLR4_5_2171p171plusyjscg.R.inc(55908);this.longid16 = longid16;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid17() {try{__CLR4_5_2171p171plusyjscg.R.inc(55909);
            __CLR4_5_2171p171plusyjscg.R.inc(55910);return longid17;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid17(Long longid17) {try{__CLR4_5_2171p171plusyjscg.R.inc(55911);
            __CLR4_5_2171p171plusyjscg.R.inc(55912);this.longid17 = longid17;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid18() {try{__CLR4_5_2171p171plusyjscg.R.inc(55913);
            __CLR4_5_2171p171plusyjscg.R.inc(55914);return longid18;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid18(Long longid18) {try{__CLR4_5_2171p171plusyjscg.R.inc(55915);
            __CLR4_5_2171p171plusyjscg.R.inc(55916);this.longid18 = longid18;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public Long getLongid19() {try{__CLR4_5_2171p171plusyjscg.R.inc(55917);
            __CLR4_5_2171p171plusyjscg.R.inc(55918);return longid19;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}

        public void setLongid19(Long longid19) {try{__CLR4_5_2171p171plusyjscg.R.inc(55919);
            __CLR4_5_2171p171plusyjscg.R.inc(55920);this.longid19 = longid19;
        }finally{__CLR4_5_2171p171plusyjscg.R.flushNeeded();}}
    }
}
