/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class SimplePropertyPreFilterTest extends TestCase {static class __CLR4_1_101u861u86luszwf8p{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,85909,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private VO vo;
    
    private A a;
    
    private Map<String, Object> map;

    protected void setUp() throws Exception {try{__CLR4_1_101u861u86luszwf8p.R.inc(85830);
        __CLR4_1_101u861u86luszwf8p.R.inc(85831);vo = new VO();
        __CLR4_1_101u861u86luszwf8p.R.inc(85832);vo.setId(123);
        __CLR4_1_101u861u86luszwf8p.R.inc(85833);vo.setName("sandzhangtoo");
        
        __CLR4_1_101u861u86luszwf8p.R.inc(85834);a = new A();
        __CLR4_1_101u861u86luszwf8p.R.inc(85835);a.setId(123);
        __CLR4_1_101u861u86luszwf8p.R.inc(85836);a.setName("sandzhangtoo");
        
        __CLR4_1_101u861u86luszwf8p.R.inc(85837);map = new HashMap<String, Object>();
        __CLR4_1_101u861u86luszwf8p.R.inc(85838);map.put("id", 123);
        __CLR4_1_101u861u86luszwf8p.R.inc(85839);map.put("name", "sandzhangtoo");
        __CLR4_1_101u861u86luszwf8p.R.inc(85840);map.put(null, null);
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

    public void test_name() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85841);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i320db1u8h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85841,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i320db1u8h() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85841);
        __CLR4_1_101u861u86luszwf8p.R.inc(85842);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85843);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_name_0() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85844);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m2598w1u8k();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85844,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m2598w1u8k() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85844);
        __CLR4_1_101u861u86luszwf8p.R.inc(85845);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85846);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_name_a() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85847);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vf0fz1u8n();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85847,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vf0fz1u8n() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85847);
        __CLR4_1_101u861u86luszwf8p.R.inc(85848);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85849);Assert.assertEquals(VO.class, filter.getClazz());
        __CLR4_1_101u861u86luszwf8p.R.inc(85850);Assert.assertEquals(1, filter.getIncludes().size());
        __CLR4_1_101u861u86luszwf8p.R.inc(85851);Assert.assertTrue(filter.apply(null, null, null));
        
        __CLR4_1_101u861u86luszwf8p.R.inc(85852);String text = JSON.toJSONString(a, filter);
        __CLR4_1_101u861u86luszwf8p.R.inc(85853);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_name_a1() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85854);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ujr00u1u8u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85854,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ujr00u1u8u() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85854);
        __CLR4_1_101u861u86luszwf8p.R.inc(85855);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85856);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(a, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_id() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pol32p1u8x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85857,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pol32p1u8x() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85857);
        __CLR4_1_101u861u86luszwf8p.R.inc(85858);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "id");
        __CLR4_1_101u861u86luszwf8p.R.inc(85859);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_id_0() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85860);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wmzpz41u90();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85860,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wmzpz41u90() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85860);
        __CLR4_1_101u861u86luszwf8p.R.inc(85861);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_1_101u861u86luszwf8p.R.inc(85862);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85863);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1u93();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85863,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1u93() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85863);
        __CLR4_1_101u861u86luszwf8p.R.inc(85864);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85865);String text = JSON.toJSONString(map, filter);
        __CLR4_1_101u861u86luszwf8p.R.inc(85866);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_map_id() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85867);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10so7am1u97();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85867,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10so7am1u97() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85867);
        __CLR4_1_101u861u86luszwf8p.R.inc(85868);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_1_101u861u86luszwf8p.R.inc(85869);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(map, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_map_name() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103f44n21u9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85870,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103f44n21u9a() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85870);
        __CLR4_1_101u861u86luszwf8p.R.inc(85871);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85872);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(map, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_all() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pxmdol1u9d();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pxmdol1u9d() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85873);
        __CLR4_1_101u861u86luszwf8p.R.inc(85874);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101u861u86luszwf8p.R.inc(85875);String text = JSON.toJSONString(vo, filter);
        __CLR4_1_101u861u86luszwf8p.R.inc(85876);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_all_map() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85877);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102zluq01u9h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85877,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102zluq01u9h() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85877);
        __CLR4_1_101u861u86luszwf8p.R.inc(85878);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101u861u86luszwf8p.R.inc(85879);String text = JSON.toJSONString(map, filter);
        __CLR4_1_101u861u86luszwf8p.R.inc(85880);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_exclude_id() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85881);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hgqxas1u9l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85881,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hgqxas1u9l() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85881);
        __CLR4_1_101u861u86luszwf8p.R.inc(85882);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101u861u86luszwf8p.R.inc(85883);filter.getExcludes().add("id");
        __CLR4_1_101u861u86luszwf8p.R.inc(85884);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_exclude_id_map() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85885);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d7u0z31u9p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85885,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d7u0z31u9p() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85885);
        __CLR4_1_101u861u86luszwf8p.R.inc(85886);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101u861u86luszwf8p.R.inc(85887);filter.getExcludes().add("id");
        __CLR4_1_101u861u86luszwf8p.R.inc(85888);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
    
    public void test_exclude_name() throws Exception {__CLR4_1_101u861u86luszwf8p.R.globalSliceStart(getClass().getName(),85889);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101evyf81u9t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101u861u86luszwf8p.R.rethrow($CLV_t2$);}finally{__CLR4_1_101u861u86luszwf8p.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),85889,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101evyf81u9t() throws Exception{try{__CLR4_1_101u861u86luszwf8p.R.inc(85889);
        __CLR4_1_101u861u86luszwf8p.R.inc(85890);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101u861u86luszwf8p.R.inc(85891);filter.getExcludes().add("name");
        __CLR4_1_101u861u86luszwf8p.R.inc(85892);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101u861u86luszwf8p.R.inc(85893);
            __CLR4_1_101u861u86luszwf8p.R.inc(85894);return id;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101u861u86luszwf8p.R.inc(85895);
            __CLR4_1_101u861u86luszwf8p.R.inc(85896);this.id = id;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101u861u86luszwf8p.R.inc(85897);
            __CLR4_1_101u861u86luszwf8p.R.inc(85898);return name;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101u861u86luszwf8p.R.inc(85899);
            __CLR4_1_101u861u86luszwf8p.R.inc(85900);this.name = name;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}

    }
    
    public static class A {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_1_101u861u86luszwf8p.R.inc(85901);
            __CLR4_1_101u861u86luszwf8p.R.inc(85902);return id;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_1_101u861u86luszwf8p.R.inc(85903);
            __CLR4_1_101u861u86luszwf8p.R.inc(85904);this.id = id;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_1_101u861u86luszwf8p.R.inc(85905);
            __CLR4_1_101u861u86luszwf8p.R.inc(85906);return name;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_1_101u861u86luszwf8p.R.inc(85907);
            __CLR4_1_101u861u86luszwf8p.R.inc(85908);this.name = name;
        }finally{__CLR4_1_101u861u86luszwf8p.R.flushNeeded();}}
        
    }
}
