/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.demo.hibernate;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.alibaba.json.demo.hibernate.data.*;

import junit.framework.TestCase;
import org.hibernate.Hibernate;
import org.junit.Test;

public class LazyLoadingTest extends TestCase {static class __CLR4_1_1021a121a1luszwhbz{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,94983,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    EntityManagerFactory emf;

    protected void setUp() throws Exception {try{__CLR4_1_1021a121a1luszwhbz.R.inc(94969);
        __CLR4_1_1021a121a1luszwhbz.R.inc(94970);emf = Persistence.createEntityManagerFactory("persistenceUnit");
    }finally{__CLR4_1_1021a121a1luszwhbz.R.flushNeeded();}}

    protected void tearDown() throws Exception {try{__CLR4_1_1021a121a1luszwhbz.R.inc(94971);
        __CLR4_1_1021a121a1luszwhbz.R.inc(94972);if ((((emf != null)&&(__CLR4_1_1021a121a1luszwhbz.R.iget(94973)!=0|true))||(__CLR4_1_1021a121a1luszwhbz.R.iget(94974)==0&false))) {{
            __CLR4_1_1021a121a1luszwhbz.R.inc(94975);emf.close();
        }
    }}finally{__CLR4_1_1021a121a1luszwhbz.R.flushNeeded();}}

    public void testGetCustomerJson() throws Exception {__CLR4_1_1021a121a1luszwhbz.R.globalSliceStart(getClass().getName(),94976);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10prw4x21a8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021a121a1luszwhbz.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021a121a1luszwhbz.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.demo.hibernate.LazyLoadingTest.testGetCustomerJson",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),94976,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10prw4x21a8() throws Exception{try{__CLR4_1_1021a121a1luszwhbz.R.inc(94976);

            __CLR4_1_1021a121a1luszwhbz.R.inc(94977);EntityManager em = emf.createEntityManager();
            
            // false -> no forcing of lazy loading
            //ObjectMapper mapper = mapperWithModule(false);
            
            __CLR4_1_1021a121a1luszwhbz.R.inc(94978);Customer customer = em.find(Customer.class, 103);
            // assertFalse(Hibernate.isInitialized(customer.getPayments()));
            __CLR4_1_1021a121a1luszwhbz.R.inc(94979);String json = JSON.toJSONString(customer);
        __CLR4_1_1021a121a1luszwhbz.R.inc(94980);System.out.println(json);
            // should not force loading...
            __CLR4_1_1021a121a1luszwhbz.R.inc(94981);Set<Payment> payments = customer.getPayments();
            /*
            System.out.println("--- JSON ---");
            System.out.println(json);
            System.out.println("--- /JSON ---");
            */

            //assertFalse(Hibernate.isInitialized(payments));
            // TODO: verify
            __CLR4_1_1021a121a1luszwhbz.R.inc(94982);assertNotNull(json);
            
//            Map<?,?> stuff = mapper.readValue(json, Map.class);
//
//            // "payments" is marked as lazily loaded AND "Include.NON_EMPTY"; should not be serialized
//            if (stuff.containsKey("payments")) {
//                fail("Should not find serialized property 'payments'; got: "+stuff.get("payments")
//                        +" from JSON: "+json);
//            }
//            // orders, on the other hand, not:
//            assertTrue(stuff.containsKey("orders"));
//            assertNull(stuff.get("orderes"));

    }finally{__CLR4_1_1021a121a1luszwhbz.R.flushNeeded();}}
    
//    @Test
//    public void testSerializeIdentifierFeature() throws JsonProcessingException {
//		Hibernate5Module module = new Hibernate5Module();
//		module.enable(Feature.SERIALIZE_IDENTIFIER_FOR_LAZY_NOT_LOADED_OBJECTS);
//		ObjectMapper objectMapper = new ObjectMapper().registerModule(module);
//
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnit");
//    	try {
//    		EntityManager em = emf.createEntityManager();
//    		Customer customerRef = em.getReference(Customer.class, 103);
//    		em.close();
//    		assertFalse(Hibernate.isInitialized(customerRef));
//
//			String json = objectMapper.writeValueAsString(customerRef);
//			assertFalse(Hibernate.isInitialized(customerRef));
//			assertEquals("{\"customerNumber\":103}", json);
//    	} finally {
//    		emf.close();
//    	}
//    }
}
