/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//**
 * <p>Title: FastJsonControllerTest.java</p>
 * <p>Description: FastJsonControllerTest</p>
 * <p>Package: com.alibaba.json.bvt.support.spring.controller</p>
 * <p>Company: www.github.com/DarkPhoenixs</p>
 * <p>Copyright: Dark Phoenixs (Open-Source Organization) 2016</p>
 */
package com.alibaba.json.bvt.support.spring.mock.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.json.bvt.support.spring.mock.entity.FastJsonEnumTestVO;
import com.alibaba.json.bvt.support.spring.mock.entity.FastJsonGenericityTestVO;
import com.alibaba.json.bvt.support.spring.mock.entity.FastJsonParentTestVO;
import com.alibaba.json.bvt.support.spring.mock.entity.FastJsonTestVO;
import com.alibaba.json.test.entity.Company;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * <p>Title: FastJsonControllerTest</p>
 * <p>Description: </p>
 *
 * @author Victor.Zxy
 * @version 1.0
 * @since 2016\u5e744\u670820\u65e5
 */
@Controller
@RequestMapping("fastjson")
public class FastJsonControllerTest {static class __CLR4_1_101y0m1y0mluszwfxd{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,90765,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    @RequestMapping("test1")
    public
    @ResponseBody
    JSONObject test1(@RequestBody FastJsonTestVO vo) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90742);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90743);JSONObject jsonObj = new JSONObject();

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90744);jsonObj.put("id", vo.getId());

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90745);jsonObj.put("name", vo.getName());

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90746);return jsonObj;
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}

    @RequestMapping("test2")
    public
    @ResponseBody
    JSONObject test1(@RequestBody List<FastJsonParentTestVO> vos) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90747);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90748);JSONObject jsonObj = new JSONObject();

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90749);for (FastJsonParentTestVO fastJsonParentTestVO : vos) {{

            __CLR4_1_101y0m1y0mluszwfxd.R.inc(90750);jsonObj.put(fastJsonParentTestVO.getName(), fastJsonParentTestVO.getSonList().size());
        }

        }__CLR4_1_101y0m1y0mluszwfxd.R.inc(90751);return jsonObj;
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}

    @ResponseBody
    @RequestMapping(value = "test3", method = RequestMethod.POST)
    public Company test3(HttpServletRequest request, HttpServletResponse response) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90752);
        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90753);Company company = new Company();
        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90754);return company;
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}

    @RequestMapping("test4")
    public
    @ResponseBody
    String test4(@RequestBody FastJsonGenericityTestVO<FastJsonTestVO> queryCondition) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90755);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90756);return JSON.toJSONString(queryCondition);
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}

    @RequestMapping("test5")
    public
    @ResponseBody
    String test5(@RequestBody FastJsonEnumTestVO vo) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90757);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90758);return JSON.toJSONString(vo);
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}

    @RequestMapping(value = "/test6", method = {RequestMethod.POST, RequestMethod.GET}, produces = {"text/plain", "application/*"})
    public
    @ResponseBody
    Object test6(@RequestParam long userId, @RequestParam boolean flag) {try{__CLR4_1_101y0m1y0mluszwfxd.R.inc(90759);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90760);JSONObject jsonObject = new JSONObject();

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90761);jsonObject.put("userId",userId);
        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90762);jsonObject.put("flag",flag);

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90763);System.out.println(jsonObject.toJSONString());

        __CLR4_1_101y0m1y0mluszwfxd.R.inc(90764);return jsonObject;
    }finally{__CLR4_1_101y0m1y0mluszwfxd.R.flushNeeded();}}
}
