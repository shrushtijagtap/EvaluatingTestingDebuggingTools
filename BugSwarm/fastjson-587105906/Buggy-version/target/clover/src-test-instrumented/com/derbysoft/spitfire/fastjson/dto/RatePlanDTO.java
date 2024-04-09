/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.derbysoft.spitfire.fastjson.dto;

import java.util.List;

public class RatePlanDTO extends AbstractDTO{public static class __CLR4_1_10289o289olusqkxds{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,104064,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String code;
    private String name;
    private FreeMealDTO freeMeal;
    private PaymentType paymentType;
    private List<ChargeItemDTO> taxes;
    private List<ChargeItemDTO> serviceCharges;
    private boolean needGuarantee;
    private CancelPolicyDTO cancelPolicy;
    private List<AvailGuaranteeDTO> availGuarantees;

    public String getCode() {try{__CLR4_1_10289o289olusqkxds.R.inc(104028);
        __CLR4_1_10289o289olusqkxds.R.inc(104029);return code;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setCode(String code) {try{__CLR4_1_10289o289olusqkxds.R.inc(104030);
        __CLR4_1_10289o289olusqkxds.R.inc(104031);this.code = code;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public String getName() {try{__CLR4_1_10289o289olusqkxds.R.inc(104032);
        __CLR4_1_10289o289olusqkxds.R.inc(104033);return name;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setName(String name) {try{__CLR4_1_10289o289olusqkxds.R.inc(104034);
        __CLR4_1_10289o289olusqkxds.R.inc(104035);this.name = name;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public FreeMealDTO getFreeMeal() {try{__CLR4_1_10289o289olusqkxds.R.inc(104036);
        __CLR4_1_10289o289olusqkxds.R.inc(104037);return freeMeal;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setFreeMeal(FreeMealDTO freeMeal) {try{__CLR4_1_10289o289olusqkxds.R.inc(104038);
        __CLR4_1_10289o289olusqkxds.R.inc(104039);this.freeMeal = freeMeal;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public PaymentType getPaymentType() {try{__CLR4_1_10289o289olusqkxds.R.inc(104040);
        __CLR4_1_10289o289olusqkxds.R.inc(104041);return paymentType;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setPaymentType(PaymentType paymentType) {try{__CLR4_1_10289o289olusqkxds.R.inc(104042);
        __CLR4_1_10289o289olusqkxds.R.inc(104043);this.paymentType = paymentType;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public List<ChargeItemDTO> getTaxes() {try{__CLR4_1_10289o289olusqkxds.R.inc(104044);
        __CLR4_1_10289o289olusqkxds.R.inc(104045);return taxes;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setTaxes(List<ChargeItemDTO> taxes) {try{__CLR4_1_10289o289olusqkxds.R.inc(104046);
        __CLR4_1_10289o289olusqkxds.R.inc(104047);this.taxes = taxes;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public List<ChargeItemDTO> getServiceCharges() {try{__CLR4_1_10289o289olusqkxds.R.inc(104048);
        __CLR4_1_10289o289olusqkxds.R.inc(104049);return serviceCharges;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setServiceCharges(List<ChargeItemDTO> serviceCharges) {try{__CLR4_1_10289o289olusqkxds.R.inc(104050);
        __CLR4_1_10289o289olusqkxds.R.inc(104051);this.serviceCharges = serviceCharges;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public boolean isNeedGuarantee() {try{__CLR4_1_10289o289olusqkxds.R.inc(104052);
        __CLR4_1_10289o289olusqkxds.R.inc(104053);return needGuarantee;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setNeedGuarantee(boolean needGuarantee) {try{__CLR4_1_10289o289olusqkxds.R.inc(104054);
        __CLR4_1_10289o289olusqkxds.R.inc(104055);this.needGuarantee = needGuarantee;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public CancelPolicyDTO getCancelPolicy() {try{__CLR4_1_10289o289olusqkxds.R.inc(104056);
        __CLR4_1_10289o289olusqkxds.R.inc(104057);return cancelPolicy;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setCancelPolicy(CancelPolicyDTO cancelPolicy) {try{__CLR4_1_10289o289olusqkxds.R.inc(104058);
        __CLR4_1_10289o289olusqkxds.R.inc(104059);this.cancelPolicy = cancelPolicy;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public List<AvailGuaranteeDTO> getAvailGuarantees() {try{__CLR4_1_10289o289olusqkxds.R.inc(104060);
        __CLR4_1_10289o289olusqkxds.R.inc(104061);return availGuarantees;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}

    public void setAvailGuarantees(List<AvailGuaranteeDTO> availGuarantees) {try{__CLR4_1_10289o289olusqkxds.R.inc(104062);
        __CLR4_1_10289o289olusqkxds.R.inc(104063);this.availGuarantees = availGuarantees;
    }finally{__CLR4_1_10289o289olusqkxds.R.flushNeeded();}}
}
