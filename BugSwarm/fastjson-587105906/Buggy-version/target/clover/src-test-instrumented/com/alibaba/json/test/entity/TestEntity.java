/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class TestEntity {static class __CLR4_1_10262w262wluszwiiu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,101326,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private boolean       f1;
    private Boolean       f2;
    private byte          f3;
    private Byte          f4;
    private short         f5;
    private Short         f6;
    private int           f7;
    private Integer       f8;
    private long          f9;
    private Long          f10;
    private BigInteger    f11;
    private BigDecimal    f12;
    private String        f13;
    private Object        f14;
    private float         f15;
    private Float         f16;
    private double        f17;
    private Double        f18;
    private Date          d1;
    private Date          d2;

    private String        a1;
    private String        a2;
    private String        a3;

    private List<Boolean> l0 = new ArrayList<Boolean>();
    private List<Byte>    l1 = new ArrayList<Byte>();
    private List<Short>   l2 = new ArrayList<Short>();
    private List<Integer> l3 = new ArrayList<Integer>();
    private List<Long>    l4 = new ArrayList<Long>();

    @JSONField(name = "A1")
    public String getA1() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101192);
        __CLR4_1_10262w262wluszwiiu.R.inc(101193);return a1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    @JSONField(name = "A1")
    public void setA1(String a1) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101194);
        __CLR4_1_10262w262wluszwiiu.R.inc(101195);this.a1 = a1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    @JSONField(serialize = false)
    public String getA2() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101196);
        __CLR4_1_10262w262wluszwiiu.R.inc(101197);return a2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    @JSONField(deserialize = false)
    public void setA2(String a2) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101198);
        __CLR4_1_10262w262wluszwiiu.R.inc(101199);this.a2 = a2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    @JSONField(serialize = true)
    public String getA3() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101200);
        __CLR4_1_10262w262wluszwiiu.R.inc(101201);return a3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    @JSONField(deserialize = true)
    public void setA3(String a3) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101202);
        __CLR4_1_10262w262wluszwiiu.R.inc(101203);this.a3 = a3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public static TestEntity getInstance_0() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101204);
        __CLR4_1_10262w262wluszwiiu.R.inc(101205);return instance_0;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public boolean isF1() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101206);
        __CLR4_1_10262w262wluszwiiu.R.inc(101207);return f1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF1(boolean f1) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101208);
        __CLR4_1_10262w262wluszwiiu.R.inc(101209);this.f1 = f1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Boolean getF2() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101210);
        __CLR4_1_10262w262wluszwiiu.R.inc(101211);return f2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF2(Boolean f2) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101212);
        __CLR4_1_10262w262wluszwiiu.R.inc(101213);this.f2 = f2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public byte getF3() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101214);
        __CLR4_1_10262w262wluszwiiu.R.inc(101215);return f3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF3(byte f3) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101216);
        __CLR4_1_10262w262wluszwiiu.R.inc(101217);this.f3 = f3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Byte getF4() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101218);
        __CLR4_1_10262w262wluszwiiu.R.inc(101219);return f4;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF4(Byte f4) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101220);
        __CLR4_1_10262w262wluszwiiu.R.inc(101221);this.f4 = f4;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public short getF5() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101222);
        __CLR4_1_10262w262wluszwiiu.R.inc(101223);return f5;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF5(short f5) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101224);
        __CLR4_1_10262w262wluszwiiu.R.inc(101225);this.f5 = f5;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Short getF6() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101226);
        __CLR4_1_10262w262wluszwiiu.R.inc(101227);return f6;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF6(Short f6) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101228);
        __CLR4_1_10262w262wluszwiiu.R.inc(101229);this.f6 = f6;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public int getF7() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101230);
        __CLR4_1_10262w262wluszwiiu.R.inc(101231);return f7;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF7(int f7) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101232);
        __CLR4_1_10262w262wluszwiiu.R.inc(101233);this.f7 = f7;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Integer getF8() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101234);
        __CLR4_1_10262w262wluszwiiu.R.inc(101235);return f8;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF8(Integer f8) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101236);
        __CLR4_1_10262w262wluszwiiu.R.inc(101237);this.f8 = f8;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public long getF9() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101238);
        __CLR4_1_10262w262wluszwiiu.R.inc(101239);return f9;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF9(long f9) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101240);
        __CLR4_1_10262w262wluszwiiu.R.inc(101241);this.f9 = f9;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Long getF10() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101242);
        __CLR4_1_10262w262wluszwiiu.R.inc(101243);return f10;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF10(Long f10) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101244);
        __CLR4_1_10262w262wluszwiiu.R.inc(101245);this.f10 = f10;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public BigInteger getF11() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101246);
        __CLR4_1_10262w262wluszwiiu.R.inc(101247);return f11;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF11(BigInteger f11) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101248);
        __CLR4_1_10262w262wluszwiiu.R.inc(101249);this.f11 = f11;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public BigDecimal getF12() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101250);
        __CLR4_1_10262w262wluszwiiu.R.inc(101251);return f12;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF12(BigDecimal f12) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101252);
        __CLR4_1_10262w262wluszwiiu.R.inc(101253);this.f12 = f12;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public String getF13() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101254);
        __CLR4_1_10262w262wluszwiiu.R.inc(101255);return f13;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF13(String f13) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101256);
        __CLR4_1_10262w262wluszwiiu.R.inc(101257);this.f13 = f13;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Object getF14() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101258);
        __CLR4_1_10262w262wluszwiiu.R.inc(101259);return f14;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF14(Object f14) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101260);
        __CLR4_1_10262w262wluszwiiu.R.inc(101261);this.f14 = f14;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public List<Boolean> getL0() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101262);
        __CLR4_1_10262w262wluszwiiu.R.inc(101263);return l0;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setL0(List<Boolean> l0) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101264);
        __CLR4_1_10262w262wluszwiiu.R.inc(101265);this.l0 = l0;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public List<Byte> getL1() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101266);
        __CLR4_1_10262w262wluszwiiu.R.inc(101267);return l1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setL1(List<Byte> l1) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101268);
        __CLR4_1_10262w262wluszwiiu.R.inc(101269);this.l1 = l1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public List<Short> getL2() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101270);
        __CLR4_1_10262w262wluszwiiu.R.inc(101271);return l2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setL2(List<Short> l2) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101272);
        __CLR4_1_10262w262wluszwiiu.R.inc(101273);this.l2 = l2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public List<Integer> getL3() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101274);
        __CLR4_1_10262w262wluszwiiu.R.inc(101275);return l3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setL3(List<Integer> l3) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101276);
        __CLR4_1_10262w262wluszwiiu.R.inc(101277);this.l3 = l3;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public List<Long> getL4() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101278);
        __CLR4_1_10262w262wluszwiiu.R.inc(101279);return l4;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setL4(List<Long> l4) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101280);
        __CLR4_1_10262w262wluszwiiu.R.inc(101281);this.l4 = l4;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public float getF15() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101282);
        __CLR4_1_10262w262wluszwiiu.R.inc(101283);return f15;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF15(float f15) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101284);
        __CLR4_1_10262w262wluszwiiu.R.inc(101285);this.f15 = f15;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Float getF16() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101286);
        __CLR4_1_10262w262wluszwiiu.R.inc(101287);return f16;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF16(Float f16) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101288);
        __CLR4_1_10262w262wluszwiiu.R.inc(101289);this.f16 = f16;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public double getF17() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101290);
        __CLR4_1_10262w262wluszwiiu.R.inc(101291);return f17;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF17(double f17) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101292);
        __CLR4_1_10262w262wluszwiiu.R.inc(101293);this.f17 = f17;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Double getF18() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101294);
        __CLR4_1_10262w262wluszwiiu.R.inc(101295);return f18;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setF18(Double f18) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101296);
        __CLR4_1_10262w262wluszwiiu.R.inc(101297);this.f18 = f18;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Date getD1() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101298);
        __CLR4_1_10262w262wluszwiiu.R.inc(101299);return d1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setD1(Date d1) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101300);
        __CLR4_1_10262w262wluszwiiu.R.inc(101301);this.d1 = d1;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public Date getD2() {try{__CLR4_1_10262w262wluszwiiu.R.inc(101302);
        __CLR4_1_10262w262wluszwiiu.R.inc(101303);return d2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public void setD2(Date d2) {try{__CLR4_1_10262w262wluszwiiu.R.inc(101304);
        __CLR4_1_10262w262wluszwiiu.R.inc(101305);this.d2 = d2;
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}

    public static TestEntity instance_0;

    static {try{__CLR4_1_10262w262wluszwiiu.R.inc(101306);
        __CLR4_1_10262w262wluszwiiu.R.inc(101307);instance_0 = new TestEntity();
        __CLR4_1_10262w262wluszwiiu.R.inc(101308);instance_0.setF1(true);
        __CLR4_1_10262w262wluszwiiu.R.inc(101309);instance_0.setF2(Boolean.TRUE);
        __CLR4_1_10262w262wluszwiiu.R.inc(101310);instance_0.setF3((byte) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101311);instance_0.setF4((byte) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101312);instance_0.setF5((short) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101313);instance_0.setF6((short) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101314);instance_0.setF7((int) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101315);instance_0.setF8((int) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101316);instance_0.setF9((long) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101317);instance_0.setF10((long) 123);
        __CLR4_1_10262w262wluszwiiu.R.inc(101318);instance_0.setF11(new BigInteger("123"));
        __CLR4_1_10262w262wluszwiiu.R.inc(101319);instance_0.setF12(new BigDecimal("123"));
        __CLR4_1_10262w262wluszwiiu.R.inc(101320);instance_0.setF13("abc");
        __CLR4_1_10262w262wluszwiiu.R.inc(101321);instance_0.setF14(null);
        __CLR4_1_10262w262wluszwiiu.R.inc(101322);instance_0.setF15(12.34F);
        __CLR4_1_10262w262wluszwiiu.R.inc(101323);instance_0.setF16(12.34F);
        __CLR4_1_10262w262wluszwiiu.R.inc(101324);instance_0.setF17(12.345D);
        __CLR4_1_10262w262wluszwiiu.R.inc(101325);instance_0.setF18(12.345D);
    }finally{__CLR4_1_10262w262wluszwiiu.R.flushNeeded();}}
}
