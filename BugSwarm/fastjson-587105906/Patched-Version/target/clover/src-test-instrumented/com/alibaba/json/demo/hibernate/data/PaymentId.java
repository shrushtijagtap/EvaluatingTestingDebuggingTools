/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.demo.hibernate.data;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@SuppressWarnings("serial")
@Embeddable
public class PaymentId  implements java.io.Serializable
{public static class __CLR4_5_220l520l5lusyjwbv{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,94109,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private Integer customerNumber;
    private String checkNumber;

    public PaymentId() {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94073); }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}

    public PaymentId(Integer customerNumber, String checkNumber) {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94074);
       __CLR4_5_220l520l5lusyjwbv.R.inc(94075);this.customerNumber = customerNumber;
       __CLR4_5_220l520l5lusyjwbv.R.inc(94076);this.checkNumber = checkNumber;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}
   

    @Column(name="customerNumber", nullable=false)
    public Integer getCustomerNumber() {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94077);
        __CLR4_5_220l520l5lusyjwbv.R.inc(94078);return this.customerNumber;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}
    
    public void setCustomerNumber(Integer customerNumber) {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94079);
        __CLR4_5_220l520l5lusyjwbv.R.inc(94080);this.customerNumber = customerNumber;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}

    @Column(name="checkNumber", nullable=false, length=50)
    public String getCheckNumber() {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94081);
        __CLR4_5_220l520l5lusyjwbv.R.inc(94082);return this.checkNumber;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}
    
    public void setCheckNumber(String checkNumber) {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94083);
        __CLR4_5_220l520l5lusyjwbv.R.inc(94084);this.checkNumber = checkNumber;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}

    @Override
    public boolean equals(Object other) {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94085);
         __CLR4_5_220l520l5lusyjwbv.R.inc(94086);if ( ((((this == other ) )&&(__CLR4_5_220l520l5lusyjwbv.R.iget(94087)!=0|true))||(__CLR4_5_220l520l5lusyjwbv.R.iget(94088)==0&false))) {__CLR4_5_220l520l5lusyjwbv.R.inc(94089);return true;
		 }__CLR4_5_220l520l5lusyjwbv.R.inc(94090);if ( ((((other == null ) )&&(__CLR4_5_220l520l5lusyjwbv.R.iget(94091)!=0|true))||(__CLR4_5_220l520l5lusyjwbv.R.iget(94092)==0&false))) {__CLR4_5_220l520l5lusyjwbv.R.inc(94093);return false;
		 }__CLR4_5_220l520l5lusyjwbv.R.inc(94094);if ( (((!(other instanceof PaymentId) )&&(__CLR4_5_220l520l5lusyjwbv.R.iget(94095)!=0|true))||(__CLR4_5_220l520l5lusyjwbv.R.iget(94096)==0&false))) {__CLR4_5_220l520l5lusyjwbv.R.inc(94097);return false;
		 }__CLR4_5_220l520l5lusyjwbv.R.inc(94098);PaymentId castOther = ( PaymentId ) other; 
         
		 __CLR4_5_220l520l5lusyjwbv.R.inc(94099);return ( (this.getCustomerNumber()==castOther.getCustomerNumber()) || ( this.getCustomerNumber()!=null && castOther.getCustomerNumber()!=null && this.getCustomerNumber().equals(castOther.getCustomerNumber()) ) )
		         && ( (this.getCheckNumber()==castOther.getCheckNumber()) || ( this.getCheckNumber()!=null && castOther.getCheckNumber()!=null && this.getCheckNumber().equals(castOther.getCheckNumber()) ) );
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}

    @Override
    public int hashCode() {try{__CLR4_5_220l520l5lusyjwbv.R.inc(94100);
        __CLR4_5_220l520l5lusyjwbv.R.inc(94101);int result = 17;

        __CLR4_5_220l520l5lusyjwbv.R.inc(94102);result = 37 * result + ( (((getCustomerNumber() == null )&&(__CLR4_5_220l520l5lusyjwbv.R.iget(94103)!=0|true))||(__CLR4_5_220l520l5lusyjwbv.R.iget(94104)==0&false))? 0 : this.getCustomerNumber().hashCode() );
        __CLR4_5_220l520l5lusyjwbv.R.inc(94105);result = 37 * result + ( (((getCheckNumber() == null )&&(__CLR4_5_220l520l5lusyjwbv.R.iget(94106)!=0|true))||(__CLR4_5_220l520l5lusyjwbv.R.iget(94107)==0&false))? 0 : this.getCheckNumber().hashCode() );
        __CLR4_5_220l520l5lusyjwbv.R.inc(94108);return result;
    }finally{__CLR4_5_220l520l5lusyjwbv.R.flushNeeded();}}   
}


