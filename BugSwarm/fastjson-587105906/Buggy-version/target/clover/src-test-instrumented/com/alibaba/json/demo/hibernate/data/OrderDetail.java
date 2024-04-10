/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;


import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="OrderDetail"
    ,catalog="classicmodels"
)
public class OrderDetail  implements java.io.Serializable {public static class __CLR4_1_1021h621h6luszwhey{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95258,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private OrderDetailId id;
     private Order order;
     private Product product;
     private Integer quantityOrdered;
     private double priceEach;
     private short orderLineNumber;

    public OrderDetail() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95226);
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}

    public OrderDetail(OrderDetailId id, Order order, Product product, Integer quantityOrdered, double priceEach, short orderLineNumber) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95227);
       __CLR4_1_1021h621h6luszwhey.R.inc(95228);this.id = id;
       __CLR4_1_1021h621h6luszwhey.R.inc(95229);this.order = order;
       __CLR4_1_1021h621h6luszwhey.R.inc(95230);this.product = product;
       __CLR4_1_1021h621h6luszwhey.R.inc(95231);this.quantityOrdered = quantityOrdered;
       __CLR4_1_1021h621h6luszwhey.R.inc(95232);this.priceEach = priceEach;
       __CLR4_1_1021h621h6luszwhey.R.inc(95233);this.orderLineNumber = orderLineNumber;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="orderNumber", column=@Column(name="orderNumber", nullable=false) ), 
        @AttributeOverride(name="productCode", column=@Column(name="productCode", nullable=false, length=50) ) } )
    public OrderDetailId getId() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95234);
        __CLR4_1_1021h621h6luszwhey.R.inc(95235);return this.id;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setId(OrderDetailId id) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95236);
        __CLR4_1_1021h621h6luszwhey.R.inc(95237);this.id = id;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="orderNumber", nullable=false, insertable=false, updatable=false)
    @JsonBackReference("orderdetail-order")
    public Order getOrder() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95238);
        __CLR4_1_1021h621h6luszwhey.R.inc(95239);return this.order;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setOrder(Order order) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95240);
        __CLR4_1_1021h621h6luszwhey.R.inc(95241);this.order = order;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="productCode", nullable=false, insertable=false, updatable=false)
    @JsonBackReference("order-product")
    public Product getProduct() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95242);
        __CLR4_1_1021h621h6luszwhey.R.inc(95243);return this.product;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setProduct(Product product) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95244);
        __CLR4_1_1021h621h6luszwhey.R.inc(95245);this.product = product;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    @Column(name="quantityOrdered", nullable=false)
    public Integer getQuantityOrdered() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95246);
        __CLR4_1_1021h621h6luszwhey.R.inc(95247);return this.quantityOrdered;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setQuantityOrdered(Integer quantityOrdered) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95248);
        __CLR4_1_1021h621h6luszwhey.R.inc(95249);this.quantityOrdered = quantityOrdered;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    @Column(name="priceEach", nullable=false, precision=22, scale=0)
    public double getPriceEach() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95250);
        __CLR4_1_1021h621h6luszwhey.R.inc(95251);return this.priceEach;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setPriceEach(double priceEach) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95252);
        __CLR4_1_1021h621h6luszwhey.R.inc(95253);this.priceEach = priceEach;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    @Column(name="orderLineNumber", nullable=false)
    public short getOrderLineNumber() {try{__CLR4_1_1021h621h6luszwhey.R.inc(95254);
        __CLR4_1_1021h621h6luszwhey.R.inc(95255);return this.orderLineNumber;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}
    
    public void setOrderLineNumber(short orderLineNumber) {try{__CLR4_1_1021h621h6luszwhey.R.inc(95256);
        __CLR4_1_1021h621h6luszwhey.R.inc(95257);this.orderLineNumber = orderLineNumber;
    }finally{__CLR4_1_1021h621h6luszwhey.R.flushNeeded();}}




}


