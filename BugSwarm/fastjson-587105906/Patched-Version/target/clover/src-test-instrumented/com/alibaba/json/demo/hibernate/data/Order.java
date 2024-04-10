/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo.hibernate.data;


import com.fasterxml.jackson.annotation.JsonBackReference;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="\"ORDER\""
    ,catalog="classicmodels"
)
public class Order  implements java.io.Serializable {public static class __CLR4_5_220hd20hdlusyjwbd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,93983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private Integer orderNumber;
     private Customer customer;
     private Date orderDate;
     private Date requiredDate;
     private Date shippedDate;
     private String status;
     private String comments;
     private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

    public Order() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93937);
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}

	
    public Order(Customer customer, Date orderDate, Date requiredDate, String status) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93938);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93939);this.customer = customer;
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93940);this.orderDate = orderDate;
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93941);this.requiredDate = requiredDate;
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93942);this.status = status;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    public Order(Customer customer, Date orderDate, Date requiredDate, Date shippedDate, String status, String comments, Set<OrderDetail> orderDetails) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93943);
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93944);this.customer = customer;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93945);this.orderDate = orderDate;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93946);this.requiredDate = requiredDate;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93947);this.shippedDate = shippedDate;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93948);this.status = status;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93949);this.comments = comments;
       __CLR4_5_220hd20hdlusyjwbd.R.inc(93950);this.orderDetails = orderDetails;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="orderNumber", unique=true, nullable=false)
    public Integer getOrderNumber() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93951);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93952);return this.orderNumber;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setOrderNumber(Integer orderNumber) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93953);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93954);this.orderNumber = orderNumber;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="customerNumber", nullable=false)
    @JsonBackReference("order-customer")
    public Customer getCustomer() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93955);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93956);return this.customer;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setCustomer(Customer customer) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93957);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93958);this.customer = customer;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    @Column(name="orderDate", nullable=false, length=19)
    public Date getOrderDate() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93959);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93960);return this.orderDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setOrderDate(Date orderDate) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93961);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93962);this.orderDate = orderDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    @Column(name="requiredDate", nullable=false, length=19)
    public Date getRequiredDate() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93963);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93964);return this.requiredDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setRequiredDate(Date requiredDate) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93965);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93966);this.requiredDate = requiredDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    @Column(name="shippedDate", length=19)
    public Date getShippedDate() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93967);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93968);return this.shippedDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setShippedDate(Date shippedDate) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93969);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93970);this.shippedDate = shippedDate;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    @Column(name="status", nullable=false, length=15)
    public String getStatus() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93971);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93972);return this.status;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setStatus(String status) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93973);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93974);this.status = status;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    @Column(name="comments", length=65535)
    public String getComments() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93975);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93976);return this.comments;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setComments(String comments) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93977);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93978);this.comments = comments;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="order")
    public Set<OrderDetail> getOrderDetails() {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93979);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93980);return this.orderDetails;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}
    
    public void setOrderDetails(Set<OrderDetail> orderDetails) {try{__CLR4_5_220hd20hdlusyjwbd.R.inc(93981);
        __CLR4_5_220hd20hdlusyjwbd.R.inc(93982);this.orderDetails = orderDetails;
    }finally{__CLR4_5_220hd20hdlusyjwbd.R.flushNeeded();}}




}


