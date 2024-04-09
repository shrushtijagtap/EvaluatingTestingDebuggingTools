/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.controller;

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
public class FastJsonViewControllerTest {static class __CLR4_5_21y2d1y2dlusvnhi1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90862,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test1() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2mtjo951y2d();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90805,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2mtjo951y2d(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90805);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90806);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90807);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90808);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90809);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90810);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90811);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}

    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public @ResponseBody Company test2() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2ro8bgo1y2k();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90812,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2ro8bgo1y2k(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90812);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90813);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90814);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90815);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90816);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90817);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90818);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}

    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test3() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90819);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2wiwyo71y2r();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90819,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2wiwyo71y2r(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90819);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90820);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90821);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90822);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90823);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90824);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90825);Department department = new Department();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90826);department.setName("\u90e8\u95e81");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90827);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90828);department.setId(1L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90829);company.setRootDepartment(department);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90830);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}

    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test4() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90831);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2xnig3e1y33();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90831,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2xnig3e1y33(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90831);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90832);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90833);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90834);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90835);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90836);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90837);Department department = new Department();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90838);department.setName("\u90e8\u95e81");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90839);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90840);department.setId(1L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90841);company.setRootDepartment(department);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90842);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}

    @RequestMapping("test5")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public @ResponseBody Company test5() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2sstsvv1y3f();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90843,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2sstsvv1y3f(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90843);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90844);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90845);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90846);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90847);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90848);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90849);Department department = new Department();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90850);department.setName("\u90e8\u95e81");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90851);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90852);department.setId(1L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90853);company.setRootDepartment(department);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90854);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}

    @RequestMapping("test6")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id"})},
            exclude = {@FastJsonFilter(clazz = Company.class,props = {"name"})})
    public @ResponseBody Company test6() {__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceStart(getClass().getName(),90855);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2ny55oc1y3r();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y2d1y2dlusvnhi1.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y2d1y2dlusvnhi1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewControllerTest.test6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90855,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2ny55oc1y3r(){try{__CLR4_5_21y2d1y2dlusvnhi1.R.inc(90855);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90856);Company company = new Company();
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90857);company.setId(100L);
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90858);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90859);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90860);company.setStock("haha");
        __CLR4_5_21y2d1y2dlusvnhi1.R.inc(90861);return company;
    }finally{__CLR4_5_21y2d1y2dlusvnhi1.R.flushNeeded();}}
}
