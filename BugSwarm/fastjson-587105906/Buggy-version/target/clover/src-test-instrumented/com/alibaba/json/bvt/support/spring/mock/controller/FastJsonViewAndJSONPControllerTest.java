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
public class FastJsonViewAndJSONPControllerTest {static class __CLR4_1_101x311x31lusqkmnc{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,89584,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;


    @ResponseJSONP
    @RequestMapping("test1")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test1() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89533);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10mtjo951x31();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89533,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10mtjo951x31(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89533);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89534);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89535);company.setId(100L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89536);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89537);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89538);company.setStock("haha");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89539);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}


    @ResponseJSONP
    @RequestMapping("test2")
    @FastJsonView(
            exclude = {@FastJsonFilter(clazz = Company.class,props ={"id","name"})})
    public Company test2() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89540);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10ro8bgo1x38();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89540,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10ro8bgo1x38(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89540);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89541);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89542);company.setId(100L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89543);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89544);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89545);company.setStock("haha");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89546);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test3")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"}),@FastJsonFilter(clazz = Department.class,props = {"description"})})
    public Company test3() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89547);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10wiwyo71x3f();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89547,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10wiwyo71x3f(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89547);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89548);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89549);company.setId(100L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89550);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89551);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89552);company.setStock("haha");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89553);Department department = new Department();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89554);department.setName("\u90e8\u95e81");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89555);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89556);department.setId(1L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89557);company.setRootDepartment(department);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89558);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test4")
    @FastJsonView(
            include = {@FastJsonFilter(clazz = Company.class,props ={"id","name","rootDepartment"})},
            exclude = {@FastJsonFilter(clazz = Department.class,props = {"description", "memebers", "children"})})
    public Company test4() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89559);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10xnig3e1x3r();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89559,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10xnig3e1x3r(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89559);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89560);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89561);company.setId(100L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89562);company.setName("\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89563);company.setDescription("fastjsonview\u6ce8\u89e3\u6d4b\u8bd5");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89564);company.setStock("haha");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89565);Department department = new Department();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89566);department.setName("\u90e8\u95e81");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89567);department.setDescription("\u90e8\u95e81\u63cf\u8ff0");
        __CLR4_1_101x311x31lusqkmnc.R.inc(89568);department.setId(1L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89569);company.setRootDepartment(department);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89570);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test5")
    public
    @ResponseBody
    String test5(@RequestBody FastJsonEnumTestVO vo) {try{__CLR4_1_101x311x31lusqkmnc.R.inc(89571);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89572);return JSON.toJSONString(vo);
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}

    @ResponseJSONP(callback = "customizedCallbackParamName")
    @RequestMapping("test7")
    public Company test7() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89573);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_10j3gigt1x45();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89573,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_10j3gigt1x45(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89573);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89574);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89575);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}

    @ResponseJSONP
    @RequestMapping("test8")
    public Callable<Company> test8(){__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89576);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Callable<Company> $CLV_r$=__CLR4_1_10u5s8u21x48();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89576,$CLV_p$,$CLV_t$);}}private Callable<Company>  __CLR4_1_10u5s8u21x48(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89576);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89577);return new Callable<Company>() {
            public Company call() throws Exception {try{__CLR4_1_101x311x31lusqkmnc.R.inc(89578);
                __CLR4_1_101x311x31lusqkmnc.R.inc(89579);return new Company();
            }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}
        };
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}


    //\u4f7f\u7528\u7c7b\u4e0a\u9762\u6ce8\u89e3\u7684 @ResponseJSONP
    @RequestMapping("test9")
    public Company test9() {__CLR4_1_101x311x31lusqkmnc.R.globalSliceStart(getClass().getName(),89580);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{Company $CLV_r$=__CLR4_1_109e381r1x4c();$CLV_p$=1;return $CLV_r$;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101x311x31lusqkmnc.R.rethrow($CLV_t2$);return null;}finally{__CLR4_1_101x311x31lusqkmnc.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.support.spring.mock.controller.FastJsonViewAndJSONPControllerTest.test9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),89580,$CLV_p$,$CLV_t$);}}private Company  __CLR4_1_109e381r1x4c(){try{__CLR4_1_101x311x31lusqkmnc.R.inc(89580);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89581);Company company = new Company();
        __CLR4_1_101x311x31lusqkmnc.R.inc(89582);company.setId(100L);
        __CLR4_1_101x311x31lusqkmnc.R.inc(89583);return company;
    }finally{__CLR4_1_101x311x31lusqkmnc.R.flushNeeded();}}
}
