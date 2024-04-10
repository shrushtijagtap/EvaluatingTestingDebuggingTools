/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ *//*
 * Copyright 2011 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.alibaba.json.bvt.bug;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.json.bvtVO.OptionKey;
import com.alibaba.json.bvtVO.OptionValue;
import com.alibaba.json.bvtVO.TempAttachMetaOption;

/**
 * \u7c7bSerDeserTest.java\u7684\u5b9e\u73b0\u63cf\u8ff0\uff1aTODO \u7c7b\u5b9e\u73b0\u63cf\u8ff0
 * 
 * @author lei.yaol 2011-12-27 \u4e0b\u534803:44:18
 */
public class SerDeserTest extends TestCase {static class __CLR4_1_1018ub18ubluszwa2y{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,58137,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    protected void setUp() throws Exception {try{__CLR4_1_1018ub18ubluszwa2y.R.inc(58115);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58116);com.alibaba.fastjson.parser.ParserConfig.global.addAccept("com.alibaba.json.bvtVO.");
    }finally{__CLR4_1_1018ub18ubluszwa2y.R.flushNeeded();}}

    /** \u7528\u4e8e\u88abFastJson\u5e8f\u5217\u548c\u53cd\u5e8f\u5217\u5316\u7684\u5bf9\u8c61 */
    private static Map<OptionKey, OptionValue<?>> options;

    static {try{__CLR4_1_1018ub18ubluszwa2y.R.inc(58117);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58118);options = new HashMap<OptionKey, OptionValue<?>>();

        __CLR4_1_1018ub18ubluszwa2y.R.inc(58119);TempAttachMetaOption attach = new TempAttachMetaOption();
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58120);attach.setId(1000);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58121);attach.setName("test_name");
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58122);attach.setPath("http://alibaba-inc.com/test.txt");

        __CLR4_1_1018ub18ubluszwa2y.R.inc(58123);ArrayList<TempAttachMetaOption> attachList = new ArrayList<TempAttachMetaOption>();
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58124);attachList.add(attach);

        // \u8bbe\u7f6evalue
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58125);OptionValue<ArrayList<TempAttachMetaOption>> optionValue = new OptionValue<ArrayList<TempAttachMetaOption>>();
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58126);optionValue.setValue(attachList);

        __CLR4_1_1018ub18ubluszwa2y.R.inc(58127);options.put(OptionKey.TEMPALTE_ATTACH_META, optionValue);
    }finally{__CLR4_1_1018ub18ubluszwa2y.R.flushNeeded();}}

    public void test_for_yaolei() {__CLR4_1_1018ub18ubluszwa2y.R.globalSliceStart(getClass().getName(),58128);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c7u6tv18uo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1018ub18ubluszwa2y.R.rethrow($CLV_t2$);}finally{__CLR4_1_1018ub18ubluszwa2y.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.SerDeserTest.test_for_yaolei",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),58128,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c7u6tv18uo(){try{__CLR4_1_1018ub18ubluszwa2y.R.inc(58128);
        // \u5e8f\u5217\u5316toJSONString()
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58129);String jsonString = JSON.toJSONString(options);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58130);System.out.println(jsonString);
        {
            // \u53cd\u5e8f\u5217\u5316parse()
            __CLR4_1_1018ub18ubluszwa2y.R.inc(58131);HashMap<OptionKey, OptionValue<?>> deserOptions = (HashMap<OptionKey, OptionValue<?>>) JSON.parseObject(jsonString,
                                                                                                                    new TypeReference<HashMap<OptionKey, OptionValue<?>>>() {

                                                                                                                    });
            __CLR4_1_1018ub18ubluszwa2y.R.inc(58132);System.out.println(deserOptions.get(OptionKey.TEMPALTE_ATTACH_META));
        }

        // \u5e8f\u5217\u5316toJSONString(,)
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58133);jsonString = JSON.toJSONString(options, SerializerFeature.WriteClassName);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58134);System.out.println(jsonString);
        // \u53cd\u5e8f\u5217\u5316parse()
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58135);HashMap<OptionKey, OptionValue<?>> deserOptions = (HashMap<OptionKey, OptionValue<?>>) JSON.parse(jsonString);
        __CLR4_1_1018ub18ubluszwa2y.R.inc(58136);System.out.println(deserOptions.get(OptionKey.TEMPALTE_ATTACH_META));
    }finally{__CLR4_1_1018ub18ubluszwa2y.R.flushNeeded();}}
}
