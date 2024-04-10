/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ *//*
 * Copyright 1999-2017 Alibaba Group.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.json.bvt;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;

public class TypeUtilstTest extends TestCase {static class __CLR4_5_2zzjzzjlusyjqjt{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,46737,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2zzjzzjlusyjqjt.R.globalSliceStart(getClass().getName(),46639);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2zzj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2zzjzzjlusyjqjt.R.rethrow($CLV_t2$);}finally{__CLR4_5_2zzjzzjlusyjqjt.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.TypeUtilstTest.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),46639,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2zzj() throws Exception{try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46639);

        __CLR4_5_2zzjzzjlusyjqjt.R.inc(46640);List<Person> personList = new ArrayList<Person>();
        {
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46641);Person p = new Person();
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46642);p.setF1(true);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46643);p.setF2(true);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46644);p.setF3((byte) 3);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46645);p.setF4((byte) 4);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46646);p.setF5((short) 5);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46647);p.setF6((short) 6);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46648);p.setF7(7);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46649);p.setF8(8);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46650);p.setF9(9L);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46651);p.setF10(10L);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46652);p.setF11(new BigInteger("12345678901234567890123456789012345678901234567890"));
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46653);p.setF12(new BigDecimal("1234567890123456789012345678901234567890.1234567890"));
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46654);p.setF13("F13");
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46655);p.setF14(new Date());
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46656);p.setF15(15);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46657);p.setF16(16F);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46658);p.setF17(17);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46659);p.setF18(18D);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46660);personList.add(p);
        }
        {
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46661);Person person = new Person();
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46662);personList.add(person);
        }

        __CLR4_5_2zzjzzjlusyjqjt.R.inc(46663);String jsonString = JSON.toJSONString(personList);


        __CLR4_5_2zzjzzjlusyjqjt.R.inc(46664);JSON.parseArray(jsonString, Person.class);
        // CGLibExtJSONParser parser = new CGLibExtJSONParser(text);
    }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

    public static class Person {

        private boolean    f1;
        private Boolean    f2;
        private byte       f3;
        private Byte       f4;
        private short      f5;
        private Short      f6;
        private int        f7;
        private Integer    f8;
        private long       f9;
        private Long       f10;
        private BigInteger f11;
        private BigDecimal f12;
        private String     f13;
        private Date       f14;
        private float      f15;
        private Float      f16;
        private double     f17;
        private Double     f18;

        public boolean isF1() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46665);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46666);return f1;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF1(boolean f1) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46667);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46668);this.f1 = f1;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Boolean getF2() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46669);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46670);return f2;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF2(Boolean f2) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46671);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46672);this.f2 = f2;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public byte getF3() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46673);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46674);return f3;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF3(byte f3) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46675);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46676);this.f3 = f3;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Byte getF4() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46677);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46678);return f4;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF4(Byte f4) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46679);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46680);this.f4 = f4;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public short getF5() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46681);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46682);return f5;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF5(short f5) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46683);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46684);this.f5 = f5;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Short getF6() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46685);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46686);return f6;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF6(Short f6) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46687);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46688);this.f6 = f6;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public int getF7() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46689);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46690);return f7;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF7(int f7) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46691);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46692);this.f7 = f7;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Integer getF8() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46693);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46694);return f8;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF8(Integer f8) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46695);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46696);this.f8 = f8;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public long getF9() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46697);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46698);return f9;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF9(long f9) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46699);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46700);this.f9 = f9;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Long getF10() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46701);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46702);return f10;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF10(Long f10) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46703);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46704);this.f10 = f10;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public BigInteger getF11() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46705);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46706);return f11;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF11(BigInteger f11) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46707);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46708);this.f11 = f11;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public BigDecimal getF12() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46709);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46710);return f12;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF12(BigDecimal f12) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46711);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46712);this.f12 = f12;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public String getF13() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46713);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46714);return f13;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF13(String f13) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46715);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46716);this.f13 = f13;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Date getF14() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46717);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46718);return f14;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF14(Date f14) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46719);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46720);this.f14 = f14;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public float getF15() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46721);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46722);return f15;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF15(float f15) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46723);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46724);this.f15 = f15;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Float getF16() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46725);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46726);return f16;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF16(Float f16) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46727);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46728);this.f16 = f16;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public double getF17() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46729);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46730);return f17;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF17(double f17) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46731);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46732);this.f17 = f17;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public Double getF18() {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46733);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46734);return f18;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

        public void setF18(Double f18) {try{__CLR4_5_2zzjzzjlusyjqjt.R.inc(46735);
            __CLR4_5_2zzjzzjlusyjqjt.R.inc(46736);this.f18 = f18;
        }finally{__CLR4_5_2zzjzzjlusyjqjt.R.flushNeeded();}}

    }
}
