/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest_castToJavaBean_JSONType extends TestCase {static class __CLR4_5_21j251j25lusyjtv7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,71405,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_castToJavaBean() throws Exception {__CLR4_5_21j251j25lusyjtv7.R.globalSliceStart(getClass().getName(),71357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ye60dc1j25();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j251j25lusyjtv7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j251j25lusyjtv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71357,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ye60dc1j25() throws Exception{try{__CLR4_5_21j251j25lusyjtv7.R.inc(71357);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71358);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21j251j25lusyjtv7.R.inc(71359);map.put("id", 123);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71360);map.put("name", "abc");
        __CLR4_5_21j251j25lusyjtv7.R.inc(71361);VO vo = TypeUtils.castToJavaBean(map, VO.class, null);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71362);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21j251j25lusyjtv7.R.inc(71363);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_5_21j251j25lusyjtv7.R.inc(71364);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
    
    public void test_castToJavaBean_v2() throws Exception {__CLR4_5_21j251j25lusyjtv7.R.globalSliceStart(getClass().getName(),71365);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2oimsjt1j2d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j251j25lusyjtv7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j251j25lusyjtv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean_v2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71365,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2oimsjt1j2d() throws Exception{try{__CLR4_5_21j251j25lusyjtv7.R.inc(71365);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71366);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21j251j25lusyjtv7.R.inc(71367);map.put("id", 123);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71368);map.put("name", "abc");
        __CLR4_5_21j251j25lusyjtv7.R.inc(71369);V2 vo = TypeUtils.castToJavaBean(map, V2.class, null);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71370);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21j251j25lusyjtv7.R.inc(71371);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_5_21j251j25lusyjtv7.R.inc(71372);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
    
    public void test_castToJavaBean_v3() throws Exception {__CLR4_5_21j251j25lusyjtv7.R.globalSliceStart(getClass().getName(),71373);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rrmrca1j2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21j251j25lusyjtv7.R.rethrow($CLV_t2$);}finally{__CLR4_5_21j251j25lusyjtv7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean_v3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),71373,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rrmrca1j2l() throws Exception{try{__CLR4_5_21j251j25lusyjtv7.R.inc(71373);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71374);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21j251j25lusyjtv7.R.inc(71375);map.put("id", 123);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71376);map.put("name", "abc");
        __CLR4_5_21j251j25lusyjtv7.R.inc(71377);V3 vo = TypeUtils.castToJavaBean(map, V3.class, null);
        __CLR4_5_21j251j25lusyjtv7.R.inc(71378);Assert.assertEquals(123, vo.getId());
        __CLR4_5_21j251j25lusyjtv7.R.inc(71379);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_5_21j251j25lusyjtv7.R.inc(71380);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

    @JSONType(orders={"name", "id"})
    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71381);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71382);return id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71383);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71384);this.id = id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71385);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71386);return name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71387);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71388);this.name = name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

    }
    
    @JSONType(orders={"name"})
    public static class V2 {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71389);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71390);return id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71391);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71392);this.id = id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71393);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71394);return name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71395);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71396);this.name = name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}

    }
    
    @JSONType(orders={"name","xx"})
    public static class V3 {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71397);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71398);return id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71399);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71400);this.id = id;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71401);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71402);return name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_5_21j251j25lusyjtv7.R.inc(71403);
            __CLR4_5_21j251j25lusyjtv7.R.inc(71404);this.name = name;
        }finally{__CLR4_5_21j251j25lusyjtv7.R.flushNeeded();}}
        
    }
}
