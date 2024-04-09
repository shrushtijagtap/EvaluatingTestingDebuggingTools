/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.fastjson.deserializer.issues569;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.deserializer.issues569.beans.Dept;
import com.alibaba.fastjson.deserializer.issues569.beans.MyResponse;
import com.alibaba.fastjson.deserializer.issues569.parser.ParserConfigBug569;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.*;

/**
 * Author : BlackShadowWalker
 * Date   : 2016-10-10
 *
 * https://github.com/alibaba/fastjson/issues/569
 */
public class TestIssues569 {static class __CLR4_1_10vc9vc9lusqjvfi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,40640,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private int featureValues = JSON.DEFAULT_PARSER_FEATURE;
    private Feature[] features;

    private static final Feature[] EMPTY_SERIALIZER_FEATURES = new Feature[0];

    private String jsonData = "{\"result\":[{\"id\":0,\"startDate\":1420041600000,\"name\":\"\u96c6\u56e2\",\"abbr\":\"\u96c6\u56e2\",\"endDate\":253402185600000,\"type\":\"1317967b-4a83-442c-a7b4-1ac9e7bf84d9\"},{\"id\":0,\"startDate\":1420041600000,\"name\":\"\u96c6\u56e2\u603b\u88c1\u529e\",\"abbr\":\"\u96c6\u56e2\u603b\u88c1\u529e\",\"endDate\":253402185600000,\"pcode\":\"4aa2817e-ae16-4355-a1cc-a73d0b8abc43\",\"type\":\"36e9bde9-2e94-4b91-8b9f-b1078296e3ad\"}],\"errCode\":0,\"success\":true}";

    private Type mType1;//MyResponse
    private Type mType;//MyResponse<List<Dept>>

    ParserConfig config = ParserConfig.getGlobalInstance();
    ParserConfig configBug569 = new ParserConfigBug569();//\u8fd9\u4e2a\u662f\u5305\u542bbug\u7684\u4ee3\u7801

    @Before
    public void init() {try{__CLR4_1_10vc9vc9lusqjvfi.R.inc(40617);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40618);mType = new TypeReference<MyResponse<List<Dept>>>() {
        }.getType();
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40619);mType1 = new TypeReference<MyResponse>() {
        }.getType();
    }finally{__CLR4_1_10vc9vc9lusqjvfi.R.flushNeeded();}}

    //\u590d\u73b0
    @Test
    public void testBug569() {__CLR4_1_10vc9vc9lusqjvfi.R.globalSliceStart(getClass().getName(),40620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hklcotvcc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10vc9vc9lusqjvfi.R.rethrow($CLV_t2$);}finally{__CLR4_1_10vc9vc9lusqjvfi.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.deserializer.issues569.TestIssues569.testBug569",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),40620,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hklcotvcc(){try{__CLR4_1_10vc9vc9lusqjvfi.R.inc(40620);
        //\u7b2c\u4e00\u6b21\u53cd\u5e8f\u5217\u5316\u662f\u4f7f\u7528\u7684 MyResponse\uff0c \u6ca1\u6709\u6307\u5b9a\u6cdb\u578b\u7c7b\u578b\uff0c\u8c8c\u4f3c\u4f1a\u7f13\u5b58 MyResponse\uff0c \u540e\u9762\u5728\u8c03\u7528\u7684MyResponse<?>\u53cd\u5e8f\u5217\u5316\u5c31\u53d7\u5f71\u54cd\u4e86
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40621);MyResponse resp1 = JSON.parseObject(jsonData, mType1, configBug569, featureValues,
                (((features != null )&&(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40622)!=0|true))||(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40623)==0&false))? features : EMPTY_SERIALIZER_FEATURES);

        //expect MyResponse<JSONArray<JSONObject>>
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40624);MyResponse resp = JSON.parseObject(jsonData, mType, configBug569, featureValues,
                (((features != null )&&(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40625)!=0|true))||(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40626)==0&false))? features : EMPTY_SERIALIZER_FEATURES);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40627);Assert.assertNotNull(resp);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40628);Assert.assertNotNull(resp.getResult());
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40629);Assert.assertEquals(JSONArray.class, resp.getResult().getClass());//\u8fd9\u91cc\u4f1a\u53d7\u5230 resp1 \u7684\u5f71\u54cd
    }finally{__CLR4_1_10vc9vc9lusqjvfi.R.flushNeeded();}}

    //\u4fee\u590d
    @Test
    public void testFixBug569() {__CLR4_1_10vc9vc9lusqjvfi.R.globalSliceStart(getClass().getName(),40630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10lg1byqvcm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10vc9vc9lusqjvfi.R.rethrow($CLV_t2$);}finally{__CLR4_1_10vc9vc9lusqjvfi.R.globalSliceEnd(getClass().getName(),"com.alibaba.fastjson.deserializer.issues569.TestIssues569.testFixBug569",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),40630,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10lg1byqvcm(){try{__CLR4_1_10vc9vc9lusqjvfi.R.inc(40630);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40631);MyResponse resp1 = JSON.parseObject(jsonData, mType1, config, featureValues,
                (((features != null )&&(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40632)!=0|true))||(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40633)==0&false))? features : EMPTY_SERIALIZER_FEATURES);

        //expect MyResponse<List<Dept>>
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40634);MyResponse resp = JSON.parseObject(jsonData, mType, config, featureValues,
                (((features != null )&&(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40635)!=0|true))||(__CLR4_1_10vc9vc9lusqjvfi.R.iget(40636)==0&false))? features : EMPTY_SERIALIZER_FEATURES);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40637);Assert.assertNotNull(resp);
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40638);Assert.assertNotNull(resp.getResult());
        __CLR4_1_10vc9vc9lusqjvfi.R.inc(40639);Assert.assertEquals(ArrayList.class, resp.getResult().getClass());
    }finally{__CLR4_1_10vc9vc9lusqjvfi.R.flushNeeded();}}

}
