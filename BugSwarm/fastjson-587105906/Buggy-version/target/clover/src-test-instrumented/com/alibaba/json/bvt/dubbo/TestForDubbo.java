/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.dubbo;

import java.util.ArrayList;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.test.dubbo.FullAddress;
import com.alibaba.json.test.dubbo.HelloServiceImpl;
import com.alibaba.json.test.dubbo.Person;
import com.alibaba.json.test.dubbo.PersonInfo;
import com.alibaba.json.test.dubbo.PersonStatus;
import com.alibaba.json.test.dubbo.Phone;
import com.alibaba.json.test.dubbo.Tiger;
import com.alibaba.json.test.dubbo.Tigers;

public class TestForDubbo extends TestCase {static class __CLR4_1_1019261926lusqk89h{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,58441,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    static Person            person;

    static {try{__CLR4_1_1019261926lusqk89h.R.inc(58398);
        __CLR4_1_1019261926lusqk89h.R.inc(58399);person = new Person();
        __CLR4_1_1019261926lusqk89h.R.inc(58400);person.setPersonId("superman111");
        __CLR4_1_1019261926lusqk89h.R.inc(58401);person.setLoginName("superman");
        __CLR4_1_1019261926lusqk89h.R.inc(58402);person.setEmail("sm@1.com");
        __CLR4_1_1019261926lusqk89h.R.inc(58403);person.setPenName("pname");
        __CLR4_1_1019261926lusqk89h.R.inc(58404);person.setStatus(PersonStatus.ENABLED);

        __CLR4_1_1019261926lusqk89h.R.inc(58405);ArrayList<Phone> phones = new ArrayList<Phone>();
        __CLR4_1_1019261926lusqk89h.R.inc(58406);Phone phone1 = new Phone("86", "0571", "87654321", "001");
        __CLR4_1_1019261926lusqk89h.R.inc(58407);Phone phone2 = new Phone("86", "0571", "87654322", "002");
        __CLR4_1_1019261926lusqk89h.R.inc(58408);phones.add(phone1);
        __CLR4_1_1019261926lusqk89h.R.inc(58409);phones.add(phone2);
        __CLR4_1_1019261926lusqk89h.R.inc(58410);PersonInfo pi = new PersonInfo();
        __CLR4_1_1019261926lusqk89h.R.inc(58411);pi.setPhones(phones);
        __CLR4_1_1019261926lusqk89h.R.inc(58412);Phone fax = new Phone("86", "0571", "87654321", null);
        __CLR4_1_1019261926lusqk89h.R.inc(58413);pi.setFax(fax);
        __CLR4_1_1019261926lusqk89h.R.inc(58414);FullAddress addr = new FullAddress("CN", "zj", "3480", "wensanlu", "315000");
        __CLR4_1_1019261926lusqk89h.R.inc(58415);pi.setFullAddress(addr);
        __CLR4_1_1019261926lusqk89h.R.inc(58416);pi.setMobileNo("13584652131");
        __CLR4_1_1019261926lusqk89h.R.inc(58417);pi.setMale(true);
        __CLR4_1_1019261926lusqk89h.R.inc(58418);pi.setDepartment("b2b");
        __CLR4_1_1019261926lusqk89h.R.inc(58419);pi.setHomepageUrl("www.capcom.com");
        __CLR4_1_1019261926lusqk89h.R.inc(58420);pi.setJobTitle("qa");
        __CLR4_1_1019261926lusqk89h.R.inc(58421);pi.setName("superman");
        __CLR4_1_1019261926lusqk89h.R.inc(58422);person.setInfoProfile(pi);
    }finally{__CLR4_1_1019261926lusqk89h.R.flushNeeded();}}

    private HelloServiceImpl helloService = new HelloServiceImpl();

    public void f_testParamType4() {try{__CLR4_1_1019261926lusqk89h.R.inc(58423);
        __CLR4_1_1019261926lusqk89h.R.inc(58424);Tiger tiger = new Tiger();
        __CLR4_1_1019261926lusqk89h.R.inc(58425);tiger.setTigerName("\u4e1c\u5317\u864e");
        __CLR4_1_1019261926lusqk89h.R.inc(58426);tiger.setTigerSex(true);
        __CLR4_1_1019261926lusqk89h.R.inc(58427);Tigers tigers = helloService.eatTiger(tiger);

        __CLR4_1_1019261926lusqk89h.R.inc(58428);String text = JSON.toJSONString(tigers, SerializerFeature.WriteClassName);
        __CLR4_1_1019261926lusqk89h.R.inc(58429);System.out.println(text);

        __CLR4_1_1019261926lusqk89h.R.inc(58430);Tigers tigers2 = JSON.parseObject(text, Tigers.class);

        __CLR4_1_1019261926lusqk89h.R.inc(58431);Assert.assertEquals(text, JSON.toJSONString(tigers2, SerializerFeature.WriteClassName));
    }finally{__CLR4_1_1019261926lusqk89h.R.flushNeeded();}}

    public void testPerson() {__CLR4_1_1019261926lusqk89h.R.globalSliceStart(getClass().getName(),58432);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rmqmmq1934();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1019261926lusqk89h.R.rethrow($CLV_t2$);}finally{__CLR4_1_1019261926lusqk89h.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.dubbo.TestForDubbo.testPerson",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58432,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rmqmmq1934(){try{__CLR4_1_1019261926lusqk89h.R.inc(58432);
        __CLR4_1_1019261926lusqk89h.R.inc(58433);Person p = helloService.showPerson(person);
        __CLR4_1_1019261926lusqk89h.R.inc(58434);String text = JSON.toJSONString(p, SerializerFeature.WriteClassName);
        __CLR4_1_1019261926lusqk89h.R.inc(58435);System.out.println(text);
        
        __CLR4_1_1019261926lusqk89h.R.inc(58436);Person result = JSON.parseObject(text, Person.class);
        
        __CLR4_1_1019261926lusqk89h.R.inc(58437);assertEquals(result.getInfoProfile().getPhones().get(0).getArea(),
                     person.getInfoProfile().getPhones().get(0).getArea());
        __CLR4_1_1019261926lusqk89h.R.inc(58438);assertEquals(result.getInfoProfile().getPhones().get(0).getCountry(),
                     person.getInfoProfile().getPhones().get(0).getCountry());
        __CLR4_1_1019261926lusqk89h.R.inc(58439);assertEquals(result.getInfoProfile().getPhones().get(0).getExtensionNumber(),
                     person.getInfoProfile().getPhones().get(0).getExtensionNumber());
        __CLR4_1_1019261926lusqk89h.R.inc(58440);assertEquals(result.getInfoProfile().getPhones().get(0).getNumber(),
                     person.getInfoProfile().getPhones().get(0).getNumber());
    }finally{__CLR4_1_1019261926lusqk89h.R.flushNeeded();}}
}
