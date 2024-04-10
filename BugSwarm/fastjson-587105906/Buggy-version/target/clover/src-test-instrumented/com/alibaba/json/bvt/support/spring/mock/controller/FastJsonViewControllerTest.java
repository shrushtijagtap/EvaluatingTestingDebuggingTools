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
public class FastJsonViewControllerTest {static class __CLR4_1_101y2o1y2oluszwfz9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90873,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test1() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10mtjo951y2o();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90816,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10mtjo951y2o(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90816);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90817);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90818);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90819);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90820);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90821);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90822);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}

    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test2() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ro8bgo1y2v();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90823,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ro8bgo1y2v(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90823);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90824);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90825);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90826);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90827);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90828);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90829);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}

    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test3() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10wiwyo71y32();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90830,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10wiwyo71y32(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90830);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90831);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90832);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90833);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90834);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90835);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90836);Department department = new Department();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90837);department.setName("\u90e8\u95e81");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90838);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90839);department.setId(1L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90840);company.setRootDepartment(department);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90841);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}

    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test4() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10xnig3e1y3e();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90842,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10xnig3e1y3e(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90842);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90843);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90844);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90845);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90846);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90847);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90848);Department department = new Department();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90849);department.setName("\u90e8\u95e81");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90850);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90851);department.setId(1L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90852);company.setRootDepartment(department);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90853);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}

    @RequestMapping("test5")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test5() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10sstsvv1y3q();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90854,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10sstsvv1y3q(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90854);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90855);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90856);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90857);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90858);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90859);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90860);Department department = new Department();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90861);department.setName("\u90e8\u95e81");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90862);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90863);department.setId(1L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90864);company.setRootDepartment(department);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90865);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}

    @RequestMapping("test6")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id"})},
            exclude = {@FastJsonFilter(clazz = Company.class,props = {"name"})})
    public @ResponseBody Company test6() {__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceStart(getClass().getName(),90866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ny55oc1y42();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y2o1y2oluszwfz9.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y2o1y2oluszwfz9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90866,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ny55oc1y42(){try{__CLR4_1_101y2o1y2oluszwfz9.R.inc(90866);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90867);Company company = new Company();
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90868);company.setId(100L);
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90869);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90870);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90871);company.setStock("haha");
        __CLR4_1_101y2o1y2oluszwfz9.R.inc(90872);return company;
    }finally{__CLR4_1_101y2o1y2oluszwfz9.R.flushNeeded();}}
}
