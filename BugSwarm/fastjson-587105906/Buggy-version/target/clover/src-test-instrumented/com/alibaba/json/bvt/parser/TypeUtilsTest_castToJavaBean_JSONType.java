/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONType;
import com.alibaba.fastjson.util.TypeUtils;

public class TypeUtilsTest_castToJavaBean_JSONType extends TestCase {static class __CLR4_1_101j2g1j2glusqke7v{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,71416,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_castToJavaBean() throws Exception {__CLR4_1_101j2g1j2glusqke7v.R.globalSliceStart(getClass().getName(),71368);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ye60dc1j2g();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j2g1j2glusqke7v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j2g1j2glusqke7v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71368,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ye60dc1j2g() throws Exception{try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71368);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71369);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71370);map.put("id", 123);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71371);map.put("name", "abc");
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71372);VO vo = TypeUtils.castToJavaBean(map, VO.class, null);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71373);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71374);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71375);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
    
    public void test_castToJavaBean_v2() throws Exception {__CLR4_1_101j2g1j2glusqke7v.R.globalSliceStart(getClass().getName(),71376);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10oimsjt1j2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j2g1j2glusqke7v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j2g1j2glusqke7v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean_v2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71376,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10oimsjt1j2o() throws Exception{try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71376);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71377);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71378);map.put("id", 123);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71379);map.put("name", "abc");
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71380);V2 vo = TypeUtils.castToJavaBean(map, V2.class, null);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71381);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71382);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71383);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
    
    public void test_castToJavaBean_v3() throws Exception {__CLR4_1_101j2g1j2glusqke7v.R.globalSliceStart(getClass().getName(),71384);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rrmrca1j2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101j2g1j2glusqke7v.R.rethrow($CLV_t2$);}finally{__CLR4_1_101j2g1j2glusqke7v.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.TypeUtilsTest_castToJavaBean_JSONType.test_castToJavaBean_v3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71384,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rrmrca1j2w() throws Exception{try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71384);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71385);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71386);map.put("id", 123);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71387);map.put("name", "abc");
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71388);V3 vo = TypeUtils.castToJavaBean(map, V3.class, null);
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71389);Assert.assertEquals(123, vo.getId());
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71390);Assert.assertEquals("abc", vo.getName());
        
        __CLR4_1_101j2g1j2glusqke7v.R.inc(71391);Assert.assertEquals("{\"name\":\"abc\",\"id\":123}", JSON.toJSONString(vo));
    }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

    @JSONType(orders={"name", "id"})
    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71392);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71393);return id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71394);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71395);this.id = id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71396);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71397);return name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71398);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71399);this.name = name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

    }
    
    @JSONType(orders={"name"})
    public static class V2 {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71400);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71401);return id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71402);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71403);this.id = id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71404);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71405);return name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71406);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71407);this.name = name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}

    }
    
    @JSONType(orders={"name","xx"})
    public static class V3 {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71408);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71409);return id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71410);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71411);this.id = id;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71412);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71413);return name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_1_101j2g1j2glusqke7v.R.inc(71414);
            __CLR4_1_101j2g1j2glusqke7v.R.inc(71415);this.name = name;
        }finally{__CLR4_1_101j2g1j2glusqke7v.R.flushNeeded();}}
        
    }
}
