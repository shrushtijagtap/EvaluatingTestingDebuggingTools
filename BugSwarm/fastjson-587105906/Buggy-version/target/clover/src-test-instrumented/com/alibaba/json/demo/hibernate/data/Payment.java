/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@SuppressWarnings("serial")
@Entity
@Table(name = "Payment", catalog = "classicmodels")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@type")
public class Payment implements java.io.Serializable
{public static class __CLR4_1_1021j221j2luszwhfx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95316,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private PaymentId id;
    private Customer customer;
    private Date paymentDate;
    private double amount;

    public Payment() {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95294); }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

    public Payment(PaymentId id, Customer customer, Date paymentDate,
            double amount) {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95295);
        __CLR4_1_1021j221j2luszwhfx.R.inc(95296);this.id = id;
        __CLR4_1_1021j221j2luszwhfx.R.inc(95297);this.customer = customer;
        __CLR4_1_1021j221j2luszwhfx.R.inc(95298);this.paymentDate = paymentDate;
        __CLR4_1_1021j221j2luszwhfx.R.inc(95299);this.amount = amount;
    }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        @EmbeddedId
        @AttributeOverrides({
                        @AttributeOverride(name = "customerNumber", column = @Column(name = "customerNumber", nullable = false)),
                        @AttributeOverride(name = "checkNumber", column = @Column(name = "checkNumber", nullable = false, length = 50)) })
        public PaymentId getId() {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95300);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95301);return this.id;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        public void setId(PaymentId id) {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95302);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95303);this.id = id;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "customerNumber", nullable = false, insertable = false, updatable = false)
        @JsonIgnore
        public Customer getCustomer() {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95304);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95305);return this.customer;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        public void setCustomer(Customer customer) {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95306);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95307);this.customer = customer;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        @Column(name = "paymentDate", nullable = false, length = 19)
        public Date getPaymentDate() {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95308);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95309);return this.paymentDate;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        public void setPaymentDate(Date paymentDate) {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95310);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95311);this.paymentDate = paymentDate;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        @Column(name = "amount", nullable = false, precision = 22, scale = 0)
        public double getAmount() {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95312);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95313);return this.amount;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}

        public void setAmount(double amount) {try{__CLR4_1_1021j221j2luszwhfx.R.inc(95314);
                __CLR4_1_1021j221j2luszwhfx.R.inc(95315);this.amount = amount;
        }finally{__CLR4_1_1021j221j2luszwhfx.R.flushNeeded();}}
}
