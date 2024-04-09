/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

import com.fasterxml.jackson.annotation.*;

@Entity
@Table(name="Customer", catalog="classicmodels")
public class Customer implements java.io.Serializable
{public static class __CLR4_1_1020c720c7lusqkq8d{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,93835,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private static final long serialVersionUID = 1L;

    private Integer customerNumber;
    private Employee employee;
    private String customerName;
    private String contactLastName;
    private String contactFirstName;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String postalCode;
    private String country;
    private Double creditLimit;
    private Set<Payment> payments = new HashSet<Payment>();
    private Set<Order> orders = new HashSet<Order>();

    public Customer() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93751); }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public Customer(String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String city, String country) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93752);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93753);this.customerName = customerName;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93754);this.contactLastName = contactLastName;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93755);this.contactFirstName = contactFirstName;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93756);this.phone = phone;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93757);this.addressLine1 = addressLine1;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93758);this.city = city;
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93759);this.country = country;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public Customer(Employee employee, String customerName, String contactLastName, String contactFirstName, String phone, String addressLine1, String addressLine2, String city, String state, String postalCode, String country, Double creditLimit, Set<Payment> payments, Set<Order> orders) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93760);
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93761);this.employee = employee;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93762);this.customerName = customerName;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93763);this.contactLastName = contactLastName;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93764);this.contactFirstName = contactFirstName;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93765);this.phone = phone;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93766);this.addressLine1 = addressLine1;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93767);this.addressLine2 = addressLine2;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93768);this.city = city;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93769);this.state = state;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93770);this.postalCode = postalCode;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93771);this.country = country;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93772);this.creditLimit = creditLimit;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93773);this.payments = payments;
       __CLR4_1_1020c720c7lusqkq8d.R.inc(93774);this.orders = orders;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Id @GeneratedValue(strategy=IDENTITY)
    @Column(name="customerNumber", unique=true, nullable=false)
    public Integer getCustomerNumber() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93775);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93776);return this.customerNumber;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

     public void setCustomerNumber(Integer customerNumber) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93777);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93778);this.customerNumber = customerNumber;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="salesRepEmployeeNumber")
    @JsonBackReference
    public Employee getEmployee() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93779);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93780);return this.employee;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setEmployee(Employee employee) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93781);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93782);this.employee = employee;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="customerName", nullable=false, length=50)
    public String getCustomerName() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93783);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93784);return this.customerName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setCustomerName(String customerName) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93785);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93786);this.customerName = customerName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="contactLastName", nullable=false, length=50)
    public String getContactLastName() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93787);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93788);return this.contactLastName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setContactLastName(String contactLastName) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93789);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93790);this.contactLastName = contactLastName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="contactFirstName", nullable=false, length=50)
    public String getContactFirstName() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93791);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93792);return this.contactFirstName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setContactFirstName(String contactFirstName) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93793);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93794);this.contactFirstName = contactFirstName;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}
    
    @Column(name="phone", nullable=false, length=50)
    public String getPhone() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93795);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93796);return this.phone;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setPhone(String phone) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93797);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93798);this.phone = phone;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="addressLine1", nullable=false, length=50)
    public String getAddressLine1() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93799);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93800);return this.addressLine1;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setAddressLine1(String addressLine1) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93801);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93802);this.addressLine1 = addressLine1;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="addressLine2", length=50)
    public String getAddressLine2() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93803);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93804);return this.addressLine2;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setAddressLine2(String addressLine2) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93805);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93806);this.addressLine2 = addressLine2;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="city", nullable=false, length=50)
    public String getCity() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93807);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93808);return this.city;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setCity(String city) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93809);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93810);this.city = city;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="state", length=50)
    public String getState() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93811);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93812);return this.state;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setState(String state) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93813);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93814);this.state = state;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="postalCode", length=15)
    public String getPostalCode() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93815);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93816);return this.postalCode;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setPostalCode(String postalCode) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93817);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93818);this.postalCode = postalCode;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="country", nullable=false, length=50)
    public String getCountry() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93819);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93820);return this.country;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setCountry(String country) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93821);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93822);this.country = country;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @Column(name="creditLimit", precision=22, scale=0)
    public Double getCreditLimit() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93823);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93824);return this.creditLimit;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setCreditLimit(Double creditLimit) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93825);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93826);this.creditLimit = creditLimit;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")
    public Set<Order> getOrders() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93827);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93828);return this.orders;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setOrders(Set<Order> orders) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93829);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93830);this.orders = orders;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="customer")
    public Set<Payment> getPayments() {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93831);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93832);return this.payments;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}

    public void setPayments(Set<Payment> payments) {try{__CLR4_1_1020c720c7lusqkq8d.R.inc(93833);
        __CLR4_1_1020c720c7lusqkq8d.R.inc(93834);this.payments = payments;
    }finally{__CLR4_1_1020c720c7lusqkq8d.R.flushNeeded();}}
}
