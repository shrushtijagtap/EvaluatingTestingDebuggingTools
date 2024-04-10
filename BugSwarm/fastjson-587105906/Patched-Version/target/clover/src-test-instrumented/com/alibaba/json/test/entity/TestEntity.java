/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

public class TestEntity {static class __CLR4_5_2254d254dlusyjwyg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,100083,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

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
    public String getA1() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99949);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99950);return a1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    @JSONField(name = "A1")
    public void setA1(String a1) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99951);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99952);this.a1 = a1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    @JSONField(serialize = false)
    public String getA2() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99953);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99954);return a2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    @JSONField(deserialize = false)
    public void setA2(String a2) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99955);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99956);this.a2 = a2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    @JSONField(serialize = true)
    public String getA3() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99957);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99958);return a3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    @JSONField(deserialize = true)
    public void setA3(String a3) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99959);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99960);this.a3 = a3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public static TestEntity getInstance_0() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99961);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99962);return instance_0;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public boolean isF1() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99963);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99964);return f1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF1(boolean f1) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99965);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99966);this.f1 = f1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Boolean getF2() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99967);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99968);return f2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF2(Boolean f2) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99969);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99970);this.f2 = f2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public byte getF3() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99971);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99972);return f3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF3(byte f3) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99973);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99974);this.f3 = f3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Byte getF4() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99975);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99976);return f4;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF4(Byte f4) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99977);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99978);this.f4 = f4;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public short getF5() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99979);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99980);return f5;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF5(short f5) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99981);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99982);this.f5 = f5;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Short getF6() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99983);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99984);return f6;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF6(Short f6) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99985);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99986);this.f6 = f6;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public int getF7() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99987);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99988);return f7;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF7(int f7) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99989);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99990);this.f7 = f7;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Integer getF8() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99991);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99992);return f8;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF8(Integer f8) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99993);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99994);this.f8 = f8;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public long getF9() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99995);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99996);return f9;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF9(long f9) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99997);
        __CLR4_5_2254d254dlusyjwyg.R.inc(99998);this.f9 = f9;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Long getF10() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(99999);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100000);return f10;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF10(Long f10) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100001);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100002);this.f10 = f10;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public BigInteger getF11() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100003);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100004);return f11;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF11(BigInteger f11) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100005);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100006);this.f11 = f11;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public BigDecimal getF12() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100007);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100008);return f12;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF12(BigDecimal f12) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100009);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100010);this.f12 = f12;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public String getF13() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100011);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100012);return f13;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF13(String f13) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100013);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100014);this.f13 = f13;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Object getF14() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100015);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100016);return f14;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF14(Object f14) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100017);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100018);this.f14 = f14;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public List<Boolean> getL0() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100019);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100020);return l0;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setL0(List<Boolean> l0) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100021);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100022);this.l0 = l0;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public List<Byte> getL1() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100023);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100024);return l1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setL1(List<Byte> l1) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100025);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100026);this.l1 = l1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public List<Short> getL2() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100027);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100028);return l2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setL2(List<Short> l2) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100029);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100030);this.l2 = l2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public List<Integer> getL3() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100031);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100032);return l3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setL3(List<Integer> l3) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100033);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100034);this.l3 = l3;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public List<Long> getL4() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100035);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100036);return l4;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setL4(List<Long> l4) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100037);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100038);this.l4 = l4;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public float getF15() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100039);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100040);return f15;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF15(float f15) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100041);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100042);this.f15 = f15;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Float getF16() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100043);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100044);return f16;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF16(Float f16) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100045);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100046);this.f16 = f16;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public double getF17() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100047);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100048);return f17;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF17(double f17) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100049);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100050);this.f17 = f17;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Double getF18() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100051);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100052);return f18;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setF18(Double f18) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100053);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100054);this.f18 = f18;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Date getD1() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100055);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100056);return d1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setD1(Date d1) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100057);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100058);this.d1 = d1;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public Date getD2() {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100059);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100060);return d2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public void setD2(Date d2) {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100061);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100062);this.d2 = d2;
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}

    public static TestEntity instance_0;

    static {try{__CLR4_5_2254d254dlusyjwyg.R.inc(100063);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100064);instance_0 = new TestEntity();
        __CLR4_5_2254d254dlusyjwyg.R.inc(100065);instance_0.setF1(true);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100066);instance_0.setF2(Boolean.TRUE);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100067);instance_0.setF3((byte) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100068);instance_0.setF4((byte) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100069);instance_0.setF5((short) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100070);instance_0.setF6((short) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100071);instance_0.setF7((int) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100072);instance_0.setF8((int) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100073);instance_0.setF9((long) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100074);instance_0.setF10((long) 123);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100075);instance_0.setF11(new BigInteger("123"));
        __CLR4_5_2254d254dlusyjwyg.R.inc(100076);instance_0.setF12(new BigDecimal("123"));
        __CLR4_5_2254d254dlusyjwyg.R.inc(100077);instance_0.setF13("abc");
        __CLR4_5_2254d254dlusyjwyg.R.inc(100078);instance_0.setF14(null);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100079);instance_0.setF15(12.34F);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100080);instance_0.setF16(12.34F);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100081);instance_0.setF17(12.345D);
        __CLR4_5_2254d254dlusyjwyg.R.inc(100082);instance_0.setF18(12.345D);
    }finally{__CLR4_5_2254d254dlusyjwyg.R.flushNeeded();}}
}
