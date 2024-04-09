/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.test;

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

public class GenerateJavaTest extends TestCase {static class __CLR4_5_222b322b3lusvnjxm{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,96361,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String     text;
    private AtomicLong idSeed = new AtomicLong();

    protected void setUp() throws Exception {try{__CLR4_5_222b322b3lusvnjxm.R.inc(96303);
        __CLR4_5_222b322b3lusvnjxm.R.inc(96304);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/page_model_cached.json");
        __CLR4_5_222b322b3lusvnjxm.R.inc(96305);text = IOUtils.toString(is);
        __CLR4_5_222b322b3lusvnjxm.R.inc(96306);is.close();
    }finally{__CLR4_5_222b322b3lusvnjxm.R.flushNeeded();}}

    private Long createId() {try{__CLR4_5_222b322b3lusvnjxm.R.inc(96307);
        __CLR4_5_222b322b3lusvnjxm.R.inc(96308);return idSeed.incrementAndGet();
    }finally{__CLR4_5_222b322b3lusvnjxm.R.flushNeeded();}}

    public void testGenerate() {__CLR4_5_222b322b3lusvnjxm.R.globalSliceStart(getClass().getName(),96309);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8ovhu22b9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_222b322b3lusvnjxm.R.rethrow($CLV_t2$);}finally{__CLR4_5_222b322b3lusvnjxm.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.GenerateJavaTest.testGenerate",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),96309,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8ovhu22b9(){try{__CLR4_5_222b322b3lusvnjxm.R.inc(96309);
        __CLR4_5_222b322b3lusvnjxm.R.inc(96310);Group group = new Group();

        __CLR4_5_222b322b3lusvnjxm.R.inc(96311);group.setName("Alibaba Group");
        __CLR4_5_222b322b3lusvnjxm.R.inc(96312);group.setDescription("Alibaba Group makes it easy for anyone to buy or sell online anywhere in the world. ");

        {
            __CLR4_5_222b322b3lusvnjxm.R.inc(96313);Company company = new Company();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96314);company.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96315);company.setName("Alibaba.com");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96316);company.setDescription("Global leader in e-commerce for small businesses");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96317);company.setStock("1688.HK");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96318);group.getCompanies().add(company);

            __CLR4_5_222b322b3lusvnjxm.R.inc(96319);Department root = new Department();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96320);root.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96321);root.setName("B2B");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96322);company.setRootDepartment(root);

            {
                __CLR4_5_222b322b3lusvnjxm.R.inc(96323);Department cbu = new Department();
                __CLR4_5_222b322b3lusvnjxm.R.inc(96324);cbu.setId(createId());
                __CLR4_5_222b322b3lusvnjxm.R.inc(96325);cbu.setName("CBU");

                __CLR4_5_222b322b3lusvnjxm.R.inc(96326);root.getChildren().add(cbu);

                __CLR4_5_222b322b3lusvnjxm.R.inc(96327);Employee emp0 = new Employee();
                __CLR4_5_222b322b3lusvnjxm.R.inc(96328);emp0.setName("\u6821\u957f");
                __CLR4_5_222b322b3lusvnjxm.R.inc(96329);emp0.setDescription("\u795e\u68cd\u654c\u4eba\u59d0");
                __CLR4_5_222b322b3lusvnjxm.R.inc(96330);emp0.setAge(3);
                __CLR4_5_222b322b3lusvnjxm.R.inc(96331);emp0.setSalary(new BigDecimal("123456789.0123"));
                __CLR4_5_222b322b3lusvnjxm.R.inc(96332);emp0.setBirthdate(new Date());
                __CLR4_5_222b322b3lusvnjxm.R.inc(96333);emp0.setBadboy(true);

                __CLR4_5_222b322b3lusvnjxm.R.inc(96334);cbu.getMembers().add(emp0);
            }
            {
                __CLR4_5_222b322b3lusvnjxm.R.inc(96335);Department icbu = new Department();
                __CLR4_5_222b322b3lusvnjxm.R.inc(96336);icbu.setId(createId());
                __CLR4_5_222b322b3lusvnjxm.R.inc(96337);icbu.setName("ICBU");

                __CLR4_5_222b322b3lusvnjxm.R.inc(96338);root.getChildren().add(icbu);
            }
        }

        {
            __CLR4_5_222b322b3lusvnjxm.R.inc(96339);Company company = new Company();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96340);company.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96341);company.setName("Taobao");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96342);company.setDescription("China's largest online retail website and one-stop platform for shopping, socializing and information sharing");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96343);group.getCompanies().add(company);
        }
        {
            __CLR4_5_222b322b3lusvnjxm.R.inc(96344);Company company = new Company();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96345);company.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96346);company.setName("Alipay");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96347);company.setDescription("China's leading third-party online payment platform");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96348);group.getCompanies().add(company);
        }
        {
            __CLR4_5_222b322b3lusvnjxm.R.inc(96349);Company company = new Company();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96350);company.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96351);company.setName("Alibaba Cloud Computing");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96352);company.setDescription("Developer of advanced data-centric cloud computing services");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96353);group.getCompanies().add(company);
        }
        {
            __CLR4_5_222b322b3lusvnjxm.R.inc(96354);Company company = new Company();
            __CLR4_5_222b322b3lusvnjxm.R.inc(96355);company.setId(createId());
            __CLR4_5_222b322b3lusvnjxm.R.inc(96356);company.setName("China Yahoo");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96357);company.setDescription("One of China's leading Internet portals");
            __CLR4_5_222b322b3lusvnjxm.R.inc(96358);group.getCompanies().add(company);
        }

        __CLR4_5_222b322b3lusvnjxm.R.inc(96359);String jsonString = JSON.toJSONString(group, true);
        __CLR4_5_222b322b3lusvnjxm.R.inc(96360);System.out.println(jsonString);
    }finally{__CLR4_5_222b322b3lusvnjxm.R.flushNeeded();}}
}
