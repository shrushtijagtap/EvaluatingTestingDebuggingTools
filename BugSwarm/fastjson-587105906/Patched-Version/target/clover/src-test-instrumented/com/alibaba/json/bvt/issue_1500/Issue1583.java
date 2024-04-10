/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1500;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Issue1583 extends TestCase {static class __CLR4_5_21bus1buslusyjsxi{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62036,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_issue() throws Exception {__CLR4_5_21bus1buslusyjsxi.R.globalSliceStart(getClass().getName(),62020);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_215xljh1bus();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21bus1buslusyjsxi.R.rethrow($CLV_t2$);}finally{__CLR4_5_21bus1buslusyjsxi.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1500.Issue1583.test_issue",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62020,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_215xljh1bus() throws Exception{try{__CLR4_5_21bus1buslusyjsxi.R.inc(62020);
        __CLR4_5_21bus1buslusyjsxi.R.inc(62021);Map<String, List<String>> totalMap = new HashMap<String, List<String>>();
        __CLR4_5_21bus1buslusyjsxi.R.inc(62022);for (int i = 0; (((i < 10)&&(__CLR4_5_21bus1buslusyjsxi.R.iget(62023)!=0|true))||(__CLR4_5_21bus1buslusyjsxi.R.iget(62024)==0&false)); i++) {{
            __CLR4_5_21bus1buslusyjsxi.R.inc(62025);List<String> list = new ArrayList<String>();
            __CLR4_5_21bus1buslusyjsxi.R.inc(62026);for (int j = 0; (((j < 2)&&(__CLR4_5_21bus1buslusyjsxi.R.iget(62027)!=0|true))||(__CLR4_5_21bus1buslusyjsxi.R.iget(62028)==0&false)); j++) {{
                __CLR4_5_21bus1buslusyjsxi.R.inc(62029);list.add("list" + j);
            }
            }__CLR4_5_21bus1buslusyjsxi.R.inc(62030);totalMap.put("map" + i, list);
        }
        }__CLR4_5_21bus1buslusyjsxi.R.inc(62031);List<Map.Entry<String, List<String>>> mapList = new ArrayList<Map.Entry<String, List<String>>>(totalMap.entrySet());
        __CLR4_5_21bus1buslusyjsxi.R.inc(62032);String jsonString = JSON.toJSONString(mapList, SerializerFeature.DisableCircularReferenceDetect);

        __CLR4_5_21bus1buslusyjsxi.R.inc(62033);System.out.println(jsonString);
        __CLR4_5_21bus1buslusyjsxi.R.inc(62034);List<Map.Entry<String, List<String>>> parse = JSON.parseObject(jsonString, new TypeReference<List<Map.Entry<String, List<String>>>>() {});
        __CLR4_5_21bus1buslusyjsxi.R.inc(62035);System.out.println(parse);
    }finally{__CLR4_5_21bus1buslusyjsxi.R.flushNeeded();}}
}
