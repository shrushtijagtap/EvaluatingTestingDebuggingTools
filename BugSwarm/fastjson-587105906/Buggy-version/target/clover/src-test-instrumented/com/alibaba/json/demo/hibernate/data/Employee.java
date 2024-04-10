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
{public static class __CLR4_1_1021cr21crluszwhe8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,95120,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
     private Integer employeeNumber;
     private Office office;
     private String lastName;
     private String firstName;
     private String extension;
     private String email;
     private Integer reportsTo;
     private String jobTitle;
     
     private Set<Customer> customers = new HashSet<Customer>();

    public Employee() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95067); }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
	
    public Employee(Office office, String lastName, String firstName, String extension, String email, String jobTitle) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95068);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95069);this.office = office;
        __CLR4_1_1021cr21crluszwhe8.R.inc(95070);this.lastName = lastName;
        __CLR4_1_1021cr21crluszwhe8.R.inc(95071);this.firstName = firstName;
        __CLR4_1_1021cr21crluszwhe8.R.inc(95072);this.extension = extension;
        __CLR4_1_1021cr21crluszwhe8.R.inc(95073);this.email = email;
        __CLR4_1_1021cr21crluszwhe8.R.inc(95074);this.jobTitle = jobTitle;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    public Employee(Office office, String lastName, String firstName, String extension, String email, Integer reportsTo, String jobTitle, Set<Customer> customers) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95075);
       __CLR4_1_1021cr21crluszwhe8.R.inc(95076);this.office = office;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95077);this.lastName = lastName;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95078);this.firstName = firstName;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95079);this.extension = extension;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95080);this.email = email;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95081);this.reportsTo = reportsTo;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95082);this.jobTitle = jobTitle;
       __CLR4_1_1021cr21crluszwhe8.R.inc(95083);this.customers = customers;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
   
     @Id @GeneratedValue(strategy=IDENTITY)
    
    @Column(name="employeeNumber", unique=true, nullable=false)
    public Integer getEmployeeNumber() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95084);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95085);return this.employeeNumber;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setEmployeeNumber(Integer employeeNumber) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95086);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95087);this.employeeNumber = employeeNumber;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="officeCode", nullable=false)
    public Office getOffice() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95088);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95089);return this.office;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setOffice(Office office) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95090);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95091);this.office = office;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="lastName", nullable=false, length=50)
    public String getLastName() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95092);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95093);return this.lastName;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setLastName(String lastName) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95094);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95095);this.lastName = lastName;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="firstName", nullable=false, length=50)
    public String getFirstName() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95096);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95097);return this.firstName;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setFirstName(String firstName) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95098);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95099);this.firstName = firstName;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="extension", nullable=false, length=10)
    public String getExtension() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95100);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95101);return this.extension;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setExtension(String extension) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95102);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95103);this.extension = extension;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="email", nullable=false, length=100)
    public String getEmail() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95104);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95105);return this.email;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setEmail(String email) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95106);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95107);this.email = email;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="reportsTo")
    public Integer getReportsTo() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95108);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95109);return this.reportsTo;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setReportsTo(Integer reportsTo) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95110);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95111);this.reportsTo = reportsTo;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    @Column(name="jobTitle", nullable=false, length=50)
    public String getJobTitle() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95112);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95113);return this.jobTitle;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
    
    public void setJobTitle(String jobTitle) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95114);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95115);this.jobTitle = jobTitle;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}

    @JsonManagedReference
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="employee")
    public Set<Customer> getCustomers() {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95116);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95117);return this.customers;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}

    public void setCustomers(Set<Customer> customers) {try{__CLR4_1_1021cr21crluszwhe8.R.inc(95118);
        __CLR4_1_1021cr21crluszwhe8.R.inc(95119);this.customers = customers;
    }finally{__CLR4_1_1021cr21crluszwhe8.R.flushNeeded();}}
}
