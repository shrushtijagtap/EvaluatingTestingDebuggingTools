/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate.data;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@SuppressWarnings("serial")
@Entity
@Table(name="Employee"
    ,catalog="classicmodels"
)
public class Employee  implements java.io.Serializable
{public static class __CLR4_1_1020ej20ejlusqkq94{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,93888,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
     private Integer employeeNumber;
     private Office office;
     private String lastName;
     private String firstName;
     private String extension;
     private String email;
     private Integer reportsTo;
     private String jobTitle;
     
     private Set<Customer> customers = new HashSet<Customer>();

    public Employee() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93835); }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
	
    public Employee(Office office, String lastName, String firstName, String extension, String email, String jobTitle) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93836);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93837);this.office = office;
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93838);this.lastName = lastName;
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93839);this.firstName = firstName;
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93840);this.extension = extension;
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93841);this.email = email;
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93842);this.jobTitle = jobTitle;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    public Employee(Office office, String lastName, String firstName, String extension, String email, Integer reportsTo, String jobTitle, Set<Customer> customers) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93843);
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93844);this.office = office;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93845);this.lastName = lastName;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93846);this.firstName = firstName;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93847);this.extension = extension;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93848);this.email = email;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93849);this.reportsTo = reportsTo;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93850);this.jobTitle = jobTitle;
       __CLR4_1_1020ej20ejlusqkq94.R.inc(93851);this.customers = customers;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="employeeNumber", unique=true, nullable=false)
    public Integer getEmployeeNumber() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93852);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93853);return this.employeeNumber;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setEmployeeNumber(Integer employeeNumber) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93854);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93855);this.employeeNumber = employeeNumber;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="officeCode", nullable=false)
    public Office getOffice() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93856);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93857);return this.office;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setOffice(Office office) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93858);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93859);this.office = office;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="lastName", nullable=false, length=50)
    public String getLastName() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93860);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93861);return this.lastName;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setLastName(String lastName) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93862);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93863);this.lastName = lastName;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="firstName", nullable=false, length=50)
    public String getFirstName() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93864);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93865);return this.firstName;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setFirstName(String firstName) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93866);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93867);this.firstName = firstName;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="extension", nullable=false, length=10)
    public String getExtension() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93868);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93869);return this.extension;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setExtension(String extension) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93870);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93871);this.extension = extension;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="email", nullable=false, length=100)
    public String getEmail() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93872);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93873);return this.email;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setEmail(String email) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93874);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93875);this.email = email;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="reportsTo")
    public Integer getReportsTo() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93876);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93877);return this.reportsTo;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setReportsTo(Integer reportsTo) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93878);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93879);this.reportsTo = reportsTo;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    @Column(name="jobTitle", nullable=false, length=50)
    public String getJobTitle() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93880);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93881);return this.jobTitle;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
    
    public void setJobTitle(String jobTitle) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93882);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93883);this.jobTitle = jobTitle;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}

    @JsonManagedReference
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Customer> getCustomers() {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93884);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93885);return this.customers;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}

    public void setCustomers(Set<Customer> customers) {try{__CLR4_1_1020ej20ejlusqkq94.R.inc(93886);
        __CLR4_1_1020ej20ejlusqkq94.R.inc(93887);this.customers = customers;
    }finally{__CLR4_1_1020ej20ejlusqkq94.R.flushNeeded();}}
}
