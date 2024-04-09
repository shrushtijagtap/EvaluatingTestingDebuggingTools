/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.mock.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.alibaba.json.test.entity.Company;
import com.alibaba.json.test.entity.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * FastJsonView\u6ce8\u89e3\u6d4b\u8bd5controller
 * Created by yanquanyu on 17-5-31.
 */
@Controller
@RequestMapping("fastjsonview")
public class FastJsonViewControllerTest {static class __CLR4_1_101x4g1x4glusqkmot{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89641,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test1() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89584);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10mtjo951x4g();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89584,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10mtjo951x4g(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89584);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89585);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89586);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89587);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89588);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89589);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89590);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}

    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test2() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89591);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ro8bgo1x4n();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89591,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ro8bgo1x4n(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89591);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89592);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89593);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89594);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89595);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89596);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89597);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}

    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test3() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10wiwyo71x4u();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89598,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10wiwyo71x4u(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89598);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89599);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89600);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89601);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89602);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89603);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89604);Department department = new Department();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89605);department.setName("\u90e8\u95e81");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89606);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89607);department.setId(1L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89608);company.setRootDepartment(department);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89609);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}

    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test4() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89610);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10xnig3e1x56();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89610,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10xnig3e1x56(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89610);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89611);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89612);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89613);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89614);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89615);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89616);Department department = new Department();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89617);department.setName("\u90e8\u95e81");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89618);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89619);department.setId(1L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89620);company.setRootDepartment(department);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89621);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}

    @RequestMapping("test5")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test5() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10sstsvv1x5i();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89622,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10sstsvv1x5i(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89622);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89623);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89624);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89625);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89626);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89627);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89628);Department department = new Department();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89629);department.setName("\u90e8\u95e81");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89630);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89631);department.setId(1L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89632);company.setRootDepartment(department);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89633);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}

    @RequestMapping("test6")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id"})},
            exclude = {@FastJsonFilter(clazz = Company.class,props = {"name"})})
    public @ResponseBody Company test6() {__CLR4_1_101x4g1x4glusqkmot.R.globalSliceStart(getClass().getName(),89634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ny55oc1x5u();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x4g1x4glusqkmot.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x4g1x4glusqkmot.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89634,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ny55oc1x5u(){try{__CLR4_1_101x4g1x4glusqkmot.R.inc(89634);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89635);Company company = new Company();
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89636);company.setId(100L);
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89637);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89638);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89639);company.setStock("haha");
        __CLR4_1_101x4g1x4glusqkmot.R.inc(89640);return company;
    }finally{__CLR4_1_101x4g1x4glusqkmot.R.flushNeeded();}}
}
