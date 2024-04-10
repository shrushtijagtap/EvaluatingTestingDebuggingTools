/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.support.spring.mock.controller;

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
public class FastJsonViewAndJSONPControllerTest {static class __CLR4_1_101y191y19luszwfxx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90816,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @ResponseJSONP
    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test1() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90765);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10mtjo951y19();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90765,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10mtjo951y19(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90765);
        __CLR4_1_101y191y19luszwfxx.R.inc(90766);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90767);company.setId(100L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90768);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90769);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90770);company.setStock("haha");
        __CLR4_1_101y191y19luszwfxx.R.inc(90771);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}


    @ResponseJSONP
    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test2() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90772);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ro8bgo1y1g();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90772,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ro8bgo1y1g(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90772);
        __CLR4_1_101y191y19luszwfxx.R.inc(90773);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90774);company.setId(100L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90775);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90776);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90777);company.setStock("haha");
        __CLR4_1_101y191y19luszwfxx.R.inc(90778);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public Company test3() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90779);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10wiwyo71y1n();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90779,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10wiwyo71y1n(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90779);
        __CLR4_1_101y191y19luszwfxx.R.inc(90780);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90781);company.setId(100L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90782);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90783);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90784);company.setStock("haha");
        __CLR4_1_101y191y19luszwfxx.R.inc(90785);Department department = new Department();
        __CLR4_1_101y191y19luszwfxx.R.inc(90786);department.setName("\u90e8\u95e81");
        __CLR4_1_101y191y19luszwfxx.R.inc(90787);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101y191y19luszwfxx.R.inc(90788);department.setId(1L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90789);company.setRootDepartment(department);
        __CLR4_1_101y191y19luszwfxx.R.inc(90790);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description", "memebers", "children"})})
    public Company test4() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90791);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10xnig3e1y1z();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90791,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10xnig3e1y1z(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90791);
        __CLR4_1_101y191y19luszwfxx.R.inc(90792);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90793);company.setId(100L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90794);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90795);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101y191y19luszwfxx.R.inc(90796);company.setStock("haha");
        __CLR4_1_101y191y19luszwfxx.R.inc(90797);Department department = new Department();
        __CLR4_1_101y191y19luszwfxx.R.inc(90798);department.setName("\u90e8\u95e81");
        __CLR4_1_101y191y19luszwfxx.R.inc(90799);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101y191y19luszwfxx.R.inc(90800);department.setId(1L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90801);company.setRootDepartment(department);
        __CLR4_1_101y191y19luszwfxx.R.inc(90802);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test5")
    public
    @ResponseBody
    String test5(@RequestBody FastJsonEnumTestVO vo) {try{__CLR4_1_101y191y19luszwfxx.R.inc(90803);
        __CLR4_1_101y191y19luszwfxx.R.inc(90804);return JSON.toJSONString(vo);
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}

    @ResponseJSONP(callback = "customizedCallbackParamName")
    @RequestMapping("test7")
    public Company test7() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90805);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10j3gigt1y2d();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90805,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10j3gigt1y2d(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90805);
        __CLR4_1_101y191y19luszwfxx.R.inc(90806);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90807);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test8")
    public Callable<Company> test8(){__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90808);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Callable<Company> $CLV_r$=__CLR4_1_10u5s8u21y2g();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90808,$CLV_p$,$CLV_t$);}}private Callable<Company>  __CLR4_1_10u5s8u21y2g(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90808);
        __CLR4_1_101y191y19luszwfxx.R.inc(90809);return new Callable<Company>() {
            public Company call() throws Exception {try{__CLR4_1_101y191y19luszwfxx.R.inc(90810);
                __CLR4_1_101y191y19luszwfxx.R.inc(90811);return new Company();
            }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}
        };
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}


    //\u4f7f\u7528\u7c7b\u4e0a\u9762\u6ce8\u89e3\u7684 @ResponseJSONP
    @RequestMapping("test9")
    public Company test9() {__CLR4_1_101y191y19luszwfxx.R.globalSliceStart(getClass().getName(),90812);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_109e381r1y2k();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101y191y19luszwfxx.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101y191y19luszwfxx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),90812,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_109e381r1y2k(){try{__CLR4_1_101y191y19luszwfxx.R.inc(90812);
        __CLR4_1_101y191y19luszwfxx.R.inc(90813);Company company = new Company();
        __CLR4_1_101y191y19luszwfxx.R.inc(90814);company.setId(100L);
        __CLR4_1_101y191y19luszwfxx.R.inc(90815);return company;
    }finally{__CLR4_1_101y191y19luszwfxx.R.flushNeeded();}}
}
