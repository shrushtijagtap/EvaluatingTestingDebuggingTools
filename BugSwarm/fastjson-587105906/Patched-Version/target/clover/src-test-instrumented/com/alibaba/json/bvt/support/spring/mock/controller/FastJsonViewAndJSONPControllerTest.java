/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.support.spring.mock.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.support.spring.annotation.FastJsonFilter;
import com.alibaba.fastjson.support.spring.annotation.FastJsonView;
import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;
import com.alibaba.json.bvt.support.spring.mock.entity.FastJsonEnumTestVO;
import com.alibaba.json.test.entity.Company;
import com.alibaba.json.test.entity.Department;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.Callable;

/**
 * FastJsonView\u6ce8\u89e3\u6d4b\u8bd5controller
 * Created by yanquanyu on 17-5-31.
 */
@ResponseJSONP
@Controller
@RequestMapping("jsonp-fastjsonview")
public class FastJsonViewAndJSONPControllerTest {static class __CLR4_5_21y0y1y0ylusvnhfy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,90805,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @ResponseJSONP
    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test1() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2mtjo951y0y();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90754,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2mtjo951y0y(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90754);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90755);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90756);company.setId(100L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90757);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90758);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90759);company.setStock("haha");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90760);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}


    @ResponseJSONP
    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test2() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90761);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2ro8bgo1y15();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90761,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2ro8bgo1y15(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90761);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90762);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90763);company.setId(100L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90764);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90765);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90766);company.setStock("haha");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90767);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public Company test3() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90768);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2wiwyo71y1c();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90768,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2wiwyo71y1c(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90768);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90769);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90770);company.setId(100L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90771);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90772);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90773);company.setStock("haha");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90774);Department department = new Department();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90775);department.setName("\u90e8\u95e81");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90776);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90777);department.setId(1L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90778);company.setRootDepartment(department);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90779);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description", "memebers", "children"})})
    public Company test4() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90780);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2xnig3e1y1o();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90780,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2xnig3e1y1o(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90780);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90781);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90782);company.setId(100L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90783);company.setName("\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90784);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90785);company.setStock("haha");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90786);Department department = new Department();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90787);department.setName("\u90e8\u95e81");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90788);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90789);department.setId(1L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90790);company.setRootDepartment(department);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90791);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test5")
    public
    @ResponseBody
    String test5(@RequestBody FastJsonEnumTestVO vo) {try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90792);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90793);return JSON.toJSONString(vo);
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}

    @ResponseJSONP(callback = "customizedCallbackParamName")
    @RequestMapping("test7")
    public Company test7() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90794);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_2j3gigt1y22();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test7",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90794,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_2j3gigt1y22(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90794);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90795);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90796);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test8")
    public Callable<Company> test8(){__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90797);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Callable<Company> $CLV_r$=__CLR4_5_2u5s8u21y25();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test8",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90797,$CLV_p$,$CLV_t$);}}private Callable<Company>  __CLR4_5_2u5s8u21y25(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90797);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90798);return new Callable<Company>() {
            public Company call() throws Exception {try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90799);
                __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90800);return new Company();
            }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}
        };
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}


    //\u4f7f\u7528\u7c7b\u4e0a\u9762\u6ce8\u89e3\u7684 @ResponseJSONP
    @RequestMapping("test9")
    public Company test9() {__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceStart(getClass().getName(),90801);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_5_29e381r1y29();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21y0y1y0ylusvnhfy.R.rethrow($CLV_t2$);return null;}finally{__CLR4_5_21y0y1y0ylusvnhfy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test9",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),90801,$CLV_p$,$CLV_t$);}}private Company  __CLR4_5_29e381r1y29(){try{__CLR4_5_21y0y1y0ylusvnhfy.R.inc(90801);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90802);Company company = new Company();
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90803);company.setId(100L);
        __CLR4_5_21y0y1y0ylusvnhfy.R.inc(90804);return company;
    }finally{__CLR4_5_21y0y1y0ylusvnhfy.R.flushNeeded();}}
}
