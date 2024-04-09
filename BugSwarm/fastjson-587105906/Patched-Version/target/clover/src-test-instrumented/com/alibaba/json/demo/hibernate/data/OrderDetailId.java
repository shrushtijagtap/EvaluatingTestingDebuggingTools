/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo.hibernate.data;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class OrderDetailId  implements java.io.Serializable {public static class __CLR4_5_221hr21hrlusvnjhf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,95283,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


     private Integer orderNumber;
     private String productCode;

    public OrderDetailId() {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95247);
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}

    public OrderDetailId(Integer orderNumber, String productCode) {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95248);
       __CLR4_5_221hr21hrlusvnjhf.R.inc(95249);this.orderNumber = orderNumber;
       __CLR4_5_221hr21hrlusvnjhf.R.inc(95250);this.productCode = productCode;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}
   

    @Column(name="orderNumber", nullable=false)
    public Integer getOrderNumber() {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95251);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95252);return this.orderNumber;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}
    
    public void setOrderNumber(Integer orderNumber) {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95253);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95254);this.orderNumber = orderNumber;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}

    @Column(name="productCode", nullable=false, length=50)
    public String getProductCode() {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95255);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95256);return this.productCode;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}
    
    public void setProductCode(String productCode) {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95257);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95258);this.productCode = productCode;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95259);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95260);if ( ((((this == other ) )&&(__CLR4_5_221hr21hrlusvnjhf.R.iget(95261)!=0|true))||(__CLR4_5_221hr21hrlusvnjhf.R.iget(95262)==0&false))) {__CLR4_5_221hr21hrlusvnjhf.R.inc(95263);return true;
        }__CLR4_5_221hr21hrlusvnjhf.R.inc(95264);if ( ((((other == null ) )&&(__CLR4_5_221hr21hrlusvnjhf.R.iget(95265)!=0|true))||(__CLR4_5_221hr21hrlusvnjhf.R.iget(95266)==0&false))) {__CLR4_5_221hr21hrlusvnjhf.R.inc(95267);return false;
        }__CLR4_5_221hr21hrlusvnjhf.R.inc(95268);if ( (((!(other instanceof OrderDetailId) )&&(__CLR4_5_221hr21hrlusvnjhf.R.iget(95269)!=0|true))||(__CLR4_5_221hr21hrlusvnjhf.R.iget(95270)==0&false))) {__CLR4_5_221hr21hrlusvnjhf.R.inc(95271);return false;
        }__CLR4_5_221hr21hrlusvnjhf.R.inc(95272);OrderDetailId castOther = ( OrderDetailId ) other; 

        __CLR4_5_221hr21hrlusvnjhf.R.inc(95273);return ( (this.getOrderNumber()==castOther.getOrderNumber()) || ( this.getOrderNumber()!=null && castOther.getOrderNumber()!=null && this.getOrderNumber().equals(castOther.getOrderNumber()) ) )
                && ( (this.getProductCode()==castOther.getProductCode()) || ( this.getProductCode()!=null && castOther.getProductCode()!=null && this.getProductCode().equals(castOther.getProductCode()) ) );
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}
   
    @Override
    public int hashCode() {try{__CLR4_5_221hr21hrlusvnjhf.R.inc(95274);
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95275);int result = 17;

        __CLR4_5_221hr21hrlusvnjhf.R.inc(95276);result = 37 * result + ( (((getOrderNumber() == null )&&(__CLR4_5_221hr21hrlusvnjhf.R.iget(95277)!=0|true))||(__CLR4_5_221hr21hrlusvnjhf.R.iget(95278)==0&false))? 0 : this.getOrderNumber().hashCode() );
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95279);result = 37 * result + ( (((getProductCode() == null )&&(__CLR4_5_221hr21hrlusvnjhf.R.iget(95280)!=0|true))||(__CLR4_5_221hr21hrlusvnjhf.R.iget(95281)==0&false))? 0 : this.getProductCode().hashCode() );
        __CLR4_5_221hr21hrlusvnjhf.R.inc(95282);return result;
    }finally{__CLR4_5_221hr21hrlusvnjhf.R.flushNeeded();}}   
}


