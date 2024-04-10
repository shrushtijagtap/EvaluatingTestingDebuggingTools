/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.test;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.json.test.entity.Company;
import com.alibaba.json.test.entity.Department;
import com.alibaba.json.test.entity.Employee;
import com.alibaba.json.test.entity.Group;

public class GenerateJavaTest extends TestCase {static class __CLR4_1_1022be22beluszwhum{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,96372,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String     text;
    private AtomicLong idSeed = new AtomicLong();

    protected void setUp() throws Exception {try{__CLR4_1_1022be22beluszwhum.R.inc(96314);
        __CLR4_1_1022be22beluszwhum.R.inc(96315);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/page_model_cached.json");
        __CLR4_1_1022be22beluszwhum.R.inc(96316);text = IOUtils.toString(is);
        __CLR4_1_1022be22beluszwhum.R.inc(96317);is.close();
    }finally{__CLR4_1_1022be22beluszwhum.R.flushNeeded();}}

    private Long createId() {try{__CLR4_1_1022be22beluszwhum.R.inc(96318);
        __CLR4_1_1022be22beluszwhum.R.inc(96319);return idSeed.incrementAndGet();
    }finally{__CLR4_1_1022be22beluszwhum.R.flushNeeded();}}

    public void testGenerate() {__CLR4_1_1022be22beluszwhum.R.globalSliceStart(getClass().getName(),96320);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8ovhu22bk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1022be22beluszwhum.R.rethrow($CLV_t2$);}finally{__CLR4_1_1022be22beluszwhum.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.GenerateJavaTest.testGenerate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),96320,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8ovhu22bk(){try{__CLR4_1_1022be22beluszwhum.R.inc(96320);
        __CLR4_1_1022be22beluszwhum.R.inc(96321);Group group = new Group();

        __CLR4_1_1022be22beluszwhum.R.inc(96322);group.setName("Alibaba Group");
        __CLR4_1_1022be22beluszwhum.R.inc(96323);group.setDescription("Alibaba Group makes it easy for anyone to buy or sell online anywhere in the world. ");

        {
            __CLR4_1_1022be22beluszwhum.R.inc(96324);Company company = new Company();
            __CLR4_1_1022be22beluszwhum.R.inc(96325);company.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96326);company.setName("Alibaba.com");
            __CLR4_1_1022be22beluszwhum.R.inc(96327);company.setDescription("Global leader in e-commerce for small businesses");
            __CLR4_1_1022be22beluszwhum.R.inc(96328);company.setStock("1688.HK");
            __CLR4_1_1022be22beluszwhum.R.inc(96329);group.getCompanies().add(company);

            __CLR4_1_1022be22beluszwhum.R.inc(96330);Department root = new Department();
            __CLR4_1_1022be22beluszwhum.R.inc(96331);root.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96332);root.setName("B2B");
            __CLR4_1_1022be22beluszwhum.R.inc(96333);company.setRootDepartment(root);

            {
                __CLR4_1_1022be22beluszwhum.R.inc(96334);Department cbu = new Department();
                __CLR4_1_1022be22beluszwhum.R.inc(96335);cbu.setId(createId());
                __CLR4_1_1022be22beluszwhum.R.inc(96336);cbu.setName("CBU");

                __CLR4_1_1022be22beluszwhum.R.inc(96337);root.getChildren().add(cbu);

                __CLR4_1_1022be22beluszwhum.R.inc(96338);Employee emp0 = new Employee();
                __CLR4_1_1022be22beluszwhum.R.inc(96339);emp0.setName("\u6821\u957f");
                __CLR4_1_1022be22beluszwhum.R.inc(96340);emp0.setDescription("\u795e\u68cd\u654c\u4eba\u59d0");
                __CLR4_1_1022be22beluszwhum.R.inc(96341);emp0.setAge(3);
                __CLR4_1_1022be22beluszwhum.R.inc(96342);emp0.setSalary(new BigDecimal("123456789.0123"));
                __CLR4_1_1022be22beluszwhum.R.inc(96343);emp0.setBirthdate(new Date());
                __CLR4_1_1022be22beluszwhum.R.inc(96344);emp0.setBadboy(true);

                __CLR4_1_1022be22beluszwhum.R.inc(96345);cbu.getMembers().add(emp0);
            }
            {
                __CLR4_1_1022be22beluszwhum.R.inc(96346);Department icbu = new Department();
                __CLR4_1_1022be22beluszwhum.R.inc(96347);icbu.setId(createId());
                __CLR4_1_1022be22beluszwhum.R.inc(96348);icbu.setName("ICBU");

                __CLR4_1_1022be22beluszwhum.R.inc(96349);root.getChildren().add(icbu);
            }
        }

        {
            __CLR4_1_1022be22beluszwhum.R.inc(96350);Company company = new Company();
            __CLR4_1_1022be22beluszwhum.R.inc(96351);company.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96352);company.setName("Taobao");
            __CLR4_1_1022be22beluszwhum.R.inc(96353);company.setDescription("China's largest online retail website and one-stop platform for shopping, socializing and information sharing");
            __CLR4_1_1022be22beluszwhum.R.inc(96354);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1022be22beluszwhum.R.inc(96355);Company company = new Company();
            __CLR4_1_1022be22beluszwhum.R.inc(96356);company.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96357);company.setName("Alipay");
            __CLR4_1_1022be22beluszwhum.R.inc(96358);company.setDescription("China's leading third-party online payment platform");
            __CLR4_1_1022be22beluszwhum.R.inc(96359);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1022be22beluszwhum.R.inc(96360);Company company = new Company();
            __CLR4_1_1022be22beluszwhum.R.inc(96361);company.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96362);company.setName("Alibaba Cloud Computing");
            __CLR4_1_1022be22beluszwhum.R.inc(96363);company.setDescription("Developer of advanced data-centric cloud computing services");
            __CLR4_1_1022be22beluszwhum.R.inc(96364);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1022be22beluszwhum.R.inc(96365);Company company = new Company();
            __CLR4_1_1022be22beluszwhum.R.inc(96366);company.setId(createId());
            __CLR4_1_1022be22beluszwhum.R.inc(96367);company.setName("China Yahoo");
            __CLR4_1_1022be22beluszwhum.R.inc(96368);company.setDescription("One of China's leading Internet portals");
            __CLR4_1_1022be22beluszwhum.R.inc(96369);group.getCompanies().add(company);
        }

        __CLR4_1_1022be22beluszwhum.R.inc(96370);String jsonString = JSON.toJSONString(group, true);
        __CLR4_1_1022be22beluszwhum.R.inc(96371);System.out.println(jsonString);
    }finally{__CLR4_1_1022be22beluszwhum.R.flushNeeded();}}
}
