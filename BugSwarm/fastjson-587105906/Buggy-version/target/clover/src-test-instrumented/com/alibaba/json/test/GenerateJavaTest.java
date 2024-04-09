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

public class GenerateJavaTest extends TestCase {static class __CLR4_1_1021d621d6lusqkrjj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,95140,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private String     text;
    private AtomicLong idSeed = new AtomicLong();

    protected void setUp() throws Exception {try{__CLR4_1_1021d621d6lusqkrjj.R.inc(95082);
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95083);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("json/page_model_cached.json");
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95084);text = IOUtils.toString(is);
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95085);is.close();
    }finally{__CLR4_1_1021d621d6lusqkrjj.R.flushNeeded();}}

    private Long createId() {try{__CLR4_1_1021d621d6lusqkrjj.R.inc(95086);
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95087);return idSeed.incrementAndGet();
    }finally{__CLR4_1_1021d621d6lusqkrjj.R.flushNeeded();}}

    public void testGenerate() {__CLR4_1_1021d621d6lusqkrjj.R.globalSliceStart(getClass().getName(),95088);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8ovhu21dc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1021d621d6lusqkrjj.R.rethrow($CLV_t2$);}finally{__CLR4_1_1021d621d6lusqkrjj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.test.GenerateJavaTest.testGenerate",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),95088,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8ovhu21dc(){try{__CLR4_1_1021d621d6lusqkrjj.R.inc(95088);
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95089);Group group = new Group();

        __CLR4_1_1021d621d6lusqkrjj.R.inc(95090);group.setName("Alibaba Group");
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95091);group.setDescription("Alibaba Group makes it easy for anyone to buy or sell online anywhere in the world. ");

        {
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95092);Company company = new Company();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95093);company.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95094);company.setName("Alibaba.com");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95095);company.setDescription("Global leader in e-commerce for small businesses");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95096);company.setStock("1688.HK");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95097);group.getCompanies().add(company);

            __CLR4_1_1021d621d6lusqkrjj.R.inc(95098);Department root = new Department();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95099);root.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95100);root.setName("B2B");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95101);company.setRootDepartment(root);

            {
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95102);Department cbu = new Department();
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95103);cbu.setId(createId());
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95104);cbu.setName("CBU");

                __CLR4_1_1021d621d6lusqkrjj.R.inc(95105);root.getChildren().add(cbu);

                __CLR4_1_1021d621d6lusqkrjj.R.inc(95106);Employee emp0 = new Employee();
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95107);emp0.setName("\u6821\u957f");
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95108);emp0.setDescription("\u795e\u68cd\u654c\u4eba\u59d0");
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95109);emp0.setAge(3);
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95110);emp0.setSalary(new BigDecimal("123456789.0123"));
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95111);emp0.setBirthdate(new Date());
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95112);emp0.setBadboy(true);

                __CLR4_1_1021d621d6lusqkrjj.R.inc(95113);cbu.getMembers().add(emp0);
            }
            {
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95114);Department icbu = new Department();
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95115);icbu.setId(createId());
                __CLR4_1_1021d621d6lusqkrjj.R.inc(95116);icbu.setName("ICBU");

                __CLR4_1_1021d621d6lusqkrjj.R.inc(95117);root.getChildren().add(icbu);
            }
        }

        {
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95118);Company company = new Company();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95119);company.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95120);company.setName("Taobao");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95121);company.setDescription("China's largest online retail website and one-stop platform for shopping, socializing and information sharing");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95122);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95123);Company company = new Company();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95124);company.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95125);company.setName("Alipay");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95126);company.setDescription("China's leading third-party online payment platform");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95127);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95128);Company company = new Company();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95129);company.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95130);company.setName("Alibaba Cloud Computing");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95131);company.setDescription("Developer of advanced data-centric cloud computing services");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95132);group.getCompanies().add(company);
        }
        {
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95133);Company company = new Company();
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95134);company.setId(createId());
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95135);company.setName("China Yahoo");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95136);company.setDescription("One of China's leading Internet portals");
            __CLR4_1_1021d621d6lusqkrjj.R.inc(95137);group.getCompanies().add(company);
        }

        __CLR4_1_1021d621d6lusqkrjj.R.inc(95138);String jsonString = JSON.toJSONString(group, true);
        __CLR4_1_1021d621d6lusqkrjj.R.inc(95139);System.out.println(jsonString);
    }finally{__CLR4_1_1021d621d6lusqkrjj.R.flushNeeded();}}
}
