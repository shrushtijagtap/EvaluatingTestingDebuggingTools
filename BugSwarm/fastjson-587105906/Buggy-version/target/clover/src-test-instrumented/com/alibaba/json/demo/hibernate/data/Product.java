/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;


import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name="Product"
    ,catalog="classicmodels"
)
public class Product  implements java.io.Serializable {public static class __CLR4_1_1021ko21koluszwhg8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95414,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private String productCode;
     private String productName;
     private String productLine;
     private String productScale;
     private String productVendor;
     private String productDescription;
     private short quantityInStock;
     private double buyPrice;
     private double msrp;
     private Set<OrderDetail> orderDetails = new HashSet<OrderDetail>(0);

    public Product() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95352);
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}

	
    public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, double buyPrice, double msrp) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95353);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95354);this.productCode = productCode;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95355);this.productName = productName;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95356);this.productLine = productLine;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95357);this.productScale = productScale;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95358);this.productVendor = productVendor;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95359);this.productDescription = productDescription;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95360);this.quantityInStock = quantityInStock;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95361);this.buyPrice = buyPrice;
        __CLR4_1_1021ko21koluszwhg8.R.inc(95362);this.msrp = msrp;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    public Product(String productCode, String productName, String productLine, String productScale, String productVendor, String productDescription, short quantityInStock, double buyPrice, double msrp, Set<OrderDetail> orderDetails) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95363);
       __CLR4_1_1021ko21koluszwhg8.R.inc(95364);this.productCode = productCode;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95365);this.productName = productName;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95366);this.productLine = productLine;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95367);this.productScale = productScale;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95368);this.productVendor = productVendor;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95369);this.productDescription = productDescription;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95370);this.quantityInStock = quantityInStock;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95371);this.buyPrice = buyPrice;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95372);this.msrp = msrp;
       __CLR4_1_1021ko21koluszwhg8.R.inc(95373);this.orderDetails = orderDetails;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
   
     @Id 
    
    @Column(name="productCode", unique=true, nullable=false, length=50)
    public String getProductCode() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95374);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95375);return this.productCode;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductCode(String productCode) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95376);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95377);this.productCode = productCode;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="productName", nullable=false, length=70)
    public String getProductName() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95378);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95379);return this.productName;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductName(String productName) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95380);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95381);this.productName = productName;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="productLine", nullable=false, length=50)
    public String getProductLine() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95382);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95383);return this.productLine;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductLine(String productLine) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95384);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95385);this.productLine = productLine;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="productScale", nullable=false, length=10)
    public String getProductScale() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95386);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95387);return this.productScale;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductScale(String productScale) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95388);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95389);this.productScale = productScale;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="productVendor", nullable=false, length=50)
    public String getProductVendor() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95390);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95391);return this.productVendor;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductVendor(String productVendor) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95392);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95393);this.productVendor = productVendor;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="productDescription", nullable=false, length=65535)
    public String getProductDescription() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95394);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95395);return this.productDescription;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setProductDescription(String productDescription) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95396);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95397);this.productDescription = productDescription;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="quantityInStock", nullable=false)
    public short getQuantityInStock() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95398);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95399);return this.quantityInStock;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setQuantityInStock(short quantityInStock) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95400);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95401);this.quantityInStock = quantityInStock;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="buyPrice", nullable=false, precision=22, scale=0)
    public double getBuyPrice() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95402);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95403);return this.buyPrice;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setBuyPrice(double buyPrice) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95404);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95405);this.buyPrice = buyPrice;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    @Column(name="MSRP", nullable=false, precision=22, scale=0)
    public double getMsrp() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95406);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95407);return this.msrp;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setMsrp(double msrp) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95408);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95409);this.msrp = msrp;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="product")
    public Set<OrderDetail> getOrderDetails() {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95410);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95411);return this.orderDetails;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}
    
    public void setOrderDetails(Set<OrderDetail> orderDetails) {try{__CLR4_1_1021ko21koluszwhg8.R.inc(95412);
        __CLR4_1_1021ko21koluszwhg8.R.inc(95413);this.orderDetails = orderDetails;
    }finally{__CLR4_1_1021ko21koluszwhg8.R.flushNeeded();}}




}


