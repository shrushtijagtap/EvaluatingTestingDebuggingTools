/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class PaymentId  implements java.io.Serializable
{public static class __CLR4_1_1021jo21joluszwhg3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95352,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Integer customerNumber;
    private String checkNumber;

    public PaymentId() {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95316); }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}

    public PaymentId(Integer customerNumber, String checkNumber) {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95317);
       __CLR4_1_1021jo21joluszwhg3.R.inc(95318);this.customerNumber = customerNumber;
       __CLR4_1_1021jo21joluszwhg3.R.inc(95319);this.checkNumber = checkNumber;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}
   

    @Column(name="customerNumber", nullable=false)
    public Integer getCustomerNumber() {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95320);
        __CLR4_1_1021jo21joluszwhg3.R.inc(95321);return this.customerNumber;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}
    
    public void setCustomerNumber(Integer customerNumber) {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95322);
        __CLR4_1_1021jo21joluszwhg3.R.inc(95323);this.customerNumber = customerNumber;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}

    @Column(name="checkNumber", nullable=false, length=50)
    public String getCheckNumber() {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95324);
        __CLR4_1_1021jo21joluszwhg3.R.inc(95325);return this.checkNumber;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}
    
    public void setCheckNumber(String checkNumber) {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95326);
        __CLR4_1_1021jo21joluszwhg3.R.inc(95327);this.checkNumber = checkNumber;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95328);
         __CLR4_1_1021jo21joluszwhg3.R.inc(95329);if ( ((((this == other ) )&&(__CLR4_1_1021jo21joluszwhg3.R.iget(95330)!=0|true))||(__CLR4_1_1021jo21joluszwhg3.R.iget(95331)==0&false))) {__CLR4_1_1021jo21joluszwhg3.R.inc(95332);return true;
		 }__CLR4_1_1021jo21joluszwhg3.R.inc(95333);if ( ((((other == null ) )&&(__CLR4_1_1021jo21joluszwhg3.R.iget(95334)!=0|true))||(__CLR4_1_1021jo21joluszwhg3.R.iget(95335)==0&false))) {__CLR4_1_1021jo21joluszwhg3.R.inc(95336);return false;
		 }__CLR4_1_1021jo21joluszwhg3.R.inc(95337);if ( (((!(other instanceof PaymentId) )&&(__CLR4_1_1021jo21joluszwhg3.R.iget(95338)!=0|true))||(__CLR4_1_1021jo21joluszwhg3.R.iget(95339)==0&false))) {__CLR4_1_1021jo21joluszwhg3.R.inc(95340);return false;
		 }__CLR4_1_1021jo21joluszwhg3.R.inc(95341);PaymentId castOther = ( PaymentId ) other; 
         
		 __CLR4_1_1021jo21joluszwhg3.R.inc(95342);return ( (this.getCustomerNumber()==castOther.getCustomerNumber()) || ( this.getCustomerNumber()!=null && castOther.getCustomerNumber()!=null && this.getCustomerNumber().equals(castOther.getCustomerNumber()) ) )
		         && ( (this.getCheckNumber()==castOther.getCheckNumber()) || ( this.getCheckNumber()!=null && castOther.getCheckNumber()!=null && this.getCheckNumber().equals(castOther.getCheckNumber()) ) );
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_1_1021jo21joluszwhg3.R.inc(95343);
        __CLR4_1_1021jo21joluszwhg3.R.inc(95344);int result = 17;

        __CLR4_1_1021jo21joluszwhg3.R.inc(95345);result = 37 * result + ( (((getCustomerNumber() == null )&&(__CLR4_1_1021jo21joluszwhg3.R.iget(95346)!=0|true))||(__CLR4_1_1021jo21joluszwhg3.R.iget(95347)==0&false))? 0 : this.getCustomerNumber().hashCode() );
        __CLR4_1_1021jo21joluszwhg3.R.inc(95348);result = 37 * result + ( (((getCheckNumber() == null )&&(__CLR4_1_1021jo21joluszwhg3.R.iget(95349)!=0|true))||(__CLR4_1_1021jo21joluszwhg3.R.iget(95350)==0&false))? 0 : this.getCheckNumber().hashCode() );
        __CLR4_1_1021jo21joluszwhg3.R.inc(95351);return result;
    }finally{__CLR4_1_1021jo21joluszwhg3.R.flushNeeded();}}   
}


