/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by wenshao on 05/08/2017.
 */
public class Issue1371 extends TestCase {static class __CLR4_5_21b7a1b7alusvn9xp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,61179,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private enum Rooms{
        A, B, C, D ,E ;
    }

    public void testFastjsonEnum(){__CLR4_5_21b7a1b7alusvn9xp.R.globalSliceStart(getClass().getName(),61174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yihlz61b7a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21b7a1b7alusvn9xp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21b7a1b7alusvn9xp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1371.testFastjsonEnum",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),61174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yihlz61b7a(){try{__CLR4_5_21b7a1b7alusvn9xp.R.inc(61174);

        __CLR4_5_21b7a1b7alusvn9xp.R.inc(61175);Map<Rooms, Rooms> enumMap = new TreeMap<Rooms, Rooms>();

        __CLR4_5_21b7a1b7alusvn9xp.R.inc(61176);enumMap.put(Rooms.C, Rooms.D);
        __CLR4_5_21b7a1b7alusvn9xp.R.inc(61177);enumMap.put(Rooms.E, Rooms.A);

        __CLR4_5_21b7a1b7alusvn9xp.R.inc(61178);Assert.assertEquals(JSON.toJSONString(enumMap, SerializerFeature.WriteNonStringKeyAsString),
                "{\"C\":\"D\",\"E\":\"A\"}");

    }finally{__CLR4_5_21b7a1b7alusvn9xp.R.flushNeeded();}}




//    public void testParsed(){
//
//        String oldStyleJson = "{1:'abc', 2:'cde'}";
//
//        Gson gson = new Gson();
//
//        Map fromJson = gson.fromJson(oldStyleJson, Map.class);
//
//        Assert.assertNull(fromJson.get(1));
//
//        Assert.assertEquals(fromJson.get("1"), "abc" );
//
//        Map parsed = JSON.parseObject(oldStyleJson, Map.class, Feature.IgnoreAutoType, Feature.DisableFieldSmartMatch);
//
//
//        Assert.assertNull(parsed.get(1));
//
//        Assert.assertEquals(parsed.get("1"), "abc" );
//
//    }
//
//    public void testParsed_jackson() throws Exception {
//
//        String oldStyleJson = "{1:\"abc\", 2:\"cde\"}";
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        Map fromJson = objectMapper.readValue(oldStyleJson, Map.class);
//        Assert.assertNull(fromJson.get(1));
//    }
}
